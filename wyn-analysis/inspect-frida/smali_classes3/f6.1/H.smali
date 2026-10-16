.class public final Lf6/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf6/w;
.implements Lf6/v;


# instance fields
.field public final a:[Lf6/w;

.field public final b:Ljava/util/IdentityHashMap;

.field public final c:Landroidx/fragment/app/X;

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/util/HashMap;

.field public f:Lf6/v;

.field public g:Lf6/a0;

.field public h:[Lf6/w;

.field public i:Lac/a;


# direct methods
.method public varargs constructor <init>(Landroidx/fragment/app/X;[J[Lf6/w;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf6/H;->c:Landroidx/fragment/app/X;

    .line 5
    .line 6
    iput-object p3, p0, Lf6/H;->a:[Lf6/w;

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lf6/H;->d:Ljava/util/ArrayList;

    .line 14
    .line 15
    new-instance v0, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lf6/H;->e:Ljava/util/HashMap;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    new-array v1, v0, [Lf6/W;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance p1, Lac/a;

    .line 29
    .line 30
    const/4 v2, 0x5

    .line 31
    invoke-direct {p1, v1, v2}, Lac/a;-><init>(Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lf6/H;->i:Lac/a;

    .line 35
    .line 36
    new-instance p1, Ljava/util/IdentityHashMap;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lf6/H;->b:Ljava/util/IdentityHashMap;

    .line 42
    .line 43
    new-array p1, v0, [Lf6/w;

    .line 44
    .line 45
    iput-object p1, p0, Lf6/H;->h:[Lf6/w;

    .line 46
    .line 47
    :goto_0
    array-length p1, p3

    .line 48
    if-ge v0, p1, :cond_1

    .line 49
    .line 50
    aget-wide v1, p2, v0

    .line 51
    .line 52
    const-wide/16 v3, 0x0

    .line 53
    .line 54
    cmp-long p1, v1, v3

    .line 55
    .line 56
    if-eqz p1, :cond_0

    .line 57
    .line 58
    iget-object p1, p0, Lf6/H;->a:[Lf6/w;

    .line 59
    .line 60
    new-instance v3, Lf6/F;

    .line 61
    .line 62
    aget-object v4, p3, v0

    .line 63
    .line 64
    invoke-direct {v3, v4, v1, v2}, Lf6/F;-><init>(Lf6/w;J)V

    .line 65
    .line 66
    .line 67
    aput-object v3, p1, v0

    .line 68
    .line 69
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Lf6/w;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lf6/H;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object p1, p0, Lf6/H;->a:[Lf6/w;

    .line 14
    .line 15
    array-length v0, p1

    .line 16
    const/4 v1, 0x0

    .line 17
    move v2, v1

    .line 18
    move v3, v2

    .line 19
    :goto_0
    if-ge v2, v0, :cond_1

    .line 20
    .line 21
    aget-object v4, p1, v2

    .line 22
    .line 23
    invoke-interface {v4}, Lf6/w;->j()Lf6/a0;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iget v4, v4, Lf6/a0;->a:I

    .line 28
    .line 29
    add-int/2addr v3, v4

    .line 30
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    new-array v0, v3, [Lf6/Z;

    .line 34
    .line 35
    move v2, v1

    .line 36
    move v3, v2

    .line 37
    :goto_1
    array-length v4, p1

    .line 38
    if-ge v2, v4, :cond_3

    .line 39
    .line 40
    aget-object v4, p1, v2

    .line 41
    .line 42
    invoke-interface {v4}, Lf6/w;->j()Lf6/a0;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    iget v5, v4, Lf6/a0;->a:I

    .line 47
    .line 48
    move v6, v1

    .line 49
    :goto_2
    if-ge v6, v5, :cond_2

    .line 50
    .line 51
    invoke-virtual {v4, v6}, Lf6/a0;->a(I)Lf6/Z;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    new-instance v8, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v9, ":"

    .line 64
    .line 65
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v9, v7, Lf6/Z;->b:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    new-instance v9, Lf6/Z;

    .line 78
    .line 79
    iget-object v10, v7, Lf6/Z;->d:[LE5/T;

    .line 80
    .line 81
    invoke-direct {v9, v8, v10}, Lf6/Z;-><init>(Ljava/lang/String;[LE5/T;)V

    .line 82
    .line 83
    .line 84
    iget-object v8, p0, Lf6/H;->e:Ljava/util/HashMap;

    .line 85
    .line 86
    invoke-virtual {v8, v9, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    add-int/lit8 v7, v3, 0x1

    .line 90
    .line 91
    aput-object v9, v0, v3

    .line 92
    .line 93
    add-int/lit8 v6, v6, 0x1

    .line 94
    .line 95
    move v3, v7

    .line 96
    goto :goto_2

    .line 97
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    new-instance p1, Lf6/a0;

    .line 101
    .line 102
    invoke-direct {p1, v0}, Lf6/a0;-><init>([Lf6/Z;)V

    .line 103
    .line 104
    .line 105
    iput-object p1, p0, Lf6/H;->g:Lf6/a0;

    .line 106
    .line 107
    iget-object p1, p0, Lf6/H;->f:Lf6/v;

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-interface {p1, p0}, Lf6/v;->a(Lf6/w;)V

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public final b(Lf6/W;)V
    .locals 0

    .line 1
    check-cast p1, Lf6/w;

    .line 2
    .line 3
    iget-object p1, p0, Lf6/H;->f:Lf6/v;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {p1, p0}, Lf6/v;->b(Lf6/W;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-object v0, p0, Lf6/H;->i:Lac/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lac/a;->c()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final d(J)J
    .locals 3

    .line 1
    iget-object v0, p0, Lf6/H;->h:[Lf6/w;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    invoke-interface {v0, p1, p2}, Lf6/w;->d(J)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    const/4 v0, 0x1

    .line 11
    :goto_0
    iget-object v1, p0, Lf6/H;->h:[Lf6/w;

    .line 12
    .line 13
    array-length v2, v1

    .line 14
    if-ge v0, v2, :cond_1

    .line 15
    .line 16
    aget-object v1, v1, v0

    .line 17
    .line 18
    invoke-interface {v1, p1, p2}, Lf6/w;->d(J)J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    cmp-long v1, v1, p1

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string p2, "Unexpected child seekToUs result."

    .line 32
    .line 33
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_1
    return-wide p1
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/H;->i:Lac/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lac/a;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final f()J
    .locals 15

    .line 1
    iget-object v0, p0, Lf6/H;->h:[Lf6/w;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    move-wide v6, v2

    .line 11
    move v5, v4

    .line 12
    :goto_0
    if-ge v5, v1, :cond_8

    .line 13
    .line 14
    aget-object v8, v0, v5

    .line 15
    .line 16
    invoke-interface {v8}, Lf6/w;->f()J

    .line 17
    .line 18
    .line 19
    move-result-wide v9

    .line 20
    cmp-long v11, v9, v2

    .line 21
    .line 22
    const-string v12, "Unexpected child seekToUs result."

    .line 23
    .line 24
    if-eqz v11, :cond_5

    .line 25
    .line 26
    cmp-long v11, v6, v2

    .line 27
    .line 28
    if-nez v11, :cond_3

    .line 29
    .line 30
    iget-object v6, p0, Lf6/H;->h:[Lf6/w;

    .line 31
    .line 32
    array-length v7, v6

    .line 33
    move v11, v4

    .line 34
    :goto_1
    if-ge v11, v7, :cond_2

    .line 35
    .line 36
    aget-object v13, v6, v11

    .line 37
    .line 38
    if-ne v13, v8, :cond_0

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_0
    invoke-interface {v13, v9, v10}, Lf6/w;->d(J)J

    .line 42
    .line 43
    .line 44
    move-result-wide v13

    .line 45
    cmp-long v13, v13, v9

    .line 46
    .line 47
    if-nez v13, :cond_1

    .line 48
    .line 49
    add-int/lit8 v11, v11, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    invoke-direct {v0, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :cond_2
    :goto_2
    move-wide v6, v9

    .line 59
    goto :goto_3

    .line 60
    :cond_3
    cmp-long v8, v9, v6

    .line 61
    .line 62
    if-nez v8, :cond_4

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string v1, "Conflicting discontinuities."

    .line 68
    .line 69
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v0

    .line 73
    :cond_5
    cmp-long v9, v6, v2

    .line 74
    .line 75
    if-eqz v9, :cond_7

    .line 76
    .line 77
    invoke-interface {v8, v6, v7}, Lf6/w;->d(J)J

    .line 78
    .line 79
    .line 80
    move-result-wide v8

    .line 81
    cmp-long v8, v8, v6

    .line 82
    .line 83
    if-nez v8, :cond_6

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 87
    .line 88
    invoke-direct {v0, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v0

    .line 92
    :cond_7
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_8
    return-wide v6
.end method

.method public final h()V
    .locals 4

    .line 1
    iget-object v0, p0, Lf6/H;->a:[Lf6/w;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-interface {v3}, Lf6/w;->h()V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method public final i(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Lf6/H;->h:[Lf6/w;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-interface {v3, p1, p2}, Lf6/w;->i(J)V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method public final j()Lf6/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/H;->g:Lf6/a0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final n()J
    .locals 2

    .line 1
    iget-object v0, p0, Lf6/H;->i:Lac/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lac/a;->n()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final o(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/H;->i:Lac/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lac/a;->o(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final r(Lf6/v;J)V
    .locals 3

    .line 1
    iput-object p1, p0, Lf6/H;->f:Lf6/v;

    .line 2
    .line 3
    iget-object p1, p0, Lf6/H;->d:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v0, p0, Lf6/H;->a:[Lf6/w;

    .line 6
    .line 7
    invoke-static {p1, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    array-length p1, v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    if-ge v1, p1, :cond_0

    .line 13
    .line 14
    aget-object v2, v0, v1

    .line 15
    .line 16
    invoke-interface {v2, p0, p2, p3}, Lf6/w;->r(Lf6/v;J)V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method public final s(JLE5/C0;)J
    .locals 3

    .line 1
    iget-object v0, p0, Lf6/H;->h:[Lf6/w;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-lez v1, :cond_0

    .line 6
    .line 7
    aget-object v0, v0, v2

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lf6/H;->a:[Lf6/w;

    .line 11
    .line 12
    aget-object v0, v0, v2

    .line 13
    .line 14
    :goto_0
    invoke-interface {v0, p1, p2, p3}, Lf6/w;->s(JLE5/C0;)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    return-wide p1
.end method

.method public final y([Lr6/n;[Z[Lf6/V;[ZJ)J
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    array-length v3, v1

    .line 8
    new-array v3, v3, [I

    .line 9
    .line 10
    array-length v4, v1

    .line 11
    new-array v4, v4, [I

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    :goto_0
    array-length v7, v1

    .line 15
    iget-object v8, v0, Lf6/H;->e:Ljava/util/HashMap;

    .line 16
    .line 17
    iget-object v9, v0, Lf6/H;->b:Ljava/util/IdentityHashMap;

    .line 18
    .line 19
    iget-object v10, v0, Lf6/H;->a:[Lf6/w;

    .line 20
    .line 21
    if-ge v6, v7, :cond_5

    .line 22
    .line 23
    aget-object v7, v2, v6

    .line 24
    .line 25
    if-nez v7, :cond_0

    .line 26
    .line 27
    const/4 v11, 0x0

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    invoke-virtual {v9, v7}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    move-object v11, v7

    .line 34
    check-cast v11, Ljava/lang/Integer;

    .line 35
    .line 36
    :goto_1
    const/4 v7, -0x1

    .line 37
    if-nez v11, :cond_1

    .line 38
    .line 39
    move v9, v7

    .line 40
    goto :goto_2

    .line 41
    :cond_1
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    :goto_2
    aput v9, v3, v6

    .line 46
    .line 47
    aput v7, v4, v6

    .line 48
    .line 49
    aget-object v9, v1, v6

    .line 50
    .line 51
    if-eqz v9, :cond_4

    .line 52
    .line 53
    invoke-interface {v9}, Lr6/n;->g()Lf6/Z;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    invoke-virtual {v8, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    check-cast v8, Lf6/Z;

    .line 62
    .line 63
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    const/4 v9, 0x0

    .line 67
    :goto_3
    array-length v11, v10

    .line 68
    if-ge v9, v11, :cond_4

    .line 69
    .line 70
    aget-object v11, v10, v9

    .line 71
    .line 72
    invoke-interface {v11}, Lf6/w;->j()Lf6/a0;

    .line 73
    .line 74
    .line 75
    move-result-object v11

    .line 76
    iget-object v11, v11, Lf6/a0;->b:Ll8/e0;

    .line 77
    .line 78
    invoke-virtual {v11, v8}, Ll8/K;->indexOf(Ljava/lang/Object;)I

    .line 79
    .line 80
    .line 81
    move-result v11

    .line 82
    if-ltz v11, :cond_2

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_2
    move v11, v7

    .line 86
    :goto_4
    if-eq v11, v7, :cond_3

    .line 87
    .line 88
    aput v9, v4, v6

    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_3
    add-int/lit8 v9, v9, 0x1

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_4
    :goto_5
    add-int/lit8 v6, v6, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_5
    invoke-virtual {v9}, Ljava/util/IdentityHashMap;->clear()V

    .line 98
    .line 99
    .line 100
    array-length v6, v1

    .line 101
    new-array v7, v6, [Lf6/V;

    .line 102
    .line 103
    array-length v12, v1

    .line 104
    new-array v12, v12, [Lf6/V;

    .line 105
    .line 106
    array-length v13, v1

    .line 107
    new-array v14, v13, [Lr6/n;

    .line 108
    .line 109
    new-instance v13, Ljava/util/ArrayList;

    .line 110
    .line 111
    array-length v15, v10

    .line 112
    invoke-direct {v13, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 113
    .line 114
    .line 115
    move-wide/from16 v18, p5

    .line 116
    .line 117
    const/4 v15, 0x0

    .line 118
    const/16 v20, 0x0

    .line 119
    .line 120
    :goto_6
    array-length v11, v10

    .line 121
    if-ge v15, v11, :cond_10

    .line 122
    .line 123
    const/4 v11, 0x0

    .line 124
    :goto_7
    array-length v5, v1

    .line 125
    if-ge v11, v5, :cond_8

    .line 126
    .line 127
    aget v5, v3, v11

    .line 128
    .line 129
    if-ne v5, v15, :cond_6

    .line 130
    .line 131
    aget-object v5, v2, v11

    .line 132
    .line 133
    goto :goto_8

    .line 134
    :cond_6
    move-object/from16 v5, v20

    .line 135
    .line 136
    :goto_8
    aput-object v5, v12, v11

    .line 137
    .line 138
    aget v5, v4, v11

    .line 139
    .line 140
    if-ne v5, v15, :cond_7

    .line 141
    .line 142
    aget-object v5, v1, v11

    .line 143
    .line 144
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    move-object/from16 v21, v3

    .line 148
    .line 149
    invoke-interface {v5}, Lr6/n;->g()Lf6/Z;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    invoke-virtual {v8, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    check-cast v3, Lf6/Z;

    .line 158
    .line 159
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    move-object/from16 v22, v4

    .line 163
    .line 164
    new-instance v4, Lf6/E;

    .line 165
    .line 166
    invoke-direct {v4, v5, v3}, Lf6/E;-><init>(Lr6/n;Lf6/Z;)V

    .line 167
    .line 168
    .line 169
    aput-object v4, v14, v11

    .line 170
    .line 171
    goto :goto_9

    .line 172
    :cond_7
    move-object/from16 v21, v3

    .line 173
    .line 174
    move-object/from16 v22, v4

    .line 175
    .line 176
    aput-object v20, v14, v11

    .line 177
    .line 178
    :goto_9
    add-int/lit8 v11, v11, 0x1

    .line 179
    .line 180
    move-object/from16 v3, v21

    .line 181
    .line 182
    move-object/from16 v4, v22

    .line 183
    .line 184
    goto :goto_7

    .line 185
    :cond_8
    move-object/from16 v21, v3

    .line 186
    .line 187
    move-object/from16 v22, v4

    .line 188
    .line 189
    move-object v3, v13

    .line 190
    aget-object v13, v10, v15

    .line 191
    .line 192
    move-object/from16 v17, p4

    .line 193
    .line 194
    move-object/from16 v16, v12

    .line 195
    .line 196
    move v5, v15

    .line 197
    move-object/from16 v15, p2

    .line 198
    .line 199
    invoke-interface/range {v13 .. v19}, Lf6/w;->y([Lr6/n;[Z[Lf6/V;[ZJ)J

    .line 200
    .line 201
    .line 202
    move-result-wide v11

    .line 203
    if-nez v5, :cond_9

    .line 204
    .line 205
    move-wide/from16 v18, v11

    .line 206
    .line 207
    goto :goto_a

    .line 208
    :cond_9
    cmp-long v4, v11, v18

    .line 209
    .line 210
    if-nez v4, :cond_f

    .line 211
    .line 212
    :goto_a
    const/4 v4, 0x0

    .line 213
    const/4 v11, 0x0

    .line 214
    :goto_b
    array-length v12, v1

    .line 215
    if-ge v4, v12, :cond_d

    .line 216
    .line 217
    aget v12, v22, v4

    .line 218
    .line 219
    const/4 v13, 0x1

    .line 220
    if-ne v12, v5, :cond_a

    .line 221
    .line 222
    aget-object v11, v16, v4

    .line 223
    .line 224
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    aget-object v12, v16, v4

    .line 228
    .line 229
    aput-object v12, v7, v4

    .line 230
    .line 231
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 232
    .line 233
    .line 234
    move-result-object v12

    .line 235
    invoke-virtual {v9, v11, v12}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move v11, v13

    .line 239
    goto :goto_d

    .line 240
    :cond_a
    aget v12, v21, v4

    .line 241
    .line 242
    if-ne v12, v5, :cond_c

    .line 243
    .line 244
    aget-object v12, v16, v4

    .line 245
    .line 246
    if-nez v12, :cond_b

    .line 247
    .line 248
    goto :goto_c

    .line 249
    :cond_b
    const/4 v13, 0x0

    .line 250
    :goto_c
    invoke-static {v13}, Lu6/a;->i(Z)V

    .line 251
    .line 252
    .line 253
    :cond_c
    :goto_d
    add-int/lit8 v4, v4, 0x1

    .line 254
    .line 255
    goto :goto_b

    .line 256
    :cond_d
    if-eqz v11, :cond_e

    .line 257
    .line 258
    aget-object v4, v10, v5

    .line 259
    .line 260
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    :cond_e
    add-int/lit8 v15, v5, 0x1

    .line 264
    .line 265
    move-object v13, v3

    .line 266
    move-object/from16 v12, v16

    .line 267
    .line 268
    move-object/from16 v3, v21

    .line 269
    .line 270
    move-object/from16 v4, v22

    .line 271
    .line 272
    goto/16 :goto_6

    .line 273
    .line 274
    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 275
    .line 276
    const-string v2, "Children enabled at different positions."

    .line 277
    .line 278
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    throw v1

    .line 282
    :cond_10
    move-object v3, v13

    .line 283
    const/4 v1, 0x0

    .line 284
    invoke-static {v7, v1, v2, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 285
    .line 286
    .line 287
    new-array v1, v1, [Lf6/w;

    .line 288
    .line 289
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    check-cast v1, [Lf6/w;

    .line 294
    .line 295
    iput-object v1, v0, Lf6/H;->h:[Lf6/w;

    .line 296
    .line 297
    iget-object v2, v0, Lf6/H;->c:Landroidx/fragment/app/X;

    .line 298
    .line 299
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    new-instance v2, Lac/a;

    .line 303
    .line 304
    const/4 v3, 0x5

    .line 305
    invoke-direct {v2, v1, v3}, Lac/a;-><init>(Ljava/lang/Object;I)V

    .line 306
    .line 307
    .line 308
    iput-object v2, v0, Lf6/H;->i:Lac/a;

    .line 309
    .line 310
    return-wide v18
.end method

.method public final z(J)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lf6/H;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    if-ge v3, v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    check-cast v4, Lf6/w;

    .line 22
    .line 23
    invoke-interface {v4, p1, p2}, Lf6/W;->z(J)Z

    .line 24
    .line 25
    .line 26
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return v2

    .line 30
    :cond_1
    iget-object v0, p0, Lf6/H;->i:Lac/a;

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, Lac/a;->z(J)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1
.end method
