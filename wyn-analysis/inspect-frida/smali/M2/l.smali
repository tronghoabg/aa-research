.class public final LM2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls2/m;


# static fields
.field public static final M:[B

.field public static final N:LN1/n;


# instance fields
.field public A:J

.field public B:J

.field public C:LM2/k;

.field public D:I

.field public E:I

.field public F:I

.field public G:Z

.field public H:Z

.field public I:Ls2/o;

.field public J:[Ls2/C;

.field public K:[Ls2/C;

.field public L:Z

.field public final a:LP2/j;

.field public final b:I

.field public final c:LM2/s;

.field public final d:Ljava/util/List;

.field public final e:Landroid/util/SparseArray;

.field public final f:LQ1/o;

.field public final g:LQ1/o;

.field public final h:LQ1/o;

.field public final i:[B

.field public final j:LQ1/o;

.field public final k:LQ1/u;

.field public final l:LS3/s;

.field public final m:LQ1/o;

.field public final n:Ljava/util/ArrayDeque;

.field public final o:Ljava/util/ArrayDeque;

.field public final p:LR1/q;

.field public final q:LX1/l;

.field public r:Ll8/e0;

.field public s:I

.field public t:I

.field public u:J

.field public v:I

.field public w:LQ1/o;

.field public x:J

.field public y:I

.field public z:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LM2/l;->M:[B

    .line 9
    .line 10
    new-instance v0, LN1/m;

    .line 11
    .line 12
    invoke-direct {v0}, LN1/m;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "application/x-emsg"

    .line 16
    .line 17
    invoke-static {v1}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, v0, LN1/m;->m:Ljava/lang/String;

    .line 22
    .line 23
    new-instance v1, LN1/n;

    .line 24
    .line 25
    invoke-direct {v1, v0}, LN1/n;-><init>(LN1/m;)V

    .line 26
    .line 27
    .line 28
    sput-object v1, LM2/l;->N:LN1/n;

    .line 29
    .line 30
    return-void

    .line 31
    :array_0
    .array-data 1
        -0x5et
        0x39t
        0x4ft
        0x52t
        0x5at
        -0x65t
        0x4ft
        0x14t
        -0x5et
        0x44t
        0x6ct
        0x42t
        0x7ct
        0x64t
        -0x73t
        -0xct
    .end array-data
.end method

.method public constructor <init>(LP2/j;ILQ1/u;LM2/s;Ljava/util/List;LX1/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM2/l;->a:LP2/j;

    .line 5
    .line 6
    iput p2, p0, LM2/l;->b:I

    .line 7
    .line 8
    iput-object p3, p0, LM2/l;->k:LQ1/u;

    .line 9
    .line 10
    iput-object p4, p0, LM2/l;->c:LM2/s;

    .line 11
    .line 12
    invoke-static {p5}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, LM2/l;->d:Ljava/util/List;

    .line 17
    .line 18
    iput-object p6, p0, LM2/l;->q:LX1/l;

    .line 19
    .line 20
    new-instance p1, LS3/s;

    .line 21
    .line 22
    const/4 p2, 0x3

    .line 23
    const/4 p3, 0x0

    .line 24
    invoke-direct {p1, p3, p2}, LS3/s;-><init>(BI)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, LM2/l;->l:LS3/s;

    .line 28
    .line 29
    new-instance p1, LQ1/o;

    .line 30
    .line 31
    const/16 p2, 0x10

    .line 32
    .line 33
    invoke-direct {p1, p2}, LQ1/o;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, LM2/l;->m:LQ1/o;

    .line 37
    .line 38
    new-instance p1, LQ1/o;

    .line 39
    .line 40
    sget-object p4, LR1/n;->a:[B

    .line 41
    .line 42
    invoke-direct {p1, p4}, LQ1/o;-><init>([B)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, LM2/l;->f:LQ1/o;

    .line 46
    .line 47
    new-instance p1, LQ1/o;

    .line 48
    .line 49
    const/4 p4, 0x5

    .line 50
    invoke-direct {p1, p4}, LQ1/o;-><init>(I)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, LM2/l;->g:LQ1/o;

    .line 54
    .line 55
    new-instance p1, LQ1/o;

    .line 56
    .line 57
    invoke-direct {p1}, LQ1/o;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, LM2/l;->h:LQ1/o;

    .line 61
    .line 62
    new-array p1, p2, [B

    .line 63
    .line 64
    iput-object p1, p0, LM2/l;->i:[B

    .line 65
    .line 66
    new-instance p2, LQ1/o;

    .line 67
    .line 68
    invoke-direct {p2, p1}, LQ1/o;-><init>([B)V

    .line 69
    .line 70
    .line 71
    iput-object p2, p0, LM2/l;->j:LQ1/o;

    .line 72
    .line 73
    new-instance p1, Ljava/util/ArrayDeque;

    .line 74
    .line 75
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, LM2/l;->n:Ljava/util/ArrayDeque;

    .line 79
    .line 80
    new-instance p1, Ljava/util/ArrayDeque;

    .line 81
    .line 82
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object p1, p0, LM2/l;->o:Ljava/util/ArrayDeque;

    .line 86
    .line 87
    new-instance p1, Landroid/util/SparseArray;

    .line 88
    .line 89
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object p1, p0, LM2/l;->e:Landroid/util/SparseArray;

    .line 93
    .line 94
    sget-object p1, Ll8/K;->b:Ll8/I;

    .line 95
    .line 96
    sget-object p1, Ll8/e0;->e:Ll8/e0;

    .line 97
    .line 98
    iput-object p1, p0, LM2/l;->r:Ll8/e0;

    .line 99
    .line 100
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    iput-wide p1, p0, LM2/l;->A:J

    .line 106
    .line 107
    iput-wide p1, p0, LM2/l;->z:J

    .line 108
    .line 109
    iput-wide p1, p0, LM2/l;->B:J

    .line 110
    .line 111
    sget-object p1, Ls2/o;->f9:La9/b;

    .line 112
    .line 113
    iput-object p1, p0, LM2/l;->I:Ls2/o;

    .line 114
    .line 115
    new-array p1, p3, [Ls2/C;

    .line 116
    .line 117
    iput-object p1, p0, LM2/l;->J:[Ls2/C;

    .line 118
    .line 119
    new-array p1, p3, [Ls2/C;

    .line 120
    .line 121
    iput-object p1, p0, LM2/l;->K:[Ls2/C;

    .line 122
    .line 123
    new-instance p1, LR1/q;

    .line 124
    .line 125
    new-instance p2, LM2/i;

    .line 126
    .line 127
    invoke-direct {p2, p0}, LM2/i;-><init>(LM2/l;)V

    .line 128
    .line 129
    .line 130
    invoke-direct {p1, p2}, LR1/q;-><init>(LR1/p;)V

    .line 131
    .line 132
    .line 133
    iput-object p1, p0, LM2/l;->p:LR1/q;

    .line 134
    .line 135
    return-void
.end method

.method public static b(Ljava/util/ArrayList;)LN1/j;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    move-object v4, v1

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v0, :cond_4

    .line 10
    .line 11
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    check-cast v5, LR1/c;

    .line 16
    .line 17
    iget v6, v5, LH5/a;->b:I

    .line 18
    .line 19
    const v7, 0x70737368    # 3.013775E29f

    .line 20
    .line 21
    .line 22
    if-ne v6, v7, :cond_3

    .line 23
    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    new-instance v4, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object v5, v5, LR1/c;->c:LQ1/o;

    .line 32
    .line 33
    iget-object v5, v5, LQ1/o;->a:[B

    .line 34
    .line 35
    invoke-static {v5}, LM2/r;->i([B)LY9/c;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    if-nez v6, :cond_1

    .line 40
    .line 41
    move-object v6, v1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    iget-object v6, v6, LY9/c;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v6, Ljava/util/UUID;

    .line 46
    .line 47
    :goto_1
    if-nez v6, :cond_2

    .line 48
    .line 49
    const-string v5, "FragmentedMp4Extractor"

    .line 50
    .line 51
    const-string v6, "Skipped pssh atom (failed to extract uuid)"

    .line 52
    .line 53
    invoke-static {v5, v6}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    new-instance v7, LN1/i;

    .line 58
    .line 59
    const-string v8, "video/mp4"

    .line 60
    .line 61
    invoke-direct {v7, v6, v1, v8, v5}, LN1/i;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_4
    if-nez v4, :cond_5

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_5
    new-instance p0, LN1/j;

    .line 74
    .line 75
    new-array v0, v2, [LN1/i;

    .line 76
    .line 77
    invoke-interface {v4, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, [LN1/i;

    .line 82
    .line 83
    invoke-direct {p0, v1, v2, v0}, LN1/j;-><init>(Ljava/lang/String;Z[LN1/i;)V

    .line 84
    .line 85
    .line 86
    return-object p0
.end method

.method public static c(LQ1/o;ILM2/u;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    add-int/lit8 p1, p1, 0x8

    .line 3
    .line 4
    invoke-virtual {p0, p1}, LQ1/o;->G(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LQ1/o;->h()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    sget-object v1, LM2/g;->a:[B

    .line 12
    .line 13
    and-int/lit8 v1, p1, 0x1

    .line 14
    .line 15
    if-nez v1, :cond_3

    .line 16
    .line 17
    and-int/lit8 p1, p1, 0x2

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    move p1, v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p1, v1

    .line 25
    :goto_0
    invoke-virtual {p0}, LQ1/o;->y()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    iget-object p0, p2, LM2/u;->k:[Z

    .line 32
    .line 33
    iget p1, p2, LM2/u;->d:I

    .line 34
    .line 35
    invoke-static {p0, v1, p1, v1}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget v3, p2, LM2/u;->d:I

    .line 40
    .line 41
    if-ne v2, v3, :cond_2

    .line 42
    .line 43
    iget-object v3, p2, LM2/u;->k:[Z

    .line 44
    .line 45
    invoke-static {v3, v1, v2, p1}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, LQ1/o;->a()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    iget-object v2, p2, LM2/u;->q:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v2, LQ1/o;

    .line 55
    .line 56
    invoke-virtual {v2, p1}, LQ1/o;->D(I)V

    .line 57
    .line 58
    .line 59
    iput-boolean v0, p2, LM2/u;->j:Z

    .line 60
    .line 61
    iput-boolean v0, p2, LM2/u;->l:Z

    .line 62
    .line 63
    iget-object p1, v2, LQ1/o;->a:[B

    .line 64
    .line 65
    iget v0, v2, LQ1/o;->c:I

    .line 66
    .line 67
    invoke-virtual {p0, v1, v0, p1}, LQ1/o;->f(II[B)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, v1}, LQ1/o;->G(I)V

    .line 71
    .line 72
    .line 73
    iput-boolean v1, p2, LM2/u;->l:Z

    .line 74
    .line 75
    return-void

    .line 76
    :cond_2
    const-string p0, "Senc sample count "

    .line 77
    .line 78
    const-string p1, " is different from fragment sample count"

    .line 79
    .line 80
    invoke-static {v2, p0, p1}, Lpd/f;->l(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    iget p1, p2, LM2/u;->d:I

    .line 85
    .line 86
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    const/4 p1, 0x0

    .line 94
    invoke-static {p1, p0}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    throw p0

    .line 99
    :cond_3
    const-string p0, "Overriding TrackEncryptionBox parameters is unsupported."

    .line 100
    .line 101
    invoke-static {p0}, LN1/D;->c(Ljava/lang/String;)LN1/D;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    throw p0
.end method


# virtual methods
.method public final a(JJ)V
    .locals 3

    .line 1
    iget-object p1, p0, LM2/l;->e:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 v0, 0x0

    .line 8
    move v1, v0

    .line 9
    :goto_0
    if-ge v1, p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, LM2/k;

    .line 16
    .line 17
    invoke-virtual {v2}, LM2/k;->e()V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p1, p0, LM2/l;->o:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 26
    .line 27
    .line 28
    iput v0, p0, LM2/l;->y:I

    .line 29
    .line 30
    iget-object p1, p0, LM2/l;->p:LR1/q;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, LR1/q;->p(I)V

    .line 33
    .line 34
    .line 35
    iput-wide p3, p0, LM2/l;->z:J

    .line 36
    .line 37
    iget-object p1, p0, LM2/l;->n:Ljava/util/ArrayDeque;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 40
    .line 41
    .line 42
    iput v0, p0, LM2/l;->s:I

    .line 43
    .line 44
    iput v0, p0, LM2/l;->v:I

    .line 45
    .line 46
    return-void
.end method

.method public final d(J)V
    .locals 58

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    :cond_0
    :goto_0
    iget-object v6, v0, LM2/l;->n:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v7

    .line 9
    if-nez v7, :cond_5e

    .line 10
    .line 11
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v7

    .line 15
    check-cast v7, LR1/b;

    .line 16
    .line 17
    iget-wide v9, v7, LR1/b;->c:J

    .line 18
    .line 19
    cmp-long v7, v9, p1

    .line 20
    .line 21
    if-nez v7, :cond_5e

    .line 22
    .line 23
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    move-object v9, v7

    .line 28
    check-cast v9, LR1/b;

    .line 29
    .line 30
    iget v7, v9, LH5/a;->b:I

    .line 31
    .line 32
    iget-object v10, v0, LM2/l;->e:Landroid/util/SparseArray;

    .line 33
    .line 34
    iget-object v11, v9, LR1/b;->d:Ljava/util/ArrayList;

    .line 35
    .line 36
    const v12, 0x6d6f6f76

    .line 37
    .line 38
    .line 39
    iget v13, v0, LM2/l;->b:I

    .line 40
    .line 41
    const/16 v14, 0xc

    .line 42
    .line 43
    const/16 v17, 0x2

    .line 44
    .line 45
    const/16 v18, 0x10

    .line 46
    .line 47
    iget-object v15, v0, LM2/l;->c:LM2/s;

    .line 48
    .line 49
    if-ne v7, v12, :cond_e

    .line 50
    .line 51
    if-nez v15, :cond_1

    .line 52
    .line 53
    const/4 v6, 0x1

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    const/4 v6, 0x0

    .line 56
    :goto_1
    const-string v7, "Unexpected moov box."

    .line 57
    .line 58
    invoke-static {v7, v6}, LQ1/k;->f(Ljava/lang/String;Z)V

    .line 59
    .line 60
    .line 61
    move v12, v13

    .line 62
    invoke-static {v11}, LM2/l;->b(Ljava/util/ArrayList;)LN1/j;

    .line 63
    .line 64
    .line 65
    move-result-object v13

    .line 66
    const v6, 0x6d766578

    .line 67
    .line 68
    .line 69
    invoke-virtual {v9, v6}, LR1/b;->o(I)LR1/b;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    new-instance v7, Landroid/util/SparseArray;

    .line 77
    .line 78
    invoke-direct {v7}, Landroid/util/SparseArray;-><init>()V

    .line 79
    .line 80
    .line 81
    iget-object v6, v6, LR1/b;->d:Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 84
    .line 85
    .line 86
    move-result v11

    .line 87
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    const/4 v15, 0x0

    .line 93
    :goto_2
    if-ge v15, v11, :cond_5

    .line 94
    .line 95
    invoke-virtual {v6, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v16

    .line 99
    const/16 v19, 0x4

    .line 100
    .line 101
    move-object/from16 v1, v16

    .line 102
    .line 103
    check-cast v1, LR1/c;

    .line 104
    .line 105
    iget v8, v1, LH5/a;->b:I

    .line 106
    .line 107
    const/16 v21, 0x1

    .line 108
    .line 109
    const v5, 0x74726578

    .line 110
    .line 111
    .line 112
    iget-object v1, v1, LR1/c;->c:LQ1/o;

    .line 113
    .line 114
    if-ne v8, v5, :cond_2

    .line 115
    .line 116
    invoke-virtual {v1, v14}, LQ1/o;->G(I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, LQ1/o;->h()I

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    invoke-virtual {v1}, LQ1/o;->h()I

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    add-int/lit8 v8, v8, -0x1

    .line 128
    .line 129
    invoke-virtual {v1}, LQ1/o;->h()I

    .line 130
    .line 131
    .line 132
    move-result v14

    .line 133
    invoke-virtual {v1}, LQ1/o;->h()I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    invoke-virtual {v1}, LQ1/o;->h()I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    move-wide/from16 v23, v3

    .line 146
    .line 147
    new-instance v3, LM2/h;

    .line 148
    .line 149
    invoke-direct {v3, v8, v14, v2, v1}, LM2/h;-><init>(IIII)V

    .line 150
    .line 151
    .line 152
    invoke-static {v5, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v2, Ljava/lang/Integer;

    .line 159
    .line 160
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v1, LM2/h;

    .line 167
    .line 168
    invoke-virtual {v7, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_2
    move-wide/from16 v23, v3

    .line 173
    .line 174
    const v2, 0x6d656864

    .line 175
    .line 176
    .line 177
    if-ne v8, v2, :cond_4

    .line 178
    .line 179
    const/16 v2, 0x8

    .line 180
    .line 181
    invoke-virtual {v1, v2}, LQ1/o;->G(I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1}, LQ1/o;->h()I

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    invoke-static {v2}, LM2/g;->c(I)I

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    if-nez v2, :cond_3

    .line 193
    .line 194
    invoke-virtual {v1}, LQ1/o;->w()J

    .line 195
    .line 196
    .line 197
    move-result-wide v1

    .line 198
    goto :goto_3

    .line 199
    :cond_3
    invoke-virtual {v1}, LQ1/o;->z()J

    .line 200
    .line 201
    .line 202
    move-result-wide v1

    .line 203
    :goto_3
    move-wide v3, v1

    .line 204
    goto :goto_5

    .line 205
    :cond_4
    :goto_4
    move-wide/from16 v3, v23

    .line 206
    .line 207
    :goto_5
    add-int/lit8 v15, v15, 0x1

    .line 208
    .line 209
    const/16 v14, 0xc

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_5
    move-wide/from16 v23, v3

    .line 213
    .line 214
    const/16 v19, 0x4

    .line 215
    .line 216
    const/16 v21, 0x1

    .line 217
    .line 218
    new-instance v1, Ls2/s;

    .line 219
    .line 220
    invoke-direct {v1}, Ls2/s;-><init>()V

    .line 221
    .line 222
    .line 223
    and-int/lit8 v2, v12, 0x10

    .line 224
    .line 225
    if-eqz v2, :cond_6

    .line 226
    .line 227
    move/from16 v14, v21

    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_6
    const/4 v14, 0x0

    .line 231
    :goto_6
    new-instance v2, LM2/i;

    .line 232
    .line 233
    invoke-direct {v2, v0}, LM2/i;-><init>(LM2/l;)V

    .line 234
    .line 235
    .line 236
    const/4 v15, 0x0

    .line 237
    move-object v11, v10

    .line 238
    move-object v10, v1

    .line 239
    move-object v1, v11

    .line 240
    move-object/from16 v16, v2

    .line 241
    .line 242
    move-wide/from16 v11, v23

    .line 243
    .line 244
    invoke-static/range {v9 .. v16}, LM2/g;->g(LR1/b;Ls2/s;JLN1/j;ZZLk8/h;)Ljava/util/ArrayList;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    if-nez v4, :cond_9

    .line 257
    .line 258
    const/4 v4, 0x0

    .line 259
    :goto_7
    if-ge v4, v3, :cond_8

    .line 260
    .line 261
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    check-cast v5, LM2/v;

    .line 266
    .line 267
    iget-object v6, v5, LM2/v;->a:LM2/s;

    .line 268
    .line 269
    new-instance v8, LM2/k;

    .line 270
    .line 271
    iget-object v9, v0, LM2/l;->I:Ls2/o;

    .line 272
    .line 273
    iget v10, v6, LM2/s;->b:I

    .line 274
    .line 275
    invoke-interface {v9, v4, v10}, Ls2/o;->m(II)Ls2/C;

    .line 276
    .line 277
    .line 278
    move-result-object v9

    .line 279
    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    .line 280
    .line 281
    .line 282
    move-result v10

    .line 283
    iget v11, v6, LM2/s;->a:I

    .line 284
    .line 285
    move/from16 v12, v21

    .line 286
    .line 287
    if-ne v10, v12, :cond_7

    .line 288
    .line 289
    const/4 v10, 0x0

    .line 290
    invoke-virtual {v7, v10}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v12

    .line 294
    check-cast v12, LM2/h;

    .line 295
    .line 296
    goto :goto_8

    .line 297
    :cond_7
    invoke-virtual {v7, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v10

    .line 301
    move-object v12, v10

    .line 302
    check-cast v12, LM2/h;

    .line 303
    .line 304
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    :goto_8
    invoke-direct {v8, v9, v5, v12}, LM2/k;-><init>(Ls2/C;LM2/v;LM2/h;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v1, v11, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    iget-wide v8, v0, LM2/l;->A:J

    .line 314
    .line 315
    iget-wide v5, v6, LM2/s;->e:J

    .line 316
    .line 317
    invoke-static {v8, v9, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 318
    .line 319
    .line 320
    move-result-wide v5

    .line 321
    iput-wide v5, v0, LM2/l;->A:J

    .line 322
    .line 323
    const/16 v21, 0x1

    .line 324
    .line 325
    add-int/lit8 v4, v4, 0x1

    .line 326
    .line 327
    const/16 v21, 0x1

    .line 328
    .line 329
    goto :goto_7

    .line 330
    :cond_8
    iget-object v1, v0, LM2/l;->I:Ls2/o;

    .line 331
    .line 332
    invoke-interface {v1}, Ls2/o;->l()V

    .line 333
    .line 334
    .line 335
    goto :goto_c

    .line 336
    :cond_9
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 337
    .line 338
    .line 339
    move-result v4

    .line 340
    if-ne v4, v3, :cond_a

    .line 341
    .line 342
    const/4 v4, 0x1

    .line 343
    goto :goto_9

    .line 344
    :cond_a
    const/4 v4, 0x0

    .line 345
    :goto_9
    invoke-static {v4}, LQ1/k;->g(Z)V

    .line 346
    .line 347
    .line 348
    const/4 v4, 0x0

    .line 349
    :goto_a
    if-ge v4, v3, :cond_c

    .line 350
    .line 351
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v5

    .line 355
    check-cast v5, LM2/v;

    .line 356
    .line 357
    iget-object v6, v5, LM2/v;->a:LM2/s;

    .line 358
    .line 359
    iget v8, v6, LM2/s;->a:I

    .line 360
    .line 361
    invoke-virtual {v1, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v8

    .line 365
    check-cast v8, LM2/k;

    .line 366
    .line 367
    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    .line 368
    .line 369
    .line 370
    move-result v9

    .line 371
    const/4 v12, 0x1

    .line 372
    if-ne v9, v12, :cond_b

    .line 373
    .line 374
    const/4 v10, 0x0

    .line 375
    invoke-virtual {v7, v10}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v6

    .line 379
    check-cast v6, LM2/h;

    .line 380
    .line 381
    goto :goto_b

    .line 382
    :cond_b
    iget v6, v6, LM2/s;->a:I

    .line 383
    .line 384
    invoke-virtual {v7, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v6

    .line 388
    check-cast v6, LM2/h;

    .line 389
    .line 390
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    :goto_b
    iput-object v5, v8, LM2/k;->d:LM2/v;

    .line 394
    .line 395
    iput-object v6, v8, LM2/k;->e:LM2/h;

    .line 396
    .line 397
    iget-object v5, v5, LM2/v;->a:LM2/s;

    .line 398
    .line 399
    iget-object v5, v5, LM2/s;->g:LN1/n;

    .line 400
    .line 401
    iget-object v6, v8, LM2/k;->a:Ls2/C;

    .line 402
    .line 403
    invoke-interface {v6, v5}, Ls2/C;->c(LN1/n;)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v8}, LM2/k;->e()V

    .line 407
    .line 408
    .line 409
    const/16 v21, 0x1

    .line 410
    .line 411
    add-int/lit8 v4, v4, 0x1

    .line 412
    .line 413
    goto :goto_a

    .line 414
    :cond_c
    :goto_c
    move/from16 v12, v18

    .line 415
    .line 416
    move/from16 v15, v19

    .line 417
    .line 418
    const/16 v13, 0x8

    .line 419
    .line 420
    :cond_d
    const/16 v21, 0x1

    .line 421
    .line 422
    goto/16 :goto_0

    .line 423
    .line 424
    :cond_e
    move-object v1, v10

    .line 425
    move v12, v13

    .line 426
    const/16 v19, 0x4

    .line 427
    .line 428
    const v2, 0x6d6f6f66

    .line 429
    .line 430
    .line 431
    if-ne v7, v2, :cond_5d

    .line 432
    .line 433
    if-eqz v15, :cond_f

    .line 434
    .line 435
    const/4 v2, 0x1

    .line 436
    goto :goto_d

    .line 437
    :cond_f
    const/4 v2, 0x0

    .line 438
    :goto_d
    iget-object v5, v9, LR1/b;->e:Ljava/util/ArrayList;

    .line 439
    .line 440
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 441
    .line 442
    .line 443
    move-result v6

    .line 444
    const/4 v10, 0x0

    .line 445
    :goto_e
    if-ge v10, v6, :cond_56

    .line 446
    .line 447
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v8

    .line 451
    check-cast v8, LR1/b;

    .line 452
    .line 453
    iget v9, v8, LH5/a;->b:I

    .line 454
    .line 455
    const v13, 0x74726166

    .line 456
    .line 457
    .line 458
    if-ne v9, v13, :cond_55

    .line 459
    .line 460
    const v9, 0x74666864

    .line 461
    .line 462
    .line 463
    invoke-virtual {v8, v9}, LR1/b;->q(I)LR1/c;

    .line 464
    .line 465
    .line 466
    move-result-object v9

    .line 467
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    iget-object v9, v9, LR1/c;->c:LQ1/o;

    .line 471
    .line 472
    const/16 v13, 0x8

    .line 473
    .line 474
    invoke-virtual {v9, v13}, LQ1/o;->G(I)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v9}, LQ1/o;->h()I

    .line 478
    .line 479
    .line 480
    move-result v13

    .line 481
    sget-object v14, LM2/g;->a:[B

    .line 482
    .line 483
    invoke-virtual {v9}, LQ1/o;->h()I

    .line 484
    .line 485
    .line 486
    move-result v14

    .line 487
    if-eqz v2, :cond_10

    .line 488
    .line 489
    const/4 v15, 0x0

    .line 490
    invoke-virtual {v1, v15}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v14

    .line 494
    :goto_f
    check-cast v14, LM2/k;

    .line 495
    .line 496
    goto :goto_10

    .line 497
    :cond_10
    invoke-virtual {v1, v14}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v14

    .line 501
    goto :goto_f

    .line 502
    :goto_10
    if-nez v14, :cond_11

    .line 503
    .line 504
    move/from16 v26, v2

    .line 505
    .line 506
    move-object v15, v8

    .line 507
    const/4 v14, 0x0

    .line 508
    const-wide v23, -0x7fffffffffffffffL    # -4.9E-324

    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    goto :goto_17

    .line 514
    :cond_11
    const/16 v21, 0x1

    .line 515
    .line 516
    and-int/lit8 v15, v13, 0x1

    .line 517
    .line 518
    const-wide v23, -0x7fffffffffffffffL    # -4.9E-324

    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    iget-object v3, v14, LM2/k;->b:LM2/u;

    .line 524
    .line 525
    if-eqz v15, :cond_12

    .line 526
    .line 527
    move-object v15, v8

    .line 528
    invoke-virtual {v9}, LQ1/o;->z()J

    .line 529
    .line 530
    .line 531
    move-result-wide v7

    .line 532
    iput-wide v7, v3, LM2/u;->a:J

    .line 533
    .line 534
    iput-wide v7, v3, LM2/u;->b:J

    .line 535
    .line 536
    goto :goto_11

    .line 537
    :cond_12
    move-object v15, v8

    .line 538
    :goto_11
    iget-object v7, v14, LM2/k;->e:LM2/h;

    .line 539
    .line 540
    and-int/lit8 v8, v13, 0x2

    .line 541
    .line 542
    if-eqz v8, :cond_13

    .line 543
    .line 544
    invoke-virtual {v9}, LQ1/o;->h()I

    .line 545
    .line 546
    .line 547
    move-result v8

    .line 548
    const/16 v21, 0x1

    .line 549
    .line 550
    add-int/lit8 v8, v8, -0x1

    .line 551
    .line 552
    :goto_12
    const/16 v22, 0x8

    .line 553
    .line 554
    goto :goto_13

    .line 555
    :cond_13
    iget v8, v7, LM2/h;->a:I

    .line 556
    .line 557
    goto :goto_12

    .line 558
    :goto_13
    and-int/lit8 v25, v13, 0x8

    .line 559
    .line 560
    if-eqz v25, :cond_14

    .line 561
    .line 562
    invoke-virtual {v9}, LQ1/o;->h()I

    .line 563
    .line 564
    .line 565
    move-result v25

    .line 566
    move/from16 v4, v25

    .line 567
    .line 568
    goto :goto_14

    .line 569
    :cond_14
    iget v4, v7, LM2/h;->b:I

    .line 570
    .line 571
    :goto_14
    and-int/lit8 v26, v13, 0x10

    .line 572
    .line 573
    if-eqz v26, :cond_15

    .line 574
    .line 575
    invoke-virtual {v9}, LQ1/o;->h()I

    .line 576
    .line 577
    .line 578
    move-result v26

    .line 579
    move/from16 v57, v26

    .line 580
    .line 581
    move/from16 v26, v2

    .line 582
    .line 583
    move/from16 v2, v57

    .line 584
    .line 585
    goto :goto_15

    .line 586
    :cond_15
    move/from16 v26, v2

    .line 587
    .line 588
    iget v2, v7, LM2/h;->c:I

    .line 589
    .line 590
    :goto_15
    and-int/lit8 v13, v13, 0x20

    .line 591
    .line 592
    if-eqz v13, :cond_16

    .line 593
    .line 594
    invoke-virtual {v9}, LQ1/o;->h()I

    .line 595
    .line 596
    .line 597
    move-result v7

    .line 598
    goto :goto_16

    .line 599
    :cond_16
    iget v7, v7, LM2/h;->d:I

    .line 600
    .line 601
    :goto_16
    new-instance v9, LM2/h;

    .line 602
    .line 603
    invoke-direct {v9, v8, v4, v2, v7}, LM2/h;-><init>(IIII)V

    .line 604
    .line 605
    .line 606
    iput-object v9, v3, LM2/u;->o:Ljava/lang/Object;

    .line 607
    .line 608
    :goto_17
    if-nez v14, :cond_17

    .line 609
    .line 610
    move-object/from16 v27, v5

    .line 611
    .line 612
    move/from16 v33, v6

    .line 613
    .line 614
    move/from16 v46, v10

    .line 615
    .line 616
    move-object/from16 v48, v11

    .line 617
    .line 618
    move/from16 v49, v12

    .line 619
    .line 620
    move/from16 v12, v18

    .line 621
    .line 622
    move/from16 v15, v19

    .line 623
    .line 624
    const/16 v14, 0xc

    .line 625
    .line 626
    :goto_18
    const/16 v13, 0x8

    .line 627
    .line 628
    const/16 v21, 0x1

    .line 629
    .line 630
    goto/16 :goto_45

    .line 631
    .line 632
    :cond_17
    iget-object v2, v14, LM2/k;->b:LM2/u;

    .line 633
    .line 634
    iget-wide v3, v2, LM2/u;->m:J

    .line 635
    .line 636
    iget-boolean v7, v2, LM2/u;->n:Z

    .line 637
    .line 638
    invoke-virtual {v14}, LM2/k;->e()V

    .line 639
    .line 640
    .line 641
    const/4 v8, 0x1

    .line 642
    iput-boolean v8, v14, LM2/k;->l:Z

    .line 643
    .line 644
    const v9, 0x74666474

    .line 645
    .line 646
    .line 647
    invoke-virtual {v15, v9}, LR1/b;->q(I)LR1/c;

    .line 648
    .line 649
    .line 650
    move-result-object v9

    .line 651
    if-eqz v9, :cond_19

    .line 652
    .line 653
    and-int/lit8 v13, v12, 0x2

    .line 654
    .line 655
    if-nez v13, :cond_19

    .line 656
    .line 657
    iget-object v3, v9, LR1/c;->c:LQ1/o;

    .line 658
    .line 659
    const/16 v13, 0x8

    .line 660
    .line 661
    invoke-virtual {v3, v13}, LQ1/o;->G(I)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v3}, LQ1/o;->h()I

    .line 665
    .line 666
    .line 667
    move-result v4

    .line 668
    invoke-static {v4}, LM2/g;->c(I)I

    .line 669
    .line 670
    .line 671
    move-result v4

    .line 672
    if-ne v4, v8, :cond_18

    .line 673
    .line 674
    invoke-virtual {v3}, LQ1/o;->z()J

    .line 675
    .line 676
    .line 677
    move-result-wide v3

    .line 678
    goto :goto_19

    .line 679
    :cond_18
    invoke-virtual {v3}, LQ1/o;->w()J

    .line 680
    .line 681
    .line 682
    move-result-wide v3

    .line 683
    :goto_19
    iput-wide v3, v2, LM2/u;->m:J

    .line 684
    .line 685
    iput-boolean v8, v2, LM2/u;->n:Z

    .line 686
    .line 687
    goto :goto_1a

    .line 688
    :cond_19
    iput-wide v3, v2, LM2/u;->m:J

    .line 689
    .line 690
    iput-boolean v7, v2, LM2/u;->n:Z

    .line 691
    .line 692
    :goto_1a
    iget-object v3, v15, LR1/b;->d:Ljava/util/ArrayList;

    .line 693
    .line 694
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 695
    .line 696
    .line 697
    move-result v7

    .line 698
    const/4 v4, 0x0

    .line 699
    const/4 v8, 0x0

    .line 700
    const/4 v9, 0x0

    .line 701
    :goto_1b
    const v13, 0x7472756e

    .line 702
    .line 703
    .line 704
    if-ge v4, v7, :cond_1b

    .line 705
    .line 706
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 707
    .line 708
    .line 709
    move-result-object v27

    .line 710
    move/from16 v28, v4

    .line 711
    .line 712
    move-object/from16 v4, v27

    .line 713
    .line 714
    check-cast v4, LR1/c;

    .line 715
    .line 716
    move-object/from16 v27, v5

    .line 717
    .line 718
    iget v5, v4, LH5/a;->b:I

    .line 719
    .line 720
    if-ne v5, v13, :cond_1a

    .line 721
    .line 722
    iget-object v4, v4, LR1/c;->c:LQ1/o;

    .line 723
    .line 724
    const/16 v5, 0xc

    .line 725
    .line 726
    invoke-virtual {v4, v5}, LQ1/o;->G(I)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v4}, LQ1/o;->y()I

    .line 730
    .line 731
    .line 732
    move-result v4

    .line 733
    if-lez v4, :cond_1a

    .line 734
    .line 735
    add-int/2addr v9, v4

    .line 736
    const/16 v21, 0x1

    .line 737
    .line 738
    add-int/lit8 v8, v8, 0x1

    .line 739
    .line 740
    goto :goto_1c

    .line 741
    :cond_1a
    const/16 v21, 0x1

    .line 742
    .line 743
    :goto_1c
    add-int/lit8 v4, v28, 0x1

    .line 744
    .line 745
    move-object/from16 v5, v27

    .line 746
    .line 747
    goto :goto_1b

    .line 748
    :cond_1b
    move-object/from16 v27, v5

    .line 749
    .line 750
    const/4 v4, 0x0

    .line 751
    iput v4, v14, LM2/k;->h:I

    .line 752
    .line 753
    iput v4, v14, LM2/k;->g:I

    .line 754
    .line 755
    iput v4, v14, LM2/k;->f:I

    .line 756
    .line 757
    iput v8, v2, LM2/u;->c:I

    .line 758
    .line 759
    iput v9, v2, LM2/u;->d:I

    .line 760
    .line 761
    iget-object v4, v2, LM2/u;->f:[I

    .line 762
    .line 763
    array-length v4, v4

    .line 764
    if-ge v4, v8, :cond_1c

    .line 765
    .line 766
    new-array v4, v8, [J

    .line 767
    .line 768
    iput-object v4, v2, LM2/u;->e:[J

    .line 769
    .line 770
    new-array v4, v8, [I

    .line 771
    .line 772
    iput-object v4, v2, LM2/u;->f:[I

    .line 773
    .line 774
    :cond_1c
    iget-object v4, v2, LM2/u;->g:[I

    .line 775
    .line 776
    array-length v4, v4

    .line 777
    if-ge v4, v9, :cond_1d

    .line 778
    .line 779
    mul-int/lit8 v9, v9, 0x7d

    .line 780
    .line 781
    div-int/lit8 v9, v9, 0x64

    .line 782
    .line 783
    new-array v4, v9, [I

    .line 784
    .line 785
    iput-object v4, v2, LM2/u;->g:[I

    .line 786
    .line 787
    new-array v4, v9, [J

    .line 788
    .line 789
    iput-object v4, v2, LM2/u;->h:[J

    .line 790
    .line 791
    new-array v4, v9, [Z

    .line 792
    .line 793
    iput-object v4, v2, LM2/u;->i:[Z

    .line 794
    .line 795
    new-array v4, v9, [Z

    .line 796
    .line 797
    iput-object v4, v2, LM2/u;->k:[Z

    .line 798
    .line 799
    :cond_1d
    const/4 v5, 0x0

    .line 800
    const/4 v8, 0x0

    .line 801
    const/4 v9, 0x0

    .line 802
    :goto_1d
    const-wide/16 v28, 0x0

    .line 803
    .line 804
    if-ge v5, v7, :cond_35

    .line 805
    .line 806
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 807
    .line 808
    .line 809
    move-result-object v4

    .line 810
    check-cast v4, LR1/c;

    .line 811
    .line 812
    move/from16 v30, v5

    .line 813
    .line 814
    iget v5, v4, LH5/a;->b:I

    .line 815
    .line 816
    if-ne v5, v13, :cond_34

    .line 817
    .line 818
    const/16 v21, 0x1

    .line 819
    .line 820
    add-int/lit8 v5, v8, 0x1

    .line 821
    .line 822
    iget-object v4, v4, LR1/c;->c:LQ1/o;

    .line 823
    .line 824
    const/16 v13, 0x8

    .line 825
    .line 826
    invoke-virtual {v4, v13}, LQ1/o;->G(I)V

    .line 827
    .line 828
    .line 829
    invoke-virtual {v4}, LQ1/o;->h()I

    .line 830
    .line 831
    .line 832
    move-result v13

    .line 833
    sget-object v31, LM2/g;->a:[B

    .line 834
    .line 835
    move-object/from16 v31, v4

    .line 836
    .line 837
    iget-object v4, v14, LM2/k;->d:LM2/v;

    .line 838
    .line 839
    move/from16 v32, v5

    .line 840
    .line 841
    iget-object v5, v2, LM2/u;->o:Ljava/lang/Object;

    .line 842
    .line 843
    check-cast v5, LM2/h;

    .line 844
    .line 845
    sget v33, LQ1/x;->a:I

    .line 846
    .line 847
    move/from16 v33, v6

    .line 848
    .line 849
    iget-object v6, v2, LM2/u;->f:[I

    .line 850
    .line 851
    invoke-virtual/range {v31 .. v31}, LQ1/o;->y()I

    .line 852
    .line 853
    .line 854
    move-result v34

    .line 855
    aput v34, v6, v8

    .line 856
    .line 857
    iget-object v6, v2, LM2/u;->e:[J

    .line 858
    .line 859
    move-object/from16 v35, v6

    .line 860
    .line 861
    move/from16 v34, v7

    .line 862
    .line 863
    iget-wide v6, v2, LM2/u;->a:J

    .line 864
    .line 865
    aput-wide v6, v35, v8

    .line 866
    .line 867
    const/16 v21, 0x1

    .line 868
    .line 869
    and-int/lit8 v36, v13, 0x1

    .line 870
    .line 871
    if-eqz v36, :cond_1e

    .line 872
    .line 873
    move-wide/from16 v36, v6

    .line 874
    .line 875
    invoke-virtual/range {v31 .. v31}, LQ1/o;->h()I

    .line 876
    .line 877
    .line 878
    move-result v6

    .line 879
    int-to-long v6, v6

    .line 880
    add-long v6, v36, v6

    .line 881
    .line 882
    aput-wide v6, v35, v8

    .line 883
    .line 884
    :cond_1e
    and-int/lit8 v6, v13, 0x4

    .line 885
    .line 886
    if-eqz v6, :cond_1f

    .line 887
    .line 888
    const/4 v6, 0x1

    .line 889
    goto :goto_1e

    .line 890
    :cond_1f
    const/4 v6, 0x0

    .line 891
    :goto_1e
    iget v7, v5, LM2/h;->d:I

    .line 892
    .line 893
    if-eqz v6, :cond_20

    .line 894
    .line 895
    invoke-virtual/range {v31 .. v31}, LQ1/o;->h()I

    .line 896
    .line 897
    .line 898
    move-result v7

    .line 899
    :cond_20
    move/from16 v35, v6

    .line 900
    .line 901
    and-int/lit16 v6, v13, 0x100

    .line 902
    .line 903
    if-eqz v6, :cond_21

    .line 904
    .line 905
    const/4 v6, 0x1

    .line 906
    goto :goto_1f

    .line 907
    :cond_21
    const/4 v6, 0x0

    .line 908
    :goto_1f
    move/from16 v36, v6

    .line 909
    .line 910
    and-int/lit16 v6, v13, 0x200

    .line 911
    .line 912
    if-eqz v6, :cond_22

    .line 913
    .line 914
    const/4 v6, 0x1

    .line 915
    goto :goto_20

    .line 916
    :cond_22
    const/4 v6, 0x0

    .line 917
    :goto_20
    move/from16 v37, v6

    .line 918
    .line 919
    and-int/lit16 v6, v13, 0x400

    .line 920
    .line 921
    if-eqz v6, :cond_23

    .line 922
    .line 923
    const/4 v6, 0x1

    .line 924
    goto :goto_21

    .line 925
    :cond_23
    const/4 v6, 0x0

    .line 926
    :goto_21
    and-int/lit16 v13, v13, 0x800

    .line 927
    .line 928
    if-eqz v13, :cond_24

    .line 929
    .line 930
    const/4 v13, 0x1

    .line 931
    goto :goto_22

    .line 932
    :cond_24
    const/4 v13, 0x0

    .line 933
    :goto_22
    iget-object v4, v4, LM2/v;->a:LM2/s;

    .line 934
    .line 935
    move/from16 v38, v6

    .line 936
    .line 937
    iget-object v6, v4, LM2/s;->i:[J

    .line 938
    .line 939
    move/from16 v39, v7

    .line 940
    .line 941
    if-eqz v6, :cond_27

    .line 942
    .line 943
    array-length v7, v6

    .line 944
    move-object/from16 v40, v6

    .line 945
    .line 946
    const/4 v6, 0x1

    .line 947
    if-ne v7, v6, :cond_27

    .line 948
    .line 949
    iget-object v6, v4, LM2/s;->j:[J

    .line 950
    .line 951
    if-nez v6, :cond_25

    .line 952
    .line 953
    goto :goto_24

    .line 954
    :cond_25
    const/16 v20, 0x0

    .line 955
    .line 956
    aget-wide v41, v40, v20

    .line 957
    .line 958
    cmp-long v7, v41, v28

    .line 959
    .line 960
    if-nez v7, :cond_26

    .line 961
    .line 962
    move-object/from16 v40, v6

    .line 963
    .line 964
    goto :goto_23

    .line 965
    :cond_26
    sget-object v47, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 966
    .line 967
    const-wide/32 v43, 0xf4240

    .line 968
    .line 969
    .line 970
    move-object/from16 v40, v6

    .line 971
    .line 972
    iget-wide v6, v4, LM2/s;->d:J

    .line 973
    .line 974
    move-wide/from16 v45, v6

    .line 975
    .line 976
    invoke-static/range {v41 .. v47}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    .line 977
    .line 978
    .line 979
    move-result-wide v6

    .line 980
    aget-wide v43, v40, v20

    .line 981
    .line 982
    const-wide/32 v45, 0xf4240

    .line 983
    .line 984
    .line 985
    move-wide/from16 v41, v6

    .line 986
    .line 987
    iget-wide v6, v4, LM2/s;->c:J

    .line 988
    .line 989
    move-object/from16 v49, v47

    .line 990
    .line 991
    move-wide/from16 v47, v6

    .line 992
    .line 993
    invoke-static/range {v43 .. v49}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    .line 994
    .line 995
    .line 996
    move-result-wide v6

    .line 997
    add-long v6, v41, v6

    .line 998
    .line 999
    move-wide/from16 v41, v6

    .line 1000
    .line 1001
    iget-wide v6, v4, LM2/s;->e:J

    .line 1002
    .line 1003
    cmp-long v6, v41, v6

    .line 1004
    .line 1005
    if-ltz v6, :cond_27

    .line 1006
    .line 1007
    :goto_23
    aget-wide v28, v40, v20

    .line 1008
    .line 1009
    :cond_27
    :goto_24
    iget-object v6, v2, LM2/u;->g:[I

    .line 1010
    .line 1011
    iget-object v7, v2, LM2/u;->h:[J

    .line 1012
    .line 1013
    move-object/from16 v40, v6

    .line 1014
    .line 1015
    iget-object v6, v2, LM2/u;->i:[Z

    .line 1016
    .line 1017
    move-object/from16 v41, v6

    .line 1018
    .line 1019
    iget v6, v4, LM2/s;->b:I

    .line 1020
    .line 1021
    move-object/from16 v42, v7

    .line 1022
    .line 1023
    move/from16 v7, v17

    .line 1024
    .line 1025
    if-ne v6, v7, :cond_28

    .line 1026
    .line 1027
    const/16 v21, 0x1

    .line 1028
    .line 1029
    and-int/lit8 v6, v12, 0x1

    .line 1030
    .line 1031
    if-eqz v6, :cond_28

    .line 1032
    .line 1033
    const/4 v6, 0x1

    .line 1034
    goto :goto_25

    .line 1035
    :cond_28
    const/4 v6, 0x0

    .line 1036
    :goto_25
    iget-object v7, v2, LM2/u;->f:[I

    .line 1037
    .line 1038
    aget v7, v7, v8

    .line 1039
    .line 1040
    add-int/2addr v7, v9

    .line 1041
    move/from16 v43, v9

    .line 1042
    .line 1043
    iget-wide v8, v2, LM2/u;->m:J

    .line 1044
    .line 1045
    move/from16 v44, v6

    .line 1046
    .line 1047
    move/from16 v6, v43

    .line 1048
    .line 1049
    :goto_26
    if-ge v6, v7, :cond_33

    .line 1050
    .line 1051
    if-eqz v36, :cond_29

    .line 1052
    .line 1053
    invoke-virtual/range {v31 .. v31}, LQ1/o;->h()I

    .line 1054
    .line 1055
    .line 1056
    move-result v43

    .line 1057
    move/from16 v45, v43

    .line 1058
    .line 1059
    move/from16 v43, v6

    .line 1060
    .line 1061
    move/from16 v6, v45

    .line 1062
    .line 1063
    :goto_27
    move/from16 v45, v7

    .line 1064
    .line 1065
    goto :goto_28

    .line 1066
    :cond_29
    move/from16 v43, v6

    .line 1067
    .line 1068
    iget v6, v5, LM2/h;->b:I

    .line 1069
    .line 1070
    goto :goto_27

    .line 1071
    :goto_28
    const-string v7, "Unexpected negative value: "

    .line 1072
    .line 1073
    if-ltz v6, :cond_32

    .line 1074
    .line 1075
    if-eqz v37, :cond_2a

    .line 1076
    .line 1077
    invoke-virtual/range {v31 .. v31}, LQ1/o;->h()I

    .line 1078
    .line 1079
    .line 1080
    move-result v46

    .line 1081
    move/from16 v57, v46

    .line 1082
    .line 1083
    move/from16 v46, v10

    .line 1084
    .line 1085
    move/from16 v10, v57

    .line 1086
    .line 1087
    goto :goto_29

    .line 1088
    :cond_2a
    move/from16 v46, v10

    .line 1089
    .line 1090
    iget v10, v5, LM2/h;->c:I

    .line 1091
    .line 1092
    :goto_29
    if-ltz v10, :cond_31

    .line 1093
    .line 1094
    if-eqz v38, :cond_2b

    .line 1095
    .line 1096
    invoke-virtual/range {v31 .. v31}, LQ1/o;->h()I

    .line 1097
    .line 1098
    .line 1099
    move-result v7

    .line 1100
    goto :goto_2a

    .line 1101
    :cond_2b
    if-nez v43, :cond_2c

    .line 1102
    .line 1103
    if-eqz v35, :cond_2c

    .line 1104
    .line 1105
    move/from16 v7, v39

    .line 1106
    .line 1107
    goto :goto_2a

    .line 1108
    :cond_2c
    iget v7, v5, LM2/h;->d:I

    .line 1109
    .line 1110
    :goto_2a
    if-eqz v13, :cond_2d

    .line 1111
    .line 1112
    invoke-virtual/range {v31 .. v31}, LQ1/o;->h()I

    .line 1113
    .line 1114
    .line 1115
    move-result v47

    .line 1116
    move/from16 v48, v47

    .line 1117
    .line 1118
    move-object/from16 v47, v5

    .line 1119
    .line 1120
    move/from16 v5, v48

    .line 1121
    .line 1122
    :goto_2b
    move-object/from16 v48, v11

    .line 1123
    .line 1124
    move/from16 v49, v12

    .line 1125
    .line 1126
    goto :goto_2c

    .line 1127
    :cond_2d
    move-object/from16 v47, v5

    .line 1128
    .line 1129
    const/4 v5, 0x0

    .line 1130
    goto :goto_2b

    .line 1131
    :goto_2c
    int-to-long v11, v5

    .line 1132
    add-long/2addr v11, v8

    .line 1133
    sub-long v50, v11, v28

    .line 1134
    .line 1135
    sget-object v56, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1136
    .line 1137
    const-wide/32 v52, 0xf4240

    .line 1138
    .line 1139
    .line 1140
    iget-wide v11, v4, LM2/s;->c:J

    .line 1141
    .line 1142
    move-wide/from16 v54, v11

    .line 1143
    .line 1144
    invoke-static/range {v50 .. v56}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    .line 1145
    .line 1146
    .line 1147
    move-result-wide v11

    .line 1148
    aput-wide v11, v42, v43

    .line 1149
    .line 1150
    iget-boolean v5, v2, LM2/u;->n:Z

    .line 1151
    .line 1152
    if-nez v5, :cond_2e

    .line 1153
    .line 1154
    iget-object v5, v14, LM2/k;->d:LM2/v;

    .line 1155
    .line 1156
    move-object/from16 v50, v4

    .line 1157
    .line 1158
    iget-wide v4, v5, LM2/v;->h:J

    .line 1159
    .line 1160
    add-long/2addr v11, v4

    .line 1161
    aput-wide v11, v42, v43

    .line 1162
    .line 1163
    goto :goto_2d

    .line 1164
    :cond_2e
    move-object/from16 v50, v4

    .line 1165
    .line 1166
    :goto_2d
    aput v10, v40, v43

    .line 1167
    .line 1168
    shr-int/lit8 v4, v7, 0x10

    .line 1169
    .line 1170
    const/16 v21, 0x1

    .line 1171
    .line 1172
    and-int/lit8 v4, v4, 0x1

    .line 1173
    .line 1174
    if-nez v4, :cond_30

    .line 1175
    .line 1176
    if-eqz v44, :cond_2f

    .line 1177
    .line 1178
    if-nez v43, :cond_30

    .line 1179
    .line 1180
    :cond_2f
    const/4 v4, 0x1

    .line 1181
    goto :goto_2e

    .line 1182
    :cond_30
    const/4 v4, 0x0

    .line 1183
    :goto_2e
    aput-boolean v4, v41, v43

    .line 1184
    .line 1185
    int-to-long v4, v6

    .line 1186
    add-long/2addr v8, v4

    .line 1187
    const/16 v21, 0x1

    .line 1188
    .line 1189
    add-int/lit8 v6, v43, 0x1

    .line 1190
    .line 1191
    move/from16 v7, v45

    .line 1192
    .line 1193
    move/from16 v10, v46

    .line 1194
    .line 1195
    move-object/from16 v5, v47

    .line 1196
    .line 1197
    move-object/from16 v11, v48

    .line 1198
    .line 1199
    move/from16 v12, v49

    .line 1200
    .line 1201
    move-object/from16 v4, v50

    .line 1202
    .line 1203
    goto/16 :goto_26

    .line 1204
    .line 1205
    :cond_31
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1206
    .line 1207
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1208
    .line 1209
    .line 1210
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1211
    .line 1212
    .line 1213
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v1

    .line 1217
    const/4 v4, 0x0

    .line 1218
    invoke-static {v4, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v1

    .line 1222
    throw v1

    .line 1223
    :cond_32
    const/4 v4, 0x0

    .line 1224
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1225
    .line 1226
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1227
    .line 1228
    .line 1229
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1230
    .line 1231
    .line 1232
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v1

    .line 1236
    invoke-static {v4, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v1

    .line 1240
    throw v1

    .line 1241
    :cond_33
    move/from16 v45, v7

    .line 1242
    .line 1243
    move/from16 v46, v10

    .line 1244
    .line 1245
    move-object/from16 v48, v11

    .line 1246
    .line 1247
    move/from16 v49, v12

    .line 1248
    .line 1249
    iput-wide v8, v2, LM2/u;->m:J

    .line 1250
    .line 1251
    move/from16 v8, v32

    .line 1252
    .line 1253
    move/from16 v9, v45

    .line 1254
    .line 1255
    :goto_2f
    const/16 v21, 0x1

    .line 1256
    .line 1257
    goto :goto_30

    .line 1258
    :cond_34
    move/from16 v33, v6

    .line 1259
    .line 1260
    move/from16 v34, v7

    .line 1261
    .line 1262
    move/from16 v43, v9

    .line 1263
    .line 1264
    move/from16 v46, v10

    .line 1265
    .line 1266
    move-object/from16 v48, v11

    .line 1267
    .line 1268
    move/from16 v49, v12

    .line 1269
    .line 1270
    goto :goto_2f

    .line 1271
    :goto_30
    add-int/lit8 v5, v30, 0x1

    .line 1272
    .line 1273
    move/from16 v6, v33

    .line 1274
    .line 1275
    move/from16 v7, v34

    .line 1276
    .line 1277
    move/from16 v10, v46

    .line 1278
    .line 1279
    move-object/from16 v11, v48

    .line 1280
    .line 1281
    move/from16 v12, v49

    .line 1282
    .line 1283
    const v13, 0x7472756e

    .line 1284
    .line 1285
    .line 1286
    const/16 v17, 0x2

    .line 1287
    .line 1288
    goto/16 :goto_1d

    .line 1289
    .line 1290
    :cond_35
    move/from16 v33, v6

    .line 1291
    .line 1292
    move/from16 v46, v10

    .line 1293
    .line 1294
    move-object/from16 v48, v11

    .line 1295
    .line 1296
    move/from16 v49, v12

    .line 1297
    .line 1298
    iget-object v5, v14, LM2/k;->d:LM2/v;

    .line 1299
    .line 1300
    iget-object v6, v2, LM2/u;->o:Ljava/lang/Object;

    .line 1301
    .line 1302
    check-cast v6, LM2/h;

    .line 1303
    .line 1304
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1305
    .line 1306
    .line 1307
    iget-object v5, v5, LM2/v;->a:LM2/s;

    .line 1308
    .line 1309
    iget-object v5, v5, LM2/s;->l:[LM2/t;

    .line 1310
    .line 1311
    if-nez v5, :cond_36

    .line 1312
    .line 1313
    const/4 v5, 0x0

    .line 1314
    goto :goto_31

    .line 1315
    :cond_36
    iget v6, v6, LM2/h;->a:I

    .line 1316
    .line 1317
    aget-object v5, v5, v6

    .line 1318
    .line 1319
    :goto_31
    const v6, 0x7361697a

    .line 1320
    .line 1321
    .line 1322
    invoke-virtual {v15, v6}, LR1/b;->q(I)LR1/c;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v6

    .line 1326
    if-eqz v6, :cond_3d

    .line 1327
    .line 1328
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1329
    .line 1330
    .line 1331
    iget-object v6, v6, LR1/c;->c:LQ1/o;

    .line 1332
    .line 1333
    const/16 v13, 0x8

    .line 1334
    .line 1335
    invoke-virtual {v6, v13}, LQ1/o;->G(I)V

    .line 1336
    .line 1337
    .line 1338
    invoke-virtual {v6}, LQ1/o;->h()I

    .line 1339
    .line 1340
    .line 1341
    move-result v7

    .line 1342
    sget-object v8, LM2/g;->a:[B

    .line 1343
    .line 1344
    const/4 v12, 0x1

    .line 1345
    and-int/2addr v7, v12

    .line 1346
    if-ne v7, v12, :cond_37

    .line 1347
    .line 1348
    invoke-virtual {v6, v13}, LQ1/o;->H(I)V

    .line 1349
    .line 1350
    .line 1351
    :cond_37
    invoke-virtual {v6}, LQ1/o;->u()I

    .line 1352
    .line 1353
    .line 1354
    move-result v7

    .line 1355
    invoke-virtual {v6}, LQ1/o;->y()I

    .line 1356
    .line 1357
    .line 1358
    move-result v8

    .line 1359
    iget v9, v2, LM2/u;->d:I

    .line 1360
    .line 1361
    if-gt v8, v9, :cond_3c

    .line 1362
    .line 1363
    iget v9, v5, LM2/t;->d:I

    .line 1364
    .line 1365
    if-nez v7, :cond_3a

    .line 1366
    .line 1367
    iget-object v7, v2, LM2/u;->k:[Z

    .line 1368
    .line 1369
    const/4 v10, 0x0

    .line 1370
    const/4 v11, 0x0

    .line 1371
    :goto_32
    if-ge v10, v8, :cond_39

    .line 1372
    .line 1373
    invoke-virtual {v6}, LQ1/o;->u()I

    .line 1374
    .line 1375
    .line 1376
    move-result v12

    .line 1377
    add-int/2addr v11, v12

    .line 1378
    if-le v12, v9, :cond_38

    .line 1379
    .line 1380
    const/4 v12, 0x1

    .line 1381
    goto :goto_33

    .line 1382
    :cond_38
    const/4 v12, 0x0

    .line 1383
    :goto_33
    aput-boolean v12, v7, v10

    .line 1384
    .line 1385
    const/16 v21, 0x1

    .line 1386
    .line 1387
    add-int/lit8 v10, v10, 0x1

    .line 1388
    .line 1389
    goto :goto_32

    .line 1390
    :cond_39
    const/4 v10, 0x0

    .line 1391
    goto :goto_35

    .line 1392
    :cond_3a
    if-le v7, v9, :cond_3b

    .line 1393
    .line 1394
    const/4 v6, 0x1

    .line 1395
    goto :goto_34

    .line 1396
    :cond_3b
    const/4 v6, 0x0

    .line 1397
    :goto_34
    mul-int v11, v7, v8

    .line 1398
    .line 1399
    iget-object v7, v2, LM2/u;->k:[Z

    .line 1400
    .line 1401
    const/4 v10, 0x0

    .line 1402
    invoke-static {v7, v10, v8, v6}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 1403
    .line 1404
    .line 1405
    :goto_35
    iget-object v6, v2, LM2/u;->k:[Z

    .line 1406
    .line 1407
    iget v7, v2, LM2/u;->d:I

    .line 1408
    .line 1409
    invoke-static {v6, v8, v7, v10}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 1410
    .line 1411
    .line 1412
    if-lez v11, :cond_3d

    .line 1413
    .line 1414
    iget-object v6, v2, LM2/u;->q:Ljava/lang/Object;

    .line 1415
    .line 1416
    check-cast v6, LQ1/o;

    .line 1417
    .line 1418
    invoke-virtual {v6, v11}, LQ1/o;->D(I)V

    .line 1419
    .line 1420
    .line 1421
    const/4 v12, 0x1

    .line 1422
    iput-boolean v12, v2, LM2/u;->j:Z

    .line 1423
    .line 1424
    iput-boolean v12, v2, LM2/u;->l:Z

    .line 1425
    .line 1426
    goto :goto_36

    .line 1427
    :cond_3c
    const-string v1, "Saiz sample count "

    .line 1428
    .line 1429
    const-string v3, " is greater than fragment sample count"

    .line 1430
    .line 1431
    invoke-static {v8, v1, v3}, Lpd/f;->l(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v1

    .line 1435
    iget v2, v2, LM2/u;->d:I

    .line 1436
    .line 1437
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1438
    .line 1439
    .line 1440
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v1

    .line 1444
    const/4 v4, 0x0

    .line 1445
    invoke-static {v4, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v1

    .line 1449
    throw v1

    .line 1450
    :cond_3d
    :goto_36
    const v6, 0x7361696f

    .line 1451
    .line 1452
    .line 1453
    invoke-virtual {v15, v6}, LR1/b;->q(I)LR1/c;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v6

    .line 1457
    if-eqz v6, :cond_40

    .line 1458
    .line 1459
    iget-object v6, v6, LR1/c;->c:LQ1/o;

    .line 1460
    .line 1461
    const/16 v13, 0x8

    .line 1462
    .line 1463
    invoke-virtual {v6, v13}, LQ1/o;->G(I)V

    .line 1464
    .line 1465
    .line 1466
    invoke-virtual {v6}, LQ1/o;->h()I

    .line 1467
    .line 1468
    .line 1469
    move-result v7

    .line 1470
    sget-object v8, LM2/g;->a:[B

    .line 1471
    .line 1472
    const/4 v12, 0x1

    .line 1473
    and-int/lit8 v8, v7, 0x1

    .line 1474
    .line 1475
    if-ne v8, v12, :cond_3e

    .line 1476
    .line 1477
    invoke-virtual {v6, v13}, LQ1/o;->H(I)V

    .line 1478
    .line 1479
    .line 1480
    :cond_3e
    invoke-virtual {v6}, LQ1/o;->y()I

    .line 1481
    .line 1482
    .line 1483
    move-result v8

    .line 1484
    if-ne v8, v12, :cond_41

    .line 1485
    .line 1486
    invoke-static {v7}, LM2/g;->c(I)I

    .line 1487
    .line 1488
    .line 1489
    move-result v7

    .line 1490
    iget-wide v8, v2, LM2/u;->b:J

    .line 1491
    .line 1492
    if-nez v7, :cond_3f

    .line 1493
    .line 1494
    invoke-virtual {v6}, LQ1/o;->w()J

    .line 1495
    .line 1496
    .line 1497
    move-result-wide v6

    .line 1498
    goto :goto_37

    .line 1499
    :cond_3f
    invoke-virtual {v6}, LQ1/o;->z()J

    .line 1500
    .line 1501
    .line 1502
    move-result-wide v6

    .line 1503
    :goto_37
    add-long/2addr v8, v6

    .line 1504
    iput-wide v8, v2, LM2/u;->b:J

    .line 1505
    .line 1506
    :cond_40
    const/4 v4, 0x0

    .line 1507
    goto :goto_38

    .line 1508
    :cond_41
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1509
    .line 1510
    const-string v2, "Unexpected saio entry count: "

    .line 1511
    .line 1512
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1513
    .line 1514
    .line 1515
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1516
    .line 1517
    .line 1518
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v1

    .line 1522
    const/4 v4, 0x0

    .line 1523
    invoke-static {v4, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v1

    .line 1527
    throw v1

    .line 1528
    :goto_38
    const v6, 0x73656e63

    .line 1529
    .line 1530
    .line 1531
    invoke-virtual {v15, v6}, LR1/b;->q(I)LR1/c;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v6

    .line 1535
    if-eqz v6, :cond_42

    .line 1536
    .line 1537
    iget-object v6, v6, LR1/c;->c:LQ1/o;

    .line 1538
    .line 1539
    const/4 v10, 0x0

    .line 1540
    invoke-static {v6, v10, v2}, LM2/l;->c(LQ1/o;ILM2/u;)V

    .line 1541
    .line 1542
    .line 1543
    :cond_42
    if-eqz v5, :cond_43

    .line 1544
    .line 1545
    iget-object v5, v5, LM2/t;->b:Ljava/lang/String;

    .line 1546
    .line 1547
    move-object v8, v5

    .line 1548
    goto :goto_39

    .line 1549
    :cond_43
    move-object v8, v4

    .line 1550
    :goto_39
    move-object v6, v4

    .line 1551
    move-object v7, v6

    .line 1552
    const/4 v5, 0x0

    .line 1553
    :goto_3a
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 1554
    .line 1555
    .line 1556
    move-result v9

    .line 1557
    if-ge v5, v9, :cond_46

    .line 1558
    .line 1559
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v9

    .line 1563
    check-cast v9, LR1/c;

    .line 1564
    .line 1565
    iget-object v10, v9, LR1/c;->c:LQ1/o;

    .line 1566
    .line 1567
    const v11, 0x73626770

    .line 1568
    .line 1569
    .line 1570
    const v12, 0x73656967

    .line 1571
    .line 1572
    .line 1573
    iget v9, v9, LH5/a;->b:I

    .line 1574
    .line 1575
    if-ne v9, v11, :cond_45

    .line 1576
    .line 1577
    const/16 v14, 0xc

    .line 1578
    .line 1579
    invoke-virtual {v10, v14}, LQ1/o;->G(I)V

    .line 1580
    .line 1581
    .line 1582
    invoke-virtual {v10}, LQ1/o;->h()I

    .line 1583
    .line 1584
    .line 1585
    move-result v9

    .line 1586
    if-ne v9, v12, :cond_44

    .line 1587
    .line 1588
    move-object v6, v10

    .line 1589
    :cond_44
    :goto_3b
    const/4 v12, 0x1

    .line 1590
    goto :goto_3c

    .line 1591
    :cond_45
    const/16 v14, 0xc

    .line 1592
    .line 1593
    const v11, 0x73677064

    .line 1594
    .line 1595
    .line 1596
    if-ne v9, v11, :cond_44

    .line 1597
    .line 1598
    invoke-virtual {v10, v14}, LQ1/o;->G(I)V

    .line 1599
    .line 1600
    .line 1601
    invoke-virtual {v10}, LQ1/o;->h()I

    .line 1602
    .line 1603
    .line 1604
    move-result v9

    .line 1605
    if-ne v9, v12, :cond_44

    .line 1606
    .line 1607
    move-object v7, v10

    .line 1608
    goto :goto_3b

    .line 1609
    :goto_3c
    add-int/2addr v5, v12

    .line 1610
    goto :goto_3a

    .line 1611
    :cond_46
    const/4 v12, 0x1

    .line 1612
    const/16 v14, 0xc

    .line 1613
    .line 1614
    if-eqz v6, :cond_47

    .line 1615
    .line 1616
    if-nez v7, :cond_48

    .line 1617
    .line 1618
    :cond_47
    move/from16 v15, v19

    .line 1619
    .line 1620
    const/16 v17, 0x2

    .line 1621
    .line 1622
    goto/16 :goto_41

    .line 1623
    .line 1624
    :cond_48
    const/16 v13, 0x8

    .line 1625
    .line 1626
    invoke-virtual {v6, v13}, LQ1/o;->G(I)V

    .line 1627
    .line 1628
    .line 1629
    invoke-virtual {v6}, LQ1/o;->h()I

    .line 1630
    .line 1631
    .line 1632
    move-result v5

    .line 1633
    invoke-static {v5}, LM2/g;->c(I)I

    .line 1634
    .line 1635
    .line 1636
    move-result v5

    .line 1637
    move/from16 v15, v19

    .line 1638
    .line 1639
    invoke-virtual {v6, v15}, LQ1/o;->H(I)V

    .line 1640
    .line 1641
    .line 1642
    if-ne v5, v12, :cond_49

    .line 1643
    .line 1644
    invoke-virtual {v6, v15}, LQ1/o;->H(I)V

    .line 1645
    .line 1646
    .line 1647
    :cond_49
    invoke-virtual {v6}, LQ1/o;->h()I

    .line 1648
    .line 1649
    .line 1650
    move-result v5

    .line 1651
    if-ne v5, v12, :cond_51

    .line 1652
    .line 1653
    invoke-virtual {v7, v13}, LQ1/o;->G(I)V

    .line 1654
    .line 1655
    .line 1656
    invoke-virtual {v7}, LQ1/o;->h()I

    .line 1657
    .line 1658
    .line 1659
    move-result v5

    .line 1660
    invoke-static {v5}, LM2/g;->c(I)I

    .line 1661
    .line 1662
    .line 1663
    move-result v5

    .line 1664
    invoke-virtual {v7, v15}, LQ1/o;->H(I)V

    .line 1665
    .line 1666
    .line 1667
    if-ne v5, v12, :cond_4b

    .line 1668
    .line 1669
    invoke-virtual {v7}, LQ1/o;->w()J

    .line 1670
    .line 1671
    .line 1672
    move-result-wide v5

    .line 1673
    cmp-long v5, v5, v28

    .line 1674
    .line 1675
    if-eqz v5, :cond_4a

    .line 1676
    .line 1677
    const/4 v6, 0x2

    .line 1678
    goto :goto_3d

    .line 1679
    :cond_4a
    const-string v1, "Variable length description in sgpd found (unsupported)"

    .line 1680
    .line 1681
    invoke-static {v1}, LN1/D;->c(Ljava/lang/String;)LN1/D;

    .line 1682
    .line 1683
    .line 1684
    move-result-object v1

    .line 1685
    throw v1

    .line 1686
    :cond_4b
    const/4 v6, 0x2

    .line 1687
    if-lt v5, v6, :cond_4c

    .line 1688
    .line 1689
    invoke-virtual {v7, v15}, LQ1/o;->H(I)V

    .line 1690
    .line 1691
    .line 1692
    :cond_4c
    :goto_3d
    invoke-virtual {v7}, LQ1/o;->w()J

    .line 1693
    .line 1694
    .line 1695
    move-result-wide v9

    .line 1696
    const-wide/16 v11, 0x1

    .line 1697
    .line 1698
    cmp-long v5, v9, v11

    .line 1699
    .line 1700
    if-nez v5, :cond_50

    .line 1701
    .line 1702
    const/4 v12, 0x1

    .line 1703
    invoke-virtual {v7, v12}, LQ1/o;->H(I)V

    .line 1704
    .line 1705
    .line 1706
    invoke-virtual {v7}, LQ1/o;->u()I

    .line 1707
    .line 1708
    .line 1709
    move-result v5

    .line 1710
    and-int/lit16 v9, v5, 0xf0

    .line 1711
    .line 1712
    shr-int/lit8 v11, v9, 0x4

    .line 1713
    .line 1714
    and-int/lit8 v5, v5, 0xf

    .line 1715
    .line 1716
    invoke-virtual {v7}, LQ1/o;->u()I

    .line 1717
    .line 1718
    .line 1719
    move-result v9

    .line 1720
    if-ne v9, v12, :cond_4d

    .line 1721
    .line 1722
    const/4 v9, 0x1

    .line 1723
    goto :goto_3e

    .line 1724
    :cond_4d
    const/4 v9, 0x0

    .line 1725
    :goto_3e
    if-nez v9, :cond_4e

    .line 1726
    .line 1727
    move/from16 v17, v6

    .line 1728
    .line 1729
    goto :goto_41

    .line 1730
    :cond_4e
    move v10, v9

    .line 1731
    invoke-virtual {v7}, LQ1/o;->u()I

    .line 1732
    .line 1733
    .line 1734
    move-result v9

    .line 1735
    move v13, v10

    .line 1736
    move/from16 v12, v18

    .line 1737
    .line 1738
    new-array v10, v12, [B

    .line 1739
    .line 1740
    const/4 v4, 0x0

    .line 1741
    invoke-virtual {v7, v4, v12, v10}, LQ1/o;->f(II[B)V

    .line 1742
    .line 1743
    .line 1744
    if-nez v9, :cond_4f

    .line 1745
    .line 1746
    invoke-virtual {v7}, LQ1/o;->u()I

    .line 1747
    .line 1748
    .line 1749
    move-result v12

    .line 1750
    new-array v6, v12, [B

    .line 1751
    .line 1752
    invoke-virtual {v7, v4, v12, v6}, LQ1/o;->f(II[B)V

    .line 1753
    .line 1754
    .line 1755
    move-object v7, v6

    .line 1756
    :goto_3f
    const/4 v12, 0x1

    .line 1757
    goto :goto_40

    .line 1758
    :cond_4f
    const/4 v7, 0x0

    .line 1759
    goto :goto_3f

    .line 1760
    :goto_40
    iput-boolean v12, v2, LM2/u;->j:Z

    .line 1761
    .line 1762
    new-instance v6, LM2/t;

    .line 1763
    .line 1764
    move v12, v13

    .line 1765
    move-object v13, v7

    .line 1766
    move v7, v12

    .line 1767
    move v12, v5

    .line 1768
    const/16 v17, 0x2

    .line 1769
    .line 1770
    invoke-direct/range {v6 .. v13}, LM2/t;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 1771
    .line 1772
    .line 1773
    iput-object v6, v2, LM2/u;->p:Ljava/lang/Object;

    .line 1774
    .line 1775
    goto :goto_41

    .line 1776
    :cond_50
    const-string v1, "Entry count in sgpd != 1 (unsupported)."

    .line 1777
    .line 1778
    invoke-static {v1}, LN1/D;->c(Ljava/lang/String;)LN1/D;

    .line 1779
    .line 1780
    .line 1781
    move-result-object v1

    .line 1782
    throw v1

    .line 1783
    :cond_51
    const-string v1, "Entry count in sbgp != 1 (unsupported)."

    .line 1784
    .line 1785
    invoke-static {v1}, LN1/D;->c(Ljava/lang/String;)LN1/D;

    .line 1786
    .line 1787
    .line 1788
    move-result-object v1

    .line 1789
    throw v1

    .line 1790
    :goto_41
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 1791
    .line 1792
    .line 1793
    move-result v4

    .line 1794
    const/4 v10, 0x0

    .line 1795
    :goto_42
    if-ge v10, v4, :cond_54

    .line 1796
    .line 1797
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1798
    .line 1799
    .line 1800
    move-result-object v5

    .line 1801
    check-cast v5, LR1/c;

    .line 1802
    .line 1803
    iget v6, v5, LH5/a;->b:I

    .line 1804
    .line 1805
    const v7, 0x75756964

    .line 1806
    .line 1807
    .line 1808
    if-ne v6, v7, :cond_53

    .line 1809
    .line 1810
    iget-object v5, v5, LR1/c;->c:LQ1/o;

    .line 1811
    .line 1812
    const/16 v13, 0x8

    .line 1813
    .line 1814
    invoke-virtual {v5, v13}, LQ1/o;->G(I)V

    .line 1815
    .line 1816
    .line 1817
    iget-object v6, v0, LM2/l;->i:[B

    .line 1818
    .line 1819
    const/4 v7, 0x0

    .line 1820
    const/16 v12, 0x10

    .line 1821
    .line 1822
    invoke-virtual {v5, v7, v12, v6}, LQ1/o;->f(II[B)V

    .line 1823
    .line 1824
    .line 1825
    sget-object v7, LM2/l;->M:[B

    .line 1826
    .line 1827
    invoke-static {v6, v7}, Ljava/util/Arrays;->equals([B[B)Z

    .line 1828
    .line 1829
    .line 1830
    move-result v6

    .line 1831
    if-nez v6, :cond_52

    .line 1832
    .line 1833
    goto :goto_43

    .line 1834
    :cond_52
    invoke-static {v5, v12, v2}, LM2/l;->c(LQ1/o;ILM2/u;)V

    .line 1835
    .line 1836
    .line 1837
    :goto_43
    const/16 v21, 0x1

    .line 1838
    .line 1839
    goto :goto_44

    .line 1840
    :cond_53
    const/16 v12, 0x10

    .line 1841
    .line 1842
    const/16 v13, 0x8

    .line 1843
    .line 1844
    goto :goto_43

    .line 1845
    :goto_44
    add-int/lit8 v10, v10, 0x1

    .line 1846
    .line 1847
    goto :goto_42

    .line 1848
    :cond_54
    const/16 v12, 0x10

    .line 1849
    .line 1850
    goto/16 :goto_18

    .line 1851
    .line 1852
    :cond_55
    move/from16 v26, v2

    .line 1853
    .line 1854
    move-object/from16 v27, v5

    .line 1855
    .line 1856
    move/from16 v33, v6

    .line 1857
    .line 1858
    move/from16 v46, v10

    .line 1859
    .line 1860
    move-object/from16 v48, v11

    .line 1861
    .line 1862
    move/from16 v49, v12

    .line 1863
    .line 1864
    move/from16 v12, v18

    .line 1865
    .line 1866
    move/from16 v15, v19

    .line 1867
    .line 1868
    const/16 v13, 0x8

    .line 1869
    .line 1870
    const/16 v14, 0xc

    .line 1871
    .line 1872
    const/16 v21, 0x1

    .line 1873
    .line 1874
    const-wide v23, -0x7fffffffffffffffL    # -4.9E-324

    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    :goto_45
    add-int/lit8 v10, v46, 0x1

    .line 1880
    .line 1881
    move/from16 v18, v12

    .line 1882
    .line 1883
    move/from16 v19, v15

    .line 1884
    .line 1885
    move/from16 v2, v26

    .line 1886
    .line 1887
    move-object/from16 v5, v27

    .line 1888
    .line 1889
    move/from16 v6, v33

    .line 1890
    .line 1891
    move-object/from16 v11, v48

    .line 1892
    .line 1893
    move/from16 v12, v49

    .line 1894
    .line 1895
    goto/16 :goto_e

    .line 1896
    .line 1897
    :cond_56
    move-object/from16 v48, v11

    .line 1898
    .line 1899
    move/from16 v12, v18

    .line 1900
    .line 1901
    move/from16 v15, v19

    .line 1902
    .line 1903
    const/16 v13, 0x8

    .line 1904
    .line 1905
    const-wide v23, -0x7fffffffffffffffL    # -4.9E-324

    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    invoke-static/range {v48 .. v48}, LM2/l;->b(Ljava/util/ArrayList;)LN1/j;

    .line 1911
    .line 1912
    .line 1913
    move-result-object v2

    .line 1914
    if-eqz v2, :cond_59

    .line 1915
    .line 1916
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 1917
    .line 1918
    .line 1919
    move-result v3

    .line 1920
    const/4 v10, 0x0

    .line 1921
    :goto_46
    if-ge v10, v3, :cond_59

    .line 1922
    .line 1923
    invoke-virtual {v1, v10}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1924
    .line 1925
    .line 1926
    move-result-object v4

    .line 1927
    check-cast v4, LM2/k;

    .line 1928
    .line 1929
    iget-object v5, v4, LM2/k;->d:LM2/v;

    .line 1930
    .line 1931
    iget-object v6, v4, LM2/k;->b:LM2/u;

    .line 1932
    .line 1933
    iget-object v6, v6, LM2/u;->o:Ljava/lang/Object;

    .line 1934
    .line 1935
    check-cast v6, LM2/h;

    .line 1936
    .line 1937
    sget v7, LQ1/x;->a:I

    .line 1938
    .line 1939
    iget v6, v6, LM2/h;->a:I

    .line 1940
    .line 1941
    iget-object v5, v5, LM2/v;->a:LM2/s;

    .line 1942
    .line 1943
    iget-object v5, v5, LM2/s;->l:[LM2/t;

    .line 1944
    .line 1945
    if-nez v5, :cond_57

    .line 1946
    .line 1947
    const/4 v5, 0x0

    .line 1948
    goto :goto_47

    .line 1949
    :cond_57
    aget-object v5, v5, v6

    .line 1950
    .line 1951
    :goto_47
    if-eqz v5, :cond_58

    .line 1952
    .line 1953
    iget-object v5, v5, LM2/t;->b:Ljava/lang/String;

    .line 1954
    .line 1955
    goto :goto_48

    .line 1956
    :cond_58
    const/4 v5, 0x0

    .line 1957
    :goto_48
    invoke-virtual {v2, v5}, LN1/j;->c(Ljava/lang/String;)LN1/j;

    .line 1958
    .line 1959
    .line 1960
    move-result-object v5

    .line 1961
    iget-object v6, v4, LM2/k;->d:LM2/v;

    .line 1962
    .line 1963
    iget-object v6, v6, LM2/v;->a:LM2/s;

    .line 1964
    .line 1965
    iget-object v6, v6, LM2/s;->g:LN1/n;

    .line 1966
    .line 1967
    invoke-virtual {v6}, LN1/n;->a()LN1/m;

    .line 1968
    .line 1969
    .line 1970
    move-result-object v6

    .line 1971
    iput-object v5, v6, LN1/m;->q:LN1/j;

    .line 1972
    .line 1973
    new-instance v5, LN1/n;

    .line 1974
    .line 1975
    invoke-direct {v5, v6}, LN1/n;-><init>(LN1/m;)V

    .line 1976
    .line 1977
    .line 1978
    iget-object v4, v4, LM2/k;->a:Ls2/C;

    .line 1979
    .line 1980
    invoke-interface {v4, v5}, Ls2/C;->c(LN1/n;)V

    .line 1981
    .line 1982
    .line 1983
    const/16 v21, 0x1

    .line 1984
    .line 1985
    add-int/lit8 v10, v10, 0x1

    .line 1986
    .line 1987
    goto :goto_46

    .line 1988
    :cond_59
    iget-wide v2, v0, LM2/l;->z:J

    .line 1989
    .line 1990
    cmp-long v2, v2, v23

    .line 1991
    .line 1992
    if-eqz v2, :cond_d

    .line 1993
    .line 1994
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 1995
    .line 1996
    .line 1997
    move-result v2

    .line 1998
    const/4 v8, 0x0

    .line 1999
    :goto_49
    if-ge v8, v2, :cond_5c

    .line 2000
    .line 2001
    invoke-virtual {v1, v8}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 2002
    .line 2003
    .line 2004
    move-result-object v3

    .line 2005
    check-cast v3, LM2/k;

    .line 2006
    .line 2007
    iget-wide v4, v0, LM2/l;->z:J

    .line 2008
    .line 2009
    iget v6, v3, LM2/k;->f:I

    .line 2010
    .line 2011
    :goto_4a
    iget-object v7, v3, LM2/k;->b:LM2/u;

    .line 2012
    .line 2013
    iget v9, v7, LM2/u;->d:I

    .line 2014
    .line 2015
    if-ge v6, v9, :cond_5b

    .line 2016
    .line 2017
    iget-object v9, v7, LM2/u;->h:[J

    .line 2018
    .line 2019
    aget-wide v10, v9, v6

    .line 2020
    .line 2021
    cmp-long v9, v10, v4

    .line 2022
    .line 2023
    if-gtz v9, :cond_5b

    .line 2024
    .line 2025
    iget-object v7, v7, LM2/u;->i:[Z

    .line 2026
    .line 2027
    aget-boolean v7, v7, v6

    .line 2028
    .line 2029
    if-eqz v7, :cond_5a

    .line 2030
    .line 2031
    iput v6, v3, LM2/k;->i:I

    .line 2032
    .line 2033
    :cond_5a
    const/16 v21, 0x1

    .line 2034
    .line 2035
    add-int/lit8 v6, v6, 0x1

    .line 2036
    .line 2037
    goto :goto_4a

    .line 2038
    :cond_5b
    const/16 v21, 0x1

    .line 2039
    .line 2040
    add-int/lit8 v8, v8, 0x1

    .line 2041
    .line 2042
    goto :goto_49

    .line 2043
    :cond_5c
    move-wide/from16 v3, v23

    .line 2044
    .line 2045
    const/16 v21, 0x1

    .line 2046
    .line 2047
    iput-wide v3, v0, LM2/l;->z:J

    .line 2048
    .line 2049
    goto/16 :goto_0

    .line 2050
    .line 2051
    :cond_5d
    move/from16 v12, v18

    .line 2052
    .line 2053
    move/from16 v15, v19

    .line 2054
    .line 2055
    const/16 v13, 0x8

    .line 2056
    .line 2057
    const/16 v21, 0x1

    .line 2058
    .line 2059
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 2060
    .line 2061
    .line 2062
    move-result v1

    .line 2063
    if-nez v1, :cond_0

    .line 2064
    .line 2065
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 2066
    .line 2067
    .line 2068
    move-result-object v1

    .line 2069
    check-cast v1, LR1/b;

    .line 2070
    .line 2071
    iget-object v1, v1, LR1/b;->e:Ljava/util/ArrayList;

    .line 2072
    .line 2073
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2074
    .line 2075
    .line 2076
    goto/16 :goto_0

    .line 2077
    .line 2078
    :cond_5e
    const/4 v10, 0x0

    .line 2079
    iput v10, v0, LM2/l;->s:I

    .line 2080
    .line 2081
    iput v10, v0, LM2/l;->v:I

    .line 2082
    .line 2083
    return-void
.end method

.method public final g(Ls2/o;)V
    .locals 11

    .line 1
    iget v0, p0, LM2/l;->b:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x20

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    new-instance v1, LDd/c;

    .line 8
    .line 9
    iget-object v2, p0, LM2/l;->a:LP2/j;

    .line 10
    .line 11
    invoke-direct {v1, p1, v2}, LDd/c;-><init>(Ls2/o;LP2/j;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v1

    .line 15
    :cond_0
    iput-object p1, p0, LM2/l;->I:Ls2/o;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput v1, p0, LM2/l;->s:I

    .line 19
    .line 20
    iput v1, p0, LM2/l;->v:I

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    new-array v2, v2, [Ls2/C;

    .line 24
    .line 25
    iput-object v2, p0, LM2/l;->J:[Ls2/C;

    .line 26
    .line 27
    iget-object v3, p0, LM2/l;->q:LX1/l;

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    aput-object v3, v2, v1

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v3, v1

    .line 36
    :goto_0
    and-int/lit8 v0, v0, 0x4

    .line 37
    .line 38
    const/16 v4, 0x64

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    add-int/lit8 v0, v3, 0x1

    .line 43
    .line 44
    const/4 v5, 0x5

    .line 45
    invoke-interface {p1, v4, v5}, Ls2/o;->m(II)Ls2/C;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    aput-object p1, v2, v3

    .line 50
    .line 51
    const/16 v4, 0x65

    .line 52
    .line 53
    move v3, v0

    .line 54
    :cond_2
    iget-object p1, p0, LM2/l;->J:[Ls2/C;

    .line 55
    .line 56
    invoke-static {v3, p1}, LQ1/x;->M(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, [Ls2/C;

    .line 61
    .line 62
    iput-object p1, p0, LM2/l;->J:[Ls2/C;

    .line 63
    .line 64
    array-length v0, p1

    .line 65
    move v2, v1

    .line 66
    :goto_1
    if-ge v2, v0, :cond_3

    .line 67
    .line 68
    aget-object v3, p1, v2

    .line 69
    .line 70
    sget-object v5, LM2/l;->N:LN1/n;

    .line 71
    .line 72
    invoke-interface {v3, v5}, Ls2/C;->c(LN1/n;)V

    .line 73
    .line 74
    .line 75
    add-int/lit8 v2, v2, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    iget-object p1, p0, LM2/l;->d:Ljava/util/List;

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    new-array v0, v0, [Ls2/C;

    .line 85
    .line 86
    iput-object v0, p0, LM2/l;->K:[Ls2/C;

    .line 87
    .line 88
    move v0, v1

    .line 89
    :goto_2
    iget-object v2, p0, LM2/l;->K:[Ls2/C;

    .line 90
    .line 91
    array-length v2, v2

    .line 92
    if-ge v0, v2, :cond_4

    .line 93
    .line 94
    iget-object v2, p0, LM2/l;->I:Ls2/o;

    .line 95
    .line 96
    add-int/lit8 v3, v4, 0x1

    .line 97
    .line 98
    const/4 v5, 0x3

    .line 99
    invoke-interface {v2, v4, v5}, Ls2/o;->m(II)Ls2/C;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    check-cast v4, LN1/n;

    .line 108
    .line 109
    invoke-interface {v2, v4}, Ls2/C;->c(LN1/n;)V

    .line 110
    .line 111
    .line 112
    iget-object v4, p0, LM2/l;->K:[Ls2/C;

    .line 113
    .line 114
    aput-object v2, v4, v0

    .line 115
    .line 116
    add-int/lit8 v0, v0, 0x1

    .line 117
    .line 118
    move v4, v3

    .line 119
    goto :goto_2

    .line 120
    :cond_4
    iget-object p1, p0, LM2/l;->c:LM2/s;

    .line 121
    .line 122
    if-eqz p1, :cond_5

    .line 123
    .line 124
    new-instance v0, LM2/k;

    .line 125
    .line 126
    iget-object v2, p0, LM2/l;->I:Ls2/o;

    .line 127
    .line 128
    iget p1, p1, LM2/s;->b:I

    .line 129
    .line 130
    invoke-interface {v2, v1, p1}, Ls2/o;->m(II)Ls2/C;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    new-instance v2, LM2/v;

    .line 135
    .line 136
    new-array v4, v1, [J

    .line 137
    .line 138
    new-array v5, v1, [I

    .line 139
    .line 140
    new-array v7, v1, [J

    .line 141
    .line 142
    new-array v8, v1, [I

    .line 143
    .line 144
    iget-object v3, p0, LM2/l;->c:LM2/s;

    .line 145
    .line 146
    const/4 v6, 0x0

    .line 147
    const-wide/16 v9, 0x0

    .line 148
    .line 149
    invoke-direct/range {v2 .. v10}, LM2/v;-><init>(LM2/s;[J[II[J[IJ)V

    .line 150
    .line 151
    .line 152
    new-instance v3, LM2/h;

    .line 153
    .line 154
    invoke-direct {v3, v1, v1, v1, v1}, LM2/h;-><init>(IIII)V

    .line 155
    .line 156
    .line 157
    invoke-direct {v0, p1, v2, v3}, LM2/k;-><init>(Ls2/C;LM2/v;LM2/h;)V

    .line 158
    .line 159
    .line 160
    iget-object p1, p0, LM2/l;->e:Landroid/util/SparseArray;

    .line 161
    .line 162
    invoke-virtual {p1, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    iget-object p1, p0, LM2/l;->I:Ls2/o;

    .line 166
    .line 167
    invoke-interface {p1}, Ls2/o;->l()V

    .line 168
    .line 169
    .line 170
    :cond_5
    return-void
.end method

.method public final h()Ls2/m;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final i(Ls2/n;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p1, v0, v1}, LM2/r;->k(Ls2/n;ZZ)Ls2/A;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v2, Ll8/K;->b:Ll8/I;

    .line 15
    .line 16
    sget-object v2, Ll8/e0;->e:Ll8/e0;

    .line 17
    .line 18
    :goto_0
    iput-object v2, p0, LM2/l;->r:Ll8/e0;

    .line 19
    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    return v0

    .line 23
    :cond_1
    return v1
.end method

.method public final j()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LM2/l;->r:Ll8/e0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k(Ls2/n;LJ5/n;)I
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    :goto_0
    const/4 v2, 0x1

    .line 6
    :goto_1
    iget v3, v0, LM2/l;->s:I

    .line 7
    .line 8
    iget-object v4, v0, LM2/l;->n:Ljava/util/ArrayDeque;

    .line 9
    .line 10
    iget-object v5, v0, LM2/l;->e:Landroid/util/SparseArray;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    iget-object v9, v0, LM2/l;->p:LR1/q;

    .line 14
    .line 15
    const/4 v13, 0x2

    .line 16
    if-eqz v3, :cond_47

    .line 17
    .line 18
    iget-object v14, v0, LM2/l;->o:Ljava/util/ArrayDeque;

    .line 19
    .line 20
    iget-object v15, v0, LM2/l;->k:LQ1/u;

    .line 21
    .line 22
    const-string v8, "FragmentedMp4Extractor"

    .line 23
    .line 24
    if-eq v3, v2, :cond_36

    .line 25
    .line 26
    const-wide v16, 0x7fffffffffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    if-eq v3, v13, :cond_31

    .line 32
    .line 33
    iget-object v3, v0, LM2/l;->C:LM2/k;

    .line 34
    .line 35
    if-nez v3, :cond_9

    .line 36
    .line 37
    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    move v10, v6

    .line 42
    move/from16 v18, v13

    .line 43
    .line 44
    const/4 v13, 0x0

    .line 45
    :goto_2
    if-ge v10, v3, :cond_4

    .line 46
    .line 47
    invoke-virtual {v5, v10}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v20

    .line 51
    move-object/from16 v7, v20

    .line 52
    .line 53
    check-cast v7, LM2/k;

    .line 54
    .line 55
    const/16 v20, 0x8

    .line 56
    .line 57
    iget-boolean v11, v7, LM2/k;->l:Z

    .line 58
    .line 59
    move/from16 v22, v2

    .line 60
    .line 61
    if-nez v11, :cond_0

    .line 62
    .line 63
    iget v2, v7, LM2/k;->f:I

    .line 64
    .line 65
    iget-object v4, v7, LM2/k;->d:LM2/v;

    .line 66
    .line 67
    iget v4, v4, LM2/v;->b:I

    .line 68
    .line 69
    if-eq v2, v4, :cond_3

    .line 70
    .line 71
    :cond_0
    iget-object v2, v7, LM2/k;->b:LM2/u;

    .line 72
    .line 73
    if-eqz v11, :cond_1

    .line 74
    .line 75
    iget v4, v7, LM2/k;->h:I

    .line 76
    .line 77
    iget v12, v2, LM2/u;->c:I

    .line 78
    .line 79
    if-ne v4, v12, :cond_1

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_1
    if-nez v11, :cond_2

    .line 83
    .line 84
    iget-object v2, v7, LM2/k;->d:LM2/v;

    .line 85
    .line 86
    iget-object v2, v2, LM2/v;->c:[J

    .line 87
    .line 88
    iget v4, v7, LM2/k;->f:I

    .line 89
    .line 90
    aget-wide v11, v2, v4

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_2
    iget-object v2, v2, LM2/u;->e:[J

    .line 94
    .line 95
    iget v4, v7, LM2/k;->h:I

    .line 96
    .line 97
    aget-wide v11, v2, v4

    .line 98
    .line 99
    :goto_3
    cmp-long v2, v11, v16

    .line 100
    .line 101
    if-gez v2, :cond_3

    .line 102
    .line 103
    move-object v13, v7

    .line 104
    move-wide/from16 v16, v11

    .line 105
    .line 106
    :cond_3
    :goto_4
    add-int/lit8 v10, v10, 0x1

    .line 107
    .line 108
    move/from16 v2, v22

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_4
    move/from16 v22, v2

    .line 112
    .line 113
    const/16 v20, 0x8

    .line 114
    .line 115
    if-nez v13, :cond_6

    .line 116
    .line 117
    iget-wide v2, v0, LM2/l;->x:J

    .line 118
    .line 119
    move-object v4, v1

    .line 120
    check-cast v4, Ls2/j;

    .line 121
    .line 122
    iget-wide v4, v4, Ls2/j;->d:J

    .line 123
    .line 124
    sub-long/2addr v2, v4

    .line 125
    long-to-int v2, v2

    .line 126
    if-ltz v2, :cond_5

    .line 127
    .line 128
    move-object v3, v1

    .line 129
    check-cast v3, Ls2/j;

    .line 130
    .line 131
    invoke-virtual {v3, v2}, Ls2/j;->j(I)V

    .line 132
    .line 133
    .line 134
    iput v6, v0, LM2/l;->s:I

    .line 135
    .line 136
    iput v6, v0, LM2/l;->v:I

    .line 137
    .line 138
    move/from16 v2, v22

    .line 139
    .line 140
    goto/16 :goto_1

    .line 141
    .line 142
    :cond_5
    const-string v1, "Offset to end of mdat was negative."

    .line 143
    .line 144
    const/4 v2, 0x0

    .line 145
    invoke-static {v2, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    throw v1

    .line 150
    :cond_6
    iget-boolean v2, v13, LM2/k;->l:Z

    .line 151
    .line 152
    if-nez v2, :cond_7

    .line 153
    .line 154
    iget-object v2, v13, LM2/k;->d:LM2/v;

    .line 155
    .line 156
    iget-object v2, v2, LM2/v;->c:[J

    .line 157
    .line 158
    iget v3, v13, LM2/k;->f:I

    .line 159
    .line 160
    aget-wide v3, v2, v3

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_7
    iget-object v2, v13, LM2/k;->b:LM2/u;

    .line 164
    .line 165
    iget-object v2, v2, LM2/u;->e:[J

    .line 166
    .line 167
    iget v3, v13, LM2/k;->h:I

    .line 168
    .line 169
    aget-wide v3, v2, v3

    .line 170
    .line 171
    :goto_5
    move-object v2, v1

    .line 172
    check-cast v2, Ls2/j;

    .line 173
    .line 174
    iget-wide v10, v2, Ls2/j;->d:J

    .line 175
    .line 176
    sub-long/2addr v3, v10

    .line 177
    long-to-int v2, v3

    .line 178
    if-gez v2, :cond_8

    .line 179
    .line 180
    const-string v2, "Ignoring negative offset to sample data."

    .line 181
    .line 182
    invoke-static {v8, v2}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    move v2, v6

    .line 186
    :cond_8
    move-object v3, v1

    .line 187
    check-cast v3, Ls2/j;

    .line 188
    .line 189
    invoke-virtual {v3, v2}, Ls2/j;->j(I)V

    .line 190
    .line 191
    .line 192
    iput-object v13, v0, LM2/l;->C:LM2/k;

    .line 193
    .line 194
    move-object v3, v13

    .line 195
    goto :goto_6

    .line 196
    :cond_9
    move/from16 v22, v2

    .line 197
    .line 198
    move/from16 v18, v13

    .line 199
    .line 200
    const/16 v20, 0x8

    .line 201
    .line 202
    :goto_6
    iget v2, v0, LM2/l;->s:I

    .line 203
    .line 204
    const/4 v4, 0x6

    .line 205
    iget v5, v0, LM2/l;->b:I

    .line 206
    .line 207
    const-string v7, "video/avc"

    .line 208
    .line 209
    iget-object v8, v3, LM2/k;->b:LM2/u;

    .line 210
    .line 211
    const/4 v10, 0x3

    .line 212
    if-ne v2, v10, :cond_14

    .line 213
    .line 214
    iget-boolean v2, v3, LM2/k;->l:Z

    .line 215
    .line 216
    if-nez v2, :cond_a

    .line 217
    .line 218
    iget-object v2, v3, LM2/k;->d:LM2/v;

    .line 219
    .line 220
    iget-object v2, v2, LM2/v;->d:[I

    .line 221
    .line 222
    iget v10, v3, LM2/k;->f:I

    .line 223
    .line 224
    aget v2, v2, v10

    .line 225
    .line 226
    goto :goto_7

    .line 227
    :cond_a
    iget-object v2, v8, LM2/u;->g:[I

    .line 228
    .line 229
    iget v10, v3, LM2/k;->f:I

    .line 230
    .line 231
    aget v2, v2, v10

    .line 232
    .line 233
    :goto_7
    iput v2, v0, LM2/l;->D:I

    .line 234
    .line 235
    and-int/lit8 v2, v5, 0x40

    .line 236
    .line 237
    if-eqz v2, :cond_c

    .line 238
    .line 239
    iget-object v2, v3, LM2/k;->d:LM2/v;

    .line 240
    .line 241
    iget-object v2, v2, LM2/v;->a:LM2/s;

    .line 242
    .line 243
    iget-object v2, v2, LM2/s;->g:LN1/n;

    .line 244
    .line 245
    iget-object v2, v2, LN1/n;->n:Ljava/lang/String;

    .line 246
    .line 247
    invoke-static {v2, v7}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    if-nez v2, :cond_b

    .line 252
    .line 253
    goto :goto_8

    .line 254
    :cond_b
    move v2, v6

    .line 255
    goto :goto_9

    .line 256
    :cond_c
    :goto_8
    move/from16 v2, v22

    .line 257
    .line 258
    :goto_9
    iput-boolean v2, v0, LM2/l;->G:Z

    .line 259
    .line 260
    iget v2, v3, LM2/k;->f:I

    .line 261
    .line 262
    iget v10, v3, LM2/k;->i:I

    .line 263
    .line 264
    if-ge v2, v10, :cond_11

    .line 265
    .line 266
    iget v2, v0, LM2/l;->D:I

    .line 267
    .line 268
    check-cast v1, Ls2/j;

    .line 269
    .line 270
    invoke-virtual {v1, v2}, Ls2/j;->j(I)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v3}, LM2/k;->b()LM2/t;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    if-nez v1, :cond_d

    .line 278
    .line 279
    goto :goto_a

    .line 280
    :cond_d
    iget-object v2, v8, LM2/u;->q:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v2, LQ1/o;

    .line 283
    .line 284
    iget v1, v1, LM2/t;->d:I

    .line 285
    .line 286
    if-eqz v1, :cond_e

    .line 287
    .line 288
    invoke-virtual {v2, v1}, LQ1/o;->H(I)V

    .line 289
    .line 290
    .line 291
    :cond_e
    iget v1, v3, LM2/k;->f:I

    .line 292
    .line 293
    iget-boolean v5, v8, LM2/u;->j:Z

    .line 294
    .line 295
    if-eqz v5, :cond_f

    .line 296
    .line 297
    iget-object v5, v8, LM2/u;->k:[Z

    .line 298
    .line 299
    aget-boolean v1, v5, v1

    .line 300
    .line 301
    if-eqz v1, :cond_f

    .line 302
    .line 303
    invoke-virtual {v2}, LQ1/o;->A()I

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    mul-int/2addr v1, v4

    .line 308
    invoke-virtual {v2, v1}, LQ1/o;->H(I)V

    .line 309
    .line 310
    .line 311
    :cond_f
    :goto_a
    invoke-virtual {v3}, LM2/k;->c()Z

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    if-nez v1, :cond_10

    .line 316
    .line 317
    const/4 v2, 0x0

    .line 318
    iput-object v2, v0, LM2/l;->C:LM2/k;

    .line 319
    .line 320
    :cond_10
    const/4 v10, 0x3

    .line 321
    iput v10, v0, LM2/l;->s:I

    .line 322
    .line 323
    return v6

    .line 324
    :cond_11
    iget-object v2, v3, LM2/k;->d:LM2/v;

    .line 325
    .line 326
    iget-object v2, v2, LM2/v;->a:LM2/s;

    .line 327
    .line 328
    iget v2, v2, LM2/s;->h:I

    .line 329
    .line 330
    move/from16 v10, v22

    .line 331
    .line 332
    if-ne v2, v10, :cond_12

    .line 333
    .line 334
    iget v2, v0, LM2/l;->D:I

    .line 335
    .line 336
    add-int/lit8 v2, v2, -0x8

    .line 337
    .line 338
    iput v2, v0, LM2/l;->D:I

    .line 339
    .line 340
    move-object v2, v1

    .line 341
    check-cast v2, Ls2/j;

    .line 342
    .line 343
    move/from16 v10, v20

    .line 344
    .line 345
    invoke-virtual {v2, v10}, Ls2/j;->j(I)V

    .line 346
    .line 347
    .line 348
    :cond_12
    iget-object v2, v3, LM2/k;->d:LM2/v;

    .line 349
    .line 350
    iget-object v2, v2, LM2/v;->a:LM2/s;

    .line 351
    .line 352
    iget-object v2, v2, LM2/s;->g:LN1/n;

    .line 353
    .line 354
    iget-object v2, v2, LN1/n;->n:Ljava/lang/String;

    .line 355
    .line 356
    const-string v10, "audio/ac4"

    .line 357
    .line 358
    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v2

    .line 362
    if-eqz v2, :cond_13

    .line 363
    .line 364
    iget v2, v0, LM2/l;->D:I

    .line 365
    .line 366
    const/4 v10, 0x7

    .line 367
    invoke-virtual {v3, v2, v10}, LM2/k;->d(II)I

    .line 368
    .line 369
    .line 370
    move-result v2

    .line 371
    iput v2, v0, LM2/l;->E:I

    .line 372
    .line 373
    iget v2, v0, LM2/l;->D:I

    .line 374
    .line 375
    iget-object v11, v0, LM2/l;->j:LQ1/o;

    .line 376
    .line 377
    invoke-static {v2, v11}, Ls2/a;->i(ILQ1/o;)V

    .line 378
    .line 379
    .line 380
    iget-object v2, v3, LM2/k;->a:Ls2/C;

    .line 381
    .line 382
    invoke-interface {v2, v10, v11}, Ls2/C;->e(ILQ1/o;)V

    .line 383
    .line 384
    .line 385
    iget v2, v0, LM2/l;->E:I

    .line 386
    .line 387
    add-int/2addr v2, v10

    .line 388
    iput v2, v0, LM2/l;->E:I

    .line 389
    .line 390
    goto :goto_b

    .line 391
    :cond_13
    iget v2, v0, LM2/l;->D:I

    .line 392
    .line 393
    invoke-virtual {v3, v2, v6}, LM2/k;->d(II)I

    .line 394
    .line 395
    .line 396
    move-result v2

    .line 397
    iput v2, v0, LM2/l;->E:I

    .line 398
    .line 399
    :goto_b
    iget v2, v0, LM2/l;->D:I

    .line 400
    .line 401
    iget v10, v0, LM2/l;->E:I

    .line 402
    .line 403
    add-int/2addr v2, v10

    .line 404
    iput v2, v0, LM2/l;->D:I

    .line 405
    .line 406
    const/4 v2, 0x4

    .line 407
    iput v2, v0, LM2/l;->s:I

    .line 408
    .line 409
    iput v6, v0, LM2/l;->F:I

    .line 410
    .line 411
    :cond_14
    iget-object v2, v3, LM2/k;->d:LM2/v;

    .line 412
    .line 413
    iget-boolean v10, v3, LM2/k;->l:Z

    .line 414
    .line 415
    if-nez v10, :cond_15

    .line 416
    .line 417
    iget-object v8, v2, LM2/v;->f:[J

    .line 418
    .line 419
    iget v10, v3, LM2/k;->f:I

    .line 420
    .line 421
    aget-wide v10, v8, v10

    .line 422
    .line 423
    goto :goto_c

    .line 424
    :cond_15
    iget v10, v3, LM2/k;->f:I

    .line 425
    .line 426
    iget-object v8, v8, LM2/u;->h:[J

    .line 427
    .line 428
    aget-wide v10, v8, v10

    .line 429
    .line 430
    :goto_c
    if-eqz v15, :cond_16

    .line 431
    .line 432
    invoke-virtual {v15, v10, v11}, LQ1/u;->a(J)J

    .line 433
    .line 434
    .line 435
    move-result-wide v10

    .line 436
    :cond_16
    iget-object v2, v2, LM2/v;->a:LM2/s;

    .line 437
    .line 438
    iget v8, v2, LM2/s;->k:I

    .line 439
    .line 440
    iget-object v12, v3, LM2/k;->a:Ls2/C;

    .line 441
    .line 442
    if-eqz v8, :cond_28

    .line 443
    .line 444
    iget-object v13, v0, LM2/l;->g:LQ1/o;

    .line 445
    .line 446
    iget-object v4, v13, LQ1/o;->a:[B

    .line 447
    .line 448
    aput-byte v6, v4, v6

    .line 449
    .line 450
    const/16 v22, 0x1

    .line 451
    .line 452
    aput-byte v6, v4, v22

    .line 453
    .line 454
    aput-byte v6, v4, v18

    .line 455
    .line 456
    add-int/lit8 v6, v8, 0x1

    .line 457
    .line 458
    const/16 v21, 0x4

    .line 459
    .line 460
    rsub-int/lit8 v8, v8, 0x4

    .line 461
    .line 462
    move/from16 v17, v5

    .line 463
    .line 464
    :goto_d
    iget v5, v0, LM2/l;->E:I

    .line 465
    .line 466
    move-object/from16 v31, v14

    .line 467
    .line 468
    iget v14, v0, LM2/l;->D:I

    .line 469
    .line 470
    if-ge v5, v14, :cond_27

    .line 471
    .line 472
    iget v5, v0, LM2/l;->F:I

    .line 473
    .line 474
    const-string v14, "video/hevc"

    .line 475
    .line 476
    move-object/from16 v32, v15

    .line 477
    .line 478
    iget-object v15, v2, LM2/s;->g:LN1/n;

    .line 479
    .line 480
    if-nez v5, :cond_1f

    .line 481
    .line 482
    move-object v5, v1

    .line 483
    check-cast v5, Ls2/j;

    .line 484
    .line 485
    move-object/from16 v20, v2

    .line 486
    .line 487
    const/4 v2, 0x0

    .line 488
    invoke-virtual {v5, v4, v8, v6, v2}, Ls2/j;->f([BIIZ)Z

    .line 489
    .line 490
    .line 491
    invoke-virtual {v13, v2}, LQ1/o;->G(I)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v13}, LQ1/o;->h()I

    .line 495
    .line 496
    .line 497
    move-result v5

    .line 498
    const/4 v2, 0x1

    .line 499
    if-lt v5, v2, :cond_1e

    .line 500
    .line 501
    sub-int/2addr v5, v2

    .line 502
    iput v5, v0, LM2/l;->F:I

    .line 503
    .line 504
    iget-object v5, v0, LM2/l;->f:LQ1/o;

    .line 505
    .line 506
    const/4 v2, 0x0

    .line 507
    invoke-virtual {v5, v2}, LQ1/o;->G(I)V

    .line 508
    .line 509
    .line 510
    const/4 v2, 0x4

    .line 511
    invoke-interface {v12, v2, v5}, Ls2/C;->e(ILQ1/o;)V

    .line 512
    .line 513
    .line 514
    const/4 v5, 0x1

    .line 515
    invoke-interface {v12, v5, v13}, Ls2/C;->e(ILQ1/o;)V

    .line 516
    .line 517
    .line 518
    iget-object v5, v0, LM2/l;->K:[Ls2/C;

    .line 519
    .line 520
    array-length v5, v5

    .line 521
    if-lez v5, :cond_1b

    .line 522
    .line 523
    aget-byte v5, v4, v2

    .line 524
    .line 525
    iget-object v2, v15, LN1/n;->n:Ljava/lang/String;

    .line 526
    .line 527
    invoke-static {v2, v7}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 528
    .line 529
    .line 530
    move-result v2

    .line 531
    move/from16 v18, v2

    .line 532
    .line 533
    iget-object v2, v15, LN1/n;->k:Ljava/lang/String;

    .line 534
    .line 535
    if-nez v18, :cond_18

    .line 536
    .line 537
    invoke-static {v2, v7}, LN1/C;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v18

    .line 541
    if-eqz v18, :cond_17

    .line 542
    .line 543
    goto :goto_e

    .line 544
    :cond_17
    move-object/from16 v23, v4

    .line 545
    .line 546
    move/from16 v18, v6

    .line 547
    .line 548
    const/4 v6, 0x6

    .line 549
    goto :goto_f

    .line 550
    :cond_18
    :goto_e
    move-object/from16 v23, v4

    .line 551
    .line 552
    and-int/lit8 v4, v5, 0x1f

    .line 553
    .line 554
    move/from16 v18, v6

    .line 555
    .line 556
    const/4 v6, 0x6

    .line 557
    if-eq v4, v6, :cond_1a

    .line 558
    .line 559
    :goto_f
    iget-object v4, v15, LN1/n;->n:Ljava/lang/String;

    .line 560
    .line 561
    invoke-static {v4, v14}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 562
    .line 563
    .line 564
    move-result v4

    .line 565
    if-nez v4, :cond_19

    .line 566
    .line 567
    invoke-static {v2, v14}, LN1/C;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v2

    .line 571
    if-eqz v2, :cond_1c

    .line 572
    .line 573
    :cond_19
    and-int/lit8 v2, v5, 0x7e

    .line 574
    .line 575
    const/16 v22, 0x1

    .line 576
    .line 577
    shr-int/lit8 v2, v2, 0x1

    .line 578
    .line 579
    const/16 v4, 0x27

    .line 580
    .line 581
    if-ne v2, v4, :cond_1c

    .line 582
    .line 583
    :cond_1a
    const/4 v2, 0x1

    .line 584
    goto :goto_10

    .line 585
    :cond_1b
    move-object/from16 v23, v4

    .line 586
    .line 587
    move/from16 v18, v6

    .line 588
    .line 589
    const/4 v6, 0x6

    .line 590
    :cond_1c
    const/4 v2, 0x0

    .line 591
    :goto_10
    iput-boolean v2, v0, LM2/l;->H:Z

    .line 592
    .line 593
    iget v2, v0, LM2/l;->E:I

    .line 594
    .line 595
    add-int/lit8 v2, v2, 0x5

    .line 596
    .line 597
    iput v2, v0, LM2/l;->E:I

    .line 598
    .line 599
    iget v2, v0, LM2/l;->D:I

    .line 600
    .line 601
    add-int/2addr v2, v8

    .line 602
    iput v2, v0, LM2/l;->D:I

    .line 603
    .line 604
    iget-boolean v2, v0, LM2/l;->G:Z

    .line 605
    .line 606
    if-nez v2, :cond_1d

    .line 607
    .line 608
    iget-object v2, v3, LM2/k;->d:LM2/v;

    .line 609
    .line 610
    iget-object v2, v2, LM2/v;->a:LM2/s;

    .line 611
    .line 612
    iget-object v2, v2, LM2/s;->g:LN1/n;

    .line 613
    .line 614
    iget-object v2, v2, LN1/n;->n:Ljava/lang/String;

    .line 615
    .line 616
    invoke-static {v2, v7}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    move-result v2

    .line 620
    if-eqz v2, :cond_1d

    .line 621
    .line 622
    const/16 v21, 0x4

    .line 623
    .line 624
    aget-byte v2, v23, v21

    .line 625
    .line 626
    invoke-static {v2}, LR1/n;->c(B)Z

    .line 627
    .line 628
    .line 629
    move-result v2

    .line 630
    if-eqz v2, :cond_1d

    .line 631
    .line 632
    const/4 v2, 0x1

    .line 633
    iput-boolean v2, v0, LM2/l;->G:Z

    .line 634
    .line 635
    :cond_1d
    move/from16 v6, v18

    .line 636
    .line 637
    move-object/from16 v2, v20

    .line 638
    .line 639
    move-object/from16 v4, v23

    .line 640
    .line 641
    move-object/from16 v14, v31

    .line 642
    .line 643
    move-object/from16 v15, v32

    .line 644
    .line 645
    goto/16 :goto_d

    .line 646
    .line 647
    :cond_1e
    const-string v1, "Invalid NAL length"

    .line 648
    .line 649
    const/4 v2, 0x0

    .line 650
    invoke-static {v2, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 651
    .line 652
    .line 653
    move-result-object v1

    .line 654
    throw v1

    .line 655
    :cond_1f
    move-object/from16 v20, v2

    .line 656
    .line 657
    move-object/from16 v23, v4

    .line 658
    .line 659
    move/from16 v18, v6

    .line 660
    .line 661
    const/4 v6, 0x6

    .line 662
    iget-boolean v2, v0, LM2/l;->H:Z

    .line 663
    .line 664
    if-eqz v2, :cond_26

    .line 665
    .line 666
    iget-object v2, v0, LM2/l;->h:LQ1/o;

    .line 667
    .line 668
    invoke-virtual {v2, v5}, LQ1/o;->D(I)V

    .line 669
    .line 670
    .line 671
    iget-object v4, v2, LQ1/o;->a:[B

    .line 672
    .line 673
    iget v5, v0, LM2/l;->F:I

    .line 674
    .line 675
    move-object v6, v1

    .line 676
    check-cast v6, Ls2/j;

    .line 677
    .line 678
    move-object/from16 v33, v3

    .line 679
    .line 680
    const/4 v3, 0x0

    .line 681
    invoke-virtual {v6, v4, v3, v5, v3}, Ls2/j;->f([BIIZ)Z

    .line 682
    .line 683
    .line 684
    iget v3, v0, LM2/l;->F:I

    .line 685
    .line 686
    invoke-interface {v12, v3, v2}, Ls2/C;->e(ILQ1/o;)V

    .line 687
    .line 688
    .line 689
    iget v3, v0, LM2/l;->F:I

    .line 690
    .line 691
    iget-object v4, v2, LQ1/o;->a:[B

    .line 692
    .line 693
    iget v5, v2, LQ1/o;->c:I

    .line 694
    .line 695
    invoke-static {v5, v4}, LR1/n;->k(I[B)I

    .line 696
    .line 697
    .line 698
    move-result v4

    .line 699
    iget-object v5, v15, LN1/n;->n:Ljava/lang/String;

    .line 700
    .line 701
    invoke-static {v5, v14}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 702
    .line 703
    .line 704
    move-result v5

    .line 705
    if-nez v5, :cond_21

    .line 706
    .line 707
    iget-object v5, v15, LN1/n;->k:Ljava/lang/String;

    .line 708
    .line 709
    invoke-static {v5, v14}, LN1/C;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v5

    .line 713
    if-eqz v5, :cond_20

    .line 714
    .line 715
    goto :goto_11

    .line 716
    :cond_20
    const/4 v5, 0x0

    .line 717
    goto :goto_12

    .line 718
    :cond_21
    :goto_11
    const/4 v5, 0x1

    .line 719
    :goto_12
    invoke-virtual {v2, v5}, LQ1/o;->G(I)V

    .line 720
    .line 721
    .line 722
    invoke-virtual {v2, v4}, LQ1/o;->F(I)V

    .line 723
    .line 724
    .line 725
    iget v4, v15, LN1/n;->p:I

    .line 726
    .line 727
    const/4 v5, -0x1

    .line 728
    if-ne v4, v5, :cond_22

    .line 729
    .line 730
    iget v4, v9, LR1/q;->a:I

    .line 731
    .line 732
    if-eqz v4, :cond_24

    .line 733
    .line 734
    const/4 v4, 0x0

    .line 735
    iput v4, v9, LR1/q;->a:I

    .line 736
    .line 737
    invoke-virtual {v9, v4}, LR1/q;->p(I)V

    .line 738
    .line 739
    .line 740
    goto :goto_14

    .line 741
    :cond_22
    iget v5, v9, LR1/q;->a:I

    .line 742
    .line 743
    if-eq v5, v4, :cond_24

    .line 744
    .line 745
    if-ltz v4, :cond_23

    .line 746
    .line 747
    const/4 v5, 0x1

    .line 748
    goto :goto_13

    .line 749
    :cond_23
    const/4 v5, 0x0

    .line 750
    :goto_13
    invoke-static {v5}, LQ1/k;->g(Z)V

    .line 751
    .line 752
    .line 753
    iput v4, v9, LR1/q;->a:I

    .line 754
    .line 755
    invoke-virtual {v9, v4}, LR1/q;->p(I)V

    .line 756
    .line 757
    .line 758
    :cond_24
    :goto_14
    invoke-virtual {v9, v10, v11, v2}, LR1/q;->m(JLQ1/o;)V

    .line 759
    .line 760
    .line 761
    invoke-virtual/range {v33 .. v33}, LM2/k;->a()I

    .line 762
    .line 763
    .line 764
    move-result v2

    .line 765
    const/16 v21, 0x4

    .line 766
    .line 767
    and-int/lit8 v2, v2, 0x4

    .line 768
    .line 769
    if-eqz v2, :cond_25

    .line 770
    .line 771
    const/4 v2, 0x0

    .line 772
    invoke-virtual {v9, v2}, LR1/q;->p(I)V

    .line 773
    .line 774
    .line 775
    goto :goto_15

    .line 776
    :cond_25
    const/4 v2, 0x0

    .line 777
    goto :goto_15

    .line 778
    :cond_26
    move-object/from16 v33, v3

    .line 779
    .line 780
    const/4 v2, 0x0

    .line 781
    invoke-interface {v12, v1, v5, v2}, Ls2/C;->d(LN1/g;IZ)I

    .line 782
    .line 783
    .line 784
    move-result v3

    .line 785
    :goto_15
    iget v2, v0, LM2/l;->E:I

    .line 786
    .line 787
    add-int/2addr v2, v3

    .line 788
    iput v2, v0, LM2/l;->E:I

    .line 789
    .line 790
    iget v2, v0, LM2/l;->F:I

    .line 791
    .line 792
    sub-int/2addr v2, v3

    .line 793
    iput v2, v0, LM2/l;->F:I

    .line 794
    .line 795
    move/from16 v6, v18

    .line 796
    .line 797
    move-object/from16 v2, v20

    .line 798
    .line 799
    move-object/from16 v4, v23

    .line 800
    .line 801
    move-object/from16 v14, v31

    .line 802
    .line 803
    move-object/from16 v15, v32

    .line 804
    .line 805
    move-object/from16 v3, v33

    .line 806
    .line 807
    goto/16 :goto_d

    .line 808
    .line 809
    :cond_27
    move-object/from16 v33, v3

    .line 810
    .line 811
    move-object/from16 v32, v15

    .line 812
    .line 813
    goto :goto_17

    .line 814
    :cond_28
    move-object/from16 v33, v3

    .line 815
    .line 816
    move/from16 v17, v5

    .line 817
    .line 818
    move-object/from16 v31, v14

    .line 819
    .line 820
    move-object/from16 v32, v15

    .line 821
    .line 822
    :goto_16
    iget v2, v0, LM2/l;->E:I

    .line 823
    .line 824
    iget v3, v0, LM2/l;->D:I

    .line 825
    .line 826
    if-ge v2, v3, :cond_29

    .line 827
    .line 828
    sub-int/2addr v3, v2

    .line 829
    const/4 v2, 0x0

    .line 830
    invoke-interface {v12, v1, v3, v2}, Ls2/C;->d(LN1/g;IZ)I

    .line 831
    .line 832
    .line 833
    move-result v3

    .line 834
    iget v2, v0, LM2/l;->E:I

    .line 835
    .line 836
    add-int/2addr v2, v3

    .line 837
    iput v2, v0, LM2/l;->E:I

    .line 838
    .line 839
    goto :goto_16

    .line 840
    :cond_29
    :goto_17
    invoke-virtual/range {v33 .. v33}, LM2/k;->a()I

    .line 841
    .line 842
    .line 843
    move-result v1

    .line 844
    and-int/lit8 v2, v17, 0x40

    .line 845
    .line 846
    if-eqz v2, :cond_2a

    .line 847
    .line 848
    iget-boolean v2, v0, LM2/l;->G:Z

    .line 849
    .line 850
    if-nez v2, :cond_2a

    .line 851
    .line 852
    const/high16 v2, 0x4000000

    .line 853
    .line 854
    or-int/2addr v1, v2

    .line 855
    :cond_2a
    move/from16 v26, v1

    .line 856
    .line 857
    invoke-virtual/range {v33 .. v33}, LM2/k;->b()LM2/t;

    .line 858
    .line 859
    .line 860
    move-result-object v1

    .line 861
    if-eqz v1, :cond_2b

    .line 862
    .line 863
    iget-object v1, v1, LM2/t;->c:Ls2/B;

    .line 864
    .line 865
    move-object/from16 v29, v1

    .line 866
    .line 867
    goto :goto_18

    .line 868
    :cond_2b
    const/16 v29, 0x0

    .line 869
    .line 870
    :goto_18
    iget v1, v0, LM2/l;->D:I

    .line 871
    .line 872
    const/16 v28, 0x0

    .line 873
    .line 874
    move/from16 v27, v1

    .line 875
    .line 876
    move-wide/from16 v24, v10

    .line 877
    .line 878
    move-object/from16 v23, v12

    .line 879
    .line 880
    invoke-interface/range {v23 .. v29}, Ls2/C;->a(JIIILs2/B;)V

    .line 881
    .line 882
    .line 883
    :goto_19
    invoke-virtual/range {v31 .. v31}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 884
    .line 885
    .line 886
    move-result v1

    .line 887
    if-nez v1, :cond_2f

    .line 888
    .line 889
    invoke-virtual/range {v31 .. v31}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 890
    .line 891
    .line 892
    move-result-object v1

    .line 893
    check-cast v1, LM2/j;

    .line 894
    .line 895
    iget v2, v0, LM2/l;->y:I

    .line 896
    .line 897
    iget v3, v1, LM2/j;->c:I

    .line 898
    .line 899
    sub-int/2addr v2, v3

    .line 900
    iput v2, v0, LM2/l;->y:I

    .line 901
    .line 902
    iget-boolean v2, v1, LM2/j;->b:Z

    .line 903
    .line 904
    iget-wide v3, v1, LM2/j;->a:J

    .line 905
    .line 906
    if-eqz v2, :cond_2c

    .line 907
    .line 908
    add-long v3, v3, v24

    .line 909
    .line 910
    :cond_2c
    move-object/from16 v2, v32

    .line 911
    .line 912
    if-eqz v32, :cond_2d

    .line 913
    .line 914
    invoke-virtual {v2, v3, v4}, LQ1/u;->a(J)J

    .line 915
    .line 916
    .line 917
    move-result-wide v3

    .line 918
    :cond_2d
    move-wide v6, v3

    .line 919
    iget-object v3, v0, LM2/l;->J:[Ls2/C;

    .line 920
    .line 921
    array-length v4, v3

    .line 922
    const/4 v12, 0x0

    .line 923
    :goto_1a
    if-ge v12, v4, :cond_2e

    .line 924
    .line 925
    aget-object v5, v3, v12

    .line 926
    .line 927
    iget v10, v0, LM2/l;->y:I

    .line 928
    .line 929
    const/4 v11, 0x0

    .line 930
    const/4 v8, 0x1

    .line 931
    iget v9, v1, LM2/j;->c:I

    .line 932
    .line 933
    invoke-interface/range {v5 .. v11}, Ls2/C;->a(JIIILs2/B;)V

    .line 934
    .line 935
    .line 936
    const/16 v22, 0x1

    .line 937
    .line 938
    add-int/lit8 v12, v12, 0x1

    .line 939
    .line 940
    goto :goto_1a

    .line 941
    :cond_2e
    move-object/from16 v32, v2

    .line 942
    .line 943
    goto :goto_19

    .line 944
    :cond_2f
    invoke-virtual/range {v33 .. v33}, LM2/k;->c()Z

    .line 945
    .line 946
    .line 947
    move-result v1

    .line 948
    if-nez v1, :cond_30

    .line 949
    .line 950
    const/4 v2, 0x0

    .line 951
    iput-object v2, v0, LM2/l;->C:LM2/k;

    .line 952
    .line 953
    :cond_30
    const/4 v10, 0x3

    .line 954
    iput v10, v0, LM2/l;->s:I

    .line 955
    .line 956
    const/16 v30, 0x0

    .line 957
    .line 958
    return v30

    .line 959
    :cond_31
    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    .line 960
    .line 961
    .line 962
    move-result v2

    .line 963
    const/4 v3, 0x0

    .line 964
    const/4 v4, 0x0

    .line 965
    :goto_1b
    if-ge v4, v2, :cond_33

    .line 966
    .line 967
    invoke-virtual {v5, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 968
    .line 969
    .line 970
    move-result-object v6

    .line 971
    check-cast v6, LM2/k;

    .line 972
    .line 973
    iget-object v6, v6, LM2/k;->b:LM2/u;

    .line 974
    .line 975
    iget-boolean v7, v6, LM2/u;->l:Z

    .line 976
    .line 977
    if-eqz v7, :cond_32

    .line 978
    .line 979
    iget-wide v6, v6, LM2/u;->b:J

    .line 980
    .line 981
    cmp-long v8, v6, v16

    .line 982
    .line 983
    if-gez v8, :cond_32

    .line 984
    .line 985
    invoke-virtual {v5, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 986
    .line 987
    .line 988
    move-result-object v3

    .line 989
    check-cast v3, LM2/k;

    .line 990
    .line 991
    move-wide/from16 v16, v6

    .line 992
    .line 993
    :cond_32
    const/16 v22, 0x1

    .line 994
    .line 995
    add-int/lit8 v4, v4, 0x1

    .line 996
    .line 997
    goto :goto_1b

    .line 998
    :cond_33
    if-nez v3, :cond_34

    .line 999
    .line 1000
    const/4 v10, 0x3

    .line 1001
    iput v10, v0, LM2/l;->s:I

    .line 1002
    .line 1003
    goto/16 :goto_0

    .line 1004
    .line 1005
    :cond_34
    move-object v2, v1

    .line 1006
    check-cast v2, Ls2/j;

    .line 1007
    .line 1008
    iget-wide v4, v2, Ls2/j;->d:J

    .line 1009
    .line 1010
    sub-long v4, v16, v4

    .line 1011
    .line 1012
    long-to-int v2, v4

    .line 1013
    if-ltz v2, :cond_35

    .line 1014
    .line 1015
    move-object v4, v1

    .line 1016
    check-cast v4, Ls2/j;

    .line 1017
    .line 1018
    invoke-virtual {v4, v2}, Ls2/j;->j(I)V

    .line 1019
    .line 1020
    .line 1021
    iget-object v2, v3, LM2/k;->b:LM2/u;

    .line 1022
    .line 1023
    iget-object v3, v2, LM2/u;->q:Ljava/lang/Object;

    .line 1024
    .line 1025
    check-cast v3, LQ1/o;

    .line 1026
    .line 1027
    iget-object v5, v3, LQ1/o;->a:[B

    .line 1028
    .line 1029
    iget v6, v3, LQ1/o;->c:I

    .line 1030
    .line 1031
    const/4 v7, 0x0

    .line 1032
    invoke-virtual {v4, v5, v7, v6, v7}, Ls2/j;->f([BIIZ)Z

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual {v3, v7}, LQ1/o;->G(I)V

    .line 1036
    .line 1037
    .line 1038
    iput-boolean v7, v2, LM2/u;->l:Z

    .line 1039
    .line 1040
    goto/16 :goto_0

    .line 1041
    .line 1042
    :cond_35
    const-string v1, "Offset to encryption data was negative."

    .line 1043
    .line 1044
    const/4 v2, 0x0

    .line 1045
    invoke-static {v2, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v1

    .line 1049
    throw v1

    .line 1050
    :cond_36
    move/from16 v18, v13

    .line 1051
    .line 1052
    move-object/from16 v31, v14

    .line 1053
    .line 1054
    move-object v2, v15

    .line 1055
    iget-wide v5, v0, LM2/l;->u:J

    .line 1056
    .line 1057
    long-to-int v3, v5

    .line 1058
    iget v5, v0, LM2/l;->v:I

    .line 1059
    .line 1060
    sub-int/2addr v3, v5

    .line 1061
    iget-object v5, v0, LM2/l;->w:LQ1/o;

    .line 1062
    .line 1063
    if-eqz v5, :cond_45

    .line 1064
    .line 1065
    iget-object v6, v5, LQ1/o;->a:[B

    .line 1066
    .line 1067
    move-object v7, v1

    .line 1068
    check-cast v7, Ls2/j;

    .line 1069
    .line 1070
    const/4 v9, 0x0

    .line 1071
    const/16 v10, 0x8

    .line 1072
    .line 1073
    invoke-virtual {v7, v6, v10, v3, v9}, Ls2/j;->f([BIIZ)Z

    .line 1074
    .line 1075
    .line 1076
    new-instance v3, LR1/c;

    .line 1077
    .line 1078
    iget v6, v0, LM2/l;->t:I

    .line 1079
    .line 1080
    invoke-direct {v3, v6, v5}, LR1/c;-><init>(ILQ1/o;)V

    .line 1081
    .line 1082
    .line 1083
    move-object v7, v1

    .line 1084
    check-cast v7, Ls2/j;

    .line 1085
    .line 1086
    iget-wide v9, v7, Ls2/j;->d:J

    .line 1087
    .line 1088
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1089
    .line 1090
    .line 1091
    move-result v7

    .line 1092
    if-nez v7, :cond_37

    .line 1093
    .line 1094
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v2

    .line 1098
    check-cast v2, LR1/b;

    .line 1099
    .line 1100
    iget-object v2, v2, LR1/b;->d:Ljava/util/ArrayList;

    .line 1101
    .line 1102
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1103
    .line 1104
    .line 1105
    goto/16 :goto_23

    .line 1106
    .line 1107
    :cond_37
    const v3, 0x73696478

    .line 1108
    .line 1109
    .line 1110
    if-ne v6, v3, :cond_3b

    .line 1111
    .line 1112
    const/16 v3, 0x8

    .line 1113
    .line 1114
    invoke-virtual {v5, v3}, LQ1/o;->G(I)V

    .line 1115
    .line 1116
    .line 1117
    invoke-virtual {v5}, LQ1/o;->h()I

    .line 1118
    .line 1119
    .line 1120
    move-result v2

    .line 1121
    invoke-static {v2}, LM2/g;->c(I)I

    .line 1122
    .line 1123
    .line 1124
    move-result v2

    .line 1125
    const/4 v3, 0x4

    .line 1126
    invoke-virtual {v5, v3}, LQ1/o;->H(I)V

    .line 1127
    .line 1128
    .line 1129
    invoke-virtual {v5}, LQ1/o;->w()J

    .line 1130
    .line 1131
    .line 1132
    move-result-wide v15

    .line 1133
    if-nez v2, :cond_38

    .line 1134
    .line 1135
    invoke-virtual {v5}, LQ1/o;->w()J

    .line 1136
    .line 1137
    .line 1138
    move-result-wide v2

    .line 1139
    invoke-virtual {v5}, LQ1/o;->w()J

    .line 1140
    .line 1141
    .line 1142
    move-result-wide v6

    .line 1143
    :goto_1c
    add-long/2addr v6, v9

    .line 1144
    move-wide v11, v2

    .line 1145
    goto :goto_1d

    .line 1146
    :cond_38
    invoke-virtual {v5}, LQ1/o;->z()J

    .line 1147
    .line 1148
    .line 1149
    move-result-wide v2

    .line 1150
    invoke-virtual {v5}, LQ1/o;->z()J

    .line 1151
    .line 1152
    .line 1153
    move-result-wide v6

    .line 1154
    goto :goto_1c

    .line 1155
    :goto_1d
    sget v2, LQ1/x;->a:I

    .line 1156
    .line 1157
    sget-object v17, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1158
    .line 1159
    const-wide/32 v13, 0xf4240

    .line 1160
    .line 1161
    .line 1162
    invoke-static/range {v11 .. v17}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    .line 1163
    .line 1164
    .line 1165
    move-result-wide v2

    .line 1166
    move/from16 v4, v18

    .line 1167
    .line 1168
    invoke-virtual {v5, v4}, LQ1/o;->H(I)V

    .line 1169
    .line 1170
    .line 1171
    invoke-virtual {v5}, LQ1/o;->A()I

    .line 1172
    .line 1173
    .line 1174
    move-result v4

    .line 1175
    new-array v8, v4, [I

    .line 1176
    .line 1177
    new-array v9, v4, [J

    .line 1178
    .line 1179
    new-array v10, v4, [J

    .line 1180
    .line 1181
    new-array v13, v4, [J

    .line 1182
    .line 1183
    move-wide/from16 v23, v2

    .line 1184
    .line 1185
    move-wide/from16 v18, v6

    .line 1186
    .line 1187
    const/4 v6, 0x0

    .line 1188
    :goto_1e
    if-ge v6, v4, :cond_3a

    .line 1189
    .line 1190
    invoke-virtual {v5}, LQ1/o;->h()I

    .line 1191
    .line 1192
    .line 1193
    move-result v7

    .line 1194
    const/high16 v14, -0x80000000

    .line 1195
    .line 1196
    and-int/2addr v14, v7

    .line 1197
    if-nez v14, :cond_39

    .line 1198
    .line 1199
    invoke-virtual {v5}, LQ1/o;->w()J

    .line 1200
    .line 1201
    .line 1202
    move-result-wide v25

    .line 1203
    const v14, 0x7fffffff

    .line 1204
    .line 1205
    .line 1206
    and-int/2addr v7, v14

    .line 1207
    aput v7, v8, v6

    .line 1208
    .line 1209
    aput-wide v18, v9, v6

    .line 1210
    .line 1211
    aput-wide v23, v13, v6

    .line 1212
    .line 1213
    add-long v11, v11, v25

    .line 1214
    .line 1215
    sget-object v17, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1216
    .line 1217
    move-object v7, v13

    .line 1218
    const-wide/32 v13, 0xf4240

    .line 1219
    .line 1220
    .line 1221
    invoke-static/range {v11 .. v17}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    .line 1222
    .line 1223
    .line 1224
    move-result-wide v23

    .line 1225
    aget-wide v13, v7, v6

    .line 1226
    .line 1227
    sub-long v13, v23, v13

    .line 1228
    .line 1229
    aput-wide v13, v10, v6

    .line 1230
    .line 1231
    const/4 v13, 0x4

    .line 1232
    invoke-virtual {v5, v13}, LQ1/o;->H(I)V

    .line 1233
    .line 1234
    .line 1235
    aget v14, v8, v6

    .line 1236
    .line 1237
    int-to-long v13, v14

    .line 1238
    add-long v18, v18, v13

    .line 1239
    .line 1240
    const/16 v22, 0x1

    .line 1241
    .line 1242
    add-int/lit8 v6, v6, 0x1

    .line 1243
    .line 1244
    move-object v13, v7

    .line 1245
    goto :goto_1e

    .line 1246
    :cond_39
    const-string v1, "Unhandled indirect reference"

    .line 1247
    .line 1248
    const/4 v2, 0x0

    .line 1249
    invoke-static {v2, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v1

    .line 1253
    throw v1

    .line 1254
    :cond_3a
    move-object v7, v13

    .line 1255
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v2

    .line 1259
    new-instance v3, Ls2/h;

    .line 1260
    .line 1261
    invoke-direct {v3, v8, v9, v10, v7}, Ls2/h;-><init>([I[J[J[J)V

    .line 1262
    .line 1263
    .line 1264
    invoke-static {v2, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v2

    .line 1268
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 1269
    .line 1270
    check-cast v3, Ljava/lang/Long;

    .line 1271
    .line 1272
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 1273
    .line 1274
    .line 1275
    move-result-wide v3

    .line 1276
    iput-wide v3, v0, LM2/l;->B:J

    .line 1277
    .line 1278
    iget-object v3, v0, LM2/l;->I:Ls2/o;

    .line 1279
    .line 1280
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1281
    .line 1282
    check-cast v2, Ls2/w;

    .line 1283
    .line 1284
    invoke-interface {v3, v2}, Ls2/o;->s(Ls2/w;)V

    .line 1285
    .line 1286
    .line 1287
    const/4 v2, 0x1

    .line 1288
    iput-boolean v2, v0, LM2/l;->L:Z

    .line 1289
    .line 1290
    goto/16 :goto_23

    .line 1291
    .line 1292
    :cond_3b
    const v3, 0x656d7367

    .line 1293
    .line 1294
    .line 1295
    if-ne v6, v3, :cond_46

    .line 1296
    .line 1297
    iget-object v3, v0, LM2/l;->J:[Ls2/C;

    .line 1298
    .line 1299
    array-length v3, v3

    .line 1300
    if-nez v3, :cond_3c

    .line 1301
    .line 1302
    goto/16 :goto_23

    .line 1303
    .line 1304
    :cond_3c
    const/16 v10, 0x8

    .line 1305
    .line 1306
    invoke-virtual {v5, v10}, LQ1/o;->G(I)V

    .line 1307
    .line 1308
    .line 1309
    invoke-virtual {v5}, LQ1/o;->h()I

    .line 1310
    .line 1311
    .line 1312
    move-result v3

    .line 1313
    invoke-static {v3}, LM2/g;->c(I)I

    .line 1314
    .line 1315
    .line 1316
    move-result v3

    .line 1317
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    if-eqz v3, :cond_3e

    .line 1323
    .line 1324
    const/4 v10, 0x1

    .line 1325
    if-eq v3, v10, :cond_3d

    .line 1326
    .line 1327
    const-string v2, "Skipping unsupported emsg version: "

    .line 1328
    .line 1329
    invoke-static {v3, v2, v8}, LN0/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 1330
    .line 1331
    .line 1332
    goto/16 :goto_23

    .line 1333
    .line 1334
    :cond_3d
    invoke-virtual {v5}, LQ1/o;->w()J

    .line 1335
    .line 1336
    .line 1337
    move-result-wide v13

    .line 1338
    invoke-virtual {v5}, LQ1/o;->z()J

    .line 1339
    .line 1340
    .line 1341
    move-result-wide v9

    .line 1342
    sget-object v15, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1343
    .line 1344
    const-wide/32 v11, 0xf4240

    .line 1345
    .line 1346
    .line 1347
    invoke-static/range {v9 .. v15}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    .line 1348
    .line 1349
    .line 1350
    move-result-wide v3

    .line 1351
    invoke-virtual {v5}, LQ1/o;->w()J

    .line 1352
    .line 1353
    .line 1354
    move-result-wide v9

    .line 1355
    const-wide/16 v11, 0x3e8

    .line 1356
    .line 1357
    invoke-static/range {v9 .. v15}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    .line 1358
    .line 1359
    .line 1360
    move-result-wide v8

    .line 1361
    invoke-virtual {v5}, LQ1/o;->w()J

    .line 1362
    .line 1363
    .line 1364
    move-result-wide v10

    .line 1365
    invoke-virtual {v5}, LQ1/o;->p()Ljava/lang/String;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v12

    .line 1369
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1370
    .line 1371
    .line 1372
    invoke-virtual {v5}, LQ1/o;->p()Ljava/lang/String;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v13

    .line 1376
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1377
    .line 1378
    .line 1379
    move-wide v15, v10

    .line 1380
    move-object v11, v12

    .line 1381
    move-object v12, v13

    .line 1382
    move-wide v13, v8

    .line 1383
    move-wide v8, v6

    .line 1384
    goto :goto_20

    .line 1385
    :cond_3e
    invoke-virtual {v5}, LQ1/o;->p()Ljava/lang/String;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v12

    .line 1389
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1390
    .line 1391
    .line 1392
    invoke-virtual {v5}, LQ1/o;->p()Ljava/lang/String;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v13

    .line 1396
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1397
    .line 1398
    .line 1399
    invoke-virtual {v5}, LQ1/o;->w()J

    .line 1400
    .line 1401
    .line 1402
    move-result-wide v18

    .line 1403
    invoke-virtual {v5}, LQ1/o;->w()J

    .line 1404
    .line 1405
    .line 1406
    move-result-wide v14

    .line 1407
    sget-object v20, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1408
    .line 1409
    const-wide/32 v16, 0xf4240

    .line 1410
    .line 1411
    .line 1412
    invoke-static/range {v14 .. v20}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    .line 1413
    .line 1414
    .line 1415
    move-result-wide v3

    .line 1416
    iget-wide v8, v0, LM2/l;->B:J

    .line 1417
    .line 1418
    cmp-long v10, v8, v6

    .line 1419
    .line 1420
    if-eqz v10, :cond_3f

    .line 1421
    .line 1422
    add-long/2addr v8, v3

    .line 1423
    goto :goto_1f

    .line 1424
    :cond_3f
    move-wide v8, v6

    .line 1425
    :goto_1f
    invoke-virtual {v5}, LQ1/o;->w()J

    .line 1426
    .line 1427
    .line 1428
    move-result-wide v14

    .line 1429
    const-wide/16 v16, 0x3e8

    .line 1430
    .line 1431
    invoke-static/range {v14 .. v20}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    .line 1432
    .line 1433
    .line 1434
    move-result-wide v10

    .line 1435
    invoke-virtual {v5}, LQ1/o;->w()J

    .line 1436
    .line 1437
    .line 1438
    move-result-wide v14

    .line 1439
    move-wide/from16 v34, v8

    .line 1440
    .line 1441
    move-wide v8, v3

    .line 1442
    move-wide/from16 v3, v34

    .line 1443
    .line 1444
    move-wide v15, v14

    .line 1445
    move-wide/from16 v34, v10

    .line 1446
    .line 1447
    move-object v11, v12

    .line 1448
    move-object v12, v13

    .line 1449
    move-wide/from16 v13, v34

    .line 1450
    .line 1451
    :goto_20
    invoke-virtual {v5}, LQ1/o;->a()I

    .line 1452
    .line 1453
    .line 1454
    move-result v10

    .line 1455
    new-array v10, v10, [B

    .line 1456
    .line 1457
    move-wide/from16 v18, v6

    .line 1458
    .line 1459
    invoke-virtual {v5}, LQ1/o;->a()I

    .line 1460
    .line 1461
    .line 1462
    move-result v6

    .line 1463
    const/4 v7, 0x0

    .line 1464
    invoke-virtual {v5, v7, v6, v10}, LQ1/o;->f(II[B)V

    .line 1465
    .line 1466
    .line 1467
    move-object/from16 v17, v10

    .line 1468
    .line 1469
    new-instance v10, LD2/a;

    .line 1470
    .line 1471
    invoke-direct/range {v10 .. v17}, LD2/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    .line 1472
    .line 1473
    .line 1474
    new-instance v5, LQ1/o;

    .line 1475
    .line 1476
    iget-object v6, v0, LM2/l;->l:LS3/s;

    .line 1477
    .line 1478
    invoke-virtual {v6, v10}, LS3/s;->o(LD2/a;)[B

    .line 1479
    .line 1480
    .line 1481
    move-result-object v6

    .line 1482
    invoke-direct {v5, v6}, LQ1/o;-><init>([B)V

    .line 1483
    .line 1484
    .line 1485
    invoke-virtual {v5}, LQ1/o;->a()I

    .line 1486
    .line 1487
    .line 1488
    move-result v14

    .line 1489
    iget-object v6, v0, LM2/l;->J:[Ls2/C;

    .line 1490
    .line 1491
    array-length v7, v6

    .line 1492
    const/4 v10, 0x0

    .line 1493
    :goto_21
    if-ge v10, v7, :cond_40

    .line 1494
    .line 1495
    aget-object v11, v6, v10

    .line 1496
    .line 1497
    const/4 v12, 0x0

    .line 1498
    invoke-virtual {v5, v12}, LQ1/o;->G(I)V

    .line 1499
    .line 1500
    .line 1501
    invoke-interface {v11, v14, v5}, Ls2/C;->e(ILQ1/o;)V

    .line 1502
    .line 1503
    .line 1504
    const/4 v11, 0x1

    .line 1505
    add-int/2addr v10, v11

    .line 1506
    goto :goto_21

    .line 1507
    :cond_40
    const/4 v11, 0x1

    .line 1508
    cmp-long v5, v3, v18

    .line 1509
    .line 1510
    if-nez v5, :cond_41

    .line 1511
    .line 1512
    new-instance v2, LM2/j;

    .line 1513
    .line 1514
    invoke-direct {v2, v8, v9, v11, v14}, LM2/j;-><init>(JZI)V

    .line 1515
    .line 1516
    .line 1517
    move-object/from16 v5, v31

    .line 1518
    .line 1519
    invoke-virtual {v5, v2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 1520
    .line 1521
    .line 1522
    iget v2, v0, LM2/l;->y:I

    .line 1523
    .line 1524
    add-int/2addr v2, v14

    .line 1525
    iput v2, v0, LM2/l;->y:I

    .line 1526
    .line 1527
    goto :goto_23

    .line 1528
    :cond_41
    move-object/from16 v5, v31

    .line 1529
    .line 1530
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1531
    .line 1532
    .line 1533
    move-result v6

    .line 1534
    if-nez v6, :cond_42

    .line 1535
    .line 1536
    new-instance v2, LM2/j;

    .line 1537
    .line 1538
    const/4 v7, 0x0

    .line 1539
    invoke-direct {v2, v3, v4, v7, v14}, LM2/j;-><init>(JZI)V

    .line 1540
    .line 1541
    .line 1542
    invoke-virtual {v5, v2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 1543
    .line 1544
    .line 1545
    iget v2, v0, LM2/l;->y:I

    .line 1546
    .line 1547
    add-int/2addr v2, v14

    .line 1548
    iput v2, v0, LM2/l;->y:I

    .line 1549
    .line 1550
    goto :goto_23

    .line 1551
    :cond_42
    const/4 v7, 0x0

    .line 1552
    if-eqz v2, :cond_43

    .line 1553
    .line 1554
    invoke-virtual {v2}, LQ1/u;->f()Z

    .line 1555
    .line 1556
    .line 1557
    move-result v6

    .line 1558
    if-nez v6, :cond_43

    .line 1559
    .line 1560
    new-instance v2, LM2/j;

    .line 1561
    .line 1562
    invoke-direct {v2, v3, v4, v7, v14}, LM2/j;-><init>(JZI)V

    .line 1563
    .line 1564
    .line 1565
    invoke-virtual {v5, v2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 1566
    .line 1567
    .line 1568
    iget v2, v0, LM2/l;->y:I

    .line 1569
    .line 1570
    add-int/2addr v2, v14

    .line 1571
    iput v2, v0, LM2/l;->y:I

    .line 1572
    .line 1573
    goto :goto_23

    .line 1574
    :cond_43
    if-eqz v2, :cond_44

    .line 1575
    .line 1576
    invoke-virtual {v2, v3, v4}, LQ1/u;->a(J)J

    .line 1577
    .line 1578
    .line 1579
    move-result-wide v3

    .line 1580
    :cond_44
    move-wide v11, v3

    .line 1581
    iget-object v2, v0, LM2/l;->J:[Ls2/C;

    .line 1582
    .line 1583
    array-length v3, v2

    .line 1584
    const/4 v6, 0x0

    .line 1585
    :goto_22
    if-ge v6, v3, :cond_46

    .line 1586
    .line 1587
    aget-object v10, v2, v6

    .line 1588
    .line 1589
    const/16 v16, 0x0

    .line 1590
    .line 1591
    const/4 v13, 0x1

    .line 1592
    const/4 v15, 0x0

    .line 1593
    invoke-interface/range {v10 .. v16}, Ls2/C;->a(JIIILs2/B;)V

    .line 1594
    .line 1595
    .line 1596
    const/16 v22, 0x1

    .line 1597
    .line 1598
    add-int/lit8 v6, v6, 0x1

    .line 1599
    .line 1600
    goto :goto_22

    .line 1601
    :cond_45
    move-object v2, v1

    .line 1602
    check-cast v2, Ls2/j;

    .line 1603
    .line 1604
    invoke-virtual {v2, v3}, Ls2/j;->j(I)V

    .line 1605
    .line 1606
    .line 1607
    :cond_46
    :goto_23
    move-object v2, v1

    .line 1608
    check-cast v2, Ls2/j;

    .line 1609
    .line 1610
    iget-wide v2, v2, Ls2/j;->d:J

    .line 1611
    .line 1612
    invoke-virtual {v0, v2, v3}, LM2/l;->d(J)V

    .line 1613
    .line 1614
    .line 1615
    goto/16 :goto_0

    .line 1616
    .line 1617
    :cond_47
    iget v2, v0, LM2/l;->v:I

    .line 1618
    .line 1619
    iget-object v3, v0, LM2/l;->m:LQ1/o;

    .line 1620
    .line 1621
    if-nez v2, :cond_49

    .line 1622
    .line 1623
    iget-object v2, v3, LQ1/o;->a:[B

    .line 1624
    .line 1625
    move-object v6, v1

    .line 1626
    check-cast v6, Ls2/j;

    .line 1627
    .line 1628
    const/4 v7, 0x0

    .line 1629
    const/16 v10, 0x8

    .line 1630
    .line 1631
    const/4 v11, 0x1

    .line 1632
    invoke-virtual {v6, v2, v7, v10, v11}, Ls2/j;->f([BIIZ)Z

    .line 1633
    .line 1634
    .line 1635
    move-result v2

    .line 1636
    if-nez v2, :cond_48

    .line 1637
    .line 1638
    invoke-virtual {v9, v7}, LR1/q;->p(I)V

    .line 1639
    .line 1640
    .line 1641
    const/16 v19, -0x1

    .line 1642
    .line 1643
    return v19

    .line 1644
    :cond_48
    iput v10, v0, LM2/l;->v:I

    .line 1645
    .line 1646
    invoke-virtual {v3, v7}, LQ1/o;->G(I)V

    .line 1647
    .line 1648
    .line 1649
    invoke-virtual {v3}, LQ1/o;->w()J

    .line 1650
    .line 1651
    .line 1652
    move-result-wide v6

    .line 1653
    iput-wide v6, v0, LM2/l;->u:J

    .line 1654
    .line 1655
    invoke-virtual {v3}, LQ1/o;->h()I

    .line 1656
    .line 1657
    .line 1658
    move-result v2

    .line 1659
    iput v2, v0, LM2/l;->t:I

    .line 1660
    .line 1661
    :cond_49
    iget-wide v6, v0, LM2/l;->u:J

    .line 1662
    .line 1663
    const-wide/16 v8, 0x1

    .line 1664
    .line 1665
    cmp-long v2, v6, v8

    .line 1666
    .line 1667
    if-nez v2, :cond_4a

    .line 1668
    .line 1669
    iget-object v2, v3, LQ1/o;->a:[B

    .line 1670
    .line 1671
    move-object v6, v1

    .line 1672
    check-cast v6, Ls2/j;

    .line 1673
    .line 1674
    const/4 v7, 0x0

    .line 1675
    const/16 v10, 0x8

    .line 1676
    .line 1677
    invoke-virtual {v6, v2, v10, v10, v7}, Ls2/j;->f([BIIZ)Z

    .line 1678
    .line 1679
    .line 1680
    iget v2, v0, LM2/l;->v:I

    .line 1681
    .line 1682
    add-int/2addr v2, v10

    .line 1683
    iput v2, v0, LM2/l;->v:I

    .line 1684
    .line 1685
    invoke-virtual {v3}, LQ1/o;->z()J

    .line 1686
    .line 1687
    .line 1688
    move-result-wide v6

    .line 1689
    iput-wide v6, v0, LM2/l;->u:J

    .line 1690
    .line 1691
    goto :goto_24

    .line 1692
    :cond_4a
    const-wide/16 v8, 0x0

    .line 1693
    .line 1694
    cmp-long v2, v6, v8

    .line 1695
    .line 1696
    if-nez v2, :cond_4c

    .line 1697
    .line 1698
    move-object v2, v1

    .line 1699
    check-cast v2, Ls2/j;

    .line 1700
    .line 1701
    iget-wide v6, v2, Ls2/j;->c:J

    .line 1702
    .line 1703
    const-wide/16 v8, -0x1

    .line 1704
    .line 1705
    cmp-long v2, v6, v8

    .line 1706
    .line 1707
    if-nez v2, :cond_4b

    .line 1708
    .line 1709
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1710
    .line 1711
    .line 1712
    move-result v2

    .line 1713
    if-nez v2, :cond_4b

    .line 1714
    .line 1715
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1716
    .line 1717
    .line 1718
    move-result-object v2

    .line 1719
    check-cast v2, LR1/b;

    .line 1720
    .line 1721
    iget-wide v6, v2, LR1/b;->c:J

    .line 1722
    .line 1723
    :cond_4b
    cmp-long v2, v6, v8

    .line 1724
    .line 1725
    if-eqz v2, :cond_4c

    .line 1726
    .line 1727
    move-object v2, v1

    .line 1728
    check-cast v2, Ls2/j;

    .line 1729
    .line 1730
    iget-wide v8, v2, Ls2/j;->d:J

    .line 1731
    .line 1732
    sub-long/2addr v6, v8

    .line 1733
    iget v2, v0, LM2/l;->v:I

    .line 1734
    .line 1735
    int-to-long v8, v2

    .line 1736
    add-long/2addr v6, v8

    .line 1737
    iput-wide v6, v0, LM2/l;->u:J

    .line 1738
    .line 1739
    :cond_4c
    :goto_24
    iget-wide v6, v0, LM2/l;->u:J

    .line 1740
    .line 1741
    iget v2, v0, LM2/l;->v:I

    .line 1742
    .line 1743
    int-to-long v8, v2

    .line 1744
    cmp-long v6, v6, v8

    .line 1745
    .line 1746
    if-ltz v6, :cond_59

    .line 1747
    .line 1748
    move-object v6, v1

    .line 1749
    check-cast v6, Ls2/j;

    .line 1750
    .line 1751
    iget-wide v6, v6, Ls2/j;->d:J

    .line 1752
    .line 1753
    int-to-long v8, v2

    .line 1754
    sub-long/2addr v6, v8

    .line 1755
    iget v2, v0, LM2/l;->t:I

    .line 1756
    .line 1757
    const v8, 0x6d646174

    .line 1758
    .line 1759
    .line 1760
    const v9, 0x6d6f6f66

    .line 1761
    .line 1762
    .line 1763
    if-eq v2, v9, :cond_4d

    .line 1764
    .line 1765
    if-ne v2, v8, :cond_4e

    .line 1766
    .line 1767
    :cond_4d
    iget-boolean v2, v0, LM2/l;->L:Z

    .line 1768
    .line 1769
    if-nez v2, :cond_4e

    .line 1770
    .line 1771
    iget-object v2, v0, LM2/l;->I:Ls2/o;

    .line 1772
    .line 1773
    new-instance v10, Ls2/q;

    .line 1774
    .line 1775
    iget-wide v11, v0, LM2/l;->A:J

    .line 1776
    .line 1777
    invoke-direct {v10, v11, v12, v6, v7}, Ls2/q;-><init>(JJ)V

    .line 1778
    .line 1779
    .line 1780
    invoke-interface {v2, v10}, Ls2/o;->s(Ls2/w;)V

    .line 1781
    .line 1782
    .line 1783
    const/4 v2, 0x1

    .line 1784
    iput-boolean v2, v0, LM2/l;->L:Z

    .line 1785
    .line 1786
    :cond_4e
    iget v2, v0, LM2/l;->t:I

    .line 1787
    .line 1788
    if-ne v2, v9, :cond_4f

    .line 1789
    .line 1790
    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    .line 1791
    .line 1792
    .line 1793
    move-result v2

    .line 1794
    const/4 v10, 0x0

    .line 1795
    :goto_25
    if-ge v10, v2, :cond_4f

    .line 1796
    .line 1797
    invoke-virtual {v5, v10}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1798
    .line 1799
    .line 1800
    move-result-object v11

    .line 1801
    check-cast v11, LM2/k;

    .line 1802
    .line 1803
    iget-object v11, v11, LM2/k;->b:LM2/u;

    .line 1804
    .line 1805
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1806
    .line 1807
    .line 1808
    iput-wide v6, v11, LM2/u;->b:J

    .line 1809
    .line 1810
    iput-wide v6, v11, LM2/u;->a:J

    .line 1811
    .line 1812
    const/16 v22, 0x1

    .line 1813
    .line 1814
    add-int/lit8 v10, v10, 0x1

    .line 1815
    .line 1816
    goto :goto_25

    .line 1817
    :cond_4f
    iget v2, v0, LM2/l;->t:I

    .line 1818
    .line 1819
    if-ne v2, v8, :cond_50

    .line 1820
    .line 1821
    const/4 v5, 0x0

    .line 1822
    iput-object v5, v0, LM2/l;->C:LM2/k;

    .line 1823
    .line 1824
    iget-wide v2, v0, LM2/l;->u:J

    .line 1825
    .line 1826
    add-long/2addr v6, v2

    .line 1827
    iput-wide v6, v0, LM2/l;->x:J

    .line 1828
    .line 1829
    const/4 v4, 0x2

    .line 1830
    iput v4, v0, LM2/l;->s:I

    .line 1831
    .line 1832
    const/4 v10, 0x1

    .line 1833
    goto/16 :goto_28

    .line 1834
    .line 1835
    :cond_50
    const v5, 0x6d6f6f76

    .line 1836
    .line 1837
    .line 1838
    if-eq v2, v5, :cond_51

    .line 1839
    .line 1840
    const v5, 0x7472616b

    .line 1841
    .line 1842
    .line 1843
    if-eq v2, v5, :cond_51

    .line 1844
    .line 1845
    const v5, 0x6d646961

    .line 1846
    .line 1847
    .line 1848
    if-eq v2, v5, :cond_51

    .line 1849
    .line 1850
    const v5, 0x6d696e66

    .line 1851
    .line 1852
    .line 1853
    if-eq v2, v5, :cond_51

    .line 1854
    .line 1855
    const v5, 0x7374626c

    .line 1856
    .line 1857
    .line 1858
    if-eq v2, v5, :cond_51

    .line 1859
    .line 1860
    if-eq v2, v9, :cond_51

    .line 1861
    .line 1862
    const v5, 0x74726166

    .line 1863
    .line 1864
    .line 1865
    if-eq v2, v5, :cond_51

    .line 1866
    .line 1867
    const v5, 0x6d766578

    .line 1868
    .line 1869
    .line 1870
    if-eq v2, v5, :cond_51

    .line 1871
    .line 1872
    const v5, 0x65647473

    .line 1873
    .line 1874
    .line 1875
    if-ne v2, v5, :cond_52

    .line 1876
    .line 1877
    :cond_51
    const/4 v10, 0x1

    .line 1878
    goto/16 :goto_27

    .line 1879
    .line 1880
    :cond_52
    const v4, 0x68646c72    # 4.3148E24f

    .line 1881
    .line 1882
    .line 1883
    const-wide/32 v5, 0x7fffffff

    .line 1884
    .line 1885
    .line 1886
    if-eq v2, v4, :cond_55

    .line 1887
    .line 1888
    const v4, 0x6d646864

    .line 1889
    .line 1890
    .line 1891
    if-eq v2, v4, :cond_55

    .line 1892
    .line 1893
    const v4, 0x6d766864

    .line 1894
    .line 1895
    .line 1896
    if-eq v2, v4, :cond_55

    .line 1897
    .line 1898
    const v4, 0x73696478

    .line 1899
    .line 1900
    .line 1901
    if-eq v2, v4, :cond_55

    .line 1902
    .line 1903
    const v4, 0x73747364

    .line 1904
    .line 1905
    .line 1906
    if-eq v2, v4, :cond_55

    .line 1907
    .line 1908
    const v4, 0x73747473

    .line 1909
    .line 1910
    .line 1911
    if-eq v2, v4, :cond_55

    .line 1912
    .line 1913
    const v4, 0x63747473

    .line 1914
    .line 1915
    .line 1916
    if-eq v2, v4, :cond_55

    .line 1917
    .line 1918
    const v4, 0x73747363

    .line 1919
    .line 1920
    .line 1921
    if-eq v2, v4, :cond_55

    .line 1922
    .line 1923
    const v4, 0x7374737a

    .line 1924
    .line 1925
    .line 1926
    if-eq v2, v4, :cond_55

    .line 1927
    .line 1928
    const v4, 0x73747a32

    .line 1929
    .line 1930
    .line 1931
    if-eq v2, v4, :cond_55

    .line 1932
    .line 1933
    const v4, 0x7374636f

    .line 1934
    .line 1935
    .line 1936
    if-eq v2, v4, :cond_55

    .line 1937
    .line 1938
    const v4, 0x636f3634

    .line 1939
    .line 1940
    .line 1941
    if-eq v2, v4, :cond_55

    .line 1942
    .line 1943
    const v4, 0x73747373

    .line 1944
    .line 1945
    .line 1946
    if-eq v2, v4, :cond_55

    .line 1947
    .line 1948
    const v4, 0x74666474

    .line 1949
    .line 1950
    .line 1951
    if-eq v2, v4, :cond_55

    .line 1952
    .line 1953
    const v4, 0x74666864

    .line 1954
    .line 1955
    .line 1956
    if-eq v2, v4, :cond_55

    .line 1957
    .line 1958
    const v4, 0x746b6864

    .line 1959
    .line 1960
    .line 1961
    if-eq v2, v4, :cond_55

    .line 1962
    .line 1963
    const v4, 0x74726578

    .line 1964
    .line 1965
    .line 1966
    if-eq v2, v4, :cond_55

    .line 1967
    .line 1968
    const v4, 0x7472756e

    .line 1969
    .line 1970
    .line 1971
    if-eq v2, v4, :cond_55

    .line 1972
    .line 1973
    const v4, 0x70737368    # 3.013775E29f

    .line 1974
    .line 1975
    .line 1976
    if-eq v2, v4, :cond_55

    .line 1977
    .line 1978
    const v4, 0x7361697a

    .line 1979
    .line 1980
    .line 1981
    if-eq v2, v4, :cond_55

    .line 1982
    .line 1983
    const v4, 0x7361696f

    .line 1984
    .line 1985
    .line 1986
    if-eq v2, v4, :cond_55

    .line 1987
    .line 1988
    const v4, 0x73656e63

    .line 1989
    .line 1990
    .line 1991
    if-eq v2, v4, :cond_55

    .line 1992
    .line 1993
    const v4, 0x75756964

    .line 1994
    .line 1995
    .line 1996
    if-eq v2, v4, :cond_55

    .line 1997
    .line 1998
    const v4, 0x73626770

    .line 1999
    .line 2000
    .line 2001
    if-eq v2, v4, :cond_55

    .line 2002
    .line 2003
    const v4, 0x73677064

    .line 2004
    .line 2005
    .line 2006
    if-eq v2, v4, :cond_55

    .line 2007
    .line 2008
    const v4, 0x656c7374

    .line 2009
    .line 2010
    .line 2011
    if-eq v2, v4, :cond_55

    .line 2012
    .line 2013
    const v4, 0x6d656864

    .line 2014
    .line 2015
    .line 2016
    if-eq v2, v4, :cond_55

    .line 2017
    .line 2018
    const v4, 0x656d7367

    .line 2019
    .line 2020
    .line 2021
    if-ne v2, v4, :cond_53

    .line 2022
    .line 2023
    goto :goto_26

    .line 2024
    :cond_53
    iget-wide v2, v0, LM2/l;->u:J

    .line 2025
    .line 2026
    cmp-long v2, v2, v5

    .line 2027
    .line 2028
    if-gtz v2, :cond_54

    .line 2029
    .line 2030
    const/4 v2, 0x0

    .line 2031
    iput-object v2, v0, LM2/l;->w:LQ1/o;

    .line 2032
    .line 2033
    const/4 v2, 0x1

    .line 2034
    iput v2, v0, LM2/l;->s:I

    .line 2035
    .line 2036
    move v10, v2

    .line 2037
    goto :goto_28

    .line 2038
    :cond_54
    const-string v1, "Skipping atom with length > 2147483647 (unsupported)."

    .line 2039
    .line 2040
    invoke-static {v1}, LN1/D;->c(Ljava/lang/String;)LN1/D;

    .line 2041
    .line 2042
    .line 2043
    move-result-object v1

    .line 2044
    throw v1

    .line 2045
    :cond_55
    :goto_26
    iget v2, v0, LM2/l;->v:I

    .line 2046
    .line 2047
    const/16 v10, 0x8

    .line 2048
    .line 2049
    if-ne v2, v10, :cond_57

    .line 2050
    .line 2051
    iget-wide v7, v0, LM2/l;->u:J

    .line 2052
    .line 2053
    cmp-long v2, v7, v5

    .line 2054
    .line 2055
    if-gtz v2, :cond_56

    .line 2056
    .line 2057
    new-instance v2, LQ1/o;

    .line 2058
    .line 2059
    iget-wide v4, v0, LM2/l;->u:J

    .line 2060
    .line 2061
    long-to-int v4, v4

    .line 2062
    invoke-direct {v2, v4}, LQ1/o;-><init>(I)V

    .line 2063
    .line 2064
    .line 2065
    iget-object v3, v3, LQ1/o;->a:[B

    .line 2066
    .line 2067
    iget-object v4, v2, LQ1/o;->a:[B

    .line 2068
    .line 2069
    const/4 v7, 0x0

    .line 2070
    const/16 v10, 0x8

    .line 2071
    .line 2072
    invoke-static {v3, v7, v4, v7, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2073
    .line 2074
    .line 2075
    iput-object v2, v0, LM2/l;->w:LQ1/o;

    .line 2076
    .line 2077
    const/4 v10, 0x1

    .line 2078
    iput v10, v0, LM2/l;->s:I

    .line 2079
    .line 2080
    goto :goto_28

    .line 2081
    :cond_56
    const-string v1, "Leaf atom with length > 2147483647 (unsupported)."

    .line 2082
    .line 2083
    invoke-static {v1}, LN1/D;->c(Ljava/lang/String;)LN1/D;

    .line 2084
    .line 2085
    .line 2086
    move-result-object v1

    .line 2087
    throw v1

    .line 2088
    :cond_57
    const-string v1, "Leaf atom defines extended atom size (unsupported)."

    .line 2089
    .line 2090
    invoke-static {v1}, LN1/D;->c(Ljava/lang/String;)LN1/D;

    .line 2091
    .line 2092
    .line 2093
    move-result-object v1

    .line 2094
    throw v1

    .line 2095
    :goto_27
    move-object v3, v1

    .line 2096
    check-cast v3, Ls2/j;

    .line 2097
    .line 2098
    iget-wide v5, v3, Ls2/j;->d:J

    .line 2099
    .line 2100
    iget-wide v7, v0, LM2/l;->u:J

    .line 2101
    .line 2102
    add-long/2addr v5, v7

    .line 2103
    const-wide/16 v7, 0x8

    .line 2104
    .line 2105
    sub-long/2addr v5, v7

    .line 2106
    new-instance v3, LR1/b;

    .line 2107
    .line 2108
    invoke-direct {v3, v2, v5, v6}, LR1/b;-><init>(IJ)V

    .line 2109
    .line 2110
    .line 2111
    invoke-virtual {v4, v3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 2112
    .line 2113
    .line 2114
    iget-wide v2, v0, LM2/l;->u:J

    .line 2115
    .line 2116
    iget v4, v0, LM2/l;->v:I

    .line 2117
    .line 2118
    int-to-long v7, v4

    .line 2119
    cmp-long v2, v2, v7

    .line 2120
    .line 2121
    if-nez v2, :cond_58

    .line 2122
    .line 2123
    invoke-virtual {v0, v5, v6}, LM2/l;->d(J)V

    .line 2124
    .line 2125
    .line 2126
    goto :goto_28

    .line 2127
    :cond_58
    const/4 v7, 0x0

    .line 2128
    iput v7, v0, LM2/l;->s:I

    .line 2129
    .line 2130
    iput v7, v0, LM2/l;->v:I

    .line 2131
    .line 2132
    :goto_28
    move v2, v10

    .line 2133
    goto/16 :goto_1

    .line 2134
    .line 2135
    :cond_59
    const-string v1, "Atom size less than header length (unsupported)."

    .line 2136
    .line 2137
    invoke-static {v1}, LN1/D;->c(Ljava/lang/String;)LN1/D;

    .line 2138
    .line 2139
    .line 2140
    move-result-object v1

    .line 2141
    throw v1
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method
