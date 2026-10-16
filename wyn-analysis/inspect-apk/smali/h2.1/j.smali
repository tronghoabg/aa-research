.class public final Lh2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/i;


# instance fields
.field public final a:Lg2/l;

.field public b:Ls2/C;

.field public c:J

.field public d:I

.field public e:I

.field public f:J

.field public g:J

.field public h:Z

.field public i:Z

.field public j:Z


# direct methods
.method public constructor <init>(Lg2/l;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh2/j;->a:Lg2/l;

    .line 5
    .line 6
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    iput-wide v0, p0, Lh2/j;->c:J

    .line 12
    .line 13
    const/4 p1, -0x1

    .line 14
    iput p1, p0, Lh2/j;->d:I

    .line 15
    .line 16
    iput p1, p0, Lh2/j;->e:I

    .line 17
    .line 18
    iput-wide v0, p0, Lh2/j;->f:J

    .line 19
    .line 20
    const-wide/16 v0, 0x0

    .line 21
    .line 22
    iput-wide v0, p0, Lh2/j;->g:J

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lh2/j;->c:J

    .line 2
    .line 3
    const/4 p1, -0x1

    .line 4
    iput p1, p0, Lh2/j;->e:I

    .line 5
    .line 6
    iput-wide p3, p0, Lh2/j;->g:J

    .line 7
    .line 8
    return-void
.end method

.method public final b(LQ1/o;JIZ)V
    .locals 18

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
    const/16 v3, 0x10

    .line 8
    .line 9
    iget-object v4, v0, Lh2/j;->b:Ls2/C;

    .line 10
    .line 11
    invoke-static {v4}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    and-int/lit8 v5, v4, 0x10

    .line 19
    .line 20
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    const/4 v8, 0x0

    .line 26
    const/4 v9, -0x1

    .line 27
    const/4 v10, 0x1

    .line 28
    if-ne v5, v3, :cond_1

    .line 29
    .line 30
    and-int/lit8 v5, v4, 0x7

    .line 31
    .line 32
    if-nez v5, :cond_1

    .line 33
    .line 34
    iget-boolean v5, v0, Lh2/j;->h:Z

    .line 35
    .line 36
    if-eqz v5, :cond_0

    .line 37
    .line 38
    iget v5, v0, Lh2/j;->e:I

    .line 39
    .line 40
    if-lez v5, :cond_0

    .line 41
    .line 42
    iget-object v11, v0, Lh2/j;->b:Ls2/C;

    .line 43
    .line 44
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-wide v12, v0, Lh2/j;->f:J

    .line 48
    .line 49
    iget-boolean v14, v0, Lh2/j;->i:Z

    .line 50
    .line 51
    iget v15, v0, Lh2/j;->e:I

    .line 52
    .line 53
    const/16 v16, 0x0

    .line 54
    .line 55
    const/16 v17, 0x0

    .line 56
    .line 57
    invoke-interface/range {v11 .. v17}, Ls2/C;->a(JIIILs2/B;)V

    .line 58
    .line 59
    .line 60
    iput v9, v0, Lh2/j;->e:I

    .line 61
    .line 62
    iput-wide v6, v0, Lh2/j;->f:J

    .line 63
    .line 64
    iput-boolean v8, v0, Lh2/j;->h:Z

    .line 65
    .line 66
    :cond_0
    iput-boolean v10, v0, Lh2/j;->h:Z

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    iget-boolean v5, v0, Lh2/j;->h:Z

    .line 70
    .line 71
    const-string v11, "RtpVP8Reader"

    .line 72
    .line 73
    if-eqz v5, :cond_e

    .line 74
    .line 75
    iget v5, v0, Lh2/j;->d:I

    .line 76
    .line 77
    invoke-static {v5}, Lg2/i;->a(I)I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-ge v2, v5, :cond_2

    .line 82
    .line 83
    sget v1, LQ1/x;->a:I

    .line 84
    .line 85
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 86
    .line 87
    const-string v1, "Received RTP packet with unexpected sequence number. Expected: "

    .line 88
    .line 89
    const-string v3, "; received: "

    .line 90
    .line 91
    const-string v4, ". Dropping packet."

    .line 92
    .line 93
    invoke-static {v1, v5, v3, v2, v4}, LN0/a;->e(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-static {v11, v1}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_2
    :goto_0
    and-int/lit16 v4, v4, 0x80

    .line 102
    .line 103
    if-eqz v4, :cond_6

    .line 104
    .line 105
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    and-int/lit16 v5, v4, 0x80

    .line 110
    .line 111
    if-eqz v5, :cond_3

    .line 112
    .line 113
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    and-int/lit16 v5, v5, 0x80

    .line 118
    .line 119
    if-eqz v5, :cond_3

    .line 120
    .line 121
    invoke-virtual {v1, v10}, LQ1/o;->H(I)V

    .line 122
    .line 123
    .line 124
    :cond_3
    and-int/lit8 v5, v4, 0x40

    .line 125
    .line 126
    if-eqz v5, :cond_4

    .line 127
    .line 128
    invoke-virtual {v1, v10}, LQ1/o;->H(I)V

    .line 129
    .line 130
    .line 131
    :cond_4
    and-int/lit8 v5, v4, 0x20

    .line 132
    .line 133
    if-nez v5, :cond_5

    .line 134
    .line 135
    and-int/2addr v3, v4

    .line 136
    if-eqz v3, :cond_6

    .line 137
    .line 138
    :cond_5
    invoke-virtual {v1, v10}, LQ1/o;->H(I)V

    .line 139
    .line 140
    .line 141
    :cond_6
    iget v3, v0, Lh2/j;->e:I

    .line 142
    .line 143
    if-ne v3, v9, :cond_8

    .line 144
    .line 145
    iget-boolean v3, v0, Lh2/j;->h:Z

    .line 146
    .line 147
    if-eqz v3, :cond_8

    .line 148
    .line 149
    invoke-virtual {v1}, LQ1/o;->e()I

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    and-int/2addr v3, v10

    .line 154
    if-nez v3, :cond_7

    .line 155
    .line 156
    move v3, v10

    .line 157
    goto :goto_1

    .line 158
    :cond_7
    move v3, v8

    .line 159
    :goto_1
    iput-boolean v3, v0, Lh2/j;->i:Z

    .line 160
    .line 161
    :cond_8
    iget-boolean v3, v0, Lh2/j;->j:Z

    .line 162
    .line 163
    if-nez v3, :cond_b

    .line 164
    .line 165
    iget v3, v1, LQ1/o;->b:I

    .line 166
    .line 167
    add-int/lit8 v4, v3, 0x6

    .line 168
    .line 169
    invoke-virtual {v1, v4}, LQ1/o;->G(I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1}, LQ1/o;->n()I

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    and-int/lit16 v4, v4, 0x3fff

    .line 177
    .line 178
    invoke-virtual {v1}, LQ1/o;->n()I

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    and-int/lit16 v5, v5, 0x3fff

    .line 183
    .line 184
    invoke-virtual {v1, v3}, LQ1/o;->G(I)V

    .line 185
    .line 186
    .line 187
    iget-object v3, v0, Lh2/j;->a:Lg2/l;

    .line 188
    .line 189
    iget-object v3, v3, Lg2/l;->c:LN1/n;

    .line 190
    .line 191
    iget v11, v3, LN1/n;->u:I

    .line 192
    .line 193
    if-ne v4, v11, :cond_9

    .line 194
    .line 195
    iget v11, v3, LN1/n;->v:I

    .line 196
    .line 197
    if-eq v5, v11, :cond_a

    .line 198
    .line 199
    :cond_9
    iget-object v11, v0, Lh2/j;->b:Ls2/C;

    .line 200
    .line 201
    invoke-virtual {v3}, LN1/n;->a()LN1/m;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    iput v4, v3, LN1/m;->t:I

    .line 206
    .line 207
    iput v5, v3, LN1/m;->u:I

    .line 208
    .line 209
    invoke-static {v3, v11}, LVa/M6;->y(LN1/m;Ls2/C;)V

    .line 210
    .line 211
    .line 212
    :cond_a
    iput-boolean v10, v0, Lh2/j;->j:Z

    .line 213
    .line 214
    :cond_b
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    iget-object v4, v0, Lh2/j;->b:Ls2/C;

    .line 219
    .line 220
    invoke-interface {v4, v3, v1}, Ls2/C;->e(ILQ1/o;)V

    .line 221
    .line 222
    .line 223
    iget v1, v0, Lh2/j;->e:I

    .line 224
    .line 225
    if-ne v1, v9, :cond_c

    .line 226
    .line 227
    iput v3, v0, Lh2/j;->e:I

    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_c
    add-int/2addr v1, v3

    .line 231
    iput v1, v0, Lh2/j;->e:I

    .line 232
    .line 233
    :goto_2
    iget-wide v10, v0, Lh2/j;->g:J

    .line 234
    .line 235
    iget-wide v3, v0, Lh2/j;->c:J

    .line 236
    .line 237
    const v14, 0x15f90

    .line 238
    .line 239
    .line 240
    move-wide/from16 v12, p2

    .line 241
    .line 242
    move-wide v15, v3

    .line 243
    invoke-static/range {v10 .. v16}, LS3/f;->N(JJIJ)J

    .line 244
    .line 245
    .line 246
    move-result-wide v3

    .line 247
    iput-wide v3, v0, Lh2/j;->f:J

    .line 248
    .line 249
    if-eqz p5, :cond_d

    .line 250
    .line 251
    iget-object v10, v0, Lh2/j;->b:Ls2/C;

    .line 252
    .line 253
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    iget-wide v11, v0, Lh2/j;->f:J

    .line 257
    .line 258
    iget-boolean v13, v0, Lh2/j;->i:Z

    .line 259
    .line 260
    iget v14, v0, Lh2/j;->e:I

    .line 261
    .line 262
    const/4 v15, 0x0

    .line 263
    const/16 v16, 0x0

    .line 264
    .line 265
    invoke-interface/range {v10 .. v16}, Ls2/C;->a(JIIILs2/B;)V

    .line 266
    .line 267
    .line 268
    iput v9, v0, Lh2/j;->e:I

    .line 269
    .line 270
    iput-wide v6, v0, Lh2/j;->f:J

    .line 271
    .line 272
    iput-boolean v8, v0, Lh2/j;->h:Z

    .line 273
    .line 274
    :cond_d
    iput v2, v0, Lh2/j;->d:I

    .line 275
    .line 276
    return-void

    .line 277
    :cond_e
    const-string v1, "RTP packet is not the start of a new VP8 partition, skipping."

    .line 278
    .line 279
    invoke-static {v11, v1}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    return-void
.end method

.method public final c(Ls2/o;I)V
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
    iput-object p1, p0, Lh2/j;->b:Ls2/C;

    .line 7
    .line 8
    iget-object p2, p0, Lh2/j;->a:Lg2/l;

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
    iget-wide v0, p0, Lh2/j;->c:J

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
    iput-wide p1, p0, Lh2/j;->c:J

    .line 19
    .line 20
    return-void
.end method
