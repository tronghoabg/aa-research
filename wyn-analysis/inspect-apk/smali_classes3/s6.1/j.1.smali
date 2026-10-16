.class public final Ls6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/u0;
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final synthetic a:Ls6/t;


# direct methods
.method public constructor <init>(Ls6/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls6/j;->a:Ls6/t;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final synthetic B()V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic E(LE5/d0;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic F(Lh6/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic G(LE5/o;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic I(LE5/f0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic a(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic b(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic c(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic d(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic e(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic f(Ljava/util/List;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic g(II)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic h(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic i(IZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic j(F)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic k(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic l(IZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic m(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final n(LE5/t0;)V
    .locals 9

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x9

    .line 5
    .line 6
    const/16 v3, 0x8

    .line 7
    .line 8
    const/4 v4, 0x7

    .line 9
    const/4 v5, 0x4

    .line 10
    const/4 v6, 0x5

    .line 11
    filled-new-array {v5, v6}, [I

    .line 12
    .line 13
    .line 14
    move-result-object v7

    .line 15
    invoke-virtual {p1, v7}, LE5/t0;->a([I)Z

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    iget-object v8, p0, Ls6/j;->a:Ls6/t;

    .line 20
    .line 21
    if-eqz v7, :cond_0

    .line 22
    .line 23
    invoke-virtual {v8}, Ls6/t;->l()V

    .line 24
    .line 25
    .line 26
    :cond_0
    filled-new-array {v5, v6, v4}, [I

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-virtual {p1, v5}, LE5/t0;->a([I)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    invoke-virtual {v8}, Ls6/t;->n()V

    .line 37
    .line 38
    .line 39
    :cond_1
    iget-object v5, p1, LE5/t0;->a:Lu6/e;

    .line 40
    .line 41
    iget-object v6, v5, Lu6/e;->a:Landroid/util/SparseBooleanArray;

    .line 42
    .line 43
    invoke-virtual {v6, v3}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    invoke-virtual {v8}, Ls6/t;->o()V

    .line 50
    .line 51
    .line 52
    :cond_2
    iget-object v3, v5, Lu6/e;->a:Landroid/util/SparseBooleanArray;

    .line 53
    .line 54
    invoke-virtual {v3, v2}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    invoke-virtual {v8}, Ls6/t;->q()V

    .line 61
    .line 62
    .line 63
    :cond_3
    new-array v2, v4, [I

    .line 64
    .line 65
    fill-array-data v2, :array_0

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v2}, LE5/t0;->a([I)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_4

    .line 73
    .line 74
    invoke-virtual {v8}, Ls6/t;->k()V

    .line 75
    .line 76
    .line 77
    :cond_4
    filled-new-array {v0, v1}, [I

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {p1, v0}, LE5/t0;->a([I)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_5

    .line 86
    .line 87
    invoke-virtual {v8}, Ls6/t;->r()V

    .line 88
    .line 89
    .line 90
    :cond_5
    iget-object p1, v5, Lu6/e;->a:Landroid/util/SparseBooleanArray;

    .line 91
    .line 92
    const/16 v0, 0xc

    .line 93
    .line 94
    invoke-virtual {p1, v0}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-eqz p1, :cond_6

    .line 99
    .line 100
    invoke-virtual {v8}, Ls6/t;->m()V

    .line 101
    .line 102
    .line 103
    :cond_6
    iget-object p1, v5, Lu6/e;->a:Landroid/util/SparseBooleanArray;

    .line 104
    .line 105
    const/4 v0, 0x2

    .line 106
    invoke-virtual {p1, v0}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_7

    .line 111
    .line 112
    invoke-virtual {v8}, Ls6/t;->s()V

    .line 113
    .line 114
    .line 115
    :cond_7
    return-void

    .line 116
    nop

    .line 117
    :array_0
    .array-data 4
        0x8
        0x9
        0xb
        0x0
        0x10
        0x11
        0xd
    .end array-data
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 7

    .line 1
    iget-object v0, p0, Ls6/j;->a:Ls6/t;

    .line 2
    .line 3
    iget-object v1, v0, Ls6/t;->h0:LE5/w0;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_5

    .line 8
    .line 9
    :cond_0
    iget-object v2, v0, Ls6/t;->a:Ls6/y;

    .line 10
    .line 11
    invoke-virtual {v2}, Ls6/y;->g()V

    .line 12
    .line 13
    .line 14
    iget-object v3, v0, Ls6/t;->n:Landroid/view/View;

    .line 15
    .line 16
    if-ne v3, p1, :cond_1

    .line 17
    .line 18
    check-cast v1, LA7/B0;

    .line 19
    .line 20
    invoke-virtual {v1}, LA7/B0;->P()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    iget-object v3, v0, Ls6/t;->m:Landroid/view/View;

    .line 25
    .line 26
    if-ne v3, p1, :cond_2

    .line 27
    .line 28
    check-cast v1, LA7/B0;

    .line 29
    .line 30
    invoke-virtual {v1}, LA7/B0;->R()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_2
    const/4 v3, 0x4

    .line 35
    iget-object v4, v0, Ls6/t;->p:Landroid/view/View;

    .line 36
    .line 37
    if-ne v4, p1, :cond_3

    .line 38
    .line 39
    move-object p1, v1

    .line 40
    check-cast p1, LE5/I;

    .line 41
    .line 42
    invoke-virtual {p1}, LE5/I;->t0()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eq p1, v3, :cond_14

    .line 47
    .line 48
    check-cast v1, LA7/B0;

    .line 49
    .line 50
    move-object p1, v1

    .line 51
    check-cast p1, LE5/I;

    .line 52
    .line 53
    invoke-virtual {p1}, LE5/I;->Q0()V

    .line 54
    .line 55
    .line 56
    iget-wide v2, p1, LE5/I;->v:J

    .line 57
    .line 58
    invoke-virtual {v1, v2, v3}, LA7/B0;->Q(J)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_3
    iget-object v4, v0, Ls6/t;->q:Landroid/view/View;

    .line 63
    .line 64
    if-ne v4, p1, :cond_4

    .line 65
    .line 66
    check-cast v1, LA7/B0;

    .line 67
    .line 68
    move-object p1, v1

    .line 69
    check-cast p1, LE5/I;

    .line 70
    .line 71
    invoke-virtual {p1}, LE5/I;->Q0()V

    .line 72
    .line 73
    .line 74
    iget-wide v2, p1, LE5/I;->u:J

    .line 75
    .line 76
    neg-long v2, v2

    .line 77
    invoke-virtual {v1, v2, v3}, LA7/B0;->Q(J)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_4
    const/4 v4, 0x0

    .line 82
    const/4 v5, 0x1

    .line 83
    iget-object v6, v0, Ls6/t;->o:Landroid/view/View;

    .line 84
    .line 85
    if-ne v6, p1, :cond_9

    .line 86
    .line 87
    check-cast v1, LE5/I;

    .line 88
    .line 89
    invoke-virtual {v1}, LE5/I;->t0()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eq p1, v5, :cond_6

    .line 94
    .line 95
    if-eq p1, v3, :cond_6

    .line 96
    .line 97
    invoke-virtual {v1}, LE5/I;->s0()Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-nez p1, :cond_5

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_5
    invoke-virtual {v1, v4}, LE5/I;->I0(Z)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_6
    :goto_0
    invoke-virtual {v1}, LE5/I;->t0()I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-ne p1, v5, :cond_7

    .line 113
    .line 114
    invoke-virtual {v1}, LE5/I;->B0()V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_7
    if-ne p1, v3, :cond_8

    .line 119
    .line 120
    invoke-virtual {v1}, LE5/I;->l0()I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    invoke-virtual {v1}, LE5/I;->Q0()V

    .line 125
    .line 126
    .line 127
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, v2, v3, p1, v4}, LE5/I;->E0(JIZ)V

    .line 133
    .line 134
    .line 135
    :cond_8
    :goto_1
    invoke-virtual {v1, v5}, LE5/I;->I0(Z)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_9
    iget-object v3, v0, Ls6/t;->t:Landroid/widget/ImageView;

    .line 140
    .line 141
    if-ne v3, p1, :cond_f

    .line 142
    .line 143
    check-cast v1, LE5/I;

    .line 144
    .line 145
    invoke-virtual {v1}, LE5/I;->Q0()V

    .line 146
    .line 147
    .line 148
    iget p1, v1, LE5/I;->F:I

    .line 149
    .line 150
    iget v0, v0, Ls6/t;->q0:I

    .line 151
    .line 152
    move v2, v5

    .line 153
    :goto_2
    const/4 v3, 0x2

    .line 154
    if-gt v2, v3, :cond_e

    .line 155
    .line 156
    add-int v4, p1, v2

    .line 157
    .line 158
    rem-int/lit8 v4, v4, 0x3

    .line 159
    .line 160
    if-eqz v4, :cond_d

    .line 161
    .line 162
    if-eq v4, v5, :cond_b

    .line 163
    .line 164
    if-eq v4, v3, :cond_a

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_a
    and-int/lit8 v3, v0, 0x2

    .line 168
    .line 169
    if-eqz v3, :cond_c

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_b
    and-int/lit8 v3, v0, 0x1

    .line 173
    .line 174
    if-eqz v3, :cond_c

    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_c
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_d
    :goto_4
    move p1, v4

    .line 181
    :cond_e
    invoke-virtual {v1, p1}, LE5/I;->J0(I)V

    .line 182
    .line 183
    .line 184
    return-void

    .line 185
    :cond_f
    iget-object v3, v0, Ls6/t;->u:Landroid/widget/ImageView;

    .line 186
    .line 187
    if-ne v3, p1, :cond_10

    .line 188
    .line 189
    check-cast v1, LE5/I;

    .line 190
    .line 191
    invoke-virtual {v1}, LE5/I;->Q0()V

    .line 192
    .line 193
    .line 194
    iget-boolean p1, v1, LE5/I;->G:Z

    .line 195
    .line 196
    xor-int/2addr p1, v5

    .line 197
    invoke-virtual {v1}, LE5/I;->Q0()V

    .line 198
    .line 199
    .line 200
    iget-boolean v0, v1, LE5/I;->G:Z

    .line 201
    .line 202
    if-eq v0, p1, :cond_14

    .line 203
    .line 204
    iput-boolean p1, v1, LE5/I;->G:Z

    .line 205
    .line 206
    iget-object v0, v1, LE5/I;->k:LE5/O;

    .line 207
    .line 208
    iget-object v0, v0, LE5/O;->h:Lu6/s;

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    invoke-static {}, Lu6/s;->b()Lu6/r;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    iget-object v0, v0, Lu6/s;->a:Landroid/os/Handler;

    .line 218
    .line 219
    const/16 v3, 0xc

    .line 220
    .line 221
    invoke-virtual {v0, v3, p1, v4}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    iput-object v0, v2, Lu6/r;->a:Landroid/os/Message;

    .line 226
    .line 227
    invoke-virtual {v2}, Lu6/r;->b()V

    .line 228
    .line 229
    .line 230
    new-instance v0, LE5/y;

    .line 231
    .line 232
    const/4 v2, 0x0

    .line 233
    invoke-direct {v0, p1, v2}, LE5/y;-><init>(ZI)V

    .line 234
    .line 235
    .line 236
    iget-object p1, v1, LE5/I;->l:LK8/H;

    .line 237
    .line 238
    const/16 v2, 0x9

    .line 239
    .line 240
    invoke-virtual {p1, v2, v0}, LK8/H;->o(ILu6/g;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1}, LE5/I;->M0()V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p1}, LK8/H;->m()V

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    :cond_10
    iget-object v1, v0, Ls6/t;->z:Landroid/view/View;

    .line 251
    .line 252
    if-ne v1, p1, :cond_11

    .line 253
    .line 254
    invoke-virtual {v2}, Ls6/y;->f()V

    .line 255
    .line 256
    .line 257
    iget-object p1, v0, Ls6/t;->f:Ls6/p;

    .line 258
    .line 259
    invoke-virtual {v0, p1, v1}, Ls6/t;->d(Landroidx/recyclerview/widget/I;Landroid/view/View;)V

    .line 260
    .line 261
    .line 262
    return-void

    .line 263
    :cond_11
    iget-object v1, v0, Ls6/t;->A:Landroid/view/View;

    .line 264
    .line 265
    if-ne v1, p1, :cond_12

    .line 266
    .line 267
    invoke-virtual {v2}, Ls6/y;->f()V

    .line 268
    .line 269
    .line 270
    iget-object p1, v0, Ls6/t;->g:Ls6/m;

    .line 271
    .line 272
    invoke-virtual {v0, p1, v1}, Ls6/t;->d(Landroidx/recyclerview/widget/I;Landroid/view/View;)V

    .line 273
    .line 274
    .line 275
    return-void

    .line 276
    :cond_12
    iget-object v1, v0, Ls6/t;->B:Landroid/view/View;

    .line 277
    .line 278
    if-ne v1, p1, :cond_13

    .line 279
    .line 280
    invoke-virtual {v2}, Ls6/y;->f()V

    .line 281
    .line 282
    .line 283
    iget-object p1, v0, Ls6/t;->i:Ls6/i;

    .line 284
    .line 285
    invoke-virtual {v0, p1, v1}, Ls6/t;->d(Landroidx/recyclerview/widget/I;Landroid/view/View;)V

    .line 286
    .line 287
    .line 288
    return-void

    .line 289
    :cond_13
    iget-object v1, v0, Ls6/t;->w:Landroid/widget/ImageView;

    .line 290
    .line 291
    if-ne v1, p1, :cond_14

    .line 292
    .line 293
    invoke-virtual {v2}, Ls6/y;->f()V

    .line 294
    .line 295
    .line 296
    iget-object p1, v0, Ls6/t;->h:Ls6/i;

    .line 297
    .line 298
    invoke-virtual {v0, p1, v1}, Ls6/t;->d(Landroidx/recyclerview/widget/I;Landroid/view/View;)V

    .line 299
    .line 300
    .line 301
    :cond_14
    :goto_5
    return-void
.end method

.method public final onDismiss()V
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/j;->a:Ls6/t;

    .line 2
    .line 3
    iget-boolean v1, v0, Ls6/t;->w0:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Ls6/t;->a:Ls6/y;

    .line 8
    .line 9
    invoke-virtual {v0}, Ls6/y;->g()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final synthetic p(LE5/v0;LE5/v0;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic q(LE5/s0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic r(LE5/r0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic s(LE5/n;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic t(IZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic u(LE5/L0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic v(Lr6/r;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic w()V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic x(Lv6/o;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic y(LE5/o;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic z(LW5/c;)V
    .locals 0

    .line 1
    return-void
.end method
