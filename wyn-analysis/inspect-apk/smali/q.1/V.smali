.class public final Lq/V;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/TextView;

.field public b:LK8/f;

.field public c:LK8/f;

.field public d:LK8/f;

.field public e:LK8/f;

.field public f:LK8/f;

.field public g:LK8/f;

.field public h:LK8/f;

.field public final i:Lq/f0;

.field public j:I

.field public k:I

.field public l:Landroid/graphics/Typeface;

.field public m:Z


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lq/V;->j:I

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lq/V;->k:I

    .line 9
    .line 10
    iput-object p1, p0, Lq/V;->a:Landroid/widget/TextView;

    .line 11
    .line 12
    new-instance v0, Lq/f0;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Lq/f0;-><init>(Landroid/widget/TextView;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lq/V;->i:Lq/f0;

    .line 18
    .line 19
    return-void
.end method

.method public static c(Landroid/content/Context;Lq/p;I)LK8/f;
    .locals 1

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    iget-object v0, p1, Lq/p;->a:Lq/O0;

    .line 3
    .line 4
    invoke-virtual {v0, p0, p2}, Lq/O0;->i(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 5
    .line 6
    .line 7
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p1

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    new-instance p1, LK8/f;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x1

    .line 17
    iput-boolean p2, p1, LK8/f;->b:Z

    .line 18
    .line 19
    iput-object p0, p1, LK8/f;->c:Ljava/lang/Object;

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw p0
.end method


# virtual methods
.method public final a(Landroid/graphics/drawable/Drawable;LK8/f;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lq/V;->a:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p1, p2, v0}, Lq/p;->e(Landroid/graphics/drawable/Drawable;LK8/f;[I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 6

    .line 1
    iget-object v0, p0, Lq/V;->b:LK8/f;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Lq/V;->a:Landroid/widget/TextView;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lq/V;->c:LK8/f;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lq/V;->d:LK8/f;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lq/V;->e:LK8/f;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    aget-object v4, v0, v2

    .line 26
    .line 27
    iget-object v5, p0, Lq/V;->b:LK8/f;

    .line 28
    .line 29
    invoke-virtual {p0, v4, v5}, Lq/V;->a(Landroid/graphics/drawable/Drawable;LK8/f;)V

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    aget-object v4, v0, v4

    .line 34
    .line 35
    iget-object v5, p0, Lq/V;->c:LK8/f;

    .line 36
    .line 37
    invoke-virtual {p0, v4, v5}, Lq/V;->a(Landroid/graphics/drawable/Drawable;LK8/f;)V

    .line 38
    .line 39
    .line 40
    aget-object v4, v0, v1

    .line 41
    .line 42
    iget-object v5, p0, Lq/V;->d:LK8/f;

    .line 43
    .line 44
    invoke-virtual {p0, v4, v5}, Lq/V;->a(Landroid/graphics/drawable/Drawable;LK8/f;)V

    .line 45
    .line 46
    .line 47
    const/4 v4, 0x3

    .line 48
    aget-object v0, v0, v4

    .line 49
    .line 50
    iget-object v4, p0, Lq/V;->e:LK8/f;

    .line 51
    .line 52
    invoke-virtual {p0, v0, v4}, Lq/V;->a(Landroid/graphics/drawable/Drawable;LK8/f;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-object v0, p0, Lq/V;->f:LK8/f;

    .line 56
    .line 57
    if-nez v0, :cond_3

    .line 58
    .line 59
    iget-object v0, p0, Lq/V;->g:LK8/f;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    return-void

    .line 65
    :cond_3
    :goto_0
    invoke-static {v3}, Lq/P;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    aget-object v2, v0, v2

    .line 70
    .line 71
    iget-object v3, p0, Lq/V;->f:LK8/f;

    .line 72
    .line 73
    invoke-virtual {p0, v2, v3}, Lq/V;->a(Landroid/graphics/drawable/Drawable;LK8/f;)V

    .line 74
    .line 75
    .line 76
    aget-object v0, v0, v1

    .line 77
    .line 78
    iget-object v1, p0, Lq/V;->g:LK8/f;

    .line 79
    .line 80
    invoke-virtual {p0, v0, v1}, Lq/V;->a(Landroid/graphics/drawable/Drawable;LK8/f;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final d()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lq/V;->h:LK8/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, LK8/f;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public final e()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    iget-object v0, p0, Lq/V;->h:LK8/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, LK8/f;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/graphics/PorterDuff$Mode;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public final f(Landroid/util/AttributeSet;I)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    move/from16 v6, p2

    .line 6
    .line 7
    iget-object v1, v0, Lq/V;->a:Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v7

    .line 13
    invoke-static {}, Lq/p;->a()Lq/p;

    .line 14
    .line 15
    .line 16
    move-result-object v8

    .line 17
    sget-object v3, Li/a;->h:[I

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    invoke-static {v7, v4, v3, v6, v9}, Lmd/J;->s(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lmd/J;

    .line 21
    .line 22
    .line 23
    move-result-object v10

    .line 24
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget-object v5, v10, Lmd/J;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v5, Landroid/content/res/TypedArray;

    .line 31
    .line 32
    invoke-static/range {v1 .. v6}, Lk1/S;->l(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 33
    .line 34
    .line 35
    move-object v11, v1

    .line 36
    iget-object v1, v10, Lmd/J;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Landroid/content/res/TypedArray;

    .line 39
    .line 40
    const/4 v12, -0x1

    .line 41
    invoke-virtual {v1, v9, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    const/4 v13, 0x3

    .line 46
    invoke-virtual {v1, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    invoke-virtual {v1, v13, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-static {v7, v8, v3}, Lq/V;->c(Landroid/content/Context;Lq/p;I)LK8/f;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    iput-object v3, v0, Lq/V;->b:LK8/f;

    .line 61
    .line 62
    :cond_0
    const/4 v14, 0x1

    .line 63
    invoke-virtual {v1, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_1

    .line 68
    .line 69
    invoke-virtual {v1, v14, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-static {v7, v8, v3}, Lq/V;->c(Landroid/content/Context;Lq/p;I)LK8/f;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    iput-object v3, v0, Lq/V;->c:LK8/f;

    .line 78
    .line 79
    :cond_1
    const/4 v15, 0x4

    .line 80
    invoke-virtual {v1, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_2

    .line 85
    .line 86
    invoke-virtual {v1, v15, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    invoke-static {v7, v8, v3}, Lq/V;->c(Landroid/content/Context;Lq/p;I)LK8/f;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    iput-object v3, v0, Lq/V;->d:LK8/f;

    .line 95
    .line 96
    :cond_2
    const/4 v3, 0x2

    .line 97
    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-eqz v5, :cond_3

    .line 102
    .line 103
    invoke-virtual {v1, v3, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    invoke-static {v7, v8, v5}, Lq/V;->c(Landroid/content/Context;Lq/p;I)LK8/f;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    iput-object v5, v0, Lq/V;->e:LK8/f;

    .line 112
    .line 113
    :cond_3
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 114
    .line 115
    const/4 v13, 0x5

    .line 116
    invoke-virtual {v1, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 117
    .line 118
    .line 119
    move-result v17

    .line 120
    if-eqz v17, :cond_4

    .line 121
    .line 122
    invoke-virtual {v1, v13, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    invoke-static {v7, v8, v3}, Lq/V;->c(Landroid/content/Context;Lq/p;I)LK8/f;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    iput-object v3, v0, Lq/V;->f:LK8/f;

    .line 131
    .line 132
    :cond_4
    const/4 v3, 0x6

    .line 133
    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 134
    .line 135
    .line 136
    move-result v18

    .line 137
    if-eqz v18, :cond_5

    .line 138
    .line 139
    invoke-virtual {v1, v3, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    invoke-static {v7, v8, v1}, Lq/V;->c(Landroid/content/Context;Lq/p;I)LK8/f;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    iput-object v1, v0, Lq/V;->g:LK8/f;

    .line 148
    .line 149
    :cond_5
    invoke-virtual {v10}, Lmd/J;->v()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v11}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    instance-of v1, v1, Landroid/text/method/PasswordTransformationMethod;

    .line 157
    .line 158
    sget-object v10, Li/a;->x:[I

    .line 159
    .line 160
    const/16 v3, 0x1a

    .line 161
    .line 162
    const/16 v14, 0xe

    .line 163
    .line 164
    const/16 v15, 0xd

    .line 165
    .line 166
    const/16 v13, 0xf

    .line 167
    .line 168
    if-eq v2, v12, :cond_9

    .line 169
    .line 170
    new-instance v12, Lmd/J;

    .line 171
    .line 172
    invoke-virtual {v7, v2, v10}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-direct {v12, v7, v2}, Lmd/J;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 177
    .line 178
    .line 179
    if-nez v1, :cond_6

    .line 180
    .line 181
    invoke-virtual {v2, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 182
    .line 183
    .line 184
    move-result v20

    .line 185
    if-eqz v20, :cond_6

    .line 186
    .line 187
    invoke-virtual {v2, v14, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 188
    .line 189
    .line 190
    move-result v20

    .line 191
    move/from16 v21, v20

    .line 192
    .line 193
    const/16 v20, 0x1

    .line 194
    .line 195
    goto :goto_0

    .line 196
    :cond_6
    move/from16 v20, v9

    .line 197
    .line 198
    move/from16 v21, v20

    .line 199
    .line 200
    :goto_0
    invoke-virtual {v0, v7, v12}, Lq/V;->m(Landroid/content/Context;Lmd/J;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 204
    .line 205
    .line 206
    move-result v22

    .line 207
    if-eqz v22, :cond_7

    .line 208
    .line 209
    invoke-virtual {v2, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v22

    .line 213
    goto :goto_1

    .line 214
    :cond_7
    const/16 v22, 0x0

    .line 215
    .line 216
    :goto_1
    if-lt v5, v3, :cond_8

    .line 217
    .line 218
    invoke-virtual {v2, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 219
    .line 220
    .line 221
    move-result v23

    .line 222
    if-eqz v23, :cond_8

    .line 223
    .line 224
    invoke-virtual {v2, v15}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    goto :goto_2

    .line 229
    :cond_8
    const/4 v2, 0x0

    .line 230
    :goto_2
    invoke-virtual {v12}, Lmd/J;->v()V

    .line 231
    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_9
    move/from16 v20, v9

    .line 235
    .line 236
    move/from16 v21, v20

    .line 237
    .line 238
    const/4 v2, 0x0

    .line 239
    const/16 v22, 0x0

    .line 240
    .line 241
    :goto_3
    new-instance v12, Lmd/J;

    .line 242
    .line 243
    invoke-virtual {v7, v4, v10, v6, v9}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 244
    .line 245
    .line 246
    move-result-object v10

    .line 247
    invoke-direct {v12, v7, v10}, Lmd/J;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 248
    .line 249
    .line 250
    if-nez v1, :cond_a

    .line 251
    .line 252
    invoke-virtual {v10, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 253
    .line 254
    .line 255
    move-result v23

    .line 256
    if-eqz v23, :cond_a

    .line 257
    .line 258
    invoke-virtual {v10, v14, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 259
    .line 260
    .line 261
    move-result v21

    .line 262
    const/16 v20, 0x1

    .line 263
    .line 264
    :cond_a
    move/from16 v14, v21

    .line 265
    .line 266
    invoke-virtual {v10, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 267
    .line 268
    .line 269
    move-result v21

    .line 270
    if-eqz v21, :cond_b

    .line 271
    .line 272
    invoke-virtual {v10, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v22

    .line 276
    :cond_b
    move-object/from16 v13, v22

    .line 277
    .line 278
    if-lt v5, v3, :cond_c

    .line 279
    .line 280
    invoke-virtual {v10, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    if-eqz v3, :cond_c

    .line 285
    .line 286
    invoke-virtual {v10, v15}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    :cond_c
    const/16 v3, 0x1c

    .line 291
    .line 292
    if-lt v5, v3, :cond_d

    .line 293
    .line 294
    invoke-virtual {v10, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    if-eqz v3, :cond_d

    .line 299
    .line 300
    const/4 v3, -0x1

    .line 301
    invoke-virtual {v10, v9, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 302
    .line 303
    .line 304
    move-result v10

    .line 305
    if-nez v10, :cond_d

    .line 306
    .line 307
    const/4 v3, 0x0

    .line 308
    invoke-virtual {v11, v9, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 309
    .line 310
    .line 311
    :cond_d
    invoke-virtual {v0, v7, v12}, Lq/V;->m(Landroid/content/Context;Lmd/J;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12}, Lmd/J;->v()V

    .line 315
    .line 316
    .line 317
    if-nez v1, :cond_e

    .line 318
    .line 319
    if-eqz v20, :cond_e

    .line 320
    .line 321
    invoke-virtual {v11, v14}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 322
    .line 323
    .line 324
    :cond_e
    iget-object v1, v0, Lq/V;->l:Landroid/graphics/Typeface;

    .line 325
    .line 326
    if-eqz v1, :cond_10

    .line 327
    .line 328
    iget v3, v0, Lq/V;->k:I

    .line 329
    .line 330
    const/4 v10, -0x1

    .line 331
    if-ne v3, v10, :cond_f

    .line 332
    .line 333
    iget v3, v0, Lq/V;->j:I

    .line 334
    .line 335
    invoke-virtual {v11, v1, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 336
    .line 337
    .line 338
    goto :goto_4

    .line 339
    :cond_f
    invoke-virtual {v11, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 340
    .line 341
    .line 342
    :cond_10
    :goto_4
    if-eqz v2, :cond_11

    .line 343
    .line 344
    invoke-static {v11, v2}, Lq/T;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    .line 345
    .line 346
    .line 347
    :cond_11
    const/16 v10, 0x18

    .line 348
    .line 349
    if-eqz v13, :cond_13

    .line 350
    .line 351
    if-lt v5, v10, :cond_12

    .line 352
    .line 353
    invoke-static {v13}, Lq/S;->a(Ljava/lang/String;)Landroid/os/LocaleList;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    invoke-static {v11, v1}, Lq/S;->b(Landroid/widget/TextView;Landroid/os/LocaleList;)V

    .line 358
    .line 359
    .line 360
    goto :goto_5

    .line 361
    :cond_12
    const-string v1, ","

    .line 362
    .line 363
    invoke-virtual {v13, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    aget-object v1, v1, v9

    .line 368
    .line 369
    invoke-static {v1}, Lq/Q;->a(Ljava/lang/String;)Ljava/util/Locale;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    invoke-static {v11, v1}, Lq/P;->c(Landroid/widget/TextView;Ljava/util/Locale;)V

    .line 374
    .line 375
    .line 376
    :cond_13
    :goto_5
    sget-object v3, Li/a;->i:[I

    .line 377
    .line 378
    iget-object v12, v0, Lq/V;->i:Lq/f0;

    .line 379
    .line 380
    iget-object v13, v12, Lq/f0;->j:Landroid/content/Context;

    .line 381
    .line 382
    invoke-virtual {v13, v4, v3, v6, v9}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 383
    .line 384
    .line 385
    move-result-object v5

    .line 386
    iget-object v1, v12, Lq/f0;->i:Landroid/widget/TextView;

    .line 387
    .line 388
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    const/4 v10, 0x6

    .line 393
    const/4 v14, 0x2

    .line 394
    invoke-static/range {v1 .. v6}, Lk1/S;->l(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 395
    .line 396
    .line 397
    const/4 v1, 0x5

    .line 398
    invoke-virtual {v5, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 399
    .line 400
    .line 401
    move-result v2

    .line 402
    if-eqz v2, :cond_14

    .line 403
    .line 404
    invoke-virtual {v5, v1, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 405
    .line 406
    .line 407
    move-result v1

    .line 408
    iput v1, v12, Lq/f0;->a:I

    .line 409
    .line 410
    :cond_14
    const/4 v1, 0x4

    .line 411
    invoke-virtual {v5, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 412
    .line 413
    .line 414
    move-result v2

    .line 415
    const/high16 v6, -0x40800000    # -1.0f

    .line 416
    .line 417
    if-eqz v2, :cond_15

    .line 418
    .line 419
    invoke-virtual {v5, v1, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 420
    .line 421
    .line 422
    move-result v1

    .line 423
    goto :goto_6

    .line 424
    :cond_15
    move v1, v6

    .line 425
    :goto_6
    invoke-virtual {v5, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 426
    .line 427
    .line 428
    move-result v2

    .line 429
    if-eqz v2, :cond_16

    .line 430
    .line 431
    invoke-virtual {v5, v14, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 432
    .line 433
    .line 434
    move-result v2

    .line 435
    :goto_7
    const/4 v10, 0x1

    .line 436
    goto :goto_8

    .line 437
    :cond_16
    move v2, v6

    .line 438
    goto :goto_7

    .line 439
    :goto_8
    invoke-virtual {v5, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 440
    .line 441
    .line 442
    move-result v18

    .line 443
    if-eqz v18, :cond_17

    .line 444
    .line 445
    invoke-virtual {v5, v10, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 446
    .line 447
    .line 448
    move-result v19

    .line 449
    :goto_9
    const/4 v10, 0x3

    .line 450
    goto :goto_a

    .line 451
    :cond_17
    move/from16 v19, v6

    .line 452
    .line 453
    goto :goto_9

    .line 454
    :goto_a
    invoke-virtual {v5, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 455
    .line 456
    .line 457
    move-result v16

    .line 458
    move/from16 p2, v6

    .line 459
    .line 460
    if-eqz v16, :cond_1a

    .line 461
    .line 462
    invoke-virtual {v5, v10, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 463
    .line 464
    .line 465
    move-result v6

    .line 466
    if-lez v6, :cond_1a

    .line 467
    .line 468
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 469
    .line 470
    .line 471
    move-result-object v10

    .line 472
    invoke-virtual {v10, v6}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    .line 473
    .line 474
    .line 475
    move-result-object v6

    .line 476
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->length()I

    .line 477
    .line 478
    .line 479
    move-result v10

    .line 480
    new-array v15, v10, [I

    .line 481
    .line 482
    if-lez v10, :cond_19

    .line 483
    .line 484
    :goto_b
    if-ge v9, v10, :cond_18

    .line 485
    .line 486
    const/4 v14, -0x1

    .line 487
    invoke-virtual {v6, v9, v14}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 488
    .line 489
    .line 490
    move-result v23

    .line 491
    aput v23, v15, v9

    .line 492
    .line 493
    add-int/lit8 v9, v9, 0x1

    .line 494
    .line 495
    const/4 v14, 0x2

    .line 496
    goto :goto_b

    .line 497
    :cond_18
    invoke-static {v15}, Lq/f0;->b([I)[I

    .line 498
    .line 499
    .line 500
    move-result-object v9

    .line 501
    iput-object v9, v12, Lq/f0;->f:[I

    .line 502
    .line 503
    invoke-virtual {v12}, Lq/f0;->i()Z

    .line 504
    .line 505
    .line 506
    :cond_19
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 507
    .line 508
    .line 509
    :cond_1a
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12}, Lq/f0;->j()Z

    .line 513
    .line 514
    .line 515
    move-result v5

    .line 516
    const/high16 v6, 0x3f800000    # 1.0f

    .line 517
    .line 518
    if-eqz v5, :cond_1f

    .line 519
    .line 520
    iget v5, v12, Lq/f0;->a:I

    .line 521
    .line 522
    const/4 v10, 0x1

    .line 523
    if-ne v5, v10, :cond_20

    .line 524
    .line 525
    iget-boolean v5, v12, Lq/f0;->g:Z

    .line 526
    .line 527
    if-nez v5, :cond_1e

    .line 528
    .line 529
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 530
    .line 531
    .line 532
    move-result-object v5

    .line 533
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 534
    .line 535
    .line 536
    move-result-object v5

    .line 537
    cmpl-float v9, v2, p2

    .line 538
    .line 539
    if-nez v9, :cond_1b

    .line 540
    .line 541
    const/high16 v2, 0x41400000    # 12.0f

    .line 542
    .line 543
    const/4 v14, 0x2

    .line 544
    invoke-static {v14, v2, v5}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 545
    .line 546
    .line 547
    move-result v2

    .line 548
    goto :goto_c

    .line 549
    :cond_1b
    const/4 v14, 0x2

    .line 550
    :goto_c
    cmpl-float v9, v19, p2

    .line 551
    .line 552
    if-nez v9, :cond_1c

    .line 553
    .line 554
    const/high16 v9, 0x42e00000    # 112.0f

    .line 555
    .line 556
    invoke-static {v14, v9, v5}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 557
    .line 558
    .line 559
    move-result v19

    .line 560
    :cond_1c
    move/from16 v5, v19

    .line 561
    .line 562
    cmpl-float v9, v1, p2

    .line 563
    .line 564
    if-nez v9, :cond_1d

    .line 565
    .line 566
    move v1, v6

    .line 567
    :cond_1d
    invoke-virtual {v12, v2, v5, v1}, Lq/f0;->k(FFF)V

    .line 568
    .line 569
    .line 570
    :cond_1e
    invoke-virtual {v12}, Lq/f0;->h()Z

    .line 571
    .line 572
    .line 573
    goto :goto_d

    .line 574
    :cond_1f
    const/4 v1, 0x0

    .line 575
    iput v1, v12, Lq/f0;->a:I

    .line 576
    .line 577
    :cond_20
    :goto_d
    sget-boolean v1, Lq/v1;->b:Z

    .line 578
    .line 579
    if-eqz v1, :cond_22

    .line 580
    .line 581
    iget v1, v12, Lq/f0;->a:I

    .line 582
    .line 583
    if-eqz v1, :cond_22

    .line 584
    .line 585
    iget-object v1, v12, Lq/f0;->f:[I

    .line 586
    .line 587
    array-length v2, v1

    .line 588
    if-lez v2, :cond_22

    .line 589
    .line 590
    invoke-static {v11}, Lq/T;->a(Landroid/widget/TextView;)I

    .line 591
    .line 592
    .line 593
    move-result v2

    .line 594
    int-to-float v2, v2

    .line 595
    cmpl-float v2, v2, p2

    .line 596
    .line 597
    if-eqz v2, :cond_21

    .line 598
    .line 599
    iget v1, v12, Lq/f0;->d:F

    .line 600
    .line 601
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 602
    .line 603
    .line 604
    move-result v1

    .line 605
    iget v2, v12, Lq/f0;->e:F

    .line 606
    .line 607
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 608
    .line 609
    .line 610
    move-result v2

    .line 611
    iget v5, v12, Lq/f0;->c:F

    .line 612
    .line 613
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 614
    .line 615
    .line 616
    move-result v5

    .line 617
    const/4 v9, 0x0

    .line 618
    invoke-static {v11, v1, v2, v5, v9}, Lq/T;->b(Landroid/widget/TextView;IIII)V

    .line 619
    .line 620
    .line 621
    goto :goto_e

    .line 622
    :cond_21
    const/4 v9, 0x0

    .line 623
    invoke-static {v11, v1, v9}, Lq/T;->c(Landroid/widget/TextView;[II)V

    .line 624
    .line 625
    .line 626
    :cond_22
    :goto_e
    invoke-virtual {v7, v4, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 627
    .line 628
    .line 629
    move-result-object v1

    .line 630
    const/16 v2, 0x8

    .line 631
    .line 632
    const/4 v14, -0x1

    .line 633
    invoke-virtual {v1, v2, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 634
    .line 635
    .line 636
    move-result v2

    .line 637
    if-eq v2, v14, :cond_23

    .line 638
    .line 639
    invoke-virtual {v8, v7, v2}, Lq/p;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 640
    .line 641
    .line 642
    move-result-object v2

    .line 643
    :goto_f
    const/16 v3, 0xd

    .line 644
    .line 645
    goto :goto_10

    .line 646
    :cond_23
    const/4 v2, 0x0

    .line 647
    goto :goto_f

    .line 648
    :goto_10
    invoke-virtual {v1, v3, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 649
    .line 650
    .line 651
    move-result v3

    .line 652
    if-eq v3, v14, :cond_24

    .line 653
    .line 654
    invoke-virtual {v8, v7, v3}, Lq/p;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 655
    .line 656
    .line 657
    move-result-object v3

    .line 658
    goto :goto_11

    .line 659
    :cond_24
    const/4 v3, 0x0

    .line 660
    :goto_11
    const/16 v4, 0x9

    .line 661
    .line 662
    invoke-virtual {v1, v4, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 663
    .line 664
    .line 665
    move-result v4

    .line 666
    if-eq v4, v14, :cond_25

    .line 667
    .line 668
    invoke-virtual {v8, v7, v4}, Lq/p;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 669
    .line 670
    .line 671
    move-result-object v4

    .line 672
    :goto_12
    const/4 v10, 0x6

    .line 673
    goto :goto_13

    .line 674
    :cond_25
    const/4 v4, 0x0

    .line 675
    goto :goto_12

    .line 676
    :goto_13
    invoke-virtual {v1, v10, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 677
    .line 678
    .line 679
    move-result v5

    .line 680
    if-eq v5, v14, :cond_26

    .line 681
    .line 682
    invoke-virtual {v8, v7, v5}, Lq/p;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 683
    .line 684
    .line 685
    move-result-object v5

    .line 686
    goto :goto_14

    .line 687
    :cond_26
    const/4 v5, 0x0

    .line 688
    :goto_14
    const/16 v9, 0xa

    .line 689
    .line 690
    invoke-virtual {v1, v9, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 691
    .line 692
    .line 693
    move-result v9

    .line 694
    if-eq v9, v14, :cond_27

    .line 695
    .line 696
    invoke-virtual {v8, v7, v9}, Lq/p;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 697
    .line 698
    .line 699
    move-result-object v9

    .line 700
    goto :goto_15

    .line 701
    :cond_27
    const/4 v9, 0x0

    .line 702
    :goto_15
    const/4 v10, 0x7

    .line 703
    invoke-virtual {v1, v10, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 704
    .line 705
    .line 706
    move-result v10

    .line 707
    if-eq v10, v14, :cond_28

    .line 708
    .line 709
    invoke-virtual {v8, v7, v10}, Lq/p;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 710
    .line 711
    .line 712
    move-result-object v8

    .line 713
    goto :goto_16

    .line 714
    :cond_28
    const/4 v8, 0x0

    .line 715
    :goto_16
    if-nez v9, :cond_33

    .line 716
    .line 717
    if-eqz v8, :cond_29

    .line 718
    .line 719
    goto :goto_1f

    .line 720
    :cond_29
    if-nez v2, :cond_2a

    .line 721
    .line 722
    if-nez v3, :cond_2a

    .line 723
    .line 724
    if-nez v4, :cond_2a

    .line 725
    .line 726
    if-eqz v5, :cond_38

    .line 727
    .line 728
    :cond_2a
    invoke-static {v11}, Lq/P;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    .line 729
    .line 730
    .line 731
    move-result-object v8

    .line 732
    const/16 v20, 0x0

    .line 733
    .line 734
    aget-object v9, v8, v20

    .line 735
    .line 736
    if-nez v9, :cond_30

    .line 737
    .line 738
    const/16 v22, 0x2

    .line 739
    .line 740
    aget-object v10, v8, v22

    .line 741
    .line 742
    if-eqz v10, :cond_2b

    .line 743
    .line 744
    goto :goto_1b

    .line 745
    :cond_2b
    invoke-virtual {v11}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    .line 746
    .line 747
    .line 748
    move-result-object v8

    .line 749
    if-eqz v2, :cond_2c

    .line 750
    .line 751
    goto :goto_17

    .line 752
    :cond_2c
    aget-object v2, v8, v20

    .line 753
    .line 754
    :goto_17
    if-eqz v3, :cond_2d

    .line 755
    .line 756
    goto :goto_18

    .line 757
    :cond_2d
    const/16 v18, 0x1

    .line 758
    .line 759
    aget-object v3, v8, v18

    .line 760
    .line 761
    :goto_18
    if-eqz v4, :cond_2e

    .line 762
    .line 763
    goto :goto_19

    .line 764
    :cond_2e
    const/16 v22, 0x2

    .line 765
    .line 766
    aget-object v4, v8, v22

    .line 767
    .line 768
    :goto_19
    if-eqz v5, :cond_2f

    .line 769
    .line 770
    goto :goto_1a

    .line 771
    :cond_2f
    const/16 v16, 0x3

    .line 772
    .line 773
    aget-object v5, v8, v16

    .line 774
    .line 775
    :goto_1a
    invoke-virtual {v11, v2, v3, v4, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 776
    .line 777
    .line 778
    goto :goto_24

    .line 779
    :cond_30
    :goto_1b
    if-eqz v3, :cond_31

    .line 780
    .line 781
    :goto_1c
    const/16 v22, 0x2

    .line 782
    .line 783
    goto :goto_1d

    .line 784
    :cond_31
    const/16 v18, 0x1

    .line 785
    .line 786
    aget-object v3, v8, v18

    .line 787
    .line 788
    goto :goto_1c

    .line 789
    :goto_1d
    aget-object v2, v8, v22

    .line 790
    .line 791
    if-eqz v5, :cond_32

    .line 792
    .line 793
    goto :goto_1e

    .line 794
    :cond_32
    const/16 v16, 0x3

    .line 795
    .line 796
    aget-object v5, v8, v16

    .line 797
    .line 798
    :goto_1e
    invoke-static {v11, v9, v3, v2, v5}, Lq/P;->b(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 799
    .line 800
    .line 801
    goto :goto_24

    .line 802
    :cond_33
    :goto_1f
    invoke-static {v11}, Lq/P;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    .line 803
    .line 804
    .line 805
    move-result-object v2

    .line 806
    if-eqz v9, :cond_34

    .line 807
    .line 808
    goto :goto_20

    .line 809
    :cond_34
    const/16 v20, 0x0

    .line 810
    .line 811
    aget-object v9, v2, v20

    .line 812
    .line 813
    :goto_20
    if-eqz v3, :cond_35

    .line 814
    .line 815
    goto :goto_21

    .line 816
    :cond_35
    const/16 v18, 0x1

    .line 817
    .line 818
    aget-object v3, v2, v18

    .line 819
    .line 820
    :goto_21
    if-eqz v8, :cond_36

    .line 821
    .line 822
    goto :goto_22

    .line 823
    :cond_36
    const/16 v22, 0x2

    .line 824
    .line 825
    aget-object v8, v2, v22

    .line 826
    .line 827
    :goto_22
    if-eqz v5, :cond_37

    .line 828
    .line 829
    goto :goto_23

    .line 830
    :cond_37
    const/16 v16, 0x3

    .line 831
    .line 832
    aget-object v5, v2, v16

    .line 833
    .line 834
    :goto_23
    invoke-static {v11, v9, v3, v8, v5}, Lq/P;->b(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 835
    .line 836
    .line 837
    :cond_38
    :goto_24
    const/16 v2, 0xb

    .line 838
    .line 839
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 840
    .line 841
    .line 842
    move-result v3

    .line 843
    if-eqz v3, :cond_3b

    .line 844
    .line 845
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 846
    .line 847
    .line 848
    move-result v3

    .line 849
    if-eqz v3, :cond_39

    .line 850
    .line 851
    const/4 v9, 0x0

    .line 852
    invoke-virtual {v1, v2, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 853
    .line 854
    .line 855
    move-result v3

    .line 856
    if-eqz v3, :cond_39

    .line 857
    .line 858
    invoke-static {v7, v3}, LY0/e;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 859
    .line 860
    .line 861
    move-result-object v3

    .line 862
    if-eqz v3, :cond_39

    .line 863
    .line 864
    goto :goto_25

    .line 865
    :cond_39
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 866
    .line 867
    .line 868
    move-result-object v3

    .line 869
    :goto_25
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 870
    .line 871
    const/16 v4, 0x18

    .line 872
    .line 873
    if-lt v2, v4, :cond_3a

    .line 874
    .line 875
    invoke-virtual {v11, v3}, Landroid/widget/TextView;->setCompoundDrawableTintList(Landroid/content/res/ColorStateList;)V

    .line 876
    .line 877
    .line 878
    goto :goto_26

    .line 879
    :cond_3a
    instance-of v2, v11, Ln1/k;

    .line 880
    .line 881
    if-eqz v2, :cond_3b

    .line 882
    .line 883
    move-object v2, v11

    .line 884
    check-cast v2, Ln1/k;

    .line 885
    .line 886
    invoke-interface {v2, v3}, Ln1/k;->setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V

    .line 887
    .line 888
    .line 889
    :cond_3b
    :goto_26
    const/16 v2, 0xc

    .line 890
    .line 891
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 892
    .line 893
    .line 894
    move-result v3

    .line 895
    if-eqz v3, :cond_3d

    .line 896
    .line 897
    const/4 v14, -0x1

    .line 898
    invoke-virtual {v1, v2, v14}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 899
    .line 900
    .line 901
    move-result v2

    .line 902
    const/4 v3, 0x0

    .line 903
    invoke-static {v2, v3}, Lq/n0;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 904
    .line 905
    .line 906
    move-result-object v2

    .line 907
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 908
    .line 909
    const/16 v4, 0x18

    .line 910
    .line 911
    if-lt v3, v4, :cond_3c

    .line 912
    .line 913
    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setCompoundDrawableTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 914
    .line 915
    .line 916
    goto :goto_27

    .line 917
    :cond_3c
    instance-of v3, v11, Ln1/k;

    .line 918
    .line 919
    if-eqz v3, :cond_3d

    .line 920
    .line 921
    move-object v3, v11

    .line 922
    check-cast v3, Ln1/k;

    .line 923
    .line 924
    invoke-interface {v3, v2}, Ln1/k;->setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 925
    .line 926
    .line 927
    :cond_3d
    :goto_27
    const/16 v2, 0xf

    .line 928
    .line 929
    const/4 v14, -0x1

    .line 930
    invoke-virtual {v1, v2, v14}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 931
    .line 932
    .line 933
    move-result v2

    .line 934
    const/16 v3, 0x12

    .line 935
    .line 936
    invoke-virtual {v1, v3, v14}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 937
    .line 938
    .line 939
    move-result v3

    .line 940
    const/16 v4, 0x13

    .line 941
    .line 942
    invoke-virtual {v1, v4, v14}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 943
    .line 944
    .line 945
    move-result v4

    .line 946
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 947
    .line 948
    .line 949
    if-eq v2, v14, :cond_3e

    .line 950
    .line 951
    invoke-static {v11, v2}, Lr7/e;->L(Landroid/widget/TextView;I)V

    .line 952
    .line 953
    .line 954
    :cond_3e
    if-eq v3, v14, :cond_3f

    .line 955
    .line 956
    invoke-static {v11, v3}, Lr7/e;->M(Landroid/widget/TextView;I)V

    .line 957
    .line 958
    .line 959
    :cond_3f
    if-eq v4, v14, :cond_40

    .line 960
    .line 961
    invoke-static {v4}, Lj1/d;->c(I)V

    .line 962
    .line 963
    .line 964
    invoke-virtual {v11}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 965
    .line 966
    .line 967
    move-result-object v1

    .line 968
    const/4 v3, 0x0

    .line 969
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    .line 970
    .line 971
    .line 972
    move-result v1

    .line 973
    if-eq v4, v1, :cond_40

    .line 974
    .line 975
    sub-int/2addr v4, v1

    .line 976
    int-to-float v1, v4

    .line 977
    invoke-virtual {v11, v1, v6}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 978
    .line 979
    .line 980
    :cond_40
    return-void
.end method

.method public final g(Landroid/content/Context;I)V
    .locals 5

    .line 1
    sget-object v0, Li/a;->x:[I

    .line 2
    .line 3
    new-instance v1, Lmd/J;

    .line 4
    .line 5
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-direct {v1, p1, p2}, Lmd/J;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 10
    .line 11
    .line 12
    const/16 v0, 0xe

    .line 13
    .line 14
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    iget-object v3, p0, Lq/V;->a:Landroid/widget/TextView;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p2, v0, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 28
    .line 29
    .line 30
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    invoke-virtual {p2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    const/4 v2, -0x1

    .line 39
    invoke-virtual {p2, v4, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-nez v2, :cond_1

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-virtual {v3, v4, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-virtual {p0, p1, v1}, Lq/V;->m(Landroid/content/Context;Lmd/J;)V

    .line 50
    .line 51
    .line 52
    const/16 p1, 0x1a

    .line 53
    .line 54
    if-lt v0, p1, :cond_2

    .line 55
    .line 56
    const/16 p1, 0xd

    .line 57
    .line 58
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-eqz p1, :cond_2

    .line 69
    .line 70
    invoke-static {v3, p1}, Lq/T;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    :cond_2
    invoke-virtual {v1}, Lmd/J;->v()V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lq/V;->l:Landroid/graphics/Typeface;

    .line 77
    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    iget p2, p0, Lq/V;->j:I

    .line 81
    .line 82
    invoke-virtual {v3, p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 83
    .line 84
    .line 85
    :cond_3
    return-void
.end method

.method public final h(IIII)V
    .locals 2

    .line 1
    iget-object v0, p0, Lq/V;->i:Lq/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lq/f0;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, v0, Lq/f0;->j:Landroid/content/Context;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    int-to-float p1, p1

    .line 20
    invoke-static {p4, p1, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    int-to-float p2, p2

    .line 25
    invoke-static {p4, p2, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    int-to-float p3, p3

    .line 30
    invoke-static {p4, p3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    invoke-virtual {v0, p1, p2, p3}, Lq/f0;->k(FFF)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lq/f0;->h()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0}, Lq/f0;->a()V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method

.method public final i([II)V
    .locals 6

    .line 1
    iget-object v0, p0, Lq/V;->i:Lq/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lq/f0;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_4

    .line 8
    .line 9
    array-length v1, p1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-lez v1, :cond_3

    .line 12
    .line 13
    new-array v3, v1, [I

    .line 14
    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    iget-object v4, v0, Lq/f0;->j:Landroid/content/Context;

    .line 23
    .line 24
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    :goto_0
    if-ge v2, v1, :cond_1

    .line 33
    .line 34
    aget v5, p1, v2

    .line 35
    .line 36
    int-to-float v5, v5

    .line 37
    invoke-static {p2, v5, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    aput v5, v3, v2

    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :goto_1
    invoke-static {v3}, Lq/f0;->b([I)[I

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iput-object p2, v0, Lq/f0;->f:[I

    .line 55
    .line 56
    invoke-virtual {v0}, Lq/f0;->i()Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    if-eqz p2, :cond_2

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 64
    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v1, "None of the preset sizes is valid: "

    .line 68
    .line 69
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p2

    .line 87
    :cond_3
    iput-boolean v2, v0, Lq/f0;->g:Z

    .line 88
    .line 89
    :goto_2
    invoke-virtual {v0}, Lq/f0;->h()Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_4

    .line 94
    .line 95
    invoke-virtual {v0}, Lq/f0;->a()V

    .line 96
    .line 97
    .line 98
    :cond_4
    return-void
.end method

.method public final j(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lq/V;->i:Lq/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lq/f0;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-ne p1, v1, :cond_0

    .line 13
    .line 14
    iget-object p1, v0, Lq/f0;->j:Landroid/content/Context;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/high16 v1, 0x41400000    # 12.0f

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    invoke-static {v2, v1, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/high16 v3, 0x42e00000    # 112.0f

    .line 32
    .line 33
    invoke-static {v2, v3, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    const/high16 v2, 0x3f800000    # 1.0f

    .line 38
    .line 39
    invoke-virtual {v0, v1, p1, v2}, Lq/f0;->k(FFF)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lq/f0;->h()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    invoke-virtual {v0}, Lq/f0;->a()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 53
    .line 54
    const-string v1, "Unknown auto-size text type: "

    .line 55
    .line 56
    invoke-static {p1, v1}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0

    .line 64
    :cond_1
    const/4 p1, 0x0

    .line 65
    iput p1, v0, Lq/f0;->a:I

    .line 66
    .line 67
    const/high16 v1, -0x40800000    # -1.0f

    .line 68
    .line 69
    iput v1, v0, Lq/f0;->d:F

    .line 70
    .line 71
    iput v1, v0, Lq/f0;->e:F

    .line 72
    .line 73
    iput v1, v0, Lq/f0;->c:F

    .line 74
    .line 75
    new-array v1, p1, [I

    .line 76
    .line 77
    iput-object v1, v0, Lq/f0;->f:[I

    .line 78
    .line 79
    iput-boolean p1, v0, Lq/f0;->b:Z

    .line 80
    .line 81
    :cond_2
    return-void
.end method

.method public final k(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq/V;->h:LK8/f;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LK8/f;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lq/V;->h:LK8/f;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lq/V;->h:LK8/f;

    .line 13
    .line 14
    iput-object p1, v0, LK8/f;->c:Ljava/lang/Object;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    :goto_0
    iput-boolean p1, v0, LK8/f;->b:Z

    .line 22
    .line 23
    iput-object v0, p0, Lq/V;->b:LK8/f;

    .line 24
    .line 25
    iput-object v0, p0, Lq/V;->c:LK8/f;

    .line 26
    .line 27
    iput-object v0, p0, Lq/V;->d:LK8/f;

    .line 28
    .line 29
    iput-object v0, p0, Lq/V;->e:LK8/f;

    .line 30
    .line 31
    iput-object v0, p0, Lq/V;->f:LK8/f;

    .line 32
    .line 33
    iput-object v0, p0, Lq/V;->g:LK8/f;

    .line 34
    .line 35
    return-void
.end method

.method public final l(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq/V;->h:LK8/f;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LK8/f;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lq/V;->h:LK8/f;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lq/V;->h:LK8/f;

    .line 13
    .line 14
    iput-object p1, v0, LK8/f;->d:Ljava/lang/Object;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    :goto_0
    iput-boolean p1, v0, LK8/f;->a:Z

    .line 22
    .line 23
    iput-object v0, p0, Lq/V;->b:LK8/f;

    .line 24
    .line 25
    iput-object v0, p0, Lq/V;->c:LK8/f;

    .line 26
    .line 27
    iput-object v0, p0, Lq/V;->d:LK8/f;

    .line 28
    .line 29
    iput-object v0, p0, Lq/V;->e:LK8/f;

    .line 30
    .line 31
    iput-object v0, p0, Lq/V;->f:LK8/f;

    .line 32
    .line 33
    iput-object v0, p0, Lq/V;->g:LK8/f;

    .line 34
    .line 35
    return-void
.end method

.method public final m(Landroid/content/Context;Lmd/J;)V
    .locals 11

    .line 1
    iget v0, p0, Lq/V;->j:I

    .line 2
    .line 3
    iget-object v1, p2, Lmd/J;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/content/res/TypedArray;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iput v0, p0, Lq/V;->j:I

    .line 13
    .line 14
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 15
    .line 16
    const/16 v3, 0x1c

    .line 17
    .line 18
    const/4 v4, -0x1

    .line 19
    if-lt v0, v3, :cond_0

    .line 20
    .line 21
    const/16 v5, 0xb

    .line 22
    .line 23
    invoke-virtual {v1, v5, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    iput v5, p0, Lq/V;->k:I

    .line 28
    .line 29
    if-eq v5, v4, :cond_0

    .line 30
    .line 31
    iget v5, p0, Lq/V;->j:I

    .line 32
    .line 33
    and-int/2addr v5, v2

    .line 34
    iput v5, p0, Lq/V;->j:I

    .line 35
    .line 36
    :cond_0
    const/16 v5, 0xa

    .line 37
    .line 38
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    const/16 v7, 0xc

    .line 43
    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v9, 0x1

    .line 46
    if-nez v6, :cond_5

    .line 47
    .line 48
    invoke-virtual {v1, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_e

    .line 60
    .line 61
    iput-boolean v8, p0, Lq/V;->m:Z

    .line 62
    .line 63
    invoke-virtual {v1, v9, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eq p1, v9, :cond_4

    .line 68
    .line 69
    if-eq p1, v2, :cond_3

    .line 70
    .line 71
    const/4 p2, 0x3

    .line 72
    if-eq p1, p2, :cond_2

    .line 73
    .line 74
    goto/16 :goto_4

    .line 75
    .line 76
    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    .line 77
    .line 78
    iput-object p1, p0, Lq/V;->l:Landroid/graphics/Typeface;

    .line 79
    .line 80
    return-void

    .line 81
    :cond_3
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    .line 82
    .line 83
    iput-object p1, p0, Lq/V;->l:Landroid/graphics/Typeface;

    .line 84
    .line 85
    return-void

    .line 86
    :cond_4
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 87
    .line 88
    iput-object p1, p0, Lq/V;->l:Landroid/graphics/Typeface;

    .line 89
    .line 90
    return-void

    .line 91
    :cond_5
    :goto_0
    const/4 v6, 0x0

    .line 92
    iput-object v6, p0, Lq/V;->l:Landroid/graphics/Typeface;

    .line 93
    .line 94
    invoke-virtual {v1, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-eqz v6, :cond_6

    .line 99
    .line 100
    move v5, v7

    .line 101
    :cond_6
    iget v6, p0, Lq/V;->k:I

    .line 102
    .line 103
    iget v7, p0, Lq/V;->j:I

    .line 104
    .line 105
    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-nez p1, :cond_b

    .line 110
    .line 111
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 112
    .line 113
    iget-object v10, p0, Lq/V;->a:Landroid/widget/TextView;

    .line 114
    .line 115
    invoke-direct {p1, v10}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    new-instance v10, Lq/O;

    .line 119
    .line 120
    invoke-direct {v10, p0, v6, v7, p1}, Lq/O;-><init>(Lq/V;IILjava/lang/ref/WeakReference;)V

    .line 121
    .line 122
    .line 123
    :try_start_0
    iget p1, p0, Lq/V;->j:I

    .line 124
    .line 125
    invoke-virtual {p2, v5, p1, v10}, Lmd/J;->p(IILq/O;)Landroid/graphics/Typeface;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-eqz p1, :cond_9

    .line 130
    .line 131
    if-lt v0, v3, :cond_8

    .line 132
    .line 133
    iget p2, p0, Lq/V;->k:I

    .line 134
    .line 135
    if-eq p2, v4, :cond_8

    .line 136
    .line 137
    invoke-static {p1, v8}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iget p2, p0, Lq/V;->k:I

    .line 142
    .line 143
    iget v0, p0, Lq/V;->j:I

    .line 144
    .line 145
    and-int/2addr v0, v2

    .line 146
    if-eqz v0, :cond_7

    .line 147
    .line 148
    move v0, v9

    .line 149
    goto :goto_1

    .line 150
    :cond_7
    move v0, v8

    .line 151
    :goto_1
    invoke-static {p1, p2, v0}, Lq/U;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    iput-object p1, p0, Lq/V;->l:Landroid/graphics/Typeface;

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_8
    iput-object p1, p0, Lq/V;->l:Landroid/graphics/Typeface;

    .line 159
    .line 160
    :cond_9
    :goto_2
    iget-object p1, p0, Lq/V;->l:Landroid/graphics/Typeface;

    .line 161
    .line 162
    if-nez p1, :cond_a

    .line 163
    .line 164
    move p1, v9

    .line 165
    goto :goto_3

    .line 166
    :cond_a
    move p1, v8

    .line 167
    :goto_3
    iput-boolean p1, p0, Lq/V;->m:Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 168
    .line 169
    :catch_0
    :cond_b
    iget-object p1, p0, Lq/V;->l:Landroid/graphics/Typeface;

    .line 170
    .line 171
    if-nez p1, :cond_e

    .line 172
    .line 173
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    if-eqz p1, :cond_e

    .line 178
    .line 179
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 180
    .line 181
    if-lt p2, v3, :cond_d

    .line 182
    .line 183
    iget p2, p0, Lq/V;->k:I

    .line 184
    .line 185
    if-eq p2, v4, :cond_d

    .line 186
    .line 187
    invoke-static {p1, v8}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    iget p2, p0, Lq/V;->k:I

    .line 192
    .line 193
    iget v0, p0, Lq/V;->j:I

    .line 194
    .line 195
    and-int/2addr v0, v2

    .line 196
    if-eqz v0, :cond_c

    .line 197
    .line 198
    move v8, v9

    .line 199
    :cond_c
    invoke-static {p1, p2, v8}, Lq/U;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    iput-object p1, p0, Lq/V;->l:Landroid/graphics/Typeface;

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_d
    iget p2, p0, Lq/V;->j:I

    .line 207
    .line 208
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    iput-object p1, p0, Lq/V;->l:Landroid/graphics/Typeface;

    .line 213
    .line 214
    :cond_e
    :goto_4
    return-void
.end method
