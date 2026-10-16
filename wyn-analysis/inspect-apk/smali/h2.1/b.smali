.class public final Lh2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/i;


# instance fields
.field public final a:Lg2/l;

.field public final b:LJ5/y;

.field public c:Ls2/C;

.field public d:I

.field public e:J

.field public f:J

.field public g:J


# direct methods
.method public constructor <init>(Lg2/l;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh2/b;->a:Lg2/l;

    .line 5
    .line 6
    new-instance p1, LJ5/y;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-direct {p1, v0}, LJ5/y;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lh2/b;->b:LJ5/y;

    .line 13
    .line 14
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    iput-wide v0, p0, Lh2/b;->e:J

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lh2/b;->e:J

    .line 2
    .line 3
    iput-wide p3, p0, Lh2/b;->g:J

    .line 4
    .line 5
    return-void
.end method

.method public final b(LQ1/o;JIZ)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    const/4 v4, 0x3

    .line 11
    and-int/2addr v3, v4

    .line 12
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    and-int/lit16 v5, v5, 0xff

    .line 17
    .line 18
    iget-wide v6, v0, Lh2/b;->g:J

    .line 19
    .line 20
    iget-wide v11, v0, Lh2/b;->e:J

    .line 21
    .line 22
    iget-object v8, v0, Lh2/b;->a:Lg2/l;

    .line 23
    .line 24
    iget v10, v8, Lg2/l;->b:I

    .line 25
    .line 26
    move-wide/from16 v8, p2

    .line 27
    .line 28
    invoke-static/range {v6 .. v12}, LS3/f;->N(JJIJ)J

    .line 29
    .line 30
    .line 31
    move-result-wide v14

    .line 32
    const/4 v6, 0x0

    .line 33
    const/4 v7, 0x2

    .line 34
    if-eqz v3, :cond_3

    .line 35
    .line 36
    if-eq v3, v2, :cond_1

    .line 37
    .line 38
    if-eq v3, v7, :cond_1

    .line 39
    .line 40
    if-ne v3, v4, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 44
    .line 45
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v1

    .line 53
    :cond_1
    iget v11, v0, Lh2/b;->d:I

    .line 54
    .line 55
    if-lez v11, :cond_2

    .line 56
    .line 57
    iget-object v7, v0, Lh2/b;->c:Ls2/C;

    .line 58
    .line 59
    sget v2, LQ1/x;->a:I

    .line 60
    .line 61
    iget-wide v8, v0, Lh2/b;->f:J

    .line 62
    .line 63
    const/4 v10, 0x1

    .line 64
    const/4 v12, 0x0

    .line 65
    const/4 v13, 0x0

    .line 66
    invoke-interface/range {v7 .. v13}, Ls2/C;->a(JIIILs2/B;)V

    .line 67
    .line 68
    .line 69
    iput v6, v0, Lh2/b;->d:I

    .line 70
    .line 71
    :cond_2
    :goto_0
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    iget-object v5, v0, Lh2/b;->c:Ls2/C;

    .line 76
    .line 77
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-interface {v5, v2, v1}, Ls2/C;->e(ILQ1/o;)V

    .line 81
    .line 82
    .line 83
    iget v1, v0, Lh2/b;->d:I

    .line 84
    .line 85
    add-int/2addr v1, v2

    .line 86
    iput v1, v0, Lh2/b;->d:I

    .line 87
    .line 88
    iput-wide v14, v0, Lh2/b;->f:J

    .line 89
    .line 90
    if-eqz p5, :cond_6

    .line 91
    .line 92
    if-ne v3, v4, :cond_6

    .line 93
    .line 94
    iget-object v13, v0, Lh2/b;->c:Ls2/C;

    .line 95
    .line 96
    sget v2, LQ1/x;->a:I

    .line 97
    .line 98
    const/16 v19, 0x0

    .line 99
    .line 100
    const/16 v16, 0x1

    .line 101
    .line 102
    const/16 v18, 0x0

    .line 103
    .line 104
    move/from16 v17, v1

    .line 105
    .line 106
    invoke-interface/range {v13 .. v19}, Ls2/C;->a(JIIILs2/B;)V

    .line 107
    .line 108
    .line 109
    iput v6, v0, Lh2/b;->d:I

    .line 110
    .line 111
    return-void

    .line 112
    :cond_3
    iget v3, v0, Lh2/b;->d:I

    .line 113
    .line 114
    if-lez v3, :cond_4

    .line 115
    .line 116
    iget-object v4, v0, Lh2/b;->c:Ls2/C;

    .line 117
    .line 118
    sget v8, LQ1/x;->a:I

    .line 119
    .line 120
    iget-wide v8, v0, Lh2/b;->f:J

    .line 121
    .line 122
    const/16 v19, 0x1

    .line 123
    .line 124
    const/16 v21, 0x0

    .line 125
    .line 126
    const/16 v22, 0x0

    .line 127
    .line 128
    move/from16 v20, v3

    .line 129
    .line 130
    move-object/from16 v16, v4

    .line 131
    .line 132
    move-wide/from16 v17, v8

    .line 133
    .line 134
    invoke-interface/range {v16 .. v22}, Ls2/C;->a(JIIILs2/B;)V

    .line 135
    .line 136
    .line 137
    iput v6, v0, Lh2/b;->d:I

    .line 138
    .line 139
    :cond_4
    if-ne v5, v2, :cond_5

    .line 140
    .line 141
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    iget-object v3, v0, Lh2/b;->c:Ls2/C;

    .line 146
    .line 147
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-interface {v3, v2, v1}, Ls2/C;->e(ILQ1/o;)V

    .line 151
    .line 152
    .line 153
    iget-object v13, v0, Lh2/b;->c:Ls2/C;

    .line 154
    .line 155
    sget v1, LQ1/x;->a:I

    .line 156
    .line 157
    const/16 v16, 0x1

    .line 158
    .line 159
    const/16 v18, 0x0

    .line 160
    .line 161
    const/16 v19, 0x0

    .line 162
    .line 163
    move/from16 v17, v2

    .line 164
    .line 165
    invoke-interface/range {v13 .. v19}, Ls2/C;->a(JIIILs2/B;)V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :cond_5
    iget-object v3, v1, LQ1/o;->a:[B

    .line 170
    .line 171
    iget-object v4, v0, Lh2/b;->b:LJ5/y;

    .line 172
    .line 173
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    array-length v8, v3

    .line 177
    invoke-virtual {v4, v8, v3}, LJ5/y;->o(I[B)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v4, v7}, LJ5/y;->u(I)V

    .line 181
    .line 182
    .line 183
    move-wide v8, v14

    .line 184
    :goto_1
    if-ge v6, v5, :cond_6

    .line 185
    .line 186
    invoke-static {v4}, Ls2/a;->o(LJ5/y;)Ls2/b;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    iget-object v7, v0, Lh2/b;->c:Ls2/C;

    .line 191
    .line 192
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    iget v14, v3, Ls2/b;->d:I

    .line 196
    .line 197
    invoke-interface {v7, v14, v1}, Ls2/C;->e(ILQ1/o;)V

    .line 198
    .line 199
    .line 200
    iget-object v7, v0, Lh2/b;->c:Ls2/C;

    .line 201
    .line 202
    sget v10, LQ1/x;->a:I

    .line 203
    .line 204
    const/4 v12, 0x0

    .line 205
    const/4 v13, 0x0

    .line 206
    const/4 v10, 0x1

    .line 207
    iget v11, v3, Ls2/b;->d:I

    .line 208
    .line 209
    invoke-interface/range {v7 .. v13}, Ls2/C;->a(JIIILs2/B;)V

    .line 210
    .line 211
    .line 212
    iget v7, v3, Ls2/b;->e:I

    .line 213
    .line 214
    iget v3, v3, Ls2/b;->b:I

    .line 215
    .line 216
    div-int/2addr v7, v3

    .line 217
    int-to-long v10, v7

    .line 218
    const-wide/32 v12, 0xf4240

    .line 219
    .line 220
    .line 221
    mul-long/2addr v10, v12

    .line 222
    add-long/2addr v8, v10

    .line 223
    invoke-virtual {v4, v14}, LJ5/y;->u(I)V

    .line 224
    .line 225
    .line 226
    add-int/2addr v6, v2

    .line 227
    goto :goto_1

    .line 228
    :cond_6
    return-void
.end method

.method public final c(Ls2/o;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-interface {p1, p2, v0}, Ls2/o;->m(II)Ls2/C;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    iput-object p1, p0, Lh2/b;->c:Ls2/C;

    .line 7
    .line 8
    iget-object p2, p0, Lh2/b;->a:Lg2/l;

    .line 9
    .line 10
    iget-object p2, p2, Lg2/l;->c:LN1/n;

    .line 11
    .line 12
    invoke-interface {p1, p2}, Ls2/C;->c(LN1/n;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final d(J)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lh2/b;->e:J

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
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 16
    .line 17
    .line 18
    iput-wide p1, p0, Lh2/b;->e:J

    .line 19
    .line 20
    return-void
.end method
