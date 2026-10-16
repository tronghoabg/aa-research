.class public final LK2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls2/m;


# static fields
.field public static final e0:[B

.field public static final f0:[B

.field public static final g0:[B

.field public static final h0:[B

.field public static final i0:Ljava/util/UUID;

.field public static final j0:Ljava/util/Map;


# instance fields
.field public A:Z

.field public B:J

.field public C:J

.field public D:J

.field public E:LQ1/l;

.field public F:LQ1/l;

.field public G:Z

.field public H:Z

.field public I:I

.field public J:J

.field public K:J

.field public L:I

.field public M:I

.field public N:[I

.field public O:I

.field public P:I

.field public Q:I

.field public R:I

.field public S:Z

.field public T:J

.field public U:I

.field public V:I

.field public W:I

.field public X:Z

.field public Y:Z

.field public Z:Z

.field public final a:LK2/b;

.field public a0:I

.field public final b:LK2/e;

.field public b0:B

.field public final c:Landroid/util/SparseArray;

.field public c0:Z

.field public final d:Z

.field public d0:Ls2/o;

.field public final e:Z

.field public final f:LP2/j;

.field public final g:LQ1/o;

.field public final h:LQ1/o;

.field public final i:LQ1/o;

.field public final j:LQ1/o;

.field public final k:LQ1/o;

.field public final l:LQ1/o;

.field public final m:LQ1/o;

.field public final n:LQ1/o;

.field public final o:LQ1/o;

.field public final p:LQ1/o;

.field public q:Ljava/nio/ByteBuffer;

.field public r:J

.field public s:J

.field public t:J

.field public u:J

.field public v:J

.field public w:LK2/c;

.field public x:Z

.field public y:I

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
    sput-object v1, LK2/d;->e0:[B

    .line 9
    .line 10
    sget v1, LQ1/x;->a:I

    .line 11
    .line 12
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

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
    sput-object v1, LK2/d;->f0:[B

    .line 21
    .line 22
    new-array v0, v0, [B

    .line 23
    .line 24
    fill-array-data v0, :array_1

    .line 25
    .line 26
    .line 27
    sput-object v0, LK2/d;->g0:[B

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
    sput-object v0, LK2/d;->h0:[B

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
    sput-object v0, LK2/d;->i0:Ljava/util/UUID;

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
    sput-object v0, LK2/d;->j0:Ljava/util/Map;

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

.method public constructor <init>(LP2/j;I)V
    .locals 5

    .line 1
    new-instance v0, LK2/b;

    .line 2
    .line 3
    const/4 v1, 0x0

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
    iput-wide v1, p0, LK2/d;->s:J

    .line 13
    .line 14
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    iput-wide v3, p0, LK2/d;->t:J

    .line 20
    .line 21
    iput-wide v3, p0, LK2/d;->u:J

    .line 22
    .line 23
    iput-wide v3, p0, LK2/d;->v:J

    .line 24
    .line 25
    iput-wide v1, p0, LK2/d;->B:J

    .line 26
    .line 27
    iput-wide v1, p0, LK2/d;->C:J

    .line 28
    .line 29
    iput-wide v3, p0, LK2/d;->D:J

    .line 30
    .line 31
    iput-object v0, p0, LK2/d;->a:LK2/b;

    .line 32
    .line 33
    new-instance v1, LA/e0;

    .line 34
    .line 35
    const/16 v2, 0xc

    .line 36
    .line 37
    invoke-direct {v1, p0, v2}, LA/e0;-><init>(Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    iput-object v1, v0, LK2/b;->g:Ljava/lang/Object;

    .line 41
    .line 42
    iput-object p1, p0, LK2/d;->f:LP2/j;

    .line 43
    .line 44
    and-int/lit8 p1, p2, 0x1

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    const/4 v1, 0x0

    .line 48
    if-nez p1, :cond_0

    .line 49
    .line 50
    move p1, v0

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move p1, v1

    .line 53
    :goto_0
    iput-boolean p1, p0, LK2/d;->d:Z

    .line 54
    .line 55
    and-int/lit8 p1, p2, 0x2

    .line 56
    .line 57
    if-nez p1, :cond_1

    .line 58
    .line 59
    move v1, v0

    .line 60
    :cond_1
    iput-boolean v1, p0, LK2/d;->e:Z

    .line 61
    .line 62
    new-instance p1, LK2/e;

    .line 63
    .line 64
    invoke-direct {p1}, LK2/e;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, LK2/d;->b:LK2/e;

    .line 68
    .line 69
    new-instance p1, Landroid/util/SparseArray;

    .line 70
    .line 71
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, LK2/d;->c:Landroid/util/SparseArray;

    .line 75
    .line 76
    new-instance p1, LQ1/o;

    .line 77
    .line 78
    const/4 p2, 0x4

    .line 79
    invoke-direct {p1, p2}, LQ1/o;-><init>(I)V

    .line 80
    .line 81
    .line 82
    iput-object p1, p0, LK2/d;->i:LQ1/o;

    .line 83
    .line 84
    new-instance p1, LQ1/o;

    .line 85
    .line 86
    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    const/4 v2, -0x1

    .line 91
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-direct {p1, v1}, LQ1/o;-><init>([B)V

    .line 100
    .line 101
    .line 102
    iput-object p1, p0, LK2/d;->j:LQ1/o;

    .line 103
    .line 104
    new-instance p1, LQ1/o;

    .line 105
    .line 106
    invoke-direct {p1, p2}, LQ1/o;-><init>(I)V

    .line 107
    .line 108
    .line 109
    iput-object p1, p0, LK2/d;->k:LQ1/o;

    .line 110
    .line 111
    new-instance p1, LQ1/o;

    .line 112
    .line 113
    sget-object v1, LR1/n;->a:[B

    .line 114
    .line 115
    invoke-direct {p1, v1}, LQ1/o;-><init>([B)V

    .line 116
    .line 117
    .line 118
    iput-object p1, p0, LK2/d;->g:LQ1/o;

    .line 119
    .line 120
    new-instance p1, LQ1/o;

    .line 121
    .line 122
    invoke-direct {p1, p2}, LQ1/o;-><init>(I)V

    .line 123
    .line 124
    .line 125
    iput-object p1, p0, LK2/d;->h:LQ1/o;

    .line 126
    .line 127
    new-instance p1, LQ1/o;

    .line 128
    .line 129
    invoke-direct {p1}, LQ1/o;-><init>()V

    .line 130
    .line 131
    .line 132
    iput-object p1, p0, LK2/d;->l:LQ1/o;

    .line 133
    .line 134
    new-instance p1, LQ1/o;

    .line 135
    .line 136
    invoke-direct {p1}, LQ1/o;-><init>()V

    .line 137
    .line 138
    .line 139
    iput-object p1, p0, LK2/d;->m:LQ1/o;

    .line 140
    .line 141
    new-instance p1, LQ1/o;

    .line 142
    .line 143
    const/16 p2, 0x8

    .line 144
    .line 145
    invoke-direct {p1, p2}, LQ1/o;-><init>(I)V

    .line 146
    .line 147
    .line 148
    iput-object p1, p0, LK2/d;->n:LQ1/o;

    .line 149
    .line 150
    new-instance p1, LQ1/o;

    .line 151
    .line 152
    invoke-direct {p1}, LQ1/o;-><init>()V

    .line 153
    .line 154
    .line 155
    iput-object p1, p0, LK2/d;->o:LQ1/o;

    .line 156
    .line 157
    new-instance p1, LQ1/o;

    .line 158
    .line 159
    invoke-direct {p1}, LQ1/o;-><init>()V

    .line 160
    .line 161
    .line 162
    iput-object p1, p0, LK2/d;->p:LQ1/o;

    .line 163
    .line 164
    new-array p1, v0, [I

    .line 165
    .line 166
    iput-object p1, p0, LK2/d;->N:[I

    .line 167
    .line 168
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
    invoke-static {v2}, LQ1/k;->c(Z)V

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
    sget p1, LQ1/x;->a:I

    .line 85
    .line 86
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

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
    iput-wide p1, p0, LK2/d;->D:J

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput p1, p0, LK2/d;->I:I

    .line 10
    .line 11
    iget-object p2, p0, LK2/d;->a:LK2/b;

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
    check-cast p2, LK2/e;

    .line 23
    .line 24
    iput p1, p2, LK2/e;->b:I

    .line 25
    .line 26
    iput p1, p2, LK2/e;->c:I

    .line 27
    .line 28
    iget-object p2, p0, LK2/d;->b:LK2/e;

    .line 29
    .line 30
    iput p1, p2, LK2/e;->b:I

    .line 31
    .line 32
    iput p1, p2, LK2/e;->c:I

    .line 33
    .line 34
    invoke-virtual {p0}, LK2/d;->l()V

    .line 35
    .line 36
    .line 37
    move p2, p1

    .line 38
    :goto_0
    iget-object p3, p0, LK2/d;->c:Landroid/util/SparseArray;

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
    check-cast p3, LK2/c;

    .line 51
    .line 52
    iget-object p3, p3, LK2/c;->U:LJ5/x;

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
    iget-object v0, p0, LK2/d;->E:LQ1/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LK2/d;->F:LQ1/l;

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
    invoke-static {v0, p1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

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
    iget-object v0, p0, LK2/d;->w:LK2/c;

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
    invoke-static {v0, p1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    throw p1
.end method

.method public final d(LK2/c;JIII)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const-string v3, "S_TEXT/WEBVTT"

    .line 7
    .line 8
    const-string v4, "S_TEXT/ASS"

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const-string v6, "S_TEXT/UTF8"

    .line 12
    .line 13
    iget-object v7, v1, LK2/c;->U:LJ5/x;

    .line 14
    .line 15
    const/4 v15, 0x1

    .line 16
    if-eqz v7, :cond_0

    .line 17
    .line 18
    iget-object v8, v1, LK2/c;->Y:Ls2/C;

    .line 19
    .line 20
    iget-object v14, v1, LK2/c;->j:Ls2/B;

    .line 21
    .line 22
    move-wide/from16 v9, p2

    .line 23
    .line 24
    move/from16 v11, p4

    .line 25
    .line 26
    move/from16 v12, p5

    .line 27
    .line 28
    move/from16 v13, p6

    .line 29
    .line 30
    invoke-virtual/range {v7 .. v14}, LJ5/x;->d(Ls2/C;JIIILs2/B;)V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_7

    .line 34
    .line 35
    :cond_0
    iget-object v7, v1, LK2/c;->b:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-nez v7, :cond_1

    .line 42
    .line 43
    iget-object v7, v1, LK2/c;->b:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    if-nez v7, :cond_1

    .line 50
    .line 51
    iget-object v7, v1, LK2/c;->b:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    if-eqz v7, :cond_3

    .line 58
    .line 59
    :cond_1
    iget v7, v0, LK2/d;->M:I

    .line 60
    .line 61
    const-string v8, "MatroskaExtractor"

    .line 62
    .line 63
    if-le v7, v15, :cond_2

    .line 64
    .line 65
    const-string v3, "Skipping subtitle sample in laced block."

    .line 66
    .line 67
    invoke-static {v8, v3}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    iget-wide v9, v0, LK2/d;->K:J

    .line 72
    .line 73
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    cmp-long v7, v9, v11

    .line 79
    .line 80
    if-nez v7, :cond_4

    .line 81
    .line 82
    const-string v3, "Skipping subtitle sample with no duration."

    .line 83
    .line 84
    invoke-static {v8, v3}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_3
    :goto_0
    move/from16 v3, p5

    .line 88
    .line 89
    goto/16 :goto_5

    .line 90
    .line 91
    :cond_4
    iget-object v7, v1, LK2/c;->b:Ljava/lang/String;

    .line 92
    .line 93
    iget-object v8, v0, LK2/d;->m:LQ1/o;

    .line 94
    .line 95
    iget-object v11, v8, LQ1/o;->a:[B

    .line 96
    .line 97
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    const-wide/16 v12, 0x3e8

    .line 101
    .line 102
    const/4 v14, -0x1

    .line 103
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 104
    .line 105
    .line 106
    move-result v16

    .line 107
    sparse-switch v16, :sswitch_data_0

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :sswitch_0
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-nez v3, :cond_5

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_5
    move v14, v2

    .line 119
    goto :goto_1

    .line 120
    :sswitch_1
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-nez v3, :cond_6

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_6
    move v14, v15

    .line 128
    goto :goto_1

    .line 129
    :sswitch_2
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-nez v3, :cond_7

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_7
    move v14, v5

    .line 137
    :goto_1
    packed-switch v14, :pswitch_data_0

    .line 138
    .line 139
    .line 140
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 141
    .line 142
    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 143
    .line 144
    .line 145
    throw v1

    .line 146
    :pswitch_0
    const-string v3, "%02d:%02d:%02d,%03d"

    .line 147
    .line 148
    invoke-static {v9, v10, v12, v13, v3}, LK2/d;->e(JJLjava/lang/String;)[B

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    const/16 v4, 0x13

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :pswitch_1
    const-string v3, "%02d:%02d:%02d.%03d"

    .line 156
    .line 157
    invoke-static {v9, v10, v12, v13, v3}, LK2/d;->e(JJLjava/lang/String;)[B

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    const/16 v4, 0x19

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :pswitch_2
    const-string v3, "%01d:%02d:%02d:%02d"

    .line 165
    .line 166
    const-wide/16 v6, 0x2710

    .line 167
    .line 168
    invoke-static {v9, v10, v6, v7, v3}, LK2/d;->e(JJLjava/lang/String;)[B

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    const/16 v4, 0x15

    .line 173
    .line 174
    :goto_2
    array-length v6, v3

    .line 175
    invoke-static {v3, v5, v11, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 176
    .line 177
    .line 178
    iget v3, v8, LQ1/o;->b:I

    .line 179
    .line 180
    :goto_3
    iget v4, v8, LQ1/o;->c:I

    .line 181
    .line 182
    if-ge v3, v4, :cond_9

    .line 183
    .line 184
    iget-object v4, v8, LQ1/o;->a:[B

    .line 185
    .line 186
    aget-byte v4, v4, v3

    .line 187
    .line 188
    if-nez v4, :cond_8

    .line 189
    .line 190
    invoke-virtual {v8, v3}, LQ1/o;->F(I)V

    .line 191
    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_8
    add-int/2addr v3, v15

    .line 195
    goto :goto_3

    .line 196
    :cond_9
    :goto_4
    iget-object v3, v1, LK2/c;->Y:Ls2/C;

    .line 197
    .line 198
    iget v4, v8, LQ1/o;->c:I

    .line 199
    .line 200
    invoke-interface {v3, v4, v8}, Ls2/C;->e(ILQ1/o;)V

    .line 201
    .line 202
    .line 203
    iget v3, v8, LQ1/o;->c:I

    .line 204
    .line 205
    add-int v3, p5, v3

    .line 206
    .line 207
    :goto_5
    const/high16 v4, 0x10000000

    .line 208
    .line 209
    and-int v4, p4, v4

    .line 210
    .line 211
    if-eqz v4, :cond_b

    .line 212
    .line 213
    iget v4, v0, LK2/d;->M:I

    .line 214
    .line 215
    iget-object v6, v0, LK2/d;->p:LQ1/o;

    .line 216
    .line 217
    if-le v4, v15, :cond_a

    .line 218
    .line 219
    invoke-virtual {v6, v5}, LQ1/o;->D(I)V

    .line 220
    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_a
    iget v4, v6, LQ1/o;->c:I

    .line 224
    .line 225
    iget-object v5, v1, LK2/c;->Y:Ls2/C;

    .line 226
    .line 227
    invoke-interface {v5, v6, v4, v2}, Ls2/C;->f(LQ1/o;II)V

    .line 228
    .line 229
    .line 230
    add-int/2addr v3, v4

    .line 231
    :cond_b
    :goto_6
    move/from16 v20, v3

    .line 232
    .line 233
    iget-object v2, v1, LK2/c;->Y:Ls2/C;

    .line 234
    .line 235
    iget-object v1, v1, LK2/c;->j:Ls2/B;

    .line 236
    .line 237
    move-wide/from16 v17, p2

    .line 238
    .line 239
    move/from16 v19, p4

    .line 240
    .line 241
    move/from16 v21, p6

    .line 242
    .line 243
    move-object/from16 v22, v1

    .line 244
    .line 245
    move-object/from16 v16, v2

    .line 246
    .line 247
    invoke-interface/range {v16 .. v22}, Ls2/C;->a(JIIILs2/B;)V

    .line 248
    .line 249
    .line 250
    :goto_7
    iput-boolean v15, v0, LK2/d;->H:Z

    .line 251
    .line 252
    return-void

    .line 253
    :sswitch_data_0
    .sparse-switch
        0x2c0618eb -> :sswitch_2
        0x3e4ca2d8 -> :sswitch_1
        0x54c61e47 -> :sswitch_0
    .end sparse-switch

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
    .line 266
    .line 267
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Ls2/j;I)V
    .locals 5

    .line 1
    iget-object v0, p0, LK2/d;->i:LQ1/o;

    .line 2
    .line 3
    iget v1, v0, LQ1/o;->c:I

    .line 4
    .line 5
    if-lt v1, p2, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v1, v0, LQ1/o;->a:[B

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
    invoke-virtual {v0, v1}, LQ1/o;->b(I)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-object v1, v0, LQ1/o;->a:[B

    .line 24
    .line 25
    iget v2, v0, LQ1/o;->c:I

    .line 26
    .line 27
    sub-int v3, p2, v2

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    invoke-virtual {p1, v1, v2, v3, v4}, Ls2/j;->f([BIIZ)Z

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p2}, LQ1/o;->F(I)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final g(Ls2/o;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, LK2/d;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LDd/c;

    .line 6
    .line 7
    iget-object v1, p0, LK2/d;->f:LP2/j;

    .line 8
    .line 9
    invoke-direct {v0, p1, v1}, LDd/c;-><init>(Ls2/o;LP2/j;)V

    .line 10
    .line 11
    .line 12
    move-object p1, v0

    .line 13
    :cond_0
    iput-object p1, p0, LK2/d;->d0:Ls2/o;

    .line 14
    .line 15
    return-void
.end method

.method public final h()Ls2/m;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final i(Ls2/n;)Z
    .locals 16

    .line 1
    new-instance v0, LA/x;

    .line 2
    .line 3
    const/4 v1, 0x5

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
    check-cast v1, Ls2/j;

    .line 11
    .line 12
    const-wide/16 v2, -0x1

    .line 13
    .line 14
    iget-wide v4, v1, Ls2/j;->c:J

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
    check-cast v6, LQ1/o;

    .line 32
    .line 33
    iget-object v7, v6, LQ1/o;->a:[B

    .line 34
    .line 35
    const/4 v8, 0x0

    .line 36
    const/4 v9, 0x4

    .line 37
    invoke-virtual {v1, v7, v8, v9, v8}, Ls2/j;->c([BIIZ)Z

    .line 38
    .line 39
    .line 40
    invoke-virtual {v6}, LQ1/o;->w()J

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
    iget-object v7, v6, LQ1/o;->a:[B

    .line 63
    .line 64
    invoke-virtual {v1, v7, v8, v9, v8}, Ls2/j;->c([BIIZ)Z

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
    iget-object v7, v6, LQ1/o;->a:[B

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
    invoke-virtual {v0, v1}, LA/x;->x(Ls2/j;)J

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
    invoke-virtual {v0, v1}, LA/x;->x(Ls2/j;)J

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
    invoke-virtual {v0, v1}, LA/x;->x(Ls2/j;)J

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
    invoke-virtual {v1, v2, v8}, Ls2/j;->b(IZ)Z

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

.method public final j()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Ll8/K;->b:Ll8/I;

    .line 2
    .line 3
    sget-object v0, Ll8/e0;->e:Ll8/e0;

    .line 4
    .line 5
    return-object v0
.end method

.method public final k(Ls2/n;LJ5/n;)I
    .locals 50

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v2, "A_MPEG/L2"

    .line 4
    .line 5
    const-string v3, "A_VORBIS"

    .line 6
    .line 7
    const-string v4, "A_TRUEHD"

    .line 8
    .line 9
    const-string v5, "A_MS/ACM"

    .line 10
    .line 11
    const-string v6, "V_MPEG4/ISO/SP"

    .line 12
    .line 13
    const-string v7, "V_MPEG4/ISO/AP"

    .line 14
    .line 15
    const-string v10, "A_OPUS"

    .line 16
    .line 17
    const/16 v16, 0x14

    .line 18
    .line 19
    const/16 v18, 0x2

    .line 20
    .line 21
    const/4 v13, 0x0

    .line 22
    iput-boolean v13, v0, LK2/d;->H:Z

    .line 23
    .line 24
    const/16 v21, 0x1

    .line 25
    .line 26
    :goto_0
    if-eqz v21, :cond_ab

    .line 27
    .line 28
    iget-boolean v12, v0, LK2/d;->H:Z

    .line 29
    .line 30
    if-nez v12, :cond_ab

    .line 31
    .line 32
    iget-object v12, v0, LK2/d;->a:LK2/b;

    .line 33
    .line 34
    iget-object v14, v12, LK2/b;->g:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v14, LA/e0;

    .line 37
    .line 38
    invoke-static {v14}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :goto_1
    iget-object v14, v12, LK2/b;->b:Ljava/util/ArrayDeque;

    .line 42
    .line 43
    invoke-virtual {v14}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v21

    .line 47
    const/16 v23, 0x8

    .line 48
    .line 49
    move-object/from16 v11, v21

    .line 50
    .line 51
    check-cast v11, LK2/a;

    .line 52
    .line 53
    move/from16 v24, v13

    .line 54
    .line 55
    move-object/from16 v21, v14

    .line 56
    .line 57
    const-wide/16 v25, -0x1

    .line 58
    .line 59
    const v13, 0x1654ae6b

    .line 60
    .line 61
    .line 62
    const v14, 0x1549a966

    .line 63
    .line 64
    .line 65
    const/16 v28, -0x1

    .line 66
    .line 67
    if-eqz v11, :cond_8b

    .line 68
    .line 69
    move-object/from16 v15, p1

    .line 70
    .line 71
    check-cast v15, Ls2/j;

    .line 72
    .line 73
    move-object/from16 v30, v10

    .line 74
    .line 75
    const/16 v31, 0x1

    .line 76
    .line 77
    iget-wide v9, v15, Ls2/j;->d:J

    .line 78
    .line 79
    move-wide/from16 v32, v9

    .line 80
    .line 81
    iget-wide v8, v11, LK2/a;->b:J

    .line 82
    .line 83
    cmp-long v8, v32, v8

    .line 84
    .line 85
    if-ltz v8, :cond_8a

    .line 86
    .line 87
    iget-object v8, v12, LK2/b;->g:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v8, LA/e0;

    .line 90
    .line 91
    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    check-cast v9, LK2/a;

    .line 96
    .line 97
    iget v9, v9, LK2/a;->a:I

    .line 98
    .line 99
    iget-object v8, v8, LA/e0;->b:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v8, LK2/d;

    .line 102
    .line 103
    iget-object v10, v8, LK2/d;->d0:Ls2/o;

    .line 104
    .line 105
    invoke-static {v10}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    iget-object v10, v8, LK2/d;->c:Landroid/util/SparseArray;

    .line 109
    .line 110
    const/16 v11, 0xa0

    .line 111
    .line 112
    if-eq v9, v11, :cond_83

    .line 113
    .line 114
    const/16 v11, 0xae

    .line 115
    .line 116
    const-string v12, "MatroskaExtractor"

    .line 117
    .line 118
    if-eq v9, v11, :cond_13

    .line 119
    .line 120
    const/16 v11, 0x4dbb

    .line 121
    .line 122
    if-eq v9, v11, :cond_11

    .line 123
    .line 124
    const/16 v11, 0x6240

    .line 125
    .line 126
    if-eq v9, v11, :cond_f

    .line 127
    .line 128
    const/16 v11, 0x6d80

    .line 129
    .line 130
    if-eq v9, v11, :cond_d

    .line 131
    .line 132
    const-wide v32, -0x7fffffffffffffffL    # -4.9E-324

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    if-eq v9, v14, :cond_a

    .line 138
    .line 139
    if-eq v9, v13, :cond_8

    .line 140
    .line 141
    const v15, 0x1c53bb6b

    .line 142
    .line 143
    .line 144
    if-eq v9, v15, :cond_0

    .line 145
    .line 146
    move-object/from16 v40, v2

    .line 147
    .line 148
    move-object/from16 v41, v3

    .line 149
    .line 150
    move-object/from16 v42, v4

    .line 151
    .line 152
    move-object v9, v7

    .line 153
    move-object/from16 v39, v30

    .line 154
    .line 155
    const/16 v17, 0x19

    .line 156
    .line 157
    const/16 v19, 0xf

    .line 158
    .line 159
    move-object v7, v6

    .line 160
    move-object v6, v5

    .line 161
    goto/16 :goto_41

    .line 162
    .line 163
    :cond_0
    iget-boolean v9, v8, LK2/d;->x:Z

    .line 164
    .line 165
    if-nez v9, :cond_7

    .line 166
    .line 167
    iget-object v9, v8, LK2/d;->d0:Ls2/o;

    .line 168
    .line 169
    iget-object v10, v8, LK2/d;->E:LQ1/l;

    .line 170
    .line 171
    iget-object v11, v8, LK2/d;->F:LQ1/l;

    .line 172
    .line 173
    iget-wide v13, v8, LK2/d;->s:J

    .line 174
    .line 175
    cmp-long v13, v13, v25

    .line 176
    .line 177
    if-eqz v13, :cond_1

    .line 178
    .line 179
    iget-wide v13, v8, LK2/d;->v:J

    .line 180
    .line 181
    cmp-long v13, v13, v32

    .line 182
    .line 183
    if-eqz v13, :cond_1

    .line 184
    .line 185
    if-eqz v10, :cond_1

    .line 186
    .line 187
    iget v13, v10, LQ1/l;->b:I

    .line 188
    .line 189
    if-eqz v13, :cond_1

    .line 190
    .line 191
    if-eqz v11, :cond_1

    .line 192
    .line 193
    iget v14, v11, LQ1/l;->b:I

    .line 194
    .line 195
    if-eq v14, v13, :cond_2

    .line 196
    .line 197
    :cond_1
    move-object/from16 v40, v5

    .line 198
    .line 199
    move-object/from16 v41, v6

    .line 200
    .line 201
    move-object/from16 v39, v7

    .line 202
    .line 203
    goto/16 :goto_5

    .line 204
    .line 205
    :cond_2
    new-array v14, v13, [I

    .line 206
    .line 207
    new-array v15, v13, [J

    .line 208
    .line 209
    new-array v1, v13, [J

    .line 210
    .line 211
    new-array v0, v13, [J

    .line 212
    .line 213
    move-object/from16 v39, v7

    .line 214
    .line 215
    move/from16 v7, v24

    .line 216
    .line 217
    :goto_2
    if-ge v7, v13, :cond_3

    .line 218
    .line 219
    invoke-virtual {v10, v7}, LQ1/l;->c(I)J

    .line 220
    .line 221
    .line 222
    move-result-wide v32

    .line 223
    aput-wide v32, v0, v7

    .line 224
    .line 225
    move-object/from16 v40, v5

    .line 226
    .line 227
    move-object/from16 v41, v6

    .line 228
    .line 229
    iget-wide v5, v8, LK2/d;->s:J

    .line 230
    .line 231
    invoke-virtual {v11, v7}, LQ1/l;->c(I)J

    .line 232
    .line 233
    .line 234
    move-result-wide v32

    .line 235
    add-long v32, v32, v5

    .line 236
    .line 237
    aput-wide v32, v15, v7

    .line 238
    .line 239
    add-int/lit8 v7, v7, 0x1

    .line 240
    .line 241
    move-object/from16 v5, v40

    .line 242
    .line 243
    move-object/from16 v6, v41

    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_3
    move-object/from16 v40, v5

    .line 247
    .line 248
    move-object/from16 v41, v6

    .line 249
    .line 250
    move/from16 v5, v24

    .line 251
    .line 252
    :goto_3
    add-int/lit8 v6, v13, -0x1

    .line 253
    .line 254
    if-ge v5, v6, :cond_4

    .line 255
    .line 256
    add-int/lit8 v6, v5, 0x1

    .line 257
    .line 258
    aget-wide v10, v15, v6

    .line 259
    .line 260
    aget-wide v32, v15, v5

    .line 261
    .line 262
    sub-long v10, v10, v32

    .line 263
    .line 264
    long-to-int v7, v10

    .line 265
    aput v7, v14, v5

    .line 266
    .line 267
    aget-wide v10, v0, v6

    .line 268
    .line 269
    aget-wide v32, v0, v5

    .line 270
    .line 271
    sub-long v10, v10, v32

    .line 272
    .line 273
    aput-wide v10, v1, v5

    .line 274
    .line 275
    move v5, v6

    .line 276
    goto :goto_3

    .line 277
    :cond_4
    move v5, v6

    .line 278
    :goto_4
    if-lez v5, :cond_5

    .line 279
    .line 280
    aget-wide v10, v0, v5

    .line 281
    .line 282
    move-wide/from16 v32, v10

    .line 283
    .line 284
    iget-wide v10, v8, LK2/d;->v:J

    .line 285
    .line 286
    cmp-long v7, v32, v10

    .line 287
    .line 288
    if-lez v7, :cond_5

    .line 289
    .line 290
    add-int/lit8 v5, v5, -0x1

    .line 291
    .line 292
    goto :goto_4

    .line 293
    :cond_5
    iget-wide v10, v8, LK2/d;->s:J

    .line 294
    .line 295
    move-wide/from16 v32, v10

    .line 296
    .line 297
    iget-wide v10, v8, LK2/d;->r:J

    .line 298
    .line 299
    add-long v10, v32, v10

    .line 300
    .line 301
    aget-wide v32, v15, v5

    .line 302
    .line 303
    sub-long v10, v10, v32

    .line 304
    .line 305
    long-to-int v7, v10

    .line 306
    aput v7, v14, v5

    .line 307
    .line 308
    iget-wide v10, v8, LK2/d;->v:J

    .line 309
    .line 310
    aget-wide v32, v0, v5

    .line 311
    .line 312
    sub-long v10, v10, v32

    .line 313
    .line 314
    aput-wide v10, v1, v5

    .line 315
    .line 316
    if-ge v5, v6, :cond_6

    .line 317
    .line 318
    const-string v6, "Discarding trailing cue points with timestamps greater than total duration"

    .line 319
    .line 320
    invoke-static {v12, v6}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    add-int/lit8 v5, v5, 0x1

    .line 324
    .line 325
    invoke-static {v14, v5}, Ljava/util/Arrays;->copyOf([II)[I

    .line 326
    .line 327
    .line 328
    move-result-object v14

    .line 329
    invoke-static {v15, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 330
    .line 331
    .line 332
    move-result-object v15

    .line 333
    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    :cond_6
    new-instance v5, Ls2/h;

    .line 342
    .line 343
    invoke-direct {v5, v14, v15, v1, v0}, Ls2/h;-><init>([I[J[J[J)V

    .line 344
    .line 345
    .line 346
    goto :goto_6

    .line 347
    :goto_5
    new-instance v5, Ls2/q;

    .line 348
    .line 349
    iget-wide v0, v8, LK2/d;->v:J

    .line 350
    .line 351
    invoke-direct {v5, v0, v1}, Ls2/q;-><init>(J)V

    .line 352
    .line 353
    .line 354
    :goto_6
    invoke-interface {v9, v5}, Ls2/o;->s(Ls2/w;)V

    .line 355
    .line 356
    .line 357
    move/from16 v0, v31

    .line 358
    .line 359
    iput-boolean v0, v8, LK2/d;->x:Z

    .line 360
    .line 361
    :goto_7
    const/4 v0, 0x0

    .line 362
    goto :goto_8

    .line 363
    :cond_7
    move-object/from16 v40, v5

    .line 364
    .line 365
    move-object/from16 v41, v6

    .line 366
    .line 367
    move-object/from16 v39, v7

    .line 368
    .line 369
    goto :goto_7

    .line 370
    :goto_8
    iput-object v0, v8, LK2/d;->E:LQ1/l;

    .line 371
    .line 372
    iput-object v0, v8, LK2/d;->F:LQ1/l;

    .line 373
    .line 374
    :goto_9
    move-object/from16 v42, v4

    .line 375
    .line 376
    move-object/from16 v5, v30

    .line 377
    .line 378
    move-object/from16 v9, v39

    .line 379
    .line 380
    move-object/from16 v6, v40

    .line 381
    .line 382
    move-object/from16 v7, v41

    .line 383
    .line 384
    const/16 v17, 0x19

    .line 385
    .line 386
    const/16 v19, 0xf

    .line 387
    .line 388
    move-object/from16 v40, v2

    .line 389
    .line 390
    move-object/from16 v41, v3

    .line 391
    .line 392
    move/from16 v3, v24

    .line 393
    .line 394
    goto/16 :goto_47

    .line 395
    .line 396
    :cond_8
    move-object/from16 v40, v5

    .line 397
    .line 398
    move-object/from16 v41, v6

    .line 399
    .line 400
    move-object/from16 v39, v7

    .line 401
    .line 402
    const/4 v0, 0x0

    .line 403
    invoke-virtual {v10}, Landroid/util/SparseArray;->size()I

    .line 404
    .line 405
    .line 406
    move-result v1

    .line 407
    if-eqz v1, :cond_9

    .line 408
    .line 409
    iget-object v0, v8, LK2/d;->d0:Ls2/o;

    .line 410
    .line 411
    invoke-interface {v0}, Ls2/o;->l()V

    .line 412
    .line 413
    .line 414
    goto :goto_9

    .line 415
    :cond_9
    const-string v1, "No valid tracks were found"

    .line 416
    .line 417
    invoke-static {v0, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    throw v0

    .line 422
    :cond_a
    move-object/from16 v40, v5

    .line 423
    .line 424
    move-object/from16 v41, v6

    .line 425
    .line 426
    move-object/from16 v39, v7

    .line 427
    .line 428
    iget-wide v0, v8, LK2/d;->t:J

    .line 429
    .line 430
    cmp-long v0, v0, v32

    .line 431
    .line 432
    if-nez v0, :cond_b

    .line 433
    .line 434
    const-wide/32 v0, 0xf4240

    .line 435
    .line 436
    .line 437
    iput-wide v0, v8, LK2/d;->t:J

    .line 438
    .line 439
    :cond_b
    iget-wide v0, v8, LK2/d;->u:J

    .line 440
    .line 441
    cmp-long v5, v0, v32

    .line 442
    .line 443
    if-eqz v5, :cond_c

    .line 444
    .line 445
    invoke-virtual {v8, v0, v1}, LK2/d;->m(J)J

    .line 446
    .line 447
    .line 448
    move-result-wide v0

    .line 449
    iput-wide v0, v8, LK2/d;->v:J

    .line 450
    .line 451
    goto :goto_9

    .line 452
    :cond_c
    :goto_a
    move-object/from16 v42, v4

    .line 453
    .line 454
    move-object/from16 v9, v39

    .line 455
    .line 456
    move-object/from16 v6, v40

    .line 457
    .line 458
    move-object/from16 v7, v41

    .line 459
    .line 460
    const/16 v17, 0x19

    .line 461
    .line 462
    const/16 v19, 0xf

    .line 463
    .line 464
    move-object/from16 v40, v2

    .line 465
    .line 466
    move-object/from16 v41, v3

    .line 467
    .line 468
    move-object/from16 v39, v30

    .line 469
    .line 470
    goto/16 :goto_41

    .line 471
    .line 472
    :cond_d
    move-object/from16 v40, v5

    .line 473
    .line 474
    move-object/from16 v41, v6

    .line 475
    .line 476
    move-object/from16 v39, v7

    .line 477
    .line 478
    invoke-virtual {v8, v9}, LK2/d;->c(I)V

    .line 479
    .line 480
    .line 481
    iget-object v0, v8, LK2/d;->w:LK2/c;

    .line 482
    .line 483
    iget-boolean v1, v0, LK2/c;->h:Z

    .line 484
    .line 485
    if-eqz v1, :cond_c

    .line 486
    .line 487
    iget-object v0, v0, LK2/c;->i:[B

    .line 488
    .line 489
    if-nez v0, :cond_e

    .line 490
    .line 491
    goto :goto_a

    .line 492
    :cond_e
    const-string v0, "Combining encryption and compression is not supported"

    .line 493
    .line 494
    const/4 v1, 0x0

    .line 495
    invoke-static {v1, v0}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    throw v0

    .line 500
    :cond_f
    move-object/from16 v40, v5

    .line 501
    .line 502
    move-object/from16 v41, v6

    .line 503
    .line 504
    move-object/from16 v39, v7

    .line 505
    .line 506
    invoke-virtual {v8, v9}, LK2/d;->c(I)V

    .line 507
    .line 508
    .line 509
    iget-object v0, v8, LK2/d;->w:LK2/c;

    .line 510
    .line 511
    iget-boolean v1, v0, LK2/c;->h:Z

    .line 512
    .line 513
    if-eqz v1, :cond_c

    .line 514
    .line 515
    iget-object v1, v0, LK2/c;->j:Ls2/B;

    .line 516
    .line 517
    if-eqz v1, :cond_10

    .line 518
    .line 519
    new-instance v5, LN1/j;

    .line 520
    .line 521
    new-instance v6, LN1/i;

    .line 522
    .line 523
    sget-object v7, LN1/e;->a:Ljava/util/UUID;

    .line 524
    .line 525
    iget-object v1, v1, Ls2/B;->b:[B

    .line 526
    .line 527
    const-string v8, "video/webm"

    .line 528
    .line 529
    const/4 v9, 0x0

    .line 530
    invoke-direct {v6, v7, v9, v8, v1}, LN1/i;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 531
    .line 532
    .line 533
    const/4 v1, 0x1

    .line 534
    new-array v7, v1, [LN1/i;

    .line 535
    .line 536
    aput-object v6, v7, v24

    .line 537
    .line 538
    invoke-direct {v5, v7}, LN1/j;-><init>([LN1/i;)V

    .line 539
    .line 540
    .line 541
    iput-object v5, v0, LK2/c;->l:LN1/j;

    .line 542
    .line 543
    goto/16 :goto_9

    .line 544
    .line 545
    :cond_10
    const/4 v9, 0x0

    .line 546
    const-string v0, "Encrypted Track found but ContentEncKeyID was not found"

    .line 547
    .line 548
    invoke-static {v9, v0}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    throw v0

    .line 553
    :cond_11
    move-object/from16 v40, v5

    .line 554
    .line 555
    move-object/from16 v41, v6

    .line 556
    .line 557
    move-object/from16 v39, v7

    .line 558
    .line 559
    iget v0, v8, LK2/d;->y:I

    .line 560
    .line 561
    move/from16 v1, v28

    .line 562
    .line 563
    if-eq v0, v1, :cond_12

    .line 564
    .line 565
    iget-wide v5, v8, LK2/d;->z:J

    .line 566
    .line 567
    cmp-long v1, v5, v25

    .line 568
    .line 569
    if-eqz v1, :cond_12

    .line 570
    .line 571
    const v15, 0x1c53bb6b

    .line 572
    .line 573
    .line 574
    if-ne v0, v15, :cond_c

    .line 575
    .line 576
    iput-wide v5, v8, LK2/d;->B:J

    .line 577
    .line 578
    goto/16 :goto_9

    .line 579
    .line 580
    :cond_12
    const-string v0, "Mandatory element SeekID or SeekPosition not found"

    .line 581
    .line 582
    const/4 v1, 0x0

    .line 583
    invoke-static {v1, v0}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    throw v0

    .line 588
    :cond_13
    move-object/from16 v40, v5

    .line 589
    .line 590
    move-object/from16 v41, v6

    .line 591
    .line 592
    move-object/from16 v39, v7

    .line 593
    .line 594
    iget-object v0, v8, LK2/d;->w:LK2/c;

    .line 595
    .line 596
    invoke-static {v0}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    iget-object v1, v0, LK2/c;->b:Ljava/lang/String;

    .line 600
    .line 601
    if-eqz v1, :cond_82

    .line 602
    .line 603
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 604
    .line 605
    .line 606
    move-result v5

    .line 607
    sparse-switch v5, :sswitch_data_0

    .line 608
    .line 609
    .line 610
    move-object/from16 v5, v30

    .line 611
    .line 612
    :goto_b
    move-object/from16 v9, v39

    .line 613
    .line 614
    move-object/from16 v6, v40

    .line 615
    .line 616
    :goto_c
    move-object/from16 v7, v41

    .line 617
    .line 618
    :goto_d
    const/4 v11, -0x1

    .line 619
    goto/16 :goto_12

    .line 620
    .line 621
    :sswitch_0
    move-object/from16 v5, v30

    .line 622
    .line 623
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 624
    .line 625
    .line 626
    move-result v6

    .line 627
    if-nez v6, :cond_14

    .line 628
    .line 629
    goto/16 :goto_10

    .line 630
    .line 631
    :cond_14
    move-object/from16 v9, v39

    .line 632
    .line 633
    move-object/from16 v6, v40

    .line 634
    .line 635
    move-object/from16 v7, v41

    .line 636
    .line 637
    const/16 v11, 0x20

    .line 638
    .line 639
    goto/16 :goto_12

    .line 640
    .line 641
    :sswitch_1
    move-object/from16 v5, v30

    .line 642
    .line 643
    const-string v6, "A_FLAC"

    .line 644
    .line 645
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 646
    .line 647
    .line 648
    move-result v6

    .line 649
    if-nez v6, :cond_15

    .line 650
    .line 651
    goto/16 :goto_10

    .line 652
    .line 653
    :cond_15
    const/16 v6, 0x1f

    .line 654
    .line 655
    goto/16 :goto_e

    .line 656
    .line 657
    :sswitch_2
    move-object/from16 v5, v30

    .line 658
    .line 659
    const-string v6, "A_EAC3"

    .line 660
    .line 661
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 662
    .line 663
    .line 664
    move-result v6

    .line 665
    if-nez v6, :cond_16

    .line 666
    .line 667
    goto/16 :goto_10

    .line 668
    .line 669
    :cond_16
    const/16 v6, 0x1e

    .line 670
    .line 671
    goto/16 :goto_e

    .line 672
    .line 673
    :sswitch_3
    move-object/from16 v5, v30

    .line 674
    .line 675
    const-string v6, "V_MPEG2"

    .line 676
    .line 677
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 678
    .line 679
    .line 680
    move-result v6

    .line 681
    if-nez v6, :cond_17

    .line 682
    .line 683
    goto/16 :goto_10

    .line 684
    .line 685
    :cond_17
    const/16 v6, 0x1d

    .line 686
    .line 687
    goto/16 :goto_e

    .line 688
    .line 689
    :sswitch_4
    move-object/from16 v5, v30

    .line 690
    .line 691
    const-string v6, "S_TEXT/UTF8"

    .line 692
    .line 693
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 694
    .line 695
    .line 696
    move-result v6

    .line 697
    if-nez v6, :cond_18

    .line 698
    .line 699
    goto/16 :goto_10

    .line 700
    .line 701
    :cond_18
    const/16 v6, 0x1c

    .line 702
    .line 703
    goto/16 :goto_e

    .line 704
    .line 705
    :sswitch_5
    move-object/from16 v5, v30

    .line 706
    .line 707
    const-string v6, "S_TEXT/WEBVTT"

    .line 708
    .line 709
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 710
    .line 711
    .line 712
    move-result v6

    .line 713
    if-nez v6, :cond_19

    .line 714
    .line 715
    goto/16 :goto_10

    .line 716
    .line 717
    :cond_19
    const/16 v6, 0x1b

    .line 718
    .line 719
    goto/16 :goto_e

    .line 720
    .line 721
    :sswitch_6
    move-object/from16 v5, v30

    .line 722
    .line 723
    const-string v6, "V_MPEGH/ISO/HEVC"

    .line 724
    .line 725
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 726
    .line 727
    .line 728
    move-result v6

    .line 729
    if-nez v6, :cond_1a

    .line 730
    .line 731
    goto/16 :goto_10

    .line 732
    .line 733
    :cond_1a
    const/16 v6, 0x1a

    .line 734
    .line 735
    goto/16 :goto_e

    .line 736
    .line 737
    :sswitch_7
    move-object/from16 v5, v30

    .line 738
    .line 739
    const-string v6, "S_TEXT/ASS"

    .line 740
    .line 741
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 742
    .line 743
    .line 744
    move-result v6

    .line 745
    if-nez v6, :cond_1b

    .line 746
    .line 747
    goto/16 :goto_10

    .line 748
    .line 749
    :cond_1b
    move-object/from16 v9, v39

    .line 750
    .line 751
    move-object/from16 v6, v40

    .line 752
    .line 753
    move-object/from16 v7, v41

    .line 754
    .line 755
    const/16 v11, 0x19

    .line 756
    .line 757
    goto/16 :goto_12

    .line 758
    .line 759
    :sswitch_8
    move-object/from16 v5, v30

    .line 760
    .line 761
    const-string v6, "A_PCM/INT/LIT"

    .line 762
    .line 763
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 764
    .line 765
    .line 766
    move-result v6

    .line 767
    if-nez v6, :cond_1c

    .line 768
    .line 769
    goto/16 :goto_10

    .line 770
    .line 771
    :cond_1c
    move-object/from16 v9, v39

    .line 772
    .line 773
    move-object/from16 v6, v40

    .line 774
    .line 775
    move-object/from16 v7, v41

    .line 776
    .line 777
    const/16 v11, 0x18

    .line 778
    .line 779
    goto/16 :goto_12

    .line 780
    .line 781
    :sswitch_9
    move-object/from16 v5, v30

    .line 782
    .line 783
    const-string v6, "A_PCM/INT/BIG"

    .line 784
    .line 785
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 786
    .line 787
    .line 788
    move-result v6

    .line 789
    if-nez v6, :cond_1d

    .line 790
    .line 791
    goto/16 :goto_10

    .line 792
    .line 793
    :cond_1d
    const/16 v6, 0x17

    .line 794
    .line 795
    goto/16 :goto_e

    .line 796
    .line 797
    :sswitch_a
    move-object/from16 v5, v30

    .line 798
    .line 799
    const-string v6, "A_PCM/FLOAT/IEEE"

    .line 800
    .line 801
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 802
    .line 803
    .line 804
    move-result v6

    .line 805
    if-nez v6, :cond_1e

    .line 806
    .line 807
    goto/16 :goto_10

    .line 808
    .line 809
    :cond_1e
    const/16 v6, 0x16

    .line 810
    .line 811
    goto/16 :goto_e

    .line 812
    .line 813
    :sswitch_b
    move-object/from16 v5, v30

    .line 814
    .line 815
    const-string v6, "A_DTS/EXPRESS"

    .line 816
    .line 817
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 818
    .line 819
    .line 820
    move-result v6

    .line 821
    if-nez v6, :cond_1f

    .line 822
    .line 823
    goto/16 :goto_10

    .line 824
    .line 825
    :cond_1f
    const/16 v6, 0x15

    .line 826
    .line 827
    goto/16 :goto_e

    .line 828
    .line 829
    :sswitch_c
    move-object/from16 v5, v30

    .line 830
    .line 831
    const-string v6, "V_THEORA"

    .line 832
    .line 833
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 834
    .line 835
    .line 836
    move-result v6

    .line 837
    if-nez v6, :cond_20

    .line 838
    .line 839
    goto/16 :goto_10

    .line 840
    .line 841
    :cond_20
    move/from16 v11, v16

    .line 842
    .line 843
    goto/16 :goto_f

    .line 844
    .line 845
    :sswitch_d
    move-object/from16 v5, v30

    .line 846
    .line 847
    const-string v6, "S_HDMV/PGS"

    .line 848
    .line 849
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 850
    .line 851
    .line 852
    move-result v6

    .line 853
    if-nez v6, :cond_21

    .line 854
    .line 855
    goto/16 :goto_10

    .line 856
    .line 857
    :cond_21
    const/16 v6, 0x13

    .line 858
    .line 859
    goto/16 :goto_e

    .line 860
    .line 861
    :sswitch_e
    move-object/from16 v5, v30

    .line 862
    .line 863
    const-string v6, "V_VP9"

    .line 864
    .line 865
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 866
    .line 867
    .line 868
    move-result v6

    .line 869
    if-nez v6, :cond_22

    .line 870
    .line 871
    goto/16 :goto_10

    .line 872
    .line 873
    :cond_22
    const/16 v6, 0x12

    .line 874
    .line 875
    goto/16 :goto_e

    .line 876
    .line 877
    :sswitch_f
    move-object/from16 v5, v30

    .line 878
    .line 879
    const-string v6, "V_VP8"

    .line 880
    .line 881
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 882
    .line 883
    .line 884
    move-result v6

    .line 885
    if-nez v6, :cond_23

    .line 886
    .line 887
    goto/16 :goto_10

    .line 888
    .line 889
    :cond_23
    const/16 v6, 0x11

    .line 890
    .line 891
    goto/16 :goto_e

    .line 892
    .line 893
    :sswitch_10
    move-object/from16 v5, v30

    .line 894
    .line 895
    const-string v6, "V_AV1"

    .line 896
    .line 897
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 898
    .line 899
    .line 900
    move-result v6

    .line 901
    if-nez v6, :cond_24

    .line 902
    .line 903
    goto/16 :goto_10

    .line 904
    .line 905
    :cond_24
    move-object/from16 v9, v39

    .line 906
    .line 907
    move-object/from16 v6, v40

    .line 908
    .line 909
    move-object/from16 v7, v41

    .line 910
    .line 911
    const/16 v11, 0x10

    .line 912
    .line 913
    goto/16 :goto_12

    .line 914
    .line 915
    :sswitch_11
    move-object/from16 v5, v30

    .line 916
    .line 917
    const-string v6, "A_DTS"

    .line 918
    .line 919
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 920
    .line 921
    .line 922
    move-result v6

    .line 923
    if-nez v6, :cond_25

    .line 924
    .line 925
    goto/16 :goto_10

    .line 926
    .line 927
    :cond_25
    move-object/from16 v9, v39

    .line 928
    .line 929
    move-object/from16 v6, v40

    .line 930
    .line 931
    move-object/from16 v7, v41

    .line 932
    .line 933
    const/16 v11, 0xf

    .line 934
    .line 935
    goto/16 :goto_12

    .line 936
    .line 937
    :sswitch_12
    move-object/from16 v5, v30

    .line 938
    .line 939
    const-string v6, "A_AC3"

    .line 940
    .line 941
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 942
    .line 943
    .line 944
    move-result v6

    .line 945
    if-nez v6, :cond_26

    .line 946
    .line 947
    goto/16 :goto_10

    .line 948
    .line 949
    :cond_26
    const/16 v6, 0xe

    .line 950
    .line 951
    goto/16 :goto_e

    .line 952
    .line 953
    :sswitch_13
    move-object/from16 v5, v30

    .line 954
    .line 955
    const-string v6, "A_AAC"

    .line 956
    .line 957
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 958
    .line 959
    .line 960
    move-result v6

    .line 961
    if-nez v6, :cond_27

    .line 962
    .line 963
    goto/16 :goto_10

    .line 964
    .line 965
    :cond_27
    const/16 v6, 0xd

    .line 966
    .line 967
    goto/16 :goto_e

    .line 968
    .line 969
    :sswitch_14
    move-object/from16 v5, v30

    .line 970
    .line 971
    const-string v6, "A_DTS/LOSSLESS"

    .line 972
    .line 973
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 974
    .line 975
    .line 976
    move-result v6

    .line 977
    if-nez v6, :cond_28

    .line 978
    .line 979
    goto/16 :goto_10

    .line 980
    .line 981
    :cond_28
    const/16 v6, 0xc

    .line 982
    .line 983
    goto :goto_e

    .line 984
    :sswitch_15
    move-object/from16 v5, v30

    .line 985
    .line 986
    const-string v6, "S_VOBSUB"

    .line 987
    .line 988
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 989
    .line 990
    .line 991
    move-result v6

    .line 992
    if-nez v6, :cond_29

    .line 993
    .line 994
    goto/16 :goto_10

    .line 995
    .line 996
    :cond_29
    const/16 v6, 0xb

    .line 997
    .line 998
    goto :goto_e

    .line 999
    :sswitch_16
    move-object/from16 v5, v30

    .line 1000
    .line 1001
    const-string v6, "V_MPEG4/ISO/AVC"

    .line 1002
    .line 1003
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1004
    .line 1005
    .line 1006
    move-result v6

    .line 1007
    if-nez v6, :cond_2a

    .line 1008
    .line 1009
    goto/16 :goto_10

    .line 1010
    .line 1011
    :cond_2a
    const/16 v6, 0xa

    .line 1012
    .line 1013
    goto :goto_e

    .line 1014
    :sswitch_17
    move-object/from16 v5, v30

    .line 1015
    .line 1016
    const-string v6, "V_MPEG4/ISO/ASP"

    .line 1017
    .line 1018
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1019
    .line 1020
    .line 1021
    move-result v6

    .line 1022
    if-nez v6, :cond_2b

    .line 1023
    .line 1024
    goto/16 :goto_10

    .line 1025
    .line 1026
    :cond_2b
    const/16 v6, 0x9

    .line 1027
    .line 1028
    goto :goto_e

    .line 1029
    :sswitch_18
    move-object/from16 v5, v30

    .line 1030
    .line 1031
    const-string v6, "S_DVBSUB"

    .line 1032
    .line 1033
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1034
    .line 1035
    .line 1036
    move-result v6

    .line 1037
    if-nez v6, :cond_2c

    .line 1038
    .line 1039
    goto :goto_10

    .line 1040
    :cond_2c
    move/from16 v11, v23

    .line 1041
    .line 1042
    goto :goto_f

    .line 1043
    :sswitch_19
    move-object/from16 v5, v30

    .line 1044
    .line 1045
    const-string v6, "V_MS/VFW/FOURCC"

    .line 1046
    .line 1047
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1048
    .line 1049
    .line 1050
    move-result v6

    .line 1051
    if-nez v6, :cond_2d

    .line 1052
    .line 1053
    goto :goto_10

    .line 1054
    :cond_2d
    const/4 v6, 0x7

    .line 1055
    goto :goto_e

    .line 1056
    :sswitch_1a
    move-object/from16 v5, v30

    .line 1057
    .line 1058
    const-string v6, "A_MPEG/L3"

    .line 1059
    .line 1060
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1061
    .line 1062
    .line 1063
    move-result v6

    .line 1064
    if-nez v6, :cond_2e

    .line 1065
    .line 1066
    goto :goto_10

    .line 1067
    :cond_2e
    const/4 v6, 0x6

    .line 1068
    :goto_e
    move v11, v6

    .line 1069
    :goto_f
    move-object/from16 v9, v39

    .line 1070
    .line 1071
    move-object/from16 v6, v40

    .line 1072
    .line 1073
    goto :goto_11

    .line 1074
    :sswitch_1b
    move-object/from16 v5, v30

    .line 1075
    .line 1076
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1077
    .line 1078
    .line 1079
    move-result v6

    .line 1080
    if-nez v6, :cond_2f

    .line 1081
    .line 1082
    goto :goto_10

    .line 1083
    :cond_2f
    move-object/from16 v9, v39

    .line 1084
    .line 1085
    move-object/from16 v6, v40

    .line 1086
    .line 1087
    move-object/from16 v7, v41

    .line 1088
    .line 1089
    const/4 v11, 0x5

    .line 1090
    goto/16 :goto_12

    .line 1091
    .line 1092
    :sswitch_1c
    move-object/from16 v5, v30

    .line 1093
    .line 1094
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1095
    .line 1096
    .line 1097
    move-result v6

    .line 1098
    if-nez v6, :cond_30

    .line 1099
    .line 1100
    goto :goto_10

    .line 1101
    :cond_30
    move-object/from16 v9, v39

    .line 1102
    .line 1103
    move-object/from16 v6, v40

    .line 1104
    .line 1105
    move-object/from16 v7, v41

    .line 1106
    .line 1107
    const/4 v11, 0x4

    .line 1108
    goto :goto_12

    .line 1109
    :sswitch_1d
    move-object/from16 v5, v30

    .line 1110
    .line 1111
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1112
    .line 1113
    .line 1114
    move-result v6

    .line 1115
    if-nez v6, :cond_31

    .line 1116
    .line 1117
    :goto_10
    goto/16 :goto_b

    .line 1118
    .line 1119
    :cond_31
    move-object/from16 v9, v39

    .line 1120
    .line 1121
    move-object/from16 v6, v40

    .line 1122
    .line 1123
    move-object/from16 v7, v41

    .line 1124
    .line 1125
    const/4 v11, 0x3

    .line 1126
    goto :goto_12

    .line 1127
    :sswitch_1e
    move-object/from16 v5, v30

    .line 1128
    .line 1129
    move-object/from16 v6, v40

    .line 1130
    .line 1131
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1132
    .line 1133
    .line 1134
    move-result v7

    .line 1135
    if-nez v7, :cond_32

    .line 1136
    .line 1137
    move-object/from16 v9, v39

    .line 1138
    .line 1139
    goto/16 :goto_c

    .line 1140
    .line 1141
    :cond_32
    move/from16 v11, v18

    .line 1142
    .line 1143
    move-object/from16 v9, v39

    .line 1144
    .line 1145
    :goto_11
    move-object/from16 v7, v41

    .line 1146
    .line 1147
    goto :goto_12

    .line 1148
    :sswitch_1f
    move-object/from16 v5, v30

    .line 1149
    .line 1150
    move-object/from16 v6, v40

    .line 1151
    .line 1152
    move-object/from16 v7, v41

    .line 1153
    .line 1154
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1155
    .line 1156
    .line 1157
    move-result v9

    .line 1158
    if-nez v9, :cond_33

    .line 1159
    .line 1160
    move-object/from16 v9, v39

    .line 1161
    .line 1162
    goto/16 :goto_d

    .line 1163
    .line 1164
    :cond_33
    move-object/from16 v9, v39

    .line 1165
    .line 1166
    const/4 v11, 0x1

    .line 1167
    goto :goto_12

    .line 1168
    :sswitch_20
    move-object/from16 v5, v30

    .line 1169
    .line 1170
    move-object/from16 v9, v39

    .line 1171
    .line 1172
    move-object/from16 v6, v40

    .line 1173
    .line 1174
    move-object/from16 v7, v41

    .line 1175
    .line 1176
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1177
    .line 1178
    .line 1179
    move-result v11

    .line 1180
    if-nez v11, :cond_34

    .line 1181
    .line 1182
    goto/16 :goto_d

    .line 1183
    .line 1184
    :cond_34
    move/from16 v11, v24

    .line 1185
    .line 1186
    :goto_12
    packed-switch v11, :pswitch_data_0

    .line 1187
    .line 1188
    .line 1189
    move-object/from16 v40, v2

    .line 1190
    .line 1191
    move-object/from16 v41, v3

    .line 1192
    .line 1193
    move-object/from16 v42, v4

    .line 1194
    .line 1195
    move-object/from16 v39, v5

    .line 1196
    .line 1197
    const/16 v17, 0x19

    .line 1198
    .line 1199
    const/16 v19, 0xf

    .line 1200
    .line 1201
    :goto_13
    const/4 v1, 0x0

    .line 1202
    goto/16 :goto_3f

    .line 1203
    .line 1204
    :pswitch_0
    iget-object v11, v8, LK2/d;->d0:Ls2/o;

    .line 1205
    .line 1206
    iget v13, v0, LK2/c;->c:I

    .line 1207
    .line 1208
    const-string v15, "application/dvbsubs"

    .line 1209
    .line 1210
    const-string v14, "application/vobsub"

    .line 1211
    .line 1212
    move/from16 v30, v13

    .line 1213
    .line 1214
    const-string v13, "application/pgs"

    .line 1215
    .line 1216
    move-object/from16 v32, v8

    .line 1217
    .line 1218
    const-string v8, "video/x-unknown"

    .line 1219
    .line 1220
    move-object/from16 v33, v10

    .line 1221
    .line 1222
    const-string v10, "text/x-ssa"

    .line 1223
    .line 1224
    move-object/from16 v34, v11

    .line 1225
    .line 1226
    const-string v11, "text/vtt"

    .line 1227
    .line 1228
    move-object/from16 v35, v15

    .line 1229
    .line 1230
    const-string v15, "application/x-subrip"

    .line 1231
    .line 1232
    move-object/from16 v36, v13

    .line 1233
    .line 1234
    const-string v13, ". Setting mimeType to audio/x-unknown"

    .line 1235
    .line 1236
    const-string v37, "audio/raw"

    .line 1237
    .line 1238
    const-string v38, "audio/x-unknown"

    .line 1239
    .line 1240
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 1241
    .line 1242
    .line 1243
    move-result v39

    .line 1244
    sparse-switch v39, :sswitch_data_1

    .line 1245
    .line 1246
    .line 1247
    :goto_14
    move-object/from16 v39, v5

    .line 1248
    .line 1249
    :goto_15
    const/4 v5, -0x1

    .line 1250
    goto/16 :goto_17

    .line 1251
    .line 1252
    :sswitch_21
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1253
    .line 1254
    .line 1255
    move-result v39

    .line 1256
    if-nez v39, :cond_35

    .line 1257
    .line 1258
    goto :goto_14

    .line 1259
    :cond_35
    move-object/from16 v39, v5

    .line 1260
    .line 1261
    const/16 v5, 0x20

    .line 1262
    .line 1263
    goto/16 :goto_17

    .line 1264
    .line 1265
    :sswitch_22
    move-object/from16 v39, v5

    .line 1266
    .line 1267
    const-string v5, "A_FLAC"

    .line 1268
    .line 1269
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1270
    .line 1271
    .line 1272
    move-result v5

    .line 1273
    if-nez v5, :cond_36

    .line 1274
    .line 1275
    goto/16 :goto_16

    .line 1276
    .line 1277
    :cond_36
    const/16 v5, 0x1f

    .line 1278
    .line 1279
    goto/16 :goto_17

    .line 1280
    .line 1281
    :sswitch_23
    move-object/from16 v39, v5

    .line 1282
    .line 1283
    const-string v5, "A_EAC3"

    .line 1284
    .line 1285
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1286
    .line 1287
    .line 1288
    move-result v5

    .line 1289
    if-nez v5, :cond_37

    .line 1290
    .line 1291
    goto/16 :goto_16

    .line 1292
    .line 1293
    :cond_37
    const/16 v5, 0x1e

    .line 1294
    .line 1295
    goto/16 :goto_17

    .line 1296
    .line 1297
    :sswitch_24
    move-object/from16 v39, v5

    .line 1298
    .line 1299
    const-string v5, "V_MPEG2"

    .line 1300
    .line 1301
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1302
    .line 1303
    .line 1304
    move-result v5

    .line 1305
    if-nez v5, :cond_38

    .line 1306
    .line 1307
    goto/16 :goto_16

    .line 1308
    .line 1309
    :cond_38
    const/16 v5, 0x1d

    .line 1310
    .line 1311
    goto/16 :goto_17

    .line 1312
    .line 1313
    :sswitch_25
    move-object/from16 v39, v5

    .line 1314
    .line 1315
    const-string v5, "S_TEXT/UTF8"

    .line 1316
    .line 1317
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1318
    .line 1319
    .line 1320
    move-result v5

    .line 1321
    if-nez v5, :cond_39

    .line 1322
    .line 1323
    goto/16 :goto_16

    .line 1324
    .line 1325
    :cond_39
    const/16 v5, 0x1c

    .line 1326
    .line 1327
    goto/16 :goto_17

    .line 1328
    .line 1329
    :sswitch_26
    move-object/from16 v39, v5

    .line 1330
    .line 1331
    const-string v5, "S_TEXT/WEBVTT"

    .line 1332
    .line 1333
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1334
    .line 1335
    .line 1336
    move-result v5

    .line 1337
    if-nez v5, :cond_3a

    .line 1338
    .line 1339
    goto/16 :goto_16

    .line 1340
    .line 1341
    :cond_3a
    const/16 v5, 0x1b

    .line 1342
    .line 1343
    goto/16 :goto_17

    .line 1344
    .line 1345
    :sswitch_27
    move-object/from16 v39, v5

    .line 1346
    .line 1347
    const-string v5, "V_MPEGH/ISO/HEVC"

    .line 1348
    .line 1349
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1350
    .line 1351
    .line 1352
    move-result v5

    .line 1353
    if-nez v5, :cond_3b

    .line 1354
    .line 1355
    goto/16 :goto_16

    .line 1356
    .line 1357
    :cond_3b
    const/16 v5, 0x1a

    .line 1358
    .line 1359
    goto/16 :goto_17

    .line 1360
    .line 1361
    :sswitch_28
    move-object/from16 v39, v5

    .line 1362
    .line 1363
    const-string v5, "S_TEXT/ASS"

    .line 1364
    .line 1365
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1366
    .line 1367
    .line 1368
    move-result v5

    .line 1369
    if-nez v5, :cond_3c

    .line 1370
    .line 1371
    goto/16 :goto_16

    .line 1372
    .line 1373
    :cond_3c
    const/16 v5, 0x19

    .line 1374
    .line 1375
    goto/16 :goto_17

    .line 1376
    .line 1377
    :sswitch_29
    move-object/from16 v39, v5

    .line 1378
    .line 1379
    const-string v5, "A_PCM/INT/LIT"

    .line 1380
    .line 1381
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1382
    .line 1383
    .line 1384
    move-result v5

    .line 1385
    if-nez v5, :cond_3d

    .line 1386
    .line 1387
    goto/16 :goto_16

    .line 1388
    .line 1389
    :cond_3d
    const/16 v5, 0x18

    .line 1390
    .line 1391
    goto/16 :goto_17

    .line 1392
    .line 1393
    :sswitch_2a
    move-object/from16 v39, v5

    .line 1394
    .line 1395
    const-string v5, "A_PCM/INT/BIG"

    .line 1396
    .line 1397
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1398
    .line 1399
    .line 1400
    move-result v5

    .line 1401
    if-nez v5, :cond_3e

    .line 1402
    .line 1403
    goto/16 :goto_16

    .line 1404
    .line 1405
    :cond_3e
    const/16 v5, 0x17

    .line 1406
    .line 1407
    goto/16 :goto_17

    .line 1408
    .line 1409
    :sswitch_2b
    move-object/from16 v39, v5

    .line 1410
    .line 1411
    const-string v5, "A_PCM/FLOAT/IEEE"

    .line 1412
    .line 1413
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1414
    .line 1415
    .line 1416
    move-result v5

    .line 1417
    if-nez v5, :cond_3f

    .line 1418
    .line 1419
    goto/16 :goto_16

    .line 1420
    .line 1421
    :cond_3f
    const/16 v5, 0x16

    .line 1422
    .line 1423
    goto/16 :goto_17

    .line 1424
    .line 1425
    :sswitch_2c
    move-object/from16 v39, v5

    .line 1426
    .line 1427
    const-string v5, "A_DTS/EXPRESS"

    .line 1428
    .line 1429
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1430
    .line 1431
    .line 1432
    move-result v5

    .line 1433
    if-nez v5, :cond_40

    .line 1434
    .line 1435
    goto/16 :goto_16

    .line 1436
    .line 1437
    :cond_40
    const/16 v5, 0x15

    .line 1438
    .line 1439
    goto/16 :goto_17

    .line 1440
    .line 1441
    :sswitch_2d
    move-object/from16 v39, v5

    .line 1442
    .line 1443
    const-string v5, "V_THEORA"

    .line 1444
    .line 1445
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1446
    .line 1447
    .line 1448
    move-result v5

    .line 1449
    if-nez v5, :cond_41

    .line 1450
    .line 1451
    goto/16 :goto_16

    .line 1452
    .line 1453
    :cond_41
    move/from16 v5, v16

    .line 1454
    .line 1455
    goto/16 :goto_17

    .line 1456
    .line 1457
    :sswitch_2e
    move-object/from16 v39, v5

    .line 1458
    .line 1459
    const-string v5, "S_HDMV/PGS"

    .line 1460
    .line 1461
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1462
    .line 1463
    .line 1464
    move-result v5

    .line 1465
    if-nez v5, :cond_42

    .line 1466
    .line 1467
    goto/16 :goto_16

    .line 1468
    .line 1469
    :cond_42
    const/16 v5, 0x13

    .line 1470
    .line 1471
    goto/16 :goto_17

    .line 1472
    .line 1473
    :sswitch_2f
    move-object/from16 v39, v5

    .line 1474
    .line 1475
    const-string v5, "V_VP9"

    .line 1476
    .line 1477
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1478
    .line 1479
    .line 1480
    move-result v5

    .line 1481
    if-nez v5, :cond_43

    .line 1482
    .line 1483
    goto/16 :goto_16

    .line 1484
    .line 1485
    :cond_43
    const/16 v5, 0x12

    .line 1486
    .line 1487
    goto/16 :goto_17

    .line 1488
    .line 1489
    :sswitch_30
    move-object/from16 v39, v5

    .line 1490
    .line 1491
    const-string v5, "V_VP8"

    .line 1492
    .line 1493
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1494
    .line 1495
    .line 1496
    move-result v5

    .line 1497
    if-nez v5, :cond_44

    .line 1498
    .line 1499
    goto/16 :goto_16

    .line 1500
    .line 1501
    :cond_44
    const/16 v5, 0x11

    .line 1502
    .line 1503
    goto/16 :goto_17

    .line 1504
    .line 1505
    :sswitch_31
    move-object/from16 v39, v5

    .line 1506
    .line 1507
    const-string v5, "V_AV1"

    .line 1508
    .line 1509
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1510
    .line 1511
    .line 1512
    move-result v5

    .line 1513
    if-nez v5, :cond_45

    .line 1514
    .line 1515
    goto/16 :goto_16

    .line 1516
    .line 1517
    :cond_45
    const/16 v5, 0x10

    .line 1518
    .line 1519
    goto/16 :goto_17

    .line 1520
    .line 1521
    :sswitch_32
    move-object/from16 v39, v5

    .line 1522
    .line 1523
    const-string v5, "A_DTS"

    .line 1524
    .line 1525
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1526
    .line 1527
    .line 1528
    move-result v5

    .line 1529
    if-nez v5, :cond_46

    .line 1530
    .line 1531
    goto/16 :goto_16

    .line 1532
    .line 1533
    :cond_46
    const/16 v5, 0xf

    .line 1534
    .line 1535
    goto/16 :goto_17

    .line 1536
    .line 1537
    :sswitch_33
    move-object/from16 v39, v5

    .line 1538
    .line 1539
    const-string v5, "A_AC3"

    .line 1540
    .line 1541
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1542
    .line 1543
    .line 1544
    move-result v5

    .line 1545
    if-nez v5, :cond_47

    .line 1546
    .line 1547
    goto/16 :goto_16

    .line 1548
    .line 1549
    :cond_47
    const/16 v5, 0xe

    .line 1550
    .line 1551
    goto/16 :goto_17

    .line 1552
    .line 1553
    :sswitch_34
    move-object/from16 v39, v5

    .line 1554
    .line 1555
    const-string v5, "A_AAC"

    .line 1556
    .line 1557
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1558
    .line 1559
    .line 1560
    move-result v5

    .line 1561
    if-nez v5, :cond_48

    .line 1562
    .line 1563
    goto/16 :goto_16

    .line 1564
    .line 1565
    :cond_48
    const/16 v5, 0xd

    .line 1566
    .line 1567
    goto/16 :goto_17

    .line 1568
    .line 1569
    :sswitch_35
    move-object/from16 v39, v5

    .line 1570
    .line 1571
    const-string v5, "A_DTS/LOSSLESS"

    .line 1572
    .line 1573
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1574
    .line 1575
    .line 1576
    move-result v5

    .line 1577
    if-nez v5, :cond_49

    .line 1578
    .line 1579
    goto/16 :goto_16

    .line 1580
    .line 1581
    :cond_49
    const/16 v5, 0xc

    .line 1582
    .line 1583
    goto/16 :goto_17

    .line 1584
    .line 1585
    :sswitch_36
    move-object/from16 v39, v5

    .line 1586
    .line 1587
    const-string v5, "S_VOBSUB"

    .line 1588
    .line 1589
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1590
    .line 1591
    .line 1592
    move-result v5

    .line 1593
    if-nez v5, :cond_4a

    .line 1594
    .line 1595
    goto/16 :goto_16

    .line 1596
    .line 1597
    :cond_4a
    const/16 v5, 0xb

    .line 1598
    .line 1599
    goto/16 :goto_17

    .line 1600
    .line 1601
    :sswitch_37
    move-object/from16 v39, v5

    .line 1602
    .line 1603
    const-string v5, "V_MPEG4/ISO/AVC"

    .line 1604
    .line 1605
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1606
    .line 1607
    .line 1608
    move-result v5

    .line 1609
    if-nez v5, :cond_4b

    .line 1610
    .line 1611
    goto/16 :goto_16

    .line 1612
    .line 1613
    :cond_4b
    const/16 v5, 0xa

    .line 1614
    .line 1615
    goto/16 :goto_17

    .line 1616
    .line 1617
    :sswitch_38
    move-object/from16 v39, v5

    .line 1618
    .line 1619
    const-string v5, "V_MPEG4/ISO/ASP"

    .line 1620
    .line 1621
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1622
    .line 1623
    .line 1624
    move-result v5

    .line 1625
    if-nez v5, :cond_4c

    .line 1626
    .line 1627
    goto/16 :goto_16

    .line 1628
    .line 1629
    :cond_4c
    const/16 v5, 0x9

    .line 1630
    .line 1631
    goto/16 :goto_17

    .line 1632
    .line 1633
    :sswitch_39
    move-object/from16 v39, v5

    .line 1634
    .line 1635
    const-string v5, "S_DVBSUB"

    .line 1636
    .line 1637
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1638
    .line 1639
    .line 1640
    move-result v5

    .line 1641
    if-nez v5, :cond_4d

    .line 1642
    .line 1643
    goto/16 :goto_16

    .line 1644
    .line 1645
    :cond_4d
    move/from16 v5, v23

    .line 1646
    .line 1647
    goto/16 :goto_17

    .line 1648
    .line 1649
    :sswitch_3a
    move-object/from16 v39, v5

    .line 1650
    .line 1651
    const-string v5, "V_MS/VFW/FOURCC"

    .line 1652
    .line 1653
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1654
    .line 1655
    .line 1656
    move-result v5

    .line 1657
    if-nez v5, :cond_4e

    .line 1658
    .line 1659
    goto :goto_16

    .line 1660
    :cond_4e
    const/4 v5, 0x7

    .line 1661
    goto :goto_17

    .line 1662
    :sswitch_3b
    move-object/from16 v39, v5

    .line 1663
    .line 1664
    const-string v5, "A_MPEG/L3"

    .line 1665
    .line 1666
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1667
    .line 1668
    .line 1669
    move-result v5

    .line 1670
    if-nez v5, :cond_4f

    .line 1671
    .line 1672
    goto :goto_16

    .line 1673
    :cond_4f
    const/4 v5, 0x6

    .line 1674
    goto :goto_17

    .line 1675
    :sswitch_3c
    move-object/from16 v39, v5

    .line 1676
    .line 1677
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1678
    .line 1679
    .line 1680
    move-result v5

    .line 1681
    if-nez v5, :cond_50

    .line 1682
    .line 1683
    goto :goto_16

    .line 1684
    :cond_50
    const/4 v5, 0x5

    .line 1685
    goto :goto_17

    .line 1686
    :sswitch_3d
    move-object/from16 v39, v5

    .line 1687
    .line 1688
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1689
    .line 1690
    .line 1691
    move-result v5

    .line 1692
    if-nez v5, :cond_51

    .line 1693
    .line 1694
    goto :goto_16

    .line 1695
    :cond_51
    const/4 v5, 0x4

    .line 1696
    goto :goto_17

    .line 1697
    :sswitch_3e
    move-object/from16 v39, v5

    .line 1698
    .line 1699
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1700
    .line 1701
    .line 1702
    move-result v5

    .line 1703
    if-nez v5, :cond_52

    .line 1704
    .line 1705
    goto :goto_16

    .line 1706
    :cond_52
    const/4 v5, 0x3

    .line 1707
    goto :goto_17

    .line 1708
    :sswitch_3f
    move-object/from16 v39, v5

    .line 1709
    .line 1710
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1711
    .line 1712
    .line 1713
    move-result v5

    .line 1714
    if-nez v5, :cond_53

    .line 1715
    .line 1716
    goto :goto_16

    .line 1717
    :cond_53
    move/from16 v5, v18

    .line 1718
    .line 1719
    goto :goto_17

    .line 1720
    :sswitch_40
    move-object/from16 v39, v5

    .line 1721
    .line 1722
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1723
    .line 1724
    .line 1725
    move-result v5

    .line 1726
    if-nez v5, :cond_54

    .line 1727
    .line 1728
    goto :goto_16

    .line 1729
    :cond_54
    const/4 v5, 0x1

    .line 1730
    goto :goto_17

    .line 1731
    :sswitch_41
    move-object/from16 v39, v5

    .line 1732
    .line 1733
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1734
    .line 1735
    .line 1736
    move-result v5

    .line 1737
    if-nez v5, :cond_55

    .line 1738
    .line 1739
    :goto_16
    goto/16 :goto_15

    .line 1740
    .line 1741
    :cond_55
    move/from16 v5, v24

    .line 1742
    .line 1743
    :goto_17
    packed-switch v5, :pswitch_data_1

    .line 1744
    .line 1745
    .line 1746
    const-string v0, "Unrecognized codec identifier."

    .line 1747
    .line 1748
    const/4 v1, 0x0

    .line 1749
    invoke-static {v1, v0}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 1750
    .line 1751
    .line 1752
    move-result-object v0

    .line 1753
    throw v0

    .line 1754
    :pswitch_1
    new-instance v1, Ljava/util/ArrayList;

    .line 1755
    .line 1756
    const/4 v5, 0x3

    .line 1757
    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1758
    .line 1759
    .line 1760
    iget-object v5, v0, LK2/c;->b:Ljava/lang/String;

    .line 1761
    .line 1762
    invoke-virtual {v0, v5}, LK2/c;->a(Ljava/lang/String;)[B

    .line 1763
    .line 1764
    .line 1765
    move-result-object v5

    .line 1766
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1767
    .line 1768
    .line 1769
    invoke-static/range {v23 .. v23}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 1770
    .line 1771
    .line 1772
    move-result-object v5

    .line 1773
    sget-object v8, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 1774
    .line 1775
    invoke-virtual {v5, v8}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 1776
    .line 1777
    .line 1778
    move-result-object v5

    .line 1779
    iget-wide v12, v0, LK2/c;->S:J

    .line 1780
    .line 1781
    invoke-virtual {v5, v12, v13}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 1782
    .line 1783
    .line 1784
    move-result-object v5

    .line 1785
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    .line 1786
    .line 1787
    .line 1788
    move-result-object v5

    .line 1789
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1790
    .line 1791
    .line 1792
    invoke-static/range {v23 .. v23}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v5

    .line 1796
    invoke-virtual {v5, v8}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 1797
    .line 1798
    .line 1799
    move-result-object v5

    .line 1800
    iget-wide v12, v0, LK2/c;->T:J

    .line 1801
    .line 1802
    invoke-virtual {v5, v12, v13}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v5

    .line 1806
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    .line 1807
    .line 1808
    .line 1809
    move-result-object v5

    .line 1810
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1811
    .line 1812
    .line 1813
    const-string v8, "audio/opus"

    .line 1814
    .line 1815
    const/16 v5, 0x1680

    .line 1816
    .line 1817
    move-object/from16 v40, v2

    .line 1818
    .line 1819
    move-object/from16 v41, v3

    .line 1820
    .line 1821
    move v2, v5

    .line 1822
    :goto_18
    const/16 v5, 0x18

    .line 1823
    .line 1824
    const/4 v12, 0x0

    .line 1825
    const/16 v19, 0xf

    .line 1826
    .line 1827
    move-object v3, v1

    .line 1828
    const/4 v1, -0x1

    .line 1829
    goto/16 :goto_32

    .line 1830
    .line 1831
    :pswitch_2
    invoke-virtual {v0, v1}, LK2/c;->a(Ljava/lang/String;)[B

    .line 1832
    .line 1833
    .line 1834
    move-result-object v1

    .line 1835
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 1836
    .line 1837
    .line 1838
    move-result-object v1

    .line 1839
    const-string v8, "audio/flac"

    .line 1840
    .line 1841
    move-object/from16 v40, v2

    .line 1842
    .line 1843
    move-object/from16 v41, v3

    .line 1844
    .line 1845
    :goto_19
    const/4 v2, -0x1

    .line 1846
    goto :goto_18

    .line 1847
    :pswitch_3
    const-string v8, "audio/eac3"

    .line 1848
    .line 1849
    :goto_1a
    :pswitch_4
    move-object/from16 v40, v2

    .line 1850
    .line 1851
    move-object/from16 v41, v3

    .line 1852
    .line 1853
    :goto_1b
    const/4 v1, -0x1

    .line 1854
    :goto_1c
    const/4 v2, -0x1

    .line 1855
    const/4 v3, 0x0

    .line 1856
    :goto_1d
    const/16 v5, 0x18

    .line 1857
    .line 1858
    const/4 v12, 0x0

    .line 1859
    :goto_1e
    const/16 v19, 0xf

    .line 1860
    .line 1861
    goto/16 :goto_32

    .line 1862
    .line 1863
    :pswitch_5
    const-string v8, "video/mpeg2"

    .line 1864
    .line 1865
    goto :goto_1a

    .line 1866
    :pswitch_6
    move-object/from16 v40, v2

    .line 1867
    .line 1868
    move-object/from16 v41, v3

    .line 1869
    .line 1870
    move-object v8, v15

    .line 1871
    goto :goto_1b

    .line 1872
    :pswitch_7
    move-object/from16 v40, v2

    .line 1873
    .line 1874
    move-object/from16 v41, v3

    .line 1875
    .line 1876
    move-object v8, v11

    .line 1877
    goto :goto_1b

    .line 1878
    :pswitch_8
    new-instance v1, LQ1/o;

    .line 1879
    .line 1880
    iget-object v5, v0, LK2/c;->b:Ljava/lang/String;

    .line 1881
    .line 1882
    invoke-virtual {v0, v5}, LK2/c;->a(Ljava/lang/String;)[B

    .line 1883
    .line 1884
    .line 1885
    move-result-object v5

    .line 1886
    invoke-direct {v1, v5}, LQ1/o;-><init>([B)V

    .line 1887
    .line 1888
    .line 1889
    move/from16 v5, v24

    .line 1890
    .line 1891
    const/4 v8, 0x0

    .line 1892
    invoke-static {v1, v5, v8}, Ls2/t;->a(LQ1/o;ZLVa/X7;)Ls2/t;

    .line 1893
    .line 1894
    .line 1895
    move-result-object v1

    .line 1896
    iget v5, v1, Ls2/t;->b:I

    .line 1897
    .line 1898
    iput v5, v0, LK2/c;->Z:I

    .line 1899
    .line 1900
    const-string v8, "video/hevc"

    .line 1901
    .line 1902
    iget-object v5, v1, Ls2/t;->a:Ljava/util/List;

    .line 1903
    .line 1904
    iget-object v1, v1, Ls2/t;->k:Ljava/lang/String;

    .line 1905
    .line 1906
    :goto_1f
    move-object v12, v1

    .line 1907
    move-object/from16 v40, v2

    .line 1908
    .line 1909
    move-object/from16 v41, v3

    .line 1910
    .line 1911
    move-object v3, v5

    .line 1912
    :goto_20
    const/4 v1, -0x1

    .line 1913
    const/4 v2, -0x1

    .line 1914
    const/16 v5, 0x18

    .line 1915
    .line 1916
    goto :goto_1e

    .line 1917
    :pswitch_9
    invoke-virtual {v0, v1}, LK2/c;->a(Ljava/lang/String;)[B

    .line 1918
    .line 1919
    .line 1920
    move-result-object v1

    .line 1921
    sget-object v5, LK2/d;->f0:[B

    .line 1922
    .line 1923
    invoke-static {v5, v1}, Ll8/K;->o(Ljava/lang/Object;Ljava/lang/Object;)Ll8/e0;

    .line 1924
    .line 1925
    .line 1926
    move-result-object v1

    .line 1927
    move-object/from16 v40, v2

    .line 1928
    .line 1929
    move-object/from16 v41, v3

    .line 1930
    .line 1931
    move-object v8, v10

    .line 1932
    goto :goto_19

    .line 1933
    :pswitch_a
    iget v1, v0, LK2/c;->Q:I

    .line 1934
    .line 1935
    invoke-static {v1}, LQ1/x;->y(I)I

    .line 1936
    .line 1937
    .line 1938
    move-result v1

    .line 1939
    if-nez v1, :cond_56

    .line 1940
    .line 1941
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1942
    .line 1943
    const-string v5, "Unsupported little endian PCM bit depth: "

    .line 1944
    .line 1945
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1946
    .line 1947
    .line 1948
    iget v5, v0, LK2/c;->Q:I

    .line 1949
    .line 1950
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1951
    .line 1952
    .line 1953
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1954
    .line 1955
    .line 1956
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1957
    .line 1958
    .line 1959
    move-result-object v1

    .line 1960
    invoke-static {v12, v1}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1961
    .line 1962
    .line 1963
    :goto_21
    move-object/from16 v40, v2

    .line 1964
    .line 1965
    move-object/from16 v41, v3

    .line 1966
    .line 1967
    move-object/from16 v8, v38

    .line 1968
    .line 1969
    goto :goto_1b

    .line 1970
    :cond_56
    :goto_22
    move-object/from16 v40, v2

    .line 1971
    .line 1972
    move-object/from16 v41, v3

    .line 1973
    .line 1974
    move-object/from16 v8, v37

    .line 1975
    .line 1976
    goto :goto_1c

    .line 1977
    :pswitch_b
    iget v1, v0, LK2/c;->Q:I

    .line 1978
    .line 1979
    move/from16 v5, v23

    .line 1980
    .line 1981
    if-ne v1, v5, :cond_57

    .line 1982
    .line 1983
    move-object/from16 v40, v2

    .line 1984
    .line 1985
    move-object/from16 v41, v3

    .line 1986
    .line 1987
    move-object/from16 v8, v37

    .line 1988
    .line 1989
    const/4 v1, 0x3

    .line 1990
    goto/16 :goto_1c

    .line 1991
    .line 1992
    :cond_57
    const/16 v5, 0x10

    .line 1993
    .line 1994
    if-ne v1, v5, :cond_58

    .line 1995
    .line 1996
    const/high16 v1, 0x10000000

    .line 1997
    .line 1998
    goto :goto_22

    .line 1999
    :cond_58
    const/16 v5, 0x18

    .line 2000
    .line 2001
    if-ne v1, v5, :cond_59

    .line 2002
    .line 2003
    const/high16 v1, 0x50000000

    .line 2004
    .line 2005
    goto :goto_22

    .line 2006
    :cond_59
    const/16 v5, 0x20

    .line 2007
    .line 2008
    if-ne v1, v5, :cond_5a

    .line 2009
    .line 2010
    const/high16 v1, 0x60000000

    .line 2011
    .line 2012
    goto :goto_22

    .line 2013
    :cond_5a
    new-instance v1, Ljava/lang/StringBuilder;

    .line 2014
    .line 2015
    const-string v5, "Unsupported big endian PCM bit depth: "

    .line 2016
    .line 2017
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2018
    .line 2019
    .line 2020
    iget v5, v0, LK2/c;->Q:I

    .line 2021
    .line 2022
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2023
    .line 2024
    .line 2025
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2026
    .line 2027
    .line 2028
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2029
    .line 2030
    .line 2031
    move-result-object v1

    .line 2032
    invoke-static {v12, v1}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 2033
    .line 2034
    .line 2035
    goto :goto_21

    .line 2036
    :pswitch_c
    iget v1, v0, LK2/c;->Q:I

    .line 2037
    .line 2038
    const/16 v5, 0x20

    .line 2039
    .line 2040
    if-ne v1, v5, :cond_5b

    .line 2041
    .line 2042
    move-object/from16 v40, v2

    .line 2043
    .line 2044
    move-object/from16 v41, v3

    .line 2045
    .line 2046
    move-object/from16 v8, v37

    .line 2047
    .line 2048
    const/4 v1, 0x4

    .line 2049
    goto/16 :goto_1c

    .line 2050
    .line 2051
    :cond_5b
    new-instance v1, Ljava/lang/StringBuilder;

    .line 2052
    .line 2053
    const-string v8, "Unsupported floating point PCM bit depth: "

    .line 2054
    .line 2055
    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2056
    .line 2057
    .line 2058
    iget v8, v0, LK2/c;->Q:I

    .line 2059
    .line 2060
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2061
    .line 2062
    .line 2063
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2064
    .line 2065
    .line 2066
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2067
    .line 2068
    .line 2069
    move-result-object v1

    .line 2070
    invoke-static {v12, v1}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 2071
    .line 2072
    .line 2073
    goto :goto_21

    .line 2074
    :pswitch_d
    move-object/from16 v40, v2

    .line 2075
    .line 2076
    move-object/from16 v41, v3

    .line 2077
    .line 2078
    move-object/from16 v8, v36

    .line 2079
    .line 2080
    goto/16 :goto_1b

    .line 2081
    .line 2082
    :pswitch_e
    const/16 v5, 0x20

    .line 2083
    .line 2084
    const-string v8, "video/x-vnd.on2.vp9"

    .line 2085
    .line 2086
    goto/16 :goto_1a

    .line 2087
    .line 2088
    :pswitch_f
    const/16 v5, 0x20

    .line 2089
    .line 2090
    const-string v8, "video/x-vnd.on2.vp8"

    .line 2091
    .line 2092
    goto/16 :goto_1a

    .line 2093
    .line 2094
    :pswitch_10
    const/16 v5, 0x20

    .line 2095
    .line 2096
    const-string v8, "video/av01"

    .line 2097
    .line 2098
    goto/16 :goto_1a

    .line 2099
    .line 2100
    :pswitch_11
    const/16 v5, 0x20

    .line 2101
    .line 2102
    const-string v8, "audio/vnd.dts"

    .line 2103
    .line 2104
    goto/16 :goto_1a

    .line 2105
    .line 2106
    :pswitch_12
    const/16 v5, 0x20

    .line 2107
    .line 2108
    const-string v8, "audio/ac3"

    .line 2109
    .line 2110
    goto/16 :goto_1a

    .line 2111
    .line 2112
    :pswitch_13
    const/16 v5, 0x20

    .line 2113
    .line 2114
    invoke-virtual {v0, v1}, LK2/c;->a(Ljava/lang/String;)[B

    .line 2115
    .line 2116
    .line 2117
    move-result-object v1

    .line 2118
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2119
    .line 2120
    .line 2121
    move-result-object v1

    .line 2122
    iget-object v8, v0, LK2/c;->k:[B

    .line 2123
    .line 2124
    new-instance v12, LJ5/y;

    .line 2125
    .line 2126
    array-length v13, v8

    .line 2127
    move-object/from16 v21, v1

    .line 2128
    .line 2129
    const/4 v1, 0x1

    .line 2130
    const/4 v5, 0x0

    .line 2131
    invoke-direct {v12, v8, v13, v1, v5}, LJ5/y;-><init>([BIIB)V

    .line 2132
    .line 2133
    .line 2134
    invoke-static {v12, v5}, Ls2/a;->q(LJ5/y;Z)LG5/a;

    .line 2135
    .line 2136
    .line 2137
    move-result-object v1

    .line 2138
    iget v5, v1, LG5/a;->a:I

    .line 2139
    .line 2140
    iput v5, v0, LK2/c;->R:I

    .line 2141
    .line 2142
    iget v5, v1, LG5/a;->b:I

    .line 2143
    .line 2144
    iput v5, v0, LK2/c;->P:I

    .line 2145
    .line 2146
    const-string v8, "audio/mp4a-latm"

    .line 2147
    .line 2148
    iget-object v1, v1, LG5/a;->c:Ljava/lang/String;

    .line 2149
    .line 2150
    move-object v12, v1

    .line 2151
    move-object/from16 v40, v2

    .line 2152
    .line 2153
    move-object/from16 v41, v3

    .line 2154
    .line 2155
    move-object/from16 v3, v21

    .line 2156
    .line 2157
    goto/16 :goto_20

    .line 2158
    .line 2159
    :pswitch_14
    const-string v8, "audio/vnd.dts.hd"

    .line 2160
    .line 2161
    goto/16 :goto_1a

    .line 2162
    .line 2163
    :pswitch_15
    invoke-virtual {v0, v1}, LK2/c;->a(Ljava/lang/String;)[B

    .line 2164
    .line 2165
    .line 2166
    move-result-object v1

    .line 2167
    invoke-static {v1}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    .line 2168
    .line 2169
    .line 2170
    move-result-object v1

    .line 2171
    move-object/from16 v40, v2

    .line 2172
    .line 2173
    move-object/from16 v41, v3

    .line 2174
    .line 2175
    move-object v8, v14

    .line 2176
    goto/16 :goto_19

    .line 2177
    .line 2178
    :pswitch_16
    new-instance v1, LQ1/o;

    .line 2179
    .line 2180
    iget-object v5, v0, LK2/c;->b:Ljava/lang/String;

    .line 2181
    .line 2182
    invoke-virtual {v0, v5}, LK2/c;->a(Ljava/lang/String;)[B

    .line 2183
    .line 2184
    .line 2185
    move-result-object v5

    .line 2186
    invoke-direct {v1, v5}, LQ1/o;-><init>([B)V

    .line 2187
    .line 2188
    .line 2189
    invoke-static {v1}, Ls2/c;->a(LQ1/o;)Ls2/c;

    .line 2190
    .line 2191
    .line 2192
    move-result-object v1

    .line 2193
    iget v5, v1, Ls2/c;->b:I

    .line 2194
    .line 2195
    iput v5, v0, LK2/c;->Z:I

    .line 2196
    .line 2197
    iget-object v5, v1, Ls2/c;->a:Ljava/util/ArrayList;

    .line 2198
    .line 2199
    const-string v8, "video/avc"

    .line 2200
    .line 2201
    iget-object v1, v1, Ls2/c;->l:Ljava/lang/String;

    .line 2202
    .line 2203
    goto/16 :goto_1f

    .line 2204
    .line 2205
    :pswitch_17
    const/4 v5, 0x4

    .line 2206
    new-array v8, v5, [B

    .line 2207
    .line 2208
    invoke-virtual {v0, v1}, LK2/c;->a(Ljava/lang/String;)[B

    .line 2209
    .line 2210
    .line 2211
    move-result-object v1

    .line 2212
    const/4 v12, 0x0

    .line 2213
    invoke-static {v1, v12, v8, v12, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2214
    .line 2215
    .line 2216
    invoke-static {v8}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    .line 2217
    .line 2218
    .line 2219
    move-result-object v1

    .line 2220
    move-object/from16 v40, v2

    .line 2221
    .line 2222
    move-object/from16 v41, v3

    .line 2223
    .line 2224
    move-object/from16 v8, v35

    .line 2225
    .line 2226
    goto/16 :goto_19

    .line 2227
    .line 2228
    :pswitch_18
    new-instance v1, LQ1/o;

    .line 2229
    .line 2230
    iget-object v5, v0, LK2/c;->b:Ljava/lang/String;

    .line 2231
    .line 2232
    invoke-virtual {v0, v5}, LK2/c;->a(Ljava/lang/String;)[B

    .line 2233
    .line 2234
    .line 2235
    move-result-object v5

    .line 2236
    invoke-direct {v1, v5}, LQ1/o;-><init>([B)V

    .line 2237
    .line 2238
    .line 2239
    const/16 v5, 0x10

    .line 2240
    .line 2241
    :try_start_0
    invoke-virtual {v1, v5}, LQ1/o;->H(I)V

    .line 2242
    .line 2243
    .line 2244
    invoke-virtual {v1}, LQ1/o;->l()J

    .line 2245
    .line 2246
    .line 2247
    move-result-wide v37

    .line 2248
    const-wide/32 v40, 0x58564944

    .line 2249
    .line 2250
    .line 2251
    cmp-long v13, v37, v40

    .line 2252
    .line 2253
    if-nez v13, :cond_5c

    .line 2254
    .line 2255
    new-instance v1, Landroid/util/Pair;

    .line 2256
    .line 2257
    const-string v8, "video/divx"
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2258
    .line 2259
    const/4 v12, 0x0

    .line 2260
    :try_start_1
    invoke-direct {v1, v8, v12}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_2

    .line 2261
    .line 2262
    .line 2263
    :goto_23
    const/4 v12, 0x0

    .line 2264
    const/16 v13, 0xf

    .line 2265
    .line 2266
    goto/16 :goto_27

    .line 2267
    .line 2268
    :catch_0
    const/4 v12, 0x0

    .line 2269
    goto/16 :goto_28

    .line 2270
    .line 2271
    :cond_5c
    const-wide/32 v40, 0x33363248

    .line 2272
    .line 2273
    .line 2274
    cmp-long v13, v37, v40

    .line 2275
    .line 2276
    if-nez v13, :cond_5d

    .line 2277
    .line 2278
    :try_start_2
    new-instance v1, Landroid/util/Pair;

    .line 2279
    .line 2280
    const-string v8, "video/3gpp"
    :try_end_2
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_0

    .line 2281
    .line 2282
    const/4 v12, 0x0

    .line 2283
    :try_start_3
    invoke-direct {v1, v8, v12}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_2

    .line 2284
    .line 2285
    .line 2286
    goto :goto_23

    .line 2287
    :cond_5d
    const-wide/32 v40, 0x31435657

    .line 2288
    .line 2289
    .line 2290
    cmp-long v13, v37, v40

    .line 2291
    .line 2292
    if-nez v13, :cond_62

    .line 2293
    .line 2294
    :try_start_4
    iget v8, v1, LQ1/o;->b:I

    .line 2295
    .line 2296
    add-int/lit8 v8, v8, 0x14

    .line 2297
    .line 2298
    iget-object v1, v1, LQ1/o;->a:[B

    .line 2299
    .line 2300
    :goto_24
    array-length v12, v1

    .line 2301
    const/16 v20, 0x4

    .line 2302
    .line 2303
    add-int/lit8 v12, v12, -0x4

    .line 2304
    .line 2305
    if-ge v8, v12, :cond_61

    .line 2306
    .line 2307
    aget-byte v12, v1, v8

    .line 2308
    .line 2309
    if-nez v12, :cond_60

    .line 2310
    .line 2311
    const/4 v12, 0x1

    .line 2312
    add-int/lit8 v13, v8, 0x1

    .line 2313
    .line 2314
    aget-byte v13, v1, v13

    .line 2315
    .line 2316
    if-nez v13, :cond_5f

    .line 2317
    .line 2318
    add-int/lit8 v13, v8, 0x2

    .line 2319
    .line 2320
    aget-byte v13, v1, v13

    .line 2321
    .line 2322
    if-ne v13, v12, :cond_5f

    .line 2323
    .line 2324
    const/16 v27, 0x3

    .line 2325
    .line 2326
    add-int/lit8 v12, v8, 0x3

    .line 2327
    .line 2328
    aget-byte v12, v1, v12

    .line 2329
    .line 2330
    const/16 v13, 0xf

    .line 2331
    .line 2332
    if-ne v12, v13, :cond_5e

    .line 2333
    .line 2334
    array-length v12, v1

    .line 2335
    invoke-static {v1, v8, v12}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 2336
    .line 2337
    .line 2338
    move-result-object v1

    .line 2339
    new-instance v8, Landroid/util/Pair;

    .line 2340
    .line 2341
    const-string v12, "video/wvc1"

    .line 2342
    .line 2343
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2344
    .line 2345
    .line 2346
    move-result-object v1

    .line 2347
    invoke-direct {v8, v12, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2348
    .line 2349
    .line 2350
    move-object v1, v8

    .line 2351
    const/4 v12, 0x0

    .line 2352
    goto :goto_27

    .line 2353
    :cond_5e
    :goto_25
    const/16 v31, 0x1

    .line 2354
    .line 2355
    goto :goto_26

    .line 2356
    :cond_5f
    const/16 v13, 0xf

    .line 2357
    .line 2358
    move/from16 v31, v12

    .line 2359
    .line 2360
    goto :goto_26

    .line 2361
    :cond_60
    const/16 v13, 0xf

    .line 2362
    .line 2363
    goto :goto_25

    .line 2364
    :goto_26
    add-int/lit8 v8, v8, 0x1

    .line 2365
    .line 2366
    goto :goto_24

    .line 2367
    :cond_61
    const-string v0, "Failed to find FourCC VC1 initialization data"
    :try_end_4
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_0

    .line 2368
    .line 2369
    const/4 v1, 0x0

    .line 2370
    :try_start_5
    invoke-static {v1, v0}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 2371
    .line 2372
    .line 2373
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_5 .. :try_end_5} :catch_1

    .line 2374
    :try_start_6
    throw v0
    :try_end_6
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_0

    .line 2375
    :catch_1
    move-object v12, v1

    .line 2376
    goto :goto_28

    .line 2377
    :cond_62
    const/16 v13, 0xf

    .line 2378
    .line 2379
    const-string v1, "Unknown FourCC. Setting mimeType to video/x-unknown"

    .line 2380
    .line 2381
    invoke-static {v12, v1}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 2382
    .line 2383
    .line 2384
    new-instance v1, Landroid/util/Pair;

    .line 2385
    .line 2386
    const/4 v12, 0x0

    .line 2387
    invoke-direct {v1, v8, v12}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2388
    .line 2389
    .line 2390
    :goto_27
    iget-object v8, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 2391
    .line 2392
    check-cast v8, Ljava/lang/String;

    .line 2393
    .line 2394
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 2395
    .line 2396
    move-object/from16 v29, v1

    .line 2397
    .line 2398
    check-cast v29, Ljava/util/List;

    .line 2399
    .line 2400
    move-object/from16 v40, v2

    .line 2401
    .line 2402
    move-object/from16 v41, v3

    .line 2403
    .line 2404
    move/from16 v19, v13

    .line 2405
    .line 2406
    move-object/from16 v3, v29

    .line 2407
    .line 2408
    const/4 v1, -0x1

    .line 2409
    const/4 v2, -0x1

    .line 2410
    const/16 v5, 0x18

    .line 2411
    .line 2412
    goto/16 :goto_32

    .line 2413
    .line 2414
    :catch_2
    :goto_28
    const-string v0, "Error parsing FourCC private data"

    .line 2415
    .line 2416
    invoke-static {v12, v0}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 2417
    .line 2418
    .line 2419
    move-result-object v0

    .line 2420
    throw v0

    .line 2421
    :pswitch_19
    const/16 v5, 0x10

    .line 2422
    .line 2423
    const/16 v13, 0xf

    .line 2424
    .line 2425
    const-string v8, "audio/mpeg"

    .line 2426
    .line 2427
    :goto_29
    move-object/from16 v40, v2

    .line 2428
    .line 2429
    move-object/from16 v41, v3

    .line 2430
    .line 2431
    move/from16 v19, v13

    .line 2432
    .line 2433
    const/4 v1, -0x1

    .line 2434
    const/16 v2, 0x1000

    .line 2435
    .line 2436
    const/4 v3, 0x0

    .line 2437
    const/16 v5, 0x18

    .line 2438
    .line 2439
    :goto_2a
    const/4 v12, 0x0

    .line 2440
    goto/16 :goto_32

    .line 2441
    .line 2442
    :pswitch_1a
    const/16 v5, 0x10

    .line 2443
    .line 2444
    const/16 v13, 0xf

    .line 2445
    .line 2446
    const-string v8, "audio/mpeg-L2"

    .line 2447
    .line 2448
    goto :goto_29

    .line 2449
    :pswitch_1b
    const/16 v5, 0x10

    .line 2450
    .line 2451
    const/16 v13, 0xf

    .line 2452
    .line 2453
    invoke-virtual {v0, v1}, LK2/c;->a(Ljava/lang/String;)[B

    .line 2454
    .line 2455
    .line 2456
    move-result-object v1

    .line 2457
    const-string v8, "Error parsing vorbis codec private"

    .line 2458
    .line 2459
    const/16 v24, 0x0

    .line 2460
    .line 2461
    :try_start_7
    aget-byte v12, v1, v24

    .line 2462
    .line 2463
    move/from16 v5, v18

    .line 2464
    .line 2465
    if-ne v12, v5, :cond_68

    .line 2466
    .line 2467
    const/4 v5, 0x0

    .line 2468
    const/4 v12, 0x1

    .line 2469
    :goto_2b
    aget-byte v13, v1, v12

    .line 2470
    .line 2471
    move-object/from16 v40, v2

    .line 2472
    .line 2473
    const/16 v2, 0xff

    .line 2474
    .line 2475
    and-int/2addr v13, v2

    .line 2476
    if-ne v13, v2, :cond_63

    .line 2477
    .line 2478
    add-int/2addr v5, v2

    .line 2479
    const/16 v31, 0x1

    .line 2480
    .line 2481
    add-int/lit8 v12, v12, 0x1

    .line 2482
    .line 2483
    move-object/from16 v2, v40

    .line 2484
    .line 2485
    goto :goto_2b

    .line 2486
    :cond_63
    const/4 v2, 0x1

    .line 2487
    add-int/2addr v12, v2

    .line 2488
    add-int/2addr v5, v13

    .line 2489
    move/from16 v31, v2

    .line 2490
    .line 2491
    const/4 v13, 0x0

    .line 2492
    :goto_2c
    aget-byte v2, v1, v12

    .line 2493
    .line 2494
    move-object/from16 v41, v3

    .line 2495
    .line 2496
    const/16 v3, 0xff

    .line 2497
    .line 2498
    and-int/2addr v2, v3

    .line 2499
    if-ne v2, v3, :cond_64

    .line 2500
    .line 2501
    add-int/2addr v13, v3

    .line 2502
    add-int/lit8 v12, v12, 0x1

    .line 2503
    .line 2504
    move-object/from16 v3, v41

    .line 2505
    .line 2506
    goto :goto_2c

    .line 2507
    :cond_64
    add-int/lit8 v12, v12, 0x1

    .line 2508
    .line 2509
    add-int/2addr v13, v2

    .line 2510
    aget-byte v2, v1, v12

    .line 2511
    .line 2512
    move/from16 v3, v31

    .line 2513
    .line 2514
    if-ne v2, v3, :cond_67

    .line 2515
    .line 2516
    new-array v2, v5, [B

    .line 2517
    .line 2518
    const/4 v3, 0x0

    .line 2519
    invoke-static {v1, v12, v2, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2520
    .line 2521
    .line 2522
    add-int/2addr v12, v5

    .line 2523
    aget-byte v3, v1, v12

    .line 2524
    .line 2525
    const/4 v5, 0x3

    .line 2526
    if-ne v3, v5, :cond_66

    .line 2527
    .line 2528
    add-int/2addr v12, v13

    .line 2529
    aget-byte v3, v1, v12

    .line 2530
    .line 2531
    const/4 v5, 0x5

    .line 2532
    if-ne v3, v5, :cond_65

    .line 2533
    .line 2534
    array-length v3, v1

    .line 2535
    sub-int/2addr v3, v12

    .line 2536
    new-array v3, v3, [B

    .line 2537
    .line 2538
    array-length v5, v1

    .line 2539
    sub-int/2addr v5, v12

    .line 2540
    const/4 v13, 0x0

    .line 2541
    invoke-static {v1, v12, v3, v13, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2542
    .line 2543
    .line 2544
    new-instance v1, Ljava/util/ArrayList;

    .line 2545
    .line 2546
    const/4 v5, 0x2

    .line 2547
    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 2548
    .line 2549
    .line 2550
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2551
    .line 2552
    .line 2553
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_7
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_7 .. :try_end_7} :catch_3

    .line 2554
    .line 2555
    .line 2556
    const-string v8, "audio/vorbis"

    .line 2557
    .line 2558
    const/16 v2, 0x2000

    .line 2559
    .line 2560
    move-object v3, v1

    .line 2561
    const/4 v1, -0x1

    .line 2562
    goto/16 :goto_1d

    .line 2563
    .line 2564
    :catch_3
    const/4 v1, 0x0

    .line 2565
    goto :goto_2d

    .line 2566
    :cond_65
    const/4 v1, 0x0

    .line 2567
    :try_start_8
    invoke-static {v1, v8}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 2568
    .line 2569
    .line 2570
    move-result-object v0

    .line 2571
    throw v0

    .line 2572
    :cond_66
    const/4 v1, 0x0

    .line 2573
    invoke-static {v1, v8}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 2574
    .line 2575
    .line 2576
    move-result-object v0

    .line 2577
    throw v0

    .line 2578
    :cond_67
    const/4 v1, 0x0

    .line 2579
    invoke-static {v1, v8}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 2580
    .line 2581
    .line 2582
    move-result-object v0

    .line 2583
    throw v0

    .line 2584
    :cond_68
    const/4 v1, 0x0

    .line 2585
    invoke-static {v1, v8}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 2586
    .line 2587
    .line 2588
    move-result-object v0

    .line 2589
    throw v0
    :try_end_8
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_8 .. :try_end_8} :catch_4

    .line 2590
    :catch_4
    :goto_2d
    invoke-static {v1, v8}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 2591
    .line 2592
    .line 2593
    move-result-object v0

    .line 2594
    throw v0

    .line 2595
    :pswitch_1c
    move-object/from16 v40, v2

    .line 2596
    .line 2597
    move-object/from16 v41, v3

    .line 2598
    .line 2599
    new-instance v1, LJ5/x;

    .line 2600
    .line 2601
    const/4 v2, 0x1

    .line 2602
    invoke-direct {v1, v2}, LJ5/x;-><init>(I)V

    .line 2603
    .line 2604
    .line 2605
    iput-object v1, v0, LK2/c;->U:LJ5/x;

    .line 2606
    .line 2607
    const-string v8, "audio/true-hd"

    .line 2608
    .line 2609
    goto/16 :goto_1b

    .line 2610
    .line 2611
    :pswitch_1d
    move-object/from16 v40, v2

    .line 2612
    .line 2613
    move-object/from16 v41, v3

    .line 2614
    .line 2615
    const/4 v2, 0x1

    .line 2616
    const/16 v19, 0xf

    .line 2617
    .line 2618
    new-instance v1, LQ1/o;

    .line 2619
    .line 2620
    iget-object v3, v0, LK2/c;->b:Ljava/lang/String;

    .line 2621
    .line 2622
    invoke-virtual {v0, v3}, LK2/c;->a(Ljava/lang/String;)[B

    .line 2623
    .line 2624
    .line 2625
    move-result-object v3

    .line 2626
    invoke-direct {v1, v3}, LQ1/o;-><init>([B)V

    .line 2627
    .line 2628
    .line 2629
    :try_start_9
    invoke-virtual {v1}, LQ1/o;->n()I

    .line 2630
    .line 2631
    .line 2632
    move-result v3

    .line 2633
    if-ne v3, v2, :cond_69

    .line 2634
    .line 2635
    const/16 v5, 0x18

    .line 2636
    .line 2637
    goto :goto_2e

    .line 2638
    :cond_69
    const v2, 0xfffe

    .line 2639
    .line 2640
    .line 2641
    if-ne v3, v2, :cond_6b

    .line 2642
    .line 2643
    const/16 v5, 0x18

    .line 2644
    .line 2645
    invoke-virtual {v1, v5}, LQ1/o;->G(I)V

    .line 2646
    .line 2647
    .line 2648
    invoke-virtual {v1}, LQ1/o;->o()J

    .line 2649
    .line 2650
    .line 2651
    move-result-wide v2

    .line 2652
    sget-object v8, LK2/d;->i0:Ljava/util/UUID;

    .line 2653
    .line 2654
    invoke-virtual {v8}, Ljava/util/UUID;->getMostSignificantBits()J

    .line 2655
    .line 2656
    .line 2657
    move-result-wide v21

    .line 2658
    cmp-long v2, v2, v21

    .line 2659
    .line 2660
    if-nez v2, :cond_6c

    .line 2661
    .line 2662
    invoke-virtual {v1}, LQ1/o;->o()J

    .line 2663
    .line 2664
    .line 2665
    move-result-wide v1

    .line 2666
    invoke-virtual {v8}, Ljava/util/UUID;->getLeastSignificantBits()J

    .line 2667
    .line 2668
    .line 2669
    move-result-wide v21
    :try_end_9
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_9 .. :try_end_9} :catch_5

    .line 2670
    cmp-long v1, v1, v21

    .line 2671
    .line 2672
    if-nez v1, :cond_6c

    .line 2673
    .line 2674
    :goto_2e
    iget v1, v0, LK2/c;->Q:I

    .line 2675
    .line 2676
    invoke-static {v1}, LQ1/x;->y(I)I

    .line 2677
    .line 2678
    .line 2679
    move-result v1

    .line 2680
    if-nez v1, :cond_6a

    .line 2681
    .line 2682
    new-instance v1, Ljava/lang/StringBuilder;

    .line 2683
    .line 2684
    const-string v2, "Unsupported PCM bit depth: "

    .line 2685
    .line 2686
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2687
    .line 2688
    .line 2689
    iget v2, v0, LK2/c;->Q:I

    .line 2690
    .line 2691
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2692
    .line 2693
    .line 2694
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2695
    .line 2696
    .line 2697
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2698
    .line 2699
    .line 2700
    move-result-object v1

    .line 2701
    invoke-static {v12, v1}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 2702
    .line 2703
    .line 2704
    :goto_2f
    move-object/from16 v8, v38

    .line 2705
    .line 2706
    const/4 v1, -0x1

    .line 2707
    :goto_30
    const/4 v2, -0x1

    .line 2708
    const/4 v3, 0x0

    .line 2709
    goto/16 :goto_2a

    .line 2710
    .line 2711
    :cond_6a
    move-object/from16 v8, v37

    .line 2712
    .line 2713
    goto :goto_30

    .line 2714
    :cond_6b
    const/16 v5, 0x18

    .line 2715
    .line 2716
    :cond_6c
    const-string v1, "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown"

    .line 2717
    .line 2718
    invoke-static {v12, v1}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 2719
    .line 2720
    .line 2721
    goto :goto_2f

    .line 2722
    :catch_5
    const-string v0, "Error parsing MS/ACM codec private"

    .line 2723
    .line 2724
    const/4 v1, 0x0

    .line 2725
    invoke-static {v1, v0}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 2726
    .line 2727
    .line 2728
    move-result-object v0

    .line 2729
    throw v0

    .line 2730
    :pswitch_1e
    move-object/from16 v40, v2

    .line 2731
    .line 2732
    move-object/from16 v41, v3

    .line 2733
    .line 2734
    const/16 v5, 0x18

    .line 2735
    .line 2736
    const/16 v19, 0xf

    .line 2737
    .line 2738
    iget-object v1, v0, LK2/c;->k:[B

    .line 2739
    .line 2740
    if-nez v1, :cond_6d

    .line 2741
    .line 2742
    const/4 v1, 0x0

    .line 2743
    goto :goto_31

    .line 2744
    :cond_6d
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2745
    .line 2746
    .line 2747
    move-result-object v1

    .line 2748
    :goto_31
    const-string v8, "video/mp4v-es"

    .line 2749
    .line 2750
    move-object v3, v1

    .line 2751
    const/4 v1, -0x1

    .line 2752
    const/4 v2, -0x1

    .line 2753
    goto/16 :goto_2a

    .line 2754
    .line 2755
    :goto_32
    iget-object v13, v0, LK2/c;->O:[B

    .line 2756
    .line 2757
    if-eqz v13, :cond_6e

    .line 2758
    .line 2759
    new-instance v13, LQ1/o;

    .line 2760
    .line 2761
    iget-object v5, v0, LK2/c;->O:[B

    .line 2762
    .line 2763
    invoke-direct {v13, v5}, LQ1/o;-><init>([B)V

    .line 2764
    .line 2765
    .line 2766
    invoke-static {v13}, LD8/a;->a(LQ1/o;)LD8/a;

    .line 2767
    .line 2768
    .line 2769
    move-result-object v5

    .line 2770
    if-eqz v5, :cond_6e

    .line 2771
    .line 2772
    iget-object v12, v5, LD8/a;->b:Ljava/lang/String;

    .line 2773
    .line 2774
    const-string v8, "video/dolby-vision"

    .line 2775
    .line 2776
    :cond_6e
    iget-boolean v5, v0, LK2/c;->W:Z

    .line 2777
    .line 2778
    iget-boolean v13, v0, LK2/c;->V:Z

    .line 2779
    .line 2780
    if-eqz v13, :cond_6f

    .line 2781
    .line 2782
    const/4 v13, 0x2

    .line 2783
    goto :goto_33

    .line 2784
    :cond_6f
    const/4 v13, 0x0

    .line 2785
    :goto_33
    or-int/2addr v5, v13

    .line 2786
    new-instance v13, LN1/m;

    .line 2787
    .line 2788
    invoke-direct {v13}, LN1/m;-><init>()V

    .line 2789
    .line 2790
    .line 2791
    invoke-static {v8}, LN1/C;->i(Ljava/lang/String;)Z

    .line 2792
    .line 2793
    .line 2794
    move-result v21

    .line 2795
    move-object/from16 v42, v4

    .line 2796
    .line 2797
    sget-object v4, LK2/d;->j0:Ljava/util/Map;

    .line 2798
    .line 2799
    if-eqz v21, :cond_70

    .line 2800
    .line 2801
    iget v10, v0, LK2/c;->P:I

    .line 2802
    .line 2803
    iput v10, v13, LN1/m;->B:I

    .line 2804
    .line 2805
    iget v10, v0, LK2/c;->R:I

    .line 2806
    .line 2807
    iput v10, v13, LN1/m;->C:I

    .line 2808
    .line 2809
    iput v1, v13, LN1/m;->D:I

    .line 2810
    .line 2811
    const/4 v1, 0x1

    .line 2812
    :goto_34
    const/16 v17, 0x19

    .line 2813
    .line 2814
    goto/16 :goto_3e

    .line 2815
    .line 2816
    :cond_70
    invoke-static {v8}, LN1/C;->l(Ljava/lang/String;)Z

    .line 2817
    .line 2818
    .line 2819
    move-result v1

    .line 2820
    if-eqz v1, :cond_7e

    .line 2821
    .line 2822
    iget v1, v0, LK2/c;->r:I

    .line 2823
    .line 2824
    if-nez v1, :cond_73

    .line 2825
    .line 2826
    iget v1, v0, LK2/c;->p:I

    .line 2827
    .line 2828
    const/4 v10, -0x1

    .line 2829
    if-ne v1, v10, :cond_71

    .line 2830
    .line 2831
    iget v1, v0, LK2/c;->m:I

    .line 2832
    .line 2833
    :cond_71
    iput v1, v0, LK2/c;->p:I

    .line 2834
    .line 2835
    iget v1, v0, LK2/c;->q:I

    .line 2836
    .line 2837
    if-ne v1, v10, :cond_72

    .line 2838
    .line 2839
    iget v1, v0, LK2/c;->n:I

    .line 2840
    .line 2841
    :cond_72
    iput v1, v0, LK2/c;->q:I

    .line 2842
    .line 2843
    goto :goto_35

    .line 2844
    :cond_73
    const/4 v10, -0x1

    .line 2845
    :goto_35
    iget v1, v0, LK2/c;->p:I

    .line 2846
    .line 2847
    const/high16 v11, -0x40800000    # -1.0f

    .line 2848
    .line 2849
    if-eq v1, v10, :cond_74

    .line 2850
    .line 2851
    iget v14, v0, LK2/c;->q:I

    .line 2852
    .line 2853
    if-eq v14, v10, :cond_74

    .line 2854
    .line 2855
    iget v10, v0, LK2/c;->n:I

    .line 2856
    .line 2857
    mul-int/2addr v10, v1

    .line 2858
    int-to-float v1, v10

    .line 2859
    iget v10, v0, LK2/c;->m:I

    .line 2860
    .line 2861
    mul-int/2addr v10, v14

    .line 2862
    int-to-float v10, v10

    .line 2863
    div-float/2addr v1, v10

    .line 2864
    goto :goto_36

    .line 2865
    :cond_74
    move v1, v11

    .line 2866
    :goto_36
    iget-boolean v10, v0, LK2/c;->y:Z

    .line 2867
    .line 2868
    if-eqz v10, :cond_77

    .line 2869
    .line 2870
    iget v10, v0, LK2/c;->E:F

    .line 2871
    .line 2872
    cmpl-float v10, v10, v11

    .line 2873
    .line 2874
    if-eqz v10, :cond_75

    .line 2875
    .line 2876
    iget v10, v0, LK2/c;->F:F

    .line 2877
    .line 2878
    cmpl-float v10, v10, v11

    .line 2879
    .line 2880
    if-eqz v10, :cond_75

    .line 2881
    .line 2882
    iget v10, v0, LK2/c;->G:F

    .line 2883
    .line 2884
    cmpl-float v10, v10, v11

    .line 2885
    .line 2886
    if-eqz v10, :cond_75

    .line 2887
    .line 2888
    iget v10, v0, LK2/c;->H:F

    .line 2889
    .line 2890
    cmpl-float v10, v10, v11

    .line 2891
    .line 2892
    if-eqz v10, :cond_75

    .line 2893
    .line 2894
    iget v10, v0, LK2/c;->I:F

    .line 2895
    .line 2896
    cmpl-float v10, v10, v11

    .line 2897
    .line 2898
    if-eqz v10, :cond_75

    .line 2899
    .line 2900
    iget v10, v0, LK2/c;->J:F

    .line 2901
    .line 2902
    cmpl-float v10, v10, v11

    .line 2903
    .line 2904
    if-eqz v10, :cond_75

    .line 2905
    .line 2906
    iget v10, v0, LK2/c;->K:F

    .line 2907
    .line 2908
    cmpl-float v10, v10, v11

    .line 2909
    .line 2910
    if-eqz v10, :cond_75

    .line 2911
    .line 2912
    iget v10, v0, LK2/c;->L:F

    .line 2913
    .line 2914
    cmpl-float v10, v10, v11

    .line 2915
    .line 2916
    if-eqz v10, :cond_75

    .line 2917
    .line 2918
    iget v10, v0, LK2/c;->M:F

    .line 2919
    .line 2920
    cmpl-float v10, v10, v11

    .line 2921
    .line 2922
    if-eqz v10, :cond_75

    .line 2923
    .line 2924
    iget v10, v0, LK2/c;->N:F

    .line 2925
    .line 2926
    cmpl-float v10, v10, v11

    .line 2927
    .line 2928
    if-nez v10, :cond_76

    .line 2929
    .line 2930
    :cond_75
    const/16 v10, 0x19

    .line 2931
    .line 2932
    goto/16 :goto_37

    .line 2933
    .line 2934
    :cond_76
    const/16 v10, 0x19

    .line 2935
    .line 2936
    new-array v11, v10, [B

    .line 2937
    .line 2938
    invoke-static {v11}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 2939
    .line 2940
    .line 2941
    move-result-object v14

    .line 2942
    sget-object v15, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 2943
    .line 2944
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 2945
    .line 2946
    .line 2947
    move-result-object v14

    .line 2948
    const/4 v15, 0x0

    .line 2949
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 2950
    .line 2951
    .line 2952
    iget v15, v0, LK2/c;->E:F

    .line 2953
    .line 2954
    const v17, 0x47435000    # 50000.0f

    .line 2955
    .line 2956
    .line 2957
    mul-float v15, v15, v17

    .line 2958
    .line 2959
    const/high16 v21, 0x3f000000    # 0.5f

    .line 2960
    .line 2961
    add-float v15, v15, v21

    .line 2962
    .line 2963
    float-to-int v15, v15

    .line 2964
    int-to-short v15, v15

    .line 2965
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2966
    .line 2967
    .line 2968
    iget v15, v0, LK2/c;->F:F

    .line 2969
    .line 2970
    mul-float v15, v15, v17

    .line 2971
    .line 2972
    add-float v15, v15, v21

    .line 2973
    .line 2974
    float-to-int v15, v15

    .line 2975
    int-to-short v15, v15

    .line 2976
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2977
    .line 2978
    .line 2979
    iget v15, v0, LK2/c;->G:F

    .line 2980
    .line 2981
    mul-float v15, v15, v17

    .line 2982
    .line 2983
    add-float v15, v15, v21

    .line 2984
    .line 2985
    float-to-int v15, v15

    .line 2986
    int-to-short v15, v15

    .line 2987
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2988
    .line 2989
    .line 2990
    iget v15, v0, LK2/c;->H:F

    .line 2991
    .line 2992
    mul-float v15, v15, v17

    .line 2993
    .line 2994
    add-float v15, v15, v21

    .line 2995
    .line 2996
    float-to-int v15, v15

    .line 2997
    int-to-short v15, v15

    .line 2998
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2999
    .line 3000
    .line 3001
    iget v15, v0, LK2/c;->I:F

    .line 3002
    .line 3003
    mul-float v15, v15, v17

    .line 3004
    .line 3005
    add-float v15, v15, v21

    .line 3006
    .line 3007
    float-to-int v15, v15

    .line 3008
    int-to-short v15, v15

    .line 3009
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3010
    .line 3011
    .line 3012
    iget v15, v0, LK2/c;->J:F

    .line 3013
    .line 3014
    mul-float v15, v15, v17

    .line 3015
    .line 3016
    add-float v15, v15, v21

    .line 3017
    .line 3018
    float-to-int v15, v15

    .line 3019
    int-to-short v15, v15

    .line 3020
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3021
    .line 3022
    .line 3023
    iget v15, v0, LK2/c;->K:F

    .line 3024
    .line 3025
    mul-float v15, v15, v17

    .line 3026
    .line 3027
    add-float v15, v15, v21

    .line 3028
    .line 3029
    float-to-int v15, v15

    .line 3030
    int-to-short v15, v15

    .line 3031
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3032
    .line 3033
    .line 3034
    iget v15, v0, LK2/c;->L:F

    .line 3035
    .line 3036
    mul-float v15, v15, v17

    .line 3037
    .line 3038
    add-float v15, v15, v21

    .line 3039
    .line 3040
    float-to-int v15, v15

    .line 3041
    int-to-short v15, v15

    .line 3042
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3043
    .line 3044
    .line 3045
    iget v15, v0, LK2/c;->M:F

    .line 3046
    .line 3047
    add-float v15, v15, v21

    .line 3048
    .line 3049
    float-to-int v15, v15

    .line 3050
    int-to-short v15, v15

    .line 3051
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3052
    .line 3053
    .line 3054
    iget v15, v0, LK2/c;->N:F

    .line 3055
    .line 3056
    add-float v15, v15, v21

    .line 3057
    .line 3058
    float-to-int v15, v15

    .line 3059
    int-to-short v15, v15

    .line 3060
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3061
    .line 3062
    .line 3063
    iget v15, v0, LK2/c;->C:I

    .line 3064
    .line 3065
    int-to-short v15, v15

    .line 3066
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3067
    .line 3068
    .line 3069
    iget v15, v0, LK2/c;->D:I

    .line 3070
    .line 3071
    int-to-short v15, v15

    .line 3072
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3073
    .line 3074
    .line 3075
    move-object/from16 v49, v11

    .line 3076
    .line 3077
    goto :goto_38

    .line 3078
    :goto_37
    const/16 v49, 0x0

    .line 3079
    .line 3080
    :goto_38
    iget v11, v0, LK2/c;->z:I

    .line 3081
    .line 3082
    iget v14, v0, LK2/c;->B:I

    .line 3083
    .line 3084
    iget v15, v0, LK2/c;->A:I

    .line 3085
    .line 3086
    iget v10, v0, LK2/c;->o:I

    .line 3087
    .line 3088
    new-instance v43, LN1/f;

    .line 3089
    .line 3090
    move/from16 v48, v10

    .line 3091
    .line 3092
    move/from16 v47, v10

    .line 3093
    .line 3094
    move/from16 v44, v11

    .line 3095
    .line 3096
    move/from16 v45, v14

    .line 3097
    .line 3098
    move/from16 v46, v15

    .line 3099
    .line 3100
    invoke-direct/range {v43 .. v49}, LN1/f;-><init>(IIIII[B)V

    .line 3101
    .line 3102
    .line 3103
    move-object/from16 v10, v43

    .line 3104
    .line 3105
    goto :goto_39

    .line 3106
    :cond_77
    const/4 v10, 0x0

    .line 3107
    :goto_39
    iget-object v11, v0, LK2/c;->a:Ljava/lang/String;

    .line 3108
    .line 3109
    if-eqz v11, :cond_78

    .line 3110
    .line 3111
    invoke-interface {v4, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 3112
    .line 3113
    .line 3114
    move-result v11

    .line 3115
    if-eqz v11, :cond_78

    .line 3116
    .line 3117
    iget-object v11, v0, LK2/c;->a:Ljava/lang/String;

    .line 3118
    .line 3119
    invoke-interface {v4, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3120
    .line 3121
    .line 3122
    move-result-object v11

    .line 3123
    check-cast v11, Ljava/lang/Integer;

    .line 3124
    .line 3125
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 3126
    .line 3127
    .line 3128
    move-result v11

    .line 3129
    goto :goto_3a

    .line 3130
    :cond_78
    const/4 v11, -0x1

    .line 3131
    :goto_3a
    iget v14, v0, LK2/c;->s:I

    .line 3132
    .line 3133
    if-nez v14, :cond_7d

    .line 3134
    .line 3135
    iget v14, v0, LK2/c;->t:F

    .line 3136
    .line 3137
    const/4 v15, 0x0

    .line 3138
    invoke-static {v14, v15}, Ljava/lang/Float;->compare(FF)I

    .line 3139
    .line 3140
    .line 3141
    move-result v14

    .line 3142
    if-nez v14, :cond_7d

    .line 3143
    .line 3144
    iget v14, v0, LK2/c;->u:F

    .line 3145
    .line 3146
    invoke-static {v14, v15}, Ljava/lang/Float;->compare(FF)I

    .line 3147
    .line 3148
    .line 3149
    move-result v14

    .line 3150
    if-nez v14, :cond_7d

    .line 3151
    .line 3152
    iget v14, v0, LK2/c;->v:F

    .line 3153
    .line 3154
    invoke-static {v14, v15}, Ljava/lang/Float;->compare(FF)I

    .line 3155
    .line 3156
    .line 3157
    move-result v14

    .line 3158
    if-nez v14, :cond_79

    .line 3159
    .line 3160
    const/4 v11, 0x0

    .line 3161
    goto :goto_3c

    .line 3162
    :cond_79
    iget v14, v0, LK2/c;->v:F

    .line 3163
    .line 3164
    const/high16 v15, 0x42b40000    # 90.0f

    .line 3165
    .line 3166
    invoke-static {v14, v15}, Ljava/lang/Float;->compare(FF)I

    .line 3167
    .line 3168
    .line 3169
    move-result v14

    .line 3170
    if-nez v14, :cond_7a

    .line 3171
    .line 3172
    const/16 v11, 0x5a

    .line 3173
    .line 3174
    goto :goto_3c

    .line 3175
    :cond_7a
    iget v14, v0, LK2/c;->v:F

    .line 3176
    .line 3177
    const/high16 v15, -0x3ccc0000    # -180.0f

    .line 3178
    .line 3179
    invoke-static {v14, v15}, Ljava/lang/Float;->compare(FF)I

    .line 3180
    .line 3181
    .line 3182
    move-result v14

    .line 3183
    if-eqz v14, :cond_7c

    .line 3184
    .line 3185
    iget v14, v0, LK2/c;->v:F

    .line 3186
    .line 3187
    const/high16 v15, 0x43340000    # 180.0f

    .line 3188
    .line 3189
    invoke-static {v14, v15}, Ljava/lang/Float;->compare(FF)I

    .line 3190
    .line 3191
    .line 3192
    move-result v14

    .line 3193
    if-nez v14, :cond_7b

    .line 3194
    .line 3195
    goto :goto_3b

    .line 3196
    :cond_7b
    iget v14, v0, LK2/c;->v:F

    .line 3197
    .line 3198
    const/high16 v15, -0x3d4c0000    # -90.0f

    .line 3199
    .line 3200
    invoke-static {v14, v15}, Ljava/lang/Float;->compare(FF)I

    .line 3201
    .line 3202
    .line 3203
    move-result v14

    .line 3204
    if-nez v14, :cond_7d

    .line 3205
    .line 3206
    const/16 v11, 0x10e

    .line 3207
    .line 3208
    goto :goto_3c

    .line 3209
    :cond_7c
    :goto_3b
    const/16 v11, 0xb4

    .line 3210
    .line 3211
    :cond_7d
    :goto_3c
    iget v14, v0, LK2/c;->m:I

    .line 3212
    .line 3213
    iput v14, v13, LN1/m;->t:I

    .line 3214
    .line 3215
    iget v14, v0, LK2/c;->n:I

    .line 3216
    .line 3217
    iput v14, v13, LN1/m;->u:I

    .line 3218
    .line 3219
    iput v1, v13, LN1/m;->x:F

    .line 3220
    .line 3221
    iput v11, v13, LN1/m;->w:I

    .line 3222
    .line 3223
    iget-object v1, v0, LK2/c;->w:[B

    .line 3224
    .line 3225
    iput-object v1, v13, LN1/m;->y:[B

    .line 3226
    .line 3227
    iget v1, v0, LK2/c;->x:I

    .line 3228
    .line 3229
    iput v1, v13, LN1/m;->z:I

    .line 3230
    .line 3231
    iput-object v10, v13, LN1/m;->A:LN1/f;

    .line 3232
    .line 3233
    const/4 v1, 0x2

    .line 3234
    goto/16 :goto_34

    .line 3235
    .line 3236
    :cond_7e
    const/16 v17, 0x19

    .line 3237
    .line 3238
    invoke-virtual {v15, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3239
    .line 3240
    .line 3241
    move-result v1

    .line 3242
    if-nez v1, :cond_80

    .line 3243
    .line 3244
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3245
    .line 3246
    .line 3247
    move-result v1

    .line 3248
    if-nez v1, :cond_80

    .line 3249
    .line 3250
    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3251
    .line 3252
    .line 3253
    move-result v1

    .line 3254
    if-nez v1, :cond_80

    .line 3255
    .line 3256
    invoke-virtual {v14, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3257
    .line 3258
    .line 3259
    move-result v1

    .line 3260
    if-nez v1, :cond_80

    .line 3261
    .line 3262
    move-object/from16 v1, v36

    .line 3263
    .line 3264
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3265
    .line 3266
    .line 3267
    move-result v1

    .line 3268
    if-nez v1, :cond_80

    .line 3269
    .line 3270
    move-object/from16 v1, v35

    .line 3271
    .line 3272
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3273
    .line 3274
    .line 3275
    move-result v1

    .line 3276
    if-eqz v1, :cond_7f

    .line 3277
    .line 3278
    goto :goto_3d

    .line 3279
    :cond_7f
    const-string v0, "Unexpected MIME type."

    .line 3280
    .line 3281
    const/4 v1, 0x0

    .line 3282
    invoke-static {v1, v0}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 3283
    .line 3284
    .line 3285
    move-result-object v0

    .line 3286
    throw v0

    .line 3287
    :cond_80
    :goto_3d
    const/4 v1, 0x3

    .line 3288
    :goto_3e
    iget-object v10, v0, LK2/c;->a:Ljava/lang/String;

    .line 3289
    .line 3290
    if-eqz v10, :cond_81

    .line 3291
    .line 3292
    invoke-interface {v4, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 3293
    .line 3294
    .line 3295
    move-result v4

    .line 3296
    if-nez v4, :cond_81

    .line 3297
    .line 3298
    iget-object v4, v0, LK2/c;->a:Ljava/lang/String;

    .line 3299
    .line 3300
    iput-object v4, v13, LN1/m;->b:Ljava/lang/String;

    .line 3301
    .line 3302
    :cond_81
    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 3303
    .line 3304
    .line 3305
    move-result-object v4

    .line 3306
    iput-object v4, v13, LN1/m;->a:Ljava/lang/String;

    .line 3307
    .line 3308
    invoke-static {v8}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 3309
    .line 3310
    .line 3311
    move-result-object v4

    .line 3312
    iput-object v4, v13, LN1/m;->m:Ljava/lang/String;

    .line 3313
    .line 3314
    iput v2, v13, LN1/m;->n:I

    .line 3315
    .line 3316
    iget-object v2, v0, LK2/c;->X:Ljava/lang/String;

    .line 3317
    .line 3318
    iput-object v2, v13, LN1/m;->d:Ljava/lang/String;

    .line 3319
    .line 3320
    iput v5, v13, LN1/m;->e:I

    .line 3321
    .line 3322
    iput-object v3, v13, LN1/m;->p:Ljava/util/List;

    .line 3323
    .line 3324
    iput-object v12, v13, LN1/m;->j:Ljava/lang/String;

    .line 3325
    .line 3326
    iget-object v2, v0, LK2/c;->l:LN1/j;

    .line 3327
    .line 3328
    iput-object v2, v13, LN1/m;->q:LN1/j;

    .line 3329
    .line 3330
    new-instance v2, LN1/n;

    .line 3331
    .line 3332
    invoke-direct {v2, v13}, LN1/n;-><init>(LN1/m;)V

    .line 3333
    .line 3334
    .line 3335
    iget v3, v0, LK2/c;->c:I

    .line 3336
    .line 3337
    move-object/from16 v4, v34

    .line 3338
    .line 3339
    invoke-interface {v4, v3, v1}, Ls2/o;->m(II)Ls2/C;

    .line 3340
    .line 3341
    .line 3342
    move-result-object v1

    .line 3343
    iput-object v1, v0, LK2/c;->Y:Ls2/C;

    .line 3344
    .line 3345
    invoke-interface {v1, v2}, Ls2/C;->c(LN1/n;)V

    .line 3346
    .line 3347
    .line 3348
    iget v1, v0, LK2/c;->c:I

    .line 3349
    .line 3350
    move-object/from16 v2, v33

    .line 3351
    .line 3352
    invoke-virtual {v2, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 3353
    .line 3354
    .line 3355
    move-object/from16 v8, v32

    .line 3356
    .line 3357
    goto/16 :goto_13

    .line 3358
    .line 3359
    :goto_3f
    iput-object v1, v8, LK2/d;->w:LK2/c;

    .line 3360
    .line 3361
    :goto_40
    move-object/from16 v5, v39

    .line 3362
    .line 3363
    const/4 v3, 0x0

    .line 3364
    goto/16 :goto_47

    .line 3365
    .line 3366
    :cond_82
    const/4 v1, 0x0

    .line 3367
    const-string v0, "CodecId is missing in TrackEntry element"

    .line 3368
    .line 3369
    invoke-static {v1, v0}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 3370
    .line 3371
    .line 3372
    move-result-object v0

    .line 3373
    throw v0

    .line 3374
    :cond_83
    move-object/from16 v40, v2

    .line 3375
    .line 3376
    move-object/from16 v41, v3

    .line 3377
    .line 3378
    move-object/from16 v42, v4

    .line 3379
    .line 3380
    move-object v9, v7

    .line 3381
    move-object v2, v10

    .line 3382
    move-object/from16 v39, v30

    .line 3383
    .line 3384
    const/16 v17, 0x19

    .line 3385
    .line 3386
    const/16 v19, 0xf

    .line 3387
    .line 3388
    move-object v7, v6

    .line 3389
    move-object v6, v5

    .line 3390
    iget v0, v8, LK2/d;->I:I

    .line 3391
    .line 3392
    const/4 v5, 0x2

    .line 3393
    if-eq v0, v5, :cond_84

    .line 3394
    .line 3395
    :goto_41
    goto :goto_40

    .line 3396
    :cond_84
    iget v0, v8, LK2/d;->O:I

    .line 3397
    .line 3398
    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 3399
    .line 3400
    .line 3401
    move-result-object v0

    .line 3402
    check-cast v0, LK2/c;

    .line 3403
    .line 3404
    iget-object v1, v0, LK2/c;->Y:Ls2/C;

    .line 3405
    .line 3406
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3407
    .line 3408
    .line 3409
    iget-wide v1, v8, LK2/d;->T:J

    .line 3410
    .line 3411
    const-wide/16 v3, 0x0

    .line 3412
    .line 3413
    cmp-long v1, v1, v3

    .line 3414
    .line 3415
    if-lez v1, :cond_85

    .line 3416
    .line 3417
    iget-object v1, v0, LK2/c;->b:Ljava/lang/String;

    .line 3418
    .line 3419
    move-object/from16 v5, v39

    .line 3420
    .line 3421
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3422
    .line 3423
    .line 3424
    move-result v1

    .line 3425
    if-eqz v1, :cond_86

    .line 3426
    .line 3427
    const/16 v23, 0x8

    .line 3428
    .line 3429
    invoke-static/range {v23 .. v23}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 3430
    .line 3431
    .line 3432
    move-result-object v1

    .line 3433
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 3434
    .line 3435
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 3436
    .line 3437
    .line 3438
    move-result-object v1

    .line 3439
    iget-wide v2, v8, LK2/d;->T:J

    .line 3440
    .line 3441
    invoke-virtual {v1, v2, v3}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 3442
    .line 3443
    .line 3444
    move-result-object v1

    .line 3445
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    .line 3446
    .line 3447
    .line 3448
    move-result-object v1

    .line 3449
    iget-object v2, v8, LK2/d;->p:LQ1/o;

    .line 3450
    .line 3451
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3452
    .line 3453
    .line 3454
    array-length v3, v1

    .line 3455
    invoke-virtual {v2, v3, v1}, LQ1/o;->E(I[B)V

    .line 3456
    .line 3457
    .line 3458
    goto :goto_42

    .line 3459
    :cond_85
    move-object/from16 v5, v39

    .line 3460
    .line 3461
    :cond_86
    :goto_42
    const/4 v1, 0x0

    .line 3462
    const/4 v2, 0x0

    .line 3463
    :goto_43
    iget v3, v8, LK2/d;->M:I

    .line 3464
    .line 3465
    if-ge v1, v3, :cond_87

    .line 3466
    .line 3467
    iget-object v3, v8, LK2/d;->N:[I

    .line 3468
    .line 3469
    aget v3, v3, v1

    .line 3470
    .line 3471
    add-int/2addr v2, v3

    .line 3472
    const/16 v31, 0x1

    .line 3473
    .line 3474
    add-int/lit8 v1, v1, 0x1

    .line 3475
    .line 3476
    goto :goto_43

    .line 3477
    :cond_87
    const/4 v1, 0x0

    .line 3478
    :goto_44
    iget v3, v8, LK2/d;->M:I

    .line 3479
    .line 3480
    if-ge v1, v3, :cond_89

    .line 3481
    .line 3482
    iget-wide v3, v8, LK2/d;->J:J

    .line 3483
    .line 3484
    iget v10, v0, LK2/c;->e:I

    .line 3485
    .line 3486
    mul-int/2addr v10, v1

    .line 3487
    div-int/lit16 v10, v10, 0x3e8

    .line 3488
    .line 3489
    int-to-long v10, v10

    .line 3490
    add-long v34, v3, v10

    .line 3491
    .line 3492
    iget v3, v8, LK2/d;->Q:I

    .line 3493
    .line 3494
    if-nez v1, :cond_88

    .line 3495
    .line 3496
    iget-boolean v4, v8, LK2/d;->S:Z

    .line 3497
    .line 3498
    if-nez v4, :cond_88

    .line 3499
    .line 3500
    const/16 v31, 0x1

    .line 3501
    .line 3502
    or-int/lit8 v3, v3, 0x1

    .line 3503
    .line 3504
    :goto_45
    move/from16 v36, v3

    .line 3505
    .line 3506
    goto :goto_46

    .line 3507
    :cond_88
    const/16 v31, 0x1

    .line 3508
    .line 3509
    goto :goto_45

    .line 3510
    :goto_46
    iget-object v3, v8, LK2/d;->N:[I

    .line 3511
    .line 3512
    aget v37, v3, v1

    .line 3513
    .line 3514
    sub-int v38, v2, v37

    .line 3515
    .line 3516
    move-object/from16 v33, v0

    .line 3517
    .line 3518
    move-object/from16 v32, v8

    .line 3519
    .line 3520
    invoke-virtual/range {v32 .. v38}, LK2/d;->d(LK2/c;JIII)V

    .line 3521
    .line 3522
    .line 3523
    add-int/lit8 v1, v1, 0x1

    .line 3524
    .line 3525
    move/from16 v2, v38

    .line 3526
    .line 3527
    goto :goto_44

    .line 3528
    :cond_89
    const/4 v3, 0x0

    .line 3529
    iput v3, v8, LK2/d;->I:I

    .line 3530
    .line 3531
    :goto_47
    const/4 v3, 0x2

    .line 3532
    const/16 v4, 0x8

    .line 3533
    .line 3534
    const/4 v8, 0x3

    .line 3535
    const/4 v10, 0x5

    .line 3536
    const/4 v11, 0x4

    .line 3537
    :goto_48
    const/16 v21, 0x1

    .line 3538
    .line 3539
    goto/16 :goto_5b

    .line 3540
    .line 3541
    :cond_8a
    move-object v9, v7

    .line 3542
    move-object v7, v6

    .line 3543
    move-object v6, v5

    .line 3544
    move-object/from16 v5, v30

    .line 3545
    .line 3546
    :goto_49
    move-object/from16 v40, v2

    .line 3547
    .line 3548
    move-object/from16 v41, v3

    .line 3549
    .line 3550
    move-object/from16 v42, v4

    .line 3551
    .line 3552
    move/from16 v3, v24

    .line 3553
    .line 3554
    const/16 v17, 0x19

    .line 3555
    .line 3556
    const/16 v19, 0xf

    .line 3557
    .line 3558
    goto :goto_4a

    .line 3559
    :cond_8b
    move-object v9, v7

    .line 3560
    move-object v7, v6

    .line 3561
    move-object v6, v5

    .line 3562
    move-object v5, v10

    .line 3563
    goto :goto_49

    .line 3564
    :goto_4a
    iget v0, v12, LK2/b;->c:I

    .line 3565
    .line 3566
    iget-object v1, v12, LK2/b;->f:Ljava/lang/Object;

    .line 3567
    .line 3568
    check-cast v1, LK2/e;

    .line 3569
    .line 3570
    if-nez v0, :cond_91

    .line 3571
    .line 3572
    move-object/from16 v0, p1

    .line 3573
    .line 3574
    check-cast v0, Ls2/j;

    .line 3575
    .line 3576
    const/4 v2, 0x1

    .line 3577
    const/4 v4, 0x4

    .line 3578
    invoke-virtual {v1, v0, v2, v3, v4}, LK2/e;->c(Ls2/j;ZZI)J

    .line 3579
    .line 3580
    .line 3581
    move-result-wide v10

    .line 3582
    const-wide/16 v32, -0x2

    .line 3583
    .line 3584
    cmp-long v2, v10, v32

    .line 3585
    .line 3586
    if-nez v2, :cond_8e

    .line 3587
    .line 3588
    iput v3, v0, Ls2/j;->f:I

    .line 3589
    .line 3590
    :goto_4b
    iget-object v0, v12, LK2/b;->a:[B

    .line 3591
    .line 3592
    move-object/from16 v2, p1

    .line 3593
    .line 3594
    check-cast v2, Ls2/j;

    .line 3595
    .line 3596
    invoke-virtual {v2, v0, v3, v4, v3}, Ls2/j;->c([BIIZ)Z

    .line 3597
    .line 3598
    .line 3599
    aget-byte v8, v0, v3

    .line 3600
    .line 3601
    invoke-static {v8}, LK2/e;->b(I)I

    .line 3602
    .line 3603
    .line 3604
    move-result v8

    .line 3605
    const/4 v10, -0x1

    .line 3606
    if-eq v8, v10, :cond_8f

    .line 3607
    .line 3608
    if-gt v8, v4, :cond_8f

    .line 3609
    .line 3610
    invoke-static {v0, v8, v3}, LK2/e;->a([BIZ)J

    .line 3611
    .line 3612
    .line 3613
    move-result-wide v10

    .line 3614
    long-to-int v0, v10

    .line 3615
    iget-object v3, v12, LK2/b;->g:Ljava/lang/Object;

    .line 3616
    .line 3617
    check-cast v3, LA/e0;

    .line 3618
    .line 3619
    iget-object v3, v3, LA/e0;->b:Ljava/lang/Object;

    .line 3620
    .line 3621
    check-cast v3, LK2/d;

    .line 3622
    .line 3623
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3624
    .line 3625
    .line 3626
    if-eq v0, v14, :cond_8d

    .line 3627
    .line 3628
    const v3, 0x1f43b675

    .line 3629
    .line 3630
    .line 3631
    if-eq v0, v3, :cond_8d

    .line 3632
    .line 3633
    const v15, 0x1c53bb6b

    .line 3634
    .line 3635
    .line 3636
    if-eq v0, v15, :cond_8d

    .line 3637
    .line 3638
    if-ne v0, v13, :cond_8c

    .line 3639
    .line 3640
    goto :goto_4d

    .line 3641
    :cond_8c
    :goto_4c
    const/4 v0, 0x1

    .line 3642
    goto :goto_4e

    .line 3643
    :cond_8d
    :goto_4d
    invoke-virtual {v2, v8}, Ls2/j;->j(I)V

    .line 3644
    .line 3645
    .line 3646
    int-to-long v10, v0

    .line 3647
    :cond_8e
    const/4 v0, 0x1

    .line 3648
    goto :goto_4f

    .line 3649
    :cond_8f
    const v15, 0x1c53bb6b

    .line 3650
    .line 3651
    .line 3652
    goto :goto_4c

    .line 3653
    :goto_4e
    invoke-virtual {v2, v0}, Ls2/j;->j(I)V

    .line 3654
    .line 3655
    .line 3656
    const/4 v3, 0x0

    .line 3657
    const/4 v4, 0x4

    .line 3658
    goto :goto_4b

    .line 3659
    :goto_4f
    cmp-long v2, v10, v25

    .line 3660
    .line 3661
    if-nez v2, :cond_90

    .line 3662
    .line 3663
    const/4 v3, 0x2

    .line 3664
    const/16 v4, 0x8

    .line 3665
    .line 3666
    const/4 v8, 0x3

    .line 3667
    const/4 v10, 0x5

    .line 3668
    const/4 v11, 0x4

    .line 3669
    const/16 v21, 0x0

    .line 3670
    .line 3671
    goto/16 :goto_5b

    .line 3672
    .line 3673
    :cond_90
    long-to-int v2, v10

    .line 3674
    iput v2, v12, LK2/b;->d:I

    .line 3675
    .line 3676
    iput v0, v12, LK2/b;->c:I

    .line 3677
    .line 3678
    goto :goto_50

    .line 3679
    :cond_91
    const/4 v0, 0x1

    .line 3680
    :goto_50
    iget v2, v12, LK2/b;->c:I

    .line 3681
    .line 3682
    if-ne v2, v0, :cond_92

    .line 3683
    .line 3684
    move-object/from16 v2, p1

    .line 3685
    .line 3686
    check-cast v2, Ls2/j;

    .line 3687
    .line 3688
    const/4 v3, 0x0

    .line 3689
    const/16 v4, 0x8

    .line 3690
    .line 3691
    invoke-virtual {v1, v2, v3, v0, v4}, LK2/e;->c(Ls2/j;ZZI)J

    .line 3692
    .line 3693
    .line 3694
    move-result-wide v1

    .line 3695
    iput-wide v1, v12, LK2/b;->e:J

    .line 3696
    .line 3697
    const/4 v0, 0x2

    .line 3698
    iput v0, v12, LK2/b;->c:I

    .line 3699
    .line 3700
    goto :goto_51

    .line 3701
    :cond_92
    const/16 v4, 0x8

    .line 3702
    .line 3703
    :goto_51
    iget-object v0, v12, LK2/b;->g:Ljava/lang/Object;

    .line 3704
    .line 3705
    check-cast v0, LA/e0;

    .line 3706
    .line 3707
    iget v1, v12, LK2/b;->d:I

    .line 3708
    .line 3709
    iget-object v0, v0, LA/e0;->b:Ljava/lang/Object;

    .line 3710
    .line 3711
    check-cast v0, LK2/d;

    .line 3712
    .line 3713
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3714
    .line 3715
    .line 3716
    sparse-switch v1, :sswitch_data_2

    .line 3717
    .line 3718
    .line 3719
    const/4 v0, 0x0

    .line 3720
    goto :goto_52

    .line 3721
    :sswitch_42
    const/4 v0, 0x5

    .line 3722
    goto :goto_52

    .line 3723
    :sswitch_43
    const/4 v0, 0x4

    .line 3724
    goto :goto_52

    .line 3725
    :sswitch_44
    const/4 v0, 0x1

    .line 3726
    goto :goto_52

    .line 3727
    :sswitch_45
    const/4 v0, 0x3

    .line 3728
    goto :goto_52

    .line 3729
    :sswitch_46
    const/4 v0, 0x2

    .line 3730
    :goto_52
    if-eqz v0, :cond_aa

    .line 3731
    .line 3732
    const/4 v2, 0x1

    .line 3733
    if-eq v0, v2, :cond_a6

    .line 3734
    .line 3735
    const-wide/16 v1, 0x8

    .line 3736
    .line 3737
    const/4 v3, 0x2

    .line 3738
    if-eq v0, v3, :cond_a4

    .line 3739
    .line 3740
    const/4 v8, 0x3

    .line 3741
    if-eq v0, v8, :cond_9a

    .line 3742
    .line 3743
    const/4 v10, 0x4

    .line 3744
    if-eq v0, v10, :cond_99

    .line 3745
    .line 3746
    const/4 v10, 0x5

    .line 3747
    if-ne v0, v10, :cond_98

    .line 3748
    .line 3749
    iget-wide v13, v12, LK2/b;->e:J

    .line 3750
    .line 3751
    const-wide/16 v32, 0x4

    .line 3752
    .line 3753
    cmp-long v0, v13, v32

    .line 3754
    .line 3755
    if-eqz v0, :cond_94

    .line 3756
    .line 3757
    cmp-long v0, v13, v1

    .line 3758
    .line 3759
    if-nez v0, :cond_93

    .line 3760
    .line 3761
    goto :goto_53

    .line 3762
    :cond_93
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3763
    .line 3764
    const-string v1, "Invalid float size: "

    .line 3765
    .line 3766
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3767
    .line 3768
    .line 3769
    iget-wide v1, v12, LK2/b;->e:J

    .line 3770
    .line 3771
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 3772
    .line 3773
    .line 3774
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3775
    .line 3776
    .line 3777
    move-result-object v0

    .line 3778
    const/4 v1, 0x0

    .line 3779
    invoke-static {v1, v0}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 3780
    .line 3781
    .line 3782
    move-result-object v0

    .line 3783
    throw v0

    .line 3784
    :cond_94
    :goto_53
    iget-object v0, v12, LK2/b;->g:Ljava/lang/Object;

    .line 3785
    .line 3786
    check-cast v0, LA/e0;

    .line 3787
    .line 3788
    iget v1, v12, LK2/b;->d:I

    .line 3789
    .line 3790
    long-to-int v2, v13

    .line 3791
    move-object/from16 v11, p1

    .line 3792
    .line 3793
    check-cast v11, Ls2/j;

    .line 3794
    .line 3795
    invoke-virtual {v12, v11, v2}, LK2/b;->b(Ls2/j;I)J

    .line 3796
    .line 3797
    .line 3798
    move-result-wide v13

    .line 3799
    const/4 v11, 0x4

    .line 3800
    if-ne v2, v11, :cond_95

    .line 3801
    .line 3802
    long-to-int v2, v13

    .line 3803
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 3804
    .line 3805
    .line 3806
    move-result v2

    .line 3807
    float-to-double v13, v2

    .line 3808
    goto :goto_54

    .line 3809
    :cond_95
    invoke-static {v13, v14}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 3810
    .line 3811
    .line 3812
    move-result-wide v13

    .line 3813
    :goto_54
    iget-object v0, v0, LA/e0;->b:Ljava/lang/Object;

    .line 3814
    .line 3815
    check-cast v0, LK2/d;

    .line 3816
    .line 3817
    const/16 v2, 0xb5

    .line 3818
    .line 3819
    if-eq v1, v2, :cond_97

    .line 3820
    .line 3821
    const/16 v2, 0x4489

    .line 3822
    .line 3823
    if-eq v1, v2, :cond_96

    .line 3824
    .line 3825
    packed-switch v1, :pswitch_data_2

    .line 3826
    .line 3827
    .line 3828
    packed-switch v1, :pswitch_data_3

    .line 3829
    .line 3830
    .line 3831
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3832
    .line 3833
    .line 3834
    :goto_55
    const/4 v13, 0x0

    .line 3835
    goto/16 :goto_56

    .line 3836
    .line 3837
    :pswitch_1f
    invoke-virtual {v0, v1}, LK2/d;->c(I)V

    .line 3838
    .line 3839
    .line 3840
    iget-object v0, v0, LK2/d;->w:LK2/c;

    .line 3841
    .line 3842
    double-to-float v1, v13

    .line 3843
    iput v1, v0, LK2/c;->v:F

    .line 3844
    .line 3845
    goto :goto_55

    .line 3846
    :pswitch_20
    invoke-virtual {v0, v1}, LK2/d;->c(I)V

    .line 3847
    .line 3848
    .line 3849
    iget-object v0, v0, LK2/d;->w:LK2/c;

    .line 3850
    .line 3851
    double-to-float v1, v13

    .line 3852
    iput v1, v0, LK2/c;->u:F

    .line 3853
    .line 3854
    goto :goto_55

    .line 3855
    :pswitch_21
    invoke-virtual {v0, v1}, LK2/d;->c(I)V

    .line 3856
    .line 3857
    .line 3858
    iget-object v0, v0, LK2/d;->w:LK2/c;

    .line 3859
    .line 3860
    double-to-float v1, v13

    .line 3861
    iput v1, v0, LK2/c;->t:F

    .line 3862
    .line 3863
    goto :goto_55

    .line 3864
    :pswitch_22
    invoke-virtual {v0, v1}, LK2/d;->c(I)V

    .line 3865
    .line 3866
    .line 3867
    iget-object v0, v0, LK2/d;->w:LK2/c;

    .line 3868
    .line 3869
    double-to-float v1, v13

    .line 3870
    iput v1, v0, LK2/c;->N:F

    .line 3871
    .line 3872
    goto :goto_55

    .line 3873
    :pswitch_23
    invoke-virtual {v0, v1}, LK2/d;->c(I)V

    .line 3874
    .line 3875
    .line 3876
    iget-object v0, v0, LK2/d;->w:LK2/c;

    .line 3877
    .line 3878
    double-to-float v1, v13

    .line 3879
    iput v1, v0, LK2/c;->M:F

    .line 3880
    .line 3881
    goto :goto_55

    .line 3882
    :pswitch_24
    invoke-virtual {v0, v1}, LK2/d;->c(I)V

    .line 3883
    .line 3884
    .line 3885
    iget-object v0, v0, LK2/d;->w:LK2/c;

    .line 3886
    .line 3887
    double-to-float v1, v13

    .line 3888
    iput v1, v0, LK2/c;->L:F

    .line 3889
    .line 3890
    goto :goto_55

    .line 3891
    :pswitch_25
    invoke-virtual {v0, v1}, LK2/d;->c(I)V

    .line 3892
    .line 3893
    .line 3894
    iget-object v0, v0, LK2/d;->w:LK2/c;

    .line 3895
    .line 3896
    double-to-float v1, v13

    .line 3897
    iput v1, v0, LK2/c;->K:F

    .line 3898
    .line 3899
    goto :goto_55

    .line 3900
    :pswitch_26
    invoke-virtual {v0, v1}, LK2/d;->c(I)V

    .line 3901
    .line 3902
    .line 3903
    iget-object v0, v0, LK2/d;->w:LK2/c;

    .line 3904
    .line 3905
    double-to-float v1, v13

    .line 3906
    iput v1, v0, LK2/c;->J:F

    .line 3907
    .line 3908
    goto :goto_55

    .line 3909
    :pswitch_27
    invoke-virtual {v0, v1}, LK2/d;->c(I)V

    .line 3910
    .line 3911
    .line 3912
    iget-object v0, v0, LK2/d;->w:LK2/c;

    .line 3913
    .line 3914
    double-to-float v1, v13

    .line 3915
    iput v1, v0, LK2/c;->I:F

    .line 3916
    .line 3917
    goto :goto_55

    .line 3918
    :pswitch_28
    invoke-virtual {v0, v1}, LK2/d;->c(I)V

    .line 3919
    .line 3920
    .line 3921
    iget-object v0, v0, LK2/d;->w:LK2/c;

    .line 3922
    .line 3923
    double-to-float v1, v13

    .line 3924
    iput v1, v0, LK2/c;->H:F

    .line 3925
    .line 3926
    goto :goto_55

    .line 3927
    :pswitch_29
    invoke-virtual {v0, v1}, LK2/d;->c(I)V

    .line 3928
    .line 3929
    .line 3930
    iget-object v0, v0, LK2/d;->w:LK2/c;

    .line 3931
    .line 3932
    double-to-float v1, v13

    .line 3933
    iput v1, v0, LK2/c;->G:F

    .line 3934
    .line 3935
    goto :goto_55

    .line 3936
    :pswitch_2a
    invoke-virtual {v0, v1}, LK2/d;->c(I)V

    .line 3937
    .line 3938
    .line 3939
    iget-object v0, v0, LK2/d;->w:LK2/c;

    .line 3940
    .line 3941
    double-to-float v1, v13

    .line 3942
    iput v1, v0, LK2/c;->F:F

    .line 3943
    .line 3944
    goto :goto_55

    .line 3945
    :pswitch_2b
    invoke-virtual {v0, v1}, LK2/d;->c(I)V

    .line 3946
    .line 3947
    .line 3948
    iget-object v0, v0, LK2/d;->w:LK2/c;

    .line 3949
    .line 3950
    double-to-float v1, v13

    .line 3951
    iput v1, v0, LK2/c;->E:F

    .line 3952
    .line 3953
    goto :goto_55

    .line 3954
    :cond_96
    double-to-long v1, v13

    .line 3955
    iput-wide v1, v0, LK2/d;->u:J

    .line 3956
    .line 3957
    goto :goto_55

    .line 3958
    :cond_97
    invoke-virtual {v0, v1}, LK2/d;->c(I)V

    .line 3959
    .line 3960
    .line 3961
    iget-object v0, v0, LK2/d;->w:LK2/c;

    .line 3962
    .line 3963
    double-to-int v1, v13

    .line 3964
    iput v1, v0, LK2/c;->R:I

    .line 3965
    .line 3966
    goto/16 :goto_55

    .line 3967
    .line 3968
    :goto_56
    iput v13, v12, LK2/b;->c:I

    .line 3969
    .line 3970
    goto/16 :goto_48

    .line 3971
    .line 3972
    :cond_98
    new-instance v1, Ljava/lang/StringBuilder;

    .line 3973
    .line 3974
    const-string v2, "Invalid element type "

    .line 3975
    .line 3976
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3977
    .line 3978
    .line 3979
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3980
    .line 3981
    .line 3982
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3983
    .line 3984
    .line 3985
    move-result-object v0

    .line 3986
    const/4 v1, 0x0

    .line 3987
    invoke-static {v1, v0}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 3988
    .line 3989
    .line 3990
    move-result-object v0

    .line 3991
    throw v0

    .line 3992
    :cond_99
    move v11, v10

    .line 3993
    const/4 v10, 0x5

    .line 3994
    iget-object v0, v12, LK2/b;->g:Ljava/lang/Object;

    .line 3995
    .line 3996
    check-cast v0, LA/e0;

    .line 3997
    .line 3998
    iget v1, v12, LK2/b;->d:I

    .line 3999
    .line 4000
    iget-wide v13, v12, LK2/b;->e:J

    .line 4001
    .line 4002
    long-to-int v2, v13

    .line 4003
    move-object/from16 v13, p1

    .line 4004
    .line 4005
    check-cast v13, Ls2/j;

    .line 4006
    .line 4007
    invoke-virtual {v0, v1, v2, v13}, LA/e0;->h(IILs2/j;)V

    .line 4008
    .line 4009
    .line 4010
    const/4 v13, 0x0

    .line 4011
    iput v13, v12, LK2/b;->c:I

    .line 4012
    .line 4013
    goto/16 :goto_48

    .line 4014
    .line 4015
    :cond_9a
    const/4 v10, 0x5

    .line 4016
    const/4 v11, 0x4

    .line 4017
    iget-wide v0, v12, LK2/b;->e:J

    .line 4018
    .line 4019
    const-wide/32 v13, 0x7fffffff

    .line 4020
    .line 4021
    .line 4022
    cmp-long v2, v0, v13

    .line 4023
    .line 4024
    if-gtz v2, :cond_a3

    .line 4025
    .line 4026
    iget-object v2, v12, LK2/b;->g:Ljava/lang/Object;

    .line 4027
    .line 4028
    check-cast v2, LA/e0;

    .line 4029
    .line 4030
    iget v13, v12, LK2/b;->d:I

    .line 4031
    .line 4032
    long-to-int v0, v0

    .line 4033
    if-nez v0, :cond_9b

    .line 4034
    .line 4035
    const-string v0, ""

    .line 4036
    .line 4037
    goto :goto_58

    .line 4038
    :cond_9b
    new-array v1, v0, [B

    .line 4039
    .line 4040
    move-object/from16 v14, p1

    .line 4041
    .line 4042
    check-cast v14, Ls2/j;

    .line 4043
    .line 4044
    const/4 v15, 0x0

    .line 4045
    invoke-virtual {v14, v1, v15, v0, v15}, Ls2/j;->f([BIIZ)Z

    .line 4046
    .line 4047
    .line 4048
    :goto_57
    if-lez v0, :cond_9c

    .line 4049
    .line 4050
    const/16 v31, 0x1

    .line 4051
    .line 4052
    add-int/lit8 v14, v0, -0x1

    .line 4053
    .line 4054
    aget-byte v14, v1, v14

    .line 4055
    .line 4056
    if-nez v14, :cond_9c

    .line 4057
    .line 4058
    const/16 v28, -0x1

    .line 4059
    .line 4060
    add-int/lit8 v0, v0, -0x1

    .line 4061
    .line 4062
    goto :goto_57

    .line 4063
    :cond_9c
    new-instance v14, Ljava/lang/String;

    .line 4064
    .line 4065
    const/4 v15, 0x0

    .line 4066
    invoke-direct {v14, v1, v15, v0}, Ljava/lang/String;-><init>([BII)V

    .line 4067
    .line 4068
    .line 4069
    move-object v0, v14

    .line 4070
    :goto_58
    iget-object v1, v2, LA/e0;->b:Ljava/lang/Object;

    .line 4071
    .line 4072
    check-cast v1, LK2/d;

    .line 4073
    .line 4074
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4075
    .line 4076
    .line 4077
    const/16 v2, 0x86

    .line 4078
    .line 4079
    if-eq v13, v2, :cond_a2

    .line 4080
    .line 4081
    const/16 v2, 0x4282

    .line 4082
    .line 4083
    if-eq v13, v2, :cond_a0

    .line 4084
    .line 4085
    const/16 v2, 0x536e

    .line 4086
    .line 4087
    if-eq v13, v2, :cond_9f

    .line 4088
    .line 4089
    const v2, 0x22b59c

    .line 4090
    .line 4091
    .line 4092
    if-eq v13, v2, :cond_9d

    .line 4093
    .line 4094
    goto :goto_59

    .line 4095
    :cond_9d
    invoke-virtual {v1, v13}, LK2/d;->c(I)V

    .line 4096
    .line 4097
    .line 4098
    iget-object v1, v1, LK2/d;->w:LK2/c;

    .line 4099
    .line 4100
    iput-object v0, v1, LK2/c;->X:Ljava/lang/String;

    .line 4101
    .line 4102
    :cond_9e
    :goto_59
    const/4 v13, 0x0

    .line 4103
    goto :goto_5a

    .line 4104
    :cond_9f
    invoke-virtual {v1, v13}, LK2/d;->c(I)V

    .line 4105
    .line 4106
    .line 4107
    iget-object v1, v1, LK2/d;->w:LK2/c;

    .line 4108
    .line 4109
    iput-object v0, v1, LK2/c;->a:Ljava/lang/String;

    .line 4110
    .line 4111
    goto :goto_59

    .line 4112
    :cond_a0
    const-string v1, "webm"

    .line 4113
    .line 4114
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4115
    .line 4116
    .line 4117
    move-result v1

    .line 4118
    if-nez v1, :cond_9e

    .line 4119
    .line 4120
    const-string v1, "matroska"

    .line 4121
    .line 4122
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4123
    .line 4124
    .line 4125
    move-result v1

    .line 4126
    if-eqz v1, :cond_a1

    .line 4127
    .line 4128
    goto :goto_59

    .line 4129
    :cond_a1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4130
    .line 4131
    const-string v2, "DocType "

    .line 4132
    .line 4133
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4134
    .line 4135
    .line 4136
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4137
    .line 4138
    .line 4139
    const-string v0, " not supported"

    .line 4140
    .line 4141
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4142
    .line 4143
    .line 4144
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 4145
    .line 4146
    .line 4147
    move-result-object v0

    .line 4148
    const/4 v1, 0x0

    .line 4149
    invoke-static {v1, v0}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 4150
    .line 4151
    .line 4152
    move-result-object v0

    .line 4153
    throw v0

    .line 4154
    :cond_a2
    invoke-virtual {v1, v13}, LK2/d;->c(I)V

    .line 4155
    .line 4156
    .line 4157
    iget-object v1, v1, LK2/d;->w:LK2/c;

    .line 4158
    .line 4159
    iput-object v0, v1, LK2/c;->b:Ljava/lang/String;

    .line 4160
    .line 4161
    goto :goto_59

    .line 4162
    :goto_5a
    iput v13, v12, LK2/b;->c:I

    .line 4163
    .line 4164
    goto/16 :goto_48

    .line 4165
    .line 4166
    :cond_a3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4167
    .line 4168
    const-string v1, "String element size: "

    .line 4169
    .line 4170
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4171
    .line 4172
    .line 4173
    iget-wide v1, v12, LK2/b;->e:J

    .line 4174
    .line 4175
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 4176
    .line 4177
    .line 4178
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 4179
    .line 4180
    .line 4181
    move-result-object v0

    .line 4182
    const/4 v1, 0x0

    .line 4183
    invoke-static {v1, v0}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 4184
    .line 4185
    .line 4186
    move-result-object v0

    .line 4187
    throw v0

    .line 4188
    :cond_a4
    const/4 v8, 0x3

    .line 4189
    const/4 v10, 0x5

    .line 4190
    const/4 v11, 0x4

    .line 4191
    iget-wide v13, v12, LK2/b;->e:J

    .line 4192
    .line 4193
    cmp-long v0, v13, v1

    .line 4194
    .line 4195
    if-gtz v0, :cond_a5

    .line 4196
    .line 4197
    iget-object v0, v12, LK2/b;->g:Ljava/lang/Object;

    .line 4198
    .line 4199
    check-cast v0, LA/e0;

    .line 4200
    .line 4201
    iget v1, v12, LK2/b;->d:I

    .line 4202
    .line 4203
    long-to-int v2, v13

    .line 4204
    move-object/from16 v13, p1

    .line 4205
    .line 4206
    check-cast v13, Ls2/j;

    .line 4207
    .line 4208
    invoke-virtual {v12, v13, v2}, LK2/b;->b(Ls2/j;I)J

    .line 4209
    .line 4210
    .line 4211
    move-result-wide v13

    .line 4212
    invoke-virtual {v0, v1, v13, v14}, LA/e0;->s(IJ)V

    .line 4213
    .line 4214
    .line 4215
    const/4 v13, 0x0

    .line 4216
    iput v13, v12, LK2/b;->c:I

    .line 4217
    .line 4218
    goto/16 :goto_48

    .line 4219
    .line 4220
    :cond_a5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4221
    .line 4222
    const-string v1, "Invalid integer size: "

    .line 4223
    .line 4224
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4225
    .line 4226
    .line 4227
    iget-wide v1, v12, LK2/b;->e:J

    .line 4228
    .line 4229
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 4230
    .line 4231
    .line 4232
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 4233
    .line 4234
    .line 4235
    move-result-object v0

    .line 4236
    const/4 v1, 0x0

    .line 4237
    invoke-static {v1, v0}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 4238
    .line 4239
    .line 4240
    move-result-object v0

    .line 4241
    throw v0

    .line 4242
    :cond_a6
    const/4 v3, 0x2

    .line 4243
    const/4 v8, 0x3

    .line 4244
    const/4 v10, 0x5

    .line 4245
    const/4 v11, 0x4

    .line 4246
    move-object/from16 v0, p1

    .line 4247
    .line 4248
    check-cast v0, Ls2/j;

    .line 4249
    .line 4250
    iget-wide v0, v0, Ls2/j;->d:J

    .line 4251
    .line 4252
    iget-wide v13, v12, LK2/b;->e:J

    .line 4253
    .line 4254
    add-long/2addr v13, v0

    .line 4255
    new-instance v2, LK2/a;

    .line 4256
    .line 4257
    iget v15, v12, LK2/b;->d:I

    .line 4258
    .line 4259
    invoke-direct {v2, v15, v13, v14}, LK2/a;-><init>(IJ)V

    .line 4260
    .line 4261
    .line 4262
    move-object/from16 v13, v21

    .line 4263
    .line 4264
    invoke-virtual {v13, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 4265
    .line 4266
    .line 4267
    iget-object v2, v12, LK2/b;->g:Ljava/lang/Object;

    .line 4268
    .line 4269
    move-object/from16 v32, v2

    .line 4270
    .line 4271
    check-cast v32, LA/e0;

    .line 4272
    .line 4273
    iget v2, v12, LK2/b;->d:I

    .line 4274
    .line 4275
    iget-wide v13, v12, LK2/b;->e:J

    .line 4276
    .line 4277
    move-wide/from16 v34, v0

    .line 4278
    .line 4279
    move/from16 v33, v2

    .line 4280
    .line 4281
    move-wide/from16 v36, v13

    .line 4282
    .line 4283
    invoke-virtual/range {v32 .. v37}, LA/e0;->z(IJJ)V

    .line 4284
    .line 4285
    .line 4286
    const/4 v13, 0x0

    .line 4287
    iput v13, v12, LK2/b;->c:I

    .line 4288
    .line 4289
    goto/16 :goto_48

    .line 4290
    .line 4291
    :goto_5b
    if-eqz v21, :cond_a8

    .line 4292
    .line 4293
    move-object/from16 v0, p1

    .line 4294
    .line 4295
    check-cast v0, Ls2/j;

    .line 4296
    .line 4297
    iget-wide v0, v0, Ls2/j;->d:J

    .line 4298
    .line 4299
    move-object/from16 v2, p0

    .line 4300
    .line 4301
    iget-boolean v12, v2, LK2/d;->A:Z

    .line 4302
    .line 4303
    if-eqz v12, :cond_a7

    .line 4304
    .line 4305
    iput-wide v0, v2, LK2/d;->C:J

    .line 4306
    .line 4307
    iget-wide v0, v2, LK2/d;->B:J

    .line 4308
    .line 4309
    move-object/from16 v13, p2

    .line 4310
    .line 4311
    iput-wide v0, v13, LJ5/n;->a:J

    .line 4312
    .line 4313
    const/4 v13, 0x0

    .line 4314
    iput-boolean v13, v2, LK2/d;->A:Z

    .line 4315
    .line 4316
    const/16 v31, 0x1

    .line 4317
    .line 4318
    return v31

    .line 4319
    :cond_a7
    move-object/from16 v13, p2

    .line 4320
    .line 4321
    const/16 v31, 0x1

    .line 4322
    .line 4323
    iget-boolean v0, v2, LK2/d;->x:Z

    .line 4324
    .line 4325
    if-eqz v0, :cond_a9

    .line 4326
    .line 4327
    iget-wide v0, v2, LK2/d;->C:J

    .line 4328
    .line 4329
    cmp-long v12, v0, v25

    .line 4330
    .line 4331
    if-eqz v12, :cond_a9

    .line 4332
    .line 4333
    iput-wide v0, v13, LJ5/n;->a:J

    .line 4334
    .line 4335
    move-wide/from16 v0, v25

    .line 4336
    .line 4337
    iput-wide v0, v2, LK2/d;->C:J

    .line 4338
    .line 4339
    return v31

    .line 4340
    :cond_a8
    move-object/from16 v2, p0

    .line 4341
    .line 4342
    move-object/from16 v13, p2

    .line 4343
    .line 4344
    :cond_a9
    move-object v0, v2

    .line 4345
    move/from16 v18, v3

    .line 4346
    .line 4347
    move-object v10, v5

    .line 4348
    move-object v5, v6

    .line 4349
    move-object v6, v7

    .line 4350
    move-object v7, v9

    .line 4351
    move-object/from16 v2, v40

    .line 4352
    .line 4353
    move-object/from16 v3, v41

    .line 4354
    .line 4355
    move-object/from16 v4, v42

    .line 4356
    .line 4357
    const/4 v13, 0x0

    .line 4358
    goto/16 :goto_0

    .line 4359
    .line 4360
    :cond_aa
    const/4 v3, 0x2

    .line 4361
    const/4 v8, 0x3

    .line 4362
    const/4 v10, 0x5

    .line 4363
    const/4 v11, 0x4

    .line 4364
    move-object/from16 v2, p0

    .line 4365
    .line 4366
    move-object/from16 v13, p2

    .line 4367
    .line 4368
    iget-wide v0, v12, LK2/b;->e:J

    .line 4369
    .line 4370
    long-to-int v0, v0

    .line 4371
    move-object/from16 v1, p1

    .line 4372
    .line 4373
    check-cast v1, Ls2/j;

    .line 4374
    .line 4375
    invoke-virtual {v1, v0}, Ls2/j;->j(I)V

    .line 4376
    .line 4377
    .line 4378
    const/4 v15, 0x0

    .line 4379
    iput v15, v12, LK2/b;->c:I

    .line 4380
    .line 4381
    move-object v0, v2

    .line 4382
    move/from16 v18, v3

    .line 4383
    .line 4384
    move-object v10, v5

    .line 4385
    move-object v5, v6

    .line 4386
    move-object v6, v7

    .line 4387
    move-object v7, v9

    .line 4388
    move-object/from16 v2, v40

    .line 4389
    .line 4390
    move-object/from16 v3, v41

    .line 4391
    .line 4392
    move-object/from16 v4, v42

    .line 4393
    .line 4394
    const/4 v13, 0x0

    .line 4395
    goto/16 :goto_1

    .line 4396
    .line 4397
    :cond_ab
    move-object v2, v0

    .line 4398
    if-nez v21, :cond_ae

    .line 4399
    .line 4400
    const/4 v13, 0x0

    .line 4401
    :goto_5c
    iget-object v0, v2, LK2/d;->c:Landroid/util/SparseArray;

    .line 4402
    .line 4403
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 4404
    .line 4405
    .line 4406
    move-result v1

    .line 4407
    if-ge v13, v1, :cond_ad

    .line 4408
    .line 4409
    invoke-virtual {v0, v13}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 4410
    .line 4411
    .line 4412
    move-result-object v0

    .line 4413
    check-cast v0, LK2/c;

    .line 4414
    .line 4415
    iget-object v1, v0, LK2/c;->Y:Ls2/C;

    .line 4416
    .line 4417
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4418
    .line 4419
    .line 4420
    iget-object v1, v0, LK2/c;->U:LJ5/x;

    .line 4421
    .line 4422
    if-eqz v1, :cond_ac

    .line 4423
    .line 4424
    iget-object v3, v0, LK2/c;->Y:Ls2/C;

    .line 4425
    .line 4426
    iget-object v0, v0, LK2/c;->j:Ls2/B;

    .line 4427
    .line 4428
    invoke-virtual {v1, v3, v0}, LJ5/x;->b(Ls2/C;Ls2/B;)V

    .line 4429
    .line 4430
    .line 4431
    :cond_ac
    const/16 v31, 0x1

    .line 4432
    .line 4433
    add-int/lit8 v13, v13, 0x1

    .line 4434
    .line 4435
    goto :goto_5c

    .line 4436
    :cond_ad
    const/16 v28, -0x1

    .line 4437
    .line 4438
    return v28

    .line 4439
    :cond_ae
    const/16 v24, 0x0

    .line 4440
    .line 4441
    return v24

    .line 4442
    nop

    .line 4443
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

    .line 4444
    .line 4445
    .line 4446
    .line 4447
    .line 4448
    .line 4449
    .line 4450
    .line 4451
    .line 4452
    .line 4453
    .line 4454
    .line 4455
    .line 4456
    .line 4457
    .line 4458
    .line 4459
    .line 4460
    .line 4461
    .line 4462
    .line 4463
    .line 4464
    .line 4465
    .line 4466
    .line 4467
    .line 4468
    .line 4469
    .line 4470
    .line 4471
    .line 4472
    .line 4473
    .line 4474
    .line 4475
    .line 4476
    .line 4477
    .line 4478
    .line 4479
    .line 4480
    .line 4481
    .line 4482
    .line 4483
    .line 4484
    .line 4485
    .line 4486
    .line 4487
    .line 4488
    .line 4489
    .line 4490
    .line 4491
    .line 4492
    .line 4493
    .line 4494
    .line 4495
    .line 4496
    .line 4497
    .line 4498
    .line 4499
    .line 4500
    .line 4501
    .line 4502
    .line 4503
    .line 4504
    .line 4505
    .line 4506
    .line 4507
    .line 4508
    .line 4509
    .line 4510
    .line 4511
    .line 4512
    .line 4513
    .line 4514
    .line 4515
    .line 4516
    .line 4517
    .line 4518
    .line 4519
    .line 4520
    .line 4521
    .line 4522
    .line 4523
    .line 4524
    .line 4525
    .line 4526
    .line 4527
    .line 4528
    .line 4529
    .line 4530
    .line 4531
    .line 4532
    .line 4533
    .line 4534
    .line 4535
    .line 4536
    .line 4537
    .line 4538
    .line 4539
    .line 4540
    .line 4541
    .line 4542
    .line 4543
    .line 4544
    .line 4545
    .line 4546
    .line 4547
    .line 4548
    .line 4549
    .line 4550
    .line 4551
    .line 4552
    .line 4553
    .line 4554
    .line 4555
    .line 4556
    .line 4557
    .line 4558
    .line 4559
    .line 4560
    .line 4561
    .line 4562
    .line 4563
    .line 4564
    .line 4565
    .line 4566
    .line 4567
    .line 4568
    .line 4569
    .line 4570
    .line 4571
    .line 4572
    .line 4573
    .line 4574
    .line 4575
    .line 4576
    .line 4577
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

    .line 4578
    .line 4579
    .line 4580
    .line 4581
    .line 4582
    .line 4583
    .line 4584
    .line 4585
    .line 4586
    .line 4587
    .line 4588
    .line 4589
    .line 4590
    .line 4591
    .line 4592
    .line 4593
    .line 4594
    .line 4595
    .line 4596
    .line 4597
    .line 4598
    .line 4599
    .line 4600
    .line 4601
    .line 4602
    .line 4603
    .line 4604
    .line 4605
    .line 4606
    .line 4607
    .line 4608
    .line 4609
    .line 4610
    .line 4611
    .line 4612
    .line 4613
    .line 4614
    .line 4615
    .line 4616
    .line 4617
    .line 4618
    .line 4619
    .line 4620
    .line 4621
    .line 4622
    .line 4623
    .line 4624
    .line 4625
    .line 4626
    .line 4627
    .line 4628
    .line 4629
    .line 4630
    .line 4631
    .line 4632
    .line 4633
    .line 4634
    .line 4635
    .line 4636
    .line 4637
    .line 4638
    .line 4639
    .line 4640
    .line 4641
    .line 4642
    .line 4643
    .line 4644
    .line 4645
    .line 4646
    .line 4647
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

    .line 4648
    .line 4649
    .line 4650
    .line 4651
    .line 4652
    .line 4653
    .line 4654
    .line 4655
    .line 4656
    .line 4657
    .line 4658
    .line 4659
    .line 4660
    .line 4661
    .line 4662
    .line 4663
    .line 4664
    .line 4665
    .line 4666
    .line 4667
    .line 4668
    .line 4669
    .line 4670
    .line 4671
    .line 4672
    .line 4673
    .line 4674
    .line 4675
    .line 4676
    .line 4677
    .line 4678
    .line 4679
    .line 4680
    .line 4681
    .line 4682
    .line 4683
    .line 4684
    .line 4685
    .line 4686
    .line 4687
    .line 4688
    .line 4689
    .line 4690
    .line 4691
    .line 4692
    .line 4693
    .line 4694
    .line 4695
    .line 4696
    .line 4697
    .line 4698
    .line 4699
    .line 4700
    .line 4701
    .line 4702
    .line 4703
    .line 4704
    .line 4705
    .line 4706
    .line 4707
    .line 4708
    .line 4709
    .line 4710
    .line 4711
    .line 4712
    .line 4713
    .line 4714
    .line 4715
    .line 4716
    .line 4717
    .line 4718
    .line 4719
    .line 4720
    .line 4721
    .line 4722
    .line 4723
    .line 4724
    .line 4725
    .line 4726
    .line 4727
    .line 4728
    .line 4729
    .line 4730
    .line 4731
    .line 4732
    .line 4733
    .line 4734
    .line 4735
    .line 4736
    .line 4737
    .line 4738
    .line 4739
    .line 4740
    .line 4741
    .line 4742
    .line 4743
    .line 4744
    .line 4745
    .line 4746
    .line 4747
    .line 4748
    .line 4749
    .line 4750
    .line 4751
    .line 4752
    .line 4753
    .line 4754
    .line 4755
    .line 4756
    .line 4757
    .line 4758
    .line 4759
    .line 4760
    .line 4761
    .line 4762
    .line 4763
    .line 4764
    .line 4765
    .line 4766
    .line 4767
    .line 4768
    .line 4769
    .line 4770
    .line 4771
    .line 4772
    .line 4773
    .line 4774
    .line 4775
    .line 4776
    .line 4777
    .line 4778
    .line 4779
    .line 4780
    .line 4781
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
        :pswitch_4
        :pswitch_11
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 4782
    .line 4783
    .line 4784
    .line 4785
    .line 4786
    .line 4787
    .line 4788
    .line 4789
    .line 4790
    .line 4791
    .line 4792
    .line 4793
    .line 4794
    .line 4795
    .line 4796
    .line 4797
    .line 4798
    .line 4799
    .line 4800
    .line 4801
    .line 4802
    .line 4803
    .line 4804
    .line 4805
    .line 4806
    .line 4807
    .line 4808
    .line 4809
    .line 4810
    .line 4811
    .line 4812
    .line 4813
    .line 4814
    .line 4815
    .line 4816
    .line 4817
    .line 4818
    .line 4819
    .line 4820
    .line 4821
    .line 4822
    .line 4823
    .line 4824
    .line 4825
    .line 4826
    .line 4827
    .line 4828
    .line 4829
    .line 4830
    .line 4831
    .line 4832
    .line 4833
    .line 4834
    .line 4835
    .line 4836
    .line 4837
    .line 4838
    .line 4839
    .line 4840
    .line 4841
    .line 4842
    .line 4843
    .line 4844
    .line 4845
    .line 4846
    .line 4847
    .line 4848
    .line 4849
    .line 4850
    .line 4851
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
        0x55b2 -> :sswitch_46
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

    .line 4852
    .line 4853
    .line 4854
    .line 4855
    .line 4856
    .line 4857
    .line 4858
    .line 4859
    .line 4860
    .line 4861
    .line 4862
    .line 4863
    .line 4864
    .line 4865
    .line 4866
    .line 4867
    .line 4868
    .line 4869
    .line 4870
    .line 4871
    .line 4872
    .line 4873
    .line 4874
    .line 4875
    .line 4876
    .line 4877
    .line 4878
    .line 4879
    .line 4880
    .line 4881
    .line 4882
    .line 4883
    .line 4884
    .line 4885
    .line 4886
    .line 4887
    .line 4888
    .line 4889
    .line 4890
    .line 4891
    .line 4892
    .line 4893
    .line 4894
    .line 4895
    .line 4896
    .line 4897
    .line 4898
    .line 4899
    .line 4900
    .line 4901
    .line 4902
    .line 4903
    .line 4904
    .line 4905
    .line 4906
    .line 4907
    .line 4908
    .line 4909
    .line 4910
    .line 4911
    .line 4912
    .line 4913
    .line 4914
    .line 4915
    .line 4916
    .line 4917
    .line 4918
    .line 4919
    .line 4920
    .line 4921
    .line 4922
    .line 4923
    .line 4924
    .line 4925
    .line 4926
    .line 4927
    .line 4928
    .line 4929
    .line 4930
    .line 4931
    .line 4932
    .line 4933
    .line 4934
    .line 4935
    .line 4936
    .line 4937
    .line 4938
    .line 4939
    .line 4940
    .line 4941
    .line 4942
    .line 4943
    .line 4944
    .line 4945
    .line 4946
    .line 4947
    .line 4948
    .line 4949
    .line 4950
    .line 4951
    .line 4952
    .line 4953
    .line 4954
    .line 4955
    .line 4956
    .line 4957
    .line 4958
    .line 4959
    .line 4960
    .line 4961
    .line 4962
    .line 4963
    .line 4964
    .line 4965
    .line 4966
    .line 4967
    .line 4968
    .line 4969
    .line 4970
    .line 4971
    .line 4972
    .line 4973
    .line 4974
    .line 4975
    .line 4976
    .line 4977
    .line 4978
    .line 4979
    .line 4980
    .line 4981
    .line 4982
    .line 4983
    .line 4984
    .line 4985
    .line 4986
    .line 4987
    .line 4988
    .line 4989
    .line 4990
    .line 4991
    .line 4992
    .line 4993
    .line 4994
    .line 4995
    .line 4996
    .line 4997
    .line 4998
    .line 4999
    .line 5000
    .line 5001
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

.method public final l()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LK2/d;->U:I

    .line 3
    .line 4
    iput v0, p0, LK2/d;->V:I

    .line 5
    .line 6
    iput v0, p0, LK2/d;->W:I

    .line 7
    .line 8
    iput-boolean v0, p0, LK2/d;->X:Z

    .line 9
    .line 10
    iput-boolean v0, p0, LK2/d;->Y:Z

    .line 11
    .line 12
    iput-boolean v0, p0, LK2/d;->Z:Z

    .line 13
    .line 14
    iput v0, p0, LK2/d;->a0:I

    .line 15
    .line 16
    iput-byte v0, p0, LK2/d;->b0:B

    .line 17
    .line 18
    iput-boolean v0, p0, LK2/d;->c0:Z

    .line 19
    .line 20
    iget-object v1, p0, LK2/d;->l:LQ1/o;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, LQ1/o;->D(I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final m(J)J
    .locals 7

    .line 1
    iget-wide v2, p0, LK2/d;->t:J

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
    sget v0, LQ1/x;->a:I

    .line 13
    .line 14
    sget-object v6, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 15
    .line 16
    const-wide/16 v4, 0x3e8

    .line 17
    .line 18
    move-wide v0, p1

    .line 19
    invoke-static/range {v0 .. v6}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    .line 20
    .line 21
    .line 22
    move-result-wide p1

    .line 23
    return-wide p1

    .line 24
    :cond_0
    const-string p1, "Can\'t scale timecode prior to timecodeScale being set."

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    invoke-static {p2, p1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    throw p1
.end method

.method public final n(Ls2/j;LK2/c;IZ)I
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
    iget-object v4, v2, LK2/c;->b:Ljava/lang/String;

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
    sget-object v2, LK2/d;->e0:[B

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2, v3}, LK2/d;->o(Ls2/j;[BI)V

    .line 22
    .line 23
    .line 24
    iget v1, v0, LK2/d;->V:I

    .line 25
    .line 26
    invoke-virtual {v0}, LK2/d;->l()V

    .line 27
    .line 28
    .line 29
    return v1

    .line 30
    :cond_0
    const-string v4, "S_TEXT/ASS"

    .line 31
    .line 32
    iget-object v5, v2, LK2/c;->b:Ljava/lang/String;

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
    sget-object v2, LK2/d;->g0:[B

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2, v3}, LK2/d;->o(Ls2/j;[BI)V

    .line 43
    .line 44
    .line 45
    iget v1, v0, LK2/d;->V:I

    .line 46
    .line 47
    invoke-virtual {v0}, LK2/d;->l()V

    .line 48
    .line 49
    .line 50
    return v1

    .line 51
    :cond_1
    const-string v4, "S_TEXT/WEBVTT"

    .line 52
    .line 53
    iget-object v5, v2, LK2/c;->b:Ljava/lang/String;

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
    sget-object v2, LK2/d;->h0:[B

    .line 62
    .line 63
    invoke-virtual {v0, v1, v2, v3}, LK2/d;->o(Ls2/j;[BI)V

    .line 64
    .line 65
    .line 66
    iget v1, v0, LK2/d;->V:I

    .line 67
    .line 68
    invoke-virtual {v0}, LK2/d;->l()V

    .line 69
    .line 70
    .line 71
    return v1

    .line 72
    :cond_2
    iget-object v4, v2, LK2/c;->Y:Ls2/C;

    .line 73
    .line 74
    iget-boolean v5, v0, LK2/d;->X:Z

    .line 75
    .line 76
    const/4 v6, 0x2

    .line 77
    const/4 v7, 0x4

    .line 78
    const/4 v8, 0x1

    .line 79
    iget-object v9, v0, LK2/d;->l:LQ1/o;

    .line 80
    .line 81
    const/4 v10, 0x0

    .line 82
    if-nez v5, :cond_13

    .line 83
    .line 84
    iget-boolean v5, v2, LK2/c;->h:Z

    .line 85
    .line 86
    iget-object v11, v0, LK2/d;->i:LQ1/o;

    .line 87
    .line 88
    if-eqz v5, :cond_e

    .line 89
    .line 90
    iget v5, v0, LK2/d;->Q:I

    .line 91
    .line 92
    const v12, -0x40000001    # -1.9999999f

    .line 93
    .line 94
    .line 95
    and-int/2addr v5, v12

    .line 96
    iput v5, v0, LK2/d;->Q:I

    .line 97
    .line 98
    iget-boolean v5, v0, LK2/d;->Y:Z

    .line 99
    .line 100
    const/16 v12, 0x80

    .line 101
    .line 102
    if-nez v5, :cond_4

    .line 103
    .line 104
    iget-object v5, v11, LQ1/o;->a:[B

    .line 105
    .line 106
    invoke-virtual {v1, v5, v10, v8, v10}, Ls2/j;->f([BIIZ)Z

    .line 107
    .line 108
    .line 109
    iget v5, v0, LK2/d;->U:I

    .line 110
    .line 111
    add-int/2addr v5, v8

    .line 112
    iput v5, v0, LK2/d;->U:I

    .line 113
    .line 114
    iget-object v5, v11, LQ1/o;->a:[B

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
    iput-byte v5, v0, LK2/d;->b0:B

    .line 123
    .line 124
    iput-boolean v8, v0, LK2/d;->Y:Z

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
    invoke-static {v2, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    throw v1

    .line 135
    :cond_4
    :goto_0
    iget-byte v5, v0, LK2/d;->b0:B

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
    iget v13, v0, LK2/d;->Q:I

    .line 148
    .line 149
    const/high16 v14, 0x40000000    # 2.0f

    .line 150
    .line 151
    or-int/2addr v13, v14

    .line 152
    iput v13, v0, LK2/d;->Q:I

    .line 153
    .line 154
    iget-boolean v13, v0, LK2/d;->c0:Z

    .line 155
    .line 156
    if-nez v13, :cond_7

    .line 157
    .line 158
    iget-object v13, v0, LK2/d;->n:LQ1/o;

    .line 159
    .line 160
    iget-object v14, v13, LQ1/o;->a:[B

    .line 161
    .line 162
    const/16 v15, 0x8

    .line 163
    .line 164
    invoke-virtual {v1, v14, v10, v15, v10}, Ls2/j;->f([BIIZ)Z

    .line 165
    .line 166
    .line 167
    iget v14, v0, LK2/d;->U:I

    .line 168
    .line 169
    add-int/2addr v14, v15

    .line 170
    iput v14, v0, LK2/d;->U:I

    .line 171
    .line 172
    iput-boolean v8, v0, LK2/d;->c0:Z

    .line 173
    .line 174
    iget-object v14, v11, LQ1/o;->a:[B

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
    invoke-virtual {v11, v10}, LQ1/o;->G(I)V

    .line 185
    .line 186
    .line 187
    invoke-interface {v4, v11, v8, v8}, Ls2/C;->f(LQ1/o;II)V

    .line 188
    .line 189
    .line 190
    iget v12, v0, LK2/d;->V:I

    .line 191
    .line 192
    add-int/2addr v12, v8

    .line 193
    iput v12, v0, LK2/d;->V:I

    .line 194
    .line 195
    invoke-virtual {v13, v10}, LQ1/o;->G(I)V

    .line 196
    .line 197
    .line 198
    invoke-interface {v4, v13, v15, v8}, Ls2/C;->f(LQ1/o;II)V

    .line 199
    .line 200
    .line 201
    iget v12, v0, LK2/d;->V:I

    .line 202
    .line 203
    add-int/2addr v12, v15

    .line 204
    iput v12, v0, LK2/d;->V:I

    .line 205
    .line 206
    :cond_7
    if-eqz v5, :cond_f

    .line 207
    .line 208
    iget-boolean v5, v0, LK2/d;->Z:Z

    .line 209
    .line 210
    if-nez v5, :cond_8

    .line 211
    .line 212
    iget-object v5, v11, LQ1/o;->a:[B

    .line 213
    .line 214
    invoke-virtual {v1, v5, v10, v8, v10}, Ls2/j;->f([BIIZ)Z

    .line 215
    .line 216
    .line 217
    iget v5, v0, LK2/d;->U:I

    .line 218
    .line 219
    add-int/2addr v5, v8

    .line 220
    iput v5, v0, LK2/d;->U:I

    .line 221
    .line 222
    invoke-virtual {v11, v10}, LQ1/o;->G(I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v11}, LQ1/o;->u()I

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    iput v5, v0, LK2/d;->a0:I

    .line 230
    .line 231
    iput-boolean v8, v0, LK2/d;->Z:Z

    .line 232
    .line 233
    :cond_8
    iget v5, v0, LK2/d;->a0:I

    .line 234
    .line 235
    mul-int/2addr v5, v7

    .line 236
    invoke-virtual {v11, v5}, LQ1/o;->D(I)V

    .line 237
    .line 238
    .line 239
    iget-object v12, v11, LQ1/o;->a:[B

    .line 240
    .line 241
    invoke-virtual {v1, v12, v10, v5, v10}, Ls2/j;->f([BIIZ)Z

    .line 242
    .line 243
    .line 244
    iget v12, v0, LK2/d;->U:I

    .line 245
    .line 246
    add-int/2addr v12, v5

    .line 247
    iput v12, v0, LK2/d;->U:I

    .line 248
    .line 249
    iget v5, v0, LK2/d;->a0:I

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
    iget-object v13, v0, LK2/d;->q:Ljava/nio/ByteBuffer;

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
    iput-object v13, v0, LK2/d;->q:Ljava/nio/ByteBuffer;

    .line 272
    .line 273
    :cond_a
    iget-object v13, v0, LK2/d;->q:Ljava/nio/ByteBuffer;

    .line 274
    .line 275
    invoke-virtual {v13, v10}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 276
    .line 277
    .line 278
    iget-object v13, v0, LK2/d;->q:Ljava/nio/ByteBuffer;

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
    iget v14, v0, LK2/d;->a0:I

    .line 286
    .line 287
    if-ge v5, v14, :cond_c

    .line 288
    .line 289
    invoke-virtual {v11}, LQ1/o;->y()I

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
    iget-object v15, v0, LK2/d;->q:Ljava/nio/ByteBuffer;

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
    iget-object v15, v0, LK2/d;->q:Ljava/nio/ByteBuffer;

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
    iget v5, v0, LK2/d;->U:I

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
    iget-object v13, v0, LK2/d;->q:Ljava/nio/ByteBuffer;

    .line 326
    .line 327
    invoke-virtual {v13, v5}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 328
    .line 329
    .line 330
    goto :goto_5

    .line 331
    :cond_d
    iget-object v13, v0, LK2/d;->q:Ljava/nio/ByteBuffer;

    .line 332
    .line 333
    int-to-short v5, v5

    .line 334
    invoke-virtual {v13, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 335
    .line 336
    .line 337
    iget-object v5, v0, LK2/d;->q:Ljava/nio/ByteBuffer;

    .line 338
    .line 339
    invoke-virtual {v5, v10}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 340
    .line 341
    .line 342
    :goto_5
    iget-object v5, v0, LK2/d;->q:Ljava/nio/ByteBuffer;

    .line 343
    .line 344
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    .line 345
    .line 346
    .line 347
    move-result-object v5

    .line 348
    iget-object v13, v0, LK2/d;->o:LQ1/o;

    .line 349
    .line 350
    invoke-virtual {v13, v12, v5}, LQ1/o;->E(I[B)V

    .line 351
    .line 352
    .line 353
    invoke-interface {v4, v13, v12, v8}, Ls2/C;->f(LQ1/o;II)V

    .line 354
    .line 355
    .line 356
    iget v5, v0, LK2/d;->V:I

    .line 357
    .line 358
    add-int/2addr v5, v12

    .line 359
    iput v5, v0, LK2/d;->V:I

    .line 360
    .line 361
    goto :goto_6

    .line 362
    :cond_e
    iget-object v5, v2, LK2/c;->i:[B

    .line 363
    .line 364
    if-eqz v5, :cond_f

    .line 365
    .line 366
    array-length v12, v5

    .line 367
    invoke-virtual {v9, v12, v5}, LQ1/o;->E(I[B)V

    .line 368
    .line 369
    .line 370
    :cond_f
    :goto_6
    iget-object v5, v2, LK2/c;->b:Ljava/lang/String;

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
    iget v5, v2, LK2/c;->f:I

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
    iget v5, v0, LK2/d;->Q:I

    .line 393
    .line 394
    const/high16 v12, 0x10000000

    .line 395
    .line 396
    or-int/2addr v5, v12

    .line 397
    iput v5, v0, LK2/d;->Q:I

    .line 398
    .line 399
    iget-object v5, v0, LK2/d;->p:LQ1/o;

    .line 400
    .line 401
    invoke-virtual {v5, v10}, LQ1/o;->D(I)V

    .line 402
    .line 403
    .line 404
    iget v5, v9, LQ1/o;->c:I

    .line 405
    .line 406
    add-int/2addr v5, v3

    .line 407
    iget v12, v0, LK2/d;->U:I

    .line 408
    .line 409
    sub-int/2addr v5, v12

    .line 410
    invoke-virtual {v11, v7}, LQ1/o;->D(I)V

    .line 411
    .line 412
    .line 413
    iget-object v12, v11, LQ1/o;->a:[B

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
    invoke-interface {v4, v11, v7, v6}, Ls2/C;->f(LQ1/o;II)V

    .line 443
    .line 444
    .line 445
    iget v5, v0, LK2/d;->V:I

    .line 446
    .line 447
    add-int/2addr v5, v7

    .line 448
    iput v5, v0, LK2/d;->V:I

    .line 449
    .line 450
    :cond_12
    iput-boolean v8, v0, LK2/d;->X:Z

    .line 451
    .line 452
    :cond_13
    iget v5, v9, LQ1/o;->c:I

    .line 453
    .line 454
    add-int/2addr v3, v5

    .line 455
    const-string v5, "V_MPEG4/ISO/AVC"

    .line 456
    .line 457
    iget-object v11, v2, LK2/c;->b:Ljava/lang/String;

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
    iget-object v11, v2, LK2/c;->b:Ljava/lang/String;

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
    iget-object v5, v2, LK2/c;->U:LJ5/x;

    .line 477
    .line 478
    if-eqz v5, :cond_16

    .line 479
    .line 480
    iget v5, v9, LQ1/o;->c:I

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
    invoke-static {v8}, LQ1/k;->g(Z)V

    .line 487
    .line 488
    .line 489
    iget-object v5, v2, LK2/c;->U:LJ5/x;

    .line 490
    .line 491
    invoke-virtual {v5, v1}, LJ5/x;->f(Ls2/n;)V

    .line 492
    .line 493
    .line 494
    :cond_16
    :goto_9
    iget v5, v0, LK2/d;->U:I

    .line 495
    .line 496
    if-ge v5, v3, :cond_1c

    .line 497
    .line 498
    sub-int v5, v3, v5

    .line 499
    .line 500
    invoke-virtual {v9}, LQ1/o;->a()I

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
    invoke-interface {v4, v5, v9}, Ls2/C;->e(ILQ1/o;)V

    .line 511
    .line 512
    .line 513
    goto :goto_a

    .line 514
    :cond_17
    invoke-interface {v4, v1, v5, v10}, Ls2/C;->d(LN1/g;IZ)I

    .line 515
    .line 516
    .line 517
    move-result v5

    .line 518
    :goto_a
    iget v6, v0, LK2/d;->U:I

    .line 519
    .line 520
    add-int/2addr v6, v5

    .line 521
    iput v6, v0, LK2/d;->U:I

    .line 522
    .line 523
    iget v6, v0, LK2/d;->V:I

    .line 524
    .line 525
    add-int/2addr v6, v5

    .line 526
    iput v6, v0, LK2/d;->V:I

    .line 527
    .line 528
    goto :goto_9

    .line 529
    :cond_18
    :goto_b
    iget-object v5, v0, LK2/d;->h:LQ1/o;

    .line 530
    .line 531
    iget-object v11, v5, LQ1/o;->a:[B

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
    iget v6, v2, LK2/c;->Z:I

    .line 540
    .line 541
    rsub-int/lit8 v8, v6, 0x4

    .line 542
    .line 543
    :goto_c
    iget v12, v0, LK2/d;->U:I

    .line 544
    .line 545
    if-ge v12, v3, :cond_1c

    .line 546
    .line 547
    iget v12, v0, LK2/d;->W:I

    .line 548
    .line 549
    if-nez v12, :cond_1a

    .line 550
    .line 551
    invoke-virtual {v9}, LQ1/o;->a()I

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
    invoke-virtual {v1, v11, v13, v14, v10}, Ls2/j;->f([BIIZ)Z

    .line 564
    .line 565
    .line 566
    if-lez v12, :cond_19

    .line 567
    .line 568
    invoke-virtual {v9, v8, v12, v11}, LQ1/o;->f(II[B)V

    .line 569
    .line 570
    .line 571
    :cond_19
    iget v12, v0, LK2/d;->U:I

    .line 572
    .line 573
    add-int/2addr v12, v6

    .line 574
    iput v12, v0, LK2/d;->U:I

    .line 575
    .line 576
    invoke-virtual {v5, v10}, LQ1/o;->G(I)V

    .line 577
    .line 578
    .line 579
    invoke-virtual {v5}, LQ1/o;->y()I

    .line 580
    .line 581
    .line 582
    move-result v12

    .line 583
    iput v12, v0, LK2/d;->W:I

    .line 584
    .line 585
    iget-object v12, v0, LK2/d;->g:LQ1/o;

    .line 586
    .line 587
    invoke-virtual {v12, v10}, LQ1/o;->G(I)V

    .line 588
    .line 589
    .line 590
    invoke-interface {v4, v7, v12}, Ls2/C;->e(ILQ1/o;)V

    .line 591
    .line 592
    .line 593
    iget v12, v0, LK2/d;->V:I

    .line 594
    .line 595
    add-int/2addr v12, v7

    .line 596
    iput v12, v0, LK2/d;->V:I

    .line 597
    .line 598
    goto :goto_c

    .line 599
    :cond_1a
    invoke-virtual {v9}, LQ1/o;->a()I

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
    invoke-interface {v4, v12, v9}, Ls2/C;->e(ILQ1/o;)V

    .line 610
    .line 611
    .line 612
    goto :goto_d

    .line 613
    :cond_1b
    invoke-interface {v4, v1, v12, v10}, Ls2/C;->d(LN1/g;IZ)I

    .line 614
    .line 615
    .line 616
    move-result v12

    .line 617
    :goto_d
    iget v13, v0, LK2/d;->U:I

    .line 618
    .line 619
    add-int/2addr v13, v12

    .line 620
    iput v13, v0, LK2/d;->U:I

    .line 621
    .line 622
    iget v13, v0, LK2/d;->V:I

    .line 623
    .line 624
    add-int/2addr v13, v12

    .line 625
    iput v13, v0, LK2/d;->V:I

    .line 626
    .line 627
    iget v13, v0, LK2/d;->W:I

    .line 628
    .line 629
    sub-int/2addr v13, v12

    .line 630
    iput v13, v0, LK2/d;->W:I

    .line 631
    .line 632
    goto :goto_c

    .line 633
    :cond_1c
    const-string v1, "A_VORBIS"

    .line 634
    .line 635
    iget-object v2, v2, LK2/c;->b:Ljava/lang/String;

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
    iget-object v1, v0, LK2/d;->j:LQ1/o;

    .line 644
    .line 645
    invoke-virtual {v1, v10}, LQ1/o;->G(I)V

    .line 646
    .line 647
    .line 648
    invoke-interface {v4, v7, v1}, Ls2/C;->e(ILQ1/o;)V

    .line 649
    .line 650
    .line 651
    iget v1, v0, LK2/d;->V:I

    .line 652
    .line 653
    add-int/2addr v1, v7

    .line 654
    iput v1, v0, LK2/d;->V:I

    .line 655
    .line 656
    :cond_1d
    iget v1, v0, LK2/d;->V:I

    .line 657
    .line 658
    invoke-virtual {v0}, LK2/d;->l()V

    .line 659
    .line 660
    .line 661
    return v1
.end method

.method public final o(Ls2/j;[BI)V
    .locals 5

    .line 1
    array-length v0, p2

    .line 2
    add-int/2addr v0, p3

    .line 3
    iget-object v1, p0, LK2/d;->m:LQ1/o;

    .line 4
    .line 5
    iget-object v2, v1, LQ1/o;->a:[B

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
    invoke-virtual {v1, v3, v2}, LQ1/o;->E(I[B)V

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
    iget-object v2, v1, LQ1/o;->a:[B

    .line 27
    .line 28
    array-length p2, p2

    .line 29
    invoke-virtual {p1, v2, p2, p3, v4}, Ls2/j;->f([BIIZ)Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v4}, LQ1/o;->G(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v0}, LQ1/o;->F(I)V

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
