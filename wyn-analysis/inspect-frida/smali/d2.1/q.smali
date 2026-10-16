.class public abstract Ld2/q;
.super LU1/d;
.source "SourceFile"


# static fields
.field public static final B0:[B


# instance fields
.field public final A:LW1/w;

.field public A0:Z

.field public B:LN1/n;

.field public C:LN1/n;

.field public D:LS3/l;

.field public E:LS3/l;

.field public F:LU1/v;

.field public G:Landroid/media/MediaCrypto;

.field public final H:J

.field public I:F

.field public J:F

.field public K:Ld2/j;

.field public L:LN1/n;

.field public M:Landroid/media/MediaFormat;

.field public N:Z

.field public O:F

.field public P:Ljava/util/ArrayDeque;

.field public Q:Ld2/o;

.field public R:Ld2/m;

.field public S:I

.field public T:Z

.field public U:Z

.field public V:Z

.field public W:Z

.field public X:Z

.field public Y:Z

.field public Z:J

.field public a0:J

.field public b0:I

.field public c0:I

.field public d0:Ljava/nio/ByteBuffer;

.field public e0:Z

.field public f0:Z

.field public g0:Z

.field public h0:Z

.field public i0:Z

.field public j0:Z

.field public k0:I

.field public l0:I

.field public m0:I

.field public n0:Z

.field public o0:Z

.field public p0:Z

.field public q0:J

.field public final r:Ld2/i;

.field public r0:J

.field public final s:Ld2/h;

.field public s0:Z

.field public final t:F

.field public t0:Z

.field public final u:LT1/d;

.field public u0:Z

.field public final v:LT1/d;

.field public v0:Z

.field public final w:LT1/d;

.field public w0:LU1/j;

.field public final x:Ld2/f;

.field public x0:LH5/e;

.field public final y:Landroid/media/MediaCodec$BufferInfo;

.field public y0:Ld2/p;

.field public final z:Ljava/util/ArrayDeque;

.field public z0:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x26

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Ld2/q;->B0:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x67t
        0x42t
        -0x40t
        0xbt
        -0x26t
        0x25t
        -0x70t
        0x0t
        0x0t
        0x1t
        0x68t
        -0x32t
        0xft
        0x13t
        0x20t
        0x0t
        0x0t
        0x1t
        0x65t
        -0x78t
        -0x7ct
        0xdt
        -0x32t
        0x71t
        0x18t
        -0x60t
        0x0t
        0x2ft
        -0x41t
        0x1ct
        0x31t
        -0x3dt
        0x27t
        0x5dt
        0x78t
    .end array-data
.end method

.method public constructor <init>(ILd2/i;F)V
    .locals 3

    .line 1
    sget-object v0, Ld2/h;->b:Ld2/h;

    .line 2
    .line 3
    invoke-direct {p0, p1}, LU1/d;-><init>(I)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Ld2/q;->r:Ld2/i;

    .line 7
    .line 8
    iput-object v0, p0, Ld2/q;->s:Ld2/h;

    .line 9
    .line 10
    iput p3, p0, Ld2/q;->t:F

    .line 11
    .line 12
    new-instance p1, LT1/d;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-direct {p1, p2}, LT1/d;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Ld2/q;->u:LT1/d;

    .line 19
    .line 20
    new-instance p1, LT1/d;

    .line 21
    .line 22
    invoke-direct {p1, p2}, LT1/d;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Ld2/q;->v:LT1/d;

    .line 26
    .line 27
    new-instance p1, LT1/d;

    .line 28
    .line 29
    const/4 p3, 0x2

    .line 30
    invoke-direct {p1, p3}, LT1/d;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Ld2/q;->w:LT1/d;

    .line 34
    .line 35
    new-instance p1, Ld2/f;

    .line 36
    .line 37
    invoke-direct {p1, p3}, LT1/d;-><init>(I)V

    .line 38
    .line 39
    .line 40
    const/16 v0, 0x20

    .line 41
    .line 42
    iput v0, p1, Ld2/f;->l:I

    .line 43
    .line 44
    iput-object p1, p0, Ld2/q;->x:Ld2/f;

    .line 45
    .line 46
    new-instance v0, Landroid/media/MediaCodec$BufferInfo;

    .line 47
    .line 48
    invoke-direct {v0}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Ld2/q;->y:Landroid/media/MediaCodec$BufferInfo;

    .line 52
    .line 53
    const/high16 v0, 0x3f800000    # 1.0f

    .line 54
    .line 55
    iput v0, p0, Ld2/q;->I:F

    .line 56
    .line 57
    iput v0, p0, Ld2/q;->J:F

    .line 58
    .line 59
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    iput-wide v0, p0, Ld2/q;->H:J

    .line 65
    .line 66
    new-instance v2, Ljava/util/ArrayDeque;

    .line 67
    .line 68
    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v2, p0, Ld2/q;->z:Ljava/util/ArrayDeque;

    .line 72
    .line 73
    sget-object v2, Ld2/p;->e:Ld2/p;

    .line 74
    .line 75
    iput-object v2, p0, Ld2/q;->y0:Ld2/p;

    .line 76
    .line 77
    invoke-virtual {p1, p2}, LT1/d;->r(I)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p1, LT1/d;->e:Ljava/nio/ByteBuffer;

    .line 81
    .line 82
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 87
    .line 88
    .line 89
    new-instance p1, LW1/w;

    .line 90
    .line 91
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 92
    .line 93
    .line 94
    sget-object v2, LO1/d;->a:Ljava/nio/ByteBuffer;

    .line 95
    .line 96
    iput-object v2, p1, LW1/w;->a:Ljava/nio/ByteBuffer;

    .line 97
    .line 98
    iput p2, p1, LW1/w;->c:I

    .line 99
    .line 100
    iput p3, p1, LW1/w;->b:I

    .line 101
    .line 102
    iput-object p1, p0, Ld2/q;->A:LW1/w;

    .line 103
    .line 104
    const/high16 p1, -0x40800000    # -1.0f

    .line 105
    .line 106
    iput p1, p0, Ld2/q;->O:F

    .line 107
    .line 108
    iput p2, p0, Ld2/q;->S:I

    .line 109
    .line 110
    iput p2, p0, Ld2/q;->k0:I

    .line 111
    .line 112
    const/4 p1, -0x1

    .line 113
    iput p1, p0, Ld2/q;->b0:I

    .line 114
    .line 115
    iput p1, p0, Ld2/q;->c0:I

    .line 116
    .line 117
    iput-wide v0, p0, Ld2/q;->a0:J

    .line 118
    .line 119
    iput-wide v0, p0, Ld2/q;->q0:J

    .line 120
    .line 121
    iput-wide v0, p0, Ld2/q;->r0:J

    .line 122
    .line 123
    iput-wide v0, p0, Ld2/q;->z0:J

    .line 124
    .line 125
    iput-wide v0, p0, Ld2/q;->Z:J

    .line 126
    .line 127
    iput p2, p0, Ld2/q;->l0:I

    .line 128
    .line 129
    iput p2, p0, Ld2/q;->m0:I

    .line 130
    .line 131
    new-instance p1, LH5/e;

    .line 132
    .line 133
    const/4 p2, 0x1

    .line 134
    invoke-direct {p1, p2}, LH5/e;-><init>(I)V

    .line 135
    .line 136
    .line 137
    iput-object p1, p0, Ld2/q;->x0:LH5/e;

    .line 138
    .line 139
    return-void
.end method


# virtual methods
.method public A0(LT1/d;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public B0(LN1/n;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public abstract C0(Ld2/h;LN1/n;)I
.end method

.method public D()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Ld2/q;->B:LN1/n;

    .line 3
    .line 4
    sget-object v0, Ld2/p;->e:Ld2/p;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ld2/q;->y0(Ld2/p;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Ld2/q;->z:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ld2/q;->U()Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final D0(LN1/n;)Z
    .locals 5

    .line 1
    sget v0, LQ1/x;->a:I

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    iget-object v0, p0, Ld2/q;->K:Ld2/j;

    .line 10
    .line 11
    if-eqz v0, :cond_6

    .line 12
    .line 13
    iget v0, p0, Ld2/q;->m0:I

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq v0, v1, :cond_6

    .line 17
    .line 18
    iget v0, p0, LU1/d;->h:I

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    iget v0, p0, Ld2/q;->J:F

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, LU1/d;->j:[LN1/n;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0, p1}, Ld2/q;->Y(F[LN1/n;)F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iget v0, p0, Ld2/q;->O:F

    .line 38
    .line 39
    cmpl-float v3, v0, p1

    .line 40
    .line 41
    if-nez v3, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    const/high16 v3, -0x40800000    # -1.0f

    .line 45
    .line 46
    cmpl-float v4, p1, v3

    .line 47
    .line 48
    if-nez v4, :cond_4

    .line 49
    .line 50
    iget-boolean p1, p0, Ld2/q;->n0:Z

    .line 51
    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    iput v2, p0, Ld2/q;->l0:I

    .line 55
    .line 56
    iput v1, p0, Ld2/q;->m0:I

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    invoke-virtual {p0}, Ld2/q;->t0()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Ld2/q;->e0()V

    .line 63
    .line 64
    .line 65
    :goto_0
    const/4 p1, 0x0

    .line 66
    return p1

    .line 67
    :cond_4
    cmpl-float v0, v0, v3

    .line 68
    .line 69
    if-nez v0, :cond_5

    .line 70
    .line 71
    iget v0, p0, Ld2/q;->t:F

    .line 72
    .line 73
    cmpl-float v0, p1, v0

    .line 74
    .line 75
    if-lez v0, :cond_6

    .line 76
    .line 77
    :cond_5
    new-instance v0, Landroid/os/Bundle;

    .line 78
    .line 79
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 80
    .line 81
    .line 82
    const-string v1, "operating-rate"

    .line 83
    .line 84
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, Ld2/q;->K:Ld2/j;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-interface {v1, v0}, Ld2/j;->c(Landroid/os/Bundle;)V

    .line 93
    .line 94
    .line 95
    iput p1, p0, Ld2/q;->O:F

    .line 96
    .line 97
    :cond_6
    :goto_1
    return v2
.end method

.method public final E0()V
    .locals 4

    .line 1
    iget-object v0, p0, Ld2/q;->E:LS3/l;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, LS3/l;->l()LT1/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    instance-of v1, v0, LZ1/h;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    :try_start_0
    iget-object v1, p0, Ld2/q;->G:Landroid/media/MediaCrypto;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast v0, LZ1/h;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v3}, Landroid/media/MediaCrypto;->setMediaDrmSession([B)V
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception v0

    .line 31
    iget-object v1, p0, Ld2/q;->B:LN1/n;

    .line 32
    .line 33
    const/16 v3, 0x1776

    .line 34
    .line 35
    invoke-virtual {p0, v0, v1, v2, v3}, LU1/d;->C(Ljava/lang/Exception;LN1/n;ZI)LU1/j;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    throw v0

    .line 40
    :cond_0
    :goto_0
    iget-object v0, p0, Ld2/q;->E:LS3/l;

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Ld2/q;->x0(LS3/l;)V

    .line 43
    .line 44
    .line 45
    iput v2, p0, Ld2/q;->l0:I

    .line 46
    .line 47
    iput v2, p0, Ld2/q;->m0:I

    .line 48
    .line 49
    return-void
.end method

.method public F(JZ)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Ld2/q;->s0:Z

    .line 3
    .line 4
    iput-boolean p1, p0, Ld2/q;->t0:Z

    .line 5
    .line 6
    iput-boolean p1, p0, Ld2/q;->v0:Z

    .line 7
    .line 8
    iget-boolean p2, p0, Ld2/q;->g0:Z

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    iget-object p2, p0, Ld2/q;->x:Ld2/f;

    .line 13
    .line 14
    invoke-virtual {p2}, Ld2/f;->o()V

    .line 15
    .line 16
    .line 17
    iget-object p2, p0, Ld2/q;->w:LT1/d;

    .line 18
    .line 19
    invoke-virtual {p2}, LT1/d;->o()V

    .line 20
    .line 21
    .line 22
    iput-boolean p1, p0, Ld2/q;->h0:Z

    .line 23
    .line 24
    iget-object p2, p0, Ld2/q;->A:LW1/w;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    sget-object p3, LO1/d;->a:Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    iput-object p3, p2, LW1/w;->a:Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    iput p1, p2, LW1/w;->c:I

    .line 34
    .line 35
    const/4 p1, 0x2

    .line 36
    iput p1, p2, LW1/w;->b:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {p0}, Ld2/q;->U()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0}, Ld2/q;->e0()V

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_0
    iget-object p1, p0, Ld2/q;->y0:Ld2/p;

    .line 49
    .line 50
    iget-object p1, p1, Ld2/p;->d:LQ1/t;

    .line 51
    .line 52
    invoke-virtual {p1}, LQ1/t;->n()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-lez p1, :cond_2

    .line 57
    .line 58
    const/4 p1, 0x1

    .line 59
    iput-boolean p1, p0, Ld2/q;->u0:Z

    .line 60
    .line 61
    :cond_2
    iget-object p1, p0, Ld2/q;->y0:Ld2/p;

    .line 62
    .line 63
    iget-object p1, p1, Ld2/p;->d:LQ1/t;

    .line 64
    .line 65
    invoke-virtual {p1}, LQ1/t;->d()V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Ld2/q;->z:Ljava/util/ArrayDeque;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final F0(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld2/q;->y0:Ld2/p;

    .line 2
    .line 3
    iget-object v0, v0, Ld2/p;->d:LQ1/t;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, LQ1/t;->j(J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LN1/n;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iget-boolean p2, p0, Ld2/q;->A0:Z

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    iget-object p2, p0, Ld2/q;->M:Landroid/media/MediaFormat;

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, Ld2/q;->y0:Ld2/p;

    .line 22
    .line 23
    iget-object p1, p1, Ld2/p;->d:LQ1/t;

    .line 24
    .line 25
    invoke-virtual {p1}, LQ1/t;->i()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, LN1/n;

    .line 30
    .line 31
    :cond_0
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iput-object p1, p0, Ld2/q;->C:LN1/n;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-boolean p1, p0, Ld2/q;->N:Z

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    iget-object p1, p0, Ld2/q;->C:LN1/n;

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    :goto_0
    iget-object p1, p0, Ld2/q;->C:LN1/n;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object p2, p0, Ld2/q;->M:Landroid/media/MediaFormat;

    .line 50
    .line 51
    invoke-virtual {p0, p1, p2}, Ld2/q;->k0(LN1/n;Landroid/media/MediaFormat;)V

    .line 52
    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    iput-boolean p1, p0, Ld2/q;->N:Z

    .line 56
    .line 57
    iput-boolean p1, p0, Ld2/q;->A0:Z

    .line 58
    .line 59
    :cond_2
    return-void
.end method

.method public K([LN1/n;JJLk2/H;)V
    .locals 12

    .line 1
    iget-object p1, p0, Ld2/q;->y0:Ld2/p;

    .line 2
    .line 3
    iget-wide v0, p1, Ld2/p;->c:J

    .line 4
    .line 5
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long p1, v0, v2

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    new-instance v4, Ld2/p;

    .line 15
    .line 16
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    move-wide v7, p2

    .line 22
    move-wide/from16 v9, p4

    .line 23
    .line 24
    invoke-direct/range {v4 .. v10}, Ld2/p;-><init>(JJJ)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v4}, Ld2/q;->y0(Ld2/p;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iget-object p1, p0, Ld2/q;->z:Ljava/util/ArrayDeque;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    iget-wide v0, p0, Ld2/q;->q0:J

    .line 40
    .line 41
    cmp-long v4, v0, v2

    .line 42
    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    iget-wide v4, p0, Ld2/q;->z0:J

    .line 46
    .line 47
    cmp-long v6, v4, v2

    .line 48
    .line 49
    if-eqz v6, :cond_3

    .line 50
    .line 51
    cmp-long v0, v4, v0

    .line 52
    .line 53
    if-ltz v0, :cond_3

    .line 54
    .line 55
    :cond_1
    new-instance v5, Ld2/p;

    .line 56
    .line 57
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    move-wide v8, p2

    .line 63
    move-wide/from16 v10, p4

    .line 64
    .line 65
    invoke-direct/range {v5 .. v11}, Ld2/p;-><init>(JJJ)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v5}, Ld2/q;->y0(Ld2/p;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Ld2/q;->y0:Ld2/p;

    .line 72
    .line 73
    iget-wide p1, p1, Ld2/p;->c:J

    .line 74
    .line 75
    cmp-long p1, p1, v2

    .line 76
    .line 77
    if-eqz p1, :cond_2

    .line 78
    .line 79
    invoke-virtual {p0}, Ld2/q;->n0()V

    .line 80
    .line 81
    .line 82
    :cond_2
    return-void

    .line 83
    :cond_3
    new-instance v5, Ld2/p;

    .line 84
    .line 85
    iget-wide v6, p0, Ld2/q;->q0:J

    .line 86
    .line 87
    move-wide v8, p2

    .line 88
    move-wide/from16 v10, p4

    .line 89
    .line 90
    invoke-direct/range {v5 .. v11}, Ld2/p;-><init>(JJJ)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v5}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final M(JJ)Z
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Ld2/q;->t0:Z

    .line 4
    .line 5
    const/4 v15, 0x1

    .line 6
    xor-int/2addr v1, v15

    .line 7
    invoke-static {v1}, LQ1/k;->g(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Ld2/q;->x:Ld2/f;

    .line 11
    .line 12
    invoke-virtual {v1}, Ld2/f;->u()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    iget-object v6, v1, LT1/d;->e:Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    iget v7, v0, Ld2/q;->c0:I

    .line 21
    .line 22
    iget v9, v1, Ld2/f;->k:I

    .line 23
    .line 24
    iget-wide v10, v1, LT1/d;->g:J

    .line 25
    .line 26
    iget-wide v12, v0, LU1/d;->l:J

    .line 27
    .line 28
    iget-wide v3, v1, Ld2/f;->j:J

    .line 29
    .line 30
    invoke-virtual {v0, v12, v13, v3, v4}, Ld2/q;->d0(JJ)Z

    .line 31
    .line 32
    .line 33
    move-result v12

    .line 34
    const/4 v5, 0x4

    .line 35
    invoke-virtual {v1, v5}, LH5/a;->h(I)Z

    .line 36
    .line 37
    .line 38
    move-result v13

    .line 39
    iget-object v14, v0, Ld2/q;->C:LN1/n;

    .line 40
    .line 41
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move v3, v5

    .line 45
    const/4 v5, 0x0

    .line 46
    const/4 v8, 0x0

    .line 47
    move-wide/from16 v3, p3

    .line 48
    .line 49
    move-object v15, v1

    .line 50
    move-wide/from16 v1, p1

    .line 51
    .line 52
    invoke-virtual/range {v0 .. v14}, Ld2/q;->r0(JJLd2/j;Ljava/nio/ByteBuffer;IIIJZZLN1/n;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    iget-wide v1, v15, Ld2/f;->j:J

    .line 59
    .line 60
    invoke-virtual {v0, v1, v2}, Ld2/q;->m0(J)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v15}, Ld2/f;->o()V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    const/16 v16, 0x0

    .line 68
    .line 69
    goto/16 :goto_14

    .line 70
    .line 71
    :cond_1
    move-object v15, v1

    .line 72
    :goto_0
    iget-boolean v1, v0, Ld2/q;->s0:Z

    .line 73
    .line 74
    if-eqz v1, :cond_2

    .line 75
    .line 76
    const/4 v1, 0x1

    .line 77
    iput-boolean v1, v0, Ld2/q;->t0:Z

    .line 78
    .line 79
    const/4 v2, 0x0

    .line 80
    return v2

    .line 81
    :cond_2
    const/4 v2, 0x0

    .line 82
    iget-boolean v1, v0, Ld2/q;->h0:Z

    .line 83
    .line 84
    iget-object v3, v0, Ld2/q;->w:LT1/d;

    .line 85
    .line 86
    if-eqz v1, :cond_3

    .line 87
    .line 88
    invoke-virtual {v15, v3}, Ld2/f;->t(LT1/d;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    invoke-static {v1}, LQ1/k;->g(Z)V

    .line 93
    .line 94
    .line 95
    iput-boolean v2, v0, Ld2/q;->h0:Z

    .line 96
    .line 97
    :cond_3
    iget-boolean v1, v0, Ld2/q;->i0:Z

    .line 98
    .line 99
    if-eqz v1, :cond_6

    .line 100
    .line 101
    invoke-virtual {v15}, Ld2/f;->u()Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_5

    .line 106
    .line 107
    :cond_4
    :goto_1
    const/16 v17, 0x1

    .line 108
    .line 109
    goto/16 :goto_15

    .line 110
    .line 111
    :cond_5
    invoke-virtual {v0}, Ld2/q;->P()V

    .line 112
    .line 113
    .line 114
    iput-boolean v2, v0, Ld2/q;->i0:Z

    .line 115
    .line 116
    invoke-virtual {v0}, Ld2/q;->e0()V

    .line 117
    .line 118
    .line 119
    iget-boolean v1, v0, Ld2/q;->g0:Z

    .line 120
    .line 121
    if-nez v1, :cond_6

    .line 122
    .line 123
    move/from16 v16, v2

    .line 124
    .line 125
    goto/16 :goto_14

    .line 126
    .line 127
    :cond_6
    iget-boolean v1, v0, Ld2/q;->s0:Z

    .line 128
    .line 129
    const/16 v17, 0x1

    .line 130
    .line 131
    xor-int/lit8 v1, v1, 0x1

    .line 132
    .line 133
    invoke-static {v1}, LQ1/k;->g(Z)V

    .line 134
    .line 135
    .line 136
    iget-object v1, v0, LU1/d;->c:LS3/c;

    .line 137
    .line 138
    invoke-virtual {v1}, LS3/c;->i()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v3}, LT1/d;->o()V

    .line 142
    .line 143
    .line 144
    :goto_2
    invoke-virtual {v3}, LT1/d;->o()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v1, v3, v2}, LU1/d;->L(LS3/c;LT1/d;I)I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    const/4 v5, -0x5

    .line 152
    if-eq v4, v5, :cond_21

    .line 153
    .line 154
    const/4 v5, -0x4

    .line 155
    if-eq v4, v5, :cond_8

    .line 156
    .line 157
    const/4 v1, -0x3

    .line 158
    if-ne v4, v1, :cond_7

    .line 159
    .line 160
    invoke-virtual {v0}, LU1/d;->i()Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-eqz v1, :cond_22

    .line 165
    .line 166
    iget-wide v3, v0, Ld2/q;->q0:J

    .line 167
    .line 168
    iput-wide v3, v0, Ld2/q;->r0:J

    .line 169
    .line 170
    goto/16 :goto_13

    .line 171
    .line 172
    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 173
    .line 174
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 175
    .line 176
    .line 177
    throw v1

    .line 178
    :cond_8
    const/4 v5, 0x4

    .line 179
    invoke-virtual {v3, v5}, LH5/a;->h(I)Z

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    if-eqz v4, :cond_9

    .line 184
    .line 185
    const/4 v4, 0x1

    .line 186
    iput-boolean v4, v0, Ld2/q;->s0:Z

    .line 187
    .line 188
    iget-wide v3, v0, Ld2/q;->q0:J

    .line 189
    .line 190
    iput-wide v3, v0, Ld2/q;->r0:J

    .line 191
    .line 192
    goto/16 :goto_13

    .line 193
    .line 194
    :cond_9
    iget-wide v6, v0, Ld2/q;->q0:J

    .line 195
    .line 196
    iget-wide v8, v3, LT1/d;->g:J

    .line 197
    .line 198
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->max(JJ)J

    .line 199
    .line 200
    .line 201
    move-result-wide v6

    .line 202
    iput-wide v6, v0, Ld2/q;->q0:J

    .line 203
    .line 204
    invoke-virtual {v0}, LU1/d;->i()Z

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    if-nez v4, :cond_a

    .line 209
    .line 210
    iget-object v4, v0, Ld2/q;->v:LT1/d;

    .line 211
    .line 212
    const/high16 v6, 0x20000000

    .line 213
    .line 214
    invoke-virtual {v4, v6}, LH5/a;->h(I)Z

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    if-eqz v4, :cond_b

    .line 219
    .line 220
    :cond_a
    iget-wide v6, v0, Ld2/q;->q0:J

    .line 221
    .line 222
    iput-wide v6, v0, Ld2/q;->r0:J

    .line 223
    .line 224
    :cond_b
    iget-boolean v4, v0, Ld2/q;->u0:Z

    .line 225
    .line 226
    const/16 v6, 0x8

    .line 227
    .line 228
    const/16 v7, 0xff

    .line 229
    .line 230
    const/4 v8, 0x0

    .line 231
    const-string v9, "audio/opus"

    .line 232
    .line 233
    if-eqz v4, :cond_d

    .line 234
    .line 235
    iget-object v4, v0, Ld2/q;->B:LN1/n;

    .line 236
    .line 237
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    iput-object v4, v0, Ld2/q;->C:LN1/n;

    .line 241
    .line 242
    iget-object v4, v4, LN1/n;->n:Ljava/lang/String;

    .line 243
    .line 244
    invoke-static {v4, v9}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v4

    .line 248
    if-eqz v4, :cond_c

    .line 249
    .line 250
    iget-object v4, v0, Ld2/q;->C:LN1/n;

    .line 251
    .line 252
    iget-object v4, v4, LN1/n;->q:Ljava/util/List;

    .line 253
    .line 254
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    if-nez v4, :cond_c

    .line 259
    .line 260
    iget-object v4, v0, Ld2/q;->C:LN1/n;

    .line 261
    .line 262
    iget-object v4, v4, LN1/n;->q:Ljava/util/List;

    .line 263
    .line 264
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    check-cast v4, [B

    .line 269
    .line 270
    const/16 v10, 0xb

    .line 271
    .line 272
    aget-byte v10, v4, v10

    .line 273
    .line 274
    and-int/2addr v10, v7

    .line 275
    shl-int/2addr v10, v6

    .line 276
    const/16 v11, 0xa

    .line 277
    .line 278
    aget-byte v4, v4, v11

    .line 279
    .line 280
    and-int/2addr v4, v7

    .line 281
    or-int/2addr v4, v10

    .line 282
    iget-object v10, v0, Ld2/q;->C:LN1/n;

    .line 283
    .line 284
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v10}, LN1/n;->a()LN1/m;

    .line 288
    .line 289
    .line 290
    move-result-object v10

    .line 291
    iput v4, v10, LN1/m;->E:I

    .line 292
    .line 293
    new-instance v4, LN1/n;

    .line 294
    .line 295
    invoke-direct {v4, v10}, LN1/n;-><init>(LN1/m;)V

    .line 296
    .line 297
    .line 298
    iput-object v4, v0, Ld2/q;->C:LN1/n;

    .line 299
    .line 300
    :cond_c
    iget-object v4, v0, Ld2/q;->C:LN1/n;

    .line 301
    .line 302
    invoke-virtual {v0, v4, v8}, Ld2/q;->k0(LN1/n;Landroid/media/MediaFormat;)V

    .line 303
    .line 304
    .line 305
    iput-boolean v2, v0, Ld2/q;->u0:Z

    .line 306
    .line 307
    :cond_d
    invoke-virtual {v3}, LT1/d;->s()V

    .line 308
    .line 309
    .line 310
    iget-object v4, v0, Ld2/q;->C:LN1/n;

    .line 311
    .line 312
    if-eqz v4, :cond_1d

    .line 313
    .line 314
    iget-object v4, v4, LN1/n;->n:Ljava/lang/String;

    .line 315
    .line 316
    invoke-static {v4, v9}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v4

    .line 320
    if-eqz v4, :cond_1d

    .line 321
    .line 322
    const/high16 v4, 0x10000000

    .line 323
    .line 324
    invoke-virtual {v3, v4}, LH5/a;->h(I)Z

    .line 325
    .line 326
    .line 327
    move-result v4

    .line 328
    if-eqz v4, :cond_e

    .line 329
    .line 330
    iget-object v4, v0, Ld2/q;->C:LN1/n;

    .line 331
    .line 332
    iput-object v4, v3, LT1/d;->c:LN1/n;

    .line 333
    .line 334
    invoke-virtual {v0, v3}, Ld2/q;->b0(LT1/d;)V

    .line 335
    .line 336
    .line 337
    :cond_e
    iget-wide v9, v0, LU1/d;->l:J

    .line 338
    .line 339
    iget-wide v11, v3, LT1/d;->g:J

    .line 340
    .line 341
    sub-long/2addr v9, v11

    .line 342
    const-wide/32 v11, 0x13880

    .line 343
    .line 344
    .line 345
    cmp-long v4, v9, v11

    .line 346
    .line 347
    if-gtz v4, :cond_1d

    .line 348
    .line 349
    iget-object v4, v0, Ld2/q;->C:LN1/n;

    .line 350
    .line 351
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    iget-object v9, v0, Ld2/q;->A:LW1/w;

    .line 355
    .line 356
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    iget-object v10, v3, LT1/d;->e:Ljava/nio/ByteBuffer;

    .line 360
    .line 361
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    iget-object v10, v3, LT1/d;->e:Ljava/nio/ByteBuffer;

    .line 365
    .line 366
    invoke-virtual {v10}, Ljava/nio/Buffer;->limit()I

    .line 367
    .line 368
    .line 369
    move-result v10

    .line 370
    iget-object v11, v3, LT1/d;->e:Ljava/nio/ByteBuffer;

    .line 371
    .line 372
    invoke-virtual {v11}, Ljava/nio/Buffer;->position()I

    .line 373
    .line 374
    .line 375
    move-result v11

    .line 376
    sub-int/2addr v10, v11

    .line 377
    if-nez v10, :cond_f

    .line 378
    .line 379
    goto/16 :goto_10

    .line 380
    .line 381
    :cond_f
    iget v10, v9, LW1/w;->b:I

    .line 382
    .line 383
    const/4 v11, 0x2

    .line 384
    if-ne v10, v11, :cond_11

    .line 385
    .line 386
    iget-object v4, v4, LN1/n;->q:Ljava/util/List;

    .line 387
    .line 388
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 389
    .line 390
    .line 391
    move-result v10

    .line 392
    const/4 v12, 0x1

    .line 393
    if-eq v10, v12, :cond_10

    .line 394
    .line 395
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 396
    .line 397
    .line 398
    move-result v10

    .line 399
    const/4 v12, 0x3

    .line 400
    if-ne v10, v12, :cond_11

    .line 401
    .line 402
    :cond_10
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v4

    .line 406
    move-object v8, v4

    .line 407
    check-cast v8, [B

    .line 408
    .line 409
    :cond_11
    iget-object v4, v3, LT1/d;->e:Ljava/nio/ByteBuffer;

    .line 410
    .line 411
    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    .line 412
    .line 413
    .line 414
    move-result v10

    .line 415
    invoke-virtual {v4}, Ljava/nio/Buffer;->limit()I

    .line 416
    .line 417
    .line 418
    move-result v12

    .line 419
    sub-int v13, v12, v10

    .line 420
    .line 421
    add-int/lit16 v14, v13, 0xff

    .line 422
    .line 423
    div-int/2addr v14, v7

    .line 424
    add-int/lit8 v16, v14, 0x1b

    .line 425
    .line 426
    add-int v16, v16, v13

    .line 427
    .line 428
    iget v5, v9, LW1/w;->b:I

    .line 429
    .line 430
    if-ne v5, v11, :cond_13

    .line 431
    .line 432
    if-eqz v8, :cond_12

    .line 433
    .line 434
    array-length v5, v8

    .line 435
    add-int/lit8 v5, v5, 0x1c

    .line 436
    .line 437
    goto :goto_3

    .line 438
    :cond_12
    const/16 v5, 0x2f

    .line 439
    .line 440
    :goto_3
    add-int/lit8 v18, v5, 0x2c

    .line 441
    .line 442
    add-int v16, v18, v16

    .line 443
    .line 444
    :goto_4
    move/from16 p2, v6

    .line 445
    .line 446
    move/from16 v6, v16

    .line 447
    .line 448
    goto :goto_5

    .line 449
    :cond_13
    move v5, v2

    .line 450
    goto :goto_4

    .line 451
    :goto_5
    iget-object v7, v9, LW1/w;->a:Ljava/nio/ByteBuffer;

    .line 452
    .line 453
    invoke-virtual {v7}, Ljava/nio/Buffer;->capacity()I

    .line 454
    .line 455
    .line 456
    move-result v7

    .line 457
    if-ge v7, v6, :cond_14

    .line 458
    .line 459
    invoke-static {v6}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 460
    .line 461
    .line 462
    move-result-object v6

    .line 463
    sget-object v7, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 464
    .line 465
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 466
    .line 467
    .line 468
    move-result-object v6

    .line 469
    iput-object v6, v9, LW1/w;->a:Ljava/nio/ByteBuffer;

    .line 470
    .line 471
    goto :goto_6

    .line 472
    :cond_14
    iget-object v6, v9, LW1/w;->a:Ljava/nio/ByteBuffer;

    .line 473
    .line 474
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 475
    .line 476
    .line 477
    :goto_6
    iget-object v6, v9, LW1/w;->a:Ljava/nio/ByteBuffer;

    .line 478
    .line 479
    iget v7, v9, LW1/w;->b:I

    .line 480
    .line 481
    if-ne v7, v11, :cond_17

    .line 482
    .line 483
    if-eqz v8, :cond_16

    .line 484
    .line 485
    const-wide/16 v19, 0x0

    .line 486
    .line 487
    const/16 v21, 0x0

    .line 488
    .line 489
    const/16 v22, 0x1

    .line 490
    .line 491
    const/16 v23, 0x1

    .line 492
    .line 493
    move-object/from16 v18, v6

    .line 494
    .line 495
    invoke-static/range {v18 .. v23}, LW1/w;->a(Ljava/nio/ByteBuffer;JIIZ)V

    .line 496
    .line 497
    .line 498
    array-length v7, v8

    .line 499
    move/from16 v24, v12

    .line 500
    .line 501
    int-to-long v11, v7

    .line 502
    shr-long v18, v11, p2

    .line 503
    .line 504
    const-wide/16 v20, 0x0

    .line 505
    .line 506
    cmp-long v7, v18, v20

    .line 507
    .line 508
    if-nez v7, :cond_15

    .line 509
    .line 510
    const/4 v7, 0x1

    .line 511
    goto :goto_7

    .line 512
    :cond_15
    const/4 v7, 0x0

    .line 513
    :goto_7
    const-string v2, "out of range: %s"

    .line 514
    .line 515
    invoke-static {v2, v11, v12, v7}, LFe/e;->o(Ljava/lang/String;JZ)V

    .line 516
    .line 517
    .line 518
    long-to-int v2, v11

    .line 519
    int-to-byte v2, v2

    .line 520
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    .line 527
    .line 528
    .line 529
    move-result-object v2

    .line 530
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 531
    .line 532
    .line 533
    move-result v7

    .line 534
    array-length v11, v8

    .line 535
    add-int/lit8 v11, v11, 0x1c

    .line 536
    .line 537
    const/4 v12, 0x0

    .line 538
    invoke-static {v7, v2, v11, v12}, LQ1/x;->l(I[BII)I

    .line 539
    .line 540
    .line 541
    move-result v2

    .line 542
    const/16 v7, 0x16

    .line 543
    .line 544
    invoke-virtual {v6, v7, v2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 545
    .line 546
    .line 547
    array-length v2, v8

    .line 548
    add-int/lit8 v2, v2, 0x1c

    .line 549
    .line 550
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 551
    .line 552
    .line 553
    goto :goto_8

    .line 554
    :cond_16
    move/from16 v24, v12

    .line 555
    .line 556
    sget-object v2, LW1/w;->d:[B

    .line 557
    .line 558
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 559
    .line 560
    .line 561
    :goto_8
    sget-object v2, LW1/w;->e:[B

    .line 562
    .line 563
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 564
    .line 565
    .line 566
    :goto_9
    const/4 v2, 0x0

    .line 567
    goto :goto_a

    .line 568
    :cond_17
    move/from16 v24, v12

    .line 569
    .line 570
    goto :goto_9

    .line 571
    :goto_a
    invoke-virtual {v4, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 572
    .line 573
    .line 574
    move-result v7

    .line 575
    invoke-virtual {v4}, Ljava/nio/Buffer;->limit()I

    .line 576
    .line 577
    .line 578
    move-result v2

    .line 579
    const/4 v12, 0x1

    .line 580
    if-le v2, v12, :cond_18

    .line 581
    .line 582
    invoke-virtual {v4, v12}, Ljava/nio/ByteBuffer;->get(I)B

    .line 583
    .line 584
    .line 585
    move-result v2

    .line 586
    goto :goto_b

    .line 587
    :cond_18
    const/4 v2, 0x0

    .line 588
    :goto_b
    invoke-static {v7, v2}, Ls2/a;->l(BB)J

    .line 589
    .line 590
    .line 591
    move-result-wide v7

    .line 592
    const-wide/32 v11, 0xbb80

    .line 593
    .line 594
    .line 595
    mul-long/2addr v7, v11

    .line 596
    const-wide/32 v11, 0xf4240

    .line 597
    .line 598
    .line 599
    div-long/2addr v7, v11

    .line 600
    long-to-int v2, v7

    .line 601
    iget v7, v9, LW1/w;->c:I

    .line 602
    .line 603
    add-int/2addr v7, v2

    .line 604
    iput v7, v9, LW1/w;->c:I

    .line 605
    .line 606
    int-to-long v7, v7

    .line 607
    iget v2, v9, LW1/w;->b:I

    .line 608
    .line 609
    const/16 v23, 0x0

    .line 610
    .line 611
    move/from16 v21, v2

    .line 612
    .line 613
    move-object/from16 v18, v6

    .line 614
    .line 615
    move-wide/from16 v19, v7

    .line 616
    .line 617
    move/from16 v22, v14

    .line 618
    .line 619
    invoke-static/range {v18 .. v23}, LW1/w;->a(Ljava/nio/ByteBuffer;JIIZ)V

    .line 620
    .line 621
    .line 622
    const/4 v2, 0x0

    .line 623
    :goto_c
    if-ge v2, v14, :cond_1a

    .line 624
    .line 625
    const/16 v7, 0xff

    .line 626
    .line 627
    if-lt v13, v7, :cond_19

    .line 628
    .line 629
    const/4 v8, -0x1

    .line 630
    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 631
    .line 632
    .line 633
    add-int/lit16 v8, v13, -0xff

    .line 634
    .line 635
    move v13, v8

    .line 636
    goto :goto_d

    .line 637
    :cond_19
    int-to-byte v8, v13

    .line 638
    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 639
    .line 640
    .line 641
    const/4 v13, 0x0

    .line 642
    :goto_d
    add-int/lit8 v2, v2, 0x1

    .line 643
    .line 644
    goto :goto_c

    .line 645
    :cond_1a
    move/from16 v2, v24

    .line 646
    .line 647
    :goto_e
    if-ge v10, v2, :cond_1b

    .line 648
    .line 649
    invoke-virtual {v4, v10}, Ljava/nio/ByteBuffer;->get(I)B

    .line 650
    .line 651
    .line 652
    move-result v7

    .line 653
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 654
    .line 655
    .line 656
    add-int/lit8 v10, v10, 0x1

    .line 657
    .line 658
    goto :goto_e

    .line 659
    :cond_1b
    invoke-virtual {v4}, Ljava/nio/Buffer;->limit()I

    .line 660
    .line 661
    .line 662
    move-result v2

    .line 663
    invoke-virtual {v4, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 664
    .line 665
    .line 666
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 667
    .line 668
    .line 669
    iget v2, v9, LW1/w;->b:I

    .line 670
    .line 671
    const/4 v4, 0x2

    .line 672
    if-ne v2, v4, :cond_1c

    .line 673
    .line 674
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    .line 675
    .line 676
    .line 677
    move-result-object v2

    .line 678
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 679
    .line 680
    .line 681
    move-result v4

    .line 682
    add-int/2addr v4, v5

    .line 683
    add-int/lit8 v4, v4, 0x2c

    .line 684
    .line 685
    invoke-virtual {v6}, Ljava/nio/Buffer;->limit()I

    .line 686
    .line 687
    .line 688
    move-result v7

    .line 689
    invoke-virtual {v6}, Ljava/nio/Buffer;->position()I

    .line 690
    .line 691
    .line 692
    move-result v8

    .line 693
    sub-int/2addr v7, v8

    .line 694
    const/4 v12, 0x0

    .line 695
    invoke-static {v4, v2, v7, v12}, LQ1/x;->l(I[BII)I

    .line 696
    .line 697
    .line 698
    move-result v2

    .line 699
    add-int/lit8 v5, v5, 0x42

    .line 700
    .line 701
    invoke-virtual {v6, v5, v2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 702
    .line 703
    .line 704
    goto :goto_f

    .line 705
    :cond_1c
    const/4 v12, 0x0

    .line 706
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    .line 707
    .line 708
    .line 709
    move-result-object v2

    .line 710
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 711
    .line 712
    .line 713
    move-result v4

    .line 714
    invoke-virtual {v6}, Ljava/nio/Buffer;->limit()I

    .line 715
    .line 716
    .line 717
    move-result v5

    .line 718
    invoke-virtual {v6}, Ljava/nio/Buffer;->position()I

    .line 719
    .line 720
    .line 721
    move-result v7

    .line 722
    sub-int/2addr v5, v7

    .line 723
    invoke-static {v4, v2, v5, v12}, LQ1/x;->l(I[BII)I

    .line 724
    .line 725
    .line 726
    move-result v2

    .line 727
    const/16 v7, 0x16

    .line 728
    .line 729
    invoke-virtual {v6, v7, v2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 730
    .line 731
    .line 732
    :goto_f
    iget v2, v9, LW1/w;->b:I

    .line 733
    .line 734
    const/16 v17, 0x1

    .line 735
    .line 736
    add-int/lit8 v2, v2, 0x1

    .line 737
    .line 738
    iput v2, v9, LW1/w;->b:I

    .line 739
    .line 740
    iput-object v6, v9, LW1/w;->a:Ljava/nio/ByteBuffer;

    .line 741
    .line 742
    invoke-virtual {v3}, LT1/d;->o()V

    .line 743
    .line 744
    .line 745
    iget-object v2, v9, LW1/w;->a:Ljava/nio/ByteBuffer;

    .line 746
    .line 747
    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    .line 748
    .line 749
    .line 750
    move-result v2

    .line 751
    invoke-virtual {v3, v2}, LT1/d;->r(I)V

    .line 752
    .line 753
    .line 754
    iget-object v2, v3, LT1/d;->e:Ljava/nio/ByteBuffer;

    .line 755
    .line 756
    iget-object v4, v9, LW1/w;->a:Ljava/nio/ByteBuffer;

    .line 757
    .line 758
    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 759
    .line 760
    .line 761
    invoke-virtual {v3}, LT1/d;->s()V

    .line 762
    .line 763
    .line 764
    :cond_1d
    :goto_10
    invoke-virtual {v15}, Ld2/f;->u()Z

    .line 765
    .line 766
    .line 767
    move-result v2

    .line 768
    if-nez v2, :cond_1e

    .line 769
    .line 770
    goto :goto_11

    .line 771
    :cond_1e
    iget-wide v4, v0, LU1/d;->l:J

    .line 772
    .line 773
    iget-wide v6, v15, Ld2/f;->j:J

    .line 774
    .line 775
    invoke-virtual {v0, v4, v5, v6, v7}, Ld2/q;->d0(JJ)Z

    .line 776
    .line 777
    .line 778
    move-result v2

    .line 779
    iget-wide v6, v3, LT1/d;->g:J

    .line 780
    .line 781
    invoke-virtual {v0, v4, v5, v6, v7}, Ld2/q;->d0(JJ)Z

    .line 782
    .line 783
    .line 784
    move-result v4

    .line 785
    if-ne v2, v4, :cond_1f

    .line 786
    .line 787
    :goto_11
    invoke-virtual {v15, v3}, Ld2/f;->t(LT1/d;)Z

    .line 788
    .line 789
    .line 790
    move-result v2

    .line 791
    if-nez v2, :cond_20

    .line 792
    .line 793
    :cond_1f
    const/4 v12, 0x1

    .line 794
    goto :goto_12

    .line 795
    :cond_20
    const/4 v2, 0x0

    .line 796
    goto/16 :goto_2

    .line 797
    .line 798
    :goto_12
    iput-boolean v12, v0, Ld2/q;->h0:Z

    .line 799
    .line 800
    goto :goto_13

    .line 801
    :cond_21
    invoke-virtual {v0, v1}, Ld2/q;->j0(LS3/c;)LU1/e;

    .line 802
    .line 803
    .line 804
    :cond_22
    :goto_13
    invoke-virtual {v15}, Ld2/f;->u()Z

    .line 805
    .line 806
    .line 807
    move-result v1

    .line 808
    if-eqz v1, :cond_23

    .line 809
    .line 810
    invoke-virtual {v15}, LT1/d;->s()V

    .line 811
    .line 812
    .line 813
    :cond_23
    invoke-virtual {v15}, Ld2/f;->u()Z

    .line 814
    .line 815
    .line 816
    move-result v1

    .line 817
    if-nez v1, :cond_4

    .line 818
    .line 819
    iget-boolean v1, v0, Ld2/q;->s0:Z

    .line 820
    .line 821
    if-nez v1, :cond_4

    .line 822
    .line 823
    iget-boolean v1, v0, Ld2/q;->i0:Z

    .line 824
    .line 825
    if-eqz v1, :cond_0

    .line 826
    .line 827
    goto/16 :goto_1

    .line 828
    .line 829
    :goto_14
    return v16

    .line 830
    :goto_15
    return v17
.end method

.method public abstract N(Ld2/m;LN1/n;LN1/n;)LU1/e;
.end method

.method public O(Ljava/lang/IllegalStateException;Ld2/m;)Ld2/l;
    .locals 1

    .line 1
    new-instance v0, Ld2/l;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Ld2/l;-><init>(Ljava/lang/IllegalStateException;Ld2/m;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final P()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Ld2/q;->i0:Z

    .line 3
    .line 4
    iget-object v1, p0, Ld2/q;->x:Ld2/f;

    .line 5
    .line 6
    invoke-virtual {v1}, Ld2/f;->o()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Ld2/q;->w:LT1/d;

    .line 10
    .line 11
    invoke-virtual {v1}, LT1/d;->o()V

    .line 12
    .line 13
    .line 14
    iput-boolean v0, p0, Ld2/q;->h0:Z

    .line 15
    .line 16
    iput-boolean v0, p0, Ld2/q;->g0:Z

    .line 17
    .line 18
    iget-object v1, p0, Ld2/q;->A:LW1/w;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    sget-object v2, LO1/d;->a:Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    iput-object v2, v1, LW1/w;->a:Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    iput v0, v1, LW1/w;->c:I

    .line 28
    .line 29
    const/4 v0, 0x2

    .line 30
    iput v0, v1, LW1/w;->b:I

    .line 31
    .line 32
    return-void
.end method

.method public final Q()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Ld2/q;->n0:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iput v1, p0, Ld2/q;->l0:I

    .line 7
    .line 8
    iget-boolean v0, p0, Ld2/q;->U:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x3

    .line 13
    iput v0, p0, Ld2/q;->m0:I

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x2

    .line 18
    iput v0, p0, Ld2/q;->m0:I

    .line 19
    .line 20
    return v1

    .line 21
    :cond_1
    invoke-virtual {p0}, Ld2/q;->E0()V

    .line 22
    .line 23
    .line 24
    return v1
.end method

.method public final R(JJ)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v5, v0, Ld2/q;->K:Ld2/j;

    .line 4
    .line 5
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget v1, v0, Ld2/q;->c0:I

    .line 9
    .line 10
    const/4 v15, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-ltz v1, :cond_0

    .line 13
    .line 14
    move v1, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v1, v15

    .line 17
    :goto_0
    iget-object v3, v0, Ld2/q;->y:Landroid/media/MediaCodec$BufferInfo;

    .line 18
    .line 19
    if-nez v1, :cond_d

    .line 20
    .line 21
    iget-boolean v1, v0, Ld2/q;->V:Z

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    iget-boolean v1, v0, Ld2/q;->o0:Z

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    :try_start_0
    invoke-interface {v5, v3}, Ld2/j;->q(Landroid/media/MediaCodec$BufferInfo;)I

    .line 30
    .line 31
    .line 32
    move-result v1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    goto :goto_1

    .line 34
    :catch_0
    invoke-virtual {v0}, Ld2/q;->q0()V

    .line 35
    .line 36
    .line 37
    iget-boolean v1, v0, Ld2/q;->t0:Z

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0}, Ld2/q;->t0()V

    .line 42
    .line 43
    .line 44
    :cond_1
    move/from16 v17, v15

    .line 45
    .line 46
    goto/16 :goto_6

    .line 47
    .line 48
    :cond_2
    invoke-interface {v5, v3}, Ld2/j;->q(Landroid/media/MediaCodec$BufferInfo;)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    :goto_1
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    if-gez v1, :cond_7

    .line 58
    .line 59
    const/4 v3, -0x2

    .line 60
    if-ne v1, v3, :cond_4

    .line 61
    .line 62
    iput-boolean v2, v0, Ld2/q;->p0:Z

    .line 63
    .line 64
    iget-object v1, v0, Ld2/q;->K:Ld2/j;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-interface {v1}, Ld2/j;->f()Landroid/media/MediaFormat;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget v3, v0, Ld2/q;->S:I

    .line 74
    .line 75
    if-eqz v3, :cond_3

    .line 76
    .line 77
    const-string v3, "width"

    .line 78
    .line 79
    invoke-virtual {v1, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    const/16 v4, 0x20

    .line 84
    .line 85
    if-ne v3, v4, :cond_3

    .line 86
    .line 87
    const-string v3, "height"

    .line 88
    .line 89
    invoke-virtual {v1, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-ne v3, v4, :cond_3

    .line 94
    .line 95
    iput-boolean v2, v0, Ld2/q;->X:Z

    .line 96
    .line 97
    return v2

    .line 98
    :cond_3
    iput-object v1, v0, Ld2/q;->M:Landroid/media/MediaFormat;

    .line 99
    .line 100
    iput-boolean v2, v0, Ld2/q;->N:Z

    .line 101
    .line 102
    return v2

    .line 103
    :cond_4
    iget-boolean v1, v0, Ld2/q;->Y:Z

    .line 104
    .line 105
    if-eqz v1, :cond_6

    .line 106
    .line 107
    iget-boolean v1, v0, Ld2/q;->s0:Z

    .line 108
    .line 109
    if-nez v1, :cond_5

    .line 110
    .line 111
    iget v1, v0, Ld2/q;->l0:I

    .line 112
    .line 113
    const/4 v2, 0x2

    .line 114
    if-ne v1, v2, :cond_6

    .line 115
    .line 116
    :cond_5
    invoke-virtual {v0}, Ld2/q;->q0()V

    .line 117
    .line 118
    .line 119
    :cond_6
    iget-wide v1, v0, Ld2/q;->Z:J

    .line 120
    .line 121
    cmp-long v3, v1, v6

    .line 122
    .line 123
    if-eqz v3, :cond_1

    .line 124
    .line 125
    const-wide/16 v3, 0x64

    .line 126
    .line 127
    add-long/2addr v1, v3

    .line 128
    iget-object v3, v0, LU1/d;->g:LQ1/q;

    .line 129
    .line 130
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 134
    .line 135
    .line 136
    move-result-wide v3

    .line 137
    cmp-long v1, v1, v3

    .line 138
    .line 139
    if-gez v1, :cond_1

    .line 140
    .line 141
    invoke-virtual {v0}, Ld2/q;->q0()V

    .line 142
    .line 143
    .line 144
    return v15

    .line 145
    :cond_7
    iget-boolean v4, v0, Ld2/q;->X:Z

    .line 146
    .line 147
    if-eqz v4, :cond_8

    .line 148
    .line 149
    iput-boolean v15, v0, Ld2/q;->X:Z

    .line 150
    .line 151
    invoke-interface {v5, v1}, Ld2/j;->G(I)V

    .line 152
    .line 153
    .line 154
    return v2

    .line 155
    :cond_8
    iget v4, v3, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 156
    .line 157
    if-nez v4, :cond_9

    .line 158
    .line 159
    iget v4, v3, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 160
    .line 161
    and-int/lit8 v4, v4, 0x4

    .line 162
    .line 163
    if-eqz v4, :cond_9

    .line 164
    .line 165
    invoke-virtual {v0}, Ld2/q;->q0()V

    .line 166
    .line 167
    .line 168
    return v15

    .line 169
    :cond_9
    iput v1, v0, Ld2/q;->c0:I

    .line 170
    .line 171
    invoke-interface {v5, v1}, Ld2/j;->r(I)Ljava/nio/ByteBuffer;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    iput-object v1, v0, Ld2/q;->d0:Ljava/nio/ByteBuffer;

    .line 176
    .line 177
    if-eqz v1, :cond_a

    .line 178
    .line 179
    iget v4, v3, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 180
    .line 181
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 182
    .line 183
    .line 184
    iget-object v1, v0, Ld2/q;->d0:Ljava/nio/ByteBuffer;

    .line 185
    .line 186
    iget v4, v3, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 187
    .line 188
    iget v8, v3, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 189
    .line 190
    add-int/2addr v4, v8

    .line 191
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 192
    .line 193
    .line 194
    :cond_a
    iget-wide v8, v3, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 195
    .line 196
    iget-wide v10, v0, LU1/d;->l:J

    .line 197
    .line 198
    cmp-long v1, v8, v10

    .line 199
    .line 200
    if-gez v1, :cond_b

    .line 201
    .line 202
    move v1, v2

    .line 203
    goto :goto_2

    .line 204
    :cond_b
    move v1, v15

    .line 205
    :goto_2
    iput-boolean v1, v0, Ld2/q;->e0:Z

    .line 206
    .line 207
    iget-wide v10, v0, Ld2/q;->r0:J

    .line 208
    .line 209
    cmp-long v1, v10, v6

    .line 210
    .line 211
    if-eqz v1, :cond_c

    .line 212
    .line 213
    cmp-long v1, v10, v8

    .line 214
    .line 215
    if-gtz v1, :cond_c

    .line 216
    .line 217
    move v1, v2

    .line 218
    goto :goto_3

    .line 219
    :cond_c
    move v1, v15

    .line 220
    :goto_3
    iput-boolean v1, v0, Ld2/q;->f0:Z

    .line 221
    .line 222
    invoke-virtual {v0, v8, v9}, Ld2/q;->F0(J)V

    .line 223
    .line 224
    .line 225
    :cond_d
    iget-boolean v1, v0, Ld2/q;->V:Z

    .line 226
    .line 227
    if-eqz v1, :cond_e

    .line 228
    .line 229
    iget-boolean v1, v0, Ld2/q;->o0:Z

    .line 230
    .line 231
    if-eqz v1, :cond_e

    .line 232
    .line 233
    :try_start_1
    iget-object v6, v0, Ld2/q;->d0:Ljava/nio/ByteBuffer;

    .line 234
    .line 235
    iget v7, v0, Ld2/q;->c0:I

    .line 236
    .line 237
    iget v8, v3, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 238
    .line 239
    iget-wide v10, v3, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 240
    .line 241
    iget-boolean v12, v0, Ld2/q;->e0:Z

    .line 242
    .line 243
    iget-boolean v13, v0, Ld2/q;->f0:Z

    .line 244
    .line 245
    iget-object v14, v0, Ld2/q;->C:LN1/n;

    .line 246
    .line 247
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 248
    .line 249
    .line 250
    const/4 v9, 0x1

    .line 251
    move/from16 v16, v2

    .line 252
    .line 253
    move/from16 v17, v15

    .line 254
    .line 255
    move-wide/from16 v1, p1

    .line 256
    .line 257
    move-object v15, v3

    .line 258
    move-wide/from16 v3, p3

    .line 259
    .line 260
    :try_start_2
    invoke-virtual/range {v0 .. v14}, Ld2/q;->r0(JJLd2/j;Ljava/nio/ByteBuffer;IIIJZZLN1/n;)Z

    .line 261
    .line 262
    .line 263
    move-result v1
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2

    .line 264
    goto :goto_4

    .line 265
    :catch_1
    move/from16 v17, v15

    .line 266
    .line 267
    :catch_2
    invoke-virtual {v0}, Ld2/q;->q0()V

    .line 268
    .line 269
    .line 270
    iget-boolean v1, v0, Ld2/q;->t0:Z

    .line 271
    .line 272
    if-eqz v1, :cond_12

    .line 273
    .line 274
    invoke-virtual {v0}, Ld2/q;->t0()V

    .line 275
    .line 276
    .line 277
    goto :goto_6

    .line 278
    :cond_e
    move/from16 v16, v2

    .line 279
    .line 280
    move/from16 v17, v15

    .line 281
    .line 282
    move-object v15, v3

    .line 283
    iget-object v6, v0, Ld2/q;->d0:Ljava/nio/ByteBuffer;

    .line 284
    .line 285
    iget v7, v0, Ld2/q;->c0:I

    .line 286
    .line 287
    iget v8, v15, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 288
    .line 289
    iget-wide v10, v15, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 290
    .line 291
    iget-boolean v12, v0, Ld2/q;->e0:Z

    .line 292
    .line 293
    iget-boolean v13, v0, Ld2/q;->f0:Z

    .line 294
    .line 295
    iget-object v14, v0, Ld2/q;->C:LN1/n;

    .line 296
    .line 297
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    const/4 v9, 0x1

    .line 301
    move-wide/from16 v1, p1

    .line 302
    .line 303
    move-wide/from16 v3, p3

    .line 304
    .line 305
    invoke-virtual/range {v0 .. v14}, Ld2/q;->r0(JJLd2/j;Ljava/nio/ByteBuffer;IIIJZZLN1/n;)Z

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    :goto_4
    if-eqz v1, :cond_12

    .line 310
    .line 311
    iget-wide v1, v15, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 312
    .line 313
    invoke-virtual {v0, v1, v2}, Ld2/q;->m0(J)V

    .line 314
    .line 315
    .line 316
    iget v1, v15, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 317
    .line 318
    and-int/lit8 v1, v1, 0x4

    .line 319
    .line 320
    if-eqz v1, :cond_f

    .line 321
    .line 322
    move/from16 v2, v16

    .line 323
    .line 324
    goto :goto_5

    .line 325
    :cond_f
    move/from16 v2, v17

    .line 326
    .line 327
    :goto_5
    if-nez v2, :cond_10

    .line 328
    .line 329
    iget-boolean v1, v0, Ld2/q;->o0:Z

    .line 330
    .line 331
    if-eqz v1, :cond_10

    .line 332
    .line 333
    iget-boolean v1, v0, Ld2/q;->f0:Z

    .line 334
    .line 335
    if-eqz v1, :cond_10

    .line 336
    .line 337
    iget-object v1, v0, LU1/d;->g:LQ1/q;

    .line 338
    .line 339
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 343
    .line 344
    .line 345
    move-result-wide v3

    .line 346
    iput-wide v3, v0, Ld2/q;->Z:J

    .line 347
    .line 348
    :cond_10
    const/4 v1, -0x1

    .line 349
    iput v1, v0, Ld2/q;->c0:I

    .line 350
    .line 351
    const/4 v1, 0x0

    .line 352
    iput-object v1, v0, Ld2/q;->d0:Ljava/nio/ByteBuffer;

    .line 353
    .line 354
    if-nez v2, :cond_11

    .line 355
    .line 356
    return v16

    .line 357
    :cond_11
    invoke-virtual {v0}, Ld2/q;->q0()V

    .line 358
    .line 359
    .line 360
    :cond_12
    :goto_6
    return v17
.end method

.method public final S()Z
    .locals 14

    .line 1
    iget-object v0, p0, Ld2/q;->K:Ld2/j;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    if-eqz v0, :cond_1b

    .line 5
    .line 6
    iget v1, p0, Ld2/q;->l0:I

    .line 7
    .line 8
    const/4 v7, 0x2

    .line 9
    if-eq v1, v7, :cond_1b

    .line 10
    .line 11
    iget-boolean v1, p0, Ld2/q;->s0:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto/16 :goto_5

    .line 16
    .line 17
    :cond_0
    iget v1, p0, Ld2/q;->b0:I

    .line 18
    .line 19
    iget-object v8, p0, Ld2/q;->v:LT1/d;

    .line 20
    .line 21
    if-gez v1, :cond_2

    .line 22
    .line 23
    invoke-interface {v0}, Ld2/j;->o()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iput v1, p0, Ld2/q;->b0:I

    .line 28
    .line 29
    if-gez v1, :cond_1

    .line 30
    .line 31
    goto/16 :goto_5

    .line 32
    .line 33
    :cond_1
    invoke-interface {v0, v1}, Ld2/j;->i(I)Ljava/nio/ByteBuffer;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iput-object v1, v8, LT1/d;->e:Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    invoke-virtual {v8}, LT1/d;->o()V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget v1, p0, Ld2/q;->l0:I

    .line 43
    .line 44
    const/4 v9, 0x1

    .line 45
    const/4 v10, 0x0

    .line 46
    const/4 v11, -0x1

    .line 47
    if-ne v1, v9, :cond_4

    .line 48
    .line 49
    iget-boolean v1, p0, Ld2/q;->Y:Z

    .line 50
    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    iput-boolean v9, p0, Ld2/q;->o0:Z

    .line 55
    .line 56
    iget v1, p0, Ld2/q;->b0:I

    .line 57
    .line 58
    const/4 v5, 0x4

    .line 59
    const/4 v2, 0x0

    .line 60
    const-wide/16 v3, 0x0

    .line 61
    .line 62
    invoke-interface/range {v0 .. v5}, Ld2/j;->d(IIJI)V

    .line 63
    .line 64
    .line 65
    iput v11, p0, Ld2/q;->b0:I

    .line 66
    .line 67
    iput-object v10, v8, LT1/d;->e:Ljava/nio/ByteBuffer;

    .line 68
    .line 69
    :goto_0
    iput v7, p0, Ld2/q;->l0:I

    .line 70
    .line 71
    return v6

    .line 72
    :cond_4
    iget-boolean v1, p0, Ld2/q;->W:Z

    .line 73
    .line 74
    if-eqz v1, :cond_5

    .line 75
    .line 76
    iput-boolean v6, p0, Ld2/q;->W:Z

    .line 77
    .line 78
    iget-object v1, v8, LT1/d;->e:Ljava/nio/ByteBuffer;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    sget-object v2, Ld2/q;->B0:[B

    .line 84
    .line 85
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 86
    .line 87
    .line 88
    iget v1, p0, Ld2/q;->b0:I

    .line 89
    .line 90
    const/4 v5, 0x0

    .line 91
    const/16 v2, 0x26

    .line 92
    .line 93
    const-wide/16 v3, 0x0

    .line 94
    .line 95
    invoke-interface/range {v0 .. v5}, Ld2/j;->d(IIJI)V

    .line 96
    .line 97
    .line 98
    iput v11, p0, Ld2/q;->b0:I

    .line 99
    .line 100
    iput-object v10, v8, LT1/d;->e:Ljava/nio/ByteBuffer;

    .line 101
    .line 102
    iput-boolean v9, p0, Ld2/q;->n0:Z

    .line 103
    .line 104
    return v9

    .line 105
    :cond_5
    iget v1, p0, Ld2/q;->k0:I

    .line 106
    .line 107
    if-ne v1, v9, :cond_7

    .line 108
    .line 109
    move v1, v6

    .line 110
    :goto_1
    iget-object v2, p0, Ld2/q;->L:LN1/n;

    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iget-object v2, v2, LN1/n;->q:Ljava/util/List;

    .line 116
    .line 117
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-ge v1, v2, :cond_6

    .line 122
    .line 123
    iget-object v2, p0, Ld2/q;->L:LN1/n;

    .line 124
    .line 125
    iget-object v2, v2, LN1/n;->q:Ljava/util/List;

    .line 126
    .line 127
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    check-cast v2, [B

    .line 132
    .line 133
    iget-object v3, v8, LT1/d;->e:Ljava/nio/ByteBuffer;

    .line 134
    .line 135
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 139
    .line 140
    .line 141
    add-int/lit8 v1, v1, 0x1

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_6
    iput v7, p0, Ld2/q;->k0:I

    .line 145
    .line 146
    :cond_7
    iget-object v1, v8, LT1/d;->e:Ljava/nio/ByteBuffer;

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    iget-object v2, p0, LU1/d;->c:LS3/c;

    .line 156
    .line 157
    invoke-virtual {v2}, LS3/c;->i()V

    .line 158
    .line 159
    .line 160
    :try_start_0
    invoke-virtual {p0, v2, v8, v6}, LU1/d;->L(LS3/c;LT1/d;I)I

    .line 161
    .line 162
    .line 163
    move-result v3
    :try_end_0
    .catch LT1/c; {:try_start_0 .. :try_end_0} :catch_0

    .line 164
    const/4 v4, -0x3

    .line 165
    if-ne v3, v4, :cond_8

    .line 166
    .line 167
    invoke-virtual {p0}, LU1/d;->i()Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-eqz v0, :cond_1b

    .line 172
    .line 173
    iget-wide v0, p0, Ld2/q;->q0:J

    .line 174
    .line 175
    iput-wide v0, p0, Ld2/q;->r0:J

    .line 176
    .line 177
    return v6

    .line 178
    :cond_8
    const/4 v4, -0x5

    .line 179
    if-ne v3, v4, :cond_a

    .line 180
    .line 181
    iget v0, p0, Ld2/q;->k0:I

    .line 182
    .line 183
    if-ne v0, v7, :cond_9

    .line 184
    .line 185
    invoke-virtual {v8}, LT1/d;->o()V

    .line 186
    .line 187
    .line 188
    iput v9, p0, Ld2/q;->k0:I

    .line 189
    .line 190
    :cond_9
    invoke-virtual {p0, v2}, Ld2/q;->j0(LS3/c;)LU1/e;

    .line 191
    .line 192
    .line 193
    return v9

    .line 194
    :cond_a
    const/4 v2, 0x4

    .line 195
    invoke-virtual {v8, v2}, LH5/a;->h(I)Z

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    if-eqz v2, :cond_e

    .line 200
    .line 201
    iget-wide v1, p0, Ld2/q;->q0:J

    .line 202
    .line 203
    iput-wide v1, p0, Ld2/q;->r0:J

    .line 204
    .line 205
    iget v1, p0, Ld2/q;->k0:I

    .line 206
    .line 207
    if-ne v1, v7, :cond_b

    .line 208
    .line 209
    invoke-virtual {v8}, LT1/d;->o()V

    .line 210
    .line 211
    .line 212
    iput v9, p0, Ld2/q;->k0:I

    .line 213
    .line 214
    :cond_b
    iput-boolean v9, p0, Ld2/q;->s0:Z

    .line 215
    .line 216
    iget-boolean v1, p0, Ld2/q;->n0:Z

    .line 217
    .line 218
    if-nez v1, :cond_c

    .line 219
    .line 220
    invoke-virtual {p0}, Ld2/q;->q0()V

    .line 221
    .line 222
    .line 223
    return v6

    .line 224
    :cond_c
    iget-boolean v1, p0, Ld2/q;->Y:Z

    .line 225
    .line 226
    if-eqz v1, :cond_d

    .line 227
    .line 228
    goto/16 :goto_5

    .line 229
    .line 230
    :cond_d
    iput-boolean v9, p0, Ld2/q;->o0:Z

    .line 231
    .line 232
    iget v1, p0, Ld2/q;->b0:I

    .line 233
    .line 234
    const/4 v5, 0x4

    .line 235
    const/4 v2, 0x0

    .line 236
    const-wide/16 v3, 0x0

    .line 237
    .line 238
    invoke-interface/range {v0 .. v5}, Ld2/j;->d(IIJI)V

    .line 239
    .line 240
    .line 241
    iput v11, p0, Ld2/q;->b0:I

    .line 242
    .line 243
    iput-object v10, v8, LT1/d;->e:Ljava/nio/ByteBuffer;

    .line 244
    .line 245
    return v6

    .line 246
    :cond_e
    iget-boolean v2, p0, Ld2/q;->n0:Z

    .line 247
    .line 248
    if-nez v2, :cond_10

    .line 249
    .line 250
    invoke-virtual {v8, v9}, LH5/a;->h(I)Z

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    if-nez v2, :cond_10

    .line 255
    .line 256
    invoke-virtual {v8}, LT1/d;->o()V

    .line 257
    .line 258
    .line 259
    iget v0, p0, Ld2/q;->k0:I

    .line 260
    .line 261
    if-ne v0, v7, :cond_f

    .line 262
    .line 263
    iput v9, p0, Ld2/q;->k0:I

    .line 264
    .line 265
    :cond_f
    return v9

    .line 266
    :cond_10
    invoke-virtual {p0, v8}, Ld2/q;->A0(LT1/d;)Z

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    if-eqz v2, :cond_11

    .line 271
    .line 272
    invoke-virtual {v8}, LT1/d;->o()V

    .line 273
    .line 274
    .line 275
    iget-object v0, p0, Ld2/q;->x0:LH5/e;

    .line 276
    .line 277
    iget v1, v0, LH5/e;->e:I

    .line 278
    .line 279
    add-int/2addr v1, v9

    .line 280
    iput v1, v0, LH5/e;->e:I

    .line 281
    .line 282
    return v9

    .line 283
    :cond_11
    const/high16 v2, 0x40000000    # 2.0f

    .line 284
    .line 285
    invoke-virtual {v8, v2}, LH5/a;->h(I)Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    if-eqz v2, :cond_14

    .line 290
    .line 291
    iget-object v3, v8, LT1/d;->d:LH5/c;

    .line 292
    .line 293
    if-nez v1, :cond_12

    .line 294
    .line 295
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    goto :goto_2

    .line 299
    :cond_12
    iget-object v4, v3, LH5/c;->d:[I

    .line 300
    .line 301
    if-nez v4, :cond_13

    .line 302
    .line 303
    new-array v4, v9, [I

    .line 304
    .line 305
    iput-object v4, v3, LH5/c;->d:[I

    .line 306
    .line 307
    iget-object v5, v3, LH5/c;->i:Landroid/media/MediaCodec$CryptoInfo;

    .line 308
    .line 309
    iput-object v4, v5, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    .line 310
    .line 311
    :cond_13
    iget-object v3, v3, LH5/c;->d:[I

    .line 312
    .line 313
    aget v4, v3, v6

    .line 314
    .line 315
    add-int/2addr v4, v1

    .line 316
    aput v4, v3, v6

    .line 317
    .line 318
    :cond_14
    :goto_2
    iget-wide v3, v8, LT1/d;->g:J

    .line 319
    .line 320
    iget-boolean v1, p0, Ld2/q;->u0:Z

    .line 321
    .line 322
    if-eqz v1, :cond_16

    .line 323
    .line 324
    iget-object v1, p0, Ld2/q;->z:Ljava/util/ArrayDeque;

    .line 325
    .line 326
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 327
    .line 328
    .line 329
    move-result v5

    .line 330
    if-nez v5, :cond_15

    .line 331
    .line 332
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    check-cast v1, Ld2/p;

    .line 337
    .line 338
    iget-object v1, v1, Ld2/p;->d:LQ1/t;

    .line 339
    .line 340
    iget-object v5, p0, Ld2/q;->B:LN1/n;

    .line 341
    .line 342
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v1, v3, v4, v5}, LQ1/t;->a(JLjava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    goto :goto_3

    .line 349
    :cond_15
    iget-object v1, p0, Ld2/q;->y0:Ld2/p;

    .line 350
    .line 351
    iget-object v1, v1, Ld2/p;->d:LQ1/t;

    .line 352
    .line 353
    iget-object v5, p0, Ld2/q;->B:LN1/n;

    .line 354
    .line 355
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v1, v3, v4, v5}, LQ1/t;->a(JLjava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    :goto_3
    iput-boolean v6, p0, Ld2/q;->u0:Z

    .line 362
    .line 363
    :cond_16
    iget-wide v12, p0, Ld2/q;->q0:J

    .line 364
    .line 365
    invoke-static {v12, v13, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 366
    .line 367
    .line 368
    move-result-wide v12

    .line 369
    iput-wide v12, p0, Ld2/q;->q0:J

    .line 370
    .line 371
    invoke-virtual {p0}, LU1/d;->i()Z

    .line 372
    .line 373
    .line 374
    move-result v1

    .line 375
    if-nez v1, :cond_17

    .line 376
    .line 377
    const/high16 v1, 0x20000000

    .line 378
    .line 379
    invoke-virtual {v8, v1}, LH5/a;->h(I)Z

    .line 380
    .line 381
    .line 382
    move-result v1

    .line 383
    if-eqz v1, :cond_18

    .line 384
    .line 385
    :cond_17
    iget-wide v12, p0, Ld2/q;->q0:J

    .line 386
    .line 387
    iput-wide v12, p0, Ld2/q;->r0:J

    .line 388
    .line 389
    :cond_18
    invoke-virtual {v8}, LT1/d;->s()V

    .line 390
    .line 391
    .line 392
    const/high16 v1, 0x10000000

    .line 393
    .line 394
    invoke-virtual {v8, v1}, LH5/a;->h(I)Z

    .line 395
    .line 396
    .line 397
    move-result v1

    .line 398
    if-eqz v1, :cond_19

    .line 399
    .line 400
    invoke-virtual {p0, v8}, Ld2/q;->b0(LT1/d;)V

    .line 401
    .line 402
    .line 403
    :cond_19
    invoke-virtual {p0, v8}, Ld2/q;->o0(LT1/d;)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {p0, v8}, Ld2/q;->W(LT1/d;)I

    .line 407
    .line 408
    .line 409
    move-result v5

    .line 410
    if-eqz v2, :cond_1a

    .line 411
    .line 412
    iget v1, p0, Ld2/q;->b0:I

    .line 413
    .line 414
    iget-object v2, v8, LT1/d;->d:LH5/c;

    .line 415
    .line 416
    invoke-interface/range {v0 .. v5}, Ld2/j;->l(ILH5/c;JI)V

    .line 417
    .line 418
    .line 419
    goto :goto_4

    .line 420
    :cond_1a
    iget v1, p0, Ld2/q;->b0:I

    .line 421
    .line 422
    iget-object v2, v8, LT1/d;->e:Ljava/nio/ByteBuffer;

    .line 423
    .line 424
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v2}, Ljava/nio/Buffer;->limit()I

    .line 428
    .line 429
    .line 430
    move-result v2

    .line 431
    invoke-interface/range {v0 .. v5}, Ld2/j;->d(IIJI)V

    .line 432
    .line 433
    .line 434
    :goto_4
    iput v11, p0, Ld2/q;->b0:I

    .line 435
    .line 436
    iput-object v10, v8, LT1/d;->e:Ljava/nio/ByteBuffer;

    .line 437
    .line 438
    iput-boolean v9, p0, Ld2/q;->n0:Z

    .line 439
    .line 440
    iput v6, p0, Ld2/q;->k0:I

    .line 441
    .line 442
    iget-object v0, p0, Ld2/q;->x0:LH5/e;

    .line 443
    .line 444
    iget v1, v0, LH5/e;->d:I

    .line 445
    .line 446
    add-int/2addr v1, v9

    .line 447
    iput v1, v0, LH5/e;->d:I

    .line 448
    .line 449
    return v9

    .line 450
    :catch_0
    move-exception v0

    .line 451
    invoke-virtual {p0, v0}, Ld2/q;->g0(Ljava/lang/Exception;)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {p0, v6}, Ld2/q;->s0(I)Z

    .line 455
    .line 456
    .line 457
    invoke-virtual {p0}, Ld2/q;->T()V

    .line 458
    .line 459
    .line 460
    return v9

    .line 461
    :cond_1b
    :goto_5
    return v6
.end method

.method public final T()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Ld2/q;->K:Ld2/j;

    .line 2
    .line 3
    invoke-static {v0}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Ld2/j;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Ld2/q;->v0()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    invoke-virtual {p0}, Ld2/q;->v0()V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method public final U()Z
    .locals 5

    .line 1
    iget-object v0, p0, Ld2/q;->K:Ld2/j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget v0, p0, Ld2/q;->m0:I

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    const/4 v3, 0x1

    .line 11
    if-eq v0, v2, :cond_5

    .line 12
    .line 13
    iget-boolean v2, p0, Ld2/q;->T:Z

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    iget-boolean v2, p0, Ld2/q;->p0:Z

    .line 18
    .line 19
    if-eqz v2, :cond_5

    .line 20
    .line 21
    :cond_1
    iget-boolean v2, p0, Ld2/q;->U:Z

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    iget-boolean v2, p0, Ld2/q;->o0:Z

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    const/4 v2, 0x2

    .line 31
    if-ne v0, v2, :cond_4

    .line 32
    .line 33
    sget v0, LQ1/x;->a:I

    .line 34
    .line 35
    const/16 v2, 0x17

    .line 36
    .line 37
    if-lt v0, v2, :cond_3

    .line 38
    .line 39
    move v4, v3

    .line 40
    goto :goto_0

    .line 41
    :cond_3
    move v4, v1

    .line 42
    :goto_0
    invoke-static {v4}, LQ1/k;->g(Z)V

    .line 43
    .line 44
    .line 45
    if-lt v0, v2, :cond_4

    .line 46
    .line 47
    :try_start_0
    invoke-virtual {p0}, Ld2/q;->E0()V
    :try_end_0
    .catch LU1/j; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :catch_0
    move-exception v0

    .line 52
    const-string v1, "MediaCodecRenderer"

    .line 53
    .line 54
    const-string v2, "Failed to update the DRM session, releasing the codec instead."

    .line 55
    .line 56
    invoke-static {v1, v2, v0}, LQ1/k;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Ld2/q;->t0()V

    .line 60
    .line 61
    .line 62
    return v3

    .line 63
    :cond_4
    :goto_1
    invoke-virtual {p0}, Ld2/q;->T()V

    .line 64
    .line 65
    .line 66
    return v1

    .line 67
    :cond_5
    :goto_2
    invoke-virtual {p0}, Ld2/q;->t0()V

    .line 68
    .line 69
    .line 70
    return v3
.end method

.method public final V(Z)Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, Ld2/q;->B:LN1/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ld2/q;->s:Ld2/h;

    .line 7
    .line 8
    invoke-virtual {p0, v1, v0, p1}, Ld2/q;->Z(Ld2/h;LN1/n;Z)Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-virtual {p0, v1, v0, p1}, Ld2/q;->Z(Ld2/h;LN1/n;Z)Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    new-instance v1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v2, "Drm session requires secure decoder for "

    .line 34
    .line 35
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, v0, LN1/n;->n:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v0, ", but no secure decoder available. Trying to proceed with "

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v0, "."

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const-string v1, "MediaCodecRenderer"

    .line 61
    .line 62
    invoke-static {v1, v0}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_0
    return-object p1

    .line 66
    :cond_1
    return-object v2
.end method

.method public W(LT1/d;)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public X()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public abstract Y(F[LN1/n;)F
.end method

.method public abstract Z(Ld2/h;LN1/n;Z)Ljava/util/ArrayList;
.end method

.method public abstract a0(Ld2/m;LN1/n;Landroid/media/MediaCrypto;F)LC6/l;
.end method

.method public abstract b0(LT1/d;)V
.end method

.method public final c0(Ld2/m;Landroid/media/MediaCrypto;)V
    .locals 12

    .line 1
    const-string v0, "createCodec:"

    .line 2
    .line 3
    iget-object v1, p0, Ld2/q;->B:LN1/n;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v7, p1, Ld2/m;->a:Ljava/lang/String;

    .line 9
    .line 10
    sget v2, LQ1/x;->a:I

    .line 11
    .line 12
    const/high16 v3, -0x40800000    # -1.0f

    .line 13
    .line 14
    const/16 v4, 0x17

    .line 15
    .line 16
    if-ge v2, v4, :cond_0

    .line 17
    .line 18
    move v5, v3

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget v5, p0, Ld2/q;->J:F

    .line 21
    .line 22
    iget-object v6, p0, LU1/d;->j:[LN1/n;

    .line 23
    .line 24
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v5, v6}, Ld2/q;->Y(F[LN1/n;)F

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    :goto_0
    iget v6, p0, Ld2/q;->t:F

    .line 32
    .line 33
    cmpg-float v6, v5, v6

    .line 34
    .line 35
    if-gtz v6, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v3, v5

    .line 39
    :goto_1
    invoke-virtual {p0, v1}, Ld2/q;->p0(LN1/n;)V

    .line 40
    .line 41
    .line 42
    iget-object v5, p0, LU1/d;->g:LQ1/q;

    .line 43
    .line 44
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 48
    .line 49
    .line 50
    move-result-wide v5

    .line 51
    invoke-virtual {p0, p1, v1, p2, v3}, Ld2/q;->a0(Ld2/m;LN1/n;Landroid/media/MediaCrypto;F)LC6/l;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    const/16 v8, 0x1f

    .line 56
    .line 57
    if-lt v2, v8, :cond_2

    .line 58
    .line 59
    iget-object v8, p0, LU1/d;->f:LV1/k;

    .line 60
    .line 61
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v8, v8, LV1/k;->b:LV1/j;

    .line 65
    .line 66
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v8, v8, LV1/j;->a:Landroid/media/metrics/LogSessionId;

    .line 70
    .line 71
    invoke-static {}, LF5/i;->g()Landroid/media/metrics/LogSessionId;

    .line 72
    .line 73
    .line 74
    invoke-static {v8}, LV1/h;->v(Landroid/media/metrics/LogSessionId;)Z

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    if-nez v9, :cond_2

    .line 79
    .line 80
    iget-object v9, p2, LC6/l;->b:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v9, Landroid/media/MediaFormat;

    .line 83
    .line 84
    const-string v10, "log-session-id"

    .line 85
    .line 86
    invoke-static {v8}, Lab/d;->n(Landroid/media/metrics/LogSessionId;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    invoke-virtual {v9, v10, v8}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    :try_start_0
    new-instance v8, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, Ld2/q;->r:Ld2/i;

    .line 109
    .line 110
    invoke-interface {v0, p2}, Ld2/i;->b(LC6/l;)Ld2/j;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    iput-object p2, p0, Ld2/q;->K:Ld2/j;

    .line 115
    .line 116
    new-instance v0, La2/v;

    .line 117
    .line 118
    const/4 v8, 0x6

    .line 119
    invoke-direct {v0, p0, v8}, La2/v;-><init>(Ljava/lang/Object;I)V

    .line 120
    .line 121
    .line 122
    invoke-interface {p2, v0}, Ld2/j;->J(La2/v;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    .line 124
    .line 125
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 126
    .line 127
    .line 128
    iget-object p2, p0, LU1/d;->g:LQ1/q;

    .line 129
    .line 130
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    move v0, v3

    .line 134
    move p2, v4

    .line 135
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 136
    .line 137
    .line 138
    move-result-wide v3

    .line 139
    invoke-virtual {p1, v1}, Ld2/m;->d(LN1/n;)Z

    .line 140
    .line 141
    .line 142
    move-result v8

    .line 143
    if-nez v8, :cond_3

    .line 144
    .line 145
    invoke-static {v1}, LN1/n;->c(LN1/n;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 150
    .line 151
    const-string v9, "Format exceeds selected codec\'s capabilities ["

    .line 152
    .line 153
    const-string v10, ", "

    .line 154
    .line 155
    const-string v11, "]"

    .line 156
    .line 157
    invoke-static {v9, v8, v10, v7, v11}, LR8/v;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    const-string v9, "MediaCodecRenderer"

    .line 162
    .line 163
    invoke-static {v9, v8}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    :cond_3
    iput-object p1, p0, Ld2/q;->R:Ld2/m;

    .line 167
    .line 168
    iput v0, p0, Ld2/q;->O:F

    .line 169
    .line 170
    iput-object v1, p0, Ld2/q;->L:LN1/n;

    .line 171
    .line 172
    const/4 v0, 0x2

    .line 173
    const/16 v1, 0x19

    .line 174
    .line 175
    const/4 v8, 0x0

    .line 176
    const/4 v9, 0x1

    .line 177
    if-gt v2, v1, :cond_5

    .line 178
    .line 179
    const-string v10, "OMX.Exynos.avc.dec.secure"

    .line 180
    .line 181
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    if-eqz v10, :cond_5

    .line 186
    .line 187
    sget-object v10, LQ1/x;->d:Ljava/lang/String;

    .line 188
    .line 189
    const-string v11, "SM-T585"

    .line 190
    .line 191
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 192
    .line 193
    .line 194
    move-result v11

    .line 195
    if-nez v11, :cond_4

    .line 196
    .line 197
    const-string v11, "SM-A510"

    .line 198
    .line 199
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 200
    .line 201
    .line 202
    move-result v11

    .line 203
    if-nez v11, :cond_4

    .line 204
    .line 205
    const-string v11, "SM-A520"

    .line 206
    .line 207
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 208
    .line 209
    .line 210
    move-result v11

    .line 211
    if-nez v11, :cond_4

    .line 212
    .line 213
    const-string v11, "SM-J700"

    .line 214
    .line 215
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 216
    .line 217
    .line 218
    move-result v10

    .line 219
    if-eqz v10, :cond_5

    .line 220
    .line 221
    :cond_4
    move v10, v0

    .line 222
    goto :goto_2

    .line 223
    :cond_5
    const/16 v10, 0x18

    .line 224
    .line 225
    if-ge v2, v10, :cond_8

    .line 226
    .line 227
    const-string v10, "OMX.Nvidia.h264.decode"

    .line 228
    .line 229
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v10

    .line 233
    if-nez v10, :cond_6

    .line 234
    .line 235
    const-string v10, "OMX.Nvidia.h264.decode.secure"

    .line 236
    .line 237
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v10

    .line 241
    if-eqz v10, :cond_8

    .line 242
    .line 243
    :cond_6
    sget-object v10, LQ1/x;->b:Ljava/lang/String;

    .line 244
    .line 245
    const-string v11, "flounder"

    .line 246
    .line 247
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v11

    .line 251
    if-nez v11, :cond_7

    .line 252
    .line 253
    const-string v11, "flounder_lte"

    .line 254
    .line 255
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v11

    .line 259
    if-nez v11, :cond_7

    .line 260
    .line 261
    const-string v11, "grouper"

    .line 262
    .line 263
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v11

    .line 267
    if-nez v11, :cond_7

    .line 268
    .line 269
    const-string v11, "tilapia"

    .line 270
    .line 271
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v10

    .line 275
    if-eqz v10, :cond_8

    .line 276
    .line 277
    :cond_7
    move v10, v9

    .line 278
    goto :goto_2

    .line 279
    :cond_8
    move v10, v8

    .line 280
    :goto_2
    iput v10, p0, Ld2/q;->S:I

    .line 281
    .line 282
    const/16 v10, 0x1d

    .line 283
    .line 284
    if-ne v2, v10, :cond_9

    .line 285
    .line 286
    const-string v11, "c2.android.aac.decoder"

    .line 287
    .line 288
    invoke-virtual {v11, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v11

    .line 292
    if-eqz v11, :cond_9

    .line 293
    .line 294
    move v11, v9

    .line 295
    goto :goto_3

    .line 296
    :cond_9
    move v11, v8

    .line 297
    :goto_3
    iput-boolean v11, p0, Ld2/q;->T:Z

    .line 298
    .line 299
    if-gt v2, p2, :cond_a

    .line 300
    .line 301
    const-string p2, "OMX.google.vorbis.decoder"

    .line 302
    .line 303
    invoke-virtual {p2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result p2

    .line 307
    if-eqz p2, :cond_a

    .line 308
    .line 309
    move p2, v9

    .line 310
    goto :goto_4

    .line 311
    :cond_a
    move p2, v8

    .line 312
    :goto_4
    iput-boolean p2, p0, Ld2/q;->U:Z

    .line 313
    .line 314
    const/16 p2, 0x15

    .line 315
    .line 316
    if-ne v2, p2, :cond_b

    .line 317
    .line 318
    const-string p2, "OMX.google.aac.decoder"

    .line 319
    .line 320
    invoke-virtual {p2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result p2

    .line 324
    if-eqz p2, :cond_b

    .line 325
    .line 326
    move p2, v9

    .line 327
    goto :goto_5

    .line 328
    :cond_b
    move p2, v8

    .line 329
    :goto_5
    iput-boolean p2, p0, Ld2/q;->V:Z

    .line 330
    .line 331
    iget-object p2, p1, Ld2/m;->a:Ljava/lang/String;

    .line 332
    .line 333
    if-gt v2, v1, :cond_c

    .line 334
    .line 335
    const-string v1, "OMX.rk.video_decoder.avc"

    .line 336
    .line 337
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    if-nez v1, :cond_f

    .line 342
    .line 343
    :cond_c
    if-gt v2, v10, :cond_d

    .line 344
    .line 345
    const-string v1, "OMX.broadcom.video_decoder.tunnel"

    .line 346
    .line 347
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    if-nez v1, :cond_f

    .line 352
    .line 353
    const-string v1, "OMX.broadcom.video_decoder.tunnel.secure"

    .line 354
    .line 355
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v1

    .line 359
    if-nez v1, :cond_f

    .line 360
    .line 361
    const-string v1, "OMX.bcm.vdec.avc.tunnel"

    .line 362
    .line 363
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    if-nez v1, :cond_f

    .line 368
    .line 369
    const-string v1, "OMX.bcm.vdec.avc.tunnel.secure"

    .line 370
    .line 371
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    move-result v1

    .line 375
    if-nez v1, :cond_f

    .line 376
    .line 377
    const-string v1, "OMX.bcm.vdec.hevc.tunnel"

    .line 378
    .line 379
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v1

    .line 383
    if-nez v1, :cond_f

    .line 384
    .line 385
    const-string v1, "OMX.bcm.vdec.hevc.tunnel.secure"

    .line 386
    .line 387
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result p2

    .line 391
    if-nez p2, :cond_f

    .line 392
    .line 393
    :cond_d
    const-string p2, "Amazon"

    .line 394
    .line 395
    sget-object v1, LQ1/x;->c:Ljava/lang/String;

    .line 396
    .line 397
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result p2

    .line 401
    if-eqz p2, :cond_e

    .line 402
    .line 403
    const-string p2, "AFTS"

    .line 404
    .line 405
    sget-object v1, LQ1/x;->d:Ljava/lang/String;

    .line 406
    .line 407
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 408
    .line 409
    .line 410
    move-result p2

    .line 411
    if-eqz p2, :cond_e

    .line 412
    .line 413
    iget-boolean p1, p1, Ld2/m;->f:Z

    .line 414
    .line 415
    if-eqz p1, :cond_e

    .line 416
    .line 417
    goto :goto_6

    .line 418
    :cond_e
    invoke-virtual {p0}, Ld2/q;->X()Z

    .line 419
    .line 420
    .line 421
    move-result p1

    .line 422
    if-eqz p1, :cond_10

    .line 423
    .line 424
    :cond_f
    :goto_6
    move v8, v9

    .line 425
    :cond_10
    iput-boolean v8, p0, Ld2/q;->Y:Z

    .line 426
    .line 427
    iget-object p1, p0, Ld2/q;->K:Ld2/j;

    .line 428
    .line 429
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    iget p1, p0, LU1/d;->h:I

    .line 433
    .line 434
    if-ne p1, v0, :cond_11

    .line 435
    .line 436
    iget-object p1, p0, LU1/d;->g:LQ1/q;

    .line 437
    .line 438
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 442
    .line 443
    .line 444
    move-result-wide p1

    .line 445
    const-wide/16 v0, 0x3e8

    .line 446
    .line 447
    add-long/2addr p1, v0

    .line 448
    iput-wide p1, p0, Ld2/q;->a0:J

    .line 449
    .line 450
    :cond_11
    iget-object p1, p0, Ld2/q;->x0:LH5/e;

    .line 451
    .line 452
    iget p2, p1, LH5/e;->b:I

    .line 453
    .line 454
    add-int/2addr p2, v9

    .line 455
    iput p2, p1, LH5/e;->b:I

    .line 456
    .line 457
    sub-long v5, v3, v5

    .line 458
    .line 459
    move-object v2, p0

    .line 460
    invoke-virtual/range {v2 .. v7}, Ld2/q;->h0(JJLjava/lang/String;)V

    .line 461
    .line 462
    .line 463
    return-void

    .line 464
    :catchall_0
    move-exception v0

    .line 465
    move-object p1, v0

    .line 466
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 467
    .line 468
    .line 469
    throw p1
.end method

.method public final d(LN1/n;)I
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Ld2/q;->s:Ld2/h;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Ld2/q;->C0(Ld2/h;LN1/n;)I

    .line 4
    .line 5
    .line 6
    move-result p1
    :try_end_0
    .catch Ld2/s; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return p1

    .line 8
    :catch_0
    move-exception v0

    .line 9
    const/16 v1, 0xfa2

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {p0, v0, p1, v2, v1}, LU1/d;->C(Ljava/lang/Exception;LN1/n;ZI)LU1/j;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    throw p1
.end method

.method public final d0(JJ)Z
    .locals 2

    .line 1
    cmp-long v0, p3, p1

    .line 2
    .line 3
    if-gez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Ld2/q;->C:LN1/n;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, LN1/n;->n:Ljava/lang/String;

    .line 10
    .line 11
    const-string v1, "audio/opus"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sub-long/2addr p1, p3

    .line 20
    const-wide/32 p3, 0x13880

    .line 21
    .line 22
    .line 23
    cmp-long p1, p1, p3

    .line 24
    .line 25
    if-gtz p1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x1

    .line 29
    return p1

    .line 30
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 31
    return p1
.end method

.method public final e0()V
    .locals 8

    .line 1
    iget-object v0, p0, Ld2/q;->K:Ld2/j;

    .line 2
    .line 3
    if-nez v0, :cond_c

    .line 4
    .line 5
    iget-boolean v0, p0, Ld2/q;->g0:Z

    .line 6
    .line 7
    if-nez v0, :cond_c

    .line 8
    .line 9
    iget-object v0, p0, Ld2/q;->B:LN1/n;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_8

    .line 14
    .line 15
    :cond_0
    iget-object v1, p0, Ld2/q;->E:LS3/l;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ld2/q;->B0(LN1/n;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    move v1, v3

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move v1, v2

    .line 30
    :goto_0
    iget-object v4, v0, LN1/n;->n:Ljava/lang/String;

    .line 31
    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    invoke-virtual {p0}, Ld2/q;->P()V

    .line 35
    .line 36
    .line 37
    const-string v0, "audio/mp4a-latm"

    .line 38
    .line 39
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iget-object v1, p0, Ld2/q;->x:Ld2/f;

    .line 44
    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    const-string v0, "audio/mpeg"

    .line 48
    .line 49
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    const-string v0, "audio/opus"

    .line 56
    .line 57
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_2

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iput v3, v1, Ld2/f;->l:I

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    const/16 v0, 0x20

    .line 73
    .line 74
    iput v0, v1, Ld2/f;->l:I

    .line 75
    .line 76
    :goto_1
    iput-boolean v3, p0, Ld2/q;->g0:Z

    .line 77
    .line 78
    return-void

    .line 79
    :cond_3
    iget-object v1, p0, Ld2/q;->E:LS3/l;

    .line 80
    .line 81
    invoke-virtual {p0, v1}, Ld2/q;->x0(LS3/l;)V

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, Ld2/q;->D:LS3/l;

    .line 85
    .line 86
    const/4 v5, 0x4

    .line 87
    if-eqz v1, :cond_8

    .line 88
    .line 89
    iget-object v1, p0, Ld2/q;->G:Landroid/media/MediaCrypto;

    .line 90
    .line 91
    if-nez v1, :cond_4

    .line 92
    .line 93
    move v1, v3

    .line 94
    goto :goto_2

    .line 95
    :cond_4
    move v1, v2

    .line 96
    :goto_2
    invoke-static {v1}, LQ1/k;->g(Z)V

    .line 97
    .line 98
    .line 99
    iget-object v1, p0, Ld2/q;->D:LS3/l;

    .line 100
    .line 101
    invoke-virtual {v1}, LS3/l;->l()LT1/a;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    sget-boolean v7, LZ1/h;->a:Z

    .line 106
    .line 107
    if-eqz v7, :cond_6

    .line 108
    .line 109
    instance-of v7, v6, LZ1/h;

    .line 110
    .line 111
    if-eqz v7, :cond_6

    .line 112
    .line 113
    invoke-virtual {v1}, LS3/l;->p()I

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    if-eq v7, v3, :cond_5

    .line 118
    .line 119
    if-eq v7, v5, :cond_6

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_5
    invoke-virtual {v1}, LS3/l;->m()LZ1/b;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    iget-object v1, p0, Ld2/q;->B:LN1/n;

    .line 130
    .line 131
    iget v3, v0, LZ1/b;->a:I

    .line 132
    .line 133
    invoke-virtual {p0, v0, v1, v2, v3}, LU1/d;->C(Ljava/lang/Exception;LN1/n;ZI)LU1/j;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    throw v0

    .line 138
    :cond_6
    if-nez v6, :cond_7

    .line 139
    .line 140
    invoke-virtual {v1}, LS3/l;->m()LZ1/b;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    if-eqz v1, :cond_b

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_7
    instance-of v1, v6, LZ1/h;

    .line 148
    .line 149
    if-eqz v1, :cond_8

    .line 150
    .line 151
    check-cast v6, LZ1/h;

    .line 152
    .line 153
    :try_start_0
    new-instance v1, Landroid/media/MediaCrypto;

    .line 154
    .line 155
    const/4 v6, 0x0

    .line 156
    const/4 v7, 0x0

    .line 157
    invoke-direct {v1, v6, v7}, Landroid/media/MediaCrypto;-><init>(Ljava/util/UUID;[B)V

    .line 158
    .line 159
    .line 160
    iput-object v1, p0, Ld2/q;->G:Landroid/media/MediaCrypto;
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :catch_0
    move-exception v0

    .line 164
    iget-object v1, p0, Ld2/q;->B:LN1/n;

    .line 165
    .line 166
    const/16 v3, 0x1776

    .line 167
    .line 168
    invoke-virtual {p0, v0, v1, v2, v3}, LU1/d;->C(Ljava/lang/Exception;LN1/n;ZI)LU1/j;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    throw v0

    .line 173
    :cond_8
    :goto_3
    :try_start_1
    iget-object v1, p0, Ld2/q;->D:LS3/l;

    .line 174
    .line 175
    if-eqz v1, :cond_a

    .line 176
    .line 177
    invoke-virtual {v1}, LS3/l;->p()I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    const/4 v6, 0x3

    .line 182
    if-eq v1, v6, :cond_9

    .line 183
    .line 184
    iget-object v1, p0, Ld2/q;->D:LS3/l;

    .line 185
    .line 186
    invoke-virtual {v1}, LS3/l;->p()I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-ne v1, v5, :cond_a

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :catch_1
    move-exception v1

    .line 194
    goto :goto_7

    .line 195
    :cond_9
    :goto_4
    iget-object v1, p0, Ld2/q;->D:LS3/l;

    .line 196
    .line 197
    invoke-static {v4}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1, v4}, LS3/l;->t(Ljava/lang/String;)Z

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    if-eqz v1, :cond_a

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_a
    move v3, v2

    .line 208
    :goto_5
    iget-object v1, p0, Ld2/q;->G:Landroid/media/MediaCrypto;

    .line 209
    .line 210
    invoke-virtual {p0, v1, v3}, Ld2/q;->f0(Landroid/media/MediaCrypto;Z)V
    :try_end_1
    .catch Ld2/o; {:try_start_1 .. :try_end_1} :catch_1

    .line 211
    .line 212
    .line 213
    :cond_b
    :goto_6
    iget-object v0, p0, Ld2/q;->G:Landroid/media/MediaCrypto;

    .line 214
    .line 215
    if-eqz v0, :cond_c

    .line 216
    .line 217
    iget-object v1, p0, Ld2/q;->K:Ld2/j;

    .line 218
    .line 219
    if-nez v1, :cond_c

    .line 220
    .line 221
    invoke-virtual {v0}, Landroid/media/MediaCrypto;->release()V

    .line 222
    .line 223
    .line 224
    const/4 v0, 0x0

    .line 225
    iput-object v0, p0, Ld2/q;->G:Landroid/media/MediaCrypto;

    .line 226
    .line 227
    return-void

    .line 228
    :goto_7
    const/16 v3, 0xfa1

    .line 229
    .line 230
    invoke-virtual {p0, v1, v0, v2, v3}, LU1/d;->C(Ljava/lang/Exception;LN1/n;ZI)LU1/j;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    throw v0

    .line 235
    :cond_c
    :goto_8
    return-void
.end method

.method public final f0(Landroid/media/MediaCrypto;Z)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v6, p2

    .line 4
    .line 5
    iget-object v9, v1, Ld2/q;->B:LN1/n;

    .line 6
    .line 7
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, Ld2/q;->P:Ljava/util/ArrayDeque;

    .line 11
    .line 12
    const/4 v10, 0x0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {v1, v6}, Ld2/q;->V(Z)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v2, Ljava/util/ArrayDeque;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v2, v1, Ld2/q;->P:Ljava/util/ArrayDeque;

    .line 25
    .line 26
    check-cast v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    iget-object v2, v1, Ld2/q;->P:Ljava/util/ArrayDeque;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Ld2/m;

    .line 42
    .line 43
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catch_0
    move-exception v0

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    :goto_0
    iput-object v10, v1, Ld2/q;->Q:Ld2/o;
    :try_end_0
    .catch Ld2/s; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :goto_1
    new-instance v2, Ld2/o;

    .line 53
    .line 54
    const v3, -0xc34e

    .line 55
    .line 56
    .line 57
    invoke-direct {v2, v9, v0, v6, v3}, Ld2/o;-><init>(LN1/n;Ld2/s;ZI)V

    .line 58
    .line 59
    .line 60
    throw v2

    .line 61
    :cond_1
    :goto_2
    iget-object v0, v1, Ld2/q;->P:Ljava/util/ArrayDeque;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_7

    .line 68
    .line 69
    iget-object v11, v1, Ld2/q;->P:Ljava/util/ArrayDeque;

    .line 70
    .line 71
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    :goto_3
    iget-object v0, v1, Ld2/q;->K:Ld2/j;

    .line 75
    .line 76
    if-nez v0, :cond_6

    .line 77
    .line 78
    invoke-virtual {v11}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    move-object v7, v0

    .line 83
    check-cast v7, Ld2/m;

    .line 84
    .line 85
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v7}, Ld2/q;->z0(Ld2/m;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_2

    .line 93
    .line 94
    return-void

    .line 95
    :cond_2
    move-object/from16 v12, p1

    .line 96
    .line 97
    :try_start_1
    invoke-virtual {v1, v7, v12}, Ld2/q;->c0(Ld2/m;Landroid/media/MediaCrypto;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 98
    .line 99
    .line 100
    goto :goto_3

    .line 101
    :catch_1
    move-exception v0

    .line 102
    move-object v4, v0

    .line 103
    new-instance v0, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    const-string v2, "Failed to initialize decoder: "

    .line 106
    .line 107
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    const-string v2, "MediaCodecRenderer"

    .line 118
    .line 119
    invoke-static {v2, v0, v4}, LQ1/k;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v11}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    new-instance v2, Ld2/o;

    .line 126
    .line 127
    new-instance v0, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    const-string v3, "Decoder init failed: "

    .line 130
    .line 131
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    iget-object v3, v7, Ld2/m;->a:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const-string v3, ", "

    .line 140
    .line 141
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    instance-of v0, v4, Landroid/media/MediaCodec$CodecException;

    .line 152
    .line 153
    if-eqz v0, :cond_3

    .line 154
    .line 155
    move-object v0, v4

    .line 156
    check-cast v0, Landroid/media/MediaCodec$CodecException;

    .line 157
    .line 158
    invoke-virtual {v0}, Landroid/media/MediaCodec$CodecException;->getDiagnosticInfo()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    move-object v8, v0

    .line 163
    goto :goto_4

    .line 164
    :cond_3
    move-object v8, v10

    .line 165
    :goto_4
    iget-object v5, v9, LN1/n;->n:Ljava/lang/String;

    .line 166
    .line 167
    invoke-direct/range {v2 .. v8}, Ld2/o;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ZLd2/m;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v2}, Ld2/q;->g0(Ljava/lang/Exception;)V

    .line 171
    .line 172
    .line 173
    iget-object v0, v1, Ld2/q;->Q:Ld2/o;

    .line 174
    .line 175
    if-nez v0, :cond_4

    .line 176
    .line 177
    iput-object v2, v1, Ld2/q;->Q:Ld2/o;

    .line 178
    .line 179
    goto :goto_5

    .line 180
    :cond_4
    new-instance v13, Ld2/o;

    .line 181
    .line 182
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v14

    .line 186
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 187
    .line 188
    .line 189
    move-result-object v15

    .line 190
    iget-object v2, v0, Ld2/o;->a:Ljava/lang/String;

    .line 191
    .line 192
    iget-boolean v3, v0, Ld2/o;->b:Z

    .line 193
    .line 194
    iget-object v4, v0, Ld2/o;->c:Ld2/m;

    .line 195
    .line 196
    iget-object v0, v0, Ld2/o;->d:Ljava/lang/String;

    .line 197
    .line 198
    move-object/from16 v19, v0

    .line 199
    .line 200
    move-object/from16 v16, v2

    .line 201
    .line 202
    move/from16 v17, v3

    .line 203
    .line 204
    move-object/from16 v18, v4

    .line 205
    .line 206
    invoke-direct/range {v13 .. v19}, Ld2/o;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ZLd2/m;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    iput-object v13, v1, Ld2/q;->Q:Ld2/o;

    .line 210
    .line 211
    :goto_5
    invoke-virtual {v11}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-nez v0, :cond_5

    .line 216
    .line 217
    goto/16 :goto_3

    .line 218
    .line 219
    :cond_5
    iget-object v0, v1, Ld2/q;->Q:Ld2/o;

    .line 220
    .line 221
    throw v0

    .line 222
    :cond_6
    iput-object v10, v1, Ld2/q;->P:Ljava/util/ArrayDeque;

    .line 223
    .line 224
    return-void

    .line 225
    :cond_7
    new-instance v0, Ld2/o;

    .line 226
    .line 227
    const v2, -0xc34f

    .line 228
    .line 229
    .line 230
    invoke-direct {v0, v9, v10, v6, v2}, Ld2/o;-><init>(LN1/n;Ld2/s;ZI)V

    .line 231
    .line 232
    .line 233
    throw v0
.end method

.method public abstract g0(Ljava/lang/Exception;)V
.end method

.method public abstract h0(JJLjava/lang/String;)V
.end method

.method public abstract i0(Ljava/lang/String;)V
.end method

.method public isReady()Z
    .locals 7

    .line 1
    iget-object v0, p0, Ld2/q;->B:LN1/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    invoke-virtual {p0}, LU1/d;->i()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-boolean v0, p0, LU1/d;->n:Z

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, LU1/d;->i:Lk2/d0;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Lk2/d0;->isReady()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    :goto_0
    const/4 v2, 0x1

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    iget v0, p0, Ld2/q;->c0:I

    .line 28
    .line 29
    if-ltz v0, :cond_1

    .line 30
    .line 31
    move v0, v2

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v0, v1

    .line 34
    :goto_1
    if-nez v0, :cond_2

    .line 35
    .line 36
    iget-wide v3, p0, Ld2/q;->a0:J

    .line 37
    .line 38
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    cmp-long v0, v3, v5

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    iget-object v0, p0, LU1/d;->g:LQ1/q;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 53
    .line 54
    .line 55
    move-result-wide v3

    .line 56
    iget-wide v5, p0, Ld2/q;->a0:J

    .line 57
    .line 58
    cmp-long v0, v3, v5

    .line 59
    .line 60
    if-gez v0, :cond_3

    .line 61
    .line 62
    :cond_2
    return v2

    .line 63
    :cond_3
    return v1
.end method

.method public j0(LS3/c;)LU1/e;
    .locals 13

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ld2/q;->u0:Z

    .line 3
    .line 4
    iget-object v1, p1, LS3/c;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, LN1/n;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iget-object v3, v1, LN1/n;->n:Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v3, :cond_24

    .line 15
    .line 16
    const-string v4, "video/av01"

    .line 17
    .line 18
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/4 v4, 0x0

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    iget-object v3, v1, LN1/n;->q:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1}, LN1/n;->a()LN1/m;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iput-object v4, v1, LN1/m;->p:Ljava/util/List;

    .line 38
    .line 39
    new-instance v3, LN1/n;

    .line 40
    .line 41
    invoke-direct {v3, v1}, LN1/n;-><init>(LN1/m;)V

    .line 42
    .line 43
    .line 44
    move-object v8, v3

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move-object v8, v1

    .line 47
    :goto_0
    iget-object p1, p1, LS3/c;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, LS3/l;

    .line 50
    .line 51
    iget-object v1, p0, Ld2/q;->E:LS3/l;

    .line 52
    .line 53
    if-ne v1, p1, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    if-eqz p1, :cond_2

    .line 57
    .line 58
    invoke-virtual {p1, v4}, LS3/l;->h(LZ1/d;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    if-eqz v1, :cond_3

    .line 62
    .line 63
    invoke-virtual {v1, v4}, LS3/l;->s(LZ1/d;)V

    .line 64
    .line 65
    .line 66
    :cond_3
    :goto_1
    iput-object p1, p0, Ld2/q;->E:LS3/l;

    .line 67
    .line 68
    iput-object v8, p0, Ld2/q;->B:LN1/n;

    .line 69
    .line 70
    iget-boolean p1, p0, Ld2/q;->g0:Z

    .line 71
    .line 72
    if-eqz p1, :cond_4

    .line 73
    .line 74
    iput-boolean v0, p0, Ld2/q;->i0:Z

    .line 75
    .line 76
    return-object v4

    .line 77
    :cond_4
    iget-object p1, p0, Ld2/q;->K:Ld2/j;

    .line 78
    .line 79
    if-nez p1, :cond_5

    .line 80
    .line 81
    iput-object v4, p0, Ld2/q;->P:Ljava/util/ArrayDeque;

    .line 82
    .line 83
    invoke-virtual {p0}, Ld2/q;->e0()V

    .line 84
    .line 85
    .line 86
    return-object v4

    .line 87
    :cond_5
    iget-object v1, p0, Ld2/q;->R:Ld2/m;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    iget-object v7, p0, Ld2/q;->L:LN1/n;

    .line 93
    .line 94
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    iget-object v3, p0, Ld2/q;->D:LS3/l;

    .line 98
    .line 99
    iget-object v4, p0, Ld2/q;->E:LS3/l;

    .line 100
    .line 101
    const/4 v5, 0x3

    .line 102
    const/16 v6, 0x17

    .line 103
    .line 104
    const/4 v9, 0x2

    .line 105
    if-ne v3, v4, :cond_6

    .line 106
    .line 107
    goto/16 :goto_2

    .line 108
    .line 109
    :cond_6
    if-eqz v4, :cond_22

    .line 110
    .line 111
    if-nez v3, :cond_7

    .line 112
    .line 113
    goto/16 :goto_a

    .line 114
    .line 115
    :cond_7
    invoke-virtual {v4}, LS3/l;->l()LT1/a;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    if-nez v10, :cond_8

    .line 120
    .line 121
    goto/16 :goto_a

    .line 122
    .line 123
    :cond_8
    invoke-virtual {v3}, LS3/l;->l()LT1/a;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    if-eqz v11, :cond_22

    .line 128
    .line 129
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v12

    .line 133
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v11

    .line 137
    invoke-virtual {v12, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v11

    .line 141
    if-nez v11, :cond_9

    .line 142
    .line 143
    goto/16 :goto_a

    .line 144
    .line 145
    :cond_9
    instance-of v10, v10, LZ1/h;

    .line 146
    .line 147
    if-nez v10, :cond_a

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_a
    invoke-virtual {v4}, LS3/l;->n()Ljava/util/UUID;

    .line 151
    .line 152
    .line 153
    move-result-object v10

    .line 154
    invoke-virtual {v3}, LS3/l;->n()Ljava/util/UUID;

    .line 155
    .line 156
    .line 157
    move-result-object v11

    .line 158
    invoke-virtual {v10, v11}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    if-nez v10, :cond_b

    .line 163
    .line 164
    goto/16 :goto_a

    .line 165
    .line 166
    :cond_b
    sget v10, LQ1/x;->a:I

    .line 167
    .line 168
    if-ge v10, v6, :cond_c

    .line 169
    .line 170
    goto/16 :goto_a

    .line 171
    .line 172
    :cond_c
    sget-object v10, LN1/e;->e:Ljava/util/UUID;

    .line 173
    .line 174
    invoke-virtual {v3}, LS3/l;->n()Ljava/util/UUID;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    invoke-virtual {v10, v3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    if-nez v3, :cond_22

    .line 183
    .line 184
    invoke-virtual {v4}, LS3/l;->n()Ljava/util/UUID;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-virtual {v10, v3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    if-eqz v3, :cond_d

    .line 193
    .line 194
    goto/16 :goto_a

    .line 195
    .line 196
    :cond_d
    iget-boolean v3, v1, Ld2/m;->f:Z

    .line 197
    .line 198
    if-nez v3, :cond_f

    .line 199
    .line 200
    invoke-virtual {v4}, LS3/l;->p()I

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    if-eq v3, v9, :cond_22

    .line 205
    .line 206
    invoke-virtual {v4}, LS3/l;->p()I

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    if-eq v3, v5, :cond_e

    .line 211
    .line 212
    invoke-virtual {v4}, LS3/l;->p()I

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    const/4 v10, 0x4

    .line 217
    if-ne v3, v10, :cond_f

    .line 218
    .line 219
    :cond_e
    iget-object v3, v8, LN1/n;->n:Ljava/lang/String;

    .line 220
    .line 221
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v4, v3}, LS3/l;->t(Ljava/lang/String;)Z

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    if-eqz v3, :cond_f

    .line 229
    .line 230
    goto/16 :goto_a

    .line 231
    .line 232
    :cond_f
    :goto_2
    iget-object v3, p0, Ld2/q;->E:LS3/l;

    .line 233
    .line 234
    iget-object v4, p0, Ld2/q;->D:LS3/l;

    .line 235
    .line 236
    if-eq v3, v4, :cond_10

    .line 237
    .line 238
    move v3, v0

    .line 239
    goto :goto_3

    .line 240
    :cond_10
    move v3, v2

    .line 241
    :goto_3
    if-eqz v3, :cond_12

    .line 242
    .line 243
    sget v4, LQ1/x;->a:I

    .line 244
    .line 245
    if-lt v4, v6, :cond_11

    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_11
    move v4, v2

    .line 249
    goto :goto_5

    .line 250
    :cond_12
    :goto_4
    move v4, v0

    .line 251
    :goto_5
    invoke-static {v4}, LQ1/k;->g(Z)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p0, v1, v7, v8}, Ld2/q;->N(Ld2/m;LN1/n;LN1/n;)LU1/e;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    iget v6, v4, LU1/e;->d:I

    .line 259
    .line 260
    if-eqz v6, :cond_1d

    .line 261
    .line 262
    const/16 v10, 0x10

    .line 263
    .line 264
    if-eq v6, v0, :cond_19

    .line 265
    .line 266
    if-eq v6, v9, :cond_15

    .line 267
    .line 268
    if-ne v6, v5, :cond_14

    .line 269
    .line 270
    invoke-virtual {p0, v8}, Ld2/q;->D0(LN1/n;)Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-nez v0, :cond_13

    .line 275
    .line 276
    goto/16 :goto_9

    .line 277
    .line 278
    :cond_13
    iput-object v8, p0, Ld2/q;->L:LN1/n;

    .line 279
    .line 280
    if-eqz v3, :cond_1f

    .line 281
    .line 282
    invoke-virtual {p0}, Ld2/q;->Q()Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-nez v0, :cond_1f

    .line 287
    .line 288
    :goto_6
    move v10, v9

    .line 289
    goto/16 :goto_9

    .line 290
    .line 291
    :cond_14
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 292
    .line 293
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 294
    .line 295
    .line 296
    throw p1

    .line 297
    :cond_15
    invoke-virtual {p0, v8}, Ld2/q;->D0(LN1/n;)Z

    .line 298
    .line 299
    .line 300
    move-result v11

    .line 301
    if-nez v11, :cond_16

    .line 302
    .line 303
    goto :goto_9

    .line 304
    :cond_16
    iput-boolean v0, p0, Ld2/q;->j0:Z

    .line 305
    .line 306
    iput v0, p0, Ld2/q;->k0:I

    .line 307
    .line 308
    iget v10, p0, Ld2/q;->S:I

    .line 309
    .line 310
    if-eq v10, v9, :cond_18

    .line 311
    .line 312
    if-ne v10, v0, :cond_17

    .line 313
    .line 314
    iget v10, v8, LN1/n;->u:I

    .line 315
    .line 316
    iget v11, v7, LN1/n;->u:I

    .line 317
    .line 318
    if-ne v10, v11, :cond_17

    .line 319
    .line 320
    iget v10, v8, LN1/n;->v:I

    .line 321
    .line 322
    iget v11, v7, LN1/n;->v:I

    .line 323
    .line 324
    if-ne v10, v11, :cond_17

    .line 325
    .line 326
    goto :goto_7

    .line 327
    :cond_17
    move v0, v2

    .line 328
    :cond_18
    :goto_7
    iput-boolean v0, p0, Ld2/q;->W:Z

    .line 329
    .line 330
    iput-object v8, p0, Ld2/q;->L:LN1/n;

    .line 331
    .line 332
    if-eqz v3, :cond_1f

    .line 333
    .line 334
    invoke-virtual {p0}, Ld2/q;->Q()Z

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    if-nez v0, :cond_1f

    .line 339
    .line 340
    goto :goto_6

    .line 341
    :cond_19
    invoke-virtual {p0, v8}, Ld2/q;->D0(LN1/n;)Z

    .line 342
    .line 343
    .line 344
    move-result v11

    .line 345
    if-nez v11, :cond_1a

    .line 346
    .line 347
    goto :goto_9

    .line 348
    :cond_1a
    iput-object v8, p0, Ld2/q;->L:LN1/n;

    .line 349
    .line 350
    if-eqz v3, :cond_1b

    .line 351
    .line 352
    invoke-virtual {p0}, Ld2/q;->Q()Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-nez v0, :cond_1f

    .line 357
    .line 358
    goto :goto_6

    .line 359
    :cond_1b
    iget-boolean v3, p0, Ld2/q;->n0:Z

    .line 360
    .line 361
    if-eqz v3, :cond_1f

    .line 362
    .line 363
    iput v0, p0, Ld2/q;->l0:I

    .line 364
    .line 365
    iget-boolean v3, p0, Ld2/q;->U:Z

    .line 366
    .line 367
    if-eqz v3, :cond_1c

    .line 368
    .line 369
    iput v5, p0, Ld2/q;->m0:I

    .line 370
    .line 371
    goto :goto_6

    .line 372
    :cond_1c
    iput v0, p0, Ld2/q;->m0:I

    .line 373
    .line 374
    goto :goto_8

    .line 375
    :cond_1d
    iget-boolean v3, p0, Ld2/q;->n0:Z

    .line 376
    .line 377
    if-eqz v3, :cond_1e

    .line 378
    .line 379
    iput v0, p0, Ld2/q;->l0:I

    .line 380
    .line 381
    iput v5, p0, Ld2/q;->m0:I

    .line 382
    .line 383
    goto :goto_8

    .line 384
    :cond_1e
    invoke-virtual {p0}, Ld2/q;->t0()V

    .line 385
    .line 386
    .line 387
    invoke-virtual {p0}, Ld2/q;->e0()V

    .line 388
    .line 389
    .line 390
    :cond_1f
    :goto_8
    move v10, v2

    .line 391
    :goto_9
    if-eqz v6, :cond_21

    .line 392
    .line 393
    iget-object v0, p0, Ld2/q;->K:Ld2/j;

    .line 394
    .line 395
    if-ne v0, p1, :cond_20

    .line 396
    .line 397
    iget p1, p0, Ld2/q;->m0:I

    .line 398
    .line 399
    if-ne p1, v5, :cond_21

    .line 400
    .line 401
    :cond_20
    new-instance v5, LU1/e;

    .line 402
    .line 403
    iget-object v6, v1, Ld2/m;->a:Ljava/lang/String;

    .line 404
    .line 405
    const/4 v9, 0x0

    .line 406
    invoke-direct/range {v5 .. v10}, LU1/e;-><init>(Ljava/lang/String;LN1/n;LN1/n;II)V

    .line 407
    .line 408
    .line 409
    return-object v5

    .line 410
    :cond_21
    return-object v4

    .line 411
    :cond_22
    :goto_a
    iget-boolean p1, p0, Ld2/q;->n0:Z

    .line 412
    .line 413
    if-eqz p1, :cond_23

    .line 414
    .line 415
    iput v0, p0, Ld2/q;->l0:I

    .line 416
    .line 417
    iput v5, p0, Ld2/q;->m0:I

    .line 418
    .line 419
    goto :goto_b

    .line 420
    :cond_23
    invoke-virtual {p0}, Ld2/q;->t0()V

    .line 421
    .line 422
    .line 423
    invoke-virtual {p0}, Ld2/q;->e0()V

    .line 424
    .line 425
    .line 426
    :goto_b
    new-instance v5, LU1/e;

    .line 427
    .line 428
    const/16 v10, 0x80

    .line 429
    .line 430
    iget-object v6, v1, Ld2/m;->a:Ljava/lang/String;

    .line 431
    .line 432
    const/4 v9, 0x0

    .line 433
    invoke-direct/range {v5 .. v10}, LU1/e;-><init>(Ljava/lang/String;LN1/n;LN1/n;II)V

    .line 434
    .line 435
    .line 436
    return-object v5

    .line 437
    :cond_24
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 438
    .line 439
    const-string v0, "Sample MIME type is null."

    .line 440
    .line 441
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    const/16 v0, 0xfa5

    .line 445
    .line 446
    invoke-virtual {p0, p1, v1, v2, v0}, LU1/d;->C(Ljava/lang/Exception;LN1/n;ZI)LU1/j;

    .line 447
    .line 448
    .line 449
    move-result-object p1

    .line 450
    throw p1
.end method

.method public abstract k0(LN1/n;Landroid/media/MediaFormat;)V
.end method

.method public l0()V
    .locals 0

    .line 1
    return-void
.end method

.method public m0(J)V
    .locals 3

    .line 1
    iput-wide p1, p0, Ld2/q;->z0:J

    .line 2
    .line 3
    :goto_0
    iget-object v0, p0, Ld2/q;->z:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ld2/p;

    .line 16
    .line 17
    iget-wide v1, v1, Ld2/p;->a:J

    .line 18
    .line 19
    cmp-long v1, p1, v1

    .line 20
    .line 21
    if-ltz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ld2/p;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Ld2/q;->y0(Ld2/p;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Ld2/q;->n0()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-void
.end method

.method public abstract n0()V
.end method

.method public o0(LT1/d;)V
    .locals 0

    .line 1
    return-void
.end method

.method public p0(LN1/n;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final q0()V
    .locals 3

    .line 1
    iget v0, p0, Ld2/q;->m0:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_2

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    if-eq v0, v2, :cond_1

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    if-eq v0, v2, :cond_0

    .line 11
    .line 12
    iput-boolean v1, p0, Ld2/q;->t0:Z

    .line 13
    .line 14
    invoke-virtual {p0}, Ld2/q;->u0()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p0}, Ld2/q;->t0()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ld2/q;->e0()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-virtual {p0}, Ld2/q;->T()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ld2/q;->E0()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    invoke-virtual {p0}, Ld2/q;->T()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public abstract r0(JJLd2/j;Ljava/nio/ByteBuffer;IIIJZZLN1/n;)Z
.end method

.method public final s0(I)Z
    .locals 5

    .line 1
    iget-object v0, p0, LU1/d;->c:LS3/c;

    .line 2
    .line 3
    invoke-virtual {v0}, LS3/c;->i()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ld2/q;->u:LT1/d;

    .line 7
    .line 8
    invoke-virtual {v1}, LT1/d;->o()V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x4

    .line 12
    or-int/2addr p1, v2

    .line 13
    invoke-virtual {p0, v0, v1, p1}, LU1/d;->L(LS3/c;LT1/d;I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v3, -0x5

    .line 18
    const/4 v4, 0x1

    .line 19
    if-ne p1, v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ld2/q;->j0(LS3/c;)LU1/e;

    .line 22
    .line 23
    .line 24
    return v4

    .line 25
    :cond_0
    const/4 v0, -0x4

    .line 26
    if-ne p1, v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1, v2}, LH5/a;->h(I)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    iput-boolean v4, p0, Ld2/q;->s0:Z

    .line 35
    .line 36
    invoke-virtual {p0}, Ld2/q;->q0()V

    .line 37
    .line 38
    .line 39
    :cond_1
    const/4 p1, 0x0

    .line 40
    return p1
.end method

.method public t(FF)V
    .locals 0

    .line 1
    iput p1, p0, Ld2/q;->I:F

    .line 2
    .line 3
    iput p2, p0, Ld2/q;->J:F

    .line 4
    .line 5
    iget-object p1, p0, Ld2/q;->L:LN1/n;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ld2/q;->D0(LN1/n;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final t0()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Ld2/q;->K:Ld2/j;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    invoke-interface {v1}, Ld2/j;->release()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Ld2/q;->x0:LH5/e;

    .line 10
    .line 11
    iget v2, v1, LH5/e;->c:I

    .line 12
    .line 13
    add-int/lit8 v2, v2, 0x1

    .line 14
    .line 15
    iput v2, v1, LH5/e;->c:I

    .line 16
    .line 17
    iget-object v1, p0, Ld2/q;->R:Ld2/m;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v1, v1, Ld2/m;->a:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Ld2/q;->i0(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    goto :goto_3

    .line 30
    :cond_0
    :goto_0
    iput-object v0, p0, Ld2/q;->K:Ld2/j;

    .line 31
    .line 32
    :try_start_1
    iget-object v1, p0, Ld2/q;->G:Landroid/media/MediaCrypto;

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/media/MediaCrypto;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_1
    move-exception v1

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    :goto_1
    iput-object v0, p0, Ld2/q;->G:Landroid/media/MediaCrypto;

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Ld2/q;->x0(LS3/l;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Ld2/q;->w0()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :goto_2
    iput-object v0, p0, Ld2/q;->G:Landroid/media/MediaCrypto;

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Ld2/q;->x0(LS3/l;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Ld2/q;->w0()V

    .line 57
    .line 58
    .line 59
    throw v1

    .line 60
    :goto_3
    iput-object v0, p0, Ld2/q;->K:Ld2/j;

    .line 61
    .line 62
    :try_start_2
    iget-object v2, p0, Ld2/q;->G:Landroid/media/MediaCrypto;

    .line 63
    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    invoke-virtual {v2}, Landroid/media/MediaCrypto;->release()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 67
    .line 68
    .line 69
    goto :goto_4

    .line 70
    :catchall_2
    move-exception v1

    .line 71
    goto :goto_5

    .line 72
    :cond_2
    :goto_4
    iput-object v0, p0, Ld2/q;->G:Landroid/media/MediaCrypto;

    .line 73
    .line 74
    invoke-virtual {p0, v0}, Ld2/q;->x0(LS3/l;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Ld2/q;->w0()V

    .line 78
    .line 79
    .line 80
    throw v1

    .line 81
    :goto_5
    iput-object v0, p0, Ld2/q;->G:Landroid/media/MediaCrypto;

    .line 82
    .line 83
    invoke-virtual {p0, v0}, Ld2/q;->x0(LS3/l;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Ld2/q;->w0()V

    .line 87
    .line 88
    .line 89
    throw v1
.end method

.method public final u()I
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    return v0
.end method

.method public u0()V
    .locals 0

    .line 1
    return-void
.end method

.method public v(JJ)V
    .locals 11

    .line 1
    iget-boolean v0, p0, Ld2/q;->v0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, Ld2/q;->v0:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Ld2/q;->q0()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Ld2/q;->w0:LU1/j;

    .line 12
    .line 13
    if-nez v0, :cond_11

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    :try_start_0
    iget-boolean v2, p0, Ld2/q;->t0:Z

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Ld2/q;->u0()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catch_0
    move-exception p1

    .line 25
    goto/16 :goto_8

    .line 26
    .line 27
    :catch_1
    move-exception p1

    .line 28
    goto/16 :goto_b

    .line 29
    .line 30
    :cond_1
    iget-object v2, p0, Ld2/q;->B:LN1/n;

    .line 31
    .line 32
    if-nez v2, :cond_2

    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    invoke-virtual {p0, v2}, Ld2/q;->s0(I)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    invoke-virtual {p0}, Ld2/q;->e0()V

    .line 43
    .line 44
    .line 45
    iget-boolean v2, p0, Ld2/q;->g0:Z

    .line 46
    .line 47
    if-eqz v2, :cond_4

    .line 48
    .line 49
    const-string v2, "bypassRender"

    .line 50
    .line 51
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-virtual {p0, p1, p2, p3, p4}, Ld2/q;->M(JJ)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_7

    .line 65
    .line 66
    :cond_4
    iget-object v2, p0, Ld2/q;->K:Ld2/j;

    .line 67
    .line 68
    if-eqz v2, :cond_b

    .line 69
    .line 70
    iget-object v2, p0, LU1/d;->g:LQ1/q;

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 76
    .line 77
    .line 78
    move-result-wide v2

    .line 79
    const-string v4, "drainAndFeed"

    .line 80
    .line 81
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    invoke-virtual {p0, p1, p2, p3, p4}, Ld2/q;->R(JJ)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    if-eqz v4, :cond_7

    .line 94
    .line 95
    iget-wide v7, p0, Ld2/q;->H:J

    .line 96
    .line 97
    cmp-long v4, v7, v5

    .line 98
    .line 99
    if-eqz v4, :cond_6

    .line 100
    .line 101
    iget-object v4, p0, LU1/d;->g:LQ1/q;

    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 107
    .line 108
    .line 109
    move-result-wide v9

    .line 110
    sub-long/2addr v9, v2

    .line 111
    cmp-long v4, v9, v7

    .line 112
    .line 113
    if-gez v4, :cond_5

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_5
    move v4, v1

    .line 117
    goto :goto_3

    .line 118
    :cond_6
    :goto_2
    move v4, v0

    .line 119
    :goto_3
    if-eqz v4, :cond_7

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_7
    :goto_4
    invoke-virtual {p0}, Ld2/q;->S()Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-eqz p1, :cond_a

    .line 127
    .line 128
    iget-wide p1, p0, Ld2/q;->H:J

    .line 129
    .line 130
    cmp-long p3, p1, v5

    .line 131
    .line 132
    if-eqz p3, :cond_9

    .line 133
    .line 134
    iget-object p3, p0, LU1/d;->g:LQ1/q;

    .line 135
    .line 136
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 140
    .line 141
    .line 142
    move-result-wide p3

    .line 143
    sub-long/2addr p3, v2

    .line 144
    cmp-long p1, p3, p1

    .line 145
    .line 146
    if-gez p1, :cond_8

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_8
    move p1, v1

    .line 150
    goto :goto_6

    .line 151
    :cond_9
    :goto_5
    move p1, v0

    .line 152
    :goto_6
    if-eqz p1, :cond_a

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_a
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 156
    .line 157
    .line 158
    goto :goto_7

    .line 159
    :cond_b
    iget-object p3, p0, Ld2/q;->x0:LH5/e;

    .line 160
    .line 161
    iget p4, p3, LH5/e;->e:I

    .line 162
    .line 163
    iget-object v2, p0, LU1/d;->i:Lk2/d0;

    .line 164
    .line 165
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    iget-wide v3, p0, LU1/d;->k:J

    .line 169
    .line 170
    sub-long/2addr p1, v3

    .line 171
    invoke-interface {v2, p1, p2}, Lk2/d0;->g(J)I

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    add-int/2addr p4, p1

    .line 176
    iput p4, p3, LH5/e;->e:I

    .line 177
    .line 178
    invoke-virtual {p0, v0}, Ld2/q;->s0(I)Z

    .line 179
    .line 180
    .line 181
    :goto_7
    iget-object p1, p0, Ld2/q;->x0:LH5/e;

    .line 182
    .line 183
    monitor-enter p1

    .line 184
    monitor-exit p1
    :try_end_0
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 185
    return-void

    .line 186
    :goto_8
    instance-of p2, p1, Landroid/media/MediaCodec$CodecException;

    .line 187
    .line 188
    if-eqz p2, :cond_c

    .line 189
    .line 190
    goto :goto_9

    .line 191
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 192
    .line 193
    .line 194
    move-result-object p3

    .line 195
    array-length p4, p3

    .line 196
    if-lez p4, :cond_10

    .line 197
    .line 198
    aget-object p3, p3, v1

    .line 199
    .line 200
    invoke-virtual {p3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p3

    .line 204
    const-string p4, "android.media.MediaCodec"

    .line 205
    .line 206
    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result p3

    .line 210
    if-eqz p3, :cond_10

    .line 211
    .line 212
    :goto_9
    invoke-virtual {p0, p1}, Ld2/q;->g0(Ljava/lang/Exception;)V

    .line 213
    .line 214
    .line 215
    if-eqz p2, :cond_d

    .line 216
    .line 217
    move-object p2, p1

    .line 218
    check-cast p2, Landroid/media/MediaCodec$CodecException;

    .line 219
    .line 220
    invoke-virtual {p2}, Landroid/media/MediaCodec$CodecException;->isRecoverable()Z

    .line 221
    .line 222
    .line 223
    move-result p2

    .line 224
    if-eqz p2, :cond_d

    .line 225
    .line 226
    move v1, v0

    .line 227
    :cond_d
    if-eqz v1, :cond_e

    .line 228
    .line 229
    invoke-virtual {p0}, Ld2/q;->t0()V

    .line 230
    .line 231
    .line 232
    :cond_e
    iget-object p2, p0, Ld2/q;->R:Ld2/m;

    .line 233
    .line 234
    invoke-virtual {p0, p1, p2}, Ld2/q;->O(Ljava/lang/IllegalStateException;Ld2/m;)Ld2/l;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    iget p2, p1, Ld2/l;->a:I

    .line 239
    .line 240
    const/16 p3, 0x44d

    .line 241
    .line 242
    if-ne p2, p3, :cond_f

    .line 243
    .line 244
    const/16 p2, 0xfa6

    .line 245
    .line 246
    goto :goto_a

    .line 247
    :cond_f
    const/16 p2, 0xfa3

    .line 248
    .line 249
    :goto_a
    iget-object p3, p0, Ld2/q;->B:LN1/n;

    .line 250
    .line 251
    invoke-virtual {p0, p1, p3, v1, p2}, LU1/d;->C(Ljava/lang/Exception;LN1/n;ZI)LU1/j;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    throw p1

    .line 256
    :cond_10
    throw p1

    .line 257
    :goto_b
    iget-object p2, p0, Ld2/q;->B:LN1/n;

    .line 258
    .line 259
    invoke-virtual {p1}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    .line 260
    .line 261
    .line 262
    move-result p3

    .line 263
    invoke-static {p3}, LQ1/x;->u(I)I

    .line 264
    .line 265
    .line 266
    move-result p3

    .line 267
    invoke-virtual {p0, p1, p2, v1, p3}, LU1/d;->C(Ljava/lang/Exception;LN1/n;ZI)LU1/j;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    throw p1

    .line 272
    :cond_11
    const/4 p1, 0x0

    .line 273
    iput-object p1, p0, Ld2/q;->w0:LU1/j;

    .line 274
    .line 275
    throw v0
.end method

.method public v0()V
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Ld2/q;->b0:I

    .line 3
    .line 4
    iget-object v1, p0, Ld2/q;->v:LT1/d;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    iput-object v2, v1, LT1/d;->e:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    iput v0, p0, Ld2/q;->c0:I

    .line 10
    .line 11
    iput-object v2, p0, Ld2/q;->d0:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v0, p0, Ld2/q;->a0:J

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    iput-boolean v2, p0, Ld2/q;->o0:Z

    .line 22
    .line 23
    iput-wide v0, p0, Ld2/q;->Z:J

    .line 24
    .line 25
    iput-boolean v2, p0, Ld2/q;->n0:Z

    .line 26
    .line 27
    iput-boolean v2, p0, Ld2/q;->W:Z

    .line 28
    .line 29
    iput-boolean v2, p0, Ld2/q;->X:Z

    .line 30
    .line 31
    iput-boolean v2, p0, Ld2/q;->e0:Z

    .line 32
    .line 33
    iput-boolean v2, p0, Ld2/q;->f0:Z

    .line 34
    .line 35
    iput-wide v0, p0, Ld2/q;->q0:J

    .line 36
    .line 37
    iput-wide v0, p0, Ld2/q;->r0:J

    .line 38
    .line 39
    iput-wide v0, p0, Ld2/q;->z0:J

    .line 40
    .line 41
    iput v2, p0, Ld2/q;->l0:I

    .line 42
    .line 43
    iput v2, p0, Ld2/q;->m0:I

    .line 44
    .line 45
    iget-boolean v0, p0, Ld2/q;->j0:Z

    .line 46
    .line 47
    iput v0, p0, Ld2/q;->k0:I

    .line 48
    .line 49
    return-void
.end method

.method public final w0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ld2/q;->v0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Ld2/q;->w0:LU1/j;

    .line 6
    .line 7
    iput-object v0, p0, Ld2/q;->P:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    iput-object v0, p0, Ld2/q;->R:Ld2/m;

    .line 10
    .line 11
    iput-object v0, p0, Ld2/q;->L:LN1/n;

    .line 12
    .line 13
    iput-object v0, p0, Ld2/q;->M:Landroid/media/MediaFormat;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Ld2/q;->N:Z

    .line 17
    .line 18
    iput-boolean v0, p0, Ld2/q;->p0:Z

    .line 19
    .line 20
    const/high16 v1, -0x40800000    # -1.0f

    .line 21
    .line 22
    iput v1, p0, Ld2/q;->O:F

    .line 23
    .line 24
    iput v0, p0, Ld2/q;->S:I

    .line 25
    .line 26
    iput-boolean v0, p0, Ld2/q;->T:Z

    .line 27
    .line 28
    iput-boolean v0, p0, Ld2/q;->U:Z

    .line 29
    .line 30
    iput-boolean v0, p0, Ld2/q;->V:Z

    .line 31
    .line 32
    iput-boolean v0, p0, Ld2/q;->Y:Z

    .line 33
    .line 34
    iput-boolean v0, p0, Ld2/q;->j0:Z

    .line 35
    .line 36
    iput v0, p0, Ld2/q;->k0:I

    .line 37
    .line 38
    return-void
.end method

.method public final x0(LS3/l;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ld2/q;->D:LS3/l;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1, v1}, LS3/l;->h(LZ1/d;)V

    .line 10
    .line 11
    .line 12
    :cond_1
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {v0, v1}, LS3/l;->s(LZ1/d;)V

    .line 15
    .line 16
    .line 17
    :cond_2
    :goto_0
    iput-object p1, p0, Ld2/q;->D:LS3/l;

    .line 18
    .line 19
    return-void
.end method

.method public final y0(Ld2/p;)V
    .locals 4

    .line 1
    iput-object p1, p0, Ld2/q;->y0:Ld2/p;

    .line 2
    .line 3
    iget-wide v0, p1, Ld2/p;->c:J

    .line 4
    .line 5
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long p1, v0, v2

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Ld2/q;->A0:Z

    .line 16
    .line 17
    invoke-virtual {p0}, Ld2/q;->l0()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public z0(Ld2/m;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method
