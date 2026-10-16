.class public final LP5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ5/k;


# static fields
.field public static final c0:[B

.field public static final d0:[B

.field public static final e0:[B

.field public static final f0:[B

.field public static final g0:Ljava/util/UUID;

.field public static final h0:Ljava/util/Map;


# instance fields
.field public A:J

.field public B:J

.field public C:LQ1/l;

.field public D:LQ1/l;

.field public E:Z

.field public F:Z

.field public G:I

.field public H:J

.field public I:J

.field public J:I

.field public K:I

.field public L:[I

.field public M:I

.field public N:I

.field public O:I

.field public P:I

.field public Q:Z

.field public R:J

.field public S:I

.field public T:I

.field public U:I

.field public V:Z

.field public W:Z

.field public X:Z

.field public Y:I

.field public Z:B

.field public final a:LK2/b;

.field public a0:Z

.field public final b:LP5/d;

.field public b0:Lf6/N;

.field public final c:Landroid/util/SparseArray;

.field public final d:Z

.field public final e:LY4/b;

.field public final f:LY4/b;

.field public final g:LY4/b;

.field public final h:LY4/b;

.field public final i:LY4/b;

.field public final j:LY4/b;

.field public final k:LY4/b;

.field public final l:LY4/b;

.field public final m:LY4/b;

.field public final n:LY4/b;

.field public o:Ljava/nio/ByteBuffer;

.field public p:J

.field public q:J

.field public r:J

.field public s:J

.field public t:J

.field public u:LP5/b;

.field public v:Z

.field public w:I

.field public x:J

.field public y:Z

.field public z:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v1, LP5/c;->c0:[B

    .line 9
    .line 10
    sget v1, Lu6/v;->a:I

    .line 11
    .line 12
    sget-object v1, Lk8/g;->c:Ljava/nio/charset/Charset;

    .line 13
    .line 14
    const-string v2, "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text"

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sput-object v1, LP5/c;->d0:[B

    .line 21
    .line 22
    new-array v0, v0, [B

    .line 23
    .line 24
    fill-array-data v0, :array_1

    .line 25
    .line 26
    .line 27
    sput-object v0, LP5/c;->e0:[B

    .line 28
    .line 29
    const/16 v0, 0x26

    .line 30
    .line 31
    new-array v0, v0, [B

    .line 32
    .line 33
    fill-array-data v0, :array_2

    .line 34
    .line 35
    .line 36
    sput-object v0, LP5/c;->f0:[B

    .line 37
    .line 38
    new-instance v0, Ljava/util/UUID;

    .line 39
    .line 40
    const-wide v1, 0x100000000001000L

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    const-wide v3, -0x7fffff55ffc7648fL    # -3.607411173533E-312

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    invoke-direct {v0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    .line 51
    .line 52
    .line 53
    sput-object v0, LP5/c;->g0:Ljava/util/UUID;

    .line 54
    .line 55
    new-instance v0, Ljava/util/HashMap;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 58
    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    const-string v2, "htc_video_rotA-000"

    .line 62
    .line 63
    const/16 v3, 0x5a

    .line 64
    .line 65
    const-string v4, "htc_video_rotA-090"

    .line 66
    .line 67
    invoke-static {v1, v0, v2, v3, v4}, LN0/a;->p(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/16 v1, 0xb4

    .line 71
    .line 72
    const-string v2, "htc_video_rotA-180"

    .line 73
    .line 74
    const/16 v3, 0x10e

    .line 75
    .line 76
    const-string v4, "htc_video_rotA-270"

    .line 77
    .line 78
    invoke-static {v1, v0, v2, v3, v4}, LN0/a;->p(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sput-object v0, LP5/c;->h0:Ljava/util/Map;

    .line 86
    .line 87
    return-void

    .line 88
    nop

    .line 89
    :array_0
    .array-data 1
        0x31t
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    :array_1
    .array-data 1
        0x44t
        0x69t
        0x61t
        0x6ct
        0x6ft
        0x67t
        0x75t
        0x65t
        0x3at
        0x20t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
    .end array-data

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    :array_2
    .array-data 1
        0x57t
        0x45t
        0x42t
        0x56t
        0x54t
        0x54t
        0xat
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2et
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2et
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    new-instance v0, LK2/b;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LK2/b;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const-wide/16 v1, -0x1

    .line 11
    .line 12
    iput-wide v1, p0, LP5/c;->q:J

    .line 13
    .line 14
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    iput-wide v3, p0, LP5/c;->r:J

    .line 20
    .line 21
    iput-wide v3, p0, LP5/c;->s:J

    .line 22
    .line 23
    iput-wide v3, p0, LP5/c;->t:J

    .line 24
    .line 25
    iput-wide v1, p0, LP5/c;->z:J

    .line 26
    .line 27
    iput-wide v1, p0, LP5/c;->A:J

    .line 28
    .line 29
    iput-wide v3, p0, LP5/c;->B:J

    .line 30
    .line 31
    iput-object v0, p0, LP5/c;->a:LK2/b;

    .line 32
    .line 33
    new-instance v1, Lxa/d;

    .line 34
    .line 35
    const/16 v2, 0x14

    .line 36
    .line 37
    invoke-direct {v1, p0, v2}, Lxa/d;-><init>(Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    iput-object v1, v0, LK2/b;->g:Ljava/lang/Object;

    .line 41
    .line 42
    const/4 v0, 0x1

    .line 43
    iput-boolean v0, p0, LP5/c;->d:Z

    .line 44
    .line 45
    new-instance v1, LP5/d;

    .line 46
    .line 47
    invoke-direct {v1}, LP5/d;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v1, p0, LP5/c;->b:LP5/d;

    .line 51
    .line 52
    new-instance v1, Landroid/util/SparseArray;

    .line 53
    .line 54
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v1, p0, LP5/c;->c:Landroid/util/SparseArray;

    .line 58
    .line 59
    new-instance v1, LY4/b;

    .line 60
    .line 61
    const/4 v2, 0x4

    .line 62
    invoke-direct {v1, v2}, LY4/b;-><init>(I)V

    .line 63
    .line 64
    .line 65
    iput-object v1, p0, LP5/c;->g:LY4/b;

    .line 66
    .line 67
    new-instance v1, LY4/b;

    .line 68
    .line 69
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    const/4 v4, -0x1

    .line 74
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-direct {v1, v3}, LY4/b;-><init>([B)V

    .line 83
    .line 84
    .line 85
    iput-object v1, p0, LP5/c;->h:LY4/b;

    .line 86
    .line 87
    new-instance v1, LY4/b;

    .line 88
    .line 89
    invoke-direct {v1, v2}, LY4/b;-><init>(I)V

    .line 90
    .line 91
    .line 92
    iput-object v1, p0, LP5/c;->i:LY4/b;

    .line 93
    .line 94
    new-instance v1, LY4/b;

    .line 95
    .line 96
    sget-object v3, Lu6/a;->d:[B

    .line 97
    .line 98
    invoke-direct {v1, v3}, LY4/b;-><init>([B)V

    .line 99
    .line 100
    .line 101
    iput-object v1, p0, LP5/c;->e:LY4/b;

    .line 102
    .line 103
    new-instance v1, LY4/b;

    .line 104
    .line 105
    invoke-direct {v1, v2}, LY4/b;-><init>(I)V

    .line 106
    .line 107
    .line 108
    iput-object v1, p0, LP5/c;->f:LY4/b;

    .line 109
    .line 110
    new-instance v1, LY4/b;

    .line 111
    .line 112
    invoke-direct {v1}, LY4/b;-><init>()V

    .line 113
    .line 114
    .line 115
    iput-object v1, p0, LP5/c;->j:LY4/b;

    .line 116
    .line 117
    new-instance v1, LY4/b;

    .line 118
    .line 119
    invoke-direct {v1}, LY4/b;-><init>()V

    .line 120
    .line 121
    .line 122
    iput-object v1, p0, LP5/c;->k:LY4/b;

    .line 123
    .line 124
    new-instance v1, LY4/b;

    .line 125
    .line 126
    const/16 v2, 0x8

    .line 127
    .line 128
    invoke-direct {v1, v2}, LY4/b;-><init>(I)V

    .line 129
    .line 130
    .line 131
    iput-object v1, p0, LP5/c;->l:LY4/b;

    .line 132
    .line 133
    new-instance v1, LY4/b;

    .line 134
    .line 135
    invoke-direct {v1}, LY4/b;-><init>()V

    .line 136
    .line 137
    .line 138
    iput-object v1, p0, LP5/c;->m:LY4/b;

    .line 139
    .line 140
    new-instance v1, LY4/b;

    .line 141
    .line 142
    invoke-direct {v1}, LY4/b;-><init>()V

    .line 143
    .line 144
    .line 145
    iput-object v1, p0, LP5/c;->n:LY4/b;

    .line 146
    .line 147
    new-array v0, v0, [I

    .line 148
    .line 149
    iput-object v0, p0, LP5/c;->L:[I

    .line 150
    .line 151
    return-void
.end method

.method public static e(JJLjava/lang/String;)[B
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v2, p0, v2

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    move v2, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v2, v0

    .line 15
    :goto_0
    invoke-static {v2}, Lu6/a;->e(Z)V

    .line 16
    .line 17
    .line 18
    const-wide v2, 0xd693a400L

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    div-long v4, p0, v2

    .line 24
    .line 25
    long-to-int v4, v4

    .line 26
    int-to-long v5, v4

    .line 27
    mul-long/2addr v5, v2

    .line 28
    sub-long/2addr p0, v5

    .line 29
    const-wide/32 v2, 0x3938700

    .line 30
    .line 31
    .line 32
    div-long v5, p0, v2

    .line 33
    .line 34
    long-to-int v5, v5

    .line 35
    int-to-long v6, v5

    .line 36
    mul-long/2addr v6, v2

    .line 37
    sub-long/2addr p0, v6

    .line 38
    const-wide/32 v2, 0xf4240

    .line 39
    .line 40
    .line 41
    div-long v6, p0, v2

    .line 42
    .line 43
    long-to-int v6, v6

    .line 44
    int-to-long v7, v6

    .line 45
    mul-long/2addr v7, v2

    .line 46
    sub-long/2addr p0, v7

    .line 47
    div-long/2addr p0, p2

    .line 48
    long-to-int p0, p0

    .line 49
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 50
    .line 51
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    const/4 v3, 0x4

    .line 68
    new-array v3, v3, [Ljava/lang/Object;

    .line 69
    .line 70
    aput-object p2, v3, v0

    .line 71
    .line 72
    aput-object p3, v3, v1

    .line 73
    .line 74
    const/4 p2, 0x2

    .line 75
    aput-object v2, v3, p2

    .line 76
    .line 77
    const/4 p2, 0x3

    .line 78
    aput-object p0, v3, p2

    .line 79
    .line 80
    invoke-static {p1, p4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    sget p1, Lu6/v;->a:I

    .line 85
    .line 86
    sget-object p1, Lk8/g;->c:Ljava/nio/charset/Charset;

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0
.end method


# virtual methods
.method public final a(JJ)V
    .locals 0

    .line 1
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide p1, p0, LP5/c;->B:J

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput p1, p0, LP5/c;->G:I

    .line 10
    .line 11
    iget-object p2, p0, LP5/c;->a:LK2/b;

    .line 12
    .line 13
    iput p1, p2, LK2/b;->c:I

    .line 14
    .line 15
    iget-object p3, p2, LK2/b;->b:Ljava/util/ArrayDeque;

    .line 16
    .line 17
    invoke-virtual {p3}, Ljava/util/ArrayDeque;->clear()V

    .line 18
    .line 19
    .line 20
    iget-object p2, p2, LK2/b;->f:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p2, LP5/d;

    .line 23
    .line 24
    iput p1, p2, LP5/d;->b:I

    .line 25
    .line 26
    iput p1, p2, LP5/d;->c:I

    .line 27
    .line 28
    iget-object p2, p0, LP5/c;->b:LP5/d;

    .line 29
    .line 30
    iput p1, p2, LP5/d;->b:I

    .line 31
    .line 32
    iput p1, p2, LP5/d;->c:I

    .line 33
    .line 34
    invoke-virtual {p0}, LP5/c;->k()V

    .line 35
    .line 36
    .line 37
    move p2, p1

    .line 38
    :goto_0
    iget-object p3, p0, LP5/c;->c:Landroid/util/SparseArray;

    .line 39
    .line 40
    invoke-virtual {p3}, Landroid/util/SparseArray;->size()I

    .line 41
    .line 42
    .line 43
    move-result p4

    .line 44
    if-ge p2, p4, :cond_1

    .line 45
    .line 46
    invoke-virtual {p3, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p3

    .line 50
    check-cast p3, LP5/b;

    .line 51
    .line 52
    iget-object p3, p3, LP5/b;->T:LJ5/x;

    .line 53
    .line 54
    if-eqz p3, :cond_0

    .line 55
    .line 56
    iput-boolean p1, p3, LJ5/x;->b:Z

    .line 57
    .line 58
    iput p1, p3, LJ5/x;->c:I

    .line 59
    .line 60
    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    return-void
.end method

.method public final b(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LP5/c;->C:LQ1/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LP5/c;->D:LQ1/l;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "Element "

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string p1, " must be in a Cues"

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-static {p1, v0}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    throw p1
.end method

.method public final c(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LP5/c;->u:LP5/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "Element "

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string p1, " must be in a TrackEntry"

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-static {p1, v0}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    throw p1
.end method

.method public final d(LP5/b;JIII)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "S_TEXT/WEBVTT"

    .line 6
    .line 7
    const-string v3, "S_TEXT/ASS"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "S_TEXT/UTF8"

    .line 11
    .line 12
    iget-object v6, v1, LP5/b;->T:LJ5/x;

    .line 13
    .line 14
    const/4 v14, 0x1

    .line 15
    if-eqz v6, :cond_0

    .line 16
    .line 17
    iget-object v7, v1, LP5/b;->X:LJ5/w;

    .line 18
    .line 19
    iget-object v13, v1, LP5/b;->j:LJ5/v;

    .line 20
    .line 21
    move-wide/from16 v8, p2

    .line 22
    .line 23
    move/from16 v10, p4

    .line 24
    .line 25
    move/from16 v11, p5

    .line 26
    .line 27
    move/from16 v12, p6

    .line 28
    .line 29
    invoke-virtual/range {v6 .. v13}, LJ5/x;->c(LJ5/w;JIIILJ5/v;)V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_7

    .line 33
    .line 34
    :cond_0
    iget-object v6, v1, LP5/b;->b:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-nez v6, :cond_1

    .line 41
    .line 42
    iget-object v6, v1, LP5/b;->b:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-nez v6, :cond_1

    .line 49
    .line 50
    iget-object v6, v1, LP5/b;->b:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_3

    .line 57
    .line 58
    :cond_1
    iget v6, v0, LP5/c;->K:I

    .line 59
    .line 60
    const-string v7, "MatroskaExtractor"

    .line 61
    .line 62
    if-le v6, v14, :cond_2

    .line 63
    .line 64
    const-string v2, "Skipping subtitle sample in laced block."

    .line 65
    .line 66
    invoke-static {v7, v2}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    iget-wide v8, v0, LP5/c;->I:J

    .line 71
    .line 72
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    cmp-long v6, v8, v10

    .line 78
    .line 79
    if-nez v6, :cond_4

    .line 80
    .line 81
    const-string v2, "Skipping subtitle sample with no duration."

    .line 82
    .line 83
    invoke-static {v7, v2}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :cond_3
    :goto_0
    move/from16 v2, p5

    .line 87
    .line 88
    goto/16 :goto_5

    .line 89
    .line 90
    :cond_4
    iget-object v6, v1, LP5/b;->b:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v7, v0, LP5/c;->k:LY4/b;

    .line 93
    .line 94
    iget-object v10, v7, LY4/b;->a:[B

    .line 95
    .line 96
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    const-wide/16 v11, 0x3e8

    .line 100
    .line 101
    const/4 v13, -0x1

    .line 102
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 103
    .line 104
    .line 105
    move-result v15

    .line 106
    sparse-switch v15, :sswitch_data_0

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :sswitch_0
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-nez v2, :cond_5

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_5
    const/4 v13, 0x2

    .line 118
    goto :goto_1

    .line 119
    :sswitch_1
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-nez v2, :cond_6

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_6
    move v13, v14

    .line 127
    goto :goto_1

    .line 128
    :sswitch_2
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-nez v2, :cond_7

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_7
    move v13, v4

    .line 136
    :goto_1
    packed-switch v13, :pswitch_data_0

    .line 137
    .line 138
    .line 139
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 140
    .line 141
    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 142
    .line 143
    .line 144
    throw v1

    .line 145
    :pswitch_0
    const-string v2, "%02d:%02d:%02d,%03d"

    .line 146
    .line 147
    invoke-static {v8, v9, v11, v12, v2}, LP5/c;->e(JJLjava/lang/String;)[B

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    const/16 v3, 0x13

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :pswitch_1
    const-string v2, "%02d:%02d:%02d.%03d"

    .line 155
    .line 156
    invoke-static {v8, v9, v11, v12, v2}, LP5/c;->e(JJLjava/lang/String;)[B

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    const/16 v3, 0x19

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :pswitch_2
    const-string v2, "%01d:%02d:%02d:%02d"

    .line 164
    .line 165
    const-wide/16 v5, 0x2710

    .line 166
    .line 167
    invoke-static {v8, v9, v5, v6, v2}, LP5/c;->e(JJLjava/lang/String;)[B

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    const/16 v3, 0x15

    .line 172
    .line 173
    :goto_2
    array-length v5, v2

    .line 174
    invoke-static {v2, v4, v10, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 175
    .line 176
    .line 177
    iget v2, v7, LY4/b;->b:I

    .line 178
    .line 179
    :goto_3
    iget v3, v7, LY4/b;->c:I

    .line 180
    .line 181
    if-ge v2, v3, :cond_9

    .line 182
    .line 183
    iget-object v3, v7, LY4/b;->a:[B

    .line 184
    .line 185
    aget-byte v3, v3, v2

    .line 186
    .line 187
    if-nez v3, :cond_8

    .line 188
    .line 189
    invoke-virtual {v7, v2}, LY4/b;->z(I)V

    .line 190
    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_8
    add-int/2addr v2, v14

    .line 194
    goto :goto_3

    .line 195
    :cond_9
    :goto_4
    iget-object v2, v1, LP5/b;->X:LJ5/w;

    .line 196
    .line 197
    iget v3, v7, LY4/b;->c:I

    .line 198
    .line 199
    invoke-interface {v2, v3, v7}, LJ5/w;->c(ILY4/b;)V

    .line 200
    .line 201
    .line 202
    iget v2, v7, LY4/b;->c:I

    .line 203
    .line 204
    add-int v2, p5, v2

    .line 205
    .line 206
    :goto_5
    const/high16 v3, 0x10000000

    .line 207
    .line 208
    and-int v3, p4, v3

    .line 209
    .line 210
    if-eqz v3, :cond_b

    .line 211
    .line 212
    iget v3, v0, LP5/c;->K:I

    .line 213
    .line 214
    iget-object v5, v0, LP5/c;->n:LY4/b;

    .line 215
    .line 216
    if-le v3, v14, :cond_a

    .line 217
    .line 218
    invoke-virtual {v5, v4}, LY4/b;->x(I)V

    .line 219
    .line 220
    .line 221
    goto :goto_6

    .line 222
    :cond_a
    iget v3, v5, LY4/b;->c:I

    .line 223
    .line 224
    iget-object v4, v1, LP5/b;->X:LJ5/w;

    .line 225
    .line 226
    invoke-interface {v4, v3, v5}, LJ5/w;->e(ILY4/b;)V

    .line 227
    .line 228
    .line 229
    add-int/2addr v2, v3

    .line 230
    :cond_b
    :goto_6
    move/from16 v19, v2

    .line 231
    .line 232
    iget-object v15, v1, LP5/b;->X:LJ5/w;

    .line 233
    .line 234
    iget-object v1, v1, LP5/b;->j:LJ5/v;

    .line 235
    .line 236
    move-wide/from16 v16, p2

    .line 237
    .line 238
    move/from16 v18, p4

    .line 239
    .line 240
    move/from16 v20, p6

    .line 241
    .line 242
    move-object/from16 v21, v1

    .line 243
    .line 244
    invoke-interface/range {v15 .. v21}, LJ5/w;->b(JIIILJ5/v;)V

    .line 245
    .line 246
    .line 247
    :goto_7
    iput-boolean v14, v0, LP5/c;->F:Z

    .line 248
    .line 249
    return-void

    .line 250
    nop

    .line 251
    :sswitch_data_0
    .sparse-switch
        0x2c0618eb -> :sswitch_2
        0x3e4ca2d8 -> :sswitch_1
        0x54c61e47 -> :sswitch_0
    .end sparse-switch

    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(LJ5/n;J)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, LP5/c;->y:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-wide p2, p0, LP5/c;->A:J

    .line 8
    .line 9
    iget-wide p2, p0, LP5/c;->z:J

    .line 10
    .line 11
    iput-wide p2, p1, LJ5/n;->a:J

    .line 12
    .line 13
    iput-boolean v2, p0, LP5/c;->y:Z

    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    iget-boolean p2, p0, LP5/c;->v:Z

    .line 17
    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    iget-wide p2, p0, LP5/c;->A:J

    .line 21
    .line 22
    const-wide/16 v3, -0x1

    .line 23
    .line 24
    cmp-long v0, p2, v3

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iput-wide p2, p1, LJ5/n;->a:J

    .line 29
    .line 30
    iput-wide v3, p0, LP5/c;->A:J

    .line 31
    .line 32
    return v1

    .line 33
    :cond_1
    return v2
.end method

.method public final g(LJ5/l;LJ5/n;)I
    .locals 50

    move-object/from16 v0, p0

    .line 1
    const-string v1, "A_VORBIS"

    const-string v2, "A_TRUEHD"

    const-string v3, "A_MS/ACM"

    const-string v4, "V_MPEG4/ISO/SP"

    const-string v5, "V_MPEG4/ISO/AP"

    const-string v8, "A_OPUS"

    const/16 v16, 0x14

    const/16 v18, 0x2

    const/4 v10, 0x0

    iput-boolean v10, v0, LP5/c;->F:Z

    const/16 v20, 0x1

    :goto_0
    if-eqz v20, :cond_b3

    .line 2
    iget-boolean v15, v0, LP5/c;->F:Z

    if-nez v15, :cond_b3

    .line 3
    iget-object v15, v0, LP5/c;->a:LK2/b;

    move/from16 v22, v10

    iget-object v10, v15, LK2/b;->g:Ljava/lang/Object;

    check-cast v10, Lxa/d;

    .line 4
    invoke-static {v10}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 5
    :goto_1
    iget-object v10, v15, LK2/b;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v10}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v14, v20

    check-cast v14, LP5/a;

    const/high16 v26, -0x40800000    # -1.0f

    const v12, 0x1549a966

    const/16 v27, 0x8

    const/16 v9, 0x4dbb

    const/16 v11, 0xae

    const-wide/16 v31, 0x0

    const/16 v6, 0xa0

    move-object/from16 v33, v8

    const-wide/16 v35, -0x1

    if-eqz v14, :cond_87

    .line 6
    move-object/from16 v8, p1

    check-cast v8, LJ5/h;

    invoke-virtual {v8}, LJ5/h;->getPosition()J

    move-result-wide v37

    iget-wide v7, v14, LP5/a;->b:J

    cmp-long v7, v37, v7

    if-ltz v7, :cond_87

    .line 7
    iget-object v7, v15, LK2/b;->g:Ljava/lang/Object;

    check-cast v7, Lxa/d;

    invoke-virtual {v10}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LP5/a;

    .line 8
    iget v8, v8, LP5/a;->a:I

    .line 9
    iget-object v7, v7, Lxa/d;->b:Ljava/lang/Object;

    check-cast v7, LP5/c;

    .line 10
    iget-object v10, v7, LP5/c;->b0:Lf6/N;

    .line 11
    invoke-static {v10}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 12
    iget-object v10, v7, LP5/c;->c:Landroid/util/SparseArray;

    if-eq v8, v6, :cond_80

    const-string v6, "MatroskaExtractor"

    if-eq v8, v11, :cond_12

    if-eq v8, v9, :cond_10

    const/16 v9, 0x6240

    if-eq v8, v9, :cond_e

    const/16 v9, 0x6d80

    if-eq v8, v9, :cond_c

    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    if-eq v8, v12, :cond_9

    const v9, 0x1654ae6b

    if-eq v8, v9, :cond_7

    const v9, 0x1c53bb6b

    if-eq v8, v9, :cond_0

    move-object/from16 v47, v1

    move-object/from16 v48, v2

    move-object/from16 v49, v3

    move-object v8, v4

    move-object v13, v5

    move-object/from16 v38, v33

    const/16 v17, 0x19

    const/16 v19, 0xf

    const/16 v23, 0x6

    goto/16 :goto_41

    .line 13
    :cond_0
    iget-boolean v8, v7, LP5/c;->v:Z

    if-nez v8, :cond_6

    .line 14
    iget-object v8, v7, LP5/c;->b0:Lf6/N;

    iget-object v9, v7, LP5/c;->C:LQ1/l;

    iget-object v10, v7, LP5/c;->D:LQ1/l;

    .line 15
    iget-wide v11, v7, LP5/c;->q:J

    cmp-long v11, v11, v35

    if-eqz v11, :cond_1

    iget-wide v11, v7, LP5/c;->t:J

    cmp-long v11, v11, v14

    if-eqz v11, :cond_1

    if-eqz v9, :cond_1

    .line 16
    iget v11, v9, LQ1/l;->b:I

    if-eqz v11, :cond_1

    if-eqz v10, :cond_1

    .line 17
    iget v12, v10, LQ1/l;->b:I

    if-eq v12, v11, :cond_2

    :cond_1
    move-object/from16 v38, v4

    move-object/from16 v47, v5

    const/16 v37, 0x1

    goto/16 :goto_4

    .line 18
    :cond_2
    new-array v12, v11, [I

    .line 19
    new-array v14, v11, [J

    .line 20
    new-array v15, v11, [J

    const/16 v37, 0x1

    .line 21
    new-array v13, v11, [J

    move/from16 v0, v22

    :goto_2
    if-ge v0, v11, :cond_3

    .line 22
    invoke-virtual {v9, v0}, LQ1/l;->c(I)J

    move-result-wide v25

    aput-wide v25, v13, v0

    move-object/from16 v38, v4

    move-object/from16 v47, v5

    .line 23
    iget-wide v4, v7, LP5/c;->q:J

    invoke-virtual {v10, v0}, LQ1/l;->c(I)J

    move-result-wide v25

    add-long v25, v25, v4

    aput-wide v25, v14, v0

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v4, v38

    move-object/from16 v5, v47

    goto :goto_2

    :cond_3
    move-object/from16 v38, v4

    move-object/from16 v47, v5

    move/from16 v0, v22

    :goto_3
    add-int/lit8 v4, v11, -0x1

    if-ge v0, v4, :cond_4

    add-int/lit8 v4, v0, 0x1

    .line 24
    aget-wide v9, v14, v4

    aget-wide v25, v14, v0

    sub-long v9, v9, v25

    long-to-int v5, v9

    aput v5, v12, v0

    .line 25
    aget-wide v9, v13, v4

    aget-wide v25, v13, v0

    sub-long v9, v9, v25

    aput-wide v9, v15, v0

    move v0, v4

    goto :goto_3

    .line 26
    :cond_4
    iget-wide v9, v7, LP5/c;->q:J

    move-wide/from16 v25, v9

    iget-wide v9, v7, LP5/c;->p:J

    add-long v9, v25, v9

    aget-wide v25, v14, v4

    sub-long v9, v9, v25

    long-to-int v0, v9

    aput v0, v12, v4

    .line 27
    iget-wide v9, v7, LP5/c;->t:J

    aget-wide v25, v13, v4

    sub-long v9, v9, v25

    aput-wide v9, v15, v4

    cmp-long v0, v9, v31

    if-gtz v0, :cond_5

    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "Discarding last cue point with unexpected duration: "

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    invoke-static {v12, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v12

    .line 30
    invoke-static {v14, v4}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v14

    .line 31
    invoke-static {v15, v4}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v15

    .line 32
    invoke-static {v13, v4}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v13

    .line 33
    :cond_5
    new-instance v0, LJ5/g;

    invoke-direct {v0, v12, v14, v15, v13}, LJ5/g;-><init>([I[J[J[J)V

    goto :goto_5

    .line 34
    :goto_4
    new-instance v0, LJ5/o;

    iget-wide v4, v7, LP5/c;->t:J

    invoke-direct {v0, v4, v5}, LJ5/o;-><init>(J)V

    .line 35
    :goto_5
    invoke-virtual {v8, v0}, Lf6/N;->x(LJ5/t;)V

    move/from16 v0, v37

    .line 36
    iput-boolean v0, v7, LP5/c;->v:Z

    :goto_6
    const/4 v0, 0x0

    goto :goto_7

    :cond_6
    move-object/from16 v38, v4

    move-object/from16 v47, v5

    goto :goto_6

    .line 37
    :goto_7
    iput-object v0, v7, LP5/c;->C:LQ1/l;

    .line 38
    iput-object v0, v7, LP5/c;->D:LQ1/l;

    :goto_8
    move-object/from16 v48, v2

    move-object/from16 v49, v3

    move/from16 v14, v22

    move-object/from16 v5, v33

    move-object/from16 v8, v38

    move-object/from16 v13, v47

    const/16 v17, 0x19

    const/16 v19, 0xf

    const/16 v23, 0x6

    move-object/from16 v47, v1

    goto/16 :goto_47

    :cond_7
    move-object/from16 v38, v4

    move-object/from16 v47, v5

    const/4 v0, 0x0

    .line 39
    invoke-virtual {v10}, Landroid/util/SparseArray;->size()I

    move-result v4

    if-eqz v4, :cond_8

    .line 40
    iget-object v0, v7, LP5/c;->b0:Lf6/N;

    invoke-virtual {v0}, Lf6/N;->l()V

    goto :goto_8

    .line 41
    :cond_8
    const-string v1, "No valid tracks were found"

    invoke-static {v1, v0}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object v0

    throw v0

    :cond_9
    move-object/from16 v38, v4

    move-object/from16 v47, v5

    .line 42
    iget-wide v4, v7, LP5/c;->r:J

    cmp-long v0, v4, v14

    if-nez v0, :cond_a

    const-wide/32 v4, 0xf4240

    .line 43
    iput-wide v4, v7, LP5/c;->r:J

    .line 44
    :cond_a
    iget-wide v4, v7, LP5/c;->s:J

    cmp-long v0, v4, v14

    if-eqz v0, :cond_b

    .line 45
    invoke-virtual {v7, v4, v5}, LP5/c;->l(J)J

    move-result-wide v4

    iput-wide v4, v7, LP5/c;->t:J

    goto :goto_8

    :cond_b
    :goto_9
    move-object/from16 v48, v2

    move-object/from16 v49, v3

    move-object/from16 v8, v38

    move-object/from16 v13, v47

    const/16 v17, 0x19

    const/16 v19, 0xf

    const/16 v23, 0x6

    move-object/from16 v47, v1

    move-object/from16 v38, v33

    goto/16 :goto_41

    :cond_c
    move-object/from16 v38, v4

    move-object/from16 v47, v5

    .line 46
    invoke-virtual {v7, v8}, LP5/c;->c(I)V

    .line 47
    iget-object v0, v7, LP5/c;->u:LP5/b;

    iget-boolean v4, v0, LP5/b;->h:Z

    if-eqz v4, :cond_b

    iget-object v0, v0, LP5/b;->i:[B

    if-nez v0, :cond_d

    goto :goto_9

    .line 48
    :cond_d
    const-string v0, "Combining encryption and compression is not supported"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object v0

    throw v0

    :cond_e
    move-object/from16 v38, v4

    move-object/from16 v47, v5

    .line 49
    invoke-virtual {v7, v8}, LP5/c;->c(I)V

    .line 50
    iget-object v0, v7, LP5/c;->u:LP5/b;

    iget-boolean v4, v0, LP5/b;->h:Z

    if-eqz v4, :cond_b

    .line 51
    iget-object v4, v0, LP5/b;->j:LJ5/v;

    if-eqz v4, :cond_f

    .line 52
    new-instance v5, LI5/c;

    new-instance v6, LI5/b;

    sget-object v7, LE5/i;->a:Ljava/util/UUID;

    .line 53
    iget-object v4, v4, LJ5/v;->b:[B

    const-string v8, "video/webm"

    const/4 v9, 0x0

    invoke-direct {v6, v7, v9, v8, v4}, LI5/b;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    const/4 v4, 0x1

    .line 54
    new-array v7, v4, [LI5/b;

    aput-object v6, v7, v22

    .line 55
    invoke-direct {v5, v9, v4, v7}, LI5/c;-><init>(Ljava/lang/String;Z[LI5/b;)V

    .line 56
    iput-object v5, v0, LP5/b;->l:LI5/c;

    goto/16 :goto_8

    :cond_f
    const/4 v9, 0x0

    .line 57
    const-string v0, "Encrypted Track found but ContentEncKeyID was not found"

    invoke-static {v0, v9}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object v0

    throw v0

    :cond_10
    move-object/from16 v38, v4

    move-object/from16 v47, v5

    .line 58
    iget v0, v7, LP5/c;->w:I

    const/4 v4, -0x1

    if-eq v0, v4, :cond_11

    iget-wide v4, v7, LP5/c;->x:J

    cmp-long v6, v4, v35

    if-eqz v6, :cond_11

    const v9, 0x1c53bb6b

    if-ne v0, v9, :cond_b

    .line 59
    iput-wide v4, v7, LP5/c;->z:J

    goto/16 :goto_8

    .line 60
    :cond_11
    const-string v0, "Mandatory element SeekID or SeekPosition not found"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object v0

    throw v0

    :cond_12
    move-object/from16 v38, v4

    move-object/from16 v47, v5

    .line 61
    iget-object v0, v7, LP5/c;->u:LP5/b;

    invoke-static {v0}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 62
    iget-object v4, v0, LP5/b;->b:Ljava/lang/String;

    if-eqz v4, :cond_7f

    .line 63
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    move-object/from16 v5, v33

    :goto_a
    move-object/from16 v8, v38

    move-object/from16 v13, v47

    :goto_b
    const/4 v9, -0x1

    goto/16 :goto_f

    :sswitch_0
    move-object/from16 v5, v33

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_13

    goto/16 :goto_d

    :cond_13
    move-object/from16 v8, v38

    move-object/from16 v13, v47

    const/16 v9, 0x20

    goto/16 :goto_f

    :sswitch_1
    move-object/from16 v5, v33

    const-string v8, "A_FLAC"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_14

    goto/16 :goto_d

    :cond_14
    const/16 v8, 0x1f

    goto/16 :goto_c

    :sswitch_2
    move-object/from16 v5, v33

    const-string v8, "A_EAC3"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_15

    goto/16 :goto_d

    :cond_15
    const/16 v8, 0x1e

    goto/16 :goto_c

    :sswitch_3
    move-object/from16 v5, v33

    const-string v8, "V_MPEG2"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_16

    goto/16 :goto_d

    :cond_16
    const/16 v8, 0x1d

    goto/16 :goto_c

    :sswitch_4
    move-object/from16 v5, v33

    const-string v8, "S_TEXT/UTF8"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_17

    goto/16 :goto_d

    :cond_17
    const/16 v8, 0x1c

    goto/16 :goto_c

    :sswitch_5
    move-object/from16 v5, v33

    const-string v8, "S_TEXT/WEBVTT"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_18

    goto/16 :goto_d

    :cond_18
    const/16 v8, 0x1b

    goto/16 :goto_c

    :sswitch_6
    move-object/from16 v5, v33

    const-string v8, "V_MPEGH/ISO/HEVC"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_19

    goto/16 :goto_d

    :cond_19
    const/16 v8, 0x1a

    goto/16 :goto_c

    :sswitch_7
    move-object/from16 v5, v33

    const-string v8, "S_TEXT/ASS"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1a

    goto/16 :goto_d

    :cond_1a
    move-object/from16 v8, v38

    move-object/from16 v13, v47

    const/16 v9, 0x19

    goto/16 :goto_f

    :sswitch_8
    move-object/from16 v5, v33

    const-string v8, "A_PCM/INT/LIT"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1b

    goto/16 :goto_d

    :cond_1b
    move-object/from16 v8, v38

    move-object/from16 v13, v47

    const/16 v9, 0x18

    goto/16 :goto_f

    :sswitch_9
    move-object/from16 v5, v33

    const-string v8, "A_PCM/INT/BIG"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1c

    goto/16 :goto_d

    :cond_1c
    const/16 v8, 0x17

    goto/16 :goto_c

    :sswitch_a
    move-object/from16 v5, v33

    const-string v8, "A_PCM/FLOAT/IEEE"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1d

    goto/16 :goto_d

    :cond_1d
    const/16 v8, 0x16

    goto/16 :goto_c

    :sswitch_b
    move-object/from16 v5, v33

    const-string v8, "A_DTS/EXPRESS"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1e

    goto/16 :goto_d

    :cond_1e
    const/16 v8, 0x15

    goto/16 :goto_c

    :sswitch_c
    move-object/from16 v5, v33

    const-string v8, "V_THEORA"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1f

    goto/16 :goto_d

    :cond_1f
    move/from16 v9, v16

    goto/16 :goto_e

    :sswitch_d
    move-object/from16 v5, v33

    const-string v8, "S_HDMV/PGS"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_20

    goto/16 :goto_d

    :cond_20
    const/16 v8, 0x13

    goto/16 :goto_c

    :sswitch_e
    move-object/from16 v5, v33

    const-string v8, "V_VP9"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_21

    goto/16 :goto_d

    :cond_21
    const/16 v8, 0x12

    goto/16 :goto_c

    :sswitch_f
    move-object/from16 v5, v33

    const-string v8, "V_VP8"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_22

    goto/16 :goto_d

    :cond_22
    const/16 v8, 0x11

    goto/16 :goto_c

    :sswitch_10
    move-object/from16 v5, v33

    const-string v8, "V_AV1"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_23

    goto/16 :goto_d

    :cond_23
    move-object/from16 v8, v38

    move-object/from16 v13, v47

    const/16 v9, 0x10

    goto/16 :goto_f

    :sswitch_11
    move-object/from16 v5, v33

    const-string v8, "A_DTS"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_24

    goto/16 :goto_d

    :cond_24
    move-object/from16 v8, v38

    move-object/from16 v13, v47

    const/16 v9, 0xf

    goto/16 :goto_f

    :sswitch_12
    move-object/from16 v5, v33

    const-string v8, "A_AC3"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_25

    goto/16 :goto_d

    :cond_25
    const/16 v8, 0xe

    goto/16 :goto_c

    :sswitch_13
    move-object/from16 v5, v33

    const-string v8, "A_AAC"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_26

    goto/16 :goto_d

    :cond_26
    const/16 v8, 0xd

    goto :goto_c

    :sswitch_14
    move-object/from16 v5, v33

    const-string v8, "A_DTS/LOSSLESS"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_27

    goto/16 :goto_d

    :cond_27
    const/16 v8, 0xc

    goto :goto_c

    :sswitch_15
    move-object/from16 v5, v33

    const-string v8, "S_VOBSUB"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_28

    goto/16 :goto_d

    :cond_28
    const/16 v8, 0xb

    goto :goto_c

    :sswitch_16
    move-object/from16 v5, v33

    const-string v8, "V_MPEG4/ISO/AVC"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_29

    goto/16 :goto_d

    :cond_29
    const/16 v8, 0xa

    goto :goto_c

    :sswitch_17
    move-object/from16 v5, v33

    const-string v8, "V_MPEG4/ISO/ASP"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2a

    goto/16 :goto_d

    :cond_2a
    const/16 v8, 0x9

    goto :goto_c

    :sswitch_18
    move-object/from16 v5, v33

    const-string v8, "S_DVBSUB"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2b

    goto/16 :goto_d

    :cond_2b
    move/from16 v9, v27

    goto/16 :goto_e

    :sswitch_19
    move-object/from16 v5, v33

    const-string v8, "V_MS/VFW/FOURCC"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2c

    goto :goto_d

    :cond_2c
    const/4 v8, 0x7

    :goto_c
    move v9, v8

    goto :goto_e

    :sswitch_1a
    move-object/from16 v5, v33

    const-string v8, "A_MPEG/L3"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2d

    goto :goto_d

    :cond_2d
    move-object/from16 v8, v38

    move-object/from16 v13, v47

    const/4 v9, 0x6

    goto/16 :goto_f

    :sswitch_1b
    move-object/from16 v5, v33

    const-string v8, "A_MPEG/L2"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2e

    goto :goto_d

    :cond_2e
    move-object/from16 v8, v38

    move-object/from16 v13, v47

    const/4 v9, 0x5

    goto :goto_f

    :sswitch_1c
    move-object/from16 v5, v33

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2f

    goto :goto_d

    :cond_2f
    move-object/from16 v8, v38

    move-object/from16 v13, v47

    const/4 v9, 0x4

    goto :goto_f

    :sswitch_1d
    move-object/from16 v5, v33

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_30

    goto :goto_d

    :cond_30
    move-object/from16 v8, v38

    move-object/from16 v13, v47

    const/4 v9, 0x3

    goto :goto_f

    :sswitch_1e
    move-object/from16 v5, v33

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_31

    :goto_d
    goto/16 :goto_a

    :cond_31
    move/from16 v9, v18

    :goto_e
    move-object/from16 v8, v38

    move-object/from16 v13, v47

    goto :goto_f

    :sswitch_1f
    move-object/from16 v5, v33

    move-object/from16 v8, v38

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    move-object/from16 v13, v47

    if-nez v9, :cond_32

    goto/16 :goto_b

    :cond_32
    const/4 v9, 0x1

    goto :goto_f

    :sswitch_20
    move-object/from16 v5, v33

    move-object/from16 v8, v38

    move-object/from16 v13, v47

    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_33

    goto/16 :goto_b

    :cond_33
    move/from16 v9, v22

    :goto_f
    packed-switch v9, :pswitch_data_0

    move-object/from16 v47, v1

    move-object/from16 v48, v2

    move-object/from16 v49, v3

    move-object/from16 v38, v5

    const/16 v17, 0x19

    const/16 v19, 0xf

    const/16 v23, 0x6

    :goto_10
    const/4 v1, 0x0

    goto/16 :goto_3f

    .line 64
    :pswitch_0
    iget-object v9, v7, LP5/c;->b0:Lf6/N;

    iget v11, v0, LP5/b;->c:I

    .line 65
    const-string v14, "application/dvbsubs"

    const-string v15, "application/vobsub"

    const-string v12, "application/pgs"

    move/from16 v30, v11

    const-string v11, "video/x-unknown"

    move-object/from16 v40, v7

    const-string v7, "text/x-ssa"

    move-object/from16 v33, v10

    const-string v10, "text/vtt"

    move-object/from16 v31, v9

    const-string v9, "application/x-subrip"

    move-object/from16 v32, v14

    const-string v14, ". Setting mimeType to audio/x-unknown"

    const-string v34, "audio/raw"

    const-string v35, "audio/x-unknown"

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v36

    sparse-switch v36, :sswitch_data_1

    :goto_11
    move-object/from16 v38, v5

    :goto_12
    const/4 v5, -0x1

    goto/16 :goto_14

    :sswitch_21
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v36

    if-nez v36, :cond_34

    goto :goto_11

    :cond_34
    move-object/from16 v38, v5

    const/16 v5, 0x20

    goto/16 :goto_14

    :sswitch_22
    move-object/from16 v38, v5

    const-string v5, "A_FLAC"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_35

    goto/16 :goto_13

    :cond_35
    const/16 v5, 0x1f

    goto/16 :goto_14

    :sswitch_23
    move-object/from16 v38, v5

    const-string v5, "A_EAC3"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_36

    goto/16 :goto_13

    :cond_36
    const/16 v5, 0x1e

    goto/16 :goto_14

    :sswitch_24
    move-object/from16 v38, v5

    const-string v5, "V_MPEG2"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_37

    goto/16 :goto_13

    :cond_37
    const/16 v5, 0x1d

    goto/16 :goto_14

    :sswitch_25
    move-object/from16 v38, v5

    const-string v5, "S_TEXT/UTF8"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_38

    goto/16 :goto_13

    :cond_38
    const/16 v5, 0x1c

    goto/16 :goto_14

    :sswitch_26
    move-object/from16 v38, v5

    const-string v5, "S_TEXT/WEBVTT"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_39

    goto/16 :goto_13

    :cond_39
    const/16 v5, 0x1b

    goto/16 :goto_14

    :sswitch_27
    move-object/from16 v38, v5

    const-string v5, "V_MPEGH/ISO/HEVC"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3a

    goto/16 :goto_13

    :cond_3a
    const/16 v5, 0x1a

    goto/16 :goto_14

    :sswitch_28
    move-object/from16 v38, v5

    const-string v5, "S_TEXT/ASS"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3b

    goto/16 :goto_13

    :cond_3b
    const/16 v5, 0x19

    goto/16 :goto_14

    :sswitch_29
    move-object/from16 v38, v5

    const-string v5, "A_PCM/INT/LIT"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3c

    goto/16 :goto_13

    :cond_3c
    const/16 v5, 0x18

    goto/16 :goto_14

    :sswitch_2a
    move-object/from16 v38, v5

    const-string v5, "A_PCM/INT/BIG"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3d

    goto/16 :goto_13

    :cond_3d
    const/16 v5, 0x17

    goto/16 :goto_14

    :sswitch_2b
    move-object/from16 v38, v5

    const-string v5, "A_PCM/FLOAT/IEEE"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3e

    goto/16 :goto_13

    :cond_3e
    const/16 v5, 0x16

    goto/16 :goto_14

    :sswitch_2c
    move-object/from16 v38, v5

    const-string v5, "A_DTS/EXPRESS"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3f

    goto/16 :goto_13

    :cond_3f
    const/16 v5, 0x15

    goto/16 :goto_14

    :sswitch_2d
    move-object/from16 v38, v5

    const-string v5, "V_THEORA"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_40

    goto/16 :goto_13

    :cond_40
    move/from16 v5, v16

    goto/16 :goto_14

    :sswitch_2e
    move-object/from16 v38, v5

    const-string v5, "S_HDMV/PGS"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_41

    goto/16 :goto_13

    :cond_41
    const/16 v5, 0x13

    goto/16 :goto_14

    :sswitch_2f
    move-object/from16 v38, v5

    const-string v5, "V_VP9"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_42

    goto/16 :goto_13

    :cond_42
    const/16 v5, 0x12

    goto/16 :goto_14

    :sswitch_30
    move-object/from16 v38, v5

    const-string v5, "V_VP8"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_43

    goto/16 :goto_13

    :cond_43
    const/16 v5, 0x11

    goto/16 :goto_14

    :sswitch_31
    move-object/from16 v38, v5

    const-string v5, "V_AV1"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_44

    goto/16 :goto_13

    :cond_44
    const/16 v5, 0x10

    goto/16 :goto_14

    :sswitch_32
    move-object/from16 v38, v5

    const-string v5, "A_DTS"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_45

    goto/16 :goto_13

    :cond_45
    const/16 v5, 0xf

    goto/16 :goto_14

    :sswitch_33
    move-object/from16 v38, v5

    const-string v5, "A_AC3"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_46

    goto/16 :goto_13

    :cond_46
    const/16 v5, 0xe

    goto/16 :goto_14

    :sswitch_34
    move-object/from16 v38, v5

    const-string v5, "A_AAC"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_47

    goto/16 :goto_13

    :cond_47
    const/16 v5, 0xd

    goto/16 :goto_14

    :sswitch_35
    move-object/from16 v38, v5

    const-string v5, "A_DTS/LOSSLESS"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_48

    goto/16 :goto_13

    :cond_48
    const/16 v5, 0xc

    goto/16 :goto_14

    :sswitch_36
    move-object/from16 v38, v5

    const-string v5, "S_VOBSUB"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_49

    goto/16 :goto_13

    :cond_49
    const/16 v5, 0xb

    goto/16 :goto_14

    :sswitch_37
    move-object/from16 v38, v5

    const-string v5, "V_MPEG4/ISO/AVC"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4a

    goto/16 :goto_13

    :cond_4a
    const/16 v5, 0xa

    goto/16 :goto_14

    :sswitch_38
    move-object/from16 v38, v5

    const-string v5, "V_MPEG4/ISO/ASP"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4b

    goto/16 :goto_13

    :cond_4b
    const/16 v5, 0x9

    goto/16 :goto_14

    :sswitch_39
    move-object/from16 v38, v5

    const-string v5, "S_DVBSUB"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4c

    goto/16 :goto_13

    :cond_4c
    move/from16 v5, v27

    goto/16 :goto_14

    :sswitch_3a
    move-object/from16 v38, v5

    const-string v5, "V_MS/VFW/FOURCC"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4d

    goto :goto_13

    :cond_4d
    const/4 v5, 0x7

    goto :goto_14

    :sswitch_3b
    move-object/from16 v38, v5

    const-string v5, "A_MPEG/L3"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4e

    goto :goto_13

    :cond_4e
    const/4 v5, 0x6

    goto :goto_14

    :sswitch_3c
    move-object/from16 v38, v5

    const-string v5, "A_MPEG/L2"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4f

    goto :goto_13

    :cond_4f
    const/4 v5, 0x5

    goto :goto_14

    :sswitch_3d
    move-object/from16 v38, v5

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_50

    goto :goto_13

    :cond_50
    const/4 v5, 0x4

    goto :goto_14

    :sswitch_3e
    move-object/from16 v38, v5

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_51

    goto :goto_13

    :cond_51
    const/4 v5, 0x3

    goto :goto_14

    :sswitch_3f
    move-object/from16 v38, v5

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_52

    goto :goto_13

    :cond_52
    move/from16 v5, v18

    goto :goto_14

    :sswitch_40
    move-object/from16 v38, v5

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_53

    goto :goto_13

    :cond_53
    const/4 v5, 0x1

    goto :goto_14

    :sswitch_41
    move-object/from16 v38, v5

    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_54

    :goto_13
    goto/16 :goto_12

    :cond_54
    move/from16 v5, v22

    :goto_14
    packed-switch v5, :pswitch_data_1

    .line 66
    const-string v0, "Unrecognized codec identifier."

    const/4 v1, 0x0

    invoke-static {v0, v1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object v0

    throw v0

    .line 67
    :pswitch_1
    new-instance v4, Ljava/util/ArrayList;

    const/4 v5, 0x3

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 68
    iget-object v5, v0, LP5/b;->b:Ljava/lang/String;

    invoke-virtual {v0, v5}, LP5/b;->a(Ljava/lang/String;)[B

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    invoke-static/range {v27 .. v27}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v5

    sget-object v6, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v5, v6}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v5

    move-object/from16 v47, v1

    move-object/from16 v48, v2

    iget-wide v1, v0, LP5/b;->R:J

    invoke-virtual {v5, v1, v2}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    .line 70
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    invoke-static/range {v27 .. v27}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget-wide v5, v0, LP5/b;->S:J

    invoke-virtual {v1, v5, v6}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    .line 72
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    const-string v11, "audio/opus"

    const/16 v1, 0x1680

    move-object v5, v4

    const/16 v2, 0x18

    const/4 v6, 0x0

    const/16 v19, 0xf

    const/16 v23, 0x6

    move v4, v1

    const/4 v1, -0x1

    goto/16 :goto_32

    :pswitch_2
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    .line 74
    invoke-virtual {v0, v4}, LP5/b;->a(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 75
    const-string v11, "audio/flac"

    move-object v5, v1

    :goto_15
    const/4 v1, -0x1

    const/16 v2, 0x18

    const/4 v4, -0x1

    :goto_16
    const/4 v6, 0x0

    :goto_17
    const/16 v19, 0xf

    :goto_18
    const/16 v23, 0x6

    goto/16 :goto_32

    :pswitch_3
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    .line 76
    const-string v11, "audio/eac3"

    :goto_19
    const/4 v1, -0x1

    :goto_1a
    const/16 v2, 0x18

    const/4 v4, -0x1

    const/4 v5, 0x0

    goto :goto_16

    :pswitch_4
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    .line 77
    const-string v11, "video/mpeg2"

    goto :goto_19

    :pswitch_5
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    move-object v11, v9

    goto :goto_19

    :pswitch_6
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    move-object v11, v10

    goto :goto_19

    :pswitch_7
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    .line 78
    new-instance v1, LY4/b;

    invoke-virtual {v0, v4}, LP5/b;->a(Ljava/lang/String;)[B

    move-result-object v2

    invoke-direct {v1, v2}, LY4/b;-><init>([B)V

    invoke-static {v1}, Lv6/c;->a(LY4/b;)Lv6/c;

    move-result-object v1

    .line 79
    iget v2, v1, Lv6/c;->b:I

    iput v2, v0, LP5/b;->Y:I

    .line 80
    const-string v11, "video/hevc"

    iget-object v2, v1, Lv6/c;->a:Ljava/util/List;

    iget-object v1, v1, Lv6/c;->d:Ljava/lang/String;

    move-object v6, v1

    move-object v5, v2

    const/4 v1, -0x1

    const/16 v2, 0x18

    const/4 v4, -0x1

    goto :goto_17

    :pswitch_8
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    .line 81
    invoke-virtual {v0, v4}, LP5/b;->a(Ljava/lang/String;)[B

    move-result-object v1

    sget-object v2, LP5/c;->d0:[B

    invoke-static {v2, v1}, Ll8/K;->o(Ljava/lang/Object;Ljava/lang/Object;)Ll8/e0;

    move-result-object v1

    move-object v5, v1

    move-object v11, v7

    goto :goto_15

    :pswitch_9
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    .line 82
    iget v1, v0, LP5/b;->P:I

    invoke-static {v1}, Lu6/v;->o(I)I

    move-result v1

    if-nez v1, :cond_55

    .line 83
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported little endian PCM bit depth: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v0, LP5/b;->P:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1b
    move-object/from16 v11, v35

    goto :goto_19

    :cond_55
    :goto_1c
    move-object/from16 v11, v34

    goto :goto_1a

    :pswitch_a
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    .line 84
    iget v1, v0, LP5/b;->P:I

    move/from16 v2, v27

    if-ne v1, v2, :cond_56

    move-object/from16 v11, v34

    const/4 v1, 0x3

    goto/16 :goto_1a

    :cond_56
    const/16 v2, 0x10

    if-ne v1, v2, :cond_57

    const/high16 v1, 0x10000000

    goto :goto_1c

    .line 85
    :cond_57
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported big endian PCM bit depth: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v0, LP5/b;->P:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1b

    :pswitch_b
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    .line 86
    iget v1, v0, LP5/b;->P:I

    const/16 v2, 0x20

    if-ne v1, v2, :cond_58

    move-object/from16 v11, v34

    const/4 v1, 0x4

    goto/16 :goto_1a

    .line 87
    :cond_58
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Unsupported floating point PCM bit depth: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, v0, LP5/b;->P:I

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1b

    :pswitch_c
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    goto/16 :goto_19

    :pswitch_d
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    move-object v11, v12

    goto/16 :goto_19

    :pswitch_e
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    const/16 v2, 0x20

    .line 88
    const-string v11, "video/x-vnd.on2.vp9"

    goto/16 :goto_19

    :pswitch_f
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    const/16 v2, 0x20

    .line 89
    const-string v11, "video/x-vnd.on2.vp8"

    goto/16 :goto_19

    :pswitch_10
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    const/16 v2, 0x20

    .line 90
    const-string v11, "video/av01"

    goto/16 :goto_19

    :pswitch_11
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    const/16 v2, 0x20

    .line 91
    const-string v11, "audio/vnd.dts"

    goto/16 :goto_19

    :pswitch_12
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    const/16 v2, 0x20

    .line 92
    const-string v11, "audio/ac3"

    goto/16 :goto_19

    :pswitch_13
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    const/16 v2, 0x20

    .line 93
    invoke-virtual {v0, v4}, LP5/b;->a(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 94
    iget-object v4, v0, LP5/b;->k:[B

    .line 95
    new-instance v5, LJ5/y;

    .line 96
    array-length v6, v4

    move/from16 v11, v22

    const/4 v14, 0x6

    invoke-direct {v5, v4, v6, v14, v11}, LJ5/y;-><init>([BIIB)V

    .line 97
    invoke-static {v5, v11}, LG5/b;->f(LJ5/y;Z)LG5/a;

    move-result-object v4

    .line 98
    iget v5, v4, LG5/a;->a:I

    iput v5, v0, LP5/b;->Q:I

    .line 99
    iget v5, v4, LG5/a;->b:I

    iput v5, v0, LP5/b;->O:I

    .line 100
    const-string v11, "audio/mp4a-latm"

    iget-object v4, v4, LG5/a;->c:Ljava/lang/String;

    move-object v5, v1

    move-object v6, v4

    :goto_1d
    move/from16 v23, v14

    const/4 v1, -0x1

    const/16 v2, 0x18

    const/4 v4, -0x1

    :goto_1e
    const/16 v19, 0xf

    goto/16 :goto_32

    :pswitch_14
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    const/16 v2, 0x20

    const/4 v14, 0x6

    .line 101
    const-string v11, "audio/vnd.dts.hd"

    move/from16 v23, v14

    const/4 v1, -0x1

    const/16 v2, 0x18

    const/4 v4, -0x1

    const/4 v5, 0x0

    :goto_1f
    const/4 v6, 0x0

    goto :goto_1e

    :pswitch_15
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    const/16 v2, 0x20

    const/4 v14, 0x6

    .line 102
    invoke-virtual {v0, v4}, LP5/b;->a(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v1}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    move-result-object v1

    move-object v5, v1

    move/from16 v23, v14

    move-object v11, v15

    :goto_20
    const/4 v1, -0x1

    const/16 v2, 0x18

    const/4 v4, -0x1

    goto :goto_1f

    :pswitch_16
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    const/16 v2, 0x20

    const/4 v14, 0x6

    .line 103
    new-instance v1, LY4/b;

    invoke-virtual {v0, v4}, LP5/b;->a(Ljava/lang/String;)[B

    move-result-object v4

    invoke-direct {v1, v4}, LY4/b;-><init>([B)V

    invoke-static {v1}, Lv6/a;->a(LY4/b;)Lv6/a;

    move-result-object v1

    .line 104
    iget v4, v1, Lv6/a;->b:I

    iput v4, v0, LP5/b;->Y:I

    .line 105
    iget-object v4, v1, Lv6/a;->a:Ljava/util/ArrayList;

    const-string v11, "video/avc"

    iget-object v1, v1, Lv6/a;->f:Ljava/lang/String;

    move-object v6, v1

    move-object v5, v4

    goto :goto_1d

    :pswitch_17
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    const/4 v1, 0x4

    const/16 v2, 0x20

    const/4 v14, 0x6

    .line 106
    new-array v5, v1, [B

    .line 107
    invoke-virtual {v0, v4}, LP5/b;->a(Ljava/lang/String;)[B

    move-result-object v4

    const/4 v11, 0x0

    invoke-static {v4, v11, v5, v11, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 108
    invoke-static {v5}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    move-result-object v1

    move-object v5, v1

    move/from16 v23, v14

    move-object/from16 v11, v32

    goto :goto_20

    :pswitch_18
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    const/16 v2, 0x20

    const/4 v14, 0x6

    .line 109
    new-instance v1, LY4/b;

    .line 110
    invoke-virtual {v0, v4}, LP5/b;->a(Ljava/lang/String;)[B

    move-result-object v4

    invoke-direct {v1, v4}, LY4/b;-><init>([B)V

    const/16 v5, 0x10

    .line 111
    :try_start_0
    invoke-virtual {v1, v5}, LY4/b;->B(I)V

    .line 112
    invoke-virtual {v1}, LY4/b;->h()J

    move-result-wide v23

    const-wide/32 v34, 0x58564944

    cmp-long v4, v23, v34

    if-nez v4, :cond_59

    .line 113
    new-instance v1, Landroid/util/Pair;

    const-string v4, "video/divx"
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v6, 0x0

    :try_start_1
    invoke-direct {v1, v4, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_2

    :goto_21
    const/4 v6, 0x0

    const/16 v19, 0xf

    goto/16 :goto_25

    :catch_0
    const/4 v6, 0x0

    goto/16 :goto_26

    :cond_59
    const-wide/32 v34, 0x33363248

    cmp-long v4, v23, v34

    if-nez v4, :cond_5a

    .line 114
    :try_start_2
    new-instance v1, Landroid/util/Pair;

    const-string v4, "video/3gpp"
    :try_end_2
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_0

    const/4 v6, 0x0

    :try_start_3
    invoke-direct {v1, v4, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_21

    :cond_5a
    const-wide/32 v34, 0x31435657

    cmp-long v4, v23, v34

    if-nez v4, :cond_5f

    .line 115
    :try_start_4
    iget v4, v1, LY4/b;->b:I

    add-int/lit8 v4, v4, 0x14

    .line 116
    iget-object v1, v1, LY4/b;->a:[B

    .line 117
    :goto_22
    array-length v6, v1

    const/16 v21, 0x4

    add-int/lit8 v6, v6, -0x4

    if-ge v4, v6, :cond_5e

    .line 118
    aget-byte v6, v1, v4

    if-nez v6, :cond_5d

    const/4 v6, 0x1

    add-int/lit8 v11, v4, 0x1

    aget-byte v11, v1, v11

    if-nez v11, :cond_5c

    add-int/lit8 v11, v4, 0x2

    aget-byte v11, v1, v11

    if-ne v11, v6, :cond_5c

    const/16 v28, 0x3

    add-int/lit8 v11, v4, 0x3

    aget-byte v6, v1, v11

    const/16 v11, 0xf

    if-ne v6, v11, :cond_5b

    .line 119
    array-length v6, v1

    invoke-static {v1, v4, v6}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v1

    .line 120
    new-instance v4, Landroid/util/Pair;

    const-string v6, "video/wvc1"

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v4, v6, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v1, v4

    move/from16 v19, v11

    const/4 v6, 0x0

    goto :goto_25

    :cond_5b
    :goto_23
    const/16 v37, 0x1

    goto :goto_24

    :cond_5c
    const/16 v11, 0xf

    move/from16 v37, v6

    goto :goto_24

    :cond_5d
    const/16 v11, 0xf

    goto :goto_23

    :goto_24
    add-int/lit8 v4, v4, 0x1

    goto :goto_22

    .line 121
    :cond_5e
    const-string v0, "Failed to find FourCC VC1 initialization data"
    :try_end_4
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_0

    const/4 v1, 0x0

    :try_start_5
    invoke-static {v0, v1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_5 .. :try_end_5} :catch_1

    :try_start_6
    throw v0
    :try_end_6
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_0

    :catch_1
    move-object v6, v1

    goto :goto_26

    :cond_5f
    const/16 v19, 0xf

    .line 122
    const-string v1, "Unknown FourCC. Setting mimeType to video/x-unknown"

    invoke-static {v6, v1}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    new-instance v1, Landroid/util/Pair;

    const/4 v6, 0x0

    invoke-direct {v1, v11, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 124
    :goto_25
    iget-object v4, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    move-object v11, v4

    check-cast v11, Ljava/lang/String;

    .line 125
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    move-object/from16 v39, v1

    check-cast v39, Ljava/util/List;

    move/from16 v23, v14

    move-object/from16 v5, v39

    const/4 v1, -0x1

    const/16 v2, 0x18

    const/4 v4, -0x1

    goto/16 :goto_32

    .line 126
    :catch_2
    :goto_26
    const-string v0, "Error parsing FourCC private data"

    invoke-static {v0, v6}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object v0

    throw v0

    :pswitch_19
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    const/16 v2, 0x20

    const/16 v5, 0x10

    const/4 v14, 0x6

    const/16 v19, 0xf

    .line 127
    const-string v11, "audio/mpeg"

    :goto_27
    move/from16 v23, v14

    const/4 v1, -0x1

    const/16 v2, 0x18

    const/16 v4, 0x1000

    :goto_28
    const/4 v5, 0x0

    :goto_29
    const/4 v6, 0x0

    goto/16 :goto_32

    :pswitch_1a
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    const/16 v2, 0x20

    const/16 v5, 0x10

    const/4 v14, 0x6

    const/16 v19, 0xf

    .line 128
    const-string v11, "audio/mpeg-L2"

    goto :goto_27

    :pswitch_1b
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    const/16 v2, 0x20

    const/16 v5, 0x10

    const/4 v14, 0x6

    const/16 v19, 0xf

    .line 129
    invoke-virtual {v0, v4}, LP5/b;->a(Ljava/lang/String;)[B

    move-result-object v1

    .line 130
    const-string v4, "Error parsing vorbis codec private"

    const/16 v22, 0x0

    :try_start_7
    aget-byte v6, v1, v22

    move/from16 v11, v18

    if-ne v6, v11, :cond_65

    const/4 v6, 0x0

    const/4 v11, 0x1

    .line 131
    :goto_2a
    aget-byte v2, v1, v11

    const/16 v5, 0xff

    and-int/2addr v2, v5

    if-ne v2, v5, :cond_60

    add-int/2addr v6, v5

    const/16 v37, 0x1

    add-int/lit8 v11, v11, 0x1

    const/16 v5, 0x10

    goto :goto_2a

    :cond_60
    const/4 v14, 0x1

    add-int/2addr v11, v14

    add-int/2addr v6, v2

    move/from16 v37, v14

    const/4 v2, 0x0

    .line 132
    :goto_2b
    aget-byte v14, v1, v11

    and-int/2addr v14, v5

    if-ne v14, v5, :cond_61

    add-int/2addr v2, v5

    add-int/lit8 v11, v11, 0x1

    goto :goto_2b

    :cond_61
    add-int/lit8 v11, v11, 0x1

    add-int/2addr v2, v14

    .line 133
    aget-byte v14, v1, v11

    move/from16 v5, v37

    if-ne v14, v5, :cond_64

    .line 134
    new-array v5, v6, [B

    const/4 v14, 0x0

    .line 135
    invoke-static {v1, v11, v5, v14, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v11, v6

    .line 136
    aget-byte v6, v1, v11

    const/4 v14, 0x3

    if-ne v6, v14, :cond_63

    add-int/2addr v11, v2

    .line 137
    aget-byte v2, v1, v11

    const/4 v6, 0x5

    if-ne v2, v6, :cond_62

    .line 138
    array-length v2, v1

    sub-int/2addr v2, v11

    new-array v2, v2, [B

    .line 139
    array-length v6, v1

    sub-int/2addr v6, v11

    const/4 v14, 0x0

    invoke-static {v1, v11, v2, v14, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 140
    new-instance v1, Ljava/util/ArrayList;

    const/4 v11, 0x2

    invoke-direct {v1, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 141
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_7
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_7 .. :try_end_7} :catch_3

    .line 143
    const-string v11, "audio/vorbis"

    const/16 v2, 0x2000

    move-object v5, v1

    move v4, v2

    const/4 v1, -0x1

    const/16 v2, 0x18

    :goto_2c
    const/4 v6, 0x0

    goto/16 :goto_18

    :catch_3
    const/4 v1, 0x0

    goto :goto_2d

    :cond_62
    const/4 v1, 0x0

    .line 144
    :try_start_8
    invoke-static {v4, v1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object v0

    throw v0

    :cond_63
    const/4 v1, 0x0

    .line 145
    invoke-static {v4, v1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object v0

    throw v0

    :cond_64
    const/4 v1, 0x0

    .line 146
    invoke-static {v4, v1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object v0

    throw v0

    :cond_65
    const/4 v1, 0x0

    .line 147
    invoke-static {v4, v1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object v0

    throw v0
    :try_end_8
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_8 .. :try_end_8} :catch_4

    .line 148
    :catch_4
    :goto_2d
    invoke-static {v4, v1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object v0

    throw v0

    :pswitch_1c
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    const/16 v19, 0xf

    .line 149
    new-instance v1, LJ5/x;

    const/4 v14, 0x0

    invoke-direct {v1, v14}, LJ5/x;-><init>(I)V

    iput-object v1, v0, LP5/b;->T:LJ5/x;

    .line 150
    const-string v11, "audio/true-hd"

    const/4 v1, -0x1

    const/16 v2, 0x18

    const/4 v4, -0x1

    const/4 v5, 0x0

    goto :goto_2c

    :pswitch_1d
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    const/16 v19, 0xf

    const/16 v23, 0x6

    .line 151
    new-instance v1, LY4/b;

    invoke-virtual {v0, v4}, LP5/b;->a(Ljava/lang/String;)[B

    move-result-object v2

    invoke-direct {v1, v2}, LY4/b;-><init>([B)V

    .line 152
    :try_start_9
    invoke-virtual {v1}, LY4/b;->j()I

    move-result v2

    const/4 v4, 0x1

    if-ne v2, v4, :cond_66

    const/16 v2, 0x18

    goto :goto_2e

    :cond_66
    const v4, 0xfffe

    if-ne v2, v4, :cond_68

    const/16 v2, 0x18

    .line 153
    invoke-virtual {v1, v2}, LY4/b;->A(I)V

    .line 154
    invoke-virtual {v1}, LY4/b;->k()J

    move-result-wide v4

    .line 155
    sget-object v11, LP5/c;->g0:Ljava/util/UUID;

    .line 156
    invoke-virtual {v11}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v41

    cmp-long v4, v4, v41

    if-nez v4, :cond_69

    .line 157
    invoke-virtual {v1}, LY4/b;->k()J

    move-result-wide v4

    invoke-virtual {v11}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v41
    :try_end_9
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_9 .. :try_end_9} :catch_5

    cmp-long v1, v4, v41

    if-nez v1, :cond_69

    .line 158
    :goto_2e
    iget v1, v0, LP5/b;->P:I

    invoke-static {v1}, Lu6/v;->o(I)I

    move-result v1

    if-nez v1, :cond_67

    .line 159
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Unsupported PCM bit depth: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, v0, LP5/b;->P:I

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2f
    move-object/from16 v11, v35

    const/4 v1, -0x1

    :goto_30
    const/4 v4, -0x1

    goto/16 :goto_28

    :cond_67
    move-object/from16 v11, v34

    goto :goto_30

    :cond_68
    const/16 v2, 0x18

    .line 160
    :cond_69
    const-string v1, "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown"

    invoke-static {v6, v1}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2f

    .line 161
    :catch_5
    const-string v0, "Error parsing MS/ACM codec private"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object v0

    throw v0

    :pswitch_1e
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    const/16 v2, 0x18

    const/16 v19, 0xf

    const/16 v23, 0x6

    .line 162
    iget-object v1, v0, LP5/b;->k:[B

    if-nez v1, :cond_6a

    const/4 v1, 0x0

    goto :goto_31

    :cond_6a
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 163
    :goto_31
    const-string v11, "video/mp4v-es"

    move-object v5, v1

    const/4 v1, -0x1

    const/4 v4, -0x1

    goto/16 :goto_29

    .line 164
    :goto_32
    iget-object v14, v0, LP5/b;->N:[B

    if-eqz v14, :cond_6b

    .line 165
    new-instance v2, LY4/b;

    invoke-direct {v2, v14}, LY4/b;-><init>([B)V

    .line 166
    invoke-static {v2}, LB8/e;->f(LY4/b;)LB8/e;

    move-result-object v2

    if-eqz v2, :cond_6b

    .line 167
    iget-object v6, v2, LB8/e;->b:Ljava/lang/String;

    const-string v11, "video/dolby-vision"

    .line 168
    :cond_6b
    iget-boolean v2, v0, LP5/b;->V:Z

    .line 169
    iget-boolean v14, v0, LP5/b;->U:Z

    if-eqz v14, :cond_6c

    const/4 v14, 0x2

    goto :goto_33

    :cond_6c
    const/4 v14, 0x0

    :goto_33
    or-int/2addr v2, v14

    .line 170
    new-instance v14, LE5/S;

    invoke-direct {v14}, LE5/S;-><init>()V

    .line 171
    invoke-static {v11}, Lu6/k;->g(Ljava/lang/String;)Z

    move-result v20

    move-object/from16 v49, v3

    sget-object v3, LP5/c;->h0:Ljava/util/Map;

    if-eqz v20, :cond_6d

    .line 172
    iget v7, v0, LP5/b;->O:I

    .line 173
    iput v7, v14, LE5/S;->x:I

    .line 174
    iget v7, v0, LP5/b;->Q:I

    .line 175
    iput v7, v14, LE5/S;->y:I

    .line 176
    iput v1, v14, LE5/S;->z:I

    const/4 v1, 0x1

    :goto_34
    const/16 v17, 0x19

    goto/16 :goto_3e

    .line 177
    :cond_6d
    invoke-static {v11}, Lu6/k;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7b

    .line 178
    iget v1, v0, LP5/b;->q:I

    if-nez v1, :cond_70

    .line 179
    iget v1, v0, LP5/b;->o:I

    const/4 v7, -0x1

    if-ne v1, v7, :cond_6e

    iget v1, v0, LP5/b;->m:I

    :cond_6e
    iput v1, v0, LP5/b;->o:I

    .line 180
    iget v1, v0, LP5/b;->p:I

    if-ne v1, v7, :cond_6f

    iget v1, v0, LP5/b;->n:I

    :cond_6f
    iput v1, v0, LP5/b;->p:I

    goto :goto_35

    :cond_70
    const/4 v7, -0x1

    .line 181
    :goto_35
    iget v1, v0, LP5/b;->o:I

    if-eq v1, v7, :cond_71

    iget v9, v0, LP5/b;->p:I

    if-eq v9, v7, :cond_71

    .line 182
    iget v7, v0, LP5/b;->n:I

    mul-int/2addr v7, v1

    int-to-float v1, v7

    iget v7, v0, LP5/b;->m:I

    mul-int/2addr v7, v9

    int-to-float v7, v7

    div-float/2addr v1, v7

    goto :goto_36

    :cond_71
    move/from16 v1, v26

    .line 183
    :goto_36
    iget-boolean v7, v0, LP5/b;->x:Z

    if-eqz v7, :cond_74

    .line 184
    iget v7, v0, LP5/b;->D:F

    cmpl-float v7, v7, v26

    if-eqz v7, :cond_72

    iget v7, v0, LP5/b;->E:F

    cmpl-float v7, v7, v26

    if-eqz v7, :cond_72

    iget v7, v0, LP5/b;->F:F

    cmpl-float v7, v7, v26

    if-eqz v7, :cond_72

    iget v7, v0, LP5/b;->G:F

    cmpl-float v7, v7, v26

    if-eqz v7, :cond_72

    iget v7, v0, LP5/b;->H:F

    cmpl-float v7, v7, v26

    if-eqz v7, :cond_72

    iget v7, v0, LP5/b;->I:F

    cmpl-float v7, v7, v26

    if-eqz v7, :cond_72

    iget v7, v0, LP5/b;->J:F

    cmpl-float v7, v7, v26

    if-eqz v7, :cond_72

    iget v7, v0, LP5/b;->K:F

    cmpl-float v7, v7, v26

    if-eqz v7, :cond_72

    iget v7, v0, LP5/b;->L:F

    cmpl-float v7, v7, v26

    if-eqz v7, :cond_72

    iget v7, v0, LP5/b;->M:F

    cmpl-float v7, v7, v26

    if-nez v7, :cond_73

    :cond_72
    const/16 v7, 0x19

    goto/16 :goto_37

    :cond_73
    const/16 v7, 0x19

    .line 185
    new-array v9, v7, [B

    .line 186
    invoke-static {v9}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v10

    sget-object v12, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v10, v12}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v10

    const/4 v12, 0x0

    .line 187
    invoke-virtual {v10, v12}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 188
    iget v12, v0, LP5/b;->D:F

    const v15, 0x47435000    # 50000.0f

    mul-float/2addr v12, v15

    const/high16 v17, 0x3f000000    # 0.5f

    add-float v12, v12, v17

    float-to-int v12, v12

    int-to-short v12, v12

    invoke-virtual {v10, v12}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 189
    iget v12, v0, LP5/b;->E:F

    mul-float/2addr v12, v15

    add-float v12, v12, v17

    float-to-int v12, v12

    int-to-short v12, v12

    invoke-virtual {v10, v12}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 190
    iget v12, v0, LP5/b;->F:F

    mul-float/2addr v12, v15

    add-float v12, v12, v17

    float-to-int v12, v12

    int-to-short v12, v12

    invoke-virtual {v10, v12}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 191
    iget v12, v0, LP5/b;->G:F

    mul-float/2addr v12, v15

    add-float v12, v12, v17

    float-to-int v12, v12

    int-to-short v12, v12

    invoke-virtual {v10, v12}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 192
    iget v12, v0, LP5/b;->H:F

    mul-float/2addr v12, v15

    add-float v12, v12, v17

    float-to-int v12, v12

    int-to-short v12, v12

    invoke-virtual {v10, v12}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 193
    iget v12, v0, LP5/b;->I:F

    mul-float/2addr v12, v15

    add-float v12, v12, v17

    float-to-int v12, v12

    int-to-short v12, v12

    invoke-virtual {v10, v12}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 194
    iget v12, v0, LP5/b;->J:F

    mul-float/2addr v12, v15

    add-float v12, v12, v17

    float-to-int v12, v12

    int-to-short v12, v12

    invoke-virtual {v10, v12}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 195
    iget v12, v0, LP5/b;->K:F

    mul-float/2addr v12, v15

    add-float v12, v12, v17

    float-to-int v12, v12

    int-to-short v12, v12

    invoke-virtual {v10, v12}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 196
    iget v12, v0, LP5/b;->L:F

    add-float v12, v12, v17

    float-to-int v12, v12

    int-to-short v12, v12

    invoke-virtual {v10, v12}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 197
    iget v12, v0, LP5/b;->M:F

    add-float v12, v12, v17

    float-to-int v12, v12

    int-to-short v12, v12

    invoke-virtual {v10, v12}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 198
    iget v12, v0, LP5/b;->B:I

    int-to-short v12, v12

    invoke-virtual {v10, v12}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 199
    iget v12, v0, LP5/b;->C:I

    int-to-short v12, v12

    invoke-virtual {v10, v12}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    goto :goto_38

    :goto_37
    const/4 v9, 0x0

    .line 200
    :goto_38
    new-instance v10, Lv6/b;

    iget v12, v0, LP5/b;->y:I

    iget v15, v0, LP5/b;->A:I

    iget v7, v0, LP5/b;->z:I

    invoke-direct {v10, v12, v9, v15, v7}, Lv6/b;-><init>(I[BII)V

    goto :goto_39

    :cond_74
    const/4 v10, 0x0

    .line 201
    :goto_39
    iget-object v7, v0, LP5/b;->a:Ljava/lang/String;

    if-eqz v7, :cond_75

    invoke-interface {v3, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_75

    .line 202
    iget-object v7, v0, LP5/b;->a:Ljava/lang/String;

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    goto :goto_3a

    :cond_75
    const/4 v7, -0x1

    .line 203
    :goto_3a
    iget v9, v0, LP5/b;->r:I

    if-nez v9, :cond_7a

    iget v9, v0, LP5/b;->s:F

    const/4 v12, 0x0

    .line 204
    invoke-static {v9, v12}, Ljava/lang/Float;->compare(FF)I

    move-result v9

    if-nez v9, :cond_7a

    iget v9, v0, LP5/b;->t:F

    .line 205
    invoke-static {v9, v12}, Ljava/lang/Float;->compare(FF)I

    move-result v9

    if-nez v9, :cond_7a

    .line 206
    iget v9, v0, LP5/b;->u:F

    invoke-static {v9, v12}, Ljava/lang/Float;->compare(FF)I

    move-result v9

    if-nez v9, :cond_76

    const/4 v7, 0x0

    goto :goto_3c

    .line 207
    :cond_76
    iget v9, v0, LP5/b;->t:F

    const/high16 v12, 0x42b40000    # 90.0f

    invoke-static {v9, v12}, Ljava/lang/Float;->compare(FF)I

    move-result v9

    if-nez v9, :cond_77

    const/16 v7, 0x5a

    goto :goto_3c

    .line 208
    :cond_77
    iget v9, v0, LP5/b;->t:F

    const/high16 v12, -0x3ccc0000    # -180.0f

    invoke-static {v9, v12}, Ljava/lang/Float;->compare(FF)I

    move-result v9

    if-eqz v9, :cond_79

    iget v9, v0, LP5/b;->t:F

    const/high16 v12, 0x43340000    # 180.0f

    .line 209
    invoke-static {v9, v12}, Ljava/lang/Float;->compare(FF)I

    move-result v9

    if-nez v9, :cond_78

    goto :goto_3b

    .line 210
    :cond_78
    iget v9, v0, LP5/b;->t:F

    const/high16 v12, -0x3d4c0000    # -90.0f

    invoke-static {v9, v12}, Ljava/lang/Float;->compare(FF)I

    move-result v9

    if-nez v9, :cond_7a

    const/16 v7, 0x10e

    goto :goto_3c

    :cond_79
    :goto_3b
    const/16 v7, 0xb4

    .line 211
    :cond_7a
    :goto_3c
    iget v9, v0, LP5/b;->m:I

    .line 212
    iput v9, v14, LE5/S;->p:I

    .line 213
    iget v9, v0, LP5/b;->n:I

    .line 214
    iput v9, v14, LE5/S;->q:I

    .line 215
    iput v1, v14, LE5/S;->t:F

    .line 216
    iput v7, v14, LE5/S;->s:I

    .line 217
    iget-object v1, v0, LP5/b;->v:[B

    .line 218
    iput-object v1, v14, LE5/S;->u:[B

    .line 219
    iget v1, v0, LP5/b;->w:I

    .line 220
    iput v1, v14, LE5/S;->v:I

    .line 221
    iput-object v10, v14, LE5/S;->w:Lv6/b;

    const/4 v1, 0x2

    goto/16 :goto_34

    :cond_7b
    const/16 v17, 0x19

    .line 222
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7d

    .line 223
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7d

    .line 224
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7d

    .line 225
    invoke-virtual {v15, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7d

    .line 226
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7d

    move-object/from16 v1, v32

    .line 227
    invoke-virtual {v1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7c

    goto :goto_3d

    .line 228
    :cond_7c
    const-string v0, "Unexpected MIME type."

    const/4 v1, 0x0

    invoke-static {v0, v1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object v0

    throw v0

    :cond_7d
    :goto_3d
    const/4 v1, 0x3

    .line 229
    :goto_3e
    iget-object v7, v0, LP5/b;->a:Ljava/lang/String;

    if-eqz v7, :cond_7e

    invoke-interface {v3, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7e

    .line 230
    iget-object v3, v0, LP5/b;->a:Ljava/lang/String;

    .line 231
    iput-object v3, v14, LE5/S;->b:Ljava/lang/String;

    .line 232
    :cond_7e
    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v14, LE5/S;->a:Ljava/lang/String;

    .line 233
    iput-object v11, v14, LE5/S;->k:Ljava/lang/String;

    .line 234
    iput v4, v14, LE5/S;->l:I

    .line 235
    iget-object v3, v0, LP5/b;->W:Ljava/lang/String;

    .line 236
    iput-object v3, v14, LE5/S;->c:Ljava/lang/String;

    .line 237
    iput v2, v14, LE5/S;->d:I

    .line 238
    iput-object v5, v14, LE5/S;->m:Ljava/util/List;

    .line 239
    iput-object v6, v14, LE5/S;->h:Ljava/lang/String;

    .line 240
    iget-object v2, v0, LP5/b;->l:LI5/c;

    .line 241
    iput-object v2, v14, LE5/S;->n:LI5/c;

    .line 242
    invoke-virtual {v14}, LE5/S;->a()LE5/T;

    move-result-object v2

    .line 243
    iget v3, v0, LP5/b;->c:I

    move-object/from16 v4, v31

    invoke-virtual {v4, v3, v1}, Lf6/N;->m(II)LJ5/w;

    move-result-object v1

    iput-object v1, v0, LP5/b;->X:LJ5/w;

    .line 244
    check-cast v1, Lf6/U;

    invoke-virtual {v1, v2}, Lf6/U;->a(LE5/T;)V

    .line 245
    iget v1, v0, LP5/b;->c:I

    move-object/from16 v2, v33

    invoke-virtual {v2, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v7, v40

    goto/16 :goto_10

    .line 246
    :goto_3f
    iput-object v1, v7, LP5/c;->u:LP5/b;

    :goto_40
    move-object/from16 v5, v38

    const/4 v14, 0x0

    goto/16 :goto_47

    :cond_7f
    const/4 v1, 0x0

    .line 247
    const-string v0, "CodecId is missing in TrackEntry element"

    invoke-static {v0, v1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object v0

    throw v0

    :cond_80
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    move-object/from16 v49, v3

    move-object v8, v4

    move-object v13, v5

    move-object v2, v10

    move-object/from16 v38, v33

    const/16 v17, 0x19

    const/16 v19, 0xf

    const/16 v23, 0x6

    .line 248
    iget v0, v7, LP5/c;->G:I

    const/4 v11, 0x2

    if-eq v0, v11, :cond_81

    :goto_41
    goto :goto_40

    .line 249
    :cond_81
    iget v0, v7, LP5/c;->M:I

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP5/b;

    .line 250
    iget-object v1, v0, LP5/b;->X:LJ5/w;

    .line 251
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    iget-wide v1, v7, LP5/c;->R:J

    cmp-long v1, v1, v31

    if-lez v1, :cond_82

    iget-object v1, v0, LP5/b;->b:Ljava/lang/String;

    move-object/from16 v5, v38

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_83

    const/16 v27, 0x8

    .line 253
    invoke-static/range {v27 .. v27}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 254
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget-wide v2, v7, LP5/c;->R:J

    .line 255
    invoke-virtual {v1, v2, v3}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 256
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    .line 257
    iget-object v2, v7, LP5/c;->n:LY4/b;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    array-length v3, v1

    invoke-virtual {v2, v3, v1}, LY4/b;->y(I[B)V

    goto :goto_42

    :cond_82
    move-object/from16 v5, v38

    :cond_83
    :goto_42
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 259
    :goto_43
    iget v3, v7, LP5/c;->K:I

    if-ge v1, v3, :cond_84

    .line 260
    iget-object v3, v7, LP5/c;->L:[I

    aget v3, v3, v1

    add-int/2addr v2, v3

    const/16 v37, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_43

    :cond_84
    const/4 v1, 0x0

    .line 261
    :goto_44
    iget v3, v7, LP5/c;->K:I

    if-ge v1, v3, :cond_86

    .line 262
    iget-wide v3, v7, LP5/c;->H:J

    iget v6, v0, LP5/b;->e:I

    mul-int/2addr v6, v1

    const/16 v9, 0x3e8

    div-int/2addr v6, v9

    int-to-long v9, v6

    add-long v42, v3, v9

    .line 263
    iget v3, v7, LP5/c;->O:I

    if-nez v1, :cond_85

    .line 264
    iget-boolean v4, v7, LP5/c;->Q:Z

    if-nez v4, :cond_85

    const/16 v37, 0x1

    or-int/lit8 v3, v3, 0x1

    :goto_45
    move/from16 v44, v3

    goto :goto_46

    :cond_85
    const/16 v37, 0x1

    goto :goto_45

    .line 265
    :goto_46
    iget-object v3, v7, LP5/c;->L:[I

    aget v45, v3, v1

    sub-int v46, v2, v45

    move-object/from16 v41, v0

    move-object/from16 v40, v7

    .line 266
    invoke-virtual/range {v40 .. v46}, LP5/c;->d(LP5/b;JIII)V

    add-int/lit8 v1, v1, 0x1

    move/from16 v2, v46

    goto :goto_44

    :cond_86
    const/4 v14, 0x0

    .line 267
    iput v14, v7, LP5/c;->G:I

    :goto_47
    move-object/from16 v38, v8

    const/4 v11, 0x2

    const/4 v14, 0x3

    :goto_48
    const/16 v20, 0x1

    goto/16 :goto_5e

    :cond_87
    move-object/from16 v47, v1

    move-object/from16 v48, v2

    move-object/from16 v49, v3

    move-object v8, v4

    move-object v13, v5

    move/from16 v14, v22

    move-object/from16 v5, v33

    const/16 v17, 0x19

    const/16 v19, 0xf

    const/16 v23, 0x6

    .line 268
    iget v0, v15, LK2/b;->c:I

    const v1, 0x1f43b675

    iget-object v2, v15, LK2/b;->f:Ljava/lang/Object;

    check-cast v2, LP5/d;

    if-nez v0, :cond_8d

    .line 269
    move-object/from16 v0, p1

    check-cast v0, LJ5/h;

    const/4 v3, 0x4

    const/4 v4, 0x1

    invoke-virtual {v2, v0, v4, v14, v3}, LP5/d;->c(LJ5/h;ZZI)J

    move-result-wide v40

    const-wide/16 v21, -0x2

    cmp-long v4, v40, v21

    if-nez v4, :cond_8b

    .line 270
    invoke-virtual {v0}, LJ5/h;->e()V

    .line 271
    :goto_49
    iget-object v4, v15, LK2/b;->a:[B

    invoke-interface {v0, v14, v3, v4}, LJ5/l;->a(II[B)V

    .line 272
    aget-byte v7, v4, v14

    invoke-static {v7}, LP5/d;->b(I)I

    move-result v7

    const/4 v9, -0x1

    if-eq v7, v9, :cond_8a

    if-gt v7, v3, :cond_8a

    .line 273
    invoke-static {v4, v7, v14}, LP5/d;->a([BIZ)J

    move-result-wide v3

    long-to-int v3, v3

    .line 274
    iget-object v4, v15, LK2/b;->g:Ljava/lang/Object;

    check-cast v4, Lxa/d;

    .line 275
    iget-object v4, v4, Lxa/d;->b:Ljava/lang/Object;

    check-cast v4, LP5/c;

    .line 276
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eq v3, v12, :cond_89

    if-eq v3, v1, :cond_89

    const v9, 0x1c53bb6b

    if-eq v3, v9, :cond_89

    const v9, 0x1654ae6b

    if-ne v3, v9, :cond_88

    goto :goto_4b

    :cond_88
    :goto_4a
    const/4 v4, 0x1

    goto :goto_4d

    .line 277
    :cond_89
    :goto_4b
    invoke-interface {v0, v7}, LJ5/l;->j(I)V

    int-to-long v3, v3

    move-wide v11, v3

    :goto_4c
    const/4 v4, 0x1

    goto :goto_4e

    :cond_8a
    const v9, 0x1654ae6b

    goto :goto_4a

    .line 278
    :goto_4d
    invoke-interface {v0, v4}, LJ5/l;->j(I)V

    const/4 v3, 0x4

    const/16 v9, 0x4dbb

    const/4 v14, 0x0

    goto :goto_49

    :cond_8b
    move-wide/from16 v11, v40

    goto :goto_4c

    :goto_4e
    cmp-long v3, v11, v35

    if-nez v3, :cond_8c

    move-object/from16 v38, v8

    const/4 v11, 0x2

    const/4 v14, 0x3

    const/16 v20, 0x0

    goto/16 :goto_5e

    :cond_8c
    long-to-int v3, v11

    .line 279
    iput v3, v15, LK2/b;->d:I

    .line 280
    iput v4, v15, LK2/b;->c:I

    goto :goto_4f

    :cond_8d
    const/4 v4, 0x1

    .line 281
    :goto_4f
    iget v3, v15, LK2/b;->c:I

    if-ne v3, v4, :cond_8e

    .line 282
    move-object/from16 v3, p1

    check-cast v3, LJ5/h;

    const/16 v7, 0x8

    const/4 v14, 0x0

    invoke-virtual {v2, v3, v14, v4, v7}, LP5/d;->c(LJ5/h;ZZI)J

    move-result-wide v2

    iput-wide v2, v15, LK2/b;->e:J

    const/4 v11, 0x2

    .line 283
    iput v11, v15, LK2/b;->c:I

    goto :goto_50

    :cond_8e
    const/16 v7, 0x8

    .line 284
    :goto_50
    iget-object v2, v15, LK2/b;->g:Ljava/lang/Object;

    check-cast v2, Lxa/d;

    iget v3, v15, LK2/b;->d:I

    .line 285
    iget-object v2, v2, Lxa/d;->b:Ljava/lang/Object;

    check-cast v2, LP5/c;

    .line 286
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sparse-switch v3, :sswitch_data_2

    const/4 v2, 0x0

    goto :goto_51

    :sswitch_42
    const/4 v2, 0x5

    goto :goto_51

    :sswitch_43
    const/4 v2, 0x4

    goto :goto_51

    :sswitch_44
    const/4 v2, 0x1

    goto :goto_51

    :sswitch_45
    const/4 v2, 0x3

    goto :goto_51

    :sswitch_46
    const/4 v2, 0x2

    :goto_51
    if-eqz v2, :cond_b2

    const/4 v4, 0x1

    if-eq v2, v4, :cond_a2

    const-wide/16 v0, 0x8

    const/4 v11, 0x2

    if-eq v2, v11, :cond_a0

    const/4 v14, 0x3

    if-eq v2, v14, :cond_96

    const/4 v3, 0x4

    if-eq v2, v3, :cond_95

    const/4 v3, 0x5

    if-ne v2, v3, :cond_94

    .line 287
    iget-wide v9, v15, LK2/b;->e:J

    const-wide/16 v25, 0x4

    cmp-long v2, v9, v25

    if-eqz v2, :cond_90

    cmp-long v0, v9, v0

    if-nez v0, :cond_8f

    goto :goto_52

    .line 288
    :cond_8f
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid float size: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, v15, LK2/b;->e:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object v0

    throw v0

    .line 289
    :cond_90
    :goto_52
    iget-object v0, v15, LK2/b;->g:Ljava/lang/Object;

    check-cast v0, Lxa/d;

    iget v1, v15, LK2/b;->d:I

    long-to-int v2, v9

    .line 290
    move-object/from16 v4, p1

    check-cast v4, LJ5/h;

    invoke-virtual {v15, v4, v2}, LK2/b;->a(LJ5/h;I)J

    move-result-wide v9

    const/4 v4, 0x4

    if-ne v2, v4, :cond_91

    long-to-int v2, v9

    .line 291
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    float-to-double v9, v2

    goto :goto_53

    .line 292
    :cond_91
    invoke-static {v9, v10}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v9

    .line 293
    :goto_53
    iget-object v0, v0, Lxa/d;->b:Ljava/lang/Object;

    check-cast v0, LP5/c;

    const/16 v2, 0xb5

    if-eq v1, v2, :cond_93

    const/16 v2, 0x4489

    if-eq v1, v2, :cond_92

    packed-switch v1, :pswitch_data_2

    packed-switch v1, :pswitch_data_3

    .line 294
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_54
    const/4 v12, 0x0

    goto/16 :goto_55

    .line 295
    :pswitch_1f
    invoke-virtual {v0, v1}, LP5/c;->c(I)V

    .line 296
    iget-object v0, v0, LP5/c;->u:LP5/b;

    double-to-float v1, v9

    .line 297
    iput v1, v0, LP5/b;->u:F

    goto :goto_54

    .line 298
    :pswitch_20
    invoke-virtual {v0, v1}, LP5/c;->c(I)V

    .line 299
    iget-object v0, v0, LP5/c;->u:LP5/b;

    double-to-float v1, v9

    .line 300
    iput v1, v0, LP5/b;->t:F

    goto :goto_54

    .line 301
    :pswitch_21
    invoke-virtual {v0, v1}, LP5/c;->c(I)V

    .line 302
    iget-object v0, v0, LP5/c;->u:LP5/b;

    double-to-float v1, v9

    .line 303
    iput v1, v0, LP5/b;->s:F

    goto :goto_54

    .line 304
    :pswitch_22
    invoke-virtual {v0, v1}, LP5/c;->c(I)V

    .line 305
    iget-object v0, v0, LP5/c;->u:LP5/b;

    double-to-float v1, v9

    .line 306
    iput v1, v0, LP5/b;->M:F

    goto :goto_54

    .line 307
    :pswitch_23
    invoke-virtual {v0, v1}, LP5/c;->c(I)V

    .line 308
    iget-object v0, v0, LP5/c;->u:LP5/b;

    double-to-float v1, v9

    .line 309
    iput v1, v0, LP5/b;->L:F

    goto :goto_54

    .line 310
    :pswitch_24
    invoke-virtual {v0, v1}, LP5/c;->c(I)V

    .line 311
    iget-object v0, v0, LP5/c;->u:LP5/b;

    double-to-float v1, v9

    .line 312
    iput v1, v0, LP5/b;->K:F

    goto :goto_54

    .line 313
    :pswitch_25
    invoke-virtual {v0, v1}, LP5/c;->c(I)V

    .line 314
    iget-object v0, v0, LP5/c;->u:LP5/b;

    double-to-float v1, v9

    .line 315
    iput v1, v0, LP5/b;->J:F

    goto :goto_54

    .line 316
    :pswitch_26
    invoke-virtual {v0, v1}, LP5/c;->c(I)V

    .line 317
    iget-object v0, v0, LP5/c;->u:LP5/b;

    double-to-float v1, v9

    .line 318
    iput v1, v0, LP5/b;->I:F

    goto :goto_54

    .line 319
    :pswitch_27
    invoke-virtual {v0, v1}, LP5/c;->c(I)V

    .line 320
    iget-object v0, v0, LP5/c;->u:LP5/b;

    double-to-float v1, v9

    .line 321
    iput v1, v0, LP5/b;->H:F

    goto :goto_54

    .line 322
    :pswitch_28
    invoke-virtual {v0, v1}, LP5/c;->c(I)V

    .line 323
    iget-object v0, v0, LP5/c;->u:LP5/b;

    double-to-float v1, v9

    .line 324
    iput v1, v0, LP5/b;->G:F

    goto :goto_54

    .line 325
    :pswitch_29
    invoke-virtual {v0, v1}, LP5/c;->c(I)V

    .line 326
    iget-object v0, v0, LP5/c;->u:LP5/b;

    double-to-float v1, v9

    .line 327
    iput v1, v0, LP5/b;->F:F

    goto :goto_54

    .line 328
    :pswitch_2a
    invoke-virtual {v0, v1}, LP5/c;->c(I)V

    .line 329
    iget-object v0, v0, LP5/c;->u:LP5/b;

    double-to-float v1, v9

    .line 330
    iput v1, v0, LP5/b;->E:F

    goto :goto_54

    .line 331
    :pswitch_2b
    invoke-virtual {v0, v1}, LP5/c;->c(I)V

    .line 332
    iget-object v0, v0, LP5/c;->u:LP5/b;

    double-to-float v1, v9

    .line 333
    iput v1, v0, LP5/b;->D:F

    goto :goto_54

    :cond_92
    double-to-long v1, v9

    .line 334
    iput-wide v1, v0, LP5/c;->s:J

    goto :goto_54

    .line 335
    :cond_93
    invoke-virtual {v0, v1}, LP5/c;->c(I)V

    .line 336
    iget-object v0, v0, LP5/c;->u:LP5/b;

    double-to-int v1, v9

    .line 337
    iput v1, v0, LP5/b;->Q:I

    goto/16 :goto_54

    .line 338
    :goto_55
    iput v12, v15, LK2/b;->c:I

    :goto_56
    move-object/from16 v38, v8

    goto/16 :goto_48

    .line 339
    :cond_94
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid element type "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object v0

    throw v0

    :cond_95
    move v4, v3

    const/4 v3, 0x5

    .line 340
    iget-object v0, v15, LK2/b;->g:Ljava/lang/Object;

    check-cast v0, Lxa/d;

    iget v1, v15, LK2/b;->d:I

    iget-wide v9, v15, LK2/b;->e:J

    long-to-int v2, v9

    move-object/from16 v6, p1

    check-cast v6, LJ5/h;

    invoke-virtual {v0, v1, v2, v6}, Lxa/d;->l(IILJ5/h;)V

    const/4 v12, 0x0

    .line 341
    iput v12, v15, LK2/b;->c:I

    goto :goto_56

    :cond_96
    const/4 v3, 0x5

    const/4 v4, 0x4

    .line 342
    iget-wide v0, v15, LK2/b;->e:J

    const-wide/32 v9, 0x7fffffff

    cmp-long v2, v0, v9

    if-gtz v2, :cond_9f

    .line 343
    iget-object v2, v15, LK2/b;->g:Ljava/lang/Object;

    check-cast v2, Lxa/d;

    iget v6, v15, LK2/b;->d:I

    long-to-int v0, v0

    if-nez v0, :cond_97

    .line 344
    const-string v0, ""

    goto :goto_58

    .line 345
    :cond_97
    new-array v1, v0, [B

    .line 346
    move-object/from16 v9, p1

    check-cast v9, LJ5/h;

    const/4 v12, 0x0

    invoke-virtual {v9, v1, v12, v0}, LJ5/h;->readFully([BII)V

    :goto_57
    if-lez v0, :cond_98

    const/16 v37, 0x1

    add-int/lit8 v9, v0, -0x1

    .line 347
    aget-byte v9, v1, v9

    if-nez v9, :cond_98

    const/16 v29, -0x1

    add-int/lit8 v0, v0, -0x1

    goto :goto_57

    .line 348
    :cond_98
    new-instance v9, Ljava/lang/String;

    invoke-direct {v9, v1, v12, v0}, Ljava/lang/String;-><init>([BII)V

    move-object v0, v9

    .line 349
    :goto_58
    iget-object v1, v2, Lxa/d;->b:Ljava/lang/Object;

    check-cast v1, LP5/c;

    .line 350
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v2, 0x86

    if-eq v6, v2, :cond_9e

    const/16 v2, 0x4282

    if-eq v6, v2, :cond_9c

    const/16 v2, 0x536e

    if-eq v6, v2, :cond_9b

    const v2, 0x22b59c

    if-eq v6, v2, :cond_99

    goto :goto_59

    .line 351
    :cond_99
    invoke-virtual {v1, v6}, LP5/c;->c(I)V

    .line 352
    iget-object v1, v1, LP5/c;->u:LP5/b;

    .line 353
    iput-object v0, v1, LP5/b;->W:Ljava/lang/String;

    :cond_9a
    :goto_59
    const/4 v12, 0x0

    goto :goto_5a

    .line 354
    :cond_9b
    invoke-virtual {v1, v6}, LP5/c;->c(I)V

    .line 355
    iget-object v1, v1, LP5/c;->u:LP5/b;

    .line 356
    iput-object v0, v1, LP5/b;->a:Ljava/lang/String;

    goto :goto_59

    .line 357
    :cond_9c
    const-string v1, "webm"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9a

    const-string v1, "matroska"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9d

    goto :goto_59

    .line 358
    :cond_9d
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "DocType "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not supported"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object v0

    throw v0

    .line 359
    :cond_9e
    invoke-virtual {v1, v6}, LP5/c;->c(I)V

    .line 360
    iget-object v1, v1, LP5/c;->u:LP5/b;

    .line 361
    iput-object v0, v1, LP5/b;->b:Ljava/lang/String;

    goto :goto_59

    .line 362
    :goto_5a
    iput v12, v15, LK2/b;->c:I

    goto/16 :goto_56

    .line 363
    :cond_9f
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "String element size: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, v15, LK2/b;->e:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object v0

    throw v0

    :cond_a0
    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v14, 0x3

    .line 364
    iget-wide v9, v15, LK2/b;->e:J

    cmp-long v0, v9, v0

    if-gtz v0, :cond_a1

    .line 365
    iget-object v0, v15, LK2/b;->g:Ljava/lang/Object;

    check-cast v0, Lxa/d;

    iget v1, v15, LK2/b;->d:I

    long-to-int v2, v9

    move-object/from16 v6, p1

    check-cast v6, LJ5/h;

    invoke-virtual {v15, v6, v2}, LK2/b;->a(LJ5/h;I)J

    move-result-wide v9

    invoke-virtual {v0, v1, v9, v10}, Lxa/d;->x(IJ)V

    const/4 v12, 0x0

    .line 366
    iput v12, v15, LK2/b;->c:I

    goto/16 :goto_56

    .line 367
    :cond_a1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid integer size: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, v15, LK2/b;->e:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object v0

    throw v0

    :cond_a2
    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v11, 0x2

    const/4 v14, 0x3

    .line 368
    move-object/from16 v2, p1

    check-cast v2, LJ5/h;

    invoke-virtual {v2}, LJ5/h;->getPosition()J

    move-result-wide v3

    move-object/from16 v38, v8

    .line 369
    iget-wide v7, v15, LK2/b;->e:J

    add-long/2addr v7, v3

    .line 370
    new-instance v2, LP5/a;

    iget v9, v15, LK2/b;->d:I

    invoke-direct {v2, v9, v7, v8}, LP5/a;-><init>(IJ)V

    invoke-virtual {v10, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 371
    iget-object v2, v15, LK2/b;->g:Ljava/lang/Object;

    check-cast v2, Lxa/d;

    iget v7, v15, LK2/b;->d:I

    iget-wide v8, v15, LK2/b;->e:J

    .line 372
    iget-object v2, v2, Lxa/d;->b:Ljava/lang/Object;

    check-cast v2, LP5/c;

    .line 373
    iget-object v10, v2, LP5/c;->b0:Lf6/N;

    .line 374
    invoke-static {v10}, Lu6/a;->j(Ljava/lang/Object;)V

    if-eq v7, v6, :cond_af

    const/16 v0, 0xae

    if-eq v7, v0, :cond_ae

    const/16 v0, 0xbb

    if-eq v7, v0, :cond_ad

    const/16 v0, 0x4dbb

    if-eq v7, v0, :cond_ac

    const/16 v0, 0x5035

    if-eq v7, v0, :cond_ab

    const/16 v0, 0x55d0

    if-eq v7, v0, :cond_aa

    const v0, 0x18538067

    if-eq v7, v0, :cond_a7

    const v0, 0x1c53bb6b

    if-eq v7, v0, :cond_a6

    if-eq v7, v1, :cond_a4

    :cond_a3
    const/4 v4, 0x1

    goto :goto_5b

    .line 375
    :cond_a4
    iget-boolean v0, v2, LP5/c;->v:Z

    if-nez v0, :cond_a3

    .line 376
    iget-boolean v0, v2, LP5/c;->d:Z

    if-eqz v0, :cond_a5

    iget-wide v0, v2, LP5/c;->z:J

    cmp-long v0, v0, v35

    if-eqz v0, :cond_a5

    const/4 v4, 0x1

    .line 377
    iput-boolean v4, v2, LP5/c;->y:Z

    :goto_5b
    const/4 v12, 0x0

    goto/16 :goto_5d

    :cond_a5
    const/4 v4, 0x1

    .line 378
    iget-object v0, v2, LP5/c;->b0:Lf6/N;

    new-instance v1, LJ5/o;

    iget-wide v6, v2, LP5/c;->t:J

    invoke-direct {v1, v6, v7}, LJ5/o;-><init>(J)V

    invoke-virtual {v0, v1}, Lf6/N;->x(LJ5/t;)V

    .line 379
    iput-boolean v4, v2, LP5/c;->v:Z

    goto :goto_5b

    :cond_a6
    const/4 v4, 0x1

    .line 380
    new-instance v0, LQ1/l;

    const/4 v12, 0x0

    invoke-direct {v0, v12, v4}, LQ1/l;-><init>(BI)V

    iput-object v0, v2, LP5/c;->C:LQ1/l;

    .line 381
    new-instance v0, LQ1/l;

    invoke-direct {v0, v12, v4}, LQ1/l;-><init>(BI)V

    iput-object v0, v2, LP5/c;->D:LQ1/l;

    goto :goto_5b

    .line 382
    :cond_a7
    iget-wide v0, v2, LP5/c;->q:J

    cmp-long v6, v0, v35

    if-eqz v6, :cond_a9

    cmp-long v0, v0, v3

    if-nez v0, :cond_a8

    goto :goto_5c

    .line 383
    :cond_a8
    const-string v0, "Multiple Segment elements not supported"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object v0

    throw v0

    .line 384
    :cond_a9
    :goto_5c
    iput-wide v3, v2, LP5/c;->q:J

    .line 385
    iput-wide v8, v2, LP5/c;->p:J

    goto :goto_5b

    .line 386
    :cond_aa
    invoke-virtual {v2, v7}, LP5/c;->c(I)V

    .line 387
    iget-object v0, v2, LP5/c;->u:LP5/b;

    const/4 v4, 0x1

    .line 388
    iput-boolean v4, v0, LP5/b;->x:Z

    goto :goto_5b

    :cond_ab
    const/4 v4, 0x1

    .line 389
    invoke-virtual {v2, v7}, LP5/c;->c(I)V

    .line 390
    iget-object v0, v2, LP5/c;->u:LP5/b;

    .line 391
    iput-boolean v4, v0, LP5/b;->h:Z

    goto :goto_5b

    :cond_ac
    const/4 v4, -0x1

    .line 392
    iput v4, v2, LP5/c;->w:I

    move-wide/from16 v0, v35

    .line 393
    iput-wide v0, v2, LP5/c;->x:J

    goto :goto_5b

    :cond_ad
    const/4 v4, -0x1

    const/4 v12, 0x0

    .line 394
    iput-boolean v12, v2, LP5/c;->E:Z

    goto :goto_5d

    :cond_ae
    const/4 v4, -0x1

    const/4 v12, 0x0

    .line 395
    new-instance v0, LP5/b;

    .line 396
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 397
    iput v4, v0, LP5/b;->m:I

    .line 398
    iput v4, v0, LP5/b;->n:I

    .line 399
    iput v4, v0, LP5/b;->o:I

    .line 400
    iput v4, v0, LP5/b;->p:I

    .line 401
    iput v12, v0, LP5/b;->q:I

    .line 402
    iput v4, v0, LP5/b;->r:I

    const/4 v1, 0x0

    .line 403
    iput v1, v0, LP5/b;->s:F

    .line 404
    iput v1, v0, LP5/b;->t:F

    .line 405
    iput v1, v0, LP5/b;->u:F

    const/4 v1, 0x0

    .line 406
    iput-object v1, v0, LP5/b;->v:[B

    .line 407
    iput v4, v0, LP5/b;->w:I

    .line 408
    iput-boolean v12, v0, LP5/b;->x:Z

    .line 409
    iput v4, v0, LP5/b;->y:I

    .line 410
    iput v4, v0, LP5/b;->z:I

    .line 411
    iput v4, v0, LP5/b;->A:I

    const/16 v9, 0x3e8

    .line 412
    iput v9, v0, LP5/b;->B:I

    const/16 v1, 0xc8

    .line 413
    iput v1, v0, LP5/b;->C:I

    move/from16 v1, v26

    .line 414
    iput v1, v0, LP5/b;->D:F

    .line 415
    iput v1, v0, LP5/b;->E:F

    .line 416
    iput v1, v0, LP5/b;->F:F

    .line 417
    iput v1, v0, LP5/b;->G:F

    .line 418
    iput v1, v0, LP5/b;->H:F

    .line 419
    iput v1, v0, LP5/b;->I:F

    .line 420
    iput v1, v0, LP5/b;->J:F

    .line 421
    iput v1, v0, LP5/b;->K:F

    .line 422
    iput v1, v0, LP5/b;->L:F

    .line 423
    iput v1, v0, LP5/b;->M:F

    const/4 v4, 0x1

    .line 424
    iput v4, v0, LP5/b;->O:I

    const/4 v7, -0x1

    .line 425
    iput v7, v0, LP5/b;->P:I

    const/16 v1, 0x1f40

    .line 426
    iput v1, v0, LP5/b;->Q:I

    move-wide/from16 v6, v31

    .line 427
    iput-wide v6, v0, LP5/b;->R:J

    .line 428
    iput-wide v6, v0, LP5/b;->S:J

    .line 429
    iput-boolean v4, v0, LP5/b;->V:Z

    .line 430
    const-string v1, "eng"

    iput-object v1, v0, LP5/b;->W:Ljava/lang/String;

    .line 431
    iput-object v0, v2, LP5/c;->u:LP5/b;

    goto/16 :goto_5b

    :cond_af
    move-wide/from16 v6, v31

    const/4 v12, 0x0

    .line 432
    iput-boolean v12, v2, LP5/c;->Q:Z

    .line 433
    iput-wide v6, v2, LP5/c;->R:J

    .line 434
    :goto_5d
    iput v12, v15, LK2/b;->c:I

    goto/16 :goto_48

    :goto_5e
    if-eqz v20, :cond_b0

    .line 435
    move-object/from16 v0, p1

    check-cast v0, LJ5/h;

    invoke-virtual {v0}, LJ5/h;->getPosition()J

    move-result-wide v0

    move-object/from16 v2, p0

    move-object/from16 v3, p2

    invoke-virtual {v2, v3, v0, v1}, LP5/c;->f(LJ5/n;J)Z

    move-result v0

    if-eqz v0, :cond_b1

    const/16 v37, 0x1

    return v37

    :cond_b0
    move-object/from16 v2, p0

    move-object/from16 v3, p2

    :cond_b1
    move-object v0, v2

    move-object v8, v5

    move/from16 v18, v11

    move-object v5, v13

    move-object/from16 v4, v38

    move-object/from16 v1, v47

    move-object/from16 v2, v48

    move-object/from16 v3, v49

    const/4 v10, 0x0

    goto/16 :goto_0

    :cond_b2
    const/4 v11, 0x2

    const/4 v14, 0x3

    move-object/from16 v2, p0

    move-object/from16 v3, p2

    move-object/from16 v38, v8

    .line 436
    iget-wide v0, v15, LK2/b;->e:J

    long-to-int v0, v0

    move-object/from16 v1, p1

    check-cast v1, LJ5/h;

    invoke-virtual {v1, v0}, LJ5/h;->j(I)V

    const/4 v12, 0x0

    .line 437
    iput v12, v15, LK2/b;->c:I

    move-object v0, v2

    move-object v8, v5

    move/from16 v18, v11

    move-object v5, v13

    move-object/from16 v4, v38

    move-object/from16 v1, v47

    move-object/from16 v2, v48

    move-object/from16 v3, v49

    const/16 v22, 0x0

    goto/16 :goto_1

    :cond_b3
    move-object v2, v0

    if-nez v20, :cond_b6

    const/4 v10, 0x0

    .line 438
    :goto_5f
    iget-object v0, v2, LP5/c;->c:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v10, v1, :cond_b5

    .line 439
    invoke-virtual {v0, v10}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP5/b;

    .line 440
    iget-object v1, v0, LP5/b;->X:LJ5/w;

    .line 441
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    iget-object v1, v0, LP5/b;->T:LJ5/x;

    if-eqz v1, :cond_b4

    .line 443
    iget-object v3, v0, LP5/b;->X:LJ5/w;

    iget-object v0, v0, LP5/b;->j:LJ5/v;

    invoke-virtual {v1, v3, v0}, LJ5/x;->a(LJ5/w;LJ5/v;)V

    :cond_b4
    const/16 v37, 0x1

    add-int/lit8 v10, v10, 0x1

    goto :goto_5f

    :cond_b5
    const/16 v29, -0x1

    return v29

    :cond_b6
    const/16 v22, 0x0

    return v22

    :sswitch_data_0
    .sparse-switch
        -0x7ce7f5de -> :sswitch_20
        -0x7ce7f3b0 -> :sswitch_1f
        -0x76567dc0 -> :sswitch_1e
        -0x6a615338 -> :sswitch_1d
        -0x672350af -> :sswitch_1c
        -0x585f4fce -> :sswitch_1b
        -0x585f4fcd -> :sswitch_1a
        -0x51dc40b2 -> :sswitch_19
        -0x37a9c464 -> :sswitch_18
        -0x2016c535 -> :sswitch_17
        -0x2016c4e5 -> :sswitch_16
        -0x19552dbd -> :sswitch_15
        -0x1538b2ba -> :sswitch_14
        0x3c02325 -> :sswitch_13
        0x3c02353 -> :sswitch_12
        0x3c030c5 -> :sswitch_11
        0x4e81333 -> :sswitch_10
        0x4e86155 -> :sswitch_f
        0x4e86156 -> :sswitch_e
        0x5e8da3e -> :sswitch_d
        0x1a8350d6 -> :sswitch_c
        0x2056f406 -> :sswitch_b
        0x25e26ee2 -> :sswitch_a
        0x2b45174d -> :sswitch_9
        0x2b453ce4 -> :sswitch_8
        0x2c0618eb -> :sswitch_7
        0x32fdf009 -> :sswitch_6
        0x3e4ca2d8 -> :sswitch_5
        0x54c61e47 -> :sswitch_4
        0x6bd6c624 -> :sswitch_3
        0x7446132a -> :sswitch_2
        0x7446b0a6 -> :sswitch_1
        0x744ad97d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x7ce7f5de -> :sswitch_41
        -0x7ce7f3b0 -> :sswitch_40
        -0x76567dc0 -> :sswitch_3f
        -0x6a615338 -> :sswitch_3e
        -0x672350af -> :sswitch_3d
        -0x585f4fce -> :sswitch_3c
        -0x585f4fcd -> :sswitch_3b
        -0x51dc40b2 -> :sswitch_3a
        -0x37a9c464 -> :sswitch_39
        -0x2016c535 -> :sswitch_38
        -0x2016c4e5 -> :sswitch_37
        -0x19552dbd -> :sswitch_36
        -0x1538b2ba -> :sswitch_35
        0x3c02325 -> :sswitch_34
        0x3c02353 -> :sswitch_33
        0x3c030c5 -> :sswitch_32
        0x4e81333 -> :sswitch_31
        0x4e86155 -> :sswitch_30
        0x4e86156 -> :sswitch_2f
        0x5e8da3e -> :sswitch_2e
        0x1a8350d6 -> :sswitch_2d
        0x2056f406 -> :sswitch_2c
        0x25e26ee2 -> :sswitch_2b
        0x2b45174d -> :sswitch_2a
        0x2b453ce4 -> :sswitch_29
        0x2c0618eb -> :sswitch_28
        0x32fdf009 -> :sswitch_27
        0x3e4ca2d8 -> :sswitch_26
        0x54c61e47 -> :sswitch_25
        0x6bd6c624 -> :sswitch_24
        0x7446132a -> :sswitch_23
        0x7446b0a6 -> :sswitch_22
        0x744ad97d -> :sswitch_21
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1e
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_1e
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_11
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        0x83 -> :sswitch_46
        0x86 -> :sswitch_45
        0x88 -> :sswitch_46
        0x9b -> :sswitch_46
        0x9f -> :sswitch_46
        0xa0 -> :sswitch_44
        0xa1 -> :sswitch_43
        0xa3 -> :sswitch_43
        0xa5 -> :sswitch_43
        0xa6 -> :sswitch_44
        0xae -> :sswitch_44
        0xb0 -> :sswitch_46
        0xb3 -> :sswitch_46
        0xb5 -> :sswitch_42
        0xb7 -> :sswitch_44
        0xba -> :sswitch_46
        0xbb -> :sswitch_44
        0xd7 -> :sswitch_46
        0xe0 -> :sswitch_44
        0xe1 -> :sswitch_44
        0xe7 -> :sswitch_46
        0xee -> :sswitch_46
        0xf1 -> :sswitch_46
        0xfb -> :sswitch_46
        0x41e4 -> :sswitch_44
        0x41e7 -> :sswitch_46
        0x41ed -> :sswitch_43
        0x4254 -> :sswitch_46
        0x4255 -> :sswitch_43
        0x4282 -> :sswitch_45
        0x4285 -> :sswitch_46
        0x42f7 -> :sswitch_46
        0x4489 -> :sswitch_42
        0x47e1 -> :sswitch_46
        0x47e2 -> :sswitch_43
        0x47e7 -> :sswitch_44
        0x47e8 -> :sswitch_46
        0x4dbb -> :sswitch_44
        0x5031 -> :sswitch_46
        0x5032 -> :sswitch_46
        0x5034 -> :sswitch_44
        0x5035 -> :sswitch_44
        0x536e -> :sswitch_45
        0x53ab -> :sswitch_43
        0x53ac -> :sswitch_46
        0x53b8 -> :sswitch_46
        0x54b0 -> :sswitch_46
        0x54b2 -> :sswitch_46
        0x54ba -> :sswitch_46
        0x55aa -> :sswitch_46
        0x55b0 -> :sswitch_44
        0x55b9 -> :sswitch_46
        0x55ba -> :sswitch_46
        0x55bb -> :sswitch_46
        0x55bc -> :sswitch_46
        0x55bd -> :sswitch_46
        0x55d0 -> :sswitch_44
        0x55d1 -> :sswitch_42
        0x55d2 -> :sswitch_42
        0x55d3 -> :sswitch_42
        0x55d4 -> :sswitch_42
        0x55d5 -> :sswitch_42
        0x55d6 -> :sswitch_42
        0x55d7 -> :sswitch_42
        0x55d8 -> :sswitch_42
        0x55d9 -> :sswitch_42
        0x55da -> :sswitch_42
        0x55ee -> :sswitch_46
        0x56aa -> :sswitch_46
        0x56bb -> :sswitch_46
        0x6240 -> :sswitch_44
        0x6264 -> :sswitch_46
        0x63a2 -> :sswitch_43
        0x6d80 -> :sswitch_44
        0x75a1 -> :sswitch_44
        0x75a2 -> :sswitch_46
        0x7670 -> :sswitch_44
        0x7671 -> :sswitch_46
        0x7672 -> :sswitch_43
        0x7673 -> :sswitch_42
        0x7674 -> :sswitch_42
        0x7675 -> :sswitch_42
        0x22b59c -> :sswitch_45
        0x23e383 -> :sswitch_46
        0x2ad7b1 -> :sswitch_46
        0x114d9b74 -> :sswitch_44
        0x1549a966 -> :sswitch_44
        0x1654ae6b -> :sswitch_44
        0x18538067 -> :sswitch_44
        0x1a45dfa3 -> :sswitch_44
        0x1c53bb6b -> :sswitch_44
        0x1f43b675 -> :sswitch_44
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x55d1
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x7673
        :pswitch_21
        :pswitch_20
        :pswitch_1f
    .end packed-switch
.end method

.method public final h(Lf6/N;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP5/c;->b0:Lf6/N;

    .line 2
    .line 3
    return-void
.end method

.method public final i(LJ5/l;)Z
    .locals 16

    .line 1
    new-instance v0, LA/x;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v2, v1}, LA/x;-><init>(BI)V

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, LJ5/h;

    .line 11
    .line 12
    const-wide/16 v2, -0x1

    .line 13
    .line 14
    iget-wide v4, v1, LJ5/h;->c:J

    .line 15
    .line 16
    cmp-long v2, v4, v2

    .line 17
    .line 18
    const-wide/16 v6, 0x400

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    cmp-long v3, v4, v6

    .line 23
    .line 24
    if-lez v3, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-wide v6, v4

    .line 28
    :cond_1
    :goto_0
    long-to-int v3, v6

    .line 29
    iget-object v6, v0, LA/x;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v6, LY4/b;

    .line 32
    .line 33
    iget-object v7, v6, LY4/b;->a:[B

    .line 34
    .line 35
    const/4 v8, 0x0

    .line 36
    const/4 v9, 0x4

    .line 37
    invoke-virtual {v1, v7, v8, v9, v8}, LJ5/h;->c([BIIZ)Z

    .line 38
    .line 39
    .line 40
    invoke-virtual {v6}, LY4/b;->r()J

    .line 41
    .line 42
    .line 43
    move-result-wide v10

    .line 44
    iput v9, v0, LA/x;->b:I

    .line 45
    .line 46
    :goto_1
    const-wide/32 v12, 0x1a45dfa3

    .line 47
    .line 48
    .line 49
    cmp-long v7, v10, v12

    .line 50
    .line 51
    const/4 v9, 0x1

    .line 52
    if-eqz v7, :cond_3

    .line 53
    .line 54
    iget v7, v0, LA/x;->b:I

    .line 55
    .line 56
    add-int/2addr v7, v9

    .line 57
    iput v7, v0, LA/x;->b:I

    .line 58
    .line 59
    if-ne v7, v3, :cond_2

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_2
    iget-object v7, v6, LY4/b;->a:[B

    .line 63
    .line 64
    invoke-virtual {v1, v7, v8, v9, v8}, LJ5/h;->c([BIIZ)Z

    .line 65
    .line 66
    .line 67
    const/16 v7, 0x8

    .line 68
    .line 69
    shl-long v9, v10, v7

    .line 70
    .line 71
    const-wide/16 v11, -0x100

    .line 72
    .line 73
    and-long/2addr v9, v11

    .line 74
    iget-object v7, v6, LY4/b;->a:[B

    .line 75
    .line 76
    aget-byte v7, v7, v8

    .line 77
    .line 78
    and-int/lit16 v7, v7, 0xff

    .line 79
    .line 80
    int-to-long v11, v7

    .line 81
    or-long/2addr v9, v11

    .line 82
    move-wide v10, v9

    .line 83
    goto :goto_1

    .line 84
    :cond_3
    invoke-virtual {v0, v1}, LA/x;->w(LJ5/h;)J

    .line 85
    .line 86
    .line 87
    move-result-wide v6

    .line 88
    iget v3, v0, LA/x;->b:I

    .line 89
    .line 90
    int-to-long v10, v3

    .line 91
    const-wide/high16 v12, -0x8000000000000000L

    .line 92
    .line 93
    cmp-long v3, v6, v12

    .line 94
    .line 95
    if-eqz v3, :cond_8

    .line 96
    .line 97
    if-eqz v2, :cond_4

    .line 98
    .line 99
    add-long v2, v10, v6

    .line 100
    .line 101
    cmp-long v2, v2, v4

    .line 102
    .line 103
    if-ltz v2, :cond_4

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_4
    :goto_2
    iget v2, v0, LA/x;->b:I

    .line 107
    .line 108
    int-to-long v2, v2

    .line 109
    add-long v4, v10, v6

    .line 110
    .line 111
    cmp-long v2, v2, v4

    .line 112
    .line 113
    if-gez v2, :cond_7

    .line 114
    .line 115
    invoke-virtual {v0, v1}, LA/x;->w(LJ5/h;)J

    .line 116
    .line 117
    .line 118
    move-result-wide v2

    .line 119
    cmp-long v2, v2, v12

    .line 120
    .line 121
    if-nez v2, :cond_5

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_5
    invoke-virtual {v0, v1}, LA/x;->w(LJ5/h;)J

    .line 125
    .line 126
    .line 127
    move-result-wide v2

    .line 128
    const-wide/16 v4, 0x0

    .line 129
    .line 130
    cmp-long v4, v2, v4

    .line 131
    .line 132
    if-ltz v4, :cond_8

    .line 133
    .line 134
    const-wide/32 v14, 0x7fffffff

    .line 135
    .line 136
    .line 137
    cmp-long v5, v2, v14

    .line 138
    .line 139
    if-lez v5, :cond_6

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_6
    if-eqz v4, :cond_4

    .line 143
    .line 144
    long-to-int v2, v2

    .line 145
    invoke-virtual {v1, v2, v8}, LJ5/h;->b(IZ)Z

    .line 146
    .line 147
    .line 148
    iget v3, v0, LA/x;->b:I

    .line 149
    .line 150
    add-int/2addr v3, v2

    .line 151
    iput v3, v0, LA/x;->b:I

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_7
    if-nez v2, :cond_8

    .line 155
    .line 156
    return v9

    .line 157
    :cond_8
    :goto_3
    return v8
.end method

.method public final j(LJ5/h;I)V
    .locals 5

    .line 1
    iget-object v0, p0, LP5/c;->g:LY4/b;

    .line 2
    .line 3
    iget v1, v0, LY4/b;->c:I

    .line 4
    .line 5
    if-lt v1, p2, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v1, v0, LY4/b;->a:[B

    .line 9
    .line 10
    array-length v2, v1

    .line 11
    if-ge v2, p2, :cond_1

    .line 12
    .line 13
    array-length v1, v1

    .line 14
    mul-int/lit8 v1, v1, 0x2

    .line 15
    .line 16
    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {v0, v1}, LY4/b;->b(I)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-object v1, v0, LY4/b;->a:[B

    .line 24
    .line 25
    iget v2, v0, LY4/b;->c:I

    .line 26
    .line 27
    sub-int v3, p2, v2

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    invoke-virtual {p1, v1, v2, v3, v4}, LJ5/h;->f([BIIZ)Z

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p2}, LY4/b;->z(I)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final k()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LP5/c;->S:I

    .line 3
    .line 4
    iput v0, p0, LP5/c;->T:I

    .line 5
    .line 6
    iput v0, p0, LP5/c;->U:I

    .line 7
    .line 8
    iput-boolean v0, p0, LP5/c;->V:Z

    .line 9
    .line 10
    iput-boolean v0, p0, LP5/c;->W:Z

    .line 11
    .line 12
    iput-boolean v0, p0, LP5/c;->X:Z

    .line 13
    .line 14
    iput v0, p0, LP5/c;->Y:I

    .line 15
    .line 16
    iput-byte v0, p0, LP5/c;->Z:B

    .line 17
    .line 18
    iput-boolean v0, p0, LP5/c;->a0:Z

    .line 19
    .line 20
    iget-object v1, p0, LP5/c;->j:LY4/b;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, LY4/b;->x(I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final l(J)J
    .locals 6

    .line 1
    iget-wide v2, p0, LP5/c;->r:J

    .line 2
    .line 3
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v0, v2, v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-wide/16 v4, 0x3e8

    .line 13
    .line 14
    move-wide v0, p1

    .line 15
    invoke-static/range {v0 .. v5}, Lu6/v;->D(JJJ)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    return-wide p1

    .line 20
    :cond_0
    const-string p1, "Can\'t scale timecode prior to timecodeScale being set."

    .line 21
    .line 22
    const/4 p2, 0x0

    .line 23
    invoke-static {p1, p2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    throw p1
.end method

.method public final m(LJ5/h;LP5/b;IZ)I
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    iget-object v4, v2, LP5/b;->b:Ljava/lang/String;

    .line 10
    .line 11
    const-string v5, "S_TEXT/UTF8"

    .line 12
    .line 13
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    sget-object v2, LP5/c;->c0:[B

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2, v3}, LP5/c;->n(LJ5/h;[BI)V

    .line 22
    .line 23
    .line 24
    iget v1, v0, LP5/c;->T:I

    .line 25
    .line 26
    invoke-virtual {v0}, LP5/c;->k()V

    .line 27
    .line 28
    .line 29
    return v1

    .line 30
    :cond_0
    const-string v4, "S_TEXT/ASS"

    .line 31
    .line 32
    iget-object v5, v2, LP5/b;->b:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    sget-object v2, LP5/c;->e0:[B

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2, v3}, LP5/c;->n(LJ5/h;[BI)V

    .line 43
    .line 44
    .line 45
    iget v1, v0, LP5/c;->T:I

    .line 46
    .line 47
    invoke-virtual {v0}, LP5/c;->k()V

    .line 48
    .line 49
    .line 50
    return v1

    .line 51
    :cond_1
    const-string v4, "S_TEXT/WEBVTT"

    .line 52
    .line 53
    iget-object v5, v2, LP5/b;->b:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_2

    .line 60
    .line 61
    sget-object v2, LP5/c;->f0:[B

    .line 62
    .line 63
    invoke-virtual {v0, v1, v2, v3}, LP5/c;->n(LJ5/h;[BI)V

    .line 64
    .line 65
    .line 66
    iget v1, v0, LP5/c;->T:I

    .line 67
    .line 68
    invoke-virtual {v0}, LP5/c;->k()V

    .line 69
    .line 70
    .line 71
    return v1

    .line 72
    :cond_2
    iget-object v4, v2, LP5/b;->X:LJ5/w;

    .line 73
    .line 74
    iget-boolean v5, v0, LP5/c;->V:Z

    .line 75
    .line 76
    const/4 v6, 0x2

    .line 77
    const/4 v7, 0x4

    .line 78
    const/4 v8, 0x1

    .line 79
    iget-object v9, v0, LP5/c;->j:LY4/b;

    .line 80
    .line 81
    const/4 v10, 0x0

    .line 82
    if-nez v5, :cond_13

    .line 83
    .line 84
    iget-boolean v5, v2, LP5/b;->h:Z

    .line 85
    .line 86
    iget-object v11, v0, LP5/c;->g:LY4/b;

    .line 87
    .line 88
    if-eqz v5, :cond_e

    .line 89
    .line 90
    iget v5, v0, LP5/c;->O:I

    .line 91
    .line 92
    const v12, -0x40000001    # -1.9999999f

    .line 93
    .line 94
    .line 95
    and-int/2addr v5, v12

    .line 96
    iput v5, v0, LP5/c;->O:I

    .line 97
    .line 98
    iget-boolean v5, v0, LP5/c;->W:Z

    .line 99
    .line 100
    const/16 v12, 0x80

    .line 101
    .line 102
    if-nez v5, :cond_4

    .line 103
    .line 104
    iget-object v5, v11, LY4/b;->a:[B

    .line 105
    .line 106
    invoke-virtual {v1, v5, v10, v8, v10}, LJ5/h;->f([BIIZ)Z

    .line 107
    .line 108
    .line 109
    iget v5, v0, LP5/c;->S:I

    .line 110
    .line 111
    add-int/2addr v5, v8

    .line 112
    iput v5, v0, LP5/c;->S:I

    .line 113
    .line 114
    iget-object v5, v11, LY4/b;->a:[B

    .line 115
    .line 116
    aget-byte v5, v5, v10

    .line 117
    .line 118
    and-int/lit16 v13, v5, 0x80

    .line 119
    .line 120
    if-eq v13, v12, :cond_3

    .line 121
    .line 122
    iput-byte v5, v0, LP5/c;->Z:B

    .line 123
    .line 124
    iput-boolean v8, v0, LP5/c;->W:Z

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_3
    const-string v1, "Extension bit is set in signal byte"

    .line 128
    .line 129
    const/4 v2, 0x0

    .line 130
    invoke-static {v1, v2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    throw v1

    .line 135
    :cond_4
    :goto_0
    iget-byte v5, v0, LP5/c;->Z:B

    .line 136
    .line 137
    and-int/lit8 v13, v5, 0x1

    .line 138
    .line 139
    if-ne v13, v8, :cond_f

    .line 140
    .line 141
    and-int/2addr v5, v6

    .line 142
    if-ne v5, v6, :cond_5

    .line 143
    .line 144
    move v5, v8

    .line 145
    goto :goto_1

    .line 146
    :cond_5
    move v5, v10

    .line 147
    :goto_1
    iget v13, v0, LP5/c;->O:I

    .line 148
    .line 149
    const/high16 v14, 0x40000000    # 2.0f

    .line 150
    .line 151
    or-int/2addr v13, v14

    .line 152
    iput v13, v0, LP5/c;->O:I

    .line 153
    .line 154
    iget-boolean v13, v0, LP5/c;->a0:Z

    .line 155
    .line 156
    if-nez v13, :cond_7

    .line 157
    .line 158
    iget-object v13, v0, LP5/c;->l:LY4/b;

    .line 159
    .line 160
    iget-object v14, v13, LY4/b;->a:[B

    .line 161
    .line 162
    const/16 v15, 0x8

    .line 163
    .line 164
    invoke-virtual {v1, v14, v10, v15, v10}, LJ5/h;->f([BIIZ)Z

    .line 165
    .line 166
    .line 167
    iget v14, v0, LP5/c;->S:I

    .line 168
    .line 169
    add-int/2addr v14, v15

    .line 170
    iput v14, v0, LP5/c;->S:I

    .line 171
    .line 172
    iput-boolean v8, v0, LP5/c;->a0:Z

    .line 173
    .line 174
    iget-object v14, v11, LY4/b;->a:[B

    .line 175
    .line 176
    if-eqz v5, :cond_6

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_6
    move v12, v10

    .line 180
    :goto_2
    or-int/2addr v12, v15

    .line 181
    int-to-byte v12, v12

    .line 182
    aput-byte v12, v14, v10

    .line 183
    .line 184
    invoke-virtual {v11, v10}, LY4/b;->A(I)V

    .line 185
    .line 186
    .line 187
    invoke-interface {v4, v8, v11}, LJ5/w;->e(ILY4/b;)V

    .line 188
    .line 189
    .line 190
    iget v12, v0, LP5/c;->T:I

    .line 191
    .line 192
    add-int/2addr v12, v8

    .line 193
    iput v12, v0, LP5/c;->T:I

    .line 194
    .line 195
    invoke-virtual {v13, v10}, LY4/b;->A(I)V

    .line 196
    .line 197
    .line 198
    invoke-interface {v4, v15, v13}, LJ5/w;->e(ILY4/b;)V

    .line 199
    .line 200
    .line 201
    iget v12, v0, LP5/c;->T:I

    .line 202
    .line 203
    add-int/2addr v12, v15

    .line 204
    iput v12, v0, LP5/c;->T:I

    .line 205
    .line 206
    :cond_7
    if-eqz v5, :cond_f

    .line 207
    .line 208
    iget-boolean v5, v0, LP5/c;->X:Z

    .line 209
    .line 210
    if-nez v5, :cond_8

    .line 211
    .line 212
    iget-object v5, v11, LY4/b;->a:[B

    .line 213
    .line 214
    invoke-virtual {v1, v5, v10, v8, v10}, LJ5/h;->f([BIIZ)Z

    .line 215
    .line 216
    .line 217
    iget v5, v0, LP5/c;->S:I

    .line 218
    .line 219
    add-int/2addr v5, v8

    .line 220
    iput v5, v0, LP5/c;->S:I

    .line 221
    .line 222
    invoke-virtual {v11, v10}, LY4/b;->A(I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v11}, LY4/b;->q()I

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    iput v5, v0, LP5/c;->Y:I

    .line 230
    .line 231
    iput-boolean v8, v0, LP5/c;->X:Z

    .line 232
    .line 233
    :cond_8
    iget v5, v0, LP5/c;->Y:I

    .line 234
    .line 235
    mul-int/2addr v5, v7

    .line 236
    invoke-virtual {v11, v5}, LY4/b;->x(I)V

    .line 237
    .line 238
    .line 239
    iget-object v12, v11, LY4/b;->a:[B

    .line 240
    .line 241
    invoke-virtual {v1, v12, v10, v5, v10}, LJ5/h;->f([BIIZ)Z

    .line 242
    .line 243
    .line 244
    iget v12, v0, LP5/c;->S:I

    .line 245
    .line 246
    add-int/2addr v12, v5

    .line 247
    iput v12, v0, LP5/c;->S:I

    .line 248
    .line 249
    iget v5, v0, LP5/c;->Y:I

    .line 250
    .line 251
    div-int/2addr v5, v6

    .line 252
    add-int/2addr v5, v8

    .line 253
    int-to-short v5, v5

    .line 254
    mul-int/lit8 v12, v5, 0x6

    .line 255
    .line 256
    add-int/2addr v12, v6

    .line 257
    iget-object v13, v0, LP5/c;->o:Ljava/nio/ByteBuffer;

    .line 258
    .line 259
    if-eqz v13, :cond_9

    .line 260
    .line 261
    invoke-virtual {v13}, Ljava/nio/Buffer;->capacity()I

    .line 262
    .line 263
    .line 264
    move-result v13

    .line 265
    if-ge v13, v12, :cond_a

    .line 266
    .line 267
    :cond_9
    invoke-static {v12}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 268
    .line 269
    .line 270
    move-result-object v13

    .line 271
    iput-object v13, v0, LP5/c;->o:Ljava/nio/ByteBuffer;

    .line 272
    .line 273
    :cond_a
    iget-object v13, v0, LP5/c;->o:Ljava/nio/ByteBuffer;

    .line 274
    .line 275
    invoke-virtual {v13, v10}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 276
    .line 277
    .line 278
    iget-object v13, v0, LP5/c;->o:Ljava/nio/ByteBuffer;

    .line 279
    .line 280
    invoke-virtual {v13, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 281
    .line 282
    .line 283
    move v5, v10

    .line 284
    move v13, v5

    .line 285
    :goto_3
    iget v14, v0, LP5/c;->Y:I

    .line 286
    .line 287
    if-ge v5, v14, :cond_c

    .line 288
    .line 289
    invoke-virtual {v11}, LY4/b;->t()I

    .line 290
    .line 291
    .line 292
    move-result v14

    .line 293
    rem-int/lit8 v15, v5, 0x2

    .line 294
    .line 295
    if-nez v15, :cond_b

    .line 296
    .line 297
    iget-object v15, v0, LP5/c;->o:Ljava/nio/ByteBuffer;

    .line 298
    .line 299
    sub-int v13, v14, v13

    .line 300
    .line 301
    int-to-short v13, v13

    .line 302
    invoke-virtual {v15, v13}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 303
    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_b
    iget-object v15, v0, LP5/c;->o:Ljava/nio/ByteBuffer;

    .line 307
    .line 308
    sub-int v13, v14, v13

    .line 309
    .line 310
    invoke-virtual {v15, v13}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 311
    .line 312
    .line 313
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 314
    .line 315
    move v13, v14

    .line 316
    goto :goto_3

    .line 317
    :cond_c
    iget v5, v0, LP5/c;->S:I

    .line 318
    .line 319
    sub-int v5, v3, v5

    .line 320
    .line 321
    sub-int/2addr v5, v13

    .line 322
    rem-int/2addr v14, v6

    .line 323
    if-ne v14, v8, :cond_d

    .line 324
    .line 325
    iget-object v13, v0, LP5/c;->o:Ljava/nio/ByteBuffer;

    .line 326
    .line 327
    invoke-virtual {v13, v5}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 328
    .line 329
    .line 330
    goto :goto_5

    .line 331
    :cond_d
    iget-object v13, v0, LP5/c;->o:Ljava/nio/ByteBuffer;

    .line 332
    .line 333
    int-to-short v5, v5

    .line 334
    invoke-virtual {v13, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 335
    .line 336
    .line 337
    iget-object v5, v0, LP5/c;->o:Ljava/nio/ByteBuffer;

    .line 338
    .line 339
    invoke-virtual {v5, v10}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 340
    .line 341
    .line 342
    :goto_5
    iget-object v5, v0, LP5/c;->o:Ljava/nio/ByteBuffer;

    .line 343
    .line 344
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    .line 345
    .line 346
    .line 347
    move-result-object v5

    .line 348
    iget-object v13, v0, LP5/c;->m:LY4/b;

    .line 349
    .line 350
    invoke-virtual {v13, v12, v5}, LY4/b;->y(I[B)V

    .line 351
    .line 352
    .line 353
    invoke-interface {v4, v12, v13}, LJ5/w;->e(ILY4/b;)V

    .line 354
    .line 355
    .line 356
    iget v5, v0, LP5/c;->T:I

    .line 357
    .line 358
    add-int/2addr v5, v12

    .line 359
    iput v5, v0, LP5/c;->T:I

    .line 360
    .line 361
    goto :goto_6

    .line 362
    :cond_e
    iget-object v5, v2, LP5/b;->i:[B

    .line 363
    .line 364
    if-eqz v5, :cond_f

    .line 365
    .line 366
    array-length v12, v5

    .line 367
    invoke-virtual {v9, v12, v5}, LY4/b;->y(I[B)V

    .line 368
    .line 369
    .line 370
    :cond_f
    :goto_6
    iget-object v5, v2, LP5/b;->b:Ljava/lang/String;

    .line 371
    .line 372
    const-string v12, "A_OPUS"

    .line 373
    .line 374
    invoke-virtual {v12, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v5

    .line 378
    if-eqz v5, :cond_10

    .line 379
    .line 380
    move/from16 v5, p4

    .line 381
    .line 382
    goto :goto_7

    .line 383
    :cond_10
    iget v5, v2, LP5/b;->f:I

    .line 384
    .line 385
    if-lez v5, :cond_11

    .line 386
    .line 387
    move v5, v8

    .line 388
    goto :goto_7

    .line 389
    :cond_11
    move v5, v10

    .line 390
    :goto_7
    if-eqz v5, :cond_12

    .line 391
    .line 392
    iget v5, v0, LP5/c;->O:I

    .line 393
    .line 394
    const/high16 v12, 0x10000000

    .line 395
    .line 396
    or-int/2addr v5, v12

    .line 397
    iput v5, v0, LP5/c;->O:I

    .line 398
    .line 399
    iget-object v5, v0, LP5/c;->n:LY4/b;

    .line 400
    .line 401
    invoke-virtual {v5, v10}, LY4/b;->x(I)V

    .line 402
    .line 403
    .line 404
    iget v5, v9, LY4/b;->c:I

    .line 405
    .line 406
    add-int/2addr v5, v3

    .line 407
    iget v12, v0, LP5/c;->S:I

    .line 408
    .line 409
    sub-int/2addr v5, v12

    .line 410
    invoke-virtual {v11, v7}, LY4/b;->x(I)V

    .line 411
    .line 412
    .line 413
    iget-object v12, v11, LY4/b;->a:[B

    .line 414
    .line 415
    shr-int/lit8 v13, v5, 0x18

    .line 416
    .line 417
    and-int/lit16 v13, v13, 0xff

    .line 418
    .line 419
    int-to-byte v13, v13

    .line 420
    aput-byte v13, v12, v10

    .line 421
    .line 422
    shr-int/lit8 v13, v5, 0x10

    .line 423
    .line 424
    and-int/lit16 v13, v13, 0xff

    .line 425
    .line 426
    int-to-byte v13, v13

    .line 427
    aput-byte v13, v12, v8

    .line 428
    .line 429
    shr-int/lit8 v13, v5, 0x8

    .line 430
    .line 431
    and-int/lit16 v13, v13, 0xff

    .line 432
    .line 433
    int-to-byte v13, v13

    .line 434
    aput-byte v13, v12, v6

    .line 435
    .line 436
    and-int/lit16 v5, v5, 0xff

    .line 437
    .line 438
    int-to-byte v5, v5

    .line 439
    const/4 v13, 0x3

    .line 440
    aput-byte v5, v12, v13

    .line 441
    .line 442
    invoke-interface {v4, v7, v11}, LJ5/w;->e(ILY4/b;)V

    .line 443
    .line 444
    .line 445
    iget v5, v0, LP5/c;->T:I

    .line 446
    .line 447
    add-int/2addr v5, v7

    .line 448
    iput v5, v0, LP5/c;->T:I

    .line 449
    .line 450
    :cond_12
    iput-boolean v8, v0, LP5/c;->V:Z

    .line 451
    .line 452
    :cond_13
    iget v5, v9, LY4/b;->c:I

    .line 453
    .line 454
    add-int/2addr v3, v5

    .line 455
    const-string v5, "V_MPEG4/ISO/AVC"

    .line 456
    .line 457
    iget-object v11, v2, LP5/b;->b:Ljava/lang/String;

    .line 458
    .line 459
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v5

    .line 463
    if-nez v5, :cond_18

    .line 464
    .line 465
    const-string v5, "V_MPEGH/ISO/HEVC"

    .line 466
    .line 467
    iget-object v11, v2, LP5/b;->b:Ljava/lang/String;

    .line 468
    .line 469
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result v5

    .line 473
    if-eqz v5, :cond_14

    .line 474
    .line 475
    goto :goto_b

    .line 476
    :cond_14
    iget-object v5, v2, LP5/b;->T:LJ5/x;

    .line 477
    .line 478
    if-eqz v5, :cond_16

    .line 479
    .line 480
    iget v5, v9, LY4/b;->c:I

    .line 481
    .line 482
    if-nez v5, :cond_15

    .line 483
    .line 484
    goto :goto_8

    .line 485
    :cond_15
    move v8, v10

    .line 486
    :goto_8
    invoke-static {v8}, Lu6/a;->i(Z)V

    .line 487
    .line 488
    .line 489
    iget-object v5, v2, LP5/b;->T:LJ5/x;

    .line 490
    .line 491
    invoke-virtual {v5, v1}, LJ5/x;->e(LJ5/l;)V

    .line 492
    .line 493
    .line 494
    :cond_16
    :goto_9
    iget v5, v0, LP5/c;->S:I

    .line 495
    .line 496
    if-ge v5, v3, :cond_1c

    .line 497
    .line 498
    sub-int v5, v3, v5

    .line 499
    .line 500
    invoke-virtual {v9}, LY4/b;->a()I

    .line 501
    .line 502
    .line 503
    move-result v6

    .line 504
    if-lez v6, :cond_17

    .line 505
    .line 506
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 507
    .line 508
    .line 509
    move-result v5

    .line 510
    invoke-interface {v4, v5, v9}, LJ5/w;->c(ILY4/b;)V

    .line 511
    .line 512
    .line 513
    goto :goto_a

    .line 514
    :cond_17
    invoke-interface {v4, v1, v5, v10}, LJ5/w;->d(Lt6/i;IZ)I

    .line 515
    .line 516
    .line 517
    move-result v5

    .line 518
    :goto_a
    iget v6, v0, LP5/c;->S:I

    .line 519
    .line 520
    add-int/2addr v6, v5

    .line 521
    iput v6, v0, LP5/c;->S:I

    .line 522
    .line 523
    iget v6, v0, LP5/c;->T:I

    .line 524
    .line 525
    add-int/2addr v6, v5

    .line 526
    iput v6, v0, LP5/c;->T:I

    .line 527
    .line 528
    goto :goto_9

    .line 529
    :cond_18
    :goto_b
    iget-object v5, v0, LP5/c;->f:LY4/b;

    .line 530
    .line 531
    iget-object v11, v5, LY4/b;->a:[B

    .line 532
    .line 533
    aput-byte v10, v11, v10

    .line 534
    .line 535
    aput-byte v10, v11, v8

    .line 536
    .line 537
    aput-byte v10, v11, v6

    .line 538
    .line 539
    iget v6, v2, LP5/b;->Y:I

    .line 540
    .line 541
    rsub-int/lit8 v8, v6, 0x4

    .line 542
    .line 543
    :goto_c
    iget v12, v0, LP5/c;->S:I

    .line 544
    .line 545
    if-ge v12, v3, :cond_1c

    .line 546
    .line 547
    iget v12, v0, LP5/c;->U:I

    .line 548
    .line 549
    if-nez v12, :cond_1a

    .line 550
    .line 551
    invoke-virtual {v9}, LY4/b;->a()I

    .line 552
    .line 553
    .line 554
    move-result v12

    .line 555
    invoke-static {v6, v12}, Ljava/lang/Math;->min(II)I

    .line 556
    .line 557
    .line 558
    move-result v12

    .line 559
    add-int v13, v8, v12

    .line 560
    .line 561
    sub-int v14, v6, v12

    .line 562
    .line 563
    invoke-virtual {v1, v11, v13, v14, v10}, LJ5/h;->f([BIIZ)Z

    .line 564
    .line 565
    .line 566
    if-lez v12, :cond_19

    .line 567
    .line 568
    invoke-virtual {v9, v8, v12, v11}, LY4/b;->c(II[B)V

    .line 569
    .line 570
    .line 571
    :cond_19
    iget v12, v0, LP5/c;->S:I

    .line 572
    .line 573
    add-int/2addr v12, v6

    .line 574
    iput v12, v0, LP5/c;->S:I

    .line 575
    .line 576
    invoke-virtual {v5, v10}, LY4/b;->A(I)V

    .line 577
    .line 578
    .line 579
    invoke-virtual {v5}, LY4/b;->t()I

    .line 580
    .line 581
    .line 582
    move-result v12

    .line 583
    iput v12, v0, LP5/c;->U:I

    .line 584
    .line 585
    iget-object v12, v0, LP5/c;->e:LY4/b;

    .line 586
    .line 587
    invoke-virtual {v12, v10}, LY4/b;->A(I)V

    .line 588
    .line 589
    .line 590
    invoke-interface {v4, v7, v12}, LJ5/w;->c(ILY4/b;)V

    .line 591
    .line 592
    .line 593
    iget v12, v0, LP5/c;->T:I

    .line 594
    .line 595
    add-int/2addr v12, v7

    .line 596
    iput v12, v0, LP5/c;->T:I

    .line 597
    .line 598
    goto :goto_c

    .line 599
    :cond_1a
    invoke-virtual {v9}, LY4/b;->a()I

    .line 600
    .line 601
    .line 602
    move-result v13

    .line 603
    if-lez v13, :cond_1b

    .line 604
    .line 605
    invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I

    .line 606
    .line 607
    .line 608
    move-result v12

    .line 609
    invoke-interface {v4, v12, v9}, LJ5/w;->c(ILY4/b;)V

    .line 610
    .line 611
    .line 612
    goto :goto_d

    .line 613
    :cond_1b
    invoke-interface {v4, v1, v12, v10}, LJ5/w;->d(Lt6/i;IZ)I

    .line 614
    .line 615
    .line 616
    move-result v12

    .line 617
    :goto_d
    iget v13, v0, LP5/c;->S:I

    .line 618
    .line 619
    add-int/2addr v13, v12

    .line 620
    iput v13, v0, LP5/c;->S:I

    .line 621
    .line 622
    iget v13, v0, LP5/c;->T:I

    .line 623
    .line 624
    add-int/2addr v13, v12

    .line 625
    iput v13, v0, LP5/c;->T:I

    .line 626
    .line 627
    iget v13, v0, LP5/c;->U:I

    .line 628
    .line 629
    sub-int/2addr v13, v12

    .line 630
    iput v13, v0, LP5/c;->U:I

    .line 631
    .line 632
    goto :goto_c

    .line 633
    :cond_1c
    const-string v1, "A_VORBIS"

    .line 634
    .line 635
    iget-object v2, v2, LP5/b;->b:Ljava/lang/String;

    .line 636
    .line 637
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 638
    .line 639
    .line 640
    move-result v1

    .line 641
    if-eqz v1, :cond_1d

    .line 642
    .line 643
    iget-object v1, v0, LP5/c;->h:LY4/b;

    .line 644
    .line 645
    invoke-virtual {v1, v10}, LY4/b;->A(I)V

    .line 646
    .line 647
    .line 648
    invoke-interface {v4, v7, v1}, LJ5/w;->c(ILY4/b;)V

    .line 649
    .line 650
    .line 651
    iget v1, v0, LP5/c;->T:I

    .line 652
    .line 653
    add-int/2addr v1, v7

    .line 654
    iput v1, v0, LP5/c;->T:I

    .line 655
    .line 656
    :cond_1d
    iget v1, v0, LP5/c;->T:I

    .line 657
    .line 658
    invoke-virtual {v0}, LP5/c;->k()V

    .line 659
    .line 660
    .line 661
    return v1
.end method

.method public final n(LJ5/h;[BI)V
    .locals 5

    .line 1
    array-length v0, p2

    .line 2
    add-int/2addr v0, p3

    .line 3
    iget-object v1, p0, LP5/c;->k:LY4/b;

    .line 4
    .line 5
    iget-object v2, v1, LY4/b;->a:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    const/4 v4, 0x0

    .line 9
    if-ge v3, v0, :cond_0

    .line 10
    .line 11
    add-int v2, v0, p3

    .line 12
    .line 13
    invoke-static {p2, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    array-length v3, v2

    .line 18
    invoke-virtual {v1, v3, v2}, LY4/b;->y(I[B)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    array-length v3, p2

    .line 23
    invoke-static {p2, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    :goto_0
    iget-object v2, v1, LY4/b;->a:[B

    .line 27
    .line 28
    array-length p2, p2

    .line 29
    invoke-virtual {p1, v2, p2, p3, v4}, LJ5/h;->f([BIIZ)Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v4}, LY4/b;->A(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v0}, LY4/b;->z(I)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method
