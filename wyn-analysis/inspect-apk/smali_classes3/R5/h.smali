.class public final LR5/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ5/k;


# static fields
.field public static final E:[B

.field public static final F:LE5/T;


# instance fields
.field public A:LJ5/m;

.field public B:[LJ5/w;

.field public C:[LJ5/w;

.field public D:Z

.field public final a:Ljava/util/List;

.field public final b:Landroid/util/SparseArray;

.field public final c:LY4/b;

.field public final d:LY4/b;

.field public final e:LY4/b;

.field public final f:[B

.field public final g:LY4/b;

.field public final h:LX2/j;

.field public final i:LY4/b;

.field public final j:Ljava/util/ArrayDeque;

.field public final k:Ljava/util/ArrayDeque;

.field public l:I

.field public m:I

.field public n:J

.field public o:I

.field public p:LY4/b;

.field public q:J

.field public r:I

.field public s:J

.field public t:J

.field public u:J

.field public v:LR5/g;

.field public w:I

.field public x:I

.field public y:I

.field public z:Z


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
    sput-object v0, LR5/h;->E:[B

    .line 9
    .line 10
    new-instance v0, LE5/S;

    .line 11
    .line 12
    invoke-direct {v0}, LE5/S;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "application/x-emsg"

    .line 16
    .line 17
    iput-object v1, v0, LE5/S;->k:Ljava/lang/String;

    .line 18
    .line 19
    new-instance v1, LE5/T;

    .line 20
    .line 21
    invoke-direct {v1, v0}, LE5/T;-><init>(LE5/S;)V

    .line 22
    .line 23
    .line 24
    sput-object v1, LR5/h;->F:LE5/T;

    .line 25
    .line 26
    return-void

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

.method public constructor <init>()V
    .locals 3

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, LR5/h;->a:Ljava/util/List;

    .line 11
    .line 12
    new-instance v0, LX2/j;

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-direct {v0, v1}, LX2/j;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, LR5/h;->h:LX2/j;

    .line 19
    .line 20
    new-instance v0, LY4/b;

    .line 21
    .line 22
    const/16 v1, 0x10

    .line 23
    .line 24
    invoke-direct {v0, v1}, LY4/b;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, LR5/h;->i:LY4/b;

    .line 28
    .line 29
    new-instance v0, LY4/b;

    .line 30
    .line 31
    sget-object v2, Lu6/a;->d:[B

    .line 32
    .line 33
    invoke-direct {v0, v2}, LY4/b;-><init>([B)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, LR5/h;->c:LY4/b;

    .line 37
    .line 38
    new-instance v0, LY4/b;

    .line 39
    .line 40
    const/4 v2, 0x5

    .line 41
    invoke-direct {v0, v2}, LY4/b;-><init>(I)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, LR5/h;->d:LY4/b;

    .line 45
    .line 46
    new-instance v0, LY4/b;

    .line 47
    .line 48
    invoke-direct {v0}, LY4/b;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, LR5/h;->e:LY4/b;

    .line 52
    .line 53
    new-array v0, v1, [B

    .line 54
    .line 55
    iput-object v0, p0, LR5/h;->f:[B

    .line 56
    .line 57
    new-instance v1, LY4/b;

    .line 58
    .line 59
    invoke-direct {v1, v0}, LY4/b;-><init>([B)V

    .line 60
    .line 61
    .line 62
    iput-object v1, p0, LR5/h;->g:LY4/b;

    .line 63
    .line 64
    new-instance v0, Ljava/util/ArrayDeque;

    .line 65
    .line 66
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object v0, p0, LR5/h;->j:Ljava/util/ArrayDeque;

    .line 70
    .line 71
    new-instance v0, Ljava/util/ArrayDeque;

    .line 72
    .line 73
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, LR5/h;->k:Ljava/util/ArrayDeque;

    .line 77
    .line 78
    new-instance v0, Landroid/util/SparseArray;

    .line 79
    .line 80
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 81
    .line 82
    .line 83
    iput-object v0, p0, LR5/h;->b:Landroid/util/SparseArray;

    .line 84
    .line 85
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    iput-wide v0, p0, LR5/h;->t:J

    .line 91
    .line 92
    iput-wide v0, p0, LR5/h;->s:J

    .line 93
    .line 94
    iput-wide v0, p0, LR5/h;->u:J

    .line 95
    .line 96
    sget-object v0, LJ5/m;->N8:Lm9/S;

    .line 97
    .line 98
    iput-object v0, p0, LR5/h;->A:LJ5/m;

    .line 99
    .line 100
    const/4 v0, 0x0

    .line 101
    new-array v1, v0, [LJ5/w;

    .line 102
    .line 103
    iput-object v1, p0, LR5/h;->B:[LJ5/w;

    .line 104
    .line 105
    new-array v0, v0, [LJ5/w;

    .line 106
    .line 107
    iput-object v0, p0, LR5/h;->C:[LJ5/w;

    .line 108
    .line 109
    return-void
.end method

.method public static b(Ljava/util/ArrayList;)LI5/c;
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
    check-cast v5, LR5/b;

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
    iget-object v5, v5, LR5/b;->c:LY4/b;

    .line 32
    .line 33
    iget-object v5, v5, LY4/b;->a:[B

    .line 34
    .line 35
    invoke-static {v5}, LR5/i;->d([B)LS3/l;

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
    iget-object v6, v6, LS3/l;->a:Ljava/lang/Object;

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
    invoke-static {v5, v6}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    new-instance v7, LI5/b;

    .line 58
    .line 59
    const-string v8, "video/mp4"

    .line 60
    .line 61
    invoke-direct {v7, v6, v1, v8, v5}, LI5/b;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

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
    new-instance p0, LI5/c;

    .line 74
    .line 75
    new-array v0, v2, [LI5/b;

    .line 76
    .line 77
    invoke-interface {v4, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, [LI5/b;

    .line 82
    .line 83
    invoke-direct {p0, v1, v2, v0}, LI5/c;-><init>(Ljava/lang/String;Z[LI5/b;)V

    .line 84
    .line 85
    .line 86
    return-object p0
.end method

.method public static c(LY4/b;ILM2/u;)V
    .locals 4

    .line 1
    add-int/lit8 p1, p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LY4/b;->A(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LY4/b;->d()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    and-int/lit8 v0, p1, 0x1

    .line 11
    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    and-int/lit8 p1, p1, 0x2

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    move p1, v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move p1, v1

    .line 23
    :goto_0
    invoke-virtual {p0}, LY4/b;->t()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    iget-object p0, p2, LM2/u;->k:[Z

    .line 30
    .line 31
    iget p1, p2, LM2/u;->d:I

    .line 32
    .line 33
    invoke-static {p0, v1, p1, v1}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    iget v3, p2, LM2/u;->d:I

    .line 38
    .line 39
    if-ne v2, v3, :cond_2

    .line 40
    .line 41
    iget-object v3, p2, LM2/u;->k:[Z

    .line 42
    .line 43
    invoke-static {v3, v1, v2, p1}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, LY4/b;->a()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iget-object v2, p2, LM2/u;->q:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, LY4/b;

    .line 53
    .line 54
    invoke-virtual {v2, p1}, LY4/b;->x(I)V

    .line 55
    .line 56
    .line 57
    iput-boolean v0, p2, LM2/u;->j:Z

    .line 58
    .line 59
    iput-boolean v0, p2, LM2/u;->l:Z

    .line 60
    .line 61
    iget-object p1, v2, LY4/b;->a:[B

    .line 62
    .line 63
    iget v0, v2, LY4/b;->c:I

    .line 64
    .line 65
    invoke-virtual {p0, v1, v0, p1}, LY4/b;->c(II[B)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v1}, LY4/b;->A(I)V

    .line 69
    .line 70
    .line 71
    iput-boolean v1, p2, LM2/u;->l:Z

    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    const-string p0, "Senc sample count "

    .line 75
    .line 76
    const-string p1, " is different from fragment sample count"

    .line 77
    .line 78
    invoke-static {v2, p0, p1}, Lpd/f;->l(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    iget p1, p2, LM2/u;->d:I

    .line 83
    .line 84
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    const/4 p1, 0x0

    .line 92
    invoke-static {p0, p1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    throw p0

    .line 97
    :cond_3
    const-string p0, "Overriding TrackEncryptionBox parameters is unsupported."

    .line 98
    .line 99
    invoke-static {p0}, LE5/o0;->b(Ljava/lang/String;)LE5/o0;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    throw p0
.end method


# virtual methods
.method public final a(JJ)V
    .locals 3

    .line 1
    iget-object p1, p0, LR5/h;->b:Landroid/util/SparseArray;

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
    check-cast v2, LR5/g;

    .line 16
    .line 17
    invoke-virtual {v2}, LR5/g;->d()V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p1, p0, LR5/h;->k:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 26
    .line 27
    .line 28
    iput v0, p0, LR5/h;->r:I

    .line 29
    .line 30
    iput-wide p3, p0, LR5/h;->s:J

    .line 31
    .line 32
    iget-object p1, p0, LR5/h;->j:Ljava/util/ArrayDeque;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 35
    .line 36
    .line 37
    iput v0, p0, LR5/h;->l:I

    .line 38
    .line 39
    iput v0, p0, LR5/h;->o:I

    .line 40
    .line 41
    return-void
.end method

.method public final d(J)V
    .locals 54

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v5, 0x1

    .line 4
    :goto_0
    iget-object v6, v0, LR5/h;->j:Ljava/util/ArrayDeque;

    .line 5
    .line 6
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v7

    .line 10
    if-nez v7, :cond_54

    .line 11
    .line 12
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v7

    .line 16
    check-cast v7, LR5/a;

    .line 17
    .line 18
    iget-wide v9, v7, LR5/a;->c:J

    .line 19
    .line 20
    cmp-long v7, v9, p1

    .line 21
    .line 22
    if-nez v7, :cond_54

    .line 23
    .line 24
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    move-object v9, v7

    .line 29
    check-cast v9, LR5/a;

    .line 30
    .line 31
    iget v7, v9, LH5/a;->b:I

    .line 32
    .line 33
    iget-object v10, v0, LR5/h;->b:Landroid/util/SparseArray;

    .line 34
    .line 35
    iget-object v11, v9, LR5/a;->d:Ljava/util/ArrayList;

    .line 36
    .line 37
    const v12, 0x6d6f6f76

    .line 38
    .line 39
    .line 40
    const/16 v13, 0xc

    .line 41
    .line 42
    if-ne v7, v12, :cond_b

    .line 43
    .line 44
    invoke-static {v11}, LR5/h;->b(Ljava/util/ArrayList;)LI5/c;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    const v7, 0x6d766578

    .line 49
    .line 50
    .line 51
    invoke-virtual {v9, v7}, LR5/a;->o(I)LR5/a;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    new-instance v11, Landroid/util/SparseArray;

    .line 59
    .line 60
    invoke-direct {v11}, Landroid/util/SparseArray;-><init>()V

    .line 61
    .line 62
    .line 63
    iget-object v7, v7, LR5/a;->d:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 66
    .line 67
    .line 68
    move-result v12

    .line 69
    const/4 v2, 0x0

    .line 70
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    const/16 v17, 0x10

    .line 76
    .line 77
    :goto_1
    if-ge v2, v12, :cond_3

    .line 78
    .line 79
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v16

    .line 83
    const/16 v18, 0x2

    .line 84
    .line 85
    move-object/from16 v3, v16

    .line 86
    .line 87
    check-cast v3, LR5/b;

    .line 88
    .line 89
    const/16 v19, 0x4

    .line 90
    .line 91
    iget v1, v3, LH5/a;->b:I

    .line 92
    .line 93
    const v8, 0x74726578

    .line 94
    .line 95
    .line 96
    iget-object v3, v3, LR5/b;->c:LY4/b;

    .line 97
    .line 98
    if-ne v1, v8, :cond_0

    .line 99
    .line 100
    invoke-virtual {v3, v13}, LY4/b;->A(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3}, LY4/b;->d()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    invoke-virtual {v3}, LY4/b;->d()I

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    sub-int/2addr v8, v5

    .line 112
    invoke-virtual {v3}, LY4/b;->d()I

    .line 113
    .line 114
    .line 115
    move-result v13

    .line 116
    move/from16 v21, v5

    .line 117
    .line 118
    invoke-virtual {v3}, LY4/b;->d()I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    invoke-virtual {v3}, LY4/b;->d()I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    new-instance v4, LR5/e;

    .line 131
    .line 132
    invoke-direct {v4, v8, v13, v5, v3}, LR5/e;-><init>(IIII)V

    .line 133
    .line 134
    .line 135
    invoke-static {v1, v4}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    iget-object v3, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v3, Ljava/lang/Integer;

    .line 142
    .line 143
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v1, LR5/e;

    .line 150
    .line 151
    invoke-virtual {v11, v3, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_0
    move/from16 v21, v5

    .line 156
    .line 157
    const v4, 0x6d656864

    .line 158
    .line 159
    .line 160
    if-ne v1, v4, :cond_2

    .line 161
    .line 162
    const/16 v1, 0x8

    .line 163
    .line 164
    invoke-virtual {v3, v1}, LY4/b;->A(I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3}, LY4/b;->d()I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    invoke-static {v1}, LH5/a;->n(I)I

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-nez v1, :cond_1

    .line 176
    .line 177
    invoke-virtual {v3}, LY4/b;->r()J

    .line 178
    .line 179
    .line 180
    move-result-wide v3

    .line 181
    goto :goto_2

    .line 182
    :cond_1
    invoke-virtual {v3}, LY4/b;->u()J

    .line 183
    .line 184
    .line 185
    move-result-wide v3

    .line 186
    :goto_2
    move-wide v14, v3

    .line 187
    :cond_2
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 188
    .line 189
    move/from16 v5, v21

    .line 190
    .line 191
    const/16 v13, 0xc

    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_3
    move/from16 v21, v5

    .line 195
    .line 196
    const/16 v18, 0x2

    .line 197
    .line 198
    const/16 v19, 0x4

    .line 199
    .line 200
    new-instance v1, LJ5/q;

    .line 201
    .line 202
    invoke-direct {v1}, LJ5/q;-><init>()V

    .line 203
    .line 204
    .line 205
    new-instance v2, LPc/b;

    .line 206
    .line 207
    const/16 v3, 0x1a

    .line 208
    .line 209
    invoke-direct {v2, v0, v3}, LPc/b;-><init>(Ljava/lang/Object;I)V

    .line 210
    .line 211
    .line 212
    move-object v3, v11

    .line 213
    move-wide v11, v14

    .line 214
    const/4 v15, 0x0

    .line 215
    const/4 v14, 0x0

    .line 216
    move-object v13, v10

    .line 217
    move-object v10, v1

    .line 218
    move-object v1, v13

    .line 219
    move-object/from16 v16, v2

    .line 220
    .line 221
    move-object v13, v6

    .line 222
    invoke-static/range {v9 .. v16}, LR5/d;->e(LR5/a;LJ5/q;JLI5/c;ZZLk8/h;)Ljava/util/ArrayList;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    if-nez v5, :cond_8

    .line 235
    .line 236
    const/4 v5, 0x0

    .line 237
    :goto_4
    if-ge v5, v4, :cond_5

    .line 238
    .line 239
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    check-cast v6, LR5/p;

    .line 244
    .line 245
    iget-object v7, v6, LR5/p;->a:LR5/n;

    .line 246
    .line 247
    new-instance v8, LR5/g;

    .line 248
    .line 249
    iget-object v9, v0, LR5/h;->A:LJ5/m;

    .line 250
    .line 251
    iget v10, v7, LR5/n;->b:I

    .line 252
    .line 253
    invoke-interface {v9, v5, v10}, LJ5/m;->m(II)LJ5/w;

    .line 254
    .line 255
    .line 256
    move-result-object v9

    .line 257
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 258
    .line 259
    .line 260
    move-result v10

    .line 261
    iget v11, v7, LR5/n;->a:I

    .line 262
    .line 263
    move/from16 v12, v21

    .line 264
    .line 265
    if-ne v10, v12, :cond_4

    .line 266
    .line 267
    const/4 v10, 0x0

    .line 268
    invoke-virtual {v3, v10}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v12

    .line 272
    check-cast v12, LR5/e;

    .line 273
    .line 274
    goto :goto_5

    .line 275
    :cond_4
    invoke-virtual {v3, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v10

    .line 279
    move-object v12, v10

    .line 280
    check-cast v12, LR5/e;

    .line 281
    .line 282
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    :goto_5
    invoke-direct {v8, v9, v6, v12}, LR5/g;-><init>(LJ5/w;LR5/p;LR5/e;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1, v11, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    iget-wide v8, v0, LR5/h;->t:J

    .line 292
    .line 293
    iget-wide v6, v7, LR5/n;->e:J

    .line 294
    .line 295
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 296
    .line 297
    .line 298
    move-result-wide v6

    .line 299
    iput-wide v6, v0, LR5/h;->t:J

    .line 300
    .line 301
    const/16 v21, 0x1

    .line 302
    .line 303
    add-int/lit8 v5, v5, 0x1

    .line 304
    .line 305
    const/16 v21, 0x1

    .line 306
    .line 307
    goto :goto_4

    .line 308
    :cond_5
    iget-object v1, v0, LR5/h;->A:LJ5/m;

    .line 309
    .line 310
    invoke-interface {v1}, LJ5/m;->l()V

    .line 311
    .line 312
    .line 313
    :cond_6
    move/from16 v11, v17

    .line 314
    .line 315
    move/from16 v5, v18

    .line 316
    .line 317
    const/16 v15, 0x8

    .line 318
    .line 319
    :cond_7
    const/16 v21, 0x1

    .line 320
    .line 321
    goto/16 :goto_3c

    .line 322
    .line 323
    :cond_8
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 324
    .line 325
    .line 326
    move-result v5

    .line 327
    if-ne v5, v4, :cond_9

    .line 328
    .line 329
    const/4 v5, 0x1

    .line 330
    goto :goto_6

    .line 331
    :cond_9
    const/4 v5, 0x0

    .line 332
    :goto_6
    invoke-static {v5}, Lu6/a;->i(Z)V

    .line 333
    .line 334
    .line 335
    const/4 v5, 0x0

    .line 336
    :goto_7
    if-ge v5, v4, :cond_6

    .line 337
    .line 338
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v6

    .line 342
    check-cast v6, LR5/p;

    .line 343
    .line 344
    iget-object v7, v6, LR5/p;->a:LR5/n;

    .line 345
    .line 346
    iget v8, v7, LR5/n;->a:I

    .line 347
    .line 348
    invoke-virtual {v1, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v8

    .line 352
    check-cast v8, LR5/g;

    .line 353
    .line 354
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 355
    .line 356
    .line 357
    move-result v9

    .line 358
    const/4 v12, 0x1

    .line 359
    if-ne v9, v12, :cond_a

    .line 360
    .line 361
    const/4 v10, 0x0

    .line 362
    invoke-virtual {v3, v10}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v7

    .line 366
    check-cast v7, LR5/e;

    .line 367
    .line 368
    goto :goto_8

    .line 369
    :cond_a
    iget v7, v7, LR5/n;->a:I

    .line 370
    .line 371
    invoke-virtual {v3, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v7

    .line 375
    check-cast v7, LR5/e;

    .line 376
    .line 377
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    :goto_8
    iput-object v6, v8, LR5/g;->d:LR5/p;

    .line 381
    .line 382
    iput-object v7, v8, LR5/g;->e:LR5/e;

    .line 383
    .line 384
    iget-object v6, v6, LR5/p;->a:LR5/n;

    .line 385
    .line 386
    iget-object v6, v6, LR5/n;->f:LE5/T;

    .line 387
    .line 388
    iget-object v7, v8, LR5/g;->a:LJ5/w;

    .line 389
    .line 390
    invoke-interface {v7, v6}, LJ5/w;->a(LE5/T;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v8}, LR5/g;->d()V

    .line 394
    .line 395
    .line 396
    const/16 v21, 0x1

    .line 397
    .line 398
    add-int/lit8 v5, v5, 0x1

    .line 399
    .line 400
    goto :goto_7

    .line 401
    :cond_b
    move-object v1, v10

    .line 402
    const/16 v17, 0x10

    .line 403
    .line 404
    const/16 v18, 0x2

    .line 405
    .line 406
    const/16 v19, 0x4

    .line 407
    .line 408
    const v2, 0x6d6f6f66

    .line 409
    .line 410
    .line 411
    if-ne v7, v2, :cond_52

    .line 412
    .line 413
    iget-object v2, v9, LR5/a;->e:Ljava/util/ArrayList;

    .line 414
    .line 415
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 416
    .line 417
    .line 418
    move-result v3

    .line 419
    const/4 v10, 0x0

    .line 420
    :goto_9
    if-ge v10, v3, :cond_4c

    .line 421
    .line 422
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v5

    .line 426
    check-cast v5, LR5/a;

    .line 427
    .line 428
    iget v6, v5, LH5/a;->b:I

    .line 429
    .line 430
    const v7, 0x74726166

    .line 431
    .line 432
    .line 433
    if-ne v6, v7, :cond_4b

    .line 434
    .line 435
    const v6, 0x74666864

    .line 436
    .line 437
    .line 438
    invoke-virtual {v5, v6}, LR5/a;->q(I)LR5/b;

    .line 439
    .line 440
    .line 441
    move-result-object v6

    .line 442
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 443
    .line 444
    .line 445
    iget-object v6, v6, LR5/b;->c:LY4/b;

    .line 446
    .line 447
    const/16 v7, 0x8

    .line 448
    .line 449
    invoke-virtual {v6, v7}, LY4/b;->A(I)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v6}, LY4/b;->d()I

    .line 453
    .line 454
    .line 455
    move-result v7

    .line 456
    invoke-virtual {v6}, LY4/b;->d()I

    .line 457
    .line 458
    .line 459
    move-result v8

    .line 460
    invoke-virtual {v1, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v8

    .line 464
    check-cast v8, LR5/g;

    .line 465
    .line 466
    if-nez v8, :cond_c

    .line 467
    .line 468
    const/4 v8, 0x0

    .line 469
    const-wide v23, -0x7fffffffffffffffL    # -4.9E-324

    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    goto :goto_f

    .line 475
    :cond_c
    const/16 v21, 0x1

    .line 476
    .line 477
    and-int/lit8 v9, v7, 0x1

    .line 478
    .line 479
    iget-object v12, v8, LR5/g;->b:LM2/u;

    .line 480
    .line 481
    const-wide v23, -0x7fffffffffffffffL    # -4.9E-324

    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    if-eqz v9, :cond_d

    .line 487
    .line 488
    invoke-virtual {v6}, LY4/b;->u()J

    .line 489
    .line 490
    .line 491
    move-result-wide v14

    .line 492
    iput-wide v14, v12, LM2/u;->a:J

    .line 493
    .line 494
    iput-wide v14, v12, LM2/u;->b:J

    .line 495
    .line 496
    :cond_d
    iget-object v9, v8, LR5/g;->e:LR5/e;

    .line 497
    .line 498
    and-int/lit8 v13, v7, 0x2

    .line 499
    .line 500
    if-eqz v13, :cond_e

    .line 501
    .line 502
    invoke-virtual {v6}, LY4/b;->d()I

    .line 503
    .line 504
    .line 505
    move-result v13

    .line 506
    const/16 v21, 0x1

    .line 507
    .line 508
    add-int/lit8 v13, v13, -0x1

    .line 509
    .line 510
    :goto_a
    const/16 v22, 0x8

    .line 511
    .line 512
    goto :goto_b

    .line 513
    :cond_e
    iget v13, v9, LR5/e;->a:I

    .line 514
    .line 515
    goto :goto_a

    .line 516
    :goto_b
    and-int/lit8 v14, v7, 0x8

    .line 517
    .line 518
    if-eqz v14, :cond_f

    .line 519
    .line 520
    invoke-virtual {v6}, LY4/b;->d()I

    .line 521
    .line 522
    .line 523
    move-result v14

    .line 524
    goto :goto_c

    .line 525
    :cond_f
    iget v14, v9, LR5/e;->b:I

    .line 526
    .line 527
    :goto_c
    and-int/lit8 v15, v7, 0x10

    .line 528
    .line 529
    if-eqz v15, :cond_10

    .line 530
    .line 531
    invoke-virtual {v6}, LY4/b;->d()I

    .line 532
    .line 533
    .line 534
    move-result v15

    .line 535
    goto :goto_d

    .line 536
    :cond_10
    iget v15, v9, LR5/e;->c:I

    .line 537
    .line 538
    :goto_d
    and-int/lit8 v7, v7, 0x20

    .line 539
    .line 540
    if-eqz v7, :cond_11

    .line 541
    .line 542
    invoke-virtual {v6}, LY4/b;->d()I

    .line 543
    .line 544
    .line 545
    move-result v6

    .line 546
    goto :goto_e

    .line 547
    :cond_11
    iget v6, v9, LR5/e;->d:I

    .line 548
    .line 549
    :goto_e
    new-instance v7, LR5/e;

    .line 550
    .line 551
    invoke-direct {v7, v13, v14, v15, v6}, LR5/e;-><init>(IIII)V

    .line 552
    .line 553
    .line 554
    iput-object v7, v12, LM2/u;->o:Ljava/lang/Object;

    .line 555
    .line 556
    :goto_f
    if-nez v8, :cond_12

    .line 557
    .line 558
    move-object/from16 v25, v2

    .line 559
    .line 560
    move/from16 v30, v3

    .line 561
    .line 562
    move/from16 v32, v10

    .line 563
    .line 564
    move-object/from16 v42, v11

    .line 565
    .line 566
    move/from16 v11, v17

    .line 567
    .line 568
    move/from16 v5, v18

    .line 569
    .line 570
    const/16 v16, 0xc

    .line 571
    .line 572
    :goto_10
    const/16 v15, 0x8

    .line 573
    .line 574
    const/16 v21, 0x1

    .line 575
    .line 576
    goto/16 :goto_37

    .line 577
    .line 578
    :cond_12
    iget-object v6, v8, LR5/g;->b:LM2/u;

    .line 579
    .line 580
    iget-wide v12, v6, LM2/u;->m:J

    .line 581
    .line 582
    iget-boolean v7, v6, LM2/u;->n:Z

    .line 583
    .line 584
    invoke-virtual {v8}, LR5/g;->d()V

    .line 585
    .line 586
    .line 587
    const/4 v9, 0x1

    .line 588
    iput-boolean v9, v8, LR5/g;->l:Z

    .line 589
    .line 590
    const v14, 0x74666474

    .line 591
    .line 592
    .line 593
    invoke-virtual {v5, v14}, LR5/a;->q(I)LR5/b;

    .line 594
    .line 595
    .line 596
    move-result-object v14

    .line 597
    if-eqz v14, :cond_14

    .line 598
    .line 599
    iget-object v7, v14, LR5/b;->c:LY4/b;

    .line 600
    .line 601
    const/16 v12, 0x8

    .line 602
    .line 603
    invoke-virtual {v7, v12}, LY4/b;->A(I)V

    .line 604
    .line 605
    .line 606
    invoke-virtual {v7}, LY4/b;->d()I

    .line 607
    .line 608
    .line 609
    move-result v12

    .line 610
    invoke-static {v12}, LH5/a;->n(I)I

    .line 611
    .line 612
    .line 613
    move-result v12

    .line 614
    if-ne v12, v9, :cond_13

    .line 615
    .line 616
    invoke-virtual {v7}, LY4/b;->u()J

    .line 617
    .line 618
    .line 619
    move-result-wide v12

    .line 620
    goto :goto_11

    .line 621
    :cond_13
    invoke-virtual {v7}, LY4/b;->r()J

    .line 622
    .line 623
    .line 624
    move-result-wide v12

    .line 625
    :goto_11
    iput-wide v12, v6, LM2/u;->m:J

    .line 626
    .line 627
    iput-boolean v9, v6, LM2/u;->n:Z

    .line 628
    .line 629
    goto :goto_12

    .line 630
    :cond_14
    iput-wide v12, v6, LM2/u;->m:J

    .line 631
    .line 632
    iput-boolean v7, v6, LM2/u;->n:Z

    .line 633
    .line 634
    :goto_12
    iget-object v7, v5, LR5/a;->d:Ljava/util/ArrayList;

    .line 635
    .line 636
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 637
    .line 638
    .line 639
    move-result v9

    .line 640
    const/4 v12, 0x0

    .line 641
    const/4 v13, 0x0

    .line 642
    const/4 v14, 0x0

    .line 643
    :goto_13
    const v15, 0x7472756e

    .line 644
    .line 645
    .line 646
    if-ge v12, v9, :cond_16

    .line 647
    .line 648
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v25

    .line 652
    move-object/from16 v4, v25

    .line 653
    .line 654
    check-cast v4, LR5/b;

    .line 655
    .line 656
    move-object/from16 v25, v2

    .line 657
    .line 658
    iget v2, v4, LH5/a;->b:I

    .line 659
    .line 660
    if-ne v2, v15, :cond_15

    .line 661
    .line 662
    iget-object v2, v4, LR5/b;->c:LY4/b;

    .line 663
    .line 664
    const/16 v4, 0xc

    .line 665
    .line 666
    invoke-virtual {v2, v4}, LY4/b;->A(I)V

    .line 667
    .line 668
    .line 669
    invoke-virtual {v2}, LY4/b;->t()I

    .line 670
    .line 671
    .line 672
    move-result v2

    .line 673
    if-lez v2, :cond_15

    .line 674
    .line 675
    add-int/2addr v14, v2

    .line 676
    const/16 v21, 0x1

    .line 677
    .line 678
    add-int/lit8 v13, v13, 0x1

    .line 679
    .line 680
    goto :goto_14

    .line 681
    :cond_15
    const/16 v21, 0x1

    .line 682
    .line 683
    :goto_14
    add-int/lit8 v12, v12, 0x1

    .line 684
    .line 685
    move-object/from16 v2, v25

    .line 686
    .line 687
    goto :goto_13

    .line 688
    :cond_16
    move-object/from16 v25, v2

    .line 689
    .line 690
    const/4 v2, 0x0

    .line 691
    iput v2, v8, LR5/g;->h:I

    .line 692
    .line 693
    iput v2, v8, LR5/g;->g:I

    .line 694
    .line 695
    iput v2, v8, LR5/g;->f:I

    .line 696
    .line 697
    iput v13, v6, LM2/u;->c:I

    .line 698
    .line 699
    iput v14, v6, LM2/u;->d:I

    .line 700
    .line 701
    iget-object v2, v6, LM2/u;->f:[I

    .line 702
    .line 703
    array-length v2, v2

    .line 704
    if-ge v2, v13, :cond_17

    .line 705
    .line 706
    new-array v2, v13, [J

    .line 707
    .line 708
    iput-object v2, v6, LM2/u;->e:[J

    .line 709
    .line 710
    new-array v2, v13, [I

    .line 711
    .line 712
    iput-object v2, v6, LM2/u;->f:[I

    .line 713
    .line 714
    :cond_17
    iget-object v2, v6, LM2/u;->g:[I

    .line 715
    .line 716
    array-length v2, v2

    .line 717
    if-ge v2, v14, :cond_18

    .line 718
    .line 719
    mul-int/lit8 v14, v14, 0x7d

    .line 720
    .line 721
    div-int/lit8 v14, v14, 0x64

    .line 722
    .line 723
    new-array v2, v14, [I

    .line 724
    .line 725
    iput-object v2, v6, LM2/u;->g:[I

    .line 726
    .line 727
    new-array v2, v14, [J

    .line 728
    .line 729
    iput-object v2, v6, LM2/u;->h:[J

    .line 730
    .line 731
    new-array v2, v14, [Z

    .line 732
    .line 733
    iput-object v2, v6, LM2/u;->i:[Z

    .line 734
    .line 735
    new-array v2, v14, [Z

    .line 736
    .line 737
    iput-object v2, v6, LM2/u;->k:[Z

    .line 738
    .line 739
    :cond_18
    const/4 v2, 0x0

    .line 740
    const/4 v4, 0x0

    .line 741
    const/4 v12, 0x0

    .line 742
    :goto_15
    if-ge v2, v9, :cond_2c

    .line 743
    .line 744
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    move-result-object v26

    .line 748
    const-wide/16 v27, 0x0

    .line 749
    .line 750
    move-object/from16 v13, v26

    .line 751
    .line 752
    check-cast v13, LR5/b;

    .line 753
    .line 754
    iget v14, v13, LH5/a;->b:I

    .line 755
    .line 756
    if-ne v14, v15, :cond_2b

    .line 757
    .line 758
    const/16 v21, 0x1

    .line 759
    .line 760
    add-int/lit8 v14, v4, 0x1

    .line 761
    .line 762
    iget-object v13, v13, LR5/b;->c:LY4/b;

    .line 763
    .line 764
    const/16 v15, 0x8

    .line 765
    .line 766
    invoke-virtual {v13, v15}, LY4/b;->A(I)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {v13}, LY4/b;->d()I

    .line 770
    .line 771
    .line 772
    move-result v15

    .line 773
    move/from16 v29, v2

    .line 774
    .line 775
    iget-object v2, v8, LR5/g;->d:LR5/p;

    .line 776
    .line 777
    move/from16 v30, v3

    .line 778
    .line 779
    iget-object v3, v6, LM2/u;->o:Ljava/lang/Object;

    .line 780
    .line 781
    check-cast v3, LR5/e;

    .line 782
    .line 783
    sget v31, Lu6/v;->a:I

    .line 784
    .line 785
    move/from16 v31, v4

    .line 786
    .line 787
    iget-object v4, v6, LM2/u;->f:[I

    .line 788
    .line 789
    invoke-virtual {v13}, LY4/b;->t()I

    .line 790
    .line 791
    .line 792
    move-result v32

    .line 793
    aput v32, v4, v31

    .line 794
    .line 795
    iget-object v4, v6, LM2/u;->e:[J

    .line 796
    .line 797
    move/from16 v33, v9

    .line 798
    .line 799
    move/from16 v32, v10

    .line 800
    .line 801
    iget-wide v9, v6, LM2/u;->a:J

    .line 802
    .line 803
    aput-wide v9, v4, v31

    .line 804
    .line 805
    const/16 v21, 0x1

    .line 806
    .line 807
    and-int/lit8 v34, v15, 0x1

    .line 808
    .line 809
    if-eqz v34, :cond_19

    .line 810
    .line 811
    move-object/from16 v34, v4

    .line 812
    .line 813
    invoke-virtual {v13}, LY4/b;->d()I

    .line 814
    .line 815
    .line 816
    move-result v4

    .line 817
    move-wide/from16 v35, v9

    .line 818
    .line 819
    int-to-long v9, v4

    .line 820
    add-long v9, v35, v9

    .line 821
    .line 822
    aput-wide v9, v34, v31

    .line 823
    .line 824
    :cond_19
    and-int/lit8 v4, v15, 0x4

    .line 825
    .line 826
    if-eqz v4, :cond_1a

    .line 827
    .line 828
    const/4 v4, 0x1

    .line 829
    goto :goto_16

    .line 830
    :cond_1a
    const/4 v4, 0x0

    .line 831
    :goto_16
    iget v9, v3, LR5/e;->d:I

    .line 832
    .line 833
    if-eqz v4, :cond_1b

    .line 834
    .line 835
    invoke-virtual {v13}, LY4/b;->d()I

    .line 836
    .line 837
    .line 838
    move-result v9

    .line 839
    :cond_1b
    and-int/lit16 v10, v15, 0x100

    .line 840
    .line 841
    if-eqz v10, :cond_1c

    .line 842
    .line 843
    const/4 v10, 0x1

    .line 844
    goto :goto_17

    .line 845
    :cond_1c
    const/4 v10, 0x0

    .line 846
    :goto_17
    move/from16 v34, v4

    .line 847
    .line 848
    and-int/lit16 v4, v15, 0x200

    .line 849
    .line 850
    if-eqz v4, :cond_1d

    .line 851
    .line 852
    const/4 v4, 0x1

    .line 853
    goto :goto_18

    .line 854
    :cond_1d
    const/4 v4, 0x0

    .line 855
    :goto_18
    move/from16 v35, v4

    .line 856
    .line 857
    and-int/lit16 v4, v15, 0x400

    .line 858
    .line 859
    if-eqz v4, :cond_1e

    .line 860
    .line 861
    const/4 v4, 0x1

    .line 862
    goto :goto_19

    .line 863
    :cond_1e
    const/4 v4, 0x0

    .line 864
    :goto_19
    and-int/lit16 v15, v15, 0x800

    .line 865
    .line 866
    if-eqz v15, :cond_1f

    .line 867
    .line 868
    const/4 v15, 0x1

    .line 869
    goto :goto_1a

    .line 870
    :cond_1f
    const/4 v15, 0x0

    .line 871
    :goto_1a
    iget-object v2, v2, LR5/p;->a:LR5/n;

    .line 872
    .line 873
    move/from16 v36, v4

    .line 874
    .line 875
    iget-object v4, v2, LR5/n;->h:[J

    .line 876
    .line 877
    move/from16 v37, v9

    .line 878
    .line 879
    if-eqz v4, :cond_20

    .line 880
    .line 881
    array-length v9, v4

    .line 882
    move-object/from16 v38, v4

    .line 883
    .line 884
    const/4 v4, 0x1

    .line 885
    if-ne v9, v4, :cond_20

    .line 886
    .line 887
    const/16 v20, 0x0

    .line 888
    .line 889
    aget-wide v39, v38, v20

    .line 890
    .line 891
    cmp-long v4, v39, v27

    .line 892
    .line 893
    if-nez v4, :cond_20

    .line 894
    .line 895
    iget-object v4, v2, LR5/n;->i:[J

    .line 896
    .line 897
    aget-wide v27, v4, v20

    .line 898
    .line 899
    :cond_20
    iget-object v4, v6, LM2/u;->g:[I

    .line 900
    .line 901
    iget-object v9, v6, LM2/u;->h:[J

    .line 902
    .line 903
    move-object/from16 v38, v4

    .line 904
    .line 905
    iget-object v4, v6, LM2/u;->i:[Z

    .line 906
    .line 907
    move-object/from16 v39, v4

    .line 908
    .line 909
    iget-object v4, v6, LM2/u;->f:[I

    .line 910
    .line 911
    aget v4, v4, v31

    .line 912
    .line 913
    add-int/2addr v4, v12

    .line 914
    move-object/from16 v41, v9

    .line 915
    .line 916
    move/from16 v40, v10

    .line 917
    .line 918
    iget-wide v9, v6, LM2/u;->m:J

    .line 919
    .line 920
    :goto_1b
    if-ge v12, v4, :cond_2a

    .line 921
    .line 922
    if-eqz v40, :cond_21

    .line 923
    .line 924
    invoke-virtual {v13}, LY4/b;->d()I

    .line 925
    .line 926
    .line 927
    move-result v31

    .line 928
    move/from16 v42, v31

    .line 929
    .line 930
    move/from16 v31, v4

    .line 931
    .line 932
    move/from16 v4, v42

    .line 933
    .line 934
    :goto_1c
    move-object/from16 v42, v11

    .line 935
    .line 936
    goto :goto_1d

    .line 937
    :cond_21
    move/from16 v31, v4

    .line 938
    .line 939
    iget v4, v3, LR5/e;->b:I

    .line 940
    .line 941
    goto :goto_1c

    .line 942
    :goto_1d
    const-string v11, "Unexpected negative value: "

    .line 943
    .line 944
    if-ltz v4, :cond_29

    .line 945
    .line 946
    if-eqz v35, :cond_22

    .line 947
    .line 948
    invoke-virtual {v13}, LY4/b;->d()I

    .line 949
    .line 950
    .line 951
    move-result v43

    .line 952
    move/from16 v53, v43

    .line 953
    .line 954
    move/from16 v43, v12

    .line 955
    .line 956
    move/from16 v12, v53

    .line 957
    .line 958
    goto :goto_1e

    .line 959
    :cond_22
    move/from16 v43, v12

    .line 960
    .line 961
    iget v12, v3, LR5/e;->c:I

    .line 962
    .line 963
    :goto_1e
    if-ltz v12, :cond_28

    .line 964
    .line 965
    if-eqz v36, :cond_23

    .line 966
    .line 967
    invoke-virtual {v13}, LY4/b;->d()I

    .line 968
    .line 969
    .line 970
    move-result v11

    .line 971
    goto :goto_1f

    .line 972
    :cond_23
    if-nez v43, :cond_24

    .line 973
    .line 974
    if-eqz v34, :cond_24

    .line 975
    .line 976
    move/from16 v11, v37

    .line 977
    .line 978
    goto :goto_1f

    .line 979
    :cond_24
    iget v11, v3, LR5/e;->d:I

    .line 980
    .line 981
    :goto_1f
    if-eqz v15, :cond_25

    .line 982
    .line 983
    invoke-virtual {v13}, LY4/b;->d()I

    .line 984
    .line 985
    .line 986
    move-result v44

    .line 987
    move/from16 v45, v44

    .line 988
    .line 989
    move-object/from16 v44, v3

    .line 990
    .line 991
    move/from16 v3, v45

    .line 992
    .line 993
    :goto_20
    move-object/from16 v46, v13

    .line 994
    .line 995
    move/from16 v45, v14

    .line 996
    .line 997
    goto :goto_21

    .line 998
    :cond_25
    move-object/from16 v44, v3

    .line 999
    .line 1000
    const/4 v3, 0x0

    .line 1001
    goto :goto_20

    .line 1002
    :goto_21
    int-to-long v13, v3

    .line 1003
    add-long/2addr v13, v9

    .line 1004
    sub-long v47, v13, v27

    .line 1005
    .line 1006
    const-wide/32 v49, 0xf4240

    .line 1007
    .line 1008
    .line 1009
    iget-wide v13, v2, LR5/n;->c:J

    .line 1010
    .line 1011
    move-wide/from16 v51, v13

    .line 1012
    .line 1013
    invoke-static/range {v47 .. v52}, Lu6/v;->D(JJJ)J

    .line 1014
    .line 1015
    .line 1016
    move-result-wide v13

    .line 1017
    aput-wide v13, v41, v43

    .line 1018
    .line 1019
    iget-boolean v3, v6, LM2/u;->n:Z

    .line 1020
    .line 1021
    if-nez v3, :cond_26

    .line 1022
    .line 1023
    iget-object v3, v8, LR5/g;->d:LR5/p;

    .line 1024
    .line 1025
    move-object/from16 v47, v2

    .line 1026
    .line 1027
    iget-wide v2, v3, LR5/p;->h:J

    .line 1028
    .line 1029
    add-long/2addr v13, v2

    .line 1030
    aput-wide v13, v41, v43

    .line 1031
    .line 1032
    goto :goto_22

    .line 1033
    :cond_26
    move-object/from16 v47, v2

    .line 1034
    .line 1035
    :goto_22
    aput v12, v38, v43

    .line 1036
    .line 1037
    shr-int/lit8 v2, v11, 0x10

    .line 1038
    .line 1039
    const/16 v21, 0x1

    .line 1040
    .line 1041
    and-int/lit8 v2, v2, 0x1

    .line 1042
    .line 1043
    if-nez v2, :cond_27

    .line 1044
    .line 1045
    move/from16 v2, v21

    .line 1046
    .line 1047
    goto :goto_23

    .line 1048
    :cond_27
    const/4 v2, 0x0

    .line 1049
    :goto_23
    aput-boolean v2, v39, v43

    .line 1050
    .line 1051
    int-to-long v2, v4

    .line 1052
    add-long/2addr v9, v2

    .line 1053
    add-int/lit8 v12, v43, 0x1

    .line 1054
    .line 1055
    move/from16 v4, v31

    .line 1056
    .line 1057
    move-object/from16 v11, v42

    .line 1058
    .line 1059
    move-object/from16 v3, v44

    .line 1060
    .line 1061
    move/from16 v14, v45

    .line 1062
    .line 1063
    move-object/from16 v13, v46

    .line 1064
    .line 1065
    move-object/from16 v2, v47

    .line 1066
    .line 1067
    goto/16 :goto_1b

    .line 1068
    .line 1069
    :cond_28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1070
    .line 1071
    invoke-direct {v1, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v1

    .line 1081
    const/4 v2, 0x0

    .line 1082
    invoke-static {v1, v2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v1

    .line 1086
    throw v1

    .line 1087
    :cond_29
    const/4 v2, 0x0

    .line 1088
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1089
    .line 1090
    invoke-direct {v1, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v1

    .line 1100
    invoke-static {v1, v2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v1

    .line 1104
    throw v1

    .line 1105
    :cond_2a
    move/from16 v31, v4

    .line 1106
    .line 1107
    move-object/from16 v42, v11

    .line 1108
    .line 1109
    move/from16 v45, v14

    .line 1110
    .line 1111
    iput-wide v9, v6, LM2/u;->m:J

    .line 1112
    .line 1113
    move/from16 v12, v31

    .line 1114
    .line 1115
    move/from16 v4, v45

    .line 1116
    .line 1117
    :goto_24
    const/16 v21, 0x1

    .line 1118
    .line 1119
    goto :goto_25

    .line 1120
    :cond_2b
    move/from16 v29, v2

    .line 1121
    .line 1122
    move/from16 v30, v3

    .line 1123
    .line 1124
    move/from16 v31, v4

    .line 1125
    .line 1126
    move/from16 v33, v9

    .line 1127
    .line 1128
    move/from16 v32, v10

    .line 1129
    .line 1130
    move-object/from16 v42, v11

    .line 1131
    .line 1132
    goto :goto_24

    .line 1133
    :goto_25
    add-int/lit8 v2, v29, 0x1

    .line 1134
    .line 1135
    move/from16 v3, v30

    .line 1136
    .line 1137
    move/from16 v10, v32

    .line 1138
    .line 1139
    move/from16 v9, v33

    .line 1140
    .line 1141
    move-object/from16 v11, v42

    .line 1142
    .line 1143
    const v15, 0x7472756e

    .line 1144
    .line 1145
    .line 1146
    goto/16 :goto_15

    .line 1147
    .line 1148
    :cond_2c
    move/from16 v30, v3

    .line 1149
    .line 1150
    move/from16 v32, v10

    .line 1151
    .line 1152
    move-object/from16 v42, v11

    .line 1153
    .line 1154
    const-wide/16 v27, 0x0

    .line 1155
    .line 1156
    iget-object v2, v8, LR5/g;->d:LR5/p;

    .line 1157
    .line 1158
    iget-object v3, v6, LM2/u;->o:Ljava/lang/Object;

    .line 1159
    .line 1160
    check-cast v3, LR5/e;

    .line 1161
    .line 1162
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1163
    .line 1164
    .line 1165
    iget-object v2, v2, LR5/p;->a:LR5/n;

    .line 1166
    .line 1167
    iget-object v2, v2, LR5/n;->k:[LR5/o;

    .line 1168
    .line 1169
    iget v3, v3, LR5/e;->a:I

    .line 1170
    .line 1171
    aget-object v2, v2, v3

    .line 1172
    .line 1173
    const v3, 0x7361697a

    .line 1174
    .line 1175
    .line 1176
    invoke-virtual {v5, v3}, LR5/a;->q(I)LR5/b;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v3

    .line 1180
    if-eqz v3, :cond_33

    .line 1181
    .line 1182
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1183
    .line 1184
    .line 1185
    iget-object v3, v3, LR5/b;->c:LY4/b;

    .line 1186
    .line 1187
    const/16 v15, 0x8

    .line 1188
    .line 1189
    invoke-virtual {v3, v15}, LY4/b;->A(I)V

    .line 1190
    .line 1191
    .line 1192
    invoke-virtual {v3}, LY4/b;->d()I

    .line 1193
    .line 1194
    .line 1195
    move-result v4

    .line 1196
    const/4 v12, 0x1

    .line 1197
    and-int/2addr v4, v12

    .line 1198
    if-ne v4, v12, :cond_2d

    .line 1199
    .line 1200
    invoke-virtual {v3, v15}, LY4/b;->B(I)V

    .line 1201
    .line 1202
    .line 1203
    :cond_2d
    invoke-virtual {v3}, LY4/b;->q()I

    .line 1204
    .line 1205
    .line 1206
    move-result v4

    .line 1207
    invoke-virtual {v3}, LY4/b;->t()I

    .line 1208
    .line 1209
    .line 1210
    move-result v8

    .line 1211
    iget v9, v6, LM2/u;->d:I

    .line 1212
    .line 1213
    if-gt v8, v9, :cond_32

    .line 1214
    .line 1215
    iget v9, v2, LR5/o;->d:I

    .line 1216
    .line 1217
    if-nez v4, :cond_30

    .line 1218
    .line 1219
    iget-object v4, v6, LM2/u;->k:[Z

    .line 1220
    .line 1221
    const/4 v10, 0x0

    .line 1222
    const/4 v11, 0x0

    .line 1223
    :goto_26
    if-ge v10, v8, :cond_2f

    .line 1224
    .line 1225
    invoke-virtual {v3}, LY4/b;->q()I

    .line 1226
    .line 1227
    .line 1228
    move-result v12

    .line 1229
    add-int/2addr v11, v12

    .line 1230
    if-le v12, v9, :cond_2e

    .line 1231
    .line 1232
    const/4 v12, 0x1

    .line 1233
    goto :goto_27

    .line 1234
    :cond_2e
    const/4 v12, 0x0

    .line 1235
    :goto_27
    aput-boolean v12, v4, v10

    .line 1236
    .line 1237
    const/16 v21, 0x1

    .line 1238
    .line 1239
    add-int/lit8 v10, v10, 0x1

    .line 1240
    .line 1241
    goto :goto_26

    .line 1242
    :cond_2f
    const/4 v10, 0x0

    .line 1243
    goto :goto_29

    .line 1244
    :cond_30
    if-le v4, v9, :cond_31

    .line 1245
    .line 1246
    const/4 v3, 0x1

    .line 1247
    goto :goto_28

    .line 1248
    :cond_31
    const/4 v3, 0x0

    .line 1249
    :goto_28
    mul-int v11, v4, v8

    .line 1250
    .line 1251
    iget-object v4, v6, LM2/u;->k:[Z

    .line 1252
    .line 1253
    const/4 v10, 0x0

    .line 1254
    invoke-static {v4, v10, v8, v3}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 1255
    .line 1256
    .line 1257
    :goto_29
    iget-object v3, v6, LM2/u;->k:[Z

    .line 1258
    .line 1259
    iget v4, v6, LM2/u;->d:I

    .line 1260
    .line 1261
    invoke-static {v3, v8, v4, v10}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 1262
    .line 1263
    .line 1264
    if-lez v11, :cond_33

    .line 1265
    .line 1266
    iget-object v3, v6, LM2/u;->q:Ljava/lang/Object;

    .line 1267
    .line 1268
    check-cast v3, LY4/b;

    .line 1269
    .line 1270
    invoke-virtual {v3, v11}, LY4/b;->x(I)V

    .line 1271
    .line 1272
    .line 1273
    const/4 v12, 0x1

    .line 1274
    iput-boolean v12, v6, LM2/u;->j:Z

    .line 1275
    .line 1276
    iput-boolean v12, v6, LM2/u;->l:Z

    .line 1277
    .line 1278
    goto :goto_2a

    .line 1279
    :cond_32
    const-string v1, "Saiz sample count "

    .line 1280
    .line 1281
    const-string v2, " is greater than fragment sample count"

    .line 1282
    .line 1283
    invoke-static {v8, v1, v2}, Lpd/f;->l(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v1

    .line 1287
    iget v2, v6, LM2/u;->d:I

    .line 1288
    .line 1289
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1290
    .line 1291
    .line 1292
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v1

    .line 1296
    const/4 v2, 0x0

    .line 1297
    invoke-static {v1, v2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v1

    .line 1301
    throw v1

    .line 1302
    :cond_33
    :goto_2a
    const v3, 0x7361696f

    .line 1303
    .line 1304
    .line 1305
    invoke-virtual {v5, v3}, LR5/a;->q(I)LR5/b;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v3

    .line 1309
    if-eqz v3, :cond_36

    .line 1310
    .line 1311
    iget-object v3, v3, LR5/b;->c:LY4/b;

    .line 1312
    .line 1313
    const/16 v15, 0x8

    .line 1314
    .line 1315
    invoke-virtual {v3, v15}, LY4/b;->A(I)V

    .line 1316
    .line 1317
    .line 1318
    invoke-virtual {v3}, LY4/b;->d()I

    .line 1319
    .line 1320
    .line 1321
    move-result v4

    .line 1322
    const/4 v12, 0x1

    .line 1323
    and-int/lit8 v8, v4, 0x1

    .line 1324
    .line 1325
    if-ne v8, v12, :cond_34

    .line 1326
    .line 1327
    invoke-virtual {v3, v15}, LY4/b;->B(I)V

    .line 1328
    .line 1329
    .line 1330
    :cond_34
    invoke-virtual {v3}, LY4/b;->t()I

    .line 1331
    .line 1332
    .line 1333
    move-result v8

    .line 1334
    if-ne v8, v12, :cond_37

    .line 1335
    .line 1336
    invoke-static {v4}, LH5/a;->n(I)I

    .line 1337
    .line 1338
    .line 1339
    move-result v4

    .line 1340
    iget-wide v8, v6, LM2/u;->b:J

    .line 1341
    .line 1342
    if-nez v4, :cond_35

    .line 1343
    .line 1344
    invoke-virtual {v3}, LY4/b;->r()J

    .line 1345
    .line 1346
    .line 1347
    move-result-wide v3

    .line 1348
    goto :goto_2b

    .line 1349
    :cond_35
    invoke-virtual {v3}, LY4/b;->u()J

    .line 1350
    .line 1351
    .line 1352
    move-result-wide v3

    .line 1353
    :goto_2b
    add-long/2addr v8, v3

    .line 1354
    iput-wide v8, v6, LM2/u;->b:J

    .line 1355
    .line 1356
    :cond_36
    const/4 v3, 0x0

    .line 1357
    goto :goto_2c

    .line 1358
    :cond_37
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1359
    .line 1360
    const-string v2, "Unexpected saio entry count: "

    .line 1361
    .line 1362
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1363
    .line 1364
    .line 1365
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1366
    .line 1367
    .line 1368
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v1

    .line 1372
    const/4 v3, 0x0

    .line 1373
    invoke-static {v1, v3}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v1

    .line 1377
    throw v1

    .line 1378
    :goto_2c
    const v4, 0x73656e63

    .line 1379
    .line 1380
    .line 1381
    invoke-virtual {v5, v4}, LR5/a;->q(I)LR5/b;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v4

    .line 1385
    if-eqz v4, :cond_38

    .line 1386
    .line 1387
    iget-object v4, v4, LR5/b;->c:LY4/b;

    .line 1388
    .line 1389
    const/4 v10, 0x0

    .line 1390
    invoke-static {v4, v10, v6}, LR5/h;->c(LY4/b;ILM2/u;)V

    .line 1391
    .line 1392
    .line 1393
    :cond_38
    if-eqz v2, :cond_39

    .line 1394
    .line 1395
    iget-object v2, v2, LR5/o;->b:Ljava/lang/String;

    .line 1396
    .line 1397
    move-object v10, v2

    .line 1398
    goto :goto_2d

    .line 1399
    :cond_39
    move-object v10, v3

    .line 1400
    :goto_2d
    move-object v2, v3

    .line 1401
    move-object v4, v2

    .line 1402
    const/4 v5, 0x0

    .line 1403
    :goto_2e
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 1404
    .line 1405
    .line 1406
    move-result v8

    .line 1407
    if-ge v5, v8, :cond_3c

    .line 1408
    .line 1409
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v8

    .line 1413
    check-cast v8, LR5/b;

    .line 1414
    .line 1415
    iget-object v9, v8, LR5/b;->c:LY4/b;

    .line 1416
    .line 1417
    const v11, 0x73626770

    .line 1418
    .line 1419
    .line 1420
    const v12, 0x73656967

    .line 1421
    .line 1422
    .line 1423
    iget v8, v8, LH5/a;->b:I

    .line 1424
    .line 1425
    if-ne v8, v11, :cond_3b

    .line 1426
    .line 1427
    const/16 v11, 0xc

    .line 1428
    .line 1429
    invoke-virtual {v9, v11}, LY4/b;->A(I)V

    .line 1430
    .line 1431
    .line 1432
    invoke-virtual {v9}, LY4/b;->d()I

    .line 1433
    .line 1434
    .line 1435
    move-result v8

    .line 1436
    if-ne v8, v12, :cond_3a

    .line 1437
    .line 1438
    move-object v2, v9

    .line 1439
    :cond_3a
    :goto_2f
    const/4 v12, 0x1

    .line 1440
    goto :goto_30

    .line 1441
    :cond_3b
    const/16 v11, 0xc

    .line 1442
    .line 1443
    const v13, 0x73677064

    .line 1444
    .line 1445
    .line 1446
    if-ne v8, v13, :cond_3a

    .line 1447
    .line 1448
    invoke-virtual {v9, v11}, LY4/b;->A(I)V

    .line 1449
    .line 1450
    .line 1451
    invoke-virtual {v9}, LY4/b;->d()I

    .line 1452
    .line 1453
    .line 1454
    move-result v8

    .line 1455
    if-ne v8, v12, :cond_3a

    .line 1456
    .line 1457
    move-object v4, v9

    .line 1458
    goto :goto_2f

    .line 1459
    :goto_30
    add-int/2addr v5, v12

    .line 1460
    goto :goto_2e

    .line 1461
    :cond_3c
    const/16 v11, 0xc

    .line 1462
    .line 1463
    const/4 v12, 0x1

    .line 1464
    if-eqz v2, :cond_3d

    .line 1465
    .line 1466
    if-nez v4, :cond_3e

    .line 1467
    .line 1468
    :cond_3d
    move/from16 v16, v11

    .line 1469
    .line 1470
    move/from16 v5, v18

    .line 1471
    .line 1472
    goto/16 :goto_33

    .line 1473
    .line 1474
    :cond_3e
    const/16 v15, 0x8

    .line 1475
    .line 1476
    invoke-virtual {v2, v15}, LY4/b;->A(I)V

    .line 1477
    .line 1478
    .line 1479
    invoke-virtual {v2}, LY4/b;->d()I

    .line 1480
    .line 1481
    .line 1482
    move-result v5

    .line 1483
    invoke-static {v5}, LH5/a;->n(I)I

    .line 1484
    .line 1485
    .line 1486
    move-result v5

    .line 1487
    move/from16 v8, v19

    .line 1488
    .line 1489
    invoke-virtual {v2, v8}, LY4/b;->B(I)V

    .line 1490
    .line 1491
    .line 1492
    if-ne v5, v12, :cond_3f

    .line 1493
    .line 1494
    invoke-virtual {v2, v8}, LY4/b;->B(I)V

    .line 1495
    .line 1496
    .line 1497
    :cond_3f
    invoke-virtual {v2}, LY4/b;->d()I

    .line 1498
    .line 1499
    .line 1500
    move-result v2

    .line 1501
    if-ne v2, v12, :cond_47

    .line 1502
    .line 1503
    invoke-virtual {v4, v15}, LY4/b;->A(I)V

    .line 1504
    .line 1505
    .line 1506
    invoke-virtual {v4}, LY4/b;->d()I

    .line 1507
    .line 1508
    .line 1509
    move-result v2

    .line 1510
    invoke-static {v2}, LH5/a;->n(I)I

    .line 1511
    .line 1512
    .line 1513
    move-result v2

    .line 1514
    invoke-virtual {v4, v8}, LY4/b;->B(I)V

    .line 1515
    .line 1516
    .line 1517
    if-ne v2, v12, :cond_41

    .line 1518
    .line 1519
    invoke-virtual {v4}, LY4/b;->r()J

    .line 1520
    .line 1521
    .line 1522
    move-result-wide v12

    .line 1523
    cmp-long v2, v12, v27

    .line 1524
    .line 1525
    if-eqz v2, :cond_40

    .line 1526
    .line 1527
    move/from16 v5, v18

    .line 1528
    .line 1529
    goto :goto_31

    .line 1530
    :cond_40
    const-string v1, "Variable length description in sgpd found (unsupported)"

    .line 1531
    .line 1532
    invoke-static {v1}, LE5/o0;->b(Ljava/lang/String;)LE5/o0;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v1

    .line 1536
    throw v1

    .line 1537
    :cond_41
    move/from16 v5, v18

    .line 1538
    .line 1539
    if-lt v2, v5, :cond_42

    .line 1540
    .line 1541
    invoke-virtual {v4, v8}, LY4/b;->B(I)V

    .line 1542
    .line 1543
    .line 1544
    :cond_42
    :goto_31
    invoke-virtual {v4}, LY4/b;->r()J

    .line 1545
    .line 1546
    .line 1547
    move-result-wide v12

    .line 1548
    const-wide/16 v14, 0x1

    .line 1549
    .line 1550
    cmp-long v2, v12, v14

    .line 1551
    .line 1552
    if-nez v2, :cond_46

    .line 1553
    .line 1554
    const/4 v12, 0x1

    .line 1555
    invoke-virtual {v4, v12}, LY4/b;->B(I)V

    .line 1556
    .line 1557
    .line 1558
    invoke-virtual {v4}, LY4/b;->q()I

    .line 1559
    .line 1560
    .line 1561
    move-result v2

    .line 1562
    and-int/lit16 v9, v2, 0xf0

    .line 1563
    .line 1564
    shr-int/lit8 v13, v9, 0x4

    .line 1565
    .line 1566
    and-int/lit8 v14, v2, 0xf

    .line 1567
    .line 1568
    invoke-virtual {v4}, LY4/b;->q()I

    .line 1569
    .line 1570
    .line 1571
    move-result v2

    .line 1572
    if-ne v2, v12, :cond_43

    .line 1573
    .line 1574
    const/4 v9, 0x1

    .line 1575
    goto :goto_32

    .line 1576
    :cond_43
    const/4 v9, 0x0

    .line 1577
    :goto_32
    if-nez v9, :cond_44

    .line 1578
    .line 1579
    move/from16 v19, v8

    .line 1580
    .line 1581
    move/from16 v16, v11

    .line 1582
    .line 1583
    goto :goto_33

    .line 1584
    :cond_44
    move/from16 v16, v11

    .line 1585
    .line 1586
    invoke-virtual {v4}, LY4/b;->q()I

    .line 1587
    .line 1588
    .line 1589
    move-result v11

    .line 1590
    move/from16 v2, v17

    .line 1591
    .line 1592
    new-array v12, v2, [B

    .line 1593
    .line 1594
    const/4 v15, 0x0

    .line 1595
    invoke-virtual {v4, v15, v2, v12}, LY4/b;->c(II[B)V

    .line 1596
    .line 1597
    .line 1598
    if-nez v11, :cond_45

    .line 1599
    .line 1600
    invoke-virtual {v4}, LY4/b;->q()I

    .line 1601
    .line 1602
    .line 1603
    move-result v2

    .line 1604
    new-array v3, v2, [B

    .line 1605
    .line 1606
    invoke-virtual {v4, v15, v2, v3}, LY4/b;->c(II[B)V

    .line 1607
    .line 1608
    .line 1609
    :cond_45
    move-object v15, v3

    .line 1610
    const/4 v4, 0x1

    .line 1611
    iput-boolean v4, v6, LM2/u;->j:Z

    .line 1612
    .line 1613
    move/from16 v19, v8

    .line 1614
    .line 1615
    new-instance v8, LR5/o;

    .line 1616
    .line 1617
    invoke-direct/range {v8 .. v15}, LR5/o;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 1618
    .line 1619
    .line 1620
    iput-object v8, v6, LM2/u;->p:Ljava/lang/Object;

    .line 1621
    .line 1622
    goto :goto_33

    .line 1623
    :cond_46
    const-string v1, "Entry count in sgpd != 1 (unsupported)."

    .line 1624
    .line 1625
    invoke-static {v1}, LE5/o0;->b(Ljava/lang/String;)LE5/o0;

    .line 1626
    .line 1627
    .line 1628
    move-result-object v1

    .line 1629
    throw v1

    .line 1630
    :cond_47
    const-string v1, "Entry count in sbgp != 1 (unsupported)."

    .line 1631
    .line 1632
    invoke-static {v1}, LE5/o0;->b(Ljava/lang/String;)LE5/o0;

    .line 1633
    .line 1634
    .line 1635
    move-result-object v1

    .line 1636
    throw v1

    .line 1637
    :goto_33
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 1638
    .line 1639
    .line 1640
    move-result v2

    .line 1641
    const/4 v10, 0x0

    .line 1642
    :goto_34
    if-ge v10, v2, :cond_4a

    .line 1643
    .line 1644
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v3

    .line 1648
    check-cast v3, LR5/b;

    .line 1649
    .line 1650
    iget v4, v3, LH5/a;->b:I

    .line 1651
    .line 1652
    const v8, 0x75756964

    .line 1653
    .line 1654
    .line 1655
    if-ne v4, v8, :cond_49

    .line 1656
    .line 1657
    iget-object v3, v3, LR5/b;->c:LY4/b;

    .line 1658
    .line 1659
    const/16 v15, 0x8

    .line 1660
    .line 1661
    invoke-virtual {v3, v15}, LY4/b;->A(I)V

    .line 1662
    .line 1663
    .line 1664
    iget-object v4, v0, LR5/h;->f:[B

    .line 1665
    .line 1666
    const/4 v8, 0x0

    .line 1667
    const/16 v11, 0x10

    .line 1668
    .line 1669
    invoke-virtual {v3, v8, v11, v4}, LY4/b;->c(II[B)V

    .line 1670
    .line 1671
    .line 1672
    sget-object v8, LR5/h;->E:[B

    .line 1673
    .line 1674
    invoke-static {v4, v8}, Ljava/util/Arrays;->equals([B[B)Z

    .line 1675
    .line 1676
    .line 1677
    move-result v4

    .line 1678
    if-nez v4, :cond_48

    .line 1679
    .line 1680
    goto :goto_35

    .line 1681
    :cond_48
    invoke-static {v3, v11, v6}, LR5/h;->c(LY4/b;ILM2/u;)V

    .line 1682
    .line 1683
    .line 1684
    :goto_35
    const/16 v21, 0x1

    .line 1685
    .line 1686
    goto :goto_36

    .line 1687
    :cond_49
    const/16 v11, 0x10

    .line 1688
    .line 1689
    const/16 v15, 0x8

    .line 1690
    .line 1691
    goto :goto_35

    .line 1692
    :goto_36
    add-int/lit8 v10, v10, 0x1

    .line 1693
    .line 1694
    goto :goto_34

    .line 1695
    :cond_4a
    const/16 v11, 0x10

    .line 1696
    .line 1697
    goto/16 :goto_10

    .line 1698
    .line 1699
    :cond_4b
    move-object/from16 v25, v2

    .line 1700
    .line 1701
    move/from16 v30, v3

    .line 1702
    .line 1703
    move/from16 v32, v10

    .line 1704
    .line 1705
    move-object/from16 v42, v11

    .line 1706
    .line 1707
    move/from16 v11, v17

    .line 1708
    .line 1709
    move/from16 v5, v18

    .line 1710
    .line 1711
    const/16 v15, 0x8

    .line 1712
    .line 1713
    const/16 v16, 0xc

    .line 1714
    .line 1715
    const/16 v21, 0x1

    .line 1716
    .line 1717
    const-wide v23, -0x7fffffffffffffffL    # -4.9E-324

    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    :goto_37
    add-int/lit8 v10, v32, 0x1

    .line 1723
    .line 1724
    move/from16 v18, v5

    .line 1725
    .line 1726
    move/from16 v17, v11

    .line 1727
    .line 1728
    move-object/from16 v2, v25

    .line 1729
    .line 1730
    move/from16 v3, v30

    .line 1731
    .line 1732
    move-object/from16 v11, v42

    .line 1733
    .line 1734
    goto/16 :goto_9

    .line 1735
    .line 1736
    :cond_4c
    move-object/from16 v42, v11

    .line 1737
    .line 1738
    move/from16 v11, v17

    .line 1739
    .line 1740
    move/from16 v5, v18

    .line 1741
    .line 1742
    const/4 v3, 0x0

    .line 1743
    const/16 v15, 0x8

    .line 1744
    .line 1745
    const-wide v23, -0x7fffffffffffffffL    # -4.9E-324

    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    invoke-static/range {v42 .. v42}, LR5/h;->b(Ljava/util/ArrayList;)LI5/c;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v2

    .line 1754
    if-eqz v2, :cond_4e

    .line 1755
    .line 1756
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 1757
    .line 1758
    .line 1759
    move-result v4

    .line 1760
    const/4 v10, 0x0

    .line 1761
    :goto_38
    if-ge v10, v4, :cond_4e

    .line 1762
    .line 1763
    invoke-virtual {v1, v10}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1764
    .line 1765
    .line 1766
    move-result-object v6

    .line 1767
    check-cast v6, LR5/g;

    .line 1768
    .line 1769
    iget-object v7, v6, LR5/g;->d:LR5/p;

    .line 1770
    .line 1771
    iget-object v8, v6, LR5/g;->b:LM2/u;

    .line 1772
    .line 1773
    iget-object v8, v8, LM2/u;->o:Ljava/lang/Object;

    .line 1774
    .line 1775
    check-cast v8, LR5/e;

    .line 1776
    .line 1777
    sget v9, Lu6/v;->a:I

    .line 1778
    .line 1779
    iget v8, v8, LR5/e;->a:I

    .line 1780
    .line 1781
    iget-object v7, v7, LR5/p;->a:LR5/n;

    .line 1782
    .line 1783
    iget-object v7, v7, LR5/n;->k:[LR5/o;

    .line 1784
    .line 1785
    aget-object v7, v7, v8

    .line 1786
    .line 1787
    if-eqz v7, :cond_4d

    .line 1788
    .line 1789
    iget-object v7, v7, LR5/o;->b:Ljava/lang/String;

    .line 1790
    .line 1791
    goto :goto_39

    .line 1792
    :cond_4d
    move-object v7, v3

    .line 1793
    :goto_39
    invoke-virtual {v2, v7}, LI5/c;->c(Ljava/lang/String;)LI5/c;

    .line 1794
    .line 1795
    .line 1796
    move-result-object v7

    .line 1797
    iget-object v8, v6, LR5/g;->d:LR5/p;

    .line 1798
    .line 1799
    iget-object v8, v8, LR5/p;->a:LR5/n;

    .line 1800
    .line 1801
    iget-object v8, v8, LR5/n;->f:LE5/T;

    .line 1802
    .line 1803
    invoke-virtual {v8}, LE5/T;->a()LE5/S;

    .line 1804
    .line 1805
    .line 1806
    move-result-object v8

    .line 1807
    iput-object v7, v8, LE5/S;->n:LI5/c;

    .line 1808
    .line 1809
    new-instance v7, LE5/T;

    .line 1810
    .line 1811
    invoke-direct {v7, v8}, LE5/T;-><init>(LE5/S;)V

    .line 1812
    .line 1813
    .line 1814
    iget-object v6, v6, LR5/g;->a:LJ5/w;

    .line 1815
    .line 1816
    invoke-interface {v6, v7}, LJ5/w;->a(LE5/T;)V

    .line 1817
    .line 1818
    .line 1819
    const/16 v21, 0x1

    .line 1820
    .line 1821
    add-int/lit8 v10, v10, 0x1

    .line 1822
    .line 1823
    goto :goto_38

    .line 1824
    :cond_4e
    iget-wide v2, v0, LR5/h;->s:J

    .line 1825
    .line 1826
    cmp-long v2, v2, v23

    .line 1827
    .line 1828
    if-eqz v2, :cond_7

    .line 1829
    .line 1830
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 1831
    .line 1832
    .line 1833
    move-result v2

    .line 1834
    const/4 v8, 0x0

    .line 1835
    :goto_3a
    if-ge v8, v2, :cond_51

    .line 1836
    .line 1837
    invoke-virtual {v1, v8}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1838
    .line 1839
    .line 1840
    move-result-object v3

    .line 1841
    check-cast v3, LR5/g;

    .line 1842
    .line 1843
    iget-wide v6, v0, LR5/h;->s:J

    .line 1844
    .line 1845
    iget v4, v3, LR5/g;->f:I

    .line 1846
    .line 1847
    :goto_3b
    iget-object v9, v3, LR5/g;->b:LM2/u;

    .line 1848
    .line 1849
    iget v10, v9, LM2/u;->d:I

    .line 1850
    .line 1851
    if-ge v4, v10, :cond_50

    .line 1852
    .line 1853
    iget-object v10, v9, LM2/u;->h:[J

    .line 1854
    .line 1855
    aget-wide v12, v10, v4

    .line 1856
    .line 1857
    cmp-long v10, v12, v6

    .line 1858
    .line 1859
    if-gez v10, :cond_50

    .line 1860
    .line 1861
    iget-object v9, v9, LM2/u;->i:[Z

    .line 1862
    .line 1863
    aget-boolean v9, v9, v4

    .line 1864
    .line 1865
    if-eqz v9, :cond_4f

    .line 1866
    .line 1867
    iput v4, v3, LR5/g;->i:I

    .line 1868
    .line 1869
    :cond_4f
    const/16 v21, 0x1

    .line 1870
    .line 1871
    add-int/lit8 v4, v4, 0x1

    .line 1872
    .line 1873
    goto :goto_3b

    .line 1874
    :cond_50
    const/16 v21, 0x1

    .line 1875
    .line 1876
    add-int/lit8 v8, v8, 0x1

    .line 1877
    .line 1878
    goto :goto_3a

    .line 1879
    :cond_51
    move-wide/from16 v3, v23

    .line 1880
    .line 1881
    const/16 v21, 0x1

    .line 1882
    .line 1883
    iput-wide v3, v0, LR5/h;->s:J

    .line 1884
    .line 1885
    goto :goto_3c

    .line 1886
    :cond_52
    move/from16 v11, v17

    .line 1887
    .line 1888
    move/from16 v5, v18

    .line 1889
    .line 1890
    const/16 v15, 0x8

    .line 1891
    .line 1892
    const/16 v21, 0x1

    .line 1893
    .line 1894
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1895
    .line 1896
    .line 1897
    move-result v1

    .line 1898
    if-nez v1, :cond_53

    .line 1899
    .line 1900
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1901
    .line 1902
    .line 1903
    move-result-object v1

    .line 1904
    check-cast v1, LR5/a;

    .line 1905
    .line 1906
    iget-object v1, v1, LR5/a;->e:Ljava/util/ArrayList;

    .line 1907
    .line 1908
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1909
    .line 1910
    .line 1911
    :cond_53
    :goto_3c
    move/from16 v5, v21

    .line 1912
    .line 1913
    goto/16 :goto_0

    .line 1914
    .line 1915
    :cond_54
    const/4 v10, 0x0

    .line 1916
    iput v10, v0, LR5/h;->l:I

    .line 1917
    .line 1918
    iput v10, v0, LR5/h;->o:I

    .line 1919
    .line 1920
    return-void
.end method

.method public final g(LJ5/l;LJ5/n;)I
    .locals 36

    move-object/from16 v1, p0

    :goto_0
    move-object/from16 v0, p1

    .line 1
    :goto_1
    iget v2, v1, LR5/h;->l:I

    iget-object v3, v1, LR5/h;->j:Ljava/util/ArrayDeque;

    iget-object v4, v1, LR5/h;->b:Landroid/util/SparseArray;

    const/4 v5, 0x1

    const/4 v6, 0x0

    const v7, 0x656d7367

    const v8, 0x73696478

    const/4 v10, 0x0

    const/4 v11, 0x2

    if-eqz v2, :cond_39

    iget-object v12, v1, LR5/h;->k:Ljava/util/ArrayDeque;

    const-string v14, "FragmentedMp4Extractor"

    if-eq v2, v5, :cond_2a

    const-wide v7, 0x7fffffffffffffffL

    if-eq v2, v11, :cond_25

    .line 2
    iget-object v2, v1, LR5/h;->v:LR5/g;

    if-nez v2, :cond_9

    .line 3
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v2

    move-wide v15, v7

    move-object v7, v10

    move v8, v6

    :goto_2
    if-ge v8, v2, :cond_4

    .line 4
    invoke-virtual {v4, v8}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v17

    move/from16 p2, v11

    move-object/from16 v11, v17

    check-cast v11, LR5/g;

    .line 5
    iget-boolean v13, v11, LR5/g;->l:Z

    const/16 v18, 0x8

    if-nez v13, :cond_0

    .line 6
    iget v9, v11, LR5/g;->f:I

    iget-object v5, v11, LR5/g;->d:LR5/p;

    iget v5, v5, LR5/p;->b:I

    if-eq v9, v5, :cond_3

    .line 7
    :cond_0
    iget-object v5, v11, LR5/g;->b:LM2/u;

    if-eqz v13, :cond_1

    iget v9, v11, LR5/g;->h:I

    iget v3, v5, LM2/u;->c:I

    if-ne v9, v3, :cond_1

    goto :goto_4

    :cond_1
    if-nez v13, :cond_2

    .line 8
    iget-object v3, v11, LR5/g;->d:LR5/p;

    iget-object v3, v3, LR5/p;->c:[J

    iget v5, v11, LR5/g;->f:I

    aget-wide v21, v3, v5

    goto :goto_3

    .line 9
    :cond_2
    iget-object v3, v5, LM2/u;->e:[J

    iget v5, v11, LR5/g;->h:I

    aget-wide v21, v3, v5

    :goto_3
    cmp-long v3, v21, v15

    if-gez v3, :cond_3

    move-object v7, v11

    move-wide/from16 v15, v21

    :cond_3
    :goto_4
    add-int/lit8 v8, v8, 0x1

    move/from16 v11, p2

    const/4 v5, 0x1

    goto :goto_2

    :cond_4
    move/from16 p2, v11

    const/16 v18, 0x8

    if-nez v7, :cond_6

    .line 10
    iget-wide v2, v1, LR5/h;->q:J

    move-object v4, v0

    check-cast v4, LJ5/h;

    .line 11
    iget-wide v4, v4, LJ5/h;->d:J

    sub-long/2addr v2, v4

    long-to-int v2, v2

    if-ltz v2, :cond_5

    .line 12
    move-object v3, v0

    check-cast v3, LJ5/h;

    invoke-virtual {v3, v2}, LJ5/h;->j(I)V

    .line 13
    iput v6, v1, LR5/h;->l:I

    .line 14
    iput v6, v1, LR5/h;->o:I

    goto/16 :goto_1

    .line 15
    :cond_5
    const-string v0, "Offset to end of mdat was negative."

    invoke-static {v0, v10}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object v0

    throw v0

    .line 16
    :cond_6
    iget-boolean v2, v7, LR5/g;->l:Z

    if-nez v2, :cond_7

    .line 17
    iget-object v2, v7, LR5/g;->d:LR5/p;

    iget-object v2, v2, LR5/p;->c:[J

    iget v3, v7, LR5/g;->f:I

    aget-wide v3, v2, v3

    goto :goto_5

    .line 18
    :cond_7
    iget-object v2, v7, LR5/g;->b:LM2/u;

    iget-object v2, v2, LM2/u;->e:[J

    iget v3, v7, LR5/g;->h:I

    aget-wide v3, v2, v3

    .line 19
    :goto_5
    move-object v2, v0

    check-cast v2, LJ5/h;

    .line 20
    iget-wide v8, v2, LJ5/h;->d:J

    sub-long/2addr v3, v8

    long-to-int v2, v3

    if-gez v2, :cond_8

    .line 21
    const-string v2, "Ignoring negative offset to sample data."

    invoke-static {v14, v2}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    move v2, v6

    .line 22
    :cond_8
    move-object v3, v0

    check-cast v3, LJ5/h;

    invoke-virtual {v3, v2}, LJ5/h;->j(I)V

    .line 23
    iput-object v7, v1, LR5/h;->v:LR5/g;

    move-object v2, v7

    goto :goto_6

    :cond_9
    move/from16 p2, v11

    const/16 v18, 0x8

    .line 24
    :goto_6
    iget v3, v1, LR5/h;->l:I

    const/4 v4, 0x6

    iget-object v5, v2, LR5/g;->b:LM2/u;

    const/4 v7, 0x3

    if-ne v3, v7, :cond_12

    .line 25
    iget-boolean v3, v2, LR5/g;->l:Z

    if-nez v3, :cond_a

    .line 26
    iget-object v3, v2, LR5/g;->d:LR5/p;

    iget-object v3, v3, LR5/p;->d:[I

    iget v7, v2, LR5/g;->f:I

    aget v3, v3, v7

    goto :goto_7

    .line 27
    :cond_a
    iget-object v3, v5, LM2/u;->g:[I

    iget v7, v2, LR5/g;->f:I

    aget v3, v3, v7

    .line 28
    :goto_7
    iput v3, v1, LR5/h;->w:I

    .line 29
    iget v7, v2, LR5/g;->f:I

    iget v8, v2, LR5/g;->i:I

    if-ge v7, v8, :cond_f

    .line 30
    check-cast v0, LJ5/h;

    invoke-virtual {v0, v3}, LJ5/h;->j(I)V

    .line 31
    invoke-virtual {v2}, LR5/g;->a()LR5/o;

    move-result-object v0

    if-nez v0, :cond_b

    goto :goto_8

    .line 32
    :cond_b
    iget-object v3, v5, LM2/u;->q:Ljava/lang/Object;

    check-cast v3, LY4/b;

    .line 33
    iget v0, v0, LR5/o;->d:I

    if-eqz v0, :cond_c

    .line 34
    invoke-virtual {v3, v0}, LY4/b;->B(I)V

    .line 35
    :cond_c
    iget v0, v2, LR5/g;->f:I

    .line 36
    iget-boolean v7, v5, LM2/u;->j:Z

    if-eqz v7, :cond_d

    iget-object v5, v5, LM2/u;->k:[Z

    aget-boolean v0, v5, v0

    if-eqz v0, :cond_d

    .line 37
    invoke-virtual {v3}, LY4/b;->v()I

    move-result v0

    mul-int/2addr v0, v4

    invoke-virtual {v3, v0}, LY4/b;->B(I)V

    .line 38
    :cond_d
    :goto_8
    invoke-virtual {v2}, LR5/g;->b()Z

    move-result v0

    if-nez v0, :cond_e

    .line 39
    iput-object v10, v1, LR5/h;->v:LR5/g;

    :cond_e
    const/4 v7, 0x3

    .line 40
    iput v7, v1, LR5/h;->l:I

    return v6

    .line 41
    :cond_f
    iget-object v7, v2, LR5/g;->d:LR5/p;

    iget-object v7, v7, LR5/p;->a:LR5/n;

    iget v7, v7, LR5/n;->g:I

    const/4 v8, 0x1

    if-ne v7, v8, :cond_10

    add-int/lit8 v3, v3, -0x8

    .line 42
    iput v3, v1, LR5/h;->w:I

    .line 43
    move-object v3, v0

    check-cast v3, LJ5/h;

    move/from16 v7, v18

    invoke-virtual {v3, v7}, LJ5/h;->j(I)V

    .line 44
    :cond_10
    iget-object v3, v2, LR5/g;->d:LR5/p;

    iget-object v3, v3, LR5/p;->a:LR5/n;

    iget-object v3, v3, LR5/n;->f:LE5/T;

    iget-object v3, v3, LE5/T;->l:Ljava/lang/String;

    const-string v7, "audio/ac4"

    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_11

    .line 45
    iget v3, v1, LR5/h;->w:I

    const/4 v7, 0x7

    .line 46
    invoke-virtual {v2, v3, v7}, LR5/g;->c(II)I

    move-result v3

    iput v3, v1, LR5/h;->x:I

    .line 47
    iget v3, v1, LR5/h;->w:I

    iget-object v8, v1, LR5/h;->g:LY4/b;

    invoke-static {v3, v8}, LG5/b;->c(ILY4/b;)V

    .line 48
    iget-object v3, v2, LR5/g;->a:LJ5/w;

    invoke-interface {v3, v7, v8}, LJ5/w;->c(ILY4/b;)V

    .line 49
    iget v3, v1, LR5/h;->x:I

    add-int/2addr v3, v7

    iput v3, v1, LR5/h;->x:I

    goto :goto_9

    .line 50
    :cond_11
    iget v3, v1, LR5/h;->w:I

    .line 51
    invoke-virtual {v2, v3, v6}, LR5/g;->c(II)I

    move-result v3

    iput v3, v1, LR5/h;->x:I

    .line 52
    :goto_9
    iget v3, v1, LR5/h;->w:I

    iget v7, v1, LR5/h;->x:I

    add-int/2addr v3, v7

    iput v3, v1, LR5/h;->w:I

    const/4 v3, 0x4

    .line 53
    iput v3, v1, LR5/h;->l:I

    .line 54
    iput v6, v1, LR5/h;->y:I

    .line 55
    :cond_12
    iget-object v3, v2, LR5/g;->d:LR5/p;

    .line 56
    iget-boolean v7, v2, LR5/g;->l:Z

    if-nez v7, :cond_13

    .line 57
    iget-object v7, v3, LR5/p;->f:[J

    iget v8, v2, LR5/g;->f:I

    aget-wide v8, v7, v8

    goto :goto_a

    .line 58
    :cond_13
    iget v7, v2, LR5/g;->f:I

    .line 59
    iget-object v8, v5, LM2/u;->h:[J

    .line 60
    aget-wide v7, v8, v7

    move-wide v8, v7

    .line 61
    :goto_a
    iget-object v3, v3, LR5/p;->a:LR5/n;

    iget v7, v3, LR5/n;->j:I

    iget-object v11, v2, LR5/g;->a:LJ5/w;

    if-eqz v7, :cond_1b

    .line 62
    iget-object v13, v1, LR5/h;->d:LY4/b;

    iget-object v14, v13, LY4/b;->a:[B

    .line 63
    aput-byte v6, v14, v6

    const/16 v19, 0x1

    .line 64
    aput-byte v6, v14, v19

    .line 65
    aput-byte v6, v14, p2

    add-int/lit8 v15, v7, 0x1

    const/16 v17, 0x4

    rsub-int/lit8 v7, v7, 0x4

    .line 66
    :goto_b
    iget v10, v1, LR5/h;->x:I

    iget v4, v1, LR5/h;->w:I

    if-ge v10, v4, :cond_1c

    .line 67
    iget v4, v1, LR5/h;->y:I

    const-string v10, "video/hevc"

    iget-object v6, v3, LR5/n;->f:LE5/T;

    if-nez v4, :cond_19

    .line 68
    move-object v4, v0

    check-cast v4, LJ5/h;

    move-object/from16 v21, v3

    const/4 v3, 0x0

    .line 69
    invoke-virtual {v4, v14, v7, v15, v3}, LJ5/h;->f([BIIZ)Z

    .line 70
    invoke-virtual {v13, v3}, LY4/b;->A(I)V

    .line 71
    invoke-virtual {v13}, LY4/b;->d()I

    move-result v4

    const/4 v3, 0x1

    if-lt v4, v3, :cond_18

    add-int/lit8 v4, v4, -0x1

    .line 72
    iput v4, v1, LR5/h;->y:I

    .line 73
    iget-object v4, v1, LR5/h;->c:LY4/b;

    const/4 v3, 0x0

    invoke-virtual {v4, v3}, LY4/b;->A(I)V

    const/4 v3, 0x4

    .line 74
    invoke-interface {v11, v3, v4}, LJ5/w;->c(ILY4/b;)V

    const/4 v4, 0x1

    .line 75
    invoke-interface {v11, v4, v13}, LJ5/w;->c(ILY4/b;)V

    .line 76
    iget-object v4, v1, LR5/h;->C:[LJ5/w;

    array-length v4, v4

    if-lez v4, :cond_16

    iget-object v4, v6, LE5/T;->l:Ljava/lang/String;

    aget-byte v6, v14, v3

    .line 77
    const-string v3, "video/avc"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_14

    and-int/lit8 v3, v6, 0x1f

    move/from16 p2, v7

    const/4 v7, 0x6

    if-eq v3, v7, :cond_15

    goto :goto_c

    :cond_14
    move/from16 p2, v7

    const/4 v7, 0x6

    .line 78
    :goto_c
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_17

    and-int/lit8 v3, v6, 0x7e

    const/16 v19, 0x1

    shr-int/lit8 v3, v3, 0x1

    const/16 v4, 0x27

    if-ne v3, v4, :cond_17

    :cond_15
    const/4 v3, 0x1

    goto :goto_d

    :cond_16
    move/from16 p2, v7

    const/4 v7, 0x6

    :cond_17
    const/4 v3, 0x0

    .line 79
    :goto_d
    iput-boolean v3, v1, LR5/h;->z:Z

    .line 80
    iget v3, v1, LR5/h;->x:I

    add-int/lit8 v3, v3, 0x5

    iput v3, v1, LR5/h;->x:I

    .line 81
    iget v3, v1, LR5/h;->w:I

    add-int v3, v3, p2

    iput v3, v1, LR5/h;->w:I

    move v4, v7

    move-object/from16 v3, v21

    const/4 v6, 0x0

    move/from16 v7, p2

    goto :goto_b

    .line 82
    :cond_18
    const-string v0, "Invalid NAL length"

    const/4 v2, 0x0

    invoke-static {v0, v2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object v0

    throw v0

    :cond_19
    move-object/from16 v21, v3

    move/from16 p2, v7

    const/4 v7, 0x6

    .line 83
    iget-boolean v3, v1, LR5/h;->z:Z

    if-eqz v3, :cond_1a

    .line 84
    iget-object v3, v1, LR5/h;->e:LY4/b;

    invoke-virtual {v3, v4}, LY4/b;->x(I)V

    .line 85
    iget-object v4, v3, LY4/b;->a:[B

    .line 86
    iget v7, v1, LR5/h;->y:I

    move-object/from16 v22, v13

    move-object v13, v0

    check-cast v13, LJ5/h;

    move-object/from16 v23, v14

    const/4 v14, 0x0

    .line 87
    invoke-virtual {v13, v4, v14, v7, v14}, LJ5/h;->f([BIIZ)Z

    .line 88
    iget v4, v1, LR5/h;->y:I

    invoke-interface {v11, v4, v3}, LJ5/w;->c(ILY4/b;)V

    .line 89
    iget v4, v1, LR5/h;->y:I

    .line 90
    iget-object v7, v3, LY4/b;->a:[B

    .line 91
    iget v13, v3, LY4/b;->c:I

    .line 92
    invoke-static {v13, v7}, Lu6/a;->C(I[B)I

    move-result v7

    .line 93
    iget-object v6, v6, LE5/T;->l:Ljava/lang/String;

    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v3, v6}, LY4/b;->A(I)V

    .line 94
    invoke-virtual {v3, v7}, LY4/b;->z(I)V

    .line 95
    iget-object v6, v1, LR5/h;->C:[LJ5/w;

    invoke-static {v8, v9, v3, v6}, LFe/g;->w(JLY4/b;[LJ5/w;)V

    goto :goto_e

    :cond_1a
    move-object/from16 v22, v13

    move-object/from16 v23, v14

    const/4 v3, 0x0

    .line 96
    invoke-interface {v11, v0, v4, v3}, LJ5/w;->d(Lt6/i;IZ)I

    move-result v4

    .line 97
    :goto_e
    iget v3, v1, LR5/h;->x:I

    add-int/2addr v3, v4

    iput v3, v1, LR5/h;->x:I

    .line 98
    iget v3, v1, LR5/h;->y:I

    sub-int/2addr v3, v4

    iput v3, v1, LR5/h;->y:I

    move/from16 v7, p2

    move-object/from16 v3, v21

    move-object/from16 v13, v22

    move-object/from16 v14, v23

    const/4 v4, 0x6

    const/4 v6, 0x0

    goto/16 :goto_b

    .line 99
    :cond_1b
    :goto_f
    iget v3, v1, LR5/h;->x:I

    iget v4, v1, LR5/h;->w:I

    if-ge v3, v4, :cond_1c

    sub-int/2addr v4, v3

    const/4 v3, 0x0

    .line 100
    invoke-interface {v11, v0, v4, v3}, LJ5/w;->d(Lt6/i;IZ)I

    move-result v4

    .line 101
    iget v3, v1, LR5/h;->x:I

    add-int/2addr v3, v4

    iput v3, v1, LR5/h;->x:I

    goto :goto_f

    .line 102
    :cond_1c
    iget-boolean v0, v2, LR5/g;->l:Z

    if-nez v0, :cond_1d

    .line 103
    iget-object v0, v2, LR5/g;->d:LR5/p;

    iget-object v0, v0, LR5/p;->g:[I

    iget v3, v2, LR5/g;->f:I

    aget v5, v0, v3

    goto :goto_10

    .line 104
    :cond_1d
    iget-object v0, v5, LM2/u;->i:[Z

    iget v3, v2, LR5/g;->f:I

    aget-boolean v0, v0, v3

    if-eqz v0, :cond_1e

    const/4 v5, 0x1

    goto :goto_10

    :cond_1e
    const/4 v5, 0x0

    .line 105
    :goto_10
    invoke-virtual {v2}, LR5/g;->a()LR5/o;

    move-result-object v0

    if-eqz v0, :cond_1f

    const/high16 v0, 0x40000000    # 2.0f

    or-int/2addr v5, v0

    :cond_1f
    move/from16 v24, v5

    .line 106
    invoke-virtual {v2}, LR5/g;->a()LR5/o;

    move-result-object v0

    if-eqz v0, :cond_20

    .line 107
    iget-object v0, v0, LR5/o;->c:LJ5/v;

    move-object/from16 v27, v0

    goto :goto_11

    :cond_20
    const/16 v27, 0x0

    .line 108
    :goto_11
    iget v0, v1, LR5/h;->w:I

    const/16 v26, 0x0

    move/from16 v25, v0

    move-wide/from16 v22, v8

    move-object/from16 v21, v11

    invoke-interface/range {v21 .. v27}, LJ5/w;->b(JIIILJ5/v;)V

    .line 109
    :cond_21
    invoke-virtual {v12}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_23

    .line 110
    invoke-virtual {v12}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LR5/f;

    .line 111
    iget v3, v1, LR5/h;->r:I

    iget v4, v0, LR5/f;->c:I

    sub-int/2addr v3, v4

    iput v3, v1, LR5/h;->r:I

    .line 112
    iget-boolean v3, v0, LR5/f;->b:Z

    iget-wide v4, v0, LR5/f;->a:J

    if-eqz v3, :cond_22

    add-long v4, v4, v22

    :cond_22
    move-wide/from16 v30, v4

    .line 113
    iget-object v3, v1, LR5/h;->B:[LJ5/w;

    array-length v4, v3

    const/4 v5, 0x0

    :goto_12
    if-ge v5, v4, :cond_21

    aget-object v29, v3, v5

    .line 114
    iget v6, v1, LR5/h;->r:I

    const/16 v35, 0x0

    const/16 v32, 0x1

    iget v7, v0, LR5/f;->c:I

    move/from16 v34, v6

    move/from16 v33, v7

    invoke-interface/range {v29 .. v35}, LJ5/w;->b(JIIILJ5/v;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_12

    .line 115
    :cond_23
    invoke-virtual {v2}, LR5/g;->b()Z

    move-result v0

    if-nez v0, :cond_24

    const/4 v2, 0x0

    .line 116
    iput-object v2, v1, LR5/h;->v:LR5/g;

    :cond_24
    const/4 v7, 0x3

    .line 117
    iput v7, v1, LR5/h;->l:I

    const/16 v28, 0x0

    return v28

    .line 118
    :cond_25
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v2

    const/4 v3, 0x0

    const/4 v5, 0x0

    :goto_13
    if-ge v5, v2, :cond_27

    .line 119
    invoke-virtual {v4, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LR5/g;

    iget-object v6, v6, LR5/g;->b:LM2/u;

    .line 120
    iget-boolean v9, v6, LM2/u;->l:Z

    if-eqz v9, :cond_26

    iget-wide v9, v6, LM2/u;->b:J

    cmp-long v6, v9, v7

    if-gez v6, :cond_26

    .line 121
    invoke-virtual {v4, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LR5/g;

    move-wide v7, v9

    :cond_26
    add-int/lit8 v5, v5, 0x1

    goto :goto_13

    :cond_27
    if-nez v3, :cond_28

    const/4 v2, 0x3

    .line 122
    iput v2, v1, LR5/h;->l:I

    goto/16 :goto_1

    .line 123
    :cond_28
    move-object v2, v0

    check-cast v2, LJ5/h;

    .line 124
    iget-wide v4, v2, LJ5/h;->d:J

    sub-long/2addr v7, v4

    long-to-int v2, v7

    if-ltz v2, :cond_29

    .line 125
    move-object v4, v0

    check-cast v4, LJ5/h;

    invoke-virtual {v4, v2}, LJ5/h;->j(I)V

    .line 126
    iget-object v2, v3, LR5/g;->b:LM2/u;

    iget-object v3, v2, LM2/u;->q:Ljava/lang/Object;

    check-cast v3, LY4/b;

    .line 127
    iget-object v5, v3, LY4/b;->a:[B

    .line 128
    iget v6, v3, LY4/b;->c:I

    const/4 v14, 0x0

    .line 129
    invoke-virtual {v4, v5, v14, v6, v14}, LJ5/h;->f([BIIZ)Z

    .line 130
    invoke-virtual {v3, v14}, LY4/b;->A(I)V

    .line 131
    iput-boolean v14, v2, LM2/u;->l:Z

    goto/16 :goto_1

    .line 132
    :cond_29
    const-string v0, "Offset to encryption data was negative."

    const/4 v2, 0x0

    invoke-static {v0, v2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object v0

    throw v0

    :cond_2a
    move/from16 p2, v11

    .line 133
    iget-wide v4, v1, LR5/h;->n:J

    long-to-int v2, v4

    iget v4, v1, LR5/h;->o:I

    sub-int/2addr v2, v4

    .line 134
    iget-object v4, v1, LR5/h;->p:LY4/b;

    if-eqz v4, :cond_37

    .line 135
    iget-object v5, v4, LY4/b;->a:[B

    .line 136
    move-object v6, v0

    check-cast v6, LJ5/h;

    const/4 v9, 0x0

    const/16 v10, 0x8

    .line 137
    invoke-virtual {v6, v5, v10, v2, v9}, LJ5/h;->f([BIIZ)Z

    .line 138
    new-instance v2, LR5/b;

    iget v5, v1, LR5/h;->m:I

    invoke-direct {v2, v5, v4}, LR5/b;-><init>(ILY4/b;)V

    move-object v6, v0

    check-cast v6, LJ5/h;

    .line 139
    iget-wide v9, v6, LJ5/h;->d:J

    .line 140
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_2b

    .line 141
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LR5/a;

    .line 142
    iget-object v3, v3, LR5/a;->d:Ljava/util/ArrayList;

    .line 143
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1b

    :cond_2b
    if-ne v5, v8, :cond_2f

    const/16 v2, 0x8

    .line 144
    invoke-virtual {v4, v2}, LY4/b;->A(I)V

    .line 145
    invoke-virtual {v4}, LY4/b;->d()I

    move-result v2

    .line 146
    invoke-static {v2}, LH5/a;->n(I)I

    move-result v2

    const/4 v3, 0x4

    .line 147
    invoke-virtual {v4, v3}, LY4/b;->B(I)V

    .line 148
    invoke-virtual {v4}, LY4/b;->r()J

    move-result-wide v24

    if-nez v2, :cond_2c

    .line 149
    invoke-virtual {v4}, LY4/b;->r()J

    move-result-wide v2

    .line 150
    invoke-virtual {v4}, LY4/b;->r()J

    move-result-wide v5

    :goto_14
    add-long/2addr v5, v9

    move-wide/from16 v20, v2

    goto :goto_15

    .line 151
    :cond_2c
    invoke-virtual {v4}, LY4/b;->u()J

    move-result-wide v2

    .line 152
    invoke-virtual {v4}, LY4/b;->u()J

    move-result-wide v5

    goto :goto_14

    :goto_15
    const-wide/32 v22, 0xf4240

    .line 153
    invoke-static/range {v20 .. v25}, Lu6/v;->D(JJJ)J

    move-result-wide v2

    move/from16 v7, p2

    .line 154
    invoke-virtual {v4, v7}, LY4/b;->B(I)V

    .line 155
    invoke-virtual {v4}, LY4/b;->v()I

    move-result v7

    .line 156
    new-array v8, v7, [I

    .line 157
    new-array v9, v7, [J

    .line 158
    new-array v10, v7, [J

    .line 159
    new-array v11, v7, [J

    move-wide v13, v2

    const/4 v12, 0x0

    :goto_16
    if-ge v12, v7, :cond_2e

    .line 160
    invoke-virtual {v4}, LY4/b;->d()I

    move-result v15

    const/high16 v18, -0x80000000

    and-int v18, v15, v18

    if-nez v18, :cond_2d

    .line 161
    invoke-virtual {v4}, LY4/b;->r()J

    move-result-wide v22

    const v18, 0x7fffffff

    and-int v15, v15, v18

    .line 162
    aput v15, v8, v12

    .line 163
    aput-wide v5, v9, v12

    .line 164
    aput-wide v13, v11, v12

    add-long v20, v20, v22

    const-wide/32 v22, 0xf4240

    .line 165
    invoke-static/range {v20 .. v25}, Lu6/v;->D(JJJ)J

    move-result-wide v13

    .line 166
    aget-wide v22, v11, v12

    sub-long v22, v13, v22

    aput-wide v22, v10, v12

    const/4 v15, 0x4

    .line 167
    invoke-virtual {v4, v15}, LY4/b;->B(I)V

    .line 168
    aget v15, v8, v12

    move-wide/from16 v22, v2

    int-to-long v2, v15

    add-long/2addr v5, v2

    add-int/lit8 v12, v12, 0x1

    move-wide/from16 v2, v22

    goto :goto_16

    .line 169
    :cond_2d
    const-string v0, "Unhandled indirect reference"

    const/4 v2, 0x0

    invoke-static {v0, v2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object v0

    throw v0

    :cond_2e
    move-wide/from16 v22, v2

    .line 170
    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    new-instance v3, LJ5/g;

    invoke-direct {v3, v8, v9, v10, v11}, LJ5/g;-><init>([I[J[J[J)V

    .line 171
    invoke-static {v2, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v2

    .line 172
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iput-wide v3, v1, LR5/h;->u:J

    .line 173
    iget-object v3, v1, LR5/h;->A:LJ5/m;

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, LJ5/t;

    invoke-interface {v3, v2}, LJ5/m;->x(LJ5/t;)V

    const/4 v3, 0x1

    .line 174
    iput-boolean v3, v1, LR5/h;->D:Z

    goto/16 :goto_1b

    :cond_2f
    if-ne v5, v7, :cond_38

    .line 175
    iget-object v2, v1, LR5/h;->B:[LJ5/w;

    array-length v2, v2

    if-nez v2, :cond_30

    goto/16 :goto_1b

    :cond_30
    const/16 v2, 0x8

    .line 176
    invoke-virtual {v4, v2}, LY4/b;->A(I)V

    .line 177
    invoke-virtual {v4}, LY4/b;->d()I

    move-result v2

    .line 178
    invoke-static {v2}, LH5/a;->n(I)I

    move-result v2

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v2, :cond_32

    const/4 v3, 0x1

    if-eq v2, v3, :cond_31

    .line 179
    const-string v3, "Skipping unsupported emsg version: "

    .line 180
    invoke-static {v2, v3, v14}, LA7/p0;->u(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1b

    .line 181
    :cond_31
    invoke-virtual {v4}, LY4/b;->r()J

    move-result-wide v24

    .line 182
    invoke-virtual {v4}, LY4/b;->u()J

    move-result-wide v20

    const-wide/32 v22, 0xf4240

    invoke-static/range {v20 .. v25}, Lu6/v;->D(JJJ)J

    move-result-wide v2

    .line 183
    invoke-virtual {v4}, LY4/b;->r()J

    move-result-wide v20

    const-wide/16 v22, 0x3e8

    invoke-static/range {v20 .. v25}, Lu6/v;->D(JJJ)J

    move-result-wide v7

    .line 184
    invoke-virtual {v4}, LY4/b;->r()J

    move-result-wide v9

    .line 185
    invoke-virtual {v4}, LY4/b;->l()Ljava/lang/String;

    move-result-object v11

    .line 186
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    invoke-virtual {v4}, LY4/b;->l()Ljava/lang/String;

    move-result-object v13

    .line 188
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-wide/from16 v16, v5

    move-wide v14, v9

    move-wide v9, v7

    move-wide/from16 v7, v16

    goto :goto_18

    .line 189
    :cond_32
    invoke-virtual {v4}, LY4/b;->l()Ljava/lang/String;

    move-result-object v11

    .line 190
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    invoke-virtual {v4}, LY4/b;->l()Ljava/lang/String;

    move-result-object v13

    .line 192
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    invoke-virtual {v4}, LY4/b;->r()J

    move-result-wide v24

    .line 194
    invoke-virtual {v4}, LY4/b;->r()J

    move-result-wide v20

    const-wide/32 v22, 0xf4240

    invoke-static/range {v20 .. v25}, Lu6/v;->D(JJJ)J

    move-result-wide v2

    .line 195
    iget-wide v7, v1, LR5/h;->u:J

    cmp-long v9, v7, v5

    if-eqz v9, :cond_33

    add-long/2addr v7, v2

    goto :goto_17

    :cond_33
    move-wide v7, v5

    .line 196
    :goto_17
    invoke-virtual {v4}, LY4/b;->r()J

    move-result-wide v20

    const-wide/16 v22, 0x3e8

    invoke-static/range {v20 .. v25}, Lu6/v;->D(JJJ)J

    move-result-wide v9

    .line 197
    invoke-virtual {v4}, LY4/b;->r()J

    move-result-wide v14

    move-wide/from16 v16, v7

    move-wide v7, v2

    move-wide/from16 v2, v16

    move-wide/from16 v16, v5

    .line 198
    :goto_18
    invoke-virtual {v4}, LY4/b;->a()I

    move-result v5

    new-array v5, v5, [B

    .line 199
    invoke-virtual {v4}, LY4/b;->a()I

    move-result v6

    const/4 v0, 0x0

    invoke-virtual {v4, v0, v6, v5}, LY4/b;->c(II[B)V

    .line 200
    new-instance v0, LY5/a;

    .line 201
    new-instance v0, LY4/b;

    .line 202
    iget-object v4, v1, LR5/h;->h:LX2/j;

    iget-object v6, v4, LX2/j;->b:Ljava/lang/Object;

    check-cast v6, Ljava/io/ByteArrayOutputStream;

    .line 203
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 204
    iget-object v4, v4, LX2/j;->c:Ljava/lang/Object;

    check-cast v4, Ljava/io/DataOutputStream;

    .line 205
    :try_start_0
    invoke-virtual {v4, v11}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    const/4 v11, 0x0

    .line 206
    invoke-virtual {v4, v11}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 207
    invoke-virtual {v4, v13}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    .line 208
    invoke-virtual {v4, v11}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 209
    invoke-virtual {v4, v9, v10}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 210
    invoke-virtual {v4, v14, v15}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 211
    invoke-virtual {v4, v5}, Ljava/io/OutputStream;->write([B)V

    .line 212
    invoke-virtual {v4}, Ljava/io/DataOutputStream;->flush()V

    .line 213
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 214
    invoke-direct {v0, v4}, LY4/b;-><init>([B)V

    .line 215
    invoke-virtual {v0}, LY4/b;->a()I

    move-result v4

    .line 216
    iget-object v5, v1, LR5/h;->B:[LJ5/w;

    array-length v6, v5

    const/4 v9, 0x0

    :goto_19
    if-ge v9, v6, :cond_34

    aget-object v10, v5, v9

    const/4 v14, 0x0

    .line 217
    invoke-virtual {v0, v14}, LY4/b;->A(I)V

    .line 218
    invoke-interface {v10, v4, v0}, LJ5/w;->c(ILY4/b;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_19

    :cond_34
    cmp-long v0, v2, v16

    if-nez v0, :cond_35

    .line 219
    new-instance v0, LR5/f;

    const/4 v3, 0x1

    invoke-direct {v0, v7, v8, v3, v4}, LR5/f;-><init>(JZI)V

    invoke-virtual {v12, v0}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 220
    iget v0, v1, LR5/h;->r:I

    add-int/2addr v0, v4

    iput v0, v1, LR5/h;->r:I

    goto :goto_1b

    .line 221
    :cond_35
    invoke-virtual {v12}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_36

    .line 222
    new-instance v0, LR5/f;

    const/4 v14, 0x0

    invoke-direct {v0, v2, v3, v14, v4}, LR5/f;-><init>(JZI)V

    invoke-virtual {v12, v0}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 223
    iget v0, v1, LR5/h;->r:I

    add-int/2addr v0, v4

    iput v0, v1, LR5/h;->r:I

    goto :goto_1b

    .line 224
    :cond_36
    iget-object v0, v1, LR5/h;->B:[LJ5/w;

    array-length v5, v0

    const/4 v6, 0x0

    :goto_1a
    if-ge v6, v5, :cond_38

    aget-object v20, v0, v6

    const/16 v26, 0x0

    const/16 v23, 0x1

    const/16 v25, 0x0

    move-wide/from16 v21, v2

    move/from16 v24, v4

    .line 225
    invoke-interface/range {v20 .. v26}, LJ5/w;->b(JIIILJ5/v;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1a

    :catch_0
    move-exception v0

    .line 226
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    .line 227
    :cond_37
    move-object/from16 v0, p1

    check-cast v0, LJ5/h;

    invoke-virtual {v0, v2}, LJ5/h;->j(I)V

    .line 228
    :cond_38
    :goto_1b
    move-object/from16 v0, p1

    check-cast v0, LJ5/h;

    .line 229
    iget-wide v2, v0, LJ5/h;->d:J

    .line 230
    invoke-virtual {v1, v2, v3}, LR5/h;->d(J)V

    goto/16 :goto_0

    .line 231
    :cond_39
    iget v0, v1, LR5/h;->o:I

    iget-object v2, v1, LR5/h;->i:LY4/b;

    if-nez v0, :cond_3b

    .line 232
    iget-object v0, v2, LY4/b;->a:[B

    .line 233
    move-object/from16 v5, p1

    check-cast v5, LJ5/h;

    const/4 v6, 0x1

    const/16 v10, 0x8

    const/4 v14, 0x0

    invoke-virtual {v5, v0, v14, v10, v6}, LJ5/h;->f([BIIZ)Z

    move-result v0

    if-nez v0, :cond_3a

    const/4 v0, -0x1

    return v0

    .line 234
    :cond_3a
    iput v10, v1, LR5/h;->o:I

    .line 235
    invoke-virtual {v2, v14}, LY4/b;->A(I)V

    .line 236
    invoke-virtual {v2}, LY4/b;->r()J

    move-result-wide v5

    iput-wide v5, v1, LR5/h;->n:J

    .line 237
    invoke-virtual {v2}, LY4/b;->d()I

    move-result v0

    iput v0, v1, LR5/h;->m:I

    .line 238
    :cond_3b
    iget-wide v5, v1, LR5/h;->n:J

    const-wide/16 v9, 0x1

    cmp-long v0, v5, v9

    if-nez v0, :cond_3c

    .line 239
    iget-object v0, v2, LY4/b;->a:[B

    .line 240
    move-object/from16 v5, p1

    check-cast v5, LJ5/h;

    const/16 v10, 0x8

    const/4 v14, 0x0

    .line 241
    invoke-virtual {v5, v0, v10, v10, v14}, LJ5/h;->f([BIIZ)Z

    .line 242
    iget v0, v1, LR5/h;->o:I

    add-int/2addr v0, v10

    iput v0, v1, LR5/h;->o:I

    .line 243
    invoke-virtual {v2}, LY4/b;->u()J

    move-result-wide v5

    iput-wide v5, v1, LR5/h;->n:J

    goto :goto_1c

    :cond_3c
    const-wide/16 v9, 0x0

    cmp-long v0, v5, v9

    if-nez v0, :cond_3e

    .line 244
    move-object/from16 v0, p1

    check-cast v0, LJ5/h;

    .line 245
    iget-wide v5, v0, LJ5/h;->c:J

    const-wide/16 v9, -0x1

    cmp-long v0, v5, v9

    if-nez v0, :cond_3d

    .line 246
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3d

    .line 247
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LR5/a;

    iget-wide v5, v0, LR5/a;->c:J

    :cond_3d
    cmp-long v0, v5, v9

    if-eqz v0, :cond_3e

    .line 248
    move-object/from16 v0, p1

    check-cast v0, LJ5/h;

    .line 249
    iget-wide v9, v0, LJ5/h;->d:J

    sub-long/2addr v5, v9

    .line 250
    iget v0, v1, LR5/h;->o:I

    int-to-long v9, v0

    add-long/2addr v5, v9

    iput-wide v5, v1, LR5/h;->n:J

    .line 251
    :cond_3e
    :goto_1c
    iget-wide v5, v1, LR5/h;->n:J

    iget v0, v1, LR5/h;->o:I

    int-to-long v9, v0

    cmp-long v5, v5, v9

    if-ltz v5, :cond_4b

    .line 252
    move-object/from16 v5, p1

    check-cast v5, LJ5/h;

    .line 253
    iget-wide v5, v5, LJ5/h;->d:J

    int-to-long v9, v0

    sub-long/2addr v5, v9

    .line 254
    iget v0, v1, LR5/h;->m:I

    const v9, 0x6d646174

    const v10, 0x6d6f6f66

    if-eq v0, v10, :cond_3f

    if-ne v0, v9, :cond_40

    .line 255
    :cond_3f
    iget-boolean v0, v1, LR5/h;->D:Z

    if-nez v0, :cond_40

    .line 256
    iget-object v0, v1, LR5/h;->A:LJ5/m;

    new-instance v11, LJ5/o;

    iget-wide v12, v1, LR5/h;->t:J

    invoke-direct {v11, v12, v13, v5, v6}, LJ5/o;-><init>(JJ)V

    invoke-interface {v0, v11}, LJ5/m;->x(LJ5/t;)V

    const/4 v0, 0x1

    .line 257
    iput-boolean v0, v1, LR5/h;->D:Z

    .line 258
    :cond_40
    iget v0, v1, LR5/h;->m:I

    if-ne v0, v10, :cond_41

    .line 259
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v11, 0x0

    :goto_1d
    if-ge v11, v0, :cond_41

    .line 260
    invoke-virtual {v4, v11}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LR5/g;

    iget-object v12, v12, LR5/g;->b:LM2/u;

    .line 261
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    iput-wide v5, v12, LM2/u;->b:J

    .line 263
    iput-wide v5, v12, LM2/u;->a:J

    add-int/lit8 v11, v11, 0x1

    goto :goto_1d

    .line 264
    :cond_41
    iget v0, v1, LR5/h;->m:I

    if-ne v0, v9, :cond_42

    const/4 v4, 0x0

    .line 265
    iput-object v4, v1, LR5/h;->v:LR5/g;

    .line 266
    iget-wide v2, v1, LR5/h;->n:J

    add-long/2addr v5, v2

    iput-wide v5, v1, LR5/h;->q:J

    const/4 v7, 0x2

    .line 267
    iput v7, v1, LR5/h;->l:I

    goto/16 :goto_0

    :cond_42
    const v4, 0x6d6f6f76

    if-eq v0, v4, :cond_49

    const v4, 0x7472616b

    if-eq v0, v4, :cond_49

    const v4, 0x6d646961

    if-eq v0, v4, :cond_49

    const v4, 0x6d696e66

    if-eq v0, v4, :cond_49

    const v4, 0x7374626c

    if-eq v0, v4, :cond_49

    if-eq v0, v10, :cond_49

    const v4, 0x74726166

    if-eq v0, v4, :cond_49

    const v4, 0x6d766578

    if-eq v0, v4, :cond_49

    const v4, 0x65647473

    if-ne v0, v4, :cond_43

    goto/16 :goto_1f

    :cond_43
    const v3, 0x68646c72    # 4.3148E24f

    const-wide/32 v4, 0x7fffffff

    if-eq v0, v3, :cond_46

    const v3, 0x6d646864

    if-eq v0, v3, :cond_46

    const v3, 0x6d766864

    if-eq v0, v3, :cond_46

    if-eq v0, v8, :cond_46

    const v3, 0x73747364

    if-eq v0, v3, :cond_46

    const v3, 0x73747473

    if-eq v0, v3, :cond_46

    const v3, 0x63747473

    if-eq v0, v3, :cond_46

    const v3, 0x73747363

    if-eq v0, v3, :cond_46

    const v3, 0x7374737a

    if-eq v0, v3, :cond_46

    const v3, 0x73747a32

    if-eq v0, v3, :cond_46

    const v3, 0x7374636f

    if-eq v0, v3, :cond_46

    const v3, 0x636f3634

    if-eq v0, v3, :cond_46

    const v3, 0x73747373

    if-eq v0, v3, :cond_46

    const v3, 0x74666474

    if-eq v0, v3, :cond_46

    const v3, 0x74666864

    if-eq v0, v3, :cond_46

    const v3, 0x746b6864

    if-eq v0, v3, :cond_46

    const v3, 0x74726578

    if-eq v0, v3, :cond_46

    const v3, 0x7472756e

    if-eq v0, v3, :cond_46

    const v3, 0x70737368    # 3.013775E29f

    if-eq v0, v3, :cond_46

    const v3, 0x7361697a

    if-eq v0, v3, :cond_46

    const v3, 0x7361696f

    if-eq v0, v3, :cond_46

    const v3, 0x73656e63

    if-eq v0, v3, :cond_46

    const v3, 0x75756964

    if-eq v0, v3, :cond_46

    const v3, 0x73626770

    if-eq v0, v3, :cond_46

    const v3, 0x73677064

    if-eq v0, v3, :cond_46

    const v3, 0x656c7374

    if-eq v0, v3, :cond_46

    const v3, 0x6d656864

    if-eq v0, v3, :cond_46

    if-ne v0, v7, :cond_44

    goto :goto_1e

    .line 268
    :cond_44
    iget-wide v2, v1, LR5/h;->n:J

    cmp-long v0, v2, v4

    if-gtz v0, :cond_45

    const/4 v2, 0x0

    .line 269
    iput-object v2, v1, LR5/h;->p:LY4/b;

    const/4 v3, 0x1

    .line 270
    iput v3, v1, LR5/h;->l:I

    goto/16 :goto_0

    .line 271
    :cond_45
    const-string v0, "Skipping atom with length > 2147483647 (unsupported)."

    invoke-static {v0}, LE5/o0;->b(Ljava/lang/String;)LE5/o0;

    move-result-object v0

    throw v0

    .line 272
    :cond_46
    :goto_1e
    iget v0, v1, LR5/h;->o:I

    const/16 v10, 0x8

    if-ne v0, v10, :cond_48

    .line 273
    iget-wide v6, v1, LR5/h;->n:J

    cmp-long v0, v6, v4

    if-gtz v0, :cond_47

    .line 274
    new-instance v0, LY4/b;

    long-to-int v3, v6

    invoke-direct {v0, v3}, LY4/b;-><init>(I)V

    .line 275
    iget-object v2, v2, LY4/b;->a:[B

    iget-object v3, v0, LY4/b;->a:[B

    const/16 v10, 0x8

    const/4 v14, 0x0

    .line 276
    invoke-static {v2, v14, v3, v14, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 277
    iput-object v0, v1, LR5/h;->p:LY4/b;

    const/4 v3, 0x1

    .line 278
    iput v3, v1, LR5/h;->l:I

    goto/16 :goto_0

    .line 279
    :cond_47
    const-string v0, "Leaf atom with length > 2147483647 (unsupported)."

    invoke-static {v0}, LE5/o0;->b(Ljava/lang/String;)LE5/o0;

    move-result-object v0

    throw v0

    .line 280
    :cond_48
    const-string v0, "Leaf atom defines extended atom size (unsupported)."

    invoke-static {v0}, LE5/o0;->b(Ljava/lang/String;)LE5/o0;

    move-result-object v0

    throw v0

    .line 281
    :cond_49
    :goto_1f
    move-object/from16 v2, p1

    check-cast v2, LJ5/h;

    .line 282
    iget-wide v4, v2, LJ5/h;->d:J

    .line 283
    iget-wide v6, v1, LR5/h;->n:J

    add-long/2addr v4, v6

    const-wide/16 v6, 0x8

    sub-long/2addr v4, v6

    .line 284
    new-instance v2, LR5/a;

    invoke-direct {v2, v0, v4, v5}, LR5/a;-><init>(IJ)V

    invoke-virtual {v3, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 285
    iget-wide v2, v1, LR5/h;->n:J

    iget v0, v1, LR5/h;->o:I

    int-to-long v6, v0

    cmp-long v0, v2, v6

    if-nez v0, :cond_4a

    .line 286
    invoke-virtual {v1, v4, v5}, LR5/h;->d(J)V

    goto/16 :goto_0

    :cond_4a
    const/4 v14, 0x0

    .line 287
    iput v14, v1, LR5/h;->l:I

    .line 288
    iput v14, v1, LR5/h;->o:I

    goto/16 :goto_0

    .line 289
    :cond_4b
    const-string v0, "Atom size less than header length (unsupported)."

    invoke-static {v0}, LE5/o0;->b(Ljava/lang/String;)LE5/o0;

    move-result-object v0

    throw v0
.end method

.method public final h(Lf6/N;)V
    .locals 5

    .line 1
    iput-object p1, p0, LR5/h;->A:LJ5/m;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput p1, p0, LR5/h;->l:I

    .line 5
    .line 6
    iput p1, p0, LR5/h;->o:I

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    new-array v0, v0, [LJ5/w;

    .line 10
    .line 11
    iput-object v0, p0, LR5/h;->B:[LJ5/w;

    .line 12
    .line 13
    invoke-static {p1, v0}, Lu6/v;->A(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, [LJ5/w;

    .line 18
    .line 19
    iput-object v0, p0, LR5/h;->B:[LJ5/w;

    .line 20
    .line 21
    array-length v1, v0

    .line 22
    move v2, p1

    .line 23
    :goto_0
    if-ge v2, v1, :cond_0

    .line 24
    .line 25
    aget-object v3, v0, v2

    .line 26
    .line 27
    sget-object v4, LR5/h;->F:LE5/T;

    .line 28
    .line 29
    invoke-interface {v3, v4}, LJ5/w;->a(LE5/T;)V

    .line 30
    .line 31
    .line 32
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-object v0, p0, LR5/h;->a:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    new-array v1, v1, [LJ5/w;

    .line 42
    .line 43
    iput-object v1, p0, LR5/h;->C:[LJ5/w;

    .line 44
    .line 45
    const/16 v1, 0x64

    .line 46
    .line 47
    :goto_1
    iget-object v2, p0, LR5/h;->C:[LJ5/w;

    .line 48
    .line 49
    array-length v2, v2

    .line 50
    if-ge p1, v2, :cond_1

    .line 51
    .line 52
    iget-object v2, p0, LR5/h;->A:LJ5/m;

    .line 53
    .line 54
    add-int/lit8 v3, v1, 0x1

    .line 55
    .line 56
    const/4 v4, 0x3

    .line 57
    invoke-interface {v2, v1, v4}, LJ5/m;->m(II)LJ5/w;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, LE5/T;

    .line 66
    .line 67
    invoke-interface {v1, v2}, LJ5/w;->a(LE5/T;)V

    .line 68
    .line 69
    .line 70
    iget-object v2, p0, LR5/h;->C:[LJ5/w;

    .line 71
    .line 72
    aput-object v1, v2, p1

    .line 73
    .line 74
    add-int/lit8 p1, p1, 0x1

    .line 75
    .line 76
    move v1, v3

    .line 77
    goto :goto_1

    .line 78
    :cond_1
    return-void
.end method

.method public final i(LJ5/l;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p1, v0, v1}, LR5/i;->h(LJ5/l;ZZ)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method
