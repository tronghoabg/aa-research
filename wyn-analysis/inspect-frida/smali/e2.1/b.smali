.class public final Le2/b;
.super LU1/d;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public A:J

.field public final r:Le2/a;

.field public final s:LU1/r;

.field public final t:Landroid/os/Handler;

.field public final u:LB2/a;

.field public v:Lic/d;

.field public w:Z

.field public x:Z

.field public y:J

.field public z:LN1/B;


# direct methods
.method public constructor <init>(LU1/r;Landroid/os/Looper;)V
    .locals 2

    .line 1
    sget-object v0, Le2/a;->a:Le2/a;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {p0, v1}, LU1/d;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Le2/b;->s:LU1/r;

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance p1, Landroid/os/Handler;

    .line 14
    .line 15
    invoke-direct {p1, p2, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    iput-object p1, p0, Le2/b;->t:Landroid/os/Handler;

    .line 19
    .line 20
    iput-object v0, p0, Le2/b;->r:Le2/a;

    .line 21
    .line 22
    new-instance p1, LB2/a;

    .line 23
    .line 24
    const/4 p2, 0x1

    .line 25
    invoke-direct {p1, p2}, LT1/d;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Le2/b;->u:LB2/a;

    .line 29
    .line 30
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    iput-wide p1, p0, Le2/b;->A:J

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final D()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Le2/b;->z:LN1/B;

    .line 3
    .line 4
    iput-object v0, p0, Le2/b;->v:Lic/d;

    .line 5
    .line 6
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    iput-wide v0, p0, Le2/b;->A:J

    .line 12
    .line 13
    return-void
.end method

.method public final F(JZ)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Le2/b;->z:LN1/B;

    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Le2/b;->w:Z

    .line 6
    .line 7
    iput-boolean p1, p0, Le2/b;->x:Z

    .line 8
    .line 9
    return-void
.end method

.method public final K([LN1/n;JJLk2/H;)V
    .locals 2

    .line 1
    const/4 p2, 0x0

    .line 2
    aget-object p1, p1, p2

    .line 3
    .line 4
    iget-object p2, p0, Le2/b;->r:Le2/a;

    .line 5
    .line 6
    invoke-virtual {p2, p1}, Le2/a;->a(LN1/n;)Lic/d;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Le2/b;->v:Lic/d;

    .line 11
    .line 12
    iget-object p1, p0, Le2/b;->z:LN1/B;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-wide p2, p0, Le2/b;->A:J

    .line 17
    .line 18
    iget-wide v0, p1, LN1/B;->b:J

    .line 19
    .line 20
    add-long/2addr p2, v0

    .line 21
    sub-long/2addr p2, p4

    .line 22
    cmp-long p6, v0, p2

    .line 23
    .line 24
    if-nez p6, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance p6, LN1/B;

    .line 28
    .line 29
    iget-object p1, p1, LN1/B;->a:[LN1/A;

    .line 30
    .line 31
    invoke-direct {p6, p2, p3, p1}, LN1/B;-><init>(J[LN1/A;)V

    .line 32
    .line 33
    .line 34
    move-object p1, p6

    .line 35
    :goto_0
    iput-object p1, p0, Le2/b;->z:LN1/B;

    .line 36
    .line 37
    :cond_1
    iput-wide p4, p0, Le2/b;->A:J

    .line 38
    .line 39
    return-void
.end method

.method public final M(LN1/B;Ljava/util/ArrayList;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p1, LN1/B;->a:[LN1/A;

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    if-ge v0, v2, :cond_2

    .line 6
    .line 7
    aget-object v2, v1, v0

    .line 8
    .line 9
    invoke-interface {v2}, LN1/A;->a()LN1/n;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    iget-object v3, p0, Le2/b;->r:Le2/a;

    .line 16
    .line 17
    invoke-virtual {v3, v2}, Le2/a;->b(LN1/n;)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {v3, v2}, Le2/a;->a(LN1/n;)Lic/d;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    aget-object v1, v1, v0

    .line 28
    .line 29
    invoke-interface {v1}, LN1/A;->b()[B

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object v3, p0, Le2/b;->u:LB2/a;

    .line 37
    .line 38
    invoke-virtual {v3}, LT1/d;->o()V

    .line 39
    .line 40
    .line 41
    array-length v4, v1

    .line 42
    invoke-virtual {v3, v4}, LT1/d;->r(I)V

    .line 43
    .line 44
    .line 45
    iget-object v4, v3, LT1/d;->e:Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    invoke-virtual {v4, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, LT1/d;->s()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v3}, Lic/d;->o(LB2/a;)LN1/B;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    invoke-virtual {p0, v1, p2}, Le2/b;->M(LN1/B;Ljava/util/ArrayList;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_0
    aget-object v1, v1, v0

    .line 64
    .line 65
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    return-void
.end method

.method public final N(J)J
    .locals 7

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v2, p1, v0

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    move v2, v4

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v2, v3

    .line 15
    :goto_0
    invoke-static {v2}, LQ1/k;->g(Z)V

    .line 16
    .line 17
    .line 18
    iget-wide v5, p0, Le2/b;->A:J

    .line 19
    .line 20
    cmp-long v0, v5, v0

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    move v3, v4

    .line 25
    :cond_1
    invoke-static {v3}, LQ1/k;->g(Z)V

    .line 26
    .line 27
    .line 28
    iget-wide v0, p0, Le2/b;->A:J

    .line 29
    .line 30
    sub-long/2addr p1, v0

    .line 31
    return-wide p1
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le2/b;->x:Z

    .line 2
    .line 3
    return v0
.end method

.method public final d(LN1/n;)I
    .locals 2

    .line 1
    iget-object v0, p0, Le2/b;->r:Le2/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Le2/a;->b(LN1/n;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget p1, p1, LN1/n;->L:I

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x2

    .line 17
    :goto_0
    invoke-static {p1, v1, v1, v1}, LR8/v;->a(IIII)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :cond_1
    invoke-static {v1, v1, v1, v1}, LR8/v;->a(IIII)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "MetadataRenderer"

    .line 2
    .line 3
    return-object v0
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 7

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_2

    .line 5
    .line 6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, LN1/B;

    .line 9
    .line 10
    iget-object v0, p0, Le2/b;->s:LU1/r;

    .line 11
    .line 12
    iget-object v2, v0, LU1/r;->a:LU1/u;

    .line 13
    .line 14
    iget-object v3, v2, LU1/u;->c0:LN1/z;

    .line 15
    .line 16
    invoke-virtual {v3}, LN1/z;->a()LN1/y;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    const/4 v4, 0x0

    .line 21
    :goto_0
    iget-object v5, p1, LN1/B;->a:[LN1/A;

    .line 22
    .line 23
    array-length v6, v5

    .line 24
    if-ge v4, v6, :cond_0

    .line 25
    .line 26
    aget-object v5, v5, v4

    .line 27
    .line 28
    invoke-interface {v5, v3}, LN1/A;->P(LN1/y;)V

    .line 29
    .line 30
    .line 31
    add-int/lit8 v4, v4, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance v4, LN1/z;

    .line 35
    .line 36
    invoke-direct {v4, v3}, LN1/z;-><init>(LN1/y;)V

    .line 37
    .line 38
    .line 39
    iput-object v4, v2, LU1/u;->c0:LN1/z;

    .line 40
    .line 41
    invoke-virtual {v2}, LU1/u;->g0()LN1/z;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    iget-object v4, v2, LU1/u;->L:LN1/z;

    .line 46
    .line 47
    invoke-virtual {v3, v4}, LN1/z;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    iget-object v5, v2, LU1/u;->l:LQ1/j;

    .line 52
    .line 53
    if-nez v4, :cond_1

    .line 54
    .line 55
    iput-object v3, v2, LU1/u;->L:LN1/z;

    .line 56
    .line 57
    new-instance v2, LS8/b;

    .line 58
    .line 59
    const/4 v3, 0x4

    .line 60
    invoke-direct {v2, v0, v3}, LS8/b;-><init>(Ljava/lang/Object;I)V

    .line 61
    .line 62
    .line 63
    const/16 v0, 0xe

    .line 64
    .line 65
    invoke-virtual {v5, v0, v2}, LQ1/j;->c(ILQ1/g;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    new-instance v0, LS8/b;

    .line 69
    .line 70
    const/4 v2, 0x5

    .line 71
    invoke-direct {v0, p1, v2}, LS8/b;-><init>(Ljava/lang/Object;I)V

    .line 72
    .line 73
    .line 74
    const/16 p1, 0x1c

    .line 75
    .line 76
    invoke-virtual {v5, p1, v0}, LQ1/j;->c(ILQ1/g;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5}, LQ1/j;->b()V

    .line 80
    .line 81
    .line 82
    return v1

    .line 83
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 84
    .line 85
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 86
    .line 87
    .line 88
    throw p1
.end method

.method public final isReady()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final v(JJ)V
    .locals 7

    .line 1
    const/4 p3, 0x4

    .line 2
    const/4 p4, 0x1

    .line 3
    move v0, p4

    .line 4
    :cond_0
    :goto_0
    if-eqz v0, :cond_8

    .line 5
    .line 6
    iget-boolean v0, p0, Le2/b;->w:Z

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez v0, :cond_3

    .line 10
    .line 11
    iget-object v0, p0, Le2/b;->z:LN1/B;

    .line 12
    .line 13
    if-nez v0, :cond_3

    .line 14
    .line 15
    iget-object v0, p0, Le2/b;->u:LB2/a;

    .line 16
    .line 17
    invoke-virtual {v0}, LT1/d;->o()V

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, LU1/d;->c:LS3/c;

    .line 21
    .line 22
    invoke-virtual {v2}, LS3/c;->i()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v2, v0, v1}, LU1/d;->L(LS3/c;LT1/d;I)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v4, -0x4

    .line 30
    if-ne v3, v4, :cond_2

    .line 31
    .line 32
    invoke-virtual {v0, p3}, LH5/a;->h(I)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    iput-boolean p4, p0, Le2/b;->w:Z

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    iget-wide v2, v0, LT1/d;->g:J

    .line 42
    .line 43
    iget-wide v4, p0, LU1/d;->l:J

    .line 44
    .line 45
    cmp-long v2, v2, v4

    .line 46
    .line 47
    if-ltz v2, :cond_3

    .line 48
    .line 49
    iget-wide v2, p0, Le2/b;->y:J

    .line 50
    .line 51
    iput-wide v2, v0, LB2/a;->j:J

    .line 52
    .line 53
    invoke-virtual {v0}, LT1/d;->s()V

    .line 54
    .line 55
    .line 56
    iget-object v2, p0, Le2/b;->v:Lic/d;

    .line 57
    .line 58
    sget v3, LQ1/x;->a:I

    .line 59
    .line 60
    invoke-virtual {v2, v0}, Lic/d;->o(LB2/a;)LN1/B;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    new-instance v3, Ljava/util/ArrayList;

    .line 67
    .line 68
    iget-object v4, v2, LN1/B;->a:[LN1/A;

    .line 69
    .line 70
    array-length v4, v4

    .line 71
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v2, v3}, Le2/b;->M(LN1/B;Ljava/util/ArrayList;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-nez v2, :cond_3

    .line 82
    .line 83
    new-instance v2, LN1/B;

    .line 84
    .line 85
    iget-wide v4, v0, LT1/d;->g:J

    .line 86
    .line 87
    invoke-virtual {p0, v4, v5}, Le2/b;->N(J)J

    .line 88
    .line 89
    .line 90
    move-result-wide v4

    .line 91
    new-array v0, v1, [LN1/A;

    .line 92
    .line 93
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, [LN1/A;

    .line 98
    .line 99
    invoke-direct {v2, v4, v5, v0}, LN1/B;-><init>(J[LN1/A;)V

    .line 100
    .line 101
    .line 102
    iput-object v2, p0, Le2/b;->z:LN1/B;

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_2
    const/4 v0, -0x5

    .line 106
    if-ne v3, v0, :cond_3

    .line 107
    .line 108
    iget-object v0, v2, LS3/c;->c:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, LN1/n;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iget-wide v2, v0, LN1/n;->s:J

    .line 116
    .line 117
    iput-wide v2, p0, Le2/b;->y:J

    .line 118
    .line 119
    :cond_3
    :goto_1
    iget-object v0, p0, Le2/b;->z:LN1/B;

    .line 120
    .line 121
    if-eqz v0, :cond_7

    .line 122
    .line 123
    iget-wide v2, v0, LN1/B;->b:J

    .line 124
    .line 125
    invoke-virtual {p0, p1, p2}, Le2/b;->N(J)J

    .line 126
    .line 127
    .line 128
    move-result-wide v4

    .line 129
    cmp-long v0, v2, v4

    .line 130
    .line 131
    if-gtz v0, :cond_7

    .line 132
    .line 133
    iget-object v0, p0, Le2/b;->z:LN1/B;

    .line 134
    .line 135
    iget-object v2, p0, Le2/b;->t:Landroid/os/Handler;

    .line 136
    .line 137
    if-eqz v2, :cond_4

    .line 138
    .line 139
    invoke-virtual {v2, p4, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_4
    iget-object v2, p0, Le2/b;->s:LU1/r;

    .line 148
    .line 149
    iget-object v3, v2, LU1/r;->a:LU1/u;

    .line 150
    .line 151
    iget-object v4, v3, LU1/u;->c0:LN1/z;

    .line 152
    .line 153
    invoke-virtual {v4}, LN1/z;->a()LN1/y;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    :goto_2
    iget-object v5, v0, LN1/B;->a:[LN1/A;

    .line 158
    .line 159
    array-length v6, v5

    .line 160
    if-ge v1, v6, :cond_5

    .line 161
    .line 162
    aget-object v5, v5, v1

    .line 163
    .line 164
    invoke-interface {v5, v4}, LN1/A;->P(LN1/y;)V

    .line 165
    .line 166
    .line 167
    add-int/2addr v1, p4

    .line 168
    goto :goto_2

    .line 169
    :cond_5
    new-instance v1, LN1/z;

    .line 170
    .line 171
    invoke-direct {v1, v4}, LN1/z;-><init>(LN1/y;)V

    .line 172
    .line 173
    .line 174
    iput-object v1, v3, LU1/u;->c0:LN1/z;

    .line 175
    .line 176
    invoke-virtual {v3}, LU1/u;->g0()LN1/z;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    iget-object v4, v3, LU1/u;->L:LN1/z;

    .line 181
    .line 182
    invoke-virtual {v1, v4}, LN1/z;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    iget-object v5, v3, LU1/u;->l:LQ1/j;

    .line 187
    .line 188
    if-nez v4, :cond_6

    .line 189
    .line 190
    iput-object v1, v3, LU1/u;->L:LN1/z;

    .line 191
    .line 192
    new-instance v1, LS8/b;

    .line 193
    .line 194
    invoke-direct {v1, v2, p3}, LS8/b;-><init>(Ljava/lang/Object;I)V

    .line 195
    .line 196
    .line 197
    const/16 v2, 0xe

    .line 198
    .line 199
    invoke-virtual {v5, v2, v1}, LQ1/j;->c(ILQ1/g;)V

    .line 200
    .line 201
    .line 202
    :cond_6
    new-instance v1, LS8/b;

    .line 203
    .line 204
    const/4 v2, 0x5

    .line 205
    invoke-direct {v1, v0, v2}, LS8/b;-><init>(Ljava/lang/Object;I)V

    .line 206
    .line 207
    .line 208
    const/16 v0, 0x1c

    .line 209
    .line 210
    invoke-virtual {v5, v0, v1}, LQ1/j;->c(ILQ1/g;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v5}, LQ1/j;->b()V

    .line 214
    .line 215
    .line 216
    :goto_3
    const/4 v0, 0x0

    .line 217
    iput-object v0, p0, Le2/b;->z:LN1/B;

    .line 218
    .line 219
    move v0, p4

    .line 220
    goto :goto_4

    .line 221
    :cond_7
    move v0, v1

    .line 222
    :goto_4
    iget-boolean v1, p0, Le2/b;->w:Z

    .line 223
    .line 224
    if-eqz v1, :cond_0

    .line 225
    .line 226
    iget-object v1, p0, Le2/b;->z:LN1/B;

    .line 227
    .line 228
    if-nez v1, :cond_0

    .line 229
    .line 230
    iput-boolean p4, p0, Le2/b;->x:Z

    .line 231
    .line 232
    goto/16 :goto_0

    .line 233
    .line 234
    :cond_8
    return-void
.end method
