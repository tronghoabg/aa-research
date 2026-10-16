.class public final Lh2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/i;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:J

.field public e:J

.field public final f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(IILN1/n;ILjava/lang/Object;JJ)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput p1, p0, Lh2/g;->a:I

    .line 7
    iput p2, p0, Lh2/g;->b:I

    .line 8
    iput-object p3, p0, Lh2/g;->f:Ljava/lang/Object;

    .line 9
    iput p4, p0, Lh2/g;->c:I

    .line 10
    iput-object p5, p0, Lh2/g;->g:Ljava/lang/Object;

    .line 11
    iput-wide p6, p0, Lh2/g;->d:J

    .line 12
    iput-wide p8, p0, Lh2/g;->e:J

    return-void
.end method

.method public constructor <init>(Lg2/l;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lh2/g;->f:Ljava/lang/Object;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 3
    iput-wide v0, p0, Lh2/g;->d:J

    const/4 p1, -0x1

    .line 4
    iput p1, p0, Lh2/g;->b:I

    return-void
.end method


# virtual methods
.method public a(JJ)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lh2/g;->d:J

    .line 2
    .line 3
    iput-wide p3, p0, Lh2/g;->e:J

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput p1, p0, Lh2/g;->c:I

    .line 7
    .line 8
    return-void
.end method

.method public b(LQ1/o;JIZ)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, v0, Lh2/g;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v5, Ls2/C;

    .line 12
    .line 13
    invoke-static {v5}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget v5, v0, Lh2/g;->b:I

    .line 17
    .line 18
    const/4 v6, -0x1

    .line 19
    if-eq v5, v6, :cond_0

    .line 20
    .line 21
    invoke-static {v5}, Lg2/i;->a(I)I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-eq v2, v5, :cond_0

    .line 26
    .line 27
    sget v7, LQ1/x;->a:I

    .line 28
    .line 29
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 30
    .line 31
    const-string v7, "Received RTP packet with unexpected sequence number. Expected: "

    .line 32
    .line 33
    const-string v8, "; received: "

    .line 34
    .line 35
    const-string v9, ". Dropping packet."

    .line 36
    .line 37
    invoke-static {v7, v5, v8, v2, v9}, LN0/a;->e(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    const-string v7, "RtpMpeg4Reader"

    .line 42
    .line 43
    invoke-static {v7, v5}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    iget-object v7, v0, Lh2/g;->g:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v7, Ls2/C;

    .line 53
    .line 54
    invoke-interface {v7, v5, v1}, Ls2/C;->e(ILQ1/o;)V

    .line 55
    .line 56
    .line 57
    iget v7, v0, Lh2/g;->c:I

    .line 58
    .line 59
    const/4 v8, 0x0

    .line 60
    if-nez v7, :cond_5

    .line 61
    .line 62
    iget-object v7, v1, LQ1/o;->a:[B

    .line 63
    .line 64
    new-array v9, v3, [B

    .line 65
    .line 66
    fill-array-data v9, :array_0

    .line 67
    .line 68
    .line 69
    const-string v10, "array"

    .line 70
    .line 71
    invoke-static {v7, v10}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    move v10, v8

    .line 75
    :goto_0
    array-length v11, v7

    .line 76
    add-int/lit8 v11, v11, -0x3

    .line 77
    .line 78
    if-ge v10, v11, :cond_2

    .line 79
    .line 80
    move v11, v8

    .line 81
    :goto_1
    if-ge v11, v3, :cond_3

    .line 82
    .line 83
    add-int v12, v10, v11

    .line 84
    .line 85
    aget-byte v12, v7, v12

    .line 86
    .line 87
    aget-byte v13, v9, v11

    .line 88
    .line 89
    if-eq v12, v13, :cond_1

    .line 90
    .line 91
    add-int/2addr v10, v4

    .line 92
    goto :goto_0

    .line 93
    :cond_1
    add-int/2addr v11, v4

    .line 94
    goto :goto_1

    .line 95
    :cond_2
    move v10, v6

    .line 96
    :cond_3
    if-eq v10, v6, :cond_4

    .line 97
    .line 98
    add-int/2addr v10, v3

    .line 99
    invoke-virtual {v1, v10}, LQ1/o;->G(I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, LQ1/o;->e()I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    shr-int/lit8 v1, v1, 0x6

    .line 107
    .line 108
    if-nez v1, :cond_4

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_4
    move v4, v8

    .line 112
    :goto_2
    iput v4, v0, Lh2/g;->a:I

    .line 113
    .line 114
    :cond_5
    iget v1, v0, Lh2/g;->c:I

    .line 115
    .line 116
    add-int/2addr v1, v5

    .line 117
    iput v1, v0, Lh2/g;->c:I

    .line 118
    .line 119
    if-eqz p5, :cond_7

    .line 120
    .line 121
    iget-wide v3, v0, Lh2/g;->d:J

    .line 122
    .line 123
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    cmp-long v1, v3, v5

    .line 129
    .line 130
    move-wide/from16 v11, p2

    .line 131
    .line 132
    if-nez v1, :cond_6

    .line 133
    .line 134
    iput-wide v11, v0, Lh2/g;->d:J

    .line 135
    .line 136
    :cond_6
    iget-wide v9, v0, Lh2/g;->e:J

    .line 137
    .line 138
    iget-wide v14, v0, Lh2/g;->d:J

    .line 139
    .line 140
    const v13, 0x15f90

    .line 141
    .line 142
    .line 143
    invoke-static/range {v9 .. v15}, LS3/f;->N(JJIJ)J

    .line 144
    .line 145
    .line 146
    move-result-wide v17

    .line 147
    iget-object v1, v0, Lh2/g;->g:Ljava/lang/Object;

    .line 148
    .line 149
    move-object/from16 v16, v1

    .line 150
    .line 151
    check-cast v16, Ls2/C;

    .line 152
    .line 153
    iget v1, v0, Lh2/g;->a:I

    .line 154
    .line 155
    iget v3, v0, Lh2/g;->c:I

    .line 156
    .line 157
    const/16 v21, 0x0

    .line 158
    .line 159
    const/16 v22, 0x0

    .line 160
    .line 161
    move/from16 v19, v1

    .line 162
    .line 163
    move/from16 v20, v3

    .line 164
    .line 165
    invoke-interface/range {v16 .. v22}, Ls2/C;->a(JIIILs2/B;)V

    .line 166
    .line 167
    .line 168
    iput v8, v0, Lh2/g;->c:I

    .line 169
    .line 170
    :cond_7
    iput v2, v0, Lh2/g;->b:I

    .line 171
    .line 172
    return-void

    .line 173
    :array_0
    .array-data 1
        0x0t
        0x0t
        0x1t
        -0x4at
    .end array-data
.end method

.method public c(Ls2/o;I)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-interface {p1, p2, v0}, Ls2/o;->m(II)Ls2/C;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    iput-object p1, p0, Lh2/g;->g:Ljava/lang/Object;

    .line 7
    .line 8
    sget p2, LQ1/x;->a:I

    .line 9
    .line 10
    iget-object p2, p0, Lh2/g;->f:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p2, Lg2/l;

    .line 13
    .line 14
    iget-object p2, p2, Lg2/l;->c:LN1/n;

    .line 15
    .line 16
    invoke-interface {p1, p2}, Ls2/C;->c(LN1/n;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public d(J)V
    .locals 0

    .line 1
    return-void
.end method
