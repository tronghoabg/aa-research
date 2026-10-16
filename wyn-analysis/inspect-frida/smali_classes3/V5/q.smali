.class public abstract LV5/q;
.super LE5/f;
.source "SourceFile"


# static fields
.field public static final D0:[B


# instance fields
.field public A:LE5/T;

.field public A0:J

.field public B:LA/e0;

.field public B0:J

.field public C:LA/e0;

.field public C0:I

.field public D:Landroid/media/MediaCrypto;

.field public E:Z

.field public final F:J

.field public G:F

.field public H:F

.field public I:LV5/k;

.field public J:LE5/T;

.field public K:Landroid/media/MediaFormat;

.field public L:Z

.field public M:F

.field public N:Ljava/util/ArrayDeque;

.field public O:LV5/p;

.field public P:LV5/n;

.field public Q:I

.field public R:Z

.field public S:Z

.field public T:Z

.field public U:Z

.field public V:Z

.field public W:Z

.field public X:Z

.field public Y:Z

.field public Z:Z

.field public a0:Z

.field public b0:LV5/h;

.field public c0:J

.field public d0:I

.field public e0:I

.field public f0:Ljava/nio/ByteBuffer;

.field public g0:Z

.field public h0:Z

.field public i0:Z

.field public j0:Z

.field public k0:Z

.field public l0:Z

.field public final m:LV5/j;

.field public m0:I

.field public final n:LV5/r;

.field public n0:I

.field public final o:F

.field public o0:I

.field public final p:LH5/h;

.field public p0:Z

.field public final q:LH5/h;

.field public q0:Z

.field public final r:LH5/h;

.field public r0:Z

.field public final s:LV5/g;

.field public s0:J

.field public final t:LQ1/t;

.field public t0:J

.field public final u:Ljava/util/ArrayList;

.field public u0:Z

.field public final v:Landroid/media/MediaCodec$BufferInfo;

.field public v0:Z

.field public final w:[J

.field public w0:Z

.field public final x:[J

.field public x0:Z

.field public final y:[J

.field public y0:LE5/o;

.field public z:LE5/T;

.field public z0:LH5/e;


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
    sput-object v0, LV5/q;->D0:[B

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

.method public constructor <init>(ILV5/j;F)V
    .locals 3

    .line 1
    sget-object v0, LV5/r;->b:LV5/r;

    .line 2
    .line 3
    invoke-direct {p0, p1}, LE5/f;-><init>(I)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, LV5/q;->m:LV5/j;

    .line 7
    .line 8
    iput-object v0, p0, LV5/q;->n:LV5/r;

    .line 9
    .line 10
    iput p3, p0, LV5/q;->o:F

    .line 11
    .line 12
    new-instance p1, LH5/h;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-direct {p1, p2}, LH5/h;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, LV5/q;->p:LH5/h;

    .line 19
    .line 20
    new-instance p1, LH5/h;

    .line 21
    .line 22
    invoke-direct {p1, p2}, LH5/h;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, LV5/q;->q:LH5/h;

    .line 26
    .line 27
    new-instance p1, LH5/h;

    .line 28
    .line 29
    const/4 p3, 0x2

    .line 30
    invoke-direct {p1, p3}, LH5/h;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, LV5/q;->r:LH5/h;

    .line 34
    .line 35
    new-instance p1, LV5/g;

    .line 36
    .line 37
    invoke-direct {p1, p3}, LH5/h;-><init>(I)V

    .line 38
    .line 39
    .line 40
    const/16 p3, 0x20

    .line 41
    .line 42
    iput p3, p1, LV5/g;->k:I

    .line 43
    .line 44
    iput-object p1, p0, LV5/q;->s:LV5/g;

    .line 45
    .line 46
    new-instance p3, LQ1/t;

    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    invoke-direct {p3, v0}, LQ1/t;-><init>(I)V

    .line 50
    .line 51
    .line 52
    iput-object p3, p0, LV5/q;->t:LQ1/t;

    .line 53
    .line 54
    new-instance p3, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p3, p0, LV5/q;->u:Ljava/util/ArrayList;

    .line 60
    .line 61
    new-instance p3, Landroid/media/MediaCodec$BufferInfo;

    .line 62
    .line 63
    invoke-direct {p3}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object p3, p0, LV5/q;->v:Landroid/media/MediaCodec$BufferInfo;

    .line 67
    .line 68
    const/high16 p3, 0x3f800000    # 1.0f

    .line 69
    .line 70
    iput p3, p0, LV5/q;->G:F

    .line 71
    .line 72
    iput p3, p0, LV5/q;->H:F

    .line 73
    .line 74
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    iput-wide v0, p0, LV5/q;->F:J

    .line 80
    .line 81
    const/16 p3, 0xa

    .line 82
    .line 83
    new-array v2, p3, [J

    .line 84
    .line 85
    iput-object v2, p0, LV5/q;->w:[J

    .line 86
    .line 87
    new-array v2, p3, [J

    .line 88
    .line 89
    iput-object v2, p0, LV5/q;->x:[J

    .line 90
    .line 91
    new-array p3, p3, [J

    .line 92
    .line 93
    iput-object p3, p0, LV5/q;->y:[J

    .line 94
    .line 95
    iput-wide v0, p0, LV5/q;->A0:J

    .line 96
    .line 97
    invoke-virtual {p0, v0, v1}, LV5/q;->i0(J)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, p2}, LH5/h;->r(I)V

    .line 101
    .line 102
    .line 103
    iget-object p1, p1, LH5/h;->d:Ljava/nio/ByteBuffer;

    .line 104
    .line 105
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 106
    .line 107
    .line 108
    move-result-object p3

    .line 109
    invoke-virtual {p1, p3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 110
    .line 111
    .line 112
    const/high16 p1, -0x40800000    # -1.0f

    .line 113
    .line 114
    iput p1, p0, LV5/q;->M:F

    .line 115
    .line 116
    iput p2, p0, LV5/q;->Q:I

    .line 117
    .line 118
    iput p2, p0, LV5/q;->m0:I

    .line 119
    .line 120
    const/4 p1, -0x1

    .line 121
    iput p1, p0, LV5/q;->d0:I

    .line 122
    .line 123
    iput p1, p0, LV5/q;->e0:I

    .line 124
    .line 125
    iput-wide v0, p0, LV5/q;->c0:J

    .line 126
    .line 127
    iput-wide v0, p0, LV5/q;->s0:J

    .line 128
    .line 129
    iput-wide v0, p0, LV5/q;->t0:J

    .line 130
    .line 131
    iput p2, p0, LV5/q;->n0:I

    .line 132
    .line 133
    iput p2, p0, LV5/q;->o0:I

    .line 134
    .line 135
    return-void
.end method


# virtual methods
.method public A(Ljava/lang/IllegalStateException;LV5/n;)LV5/l;
    .locals 1

    .line 1
    new-instance v0, LV5/l;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, LV5/l;-><init>(Ljava/lang/IllegalStateException;LV5/n;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final B()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LV5/q;->k0:Z

    .line 3
    .line 4
    iget-object v1, p0, LV5/q;->s:LV5/g;

    .line 5
    .line 6
    invoke-virtual {v1}, LV5/g;->o()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, LV5/q;->r:LH5/h;

    .line 10
    .line 11
    invoke-virtual {v1}, LH5/h;->o()V

    .line 12
    .line 13
    .line 14
    iput-boolean v0, p0, LV5/q;->j0:Z

    .line 15
    .line 16
    iput-boolean v0, p0, LV5/q;->i0:Z

    .line 17
    .line 18
    return-void
.end method

.method public final C()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, LV5/q;->p0:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iput v1, p0, LV5/q;->n0:I

    .line 7
    .line 8
    iget-boolean v0, p0, LV5/q;->S:Z

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    iget-boolean v0, p0, LV5/q;->U:Z

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x2

    .line 18
    iput v0, p0, LV5/q;->o0:I

    .line 19
    .line 20
    return v1

    .line 21
    :cond_1
    :goto_0
    const/4 v0, 0x3

    .line 22
    iput v0, p0, LV5/q;->o0:I

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    return v0

    .line 26
    :cond_2
    invoke-virtual {p0}, LV5/q;->n0()V

    .line 27
    .line 28
    .line 29
    return v1
.end method

.method public final D(JJ)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LV5/q;->e0:I

    .line 4
    .line 5
    const/4 v15, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ltz v1, :cond_0

    .line 8
    .line 9
    move v1, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v15

    .line 12
    :goto_0
    iget-object v3, v0, LV5/q;->v:Landroid/media/MediaCodec$BufferInfo;

    .line 13
    .line 14
    if-nez v1, :cond_f

    .line 15
    .line 16
    iget-boolean v1, v0, LV5/q;->V:Z

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    iget-boolean v1, v0, LV5/q;->q0:Z

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    :try_start_0
    iget-object v1, v0, LV5/q;->I:LV5/k;

    .line 25
    .line 26
    invoke-interface {v1, v3}, LV5/k;->q(Landroid/media/MediaCodec$BufferInfo;)I

    .line 27
    .line 28
    .line 29
    move-result v1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    goto :goto_1

    .line 31
    :catch_0
    invoke-virtual {v0}, LV5/q;->a0()V

    .line 32
    .line 33
    .line 34
    iget-boolean v1, v0, LV5/q;->v0:Z

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0}, LV5/q;->d0()V

    .line 39
    .line 40
    .line 41
    :cond_1
    move/from16 v17, v15

    .line 42
    .line 43
    goto/16 :goto_7

    .line 44
    .line 45
    :cond_2
    iget-object v1, v0, LV5/q;->I:LV5/k;

    .line 46
    .line 47
    invoke-interface {v1, v3}, LV5/k;->q(Landroid/media/MediaCodec$BufferInfo;)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    :goto_1
    if-gez v1, :cond_7

    .line 52
    .line 53
    const/4 v3, -0x2

    .line 54
    if-ne v1, v3, :cond_5

    .line 55
    .line 56
    iput-boolean v2, v0, LV5/q;->r0:Z

    .line 57
    .line 58
    iget-object v1, v0, LV5/q;->I:LV5/k;

    .line 59
    .line 60
    invoke-interface {v1}, LV5/k;->f()Landroid/media/MediaFormat;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget v3, v0, LV5/q;->Q:I

    .line 65
    .line 66
    if-eqz v3, :cond_3

    .line 67
    .line 68
    const-string v3, "width"

    .line 69
    .line 70
    invoke-virtual {v1, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    const/16 v4, 0x20

    .line 75
    .line 76
    if-ne v3, v4, :cond_3

    .line 77
    .line 78
    const-string v3, "height"

    .line 79
    .line 80
    invoke-virtual {v1, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-ne v3, v4, :cond_3

    .line 85
    .line 86
    iput-boolean v2, v0, LV5/q;->Z:Z

    .line 87
    .line 88
    return v2

    .line 89
    :cond_3
    iget-boolean v3, v0, LV5/q;->X:Z

    .line 90
    .line 91
    if-eqz v3, :cond_4

    .line 92
    .line 93
    const-string v3, "channel-count"

    .line 94
    .line 95
    invoke-virtual {v1, v3, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 96
    .line 97
    .line 98
    :cond_4
    iput-object v1, v0, LV5/q;->K:Landroid/media/MediaFormat;

    .line 99
    .line 100
    iput-boolean v2, v0, LV5/q;->L:Z

    .line 101
    .line 102
    return v2

    .line 103
    :cond_5
    iget-boolean v1, v0, LV5/q;->a0:Z

    .line 104
    .line 105
    if-eqz v1, :cond_1

    .line 106
    .line 107
    iget-boolean v1, v0, LV5/q;->u0:Z

    .line 108
    .line 109
    if-nez v1, :cond_6

    .line 110
    .line 111
    iget v1, v0, LV5/q;->n0:I

    .line 112
    .line 113
    const/4 v2, 0x2

    .line 114
    if-ne v1, v2, :cond_1

    .line 115
    .line 116
    :cond_6
    invoke-virtual {v0}, LV5/q;->a0()V

    .line 117
    .line 118
    .line 119
    return v15

    .line 120
    :cond_7
    iget-boolean v4, v0, LV5/q;->Z:Z

    .line 121
    .line 122
    if-eqz v4, :cond_8

    .line 123
    .line 124
    iput-boolean v15, v0, LV5/q;->Z:Z

    .line 125
    .line 126
    iget-object v3, v0, LV5/q;->I:LV5/k;

    .line 127
    .line 128
    invoke-interface {v3, v1, v15}, LV5/k;->x(IZ)V

    .line 129
    .line 130
    .line 131
    return v2

    .line 132
    :cond_8
    iget v4, v3, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 133
    .line 134
    if-nez v4, :cond_9

    .line 135
    .line 136
    iget v4, v3, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 137
    .line 138
    and-int/lit8 v4, v4, 0x4

    .line 139
    .line 140
    if-eqz v4, :cond_9

    .line 141
    .line 142
    invoke-virtual {v0}, LV5/q;->a0()V

    .line 143
    .line 144
    .line 145
    return v15

    .line 146
    :cond_9
    iput v1, v0, LV5/q;->e0:I

    .line 147
    .line 148
    iget-object v4, v0, LV5/q;->I:LV5/k;

    .line 149
    .line 150
    invoke-interface {v4, v1}, LV5/k;->r(I)Ljava/nio/ByteBuffer;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    iput-object v1, v0, LV5/q;->f0:Ljava/nio/ByteBuffer;

    .line 155
    .line 156
    if-eqz v1, :cond_a

    .line 157
    .line 158
    iget v4, v3, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 159
    .line 160
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 161
    .line 162
    .line 163
    iget-object v1, v0, LV5/q;->f0:Ljava/nio/ByteBuffer;

    .line 164
    .line 165
    iget v4, v3, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 166
    .line 167
    iget v5, v3, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 168
    .line 169
    add-int/2addr v4, v5

    .line 170
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 171
    .line 172
    .line 173
    :cond_a
    iget-boolean v1, v0, LV5/q;->W:Z

    .line 174
    .line 175
    if-eqz v1, :cond_b

    .line 176
    .line 177
    iget-wide v4, v3, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 178
    .line 179
    const-wide/16 v6, 0x0

    .line 180
    .line 181
    cmp-long v1, v4, v6

    .line 182
    .line 183
    if-nez v1, :cond_b

    .line 184
    .line 185
    iget v1, v3, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 186
    .line 187
    and-int/lit8 v1, v1, 0x4

    .line 188
    .line 189
    if-eqz v1, :cond_b

    .line 190
    .line 191
    iget-wide v4, v0, LV5/q;->s0:J

    .line 192
    .line 193
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    cmp-long v1, v4, v6

    .line 199
    .line 200
    if-eqz v1, :cond_b

    .line 201
    .line 202
    iput-wide v4, v3, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 203
    .line 204
    :cond_b
    iget-wide v4, v3, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 205
    .line 206
    iget-object v1, v0, LV5/q;->u:Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    move v7, v15

    .line 213
    :goto_2
    if-ge v7, v6, :cond_d

    .line 214
    .line 215
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v8

    .line 219
    check-cast v8, Ljava/lang/Long;

    .line 220
    .line 221
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 222
    .line 223
    .line 224
    move-result-wide v8

    .line 225
    cmp-long v8, v8, v4

    .line 226
    .line 227
    if-nez v8, :cond_c

    .line 228
    .line 229
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move v1, v2

    .line 233
    goto :goto_3

    .line 234
    :cond_c
    add-int/lit8 v7, v7, 0x1

    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_d
    move v1, v15

    .line 238
    :goto_3
    iput-boolean v1, v0, LV5/q;->g0:Z

    .line 239
    .line 240
    iget-wide v4, v0, LV5/q;->t0:J

    .line 241
    .line 242
    iget-wide v6, v3, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 243
    .line 244
    cmp-long v1, v4, v6

    .line 245
    .line 246
    if-nez v1, :cond_e

    .line 247
    .line 248
    move v1, v2

    .line 249
    goto :goto_4

    .line 250
    :cond_e
    move v1, v15

    .line 251
    :goto_4
    iput-boolean v1, v0, LV5/q;->h0:Z

    .line 252
    .line 253
    invoke-virtual {v0, v6, v7}, LV5/q;->o0(J)V

    .line 254
    .line 255
    .line 256
    :cond_f
    iget-boolean v1, v0, LV5/q;->V:Z

    .line 257
    .line 258
    if-eqz v1, :cond_10

    .line 259
    .line 260
    iget-boolean v1, v0, LV5/q;->q0:Z

    .line 261
    .line 262
    if-eqz v1, :cond_10

    .line 263
    .line 264
    :try_start_1
    iget-object v5, v0, LV5/q;->I:LV5/k;

    .line 265
    .line 266
    iget-object v6, v0, LV5/q;->f0:Ljava/nio/ByteBuffer;

    .line 267
    .line 268
    iget v7, v0, LV5/q;->e0:I

    .line 269
    .line 270
    iget v8, v3, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 271
    .line 272
    iget-wide v10, v3, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 273
    .line 274
    iget-boolean v12, v0, LV5/q;->g0:Z

    .line 275
    .line 276
    iget-boolean v13, v0, LV5/q;->h0:Z

    .line 277
    .line 278
    iget-object v14, v0, LV5/q;->A:LE5/T;
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 279
    .line 280
    const/4 v9, 0x1

    .line 281
    move/from16 v16, v2

    .line 282
    .line 283
    move/from16 v17, v15

    .line 284
    .line 285
    move-wide/from16 v1, p1

    .line 286
    .line 287
    move-object v15, v3

    .line 288
    move-wide/from16 v3, p3

    .line 289
    .line 290
    :try_start_2
    invoke-virtual/range {v0 .. v14}, LV5/q;->b0(JJLV5/k;Ljava/nio/ByteBuffer;IIIJZZLE5/T;)Z

    .line 291
    .line 292
    .line 293
    move-result v1
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2

    .line 294
    goto :goto_5

    .line 295
    :catch_1
    move/from16 v17, v15

    .line 296
    .line 297
    :catch_2
    invoke-virtual {v0}, LV5/q;->a0()V

    .line 298
    .line 299
    .line 300
    iget-boolean v1, v0, LV5/q;->v0:Z

    .line 301
    .line 302
    if-eqz v1, :cond_13

    .line 303
    .line 304
    invoke-virtual {v0}, LV5/q;->d0()V

    .line 305
    .line 306
    .line 307
    goto :goto_7

    .line 308
    :cond_10
    move/from16 v16, v2

    .line 309
    .line 310
    move/from16 v17, v15

    .line 311
    .line 312
    move-object v15, v3

    .line 313
    iget-object v5, v0, LV5/q;->I:LV5/k;

    .line 314
    .line 315
    iget-object v6, v0, LV5/q;->f0:Ljava/nio/ByteBuffer;

    .line 316
    .line 317
    iget v7, v0, LV5/q;->e0:I

    .line 318
    .line 319
    iget v8, v15, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 320
    .line 321
    iget-wide v10, v15, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 322
    .line 323
    iget-boolean v12, v0, LV5/q;->g0:Z

    .line 324
    .line 325
    iget-boolean v13, v0, LV5/q;->h0:Z

    .line 326
    .line 327
    iget-object v14, v0, LV5/q;->A:LE5/T;

    .line 328
    .line 329
    const/4 v9, 0x1

    .line 330
    move-wide/from16 v1, p1

    .line 331
    .line 332
    move-wide/from16 v3, p3

    .line 333
    .line 334
    invoke-virtual/range {v0 .. v14}, LV5/q;->b0(JJLV5/k;Ljava/nio/ByteBuffer;IIIJZZLE5/T;)Z

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    :goto_5
    if-eqz v1, :cond_13

    .line 339
    .line 340
    iget-wide v1, v15, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 341
    .line 342
    invoke-virtual {v0, v1, v2}, LV5/q;->X(J)V

    .line 343
    .line 344
    .line 345
    iget v1, v15, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 346
    .line 347
    and-int/lit8 v1, v1, 0x4

    .line 348
    .line 349
    if-eqz v1, :cond_11

    .line 350
    .line 351
    move/from16 v2, v16

    .line 352
    .line 353
    goto :goto_6

    .line 354
    :cond_11
    move/from16 v2, v17

    .line 355
    .line 356
    :goto_6
    const/4 v1, -0x1

    .line 357
    iput v1, v0, LV5/q;->e0:I

    .line 358
    .line 359
    const/4 v1, 0x0

    .line 360
    iput-object v1, v0, LV5/q;->f0:Ljava/nio/ByteBuffer;

    .line 361
    .line 362
    if-nez v2, :cond_12

    .line 363
    .line 364
    return v16

    .line 365
    :cond_12
    invoke-virtual {v0}, LV5/q;->a0()V

    .line 366
    .line 367
    .line 368
    :cond_13
    :goto_7
    return v17
.end method

.method public final E()Z
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LV5/q;->I:LV5/k;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget v3, v1, LV5/q;->n0:I

    .line 9
    .line 10
    const/4 v4, 0x2

    .line 11
    if-eq v3, v4, :cond_0

    .line 12
    .line 13
    iget-boolean v3, v1, LV5/q;->u0:Z

    .line 14
    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    :cond_0
    :goto_0
    move v4, v2

    .line 18
    goto/16 :goto_c

    .line 19
    .line 20
    :cond_1
    iget v3, v1, LV5/q;->d0:I

    .line 21
    .line 22
    iget-object v5, v1, LV5/q;->q:LH5/h;

    .line 23
    .line 24
    if-gez v3, :cond_3

    .line 25
    .line 26
    invoke-interface {v0}, LV5/k;->o()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iput v0, v1, LV5/q;->d0:I

    .line 31
    .line 32
    if-gez v0, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    iget-object v3, v1, LV5/q;->I:LV5/k;

    .line 36
    .line 37
    invoke-interface {v3, v0}, LV5/k;->i(I)Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, v5, LH5/h;->d:Ljava/nio/ByteBuffer;

    .line 42
    .line 43
    invoke-virtual {v5}, LH5/h;->o()V

    .line 44
    .line 45
    .line 46
    :cond_3
    iget v0, v1, LV5/q;->n0:I

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    const/4 v6, -0x1

    .line 50
    const/4 v7, 0x1

    .line 51
    if-ne v0, v7, :cond_5

    .line 52
    .line 53
    iget-boolean v0, v1, LV5/q;->a0:Z

    .line 54
    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_4
    iput-boolean v7, v1, LV5/q;->q0:Z

    .line 59
    .line 60
    iget-object v8, v1, LV5/q;->I:LV5/k;

    .line 61
    .line 62
    iget v9, v1, LV5/q;->d0:I

    .line 63
    .line 64
    const/4 v13, 0x4

    .line 65
    const/4 v10, 0x0

    .line 66
    const-wide/16 v11, 0x0

    .line 67
    .line 68
    invoke-interface/range {v8 .. v13}, LV5/k;->d(IIJI)V

    .line 69
    .line 70
    .line 71
    iput v6, v1, LV5/q;->d0:I

    .line 72
    .line 73
    iput-object v3, v5, LH5/h;->d:Ljava/nio/ByteBuffer;

    .line 74
    .line 75
    :goto_1
    iput v4, v1, LV5/q;->n0:I

    .line 76
    .line 77
    return v2

    .line 78
    :cond_5
    iget-boolean v0, v1, LV5/q;->Y:Z

    .line 79
    .line 80
    if-eqz v0, :cond_6

    .line 81
    .line 82
    iput-boolean v2, v1, LV5/q;->Y:Z

    .line 83
    .line 84
    iget-object v0, v5, LH5/h;->d:Ljava/nio/ByteBuffer;

    .line 85
    .line 86
    sget-object v2, LV5/q;->D0:[B

    .line 87
    .line 88
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 89
    .line 90
    .line 91
    iget-object v8, v1, LV5/q;->I:LV5/k;

    .line 92
    .line 93
    iget v9, v1, LV5/q;->d0:I

    .line 94
    .line 95
    const/4 v13, 0x0

    .line 96
    const/16 v10, 0x26

    .line 97
    .line 98
    const-wide/16 v11, 0x0

    .line 99
    .line 100
    invoke-interface/range {v8 .. v13}, LV5/k;->d(IIJI)V

    .line 101
    .line 102
    .line 103
    iput v6, v1, LV5/q;->d0:I

    .line 104
    .line 105
    iput-object v3, v5, LH5/h;->d:Ljava/nio/ByteBuffer;

    .line 106
    .line 107
    iput-boolean v7, v1, LV5/q;->p0:Z

    .line 108
    .line 109
    return v7

    .line 110
    :cond_6
    iget v0, v1, LV5/q;->m0:I

    .line 111
    .line 112
    if-ne v0, v7, :cond_8

    .line 113
    .line 114
    move v0, v2

    .line 115
    :goto_2
    iget-object v8, v1, LV5/q;->J:LE5/T;

    .line 116
    .line 117
    iget-object v8, v8, LE5/T;->n:Ljava/util/List;

    .line 118
    .line 119
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    if-ge v0, v8, :cond_7

    .line 124
    .line 125
    iget-object v8, v1, LV5/q;->J:LE5/T;

    .line 126
    .line 127
    iget-object v8, v8, LE5/T;->n:Ljava/util/List;

    .line 128
    .line 129
    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    check-cast v8, [B

    .line 134
    .line 135
    iget-object v9, v5, LH5/h;->d:Ljava/nio/ByteBuffer;

    .line 136
    .line 137
    invoke-virtual {v9, v8}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 138
    .line 139
    .line 140
    add-int/lit8 v0, v0, 0x1

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_7
    iput v4, v1, LV5/q;->m0:I

    .line 144
    .line 145
    :cond_8
    iget-object v0, v5, LH5/h;->d:Ljava/nio/ByteBuffer;

    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    iget-object v8, v1, LE5/f;->b:LS3/s;

    .line 152
    .line 153
    invoke-virtual {v8}, LS3/s;->e()V

    .line 154
    .line 155
    .line 156
    :try_start_0
    invoke-virtual {v1, v8, v5, v2}, LE5/f;->r(LS3/s;LH5/h;I)I

    .line 157
    .line 158
    .line 159
    move-result v9
    :try_end_0
    .catch LH5/g; {:try_start_0 .. :try_end_0} :catch_2

    .line 160
    invoke-virtual {v1}, LE5/f;->h()Z

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    if-eqz v10, :cond_9

    .line 165
    .line 166
    iget-wide v10, v1, LV5/q;->s0:J

    .line 167
    .line 168
    iput-wide v10, v1, LV5/q;->t0:J

    .line 169
    .line 170
    :cond_9
    const/4 v10, -0x3

    .line 171
    if-ne v9, v10, :cond_a

    .line 172
    .line 173
    goto/16 :goto_0

    .line 174
    .line 175
    :cond_a
    const/4 v10, -0x5

    .line 176
    if-ne v9, v10, :cond_c

    .line 177
    .line 178
    iget v0, v1, LV5/q;->m0:I

    .line 179
    .line 180
    if-ne v0, v4, :cond_b

    .line 181
    .line 182
    invoke-virtual {v5}, LH5/h;->o()V

    .line 183
    .line 184
    .line 185
    iput v7, v1, LV5/q;->m0:I

    .line 186
    .line 187
    :cond_b
    invoke-virtual {v1, v8}, LV5/q;->U(LS3/s;)LH5/i;

    .line 188
    .line 189
    .line 190
    return v7

    .line 191
    :cond_c
    const/4 v8, 0x4

    .line 192
    invoke-virtual {v5, v8}, LH5/a;->h(I)Z

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    if-eqz v9, :cond_10

    .line 197
    .line 198
    iget v0, v1, LV5/q;->m0:I

    .line 199
    .line 200
    if-ne v0, v4, :cond_d

    .line 201
    .line 202
    invoke-virtual {v5}, LH5/h;->o()V

    .line 203
    .line 204
    .line 205
    iput v7, v1, LV5/q;->m0:I

    .line 206
    .line 207
    :cond_d
    iput-boolean v7, v1, LV5/q;->u0:Z

    .line 208
    .line 209
    iget-boolean v0, v1, LV5/q;->p0:Z

    .line 210
    .line 211
    if-nez v0, :cond_e

    .line 212
    .line 213
    invoke-virtual {v1}, LV5/q;->a0()V

    .line 214
    .line 215
    .line 216
    return v2

    .line 217
    :cond_e
    :try_start_1
    iget-boolean v0, v1, LV5/q;->a0:Z

    .line 218
    .line 219
    if-eqz v0, :cond_f

    .line 220
    .line 221
    goto/16 :goto_0

    .line 222
    .line 223
    :cond_f
    iput-boolean v7, v1, LV5/q;->q0:Z

    .line 224
    .line 225
    iget-object v8, v1, LV5/q;->I:LV5/k;

    .line 226
    .line 227
    iget v9, v1, LV5/q;->d0:I

    .line 228
    .line 229
    const/4 v13, 0x4

    .line 230
    const/4 v10, 0x0

    .line 231
    const-wide/16 v11, 0x0

    .line 232
    .line 233
    invoke-interface/range {v8 .. v13}, LV5/k;->d(IIJI)V

    .line 234
    .line 235
    .line 236
    iput v6, v1, LV5/q;->d0:I

    .line 237
    .line 238
    iput-object v3, v5, LH5/h;->d:Ljava/nio/ByteBuffer;
    :try_end_1
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_1 .. :try_end_1} :catch_0

    .line 239
    .line 240
    return v2

    .line 241
    :catch_0
    move-exception v0

    .line 242
    iget-object v3, v1, LV5/q;->z:LE5/T;

    .line 243
    .line 244
    invoke-virtual {v0}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    .line 245
    .line 246
    .line 247
    move-result v4

    .line 248
    invoke-static {v4}, Lu6/v;->l(I)I

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    invoke-virtual {v1, v0, v3, v2, v4}, LE5/f;->b(Ljava/lang/Exception;LE5/T;ZI)LE5/o;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    throw v0

    .line 257
    :cond_10
    iget-boolean v9, v1, LV5/q;->p0:Z

    .line 258
    .line 259
    if-nez v9, :cond_11

    .line 260
    .line 261
    invoke-virtual {v5, v7}, LH5/a;->h(I)Z

    .line 262
    .line 263
    .line 264
    move-result v9

    .line 265
    if-nez v9, :cond_11

    .line 266
    .line 267
    invoke-virtual {v5}, LH5/h;->o()V

    .line 268
    .line 269
    .line 270
    iget v0, v1, LV5/q;->m0:I

    .line 271
    .line 272
    if-ne v0, v4, :cond_19

    .line 273
    .line 274
    iput v7, v1, LV5/q;->m0:I

    .line 275
    .line 276
    return v7

    .line 277
    :cond_11
    const/high16 v4, 0x40000000    # 2.0f

    .line 278
    .line 279
    invoke-virtual {v5, v4}, LH5/a;->h(I)Z

    .line 280
    .line 281
    .line 282
    move-result v4

    .line 283
    iget-object v9, v5, LH5/h;->c:LH5/c;

    .line 284
    .line 285
    if-eqz v4, :cond_14

    .line 286
    .line 287
    if-nez v0, :cond_12

    .line 288
    .line 289
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_12
    iget-object v10, v9, LH5/c;->d:[I

    .line 294
    .line 295
    if-nez v10, :cond_13

    .line 296
    .line 297
    new-array v10, v7, [I

    .line 298
    .line 299
    iput-object v10, v9, LH5/c;->d:[I

    .line 300
    .line 301
    iget-object v11, v9, LH5/c;->i:Landroid/media/MediaCodec$CryptoInfo;

    .line 302
    .line 303
    iput-object v10, v11, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    .line 304
    .line 305
    :cond_13
    iget-object v10, v9, LH5/c;->d:[I

    .line 306
    .line 307
    aget v11, v10, v2

    .line 308
    .line 309
    add-int/2addr v11, v0

    .line 310
    aput v11, v10, v2

    .line 311
    .line 312
    :cond_14
    :goto_3
    iget-boolean v0, v1, LV5/q;->R:Z

    .line 313
    .line 314
    if-eqz v0, :cond_1b

    .line 315
    .line 316
    if-nez v4, :cond_1b

    .line 317
    .line 318
    iget-object v0, v5, LH5/h;->d:Ljava/nio/ByteBuffer;

    .line 319
    .line 320
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 321
    .line 322
    .line 323
    move-result v10

    .line 324
    move v11, v2

    .line 325
    move v12, v11

    .line 326
    :goto_4
    add-int/lit8 v13, v11, 0x1

    .line 327
    .line 328
    if-ge v13, v10, :cond_18

    .line 329
    .line 330
    invoke-virtual {v0, v11}, Ljava/nio/ByteBuffer;->get(I)B

    .line 331
    .line 332
    .line 333
    move-result v14

    .line 334
    and-int/lit16 v14, v14, 0xff

    .line 335
    .line 336
    const/4 v15, 0x3

    .line 337
    if-ne v12, v15, :cond_15

    .line 338
    .line 339
    if-ne v14, v7, :cond_16

    .line 340
    .line 341
    invoke-virtual {v0, v13}, Ljava/nio/ByteBuffer;->get(I)B

    .line 342
    .line 343
    .line 344
    move-result v16

    .line 345
    move/from16 v17, v15

    .line 346
    .line 347
    and-int/lit8 v15, v16, 0x1f

    .line 348
    .line 349
    const/4 v3, 0x7

    .line 350
    if-ne v15, v3, :cond_16

    .line 351
    .line 352
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    add-int/lit8 v11, v11, -0x3

    .line 357
    .line 358
    invoke-virtual {v3, v11}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 368
    .line 369
    .line 370
    goto :goto_5

    .line 371
    :cond_15
    if-nez v14, :cond_16

    .line 372
    .line 373
    add-int/lit8 v12, v12, 0x1

    .line 374
    .line 375
    :cond_16
    if-eqz v14, :cond_17

    .line 376
    .line 377
    move v12, v2

    .line 378
    :cond_17
    move v11, v13

    .line 379
    const/4 v3, 0x0

    .line 380
    goto :goto_4

    .line 381
    :cond_18
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 382
    .line 383
    .line 384
    :goto_5
    iget-object v0, v5, LH5/h;->d:Ljava/nio/ByteBuffer;

    .line 385
    .line 386
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    if-nez v0, :cond_1a

    .line 391
    .line 392
    :cond_19
    return v7

    .line 393
    :cond_1a
    iput-boolean v2, v1, LV5/q;->R:Z

    .line 394
    .line 395
    :cond_1b
    iget-wide v10, v5, LH5/h;->f:J

    .line 396
    .line 397
    iget-object v0, v1, LV5/q;->b0:LV5/h;

    .line 398
    .line 399
    if-eqz v0, :cond_20

    .line 400
    .line 401
    iget-object v3, v1, LV5/q;->z:LE5/T;

    .line 402
    .line 403
    iget-wide v12, v0, LV5/h;->b:J

    .line 404
    .line 405
    const-wide/16 v14, 0x0

    .line 406
    .line 407
    cmp-long v12, v12, v14

    .line 408
    .line 409
    if-nez v12, :cond_1c

    .line 410
    .line 411
    iput-wide v10, v0, LV5/h;->a:J

    .line 412
    .line 413
    :cond_1c
    iget-boolean v12, v0, LV5/h;->c:Z

    .line 414
    .line 415
    const-wide/32 v17, 0xf4240

    .line 416
    .line 417
    .line 418
    const-wide/16 v19, 0x211

    .line 419
    .line 420
    if-eqz v12, :cond_1d

    .line 421
    .line 422
    goto :goto_7

    .line 423
    :cond_1d
    iget-object v10, v5, LH5/h;->d:Ljava/nio/ByteBuffer;

    .line 424
    .line 425
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 426
    .line 427
    .line 428
    move v11, v2

    .line 429
    move v12, v11

    .line 430
    :goto_6
    if-ge v11, v8, :cond_1e

    .line 431
    .line 432
    shl-int/lit8 v12, v12, 0x8

    .line 433
    .line 434
    invoke-virtual {v10, v11}, Ljava/nio/ByteBuffer;->get(I)B

    .line 435
    .line 436
    .line 437
    move-result v13

    .line 438
    and-int/lit16 v13, v13, 0xff

    .line 439
    .line 440
    or-int/2addr v12, v13

    .line 441
    add-int/lit8 v11, v11, 0x1

    .line 442
    .line 443
    goto :goto_6

    .line 444
    :cond_1e
    invoke-static {v12}, LG5/b;->g(I)I

    .line 445
    .line 446
    .line 447
    move-result v8

    .line 448
    if-ne v8, v6, :cond_1f

    .line 449
    .line 450
    iput-boolean v7, v0, LV5/h;->c:Z

    .line 451
    .line 452
    iput-wide v14, v0, LV5/h;->b:J

    .line 453
    .line 454
    iget-wide v10, v5, LH5/h;->f:J

    .line 455
    .line 456
    iput-wide v10, v0, LV5/h;->a:J

    .line 457
    .line 458
    const-string v0, "C2Mp3TimestampTracker"

    .line 459
    .line 460
    const-string v3, "MPEG audio header is invalid."

    .line 461
    .line 462
    invoke-static {v0, v3}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 463
    .line 464
    .line 465
    iget-wide v10, v5, LH5/h;->f:J

    .line 466
    .line 467
    goto :goto_7

    .line 468
    :cond_1f
    iget v3, v3, LE5/T;->z:I

    .line 469
    .line 470
    int-to-long v10, v3

    .line 471
    iget-wide v12, v0, LV5/h;->a:J

    .line 472
    .line 473
    iget-wide v6, v0, LV5/h;->b:J

    .line 474
    .line 475
    sub-long v6, v6, v19

    .line 476
    .line 477
    mul-long v6, v6, v17

    .line 478
    .line 479
    div-long/2addr v6, v10

    .line 480
    invoke-static {v14, v15, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 481
    .line 482
    .line 483
    move-result-wide v6

    .line 484
    add-long v10, v6, v12

    .line 485
    .line 486
    iget-wide v6, v0, LV5/h;->b:J

    .line 487
    .line 488
    int-to-long v12, v8

    .line 489
    add-long/2addr v6, v12

    .line 490
    iput-wide v6, v0, LV5/h;->b:J

    .line 491
    .line 492
    :goto_7
    iget-wide v6, v1, LV5/q;->s0:J

    .line 493
    .line 494
    iget-object v0, v1, LV5/q;->b0:LV5/h;

    .line 495
    .line 496
    iget-object v8, v1, LV5/q;->z:LE5/T;

    .line 497
    .line 498
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 499
    .line 500
    .line 501
    iget v8, v8, LE5/T;->z:I

    .line 502
    .line 503
    int-to-long v12, v8

    .line 504
    move v8, v4

    .line 505
    iget-wide v3, v0, LV5/h;->a:J

    .line 506
    .line 507
    move-wide/from16 v21, v3

    .line 508
    .line 509
    iget-wide v2, v0, LV5/h;->b:J

    .line 510
    .line 511
    sub-long v2, v2, v19

    .line 512
    .line 513
    mul-long v2, v2, v17

    .line 514
    .line 515
    div-long/2addr v2, v12

    .line 516
    invoke-static {v14, v15, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 517
    .line 518
    .line 519
    move-result-wide v2

    .line 520
    add-long v2, v2, v21

    .line 521
    .line 522
    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 523
    .line 524
    .line 525
    move-result-wide v2

    .line 526
    iput-wide v2, v1, LV5/q;->s0:J

    .line 527
    .line 528
    goto :goto_8

    .line 529
    :cond_20
    move v8, v4

    .line 530
    :goto_8
    const/high16 v0, -0x80000000

    .line 531
    .line 532
    invoke-virtual {v5, v0}, LH5/a;->h(I)Z

    .line 533
    .line 534
    .line 535
    move-result v0

    .line 536
    if-eqz v0, :cond_21

    .line 537
    .line 538
    iget-object v0, v1, LV5/q;->u:Ljava/util/ArrayList;

    .line 539
    .line 540
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 545
    .line 546
    .line 547
    :cond_21
    iget-boolean v0, v1, LV5/q;->w0:Z

    .line 548
    .line 549
    if-eqz v0, :cond_22

    .line 550
    .line 551
    iget-object v0, v1, LV5/q;->t:LQ1/t;

    .line 552
    .line 553
    iget-object v2, v1, LV5/q;->z:LE5/T;

    .line 554
    .line 555
    invoke-virtual {v0, v10, v11, v2}, LQ1/t;->a(JLjava/lang/Object;)V

    .line 556
    .line 557
    .line 558
    const/4 v2, 0x0

    .line 559
    iput-boolean v2, v1, LV5/q;->w0:Z

    .line 560
    .line 561
    :cond_22
    iget-wide v2, v1, LV5/q;->s0:J

    .line 562
    .line 563
    invoke-static {v2, v3, v10, v11}, Ljava/lang/Math;->max(JJ)J

    .line 564
    .line 565
    .line 566
    move-result-wide v2

    .line 567
    iput-wide v2, v1, LV5/q;->s0:J

    .line 568
    .line 569
    invoke-virtual {v5}, LH5/h;->s()V

    .line 570
    .line 571
    .line 572
    const/high16 v0, 0x10000000

    .line 573
    .line 574
    invoke-virtual {v5, v0}, LH5/a;->h(I)Z

    .line 575
    .line 576
    .line 577
    move-result v0

    .line 578
    if-eqz v0, :cond_23

    .line 579
    .line 580
    invoke-virtual {v1, v5}, LV5/q;->N(LH5/h;)V

    .line 581
    .line 582
    .line 583
    :cond_23
    invoke-virtual {v1, v5}, LV5/q;->Z(LH5/h;)V

    .line 584
    .line 585
    .line 586
    if-eqz v8, :cond_24

    .line 587
    .line 588
    :try_start_2
    iget-object v0, v1, LV5/q;->I:LV5/k;

    .line 589
    .line 590
    iget v2, v1, LV5/q;->d0:I

    .line 591
    .line 592
    invoke-interface {v0, v2, v9, v10, v11}, LV5/k;->u(ILH5/c;J)V

    .line 593
    .line 594
    .line 595
    :goto_9
    const/4 v0, -0x1

    .line 596
    goto :goto_a

    .line 597
    :catch_1
    move-exception v0

    .line 598
    goto :goto_b

    .line 599
    :cond_24
    iget-object v0, v1, LV5/q;->I:LV5/k;

    .line 600
    .line 601
    iget v2, v1, LV5/q;->d0:I

    .line 602
    .line 603
    iget-object v3, v5, LH5/h;->d:Ljava/nio/ByteBuffer;

    .line 604
    .line 605
    invoke-virtual {v3}, Ljava/nio/Buffer;->limit()I

    .line 606
    .line 607
    .line 608
    move-result v23

    .line 609
    const/16 v26, 0x0

    .line 610
    .line 611
    move-object/from16 v21, v0

    .line 612
    .line 613
    move/from16 v22, v2

    .line 614
    .line 615
    move-wide/from16 v24, v10

    .line 616
    .line 617
    invoke-interface/range {v21 .. v26}, LV5/k;->d(IIJI)V
    :try_end_2
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_2 .. :try_end_2} :catch_1

    .line 618
    .line 619
    .line 620
    goto :goto_9

    .line 621
    :goto_a
    iput v0, v1, LV5/q;->d0:I

    .line 622
    .line 623
    const/4 v0, 0x0

    .line 624
    iput-object v0, v5, LH5/h;->d:Ljava/nio/ByteBuffer;

    .line 625
    .line 626
    const/4 v3, 0x1

    .line 627
    iput-boolean v3, v1, LV5/q;->p0:Z

    .line 628
    .line 629
    const/4 v2, 0x0

    .line 630
    iput v2, v1, LV5/q;->m0:I

    .line 631
    .line 632
    iget-object v0, v1, LV5/q;->z0:LH5/e;

    .line 633
    .line 634
    iget v2, v0, LH5/e;->d:I

    .line 635
    .line 636
    add-int/2addr v2, v3

    .line 637
    iput v2, v0, LH5/e;->d:I

    .line 638
    .line 639
    return v3

    .line 640
    :goto_b
    iget-object v2, v1, LV5/q;->z:LE5/T;

    .line 641
    .line 642
    invoke-virtual {v0}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    .line 643
    .line 644
    .line 645
    move-result v3

    .line 646
    invoke-static {v3}, Lu6/v;->l(I)I

    .line 647
    .line 648
    .line 649
    move-result v3

    .line 650
    const/4 v4, 0x0

    .line 651
    invoke-virtual {v1, v0, v2, v4, v3}, LE5/f;->b(Ljava/lang/Exception;LE5/T;ZI)LE5/o;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    throw v0

    .line 656
    :catch_2
    move-exception v0

    .line 657
    move v4, v2

    .line 658
    invoke-virtual {v1, v0}, LV5/q;->R(Ljava/lang/Exception;)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v1, v4}, LV5/q;->c0(I)Z

    .line 662
    .line 663
    .line 664
    invoke-virtual {v1}, LV5/q;->F()V

    .line 665
    .line 666
    .line 667
    const/4 v3, 0x1

    .line 668
    return v3

    .line 669
    :goto_c
    return v4
.end method

.method public final F()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, LV5/q;->I:LV5/k;

    .line 2
    .line 3
    invoke-interface {v0}, LV5/k;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LV5/q;->f0()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    invoke-virtual {p0}, LV5/q;->f0()V

    .line 12
    .line 13
    .line 14
    throw v0
.end method

.method public final G()Z
    .locals 5

    .line 1
    iget-object v0, p0, LV5/q;->I:LV5/k;

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
    iget v0, p0, LV5/q;->o0:I

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    const/4 v3, 0x1

    .line 11
    if-eq v0, v2, :cond_5

    .line 12
    .line 13
    iget-boolean v2, p0, LV5/q;->S:Z

    .line 14
    .line 15
    if-nez v2, :cond_5

    .line 16
    .line 17
    iget-boolean v2, p0, LV5/q;->T:Z

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    iget-boolean v2, p0, LV5/q;->r0:Z

    .line 22
    .line 23
    if-eqz v2, :cond_5

    .line 24
    .line 25
    :cond_1
    iget-boolean v2, p0, LV5/q;->U:Z

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iget-boolean v2, p0, LV5/q;->q0:Z

    .line 30
    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    const/4 v2, 0x2

    .line 35
    if-ne v0, v2, :cond_4

    .line 36
    .line 37
    sget v0, Lu6/v;->a:I

    .line 38
    .line 39
    const/16 v2, 0x17

    .line 40
    .line 41
    if-lt v0, v2, :cond_3

    .line 42
    .line 43
    move v4, v3

    .line 44
    goto :goto_0

    .line 45
    :cond_3
    move v4, v1

    .line 46
    :goto_0
    invoke-static {v4}, Lu6/a;->i(Z)V

    .line 47
    .line 48
    .line 49
    if-lt v0, v2, :cond_4

    .line 50
    .line 51
    :try_start_0
    invoke-virtual {p0}, LV5/q;->n0()V
    :try_end_0
    .catch LE5/o; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catch_0
    move-exception v0

    .line 56
    const-string v1, "MediaCodecRenderer"

    .line 57
    .line 58
    const-string v2, "Failed to update the DRM session, releasing the codec instead."

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, Lu6/a;->D(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, LV5/q;->d0()V

    .line 64
    .line 65
    .line 66
    return v3

    .line 67
    :cond_4
    :goto_1
    invoke-virtual {p0}, LV5/q;->F()V

    .line 68
    .line 69
    .line 70
    return v1

    .line 71
    :cond_5
    :goto_2
    invoke-virtual {p0}, LV5/q;->d0()V

    .line 72
    .line 73
    .line 74
    return v3
.end method

.method public final H(Z)Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, LV5/q;->z:LE5/T;

    .line 2
    .line 3
    iget-object v1, p0, LV5/q;->n:LV5/r;

    .line 4
    .line 5
    invoke-virtual {p0, v1, v0, p1}, LV5/q;->K(LV5/r;LE5/T;Z)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, LV5/q;->z:LE5/T;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p0, v1, p1, v0}, LV5/q;->K(LV5/r;LE5/T;Z)Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v1, "Drm session requires secure decoder for "

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, LV5/q;->z:LE5/T;

    .line 38
    .line 39
    iget-object v1, v1, LE5/T;->l:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", but no secure decoder available. Trying to proceed with "

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, "."

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "MediaCodecRenderer"

    .line 62
    .line 63
    invoke-static {v1, v0}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    return-object p1

    .line 67
    :cond_1
    return-object v0
.end method

.method public I()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public abstract J(F[LE5/T;)F
.end method

.method public abstract K(LV5/r;LE5/T;Z)Ljava/util/ArrayList;
.end method

.method public final L(LA/e0;)LI5/j;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    return-object p1
.end method

.method public abstract M(LV5/n;LE5/T;Landroid/media/MediaCrypto;F)LV5/i;
.end method

.method public N(LH5/h;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final O(LV5/n;Landroid/media/MediaCrypto;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v2, "createCodec:"

    .line 6
    .line 7
    iget-object v6, v0, LV5/n;->a:Ljava/lang/String;

    .line 8
    .line 9
    sget v3, Lu6/v;->a:I

    .line 10
    .line 11
    const/high16 v4, -0x40800000    # -1.0f

    .line 12
    .line 13
    const/16 v5, 0x17

    .line 14
    .line 15
    if-ge v3, v5, :cond_0

    .line 16
    .line 17
    move v7, v4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget v7, v1, LV5/q;->H:F

    .line 20
    .line 21
    iget-object v8, v1, LE5/f;->h:[LE5/T;

    .line 22
    .line 23
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v7, v8}, LV5/q;->J(F[LE5/T;)F

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    :goto_0
    iget v8, v1, LV5/q;->o:F

    .line 31
    .line 32
    cmpg-float v8, v7, v8

    .line 33
    .line 34
    if-gtz v8, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v4, v7

    .line 38
    :goto_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 39
    .line 40
    .line 41
    move-result-wide v7

    .line 42
    iget-object v9, v1, LV5/q;->z:LE5/T;

    .line 43
    .line 44
    move-object/from16 v10, p2

    .line 45
    .line 46
    invoke-virtual {v1, v0, v9, v10, v4}, LV5/q;->M(LV5/n;LE5/T;Landroid/media/MediaCrypto;F)LV5/i;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    const/16 v10, 0x1f

    .line 51
    .line 52
    if-lt v3, v10, :cond_2

    .line 53
    .line 54
    iget-object v10, v1, LE5/f;->e:LF5/l;

    .line 55
    .line 56
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {v9, v10}, LV5/o;->a(LV5/i;LF5/l;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    :try_start_0
    new-instance v10, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v10, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-static {v2}, Lu6/a;->b(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iget-object v2, v1, LV5/q;->m:LV5/j;

    .line 78
    .line 79
    invoke-interface {v2, v9}, LV5/j;->j(LV5/i;)LV5/k;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    iput-object v2, v1, LV5/q;->I:LV5/k;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    .line 85
    invoke-static {}, Lu6/a;->q()V

    .line 86
    .line 87
    .line 88
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 89
    .line 90
    .line 91
    move-result-wide v9

    .line 92
    iput-object v0, v1, LV5/q;->P:LV5/n;

    .line 93
    .line 94
    iput v4, v1, LV5/q;->M:F

    .line 95
    .line 96
    iget-object v2, v1, LV5/q;->z:LE5/T;

    .line 97
    .line 98
    iput-object v2, v1, LV5/q;->J:LE5/T;

    .line 99
    .line 100
    const-string v4, "OMX.Exynos.avc.dec.secure"

    .line 101
    .line 102
    const/16 v11, 0x19

    .line 103
    .line 104
    const/4 v13, 0x1

    .line 105
    if-gt v3, v11, :cond_4

    .line 106
    .line 107
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v14

    .line 111
    if-eqz v14, :cond_4

    .line 112
    .line 113
    sget-object v14, Lu6/v;->d:Ljava/lang/String;

    .line 114
    .line 115
    const-string v15, "SM-T585"

    .line 116
    .line 117
    invoke-virtual {v14, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 118
    .line 119
    .line 120
    move-result v15

    .line 121
    if-nez v15, :cond_3

    .line 122
    .line 123
    const-string v15, "SM-A510"

    .line 124
    .line 125
    invoke-virtual {v14, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    move-result v15

    .line 129
    if-nez v15, :cond_3

    .line 130
    .line 131
    const-string v15, "SM-A520"

    .line 132
    .line 133
    invoke-virtual {v14, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 134
    .line 135
    .line 136
    move-result v15

    .line 137
    if-nez v15, :cond_3

    .line 138
    .line 139
    const-string v15, "SM-J700"

    .line 140
    .line 141
    invoke-virtual {v14, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result v14

    .line 145
    if-eqz v14, :cond_4

    .line 146
    .line 147
    :cond_3
    const/4 v14, 0x2

    .line 148
    goto :goto_2

    .line 149
    :cond_4
    const/16 v14, 0x18

    .line 150
    .line 151
    if-ge v3, v14, :cond_7

    .line 152
    .line 153
    const-string v14, "OMX.Nvidia.h264.decode"

    .line 154
    .line 155
    invoke-virtual {v14, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v14

    .line 159
    if-nez v14, :cond_5

    .line 160
    .line 161
    const-string v14, "OMX.Nvidia.h264.decode.secure"

    .line 162
    .line 163
    invoke-virtual {v14, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v14

    .line 167
    if-eqz v14, :cond_7

    .line 168
    .line 169
    :cond_5
    sget-object v14, Lu6/v;->b:Ljava/lang/String;

    .line 170
    .line 171
    const-string v15, "flounder"

    .line 172
    .line 173
    invoke-virtual {v15, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v15

    .line 177
    if-nez v15, :cond_6

    .line 178
    .line 179
    const-string v15, "flounder_lte"

    .line 180
    .line 181
    invoke-virtual {v15, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v15

    .line 185
    if-nez v15, :cond_6

    .line 186
    .line 187
    const-string v15, "grouper"

    .line 188
    .line 189
    invoke-virtual {v15, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v15

    .line 193
    if-nez v15, :cond_6

    .line 194
    .line 195
    const-string v15, "tilapia"

    .line 196
    .line 197
    invoke-virtual {v15, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v14

    .line 201
    if-eqz v14, :cond_7

    .line 202
    .line 203
    :cond_6
    move v14, v13

    .line 204
    goto :goto_2

    .line 205
    :cond_7
    const/4 v14, 0x0

    .line 206
    :goto_2
    iput v14, v1, LV5/q;->Q:I

    .line 207
    .line 208
    iget-object v14, v1, LV5/q;->J:LE5/T;

    .line 209
    .line 210
    const/16 v15, 0x15

    .line 211
    .line 212
    if-ge v3, v15, :cond_8

    .line 213
    .line 214
    iget-object v14, v14, LE5/T;->n:Ljava/util/List;

    .line 215
    .line 216
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    .line 217
    .line 218
    .line 219
    move-result v14

    .line 220
    if-eqz v14, :cond_8

    .line 221
    .line 222
    const-string v14, "OMX.MTK.VIDEO.DECODER.AVC"

    .line 223
    .line 224
    invoke-virtual {v14, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v14

    .line 228
    if-eqz v14, :cond_8

    .line 229
    .line 230
    move v14, v13

    .line 231
    goto :goto_3

    .line 232
    :cond_8
    const/4 v14, 0x0

    .line 233
    :goto_3
    iput-boolean v14, v1, LV5/q;->R:Z

    .line 234
    .line 235
    const/16 v14, 0x13

    .line 236
    .line 237
    const/16 v12, 0x12

    .line 238
    .line 239
    if-lt v3, v12, :cond_b

    .line 240
    .line 241
    if-ne v3, v12, :cond_9

    .line 242
    .line 243
    const-string v2, "OMX.SEC.avc.dec"

    .line 244
    .line 245
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    if-nez v2, :cond_b

    .line 250
    .line 251
    const-string v2, "OMX.SEC.avc.dec.secure"

    .line 252
    .line 253
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    if-nez v2, :cond_b

    .line 258
    .line 259
    :cond_9
    if-ne v3, v14, :cond_a

    .line 260
    .line 261
    sget-object v2, Lu6/v;->d:Ljava/lang/String;

    .line 262
    .line 263
    const-string v11, "SM-G800"

    .line 264
    .line 265
    invoke-virtual {v2, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    if-eqz v2, :cond_a

    .line 270
    .line 271
    const-string v2, "OMX.Exynos.avc.dec"

    .line 272
    .line 273
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    if-nez v2, :cond_b

    .line 278
    .line 279
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    if-eqz v2, :cond_a

    .line 284
    .line 285
    goto :goto_4

    .line 286
    :cond_a
    const/4 v2, 0x0

    .line 287
    goto :goto_5

    .line 288
    :cond_b
    :goto_4
    move v2, v13

    .line 289
    :goto_5
    iput-boolean v2, v1, LV5/q;->S:Z

    .line 290
    .line 291
    const/16 v2, 0x1d

    .line 292
    .line 293
    if-ne v3, v2, :cond_c

    .line 294
    .line 295
    const-string v4, "c2.android.aac.decoder"

    .line 296
    .line 297
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v4

    .line 301
    if-eqz v4, :cond_c

    .line 302
    .line 303
    move v4, v13

    .line 304
    goto :goto_6

    .line 305
    :cond_c
    const/4 v4, 0x0

    .line 306
    :goto_6
    iput-boolean v4, v1, LV5/q;->T:Z

    .line 307
    .line 308
    if-gt v3, v5, :cond_d

    .line 309
    .line 310
    const-string v4, "OMX.google.vorbis.decoder"

    .line 311
    .line 312
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v4

    .line 316
    if-nez v4, :cond_f

    .line 317
    .line 318
    :cond_d
    if-gt v3, v14, :cond_10

    .line 319
    .line 320
    sget-object v4, Lu6/v;->b:Ljava/lang/String;

    .line 321
    .line 322
    const-string v5, "hb2000"

    .line 323
    .line 324
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v5

    .line 328
    if-nez v5, :cond_e

    .line 329
    .line 330
    const-string v5, "stvm8"

    .line 331
    .line 332
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    if-eqz v4, :cond_10

    .line 337
    .line 338
    :cond_e
    const-string v4, "OMX.amlogic.avc.decoder.awesome"

    .line 339
    .line 340
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v4

    .line 344
    if-nez v4, :cond_f

    .line 345
    .line 346
    const-string v4, "OMX.amlogic.avc.decoder.awesome.secure"

    .line 347
    .line 348
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v4

    .line 352
    if-eqz v4, :cond_10

    .line 353
    .line 354
    :cond_f
    move v4, v13

    .line 355
    goto :goto_7

    .line 356
    :cond_10
    const/4 v4, 0x0

    .line 357
    :goto_7
    iput-boolean v4, v1, LV5/q;->U:Z

    .line 358
    .line 359
    if-ne v3, v15, :cond_11

    .line 360
    .line 361
    const-string v4, "OMX.google.aac.decoder"

    .line 362
    .line 363
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v4

    .line 367
    if-eqz v4, :cond_11

    .line 368
    .line 369
    move v4, v13

    .line 370
    goto :goto_8

    .line 371
    :cond_11
    const/4 v4, 0x0

    .line 372
    :goto_8
    iput-boolean v4, v1, LV5/q;->V:Z

    .line 373
    .line 374
    if-ge v3, v15, :cond_13

    .line 375
    .line 376
    const-string v4, "OMX.SEC.mp3.dec"

    .line 377
    .line 378
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v4

    .line 382
    if-eqz v4, :cond_13

    .line 383
    .line 384
    const-string v4, "samsung"

    .line 385
    .line 386
    sget-object v5, Lu6/v;->c:Ljava/lang/String;

    .line 387
    .line 388
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v4

    .line 392
    if-eqz v4, :cond_13

    .line 393
    .line 394
    sget-object v4, Lu6/v;->b:Ljava/lang/String;

    .line 395
    .line 396
    const-string v5, "baffin"

    .line 397
    .line 398
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 399
    .line 400
    .line 401
    move-result v5

    .line 402
    if-nez v5, :cond_12

    .line 403
    .line 404
    const-string v5, "grand"

    .line 405
    .line 406
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 407
    .line 408
    .line 409
    move-result v5

    .line 410
    if-nez v5, :cond_12

    .line 411
    .line 412
    const-string v5, "fortuna"

    .line 413
    .line 414
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 415
    .line 416
    .line 417
    move-result v5

    .line 418
    if-nez v5, :cond_12

    .line 419
    .line 420
    const-string v5, "gprimelte"

    .line 421
    .line 422
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 423
    .line 424
    .line 425
    move-result v5

    .line 426
    if-nez v5, :cond_12

    .line 427
    .line 428
    const-string v5, "j2y18lte"

    .line 429
    .line 430
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 431
    .line 432
    .line 433
    move-result v5

    .line 434
    if-nez v5, :cond_12

    .line 435
    .line 436
    const-string v5, "ms01"

    .line 437
    .line 438
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 439
    .line 440
    .line 441
    move-result v4

    .line 442
    if-eqz v4, :cond_13

    .line 443
    .line 444
    :cond_12
    move v4, v13

    .line 445
    goto :goto_9

    .line 446
    :cond_13
    const/4 v4, 0x0

    .line 447
    :goto_9
    iput-boolean v4, v1, LV5/q;->W:Z

    .line 448
    .line 449
    iget-object v4, v1, LV5/q;->J:LE5/T;

    .line 450
    .line 451
    if-gt v3, v12, :cond_14

    .line 452
    .line 453
    iget v4, v4, LE5/T;->y:I

    .line 454
    .line 455
    if-ne v4, v13, :cond_14

    .line 456
    .line 457
    const-string v4, "OMX.MTK.AUDIO.DECODER.MP3"

    .line 458
    .line 459
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v4

    .line 463
    if-eqz v4, :cond_14

    .line 464
    .line 465
    move v4, v13

    .line 466
    goto :goto_a

    .line 467
    :cond_14
    const/4 v4, 0x0

    .line 468
    :goto_a
    iput-boolean v4, v1, LV5/q;->X:Z

    .line 469
    .line 470
    iget-object v4, v0, LV5/n;->a:Ljava/lang/String;

    .line 471
    .line 472
    const/16 v5, 0x19

    .line 473
    .line 474
    if-gt v3, v5, :cond_15

    .line 475
    .line 476
    const-string v5, "OMX.rk.video_decoder.avc"

    .line 477
    .line 478
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    move-result v5

    .line 482
    if-nez v5, :cond_19

    .line 483
    .line 484
    :cond_15
    const/16 v5, 0x11

    .line 485
    .line 486
    if-gt v3, v5, :cond_16

    .line 487
    .line 488
    const-string v5, "OMX.allwinner.video.decoder.avc"

    .line 489
    .line 490
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    move-result v5

    .line 494
    if-nez v5, :cond_19

    .line 495
    .line 496
    :cond_16
    if-gt v3, v2, :cond_17

    .line 497
    .line 498
    const-string v2, "OMX.broadcom.video_decoder.tunnel"

    .line 499
    .line 500
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 501
    .line 502
    .line 503
    move-result v2

    .line 504
    if-nez v2, :cond_19

    .line 505
    .line 506
    const-string v2, "OMX.broadcom.video_decoder.tunnel.secure"

    .line 507
    .line 508
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 509
    .line 510
    .line 511
    move-result v2

    .line 512
    if-nez v2, :cond_19

    .line 513
    .line 514
    :cond_17
    const-string v2, "Amazon"

    .line 515
    .line 516
    sget-object v3, Lu6/v;->c:Ljava/lang/String;

    .line 517
    .line 518
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    move-result v2

    .line 522
    if-eqz v2, :cond_18

    .line 523
    .line 524
    const-string v2, "AFTS"

    .line 525
    .line 526
    sget-object v3, Lu6/v;->d:Ljava/lang/String;

    .line 527
    .line 528
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 529
    .line 530
    .line 531
    move-result v2

    .line 532
    if-eqz v2, :cond_18

    .line 533
    .line 534
    iget-boolean v0, v0, LV5/n;->f:Z

    .line 535
    .line 536
    if-eqz v0, :cond_18

    .line 537
    .line 538
    goto :goto_b

    .line 539
    :cond_18
    invoke-virtual {v1}, LV5/q;->I()Z

    .line 540
    .line 541
    .line 542
    move-result v0

    .line 543
    if-eqz v0, :cond_1a

    .line 544
    .line 545
    :cond_19
    :goto_b
    move v12, v13

    .line 546
    goto :goto_c

    .line 547
    :cond_1a
    const/4 v12, 0x0

    .line 548
    :goto_c
    iput-boolean v12, v1, LV5/q;->a0:Z

    .line 549
    .line 550
    iget-object v0, v1, LV5/q;->I:LV5/k;

    .line 551
    .line 552
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    const-string v0, "c2.android.mp3.decoder"

    .line 556
    .line 557
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    move-result v0

    .line 561
    if-eqz v0, :cond_1b

    .line 562
    .line 563
    new-instance v0, LV5/h;

    .line 564
    .line 565
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 566
    .line 567
    .line 568
    iput-object v0, v1, LV5/q;->b0:LV5/h;

    .line 569
    .line 570
    :cond_1b
    iget v0, v1, LE5/f;->f:I

    .line 571
    .line 572
    const/4 v2, 0x2

    .line 573
    if-ne v0, v2, :cond_1c

    .line 574
    .line 575
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 576
    .line 577
    .line 578
    move-result-wide v2

    .line 579
    const-wide/16 v4, 0x3e8

    .line 580
    .line 581
    add-long/2addr v2, v4

    .line 582
    iput-wide v2, v1, LV5/q;->c0:J

    .line 583
    .line 584
    :cond_1c
    iget-object v0, v1, LV5/q;->z0:LH5/e;

    .line 585
    .line 586
    iget v2, v0, LH5/e;->b:I

    .line 587
    .line 588
    add-int/2addr v2, v13

    .line 589
    iput v2, v0, LH5/e;->b:I

    .line 590
    .line 591
    sub-long v4, v9, v7

    .line 592
    .line 593
    move-wide v2, v9

    .line 594
    invoke-virtual/range {v1 .. v6}, LV5/q;->S(JJLjava/lang/String;)V

    .line 595
    .line 596
    .line 597
    return-void

    .line 598
    :catchall_0
    move-exception v0

    .line 599
    invoke-static {}, Lu6/a;->q()V

    .line 600
    .line 601
    .line 602
    throw v0
.end method

.method public final P()V
    .locals 4

    .line 1
    iget-object v0, p0, LV5/q;->I:LV5/k;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    iget-boolean v0, p0, LV5/q;->i0:Z

    .line 6
    .line 7
    if-nez v0, :cond_6

    .line 8
    .line 9
    iget-object v0, p0, LV5/q;->z:LE5/T;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_1

    .line 14
    .line 15
    :cond_0
    iget-object v1, p0, LV5/q;->C:LA/e0;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    if-nez v1, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0, v0}, LV5/q;->k0(LE5/T;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget-object v0, p0, LV5/q;->z:LE5/T;

    .line 27
    .line 28
    invoke-virtual {p0}, LV5/q;->B()V

    .line 29
    .line 30
    .line 31
    iget-object v0, v0, LE5/T;->l:Ljava/lang/String;

    .line 32
    .line 33
    const-string v1, "audio/mp4a-latm"

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iget-object v3, p0, LV5/q;->s:LV5/g;

    .line 40
    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    const-string v1, "audio/mpeg"

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_1

    .line 50
    .line 51
    const-string v1, "audio/opus"

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_1

    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iput v2, v3, LV5/g;->k:I

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    const/16 v0, 0x20

    .line 69
    .line 70
    iput v0, v3, LV5/g;->k:I

    .line 71
    .line 72
    :goto_0
    iput-boolean v2, p0, LV5/q;->i0:Z

    .line 73
    .line 74
    return-void

    .line 75
    :cond_2
    iget-object v0, p0, LV5/q;->C:LA/e0;

    .line 76
    .line 77
    invoke-virtual {p0, v0}, LV5/q;->h0(LA/e0;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, LV5/q;->z:LE5/T;

    .line 81
    .line 82
    iget-object v0, v0, LE5/T;->l:Ljava/lang/String;

    .line 83
    .line 84
    iget-object v0, p0, LV5/q;->B:LA/e0;

    .line 85
    .line 86
    const/4 v1, 0x0

    .line 87
    if-eqz v0, :cond_5

    .line 88
    .line 89
    iget-object v3, p0, LV5/q;->D:Landroid/media/MediaCrypto;

    .line 90
    .line 91
    if-nez v3, :cond_3

    .line 92
    .line 93
    invoke-virtual {p0, v0}, LV5/q;->L(LA/e0;)LI5/j;

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, LV5/q;->B:LA/e0;

    .line 97
    .line 98
    invoke-virtual {v0}, LA/e0;->p()LI5/d;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    if-eqz v0, :cond_6

    .line 103
    .line 104
    :cond_3
    sget-boolean v0, LI5/j;->a:Z

    .line 105
    .line 106
    if-eqz v0, :cond_5

    .line 107
    .line 108
    iget-object v0, p0, LV5/q;->B:LA/e0;

    .line 109
    .line 110
    invoke-virtual {v0}, LA/e0;->r()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eq v0, v2, :cond_4

    .line 115
    .line 116
    const/4 v2, 0x4

    .line 117
    if-eq v0, v2, :cond_5

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_4
    iget-object v0, p0, LV5/q;->B:LA/e0;

    .line 121
    .line 122
    invoke-virtual {v0}, LA/e0;->p()LI5/d;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    iget-object v2, p0, LV5/q;->z:LE5/T;

    .line 130
    .line 131
    iget v3, v0, LI5/d;->a:I

    .line 132
    .line 133
    invoke-virtual {p0, v0, v2, v1, v3}, LE5/f;->b(Ljava/lang/Exception;LE5/T;ZI)LE5/o;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    throw v0

    .line 138
    :cond_5
    :try_start_0
    iget-object v0, p0, LV5/q;->D:Landroid/media/MediaCrypto;

    .line 139
    .line 140
    iget-boolean v2, p0, LV5/q;->E:Z

    .line 141
    .line 142
    invoke-virtual {p0, v0, v2}, LV5/q;->Q(Landroid/media/MediaCrypto;Z)V
    :try_end_0
    .catch LV5/p; {:try_start_0 .. :try_end_0} :catch_0

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :catch_0
    move-exception v0

    .line 147
    iget-object v2, p0, LV5/q;->z:LE5/T;

    .line 148
    .line 149
    const/16 v3, 0xfa1

    .line 150
    .line 151
    invoke-virtual {p0, v0, v2, v1, v3}, LE5/f;->b(Ljava/lang/Exception;LE5/T;ZI)LE5/o;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    throw v0

    .line 156
    :cond_6
    :goto_1
    return-void
.end method

.method public final Q(Landroid/media/MediaCrypto;Z)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v7, p2

    .line 6
    .line 7
    iget-object v0, v1, LV5/q;->N:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    const/4 v10, 0x0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    :try_start_0
    invoke-virtual {v1, v7}, LV5/q;->H(Z)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v3, Ljava/util/ArrayDeque;

    .line 17
    .line 18
    invoke-direct {v3}, Ljava/util/ArrayDeque;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v3, v1, LV5/q;->N:Ljava/util/ArrayDeque;

    .line 22
    .line 23
    check-cast v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    iget-object v3, v1, LV5/q;->N:Ljava/util/ArrayDeque;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, LV5/n;

    .line 39
    .line 40
    invoke-virtual {v3, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catch_0
    move-exception v0

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    :goto_0
    iput-object v10, v1, LV5/q;->O:LV5/p;
    :try_end_0
    .catch LV5/u; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :goto_1
    new-instance v2, LV5/p;

    .line 50
    .line 51
    iget-object v3, v1, LV5/q;->z:LE5/T;

    .line 52
    .line 53
    const v4, -0xc34e

    .line 54
    .line 55
    .line 56
    invoke-direct {v2, v3, v0, v7, v4}, LV5/p;-><init>(LE5/T;LV5/u;ZI)V

    .line 57
    .line 58
    .line 59
    throw v2

    .line 60
    :cond_1
    :goto_2
    iget-object v0, v1, LV5/q;->N:Ljava/util/ArrayDeque;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_9

    .line 67
    .line 68
    iget-object v0, v1, LV5/q;->N:Ljava/util/ArrayDeque;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    move-object v11, v0

    .line 75
    check-cast v11, LV5/n;

    .line 76
    .line 77
    :goto_3
    iget-object v0, v1, LV5/q;->I:LV5/k;

    .line 78
    .line 79
    if-nez v0, :cond_8

    .line 80
    .line 81
    iget-object v0, v1, LV5/q;->N:Ljava/util/ArrayDeque;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    move-object v8, v0

    .line 88
    check-cast v8, LV5/n;

    .line 89
    .line 90
    invoke-virtual {v1, v8}, LV5/q;->j0(LV5/n;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-nez v0, :cond_2

    .line 95
    .line 96
    return-void

    .line 97
    :cond_2
    :try_start_1
    invoke-virtual {v1, v8, v2}, LV5/q;->O(LV5/n;Landroid/media/MediaCrypto;)V
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
    const-string v3, "MediaCodecRenderer"

    .line 103
    .line 104
    if-ne v8, v11, :cond_3

    .line 105
    .line 106
    :try_start_2
    const-string v0, "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."

    .line 107
    .line 108
    invoke-static {v3, v0}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    const-wide/16 v4, 0x32

    .line 112
    .line 113
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, v8, v2}, LV5/q;->O(LV5/n;Landroid/media/MediaCrypto;)V

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :catch_2
    move-exception v0

    .line 121
    move-object v5, v0

    .line 122
    goto :goto_4

    .line 123
    :cond_3
    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 124
    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    const-string v4, "Failed to initialize decoder: "

    .line 127
    .line 128
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-static {v5, v3, v0}, Lu6/a;->D(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    iget-object v0, v1, LV5/q;->N:Ljava/util/ArrayDeque;

    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    new-instance v3, LV5/p;

    .line 147
    .line 148
    iget-object v0, v1, LV5/q;->z:LE5/T;

    .line 149
    .line 150
    new-instance v4, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    const-string v6, "Decoder init failed: "

    .line 153
    .line 154
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    iget-object v6, v8, LV5/n;->a:Ljava/lang/String;

    .line 158
    .line 159
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string v6, ", "

    .line 163
    .line 164
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    iget-object v6, v0, LE5/T;->l:Ljava/lang/String;

    .line 175
    .line 176
    sget v0, Lu6/v;->a:I

    .line 177
    .line 178
    const/16 v9, 0x15

    .line 179
    .line 180
    if-lt v0, v9, :cond_5

    .line 181
    .line 182
    instance-of v0, v5, Landroid/media/MediaCodec$CodecException;

    .line 183
    .line 184
    if-eqz v0, :cond_4

    .line 185
    .line 186
    move-object v0, v5

    .line 187
    check-cast v0, Landroid/media/MediaCodec$CodecException;

    .line 188
    .line 189
    invoke-virtual {v0}, Landroid/media/MediaCodec$CodecException;->getDiagnosticInfo()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    goto :goto_5

    .line 194
    :cond_4
    move-object v0, v10

    .line 195
    :goto_5
    move-object v9, v0

    .line 196
    goto :goto_6

    .line 197
    :cond_5
    move-object v9, v10

    .line 198
    :goto_6
    invoke-direct/range {v3 .. v9}, LV5/p;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ZLV5/n;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1, v3}, LV5/q;->R(Ljava/lang/Exception;)V

    .line 202
    .line 203
    .line 204
    iget-object v0, v1, LV5/q;->O:LV5/p;

    .line 205
    .line 206
    if-nez v0, :cond_6

    .line 207
    .line 208
    iput-object v3, v1, LV5/q;->O:LV5/p;

    .line 209
    .line 210
    goto :goto_7

    .line 211
    :cond_6
    new-instance v12, LV5/p;

    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v13

    .line 217
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 218
    .line 219
    .line 220
    move-result-object v14

    .line 221
    iget-object v15, v0, LV5/p;->a:Ljava/lang/String;

    .line 222
    .line 223
    iget-boolean v3, v0, LV5/p;->b:Z

    .line 224
    .line 225
    iget-object v4, v0, LV5/p;->c:LV5/n;

    .line 226
    .line 227
    iget-object v0, v0, LV5/p;->d:Ljava/lang/String;

    .line 228
    .line 229
    move-object/from16 v18, v0

    .line 230
    .line 231
    move/from16 v16, v3

    .line 232
    .line 233
    move-object/from16 v17, v4

    .line 234
    .line 235
    invoke-direct/range {v12 .. v18}, LV5/p;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ZLV5/n;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    iput-object v12, v1, LV5/q;->O:LV5/p;

    .line 239
    .line 240
    :goto_7
    iget-object v0, v1, LV5/q;->N:Ljava/util/ArrayDeque;

    .line 241
    .line 242
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    if-nez v0, :cond_7

    .line 247
    .line 248
    goto/16 :goto_3

    .line 249
    .line 250
    :cond_7
    iget-object v0, v1, LV5/q;->O:LV5/p;

    .line 251
    .line 252
    throw v0

    .line 253
    :cond_8
    iput-object v10, v1, LV5/q;->N:Ljava/util/ArrayDeque;

    .line 254
    .line 255
    return-void

    .line 256
    :cond_9
    new-instance v0, LV5/p;

    .line 257
    .line 258
    iget-object v2, v1, LV5/q;->z:LE5/T;

    .line 259
    .line 260
    const v3, -0xc34f

    .line 261
    .line 262
    .line 263
    invoke-direct {v0, v2, v10, v7, v3}, LV5/p;-><init>(LE5/T;LV5/u;ZI)V

    .line 264
    .line 265
    .line 266
    throw v0
.end method

.method public abstract R(Ljava/lang/Exception;)V
.end method

.method public abstract S(JJLjava/lang/String;)V
.end method

.method public abstract T(Ljava/lang/String;)V
.end method

.method public U(LS3/s;)LH5/i;
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LV5/q;->w0:Z

    .line 3
    .line 4
    iget-object v1, p1, LS3/s;->c:Ljava/lang/Object;

    .line 5
    .line 6
    move-object v5, v1

    .line 7
    check-cast v5, LE5/T;

    .line 8
    .line 9
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iget-object v2, v5, LE5/T;->l:Ljava/lang/String;

    .line 14
    .line 15
    if-eqz v2, :cond_1f

    .line 16
    .line 17
    iget-object p1, p1, LS3/s;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, LA/e0;

    .line 20
    .line 21
    iget-object v2, p0, LV5/q;->C:LA/e0;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    if-ne v2, p1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    :cond_1
    if-eqz v2, :cond_2

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    :cond_2
    :goto_0
    iput-object p1, p0, LV5/q;->C:LA/e0;

    .line 38
    .line 39
    iput-object v5, p0, LV5/q;->z:LE5/T;

    .line 40
    .line 41
    iget-boolean v2, p0, LV5/q;->i0:Z

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    iput-boolean v0, p0, LV5/q;->k0:Z

    .line 46
    .line 47
    return-object v3

    .line 48
    :cond_3
    iget-object v2, p0, LV5/q;->I:LV5/k;

    .line 49
    .line 50
    if-nez v2, :cond_4

    .line 51
    .line 52
    iput-object v3, p0, LV5/q;->N:Ljava/util/ArrayDeque;

    .line 53
    .line 54
    invoke-virtual {p0}, LV5/q;->P()V

    .line 55
    .line 56
    .line 57
    return-object v3

    .line 58
    :cond_4
    iget-object v3, p0, LV5/q;->P:LV5/n;

    .line 59
    .line 60
    iget-object v4, p0, LV5/q;->J:LE5/T;

    .line 61
    .line 62
    iget-object v6, p0, LV5/q;->B:LA/e0;

    .line 63
    .line 64
    const/4 v7, 0x3

    .line 65
    const/16 v8, 0x17

    .line 66
    .line 67
    if-ne v6, p1, :cond_18

    .line 68
    .line 69
    iget-object p1, p0, LV5/q;->C:LA/e0;

    .line 70
    .line 71
    iget-object v6, p0, LV5/q;->B:LA/e0;

    .line 72
    .line 73
    if-eq p1, v6, :cond_5

    .line 74
    .line 75
    move p1, v0

    .line 76
    goto :goto_1

    .line 77
    :cond_5
    move p1, v1

    .line 78
    :goto_1
    if-eqz p1, :cond_7

    .line 79
    .line 80
    sget v6, Lu6/v;->a:I

    .line 81
    .line 82
    if-lt v6, v8, :cond_6

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_6
    move v6, v1

    .line 86
    goto :goto_3

    .line 87
    :cond_7
    :goto_2
    move v6, v0

    .line 88
    :goto_3
    invoke-static {v6}, Lu6/a;->i(Z)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, v3, v4, v5}, LV5/q;->z(LV5/n;LE5/T;LE5/T;)LH5/i;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    iget v8, v6, LH5/i;->d:I

    .line 96
    .line 97
    if-eqz v8, :cond_13

    .line 98
    .line 99
    const/16 v9, 0x10

    .line 100
    .line 101
    const/4 v10, 0x2

    .line 102
    if-eq v8, v0, :cond_e

    .line 103
    .line 104
    if-eq v8, v10, :cond_a

    .line 105
    .line 106
    if-ne v8, v7, :cond_9

    .line 107
    .line 108
    invoke-virtual {p0, v5}, LV5/q;->m0(LE5/T;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-nez v0, :cond_8

    .line 113
    .line 114
    :goto_4
    move v1, v9

    .line 115
    goto/16 :goto_8

    .line 116
    .line 117
    :cond_8
    iput-object v5, p0, LV5/q;->J:LE5/T;

    .line 118
    .line 119
    if-eqz p1, :cond_15

    .line 120
    .line 121
    invoke-virtual {p0}, LV5/q;->C()Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-nez p1, :cond_15

    .line 126
    .line 127
    :goto_5
    move v1, v10

    .line 128
    goto/16 :goto_8

    .line 129
    .line 130
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 131
    .line 132
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 133
    .line 134
    .line 135
    throw p1

    .line 136
    :cond_a
    invoke-virtual {p0, v5}, LV5/q;->m0(LE5/T;)Z

    .line 137
    .line 138
    .line 139
    move-result v11

    .line 140
    if-nez v11, :cond_b

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_b
    iput-boolean v0, p0, LV5/q;->l0:Z

    .line 144
    .line 145
    iput v0, p0, LV5/q;->m0:I

    .line 146
    .line 147
    iget v9, p0, LV5/q;->Q:I

    .line 148
    .line 149
    if-eq v9, v10, :cond_d

    .line 150
    .line 151
    if-ne v9, v0, :cond_c

    .line 152
    .line 153
    iget v9, v4, LE5/T;->q:I

    .line 154
    .line 155
    iget v11, v5, LE5/T;->q:I

    .line 156
    .line 157
    if-ne v11, v9, :cond_c

    .line 158
    .line 159
    iget v9, v5, LE5/T;->r:I

    .line 160
    .line 161
    iget v11, v4, LE5/T;->r:I

    .line 162
    .line 163
    if-ne v9, v11, :cond_c

    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_c
    move v0, v1

    .line 167
    :cond_d
    :goto_6
    iput-boolean v0, p0, LV5/q;->Y:Z

    .line 168
    .line 169
    iput-object v5, p0, LV5/q;->J:LE5/T;

    .line 170
    .line 171
    if-eqz p1, :cond_15

    .line 172
    .line 173
    invoke-virtual {p0}, LV5/q;->C()Z

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    if-nez p1, :cond_15

    .line 178
    .line 179
    goto :goto_5

    .line 180
    :cond_e
    invoke-virtual {p0, v5}, LV5/q;->m0(LE5/T;)Z

    .line 181
    .line 182
    .line 183
    move-result v11

    .line 184
    if-nez v11, :cond_f

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_f
    iput-object v5, p0, LV5/q;->J:LE5/T;

    .line 188
    .line 189
    if-eqz p1, :cond_10

    .line 190
    .line 191
    invoke-virtual {p0}, LV5/q;->C()Z

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    if-nez p1, :cond_15

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_10
    iget-boolean p1, p0, LV5/q;->p0:Z

    .line 199
    .line 200
    if-eqz p1, :cond_15

    .line 201
    .line 202
    iput v0, p0, LV5/q;->n0:I

    .line 203
    .line 204
    iget-boolean p1, p0, LV5/q;->S:Z

    .line 205
    .line 206
    if-nez p1, :cond_12

    .line 207
    .line 208
    iget-boolean p1, p0, LV5/q;->U:Z

    .line 209
    .line 210
    if-eqz p1, :cond_11

    .line 211
    .line 212
    goto :goto_7

    .line 213
    :cond_11
    iput v0, p0, LV5/q;->o0:I

    .line 214
    .line 215
    goto :goto_8

    .line 216
    :cond_12
    :goto_7
    iput v7, p0, LV5/q;->o0:I

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_13
    iget-boolean p1, p0, LV5/q;->p0:Z

    .line 220
    .line 221
    if-eqz p1, :cond_14

    .line 222
    .line 223
    iput v0, p0, LV5/q;->n0:I

    .line 224
    .line 225
    iput v7, p0, LV5/q;->o0:I

    .line 226
    .line 227
    goto :goto_8

    .line 228
    :cond_14
    invoke-virtual {p0}, LV5/q;->d0()V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0}, LV5/q;->P()V

    .line 232
    .line 233
    .line 234
    :cond_15
    :goto_8
    if-eqz v8, :cond_17

    .line 235
    .line 236
    iget-object p1, p0, LV5/q;->I:LV5/k;

    .line 237
    .line 238
    if-ne p1, v2, :cond_16

    .line 239
    .line 240
    iget p1, p0, LV5/q;->o0:I

    .line 241
    .line 242
    if-ne p1, v7, :cond_17

    .line 243
    .line 244
    :cond_16
    new-instance v2, LH5/i;

    .line 245
    .line 246
    iget-object v3, v3, LV5/n;->a:Ljava/lang/String;

    .line 247
    .line 248
    const/4 v6, 0x0

    .line 249
    move v7, v1

    .line 250
    invoke-direct/range {v2 .. v7}, LH5/i;-><init>(Ljava/lang/String;LE5/T;LE5/T;II)V

    .line 251
    .line 252
    .line 253
    return-object v2

    .line 254
    :cond_17
    return-object v6

    .line 255
    :cond_18
    if-eqz p1, :cond_1d

    .line 256
    .line 257
    if-nez v6, :cond_19

    .line 258
    .line 259
    goto :goto_9

    .line 260
    :cond_19
    invoke-virtual {p1}, LA/e0;->q()Ljava/util/UUID;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-virtual {v6}, LA/e0;->q()Ljava/util/UUID;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    invoke-virtual {v1, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    if-nez v1, :cond_1a

    .line 273
    .line 274
    goto :goto_9

    .line 275
    :cond_1a
    sget v1, Lu6/v;->a:I

    .line 276
    .line 277
    if-ge v1, v8, :cond_1b

    .line 278
    .line 279
    goto :goto_9

    .line 280
    :cond_1b
    sget-object v1, LE5/i;->d:Ljava/util/UUID;

    .line 281
    .line 282
    invoke-virtual {v6}, LA/e0;->q()Ljava/util/UUID;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    invoke-virtual {v1, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v2

    .line 290
    if-nez v2, :cond_1d

    .line 291
    .line 292
    invoke-virtual {p1}, LA/e0;->q()Ljava/util/UUID;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    invoke-virtual {v1, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    if-eqz v1, :cond_1c

    .line 301
    .line 302
    goto :goto_9

    .line 303
    :cond_1c
    invoke-virtual {p0, p1}, LV5/q;->L(LA/e0;)LI5/j;

    .line 304
    .line 305
    .line 306
    :cond_1d
    :goto_9
    iget-boolean p1, p0, LV5/q;->p0:Z

    .line 307
    .line 308
    if-eqz p1, :cond_1e

    .line 309
    .line 310
    iput v0, p0, LV5/q;->n0:I

    .line 311
    .line 312
    iput v7, p0, LV5/q;->o0:I

    .line 313
    .line 314
    goto :goto_a

    .line 315
    :cond_1e
    invoke-virtual {p0}, LV5/q;->d0()V

    .line 316
    .line 317
    .line 318
    invoke-virtual {p0}, LV5/q;->P()V

    .line 319
    .line 320
    .line 321
    :goto_a
    new-instance v2, LH5/i;

    .line 322
    .line 323
    iget-object v3, v3, LV5/n;->a:Ljava/lang/String;

    .line 324
    .line 325
    const/4 v6, 0x0

    .line 326
    const/16 v7, 0x80

    .line 327
    .line 328
    invoke-direct/range {v2 .. v7}, LH5/i;-><init>(Ljava/lang/String;LE5/T;LE5/T;II)V

    .line 329
    .line 330
    .line 331
    return-object v2

    .line 332
    :cond_1f
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 333
    .line 334
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 335
    .line 336
    .line 337
    const/16 v0, 0xfa5

    .line 338
    .line 339
    invoke-virtual {p0, p1, v5, v1, v0}, LE5/f;->b(Ljava/lang/Exception;LE5/T;ZI)LE5/o;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    throw p1
.end method

.method public abstract V(LE5/T;Landroid/media/MediaFormat;)V
.end method

.method public W()V
    .locals 0

    .line 1
    return-void
.end method

.method public X(J)V
    .locals 6

    .line 1
    :goto_0
    iget v0, p0, LV5/q;->C0:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LV5/q;->y:[J

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    aget-wide v2, v0, v1

    .line 9
    .line 10
    cmp-long v2, p1, v2

    .line 11
    .line 12
    if-ltz v2, :cond_0

    .line 13
    .line 14
    iget-object v2, p0, LV5/q;->w:[J

    .line 15
    .line 16
    aget-wide v3, v2, v1

    .line 17
    .line 18
    iput-wide v3, p0, LV5/q;->A0:J

    .line 19
    .line 20
    iget-object v3, p0, LV5/q;->x:[J

    .line 21
    .line 22
    aget-wide v4, v3, v1

    .line 23
    .line 24
    invoke-virtual {p0, v4, v5}, LV5/q;->i0(J)V

    .line 25
    .line 26
    .line 27
    iget v4, p0, LV5/q;->C0:I

    .line 28
    .line 29
    const/4 v5, 0x1

    .line 30
    sub-int/2addr v4, v5

    .line 31
    iput v4, p0, LV5/q;->C0:I

    .line 32
    .line 33
    invoke-static {v2, v5, v2, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 34
    .line 35
    .line 36
    iget v2, p0, LV5/q;->C0:I

    .line 37
    .line 38
    invoke-static {v3, v5, v3, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 39
    .line 40
    .line 41
    iget v2, p0, LV5/q;->C0:I

    .line 42
    .line 43
    invoke-static {v0, v5, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, LV5/q;->Y()V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    return-void
.end method

.method public abstract Y()V
.end method

.method public abstract Z(LH5/h;)V
.end method

.method public final a0()V
    .locals 3

    .line 1
    iget v0, p0, LV5/q;->o0:I

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
    iput-boolean v1, p0, LV5/q;->v0:Z

    .line 13
    .line 14
    invoke-virtual {p0}, LV5/q;->e0()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p0}, LV5/q;->d0()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, LV5/q;->P()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-virtual {p0}, LV5/q;->F()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, LV5/q;->n0()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    invoke-virtual {p0}, LV5/q;->F()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public abstract b0(JJLV5/k;Ljava/nio/ByteBuffer;IIIJZZLE5/T;)Z
.end method

.method public final c0(I)Z
    .locals 5

    .line 1
    iget-object v0, p0, LE5/f;->b:LS3/s;

    .line 2
    .line 3
    invoke-virtual {v0}, LS3/s;->e()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LV5/q;->p:LH5/h;

    .line 7
    .line 8
    invoke-virtual {v1}, LH5/h;->o()V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x4

    .line 12
    or-int/2addr p1, v2

    .line 13
    invoke-virtual {p0, v0, v1, p1}, LE5/f;->r(LS3/s;LH5/h;I)I

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
    invoke-virtual {p0, v0}, LV5/q;->U(LS3/s;)LH5/i;

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
    iput-boolean v4, p0, LV5/q;->u0:Z

    .line 35
    .line 36
    invoke-virtual {p0}, LV5/q;->a0()V

    .line 37
    .line 38
    .line 39
    :cond_1
    const/4 p1, 0x0

    .line 40
    return p1
.end method

.method public final d0()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, LV5/q;->I:LV5/k;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    invoke-interface {v1}, LV5/k;->release()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, LV5/q;->z0:LH5/e;

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
    iget-object v1, p0, LV5/q;->P:LV5/n;

    .line 18
    .line 19
    iget-object v1, v1, LV5/n;->a:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p0, v1}, LV5/q;->T(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    goto :goto_3

    .line 27
    :cond_0
    :goto_0
    iput-object v0, p0, LV5/q;->I:LV5/k;

    .line 28
    .line 29
    :try_start_1
    iget-object v1, p0, LV5/q;->D:Landroid/media/MediaCrypto;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/media/MediaCrypto;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_1
    move-exception v1

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    :goto_1
    iput-object v0, p0, LV5/q;->D:Landroid/media/MediaCrypto;

    .line 40
    .line 41
    invoke-virtual {p0, v0}, LV5/q;->h0(LA/e0;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, LV5/q;->g0()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :goto_2
    iput-object v0, p0, LV5/q;->D:Landroid/media/MediaCrypto;

    .line 49
    .line 50
    invoke-virtual {p0, v0}, LV5/q;->h0(LA/e0;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, LV5/q;->g0()V

    .line 54
    .line 55
    .line 56
    throw v1

    .line 57
    :goto_3
    iput-object v0, p0, LV5/q;->I:LV5/k;

    .line 58
    .line 59
    :try_start_2
    iget-object v2, p0, LV5/q;->D:Landroid/media/MediaCrypto;

    .line 60
    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    invoke-virtual {v2}, Landroid/media/MediaCrypto;->release()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 64
    .line 65
    .line 66
    goto :goto_4

    .line 67
    :catchall_2
    move-exception v1

    .line 68
    goto :goto_5

    .line 69
    :cond_2
    :goto_4
    iput-object v0, p0, LV5/q;->D:Landroid/media/MediaCrypto;

    .line 70
    .line 71
    invoke-virtual {p0, v0}, LV5/q;->h0(LA/e0;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, LV5/q;->g0()V

    .line 75
    .line 76
    .line 77
    throw v1

    .line 78
    :goto_5
    iput-object v0, p0, LV5/q;->D:Landroid/media/MediaCrypto;

    .line 79
    .line 80
    invoke-virtual {p0, v0}, LV5/q;->h0(LA/e0;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, LV5/q;->g0()V

    .line 84
    .line 85
    .line 86
    throw v1
.end method

.method public e0()V
    .locals 0

    .line 1
    return-void
.end method

.method public f0()V
    .locals 5

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, LV5/q;->d0:I

    .line 3
    .line 4
    iget-object v1, p0, LV5/q;->q:LH5/h;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    iput-object v2, v1, LH5/h;->d:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    iput v0, p0, LV5/q;->e0:I

    .line 10
    .line 11
    iput-object v2, p0, LV5/q;->f0:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v0, p0, LV5/q;->c0:J

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    iput-boolean v2, p0, LV5/q;->q0:Z

    .line 22
    .line 23
    iput-boolean v2, p0, LV5/q;->p0:Z

    .line 24
    .line 25
    iput-boolean v2, p0, LV5/q;->Y:Z

    .line 26
    .line 27
    iput-boolean v2, p0, LV5/q;->Z:Z

    .line 28
    .line 29
    iput-boolean v2, p0, LV5/q;->g0:Z

    .line 30
    .line 31
    iput-boolean v2, p0, LV5/q;->h0:Z

    .line 32
    .line 33
    iget-object v3, p0, LV5/q;->u:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 36
    .line 37
    .line 38
    iput-wide v0, p0, LV5/q;->s0:J

    .line 39
    .line 40
    iput-wide v0, p0, LV5/q;->t0:J

    .line 41
    .line 42
    iget-object v0, p0, LV5/q;->b0:LV5/h;

    .line 43
    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    const-wide/16 v3, 0x0

    .line 47
    .line 48
    iput-wide v3, v0, LV5/h;->a:J

    .line 49
    .line 50
    iput-wide v3, v0, LV5/h;->b:J

    .line 51
    .line 52
    iput-boolean v2, v0, LV5/h;->c:Z

    .line 53
    .line 54
    :cond_0
    iput v2, p0, LV5/q;->n0:I

    .line 55
    .line 56
    iput v2, p0, LV5/q;->o0:I

    .line 57
    .line 58
    iget-boolean v0, p0, LV5/q;->l0:Z

    .line 59
    .line 60
    iput v0, p0, LV5/q;->m0:I

    .line 61
    .line 62
    return-void
.end method

.method public final g0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LV5/q;->f0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, LV5/q;->y0:LE5/o;

    .line 6
    .line 7
    iput-object v0, p0, LV5/q;->b0:LV5/h;

    .line 8
    .line 9
    iput-object v0, p0, LV5/q;->N:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    iput-object v0, p0, LV5/q;->P:LV5/n;

    .line 12
    .line 13
    iput-object v0, p0, LV5/q;->J:LE5/T;

    .line 14
    .line 15
    iput-object v0, p0, LV5/q;->K:Landroid/media/MediaFormat;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, LV5/q;->L:Z

    .line 19
    .line 20
    iput-boolean v0, p0, LV5/q;->r0:Z

    .line 21
    .line 22
    const/high16 v1, -0x40800000    # -1.0f

    .line 23
    .line 24
    iput v1, p0, LV5/q;->M:F

    .line 25
    .line 26
    iput v0, p0, LV5/q;->Q:I

    .line 27
    .line 28
    iput-boolean v0, p0, LV5/q;->R:Z

    .line 29
    .line 30
    iput-boolean v0, p0, LV5/q;->S:Z

    .line 31
    .line 32
    iput-boolean v0, p0, LV5/q;->T:Z

    .line 33
    .line 34
    iput-boolean v0, p0, LV5/q;->U:Z

    .line 35
    .line 36
    iput-boolean v0, p0, LV5/q;->V:Z

    .line 37
    .line 38
    iput-boolean v0, p0, LV5/q;->W:Z

    .line 39
    .line 40
    iput-boolean v0, p0, LV5/q;->X:Z

    .line 41
    .line 42
    iput-boolean v0, p0, LV5/q;->a0:Z

    .line 43
    .line 44
    iput-boolean v0, p0, LV5/q;->l0:Z

    .line 45
    .line 46
    iput v0, p0, LV5/q;->m0:I

    .line 47
    .line 48
    iput-boolean v0, p0, LV5/q;->E:Z

    .line 49
    .line 50
    return-void
.end method

.method public final h0(LA/e0;)V
    .locals 2

    .line 1
    iget-object v0, p0, LV5/q;->B:LA/e0;

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
    invoke-virtual {p1, v1}, LA/e0;->c(LI5/f;)V

    .line 10
    .line 11
    .line 12
    :cond_1
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {v0, v1}, LA/e0;->y(LI5/f;)V

    .line 15
    .line 16
    .line 17
    :cond_2
    :goto_0
    iput-object p1, p0, LV5/q;->B:LA/e0;

    .line 18
    .line 19
    return-void
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LV5/q;->v0:Z

    .line 2
    .line 3
    return v0
.end method

.method public final i0(J)V
    .locals 2

    .line 1
    iput-wide p1, p0, LV5/q;->B0:J

    .line 2
    .line 3
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long p1, p1, v0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, LV5/q;->W()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public j()Z
    .locals 7

    .line 1
    iget-object v0, p0, LV5/q;->z:LE5/T;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    invoke-virtual {p0}, LE5/f;->h()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-boolean v0, p0, LE5/f;->k:Z

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, LE5/f;->g:Lf6/V;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Lf6/V;->isReady()Z

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
    iget v0, p0, LV5/q;->e0:I

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
    iget-wide v3, p0, LV5/q;->c0:J

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
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    iget-wide v5, p0, LV5/q;->c0:J

    .line 52
    .line 53
    cmp-long v0, v3, v5

    .line 54
    .line 55
    if-gez v0, :cond_3

    .line 56
    .line 57
    :cond_2
    return v2

    .line 58
    :cond_3
    return v1
.end method

.method public j0(LV5/n;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public k()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LV5/q;->z:LE5/T;

    .line 3
    .line 4
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v0, p0, LV5/q;->A0:J

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, LV5/q;->i0(J)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput v0, p0, LV5/q;->C0:I

    .line 16
    .line 17
    invoke-virtual {p0}, LV5/q;->G()Z

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public k0(LE5/T;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public abstract l0(LV5/r;LE5/T;)I
.end method

.method public m(JZ)V
    .locals 3

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, LV5/q;->u0:Z

    .line 3
    .line 4
    iput-boolean p1, p0, LV5/q;->v0:Z

    .line 5
    .line 6
    iput-boolean p1, p0, LV5/q;->x0:Z

    .line 7
    .line 8
    iget-boolean p2, p0, LV5/q;->i0:Z

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    iget-object p2, p0, LV5/q;->s:LV5/g;

    .line 13
    .line 14
    invoke-virtual {p2}, LV5/g;->o()V

    .line 15
    .line 16
    .line 17
    iget-object p2, p0, LV5/q;->r:LH5/h;

    .line 18
    .line 19
    invoke-virtual {p2}, LH5/h;->o()V

    .line 20
    .line 21
    .line 22
    iput-boolean p1, p0, LV5/q;->j0:Z

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0}, LV5/q;->G()Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, LV5/q;->P()V

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    iget-object p2, p0, LV5/q;->t:LQ1/t;

    .line 35
    .line 36
    monitor-enter p2

    .line 37
    :try_start_0
    iget p3, p2, LQ1/t;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    monitor-exit p2

    .line 40
    const/4 p2, 0x1

    .line 41
    if-lez p3, :cond_2

    .line 42
    .line 43
    iput-boolean p2, p0, LV5/q;->w0:Z

    .line 44
    .line 45
    :cond_2
    iget-object p3, p0, LV5/q;->t:LQ1/t;

    .line 46
    .line 47
    invoke-virtual {p3}, LQ1/t;->d()V

    .line 48
    .line 49
    .line 50
    iget p3, p0, LV5/q;->C0:I

    .line 51
    .line 52
    if-eqz p3, :cond_3

    .line 53
    .line 54
    iget-object v0, p0, LV5/q;->x:[J

    .line 55
    .line 56
    sub-int/2addr p3, p2

    .line 57
    aget-wide v1, v0, p3

    .line 58
    .line 59
    invoke-virtual {p0, v1, v2}, LV5/q;->i0(J)V

    .line 60
    .line 61
    .line 62
    iget-object p3, p0, LV5/q;->w:[J

    .line 63
    .line 64
    iget v0, p0, LV5/q;->C0:I

    .line 65
    .line 66
    sub-int/2addr v0, p2

    .line 67
    aget-wide p2, p3, v0

    .line 68
    .line 69
    iput-wide p2, p0, LV5/q;->A0:J

    .line 70
    .line 71
    iput p1, p0, LV5/q;->C0:I

    .line 72
    .line 73
    :cond_3
    return-void

    .line 74
    :catchall_0
    move-exception p1

    .line 75
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    throw p1
.end method

.method public final m0(LE5/T;)Z
    .locals 5

    .line 1
    sget p1, Lu6/v;->a:I

    .line 2
    .line 3
    const/16 v0, 0x17

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-ge p1, v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    iget-object p1, p0, LV5/q;->I:LV5/k;

    .line 10
    .line 11
    if-eqz p1, :cond_6

    .line 12
    .line 13
    iget p1, p0, LV5/q;->o0:I

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    if-eq p1, v0, :cond_6

    .line 17
    .line 18
    iget p1, p0, LE5/f;->f:I

    .line 19
    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    iget p1, p0, LV5/q;->H:F

    .line 24
    .line 25
    iget-object v2, p0, LE5/f;->h:[LE5/T;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1, v2}, LV5/q;->J(F[LE5/T;)F

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iget v2, p0, LV5/q;->M:F

    .line 35
    .line 36
    cmpl-float v3, v2, p1

    .line 37
    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    const/high16 v3, -0x40800000    # -1.0f

    .line 42
    .line 43
    cmpl-float v4, p1, v3

    .line 44
    .line 45
    if-nez v4, :cond_4

    .line 46
    .line 47
    iget-boolean p1, p0, LV5/q;->p0:Z

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    iput v1, p0, LV5/q;->n0:I

    .line 52
    .line 53
    iput v0, p0, LV5/q;->o0:I

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    invoke-virtual {p0}, LV5/q;->d0()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, LV5/q;->P()V

    .line 60
    .line 61
    .line 62
    :goto_0
    const/4 p1, 0x0

    .line 63
    return p1

    .line 64
    :cond_4
    cmpl-float v0, v2, v3

    .line 65
    .line 66
    if-nez v0, :cond_5

    .line 67
    .line 68
    iget v0, p0, LV5/q;->o:F

    .line 69
    .line 70
    cmpl-float v0, p1, v0

    .line 71
    .line 72
    if-lez v0, :cond_6

    .line 73
    .line 74
    :cond_5
    new-instance v0, Landroid/os/Bundle;

    .line 75
    .line 76
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 77
    .line 78
    .line 79
    const-string v2, "operating-rate"

    .line 80
    .line 81
    invoke-virtual {v0, v2, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 82
    .line 83
    .line 84
    iget-object v2, p0, LV5/q;->I:LV5/k;

    .line 85
    .line 86
    invoke-interface {v2, v0}, LV5/k;->c(Landroid/os/Bundle;)V

    .line 87
    .line 88
    .line 89
    iput p1, p0, LV5/q;->M:F

    .line 90
    .line 91
    :cond_6
    :goto_1
    return v1
.end method

.method public final n0()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, LV5/q;->D:Landroid/media/MediaCrypto;

    .line 3
    .line 4
    iget-object v2, p0, LV5/q;->C:LA/e0;

    .line 5
    .line 6
    invoke-virtual {p0, v2}, LV5/q;->L(LA/e0;)LI5/j;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v3}, Landroid/media/MediaCrypto;->setMediaDrmSession([B)V
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, LV5/q;->C:LA/e0;

    .line 18
    .line 19
    invoke-virtual {p0, v1}, LV5/q;->h0(LA/e0;)V

    .line 20
    .line 21
    .line 22
    iput v0, p0, LV5/q;->n0:I

    .line 23
    .line 24
    iput v0, p0, LV5/q;->o0:I

    .line 25
    .line 26
    return-void

    .line 27
    :catch_0
    move-exception v1

    .line 28
    iget-object v2, p0, LV5/q;->z:LE5/T;

    .line 29
    .line 30
    const/16 v3, 0x1776

    .line 31
    .line 32
    invoke-virtual {p0, v1, v2, v0, v3}, LE5/f;->b(Ljava/lang/Exception;LE5/T;ZI)LE5/o;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    throw v0
.end method

.method public final o0(J)V
    .locals 1

    .line 1
    iget-object v0, p0, LV5/q;->t:LQ1/t;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LQ1/t;->j(J)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LE5/T;

    .line 8
    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    iget-boolean p2, p0, LV5/q;->L:Z

    .line 12
    .line 13
    if-eqz p2, :cond_1

    .line 14
    .line 15
    iget-object p2, p0, LV5/q;->t:LQ1/t;

    .line 16
    .line 17
    monitor-enter p2

    .line 18
    :try_start_0
    iget p1, p2, LQ1/t;->e:I

    .line 19
    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p2}, LQ1/t;->m()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    :goto_0
    monitor-exit p2

    .line 29
    check-cast p1, LE5/T;

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    throw p1

    .line 35
    :cond_1
    :goto_1
    if-eqz p1, :cond_2

    .line 36
    .line 37
    iput-object p1, p0, LV5/q;->A:LE5/T;

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    iget-boolean p1, p0, LV5/q;->L:Z

    .line 41
    .line 42
    if-eqz p1, :cond_3

    .line 43
    .line 44
    iget-object p1, p0, LV5/q;->A:LE5/T;

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    :goto_2
    iget-object p1, p0, LV5/q;->A:LE5/T;

    .line 49
    .line 50
    iget-object p2, p0, LV5/q;->K:Landroid/media/MediaFormat;

    .line 51
    .line 52
    invoke-virtual {p0, p1, p2}, LV5/q;->V(LE5/T;Landroid/media/MediaFormat;)V

    .line 53
    .line 54
    .line 55
    const/4 p1, 0x0

    .line 56
    iput-boolean p1, p0, LV5/q;->L:Z

    .line 57
    .line 58
    :cond_3
    return-void
.end method

.method public final q([LE5/T;JJ)V
    .locals 6

    .line 1
    iget-wide v0, p0, LV5/q;->B0:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long p1, v0, v2

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    iget-wide v4, p0, LV5/q;->A0:J

    .line 14
    .line 15
    cmp-long p1, v4, v2

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    invoke-static {v0}, Lu6/a;->i(Z)V

    .line 22
    .line 23
    .line 24
    iput-wide p2, p0, LV5/q;->A0:J

    .line 25
    .line 26
    invoke-virtual {p0, p4, p5}, LV5/q;->i0(J)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget p1, p0, LV5/q;->C0:I

    .line 31
    .line 32
    iget-object v1, p0, LV5/q;->x:[J

    .line 33
    .line 34
    array-length v2, v1

    .line 35
    if-ne p1, v2, :cond_2

    .line 36
    .line 37
    new-instance p1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v2, "Too many stream changes, so dropping offset: "

    .line 40
    .line 41
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget v2, p0, LV5/q;->C0:I

    .line 45
    .line 46
    sub-int/2addr v2, v0

    .line 47
    aget-wide v2, v1, v2

    .line 48
    .line 49
    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const-string v2, "MediaCodecRenderer"

    .line 57
    .line 58
    invoke-static {v2, p1}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    add-int/2addr p1, v0

    .line 63
    iput p1, p0, LV5/q;->C0:I

    .line 64
    .line 65
    :goto_1
    iget p1, p0, LV5/q;->C0:I

    .line 66
    .line 67
    sub-int/2addr p1, v0

    .line 68
    iget-object v0, p0, LV5/q;->w:[J

    .line 69
    .line 70
    aput-wide p2, v0, p1

    .line 71
    .line 72
    aput-wide p4, v1, p1

    .line 73
    .line 74
    iget-wide p2, p0, LV5/q;->s0:J

    .line 75
    .line 76
    iget-object p4, p0, LV5/q;->y:[J

    .line 77
    .line 78
    aput-wide p2, p4, p1

    .line 79
    .line 80
    return-void
.end method

.method public final s(JJ)V
    .locals 11

    .line 1
    iget-boolean v0, p0, LV5/q;->x0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, LV5/q;->x0:Z

    .line 7
    .line 8
    invoke-virtual {p0}, LV5/q;->a0()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, LV5/q;->y0:LE5/o;

    .line 12
    .line 13
    if-nez v0, :cond_11

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    :try_start_0
    iget-boolean v2, p0, LV5/q;->v0:Z

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, LV5/q;->e0()V

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
    :cond_1
    iget-object v2, p0, LV5/q;->z:LE5/T;

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    invoke-virtual {p0, v2}, LV5/q;->c0(I)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    invoke-virtual {p0}, LV5/q;->P()V

    .line 40
    .line 41
    .line 42
    iget-boolean v2, p0, LV5/q;->i0:Z

    .line 43
    .line 44
    if-eqz v2, :cond_4

    .line 45
    .line 46
    const-string v2, "bypassRender"

    .line 47
    .line 48
    invoke-static {v2}, Lu6/a;->b(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-virtual {p0, p1, p2, p3, p4}, LV5/q;->y(JJ)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_3

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    invoke-static {}, Lu6/a;->q()V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_7

    .line 62
    .line 63
    :cond_4
    iget-object v2, p0, LV5/q;->I:LV5/k;

    .line 64
    .line 65
    if-eqz v2, :cond_b

    .line 66
    .line 67
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 68
    .line 69
    .line 70
    move-result-wide v2

    .line 71
    const-string v4, "drainAndFeed"

    .line 72
    .line 73
    invoke-static {v4}, Lu6/a;->b(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :goto_1
    invoke-virtual {p0, p1, p2, p3, p4}, LV5/q;->D(JJ)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    if-eqz v4, :cond_7

    .line 86
    .line 87
    iget-wide v7, p0, LV5/q;->F:J

    .line 88
    .line 89
    cmp-long v4, v7, v5

    .line 90
    .line 91
    if-eqz v4, :cond_6

    .line 92
    .line 93
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 94
    .line 95
    .line 96
    move-result-wide v9

    .line 97
    sub-long/2addr v9, v2

    .line 98
    cmp-long v4, v9, v7

    .line 99
    .line 100
    if-gez v4, :cond_5

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_5
    move v4, v1

    .line 104
    goto :goto_3

    .line 105
    :cond_6
    :goto_2
    move v4, v0

    .line 106
    :goto_3
    if-eqz v4, :cond_7

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_7
    :goto_4
    invoke-virtual {p0}, LV5/q;->E()Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-eqz p1, :cond_a

    .line 114
    .line 115
    iget-wide p1, p0, LV5/q;->F:J

    .line 116
    .line 117
    cmp-long p3, p1, v5

    .line 118
    .line 119
    if-eqz p3, :cond_9

    .line 120
    .line 121
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 122
    .line 123
    .line 124
    move-result-wide p3

    .line 125
    sub-long/2addr p3, v2

    .line 126
    cmp-long p1, p3, p1

    .line 127
    .line 128
    if-gez p1, :cond_8

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_8
    move p1, v1

    .line 132
    goto :goto_6

    .line 133
    :cond_9
    :goto_5
    move p1, v0

    .line 134
    :goto_6
    if-eqz p1, :cond_a

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_a
    invoke-static {}, Lu6/a;->q()V

    .line 138
    .line 139
    .line 140
    goto :goto_7

    .line 141
    :cond_b
    iget-object p3, p0, LV5/q;->z0:LH5/e;

    .line 142
    .line 143
    iget p4, p3, LH5/e;->e:I

    .line 144
    .line 145
    iget-object v2, p0, LE5/f;->g:Lf6/V;

    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    iget-wide v3, p0, LE5/f;->i:J

    .line 151
    .line 152
    sub-long/2addr p1, v3

    .line 153
    invoke-interface {v2, p1, p2}, Lf6/V;->g(J)I

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    add-int/2addr p4, p1

    .line 158
    iput p4, p3, LH5/e;->e:I

    .line 159
    .line 160
    invoke-virtual {p0, v0}, LV5/q;->c0(I)Z

    .line 161
    .line 162
    .line 163
    :goto_7
    iget-object p1, p0, LV5/q;->z0:LH5/e;

    .line 164
    .line 165
    monitor-enter p1

    .line 166
    monitor-exit p1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 167
    return-void

    .line 168
    :goto_8
    sget p2, Lu6/v;->a:I

    .line 169
    .line 170
    const/16 p3, 0x15

    .line 171
    .line 172
    if-lt p2, p3, :cond_c

    .line 173
    .line 174
    instance-of p4, p1, Landroid/media/MediaCodec$CodecException;

    .line 175
    .line 176
    if-eqz p4, :cond_c

    .line 177
    .line 178
    goto :goto_9

    .line 179
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 180
    .line 181
    .line 182
    move-result-object p4

    .line 183
    array-length v2, p4

    .line 184
    if-lez v2, :cond_10

    .line 185
    .line 186
    aget-object p4, p4, v1

    .line 187
    .line 188
    invoke-virtual {p4}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p4

    .line 192
    const-string v2, "android.media.MediaCodec"

    .line 193
    .line 194
    invoke-virtual {p4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result p4

    .line 198
    if-eqz p4, :cond_10

    .line 199
    .line 200
    :goto_9
    invoke-virtual {p0, p1}, LV5/q;->R(Ljava/lang/Exception;)V

    .line 201
    .line 202
    .line 203
    if-lt p2, p3, :cond_e

    .line 204
    .line 205
    instance-of p2, p1, Landroid/media/MediaCodec$CodecException;

    .line 206
    .line 207
    if-eqz p2, :cond_d

    .line 208
    .line 209
    move-object p2, p1

    .line 210
    check-cast p2, Landroid/media/MediaCodec$CodecException;

    .line 211
    .line 212
    invoke-virtual {p2}, Landroid/media/MediaCodec$CodecException;->isRecoverable()Z

    .line 213
    .line 214
    .line 215
    move-result p2

    .line 216
    goto :goto_a

    .line 217
    :cond_d
    move p2, v1

    .line 218
    :goto_a
    if-eqz p2, :cond_e

    .line 219
    .line 220
    move v1, v0

    .line 221
    :cond_e
    if-eqz v1, :cond_f

    .line 222
    .line 223
    invoke-virtual {p0}, LV5/q;->d0()V

    .line 224
    .line 225
    .line 226
    :cond_f
    iget-object p2, p0, LV5/q;->P:LV5/n;

    .line 227
    .line 228
    invoke-virtual {p0, p1, p2}, LV5/q;->A(Ljava/lang/IllegalStateException;LV5/n;)LV5/l;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    iget-object p2, p0, LV5/q;->z:LE5/T;

    .line 233
    .line 234
    const/16 p3, 0xfa3

    .line 235
    .line 236
    invoke-virtual {p0, p1, p2, v1, p3}, LE5/f;->b(Ljava/lang/Exception;LE5/T;ZI)LE5/o;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    throw p1

    .line 241
    :cond_10
    throw p1

    .line 242
    :cond_11
    const/4 p1, 0x0

    .line 243
    iput-object p1, p0, LV5/q;->y0:LE5/o;

    .line 244
    .line 245
    throw v0
.end method

.method public v(FF)V
    .locals 0

    .line 1
    iput p1, p0, LV5/q;->G:F

    .line 2
    .line 3
    iput p2, p0, LV5/q;->H:F

    .line 4
    .line 5
    iget-object p1, p0, LV5/q;->J:LE5/T;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, LV5/q;->m0(LE5/T;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final w(LE5/T;)I
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, LV5/q;->n:LV5/r;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, LV5/q;->l0(LV5/r;LE5/T;)I

    .line 4
    .line 5
    .line 6
    move-result p1
    :try_end_0
    .catch LV5/u; {:try_start_0 .. :try_end_0} :catch_0

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
    invoke-virtual {p0, v0, p1, v2, v1}, LE5/f;->b(Ljava/lang/Exception;LE5/T;ZI)LE5/o;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    throw p1
.end method

.method public final x()I
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    return v0
.end method

.method public final y(JJ)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, LV5/q;->v0:Z

    .line 4
    .line 5
    const/4 v15, 0x1

    .line 6
    xor-int/2addr v1, v15

    .line 7
    invoke-static {v1}, Lu6/a;->i(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, LV5/q;->s:LV5/g;

    .line 11
    .line 12
    iget v9, v1, LV5/g;->j:I

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-lez v9, :cond_0

    .line 16
    .line 17
    move v3, v15

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v3, v2

    .line 20
    :goto_0
    const/4 v4, 0x4

    .line 21
    if-eqz v3, :cond_2

    .line 22
    .line 23
    iget-object v6, v1, LH5/h;->d:Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    iget v7, v0, LV5/q;->e0:I

    .line 26
    .line 27
    iget-wide v10, v1, LH5/h;->f:J

    .line 28
    .line 29
    const/high16 v3, -0x80000000

    .line 30
    .line 31
    invoke-virtual {v1, v3}, LH5/a;->h(I)Z

    .line 32
    .line 33
    .line 34
    move-result v12

    .line 35
    invoke-virtual {v1, v4}, LH5/a;->h(I)Z

    .line 36
    .line 37
    .line 38
    move-result v13

    .line 39
    iget-object v14, v0, LV5/q;->A:LE5/T;

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    const/4 v8, 0x0

    .line 43
    move-wide/from16 v3, p3

    .line 44
    .line 45
    move-object v15, v1

    .line 46
    move-wide/from16 v1, p1

    .line 47
    .line 48
    invoke-virtual/range {v0 .. v14}, LV5/q;->b0(JJLV5/k;Ljava/nio/ByteBuffer;IIIJZZLE5/T;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    iget-wide v1, v15, LV5/g;->i:J

    .line 55
    .line 56
    invoke-virtual {v0, v1, v2}, LV5/q;->X(J)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v15}, LV5/g;->o()V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    const/4 v1, 0x0

    .line 64
    goto/16 :goto_3

    .line 65
    .line 66
    :cond_2
    move-object v15, v1

    .line 67
    :goto_1
    iget-boolean v1, v0, LV5/q;->u0:Z

    .line 68
    .line 69
    if-eqz v1, :cond_3

    .line 70
    .line 71
    const/4 v1, 0x1

    .line 72
    iput-boolean v1, v0, LV5/q;->v0:Z

    .line 73
    .line 74
    const/4 v1, 0x0

    .line 75
    return v1

    .line 76
    :cond_3
    const/4 v1, 0x0

    .line 77
    iget-boolean v2, v0, LV5/q;->j0:Z

    .line 78
    .line 79
    iget-object v3, v0, LV5/q;->r:LH5/h;

    .line 80
    .line 81
    if-eqz v2, :cond_4

    .line 82
    .line 83
    invoke-virtual {v15, v3}, LV5/g;->t(LH5/h;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    invoke-static {v2}, Lu6/a;->i(Z)V

    .line 88
    .line 89
    .line 90
    iput-boolean v1, v0, LV5/q;->j0:Z

    .line 91
    .line 92
    :cond_4
    iget-boolean v2, v0, LV5/q;->k0:Z

    .line 93
    .line 94
    if-eqz v2, :cond_6

    .line 95
    .line 96
    iget v2, v15, LV5/g;->j:I

    .line 97
    .line 98
    if-lez v2, :cond_5

    .line 99
    .line 100
    const/16 v16, 0x1

    .line 101
    .line 102
    return v16

    .line 103
    :cond_5
    const/16 v16, 0x1

    .line 104
    .line 105
    invoke-virtual {v0}, LV5/q;->B()V

    .line 106
    .line 107
    .line 108
    iput-boolean v1, v0, LV5/q;->k0:Z

    .line 109
    .line 110
    invoke-virtual {v0}, LV5/q;->P()V

    .line 111
    .line 112
    .line 113
    iget-boolean v2, v0, LV5/q;->i0:Z

    .line 114
    .line 115
    if-nez v2, :cond_7

    .line 116
    .line 117
    goto/16 :goto_3

    .line 118
    .line 119
    :cond_6
    const/16 v16, 0x1

    .line 120
    .line 121
    :cond_7
    iget-boolean v2, v0, LV5/q;->u0:Z

    .line 122
    .line 123
    xor-int/lit8 v2, v2, 0x1

    .line 124
    .line 125
    invoke-static {v2}, Lu6/a;->i(Z)V

    .line 126
    .line 127
    .line 128
    iget-object v2, v0, LE5/f;->b:LS3/s;

    .line 129
    .line 130
    invoke-virtual {v2}, LS3/s;->e()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3}, LH5/h;->o()V

    .line 134
    .line 135
    .line 136
    :cond_8
    invoke-virtual {v3}, LH5/h;->o()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v2, v3, v1}, LE5/f;->r(LS3/s;LH5/h;I)I

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    const/4 v5, -0x5

    .line 144
    if-eq v4, v5, :cond_d

    .line 145
    .line 146
    const/4 v5, -0x4

    .line 147
    if-eq v4, v5, :cond_a

    .line 148
    .line 149
    const/4 v2, -0x3

    .line 150
    if-ne v4, v2, :cond_9

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 154
    .line 155
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 156
    .line 157
    .line 158
    throw v1

    .line 159
    :cond_a
    const/4 v4, 0x4

    .line 160
    invoke-virtual {v3, v4}, LH5/a;->h(I)Z

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    if-eqz v5, :cond_b

    .line 165
    .line 166
    const/4 v5, 0x1

    .line 167
    iput-boolean v5, v0, LV5/q;->u0:Z

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_b
    iget-boolean v5, v0, LV5/q;->w0:Z

    .line 171
    .line 172
    if-eqz v5, :cond_c

    .line 173
    .line 174
    iget-object v5, v0, LV5/q;->z:LE5/T;

    .line 175
    .line 176
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    iput-object v5, v0, LV5/q;->A:LE5/T;

    .line 180
    .line 181
    const/4 v6, 0x0

    .line 182
    invoke-virtual {v0, v5, v6}, LV5/q;->V(LE5/T;Landroid/media/MediaFormat;)V

    .line 183
    .line 184
    .line 185
    iput-boolean v1, v0, LV5/q;->w0:Z

    .line 186
    .line 187
    :cond_c
    invoke-virtual {v3}, LH5/h;->s()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v15, v3}, LV5/g;->t(LH5/h;)Z

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    if-nez v5, :cond_8

    .line 195
    .line 196
    const/4 v5, 0x1

    .line 197
    iput-boolean v5, v0, LV5/q;->j0:Z

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_d
    invoke-virtual {v0, v2}, LV5/q;->U(LS3/s;)LH5/i;

    .line 201
    .line 202
    .line 203
    :goto_2
    iget v2, v15, LV5/g;->j:I

    .line 204
    .line 205
    if-lez v2, :cond_e

    .line 206
    .line 207
    invoke-virtual {v15}, LH5/h;->s()V

    .line 208
    .line 209
    .line 210
    :cond_e
    iget v2, v15, LV5/g;->j:I

    .line 211
    .line 212
    if-lez v2, :cond_f

    .line 213
    .line 214
    const/16 v16, 0x1

    .line 215
    .line 216
    return v16

    .line 217
    :cond_f
    const/16 v16, 0x1

    .line 218
    .line 219
    iget-boolean v2, v0, LV5/q;->u0:Z

    .line 220
    .line 221
    if-nez v2, :cond_11

    .line 222
    .line 223
    iget-boolean v2, v0, LV5/q;->k0:Z

    .line 224
    .line 225
    if-eqz v2, :cond_10

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_10
    :goto_3
    return v1

    .line 229
    :cond_11
    :goto_4
    return v16
.end method

.method public abstract z(LV5/n;LE5/T;LE5/T;)LH5/i;
.end method
