.class public final Lk2/h;
.super Lk2/o0;
.source "SourceFile"


# instance fields
.field public final l:J

.field public final m:J

.field public final n:Z

.field public final o:Ljava/util/ArrayList;

.field public final p:LN1/M;

.field public q:Lk2/f;

.field public r:Lk2/g;

.field public s:J

.field public t:J


# direct methods
.method public constructor <init>(Lk2/a;JJZ)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lk2/o0;-><init>(Lk2/a;)V

    .line 5
    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    cmp-long p1, p2, v0

    .line 10
    .line 11
    if-ltz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    invoke-static {p1}, LQ1/k;->c(Z)V

    .line 17
    .line 18
    .line 19
    iput-wide p2, p0, Lk2/h;->l:J

    .line 20
    .line 21
    iput-wide p4, p0, Lk2/h;->m:J

    .line 22
    .line 23
    iput-boolean p6, p0, Lk2/h;->n:Z

    .line 24
    .line 25
    new-instance p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lk2/h;->o:Ljava/util/ArrayList;

    .line 31
    .line 32
    new-instance p1, LN1/M;

    .line 33
    .line 34
    invoke-direct {p1}, LN1/M;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lk2/h;->p:LN1/M;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final B(LN1/N;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/h;->r:Lk2/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lk2/h;->D(LN1/N;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final D(LN1/N;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    iget-object v0, v1, Lk2/h;->p:LN1/M;

    .line 5
    .line 6
    move-object/from16 v4, p1

    .line 7
    .line 8
    invoke-virtual {v4, v2, v0}, LN1/N;->n(ILN1/M;)V

    .line 9
    .line 10
    .line 11
    iget-wide v5, v0, LN1/M;->p:J

    .line 12
    .line 13
    iget-object v0, v1, Lk2/h;->q:Lk2/f;

    .line 14
    .line 15
    iget-object v9, v1, Lk2/h;->o:Ljava/util/ArrayList;

    .line 16
    .line 17
    iget-wide v7, v1, Lk2/h;->m:J

    .line 18
    .line 19
    const-wide/high16 v10, -0x8000000000000000L

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    iget-wide v12, v1, Lk2/h;->s:J

    .line 30
    .line 31
    sub-long/2addr v12, v5

    .line 32
    cmp-long v0, v7, v10

    .line 33
    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    move-wide v7, v10

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-wide v7, v1, Lk2/h;->t:J

    .line 39
    .line 40
    sub-long/2addr v7, v5

    .line 41
    :cond_1
    :goto_0
    move-wide v5, v12

    .line 42
    goto :goto_3

    .line 43
    :cond_2
    iget-wide v12, v1, Lk2/h;->l:J

    .line 44
    .line 45
    add-long v14, v5, v12

    .line 46
    .line 47
    iput-wide v14, v1, Lk2/h;->s:J

    .line 48
    .line 49
    cmp-long v0, v7, v10

    .line 50
    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    add-long v10, v5, v7

    .line 55
    .line 56
    :goto_1
    iput-wide v10, v1, Lk2/h;->t:J

    .line 57
    .line 58
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    move v3, v2

    .line 63
    :goto_2
    if-ge v3, v0, :cond_1

    .line 64
    .line 65
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    check-cast v5, Lk2/e;

    .line 70
    .line 71
    iget-wide v10, v1, Lk2/h;->s:J

    .line 72
    .line 73
    iget-wide v14, v1, Lk2/h;->t:J

    .line 74
    .line 75
    iput-wide v10, v5, Lk2/e;->e:J

    .line 76
    .line 77
    iput-wide v14, v5, Lk2/e;->f:J

    .line 78
    .line 79
    add-int/lit8 v3, v3, 0x1

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :goto_3
    :try_start_0
    new-instance v3, Lk2/f;

    .line 83
    .line 84
    invoke-direct/range {v3 .. v8}, Lk2/f;-><init>(LN1/N;JJ)V

    .line 85
    .line 86
    .line 87
    iput-object v3, v1, Lk2/h;->q:Lk2/f;
    :try_end_0
    .catch Lk2/g; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    .line 89
    invoke-virtual {v1, v3}, Lk2/a;->m(LN1/N;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :catch_0
    move-exception v0

    .line 94
    iput-object v0, v1, Lk2/h;->r:Lk2/g;

    .line 95
    .line 96
    :goto_4
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-ge v2, v0, :cond_4

    .line 101
    .line 102
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Lk2/e;

    .line 107
    .line 108
    iget-object v3, v1, Lk2/h;->r:Lk2/g;

    .line 109
    .line 110
    iput-object v3, v0, Lk2/e;->g:Lk2/g;

    .line 111
    .line 112
    add-int/lit8 v2, v2, 0x1

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_4
    return-void
.end method

.method public final b(Lk2/H;Lo2/e;J)Lk2/F;
    .locals 7

    .line 1
    new-instance v0, Lk2/e;

    .line 2
    .line 3
    iget-object v1, p0, Lk2/o0;->k:Lk2/a;

    .line 4
    .line 5
    invoke-virtual {v1, p1, p2, p3, p4}, Lk2/a;->b(Lk2/H;Lo2/e;J)Lk2/F;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-wide v3, p0, Lk2/h;->s:J

    .line 10
    .line 11
    iget-wide v5, p0, Lk2/h;->t:J

    .line 12
    .line 13
    iget-boolean v2, p0, Lk2/h;->n:Z

    .line 14
    .line 15
    invoke-direct/range {v0 .. v6}, Lk2/e;-><init>(Lk2/F;ZJJ)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lk2/h;->o:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public final j()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/h;->r:Lk2/g;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0}, Lk2/l;->j()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    throw v0
.end method

.method public final n(Lk2/F;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk2/h;->o:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, LQ1/k;->g(Z)V

    .line 8
    .line 9
    .line 10
    check-cast p1, Lk2/e;

    .line 11
    .line 12
    iget-object p1, p1, Lk2/e;->a:Lk2/F;

    .line 13
    .line 14
    iget-object v1, p0, Lk2/o0;->k:Lk2/a;

    .line 15
    .line 16
    invoke-virtual {v1, p1}, Lk2/a;->n(Lk2/F;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Lk2/h;->q:Lk2/f;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object p1, p1, Lk2/x;->b:LN1/N;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lk2/h;->D(LN1/N;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method

.method public final p()V
    .locals 1

    .line 1
    invoke-super {p0}, Lk2/l;->p()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lk2/h;->r:Lk2/g;

    .line 6
    .line 7
    iput-object v0, p0, Lk2/h;->q:Lk2/f;

    .line 8
    .line 9
    return-void
.end method
