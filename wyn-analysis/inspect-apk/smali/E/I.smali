.class public final LE/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:F

.field public final synthetic c:Lkotlin/jvm/internal/n;

.field public final synthetic d:Landroid/support/v4/media/session/b;


# direct methods
.method public constructor <init>(FILandroid/support/v4/media/session/b;Ltf/s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, LE/I;->a:I

    .line 5
    .line 6
    iput p1, p0, LE/I;->b:F

    .line 7
    .line 8
    check-cast p4, Lkotlin/jvm/internal/n;

    .line 9
    .line 10
    iput-object p4, p0, LE/I;->c:Lkotlin/jvm/internal/n;

    .line 11
    .line 12
    iput-object p3, p0, LE/I;->d:Landroid/support/v4/media/session/b;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(Lt0/r;LP/a;J)LD0/b;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v1, "$this$measure"

    .line 8
    .line 9
    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    iget v3, v0, LE/I;->a:I

    .line 14
    .line 15
    if-ne v3, v1, :cond_0

    .line 16
    .line 17
    invoke-static/range {p3 .. p4}, LL0/a;->g(J)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static/range {p3 .. p4}, LL0/a;->f(J)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    :goto_0
    if-ne v3, v1, :cond_1

    .line 27
    .line 28
    invoke-static/range {p3 .. p4}, LL0/a;->e(J)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-static/range {p3 .. p4}, LL0/a;->d(J)I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    :goto_1
    if-ne v3, v1, :cond_2

    .line 38
    .line 39
    invoke-static/range {p3 .. p4}, LL0/a;->f(J)I

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    invoke-static/range {p3 .. p4}, LL0/a;->g(J)I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    :goto_2
    if-ne v3, v1, :cond_3

    .line 49
    .line 50
    invoke-static/range {p3 .. p4}, LL0/a;->d(J)I

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    goto :goto_3

    .line 55
    :cond_3
    invoke-static/range {p3 .. p4}, LL0/a;->e(J)I

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    :goto_3
    iget v9, v0, LE/I;->b:F

    .line 60
    .line 61
    invoke-static {v6, v9}, LA7/p0;->a(LL0/b;F)I

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    iget-object v10, v2, LP/a;->a:LP/d;

    .line 66
    .line 67
    iget v11, v10, LP/d;->c:I

    .line 68
    .line 69
    new-array v12, v11, [Lr0/t;

    .line 70
    .line 71
    new-array v13, v11, [Lic/d;

    .line 72
    .line 73
    const/4 v15, 0x0

    .line 74
    :goto_4
    if-ge v15, v11, :cond_4

    .line 75
    .line 76
    invoke-virtual {v2, v15}, LP/a;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v16

    .line 80
    check-cast v16, Lr0/m;

    .line 81
    .line 82
    invoke-interface/range {v16 .. v16}, Lr0/m;->a()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    const/16 v16, 0x0

    .line 86
    .line 87
    aput-object v16, v13, v15

    .line 88
    .line 89
    add-int/lit8 v15, v15, 0x1

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_4
    iget v11, v10, LP/d;->c:I

    .line 93
    .line 94
    const/4 v15, 0x0

    .line 95
    const/16 v16, 0x0

    .line 96
    .line 97
    const/16 v17, 0x0

    .line 98
    .line 99
    const/16 v18, 0x0

    .line 100
    .line 101
    :goto_5
    if-ge v15, v11, :cond_a

    .line 102
    .line 103
    invoke-virtual {v2, v15}, LP/a;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v17

    .line 107
    move-object/from16 v14, v17

    .line 108
    .line 109
    check-cast v14, Lr0/m;

    .line 110
    .line 111
    aget-object v17, v13, v15

    .line 112
    .line 113
    const v1, 0x7fffffff

    .line 114
    .line 115
    .line 116
    if-ne v5, v1, :cond_5

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_5
    sub-int v1, v5, v16

    .line 120
    .line 121
    :goto_6
    const-string v2, "orientation"

    .line 122
    .line 123
    invoke-static {v3, v2}, Lka/n;->m(ILjava/lang/String;)V

    .line 124
    .line 125
    .line 126
    const/4 v2, 0x1

    .line 127
    if-ne v3, v2, :cond_6

    .line 128
    .line 129
    const/4 v2, 0x0

    .line 130
    invoke-static {v2, v1, v2, v8}, Lxg/g;->a(IIII)J

    .line 131
    .line 132
    .line 133
    move-result-wide v19

    .line 134
    :goto_7
    move-wide/from16 v1, v19

    .line 135
    .line 136
    goto :goto_8

    .line 137
    :cond_6
    const/4 v2, 0x0

    .line 138
    invoke-static {v2, v8, v2, v1}, Lxg/g;->a(IIII)J

    .line 139
    .line 140
    .line 141
    move-result-wide v19

    .line 142
    goto :goto_7

    .line 143
    :goto_8
    invoke-interface {v14, v1, v2}, Lr0/m;->e(J)Lr0/t;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    sub-int v2, v5, v16

    .line 148
    .line 149
    const/4 v14, 0x1

    .line 150
    if-ne v3, v14, :cond_7

    .line 151
    .line 152
    iget v14, v1, Lr0/t;->a:I

    .line 153
    .line 154
    goto :goto_9

    .line 155
    :cond_7
    iget v14, v1, Lr0/t;->b:I

    .line 156
    .line 157
    :goto_9
    sub-int/2addr v2, v14

    .line 158
    invoke-static {v9, v2}, Ljava/lang/Math;->min(II)I

    .line 159
    .line 160
    .line 161
    move-result v17

    .line 162
    const/4 v14, 0x1

    .line 163
    if-ne v3, v14, :cond_8

    .line 164
    .line 165
    iget v2, v1, Lr0/t;->a:I

    .line 166
    .line 167
    goto :goto_a

    .line 168
    :cond_8
    iget v2, v1, Lr0/t;->b:I

    .line 169
    .line 170
    :goto_a
    add-int v2, v2, v17

    .line 171
    .line 172
    add-int v16, v2, v16

    .line 173
    .line 174
    if-ne v3, v14, :cond_9

    .line 175
    .line 176
    iget v2, v1, Lr0/t;->b:I

    .line 177
    .line 178
    :goto_b
    move/from16 v14, v18

    .line 179
    .line 180
    goto :goto_c

    .line 181
    :cond_9
    iget v2, v1, Lr0/t;->a:I

    .line 182
    .line 183
    goto :goto_b

    .line 184
    :goto_c
    invoke-static {v14, v2}, Ljava/lang/Math;->max(II)I

    .line 185
    .line 186
    .line 187
    move-result v18

    .line 188
    aput-object v1, v12, v15

    .line 189
    .line 190
    add-int/lit8 v15, v15, 0x1

    .line 191
    .line 192
    move-object/from16 v2, p2

    .line 193
    .line 194
    const/4 v1, 0x1

    .line 195
    goto :goto_5

    .line 196
    :cond_a
    move/from16 v14, v18

    .line 197
    .line 198
    sub-int v1, v16, v17

    .line 199
    .line 200
    move-object v2, v12

    .line 201
    new-instance v12, Lkotlin/jvm/internal/E;

    .line 202
    .line 203
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 204
    .line 205
    .line 206
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    iget v1, v12, Lkotlin/jvm/internal/E;->a:I

    .line 211
    .line 212
    invoke-static {v7, v1}, Ljava/lang/Math;->max(II)I

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    invoke-static {v14, v1}, Ljava/lang/Math;->max(II)I

    .line 217
    .line 218
    .line 219
    move-result v11

    .line 220
    const/4 v14, 0x1

    .line 221
    if-ne v3, v14, :cond_b

    .line 222
    .line 223
    move v15, v5

    .line 224
    goto :goto_d

    .line 225
    :cond_b
    move v15, v11

    .line 226
    :goto_d
    if-ne v3, v14, :cond_c

    .line 227
    .line 228
    move v14, v11

    .line 229
    goto :goto_e

    .line 230
    :cond_c
    move v14, v5

    .line 231
    :goto_e
    iget v1, v10, LP/d;->c:I

    .line 232
    .line 233
    new-array v7, v1, [I

    .line 234
    .line 235
    const/4 v3, 0x0

    .line 236
    :goto_f
    if-ge v3, v1, :cond_d

    .line 237
    .line 238
    const/4 v4, 0x0

    .line 239
    aput v4, v7, v3

    .line 240
    .line 241
    add-int/lit8 v3, v3, 0x1

    .line 242
    .line 243
    goto :goto_f

    .line 244
    :cond_d
    new-instance v1, LE/H;

    .line 245
    .line 246
    iget-object v10, v0, LE/I;->d:Landroid/support/v4/media/session/b;

    .line 247
    .line 248
    iget-object v4, v0, LE/I;->c:Lkotlin/jvm/internal/n;

    .line 249
    .line 250
    iget v8, v0, LE/I;->a:I

    .line 251
    .line 252
    move-object v3, v2

    .line 253
    move-object v9, v13

    .line 254
    move-object/from16 v2, p2

    .line 255
    .line 256
    invoke-direct/range {v1 .. v12}, LE/H;-><init>(LP/a;[Lr0/t;Ltf/s;ILt0/r;[II[Lic/d;Landroid/support/v4/media/session/b;ILkotlin/jvm/internal/E;)V

    .line 257
    .line 258
    .line 259
    invoke-static {v6, v15, v14, v1}, Lpd/f;->j(Lt0/r;IILtf/l;)LD0/b;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    return-object v1
.end method
