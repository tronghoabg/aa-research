.class public final Lt0/F;
.super Lr0/t;
.source "SourceFile"

# interfaces
.implements Lr0/m;


# instance fields
.field public final e:Lt0/t;

.field public f:Lt0/y;

.field public g:Z

.field public h:Z

.field public i:J

.field public j:Ltf/l;

.field public k:F

.field public l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lt0/t;Lt0/i;)V
    .locals 1

    .line 1
    const-string v0, "layoutNode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lr0/t;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lt0/F;->e:Lt0/t;

    .line 10
    .line 11
    iput-object p2, p0, Lt0/F;->f:Lt0/y;

    .line 12
    .line 13
    sget-wide p1, LL0/g;->b:J

    .line 14
    .line 15
    iput-wide p1, p0, Lt0/F;->i:J

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/F;->l:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e(J)Lr0/t;
    .locals 4

    .line 1
    iget-object v0, p0, Lt0/F;->e:Lt0/t;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt0/t;->j()Lt0/t;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x3

    .line 8
    if-eqz v1, :cond_7

    .line 9
    .line 10
    iget v3, v0, Lt0/t;->O:I

    .line 11
    .line 12
    if-eq v3, v2, :cond_4

    .line 13
    .line 14
    iget-boolean v2, v0, Lt0/t;->w:Z

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string p2, "measure() may not be called multiple times on the same Measurable. Current state "

    .line 22
    .line 23
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget p2, v0, Lt0/t;->O:I

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    if-eq p2, v0, :cond_3

    .line 30
    .line 31
    const/4 v0, 0x2

    .line 32
    if-eq p2, v0, :cond_2

    .line 33
    .line 34
    const/4 v0, 0x3

    .line 35
    if-eq p2, v0, :cond_1

    .line 36
    .line 37
    const-string p2, "null"

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const-string p2, "NotUsed"

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    const-string p2, "InLayoutBlock"

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    const-string p2, "InMeasureBlock"

    .line 47
    .line 48
    :goto_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string p2, ". Parent state "

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget p2, v1, Lt0/t;->N:I

    .line 57
    .line 58
    invoke-static {p2}, Lpd/f;->t(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const/16 p2, 0x2e

    .line 66
    .line 67
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p2

    .line 84
    :cond_4
    :goto_1
    iget v2, v1, Lt0/t;->N:I

    .line 85
    .line 86
    invoke-static {v2}, LA/f;->f(I)I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    const/4 v3, 0x1

    .line 91
    if-eqz v2, :cond_6

    .line 92
    .line 93
    if-ne v2, v3, :cond_5

    .line 94
    .line 95
    const/4 v3, 0x2

    .line 96
    goto :goto_2

    .line 97
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    iget p2, v1, Lt0/t;->N:I

    .line 100
    .line 101
    invoke-static {p2}, Lpd/f;->t(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    const-string v0, "Measurable could be only measured from the parent\'s measure or layout block.Parents state is "

    .line 106
    .line 107
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw p1

    .line 115
    :cond_6
    :goto_2
    iput v3, v0, Lt0/t;->O:I

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_7
    iput v2, v0, Lt0/t;->O:I

    .line 119
    .line 120
    :goto_3
    invoke-virtual {p0, p1, p2}, Lt0/F;->q(J)Z

    .line 121
    .line 122
    .line 123
    return-object p0
.end method

.method public final h()I
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final m(JFLtf/l;)V
    .locals 8

    .line 1
    iput-wide p1, p0, Lt0/F;->i:J

    .line 2
    .line 3
    iput p3, p0, Lt0/F;->k:F

    .line 4
    .line 5
    iput-object p4, p0, Lt0/F;->j:Ltf/l;

    .line 6
    .line 7
    iget-object v0, p0, Lt0/F;->f:Lt0/y;

    .line 8
    .line 9
    iget-object v1, v0, Lt0/y;->f:Lt0/y;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    iget-boolean v1, v1, Lt0/y;->q:Z

    .line 15
    .line 16
    if-ne v1, v2, :cond_1

    .line 17
    .line 18
    if-nez p4, :cond_0

    .line 19
    .line 20
    invoke-static {v0, p1, p2, p3}, Lr0/s;->b(Lr0/t;JF)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-static {v0, p1, p2, p3, p4}, Lr0/s;->f(Lr0/t;JFLtf/l;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    iput-boolean v2, p0, Lt0/F;->h:Z

    .line 29
    .line 30
    iget-object v0, p0, Lt0/F;->e:Lt0/t;

    .line 31
    .line 32
    iget-object v1, v0, Lt0/t;->r:Lt0/u;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    iput-boolean v2, v1, Lt0/u;->e:Z

    .line 36
    .line 37
    invoke-static {v0}, LS3/f;->E(Lt0/t;)Lt0/I;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lu0/n;

    .line 42
    .line 43
    invoke-virtual {v1}, Lu0/n;->getSnapshotObserver()Lt0/K;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    new-instance v2, Lt0/E;

    .line 48
    .line 49
    move-object v3, p0

    .line 50
    move-wide v4, p1

    .line 51
    move v6, p3

    .line 52
    move-object v7, p4

    .line 53
    invoke-direct/range {v2 .. v7}, Lt0/E;-><init>(Lt0/F;JFLtf/l;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget-object p1, v1, Lt0/K;->d:Lt0/e;

    .line 60
    .line 61
    invoke-virtual {v1, v0, p1, v2}, Lt0/K;->a(Lt0/J;Ltf/l;Ltf/a;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final q(J)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lt0/F;->e:Lt0/t;

    .line 2
    .line 3
    invoke-static {v0}, LS3/f;->E(Lt0/t;)Lt0/I;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, Lt0/t;->j()Lt0/t;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-boolean v3, v0, Lt0/t;->w:Z

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    const/4 v5, 0x0

    .line 15
    if-nez v3, :cond_1

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    iget-boolean v2, v2, Lt0/t;->w:Z

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v5

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    move v2, v4

    .line 27
    :goto_1
    iput-boolean v2, v0, Lt0/t;->w:Z

    .line 28
    .line 29
    iget-boolean v2, v0, Lt0/t;->K:Z

    .line 30
    .line 31
    if-nez v2, :cond_2

    .line 32
    .line 33
    iget-wide v2, p0, Lr0/t;->d:J

    .line 34
    .line 35
    cmp-long v2, v2, p1

    .line 36
    .line 37
    if-nez v2, :cond_2

    .line 38
    .line 39
    check-cast v1, Lu0/n;

    .line 40
    .line 41
    iget-object p1, v1, Lu0/n;->D:Lt0/z;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Lt0/z;->b(Lt0/t;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lt0/t;->A()V

    .line 47
    .line 48
    .line 49
    return v5

    .line 50
    :cond_2
    iget-object v1, v0, Lt0/t;->r:Lt0/u;

    .line 51
    .line 52
    iput-boolean v5, v1, Lt0/u;->d:Z

    .line 53
    .line 54
    invoke-virtual {v0}, Lt0/t;->l()LP/d;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iget v2, v1, LP/d;->c:I

    .line 59
    .line 60
    if-lez v2, :cond_4

    .line 61
    .line 62
    iget-object v1, v1, LP/d;->a:[Ljava/lang/Object;

    .line 63
    .line 64
    move v3, v5

    .line 65
    :cond_3
    aget-object v6, v1, v3

    .line 66
    .line 67
    check-cast v6, Lt0/t;

    .line 68
    .line 69
    iget-object v6, v6, Lt0/t;->r:Lt0/u;

    .line 70
    .line 71
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    add-int/lit8 v3, v3, 0x1

    .line 75
    .line 76
    if-lt v3, v2, :cond_3

    .line 77
    .line 78
    :cond_4
    iput-boolean v4, p0, Lt0/F;->g:Z

    .line 79
    .line 80
    iget-object v1, p0, Lt0/F;->f:Lt0/y;

    .line 81
    .line 82
    iget-wide v1, v1, Lr0/t;->c:J

    .line 83
    .line 84
    invoke-virtual {p0, p1, p2}, Lr0/t;->p(J)V

    .line 85
    .line 86
    .line 87
    iput v4, v0, Lt0/t;->N:I

    .line 88
    .line 89
    iput-boolean v5, v0, Lt0/t;->K:Z

    .line 90
    .line 91
    invoke-static {v0}, LS3/f;->E(Lt0/t;)Lt0/I;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    check-cast v3, Lu0/n;

    .line 96
    .line 97
    invoke-virtual {v3}, Lu0/n;->getSnapshotObserver()Lt0/K;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    new-instance v6, Lt0/s;

    .line 102
    .line 103
    invoke-direct {v6, v0, p1, p2}, Lt0/s;-><init>(Lt0/t;J)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    iget-object p1, v3, Lt0/K;->b:Lt0/e;

    .line 110
    .line 111
    invoke-virtual {v3, v0, p1, v6}, Lt0/K;->a(Lt0/J;Ltf/l;Ltf/a;)V

    .line 112
    .line 113
    .line 114
    iget p1, v0, Lt0/t;->N:I

    .line 115
    .line 116
    if-ne p1, v4, :cond_5

    .line 117
    .line 118
    iput-boolean v4, v0, Lt0/t;->L:Z

    .line 119
    .line 120
    const/4 p1, 0x3

    .line 121
    iput p1, v0, Lt0/t;->N:I

    .line 122
    .line 123
    :cond_5
    iget-object p1, p0, Lt0/F;->f:Lt0/y;

    .line 124
    .line 125
    iget-wide p1, p1, Lr0/t;->c:J

    .line 126
    .line 127
    invoke-static {p1, p2, v1, v2}, LL0/h;->a(JJ)Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-eqz p1, :cond_7

    .line 132
    .line 133
    iget-object p1, p0, Lt0/F;->f:Lt0/y;

    .line 134
    .line 135
    iget p2, p1, Lr0/t;->a:I

    .line 136
    .line 137
    iget v0, p0, Lr0/t;->a:I

    .line 138
    .line 139
    if-ne p2, v0, :cond_7

    .line 140
    .line 141
    iget p1, p1, Lr0/t;->b:I

    .line 142
    .line 143
    iget p2, p0, Lr0/t;->b:I

    .line 144
    .line 145
    if-eq p1, p2, :cond_6

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_6
    move v4, v5

    .line 149
    :cond_7
    :goto_2
    iget-object p1, p0, Lt0/F;->f:Lt0/y;

    .line 150
    .line 151
    iget p2, p1, Lr0/t;->a:I

    .line 152
    .line 153
    iget p1, p1, Lr0/t;->b:I

    .line 154
    .line 155
    invoke-static {p2, p1}, LBa/c;->a(II)J

    .line 156
    .line 157
    .line 158
    move-result-wide p1

    .line 159
    iget-wide v0, p0, Lr0/t;->c:J

    .line 160
    .line 161
    invoke-static {v0, v1, p1, p2}, LL0/h;->a(JJ)Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-nez v0, :cond_8

    .line 166
    .line 167
    iput-wide p1, p0, Lr0/t;->c:J

    .line 168
    .line 169
    invoke-virtual {p0}, Lr0/t;->o()V

    .line 170
    .line 171
    .line 172
    :cond_8
    return v4
.end method
