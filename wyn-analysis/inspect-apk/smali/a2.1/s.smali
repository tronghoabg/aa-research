.class public final La2/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo2/h;
.implements Lo2/k;
.implements Lk2/f0;
.implements Ls2/o;
.implements Lk2/b0;


# static fields
.field public static final Y:Ljava/util/Set;


# instance fields
.field public A:I

.field public B:I

.field public C:Z

.field public D:Z

.field public E:I

.field public F:LN1/n;

.field public G:LN1/n;

.field public H:Z

.field public I:Lk2/n0;

.field public J:Ljava/util/Set;

.field public K:[I

.field public L:I

.field public M:Z

.field public N:[Z

.field public O:[Z

.field public P:J

.field public Q:J

.field public R:Z

.field public S:Z

.field public T:Z

.field public U:Z

.field public V:J

.field public W:LN1/j;

.field public X:La2/l;

.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:LA/e0;

.field public final d:La2/j;

.field public final e:Lo2/e;

.field public final f:LN1/n;

.field public final g:LZ1/g;

.field public final h:LZ1/d;

.field public final i:Lae/d;

.field public final j:Lo2/m;

.field public final k:LZ1/d;

.field public final l:I

.field public final m:LE5/b;

.field public final n:Ljava/util/ArrayList;

.field public final o:Ljava/util/List;

.field public final p:La2/p;

.field public final q:La2/p;

.field public final r:Landroid/os/Handler;

.field public final s:Ljava/util/ArrayList;

.field public final t:Ljava/util/Map;

.field public u:Ll2/e;

.field public v:[La2/r;

.field public w:[I

.field public final x:Ljava/util/HashSet;

.field public final y:Landroid/util/SparseIntArray;

.field public z:La2/q;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    const/4 v3, 0x2

    .line 9
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    const/4 v5, 0x5

    .line 14
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    const/4 v6, 0x3

    .line 19
    new-array v6, v6, [Ljava/lang/Integer;

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    aput-object v2, v6, v7

    .line 23
    .line 24
    aput-object v4, v6, v1

    .line 25
    .line 26
    aput-object v5, v6, v3

    .line 27
    .line 28
    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, La2/s;->Y:Ljava/util/Set;

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILA/e0;La2/j;Ljava/util/Map;Lo2/e;JLN1/n;LZ1/g;LZ1/d;Lae/d;LZ1/d;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La2/s;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, La2/s;->b:I

    .line 7
    .line 8
    iput-object p3, p0, La2/s;->c:LA/e0;

    .line 9
    .line 10
    iput-object p4, p0, La2/s;->d:La2/j;

    .line 11
    .line 12
    iput-object p5, p0, La2/s;->t:Ljava/util/Map;

    .line 13
    .line 14
    iput-object p6, p0, La2/s;->e:Lo2/e;

    .line 15
    .line 16
    iput-object p9, p0, La2/s;->f:LN1/n;

    .line 17
    .line 18
    iput-object p10, p0, La2/s;->g:LZ1/g;

    .line 19
    .line 20
    iput-object p11, p0, La2/s;->h:LZ1/d;

    .line 21
    .line 22
    iput-object p12, p0, La2/s;->i:Lae/d;

    .line 23
    .line 24
    iput-object p13, p0, La2/s;->k:LZ1/d;

    .line 25
    .line 26
    iput p14, p0, La2/s;->l:I

    .line 27
    .line 28
    new-instance p1, Lo2/m;

    .line 29
    .line 30
    const-string p2, "Loader:HlsSampleStreamWrapper"

    .line 31
    .line 32
    invoke-direct {p1, p2}, Lo2/m;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, La2/s;->j:Lo2/m;

    .line 36
    .line 37
    new-instance p1, LE5/b;

    .line 38
    .line 39
    const/4 p2, 0x6

    .line 40
    invoke-direct {p1, p2}, LE5/b;-><init>(I)V

    .line 41
    .line 42
    .line 43
    const/4 p2, 0x0

    .line 44
    iput-object p2, p1, LE5/b;->c:Ljava/lang/Object;

    .line 45
    .line 46
    const/4 p3, 0x0

    .line 47
    iput-boolean p3, p1, LE5/b;->b:Z

    .line 48
    .line 49
    iput-object p2, p1, LE5/b;->d:Ljava/lang/Object;

    .line 50
    .line 51
    iput-object p1, p0, La2/s;->m:LE5/b;

    .line 52
    .line 53
    new-array p1, p3, [I

    .line 54
    .line 55
    iput-object p1, p0, La2/s;->w:[I

    .line 56
    .line 57
    new-instance p1, Ljava/util/HashSet;

    .line 58
    .line 59
    sget-object p4, La2/s;->Y:Ljava/util/Set;

    .line 60
    .line 61
    invoke-interface {p4}, Ljava/util/Set;->size()I

    .line 62
    .line 63
    .line 64
    move-result p5

    .line 65
    invoke-direct {p1, p5}, Ljava/util/HashSet;-><init>(I)V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, La2/s;->x:Ljava/util/HashSet;

    .line 69
    .line 70
    new-instance p1, Landroid/util/SparseIntArray;

    .line 71
    .line 72
    invoke-interface {p4}, Ljava/util/Set;->size()I

    .line 73
    .line 74
    .line 75
    move-result p4

    .line 76
    invoke-direct {p1, p4}, Landroid/util/SparseIntArray;-><init>(I)V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, La2/s;->y:Landroid/util/SparseIntArray;

    .line 80
    .line 81
    new-array p1, p3, [La2/r;

    .line 82
    .line 83
    iput-object p1, p0, La2/s;->v:[La2/r;

    .line 84
    .line 85
    new-array p1, p3, [Z

    .line 86
    .line 87
    iput-object p1, p0, La2/s;->O:[Z

    .line 88
    .line 89
    new-array p1, p3, [Z

    .line 90
    .line 91
    iput-object p1, p0, La2/s;->N:[Z

    .line 92
    .line 93
    new-instance p1, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    iput-object p1, p0, La2/s;->n:Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iput-object p1, p0, La2/s;->o:Ljava/util/List;

    .line 105
    .line 106
    new-instance p1, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 109
    .line 110
    .line 111
    iput-object p1, p0, La2/s;->s:Ljava/util/ArrayList;

    .line 112
    .line 113
    new-instance p1, La2/p;

    .line 114
    .line 115
    const/4 p3, 0x0

    .line 116
    invoke-direct {p1, p0, p3}, La2/p;-><init>(La2/s;I)V

    .line 117
    .line 118
    .line 119
    iput-object p1, p0, La2/s;->p:La2/p;

    .line 120
    .line 121
    new-instance p1, La2/p;

    .line 122
    .line 123
    const/4 p3, 0x1

    .line 124
    invoke-direct {p1, p0, p3}, La2/p;-><init>(La2/s;I)V

    .line 125
    .line 126
    .line 127
    iput-object p1, p0, La2/s;->q:La2/p;

    .line 128
    .line 129
    invoke-static {p2}, LQ1/x;->m(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    iput-object p1, p0, La2/s;->r:Landroid/os/Handler;

    .line 134
    .line 135
    iput-wide p7, p0, La2/s;->P:J

    .line 136
    .line 137
    iput-wide p7, p0, La2/s;->Q:J

    .line 138
    .line 139
    return-void
.end method

.method public static g(II)Ls2/l;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Unmapped track with id "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, " of type "

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string p1, "HlsSampleStreamWrapper"

    .line 24
    .line 25
    invoke-static {p1, p0}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    new-instance p0, Ls2/l;

    .line 29
    .line 30
    invoke-direct {p0}, Ls2/l;-><init>()V

    .line 31
    .line 32
    .line 33
    return-object p0
.end method

.method public static u(LN1/n;LN1/n;Z)LN1/n;
    .locals 8

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-object p1

    .line 4
    :cond_0
    iget-object v0, p1, LN1/n;->n:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v0}, LN1/C;->h(Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    iget-object v2, p0, LN1/n;->k:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v1, v2}, LQ1/x;->s(ILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, 0x1

    .line 17
    if-ne v3, v4, :cond_1

    .line 18
    .line 19
    invoke-static {v1, v2}, LQ1/x;->t(ILjava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, LN1/C;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-static {v2, v0}, LN1/C;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    move-object v7, v2

    .line 33
    move-object v2, v0

    .line 34
    move-object v0, v7

    .line 35
    :goto_0
    invoke-virtual {p1}, LN1/n;->a()LN1/m;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iget-object v5, p0, LN1/n;->a:Ljava/lang/String;

    .line 40
    .line 41
    iput-object v5, v3, LN1/m;->a:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v5, p0, LN1/n;->b:Ljava/lang/String;

    .line 44
    .line 45
    iput-object v5, v3, LN1/m;->b:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v5, p0, LN1/n;->c:Ll8/K;

    .line 48
    .line 49
    invoke-static {v5}, Ll8/K;->j(Ljava/util/Collection;)Ll8/K;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    iput-object v5, v3, LN1/m;->c:Ll8/K;

    .line 54
    .line 55
    iget-object v5, p0, LN1/n;->d:Ljava/lang/String;

    .line 56
    .line 57
    iput-object v5, v3, LN1/m;->d:Ljava/lang/String;

    .line 58
    .line 59
    iget v5, p0, LN1/n;->e:I

    .line 60
    .line 61
    iput v5, v3, LN1/m;->e:I

    .line 62
    .line 63
    iget v5, p0, LN1/n;->f:I

    .line 64
    .line 65
    iput v5, v3, LN1/m;->f:I

    .line 66
    .line 67
    const/4 v5, -0x1

    .line 68
    if-eqz p2, :cond_2

    .line 69
    .line 70
    iget v6, p0, LN1/n;->h:I

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    move v6, v5

    .line 74
    :goto_1
    iput v6, v3, LN1/m;->h:I

    .line 75
    .line 76
    if-eqz p2, :cond_3

    .line 77
    .line 78
    iget p2, p0, LN1/n;->i:I

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    move p2, v5

    .line 82
    :goto_2
    iput p2, v3, LN1/m;->i:I

    .line 83
    .line 84
    iput-object v0, v3, LN1/m;->j:Ljava/lang/String;

    .line 85
    .line 86
    const/4 p2, 0x2

    .line 87
    if-ne v1, p2, :cond_4

    .line 88
    .line 89
    iget p2, p0, LN1/n;->u:I

    .line 90
    .line 91
    iput p2, v3, LN1/m;->t:I

    .line 92
    .line 93
    iget p2, p0, LN1/n;->v:I

    .line 94
    .line 95
    iput p2, v3, LN1/m;->u:I

    .line 96
    .line 97
    iget p2, p0, LN1/n;->w:F

    .line 98
    .line 99
    iput p2, v3, LN1/m;->v:F

    .line 100
    .line 101
    :cond_4
    if-eqz v2, :cond_5

    .line 102
    .line 103
    invoke-static {v2}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    iput-object p2, v3, LN1/m;->m:Ljava/lang/String;

    .line 108
    .line 109
    :cond_5
    iget p2, p0, LN1/n;->C:I

    .line 110
    .line 111
    if-eq p2, v5, :cond_6

    .line 112
    .line 113
    if-ne v1, v4, :cond_6

    .line 114
    .line 115
    iput p2, v3, LN1/m;->B:I

    .line 116
    .line 117
    :cond_6
    iget-object p0, p0, LN1/n;->l:LN1/B;

    .line 118
    .line 119
    if-eqz p0, :cond_8

    .line 120
    .line 121
    iget-object p1, p1, LN1/n;->l:LN1/B;

    .line 122
    .line 123
    if-eqz p1, :cond_7

    .line 124
    .line 125
    invoke-virtual {p1, p0}, LN1/B;->e(LN1/B;)LN1/B;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    :cond_7
    iput-object p0, v3, LN1/m;->k:LN1/B;

    .line 130
    .line 131
    :cond_8
    new-instance p0, LN1/n;

    .line 132
    .line 133
    invoke-direct {p0, v3}, LN1/n;-><init>(LN1/m;)V

    .line 134
    .line 135
    .line 136
    return-object p0
.end method

.method public static y(I)I
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eq p0, v1, :cond_2

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    if-eq p0, v0, :cond_1

    .line 7
    .line 8
    if-eq p0, v2, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_0
    return v1

    .line 13
    :cond_1
    return v2

    .line 14
    :cond_2
    return v0
.end method


# virtual methods
.method public final A(Lo2/j;JJ)V
    .locals 12

    .line 1
    check-cast p1, Ll2/e;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, La2/s;->u:Ll2/e;

    .line 5
    .line 6
    iget-object v0, p0, La2/s;->d:La2/j;

    .line 7
    .line 8
    instance-of v1, p1, La2/f;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    move-object v1, p1

    .line 13
    check-cast v1, La2/f;

    .line 14
    .line 15
    iget-object v2, v1, La2/f;->j:[B

    .line 16
    .line 17
    iput-object v2, v0, La2/j;->m:[B

    .line 18
    .line 19
    iget-object v2, v1, Ll2/e;->b:LS1/k;

    .line 20
    .line 21
    iget-object v2, v2, LS1/k;->a:Landroid/net/Uri;

    .line 22
    .line 23
    iget-object v1, v1, La2/f;->l:[B

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v0, v0, La2/j;->j:LY9/c;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object v0, v0, LY9/c;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, La2/e;

    .line 39
    .line 40
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, [B

    .line 45
    .line 46
    :cond_0
    new-instance v2, Lk2/z;

    .line 47
    .line 48
    iget-wide v0, p1, Ll2/e;->a:J

    .line 49
    .line 50
    iget-object v0, p1, Ll2/e;->i:LS1/z;

    .line 51
    .line 52
    iget-object v0, v0, LS1/z;->c:Landroid/net/Uri;

    .line 53
    .line 54
    move-wide/from16 v0, p4

    .line 55
    .line 56
    invoke-direct {v2, v0, v1}, Lk2/z;-><init>(J)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, La2/s;->i:Lae/d;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v1, p0, La2/s;->k:LZ1/d;

    .line 65
    .line 66
    iget-wide v8, p1, Ll2/e;->g:J

    .line 67
    .line 68
    iget-wide v10, p1, Ll2/e;->h:J

    .line 69
    .line 70
    iget v3, p1, Ll2/e;->c:I

    .line 71
    .line 72
    iget v4, p0, La2/s;->b:I

    .line 73
    .line 74
    iget-object v5, p1, Ll2/e;->d:LN1/n;

    .line 75
    .line 76
    iget v6, p1, Ll2/e;->e:I

    .line 77
    .line 78
    iget-object v7, p1, Ll2/e;->f:Ljava/lang/Object;

    .line 79
    .line 80
    invoke-virtual/range {v1 .. v11}, LZ1/d;->e(Lk2/z;IILN1/n;ILjava/lang/Object;JJ)V

    .line 81
    .line 82
    .line 83
    iget-boolean p1, p0, La2/s;->D:Z

    .line 84
    .line 85
    if-nez p1, :cond_1

    .line 86
    .line 87
    new-instance p1, LU1/B;

    .line 88
    .line 89
    invoke-direct {p1}, LU1/B;-><init>()V

    .line 90
    .line 91
    .line 92
    iget-wide v0, p0, La2/s;->P:J

    .line 93
    .line 94
    iput-wide v0, p1, LU1/B;->a:J

    .line 95
    .line 96
    new-instance v0, LU1/C;

    .line 97
    .line 98
    invoke-direct {v0, p1}, LU1/C;-><init>(LU1/B;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v0}, La2/s;->k(LU1/C;)Z

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_1
    iget-object p1, p0, La2/s;->c:LA/e0;

    .line 106
    .line 107
    invoke-virtual {p1, p0}, LA/e0;->a(Lk2/f0;)V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public final B()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-boolean v3, v0, La2/s;->H:Z

    .line 6
    .line 7
    if-nez v3, :cond_1a

    .line 8
    .line 9
    iget-object v3, v0, La2/s;->K:[I

    .line 10
    .line 11
    if-nez v3, :cond_1a

    .line 12
    .line 13
    iget-boolean v3, v0, La2/s;->C:Z

    .line 14
    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    goto/16 :goto_12

    .line 18
    .line 19
    :cond_0
    iget-object v3, v0, La2/s;->v:[La2/r;

    .line 20
    .line 21
    array-length v4, v3

    .line 22
    move v5, v1

    .line 23
    :goto_0
    if-ge v5, v4, :cond_2

    .line 24
    .line 25
    aget-object v6, v3, v5

    .line 26
    .line 27
    invoke-virtual {v6}, Lk2/c0;->u()LN1/n;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    if-nez v6, :cond_1

    .line 32
    .line 33
    goto/16 :goto_12

    .line 34
    .line 35
    :cond_1
    add-int/2addr v5, v2

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    iget-object v3, v0, La2/s;->I:Lk2/n0;

    .line 38
    .line 39
    const/4 v4, 0x3

    .line 40
    const/4 v5, -0x1

    .line 41
    if-eqz v3, :cond_a

    .line 42
    .line 43
    iget v3, v3, Lk2/n0;->a:I

    .line 44
    .line 45
    new-array v6, v3, [I

    .line 46
    .line 47
    iput-object v6, v0, La2/s;->K:[I

    .line 48
    .line 49
    invoke-static {v6, v5}, Ljava/util/Arrays;->fill([II)V

    .line 50
    .line 51
    .line 52
    move v5, v1

    .line 53
    :goto_1
    if-ge v5, v3, :cond_9

    .line 54
    .line 55
    move v6, v1

    .line 56
    :goto_2
    iget-object v7, v0, La2/s;->v:[La2/r;

    .line 57
    .line 58
    array-length v8, v7

    .line 59
    if-ge v6, v8, :cond_8

    .line 60
    .line 61
    aget-object v7, v7, v6

    .line 62
    .line 63
    invoke-virtual {v7}, Lk2/c0;->u()LN1/n;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    invoke-static {v7}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object v8, v0, La2/s;->I:Lk2/n0;

    .line 71
    .line 72
    invoke-virtual {v8, v5}, Lk2/n0;->a(I)LN1/O;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    iget-object v8, v8, LN1/O;->d:[LN1/n;

    .line 77
    .line 78
    aget-object v8, v8, v1

    .line 79
    .line 80
    iget-object v9, v8, LN1/n;->n:Ljava/lang/String;

    .line 81
    .line 82
    iget-object v10, v7, LN1/n;->n:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v10}, LN1/C;->h(Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result v11

    .line 88
    if-eq v11, v4, :cond_3

    .line 89
    .line 90
    invoke-static {v9}, LN1/C;->h(Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-ne v11, v7, :cond_7

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_3
    sget v11, LQ1/x;->a:I

    .line 98
    .line 99
    invoke-static {v10, v9}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    if-nez v9, :cond_4

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_4
    const-string v9, "application/cea-608"

    .line 107
    .line 108
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v9

    .line 112
    if-nez v9, :cond_5

    .line 113
    .line 114
    const-string v9, "application/cea-708"

    .line 115
    .line 116
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    if-eqz v9, :cond_6

    .line 121
    .line 122
    :cond_5
    iget v7, v7, LN1/n;->H:I

    .line 123
    .line 124
    iget v8, v8, LN1/n;->H:I

    .line 125
    .line 126
    if-ne v7, v8, :cond_7

    .line 127
    .line 128
    :cond_6
    :goto_3
    iget-object v7, v0, La2/s;->K:[I

    .line 129
    .line 130
    aput v6, v7, v5

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_7
    :goto_4
    add-int/2addr v6, v2

    .line 134
    goto :goto_2

    .line 135
    :cond_8
    :goto_5
    add-int/2addr v5, v2

    .line 136
    goto :goto_1

    .line 137
    :cond_9
    iget-object v1, v0, La2/s;->s:Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-eqz v2, :cond_1a

    .line 148
    .line 149
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    check-cast v2, La2/o;

    .line 154
    .line 155
    invoke-virtual {v2}, La2/o;->b()V

    .line 156
    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_a
    iget-object v3, v0, La2/s;->v:[La2/r;

    .line 160
    .line 161
    array-length v3, v3

    .line 162
    const/4 v6, -0x2

    .line 163
    move v7, v1

    .line 164
    move v9, v5

    .line 165
    move v8, v6

    .line 166
    :goto_7
    const/4 v10, 0x2

    .line 167
    if-ge v7, v3, :cond_10

    .line 168
    .line 169
    iget-object v11, v0, La2/s;->v:[La2/r;

    .line 170
    .line 171
    aget-object v11, v11, v7

    .line 172
    .line 173
    invoke-virtual {v11}, Lk2/c0;->u()LN1/n;

    .line 174
    .line 175
    .line 176
    move-result-object v11

    .line 177
    invoke-static {v11}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    iget-object v11, v11, LN1/n;->n:Ljava/lang/String;

    .line 181
    .line 182
    invoke-static {v11}, LN1/C;->l(Ljava/lang/String;)Z

    .line 183
    .line 184
    .line 185
    move-result v12

    .line 186
    if-eqz v12, :cond_b

    .line 187
    .line 188
    goto :goto_8

    .line 189
    :cond_b
    invoke-static {v11}, LN1/C;->i(Ljava/lang/String;)Z

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    if-eqz v10, :cond_c

    .line 194
    .line 195
    move v10, v2

    .line 196
    goto :goto_8

    .line 197
    :cond_c
    invoke-static {v11}, LN1/C;->k(Ljava/lang/String;)Z

    .line 198
    .line 199
    .line 200
    move-result v10

    .line 201
    if-eqz v10, :cond_d

    .line 202
    .line 203
    move v10, v4

    .line 204
    goto :goto_8

    .line 205
    :cond_d
    move v10, v6

    .line 206
    :goto_8
    invoke-static {v10}, La2/s;->y(I)I

    .line 207
    .line 208
    .line 209
    move-result v11

    .line 210
    invoke-static {v8}, La2/s;->y(I)I

    .line 211
    .line 212
    .line 213
    move-result v12

    .line 214
    if-le v11, v12, :cond_e

    .line 215
    .line 216
    move v9, v7

    .line 217
    move v8, v10

    .line 218
    goto :goto_9

    .line 219
    :cond_e
    if-ne v10, v8, :cond_f

    .line 220
    .line 221
    if-eq v9, v5, :cond_f

    .line 222
    .line 223
    move v9, v5

    .line 224
    :cond_f
    :goto_9
    add-int/2addr v7, v2

    .line 225
    goto :goto_7

    .line 226
    :cond_10
    iget-object v4, v0, La2/s;->d:La2/j;

    .line 227
    .line 228
    iget-object v4, v4, La2/j;->h:LN1/O;

    .line 229
    .line 230
    iget v6, v4, LN1/O;->a:I

    .line 231
    .line 232
    iput v5, v0, La2/s;->L:I

    .line 233
    .line 234
    new-array v5, v3, [I

    .line 235
    .line 236
    iput-object v5, v0, La2/s;->K:[I

    .line 237
    .line 238
    move v5, v1

    .line 239
    :goto_a
    if-ge v5, v3, :cond_11

    .line 240
    .line 241
    iget-object v7, v0, La2/s;->K:[I

    .line 242
    .line 243
    aput v5, v7, v5

    .line 244
    .line 245
    add-int/2addr v5, v2

    .line 246
    goto :goto_a

    .line 247
    :cond_11
    new-array v5, v3, [LN1/O;

    .line 248
    .line 249
    move v7, v1

    .line 250
    :goto_b
    if-ge v7, v3, :cond_18

    .line 251
    .line 252
    iget-object v11, v0, La2/s;->v:[La2/r;

    .line 253
    .line 254
    aget-object v11, v11, v7

    .line 255
    .line 256
    invoke-virtual {v11}, Lk2/c0;->u()LN1/n;

    .line 257
    .line 258
    .line 259
    move-result-object v11

    .line 260
    invoke-static {v11}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    iget-object v12, v0, La2/s;->a:Ljava/lang/String;

    .line 264
    .line 265
    iget-object v13, v0, La2/s;->f:LN1/n;

    .line 266
    .line 267
    if-ne v7, v9, :cond_15

    .line 268
    .line 269
    new-array v14, v6, [LN1/n;

    .line 270
    .line 271
    move v15, v1

    .line 272
    :goto_c
    if-ge v15, v6, :cond_14

    .line 273
    .line 274
    iget-object v1, v4, LN1/O;->d:[LN1/n;

    .line 275
    .line 276
    aget-object v1, v1, v15

    .line 277
    .line 278
    if-ne v8, v2, :cond_12

    .line 279
    .line 280
    if-eqz v13, :cond_12

    .line 281
    .line 282
    invoke-virtual {v1, v13}, LN1/n;->d(LN1/n;)LN1/n;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    :cond_12
    if-ne v6, v2, :cond_13

    .line 287
    .line 288
    invoke-virtual {v11, v1}, LN1/n;->d(LN1/n;)LN1/n;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    goto :goto_d

    .line 293
    :cond_13
    invoke-static {v1, v11, v2}, La2/s;->u(LN1/n;LN1/n;Z)LN1/n;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    :goto_d
    aput-object v1, v14, v15

    .line 298
    .line 299
    add-int/2addr v15, v2

    .line 300
    const/4 v1, 0x0

    .line 301
    goto :goto_c

    .line 302
    :cond_14
    new-instance v1, LN1/O;

    .line 303
    .line 304
    invoke-direct {v1, v12, v14}, LN1/O;-><init>(Ljava/lang/String;[LN1/n;)V

    .line 305
    .line 306
    .line 307
    aput-object v1, v5, v7

    .line 308
    .line 309
    iput v7, v0, La2/s;->L:I

    .line 310
    .line 311
    const/4 v14, 0x0

    .line 312
    goto :goto_10

    .line 313
    :cond_15
    if-ne v8, v10, :cond_16

    .line 314
    .line 315
    iget-object v1, v11, LN1/n;->n:Ljava/lang/String;

    .line 316
    .line 317
    invoke-static {v1}, LN1/C;->i(Ljava/lang/String;)Z

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    if-eqz v1, :cond_16

    .line 322
    .line 323
    goto :goto_e

    .line 324
    :cond_16
    const/4 v13, 0x0

    .line 325
    :goto_e
    const-string v1, ":muxed:"

    .line 326
    .line 327
    invoke-static {v12, v1}, LA7/p0;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    if-ge v7, v9, :cond_17

    .line 332
    .line 333
    move v12, v7

    .line 334
    goto :goto_f

    .line 335
    :cond_17
    add-int/lit8 v12, v7, -0x1

    .line 336
    .line 337
    :goto_f
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    new-instance v12, LN1/O;

    .line 345
    .line 346
    const/4 v14, 0x0

    .line 347
    invoke-static {v13, v11, v14}, La2/s;->u(LN1/n;LN1/n;Z)LN1/n;

    .line 348
    .line 349
    .line 350
    move-result-object v11

    .line 351
    new-array v13, v2, [LN1/n;

    .line 352
    .line 353
    aput-object v11, v13, v14

    .line 354
    .line 355
    invoke-direct {v12, v1, v13}, LN1/O;-><init>(Ljava/lang/String;[LN1/n;)V

    .line 356
    .line 357
    .line 358
    aput-object v12, v5, v7

    .line 359
    .line 360
    :goto_10
    add-int/2addr v7, v2

    .line 361
    move v1, v14

    .line 362
    goto :goto_b

    .line 363
    :cond_18
    move v14, v1

    .line 364
    invoke-virtual {v0, v5}, La2/s;->t([LN1/O;)Lk2/n0;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    iput-object v1, v0, La2/s;->I:Lk2/n0;

    .line 369
    .line 370
    iget-object v1, v0, La2/s;->J:Ljava/util/Set;

    .line 371
    .line 372
    if-nez v1, :cond_19

    .line 373
    .line 374
    move v1, v2

    .line 375
    goto :goto_11

    .line 376
    :cond_19
    move v1, v14

    .line 377
    :goto_11
    invoke-static {v1}, LQ1/k;->g(Z)V

    .line 378
    .line 379
    .line 380
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 381
    .line 382
    iput-object v1, v0, La2/s;->J:Ljava/util/Set;

    .line 383
    .line 384
    iput-boolean v2, v0, La2/s;->D:Z

    .line 385
    .line 386
    iget-object v1, v0, La2/s;->c:LA/e0;

    .line 387
    .line 388
    invoke-virtual {v1}, LA/e0;->u()V

    .line 389
    .line 390
    .line 391
    :cond_1a
    :goto_12
    return-void
.end method

.method public final C()V
    .locals 2

    .line 1
    iget-object v0, p0, La2/s;->r:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, La2/s;->p:La2/p;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final D()V
    .locals 3

    .line 1
    iget-object v0, p0, La2/s;->j:Lo2/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo2/m;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La2/s;->d:La2/j;

    .line 7
    .line 8
    iget-object v1, v0, La2/j;->n:Lk2/b;

    .line 9
    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    iget-object v1, v0, La2/j;->o:Landroid/net/Uri;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-boolean v2, v0, La2/j;->s:Z

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget-object v0, v0, La2/j;->g:Lb2/c;

    .line 21
    .line 22
    iget-object v0, v0, Lb2/c;->d:Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lb2/b;

    .line 29
    .line 30
    iget-object v1, v0, Lb2/b;->b:Lo2/m;

    .line 31
    .line 32
    invoke-virtual {v1}, Lo2/m;->a()V

    .line 33
    .line 34
    .line 35
    iget-object v0, v0, Lb2/b;->j:Ljava/io/IOException;

    .line 36
    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    throw v0

    .line 41
    :cond_1
    :goto_0
    return-void

    .line 42
    :cond_2
    throw v1
.end method

.method public final E(Lo2/j;JJLjava/io/IOException;I)LU5/f;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v12, p6

    .line 4
    .line 5
    move-object/from16 v1, p1

    .line 6
    .line 7
    check-cast v1, Ll2/e;

    .line 8
    .line 9
    instance-of v2, v1, La2/l;

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    move-object v3, v1

    .line 14
    check-cast v3, La2/l;

    .line 15
    .line 16
    iget-boolean v3, v3, La2/l;->K:Z

    .line 17
    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    instance-of v3, v12, LS1/u;

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    move-object v3, v12

    .line 25
    check-cast v3, LS1/u;

    .line 26
    .line 27
    iget v3, v3, LS1/u;->d:I

    .line 28
    .line 29
    const/16 v4, 0x19a

    .line 30
    .line 31
    if-eq v3, v4, :cond_0

    .line 32
    .line 33
    const/16 v4, 0x194

    .line 34
    .line 35
    if-ne v3, v4, :cond_1

    .line 36
    .line 37
    :cond_0
    sget-object v1, Lo2/m;->d:LU5/f;

    .line 38
    .line 39
    return-object v1

    .line 40
    :cond_1
    iget-object v3, v1, Ll2/e;->i:LS1/z;

    .line 41
    .line 42
    iget-wide v3, v3, LS1/z;->b:J

    .line 43
    .line 44
    move v5, v2

    .line 45
    new-instance v2, Lk2/z;

    .line 46
    .line 47
    iget-object v6, v1, Ll2/e;->i:LS1/z;

    .line 48
    .line 49
    iget-object v6, v6, LS1/z;->c:Landroid/net/Uri;

    .line 50
    .line 51
    move-wide/from16 v6, p4

    .line 52
    .line 53
    invoke-direct {v2, v6, v7}, Lk2/z;-><init>(J)V

    .line 54
    .line 55
    .line 56
    iget-wide v6, v1, Ll2/e;->g:J

    .line 57
    .line 58
    invoke-static {v6, v7}, LQ1/x;->W(J)J

    .line 59
    .line 60
    .line 61
    iget-wide v6, v1, Ll2/e;->h:J

    .line 62
    .line 63
    invoke-static {v6, v7}, LQ1/x;->W(J)J

    .line 64
    .line 65
    .line 66
    new-instance v6, LA/x;

    .line 67
    .line 68
    const/16 v7, 0x11

    .line 69
    .line 70
    move/from16 v8, p7

    .line 71
    .line 72
    invoke-direct {v6, v12, v8, v7}, LA/x;-><init>(Ljava/lang/Object;II)V

    .line 73
    .line 74
    .line 75
    iget-object v7, v0, La2/s;->d:La2/j;

    .line 76
    .line 77
    iget-object v8, v7, La2/j;->q:Ln2/q;

    .line 78
    .line 79
    invoke-static {v8}, Lff/B;->o(Ln2/q;)LF6/p;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    iget-object v9, v0, La2/s;->i:Lae/d;

    .line 84
    .line 85
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-static {v8, v6}, Lae/d;->f(LF6/p;LA/x;)LU5/f;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    const/4 v9, 0x0

    .line 93
    if-eqz v8, :cond_2

    .line 94
    .line 95
    iget v10, v8, LU5/f;->a:I

    .line 96
    .line 97
    const/4 v11, 0x2

    .line 98
    if-ne v10, v11, :cond_2

    .line 99
    .line 100
    iget-object v10, v7, La2/j;->q:Ln2/q;

    .line 101
    .line 102
    iget-object v7, v7, La2/j;->h:LN1/O;

    .line 103
    .line 104
    iget-object v11, v1, Ll2/e;->d:LN1/n;

    .line 105
    .line 106
    invoke-virtual {v7, v11}, LN1/O;->a(LN1/n;)I

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    invoke-interface {v10, v7}, Ln2/q;->f(I)I

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    iget-wide v13, v8, LU5/f;->b:J

    .line 115
    .line 116
    invoke-interface {v10, v7, v13, v14}, Ln2/q;->o(IJ)Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    move v14, v7

    .line 121
    goto :goto_0

    .line 122
    :cond_2
    move v14, v9

    .line 123
    :goto_0
    if-eqz v14, :cond_6

    .line 124
    .line 125
    if-eqz v5, :cond_5

    .line 126
    .line 127
    const-wide/16 v5, 0x0

    .line 128
    .line 129
    cmp-long v3, v3, v5

    .line 130
    .line 131
    if-nez v3, :cond_5

    .line 132
    .line 133
    iget-object v3, v0, La2/s;->n:Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    const/4 v5, 0x1

    .line 140
    sub-int/2addr v4, v5

    .line 141
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    check-cast v4, La2/l;

    .line 146
    .line 147
    if-ne v4, v1, :cond_3

    .line 148
    .line 149
    move v9, v5

    .line 150
    :cond_3
    invoke-static {v9}, LQ1/k;->g(Z)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    if-eqz v4, :cond_4

    .line 158
    .line 159
    iget-wide v3, v0, La2/s;->P:J

    .line 160
    .line 161
    iput-wide v3, v0, La2/s;->Q:J

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_4
    invoke-static {v3}, Ll8/s;->j(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    check-cast v3, La2/l;

    .line 169
    .line 170
    iput-boolean v5, v3, La2/l;->J:Z

    .line 171
    .line 172
    :cond_5
    :goto_1
    sget-object v3, Lo2/m;->e:LU5/f;

    .line 173
    .line 174
    :goto_2
    move-object v15, v3

    .line 175
    goto :goto_3

    .line 176
    :cond_6
    invoke-static {v6}, Lae/d;->h(LA/x;)J

    .line 177
    .line 178
    .line 179
    move-result-wide v3

    .line 180
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    cmp-long v5, v3, v5

    .line 186
    .line 187
    if-eqz v5, :cond_7

    .line 188
    .line 189
    new-instance v5, LU5/f;

    .line 190
    .line 191
    const/4 v6, 0x0

    .line 192
    invoke-direct {v5, v3, v4, v9, v6}, LU5/f;-><init>(JIZ)V

    .line 193
    .line 194
    .line 195
    move-object v3, v5

    .line 196
    goto :goto_2

    .line 197
    :cond_7
    sget-object v3, Lo2/m;->f:LU5/f;

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :goto_3
    invoke-virtual {v15}, LU5/f;->a()Z

    .line 201
    .line 202
    .line 203
    move-result v16

    .line 204
    xor-int/lit8 v13, v16, 0x1

    .line 205
    .line 206
    iget-object v3, v0, La2/s;->k:LZ1/d;

    .line 207
    .line 208
    iget-wide v8, v1, Ll2/e;->g:J

    .line 209
    .line 210
    iget-wide v10, v1, Ll2/e;->h:J

    .line 211
    .line 212
    move-object v4, v3

    .line 213
    iget v3, v1, Ll2/e;->c:I

    .line 214
    .line 215
    move-object v5, v4

    .line 216
    iget v4, v0, La2/s;->b:I

    .line 217
    .line 218
    move-object v6, v5

    .line 219
    iget-object v5, v1, Ll2/e;->d:LN1/n;

    .line 220
    .line 221
    move-object v7, v6

    .line 222
    iget v6, v1, Ll2/e;->e:I

    .line 223
    .line 224
    iget-object v1, v1, Ll2/e;->f:Ljava/lang/Object;

    .line 225
    .line 226
    move-object/from16 v17, v7

    .line 227
    .line 228
    move-object v7, v1

    .line 229
    move-object/from16 v1, v17

    .line 230
    .line 231
    invoke-virtual/range {v1 .. v13}, LZ1/d;->f(Lk2/z;IILN1/n;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    .line 232
    .line 233
    .line 234
    if-nez v16, :cond_8

    .line 235
    .line 236
    const/4 v1, 0x0

    .line 237
    iput-object v1, v0, La2/s;->u:Ll2/e;

    .line 238
    .line 239
    :cond_8
    if-eqz v14, :cond_a

    .line 240
    .line 241
    iget-boolean v1, v0, La2/s;->D:Z

    .line 242
    .line 243
    if-nez v1, :cond_9

    .line 244
    .line 245
    new-instance v1, LU1/B;

    .line 246
    .line 247
    invoke-direct {v1}, LU1/B;-><init>()V

    .line 248
    .line 249
    .line 250
    iget-wide v2, v0, La2/s;->P:J

    .line 251
    .line 252
    iput-wide v2, v1, LU1/B;->a:J

    .line 253
    .line 254
    new-instance v2, LU1/C;

    .line 255
    .line 256
    invoke-direct {v2, v1}, LU1/C;-><init>(LU1/B;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0, v2}, La2/s;->k(LU1/C;)Z

    .line 260
    .line 261
    .line 262
    return-object v15

    .line 263
    :cond_9
    iget-object v1, v0, La2/s;->c:LA/e0;

    .line 264
    .line 265
    invoke-virtual {v1, v0}, LA/e0;->a(Lk2/f0;)V

    .line 266
    .line 267
    .line 268
    :cond_a
    return-object v15
.end method

.method public final varargs F([LN1/O;[I)V
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, La2/s;->t([LN1/O;)Lk2/n0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, La2/s;->I:Lk2/n0;

    .line 6
    .line 7
    new-instance p1, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La2/s;->J:Ljava/util/Set;

    .line 13
    .line 14
    array-length p1, p2

    .line 15
    const/4 v0, 0x0

    .line 16
    move v1, v0

    .line 17
    :goto_0
    if-ge v1, p1, :cond_0

    .line 18
    .line 19
    aget v2, p2, v1

    .line 20
    .line 21
    iget-object v3, p0, La2/s;->J:Ljava/util/Set;

    .line 22
    .line 23
    iget-object v4, p0, La2/s;->I:Lk2/n0;

    .line 24
    .line 25
    invoke-virtual {v4, v2}, Lk2/n0;->a(I)LN1/O;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iput v0, p0, La2/s;->L:I

    .line 36
    .line 37
    iget-object p1, p0, La2/s;->r:Landroid/os/Handler;

    .line 38
    .line 39
    iget-object p2, p0, La2/s;->c:LA/e0;

    .line 40
    .line 41
    new-instance v0, LC8/g;

    .line 42
    .line 43
    const/16 v1, 0x18

    .line 44
    .line 45
    invoke-direct {v0, p2, v1}, LC8/g;-><init>(Ljava/lang/Object;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    iput-boolean p1, p0, La2/s;->D:Z

    .line 53
    .line 54
    return-void
.end method

.method public final G()V
    .locals 6

    .line 1
    iget-object v0, p0, La2/s;->v:[La2/r;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_0

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    iget-boolean v5, p0, La2/s;->R:Z

    .line 11
    .line 12
    invoke-virtual {v4, v5}, Lk2/c0;->C(Z)V

    .line 13
    .line 14
    .line 15
    add-int/lit8 v3, v3, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iput-boolean v2, p0, La2/s;->R:Z

    .line 19
    .line 20
    return-void
.end method

.method public final H(JZ)Z
    .locals 8

    .line 1
    iput-wide p1, p0, La2/s;->P:J

    .line 2
    .line 3
    invoke-virtual {p0}, La2/s;->z()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iput-wide p1, p0, La2/s;->Q:J

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    iget-object v0, p0, La2/s;->d:La2/j;

    .line 14
    .line 15
    iget-boolean v0, v0, La2/j;->p:Z

    .line 16
    .line 17
    iget-object v2, p0, La2/s;->n:Ljava/util/ArrayList;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    move v0, v4

    .line 24
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-ge v0, v5, :cond_2

    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    check-cast v5, La2/l;

    .line 35
    .line 36
    iget-wide v6, v5, Ll2/e;->g:J

    .line 37
    .line 38
    cmp-long v6, v6, p1

    .line 39
    .line 40
    if-nez v6, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move-object v5, v3

    .line 47
    :goto_1
    iget-boolean v0, p0, La2/s;->C:Z

    .line 48
    .line 49
    if-eqz v0, :cond_7

    .line 50
    .line 51
    if-nez p3, :cond_7

    .line 52
    .line 53
    iget-object p3, p0, La2/s;->v:[La2/r;

    .line 54
    .line 55
    array-length p3, p3

    .line 56
    move v0, v4

    .line 57
    :goto_2
    if-ge v0, p3, :cond_6

    .line 58
    .line 59
    iget-object v6, p0, La2/s;->v:[La2/r;

    .line 60
    .line 61
    aget-object v6, v6, v0

    .line 62
    .line 63
    if-eqz v5, :cond_3

    .line 64
    .line 65
    invoke-virtual {v5, v0}, La2/l;->e(I)I

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    invoke-virtual {v6, v7}, Lk2/c0;->E(I)Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    goto :goto_3

    .line 74
    :cond_3
    invoke-virtual {v6, p1, p2, v4}, Lk2/c0;->F(JZ)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    :goto_3
    if-nez v6, :cond_5

    .line 79
    .line 80
    iget-object v6, p0, La2/s;->O:[Z

    .line 81
    .line 82
    aget-boolean v6, v6, v0

    .line 83
    .line 84
    if-nez v6, :cond_4

    .line 85
    .line 86
    iget-boolean v6, p0, La2/s;->M:Z

    .line 87
    .line 88
    if-nez v6, :cond_5

    .line 89
    .line 90
    :cond_4
    move p3, v4

    .line 91
    goto :goto_4

    .line 92
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_6
    move p3, v1

    .line 96
    :goto_4
    if-eqz p3, :cond_7

    .line 97
    .line 98
    return v4

    .line 99
    :cond_7
    iput-wide p1, p0, La2/s;->Q:J

    .line 100
    .line 101
    iput-boolean v4, p0, La2/s;->T:Z

    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 104
    .line 105
    .line 106
    iget-object p1, p0, La2/s;->j:Lo2/m;

    .line 107
    .line 108
    invoke-virtual {p1}, Lo2/m;->d()Z

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    if-eqz p2, :cond_9

    .line 113
    .line 114
    iget-boolean p2, p0, La2/s;->C:Z

    .line 115
    .line 116
    if-eqz p2, :cond_8

    .line 117
    .line 118
    iget-object p2, p0, La2/s;->v:[La2/r;

    .line 119
    .line 120
    array-length p3, p2

    .line 121
    :goto_5
    if-ge v4, p3, :cond_8

    .line 122
    .line 123
    aget-object v0, p2, v4

    .line 124
    .line 125
    invoke-virtual {v0}, Lk2/c0;->j()V

    .line 126
    .line 127
    .line 128
    add-int/lit8 v4, v4, 0x1

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_8
    invoke-virtual {p1}, Lo2/m;->b()V

    .line 132
    .line 133
    .line 134
    return v1

    .line 135
    :cond_9
    iput-object v3, p1, Lo2/m;->c:Ljava/io/IOException;

    .line 136
    .line 137
    invoke-virtual {p0}, La2/s;->G()V

    .line 138
    .line 139
    .line 140
    return v1
.end method

.method public final a()V
    .locals 1

    .line 1
    iget-boolean v0, p0, La2/s;->D:Z

    .line 2
    .line 3
    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La2/s;->I:Lk2/n0;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, La2/s;->J:Ljava/util/Set;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final c()J
    .locals 2

    .line 1
    invoke-virtual {p0}, La2/s;->z()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-wide v0, p0, La2/s;->Q:J

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    iget-boolean v0, p0, La2/s;->T:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const-wide/high16 v0, -0x8000000000000000L

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_1
    invoke-virtual {p0}, La2/s;->x()La2/l;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-wide v0, v0, Ll2/e;->h:J

    .line 22
    .line 23
    return-wide v0
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-object v0, p0, La2/s;->j:Lo2/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo2/m;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final k(LU1/C;)Z
    .locals 61

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-boolean v2, v0, La2/s;->T:Z

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    iget-object v2, v0, La2/s;->j:Lo2/m;

    .line 10
    .line 11
    invoke-virtual {v2}, Lo2/m;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-nez v4, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2}, Lo2/m;->c()Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    :cond_0
    move/from16 v25, v3

    .line 24
    .line 25
    goto/16 :goto_33

    .line 26
    .line 27
    :cond_1
    invoke-virtual {v0}, La2/s;->z()Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_3

    .line 32
    .line 33
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 34
    .line 35
    iget-wide v5, v0, La2/s;->Q:J

    .line 36
    .line 37
    iget-object v7, v0, La2/s;->v:[La2/r;

    .line 38
    .line 39
    array-length v8, v7

    .line 40
    move v9, v3

    .line 41
    :goto_0
    if-ge v9, v8, :cond_2

    .line 42
    .line 43
    aget-object v10, v7, v9

    .line 44
    .line 45
    iget-wide v11, v0, La2/s;->Q:J

    .line 46
    .line 47
    iput-wide v11, v10, Lk2/c0;->t:J

    .line 48
    .line 49
    add-int/2addr v9, v1

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    :goto_1
    move-object v14, v4

    .line 52
    goto :goto_4

    .line 53
    :cond_3
    invoke-virtual {v0}, La2/s;->x()La2/l;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    iget-boolean v5, v4, La2/l;->H:Z

    .line 58
    .line 59
    if-eqz v5, :cond_4

    .line 60
    .line 61
    iget-wide v4, v4, Ll2/e;->h:J

    .line 62
    .line 63
    :goto_2
    move-wide v5, v4

    .line 64
    goto :goto_3

    .line 65
    :cond_4
    iget-wide v5, v0, La2/s;->P:J

    .line 66
    .line 67
    iget-wide v7, v4, Ll2/e;->g:J

    .line 68
    .line 69
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 70
    .line 71
    .line 72
    move-result-wide v4

    .line 73
    goto :goto_2

    .line 74
    :goto_3
    iget-object v4, v0, La2/s;->o:Ljava/util/List;

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :goto_4
    iget-object v4, v0, La2/s;->m:LE5/b;

    .line 78
    .line 79
    const/4 v7, 0x0

    .line 80
    iput-object v7, v4, LE5/b;->c:Ljava/lang/Object;

    .line 81
    .line 82
    iput-boolean v3, v4, LE5/b;->b:Z

    .line 83
    .line 84
    iput-object v7, v4, LE5/b;->d:Ljava/lang/Object;

    .line 85
    .line 86
    iget-boolean v8, v0, La2/s;->D:Z

    .line 87
    .line 88
    if-nez v8, :cond_6

    .line 89
    .line 90
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-nez v8, :cond_5

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_5
    move/from16 v16, v3

    .line 98
    .line 99
    goto :goto_6

    .line 100
    :cond_6
    :goto_5
    move/from16 v16, v1

    .line 101
    .line 102
    :goto_6
    iget-object v8, v0, La2/s;->d:La2/j;

    .line 103
    .line 104
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    if-eqz v9, :cond_7

    .line 109
    .line 110
    move-object v9, v7

    .line 111
    goto :goto_7

    .line 112
    :cond_7
    invoke-static {v14}, Ll8/s;->j(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    check-cast v9, La2/l;

    .line 117
    .line 118
    :goto_7
    if-nez v9, :cond_8

    .line 119
    .line 120
    const/4 v11, -0x1

    .line 121
    :goto_8
    move-object/from16 v12, p1

    .line 122
    .line 123
    goto :goto_9

    .line 124
    :cond_8
    iget-object v11, v8, La2/j;->h:LN1/O;

    .line 125
    .line 126
    iget-object v12, v9, Ll2/e;->d:LN1/n;

    .line 127
    .line 128
    invoke-virtual {v11, v12}, LN1/O;->a(LN1/n;)I

    .line 129
    .line 130
    .line 131
    move-result v11

    .line 132
    goto :goto_8

    .line 133
    :goto_9
    iget-wide v12, v12, LU1/C;->a:J

    .line 134
    .line 135
    sub-long v17, v5, v12

    .line 136
    .line 137
    move/from16 v19, v11

    .line 138
    .line 139
    iget-wide v10, v8, La2/j;->r:J

    .line 140
    .line 141
    move-object/from16 v21, v2

    .line 142
    .line 143
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    cmp-long v22, v10, v1

    .line 149
    .line 150
    if-eqz v22, :cond_9

    .line 151
    .line 152
    sub-long/2addr v10, v12

    .line 153
    goto :goto_a

    .line 154
    :cond_9
    move-wide v10, v1

    .line 155
    :goto_a
    if-eqz v9, :cond_b

    .line 156
    .line 157
    iget-boolean v7, v8, La2/j;->p:Z

    .line 158
    .line 159
    if-nez v7, :cond_b

    .line 160
    .line 161
    move-wide/from16 v23, v1

    .line 162
    .line 163
    iget-wide v1, v9, Ll2/e;->h:J

    .line 164
    .line 165
    move-object/from16 v26, v4

    .line 166
    .line 167
    iget-wide v3, v9, Ll2/e;->g:J

    .line 168
    .line 169
    sub-long/2addr v1, v3

    .line 170
    sub-long v3, v17, v1

    .line 171
    .line 172
    move-wide/from16 v27, v1

    .line 173
    .line 174
    const-wide/16 v1, 0x0

    .line 175
    .line 176
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 177
    .line 178
    .line 179
    move-result-wide v17

    .line 180
    cmp-long v3, v10, v23

    .line 181
    .line 182
    if-eqz v3, :cond_a

    .line 183
    .line 184
    sub-long v10, v10, v27

    .line 185
    .line 186
    invoke-static {v1, v2, v10, v11}, Ljava/lang/Math;->max(JJ)J

    .line 187
    .line 188
    .line 189
    move-result-wide v10

    .line 190
    :cond_a
    :goto_b
    const/4 v1, -0x1

    .line 191
    goto :goto_c

    .line 192
    :cond_b
    move-wide/from16 v23, v1

    .line 193
    .line 194
    move-object/from16 v26, v4

    .line 195
    .line 196
    goto :goto_b

    .line 197
    :goto_c
    invoke-virtual {v8, v9, v5, v6}, La2/j;->a(La2/l;J)[Ll2/m;

    .line 198
    .line 199
    .line 200
    move-result-object v15

    .line 201
    iget-object v7, v8, La2/j;->q:Ln2/q;

    .line 202
    .line 203
    move v3, v1

    .line 204
    move-object v4, v8

    .line 205
    move/from16 v2, v19

    .line 206
    .line 207
    const/4 v1, 0x0

    .line 208
    move-wide/from16 v59, v5

    .line 209
    .line 210
    move-object v5, v9

    .line 211
    move-wide v8, v12

    .line 212
    move-wide v12, v10

    .line 213
    move-wide/from16 v10, v17

    .line 214
    .line 215
    move-wide/from16 v17, v59

    .line 216
    .line 217
    invoke-interface/range {v7 .. v15}, Ln2/q;->l(JJJLjava/util/List;[Ll2/m;)V

    .line 218
    .line 219
    .line 220
    iget-object v6, v4, La2/j;->q:Ln2/q;

    .line 221
    .line 222
    invoke-interface {v6}, Ln2/q;->t()I

    .line 223
    .line 224
    .line 225
    move-result v12

    .line 226
    if-eq v2, v12, :cond_c

    .line 227
    .line 228
    const/4 v6, 0x1

    .line 229
    goto :goto_d

    .line 230
    :cond_c
    const/4 v6, 0x0

    .line 231
    :goto_d
    iget-object v13, v4, La2/j;->e:[Landroid/net/Uri;

    .line 232
    .line 233
    aget-object v14, v13, v12

    .line 234
    .line 235
    iget-object v15, v4, La2/j;->g:Lb2/c;

    .line 236
    .line 237
    invoke-virtual {v15, v14}, Lb2/c;->c(Landroid/net/Uri;)Z

    .line 238
    .line 239
    .line 240
    move-result v7

    .line 241
    if-nez v7, :cond_d

    .line 242
    .line 243
    move-object/from16 v7, v26

    .line 244
    .line 245
    iput-object v14, v7, LE5/b;->d:Ljava/lang/Object;

    .line 246
    .line 247
    iget-boolean v1, v4, La2/j;->s:Z

    .line 248
    .line 249
    iget-object v2, v4, La2/j;->o:Landroid/net/Uri;

    .line 250
    .line 251
    invoke-virtual {v14, v2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    and-int/2addr v1, v2

    .line 256
    iput-boolean v1, v4, La2/j;->s:Z

    .line 257
    .line 258
    iput-object v14, v4, La2/j;->o:Landroid/net/Uri;

    .line 259
    .line 260
    move-object v1, v7

    .line 261
    goto/16 :goto_30

    .line 262
    .line 263
    :cond_d
    const/4 v8, 0x1

    .line 264
    invoke-virtual {v15, v8, v14}, Lb2/c;->a(ZLandroid/net/Uri;)Lb2/i;

    .line 265
    .line 266
    .line 267
    move-result-object v7

    .line 268
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    iget-boolean v8, v7, Lb2/m;->c:Z

    .line 272
    .line 273
    iput-boolean v8, v4, La2/j;->p:Z

    .line 274
    .line 275
    iget-boolean v8, v7, Lb2/i;->o:Z

    .line 276
    .line 277
    iget-wide v9, v7, Lb2/i;->h:J

    .line 278
    .line 279
    if-eqz v8, :cond_e

    .line 280
    .line 281
    move/from16 v19, v2

    .line 282
    .line 283
    move-wide/from16 v1, v23

    .line 284
    .line 285
    goto :goto_e

    .line 286
    :cond_e
    move/from16 v19, v2

    .line 287
    .line 288
    iget-wide v1, v7, Lb2/i;->u:J

    .line 289
    .line 290
    add-long/2addr v1, v9

    .line 291
    move-object v8, v4

    .line 292
    iget-wide v3, v15, Lb2/c;->n:J

    .line 293
    .line 294
    sub-long/2addr v1, v3

    .line 295
    move-object v4, v8

    .line 296
    :goto_e
    iput-wide v1, v4, La2/j;->r:J

    .line 297
    .line 298
    iget-wide v1, v15, Lb2/c;->n:J

    .line 299
    .line 300
    sub-long/2addr v9, v1

    .line 301
    move-wide v8, v9

    .line 302
    move-wide/from16 v10, v17

    .line 303
    .line 304
    move-object/from16 v1, v26

    .line 305
    .line 306
    invoke-virtual/range {v4 .. v11}, La2/j;->c(La2/l;ZLb2/i;JJ)Landroid/util/Pair;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast v3, Ljava/lang/Long;

    .line 313
    .line 314
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 315
    .line 316
    .line 317
    move-result-wide v17

    .line 318
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v2, Ljava/lang/Integer;

    .line 321
    .line 322
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    move/from16 p1, v2

    .line 327
    .line 328
    iget-wide v2, v7, Lb2/i;->k:J

    .line 329
    .line 330
    cmp-long v2, v17, v2

    .line 331
    .line 332
    if-gez v2, :cond_f

    .line 333
    .line 334
    if-eqz v5, :cond_f

    .line 335
    .line 336
    if-eqz v6, :cond_f

    .line 337
    .line 338
    aget-object v14, v13, v19

    .line 339
    .line 340
    const/4 v8, 0x1

    .line 341
    invoke-virtual {v15, v8, v14}, Lb2/c;->a(ZLandroid/net/Uri;)Lb2/i;

    .line 342
    .line 343
    .line 344
    move-result-object v7

    .line 345
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    iget-wide v2, v15, Lb2/c;->n:J

    .line 349
    .line 350
    iget-wide v8, v7, Lb2/i;->h:J

    .line 351
    .line 352
    sub-long/2addr v8, v2

    .line 353
    const/4 v6, 0x0

    .line 354
    invoke-virtual/range {v4 .. v11}, La2/j;->c(La2/l;ZLb2/i;JJ)Landroid/util/Pair;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v3, Ljava/lang/Long;

    .line 361
    .line 362
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 363
    .line 364
    .line 365
    move-result-wide v17

    .line 366
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v2, Ljava/lang/Integer;

    .line 369
    .line 370
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 371
    .line 372
    .line 373
    move-result v2

    .line 374
    move v6, v2

    .line 375
    move-wide v9, v8

    .line 376
    move/from16 v8, v19

    .line 377
    .line 378
    move v11, v8

    .line 379
    :goto_f
    move-wide/from16 v2, v17

    .line 380
    .line 381
    goto :goto_10

    .line 382
    :cond_f
    move/from16 v6, p1

    .line 383
    .line 384
    move-wide v9, v8

    .line 385
    move v11, v12

    .line 386
    move/from16 v8, v19

    .line 387
    .line 388
    goto :goto_f

    .line 389
    :goto_10
    if-eq v11, v8, :cond_10

    .line 390
    .line 391
    const/4 v12, -0x1

    .line 392
    if-eq v8, v12, :cond_10

    .line 393
    .line 394
    aget-object v8, v13, v8

    .line 395
    .line 396
    iget-object v12, v15, Lb2/c;->d:Ljava/util/HashMap;

    .line 397
    .line 398
    invoke-virtual {v12, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v8

    .line 402
    check-cast v8, Lb2/b;

    .line 403
    .line 404
    if-eqz v8, :cond_10

    .line 405
    .line 406
    const/4 v12, 0x0

    .line 407
    iput-boolean v12, v8, Lb2/b;->k:Z

    .line 408
    .line 409
    :cond_10
    iget-wide v12, v7, Lb2/i;->k:J

    .line 410
    .line 411
    cmp-long v8, v2, v12

    .line 412
    .line 413
    if-gez v8, :cond_11

    .line 414
    .line 415
    new-instance v2, Lk2/b;

    .line 416
    .line 417
    invoke-direct {v2}, Ljava/io/IOException;-><init>()V

    .line 418
    .line 419
    .line 420
    iput-object v2, v4, La2/j;->n:Lk2/b;

    .line 421
    .line 422
    goto/16 :goto_30

    .line 423
    .line 424
    :cond_11
    move-wide/from16 v17, v9

    .line 425
    .line 426
    sub-long v8, v2, v12

    .line 427
    .line 428
    long-to-int v8, v8

    .line 429
    iget-object v9, v7, Lb2/i;->r:Ll8/K;

    .line 430
    .line 431
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 432
    .line 433
    .line 434
    move-result v10

    .line 435
    const-wide/16 v28, 0x1

    .line 436
    .line 437
    iget-object v15, v7, Lb2/i;->s:Ll8/K;

    .line 438
    .line 439
    if-ne v8, v10, :cond_13

    .line 440
    .line 441
    const/4 v10, -0x1

    .line 442
    if-eq v6, v10, :cond_12

    .line 443
    .line 444
    goto :goto_11

    .line 445
    :cond_12
    const/4 v6, 0x0

    .line 446
    :goto_11
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 447
    .line 448
    .line 449
    move-result v8

    .line 450
    if-ge v6, v8, :cond_17

    .line 451
    .line 452
    new-instance v8, La2/i;

    .line 453
    .line 454
    invoke-interface {v15, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v10

    .line 458
    check-cast v10, Lb2/g;

    .line 459
    .line 460
    invoke-direct {v8, v10, v2, v3, v6}, La2/i;-><init>(Lb2/g;JI)V

    .line 461
    .line 462
    .line 463
    :goto_12
    move-object v6, v8

    .line 464
    goto :goto_13

    .line 465
    :cond_13
    invoke-interface {v9, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v10

    .line 469
    check-cast v10, Lb2/f;

    .line 470
    .line 471
    move/from16 v19, v8

    .line 472
    .line 473
    const/4 v8, -0x1

    .line 474
    if-ne v6, v8, :cond_14

    .line 475
    .line 476
    new-instance v6, La2/i;

    .line 477
    .line 478
    invoke-direct {v6, v10, v2, v3, v8}, La2/i;-><init>(Lb2/g;JI)V

    .line 479
    .line 480
    .line 481
    goto :goto_13

    .line 482
    :cond_14
    iget-object v8, v10, Lb2/f;->m:Ll8/K;

    .line 483
    .line 484
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 485
    .line 486
    .line 487
    move-result v8

    .line 488
    if-ge v6, v8, :cond_15

    .line 489
    .line 490
    new-instance v8, La2/i;

    .line 491
    .line 492
    iget-object v10, v10, Lb2/f;->m:Ll8/K;

    .line 493
    .line 494
    invoke-interface {v10, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v10

    .line 498
    check-cast v10, Lb2/g;

    .line 499
    .line 500
    invoke-direct {v8, v10, v2, v3, v6}, La2/i;-><init>(Lb2/g;JI)V

    .line 501
    .line 502
    .line 503
    goto :goto_12

    .line 504
    :cond_15
    const/16 v20, 0x1

    .line 505
    .line 506
    add-int/lit8 v8, v19, 0x1

    .line 507
    .line 508
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 509
    .line 510
    .line 511
    move-result v6

    .line 512
    if-ge v8, v6, :cond_16

    .line 513
    .line 514
    new-instance v6, La2/i;

    .line 515
    .line 516
    invoke-interface {v9, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v8

    .line 520
    check-cast v8, Lb2/g;

    .line 521
    .line 522
    add-long v2, v2, v28

    .line 523
    .line 524
    const/4 v15, -0x1

    .line 525
    invoke-direct {v6, v8, v2, v3, v15}, La2/i;-><init>(Lb2/g;JI)V

    .line 526
    .line 527
    .line 528
    goto :goto_13

    .line 529
    :cond_16
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    .line 530
    .line 531
    .line 532
    move-result v6

    .line 533
    if-nez v6, :cond_17

    .line 534
    .line 535
    new-instance v6, La2/i;

    .line 536
    .line 537
    const/4 v8, 0x0

    .line 538
    invoke-interface {v15, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v10

    .line 542
    check-cast v10, Lb2/g;

    .line 543
    .line 544
    add-long v2, v2, v28

    .line 545
    .line 546
    invoke-direct {v6, v10, v2, v3, v8}, La2/i;-><init>(Lb2/g;JI)V

    .line 547
    .line 548
    .line 549
    goto :goto_13

    .line 550
    :cond_17
    const/4 v6, 0x0

    .line 551
    :goto_13
    if-nez v6, :cond_1b

    .line 552
    .line 553
    iget-boolean v2, v7, Lb2/i;->o:Z

    .line 554
    .line 555
    if-nez v2, :cond_18

    .line 556
    .line 557
    iput-object v14, v1, LE5/b;->d:Ljava/lang/Object;

    .line 558
    .line 559
    iget-boolean v2, v4, La2/j;->s:Z

    .line 560
    .line 561
    iget-object v3, v4, La2/j;->o:Landroid/net/Uri;

    .line 562
    .line 563
    invoke-virtual {v14, v3}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 564
    .line 565
    .line 566
    move-result v3

    .line 567
    and-int/2addr v2, v3

    .line 568
    iput-boolean v2, v4, La2/j;->s:Z

    .line 569
    .line 570
    iput-object v14, v4, La2/j;->o:Landroid/net/Uri;

    .line 571
    .line 572
    goto/16 :goto_30

    .line 573
    .line 574
    :cond_18
    if-nez v16, :cond_19

    .line 575
    .line 576
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 577
    .line 578
    .line 579
    move-result v2

    .line 580
    if-eqz v2, :cond_1a

    .line 581
    .line 582
    :cond_19
    const/4 v8, 0x1

    .line 583
    goto :goto_14

    .line 584
    :cond_1a
    new-instance v6, La2/i;

    .line 585
    .line 586
    invoke-static {v9}, Ll8/s;->j(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v2

    .line 590
    check-cast v2, Lb2/g;

    .line 591
    .line 592
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 593
    .line 594
    .line 595
    move-result v3

    .line 596
    int-to-long v8, v3

    .line 597
    add-long/2addr v12, v8

    .line 598
    sub-long v12, v12, v28

    .line 599
    .line 600
    const/4 v15, -0x1

    .line 601
    invoke-direct {v6, v2, v12, v13, v15}, La2/i;-><init>(Lb2/g;JI)V

    .line 602
    .line 603
    .line 604
    :cond_1b
    const/4 v8, 0x0

    .line 605
    goto :goto_15

    .line 606
    :goto_14
    iput-boolean v8, v1, LE5/b;->b:Z

    .line 607
    .line 608
    goto/16 :goto_30

    .line 609
    .line 610
    :goto_15
    iput-boolean v8, v4, La2/j;->s:Z

    .line 611
    .line 612
    const/4 v2, 0x0

    .line 613
    iput-object v2, v4, La2/j;->o:Landroid/net/Uri;

    .line 614
    .line 615
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 616
    .line 617
    .line 618
    iget-object v2, v6, La2/i;->a:Lb2/g;

    .line 619
    .line 620
    iget-object v3, v2, Lb2/g;->b:Lb2/f;

    .line 621
    .line 622
    iget-object v8, v7, Lb2/m;->a:Ljava/lang/String;

    .line 623
    .line 624
    if-eqz v3, :cond_1d

    .line 625
    .line 626
    iget-object v3, v3, Lb2/g;->g:Ljava/lang/String;

    .line 627
    .line 628
    if-nez v3, :cond_1c

    .line 629
    .line 630
    goto :goto_17

    .line 631
    :cond_1c
    invoke-static {v8, v3}, LQ1/k;->u(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 632
    .line 633
    .line 634
    move-result-object v3

    .line 635
    :goto_16
    const/4 v9, 0x1

    .line 636
    goto :goto_18

    .line 637
    :cond_1d
    :goto_17
    const/4 v3, 0x0

    .line 638
    goto :goto_16

    .line 639
    :goto_18
    invoke-virtual {v4, v3, v11, v9}, La2/j;->d(Landroid/net/Uri;IZ)La2/f;

    .line 640
    .line 641
    .line 642
    move-result-object v10

    .line 643
    iput-object v10, v1, LE5/b;->c:Ljava/lang/Object;

    .line 644
    .line 645
    if-eqz v10, :cond_1e

    .line 646
    .line 647
    goto/16 :goto_30

    .line 648
    .line 649
    :cond_1e
    iget-object v9, v2, Lb2/g;->g:Ljava/lang/String;

    .line 650
    .line 651
    if-nez v9, :cond_1f

    .line 652
    .line 653
    const/4 v9, 0x0

    .line 654
    :goto_19
    const/4 v12, 0x0

    .line 655
    goto :goto_1a

    .line 656
    :cond_1f
    invoke-static {v8, v9}, LQ1/k;->u(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 657
    .line 658
    .line 659
    move-result-object v9

    .line 660
    goto :goto_19

    .line 661
    :goto_1a
    invoke-virtual {v4, v9, v11, v12}, La2/j;->d(Landroid/net/Uri;IZ)La2/f;

    .line 662
    .line 663
    .line 664
    move-result-object v10

    .line 665
    iput-object v10, v1, LE5/b;->c:Ljava/lang/Object;

    .line 666
    .line 667
    if-eqz v10, :cond_20

    .line 668
    .line 669
    goto/16 :goto_30

    .line 670
    .line 671
    :cond_20
    iget-wide v12, v2, Lb2/g;->e:J

    .line 672
    .line 673
    if-nez v5, :cond_22

    .line 674
    .line 675
    sget-object v10, La2/l;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 676
    .line 677
    :goto_1b
    move/from16 v19, v11

    .line 678
    .line 679
    :cond_21
    const/16 v57, 0x0

    .line 680
    .line 681
    goto :goto_1f

    .line 682
    :cond_22
    iget-object v10, v5, La2/l;->m:Landroid/net/Uri;

    .line 683
    .line 684
    invoke-virtual {v14, v10}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 685
    .line 686
    .line 687
    move-result v10

    .line 688
    if-eqz v10, :cond_23

    .line 689
    .line 690
    iget-boolean v10, v5, La2/l;->H:Z

    .line 691
    .line 692
    if-eqz v10, :cond_23

    .line 693
    .line 694
    goto :goto_1b

    .line 695
    :cond_23
    add-long v15, v17, v12

    .line 696
    .line 697
    instance-of v10, v2, Lb2/d;

    .line 698
    .line 699
    move/from16 v19, v10

    .line 700
    .line 701
    iget-boolean v10, v7, Lb2/m;->c:Z

    .line 702
    .line 703
    if-eqz v19, :cond_26

    .line 704
    .line 705
    move/from16 v19, v10

    .line 706
    .line 707
    move-object v10, v2

    .line 708
    check-cast v10, Lb2/d;

    .line 709
    .line 710
    iget-boolean v10, v10, Lb2/d;->l:Z

    .line 711
    .line 712
    if-nez v10, :cond_25

    .line 713
    .line 714
    iget v10, v6, La2/i;->c:I

    .line 715
    .line 716
    if-nez v10, :cond_24

    .line 717
    .line 718
    if-eqz v19, :cond_24

    .line 719
    .line 720
    goto :goto_1c

    .line 721
    :cond_24
    const/16 v19, 0x0

    .line 722
    .line 723
    goto :goto_1d

    .line 724
    :cond_25
    :goto_1c
    const/16 v19, 0x1

    .line 725
    .line 726
    goto :goto_1d

    .line 727
    :cond_26
    move/from16 v19, v10

    .line 728
    .line 729
    :goto_1d
    if-eqz v19, :cond_27

    .line 730
    .line 731
    move/from16 v19, v11

    .line 732
    .line 733
    iget-wide v10, v5, Ll2/e;->h:J

    .line 734
    .line 735
    cmp-long v10, v15, v10

    .line 736
    .line 737
    if-gez v10, :cond_21

    .line 738
    .line 739
    goto :goto_1e

    .line 740
    :cond_27
    move/from16 v19, v11

    .line 741
    .line 742
    :goto_1e
    const/16 v57, 0x1

    .line 743
    .line 744
    :goto_1f
    iget-boolean v10, v6, La2/i;->d:Z

    .line 745
    .line 746
    if-eqz v57, :cond_28

    .line 747
    .line 748
    if-eqz v10, :cond_28

    .line 749
    .line 750
    goto/16 :goto_30

    .line 751
    .line 752
    :cond_28
    iget-object v11, v4, La2/j;->f:[LN1/n;

    .line 753
    .line 754
    aget-object v32, v11, v19

    .line 755
    .line 756
    iget-object v11, v4, La2/j;->q:Ln2/q;

    .line 757
    .line 758
    invoke-interface {v11}, Ln2/q;->u()I

    .line 759
    .line 760
    .line 761
    move-result v39

    .line 762
    iget-object v11, v4, La2/j;->q:Ln2/q;

    .line 763
    .line 764
    invoke-interface {v11}, Ln2/q;->p()Ljava/lang/Object;

    .line 765
    .line 766
    .line 767
    move-result-object v40

    .line 768
    iget-boolean v11, v4, La2/j;->l:Z

    .line 769
    .line 770
    iget-object v15, v4, La2/j;->j:LY9/c;

    .line 771
    .line 772
    if-nez v9, :cond_29

    .line 773
    .line 774
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 775
    .line 776
    .line 777
    move/from16 v16, v10

    .line 778
    .line 779
    const/4 v9, 0x0

    .line 780
    goto :goto_20

    .line 781
    :cond_29
    move/from16 v16, v10

    .line 782
    .line 783
    iget-object v10, v15, LY9/c;->b:Ljava/lang/Object;

    .line 784
    .line 785
    check-cast v10, La2/e;

    .line 786
    .line 787
    invoke-virtual {v10, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 788
    .line 789
    .line 790
    move-result-object v9

    .line 791
    check-cast v9, [B

    .line 792
    .line 793
    :goto_20
    if-nez v3, :cond_2a

    .line 794
    .line 795
    const/4 v3, 0x0

    .line 796
    goto :goto_21

    .line 797
    :cond_2a
    iget-object v10, v15, LY9/c;->b:Ljava/lang/Object;

    .line 798
    .line 799
    check-cast v10, La2/e;

    .line 800
    .line 801
    invoke-virtual {v10, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v3

    .line 805
    check-cast v3, [B

    .line 806
    .line 807
    :goto_21
    sget-object v10, La2/l;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 808
    .line 809
    sget-object v45, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 810
    .line 811
    iget-object v10, v2, Lb2/g;->a:Ljava/lang/String;

    .line 812
    .line 813
    invoke-static {v8, v10}, LQ1/k;->u(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 814
    .line 815
    .line 816
    move-result-object v10

    .line 817
    if-eqz v16, :cond_2b

    .line 818
    .line 819
    const/16 v15, 0x8

    .line 820
    .line 821
    move/from16 v51, v15

    .line 822
    .line 823
    goto :goto_22

    .line 824
    :cond_2b
    const/16 v51, 0x0

    .line 825
    .line 826
    :goto_22
    const-string v15, "The uri must be set."

    .line 827
    .line 828
    invoke-static {v10, v15}, LQ1/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 829
    .line 830
    .line 831
    new-instance v31, LS1/k;

    .line 832
    .line 833
    const/16 v44, 0x0

    .line 834
    .line 835
    const/16 v50, 0x0

    .line 836
    .line 837
    const/16 v43, 0x1

    .line 838
    .line 839
    move-object/from16 v42, v10

    .line 840
    .line 841
    move/from16 v19, v11

    .line 842
    .line 843
    iget-wide v10, v2, Lb2/g;->i:J

    .line 844
    .line 845
    move-wide/from16 v46, v10

    .line 846
    .line 847
    iget-wide v10, v2, Lb2/g;->j:J

    .line 848
    .line 849
    move-wide/from16 v48, v10

    .line 850
    .line 851
    move-object/from16 v41, v31

    .line 852
    .line 853
    invoke-direct/range {v41 .. v51}, LS1/k;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 854
    .line 855
    .line 856
    if-eqz v9, :cond_2c

    .line 857
    .line 858
    const/16 v33, 0x1

    .line 859
    .line 860
    goto :goto_23

    .line 861
    :cond_2c
    const/16 v33, 0x0

    .line 862
    .line 863
    :goto_23
    if-eqz v33, :cond_2d

    .line 864
    .line 865
    iget-object v10, v2, Lb2/g;->h:Ljava/lang/String;

    .line 866
    .line 867
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 868
    .line 869
    .line 870
    invoke-static {v10}, La2/l;->d(Ljava/lang/String;)[B

    .line 871
    .line 872
    .line 873
    move-result-object v10

    .line 874
    goto :goto_24

    .line 875
    :cond_2d
    const/4 v10, 0x0

    .line 876
    :goto_24
    iget-object v11, v4, La2/j;->b:LS1/h;

    .line 877
    .line 878
    if-eqz v9, :cond_2e

    .line 879
    .line 880
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 881
    .line 882
    .line 883
    move-wide/from16 v26, v12

    .line 884
    .line 885
    new-instance v12, La2/a;

    .line 886
    .line 887
    invoke-direct {v12, v11, v9, v10}, La2/a;-><init>(LS1/h;[B[B)V

    .line 888
    .line 889
    .line 890
    move-object/from16 v30, v12

    .line 891
    .line 892
    goto :goto_25

    .line 893
    :cond_2e
    move-wide/from16 v26, v12

    .line 894
    .line 895
    move-object/from16 v30, v11

    .line 896
    .line 897
    :goto_25
    iget-object v9, v2, Lb2/g;->b:Lb2/f;

    .line 898
    .line 899
    if-eqz v9, :cond_32

    .line 900
    .line 901
    if-eqz v3, :cond_2f

    .line 902
    .line 903
    const/4 v10, 0x1

    .line 904
    goto :goto_26

    .line 905
    :cond_2f
    const/4 v10, 0x0

    .line 906
    :goto_26
    if-eqz v10, :cond_30

    .line 907
    .line 908
    iget-object v12, v9, Lb2/g;->h:Ljava/lang/String;

    .line 909
    .line 910
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 911
    .line 912
    .line 913
    invoke-static {v12}, La2/l;->d(Ljava/lang/String;)[B

    .line 914
    .line 915
    .line 916
    move-result-object v12

    .line 917
    goto :goto_27

    .line 918
    :cond_30
    const/4 v12, 0x0

    .line 919
    :goto_27
    iget-object v13, v9, Lb2/g;->a:Ljava/lang/String;

    .line 920
    .line 921
    invoke-static {v8, v13}, LQ1/k;->u(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 922
    .line 923
    .line 924
    move-result-object v8

    .line 925
    invoke-static {v8, v15}, LQ1/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 926
    .line 927
    .line 928
    new-instance v41, LS1/k;

    .line 929
    .line 930
    move-object v13, v1

    .line 931
    iget-wide v0, v9, Lb2/g;->i:J

    .line 932
    .line 933
    const/16 v51, 0x0

    .line 934
    .line 935
    const/16 v43, 0x1

    .line 936
    .line 937
    const/16 v44, 0x0

    .line 938
    .line 939
    move-wide/from16 v46, v0

    .line 940
    .line 941
    iget-wide v0, v9, Lb2/g;->j:J

    .line 942
    .line 943
    const/16 v50, 0x0

    .line 944
    .line 945
    move-wide/from16 v48, v0

    .line 946
    .line 947
    move-object/from16 v42, v8

    .line 948
    .line 949
    invoke-direct/range {v41 .. v51}, LS1/k;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 950
    .line 951
    .line 952
    if-eqz v3, :cond_31

    .line 953
    .line 954
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 955
    .line 956
    .line 957
    new-instance v0, La2/a;

    .line 958
    .line 959
    invoke-direct {v0, v11, v3, v12}, La2/a;-><init>(LS1/h;[B[B)V

    .line 960
    .line 961
    .line 962
    goto :goto_28

    .line 963
    :cond_31
    move-object v0, v11

    .line 964
    :goto_28
    move-object/from16 v34, v0

    .line 965
    .line 966
    move/from16 v36, v10

    .line 967
    .line 968
    move-object/from16 v0, v41

    .line 969
    .line 970
    goto :goto_29

    .line 971
    :cond_32
    move-object v13, v1

    .line 972
    const/4 v0, 0x0

    .line 973
    const/16 v34, 0x0

    .line 974
    .line 975
    const/16 v36, 0x0

    .line 976
    .line 977
    :goto_29
    add-long v41, v17, v26

    .line 978
    .line 979
    iget-wide v8, v2, Lb2/g;->c:J

    .line 980
    .line 981
    add-long v43, v41, v8

    .line 982
    .line 983
    iget v1, v7, Lb2/i;->j:I

    .line 984
    .line 985
    iget v3, v2, Lb2/g;->d:I

    .line 986
    .line 987
    add-int/2addr v1, v3

    .line 988
    if-eqz v5, :cond_37

    .line 989
    .line 990
    iget-object v3, v5, La2/l;->q:LS1/k;

    .line 991
    .line 992
    if-eq v0, v3, :cond_34

    .line 993
    .line 994
    if-eqz v0, :cond_33

    .line 995
    .line 996
    if-eqz v3, :cond_33

    .line 997
    .line 998
    iget-object v7, v0, LS1/k;->a:Landroid/net/Uri;

    .line 999
    .line 1000
    iget-object v8, v3, LS1/k;->a:Landroid/net/Uri;

    .line 1001
    .line 1002
    invoke-virtual {v7, v8}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 1003
    .line 1004
    .line 1005
    move-result v7

    .line 1006
    if-eqz v7, :cond_33

    .line 1007
    .line 1008
    iget-wide v7, v0, LS1/k;->e:J

    .line 1009
    .line 1010
    iget-wide v9, v3, LS1/k;->e:J

    .line 1011
    .line 1012
    cmp-long v3, v7, v9

    .line 1013
    .line 1014
    if-nez v3, :cond_33

    .line 1015
    .line 1016
    goto :goto_2a

    .line 1017
    :cond_33
    const/4 v3, 0x0

    .line 1018
    goto :goto_2b

    .line 1019
    :cond_34
    :goto_2a
    const/4 v3, 0x1

    .line 1020
    :goto_2b
    iget-object v7, v5, La2/l;->m:Landroid/net/Uri;

    .line 1021
    .line 1022
    invoke-virtual {v14, v7}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 1023
    .line 1024
    .line 1025
    move-result v7

    .line 1026
    if-eqz v7, :cond_35

    .line 1027
    .line 1028
    iget-boolean v7, v5, La2/l;->H:Z

    .line 1029
    .line 1030
    if-eqz v7, :cond_35

    .line 1031
    .line 1032
    const/4 v7, 0x1

    .line 1033
    goto :goto_2c

    .line 1034
    :cond_35
    const/4 v7, 0x0

    .line 1035
    :goto_2c
    if-eqz v3, :cond_36

    .line 1036
    .line 1037
    if-eqz v7, :cond_36

    .line 1038
    .line 1039
    iget-boolean v3, v5, La2/l;->J:Z

    .line 1040
    .line 1041
    if-nez v3, :cond_36

    .line 1042
    .line 1043
    iget v3, v5, La2/l;->l:I

    .line 1044
    .line 1045
    if-ne v3, v1, :cond_36

    .line 1046
    .line 1047
    iget-object v7, v5, La2/l;->C:La2/b;

    .line 1048
    .line 1049
    goto :goto_2d

    .line 1050
    :cond_36
    const/4 v7, 0x0

    .line 1051
    :goto_2d
    iget-object v3, v5, La2/l;->y:LG2/i;

    .line 1052
    .line 1053
    iget-object v5, v5, La2/l;->z:LQ1/o;

    .line 1054
    .line 1055
    move-object/from16 v56, v5

    .line 1056
    .line 1057
    move-object/from16 v54, v7

    .line 1058
    .line 1059
    :goto_2e
    move-object/from16 v55, v3

    .line 1060
    .line 1061
    goto :goto_2f

    .line 1062
    :cond_37
    new-instance v3, LG2/i;

    .line 1063
    .line 1064
    const/4 v5, 0x0

    .line 1065
    invoke-direct {v3, v5}, LG2/i;-><init>(LG2/g;)V

    .line 1066
    .line 1067
    .line 1068
    new-instance v7, LQ1/o;

    .line 1069
    .line 1070
    const/16 v8, 0xa

    .line 1071
    .line 1072
    invoke-direct {v7, v8}, LQ1/o;-><init>(I)V

    .line 1073
    .line 1074
    .line 1075
    move-object/from16 v54, v5

    .line 1076
    .line 1077
    move-object/from16 v56, v7

    .line 1078
    .line 1079
    goto :goto_2e

    .line 1080
    :goto_2f
    new-instance v28, La2/l;

    .line 1081
    .line 1082
    const/16 v20, 0x1

    .line 1083
    .line 1084
    xor-int/lit8 v48, v16, 0x1

    .line 1085
    .line 1086
    iget-object v3, v4, La2/j;->d:La2/v;

    .line 1087
    .line 1088
    iget-object v3, v3, La2/v;->b:Ljava/lang/Object;

    .line 1089
    .line 1090
    check-cast v3, Landroid/util/SparseArray;

    .line 1091
    .line 1092
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v5

    .line 1096
    check-cast v5, LQ1/u;

    .line 1097
    .line 1098
    if-nez v5, :cond_38

    .line 1099
    .line 1100
    new-instance v5, LQ1/u;

    .line 1101
    .line 1102
    const-wide v7, 0x7ffffffffffffffeL

    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    invoke-direct {v5, v7, v8}, LQ1/u;-><init>(J)V

    .line 1108
    .line 1109
    .line 1110
    invoke-virtual {v3, v1, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1111
    .line 1112
    .line 1113
    :cond_38
    move-object/from16 v52, v5

    .line 1114
    .line 1115
    iget v3, v6, La2/i;->c:I

    .line 1116
    .line 1117
    iget-boolean v5, v2, Lb2/g;->k:Z

    .line 1118
    .line 1119
    iget-object v7, v4, La2/j;->a:La2/d;

    .line 1120
    .line 1121
    iget-object v8, v4, La2/j;->i:Ljava/util/List;

    .line 1122
    .line 1123
    iget-wide v9, v6, La2/i;->b:J

    .line 1124
    .line 1125
    iget-object v2, v2, Lb2/g;->f:LN1/j;

    .line 1126
    .line 1127
    iget-object v4, v4, La2/j;->k:LV1/k;

    .line 1128
    .line 1129
    move-object/from16 v35, v0

    .line 1130
    .line 1131
    move/from16 v49, v1

    .line 1132
    .line 1133
    move-object/from16 v53, v2

    .line 1134
    .line 1135
    move/from16 v47, v3

    .line 1136
    .line 1137
    move-object/from16 v58, v4

    .line 1138
    .line 1139
    move/from16 v50, v5

    .line 1140
    .line 1141
    move-object/from16 v29, v7

    .line 1142
    .line 1143
    move-object/from16 v38, v8

    .line 1144
    .line 1145
    move-wide/from16 v45, v9

    .line 1146
    .line 1147
    move-object/from16 v37, v14

    .line 1148
    .line 1149
    move/from16 v51, v19

    .line 1150
    .line 1151
    invoke-direct/range {v28 .. v58}, La2/l;-><init>(La2/d;LS1/h;LS1/k;LN1/n;ZLS1/h;LS1/k;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLQ1/u;LN1/j;La2/b;LG2/i;LQ1/o;ZLV1/k;)V

    .line 1152
    .line 1153
    .line 1154
    move-object/from16 v0, v28

    .line 1155
    .line 1156
    move-object v1, v13

    .line 1157
    iput-object v0, v1, LE5/b;->c:Ljava/lang/Object;

    .line 1158
    .line 1159
    :goto_30
    iget-boolean v0, v1, LE5/b;->b:Z

    .line 1160
    .line 1161
    iget-object v2, v1, LE5/b;->c:Ljava/lang/Object;

    .line 1162
    .line 1163
    check-cast v2, Ll2/e;

    .line 1164
    .line 1165
    iget-object v1, v1, LE5/b;->d:Ljava/lang/Object;

    .line 1166
    .line 1167
    check-cast v1, Landroid/net/Uri;

    .line 1168
    .line 1169
    if-eqz v0, :cond_39

    .line 1170
    .line 1171
    move-object/from16 v0, p0

    .line 1172
    .line 1173
    move-wide/from16 v3, v23

    .line 1174
    .line 1175
    iput-wide v3, v0, La2/s;->Q:J

    .line 1176
    .line 1177
    const/4 v8, 0x1

    .line 1178
    iput-boolean v8, v0, La2/s;->T:Z

    .line 1179
    .line 1180
    return v8

    .line 1181
    :cond_39
    move-object/from16 v0, p0

    .line 1182
    .line 1183
    if-nez v2, :cond_3b

    .line 1184
    .line 1185
    if-eqz v1, :cond_3a

    .line 1186
    .line 1187
    iget-object v2, v0, La2/s;->c:LA/e0;

    .line 1188
    .line 1189
    iget-object v2, v2, LA/e0;->b:Ljava/lang/Object;

    .line 1190
    .line 1191
    check-cast v2, La2/m;

    .line 1192
    .line 1193
    iget-object v2, v2, La2/m;->b:Lb2/c;

    .line 1194
    .line 1195
    iget-object v2, v2, Lb2/c;->d:Ljava/util/HashMap;

    .line 1196
    .line 1197
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v1

    .line 1201
    check-cast v1, Lb2/b;

    .line 1202
    .line 1203
    const/4 v8, 0x1

    .line 1204
    invoke-virtual {v1, v8}, Lb2/b;->c(Z)V

    .line 1205
    .line 1206
    .line 1207
    const/16 v25, 0x0

    .line 1208
    .line 1209
    return v25

    .line 1210
    :cond_3a
    const/16 v25, 0x0

    .line 1211
    .line 1212
    goto/16 :goto_33

    .line 1213
    .line 1214
    :cond_3b
    instance-of v1, v2, La2/l;

    .line 1215
    .line 1216
    if-eqz v1, :cond_3e

    .line 1217
    .line 1218
    move-object v1, v2

    .line 1219
    check-cast v1, La2/l;

    .line 1220
    .line 1221
    iput-object v1, v0, La2/s;->X:La2/l;

    .line 1222
    .line 1223
    iget-object v3, v1, Ll2/e;->d:LN1/n;

    .line 1224
    .line 1225
    iput-object v3, v0, La2/s;->F:LN1/n;

    .line 1226
    .line 1227
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    iput-wide v3, v0, La2/s;->Q:J

    .line 1233
    .line 1234
    iget-object v3, v0, La2/s;->n:Ljava/util/ArrayList;

    .line 1235
    .line 1236
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1237
    .line 1238
    .line 1239
    invoke-static {}, Ll8/K;->i()Ll8/H;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v3

    .line 1243
    iget-object v4, v0, La2/s;->v:[La2/r;

    .line 1244
    .line 1245
    array-length v5, v4

    .line 1246
    const/4 v12, 0x0

    .line 1247
    :goto_31
    if-ge v12, v5, :cond_3c

    .line 1248
    .line 1249
    aget-object v6, v4, v12

    .line 1250
    .line 1251
    iget v7, v6, Lk2/c0;->q:I

    .line 1252
    .line 1253
    iget v6, v6, Lk2/c0;->p:I

    .line 1254
    .line 1255
    add-int/2addr v7, v6

    .line 1256
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v6

    .line 1260
    invoke-virtual {v3, v6}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 1261
    .line 1262
    .line 1263
    const/16 v20, 0x1

    .line 1264
    .line 1265
    add-int/lit8 v12, v12, 0x1

    .line 1266
    .line 1267
    goto :goto_31

    .line 1268
    :cond_3c
    invoke-virtual {v3}, Ll8/H;->g()Ll8/e0;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v3

    .line 1272
    iput-object v0, v1, La2/l;->D:La2/s;

    .line 1273
    .line 1274
    iput-object v3, v1, La2/l;->I:Ll8/e0;

    .line 1275
    .line 1276
    iget-object v3, v0, La2/s;->v:[La2/r;

    .line 1277
    .line 1278
    array-length v4, v3

    .line 1279
    const/4 v5, 0x0

    .line 1280
    :goto_32
    if-ge v5, v4, :cond_3e

    .line 1281
    .line 1282
    aget-object v6, v3, v5

    .line 1283
    .line 1284
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1285
    .line 1286
    .line 1287
    iget v7, v1, La2/l;->k:I

    .line 1288
    .line 1289
    int-to-long v7, v7

    .line 1290
    iput-wide v7, v6, Lk2/c0;->C:J

    .line 1291
    .line 1292
    iget-boolean v7, v1, La2/l;->n:Z

    .line 1293
    .line 1294
    const/4 v8, 0x1

    .line 1295
    if-eqz v7, :cond_3d

    .line 1296
    .line 1297
    iput-boolean v8, v6, Lk2/c0;->G:Z

    .line 1298
    .line 1299
    :cond_3d
    add-int/2addr v5, v8

    .line 1300
    goto :goto_32

    .line 1301
    :cond_3e
    iput-object v2, v0, La2/s;->u:Ll2/e;

    .line 1302
    .line 1303
    iget-object v1, v0, La2/s;->i:Lae/d;

    .line 1304
    .line 1305
    iget v3, v2, Ll2/e;->c:I

    .line 1306
    .line 1307
    invoke-virtual {v1, v3}, Lae/d;->g(I)I

    .line 1308
    .line 1309
    .line 1310
    move-result v1

    .line 1311
    move-object/from16 v3, v21

    .line 1312
    .line 1313
    invoke-virtual {v3, v2, v0, v1}, Lo2/m;->f(Lo2/j;Lo2/h;I)J

    .line 1314
    .line 1315
    .line 1316
    new-instance v5, Lk2/z;

    .line 1317
    .line 1318
    iget-object v1, v2, Ll2/e;->b:LS1/k;

    .line 1319
    .line 1320
    invoke-direct {v5, v1}, Lk2/z;-><init>(LS1/k;)V

    .line 1321
    .line 1322
    .line 1323
    iget-object v4, v0, La2/s;->k:LZ1/d;

    .line 1324
    .line 1325
    iget v9, v2, Ll2/e;->e:I

    .line 1326
    .line 1327
    iget-object v10, v2, Ll2/e;->f:Ljava/lang/Object;

    .line 1328
    .line 1329
    iget v6, v2, Ll2/e;->c:I

    .line 1330
    .line 1331
    iget v7, v0, La2/s;->b:I

    .line 1332
    .line 1333
    iget-object v8, v2, Ll2/e;->d:LN1/n;

    .line 1334
    .line 1335
    iget-wide v11, v2, Ll2/e;->g:J

    .line 1336
    .line 1337
    iget-wide v13, v2, Ll2/e;->h:J

    .line 1338
    .line 1339
    invoke-virtual/range {v4 .. v14}, LZ1/d;->h(Lk2/z;IILN1/n;ILjava/lang/Object;JJ)V

    .line 1340
    .line 1341
    .line 1342
    const/16 v20, 0x1

    .line 1343
    .line 1344
    return v20

    .line 1345
    :goto_33
    return v25
.end method

.method public final l()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La2/s;->U:Z

    .line 3
    .line 4
    iget-object v0, p0, La2/s;->r:Landroid/os/Handler;

    .line 5
    .line 6
    iget-object v1, p0, La2/s;->q:La2/p;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final m(II)Ls2/C;
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    sget-object v2, La2/s;->Y:Ljava/util/Set;

    .line 7
    .line 8
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iget-object v3, p0, La2/s;->x:Ljava/util/HashSet;

    .line 13
    .line 14
    iget-object v4, p0, La2/s;->y:Landroid/util/SparseIntArray;

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x0

    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-static {v1}, LQ1/k;->c(Z)V

    .line 29
    .line 30
    .line 31
    const/4 v1, -0x1

    .line 32
    invoke-virtual {v4, p2, v1}, Landroid/util/SparseIntArray;->get(II)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-ne v2, v1, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    iget-object v1, p0, La2/s;->w:[I

    .line 50
    .line 51
    aput p1, v1, v2

    .line 52
    .line 53
    :cond_1
    iget-object v1, p0, La2/s;->w:[I

    .line 54
    .line 55
    aget v1, v1, v2

    .line 56
    .line 57
    if-ne v1, p1, :cond_2

    .line 58
    .line 59
    iget-object v1, p0, La2/s;->v:[La2/r;

    .line 60
    .line 61
    aget-object v6, v1, v2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    invoke-static {p1, p2}, La2/s;->g(II)Ls2/l;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    goto :goto_1

    .line 69
    :cond_3
    move v1, v5

    .line 70
    :goto_0
    iget-object v2, p0, La2/s;->v:[La2/r;

    .line 71
    .line 72
    array-length v7, v2

    .line 73
    if-ge v1, v7, :cond_5

    .line 74
    .line 75
    iget-object v7, p0, La2/s;->w:[I

    .line 76
    .line 77
    aget v7, v7, v1

    .line 78
    .line 79
    if-ne v7, p1, :cond_4

    .line 80
    .line 81
    aget-object v6, v2, v1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    add-int/2addr v1, v0

    .line 85
    goto :goto_0

    .line 86
    :cond_5
    :goto_1
    if-nez v6, :cond_d

    .line 87
    .line 88
    iget-boolean v1, p0, La2/s;->U:Z

    .line 89
    .line 90
    if-eqz v1, :cond_6

    .line 91
    .line 92
    invoke-static {p1, p2}, La2/s;->g(II)Ls2/l;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    return-object p1

    .line 97
    :cond_6
    iget-object v1, p0, La2/s;->v:[La2/r;

    .line 98
    .line 99
    array-length v1, v1

    .line 100
    if-eq p2, v0, :cond_7

    .line 101
    .line 102
    const/4 v2, 0x2

    .line 103
    if-ne p2, v2, :cond_8

    .line 104
    .line 105
    :cond_7
    move v5, v0

    .line 106
    :cond_8
    new-instance v6, La2/r;

    .line 107
    .line 108
    iget-object v2, p0, La2/s;->h:LZ1/d;

    .line 109
    .line 110
    iget-object v7, p0, La2/s;->e:Lo2/e;

    .line 111
    .line 112
    iget-object v8, p0, La2/s;->t:Ljava/util/Map;

    .line 113
    .line 114
    iget-object v9, p0, La2/s;->g:LZ1/g;

    .line 115
    .line 116
    invoke-direct {v6, v7, v9, v2, v8}, La2/r;-><init>(Lo2/e;LZ1/g;LZ1/d;Ljava/util/Map;)V

    .line 117
    .line 118
    .line 119
    iget-wide v7, p0, La2/s;->P:J

    .line 120
    .line 121
    iput-wide v7, v6, Lk2/c0;->t:J

    .line 122
    .line 123
    if-eqz v5, :cond_9

    .line 124
    .line 125
    iget-object v2, p0, La2/s;->W:LN1/j;

    .line 126
    .line 127
    iput-object v2, v6, La2/r;->I:LN1/j;

    .line 128
    .line 129
    iput-boolean v0, v6, Lk2/c0;->z:Z

    .line 130
    .line 131
    :cond_9
    iget-wide v7, p0, La2/s;->V:J

    .line 132
    .line 133
    iget-wide v9, v6, Lk2/c0;->F:J

    .line 134
    .line 135
    cmp-long v2, v9, v7

    .line 136
    .line 137
    if-eqz v2, :cond_a

    .line 138
    .line 139
    iput-wide v7, v6, Lk2/c0;->F:J

    .line 140
    .line 141
    iput-boolean v0, v6, Lk2/c0;->z:Z

    .line 142
    .line 143
    :cond_a
    iget-object v2, p0, La2/s;->X:La2/l;

    .line 144
    .line 145
    if-eqz v2, :cond_b

    .line 146
    .line 147
    iget v2, v2, La2/l;->k:I

    .line 148
    .line 149
    int-to-long v7, v2

    .line 150
    iput-wide v7, v6, Lk2/c0;->C:J

    .line 151
    .line 152
    :cond_b
    iput-object p0, v6, Lk2/c0;->f:Lk2/b0;

    .line 153
    .line 154
    iget-object v2, p0, La2/s;->w:[I

    .line 155
    .line 156
    add-int/lit8 v7, v1, 0x1

    .line 157
    .line 158
    invoke-static {v2, v7}, Ljava/util/Arrays;->copyOf([II)[I

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    iput-object v2, p0, La2/s;->w:[I

    .line 163
    .line 164
    aput p1, v2, v1

    .line 165
    .line 166
    iget-object p1, p0, La2/s;->v:[La2/r;

    .line 167
    .line 168
    sget v2, LQ1/x;->a:I

    .line 169
    .line 170
    array-length v2, p1

    .line 171
    add-int/2addr v2, v0

    .line 172
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    array-length p1, p1

    .line 177
    aput-object v6, v0, p1

    .line 178
    .line 179
    check-cast v0, [La2/r;

    .line 180
    .line 181
    iput-object v0, p0, La2/s;->v:[La2/r;

    .line 182
    .line 183
    iget-object p1, p0, La2/s;->O:[Z

    .line 184
    .line 185
    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    iput-object p1, p0, La2/s;->O:[Z

    .line 190
    .line 191
    aput-boolean v5, p1, v1

    .line 192
    .line 193
    iget-boolean p1, p0, La2/s;->M:Z

    .line 194
    .line 195
    or-int/2addr p1, v5

    .line 196
    iput-boolean p1, p0, La2/s;->M:Z

    .line 197
    .line 198
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-virtual {v3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    invoke-virtual {v4, p2, v1}, Landroid/util/SparseIntArray;->append(II)V

    .line 206
    .line 207
    .line 208
    invoke-static {p2}, La2/s;->y(I)I

    .line 209
    .line 210
    .line 211
    move-result p1

    .line 212
    iget v0, p0, La2/s;->A:I

    .line 213
    .line 214
    invoke-static {v0}, La2/s;->y(I)I

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-le p1, v0, :cond_c

    .line 219
    .line 220
    iput v1, p0, La2/s;->B:I

    .line 221
    .line 222
    iput p2, p0, La2/s;->A:I

    .line 223
    .line 224
    :cond_c
    iget-object p1, p0, La2/s;->N:[Z

    .line 225
    .line 226
    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    iput-object p1, p0, La2/s;->N:[Z

    .line 231
    .line 232
    :cond_d
    const/4 p1, 0x5

    .line 233
    if-ne p2, p1, :cond_f

    .line 234
    .line 235
    iget-object p1, p0, La2/s;->z:La2/q;

    .line 236
    .line 237
    if-nez p1, :cond_e

    .line 238
    .line 239
    new-instance p1, La2/q;

    .line 240
    .line 241
    iget p2, p0, La2/s;->l:I

    .line 242
    .line 243
    invoke-direct {p1, v6, p2}, La2/q;-><init>(Ls2/C;I)V

    .line 244
    .line 245
    .line 246
    iput-object p1, p0, La2/s;->z:La2/q;

    .line 247
    .line 248
    :cond_e
    iget-object p1, p0, La2/s;->z:La2/q;

    .line 249
    .line 250
    return-object p1

    .line 251
    :cond_f
    return-object v6
.end method

.method public final n()J
    .locals 7

    .line 1
    iget-boolean v0, p0, La2/s;->T:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide/high16 v0, -0x8000000000000000L

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    invoke-virtual {p0}, La2/s;->z()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-wide v0, p0, La2/s;->Q:J

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_1
    iget-wide v0, p0, La2/s;->P:J

    .line 18
    .line 19
    invoke-virtual {p0}, La2/s;->x()La2/l;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-boolean v3, v2, La2/l;->H:Z

    .line 24
    .line 25
    if-eqz v3, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    iget-object v2, p0, La2/s;->n:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/4 v4, 0x1

    .line 35
    if-le v3, v4, :cond_3

    .line 36
    .line 37
    const/4 v3, 0x2

    .line 38
    invoke-static {v2, v3}, Lka/n;->e(Ljava/util/ArrayList;I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, La2/l;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    const/4 v2, 0x0

    .line 46
    :goto_0
    if-eqz v2, :cond_4

    .line 47
    .line 48
    iget-wide v2, v2, Ll2/e;->h:J

    .line 49
    .line 50
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    :cond_4
    iget-boolean v2, p0, La2/s;->C:Z

    .line 55
    .line 56
    if-eqz v2, :cond_5

    .line 57
    .line 58
    iget-object v2, p0, La2/s;->v:[La2/r;

    .line 59
    .line 60
    array-length v3, v2

    .line 61
    const/4 v4, 0x0

    .line 62
    :goto_1
    if-ge v4, v3, :cond_5

    .line 63
    .line 64
    aget-object v5, v2, v4

    .line 65
    .line 66
    invoke-virtual {v5}, Lk2/c0;->o()J

    .line 67
    .line 68
    .line 69
    move-result-wide v5

    .line 70
    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 71
    .line 72
    .line 73
    move-result-wide v0

    .line 74
    add-int/lit8 v4, v4, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_5
    return-wide v0
.end method

.method public final o(J)V
    .locals 5

    .line 1
    iget-object v0, p0, La2/s;->j:Lo2/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo2/m;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_7

    .line 8
    .line 9
    invoke-virtual {p0}, La2/s;->z()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_4

    .line 16
    :cond_0
    invoke-virtual {v0}, Lo2/m;->d()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget-object v2, p0, La2/s;->d:La2/j;

    .line 21
    .line 22
    iget-object v3, p0, La2/s;->o:Ljava/util/List;

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    iget-object v1, p0, La2/s;->u:Ll2/e;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, La2/s;->u:Ll2/e;

    .line 32
    .line 33
    iget-object v4, v2, La2/j;->n:Lk2/b;

    .line 34
    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object v2, v2, La2/j;->q:Ln2/q;

    .line 40
    .line 41
    invoke-interface {v2, p1, p2, v1, v3}, Ln2/q;->r(JLl2/e;Ljava/util/List;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    :goto_0
    if-eqz p1, :cond_7

    .line 46
    .line 47
    invoke-virtual {v0}, Lo2/m;->b()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    :goto_1
    const/4 v1, 0x2

    .line 56
    if-lez v0, :cond_3

    .line 57
    .line 58
    add-int/lit8 v4, v0, -0x1

    .line 59
    .line 60
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    check-cast v4, La2/l;

    .line 65
    .line 66
    invoke-virtual {v2, v4}, La2/j;->b(La2/l;)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-ne v4, v1, :cond_3

    .line 71
    .line 72
    add-int/lit8 v0, v0, -0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-ge v0, v4, :cond_4

    .line 80
    .line 81
    invoke-virtual {p0, v0}, La2/s;->v(I)V

    .line 82
    .line 83
    .line 84
    :cond_4
    iget-object v0, v2, La2/j;->n:Lk2/b;

    .line 85
    .line 86
    if-nez v0, :cond_6

    .line 87
    .line 88
    iget-object v0, v2, La2/j;->q:Ln2/q;

    .line 89
    .line 90
    invoke-interface {v0}, Ln2/q;->length()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-ge v0, v1, :cond_5

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    iget-object v0, v2, La2/j;->q:Ln2/q;

    .line 98
    .line 99
    invoke-interface {v0, p1, p2, v3}, Ln2/q;->s(JLjava/util/List;)I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    goto :goto_3

    .line 104
    :cond_6
    :goto_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    :goto_3
    iget-object p2, p0, La2/s;->n:Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    if-ge p1, p2, :cond_7

    .line 115
    .line 116
    invoke-virtual {p0, p1}, La2/s;->v(I)V

    .line 117
    .line 118
    .line 119
    :cond_7
    :goto_4
    return-void
.end method

.method public final p()V
    .locals 4

    .line 1
    iget-object v0, p0, La2/s;->v:[La2/r;

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
    invoke-virtual {v3}, Lk2/c0;->B()V

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

.method public final s(Ls2/w;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final t([LN1/O;)Lk2/n0;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    array-length v2, p1

    .line 4
    if-ge v1, v2, :cond_1

    .line 5
    .line 6
    aget-object v2, p1, v1

    .line 7
    .line 8
    iget v3, v2, LN1/O;->a:I

    .line 9
    .line 10
    new-array v3, v3, [LN1/n;

    .line 11
    .line 12
    move v4, v0

    .line 13
    :goto_1
    iget v5, v2, LN1/O;->a:I

    .line 14
    .line 15
    if-ge v4, v5, :cond_0

    .line 16
    .line 17
    iget-object v5, v2, LN1/O;->d:[LN1/n;

    .line 18
    .line 19
    aget-object v5, v5, v4

    .line 20
    .line 21
    iget-object v6, p0, La2/s;->g:LZ1/g;

    .line 22
    .line 23
    invoke-interface {v6, v5}, LZ1/g;->l(LN1/n;)I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-virtual {v5}, LN1/n;->a()LN1/m;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    iput v6, v5, LN1/m;->K:I

    .line 32
    .line 33
    new-instance v6, LN1/n;

    .line 34
    .line 35
    invoke-direct {v6, v5}, LN1/n;-><init>(LN1/m;)V

    .line 36
    .line 37
    .line 38
    aput-object v6, v3, v4

    .line 39
    .line 40
    add-int/lit8 v4, v4, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    new-instance v4, LN1/O;

    .line 44
    .line 45
    iget-object v2, v2, LN1/O;->b:Ljava/lang/String;

    .line 46
    .line 47
    invoke-direct {v4, v2, v3}, LN1/O;-><init>(Ljava/lang/String;[LN1/n;)V

    .line 48
    .line 49
    .line 50
    aput-object v4, p1, v1

    .line 51
    .line 52
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    new-instance v0, Lk2/n0;

    .line 56
    .line 57
    invoke-direct {v0, p1}, Lk2/n0;-><init>([LN1/O;)V

    .line 58
    .line 59
    .line 60
    return-object v0
.end method

.method public final v(I)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La2/s;->j:Lo2/m;

    .line 4
    .line 5
    invoke-virtual {v1}, Lo2/m;->d()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    xor-int/2addr v1, v2

    .line 11
    invoke-static {v1}, LQ1/k;->g(Z)V

    .line 12
    .line 13
    .line 14
    move/from16 v1, p1

    .line 15
    .line 16
    :goto_0
    iget-object v3, v0, La2/s;->n:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/4 v5, -0x1

    .line 23
    const/4 v6, 0x0

    .line 24
    if-ge v1, v4, :cond_3

    .line 25
    .line 26
    move v4, v1

    .line 27
    :goto_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    if-ge v4, v7, :cond_1

    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    check-cast v7, La2/l;

    .line 38
    .line 39
    iget-boolean v7, v7, La2/l;->n:Z

    .line 40
    .line 41
    if-eqz v7, :cond_0

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, La2/l;

    .line 52
    .line 53
    move v7, v6

    .line 54
    :goto_2
    iget-object v8, v0, La2/s;->v:[La2/r;

    .line 55
    .line 56
    array-length v8, v8

    .line 57
    if-ge v7, v8, :cond_4

    .line 58
    .line 59
    invoke-virtual {v4, v7}, La2/l;->e(I)I

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    iget-object v9, v0, La2/s;->v:[La2/r;

    .line 64
    .line 65
    aget-object v9, v9, v7

    .line 66
    .line 67
    invoke-virtual {v9}, Lk2/c0;->r()I

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    if-le v9, v8, :cond_2

    .line 72
    .line 73
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    move v1, v5

    .line 80
    :cond_4
    if-ne v1, v5, :cond_5

    .line 81
    .line 82
    return-void

    .line 83
    :cond_5
    invoke-virtual {v0}, La2/s;->x()La2/l;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    iget-wide v4, v4, Ll2/e;->h:J

    .line 88
    .line 89
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    check-cast v7, La2/l;

    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    invoke-static {v3, v1, v8}, LQ1/x;->P(Ljava/util/ArrayList;II)V

    .line 100
    .line 101
    .line 102
    move v1, v6

    .line 103
    :goto_4
    iget-object v8, v0, La2/s;->v:[La2/r;

    .line 104
    .line 105
    array-length v8, v8

    .line 106
    if-ge v1, v8, :cond_6

    .line 107
    .line 108
    invoke-virtual {v7, v1}, La2/l;->e(I)I

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    iget-object v9, v0, La2/s;->v:[La2/r;

    .line 113
    .line 114
    aget-object v9, v9, v1

    .line 115
    .line 116
    invoke-virtual {v9, v8}, Lk2/c0;->l(I)V

    .line 117
    .line 118
    .line 119
    add-int/lit8 v1, v1, 0x1

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_6
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-eqz v1, :cond_7

    .line 127
    .line 128
    iget-wide v1, v0, La2/s;->P:J

    .line 129
    .line 130
    iput-wide v1, v0, La2/s;->Q:J

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_7
    invoke-static {v3}, Ll8/s;->j(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    check-cast v1, La2/l;

    .line 138
    .line 139
    iput-boolean v2, v1, La2/l;->J:Z

    .line 140
    .line 141
    :goto_5
    iput-boolean v6, v0, La2/s;->T:Z

    .line 142
    .line 143
    iget v10, v0, La2/s;->A:I

    .line 144
    .line 145
    iget-wide v1, v7, Ll2/e;->g:J

    .line 146
    .line 147
    iget-object v3, v0, La2/s;->k:LZ1/d;

    .line 148
    .line 149
    new-instance v8, Lh2/g;

    .line 150
    .line 151
    invoke-static {v1, v2}, LQ1/x;->W(J)J

    .line 152
    .line 153
    .line 154
    move-result-wide v14

    .line 155
    invoke-static {v4, v5}, LQ1/x;->W(J)J

    .line 156
    .line 157
    .line 158
    move-result-wide v16

    .line 159
    const/4 v9, 0x1

    .line 160
    const/4 v11, 0x0

    .line 161
    const/4 v12, 0x3

    .line 162
    const/4 v13, 0x0

    .line 163
    invoke-direct/range {v8 .. v17}, Lh2/g;-><init>(IILN1/n;ILjava/lang/Object;JJ)V

    .line 164
    .line 165
    .line 166
    iget-object v1, v3, LZ1/d;->b:Lk2/H;

    .line 167
    .line 168
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    new-instance v2, LA5/g;

    .line 172
    .line 173
    const/16 v4, 0x10

    .line 174
    .line 175
    invoke-direct {v2, v3, v1, v8, v4}, LA5/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v3, v2}, LZ1/d;->a(LQ1/c;)V

    .line 179
    .line 180
    .line 181
    return-void
.end method

.method public final w(Lo2/j;JJZ)V
    .locals 12

    .line 1
    check-cast p1, Ll2/e;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, La2/s;->u:Ll2/e;

    .line 5
    .line 6
    new-instance v2, Lk2/z;

    .line 7
    .line 8
    iget-wide v0, p1, Ll2/e;->a:J

    .line 9
    .line 10
    iget-object v0, p1, Ll2/e;->i:LS1/z;

    .line 11
    .line 12
    iget-object v0, v0, LS1/z;->c:Landroid/net/Uri;

    .line 13
    .line 14
    move-wide/from16 v0, p4

    .line 15
    .line 16
    invoke-direct {v2, v0, v1}, Lk2/z;-><init>(J)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, La2/s;->i:Lae/d;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, La2/s;->k:LZ1/d;

    .line 25
    .line 26
    iget-wide v8, p1, Ll2/e;->g:J

    .line 27
    .line 28
    iget-wide v10, p1, Ll2/e;->h:J

    .line 29
    .line 30
    iget v3, p1, Ll2/e;->c:I

    .line 31
    .line 32
    iget v4, p0, La2/s;->b:I

    .line 33
    .line 34
    iget-object v5, p1, Ll2/e;->d:LN1/n;

    .line 35
    .line 36
    iget v6, p1, Ll2/e;->e:I

    .line 37
    .line 38
    iget-object v7, p1, Ll2/e;->f:Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual/range {v1 .. v11}, LZ1/d;->c(Lk2/z;IILN1/n;ILjava/lang/Object;JJ)V

    .line 41
    .line 42
    .line 43
    if-nez p6, :cond_2

    .line 44
    .line 45
    invoke-virtual {p0}, La2/s;->z()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_0

    .line 50
    .line 51
    iget p1, p0, La2/s;->E:I

    .line 52
    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    :cond_0
    invoke-virtual {p0}, La2/s;->G()V

    .line 56
    .line 57
    .line 58
    :cond_1
    iget p1, p0, La2/s;->E:I

    .line 59
    .line 60
    if-lez p1, :cond_2

    .line 61
    .line 62
    iget-object p1, p0, La2/s;->c:LA/e0;

    .line 63
    .line 64
    invoke-virtual {p1, p0}, LA/e0;->a(Lk2/f0;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    return-void
.end method

.method public final x()La2/l;
    .locals 2

    .line 1
    iget-object v0, p0, La2/s;->n:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lka/n;->e(Ljava/util/ArrayList;I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, La2/l;

    .line 9
    .line 10
    return-object v0
.end method

.method public final z()Z
    .locals 4

    .line 1
    iget-wide v0, p0, La2/s;->Q:J

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
