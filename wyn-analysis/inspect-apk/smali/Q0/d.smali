.class public LQ0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:I

.field public B:F

.field public final C:[I

.field public D:F

.field public E:Z

.field public F:Z

.field public G:I

.field public H:I

.field public final I:LQ0/c;

.field public final J:LQ0/c;

.field public final K:LQ0/c;

.field public final L:LQ0/c;

.field public final M:LQ0/c;

.field public final N:LQ0/c;

.field public final O:LQ0/c;

.field public final P:LQ0/c;

.field public final Q:[LQ0/c;

.field public final R:Ljava/util/ArrayList;

.field public final S:[Z

.field public T:LQ0/d;

.field public U:I

.field public V:I

.field public W:F

.field public X:I

.field public Y:I

.field public Z:I

.field public a:Z

.field public a0:I

.field public b:LR0/c;

.field public b0:I

.field public c:LR0/c;

.field public c0:I

.field public d:LR0/k;

.field public d0:F

.field public e:LR0/m;

.field public e0:F

.field public final f:[Z

.field public f0:Landroid/view/View;

.field public g:Z

.field public g0:I

.field public h:I

.field public h0:Ljava/lang/String;

.field public i:I

.field public i0:I

.field public j:Ljava/lang/String;

.field public j0:I

.field public k:Z

.field public final k0:[F

.field public l:Z

.field public final l0:[LQ0/d;

.field public m:Z

.field public final m0:[LQ0/d;

.field public n:Z

.field public n0:I

.field public o:I

.field public o0:I

.field public p:I

.field public final p0:[I

.field public q:I

.field public r:I

.field public s:I

.field public final t:[I

.field public u:I

.field public v:I

.field public w:F

.field public x:I

.field public y:I

.field public z:F


# direct methods
.method public constructor <init>()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/4 v2, 0x5

    .line 5
    const/4 v3, 0x4

    .line 6
    const/4 v4, 0x3

    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    iput-boolean v5, v0, LQ0/d;->a:Z

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    iput-object v6, v0, LQ0/d;->d:LR0/k;

    .line 15
    .line 16
    iput-object v6, v0, LQ0/d;->e:LR0/m;

    .line 17
    .line 18
    const/4 v7, 0x1

    .line 19
    const/4 v8, 0x2

    .line 20
    new-array v9, v8, [Z

    .line 21
    .line 22
    fill-array-data v9, :array_0

    .line 23
    .line 24
    .line 25
    iput-object v9, v0, LQ0/d;->f:[Z

    .line 26
    .line 27
    iput-boolean v7, v0, LQ0/d;->g:Z

    .line 28
    .line 29
    const/4 v9, -0x1

    .line 30
    iput v9, v0, LQ0/d;->h:I

    .line 31
    .line 32
    iput v9, v0, LQ0/d;->i:I

    .line 33
    .line 34
    new-instance v10, Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-boolean v5, v0, LQ0/d;->k:Z

    .line 40
    .line 41
    iput-boolean v5, v0, LQ0/d;->l:Z

    .line 42
    .line 43
    iput-boolean v5, v0, LQ0/d;->m:Z

    .line 44
    .line 45
    iput-boolean v5, v0, LQ0/d;->n:Z

    .line 46
    .line 47
    iput v9, v0, LQ0/d;->o:I

    .line 48
    .line 49
    iput v9, v0, LQ0/d;->p:I

    .line 50
    .line 51
    iput v5, v0, LQ0/d;->q:I

    .line 52
    .line 53
    iput v5, v0, LQ0/d;->r:I

    .line 54
    .line 55
    iput v5, v0, LQ0/d;->s:I

    .line 56
    .line 57
    new-array v10, v8, [I

    .line 58
    .line 59
    iput-object v10, v0, LQ0/d;->t:[I

    .line 60
    .line 61
    iput v5, v0, LQ0/d;->u:I

    .line 62
    .line 63
    iput v5, v0, LQ0/d;->v:I

    .line 64
    .line 65
    const/high16 v10, 0x3f800000    # 1.0f

    .line 66
    .line 67
    iput v10, v0, LQ0/d;->w:F

    .line 68
    .line 69
    iput v5, v0, LQ0/d;->x:I

    .line 70
    .line 71
    iput v5, v0, LQ0/d;->y:I

    .line 72
    .line 73
    iput v10, v0, LQ0/d;->z:F

    .line 74
    .line 75
    iput v9, v0, LQ0/d;->A:I

    .line 76
    .line 77
    iput v10, v0, LQ0/d;->B:F

    .line 78
    .line 79
    const v10, 0x7fffffff

    .line 80
    .line 81
    .line 82
    filled-new-array {v10, v10}, [I

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    iput-object v10, v0, LQ0/d;->C:[I

    .line 87
    .line 88
    const/4 v10, 0x0

    .line 89
    iput v10, v0, LQ0/d;->D:F

    .line 90
    .line 91
    iput-boolean v5, v0, LQ0/d;->E:Z

    .line 92
    .line 93
    iput-boolean v5, v0, LQ0/d;->F:Z

    .line 94
    .line 95
    iput v5, v0, LQ0/d;->G:I

    .line 96
    .line 97
    iput v5, v0, LQ0/d;->H:I

    .line 98
    .line 99
    new-instance v11, LQ0/c;

    .line 100
    .line 101
    invoke-direct {v11, v0, v8}, LQ0/c;-><init>(LQ0/d;I)V

    .line 102
    .line 103
    .line 104
    iput-object v11, v0, LQ0/d;->I:LQ0/c;

    .line 105
    .line 106
    new-instance v12, LQ0/c;

    .line 107
    .line 108
    invoke-direct {v12, v0, v4}, LQ0/c;-><init>(LQ0/d;I)V

    .line 109
    .line 110
    .line 111
    iput-object v12, v0, LQ0/d;->J:LQ0/c;

    .line 112
    .line 113
    new-instance v13, LQ0/c;

    .line 114
    .line 115
    invoke-direct {v13, v0, v3}, LQ0/c;-><init>(LQ0/d;I)V

    .line 116
    .line 117
    .line 118
    iput-object v13, v0, LQ0/d;->K:LQ0/c;

    .line 119
    .line 120
    new-instance v14, LQ0/c;

    .line 121
    .line 122
    invoke-direct {v14, v0, v2}, LQ0/c;-><init>(LQ0/d;I)V

    .line 123
    .line 124
    .line 125
    iput-object v14, v0, LQ0/d;->L:LQ0/c;

    .line 126
    .line 127
    new-instance v15, LQ0/c;

    .line 128
    .line 129
    invoke-direct {v15, v0, v1}, LQ0/c;-><init>(LQ0/d;I)V

    .line 130
    .line 131
    .line 132
    iput-object v15, v0, LQ0/d;->M:LQ0/c;

    .line 133
    .line 134
    move/from16 v16, v2

    .line 135
    .line 136
    new-instance v2, LQ0/c;

    .line 137
    .line 138
    move/from16 v17, v3

    .line 139
    .line 140
    const/16 v3, 0x8

    .line 141
    .line 142
    invoke-direct {v2, v0, v3}, LQ0/c;-><init>(LQ0/d;I)V

    .line 143
    .line 144
    .line 145
    iput-object v2, v0, LQ0/d;->N:LQ0/c;

    .line 146
    .line 147
    new-instance v3, LQ0/c;

    .line 148
    .line 149
    move/from16 v18, v4

    .line 150
    .line 151
    const/16 v4, 0x9

    .line 152
    .line 153
    invoke-direct {v3, v0, v4}, LQ0/c;-><init>(LQ0/d;I)V

    .line 154
    .line 155
    .line 156
    iput-object v3, v0, LQ0/d;->O:LQ0/c;

    .line 157
    .line 158
    new-instance v4, LQ0/c;

    .line 159
    .line 160
    const/4 v9, 0x7

    .line 161
    invoke-direct {v4, v0, v9}, LQ0/c;-><init>(LQ0/d;I)V

    .line 162
    .line 163
    .line 164
    iput-object v4, v0, LQ0/d;->P:LQ0/c;

    .line 165
    .line 166
    new-array v1, v1, [LQ0/c;

    .line 167
    .line 168
    aput-object v11, v1, v5

    .line 169
    .line 170
    aput-object v13, v1, v7

    .line 171
    .line 172
    aput-object v12, v1, v8

    .line 173
    .line 174
    aput-object v14, v1, v18

    .line 175
    .line 176
    aput-object v15, v1, v17

    .line 177
    .line 178
    aput-object v4, v1, v16

    .line 179
    .line 180
    iput-object v1, v0, LQ0/d;->Q:[LQ0/c;

    .line 181
    .line 182
    new-instance v1, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 185
    .line 186
    .line 187
    iput-object v1, v0, LQ0/d;->R:Ljava/util/ArrayList;

    .line 188
    .line 189
    new-array v9, v8, [Z

    .line 190
    .line 191
    iput-object v9, v0, LQ0/d;->S:[Z

    .line 192
    .line 193
    filled-new-array {v7, v7}, [I

    .line 194
    .line 195
    .line 196
    move-result-object v9

    .line 197
    iput-object v9, v0, LQ0/d;->p0:[I

    .line 198
    .line 199
    iput-object v6, v0, LQ0/d;->T:LQ0/d;

    .line 200
    .line 201
    iput v5, v0, LQ0/d;->U:I

    .line 202
    .line 203
    iput v5, v0, LQ0/d;->V:I

    .line 204
    .line 205
    iput v10, v0, LQ0/d;->W:F

    .line 206
    .line 207
    const/4 v9, -0x1

    .line 208
    iput v9, v0, LQ0/d;->X:I

    .line 209
    .line 210
    iput v5, v0, LQ0/d;->Y:I

    .line 211
    .line 212
    iput v5, v0, LQ0/d;->Z:I

    .line 213
    .line 214
    iput v5, v0, LQ0/d;->a0:I

    .line 215
    .line 216
    const/high16 v9, 0x3f000000    # 0.5f

    .line 217
    .line 218
    iput v9, v0, LQ0/d;->d0:F

    .line 219
    .line 220
    iput v9, v0, LQ0/d;->e0:F

    .line 221
    .line 222
    iput v5, v0, LQ0/d;->g0:I

    .line 223
    .line 224
    iput-object v6, v0, LQ0/d;->h0:Ljava/lang/String;

    .line 225
    .line 226
    iput v5, v0, LQ0/d;->i0:I

    .line 227
    .line 228
    iput v5, v0, LQ0/d;->j0:I

    .line 229
    .line 230
    new-array v9, v8, [F

    .line 231
    .line 232
    fill-array-data v9, :array_1

    .line 233
    .line 234
    .line 235
    iput-object v9, v0, LQ0/d;->k0:[F

    .line 236
    .line 237
    new-array v9, v8, [LQ0/d;

    .line 238
    .line 239
    aput-object v6, v9, v5

    .line 240
    .line 241
    aput-object v6, v9, v7

    .line 242
    .line 243
    iput-object v9, v0, LQ0/d;->l0:[LQ0/d;

    .line 244
    .line 245
    new-array v8, v8, [LQ0/d;

    .line 246
    .line 247
    aput-object v6, v8, v5

    .line 248
    .line 249
    aput-object v6, v8, v7

    .line 250
    .line 251
    iput-object v8, v0, LQ0/d;->m0:[LQ0/d;

    .line 252
    .line 253
    const/4 v9, -0x1

    .line 254
    iput v9, v0, LQ0/d;->n0:I

    .line 255
    .line 256
    iput v9, v0, LQ0/d;->o0:I

    .line 257
    .line 258
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    return-void

    .line 283
    :array_0
    .array-data 1
        0x1t
        0x1t
    .end array-data

    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    nop

    .line 289
    :array_1
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
    .end array-data
.end method

.method public static G(IILjava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 0

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    const-string p1, " :   "

    .line 8
    .line 9
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p0, ",\n"

    .line 16
    .line 17
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static H(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V
    .locals 0

    .line 1
    cmpl-float p3, p2, p3

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p1, " :   "

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p1, ",\n"

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static o(Ljava/lang/StringBuilder;Ljava/lang/String;IIIIIF)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    const-string p1, " :  {\n"

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p1, "      size"

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {p2, v0, p1, p0}, LQ0/d;->G(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 13
    .line 14
    .line 15
    const-string p1, "      min"

    .line 16
    .line 17
    invoke-static {p3, v0, p1, p0}, LQ0/d;->G(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 18
    .line 19
    .line 20
    const-string p1, "      max"

    .line 21
    .line 22
    const p2, 0x7fffffff

    .line 23
    .line 24
    .line 25
    invoke-static {p4, p2, p1, p0}, LQ0/d;->G(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 26
    .line 27
    .line 28
    const-string p1, "      matchMin"

    .line 29
    .line 30
    invoke-static {p5, v0, p1, p0}, LQ0/d;->G(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 31
    .line 32
    .line 33
    const-string p1, "      matchDef"

    .line 34
    .line 35
    invoke-static {p6, v0, p1, p0}, LQ0/d;->G(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 36
    .line 37
    .line 38
    const-string p1, "      matchPercent"

    .line 39
    .line 40
    const/high16 p2, 0x3f800000    # 1.0f

    .line 41
    .line 42
    invoke-static {p0, p1, p7, p2}, LQ0/d;->H(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V

    .line 43
    .line 44
    .line 45
    const-string p1, "    },\n"

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static p(Ljava/lang/StringBuilder;Ljava/lang/String;LQ0/c;)V
    .locals 2

    .line 1
    iget-object v0, p2, LQ0/c;->f:LQ0/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string v0, "    "

    .line 7
    .line 8
    const-string v1, " : [ \'"

    .line 9
    .line 10
    invoke-static {p0, v0, p1, v1}, LN0/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p2, LQ0/c;->f:LQ0/c;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string p1, "\'"

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget p1, p2, LQ0/c;->h:I

    .line 24
    .line 25
    const/high16 v0, -0x80000000

    .line 26
    .line 27
    if-ne p1, v0, :cond_1

    .line 28
    .line 29
    iget p1, p2, LQ0/c;->g:I

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    :cond_1
    const-string p1, ","

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget v1, p2, LQ0/c;->g:I

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget v1, p2, LQ0/c;->h:I

    .line 44
    .line 45
    if-eq v1, v0, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget p2, p2, LQ0/c;->h:I

    .line 51
    .line 52
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    :cond_2
    const-string p1, " ] ,\n"

    .line 59
    .line 60
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public A()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LQ0/d;->k:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, LQ0/d;->I:LQ0/c;

    .line 6
    .line 7
    iget-boolean v0, v0, LQ0/c;->c:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LQ0/d;->K:LQ0/c;

    .line 12
    .line 13
    iget-boolean v0, v0, LQ0/c;->c:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return v0

    .line 20
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 21
    return v0
.end method

.method public B()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LQ0/d;->l:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, LQ0/d;->J:LQ0/c;

    .line 6
    .line 7
    iget-boolean v0, v0, LQ0/c;->c:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LQ0/d;->L:LQ0/c;

    .line 12
    .line 13
    iget-boolean v0, v0, LQ0/c;->c:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return v0

    .line 20
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 21
    return v0
.end method

.method public C()V
    .locals 5

    .line 1
    iget-object v0, p0, LQ0/d;->I:LQ0/c;

    .line 2
    .line 3
    invoke-virtual {v0}, LQ0/c;->j()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LQ0/d;->J:LQ0/c;

    .line 7
    .line 8
    invoke-virtual {v0}, LQ0/c;->j()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LQ0/d;->K:LQ0/c;

    .line 12
    .line 13
    invoke-virtual {v0}, LQ0/c;->j()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LQ0/d;->L:LQ0/c;

    .line 17
    .line 18
    invoke-virtual {v0}, LQ0/c;->j()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, LQ0/d;->M:LQ0/c;

    .line 22
    .line 23
    invoke-virtual {v0}, LQ0/c;->j()V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, LQ0/d;->N:LQ0/c;

    .line 27
    .line 28
    invoke-virtual {v0}, LQ0/c;->j()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, LQ0/d;->O:LQ0/c;

    .line 32
    .line 33
    invoke-virtual {v0}, LQ0/c;->j()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, LQ0/d;->P:LQ0/c;

    .line 37
    .line 38
    invoke-virtual {v0}, LQ0/c;->j()V

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    iput-object v0, p0, LQ0/d;->T:LQ0/d;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    iput v1, p0, LQ0/d;->D:F

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    iput v2, p0, LQ0/d;->U:I

    .line 49
    .line 50
    iput v2, p0, LQ0/d;->V:I

    .line 51
    .line 52
    iput v1, p0, LQ0/d;->W:F

    .line 53
    .line 54
    const/4 v1, -0x1

    .line 55
    iput v1, p0, LQ0/d;->X:I

    .line 56
    .line 57
    iput v2, p0, LQ0/d;->Y:I

    .line 58
    .line 59
    iput v2, p0, LQ0/d;->Z:I

    .line 60
    .line 61
    iput v2, p0, LQ0/d;->a0:I

    .line 62
    .line 63
    iput v2, p0, LQ0/d;->b0:I

    .line 64
    .line 65
    iput v2, p0, LQ0/d;->c0:I

    .line 66
    .line 67
    const/high16 v3, 0x3f000000    # 0.5f

    .line 68
    .line 69
    iput v3, p0, LQ0/d;->d0:F

    .line 70
    .line 71
    iput v3, p0, LQ0/d;->e0:F

    .line 72
    .line 73
    iget-object v3, p0, LQ0/d;->p0:[I

    .line 74
    .line 75
    const/4 v4, 0x1

    .line 76
    aput v4, v3, v2

    .line 77
    .line 78
    aput v4, v3, v4

    .line 79
    .line 80
    iput-object v0, p0, LQ0/d;->f0:Landroid/view/View;

    .line 81
    .line 82
    iput v2, p0, LQ0/d;->g0:I

    .line 83
    .line 84
    iput v2, p0, LQ0/d;->i0:I

    .line 85
    .line 86
    iput v2, p0, LQ0/d;->j0:I

    .line 87
    .line 88
    iget-object v0, p0, LQ0/d;->k0:[F

    .line 89
    .line 90
    const/high16 v3, -0x40800000    # -1.0f

    .line 91
    .line 92
    aput v3, v0, v2

    .line 93
    .line 94
    aput v3, v0, v4

    .line 95
    .line 96
    iput v1, p0, LQ0/d;->o:I

    .line 97
    .line 98
    iput v1, p0, LQ0/d;->p:I

    .line 99
    .line 100
    iget-object v0, p0, LQ0/d;->C:[I

    .line 101
    .line 102
    const v3, 0x7fffffff

    .line 103
    .line 104
    .line 105
    aput v3, v0, v2

    .line 106
    .line 107
    aput v3, v0, v4

    .line 108
    .line 109
    iput v2, p0, LQ0/d;->r:I

    .line 110
    .line 111
    iput v2, p0, LQ0/d;->s:I

    .line 112
    .line 113
    const/high16 v0, 0x3f800000    # 1.0f

    .line 114
    .line 115
    iput v0, p0, LQ0/d;->w:F

    .line 116
    .line 117
    iput v0, p0, LQ0/d;->z:F

    .line 118
    .line 119
    iput v3, p0, LQ0/d;->v:I

    .line 120
    .line 121
    iput v3, p0, LQ0/d;->y:I

    .line 122
    .line 123
    iput v2, p0, LQ0/d;->u:I

    .line 124
    .line 125
    iput v2, p0, LQ0/d;->x:I

    .line 126
    .line 127
    iput v1, p0, LQ0/d;->A:I

    .line 128
    .line 129
    iput v0, p0, LQ0/d;->B:F

    .line 130
    .line 131
    iget-object v0, p0, LQ0/d;->f:[Z

    .line 132
    .line 133
    aput-boolean v4, v0, v2

    .line 134
    .line 135
    aput-boolean v4, v0, v4

    .line 136
    .line 137
    iput-boolean v2, p0, LQ0/d;->F:Z

    .line 138
    .line 139
    iget-object v0, p0, LQ0/d;->S:[Z

    .line 140
    .line 141
    aput-boolean v2, v0, v2

    .line 142
    .line 143
    aput-boolean v2, v0, v4

    .line 144
    .line 145
    iput-boolean v4, p0, LQ0/d;->g:Z

    .line 146
    .line 147
    iget-object v0, p0, LQ0/d;->t:[I

    .line 148
    .line 149
    aput v2, v0, v2

    .line 150
    .line 151
    aput v2, v0, v4

    .line 152
    .line 153
    iput v1, p0, LQ0/d;->h:I

    .line 154
    .line 155
    iput v1, p0, LQ0/d;->i:I

    .line 156
    .line 157
    return-void
.end method

.method public final D()V
    .locals 4

    .line 1
    iget-object v0, p0, LQ0/d;->T:LQ0/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v1, v0, LQ0/e;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, LQ0/e;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, LQ0/d;->R:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_0
    if-ge v2, v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, LQ0/c;

    .line 28
    .line 29
    invoke-virtual {v3}, LQ0/c;->j()V

    .line 30
    .line 31
    .line 32
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-void
.end method

.method public final E()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LQ0/d;->k:Z

    .line 3
    .line 4
    iput-boolean v0, p0, LQ0/d;->l:Z

    .line 5
    .line 6
    iput-boolean v0, p0, LQ0/d;->m:Z

    .line 7
    .line 8
    iput-boolean v0, p0, LQ0/d;->n:Z

    .line 9
    .line 10
    iget-object v1, p0, LQ0/d;->R:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    move v3, v0

    .line 17
    :goto_0
    if-ge v3, v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, LQ0/c;

    .line 24
    .line 25
    iput-boolean v0, v4, LQ0/c;->c:Z

    .line 26
    .line 27
    iput v0, v4, LQ0/c;->b:I

    .line 28
    .line 29
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
.end method

.method public F(LG9/e;)V
    .locals 0

    .line 1
    iget-object p1, p0, LQ0/d;->I:LQ0/c;

    .line 2
    .line 3
    invoke-virtual {p1}, LQ0/c;->k()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LQ0/d;->J:LQ0/c;

    .line 7
    .line 8
    invoke-virtual {p1}, LQ0/c;->k()V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, LQ0/d;->K:LQ0/c;

    .line 12
    .line 13
    invoke-virtual {p1}, LQ0/c;->k()V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, LQ0/d;->L:LQ0/c;

    .line 17
    .line 18
    invoke-virtual {p1}, LQ0/c;->k()V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, LQ0/d;->M:LQ0/c;

    .line 22
    .line 23
    invoke-virtual {p1}, LQ0/c;->k()V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, LQ0/d;->P:LQ0/c;

    .line 27
    .line 28
    invoke-virtual {p1}, LQ0/c;->k()V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, LQ0/d;->N:LQ0/c;

    .line 32
    .line 33
    invoke-virtual {p1}, LQ0/c;->k()V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, LQ0/d;->O:LQ0/c;

    .line 37
    .line 38
    invoke-virtual {p1}, LQ0/c;->k()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final I(I)V
    .locals 0

    .line 1
    iput p1, p0, LQ0/d;->a0:I

    .line 2
    .line 3
    if-lez p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    :goto_0
    iput-boolean p1, p0, LQ0/d;->E:Z

    .line 9
    .line 10
    return-void
.end method

.method public final J(II)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LQ0/d;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, LQ0/d;->I:LQ0/c;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LQ0/c;->l(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LQ0/d;->K:LQ0/c;

    .line 12
    .line 13
    invoke-virtual {v0, p2}, LQ0/c;->l(I)V

    .line 14
    .line 15
    .line 16
    iput p1, p0, LQ0/d;->Y:I

    .line 17
    .line 18
    sub-int/2addr p2, p1

    .line 19
    iput p2, p0, LQ0/d;->U:I

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, LQ0/d;->k:Z

    .line 23
    .line 24
    return-void
.end method

.method public final K(II)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LQ0/d;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, LQ0/d;->J:LQ0/c;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LQ0/c;->l(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LQ0/d;->L:LQ0/c;

    .line 12
    .line 13
    invoke-virtual {v0, p2}, LQ0/c;->l(I)V

    .line 14
    .line 15
    .line 16
    iput p1, p0, LQ0/d;->Z:I

    .line 17
    .line 18
    sub-int/2addr p2, p1

    .line 19
    iput p2, p0, LQ0/d;->V:I

    .line 20
    .line 21
    iget-boolean p2, p0, LQ0/d;->E:Z

    .line 22
    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    iget p2, p0, LQ0/d;->a0:I

    .line 26
    .line 27
    add-int/2addr p1, p2

    .line 28
    iget-object p2, p0, LQ0/d;->M:LQ0/c;

    .line 29
    .line 30
    invoke-virtual {p2, p1}, LQ0/c;->l(I)V

    .line 31
    .line 32
    .line 33
    :cond_1
    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, LQ0/d;->l:Z

    .line 35
    .line 36
    return-void
.end method

.method public final L(I)V
    .locals 1

    .line 1
    iput p1, p0, LQ0/d;->V:I

    .line 2
    .line 3
    iget v0, p0, LQ0/d;->c0:I

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    iput v0, p0, LQ0/d;->V:I

    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public final M(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LQ0/d;->p0:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aput p1, v0, v1

    .line 5
    .line 6
    return-void
.end method

.method public final N(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LQ0/d;->p0:[I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aput p1, v0, v1

    .line 5
    .line 6
    return-void
.end method

.method public final O(I)V
    .locals 1

    .line 1
    iput p1, p0, LQ0/d;->U:I

    .line 2
    .line 3
    iget v0, p0, LQ0/d;->b0:I

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    iput v0, p0, LQ0/d;->U:I

    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public P(ZZ)V
    .locals 7

    .line 1
    iget-object v0, p0, LQ0/d;->d:LR0/k;

    .line 2
    .line 3
    iget-boolean v1, v0, LR0/o;->g:Z

    .line 4
    .line 5
    and-int/2addr p1, v1

    .line 6
    iget-object v1, p0, LQ0/d;->e:LR0/m;

    .line 7
    .line 8
    iget-boolean v2, v1, LR0/o;->g:Z

    .line 9
    .line 10
    and-int/2addr p2, v2

    .line 11
    iget-object v2, v0, LR0/o;->h:LR0/f;

    .line 12
    .line 13
    iget v2, v2, LR0/f;->g:I

    .line 14
    .line 15
    iget-object v3, v1, LR0/o;->h:LR0/f;

    .line 16
    .line 17
    iget v3, v3, LR0/f;->g:I

    .line 18
    .line 19
    iget-object v0, v0, LR0/o;->i:LR0/f;

    .line 20
    .line 21
    iget v0, v0, LR0/f;->g:I

    .line 22
    .line 23
    iget-object v1, v1, LR0/o;->i:LR0/f;

    .line 24
    .line 25
    iget v1, v1, LR0/f;->g:I

    .line 26
    .line 27
    sub-int v4, v0, v2

    .line 28
    .line 29
    sub-int v5, v1, v3

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    if-ltz v4, :cond_0

    .line 33
    .line 34
    if-ltz v5, :cond_0

    .line 35
    .line 36
    const/high16 v4, -0x80000000

    .line 37
    .line 38
    if-eq v2, v4, :cond_0

    .line 39
    .line 40
    const v5, 0x7fffffff

    .line 41
    .line 42
    .line 43
    if-eq v2, v5, :cond_0

    .line 44
    .line 45
    if-eq v3, v4, :cond_0

    .line 46
    .line 47
    if-eq v3, v5, :cond_0

    .line 48
    .line 49
    if-eq v0, v4, :cond_0

    .line 50
    .line 51
    if-eq v0, v5, :cond_0

    .line 52
    .line 53
    if-eq v1, v4, :cond_0

    .line 54
    .line 55
    if-ne v1, v5, :cond_1

    .line 56
    .line 57
    :cond_0
    move v0, v6

    .line 58
    move v1, v0

    .line 59
    move v2, v1

    .line 60
    move v3, v2

    .line 61
    :cond_1
    sub-int/2addr v0, v2

    .line 62
    sub-int/2addr v1, v3

    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    iput v2, p0, LQ0/d;->Y:I

    .line 66
    .line 67
    :cond_2
    if-eqz p2, :cond_3

    .line 68
    .line 69
    iput v3, p0, LQ0/d;->Z:I

    .line 70
    .line 71
    :cond_3
    iget v2, p0, LQ0/d;->g0:I

    .line 72
    .line 73
    const/16 v3, 0x8

    .line 74
    .line 75
    if-ne v2, v3, :cond_4

    .line 76
    .line 77
    iput v6, p0, LQ0/d;->U:I

    .line 78
    .line 79
    iput v6, p0, LQ0/d;->V:I

    .line 80
    .line 81
    return-void

    .line 82
    :cond_4
    iget-object v2, p0, LQ0/d;->p0:[I

    .line 83
    .line 84
    const/4 v3, 0x1

    .line 85
    if-eqz p1, :cond_6

    .line 86
    .line 87
    aget p1, v2, v6

    .line 88
    .line 89
    if-ne p1, v3, :cond_5

    .line 90
    .line 91
    iget p1, p0, LQ0/d;->U:I

    .line 92
    .line 93
    if-ge v0, p1, :cond_5

    .line 94
    .line 95
    move v0, p1

    .line 96
    :cond_5
    iput v0, p0, LQ0/d;->U:I

    .line 97
    .line 98
    iget p1, p0, LQ0/d;->b0:I

    .line 99
    .line 100
    if-ge v0, p1, :cond_6

    .line 101
    .line 102
    iput p1, p0, LQ0/d;->U:I

    .line 103
    .line 104
    :cond_6
    if-eqz p2, :cond_8

    .line 105
    .line 106
    aget p1, v2, v3

    .line 107
    .line 108
    if-ne p1, v3, :cond_7

    .line 109
    .line 110
    iget p1, p0, LQ0/d;->V:I

    .line 111
    .line 112
    if-ge v1, p1, :cond_7

    .line 113
    .line 114
    move v1, p1

    .line 115
    :cond_7
    iput v1, p0, LQ0/d;->V:I

    .line 116
    .line 117
    iget p1, p0, LQ0/d;->c0:I

    .line 118
    .line 119
    if-ge v1, p1, :cond_8

    .line 120
    .line 121
    iput p1, p0, LQ0/d;->V:I

    .line 122
    .line 123
    :cond_8
    return-void
.end method

.method public Q(LO0/c;Z)V
    .locals 6

    .line 1
    iget-object v0, p0, LQ0/d;->I:LQ0/c;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, LO0/c;->n(Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iget-object v0, p0, LQ0/d;->J:LQ0/c;

    .line 11
    .line 12
    invoke-static {v0}, LO0/c;->n(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p0, LQ0/d;->K:LQ0/c;

    .line 17
    .line 18
    invoke-static {v1}, LO0/c;->n(Ljava/lang/Object;)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget-object v2, p0, LQ0/d;->L:LQ0/c;

    .line 23
    .line 24
    invoke-static {v2}, LO0/c;->n(Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    iget-object v3, p0, LQ0/d;->d:LR0/k;

    .line 31
    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    iget-object v4, v3, LR0/o;->h:LR0/f;

    .line 35
    .line 36
    iget-boolean v5, v4, LR0/f;->j:Z

    .line 37
    .line 38
    if-eqz v5, :cond_0

    .line 39
    .line 40
    iget-object v3, v3, LR0/o;->i:LR0/f;

    .line 41
    .line 42
    iget-boolean v5, v3, LR0/f;->j:Z

    .line 43
    .line 44
    if-eqz v5, :cond_0

    .line 45
    .line 46
    iget p1, v4, LR0/f;->g:I

    .line 47
    .line 48
    iget v1, v3, LR0/f;->g:I

    .line 49
    .line 50
    :cond_0
    if-eqz p2, :cond_1

    .line 51
    .line 52
    iget-object p2, p0, LQ0/d;->e:LR0/m;

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    iget-object v3, p2, LR0/o;->h:LR0/f;

    .line 57
    .line 58
    iget-boolean v4, v3, LR0/f;->j:Z

    .line 59
    .line 60
    if-eqz v4, :cond_1

    .line 61
    .line 62
    iget-object p2, p2, LR0/o;->i:LR0/f;

    .line 63
    .line 64
    iget-boolean v4, p2, LR0/f;->j:Z

    .line 65
    .line 66
    if-eqz v4, :cond_1

    .line 67
    .line 68
    iget v0, v3, LR0/f;->g:I

    .line 69
    .line 70
    iget v2, p2, LR0/f;->g:I

    .line 71
    .line 72
    :cond_1
    sub-int p2, v1, p1

    .line 73
    .line 74
    sub-int v3, v2, v0

    .line 75
    .line 76
    const/4 v4, 0x0

    .line 77
    if-ltz p2, :cond_2

    .line 78
    .line 79
    if-ltz v3, :cond_2

    .line 80
    .line 81
    const/high16 p2, -0x80000000

    .line 82
    .line 83
    if-eq p1, p2, :cond_2

    .line 84
    .line 85
    const v3, 0x7fffffff

    .line 86
    .line 87
    .line 88
    if-eq p1, v3, :cond_2

    .line 89
    .line 90
    if-eq v0, p2, :cond_2

    .line 91
    .line 92
    if-eq v0, v3, :cond_2

    .line 93
    .line 94
    if-eq v1, p2, :cond_2

    .line 95
    .line 96
    if-eq v1, v3, :cond_2

    .line 97
    .line 98
    if-eq v2, p2, :cond_2

    .line 99
    .line 100
    if-ne v2, v3, :cond_3

    .line 101
    .line 102
    :cond_2
    move p1, v4

    .line 103
    move v0, p1

    .line 104
    move v1, v0

    .line 105
    move v2, v1

    .line 106
    :cond_3
    sub-int/2addr v1, p1

    .line 107
    sub-int/2addr v2, v0

    .line 108
    iput p1, p0, LQ0/d;->Y:I

    .line 109
    .line 110
    iput v0, p0, LQ0/d;->Z:I

    .line 111
    .line 112
    iget p1, p0, LQ0/d;->g0:I

    .line 113
    .line 114
    const/16 p2, 0x8

    .line 115
    .line 116
    if-ne p1, p2, :cond_4

    .line 117
    .line 118
    iput v4, p0, LQ0/d;->U:I

    .line 119
    .line 120
    iput v4, p0, LQ0/d;->V:I

    .line 121
    .line 122
    return-void

    .line 123
    :cond_4
    iget-object p1, p0, LQ0/d;->p0:[I

    .line 124
    .line 125
    aget p2, p1, v4

    .line 126
    .line 127
    const/4 v0, 0x1

    .line 128
    if-ne p2, v0, :cond_5

    .line 129
    .line 130
    iget v3, p0, LQ0/d;->U:I

    .line 131
    .line 132
    if-ge v1, v3, :cond_5

    .line 133
    .line 134
    move v1, v3

    .line 135
    :cond_5
    aget v3, p1, v0

    .line 136
    .line 137
    if-ne v3, v0, :cond_6

    .line 138
    .line 139
    iget v3, p0, LQ0/d;->V:I

    .line 140
    .line 141
    if-ge v2, v3, :cond_6

    .line 142
    .line 143
    move v2, v3

    .line 144
    :cond_6
    iput v1, p0, LQ0/d;->U:I

    .line 145
    .line 146
    iput v2, p0, LQ0/d;->V:I

    .line 147
    .line 148
    iget v3, p0, LQ0/d;->c0:I

    .line 149
    .line 150
    if-ge v2, v3, :cond_7

    .line 151
    .line 152
    iput v3, p0, LQ0/d;->V:I

    .line 153
    .line 154
    :cond_7
    iget v3, p0, LQ0/d;->b0:I

    .line 155
    .line 156
    if-ge v1, v3, :cond_8

    .line 157
    .line 158
    iput v3, p0, LQ0/d;->U:I

    .line 159
    .line 160
    :cond_8
    iget v3, p0, LQ0/d;->v:I

    .line 161
    .line 162
    const/4 v4, 0x3

    .line 163
    if-lez v3, :cond_9

    .line 164
    .line 165
    if-ne p2, v4, :cond_9

    .line 166
    .line 167
    iget p2, p0, LQ0/d;->U:I

    .line 168
    .line 169
    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    .line 170
    .line 171
    .line 172
    move-result p2

    .line 173
    iput p2, p0, LQ0/d;->U:I

    .line 174
    .line 175
    :cond_9
    iget p2, p0, LQ0/d;->y:I

    .line 176
    .line 177
    if-lez p2, :cond_a

    .line 178
    .line 179
    aget p1, p1, v0

    .line 180
    .line 181
    if-ne p1, v4, :cond_a

    .line 182
    .line 183
    iget p1, p0, LQ0/d;->V:I

    .line 184
    .line 185
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    iput p1, p0, LQ0/d;->V:I

    .line 190
    .line 191
    :cond_a
    iget p1, p0, LQ0/d;->U:I

    .line 192
    .line 193
    if-eq v1, p1, :cond_b

    .line 194
    .line 195
    iput p1, p0, LQ0/d;->h:I

    .line 196
    .line 197
    :cond_b
    iget p1, p0, LQ0/d;->V:I

    .line 198
    .line 199
    if-eq v2, p1, :cond_c

    .line 200
    .line 201
    iput p1, p0, LQ0/d;->i:I

    .line 202
    .line 203
    :cond_c
    return-void
.end method

.method public final a(LQ0/e;LO0/c;Ljava/util/HashSet;IZ)V
    .locals 7

    .line 1
    if-eqz p5, :cond_1

    .line 2
    .line 3
    invoke-virtual {p3, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_5

    .line 10
    .line 11
    :cond_0
    invoke-static {p1, p2, p0}, LQ0/j;->b(LQ0/e;LO0/c;LQ0/d;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p3, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    const/16 v0, 0x40

    .line 18
    .line 19
    invoke-virtual {p1, v0}, LQ0/e;->W(I)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p0, p2, v0}, LQ0/d;->b(LO0/c;Z)V

    .line 24
    .line 25
    .line 26
    :cond_1
    if-nez p4, :cond_3

    .line 27
    .line 28
    iget-object v0, p0, LQ0/d;->I:LQ0/c;

    .line 29
    .line 30
    iget-object v0, v0, LQ0/c;->a:Ljava/util/HashSet;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, LQ0/c;

    .line 49
    .line 50
    iget-object v1, v1, LQ0/c;->d:LQ0/d;

    .line 51
    .line 52
    const/4 v6, 0x1

    .line 53
    move-object v2, p1

    .line 54
    move-object v3, p2

    .line 55
    move-object v4, p3

    .line 56
    move v5, p4

    .line 57
    invoke-virtual/range {v1 .. v6}, LQ0/d;->a(LQ0/e;LO0/c;Ljava/util/HashSet;IZ)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    iget-object v0, p0, LQ0/d;->K:LQ0/c;

    .line 62
    .line 63
    iget-object v0, v0, LQ0/c;->a:Ljava/util/HashSet;

    .line 64
    .line 65
    if-eqz v0, :cond_6

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_6

    .line 76
    .line 77
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, LQ0/c;

    .line 82
    .line 83
    iget-object v1, v1, LQ0/c;->d:LQ0/d;

    .line 84
    .line 85
    const/4 v6, 0x1

    .line 86
    move-object v2, p1

    .line 87
    move-object v3, p2

    .line 88
    move-object v4, p3

    .line 89
    move v5, p4

    .line 90
    invoke-virtual/range {v1 .. v6}, LQ0/d;->a(LQ0/e;LO0/c;Ljava/util/HashSet;IZ)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    iget-object v0, p0, LQ0/d;->J:LQ0/c;

    .line 95
    .line 96
    iget-object v0, v0, LQ0/c;->a:Ljava/util/HashSet;

    .line 97
    .line 98
    if-eqz v0, :cond_4

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_4

    .line 109
    .line 110
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    check-cast v1, LQ0/c;

    .line 115
    .line 116
    iget-object v1, v1, LQ0/c;->d:LQ0/d;

    .line 117
    .line 118
    const/4 v6, 0x1

    .line 119
    move-object v2, p1

    .line 120
    move-object v3, p2

    .line 121
    move-object v4, p3

    .line 122
    move v5, p4

    .line 123
    invoke-virtual/range {v1 .. v6}, LQ0/d;->a(LQ0/e;LO0/c;Ljava/util/HashSet;IZ)V

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_4
    iget-object v0, p0, LQ0/d;->L:LQ0/c;

    .line 128
    .line 129
    iget-object v0, v0, LQ0/c;->a:Ljava/util/HashSet;

    .line 130
    .line 131
    if-eqz v0, :cond_5

    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_5

    .line 142
    .line 143
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    check-cast v1, LQ0/c;

    .line 148
    .line 149
    iget-object v1, v1, LQ0/c;->d:LQ0/d;

    .line 150
    .line 151
    const/4 v6, 0x1

    .line 152
    move-object v2, p1

    .line 153
    move-object v3, p2

    .line 154
    move-object v4, p3

    .line 155
    move v5, p4

    .line 156
    invoke-virtual/range {v1 .. v6}, LQ0/d;->a(LQ0/e;LO0/c;Ljava/util/HashSet;IZ)V

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_5
    iget-object v0, p0, LQ0/d;->M:LQ0/c;

    .line 161
    .line 162
    iget-object v0, v0, LQ0/c;->a:Ljava/util/HashSet;

    .line 163
    .line 164
    if-eqz v0, :cond_6

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-eqz v1, :cond_6

    .line 175
    .line 176
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    check-cast v1, LQ0/c;

    .line 181
    .line 182
    iget-object v1, v1, LQ0/c;->d:LQ0/d;

    .line 183
    .line 184
    const/4 v6, 0x1

    .line 185
    move-object v2, p1

    .line 186
    move-object v3, p2

    .line 187
    move-object v4, p3

    .line 188
    move v5, p4

    .line 189
    :try_start_0
    invoke-virtual/range {v1 .. v6}, LQ0/d;->a(LQ0/e;LO0/c;Ljava/util/HashSet;IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 190
    .line 191
    .line 192
    goto :goto_4

    .line 193
    :catchall_0
    move-exception v0

    .line 194
    throw v0

    .line 195
    :cond_6
    :goto_5
    return-void
.end method

.method public b(LO0/c;Z)V
    .locals 59

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, LQ0/d;->I:LQ0/c;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    iget-object v4, v0, LQ0/d;->K:LQ0/c;

    .line 12
    .line 13
    invoke-virtual {v1, v4}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    iget-object v6, v0, LQ0/d;->J:LQ0/c;

    .line 18
    .line 19
    invoke-virtual {v1, v6}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    iget-object v8, v0, LQ0/d;->L:LQ0/c;

    .line 24
    .line 25
    invoke-virtual {v1, v8}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 26
    .line 27
    .line 28
    move-result-object v9

    .line 29
    iget-object v10, v0, LQ0/d;->M:LQ0/c;

    .line 30
    .line 31
    invoke-virtual {v1, v10}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 32
    .line 33
    .line 34
    move-result-object v11

    .line 35
    iget-object v12, v0, LQ0/d;->T:LQ0/d;

    .line 36
    .line 37
    const/4 v13, 0x2

    .line 38
    const/4 v15, 0x1

    .line 39
    if-eqz v12, :cond_5

    .line 40
    .line 41
    iget-object v12, v12, LQ0/d;->p0:[I

    .line 42
    .line 43
    const/16 v17, 0x0

    .line 44
    .line 45
    aget v14, v12, v17

    .line 46
    .line 47
    if-ne v14, v13, :cond_0

    .line 48
    .line 49
    move v14, v15

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move/from16 v14, v17

    .line 52
    .line 53
    :goto_0
    aget v12, v12, v15

    .line 54
    .line 55
    if-ne v12, v13, :cond_1

    .line 56
    .line 57
    move v12, v15

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    move/from16 v12, v17

    .line 60
    .line 61
    :goto_1
    iget v13, v0, LQ0/d;->q:I

    .line 62
    .line 63
    if-eq v13, v15, :cond_4

    .line 64
    .line 65
    move/from16 v19, v15

    .line 66
    .line 67
    const/4 v15, 0x2

    .line 68
    if-eq v13, v15, :cond_3

    .line 69
    .line 70
    const/4 v15, 0x3

    .line 71
    if-eq v13, v15, :cond_2

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_2
    :goto_2
    move/from16 v12, v17

    .line 75
    .line 76
    move v14, v12

    .line 77
    goto :goto_3

    .line 78
    :cond_3
    move/from16 v14, v17

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_4
    move/from16 v19, v15

    .line 82
    .line 83
    move/from16 v12, v17

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_5
    move/from16 v19, v15

    .line 87
    .line 88
    const/16 v17, 0x0

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :goto_3
    iget v13, v0, LQ0/d;->g0:I

    .line 92
    .line 93
    iget-object v15, v0, LQ0/d;->S:[Z

    .line 94
    .line 95
    move/from16 v20, v12

    .line 96
    .line 97
    const/16 v12, 0x8

    .line 98
    .line 99
    if-ne v13, v12, :cond_9

    .line 100
    .line 101
    iget-object v13, v0, LQ0/d;->R:Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 104
    .line 105
    .line 106
    move-result v12

    .line 107
    move/from16 v22, v14

    .line 108
    .line 109
    move/from16 v14, v17

    .line 110
    .line 111
    :goto_4
    if-ge v14, v12, :cond_8

    .line 112
    .line 113
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v23

    .line 117
    move/from16 v24, v12

    .line 118
    .line 119
    move-object/from16 v12, v23

    .line 120
    .line 121
    check-cast v12, LQ0/c;

    .line 122
    .line 123
    iget-object v12, v12, LQ0/c;->a:Ljava/util/HashSet;

    .line 124
    .line 125
    if-nez v12, :cond_6

    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_6
    invoke-virtual {v12}, Ljava/util/HashSet;->size()I

    .line 129
    .line 130
    .line 131
    move-result v12

    .line 132
    if-lez v12, :cond_7

    .line 133
    .line 134
    goto :goto_6

    .line 135
    :cond_7
    :goto_5
    add-int/lit8 v14, v14, 0x1

    .line 136
    .line 137
    move/from16 v12, v24

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_8
    aget-boolean v12, v15, v17

    .line 141
    .line 142
    if-nez v12, :cond_a

    .line 143
    .line 144
    aget-boolean v12, v15, v19

    .line 145
    .line 146
    if-nez v12, :cond_a

    .line 147
    .line 148
    return-void

    .line 149
    :cond_9
    move/from16 v22, v14

    .line 150
    .line 151
    :cond_a
    :goto_6
    iget-boolean v12, v0, LQ0/d;->k:Z

    .line 152
    .line 153
    if-nez v12, :cond_b

    .line 154
    .line 155
    iget-boolean v13, v0, LQ0/d;->l:Z

    .line 156
    .line 157
    if-eqz v13, :cond_16

    .line 158
    .line 159
    :cond_b
    if-eqz v12, :cond_f

    .line 160
    .line 161
    iget v12, v0, LQ0/d;->Y:I

    .line 162
    .line 163
    invoke-virtual {v1, v3, v12}, LO0/c;->d(LO0/f;I)V

    .line 164
    .line 165
    .line 166
    iget v12, v0, LQ0/d;->Y:I

    .line 167
    .line 168
    iget v13, v0, LQ0/d;->U:I

    .line 169
    .line 170
    add-int/2addr v12, v13

    .line 171
    invoke-virtual {v1, v5, v12}, LO0/c;->d(LO0/f;I)V

    .line 172
    .line 173
    .line 174
    if-eqz v22, :cond_f

    .line 175
    .line 176
    iget-object v12, v0, LQ0/d;->T:LQ0/d;

    .line 177
    .line 178
    if-eqz v12, :cond_f

    .line 179
    .line 180
    check-cast v12, LQ0/e;

    .line 181
    .line 182
    iget-object v13, v12, LQ0/e;->H0:Ljava/lang/ref/WeakReference;

    .line 183
    .line 184
    if-eqz v13, :cond_c

    .line 185
    .line 186
    invoke-virtual {v13}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v13

    .line 190
    if-eqz v13, :cond_c

    .line 191
    .line 192
    invoke-virtual {v2}, LQ0/c;->d()I

    .line 193
    .line 194
    .line 195
    move-result v13

    .line 196
    iget-object v14, v12, LQ0/e;->H0:Ljava/lang/ref/WeakReference;

    .line 197
    .line 198
    invoke-virtual {v14}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v14

    .line 202
    check-cast v14, LQ0/c;

    .line 203
    .line 204
    invoke-virtual {v14}, LQ0/c;->d()I

    .line 205
    .line 206
    .line 207
    move-result v14

    .line 208
    if-le v13, v14, :cond_d

    .line 209
    .line 210
    :cond_c
    new-instance v13, Ljava/lang/ref/WeakReference;

    .line 211
    .line 212
    invoke-direct {v13, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    iput-object v13, v12, LQ0/e;->H0:Ljava/lang/ref/WeakReference;

    .line 216
    .line 217
    :cond_d
    iget-object v13, v12, LQ0/e;->J0:Ljava/lang/ref/WeakReference;

    .line 218
    .line 219
    if-eqz v13, :cond_e

    .line 220
    .line 221
    invoke-virtual {v13}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v13

    .line 225
    if-eqz v13, :cond_e

    .line 226
    .line 227
    invoke-virtual {v4}, LQ0/c;->d()I

    .line 228
    .line 229
    .line 230
    move-result v13

    .line 231
    iget-object v14, v12, LQ0/e;->J0:Ljava/lang/ref/WeakReference;

    .line 232
    .line 233
    invoke-virtual {v14}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v14

    .line 237
    check-cast v14, LQ0/c;

    .line 238
    .line 239
    invoke-virtual {v14}, LQ0/c;->d()I

    .line 240
    .line 241
    .line 242
    move-result v14

    .line 243
    if-le v13, v14, :cond_f

    .line 244
    .line 245
    :cond_e
    new-instance v13, Ljava/lang/ref/WeakReference;

    .line 246
    .line 247
    invoke-direct {v13, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    iput-object v13, v12, LQ0/e;->J0:Ljava/lang/ref/WeakReference;

    .line 251
    .line 252
    :cond_f
    iget-boolean v12, v0, LQ0/d;->l:Z

    .line 253
    .line 254
    if-eqz v12, :cond_15

    .line 255
    .line 256
    iget v12, v0, LQ0/d;->Z:I

    .line 257
    .line 258
    invoke-virtual {v1, v7, v12}, LO0/c;->d(LO0/f;I)V

    .line 259
    .line 260
    .line 261
    iget v12, v0, LQ0/d;->Z:I

    .line 262
    .line 263
    iget v13, v0, LQ0/d;->V:I

    .line 264
    .line 265
    add-int/2addr v12, v13

    .line 266
    invoke-virtual {v1, v9, v12}, LO0/c;->d(LO0/f;I)V

    .line 267
    .line 268
    .line 269
    iget-object v12, v10, LQ0/c;->a:Ljava/util/HashSet;

    .line 270
    .line 271
    if-nez v12, :cond_10

    .line 272
    .line 273
    goto :goto_7

    .line 274
    :cond_10
    invoke-virtual {v12}, Ljava/util/HashSet;->size()I

    .line 275
    .line 276
    .line 277
    move-result v12

    .line 278
    if-lez v12, :cond_11

    .line 279
    .line 280
    iget v12, v0, LQ0/d;->Z:I

    .line 281
    .line 282
    iget v13, v0, LQ0/d;->a0:I

    .line 283
    .line 284
    add-int/2addr v12, v13

    .line 285
    invoke-virtual {v1, v11, v12}, LO0/c;->d(LO0/f;I)V

    .line 286
    .line 287
    .line 288
    :cond_11
    :goto_7
    if-eqz v20, :cond_15

    .line 289
    .line 290
    iget-object v12, v0, LQ0/d;->T:LQ0/d;

    .line 291
    .line 292
    if-eqz v12, :cond_15

    .line 293
    .line 294
    check-cast v12, LQ0/e;

    .line 295
    .line 296
    iget-object v13, v12, LQ0/e;->G0:Ljava/lang/ref/WeakReference;

    .line 297
    .line 298
    if-eqz v13, :cond_12

    .line 299
    .line 300
    invoke-virtual {v13}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v13

    .line 304
    if-eqz v13, :cond_12

    .line 305
    .line 306
    invoke-virtual {v6}, LQ0/c;->d()I

    .line 307
    .line 308
    .line 309
    move-result v13

    .line 310
    iget-object v14, v12, LQ0/e;->G0:Ljava/lang/ref/WeakReference;

    .line 311
    .line 312
    invoke-virtual {v14}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v14

    .line 316
    check-cast v14, LQ0/c;

    .line 317
    .line 318
    invoke-virtual {v14}, LQ0/c;->d()I

    .line 319
    .line 320
    .line 321
    move-result v14

    .line 322
    if-le v13, v14, :cond_13

    .line 323
    .line 324
    :cond_12
    new-instance v13, Ljava/lang/ref/WeakReference;

    .line 325
    .line 326
    invoke-direct {v13, v6}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    iput-object v13, v12, LQ0/e;->G0:Ljava/lang/ref/WeakReference;

    .line 330
    .line 331
    :cond_13
    iget-object v13, v12, LQ0/e;->I0:Ljava/lang/ref/WeakReference;

    .line 332
    .line 333
    if-eqz v13, :cond_14

    .line 334
    .line 335
    invoke-virtual {v13}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v13

    .line 339
    if-eqz v13, :cond_14

    .line 340
    .line 341
    invoke-virtual {v8}, LQ0/c;->d()I

    .line 342
    .line 343
    .line 344
    move-result v13

    .line 345
    iget-object v14, v12, LQ0/e;->I0:Ljava/lang/ref/WeakReference;

    .line 346
    .line 347
    invoke-virtual {v14}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v14

    .line 351
    check-cast v14, LQ0/c;

    .line 352
    .line 353
    invoke-virtual {v14}, LQ0/c;->d()I

    .line 354
    .line 355
    .line 356
    move-result v14

    .line 357
    if-le v13, v14, :cond_15

    .line 358
    .line 359
    :cond_14
    new-instance v13, Ljava/lang/ref/WeakReference;

    .line 360
    .line 361
    invoke-direct {v13, v8}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    iput-object v13, v12, LQ0/e;->I0:Ljava/lang/ref/WeakReference;

    .line 365
    .line 366
    :cond_15
    iget-boolean v12, v0, LQ0/d;->k:Z

    .line 367
    .line 368
    if-eqz v12, :cond_16

    .line 369
    .line 370
    iget-boolean v12, v0, LQ0/d;->l:Z

    .line 371
    .line 372
    if-eqz v12, :cond_16

    .line 373
    .line 374
    move/from16 v12, v17

    .line 375
    .line 376
    iput-boolean v12, v0, LQ0/d;->k:Z

    .line 377
    .line 378
    iput-boolean v12, v0, LQ0/d;->l:Z

    .line 379
    .line 380
    return-void

    .line 381
    :cond_16
    iget-object v12, v0, LQ0/d;->f:[Z

    .line 382
    .line 383
    if-eqz p2, :cond_1a

    .line 384
    .line 385
    iget-object v13, v0, LQ0/d;->d:LR0/k;

    .line 386
    .line 387
    if-eqz v13, :cond_1a

    .line 388
    .line 389
    iget-object v14, v0, LQ0/d;->e:LR0/m;

    .line 390
    .line 391
    if-eqz v14, :cond_1a

    .line 392
    .line 393
    move-object/from16 v23, v10

    .line 394
    .line 395
    iget-object v10, v13, LR0/o;->h:LR0/f;

    .line 396
    .line 397
    move-object/from16 v24, v12

    .line 398
    .line 399
    iget-boolean v12, v10, LR0/f;->j:Z

    .line 400
    .line 401
    if-eqz v12, :cond_19

    .line 402
    .line 403
    iget-object v12, v13, LR0/o;->i:LR0/f;

    .line 404
    .line 405
    iget-boolean v12, v12, LR0/f;->j:Z

    .line 406
    .line 407
    if-eqz v12, :cond_19

    .line 408
    .line 409
    iget-object v12, v14, LR0/o;->h:LR0/f;

    .line 410
    .line 411
    iget-boolean v12, v12, LR0/f;->j:Z

    .line 412
    .line 413
    if-eqz v12, :cond_19

    .line 414
    .line 415
    iget-object v12, v14, LR0/o;->i:LR0/f;

    .line 416
    .line 417
    iget-boolean v12, v12, LR0/f;->j:Z

    .line 418
    .line 419
    if-eqz v12, :cond_19

    .line 420
    .line 421
    iget v2, v10, LR0/f;->g:I

    .line 422
    .line 423
    invoke-virtual {v1, v3, v2}, LO0/c;->d(LO0/f;I)V

    .line 424
    .line 425
    .line 426
    iget-object v2, v0, LQ0/d;->d:LR0/k;

    .line 427
    .line 428
    iget-object v2, v2, LR0/o;->i:LR0/f;

    .line 429
    .line 430
    iget v2, v2, LR0/f;->g:I

    .line 431
    .line 432
    invoke-virtual {v1, v5, v2}, LO0/c;->d(LO0/f;I)V

    .line 433
    .line 434
    .line 435
    iget-object v2, v0, LQ0/d;->e:LR0/m;

    .line 436
    .line 437
    iget-object v2, v2, LR0/o;->h:LR0/f;

    .line 438
    .line 439
    iget v2, v2, LR0/f;->g:I

    .line 440
    .line 441
    invoke-virtual {v1, v7, v2}, LO0/c;->d(LO0/f;I)V

    .line 442
    .line 443
    .line 444
    iget-object v2, v0, LQ0/d;->e:LR0/m;

    .line 445
    .line 446
    iget-object v2, v2, LR0/o;->i:LR0/f;

    .line 447
    .line 448
    iget v2, v2, LR0/f;->g:I

    .line 449
    .line 450
    invoke-virtual {v1, v9, v2}, LO0/c;->d(LO0/f;I)V

    .line 451
    .line 452
    .line 453
    iget-object v2, v0, LQ0/d;->e:LR0/m;

    .line 454
    .line 455
    iget-object v2, v2, LR0/m;->k:LR0/f;

    .line 456
    .line 457
    iget v2, v2, LR0/f;->g:I

    .line 458
    .line 459
    invoke-virtual {v1, v11, v2}, LO0/c;->d(LO0/f;I)V

    .line 460
    .line 461
    .line 462
    iget-object v2, v0, LQ0/d;->T:LQ0/d;

    .line 463
    .line 464
    if-eqz v2, :cond_18

    .line 465
    .line 466
    if-eqz v22, :cond_17

    .line 467
    .line 468
    const/4 v12, 0x0

    .line 469
    aget-boolean v2, v24, v12

    .line 470
    .line 471
    if-eqz v2, :cond_17

    .line 472
    .line 473
    invoke-virtual {v0}, LQ0/d;->x()Z

    .line 474
    .line 475
    .line 476
    move-result v2

    .line 477
    if-nez v2, :cond_17

    .line 478
    .line 479
    iget-object v2, v0, LQ0/d;->T:LQ0/d;

    .line 480
    .line 481
    iget-object v2, v2, LQ0/d;->K:LQ0/c;

    .line 482
    .line 483
    invoke-virtual {v1, v2}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 484
    .line 485
    .line 486
    move-result-object v2

    .line 487
    const/16 v3, 0x8

    .line 488
    .line 489
    invoke-virtual {v1, v2, v5, v12, v3}, LO0/c;->f(LO0/f;LO0/f;II)V

    .line 490
    .line 491
    .line 492
    :cond_17
    if-eqz v20, :cond_18

    .line 493
    .line 494
    aget-boolean v2, v24, v19

    .line 495
    .line 496
    if-eqz v2, :cond_18

    .line 497
    .line 498
    invoke-virtual {v0}, LQ0/d;->y()Z

    .line 499
    .line 500
    .line 501
    move-result v2

    .line 502
    if-nez v2, :cond_18

    .line 503
    .line 504
    iget-object v2, v0, LQ0/d;->T:LQ0/d;

    .line 505
    .line 506
    iget-object v2, v2, LQ0/d;->L:LQ0/c;

    .line 507
    .line 508
    invoke-virtual {v1, v2}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    const/16 v3, 0x8

    .line 513
    .line 514
    const/4 v12, 0x0

    .line 515
    invoke-virtual {v1, v2, v9, v12, v3}, LO0/c;->f(LO0/f;LO0/f;II)V

    .line 516
    .line 517
    .line 518
    goto :goto_8

    .line 519
    :cond_18
    const/4 v12, 0x0

    .line 520
    :goto_8
    iput-boolean v12, v0, LQ0/d;->k:Z

    .line 521
    .line 522
    iput-boolean v12, v0, LQ0/d;->l:Z

    .line 523
    .line 524
    return-void

    .line 525
    :cond_19
    :goto_9
    const/4 v12, 0x0

    .line 526
    goto :goto_a

    .line 527
    :cond_1a
    move-object/from16 v23, v10

    .line 528
    .line 529
    move-object/from16 v24, v12

    .line 530
    .line 531
    goto :goto_9

    .line 532
    :goto_a
    iget-object v10, v0, LQ0/d;->T:LQ0/d;

    .line 533
    .line 534
    if-eqz v10, :cond_1f

    .line 535
    .line 536
    invoke-virtual {v0, v12}, LQ0/d;->w(I)Z

    .line 537
    .line 538
    .line 539
    move-result v10

    .line 540
    if-eqz v10, :cond_1b

    .line 541
    .line 542
    iget-object v10, v0, LQ0/d;->T:LQ0/d;

    .line 543
    .line 544
    check-cast v10, LQ0/e;

    .line 545
    .line 546
    invoke-virtual {v10, v0, v12}, LQ0/e;->R(LQ0/d;I)V

    .line 547
    .line 548
    .line 549
    move/from16 v10, v19

    .line 550
    .line 551
    move v12, v10

    .line 552
    goto :goto_b

    .line 553
    :cond_1b
    invoke-virtual {v0}, LQ0/d;->x()Z

    .line 554
    .line 555
    .line 556
    move-result v10

    .line 557
    move/from16 v12, v19

    .line 558
    .line 559
    :goto_b
    invoke-virtual {v0, v12}, LQ0/d;->w(I)Z

    .line 560
    .line 561
    .line 562
    move-result v13

    .line 563
    if-eqz v13, :cond_1c

    .line 564
    .line 565
    iget-object v13, v0, LQ0/d;->T:LQ0/d;

    .line 566
    .line 567
    check-cast v13, LQ0/e;

    .line 568
    .line 569
    invoke-virtual {v13, v0, v12}, LQ0/e;->R(LQ0/d;I)V

    .line 570
    .line 571
    .line 572
    const/4 v12, 0x1

    .line 573
    goto :goto_c

    .line 574
    :cond_1c
    invoke-virtual {v0}, LQ0/d;->y()Z

    .line 575
    .line 576
    .line 577
    move-result v12

    .line 578
    :goto_c
    if-nez v10, :cond_1d

    .line 579
    .line 580
    if-eqz v22, :cond_1d

    .line 581
    .line 582
    iget v13, v0, LQ0/d;->g0:I

    .line 583
    .line 584
    const/16 v14, 0x8

    .line 585
    .line 586
    if-eq v13, v14, :cond_1d

    .line 587
    .line 588
    iget-object v13, v2, LQ0/c;->f:LQ0/c;

    .line 589
    .line 590
    if-nez v13, :cond_1d

    .line 591
    .line 592
    iget-object v13, v4, LQ0/c;->f:LQ0/c;

    .line 593
    .line 594
    if-nez v13, :cond_1d

    .line 595
    .line 596
    iget-object v13, v0, LQ0/d;->T:LQ0/d;

    .line 597
    .line 598
    iget-object v13, v13, LQ0/d;->K:LQ0/c;

    .line 599
    .line 600
    invoke-virtual {v1, v13}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 601
    .line 602
    .line 603
    move-result-object v13

    .line 604
    move-object/from16 v25, v2

    .line 605
    .line 606
    const/4 v2, 0x0

    .line 607
    const/4 v14, 0x1

    .line 608
    invoke-virtual {v1, v13, v5, v2, v14}, LO0/c;->f(LO0/f;LO0/f;II)V

    .line 609
    .line 610
    .line 611
    goto :goto_d

    .line 612
    :cond_1d
    move-object/from16 v25, v2

    .line 613
    .line 614
    :goto_d
    if-nez v12, :cond_1e

    .line 615
    .line 616
    if-eqz v20, :cond_1e

    .line 617
    .line 618
    iget v2, v0, LQ0/d;->g0:I

    .line 619
    .line 620
    const/16 v14, 0x8

    .line 621
    .line 622
    if-eq v2, v14, :cond_1e

    .line 623
    .line 624
    iget-object v2, v6, LQ0/c;->f:LQ0/c;

    .line 625
    .line 626
    if-nez v2, :cond_1e

    .line 627
    .line 628
    iget-object v2, v8, LQ0/c;->f:LQ0/c;

    .line 629
    .line 630
    if-nez v2, :cond_1e

    .line 631
    .line 632
    if-nez v23, :cond_1e

    .line 633
    .line 634
    iget-object v2, v0, LQ0/d;->T:LQ0/d;

    .line 635
    .line 636
    iget-object v2, v2, LQ0/d;->L:LQ0/c;

    .line 637
    .line 638
    invoke-virtual {v1, v2}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 639
    .line 640
    .line 641
    move-result-object v2

    .line 642
    const/4 v13, 0x0

    .line 643
    const/4 v14, 0x1

    .line 644
    invoke-virtual {v1, v2, v9, v13, v14}, LO0/c;->f(LO0/f;LO0/f;II)V

    .line 645
    .line 646
    .line 647
    :cond_1e
    move-object v2, v4

    .line 648
    move/from16 v4, v20

    .line 649
    .line 650
    move/from16 v20, v12

    .line 651
    .line 652
    move v12, v10

    .line 653
    goto :goto_e

    .line 654
    :cond_1f
    move-object/from16 v25, v2

    .line 655
    .line 656
    move-object v2, v4

    .line 657
    move/from16 v4, v20

    .line 658
    .line 659
    const/4 v12, 0x0

    .line 660
    const/16 v20, 0x0

    .line 661
    .line 662
    :goto_e
    iget v10, v0, LQ0/d;->U:I

    .line 663
    .line 664
    iget v13, v0, LQ0/d;->b0:I

    .line 665
    .line 666
    if-ge v10, v13, :cond_20

    .line 667
    .line 668
    goto :goto_f

    .line 669
    :cond_20
    move v13, v10

    .line 670
    :goto_f
    iget v14, v0, LQ0/d;->V:I

    .line 671
    .line 672
    move-object/from16 v26, v2

    .line 673
    .line 674
    iget v2, v0, LQ0/d;->c0:I

    .line 675
    .line 676
    if-ge v14, v2, :cond_21

    .line 677
    .line 678
    move/from16 v27, v2

    .line 679
    .line 680
    goto :goto_10

    .line 681
    :cond_21
    move/from16 v27, v14

    .line 682
    .line 683
    :goto_10
    iget-object v2, v0, LQ0/d;->p0:[I

    .line 684
    .line 685
    move-object/from16 v28, v2

    .line 686
    .line 687
    const/16 v17, 0x0

    .line 688
    .line 689
    aget v2, v28, v17

    .line 690
    .line 691
    move/from16 v29, v4

    .line 692
    .line 693
    const/4 v4, 0x3

    .line 694
    if-eq v2, v4, :cond_22

    .line 695
    .line 696
    const/16 v30, 0x1

    .line 697
    .line 698
    :goto_11
    move-object/from16 v31, v6

    .line 699
    .line 700
    const/16 v19, 0x1

    .line 701
    .line 702
    goto :goto_12

    .line 703
    :cond_22
    const/16 v30, 0x0

    .line 704
    .line 705
    goto :goto_11

    .line 706
    :goto_12
    aget v6, v28, v19

    .line 707
    .line 708
    if-eq v6, v4, :cond_23

    .line 709
    .line 710
    const/16 v32, 0x1

    .line 711
    .line 712
    goto :goto_13

    .line 713
    :cond_23
    const/16 v32, 0x0

    .line 714
    .line 715
    :goto_13
    iget v4, v0, LQ0/d;->X:I

    .line 716
    .line 717
    iput v4, v0, LQ0/d;->A:I

    .line 718
    .line 719
    move-object/from16 v33, v7

    .line 720
    .line 721
    iget v7, v0, LQ0/d;->W:F

    .line 722
    .line 723
    iput v7, v0, LQ0/d;->B:F

    .line 724
    .line 725
    move/from16 v34, v7

    .line 726
    .line 727
    iget v7, v0, LQ0/d;->r:I

    .line 728
    .line 729
    move/from16 v35, v7

    .line 730
    .line 731
    iget v7, v0, LQ0/d;->s:I

    .line 732
    .line 733
    const/16 v36, 0x0

    .line 734
    .line 735
    cmpl-float v36, v34, v36

    .line 736
    .line 737
    move/from16 v37, v7

    .line 738
    .line 739
    const/high16 v38, 0x3f800000    # 1.0f

    .line 740
    .line 741
    if-lez v36, :cond_36

    .line 742
    .line 743
    iget v7, v0, LQ0/d;->g0:I

    .line 744
    .line 745
    move-object/from16 v39, v8

    .line 746
    .line 747
    const/16 v8, 0x8

    .line 748
    .line 749
    if-eq v7, v8, :cond_35

    .line 750
    .line 751
    const/4 v7, 0x3

    .line 752
    if-ne v2, v7, :cond_24

    .line 753
    .line 754
    if-nez v35, :cond_24

    .line 755
    .line 756
    move v8, v7

    .line 757
    goto :goto_14

    .line 758
    :cond_24
    move/from16 v8, v35

    .line 759
    .line 760
    :goto_14
    if-ne v6, v7, :cond_25

    .line 761
    .line 762
    if-nez v37, :cond_25

    .line 763
    .line 764
    move-object/from16 v40, v9

    .line 765
    .line 766
    move v9, v7

    .line 767
    goto :goto_15

    .line 768
    :cond_25
    move-object/from16 v40, v9

    .line 769
    .line 770
    move/from16 v9, v37

    .line 771
    .line 772
    :goto_15
    if-ne v2, v7, :cond_30

    .line 773
    .line 774
    if-ne v6, v7, :cond_30

    .line 775
    .line 776
    if-ne v8, v7, :cond_30

    .line 777
    .line 778
    if-ne v9, v7, :cond_30

    .line 779
    .line 780
    const/4 v7, -0x1

    .line 781
    if-ne v4, v7, :cond_27

    .line 782
    .line 783
    if-eqz v30, :cond_26

    .line 784
    .line 785
    if-nez v32, :cond_26

    .line 786
    .line 787
    const/4 v2, 0x0

    .line 788
    iput v2, v0, LQ0/d;->A:I

    .line 789
    .line 790
    goto :goto_16

    .line 791
    :cond_26
    if-nez v30, :cond_27

    .line 792
    .line 793
    if-eqz v32, :cond_27

    .line 794
    .line 795
    const/4 v14, 0x1

    .line 796
    iput v14, v0, LQ0/d;->A:I

    .line 797
    .line 798
    if-ne v4, v7, :cond_27

    .line 799
    .line 800
    div-float v7, v38, v34

    .line 801
    .line 802
    iput v7, v0, LQ0/d;->B:F

    .line 803
    .line 804
    :cond_27
    :goto_16
    iget v2, v0, LQ0/d;->A:I

    .line 805
    .line 806
    if-nez v2, :cond_29

    .line 807
    .line 808
    invoke-virtual/range {v31 .. v31}, LQ0/c;->h()Z

    .line 809
    .line 810
    .line 811
    move-result v2

    .line 812
    if-eqz v2, :cond_28

    .line 813
    .line 814
    invoke-virtual/range {v39 .. v39}, LQ0/c;->h()Z

    .line 815
    .line 816
    .line 817
    move-result v2

    .line 818
    if-nez v2, :cond_29

    .line 819
    .line 820
    :cond_28
    const/4 v14, 0x1

    .line 821
    goto :goto_17

    .line 822
    :cond_29
    const/4 v14, 0x1

    .line 823
    goto :goto_18

    .line 824
    :goto_17
    iput v14, v0, LQ0/d;->A:I

    .line 825
    .line 826
    goto :goto_19

    .line 827
    :goto_18
    iget v2, v0, LQ0/d;->A:I

    .line 828
    .line 829
    if-ne v2, v14, :cond_2b

    .line 830
    .line 831
    invoke-virtual/range {v25 .. v25}, LQ0/c;->h()Z

    .line 832
    .line 833
    .line 834
    move-result v2

    .line 835
    if-eqz v2, :cond_2a

    .line 836
    .line 837
    invoke-virtual/range {v26 .. v26}, LQ0/c;->h()Z

    .line 838
    .line 839
    .line 840
    move-result v2

    .line 841
    if-nez v2, :cond_2b

    .line 842
    .line 843
    :cond_2a
    const/4 v2, 0x0

    .line 844
    iput v2, v0, LQ0/d;->A:I

    .line 845
    .line 846
    :cond_2b
    :goto_19
    iget v2, v0, LQ0/d;->A:I

    .line 847
    .line 848
    const/4 v7, -0x1

    .line 849
    if-ne v2, v7, :cond_2e

    .line 850
    .line 851
    invoke-virtual/range {v31 .. v31}, LQ0/c;->h()Z

    .line 852
    .line 853
    .line 854
    move-result v2

    .line 855
    if-eqz v2, :cond_2c

    .line 856
    .line 857
    invoke-virtual/range {v39 .. v39}, LQ0/c;->h()Z

    .line 858
    .line 859
    .line 860
    move-result v2

    .line 861
    if-eqz v2, :cond_2c

    .line 862
    .line 863
    invoke-virtual/range {v25 .. v25}, LQ0/c;->h()Z

    .line 864
    .line 865
    .line 866
    move-result v2

    .line 867
    if-eqz v2, :cond_2c

    .line 868
    .line 869
    invoke-virtual/range {v26 .. v26}, LQ0/c;->h()Z

    .line 870
    .line 871
    .line 872
    move-result v2

    .line 873
    if-nez v2, :cond_2e

    .line 874
    .line 875
    :cond_2c
    invoke-virtual/range {v31 .. v31}, LQ0/c;->h()Z

    .line 876
    .line 877
    .line 878
    move-result v2

    .line 879
    if-eqz v2, :cond_2d

    .line 880
    .line 881
    invoke-virtual/range {v39 .. v39}, LQ0/c;->h()Z

    .line 882
    .line 883
    .line 884
    move-result v2

    .line 885
    if-eqz v2, :cond_2d

    .line 886
    .line 887
    const/4 v2, 0x0

    .line 888
    iput v2, v0, LQ0/d;->A:I

    .line 889
    .line 890
    goto :goto_1a

    .line 891
    :cond_2d
    invoke-virtual/range {v25 .. v25}, LQ0/c;->h()Z

    .line 892
    .line 893
    .line 894
    move-result v2

    .line 895
    if-eqz v2, :cond_2e

    .line 896
    .line 897
    invoke-virtual/range {v26 .. v26}, LQ0/c;->h()Z

    .line 898
    .line 899
    .line 900
    move-result v2

    .line 901
    if-eqz v2, :cond_2e

    .line 902
    .line 903
    iget v2, v0, LQ0/d;->B:F

    .line 904
    .line 905
    div-float v7, v38, v2

    .line 906
    .line 907
    iput v7, v0, LQ0/d;->B:F

    .line 908
    .line 909
    const/4 v14, 0x1

    .line 910
    iput v14, v0, LQ0/d;->A:I

    .line 911
    .line 912
    :cond_2e
    :goto_1a
    iget v2, v0, LQ0/d;->A:I

    .line 913
    .line 914
    const/4 v7, -0x1

    .line 915
    if-ne v2, v7, :cond_31

    .line 916
    .line 917
    iget v2, v0, LQ0/d;->u:I

    .line 918
    .line 919
    if-lez v2, :cond_2f

    .line 920
    .line 921
    iget v4, v0, LQ0/d;->x:I

    .line 922
    .line 923
    if-nez v4, :cond_2f

    .line 924
    .line 925
    const/4 v4, 0x0

    .line 926
    iput v4, v0, LQ0/d;->A:I

    .line 927
    .line 928
    goto :goto_1c

    .line 929
    :cond_2f
    if-nez v2, :cond_31

    .line 930
    .line 931
    iget v2, v0, LQ0/d;->x:I

    .line 932
    .line 933
    if-lez v2, :cond_31

    .line 934
    .line 935
    iget v2, v0, LQ0/d;->B:F

    .line 936
    .line 937
    div-float v7, v38, v2

    .line 938
    .line 939
    iput v7, v0, LQ0/d;->B:F

    .line 940
    .line 941
    const/4 v14, 0x1

    .line 942
    iput v14, v0, LQ0/d;->A:I

    .line 943
    .line 944
    goto :goto_1c

    .line 945
    :cond_30
    if-ne v2, v7, :cond_32

    .line 946
    .line 947
    if-ne v8, v7, :cond_32

    .line 948
    .line 949
    const/4 v7, 0x0

    .line 950
    iput v7, v0, LQ0/d;->A:I

    .line 951
    .line 952
    int-to-float v2, v14

    .line 953
    mul-float v7, v34, v2

    .line 954
    .line 955
    float-to-int v2, v7

    .line 956
    const/4 v7, 0x3

    .line 957
    move v13, v2

    .line 958
    if-eq v6, v7, :cond_31

    .line 959
    .line 960
    move-object/from16 v2, v23

    .line 961
    .line 962
    move/from16 v30, v27

    .line 963
    .line 964
    const/4 v7, 0x4

    .line 965
    const/16 v31, 0x0

    .line 966
    .line 967
    :goto_1b
    move/from16 v23, v9

    .line 968
    .line 969
    goto :goto_21

    .line 970
    :cond_31
    :goto_1c
    move v7, v8

    .line 971
    move-object/from16 v2, v23

    .line 972
    .line 973
    move/from16 v30, v27

    .line 974
    .line 975
    :goto_1d
    const/16 v31, 0x1

    .line 976
    .line 977
    goto :goto_1b

    .line 978
    :cond_32
    if-ne v6, v7, :cond_31

    .line 979
    .line 980
    if-ne v9, v7, :cond_31

    .line 981
    .line 982
    const/4 v14, 0x1

    .line 983
    iput v14, v0, LQ0/d;->A:I

    .line 984
    .line 985
    const/4 v6, -0x1

    .line 986
    if-ne v4, v6, :cond_33

    .line 987
    .line 988
    div-float v4, v38, v34

    .line 989
    .line 990
    iput v4, v0, LQ0/d;->B:F

    .line 991
    .line 992
    :cond_33
    iget v4, v0, LQ0/d;->B:F

    .line 993
    .line 994
    int-to-float v6, v10

    .line 995
    mul-float/2addr v4, v6

    .line 996
    float-to-int v4, v4

    .line 997
    move/from16 v30, v4

    .line 998
    .line 999
    if-eq v2, v7, :cond_34

    .line 1000
    .line 1001
    move v7, v8

    .line 1002
    move-object/from16 v2, v23

    .line 1003
    .line 1004
    const/16 v23, 0x4

    .line 1005
    .line 1006
    :goto_1e
    const/16 v31, 0x0

    .line 1007
    .line 1008
    goto :goto_21

    .line 1009
    :cond_34
    move v7, v8

    .line 1010
    move-object/from16 v2, v23

    .line 1011
    .line 1012
    goto :goto_1d

    .line 1013
    :cond_35
    :goto_1f
    move-object/from16 v40, v9

    .line 1014
    .line 1015
    goto :goto_20

    .line 1016
    :cond_36
    move-object/from16 v39, v8

    .line 1017
    .line 1018
    goto :goto_1f

    .line 1019
    :goto_20
    move-object/from16 v2, v23

    .line 1020
    .line 1021
    move/from16 v30, v27

    .line 1022
    .line 1023
    move/from16 v7, v35

    .line 1024
    .line 1025
    move/from16 v23, v37

    .line 1026
    .line 1027
    goto :goto_1e

    .line 1028
    :goto_21
    iget-object v4, v0, LQ0/d;->t:[I

    .line 1029
    .line 1030
    const/16 v17, 0x0

    .line 1031
    .line 1032
    aput v7, v4, v17

    .line 1033
    .line 1034
    const/16 v19, 0x1

    .line 1035
    .line 1036
    aput v23, v4, v19

    .line 1037
    .line 1038
    if-eqz v31, :cond_38

    .line 1039
    .line 1040
    iget v4, v0, LQ0/d;->A:I

    .line 1041
    .line 1042
    const/4 v6, -0x1

    .line 1043
    if-eqz v4, :cond_37

    .line 1044
    .line 1045
    if-ne v4, v6, :cond_39

    .line 1046
    .line 1047
    :cond_37
    const/4 v4, 0x1

    .line 1048
    goto :goto_22

    .line 1049
    :cond_38
    const/4 v6, -0x1

    .line 1050
    :cond_39
    const/4 v4, 0x0

    .line 1051
    :goto_22
    if-eqz v31, :cond_3b

    .line 1052
    .line 1053
    iget v8, v0, LQ0/d;->A:I

    .line 1054
    .line 1055
    const/4 v14, 0x1

    .line 1056
    if-eq v8, v14, :cond_3a

    .line 1057
    .line 1058
    if-ne v8, v6, :cond_3b

    .line 1059
    .line 1060
    :cond_3a
    const/16 v32, 0x1

    .line 1061
    .line 1062
    :goto_23
    const/16 v17, 0x0

    .line 1063
    .line 1064
    goto :goto_24

    .line 1065
    :cond_3b
    const/16 v32, 0x0

    .line 1066
    .line 1067
    goto :goto_23

    .line 1068
    :goto_24
    aget v6, v28, v17

    .line 1069
    .line 1070
    const/4 v8, 0x2

    .line 1071
    if-ne v6, v8, :cond_3c

    .line 1072
    .line 1073
    instance-of v6, v0, LQ0/e;

    .line 1074
    .line 1075
    if-eqz v6, :cond_3c

    .line 1076
    .line 1077
    const/4 v9, 0x1

    .line 1078
    goto :goto_25

    .line 1079
    :cond_3c
    const/4 v9, 0x0

    .line 1080
    :goto_25
    if-eqz v9, :cond_3d

    .line 1081
    .line 1082
    const/4 v13, 0x0

    .line 1083
    :cond_3d
    iget-object v6, v0, LQ0/d;->P:LQ0/c;

    .line 1084
    .line 1085
    invoke-virtual {v6}, LQ0/c;->h()Z

    .line 1086
    .line 1087
    .line 1088
    move-result v8

    .line 1089
    const/16 v19, 0x1

    .line 1090
    .line 1091
    xor-int/lit8 v27, v8, 0x1

    .line 1092
    .line 1093
    const/16 v14, 0x8

    .line 1094
    .line 1095
    const/16 v17, 0x0

    .line 1096
    .line 1097
    aget-boolean v21, v15, v17

    .line 1098
    .line 1099
    aget-boolean v34, v15, v19

    .line 1100
    .line 1101
    iget v8, v0, LQ0/d;->o:I

    .line 1102
    .line 1103
    iget-object v10, v0, LQ0/d;->C:[I

    .line 1104
    .line 1105
    const/16 v35, 0x0

    .line 1106
    .line 1107
    const/4 v15, 0x2

    .line 1108
    if-eq v8, v15, :cond_40

    .line 1109
    .line 1110
    iget-boolean v8, v0, LQ0/d;->k:Z

    .line 1111
    .line 1112
    if-nez v8, :cond_40

    .line 1113
    .line 1114
    if-eqz p2, :cond_41

    .line 1115
    .line 1116
    iget-object v8, v0, LQ0/d;->d:LR0/k;

    .line 1117
    .line 1118
    if-eqz v8, :cond_41

    .line 1119
    .line 1120
    iget-object v14, v8, LR0/o;->h:LR0/f;

    .line 1121
    .line 1122
    iget-boolean v15, v14, LR0/f;->j:Z

    .line 1123
    .line 1124
    if-eqz v15, :cond_3e

    .line 1125
    .line 1126
    iget-object v8, v8, LR0/o;->i:LR0/f;

    .line 1127
    .line 1128
    iget-boolean v8, v8, LR0/f;->j:Z

    .line 1129
    .line 1130
    if-nez v8, :cond_3f

    .line 1131
    .line 1132
    :cond_3e
    const/16 v14, 0x8

    .line 1133
    .line 1134
    goto :goto_26

    .line 1135
    :cond_3f
    if-eqz p2, :cond_40

    .line 1136
    .line 1137
    iget v4, v14, LR0/f;->g:I

    .line 1138
    .line 1139
    invoke-virtual {v1, v3, v4}, LO0/c;->d(LO0/f;I)V

    .line 1140
    .line 1141
    .line 1142
    iget-object v4, v0, LQ0/d;->d:LR0/k;

    .line 1143
    .line 1144
    iget-object v4, v4, LR0/o;->i:LR0/f;

    .line 1145
    .line 1146
    iget v4, v4, LR0/f;->g:I

    .line 1147
    .line 1148
    invoke-virtual {v1, v5, v4}, LO0/c;->d(LO0/f;I)V

    .line 1149
    .line 1150
    .line 1151
    iget-object v4, v0, LQ0/d;->T:LQ0/d;

    .line 1152
    .line 1153
    if-eqz v4, :cond_40

    .line 1154
    .line 1155
    if-eqz v22, :cond_40

    .line 1156
    .line 1157
    const/4 v13, 0x0

    .line 1158
    aget-boolean v4, v24, v13

    .line 1159
    .line 1160
    if-eqz v4, :cond_40

    .line 1161
    .line 1162
    invoke-virtual {v0}, LQ0/d;->x()Z

    .line 1163
    .line 1164
    .line 1165
    move-result v4

    .line 1166
    if-nez v4, :cond_40

    .line 1167
    .line 1168
    iget-object v4, v0, LQ0/d;->T:LQ0/d;

    .line 1169
    .line 1170
    iget-object v4, v4, LQ0/d;->K:LQ0/c;

    .line 1171
    .line 1172
    invoke-virtual {v1, v4}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v4

    .line 1176
    const/16 v14, 0x8

    .line 1177
    .line 1178
    invoke-virtual {v1, v4, v5, v13, v14}, LO0/c;->f(LO0/f;LO0/f;II)V

    .line 1179
    .line 1180
    .line 1181
    :cond_40
    move-object/from16 v54, v2

    .line 1182
    .line 1183
    move-object/from16 v49, v3

    .line 1184
    .line 1185
    move-object/from16 v50, v5

    .line 1186
    .line 1187
    move-object/from16 v41, v6

    .line 1188
    .line 1189
    move-object/from16 v46, v10

    .line 1190
    .line 1191
    move-object/from16 v55, v11

    .line 1192
    .line 1193
    move/from16 v19, v12

    .line 1194
    .line 1195
    move/from16 v3, v22

    .line 1196
    .line 1197
    move-object/from16 v48, v24

    .line 1198
    .line 1199
    move/from16 v4, v29

    .line 1200
    .line 1201
    move-object/from16 v51, v33

    .line 1202
    .line 1203
    move-object/from16 v52, v39

    .line 1204
    .line 1205
    move-object/from16 v53, v40

    .line 1206
    .line 1207
    move/from16 v22, v7

    .line 1208
    .line 1209
    goto/16 :goto_2b

    .line 1210
    .line 1211
    :cond_41
    :goto_26
    iget-object v8, v0, LQ0/d;->T:LQ0/d;

    .line 1212
    .line 1213
    if-eqz v8, :cond_42

    .line 1214
    .line 1215
    iget-object v8, v8, LQ0/d;->K:LQ0/c;

    .line 1216
    .line 1217
    invoke-virtual {v1, v8}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v8

    .line 1221
    goto :goto_27

    .line 1222
    :cond_42
    move-object/from16 v8, v35

    .line 1223
    .line 1224
    :goto_27
    iget-object v15, v0, LQ0/d;->T:LQ0/d;

    .line 1225
    .line 1226
    if-eqz v15, :cond_43

    .line 1227
    .line 1228
    iget-object v15, v15, LQ0/d;->I:LQ0/c;

    .line 1229
    .line 1230
    invoke-virtual {v1, v15}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v15

    .line 1234
    :goto_28
    move-object/from16 v18, v5

    .line 1235
    .line 1236
    const/16 v17, 0x0

    .line 1237
    .line 1238
    goto :goto_29

    .line 1239
    :cond_43
    move-object/from16 v15, v35

    .line 1240
    .line 1241
    goto :goto_28

    .line 1242
    :goto_29
    aget-boolean v5, v24, v17

    .line 1243
    .line 1244
    move-object/from16 v26, v3

    .line 1245
    .line 1246
    move/from16 v3, v22

    .line 1247
    .line 1248
    move/from16 v22, v7

    .line 1249
    .line 1250
    move-object v7, v8

    .line 1251
    aget v8, v28, v17

    .line 1252
    .line 1253
    move/from16 v19, v12

    .line 1254
    .line 1255
    const/16 v36, 0x1

    .line 1256
    .line 1257
    iget v12, v0, LQ0/d;->Y:I

    .line 1258
    .line 1259
    move/from16 v37, v14

    .line 1260
    .line 1261
    iget v14, v0, LQ0/d;->b0:I

    .line 1262
    .line 1263
    move-object/from16 v41, v6

    .line 1264
    .line 1265
    move-object v6, v15

    .line 1266
    aget v15, v10, v17

    .line 1267
    .line 1268
    iget v1, v0, LQ0/d;->d0:F

    .line 1269
    .line 1270
    move/from16 v42, v1

    .line 1271
    .line 1272
    aget v1, v28, v36

    .line 1273
    .line 1274
    move-object/from16 v43, v2

    .line 1275
    .line 1276
    const/4 v2, 0x3

    .line 1277
    if-ne v1, v2, :cond_44

    .line 1278
    .line 1279
    move-object/from16 v1, v18

    .line 1280
    .line 1281
    move/from16 v18, v36

    .line 1282
    .line 1283
    goto :goto_2a

    .line 1284
    :cond_44
    move-object/from16 v1, v18

    .line 1285
    .line 1286
    move/from16 v18, v17

    .line 1287
    .line 1288
    :goto_2a
    iget v2, v0, LQ0/d;->u:I

    .line 1289
    .line 1290
    move-object/from16 v44, v1

    .line 1291
    .line 1292
    iget v1, v0, LQ0/d;->v:I

    .line 1293
    .line 1294
    move/from16 v45, v1

    .line 1295
    .line 1296
    iget v1, v0, LQ0/d;->w:F

    .line 1297
    .line 1298
    move-object/from16 v46, v10

    .line 1299
    .line 1300
    iget-object v10, v0, LQ0/d;->I:LQ0/c;

    .line 1301
    .line 1302
    move-object/from16 v47, v11

    .line 1303
    .line 1304
    iget-object v11, v0, LQ0/d;->K:LQ0/c;

    .line 1305
    .line 1306
    move-object/from16 v48, v24

    .line 1307
    .line 1308
    move/from16 v24, v2

    .line 1309
    .line 1310
    const/4 v2, 0x1

    .line 1311
    move/from16 v17, v4

    .line 1312
    .line 1313
    move-object/from16 v49, v26

    .line 1314
    .line 1315
    move/from16 v4, v29

    .line 1316
    .line 1317
    move-object/from16 v51, v33

    .line 1318
    .line 1319
    move-object/from16 v52, v39

    .line 1320
    .line 1321
    move-object/from16 v53, v40

    .line 1322
    .line 1323
    move/from16 v16, v42

    .line 1324
    .line 1325
    move-object/from16 v54, v43

    .line 1326
    .line 1327
    move-object/from16 v50, v44

    .line 1328
    .line 1329
    move/from16 v25, v45

    .line 1330
    .line 1331
    move-object/from16 v55, v47

    .line 1332
    .line 1333
    move/from16 v26, v1

    .line 1334
    .line 1335
    move-object/from16 v1, p1

    .line 1336
    .line 1337
    invoke-virtual/range {v0 .. v27}, LQ0/d;->d(LO0/c;ZZZZLO0/f;LO0/f;IZLQ0/c;LQ0/c;IIIIFZZZZZIIIIFZ)V

    .line 1338
    .line 1339
    .line 1340
    :goto_2b
    if-eqz p2, :cond_47

    .line 1341
    .line 1342
    iget-object v2, v0, LQ0/d;->e:LR0/m;

    .line 1343
    .line 1344
    if-eqz v2, :cond_47

    .line 1345
    .line 1346
    iget-object v5, v2, LR0/o;->h:LR0/f;

    .line 1347
    .line 1348
    iget-boolean v6, v5, LR0/f;->j:Z

    .line 1349
    .line 1350
    if-eqz v6, :cond_47

    .line 1351
    .line 1352
    iget-object v2, v2, LR0/o;->i:LR0/f;

    .line 1353
    .line 1354
    iget-boolean v2, v2, LR0/f;->j:Z

    .line 1355
    .line 1356
    if-eqz v2, :cond_47

    .line 1357
    .line 1358
    iget v2, v5, LR0/f;->g:I

    .line 1359
    .line 1360
    move-object/from16 v5, v51

    .line 1361
    .line 1362
    invoke-virtual {v1, v5, v2}, LO0/c;->d(LO0/f;I)V

    .line 1363
    .line 1364
    .line 1365
    iget-object v2, v0, LQ0/d;->e:LR0/m;

    .line 1366
    .line 1367
    iget-object v2, v2, LR0/o;->i:LR0/f;

    .line 1368
    .line 1369
    iget v2, v2, LR0/f;->g:I

    .line 1370
    .line 1371
    move-object/from16 v6, v53

    .line 1372
    .line 1373
    invoke-virtual {v1, v6, v2}, LO0/c;->d(LO0/f;I)V

    .line 1374
    .line 1375
    .line 1376
    iget-object v2, v0, LQ0/d;->e:LR0/m;

    .line 1377
    .line 1378
    iget-object v2, v2, LR0/m;->k:LR0/f;

    .line 1379
    .line 1380
    iget v2, v2, LR0/f;->g:I

    .line 1381
    .line 1382
    move-object/from16 v7, v55

    .line 1383
    .line 1384
    invoke-virtual {v1, v7, v2}, LO0/c;->d(LO0/f;I)V

    .line 1385
    .line 1386
    .line 1387
    iget-object v2, v0, LQ0/d;->T:LQ0/d;

    .line 1388
    .line 1389
    if-eqz v2, :cond_46

    .line 1390
    .line 1391
    if-nez v20, :cond_46

    .line 1392
    .line 1393
    if-eqz v4, :cond_46

    .line 1394
    .line 1395
    const/4 v14, 0x1

    .line 1396
    aget-boolean v8, v48, v14

    .line 1397
    .line 1398
    if-eqz v8, :cond_45

    .line 1399
    .line 1400
    iget-object v2, v2, LQ0/d;->L:LQ0/c;

    .line 1401
    .line 1402
    invoke-virtual {v1, v2}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v2

    .line 1406
    const/4 v8, 0x0

    .line 1407
    const/16 v9, 0x8

    .line 1408
    .line 1409
    invoke-virtual {v1, v2, v6, v8, v9}, LO0/c;->f(LO0/f;LO0/f;II)V

    .line 1410
    .line 1411
    .line 1412
    goto :goto_2c

    .line 1413
    :cond_45
    const/4 v8, 0x0

    .line 1414
    const/16 v9, 0x8

    .line 1415
    .line 1416
    goto :goto_2c

    .line 1417
    :cond_46
    const/4 v8, 0x0

    .line 1418
    const/16 v9, 0x8

    .line 1419
    .line 1420
    const/4 v14, 0x1

    .line 1421
    :goto_2c
    move v15, v8

    .line 1422
    goto :goto_2d

    .line 1423
    :cond_47
    move-object/from16 v5, v51

    .line 1424
    .line 1425
    move-object/from16 v6, v53

    .line 1426
    .line 1427
    move-object/from16 v7, v55

    .line 1428
    .line 1429
    const/4 v8, 0x0

    .line 1430
    const/16 v9, 0x8

    .line 1431
    .line 1432
    const/4 v14, 0x1

    .line 1433
    move v15, v14

    .line 1434
    :goto_2d
    iget v2, v0, LQ0/d;->p:I

    .line 1435
    .line 1436
    const/4 v10, 0x2

    .line 1437
    if-ne v2, v10, :cond_48

    .line 1438
    .line 1439
    move v15, v8

    .line 1440
    :cond_48
    const/4 v2, 0x5

    .line 1441
    if-eqz v15, :cond_53

    .line 1442
    .line 1443
    iget-boolean v11, v0, LQ0/d;->l:Z

    .line 1444
    .line 1445
    if-nez v11, :cond_53

    .line 1446
    .line 1447
    aget v11, v28, v14

    .line 1448
    .line 1449
    if-ne v11, v10, :cond_49

    .line 1450
    .line 1451
    instance-of v11, v0, LQ0/e;

    .line 1452
    .line 1453
    if-eqz v11, :cond_49

    .line 1454
    .line 1455
    move v15, v14

    .line 1456
    goto :goto_2e

    .line 1457
    :cond_49
    move v15, v8

    .line 1458
    :goto_2e
    if-eqz v15, :cond_4a

    .line 1459
    .line 1460
    move v13, v8

    .line 1461
    goto :goto_2f

    .line 1462
    :cond_4a
    move/from16 v13, v30

    .line 1463
    .line 1464
    :goto_2f
    iget-object v11, v0, LQ0/d;->T:LQ0/d;

    .line 1465
    .line 1466
    if-eqz v11, :cond_4b

    .line 1467
    .line 1468
    iget-object v11, v11, LQ0/d;->L:LQ0/c;

    .line 1469
    .line 1470
    invoke-virtual {v1, v11}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v11

    .line 1474
    goto :goto_30

    .line 1475
    :cond_4b
    move-object/from16 v11, v35

    .line 1476
    .line 1477
    :goto_30
    iget-object v12, v0, LQ0/d;->T:LQ0/d;

    .line 1478
    .line 1479
    if-eqz v12, :cond_4c

    .line 1480
    .line 1481
    iget-object v12, v12, LQ0/d;->J:LQ0/c;

    .line 1482
    .line 1483
    invoke-virtual {v1, v12}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v35

    .line 1487
    :cond_4c
    iget v12, v0, LQ0/d;->a0:I

    .line 1488
    .line 1489
    if-gtz v12, :cond_4d

    .line 1490
    .line 1491
    iget v10, v0, LQ0/d;->g0:I

    .line 1492
    .line 1493
    if-ne v10, v9, :cond_4e

    .line 1494
    .line 1495
    :cond_4d
    move/from16 v36, v14

    .line 1496
    .line 1497
    move-object/from16 v10, v54

    .line 1498
    .line 1499
    goto :goto_31

    .line 1500
    :cond_4e
    move/from16 v36, v14

    .line 1501
    .line 1502
    goto :goto_32

    .line 1503
    :goto_31
    iget-object v14, v10, LQ0/c;->f:LQ0/c;

    .line 1504
    .line 1505
    if-eqz v14, :cond_50

    .line 1506
    .line 1507
    invoke-virtual {v1, v7, v5, v12, v9}, LO0/c;->e(LO0/f;LO0/f;II)V

    .line 1508
    .line 1509
    .line 1510
    iget-object v12, v10, LQ0/c;->f:LQ0/c;

    .line 1511
    .line 1512
    invoke-virtual {v1, v12}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v12

    .line 1516
    invoke-virtual {v10}, LQ0/c;->e()I

    .line 1517
    .line 1518
    .line 1519
    move-result v10

    .line 1520
    invoke-virtual {v1, v7, v12, v10, v9}, LO0/c;->e(LO0/f;LO0/f;II)V

    .line 1521
    .line 1522
    .line 1523
    if-eqz v4, :cond_4f

    .line 1524
    .line 1525
    move-object/from16 v7, v52

    .line 1526
    .line 1527
    invoke-virtual {v1, v7}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v7

    .line 1531
    invoke-virtual {v1, v11, v7, v8, v2}, LO0/c;->f(LO0/f;LO0/f;II)V

    .line 1532
    .line 1533
    .line 1534
    :cond_4f
    move/from16 v27, v8

    .line 1535
    .line 1536
    goto :goto_32

    .line 1537
    :cond_50
    iget v14, v0, LQ0/d;->g0:I

    .line 1538
    .line 1539
    if-ne v14, v9, :cond_51

    .line 1540
    .line 1541
    invoke-virtual {v10}, LQ0/c;->e()I

    .line 1542
    .line 1543
    .line 1544
    move-result v10

    .line 1545
    invoke-virtual {v1, v7, v5, v10, v9}, LO0/c;->e(LO0/f;LO0/f;II)V

    .line 1546
    .line 1547
    .line 1548
    goto :goto_32

    .line 1549
    :cond_51
    invoke-virtual {v1, v7, v5, v12, v9}, LO0/c;->e(LO0/f;LO0/f;II)V

    .line 1550
    .line 1551
    .line 1552
    :goto_32
    aget-boolean v7, v48, v36

    .line 1553
    .line 1554
    move/from16 v17, v8

    .line 1555
    .line 1556
    aget v8, v28, v36

    .line 1557
    .line 1558
    iget v12, v0, LQ0/d;->Z:I

    .line 1559
    .line 1560
    iget v14, v0, LQ0/d;->c0:I

    .line 1561
    .line 1562
    aget v9, v46, v36

    .line 1563
    .line 1564
    iget v10, v0, LQ0/d;->e0:F

    .line 1565
    .line 1566
    aget v2, v28, v17

    .line 1567
    .line 1568
    const/4 v1, 0x3

    .line 1569
    if-ne v2, v1, :cond_52

    .line 1570
    .line 1571
    move/from16 v18, v36

    .line 1572
    .line 1573
    :goto_33
    const/16 v25, 0x2

    .line 1574
    .line 1575
    goto :goto_34

    .line 1576
    :cond_52
    move/from16 v18, v17

    .line 1577
    .line 1578
    goto :goto_33

    .line 1579
    :goto_34
    iget v2, v0, LQ0/d;->x:I

    .line 1580
    .line 1581
    iget v1, v0, LQ0/d;->y:I

    .line 1582
    .line 1583
    move/from16 v21, v1

    .line 1584
    .line 1585
    iget v1, v0, LQ0/d;->z:F

    .line 1586
    .line 1587
    move/from16 v16, v10

    .line 1588
    .line 1589
    const/16 v56, 0x3

    .line 1590
    .line 1591
    iget-object v10, v0, LQ0/d;->J:LQ0/c;

    .line 1592
    .line 1593
    move-object/from16 v33, v5

    .line 1594
    .line 1595
    move v5, v7

    .line 1596
    move-object v7, v11

    .line 1597
    iget-object v11, v0, LQ0/d;->L:LQ0/c;

    .line 1598
    .line 1599
    move/from16 v24, v2

    .line 1600
    .line 1601
    const/4 v2, 0x0

    .line 1602
    move/from16 v17, v4

    .line 1603
    .line 1604
    move v4, v3

    .line 1605
    move/from16 v3, v17

    .line 1606
    .line 1607
    move/from16 v17, v15

    .line 1608
    .line 1609
    move v15, v9

    .line 1610
    move/from16 v9, v17

    .line 1611
    .line 1612
    move/from16 v17, v20

    .line 1613
    .line 1614
    move/from16 v20, v19

    .line 1615
    .line 1616
    move/from16 v19, v17

    .line 1617
    .line 1618
    move/from16 v17, v23

    .line 1619
    .line 1620
    move/from16 v23, v22

    .line 1621
    .line 1622
    move/from16 v22, v17

    .line 1623
    .line 1624
    move/from16 v26, v1

    .line 1625
    .line 1626
    move-object/from16 v58, v6

    .line 1627
    .line 1628
    move/from16 v25, v21

    .line 1629
    .line 1630
    move/from16 v17, v32

    .line 1631
    .line 1632
    move-object/from16 v57, v33

    .line 1633
    .line 1634
    move/from16 v21, v34

    .line 1635
    .line 1636
    move-object/from16 v6, v35

    .line 1637
    .line 1638
    move-object/from16 v1, p1

    .line 1639
    .line 1640
    invoke-virtual/range {v0 .. v27}, LQ0/d;->d(LO0/c;ZZZZLO0/f;LO0/f;IZLQ0/c;LQ0/c;IIIIFZZZZZIIIIFZ)V

    .line 1641
    .line 1642
    .line 1643
    goto :goto_35

    .line 1644
    :cond_53
    move-object/from16 v57, v5

    .line 1645
    .line 1646
    move-object/from16 v58, v6

    .line 1647
    .line 1648
    :goto_35
    if-eqz v31, :cond_55

    .line 1649
    .line 1650
    iget v2, v0, LQ0/d;->A:I

    .line 1651
    .line 1652
    const/high16 v3, -0x40800000    # -1.0f

    .line 1653
    .line 1654
    const/4 v14, 0x1

    .line 1655
    if-ne v2, v14, :cond_54

    .line 1656
    .line 1657
    iget v2, v0, LQ0/d;->B:F

    .line 1658
    .line 1659
    invoke-virtual {v1}, LO0/c;->l()LO0/b;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v4

    .line 1663
    iget-object v5, v4, LO0/b;->d:LO0/a;

    .line 1664
    .line 1665
    move-object/from16 v6, v58

    .line 1666
    .line 1667
    invoke-virtual {v5, v6, v3}, LO0/a;->g(LO0/f;F)V

    .line 1668
    .line 1669
    .line 1670
    iget-object v3, v4, LO0/b;->d:LO0/a;

    .line 1671
    .line 1672
    move-object/from16 v5, v57

    .line 1673
    .line 1674
    const/high16 v7, 0x3f800000    # 1.0f

    .line 1675
    .line 1676
    invoke-virtual {v3, v5, v7}, LO0/a;->g(LO0/f;F)V

    .line 1677
    .line 1678
    .line 1679
    iget-object v3, v4, LO0/b;->d:LO0/a;

    .line 1680
    .line 1681
    move-object/from16 v8, v50

    .line 1682
    .line 1683
    invoke-virtual {v3, v8, v2}, LO0/a;->g(LO0/f;F)V

    .line 1684
    .line 1685
    .line 1686
    iget-object v3, v4, LO0/b;->d:LO0/a;

    .line 1687
    .line 1688
    neg-float v2, v2

    .line 1689
    move-object/from16 v9, v49

    .line 1690
    .line 1691
    invoke-virtual {v3, v9, v2}, LO0/a;->g(LO0/f;F)V

    .line 1692
    .line 1693
    .line 1694
    invoke-virtual {v1, v4}, LO0/c;->c(LO0/b;)V

    .line 1695
    .line 1696
    .line 1697
    goto :goto_36

    .line 1698
    :cond_54
    move-object/from16 v9, v49

    .line 1699
    .line 1700
    move-object/from16 v8, v50

    .line 1701
    .line 1702
    move-object/from16 v5, v57

    .line 1703
    .line 1704
    move-object/from16 v6, v58

    .line 1705
    .line 1706
    const/high16 v7, 0x3f800000    # 1.0f

    .line 1707
    .line 1708
    iget v2, v0, LQ0/d;->B:F

    .line 1709
    .line 1710
    invoke-virtual {v1}, LO0/c;->l()LO0/b;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v4

    .line 1714
    iget-object v10, v4, LO0/b;->d:LO0/a;

    .line 1715
    .line 1716
    invoke-virtual {v10, v8, v3}, LO0/a;->g(LO0/f;F)V

    .line 1717
    .line 1718
    .line 1719
    iget-object v3, v4, LO0/b;->d:LO0/a;

    .line 1720
    .line 1721
    invoke-virtual {v3, v9, v7}, LO0/a;->g(LO0/f;F)V

    .line 1722
    .line 1723
    .line 1724
    iget-object v3, v4, LO0/b;->d:LO0/a;

    .line 1725
    .line 1726
    invoke-virtual {v3, v6, v2}, LO0/a;->g(LO0/f;F)V

    .line 1727
    .line 1728
    .line 1729
    iget-object v3, v4, LO0/b;->d:LO0/a;

    .line 1730
    .line 1731
    neg-float v2, v2

    .line 1732
    invoke-virtual {v3, v5, v2}, LO0/a;->g(LO0/f;F)V

    .line 1733
    .line 1734
    .line 1735
    invoke-virtual {v1, v4}, LO0/c;->c(LO0/b;)V

    .line 1736
    .line 1737
    .line 1738
    :cond_55
    :goto_36
    invoke-virtual/range {v41 .. v41}, LQ0/c;->h()Z

    .line 1739
    .line 1740
    .line 1741
    move-result v2

    .line 1742
    if-eqz v2, :cond_56

    .line 1743
    .line 1744
    move-object/from16 v2, v41

    .line 1745
    .line 1746
    iget-object v3, v2, LQ0/c;->f:LQ0/c;

    .line 1747
    .line 1748
    iget-object v3, v3, LQ0/c;->d:LQ0/d;

    .line 1749
    .line 1750
    iget v4, v0, LQ0/d;->D:F

    .line 1751
    .line 1752
    const/high16 v5, 0x42b40000    # 90.0f

    .line 1753
    .line 1754
    add-float/2addr v4, v5

    .line 1755
    float-to-double v4, v4

    .line 1756
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    .line 1757
    .line 1758
    .line 1759
    move-result-wide v4

    .line 1760
    double-to-float v4, v4

    .line 1761
    invoke-virtual {v2}, LQ0/c;->e()I

    .line 1762
    .line 1763
    .line 1764
    move-result v2

    .line 1765
    const/4 v15, 0x2

    .line 1766
    invoke-virtual {v0, v15}, LQ0/d;->i(I)LQ0/c;

    .line 1767
    .line 1768
    .line 1769
    move-result-object v5

    .line 1770
    invoke-virtual {v1, v5}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 1771
    .line 1772
    .line 1773
    move-result-object v5

    .line 1774
    const/4 v7, 0x3

    .line 1775
    invoke-virtual {v0, v7}, LQ0/d;->i(I)LQ0/c;

    .line 1776
    .line 1777
    .line 1778
    move-result-object v6

    .line 1779
    invoke-virtual {v1, v6}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 1780
    .line 1781
    .line 1782
    move-result-object v6

    .line 1783
    const/4 v8, 0x4

    .line 1784
    invoke-virtual {v0, v8}, LQ0/d;->i(I)LQ0/c;

    .line 1785
    .line 1786
    .line 1787
    move-result-object v9

    .line 1788
    invoke-virtual {v1, v9}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 1789
    .line 1790
    .line 1791
    move-result-object v9

    .line 1792
    const/4 v10, 0x5

    .line 1793
    invoke-virtual {v0, v10}, LQ0/d;->i(I)LQ0/c;

    .line 1794
    .line 1795
    .line 1796
    move-result-object v11

    .line 1797
    invoke-virtual {v1, v11}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 1798
    .line 1799
    .line 1800
    move-result-object v11

    .line 1801
    invoke-virtual {v3, v15}, LQ0/d;->i(I)LQ0/c;

    .line 1802
    .line 1803
    .line 1804
    move-result-object v12

    .line 1805
    invoke-virtual {v1, v12}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 1806
    .line 1807
    .line 1808
    move-result-object v12

    .line 1809
    invoke-virtual {v3, v7}, LQ0/d;->i(I)LQ0/c;

    .line 1810
    .line 1811
    .line 1812
    move-result-object v7

    .line 1813
    invoke-virtual {v1, v7}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 1814
    .line 1815
    .line 1816
    move-result-object v7

    .line 1817
    invoke-virtual {v3, v8}, LQ0/d;->i(I)LQ0/c;

    .line 1818
    .line 1819
    .line 1820
    move-result-object v8

    .line 1821
    invoke-virtual {v1, v8}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 1822
    .line 1823
    .line 1824
    move-result-object v8

    .line 1825
    invoke-virtual {v3, v10}, LQ0/d;->i(I)LQ0/c;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v3

    .line 1829
    invoke-virtual {v1, v3}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 1830
    .line 1831
    .line 1832
    move-result-object v3

    .line 1833
    invoke-virtual {v1}, LO0/c;->l()LO0/b;

    .line 1834
    .line 1835
    .line 1836
    move-result-object v10

    .line 1837
    float-to-double v13, v4

    .line 1838
    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    .line 1839
    .line 1840
    .line 1841
    move-result-wide v15

    .line 1842
    move-wide/from16 v17, v13

    .line 1843
    .line 1844
    int-to-double v13, v2

    .line 1845
    move-wide/from16 v19, v13

    .line 1846
    .line 1847
    mul-double v13, v15, v19

    .line 1848
    .line 1849
    double-to-float v2, v13

    .line 1850
    iget-object v4, v10, LO0/b;->d:LO0/a;

    .line 1851
    .line 1852
    const/high16 v13, 0x3f000000    # 0.5f

    .line 1853
    .line 1854
    invoke-virtual {v4, v7, v13}, LO0/a;->g(LO0/f;F)V

    .line 1855
    .line 1856
    .line 1857
    iget-object v4, v10, LO0/b;->d:LO0/a;

    .line 1858
    .line 1859
    invoke-virtual {v4, v3, v13}, LO0/a;->g(LO0/f;F)V

    .line 1860
    .line 1861
    .line 1862
    iget-object v3, v10, LO0/b;->d:LO0/a;

    .line 1863
    .line 1864
    const/high16 v4, -0x41000000    # -0.5f

    .line 1865
    .line 1866
    invoke-virtual {v3, v6, v4}, LO0/a;->g(LO0/f;F)V

    .line 1867
    .line 1868
    .line 1869
    iget-object v3, v10, LO0/b;->d:LO0/a;

    .line 1870
    .line 1871
    invoke-virtual {v3, v11, v4}, LO0/a;->g(LO0/f;F)V

    .line 1872
    .line 1873
    .line 1874
    neg-float v2, v2

    .line 1875
    iput v2, v10, LO0/b;->b:F

    .line 1876
    .line 1877
    invoke-virtual {v1, v10}, LO0/c;->c(LO0/b;)V

    .line 1878
    .line 1879
    .line 1880
    invoke-virtual {v1}, LO0/c;->l()LO0/b;

    .line 1881
    .line 1882
    .line 1883
    move-result-object v2

    .line 1884
    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->cos(D)D

    .line 1885
    .line 1886
    .line 1887
    move-result-wide v6

    .line 1888
    mul-double v6, v6, v19

    .line 1889
    .line 1890
    double-to-float v3, v6

    .line 1891
    iget-object v6, v2, LO0/b;->d:LO0/a;

    .line 1892
    .line 1893
    invoke-virtual {v6, v12, v13}, LO0/a;->g(LO0/f;F)V

    .line 1894
    .line 1895
    .line 1896
    iget-object v6, v2, LO0/b;->d:LO0/a;

    .line 1897
    .line 1898
    invoke-virtual {v6, v8, v13}, LO0/a;->g(LO0/f;F)V

    .line 1899
    .line 1900
    .line 1901
    iget-object v6, v2, LO0/b;->d:LO0/a;

    .line 1902
    .line 1903
    invoke-virtual {v6, v5, v4}, LO0/a;->g(LO0/f;F)V

    .line 1904
    .line 1905
    .line 1906
    iget-object v5, v2, LO0/b;->d:LO0/a;

    .line 1907
    .line 1908
    invoke-virtual {v5, v9, v4}, LO0/a;->g(LO0/f;F)V

    .line 1909
    .line 1910
    .line 1911
    neg-float v3, v3

    .line 1912
    iput v3, v2, LO0/b;->b:F

    .line 1913
    .line 1914
    invoke-virtual {v1, v2}, LO0/c;->c(LO0/b;)V

    .line 1915
    .line 1916
    .line 1917
    :cond_56
    const/4 v2, 0x0

    .line 1918
    iput-boolean v2, v0, LQ0/d;->k:Z

    .line 1919
    .line 1920
    iput-boolean v2, v0, LQ0/d;->l:Z

    .line 1921
    .line 1922
    return-void
.end method

.method public c()Z
    .locals 2

    .line 1
    iget v0, p0, LQ0/d;->g0:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public final d(LO0/c;ZZZZLO0/f;LO0/f;IZLQ0/c;LQ0/c;IIIIFZZZZZIIIIFZ)V
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move/from16 v14, p14

    move/from16 v2, p15

    move/from16 v4, p24

    move/from16 v5, p25

    move/from16 v6, p26

    .line 1
    invoke-virtual {v1, v12}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    move-result-object v7

    .line 2
    invoke-virtual {v1, v13}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    move-result-object v8

    .line 3
    iget-object v9, v12, LQ0/c;->f:LQ0/c;

    .line 4
    invoke-virtual {v1, v9}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    move-result-object v9

    .line 5
    iget-object v15, v13, LQ0/c;->f:LQ0/c;

    .line 6
    invoke-virtual {v1, v15}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    move-result-object v15

    .line 7
    invoke-virtual {v12}, LQ0/c;->h()Z

    move-result v16

    .line 8
    invoke-virtual {v13}, LQ0/c;->h()Z

    move-result v17

    .line 9
    iget-object v11, v0, LQ0/d;->P:LQ0/c;

    invoke-virtual {v11}, LQ0/c;->h()Z

    move-result v11

    if-eqz v17, :cond_0

    add-int/lit8 v18, v16, 0x1

    goto :goto_0

    :cond_0
    move/from16 v18, v16

    :goto_0
    if-eqz v11, :cond_1

    add-int/lit8 v18, v18, 0x1

    :cond_1
    move/from16 v19, v11

    move/from16 v11, v18

    if-eqz p17, :cond_2

    const/4 v3, 0x3

    goto :goto_1

    :cond_2
    move/from16 v3, p22

    .line 10
    :goto_1
    invoke-static/range {p8 .. p8}, LA/f;->f(I)I

    move-result v13

    const/4 v10, 0x1

    move-object/from16 v20, v15

    if-eqz v13, :cond_3

    if-eq v13, v10, :cond_3

    const/4 v10, 0x2

    if-eq v13, v10, :cond_4

    :cond_3
    const/4 v10, 0x0

    goto :goto_2

    :cond_4
    const/4 v10, 0x4

    if-eq v3, v10, :cond_3

    const/4 v10, 0x1

    .line 11
    :goto_2
    iget v13, v0, LQ0/d;->h:I

    const/4 v15, -0x1

    if-eq v13, v15, :cond_5

    if-eqz p2, :cond_5

    .line 12
    iput v15, v0, LQ0/d;->h:I

    const/16 p13, 0x0

    goto :goto_3

    :cond_5
    move/from16 v13, p13

    move/from16 p13, v10

    .line 13
    :goto_3
    iget v10, v0, LQ0/d;->i:I

    if-eq v10, v15, :cond_6

    if-nez p2, :cond_6

    .line 14
    iput v15, v0, LQ0/d;->i:I

    move v13, v10

    const/4 v10, 0x0

    goto :goto_4

    :cond_6
    move/from16 v10, p13

    .line 15
    :goto_4
    iget v15, v0, LQ0/d;->g0:I

    move/from16 p13, v10

    const/16 v10, 0x8

    if-ne v15, v10, :cond_7

    const/4 v13, 0x0

    const/4 v15, 0x0

    goto :goto_5

    :cond_7
    move v15, v13

    move/from16 v13, p13

    :goto_5
    if-eqz p27, :cond_a

    if-nez v16, :cond_9

    if-nez v17, :cond_9

    if-nez v19, :cond_9

    move/from16 v10, p12

    .line 16
    invoke-virtual {v1, v7, v10}, LO0/c;->d(LO0/f;I)V

    :cond_8
    move/from16 v24, v13

    const/16 v13, 0x8

    goto :goto_6

    :cond_9
    if-eqz v16, :cond_8

    if-nez v17, :cond_8

    .line 17
    invoke-virtual {v12}, LQ0/c;->e()I

    move-result v10

    move/from16 v24, v13

    const/16 v13, 0x8

    invoke-virtual {v1, v7, v9, v10, v13}, LO0/c;->e(LO0/f;LO0/f;II)V

    goto :goto_6

    :cond_a
    move/from16 v24, v13

    move v13, v10

    :goto_6
    if-nez v24, :cond_e

    if-eqz p9, :cond_c

    const/4 v6, 0x3

    const/4 v10, 0x0

    .line 18
    invoke-virtual {v1, v8, v7, v10, v6}, LO0/c;->e(LO0/f;LO0/f;II)V

    if-lez v14, :cond_b

    .line 19
    invoke-virtual {v1, v8, v7, v14, v13}, LO0/c;->f(LO0/f;LO0/f;II)V

    :cond_b
    const v6, 0x7fffffff

    if-ge v2, v6, :cond_d

    .line 20
    invoke-virtual {v1, v8, v7, v2, v13}, LO0/c;->g(LO0/f;LO0/f;II)V

    goto :goto_7

    .line 21
    :cond_c
    invoke-virtual {v1, v8, v7, v15, v13}, LO0/c;->e(LO0/f;LO0/f;II)V

    :cond_d
    :goto_7
    move/from16 v10, p5

    move v13, v4

    goto/16 :goto_b

    :cond_e
    const/4 v10, 0x2

    if-eq v11, v10, :cond_11

    if-nez p17, :cond_11

    const/4 v2, 0x1

    if-eq v3, v2, :cond_f

    if-nez v3, :cond_11

    .line 22
    :cond_f
    invoke-static {v4, v15}, Ljava/lang/Math;->max(II)I

    move-result v2

    if-lez v5, :cond_10

    .line 23
    invoke-static {v5, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    :cond_10
    const/16 v13, 0x8

    .line 24
    invoke-virtual {v1, v8, v7, v2, v13}, LO0/c;->e(LO0/f;LO0/f;II)V

    move/from16 v10, p5

    move v13, v4

    const/16 v24, 0x0

    goto/16 :goto_b

    :cond_11
    const/4 v2, -0x2

    if-ne v4, v2, :cond_12

    move v4, v15

    :cond_12
    if-ne v5, v2, :cond_13

    move v5, v15

    :cond_13
    if-lez v15, :cond_14

    const/4 v2, 0x1

    if-eq v3, v2, :cond_14

    const/4 v15, 0x0

    :cond_14
    const/16 v13, 0x8

    if-lez v4, :cond_15

    .line 25
    invoke-virtual {v1, v8, v7, v4, v13}, LO0/c;->f(LO0/f;LO0/f;II)V

    .line 26
    invoke-static {v15, v4}, Ljava/lang/Math;->max(II)I

    move-result v15

    :cond_15
    const/4 v2, 0x1

    if-lez v5, :cond_17

    if-eqz p3, :cond_16

    if-ne v3, v2, :cond_16

    goto :goto_8

    .line 27
    :cond_16
    invoke-virtual {v1, v8, v7, v5, v13}, LO0/c;->g(LO0/f;LO0/f;II)V

    .line 28
    :goto_8
    invoke-static {v15, v5}, Ljava/lang/Math;->min(II)I

    move-result v15

    :cond_17
    if-ne v3, v2, :cond_1a

    if-eqz p3, :cond_18

    .line 29
    invoke-virtual {v1, v8, v7, v15, v13}, LO0/c;->e(LO0/f;LO0/f;II)V

    const/4 v2, 0x5

    goto :goto_7

    :cond_18
    if-eqz p19, :cond_19

    const/4 v2, 0x5

    .line 30
    invoke-virtual {v1, v8, v7, v15, v2}, LO0/c;->e(LO0/f;LO0/f;II)V

    .line 31
    invoke-virtual {v1, v8, v7, v15, v13}, LO0/c;->g(LO0/f;LO0/f;II)V

    goto :goto_7

    :cond_19
    const/4 v2, 0x5

    .line 32
    invoke-virtual {v1, v8, v7, v15, v2}, LO0/c;->e(LO0/f;LO0/f;II)V

    .line 33
    invoke-virtual {v1, v8, v7, v15, v13}, LO0/c;->g(LO0/f;LO0/f;II)V

    goto :goto_7

    :cond_1a
    const/4 v2, 0x5

    const/4 v10, 0x2

    if-ne v3, v10, :cond_1e

    .line 34
    iget v13, v12, LQ0/c;->e:I

    const/4 v15, 0x3

    if-eq v13, v15, :cond_1b

    if-ne v13, v2, :cond_1c

    :cond_1b
    const/4 v13, 0x4

    goto :goto_9

    .line 35
    :cond_1c
    iget-object v2, v0, LQ0/d;->T:LQ0/d;

    invoke-virtual {v2, v10}, LQ0/d;->i(I)LQ0/c;

    move-result-object v2

    invoke-virtual {v1, v2}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    move-result-object v2

    .line 36
    iget-object v10, v0, LQ0/d;->T:LQ0/d;

    const/4 v13, 0x4

    invoke-virtual {v10, v13}, LQ0/d;->i(I)LQ0/c;

    move-result-object v10

    invoke-virtual {v1, v10}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    move-result-object v10

    goto :goto_a

    .line 37
    :goto_9
    iget-object v2, v0, LQ0/d;->T:LQ0/d;

    const/4 v15, 0x3

    invoke-virtual {v2, v15}, LQ0/d;->i(I)LQ0/c;

    move-result-object v2

    invoke-virtual {v1, v2}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    move-result-object v2

    .line 38
    iget-object v10, v0, LQ0/d;->T:LQ0/d;

    const/4 v15, 0x5

    invoke-virtual {v10, v15}, LQ0/d;->i(I)LQ0/c;

    move-result-object v10

    invoke-virtual {v1, v10}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    move-result-object v10

    .line 39
    :goto_a
    invoke-virtual {v1}, LO0/c;->l()LO0/b;

    move-result-object v15

    .line 40
    iget-object v13, v15, LO0/b;->d:LO0/a;

    move/from16 p9, v4

    const/high16 v4, -0x40800000    # -1.0f

    invoke-virtual {v13, v8, v4}, LO0/a;->g(LO0/f;F)V

    .line 41
    iget-object v4, v15, LO0/b;->d:LO0/a;

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-virtual {v4, v7, v13}, LO0/a;->g(LO0/f;F)V

    .line 42
    iget-object v4, v15, LO0/b;->d:LO0/a;

    invoke-virtual {v4, v10, v6}, LO0/a;->g(LO0/f;F)V

    .line 43
    iget-object v4, v15, LO0/b;->d:LO0/a;

    neg-float v6, v6

    invoke-virtual {v4, v2, v6}, LO0/a;->g(LO0/f;F)V

    .line 44
    invoke-virtual {v1, v15}, LO0/c;->c(LO0/b;)V

    if-eqz p3, :cond_1d

    const/16 v24, 0x0

    :cond_1d
    move/from16 v10, p5

    move/from16 v13, p9

    goto :goto_b

    :cond_1e
    move/from16 p9, v4

    move/from16 v13, p9

    const/4 v10, 0x1

    :goto_b
    if-eqz p27, :cond_1f

    if-eqz p19, :cond_20

    :cond_1f
    move-object/from16 v15, p6

    move-object/from16 v3, p7

    move-object v2, v7

    move-object v7, v8

    move/from16 p5, v10

    const/4 v10, 0x2

    goto/16 :goto_2c

    :cond_20
    if-nez v16, :cond_21

    if-nez v17, :cond_21

    if-nez v19, :cond_21

    move-object/from16 v13, p11

    move-object v7, v8

    move/from16 p5, v10

    move-object/from16 v6, v20

    :goto_c
    const/4 v4, 0x5

    goto/16 :goto_28

    :cond_21
    if-eqz v16, :cond_23

    if-nez v17, :cond_23

    .line 45
    iget-object v2, v12, LQ0/c;->f:LQ0/c;

    iget-object v2, v2, LQ0/c;->d:LQ0/d;

    if-eqz p3, :cond_22

    .line 46
    instance-of v2, v2, LQ0/a;

    if-eqz v2, :cond_22

    const/16 v2, 0x8

    goto :goto_d

    :cond_22
    const/4 v2, 0x5

    :goto_d
    move-object/from16 v13, p11

    move-object v7, v8

    move/from16 p5, v10

    move-object/from16 v6, v20

    move/from16 v20, p3

    move v10, v2

    goto/16 :goto_29

    :cond_23
    if-nez v16, :cond_25

    if-eqz v17, :cond_25

    .line 47
    invoke-virtual/range {p11 .. p11}, LQ0/c;->e()I

    move-result v2

    neg-int v2, v2

    move-object/from16 v6, v20

    const/16 v13, 0x8

    invoke-virtual {v1, v8, v6, v2, v13}, LO0/c;->e(LO0/f;LO0/f;II)V

    if-eqz p3, :cond_24

    move-object/from16 v15, p6

    const/4 v2, 0x0

    const/4 v3, 0x5

    .line 48
    invoke-virtual {v1, v7, v15, v2, v3}, LO0/c;->f(LO0/f;LO0/f;II)V

    move-object/from16 v13, p11

    move v4, v3

    move-object v7, v8

    move/from16 p5, v10

    goto/16 :goto_28

    :cond_24
    move-object/from16 v13, p11

    move-object v7, v8

    move/from16 p5, v10

    goto :goto_c

    :cond_25
    move-object/from16 v15, p6

    move-object/from16 v6, v20

    if-eqz v16, :cond_24

    if-eqz v17, :cond_24

    .line 49
    iget-object v2, v12, LQ0/c;->f:LQ0/c;

    iget-object v11, v2, LQ0/c;->d:LQ0/d;

    move-object/from16 v2, p11

    .line 50
    iget-object v4, v2, LQ0/c;->f:LQ0/c;

    iget-object v4, v4, LQ0/c;->d:LQ0/d;

    move/from16 p5, v10

    .line 51
    iget-object v10, v0, LQ0/d;->T:LQ0/d;

    const/16 v16, 0x6

    if-eqz v24, :cond_3a

    if-nez v3, :cond_2a

    if-nez v5, :cond_27

    if-nez v13, :cond_27

    .line 52
    iget-boolean v5, v9, LO0/f;->f:Z

    if-eqz v5, :cond_26

    iget-boolean v5, v6, LO0/f;->f:Z

    if-eqz v5, :cond_26

    .line 53
    invoke-virtual {v12}, LQ0/c;->e()I

    move-result v3

    const/16 v13, 0x8

    invoke-virtual {v1, v7, v9, v3, v13}, LO0/c;->e(LO0/f;LO0/f;II)V

    .line 54
    invoke-virtual {v2}, LQ0/c;->e()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {v1, v8, v6, v2, v13}, LO0/c;->e(LO0/f;LO0/f;II)V

    return-void

    :cond_26
    const/16 v5, 0x8

    const/16 v17, 0x8

    const/16 v19, 0x0

    const/16 v20, 0x1

    const/16 v23, 0x0

    goto :goto_e

    :cond_27
    const/4 v5, 0x5

    const/16 v17, 0x5

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v23, 0x1

    .line 55
    :goto_e
    instance-of v1, v11, LQ0/a;

    if-nez v1, :cond_29

    instance-of v1, v4, LQ0/a;

    if-eqz v1, :cond_28

    goto :goto_10

    :cond_28
    move-object/from16 v1, p1

    move-object v2, v7

    move-object v7, v8

    move/from16 v25, v20

    move v8, v5

    move-object v5, v9

    move/from16 v9, v16

    move/from16 v20, v19

    move/from16 v19, v17

    move/from16 v17, v3

    :goto_f
    move-object/from16 v3, p7

    goto/16 :goto_1d

    :cond_29
    :goto_10
    move-object/from16 v1, p1

    move/from16 v17, v3

    move-object v2, v7

    move-object v7, v8

    move/from16 v25, v20

    move-object/from16 v3, p7

    move v8, v5

    move-object v5, v9

    move/from16 v9, v16

    move/from16 v20, v19

    const/16 v19, 0x4

    goto/16 :goto_1d

    :cond_2a
    const/4 v1, 0x2

    if-ne v3, v1, :cond_2d

    .line 56
    instance-of v1, v11, LQ0/a;

    if-nez v1, :cond_2c

    instance-of v1, v4, LQ0/a;

    if-eqz v1, :cond_2b

    goto :goto_12

    :cond_2b
    move-object/from16 v1, p1

    move/from16 v17, v3

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/4 v8, 0x5

    const/16 v19, 0x5

    :goto_11
    const/16 v20, 0x1

    const/16 v23, 0x1

    const/16 v25, 0x0

    goto :goto_f

    :cond_2c
    :goto_12
    move-object/from16 v1, p1

    move/from16 v17, v3

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/4 v8, 0x5

    :goto_13
    const/16 v19, 0x4

    goto :goto_11

    :cond_2d
    const/4 v1, 0x1

    if-ne v3, v1, :cond_2e

    move-object/from16 v1, p1

    move/from16 v17, v3

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/16 v8, 0x8

    goto :goto_13

    :cond_2e
    const/4 v1, 0x3

    if-ne v3, v1, :cond_39

    .line 57
    iget v1, v0, LQ0/d;->A:I

    move/from16 v17, v3

    const/4 v3, -0x1

    if-ne v1, v3, :cond_31

    if-eqz p20, :cond_30

    move-object/from16 v1, p1

    move-object/from16 v3, p7

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    const/16 v8, 0x8

    if-eqz p3, :cond_2f

    const/4 v9, 0x5

    :goto_14
    const/16 v19, 0x5

    :goto_15
    const/16 v20, 0x1

    const/16 v23, 0x1

    const/16 v25, 0x1

    goto/16 :goto_1d

    :cond_2f
    const/4 v9, 0x4

    goto :goto_14

    :cond_30
    move-object/from16 v1, p1

    move-object/from16 v3, p7

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    const/16 v8, 0x8

    const/16 v9, 0x8

    goto :goto_14

    :cond_31
    if-eqz p17, :cond_34

    move/from16 v3, p23

    const/4 v1, 0x2

    if-eq v3, v1, :cond_33

    const/4 v1, 0x1

    if-ne v3, v1, :cond_32

    goto :goto_16

    :cond_32
    const/16 v1, 0x8

    const/4 v3, 0x5

    goto :goto_17

    :cond_33
    :goto_16
    const/4 v1, 0x5

    const/4 v3, 0x4

    :goto_17
    move/from16 v19, v3

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/16 v20, 0x1

    const/16 v23, 0x1

    const/16 v25, 0x1

    move-object/from16 v3, p7

    :goto_18
    move v8, v1

    move-object/from16 v1, p1

    goto/16 :goto_1d

    :cond_34
    if-lez v5, :cond_35

    move-object/from16 v1, p1

    move-object/from16 v3, p7

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/4 v8, 0x5

    goto :goto_14

    :cond_35
    if-nez v5, :cond_38

    if-nez v13, :cond_38

    if-nez p20, :cond_36

    move-object/from16 v1, p1

    move-object/from16 v3, p7

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/4 v8, 0x5

    const/16 v19, 0x8

    goto :goto_15

    :cond_36
    if-eq v11, v10, :cond_37

    if-eq v4, v10, :cond_37

    const/4 v1, 0x4

    goto :goto_19

    :cond_37
    const/4 v1, 0x5

    :goto_19
    move-object/from16 v3, p7

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/16 v19, 0x4

    const/16 v20, 0x1

    const/16 v23, 0x1

    const/16 v25, 0x1

    goto :goto_18

    :cond_38
    move-object/from16 v1, p1

    move-object/from16 v3, p7

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/4 v8, 0x5

    const/16 v19, 0x4

    goto :goto_15

    :cond_39
    move/from16 v17, v3

    move-object/from16 v1, p1

    move-object/from16 v3, p7

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/4 v8, 0x5

    const/16 v19, 0x4

    const/16 v20, 0x0

    const/16 v23, 0x0

    :goto_1a
    const/16 v25, 0x0

    goto :goto_1d

    :cond_3a
    move/from16 v17, v3

    .line 58
    iget-boolean v1, v9, LO0/f;->f:Z

    if-eqz v1, :cond_3c

    iget-boolean v1, v6, LO0/f;->f:Z

    if-eqz v1, :cond_3c

    .line 59
    invoke-virtual {v12}, LQ0/c;->e()I

    move-result v1

    .line 60
    invoke-virtual {v2}, LQ0/c;->e()I

    move-result v3

    const/16 v4, 0x8

    move-object/from16 p17, p1

    move/from16 p21, p16

    move/from16 p20, v1

    move/from16 p24, v3

    move/from16 p25, v4

    move-object/from16 p22, v6

    move-object/from16 p18, v7

    move-object/from16 p23, v8

    move-object/from16 p19, v9

    .line 61
    invoke-virtual/range {p17 .. p25}, LO0/c;->b(LO0/f;LO0/f;IFLO0/f;LO0/f;II)V

    move-object/from16 v1, p17

    move-object/from16 v7, p23

    if-eqz p3, :cond_5b

    if-eqz p5, :cond_5b

    .line 62
    iget-object v3, v2, LQ0/c;->f:LQ0/c;

    if-eqz v3, :cond_3b

    .line 63
    invoke-virtual {v2}, LQ0/c;->e()I

    move-result v15

    :goto_1b
    move-object/from16 v3, p7

    goto :goto_1c

    :cond_3b
    const/4 v15, 0x0

    goto :goto_1b

    :goto_1c
    if-eq v6, v3, :cond_5b

    const/4 v2, 0x5

    .line 64
    invoke-virtual {v1, v3, v7, v15, v2}, LO0/c;->f(LO0/f;LO0/f;II)V

    return-void

    :cond_3c
    move-object/from16 v1, p1

    move-object/from16 v3, p7

    move-object v2, v7

    move-object v7, v8

    move-object v5, v9

    move/from16 v9, v16

    const/4 v8, 0x5

    const/16 v19, 0x4

    const/16 v20, 0x1

    const/16 v23, 0x1

    goto :goto_1a

    :goto_1d
    if-eqz v23, :cond_3d

    if-ne v5, v6, :cond_3d

    if-eq v11, v10, :cond_3d

    const/16 v23, 0x0

    const/16 v26, 0x0

    goto :goto_1e

    :cond_3d
    const/16 v26, 0x1

    :goto_1e
    if-eqz v20, :cond_3f

    if-nez v24, :cond_3e

    if-nez p18, :cond_3e

    if-nez p20, :cond_3e

    if-ne v5, v15, :cond_3e

    if-ne v6, v3, :cond_3e

    const/16 v9, 0x8

    const/16 v20, 0x0

    const/16 v26, 0x8

    const/16 v27, 0x0

    :goto_1f
    move-object v8, v4

    goto :goto_20

    :cond_3e
    move/from16 v20, p3

    move/from16 v27, v26

    move/from16 v26, v8

    goto :goto_1f

    .line 65
    :goto_20
    invoke-virtual {v12}, LQ0/c;->e()I

    move-result v4

    move-object/from16 v28, v8

    .line 66
    invoke-virtual/range {p11 .. p11}, LQ0/c;->e()I

    move-result v8

    move-object v3, v5

    move/from16 p9, v13

    move/from16 v12, v17

    move-object/from16 v14, v28

    move-object/from16 v13, p11

    move/from16 v5, p16

    .line 67
    invoke-virtual/range {v1 .. v9}, LO0/c;->b(LO0/f;LO0/f;IFLO0/f;LO0/f;II)V

    move-object v5, v3

    move/from16 v8, v26

    move/from16 v26, v27

    goto :goto_21

    :cond_3f
    move-object v14, v4

    move/from16 p9, v13

    move/from16 v12, v17

    move-object/from16 v13, p11

    move/from16 v20, p3

    .line 68
    :goto_21
    iget v3, v0, LQ0/d;->g0:I

    const/16 v4, 0x8

    if-ne v3, v4, :cond_41

    .line 69
    iget-object v3, v13, LQ0/c;->a:Ljava/util/HashSet;

    if-nez v3, :cond_40

    goto/16 :goto_30

    .line 70
    :cond_40
    invoke-virtual {v3}, Ljava/util/HashSet;->size()I

    move-result v3

    if-lez v3, :cond_5b

    :cond_41
    if-eqz v23, :cond_44

    if-eqz v20, :cond_43

    if-eq v5, v6, :cond_43

    if-nez v24, :cond_43

    .line 71
    instance-of v3, v11, LQ0/a;

    if-nez v3, :cond_42

    instance-of v3, v14, LQ0/a;

    if-eqz v3, :cond_43

    :cond_42
    move/from16 v8, v16

    .line 72
    :cond_43
    invoke-virtual/range {p10 .. p10}, LQ0/c;->e()I

    move-result v3

    invoke-virtual {v1, v2, v5, v3, v8}, LO0/c;->f(LO0/f;LO0/f;II)V

    .line 73
    invoke-virtual {v13}, LQ0/c;->e()I

    move-result v3

    neg-int v3, v3

    invoke-virtual {v1, v7, v6, v3, v8}, LO0/c;->g(LO0/f;LO0/f;II)V

    :cond_44
    if-eqz v20, :cond_45

    if-eqz p21, :cond_45

    .line 74
    instance-of v3, v11, LQ0/a;

    if-nez v3, :cond_45

    instance-of v3, v14, LQ0/a;

    if-nez v3, :cond_45

    if-eq v14, v10, :cond_45

    move/from16 v3, v16

    move v8, v3

    const/16 v21, 0x1

    goto :goto_22

    :cond_45
    move/from16 v3, v19

    move/from16 v21, v26

    :goto_22
    if-eqz v21, :cond_51

    if-eqz v25, :cond_4e

    if-eqz p20, :cond_46

    if-eqz p4, :cond_4e

    :cond_46
    if-eq v11, v10, :cond_48

    if-ne v14, v10, :cond_47

    goto :goto_23

    :cond_47
    move/from16 v16, v3

    .line 75
    :cond_48
    :goto_23
    instance-of v4, v11, LQ0/h;

    if-nez v4, :cond_49

    instance-of v4, v14, LQ0/h;

    if-eqz v4, :cond_4a

    :cond_49
    const/16 v16, 0x5

    .line 76
    :cond_4a
    instance-of v4, v11, LQ0/a;

    if-nez v4, :cond_4b

    instance-of v4, v14, LQ0/a;

    if-eqz v4, :cond_4c

    :cond_4b
    const/16 v16, 0x5

    :cond_4c
    if-eqz p20, :cond_4d

    const/4 v4, 0x5

    goto :goto_24

    :cond_4d
    move/from16 v4, v16

    .line 77
    :goto_24
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    :cond_4e
    if-eqz v20, :cond_50

    .line 78
    invoke-static {v8, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    if-eqz p17, :cond_50

    if-nez p20, :cond_50

    if-eq v11, v10, :cond_4f

    if-ne v14, v10, :cond_50

    :cond_4f
    const/4 v10, 0x4

    goto :goto_25

    :cond_50
    move v10, v3

    .line 79
    :goto_25
    invoke-virtual/range {p10 .. p10}, LQ0/c;->e()I

    move-result v3

    invoke-virtual {v1, v2, v5, v3, v10}, LO0/c;->e(LO0/f;LO0/f;II)V

    .line 80
    invoke-virtual {v13}, LQ0/c;->e()I

    move-result v3

    neg-int v3, v3

    invoke-virtual {v1, v7, v6, v3, v10}, LO0/c;->e(LO0/f;LO0/f;II)V

    :cond_51
    if-eqz v20, :cond_53

    if-ne v15, v5, :cond_52

    .line 81
    invoke-virtual/range {p10 .. p10}, LQ0/c;->e()I

    move-result v3

    goto :goto_26

    :cond_52
    const/4 v3, 0x0

    :goto_26
    if-eq v5, v15, :cond_53

    const/4 v4, 0x5

    .line 82
    invoke-virtual {v1, v2, v15, v3, v4}, LO0/c;->f(LO0/f;LO0/f;II)V

    :cond_53
    if-eqz v20, :cond_54

    if-eqz v24, :cond_54

    if-nez p14, :cond_54

    if-nez p9, :cond_54

    if-eqz v24, :cond_55

    const/4 v15, 0x3

    if-ne v12, v15, :cond_55

    const/16 v4, 0x8

    const/4 v10, 0x0

    .line 83
    invoke-virtual {v1, v7, v2, v10, v4}, LO0/c;->f(LO0/f;LO0/f;II)V

    :cond_54
    const/4 v4, 0x5

    goto :goto_27

    :cond_55
    const/4 v10, 0x0

    const/4 v4, 0x5

    .line 84
    invoke-virtual {v1, v7, v2, v10, v4}, LO0/c;->f(LO0/f;LO0/f;II)V

    :goto_27
    move v10, v4

    goto :goto_29

    :goto_28
    move/from16 v20, p3

    goto :goto_27

    :goto_29
    if-eqz v20, :cond_5b

    if-eqz p5, :cond_5b

    .line 85
    iget-object v2, v13, LQ0/c;->f:LQ0/c;

    if-eqz v2, :cond_56

    .line 86
    invoke-virtual {v13}, LQ0/c;->e()I

    move-result v15

    :goto_2a
    move-object/from16 v3, p7

    goto :goto_2b

    :cond_56
    const/4 v15, 0x0

    goto :goto_2a

    :goto_2b
    if-eq v6, v3, :cond_5b

    .line 87
    invoke-virtual {v1, v3, v7, v15, v10}, LO0/c;->f(LO0/f;LO0/f;II)V

    return-void

    :goto_2c
    if-ge v11, v10, :cond_5b

    if-eqz p3, :cond_5b

    if-eqz p5, :cond_5b

    const/4 v10, 0x0

    const/16 v13, 0x8

    .line 88
    invoke-virtual {v1, v2, v15, v10, v13}, LO0/c;->f(LO0/f;LO0/f;II)V

    .line 89
    iget-object v2, v0, LQ0/d;->M:LQ0/c;

    if-nez p2, :cond_58

    iget-object v4, v2, LQ0/c;->f:LQ0/c;

    if-nez v4, :cond_57

    goto :goto_2d

    :cond_57
    const/4 v10, 0x0

    goto :goto_2e

    :cond_58
    :goto_2d
    const/4 v10, 0x1

    :goto_2e
    if-nez p2, :cond_5a

    .line 90
    iget-object v2, v2, LQ0/c;->f:LQ0/c;

    if-eqz v2, :cond_5a

    .line 91
    iget-object v2, v2, LQ0/c;->d:LQ0/d;

    iget v4, v2, LQ0/d;->W:F

    const/4 v5, 0x0

    cmpl-float v4, v4, v5

    if-eqz v4, :cond_59

    iget-object v2, v2, LQ0/d;->p0:[I

    const/16 v22, 0x0

    aget v4, v2, v22

    const/4 v15, 0x3

    if-ne v4, v15, :cond_59

    const/16 v21, 0x1

    aget v2, v2, v21

    if-ne v2, v15, :cond_59

    move/from16 v10, v21

    goto :goto_2f

    :cond_59
    const/4 v10, 0x0

    :cond_5a
    :goto_2f
    if-eqz v10, :cond_5b

    const/4 v10, 0x0

    const/16 v13, 0x8

    .line 92
    invoke-virtual {v1, v3, v7, v10, v13}, LO0/c;->f(LO0/f;LO0/f;II)V

    :cond_5b
    :goto_30
    return-void
.end method

.method public final e(ILQ0/d;II)V
    .locals 10

    .line 1
    const/4 v0, 0x7

    .line 2
    const/16 v1, 0x9

    .line 3
    .line 4
    const/16 v2, 0x8

    .line 5
    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x3

    .line 8
    const/4 v5, 0x4

    .line 9
    const/4 v6, 0x5

    .line 10
    const/4 v7, 0x0

    .line 11
    if-ne p1, v0, :cond_c

    .line 12
    .line 13
    if-ne p3, v0, :cond_8

    .line 14
    .line 15
    invoke-virtual {p0, v3}, LQ0/d;->i(I)LQ0/c;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0, v5}, LQ0/d;->i(I)LQ0/c;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-virtual {p0, v4}, LQ0/d;->i(I)LQ0/c;

    .line 24
    .line 25
    .line 26
    move-result-object p4

    .line 27
    invoke-virtual {p0, v6}, LQ0/d;->i(I)LQ0/c;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    const/4 v9, 0x1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1}, LQ0/c;->h()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-nez p1, :cond_1

    .line 39
    .line 40
    :cond_0
    if-eqz p3, :cond_2

    .line 41
    .line 42
    invoke-virtual {p3}, LQ0/c;->h()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    :cond_1
    move p1, v7

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {p0, v3, p2, v3, v7}, LQ0/d;->e(ILQ0/d;II)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v5, p2, v5, v7}, LQ0/d;->e(ILQ0/d;II)V

    .line 54
    .line 55
    .line 56
    move p1, v9

    .line 57
    :goto_0
    if-eqz p4, :cond_3

    .line 58
    .line 59
    invoke-virtual {p4}, LQ0/c;->h()Z

    .line 60
    .line 61
    .line 62
    move-result p3

    .line 63
    if-nez p3, :cond_4

    .line 64
    .line 65
    :cond_3
    if-eqz v8, :cond_5

    .line 66
    .line 67
    invoke-virtual {v8}, LQ0/c;->h()Z

    .line 68
    .line 69
    .line 70
    move-result p3

    .line 71
    if-eqz p3, :cond_5

    .line 72
    .line 73
    :cond_4
    move v9, v7

    .line 74
    goto :goto_1

    .line 75
    :cond_5
    invoke-virtual {p0, v4, p2, v4, v7}, LQ0/d;->e(ILQ0/d;II)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v6, p2, v6, v7}, LQ0/d;->e(ILQ0/d;II)V

    .line 79
    .line 80
    .line 81
    :goto_1
    if-eqz p1, :cond_6

    .line 82
    .line 83
    if-eqz v9, :cond_6

    .line 84
    .line 85
    invoke-virtual {p0, v0}, LQ0/d;->i(I)LQ0/c;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p2, v0}, LQ0/d;->i(I)LQ0/c;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-virtual {p1, p2, v7}, LQ0/c;->a(LQ0/c;I)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_6
    if-eqz p1, :cond_7

    .line 98
    .line 99
    invoke-virtual {p0, v2}, LQ0/d;->i(I)LQ0/c;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p2, v2}, LQ0/d;->i(I)LQ0/c;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-virtual {p1, p2, v7}, LQ0/c;->a(LQ0/c;I)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_7
    if-eqz v9, :cond_1c

    .line 112
    .line 113
    invoke-virtual {p0, v1}, LQ0/d;->i(I)LQ0/c;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {p2, v1}, LQ0/d;->i(I)LQ0/c;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-virtual {p1, p2, v7}, LQ0/c;->a(LQ0/c;I)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_8
    if-eq p3, v3, :cond_b

    .line 126
    .line 127
    if-ne p3, v5, :cond_9

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_9
    if-eq p3, v4, :cond_a

    .line 131
    .line 132
    if-ne p3, v6, :cond_1c

    .line 133
    .line 134
    :cond_a
    invoke-virtual {p0, v4, p2, p3, v7}, LQ0/d;->e(ILQ0/d;II)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, v6, p2, p3, v7}, LQ0/d;->e(ILQ0/d;II)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, v0}, LQ0/d;->i(I)LQ0/c;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {p2, p3}, LQ0/d;->i(I)LQ0/c;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    invoke-virtual {p1, p2, v7}, LQ0/c;->a(LQ0/c;I)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_b
    :goto_2
    invoke-virtual {p0, v3, p2, p3, v7}, LQ0/d;->e(ILQ0/d;II)V

    .line 153
    .line 154
    .line 155
    :try_start_0
    invoke-virtual {p0, v5, p2, p3, v7}, LQ0/d;->e(ILQ0/d;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0, v0}, LQ0/d;->i(I)LQ0/c;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-virtual {p2, p3}, LQ0/d;->i(I)LQ0/c;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    invoke-virtual {p1, p2, v7}, LQ0/c;->a(LQ0/c;I)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :catchall_0
    move-exception p1

    .line 171
    throw p1

    .line 172
    :cond_c
    if-ne p1, v2, :cond_e

    .line 173
    .line 174
    if-eq p3, v3, :cond_d

    .line 175
    .line 176
    if-ne p3, v5, :cond_e

    .line 177
    .line 178
    :cond_d
    invoke-virtual {p0, v3}, LQ0/d;->i(I)LQ0/c;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {p2, p3}, LQ0/d;->i(I)LQ0/c;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    invoke-virtual {p0, v5}, LQ0/d;->i(I)LQ0/c;

    .line 187
    .line 188
    .line 189
    move-result-object p3

    .line 190
    invoke-virtual {p1, p2, v7}, LQ0/c;->a(LQ0/c;I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p3, p2, v7}, LQ0/c;->a(LQ0/c;I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0, v2}, LQ0/d;->i(I)LQ0/c;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-virtual {p1, p2, v7}, LQ0/c;->a(LQ0/c;I)V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :cond_e
    if-ne p1, v1, :cond_10

    .line 205
    .line 206
    if-eq p3, v4, :cond_f

    .line 207
    .line 208
    if-ne p3, v6, :cond_10

    .line 209
    .line 210
    :cond_f
    invoke-virtual {p2, p3}, LQ0/d;->i(I)LQ0/c;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-virtual {p0, v4}, LQ0/d;->i(I)LQ0/c;

    .line 215
    .line 216
    .line 217
    move-result-object p2

    .line 218
    invoke-virtual {p2, p1, v7}, LQ0/c;->a(LQ0/c;I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p0, v6}, LQ0/d;->i(I)LQ0/c;

    .line 222
    .line 223
    .line 224
    move-result-object p2

    .line 225
    invoke-virtual {p2, p1, v7}, LQ0/c;->a(LQ0/c;I)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0, v1}, LQ0/d;->i(I)LQ0/c;

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    invoke-virtual {p2, p1, v7}, LQ0/c;->a(LQ0/c;I)V

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :cond_10
    if-ne p1, v2, :cond_11

    .line 237
    .line 238
    if-ne p3, v2, :cond_11

    .line 239
    .line 240
    invoke-virtual {p0, v3}, LQ0/d;->i(I)LQ0/c;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    invoke-virtual {p2, v3}, LQ0/d;->i(I)LQ0/c;

    .line 245
    .line 246
    .line 247
    move-result-object p4

    .line 248
    invoke-virtual {p1, p4, v7}, LQ0/c;->a(LQ0/c;I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p0, v5}, LQ0/d;->i(I)LQ0/c;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    invoke-virtual {p2, v5}, LQ0/d;->i(I)LQ0/c;

    .line 256
    .line 257
    .line 258
    move-result-object p4

    .line 259
    invoke-virtual {p1, p4, v7}, LQ0/c;->a(LQ0/c;I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {p0, v2}, LQ0/d;->i(I)LQ0/c;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-virtual {p2, p3}, LQ0/d;->i(I)LQ0/c;

    .line 267
    .line 268
    .line 269
    move-result-object p2

    .line 270
    invoke-virtual {p1, p2, v7}, LQ0/c;->a(LQ0/c;I)V

    .line 271
    .line 272
    .line 273
    return-void

    .line 274
    :cond_11
    if-ne p1, v1, :cond_12

    .line 275
    .line 276
    if-ne p3, v1, :cond_12

    .line 277
    .line 278
    invoke-virtual {p0, v4}, LQ0/d;->i(I)LQ0/c;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    invoke-virtual {p2, v4}, LQ0/d;->i(I)LQ0/c;

    .line 283
    .line 284
    .line 285
    move-result-object p4

    .line 286
    invoke-virtual {p1, p4, v7}, LQ0/c;->a(LQ0/c;I)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {p0, v6}, LQ0/d;->i(I)LQ0/c;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    invoke-virtual {p2, v6}, LQ0/d;->i(I)LQ0/c;

    .line 294
    .line 295
    .line 296
    move-result-object p4

    .line 297
    invoke-virtual {p1, p4, v7}, LQ0/c;->a(LQ0/c;I)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {p0, v1}, LQ0/d;->i(I)LQ0/c;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    invoke-virtual {p2, p3}, LQ0/d;->i(I)LQ0/c;

    .line 305
    .line 306
    .line 307
    move-result-object p2

    .line 308
    invoke-virtual {p1, p2, v7}, LQ0/c;->a(LQ0/c;I)V

    .line 309
    .line 310
    .line 311
    return-void

    .line 312
    :cond_12
    invoke-virtual {p0, p1}, LQ0/d;->i(I)LQ0/c;

    .line 313
    .line 314
    .line 315
    move-result-object v7

    .line 316
    invoke-virtual {p2, p3}, LQ0/d;->i(I)LQ0/c;

    .line 317
    .line 318
    .line 319
    move-result-object p2

    .line 320
    invoke-virtual {v7, p2}, LQ0/c;->i(LQ0/c;)Z

    .line 321
    .line 322
    .line 323
    move-result p3

    .line 324
    if-eqz p3, :cond_1c

    .line 325
    .line 326
    const/4 p3, 0x6

    .line 327
    if-ne p1, p3, :cond_14

    .line 328
    .line 329
    invoke-virtual {p0, v4}, LQ0/d;->i(I)LQ0/c;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    invoke-virtual {p0, v6}, LQ0/d;->i(I)LQ0/c;

    .line 334
    .line 335
    .line 336
    move-result-object p3

    .line 337
    if-eqz p1, :cond_13

    .line 338
    .line 339
    invoke-virtual {p1}, LQ0/c;->j()V

    .line 340
    .line 341
    .line 342
    :cond_13
    if-eqz p3, :cond_1b

    .line 343
    .line 344
    invoke-virtual {p3}, LQ0/c;->j()V

    .line 345
    .line 346
    .line 347
    goto :goto_4

    .line 348
    :cond_14
    if-eq p1, v4, :cond_18

    .line 349
    .line 350
    if-ne p1, v6, :cond_15

    .line 351
    .line 352
    goto :goto_3

    .line 353
    :cond_15
    if-eq p1, v3, :cond_16

    .line 354
    .line 355
    if-ne p1, v5, :cond_1b

    .line 356
    .line 357
    :cond_16
    invoke-virtual {p0, v0}, LQ0/d;->i(I)LQ0/c;

    .line 358
    .line 359
    .line 360
    move-result-object p3

    .line 361
    iget-object v0, p3, LQ0/c;->f:LQ0/c;

    .line 362
    .line 363
    if-eq v0, p2, :cond_17

    .line 364
    .line 365
    invoke-virtual {p3}, LQ0/c;->j()V

    .line 366
    .line 367
    .line 368
    :cond_17
    invoke-virtual {p0, p1}, LQ0/d;->i(I)LQ0/c;

    .line 369
    .line 370
    .line 371
    move-result-object p1

    .line 372
    invoke-virtual {p1}, LQ0/c;->f()LQ0/c;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    invoke-virtual {p0, v2}, LQ0/d;->i(I)LQ0/c;

    .line 377
    .line 378
    .line 379
    move-result-object p3

    .line 380
    invoke-virtual {p3}, LQ0/c;->h()Z

    .line 381
    .line 382
    .line 383
    move-result v0

    .line 384
    if-eqz v0, :cond_1b

    .line 385
    .line 386
    invoke-virtual {p1}, LQ0/c;->j()V

    .line 387
    .line 388
    .line 389
    invoke-virtual {p3}, LQ0/c;->j()V

    .line 390
    .line 391
    .line 392
    goto :goto_4

    .line 393
    :cond_18
    :goto_3
    invoke-virtual {p0, p3}, LQ0/d;->i(I)LQ0/c;

    .line 394
    .line 395
    .line 396
    move-result-object p3

    .line 397
    if-eqz p3, :cond_19

    .line 398
    .line 399
    invoke-virtual {p3}, LQ0/c;->j()V

    .line 400
    .line 401
    .line 402
    :cond_19
    invoke-virtual {p0, v0}, LQ0/d;->i(I)LQ0/c;

    .line 403
    .line 404
    .line 405
    move-result-object p3

    .line 406
    iget-object v0, p3, LQ0/c;->f:LQ0/c;

    .line 407
    .line 408
    if-eq v0, p2, :cond_1a

    .line 409
    .line 410
    invoke-virtual {p3}, LQ0/c;->j()V

    .line 411
    .line 412
    .line 413
    :cond_1a
    invoke-virtual {p0, p1}, LQ0/d;->i(I)LQ0/c;

    .line 414
    .line 415
    .line 416
    move-result-object p1

    .line 417
    invoke-virtual {p1}, LQ0/c;->f()LQ0/c;

    .line 418
    .line 419
    .line 420
    move-result-object p1

    .line 421
    invoke-virtual {p0, v1}, LQ0/d;->i(I)LQ0/c;

    .line 422
    .line 423
    .line 424
    move-result-object p3

    .line 425
    invoke-virtual {p3}, LQ0/c;->h()Z

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    if-eqz v0, :cond_1b

    .line 430
    .line 431
    invoke-virtual {p1}, LQ0/c;->j()V

    .line 432
    .line 433
    .line 434
    invoke-virtual {p3}, LQ0/c;->j()V

    .line 435
    .line 436
    .line 437
    :cond_1b
    :goto_4
    invoke-virtual {v7, p2, p4}, LQ0/c;->a(LQ0/c;I)V

    .line 438
    .line 439
    .line 440
    :cond_1c
    return-void
.end method

.method public final f(LQ0/c;LQ0/c;I)V
    .locals 1

    .line 1
    iget-object v0, p1, LQ0/c;->d:LQ0/d;

    .line 2
    .line 3
    if-ne v0, p0, :cond_0

    .line 4
    .line 5
    iget-object v0, p2, LQ0/c;->d:LQ0/d;

    .line 6
    .line 7
    iget p1, p1, LQ0/c;->e:I

    .line 8
    .line 9
    iget p2, p2, LQ0/c;->e:I

    .line 10
    .line 11
    invoke-virtual {p0, p1, v0, p2, p3}, LQ0/d;->e(ILQ0/d;II)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final g(LO0/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, LQ0/d;->I:LQ0/c;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LQ0/d;->J:LQ0/c;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LQ0/d;->K:LQ0/c;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LQ0/d;->L:LQ0/c;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 19
    .line 20
    .line 21
    iget v0, p0, LQ0/d;->a0:I

    .line 22
    .line 23
    if-lez v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, LQ0/d;->M:LQ0/c;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public final h()V
    .locals 4

    .line 1
    iget-object v0, p0, LQ0/d;->d:LR0/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LR0/k;

    .line 6
    .line 7
    invoke-direct {v0, p0}, LR0/o;-><init>(LQ0/d;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, LR0/o;->h:LR0/f;

    .line 11
    .line 12
    const/4 v2, 0x4

    .line 13
    iput v2, v1, LR0/f;->e:I

    .line 14
    .line 15
    iget-object v1, v0, LR0/o;->i:LR0/f;

    .line 16
    .line 17
    const/4 v2, 0x5

    .line 18
    iput v2, v1, LR0/f;->e:I

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    iput v1, v0, LR0/o;->f:I

    .line 22
    .line 23
    iput-object v0, p0, LQ0/d;->d:LR0/k;

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, LQ0/d;->e:LR0/m;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    new-instance v0, LR0/m;

    .line 30
    .line 31
    invoke-direct {v0, p0}, LR0/o;-><init>(LQ0/d;)V

    .line 32
    .line 33
    .line 34
    new-instance v1, LR0/f;

    .line 35
    .line 36
    invoke-direct {v1, v0}, LR0/f;-><init>(LR0/o;)V

    .line 37
    .line 38
    .line 39
    iput-object v1, v0, LR0/m;->k:LR0/f;

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    iput-object v2, v0, LR0/m;->l:LR0/a;

    .line 43
    .line 44
    iget-object v2, v0, LR0/o;->h:LR0/f;

    .line 45
    .line 46
    const/4 v3, 0x6

    .line 47
    iput v3, v2, LR0/f;->e:I

    .line 48
    .line 49
    iget-object v2, v0, LR0/o;->i:LR0/f;

    .line 50
    .line 51
    const/4 v3, 0x7

    .line 52
    iput v3, v2, LR0/f;->e:I

    .line 53
    .line 54
    const/16 v2, 0x8

    .line 55
    .line 56
    iput v2, v1, LR0/f;->e:I

    .line 57
    .line 58
    const/4 v1, 0x1

    .line 59
    iput v1, v0, LR0/o;->f:I

    .line 60
    .line 61
    iput-object v0, p0, LQ0/d;->e:LR0/m;

    .line 62
    .line 63
    :cond_1
    return-void
.end method

.method public i(I)LQ0/c;
    .locals 1

    .line 1
    invoke-static {p1}, LA/f;->f(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/lang/AssertionError;

    .line 9
    .line 10
    invoke-static {p1}, LN0/a;->t(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    throw v0

    .line 18
    :pswitch_0
    iget-object p1, p0, LQ0/d;->O:LQ0/c;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_1
    iget-object p1, p0, LQ0/d;->N:LQ0/c;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_2
    iget-object p1, p0, LQ0/d;->P:LQ0/c;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_3
    iget-object p1, p0, LQ0/d;->M:LQ0/c;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_4
    iget-object p1, p0, LQ0/d;->L:LQ0/c;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_5
    iget-object p1, p0, LQ0/d;->K:LQ0/c;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_6
    iget-object p1, p0, LQ0/d;->J:LQ0/c;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_7
    iget-object p1, p0, LQ0/d;->I:LQ0/c;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_8
    const/4 p1, 0x0

    .line 43
    return-object p1

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final j(I)I
    .locals 3

    .line 1
    iget-object v0, p0, LQ0/d;->p0:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    aget p1, v0, v1

    .line 7
    .line 8
    return p1

    .line 9
    :cond_0
    const/4 v2, 0x1

    .line 10
    if-ne p1, v2, :cond_1

    .line 11
    .line 12
    aget p1, v0, v2

    .line 13
    .line 14
    return p1

    .line 15
    :cond_1
    return v1
.end method

.method public final k()I
    .locals 2

    .line 1
    iget v0, p0, LQ0/d;->g0:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    iget v0, p0, LQ0/d;->V:I

    .line 10
    .line 11
    return v0
.end method

.method public final l(I)LQ0/d;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, LQ0/d;->K:LQ0/c;

    .line 4
    .line 5
    iget-object v0, p1, LQ0/c;->f:LQ0/c;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v1, v0, LQ0/c;->f:LQ0/c;

    .line 10
    .line 11
    if-ne v1, p1, :cond_1

    .line 12
    .line 13
    iget-object p1, v0, LQ0/c;->d:LQ0/d;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 v0, 0x1

    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, LQ0/d;->L:LQ0/c;

    .line 20
    .line 21
    iget-object v0, p1, LQ0/c;->f:LQ0/c;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v1, v0, LQ0/c;->f:LQ0/c;

    .line 26
    .line 27
    if-ne v1, p1, :cond_1

    .line 28
    .line 29
    iget-object p1, v0, LQ0/c;->d:LQ0/d;

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_1
    const/4 p1, 0x0

    .line 33
    return-object p1
.end method

.method public final m(I)LQ0/d;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, LQ0/d;->I:LQ0/c;

    .line 4
    .line 5
    iget-object v0, p1, LQ0/c;->f:LQ0/c;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v1, v0, LQ0/c;->f:LQ0/c;

    .line 10
    .line 11
    if-ne v1, p1, :cond_1

    .line 12
    .line 13
    iget-object p1, v0, LQ0/c;->d:LQ0/d;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 v0, 0x1

    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, LQ0/d;->J:LQ0/c;

    .line 20
    .line 21
    iget-object v0, p1, LQ0/c;->f:LQ0/c;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v1, v0, LQ0/c;->f:LQ0/c;

    .line 26
    .line 27
    if-ne v1, p1, :cond_1

    .line 28
    .line 29
    iget-object p1, v0, LQ0/c;->d:LQ0/d;

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_1
    const/4 p1, 0x0

    .line 33
    return-object p1
.end method

.method public n(Ljava/lang/StringBuilder;)V
    .locals 11

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v2, "  "

    .line 4
    .line 5
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, LQ0/d;->j:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v2, ":{\n"

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v2, "    actualWidth:"

    .line 28
    .line 29
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget v2, p0, LQ0/d;->U:I

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, "\n"

    .line 45
    .line 46
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    new-instance v2, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v3, "    actualHeight:"

    .line 52
    .line 53
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget v3, p0, LQ0/d;->V:I

    .line 57
    .line 58
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    new-instance v2, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v3, "    actualLeft:"

    .line 74
    .line 75
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget v3, p0, LQ0/d;->Y:I

    .line 79
    .line 80
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    new-instance v2, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    const-string v3, "    actualTop:"

    .line 96
    .line 97
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    iget v3, p0, LQ0/d;->Z:I

    .line 101
    .line 102
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v1, "left"

    .line 116
    .line 117
    iget-object v2, p0, LQ0/d;->I:LQ0/c;

    .line 118
    .line 119
    invoke-static {p1, v1, v2}, LQ0/d;->p(Ljava/lang/StringBuilder;Ljava/lang/String;LQ0/c;)V

    .line 120
    .line 121
    .line 122
    const-string v1, "top"

    .line 123
    .line 124
    iget-object v2, p0, LQ0/d;->J:LQ0/c;

    .line 125
    .line 126
    invoke-static {p1, v1, v2}, LQ0/d;->p(Ljava/lang/StringBuilder;Ljava/lang/String;LQ0/c;)V

    .line 127
    .line 128
    .line 129
    const-string v1, "right"

    .line 130
    .line 131
    iget-object v2, p0, LQ0/d;->K:LQ0/c;

    .line 132
    .line 133
    invoke-static {p1, v1, v2}, LQ0/d;->p(Ljava/lang/StringBuilder;Ljava/lang/String;LQ0/c;)V

    .line 134
    .line 135
    .line 136
    const-string v1, "bottom"

    .line 137
    .line 138
    iget-object v2, p0, LQ0/d;->L:LQ0/c;

    .line 139
    .line 140
    invoke-static {p1, v1, v2}, LQ0/d;->p(Ljava/lang/StringBuilder;Ljava/lang/String;LQ0/c;)V

    .line 141
    .line 142
    .line 143
    const-string v1, "baseline"

    .line 144
    .line 145
    iget-object v2, p0, LQ0/d;->M:LQ0/c;

    .line 146
    .line 147
    invoke-static {p1, v1, v2}, LQ0/d;->p(Ljava/lang/StringBuilder;Ljava/lang/String;LQ0/c;)V

    .line 148
    .line 149
    .line 150
    const-string v1, "centerX"

    .line 151
    .line 152
    iget-object v2, p0, LQ0/d;->N:LQ0/c;

    .line 153
    .line 154
    invoke-static {p1, v1, v2}, LQ0/d;->p(Ljava/lang/StringBuilder;Ljava/lang/String;LQ0/c;)V

    .line 155
    .line 156
    .line 157
    const-string v1, "centerY"

    .line 158
    .line 159
    iget-object v2, p0, LQ0/d;->O:LQ0/c;

    .line 160
    .line 161
    invoke-static {p1, v1, v2}, LQ0/d;->p(Ljava/lang/StringBuilder;Ljava/lang/String;LQ0/c;)V

    .line 162
    .line 163
    .line 164
    iget v2, p0, LQ0/d;->U:I

    .line 165
    .line 166
    iget v3, p0, LQ0/d;->b0:I

    .line 167
    .line 168
    iget-object v8, p0, LQ0/d;->C:[I

    .line 169
    .line 170
    const/4 v9, 0x0

    .line 171
    aget v4, v8, v9

    .line 172
    .line 173
    iget v5, p0, LQ0/d;->u:I

    .line 174
    .line 175
    iget v6, p0, LQ0/d;->r:I

    .line 176
    .line 177
    iget v7, p0, LQ0/d;->w:F

    .line 178
    .line 179
    iget-object v10, p0, LQ0/d;->k0:[F

    .line 180
    .line 181
    aget v1, v10, v9

    .line 182
    .line 183
    const-string v1, "    width"

    .line 184
    .line 185
    move-object v0, p1

    .line 186
    invoke-static/range {v0 .. v7}, LQ0/d;->o(Ljava/lang/StringBuilder;Ljava/lang/String;IIIIIF)V

    .line 187
    .line 188
    .line 189
    iget v2, p0, LQ0/d;->V:I

    .line 190
    .line 191
    iget v3, p0, LQ0/d;->c0:I

    .line 192
    .line 193
    const/4 v0, 0x1

    .line 194
    aget v4, v8, v0

    .line 195
    .line 196
    iget v5, p0, LQ0/d;->x:I

    .line 197
    .line 198
    iget v6, p0, LQ0/d;->s:I

    .line 199
    .line 200
    iget v7, p0, LQ0/d;->z:F

    .line 201
    .line 202
    aget v0, v10, v0

    .line 203
    .line 204
    const-string v1, "    height"

    .line 205
    .line 206
    move-object v0, p1

    .line 207
    invoke-static/range {v0 .. v7}, LQ0/d;->o(Ljava/lang/StringBuilder;Ljava/lang/String;IIIIIF)V

    .line 208
    .line 209
    .line 210
    iget v1, p0, LQ0/d;->W:F

    .line 211
    .line 212
    iget v2, p0, LQ0/d;->X:I

    .line 213
    .line 214
    const/4 v3, 0x0

    .line 215
    cmpl-float v3, v1, v3

    .line 216
    .line 217
    if-nez v3, :cond_0

    .line 218
    .line 219
    goto :goto_0

    .line 220
    :cond_0
    const-string v3, "    dimensionRatio"

    .line 221
    .line 222
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    const-string v3, " :  ["

    .line 226
    .line 227
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    const-string v1, ","

    .line 234
    .line 235
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    const-string v1, ""

    .line 242
    .line 243
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    const-string v1, "],\n"

    .line 247
    .line 248
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    :goto_0
    iget v1, p0, LQ0/d;->d0:F

    .line 252
    .line 253
    const-string v2, "    horizontalBias"

    .line 254
    .line 255
    const/high16 v3, 0x3f000000    # 0.5f

    .line 256
    .line 257
    invoke-static {p1, v2, v1, v3}, LQ0/d;->H(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V

    .line 258
    .line 259
    .line 260
    const-string v1, "    verticalBias"

    .line 261
    .line 262
    iget v2, p0, LQ0/d;->e0:F

    .line 263
    .line 264
    invoke-static {p1, v1, v2, v3}, LQ0/d;->H(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V

    .line 265
    .line 266
    .line 267
    const-string v1, "    horizontalChainStyle"

    .line 268
    .line 269
    iget v2, p0, LQ0/d;->i0:I

    .line 270
    .line 271
    invoke-static {v2, v9, v1, p1}, LQ0/d;->G(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 272
    .line 273
    .line 274
    const-string v1, "    verticalChainStyle"

    .line 275
    .line 276
    iget v2, p0, LQ0/d;->j0:I

    .line 277
    .line 278
    invoke-static {v2, v9, v1, p1}, LQ0/d;->G(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 279
    .line 280
    .line 281
    const-string v1, "  }"

    .line 282
    .line 283
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    return-void
.end method

.method public final q()I
    .locals 2

    .line 1
    iget v0, p0, LQ0/d;->g0:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    iget v0, p0, LQ0/d;->U:I

    .line 10
    .line 11
    return v0
.end method

.method public final r()I
    .locals 2

    .line 1
    iget-object v0, p0, LQ0/d;->T:LQ0/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v1, v0, LQ0/e;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, LQ0/e;

    .line 10
    .line 11
    iget v0, v0, LQ0/e;->x0:I

    .line 12
    .line 13
    iget v1, p0, LQ0/d;->Y:I

    .line 14
    .line 15
    add-int/2addr v0, v1

    .line 16
    return v0

    .line 17
    :cond_0
    iget v0, p0, LQ0/d;->Y:I

    .line 18
    .line 19
    return v0
.end method

.method public final s()I
    .locals 2

    .line 1
    iget-object v0, p0, LQ0/d;->T:LQ0/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v1, v0, LQ0/e;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, LQ0/e;

    .line 10
    .line 11
    iget v0, v0, LQ0/e;->y0:I

    .line 12
    .line 13
    iget v1, p0, LQ0/d;->Z:I

    .line 14
    .line 15
    add-int/2addr v0, v1

    .line 16
    return v0

    .line 17
    :cond_0
    iget v0, p0, LQ0/d;->Z:I

    .line 18
    .line 19
    return v0
.end method

.method public final t(I)Z
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    if-nez p1, :cond_2

    .line 5
    .line 6
    iget-object p1, p0, LQ0/d;->I:LQ0/c;

    .line 7
    .line 8
    iget-object p1, p1, LQ0/c;->f:LQ0/c;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    move p1, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move p1, v1

    .line 15
    :goto_0
    iget-object v3, p0, LQ0/d;->K:LQ0/c;

    .line 16
    .line 17
    iget-object v3, v3, LQ0/c;->f:LQ0/c;

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    move v3, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v3, v1

    .line 24
    :goto_1
    add-int/2addr p1, v3

    .line 25
    if-ge p1, v0, :cond_6

    .line 26
    .line 27
    goto :goto_5

    .line 28
    :cond_2
    iget-object p1, p0, LQ0/d;->J:LQ0/c;

    .line 29
    .line 30
    iget-object p1, p1, LQ0/c;->f:LQ0/c;

    .line 31
    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    move p1, v2

    .line 35
    goto :goto_2

    .line 36
    :cond_3
    move p1, v1

    .line 37
    :goto_2
    iget-object v3, p0, LQ0/d;->L:LQ0/c;

    .line 38
    .line 39
    iget-object v3, v3, LQ0/c;->f:LQ0/c;

    .line 40
    .line 41
    if-eqz v3, :cond_4

    .line 42
    .line 43
    move v3, v2

    .line 44
    goto :goto_3

    .line 45
    :cond_4
    move v3, v1

    .line 46
    :goto_3
    add-int/2addr p1, v3

    .line 47
    iget-object v3, p0, LQ0/d;->M:LQ0/c;

    .line 48
    .line 49
    iget-object v3, v3, LQ0/c;->f:LQ0/c;

    .line 50
    .line 51
    if-eqz v3, :cond_5

    .line 52
    .line 53
    move v3, v2

    .line 54
    goto :goto_4

    .line 55
    :cond_5
    move v3, v1

    .line 56
    :goto_4
    add-int/2addr p1, v3

    .line 57
    if-ge p1, v0, :cond_6

    .line 58
    .line 59
    :goto_5
    return v2

    .line 60
    :cond_6
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-static {v0}, LN0/a;->j(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, LQ0/d;->h0:Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v2, "id: "

    .line 14
    .line 15
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, LQ0/d;->h0:Ljava/lang/String;

    .line 19
    .line 20
    const-string v3, " "

    .line 21
    .line 22
    invoke-static {v0, v2, v3}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v0, "("

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget v0, p0, LQ0/d;->Y:I

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v0, ", "

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget v0, p0, LQ0/d;->Z:I

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v0, ") - ("

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget v0, p0, LQ0/d;->U:I

    .line 55
    .line 56
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v0, " x "

    .line 60
    .line 61
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget v0, p0, LQ0/d;->V:I

    .line 65
    .line 66
    const-string v2, ")"

    .line 67
    .line 68
    invoke-static {v0, v2, v1}, LA7/p0;->j(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    return-object v0
.end method

.method public final u(II)Z
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, LQ0/d;->I:LQ0/c;

    .line 4
    .line 5
    iget-object v0, p1, LQ0/c;->f:LQ0/c;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-boolean v0, v0, LQ0/c;->c:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, LQ0/d;->K:LQ0/c;

    .line 14
    .line 15
    iget-object v1, v0, LQ0/c;->f:LQ0/c;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-boolean v2, v1, LQ0/c;->c:Z

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1}, LQ0/c;->d()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v0}, LQ0/c;->e()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    sub-int/2addr v1, v0

    .line 32
    iget-object v0, p1, LQ0/c;->f:LQ0/c;

    .line 33
    .line 34
    invoke-virtual {v0}, LQ0/c;->d()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-virtual {p1}, LQ0/c;->e()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    add-int/2addr p1, v0

    .line 43
    sub-int/2addr v1, p1

    .line 44
    if-lt v1, p2, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iget-object p1, p0, LQ0/d;->J:LQ0/c;

    .line 48
    .line 49
    iget-object v0, p1, LQ0/c;->f:LQ0/c;

    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    iget-boolean v0, v0, LQ0/c;->c:Z

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    iget-object v0, p0, LQ0/d;->L:LQ0/c;

    .line 58
    .line 59
    iget-object v1, v0, LQ0/c;->f:LQ0/c;

    .line 60
    .line 61
    if-eqz v1, :cond_1

    .line 62
    .line 63
    iget-boolean v2, v1, LQ0/c;->c:Z

    .line 64
    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    invoke-virtual {v1}, LQ0/c;->d()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-virtual {v0}, LQ0/c;->e()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    sub-int/2addr v1, v0

    .line 76
    iget-object v0, p1, LQ0/c;->f:LQ0/c;

    .line 77
    .line 78
    invoke-virtual {v0}, LQ0/c;->d()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-virtual {p1}, LQ0/c;->e()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    add-int/2addr p1, v0

    .line 87
    sub-int/2addr v1, p1

    .line 88
    if-lt v1, p2, :cond_1

    .line 89
    .line 90
    :goto_0
    const/4 p1, 0x1

    .line 91
    return p1

    .line 92
    :cond_1
    const/4 p1, 0x0

    .line 93
    return p1
.end method

.method public final v(IIIILQ0/d;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LQ0/d;->i(I)LQ0/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p5, p2}, LQ0/d;->i(I)LQ0/c;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const/4 p5, 0x1

    .line 10
    invoke-virtual {p1, p2, p3, p4, p5}, LQ0/c;->b(LQ0/c;IIZ)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final w(I)Z
    .locals 3

    .line 1
    mul-int/lit8 p1, p1, 0x2

    .line 2
    .line 3
    iget-object v0, p0, LQ0/d;->Q:[LQ0/c;

    .line 4
    .line 5
    aget-object v1, v0, p1

    .line 6
    .line 7
    iget-object v2, v1, LQ0/c;->f:LQ0/c;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    iget-object v2, v2, LQ0/c;->f:LQ0/c;

    .line 12
    .line 13
    if-eq v2, v1, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    add-int/2addr p1, v1

    .line 17
    aget-object p1, v0, p1

    .line 18
    .line 19
    iget-object v0, p1, LQ0/c;->f:LQ0/c;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, v0, LQ0/c;->f:LQ0/c;

    .line 24
    .line 25
    if-ne v0, p1, :cond_0

    .line 26
    .line 27
    return v1

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    return p1
.end method

.method public final x()Z
    .locals 2

    .line 1
    iget-object v0, p0, LQ0/d;->I:LQ0/c;

    .line 2
    .line 3
    iget-object v1, v0, LQ0/c;->f:LQ0/c;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v1, LQ0/c;->f:LQ0/c;

    .line 8
    .line 9
    if-eq v1, v0, :cond_1

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, LQ0/d;->K:LQ0/c;

    .line 12
    .line 13
    iget-object v1, v0, LQ0/c;->f:LQ0/c;

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    iget-object v1, v1, LQ0/c;->f:LQ0/c;

    .line 18
    .line 19
    if-ne v1, v0, :cond_2

    .line 20
    .line 21
    :cond_1
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_2
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public final y()Z
    .locals 2

    .line 1
    iget-object v0, p0, LQ0/d;->J:LQ0/c;

    .line 2
    .line 3
    iget-object v1, v0, LQ0/c;->f:LQ0/c;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v1, LQ0/c;->f:LQ0/c;

    .line 8
    .line 9
    if-eq v1, v0, :cond_1

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, LQ0/d;->L:LQ0/c;

    .line 12
    .line 13
    iget-object v1, v0, LQ0/c;->f:LQ0/c;

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    iget-object v1, v1, LQ0/c;->f:LQ0/c;

    .line 18
    .line 19
    if-ne v1, v0, :cond_2

    .line 20
    .line 21
    :cond_1
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_2
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public final z()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, LQ0/d;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, LQ0/d;->g0:I

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method
