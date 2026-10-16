.class public final Ls6/K;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Ls6/E;


# instance fields
.field public final a:Ls6/b;

.field public final b:Ls6/I;

.field public c:Ljava/util/List;

.field public d:Ls6/c;

.field public e:F

.field public f:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    .line 4
    .line 5
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    .line 7
    iput-object v1, p0, Ls6/K;->c:Ljava/util/List;

    .line 8
    .line 9
    sget-object v1, Ls6/c;->g:Ls6/c;

    .line 10
    .line 11
    iput-object v1, p0, Ls6/K;->d:Ls6/c;

    .line 12
    .line 13
    const v1, 0x3d5a511a    # 0.0533f

    .line 14
    .line 15
    .line 16
    iput v1, p0, Ls6/K;->e:F

    .line 17
    .line 18
    const v1, 0x3da3d70a    # 0.08f

    .line 19
    .line 20
    .line 21
    iput v1, p0, Ls6/K;->f:F

    .line 22
    .line 23
    new-instance v1, Ls6/b;

    .line 24
    .line 25
    invoke-direct {v1, p1}, Ls6/b;-><init>(Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Ls6/K;->a:Ls6/b;

    .line 29
    .line 30
    new-instance v2, Ls6/I;

    .line 31
    .line 32
    invoke-direct {v2, p1, v0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 33
    .line 34
    .line 35
    iput-object v2, p0, Ls6/K;->b:Ls6/I;

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    invoke-virtual {v2, p1}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Ls6/c;FF)V
    .locals 5

    .line 1
    iput-object p2, p0, Ls6/K;->d:Ls6/c;

    .line 2
    .line 3
    iput p3, p0, Ls6/K;->e:F

    .line 4
    .line 5
    iput p4, p0, Ls6/K;->f:F

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-ge v2, v3, :cond_1

    .line 23
    .line 24
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lh6/b;

    .line 29
    .line 30
    iget-object v4, v3, Lh6/b;->d:Landroid/graphics/Bitmap;

    .line 31
    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-object p1, p0, Ls6/K;->c:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-nez p1, :cond_3

    .line 57
    .line 58
    :cond_2
    iput-object v1, p0, Ls6/K;->c:Ljava/util/List;

    .line 59
    .line 60
    invoke-virtual {p0}, Ls6/K;->c()V

    .line 61
    .line 62
    .line 63
    :cond_3
    iget-object p1, p0, Ls6/K;->a:Ls6/b;

    .line 64
    .line 65
    invoke-virtual {p1, v0, p2, p3, p4}, Ls6/b;->a(Ljava/util/List;Ls6/c;FF)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final b(FI)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    sub-int/2addr v1, v2

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    sub-int/2addr v1, v2

    .line 19
    invoke-static {p2, p1, v0, v1}, Lxg/g;->O(IFII)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const p2, -0x800001

    .line 24
    .line 25
    .line 26
    cmpl-float p2, p1, p2

    .line 27
    .line 28
    if-nez p2, :cond_0

    .line 29
    .line 30
    const-string p1, "unset"

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    .line 46
    .line 47
    div-float/2addr p1, p2

    .line 48
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const/4 p2, 0x1

    .line 53
    new-array p2, p2, [Ljava/lang/Object;

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    aput-object p1, p2, v0

    .line 57
    .line 58
    sget p1, Lu6/v;->a:I

    .line 59
    .line 60
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 61
    .line 62
    const-string v0, "%.2fpx"

    .line 63
    .line 64
    invoke-static {p1, v0, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    return-object p1
.end method

.method public final c()V
    .locals 50

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x1

    .line 7
    new-instance v5, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    iget-object v6, v0, Ls6/K;->d:Ls6/c;

    .line 13
    .line 14
    iget v6, v6, Ls6/c;->a:I

    .line 15
    .line 16
    invoke-static {v6}, Lvf/a;->O(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    iget v7, v0, Ls6/K;->e:F

    .line 21
    .line 22
    const/4 v8, 0x0

    .line 23
    invoke-virtual {v0, v7, v8}, Ls6/K;->b(FI)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    const v9, 0x3f99999a    # 1.2f

    .line 28
    .line 29
    .line 30
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 31
    .line 32
    .line 33
    move-result-object v10

    .line 34
    iget-object v11, v0, Ls6/K;->d:Ls6/c;

    .line 35
    .line 36
    iget v12, v11, Ls6/c;->d:I

    .line 37
    .line 38
    const-string v13, "unset"

    .line 39
    .line 40
    iget v11, v11, Ls6/c;->e:I

    .line 41
    .line 42
    if-eq v12, v4, :cond_3

    .line 43
    .line 44
    if-eq v12, v3, :cond_2

    .line 45
    .line 46
    if-eq v12, v2, :cond_1

    .line 47
    .line 48
    if-eq v12, v1, :cond_0

    .line 49
    .line 50
    move-object v11, v13

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-static {v11}, Lvf/a;->O(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v11

    .line 56
    sget v12, Lu6/v;->a:I

    .line 57
    .line 58
    sget-object v12, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 59
    .line 60
    const-string v12, "-0.05em -0.05em 0.15em "

    .line 61
    .line 62
    invoke-virtual {v12, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v11

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    invoke-static {v11}, Lvf/a;->O(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v11

    .line 71
    sget v12, Lu6/v;->a:I

    .line 72
    .line 73
    sget-object v12, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 74
    .line 75
    const-string v12, "0.06em 0.08em 0.15em "

    .line 76
    .line 77
    invoke-virtual {v12, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v11

    .line 81
    goto :goto_0

    .line 82
    :cond_2
    invoke-static {v11}, Lvf/a;->O(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v11

    .line 86
    sget v12, Lu6/v;->a:I

    .line 87
    .line 88
    sget-object v12, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 89
    .line 90
    const-string v12, "0.1em 0.12em 0.15em "

    .line 91
    .line 92
    invoke-virtual {v12, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v11

    .line 96
    goto :goto_0

    .line 97
    :cond_3
    invoke-static {v11}, Lvf/a;->O(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v11

    .line 101
    new-array v12, v4, [Ljava/lang/Object;

    .line 102
    .line 103
    aput-object v11, v12, v8

    .line 104
    .line 105
    sget v11, Lu6/v;->a:I

    .line 106
    .line 107
    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 108
    .line 109
    const-string v14, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s"

    .line 110
    .line 111
    invoke-static {v11, v14, v12}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v11

    .line 115
    :goto_0
    new-array v12, v1, [Ljava/lang/Object;

    .line 116
    .line 117
    aput-object v6, v12, v8

    .line 118
    .line 119
    aput-object v7, v12, v4

    .line 120
    .line 121
    aput-object v10, v12, v3

    .line 122
    .line 123
    aput-object v11, v12, v2

    .line 124
    .line 125
    sget v6, Lu6/v;->a:I

    .line 126
    .line 127
    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 128
    .line 129
    const-string v7, "<body><div style=\'-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;\'>"

    .line 130
    .line 131
    invoke-static {v6, v7, v12}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    new-instance v6, Ljava/util/HashMap;

    .line 139
    .line 140
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 141
    .line 142
    .line 143
    iget-object v7, v0, Ls6/K;->d:Ls6/c;

    .line 144
    .line 145
    iget v7, v7, Ls6/c;->b:I

    .line 146
    .line 147
    invoke-static {v7}, Lvf/a;->O(I)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    new-instance v10, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    const-string v11, "background-color:"

    .line 154
    .line 155
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const-string v7, ";"

    .line 162
    .line 163
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    const-string v12, ".default_bg,.default_bg *"

    .line 171
    .line 172
    invoke-virtual {v6, v12, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move v10, v8

    .line 176
    :goto_1
    iget-object v12, v0, Ls6/K;->c:Ljava/util/List;

    .line 177
    .line 178
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 179
    .line 180
    .line 181
    move-result v12

    .line 182
    if-ge v10, v12, :cond_53

    .line 183
    .line 184
    iget-object v12, v0, Ls6/K;->c:Ljava/util/List;

    .line 185
    .line 186
    invoke-interface {v12, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v12

    .line 190
    check-cast v12, Lh6/b;

    .line 191
    .line 192
    iget v14, v12, Lh6/b;->h:F

    .line 193
    .line 194
    const v15, -0x800001

    .line 195
    .line 196
    .line 197
    cmpl-float v16, v14, v15

    .line 198
    .line 199
    const/high16 v17, 0x42c80000    # 100.0f

    .line 200
    .line 201
    if-eqz v16, :cond_4

    .line 202
    .line 203
    mul-float v14, v14, v17

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_4
    const/high16 v14, 0x42480000    # 50.0f

    .line 207
    .line 208
    :goto_2
    const/16 v16, -0x32

    .line 209
    .line 210
    const/16 v18, -0x64

    .line 211
    .line 212
    move/from16 v19, v1

    .line 213
    .line 214
    iget v1, v12, Lh6/b;->i:I

    .line 215
    .line 216
    if-eq v1, v4, :cond_6

    .line 217
    .line 218
    if-eq v1, v3, :cond_5

    .line 219
    .line 220
    move v1, v8

    .line 221
    move/from16 v20, v9

    .line 222
    .line 223
    goto :goto_3

    .line 224
    :cond_5
    move/from16 v20, v9

    .line 225
    .line 226
    move/from16 v1, v18

    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_6
    move/from16 v20, v9

    .line 230
    .line 231
    move/from16 v1, v16

    .line 232
    .line 233
    :goto_3
    iget v9, v12, Lh6/b;->e:F

    .line 234
    .line 235
    cmpl-float v21, v9, v15

    .line 236
    .line 237
    const/high16 v22, 0x3f800000    # 1.0f

    .line 238
    .line 239
    const/16 v23, 0x0

    .line 240
    .line 241
    move/from16 v24, v15

    .line 242
    .line 243
    const-string v15, "%.2f%%"

    .line 244
    .line 245
    iget v2, v12, Lh6/b;->p:I

    .line 246
    .line 247
    if-eqz v21, :cond_e

    .line 248
    .line 249
    move/from16 v21, v8

    .line 250
    .line 251
    iget v8, v12, Lh6/b;->f:I

    .line 252
    .line 253
    if-eq v8, v4, :cond_c

    .line 254
    .line 255
    mul-float v9, v9, v17

    .line 256
    .line 257
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 258
    .line 259
    .line 260
    move-result-object v8

    .line 261
    new-array v9, v4, [Ljava/lang/Object;

    .line 262
    .line 263
    aput-object v8, v9, v21

    .line 264
    .line 265
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 266
    .line 267
    invoke-static {v8, v15, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v8

    .line 271
    iget v9, v12, Lh6/b;->g:I

    .line 272
    .line 273
    if-ne v2, v4, :cond_9

    .line 274
    .line 275
    if-eq v9, v4, :cond_8

    .line 276
    .line 277
    if-eq v9, v3, :cond_7

    .line 278
    .line 279
    move/from16 v9, v21

    .line 280
    .line 281
    goto :goto_4

    .line 282
    :cond_7
    move/from16 v9, v18

    .line 283
    .line 284
    goto :goto_4

    .line 285
    :cond_8
    move/from16 v9, v16

    .line 286
    .line 287
    :goto_4
    neg-int v9, v9

    .line 288
    move/from16 v18, v9

    .line 289
    .line 290
    goto :goto_6

    .line 291
    :cond_9
    if-eq v9, v4, :cond_b

    .line 292
    .line 293
    if-eq v9, v3, :cond_a

    .line 294
    .line 295
    move/from16 v16, v21

    .line 296
    .line 297
    goto :goto_5

    .line 298
    :cond_a
    move/from16 v16, v18

    .line 299
    .line 300
    :cond_b
    :goto_5
    move/from16 v18, v16

    .line 301
    .line 302
    :goto_6
    move/from16 v3, v21

    .line 303
    .line 304
    goto :goto_7

    .line 305
    :cond_c
    cmpl-float v8, v9, v23

    .line 306
    .line 307
    const-string v3, "%.2fem"

    .line 308
    .line 309
    if-ltz v8, :cond_d

    .line 310
    .line 311
    mul-float v9, v9, v20

    .line 312
    .line 313
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 314
    .line 315
    .line 316
    move-result-object v8

    .line 317
    new-array v9, v4, [Ljava/lang/Object;

    .line 318
    .line 319
    aput-object v8, v9, v21

    .line 320
    .line 321
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 322
    .line 323
    invoke-static {v8, v3, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v8

    .line 327
    move/from16 v3, v21

    .line 328
    .line 329
    move/from16 v18, v3

    .line 330
    .line 331
    goto :goto_7

    .line 332
    :cond_d
    neg-float v8, v9

    .line 333
    sub-float v8, v8, v22

    .line 334
    .line 335
    mul-float v8, v8, v20

    .line 336
    .line 337
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 338
    .line 339
    .line 340
    move-result-object v8

    .line 341
    new-array v9, v4, [Ljava/lang/Object;

    .line 342
    .line 343
    aput-object v8, v9, v21

    .line 344
    .line 345
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 346
    .line 347
    invoke-static {v8, v3, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v8

    .line 351
    move v3, v4

    .line 352
    move/from16 v18, v21

    .line 353
    .line 354
    goto :goto_7

    .line 355
    :cond_e
    move/from16 v21, v8

    .line 356
    .line 357
    iget v3, v0, Ls6/K;->f:F

    .line 358
    .line 359
    sub-float v22, v22, v3

    .line 360
    .line 361
    mul-float v22, v22, v17

    .line 362
    .line 363
    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    new-array v8, v4, [Ljava/lang/Object;

    .line 368
    .line 369
    aput-object v3, v8, v21

    .line 370
    .line 371
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 372
    .line 373
    invoke-static {v3, v15, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v8

    .line 377
    goto :goto_6

    .line 378
    :goto_7
    iget v9, v12, Lh6/b;->j:F

    .line 379
    .line 380
    cmpl-float v22, v9, v24

    .line 381
    .line 382
    if-eqz v22, :cond_f

    .line 383
    .line 384
    mul-float v9, v9, v17

    .line 385
    .line 386
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 387
    .line 388
    .line 389
    move-result-object v9

    .line 390
    move/from16 v22, v1

    .line 391
    .line 392
    new-array v1, v4, [Ljava/lang/Object;

    .line 393
    .line 394
    aput-object v9, v1, v21

    .line 395
    .line 396
    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 397
    .line 398
    invoke-static {v9, v15, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    goto :goto_8

    .line 403
    :cond_f
    move/from16 v22, v1

    .line 404
    .line 405
    const-string v1, "fit-content"

    .line 406
    .line 407
    :goto_8
    const-string v9, "start"

    .line 408
    .line 409
    const-string v15, "end"

    .line 410
    .line 411
    const-string v24, "center"

    .line 412
    .line 413
    iget-object v4, v12, Lh6/b;->b:Landroid/text/Layout$Alignment;

    .line 414
    .line 415
    if-nez v4, :cond_10

    .line 416
    .line 417
    move-object/from16 v27, v1

    .line 418
    .line 419
    move/from16 v28, v3

    .line 420
    .line 421
    move-object/from16 v4, v24

    .line 422
    .line 423
    const/4 v1, 0x2

    .line 424
    :goto_9
    const/4 v3, 0x1

    .line 425
    goto :goto_a

    .line 426
    :cond_10
    sget-object v27, Ls6/J;->a:[I

    .line 427
    .line 428
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 429
    .line 430
    .line 431
    move-result v4

    .line 432
    aget v4, v27, v4

    .line 433
    .line 434
    move-object/from16 v27, v1

    .line 435
    .line 436
    const/4 v1, 0x1

    .line 437
    if-eq v4, v1, :cond_12

    .line 438
    .line 439
    const/4 v1, 0x2

    .line 440
    if-eq v4, v1, :cond_11

    .line 441
    .line 442
    move/from16 v28, v3

    .line 443
    .line 444
    move-object/from16 v4, v24

    .line 445
    .line 446
    goto :goto_9

    .line 447
    :cond_11
    move/from16 v28, v3

    .line 448
    .line 449
    move-object v4, v15

    .line 450
    goto :goto_9

    .line 451
    :cond_12
    const/4 v1, 0x2

    .line 452
    move/from16 v28, v3

    .line 453
    .line 454
    move-object v4, v9

    .line 455
    goto :goto_9

    .line 456
    :goto_a
    if-eq v2, v3, :cond_14

    .line 457
    .line 458
    if-eq v2, v1, :cond_13

    .line 459
    .line 460
    const-string v1, "horizontal-tb"

    .line 461
    .line 462
    goto :goto_b

    .line 463
    :cond_13
    const-string v1, "vertical-lr"

    .line 464
    .line 465
    goto :goto_b

    .line 466
    :cond_14
    const-string v1, "vertical-rl"

    .line 467
    .line 468
    :goto_b
    iget v3, v12, Lh6/b;->n:I

    .line 469
    .line 470
    move-object/from16 v29, v1

    .line 471
    .line 472
    iget v1, v12, Lh6/b;->o:F

    .line 473
    .line 474
    invoke-virtual {v0, v1, v3}, Ls6/K;->b(FI)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    iget-boolean v3, v12, Lh6/b;->l:Z

    .line 479
    .line 480
    if-eqz v3, :cond_15

    .line 481
    .line 482
    iget v3, v12, Lh6/b;->m:I

    .line 483
    .line 484
    goto :goto_c

    .line 485
    :cond_15
    iget-object v3, v0, Ls6/K;->d:Ls6/c;

    .line 486
    .line 487
    iget v3, v3, Ls6/c;->c:I

    .line 488
    .line 489
    :goto_c
    invoke-static {v3}, Lvf/a;->O(I)Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v3

    .line 493
    const-string v30, "right"

    .line 494
    .line 495
    const-string v31, "top"

    .line 496
    .line 497
    const-string v32, "left"

    .line 498
    .line 499
    move-object/from16 v33, v1

    .line 500
    .line 501
    const/4 v1, 0x1

    .line 502
    if-eq v2, v1, :cond_1a

    .line 503
    .line 504
    const/4 v1, 0x2

    .line 505
    if-eq v2, v1, :cond_18

    .line 506
    .line 507
    if-eqz v28, :cond_16

    .line 508
    .line 509
    const-string v31, "bottom"

    .line 510
    .line 511
    :cond_16
    move-object/from16 v30, v31

    .line 512
    .line 513
    move-object/from16 v31, v32

    .line 514
    .line 515
    :cond_17
    :goto_d
    const/4 v1, 0x2

    .line 516
    goto :goto_f

    .line 517
    :cond_18
    if-eqz v28, :cond_19

    .line 518
    .line 519
    goto :goto_d

    .line 520
    :cond_19
    :goto_e
    move-object/from16 v30, v32

    .line 521
    .line 522
    goto :goto_d

    .line 523
    :cond_1a
    if-eqz v28, :cond_17

    .line 524
    .line 525
    goto :goto_e

    .line 526
    :goto_f
    if-eq v2, v1, :cond_1c

    .line 527
    .line 528
    const/4 v1, 0x1

    .line 529
    if-ne v2, v1, :cond_1b

    .line 530
    .line 531
    goto :goto_10

    .line 532
    :cond_1b
    const-string v1, "width"

    .line 533
    .line 534
    move/from16 v49, v22

    .line 535
    .line 536
    move/from16 v22, v18

    .line 537
    .line 538
    move/from16 v18, v49

    .line 539
    .line 540
    goto :goto_11

    .line 541
    :cond_1c
    :goto_10
    const-string v1, "height"

    .line 542
    .line 543
    :goto_11
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 544
    .line 545
    .line 546
    move-result-object v28

    .line 547
    invoke-virtual/range {v28 .. v28}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 548
    .line 549
    .line 550
    move-result-object v28

    .line 551
    move-object/from16 v32, v1

    .line 552
    .line 553
    invoke-virtual/range {v28 .. v28}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 558
    .line 559
    sget-object v28, Ls6/h;->a:Ljava/util/regex/Pattern;

    .line 560
    .line 561
    move/from16 v28, v1

    .line 562
    .line 563
    const-string v1, "</span>"

    .line 564
    .line 565
    move-object/from16 v34, v3

    .line 566
    .line 567
    const-string v3, ";\'>"

    .line 568
    .line 569
    move-object/from16 v35, v4

    .line 570
    .line 571
    const-string v4, ""

    .line 572
    .line 573
    move-object/from16 v36, v8

    .line 574
    .line 575
    iget-object v8, v12, Lh6/b;->a:Ljava/lang/CharSequence;

    .line 576
    .line 577
    if-nez v8, :cond_1d

    .line 578
    .line 579
    new-instance v8, LNe/a;

    .line 580
    .line 581
    move-object/from16 v37, v9

    .line 582
    .line 583
    move/from16 v9, v21

    .line 584
    .line 585
    invoke-direct {v8, v4, v9}, LNe/a;-><init>(Ljava/lang/String;Z)V

    .line 586
    .line 587
    .line 588
    move-object/from16 v38, v4

    .line 589
    .line 590
    move-object/from16 v41, v7

    .line 591
    .line 592
    :goto_12
    move/from16 v39, v10

    .line 593
    .line 594
    move-object/from16 v47, v11

    .line 595
    .line 596
    move/from16 v40, v14

    .line 597
    .line 598
    move-object/from16 v43, v15

    .line 599
    .line 600
    goto/16 :goto_24

    .line 601
    .line 602
    :cond_1d
    move-object/from16 v37, v9

    .line 603
    .line 604
    instance-of v9, v8, Landroid/text/Spanned;

    .line 605
    .line 606
    if-nez v9, :cond_1e

    .line 607
    .line 608
    new-instance v9, LNe/a;

    .line 609
    .line 610
    invoke-static {v8}, Ls6/h;->a(Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v8

    .line 614
    move-object/from16 v38, v4

    .line 615
    .line 616
    const/4 v4, 0x0

    .line 617
    invoke-direct {v9, v8, v4}, LNe/a;-><init>(Ljava/lang/String;Z)V

    .line 618
    .line 619
    .line 620
    move-object/from16 v41, v7

    .line 621
    .line 622
    move-object v8, v9

    .line 623
    goto :goto_12

    .line 624
    :cond_1e
    move-object/from16 v38, v4

    .line 625
    .line 626
    const/4 v4, 0x0

    .line 627
    check-cast v8, Landroid/text/Spanned;

    .line 628
    .line 629
    new-instance v9, Ljava/util/HashSet;

    .line 630
    .line 631
    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    .line 632
    .line 633
    .line 634
    move/from16 v39, v10

    .line 635
    .line 636
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 637
    .line 638
    .line 639
    move-result v10

    .line 640
    move/from16 v40, v14

    .line 641
    .line 642
    const-class v14, Landroid/text/style/BackgroundColorSpan;

    .line 643
    .line 644
    invoke-interface {v8, v4, v10, v14}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v10

    .line 648
    check-cast v10, [Landroid/text/style/BackgroundColorSpan;

    .line 649
    .line 650
    array-length v4, v10

    .line 651
    const/4 v14, 0x0

    .line 652
    :goto_13
    if-ge v14, v4, :cond_1f

    .line 653
    .line 654
    aget-object v41, v10, v14

    .line 655
    .line 656
    invoke-virtual/range {v41 .. v41}, Landroid/text/style/BackgroundColorSpan;->getBackgroundColor()I

    .line 657
    .line 658
    .line 659
    move-result v41

    .line 660
    move/from16 v42, v4

    .line 661
    .line 662
    invoke-static/range {v41 .. v41}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 663
    .line 664
    .line 665
    move-result-object v4

    .line 666
    invoke-virtual {v9, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 667
    .line 668
    .line 669
    const/16 v26, 0x1

    .line 670
    .line 671
    add-int/lit8 v14, v14, 0x1

    .line 672
    .line 673
    move/from16 v4, v42

    .line 674
    .line 675
    goto :goto_13

    .line 676
    :cond_1f
    new-instance v4, Ljava/util/HashMap;

    .line 677
    .line 678
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v9}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 682
    .line 683
    .line 684
    move-result-object v9

    .line 685
    :goto_14
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 686
    .line 687
    .line 688
    move-result v10

    .line 689
    if-eqz v10, :cond_20

    .line 690
    .line 691
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v10

    .line 695
    check-cast v10, Ljava/lang/Integer;

    .line 696
    .line 697
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 698
    .line 699
    .line 700
    move-result v10

    .line 701
    const-string v14, "bg_"

    .line 702
    .line 703
    invoke-static {v10, v14}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object v14

    .line 707
    move-object/from16 v41, v9

    .line 708
    .line 709
    const-string v9, "."

    .line 710
    .line 711
    move/from16 v42, v10

    .line 712
    .line 713
    const-string v10, ",."

    .line 714
    .line 715
    move-object/from16 v43, v15

    .line 716
    .line 717
    const-string v15, " *"

    .line 718
    .line 719
    invoke-static {v9, v14, v10, v14, v15}, LR8/v;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v9

    .line 723
    invoke-static/range {v42 .. v42}, Lvf/a;->O(I)Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    move-result-object v10

    .line 727
    sget v14, Lu6/v;->a:I

    .line 728
    .line 729
    sget-object v14, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 730
    .line 731
    new-instance v14, Ljava/lang/StringBuilder;

    .line 732
    .line 733
    invoke-direct {v14, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 734
    .line 735
    .line 736
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 737
    .line 738
    .line 739
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 740
    .line 741
    .line 742
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 743
    .line 744
    .line 745
    move-result-object v10

    .line 746
    invoke-virtual {v4, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-object/from16 v9, v41

    .line 750
    .line 751
    move-object/from16 v15, v43

    .line 752
    .line 753
    goto :goto_14

    .line 754
    :cond_20
    move-object/from16 v43, v15

    .line 755
    .line 756
    new-instance v4, Landroid/util/SparseArray;

    .line 757
    .line 758
    invoke-direct {v4}, Landroid/util/SparseArray;-><init>()V

    .line 759
    .line 760
    .line 761
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 762
    .line 763
    .line 764
    move-result v9

    .line 765
    const-class v10, Ljava/lang/Object;

    .line 766
    .line 767
    const/4 v14, 0x0

    .line 768
    invoke-interface {v8, v14, v9, v10}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 769
    .line 770
    .line 771
    move-result-object v9

    .line 772
    array-length v10, v9

    .line 773
    const/4 v14, 0x0

    .line 774
    :goto_15
    if-ge v14, v10, :cond_46

    .line 775
    .line 776
    aget-object v15, v9, v14

    .line 777
    .line 778
    move-object/from16 v41, v7

    .line 779
    .line 780
    instance-of v7, v15, Landroid/text/style/StrikethroughSpan;

    .line 781
    .line 782
    const/16 v42, 0x0

    .line 783
    .line 784
    if-eqz v7, :cond_21

    .line 785
    .line 786
    const-string v44, "<span style=\'text-decoration:line-through;\'>"

    .line 787
    .line 788
    move-object/from16 v45, v44

    .line 789
    .line 790
    move/from16 v44, v7

    .line 791
    .line 792
    move-object/from16 v7, v45

    .line 793
    .line 794
    move-object/from16 v45, v9

    .line 795
    .line 796
    :goto_16
    move/from16 v46, v10

    .line 797
    .line 798
    :goto_17
    move-object/from16 v47, v11

    .line 799
    .line 800
    move/from16 v48, v14

    .line 801
    .line 802
    goto/16 :goto_1d

    .line 803
    .line 804
    :cond_21
    move/from16 v44, v7

    .line 805
    .line 806
    instance-of v7, v15, Landroid/text/style/ForegroundColorSpan;

    .line 807
    .line 808
    if-eqz v7, :cond_22

    .line 809
    .line 810
    move-object v7, v15

    .line 811
    check-cast v7, Landroid/text/style/ForegroundColorSpan;

    .line 812
    .line 813
    invoke-virtual {v7}, Landroid/text/style/ForegroundColorSpan;->getForegroundColor()I

    .line 814
    .line 815
    .line 816
    move-result v7

    .line 817
    invoke-static {v7}, Lvf/a;->O(I)Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v7

    .line 821
    sget v45, Lu6/v;->a:I

    .line 822
    .line 823
    sget-object v45, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 824
    .line 825
    move-object/from16 v45, v9

    .line 826
    .line 827
    const-string v9, "<span style=\'color:"

    .line 828
    .line 829
    invoke-static {v9, v7, v3}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 830
    .line 831
    .line 832
    move-result-object v7

    .line 833
    goto :goto_16

    .line 834
    :cond_22
    move-object/from16 v45, v9

    .line 835
    .line 836
    instance-of v7, v15, Landroid/text/style/BackgroundColorSpan;

    .line 837
    .line 838
    if-eqz v7, :cond_23

    .line 839
    .line 840
    move-object v7, v15

    .line 841
    check-cast v7, Landroid/text/style/BackgroundColorSpan;

    .line 842
    .line 843
    invoke-virtual {v7}, Landroid/text/style/BackgroundColorSpan;->getBackgroundColor()I

    .line 844
    .line 845
    .line 846
    move-result v7

    .line 847
    sget v9, Lu6/v;->a:I

    .line 848
    .line 849
    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 850
    .line 851
    const-string v9, "<span class=\'bg_"

    .line 852
    .line 853
    move/from16 v46, v10

    .line 854
    .line 855
    const-string v10, "\'>"

    .line 856
    .line 857
    invoke-static {v7, v9, v10}, LA7/p0;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 858
    .line 859
    .line 860
    move-result-object v7

    .line 861
    goto :goto_17

    .line 862
    :cond_23
    move/from16 v46, v10

    .line 863
    .line 864
    instance-of v7, v15, Ll6/a;

    .line 865
    .line 866
    if-eqz v7, :cond_24

    .line 867
    .line 868
    const-string v7, "<span style=\'text-combine-upright:all;\'>"

    .line 869
    .line 870
    goto :goto_17

    .line 871
    :cond_24
    instance-of v7, v15, Landroid/text/style/AbsoluteSizeSpan;

    .line 872
    .line 873
    if-eqz v7, :cond_26

    .line 874
    .line 875
    move-object v7, v15

    .line 876
    check-cast v7, Landroid/text/style/AbsoluteSizeSpan;

    .line 877
    .line 878
    invoke-virtual {v7}, Landroid/text/style/AbsoluteSizeSpan;->getDip()Z

    .line 879
    .line 880
    .line 881
    move-result v9

    .line 882
    if-eqz v9, :cond_25

    .line 883
    .line 884
    invoke-virtual {v7}, Landroid/text/style/AbsoluteSizeSpan;->getSize()I

    .line 885
    .line 886
    .line 887
    move-result v7

    .line 888
    int-to-float v7, v7

    .line 889
    goto :goto_18

    .line 890
    :cond_25
    invoke-virtual {v7}, Landroid/text/style/AbsoluteSizeSpan;->getSize()I

    .line 891
    .line 892
    .line 893
    move-result v7

    .line 894
    int-to-float v7, v7

    .line 895
    div-float v7, v7, v28

    .line 896
    .line 897
    :goto_18
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 898
    .line 899
    .line 900
    move-result-object v7

    .line 901
    const/4 v9, 0x1

    .line 902
    new-array v10, v9, [Ljava/lang/Object;

    .line 903
    .line 904
    const/16 v21, 0x0

    .line 905
    .line 906
    aput-object v7, v10, v21

    .line 907
    .line 908
    sget v7, Lu6/v;->a:I

    .line 909
    .line 910
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 911
    .line 912
    const-string v9, "<span style=\'font-size:%.2fpx;\'>"

    .line 913
    .line 914
    invoke-static {v7, v9, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v7

    .line 918
    goto :goto_17

    .line 919
    :cond_26
    instance-of v7, v15, Landroid/text/style/RelativeSizeSpan;

    .line 920
    .line 921
    if-eqz v7, :cond_27

    .line 922
    .line 923
    move-object v7, v15

    .line 924
    check-cast v7, Landroid/text/style/RelativeSizeSpan;

    .line 925
    .line 926
    invoke-virtual {v7}, Landroid/text/style/RelativeSizeSpan;->getSizeChange()F

    .line 927
    .line 928
    .line 929
    move-result v7

    .line 930
    mul-float v7, v7, v17

    .line 931
    .line 932
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 933
    .line 934
    .line 935
    move-result-object v7

    .line 936
    const/4 v9, 0x1

    .line 937
    new-array v10, v9, [Ljava/lang/Object;

    .line 938
    .line 939
    const/16 v21, 0x0

    .line 940
    .line 941
    aput-object v7, v10, v21

    .line 942
    .line 943
    sget v7, Lu6/v;->a:I

    .line 944
    .line 945
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 946
    .line 947
    const-string v9, "<span style=\'font-size:%.2f%%;\'>"

    .line 948
    .line 949
    invoke-static {v7, v9, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 950
    .line 951
    .line 952
    move-result-object v7

    .line 953
    goto/16 :goto_17

    .line 954
    .line 955
    :cond_27
    instance-of v7, v15, Landroid/text/style/TypefaceSpan;

    .line 956
    .line 957
    if-eqz v7, :cond_29

    .line 958
    .line 959
    move-object v7, v15

    .line 960
    check-cast v7, Landroid/text/style/TypefaceSpan;

    .line 961
    .line 962
    invoke-virtual {v7}, Landroid/text/style/TypefaceSpan;->getFamily()Ljava/lang/String;

    .line 963
    .line 964
    .line 965
    move-result-object v7

    .line 966
    if-eqz v7, :cond_28

    .line 967
    .line 968
    sget v9, Lu6/v;->a:I

    .line 969
    .line 970
    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 971
    .line 972
    const-string v9, "<span style=\'font-family:\""

    .line 973
    .line 974
    const-string v10, "\";\'>"

    .line 975
    .line 976
    invoke-static {v9, v7, v10}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 977
    .line 978
    .line 979
    move-result-object v7

    .line 980
    goto/16 :goto_17

    .line 981
    .line 982
    :cond_28
    :goto_19
    move-object/from16 v47, v11

    .line 983
    .line 984
    move/from16 v48, v14

    .line 985
    .line 986
    move-object/from16 v7, v42

    .line 987
    .line 988
    goto/16 :goto_1d

    .line 989
    .line 990
    :cond_29
    instance-of v7, v15, Landroid/text/style/StyleSpan;

    .line 991
    .line 992
    if-eqz v7, :cond_2d

    .line 993
    .line 994
    move-object v7, v15

    .line 995
    check-cast v7, Landroid/text/style/StyleSpan;

    .line 996
    .line 997
    invoke-virtual {v7}, Landroid/text/style/StyleSpan;->getStyle()I

    .line 998
    .line 999
    .line 1000
    move-result v7

    .line 1001
    const/4 v9, 0x1

    .line 1002
    if-eq v7, v9, :cond_2c

    .line 1003
    .line 1004
    const/4 v9, 0x2

    .line 1005
    if-eq v7, v9, :cond_2b

    .line 1006
    .line 1007
    const/4 v9, 0x3

    .line 1008
    if-eq v7, v9, :cond_2a

    .line 1009
    .line 1010
    goto :goto_19

    .line 1011
    :cond_2a
    const-string v7, "<b><i>"

    .line 1012
    .line 1013
    goto/16 :goto_17

    .line 1014
    .line 1015
    :cond_2b
    const-string v7, "<i>"

    .line 1016
    .line 1017
    goto/16 :goto_17

    .line 1018
    .line 1019
    :cond_2c
    const-string v7, "<b>"

    .line 1020
    .line 1021
    goto/16 :goto_17

    .line 1022
    .line 1023
    :cond_2d
    instance-of v7, v15, Ll6/c;

    .line 1024
    .line 1025
    if-eqz v7, :cond_31

    .line 1026
    .line 1027
    move-object v7, v15

    .line 1028
    check-cast v7, Ll6/c;

    .line 1029
    .line 1030
    iget v7, v7, Ll6/c;->b:I

    .line 1031
    .line 1032
    const/4 v9, -0x1

    .line 1033
    if-eq v7, v9, :cond_30

    .line 1034
    .line 1035
    const/4 v9, 0x1

    .line 1036
    if-eq v7, v9, :cond_2f

    .line 1037
    .line 1038
    const/4 v9, 0x2

    .line 1039
    if-eq v7, v9, :cond_2e

    .line 1040
    .line 1041
    goto :goto_19

    .line 1042
    :cond_2e
    const-string v7, "<ruby style=\'ruby-position:under;\'>"

    .line 1043
    .line 1044
    goto/16 :goto_17

    .line 1045
    .line 1046
    :cond_2f
    const-string v7, "<ruby style=\'ruby-position:over;\'>"

    .line 1047
    .line 1048
    goto/16 :goto_17

    .line 1049
    .line 1050
    :cond_30
    const-string v7, "<ruby style=\'ruby-position:unset;\'>"

    .line 1051
    .line 1052
    goto/16 :goto_17

    .line 1053
    .line 1054
    :cond_31
    instance-of v7, v15, Landroid/text/style/UnderlineSpan;

    .line 1055
    .line 1056
    if-eqz v7, :cond_32

    .line 1057
    .line 1058
    const-string v7, "<u>"

    .line 1059
    .line 1060
    goto/16 :goto_17

    .line 1061
    .line 1062
    :cond_32
    instance-of v7, v15, Ll6/d;

    .line 1063
    .line 1064
    if-eqz v7, :cond_28

    .line 1065
    .line 1066
    move-object v7, v15

    .line 1067
    check-cast v7, Ll6/d;

    .line 1068
    .line 1069
    iget v9, v7, Ll6/d;->a:I

    .line 1070
    .line 1071
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1072
    .line 1073
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 1074
    .line 1075
    .line 1076
    move-object/from16 v47, v11

    .line 1077
    .line 1078
    iget v11, v7, Ll6/d;->b:I

    .line 1079
    .line 1080
    move/from16 v48, v14

    .line 1081
    .line 1082
    const/4 v14, 0x1

    .line 1083
    if-eq v11, v14, :cond_34

    .line 1084
    .line 1085
    const/4 v14, 0x2

    .line 1086
    if-eq v11, v14, :cond_33

    .line 1087
    .line 1088
    goto :goto_1a

    .line 1089
    :cond_33
    const-string v11, "open "

    .line 1090
    .line 1091
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1092
    .line 1093
    .line 1094
    goto :goto_1a

    .line 1095
    :cond_34
    const/4 v14, 0x2

    .line 1096
    const-string v11, "filled "

    .line 1097
    .line 1098
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1099
    .line 1100
    .line 1101
    :goto_1a
    if-eqz v9, :cond_38

    .line 1102
    .line 1103
    const/4 v11, 0x1

    .line 1104
    if-eq v9, v11, :cond_37

    .line 1105
    .line 1106
    if-eq v9, v14, :cond_36

    .line 1107
    .line 1108
    const/4 v11, 0x3

    .line 1109
    if-eq v9, v11, :cond_35

    .line 1110
    .line 1111
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1112
    .line 1113
    .line 1114
    goto :goto_1b

    .line 1115
    :cond_35
    const-string v9, "sesame"

    .line 1116
    .line 1117
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1118
    .line 1119
    .line 1120
    goto :goto_1b

    .line 1121
    :cond_36
    const-string v9, "dot"

    .line 1122
    .line 1123
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1124
    .line 1125
    .line 1126
    goto :goto_1b

    .line 1127
    :cond_37
    const-string v9, "circle"

    .line 1128
    .line 1129
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1130
    .line 1131
    .line 1132
    goto :goto_1b

    .line 1133
    :cond_38
    const-string v9, "none"

    .line 1134
    .line 1135
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1136
    .line 1137
    .line 1138
    :goto_1b
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v9

    .line 1142
    iget v7, v7, Ll6/d;->c:I

    .line 1143
    .line 1144
    const/4 v14, 0x2

    .line 1145
    if-eq v7, v14, :cond_39

    .line 1146
    .line 1147
    const-string v7, "over right"

    .line 1148
    .line 1149
    goto :goto_1c

    .line 1150
    :cond_39
    const-string v7, "under left"

    .line 1151
    .line 1152
    :goto_1c
    new-array v10, v14, [Ljava/lang/Object;

    .line 1153
    .line 1154
    const/16 v21, 0x0

    .line 1155
    .line 1156
    aput-object v9, v10, v21

    .line 1157
    .line 1158
    const/16 v26, 0x1

    .line 1159
    .line 1160
    aput-object v7, v10, v26

    .line 1161
    .line 1162
    sget v7, Lu6/v;->a:I

    .line 1163
    .line 1164
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1165
    .line 1166
    const-string v9, "<span style=\'-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;\'>"

    .line 1167
    .line 1168
    invoke-static {v7, v9, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v7

    .line 1172
    :goto_1d
    if-nez v44, :cond_3b

    .line 1173
    .line 1174
    instance-of v9, v15, Landroid/text/style/ForegroundColorSpan;

    .line 1175
    .line 1176
    if-nez v9, :cond_3b

    .line 1177
    .line 1178
    instance-of v9, v15, Landroid/text/style/BackgroundColorSpan;

    .line 1179
    .line 1180
    if-nez v9, :cond_3b

    .line 1181
    .line 1182
    instance-of v9, v15, Ll6/a;

    .line 1183
    .line 1184
    if-nez v9, :cond_3b

    .line 1185
    .line 1186
    instance-of v9, v15, Landroid/text/style/AbsoluteSizeSpan;

    .line 1187
    .line 1188
    if-nez v9, :cond_3b

    .line 1189
    .line 1190
    instance-of v9, v15, Landroid/text/style/RelativeSizeSpan;

    .line 1191
    .line 1192
    if-nez v9, :cond_3b

    .line 1193
    .line 1194
    instance-of v9, v15, Ll6/d;

    .line 1195
    .line 1196
    if-eqz v9, :cond_3a

    .line 1197
    .line 1198
    goto :goto_1e

    .line 1199
    :cond_3a
    instance-of v9, v15, Landroid/text/style/TypefaceSpan;

    .line 1200
    .line 1201
    if-eqz v9, :cond_3d

    .line 1202
    .line 1203
    move-object v9, v15

    .line 1204
    check-cast v9, Landroid/text/style/TypefaceSpan;

    .line 1205
    .line 1206
    invoke-virtual {v9}, Landroid/text/style/TypefaceSpan;->getFamily()Ljava/lang/String;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v9

    .line 1210
    if-eqz v9, :cond_3c

    .line 1211
    .line 1212
    :cond_3b
    :goto_1e
    move-object v9, v1

    .line 1213
    goto :goto_20

    .line 1214
    :cond_3c
    :goto_1f
    move-object/from16 v9, v42

    .line 1215
    .line 1216
    goto :goto_20

    .line 1217
    :cond_3d
    instance-of v9, v15, Landroid/text/style/StyleSpan;

    .line 1218
    .line 1219
    if-eqz v9, :cond_41

    .line 1220
    .line 1221
    move-object v9, v15

    .line 1222
    check-cast v9, Landroid/text/style/StyleSpan;

    .line 1223
    .line 1224
    invoke-virtual {v9}, Landroid/text/style/StyleSpan;->getStyle()I

    .line 1225
    .line 1226
    .line 1227
    move-result v9

    .line 1228
    const/4 v11, 0x1

    .line 1229
    if-eq v9, v11, :cond_40

    .line 1230
    .line 1231
    const/4 v14, 0x2

    .line 1232
    if-eq v9, v14, :cond_3f

    .line 1233
    .line 1234
    const/4 v11, 0x3

    .line 1235
    if-eq v9, v11, :cond_3e

    .line 1236
    .line 1237
    goto :goto_1f

    .line 1238
    :cond_3e
    const-string v42, "</i></b>"

    .line 1239
    .line 1240
    goto :goto_1f

    .line 1241
    :cond_3f
    const-string v42, "</i>"

    .line 1242
    .line 1243
    goto :goto_1f

    .line 1244
    :cond_40
    const-string v42, "</b>"

    .line 1245
    .line 1246
    goto :goto_1f

    .line 1247
    :cond_41
    instance-of v9, v15, Ll6/c;

    .line 1248
    .line 1249
    if-eqz v9, :cond_42

    .line 1250
    .line 1251
    move-object v9, v15

    .line 1252
    check-cast v9, Ll6/c;

    .line 1253
    .line 1254
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1255
    .line 1256
    const-string v11, "<rt>"

    .line 1257
    .line 1258
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1259
    .line 1260
    .line 1261
    iget-object v9, v9, Ll6/c;->a:Ljava/lang/String;

    .line 1262
    .line 1263
    invoke-static {v9}, Ls6/h;->a(Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v9

    .line 1267
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1268
    .line 1269
    .line 1270
    const-string v9, "</rt></ruby>"

    .line 1271
    .line 1272
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1273
    .line 1274
    .line 1275
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v42

    .line 1279
    goto :goto_1f

    .line 1280
    :cond_42
    instance-of v9, v15, Landroid/text/style/UnderlineSpan;

    .line 1281
    .line 1282
    if-eqz v9, :cond_3c

    .line 1283
    .line 1284
    const-string v42, "</u>"

    .line 1285
    .line 1286
    goto :goto_1f

    .line 1287
    :goto_20
    invoke-interface {v8, v15}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 1288
    .line 1289
    .line 1290
    move-result v10

    .line 1291
    invoke-interface {v8, v15}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 1292
    .line 1293
    .line 1294
    move-result v11

    .line 1295
    if-eqz v7, :cond_45

    .line 1296
    .line 1297
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1298
    .line 1299
    .line 1300
    new-instance v14, Ls6/f;

    .line 1301
    .line 1302
    invoke-direct {v14, v10, v11, v7, v9}, Ls6/f;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    .line 1303
    .line 1304
    .line 1305
    invoke-virtual {v4, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v7

    .line 1309
    check-cast v7, Ls6/g;

    .line 1310
    .line 1311
    if-nez v7, :cond_43

    .line 1312
    .line 1313
    new-instance v7, Ls6/g;

    .line 1314
    .line 1315
    invoke-direct {v7}, Ls6/g;-><init>()V

    .line 1316
    .line 1317
    .line 1318
    invoke-virtual {v4, v10, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1319
    .line 1320
    .line 1321
    :cond_43
    iget-object v7, v7, Ls6/g;->a:Ljava/util/ArrayList;

    .line 1322
    .line 1323
    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1324
    .line 1325
    .line 1326
    invoke-virtual {v4, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v7

    .line 1330
    check-cast v7, Ls6/g;

    .line 1331
    .line 1332
    if-nez v7, :cond_44

    .line 1333
    .line 1334
    new-instance v7, Ls6/g;

    .line 1335
    .line 1336
    invoke-direct {v7}, Ls6/g;-><init>()V

    .line 1337
    .line 1338
    .line 1339
    invoke-virtual {v4, v11, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1340
    .line 1341
    .line 1342
    :cond_44
    iget-object v7, v7, Ls6/g;->b:Ljava/util/ArrayList;

    .line 1343
    .line 1344
    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1345
    .line 1346
    .line 1347
    :cond_45
    const/16 v26, 0x1

    .line 1348
    .line 1349
    add-int/lit8 v14, v48, 0x1

    .line 1350
    .line 1351
    move-object/from16 v7, v41

    .line 1352
    .line 1353
    move-object/from16 v9, v45

    .line 1354
    .line 1355
    move/from16 v10, v46

    .line 1356
    .line 1357
    move-object/from16 v11, v47

    .line 1358
    .line 1359
    goto/16 :goto_15

    .line 1360
    .line 1361
    :cond_46
    move-object/from16 v41, v7

    .line 1362
    .line 1363
    move-object/from16 v47, v11

    .line 1364
    .line 1365
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1366
    .line 1367
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 1368
    .line 1369
    .line 1370
    move-result v9

    .line 1371
    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1372
    .line 1373
    .line 1374
    const/4 v9, 0x0

    .line 1375
    const/4 v10, 0x0

    .line 1376
    :goto_21
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    .line 1377
    .line 1378
    .line 1379
    move-result v11

    .line 1380
    if-ge v9, v11, :cond_49

    .line 1381
    .line 1382
    invoke-virtual {v4, v9}, Landroid/util/SparseArray;->keyAt(I)I

    .line 1383
    .line 1384
    .line 1385
    move-result v11

    .line 1386
    invoke-interface {v8, v10, v11}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v10

    .line 1390
    invoke-static {v10}, Ls6/h;->a(Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v10

    .line 1394
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1395
    .line 1396
    .line 1397
    invoke-virtual {v4, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v10

    .line 1401
    check-cast v10, Ls6/g;

    .line 1402
    .line 1403
    iget-object v14, v10, Ls6/g;->b:Ljava/util/ArrayList;

    .line 1404
    .line 1405
    sget-object v15, Ls6/f;->f:Lq6/d;

    .line 1406
    .line 1407
    invoke-static {v14, v15}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1408
    .line 1409
    .line 1410
    iget-object v14, v10, Ls6/g;->b:Ljava/util/ArrayList;

    .line 1411
    .line 1412
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v14

    .line 1416
    :goto_22
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 1417
    .line 1418
    .line 1419
    move-result v15

    .line 1420
    if-eqz v15, :cond_47

    .line 1421
    .line 1422
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v15

    .line 1426
    check-cast v15, Ls6/f;

    .line 1427
    .line 1428
    iget-object v15, v15, Ls6/f;->d:Ljava/lang/String;

    .line 1429
    .line 1430
    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1431
    .line 1432
    .line 1433
    goto :goto_22

    .line 1434
    :cond_47
    iget-object v10, v10, Ls6/g;->a:Ljava/util/ArrayList;

    .line 1435
    .line 1436
    sget-object v14, Ls6/f;->e:Lq6/d;

    .line 1437
    .line 1438
    invoke-static {v10, v14}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1439
    .line 1440
    .line 1441
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v10

    .line 1445
    :goto_23
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1446
    .line 1447
    .line 1448
    move-result v14

    .line 1449
    if-eqz v14, :cond_48

    .line 1450
    .line 1451
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v14

    .line 1455
    check-cast v14, Ls6/f;

    .line 1456
    .line 1457
    iget-object v14, v14, Ls6/f;->c:Ljava/lang/String;

    .line 1458
    .line 1459
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1460
    .line 1461
    .line 1462
    goto :goto_23

    .line 1463
    :cond_48
    const/16 v26, 0x1

    .line 1464
    .line 1465
    add-int/lit8 v9, v9, 0x1

    .line 1466
    .line 1467
    move v10, v11

    .line 1468
    goto :goto_21

    .line 1469
    :cond_49
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 1470
    .line 1471
    .line 1472
    move-result v4

    .line 1473
    invoke-interface {v8, v10, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v4

    .line 1477
    invoke-static {v4}, Ls6/h;->a(Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v4

    .line 1481
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1482
    .line 1483
    .line 1484
    new-instance v8, LNe/a;

    .line 1485
    .line 1486
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v4

    .line 1490
    const/4 v9, 0x0

    .line 1491
    invoke-direct {v8, v4, v9}, LNe/a;-><init>(Ljava/lang/String;Z)V

    .line 1492
    .line 1493
    .line 1494
    :goto_24
    invoke-virtual {v6}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v4

    .line 1498
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v4

    .line 1502
    :goto_25
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1503
    .line 1504
    .line 1505
    move-result v7

    .line 1506
    if-eqz v7, :cond_4c

    .line 1507
    .line 1508
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v7

    .line 1512
    check-cast v7, Ljava/lang/String;

    .line 1513
    .line 1514
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v9

    .line 1518
    check-cast v9, Ljava/lang/String;

    .line 1519
    .line 1520
    invoke-virtual {v6, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v9

    .line 1524
    check-cast v9, Ljava/lang/String;

    .line 1525
    .line 1526
    if-eqz v9, :cond_4b

    .line 1527
    .line 1528
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v7

    .line 1532
    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1533
    .line 1534
    .line 1535
    move-result v7

    .line 1536
    if-eqz v7, :cond_4a

    .line 1537
    .line 1538
    goto :goto_26

    .line 1539
    :cond_4a
    const/4 v7, 0x0

    .line 1540
    goto :goto_27

    .line 1541
    :cond_4b
    :goto_26
    const/4 v7, 0x1

    .line 1542
    :goto_27
    invoke-static {v7}, Lu6/a;->i(Z)V

    .line 1543
    .line 1544
    .line 1545
    goto :goto_25

    .line 1546
    :cond_4c
    invoke-static/range {v39 .. v39}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v4

    .line 1550
    invoke-static/range {v40 .. v40}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v7

    .line 1554
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v9

    .line 1558
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1559
    .line 1560
    .line 1561
    move-result-object v10

    .line 1562
    iget v11, v12, Lh6/b;->q:F

    .line 1563
    .line 1564
    cmpl-float v14, v11, v23

    .line 1565
    .line 1566
    if-eqz v14, :cond_4f

    .line 1567
    .line 1568
    const/4 v14, 0x2

    .line 1569
    const/4 v15, 0x1

    .line 1570
    if-eq v2, v14, :cond_4e

    .line 1571
    .line 1572
    if-ne v2, v15, :cond_4d

    .line 1573
    .line 1574
    goto :goto_28

    .line 1575
    :cond_4d
    const-string v2, "skewX"

    .line 1576
    .line 1577
    goto :goto_29

    .line 1578
    :cond_4e
    :goto_28
    const-string v2, "skewY"

    .line 1579
    .line 1580
    :goto_29
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v11

    .line 1584
    move/from16 v26, v15

    .line 1585
    .line 1586
    new-array v15, v14, [Ljava/lang/Object;

    .line 1587
    .line 1588
    const/16 v21, 0x0

    .line 1589
    .line 1590
    aput-object v2, v15, v21

    .line 1591
    .line 1592
    aput-object v11, v15, v26

    .line 1593
    .line 1594
    sget v2, Lu6/v;->a:I

    .line 1595
    .line 1596
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1597
    .line 1598
    const-string v11, "%s(%.2fdeg)"

    .line 1599
    .line 1600
    invoke-static {v2, v11, v15}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1601
    .line 1602
    .line 1603
    move-result-object v2

    .line 1604
    goto :goto_2a

    .line 1605
    :cond_4f
    move-object/from16 v2, v38

    .line 1606
    .line 1607
    :goto_2a
    const/16 v11, 0xe

    .line 1608
    .line 1609
    new-array v11, v11, [Ljava/lang/Object;

    .line 1610
    .line 1611
    const/16 v21, 0x0

    .line 1612
    .line 1613
    aput-object v4, v11, v21

    .line 1614
    .line 1615
    const/16 v26, 0x1

    .line 1616
    .line 1617
    aput-object v31, v11, v26

    .line 1618
    .line 1619
    const/16 v16, 0x2

    .line 1620
    .line 1621
    aput-object v7, v11, v16

    .line 1622
    .line 1623
    const/16 v25, 0x3

    .line 1624
    .line 1625
    aput-object v30, v11, v25

    .line 1626
    .line 1627
    aput-object v36, v11, v19

    .line 1628
    .line 1629
    const/4 v4, 0x5

    .line 1630
    aput-object v32, v11, v4

    .line 1631
    .line 1632
    const/4 v4, 0x6

    .line 1633
    aput-object v27, v11, v4

    .line 1634
    .line 1635
    const/4 v4, 0x7

    .line 1636
    aput-object v35, v11, v4

    .line 1637
    .line 1638
    const/16 v4, 0x8

    .line 1639
    .line 1640
    aput-object v29, v11, v4

    .line 1641
    .line 1642
    const/16 v4, 0x9

    .line 1643
    .line 1644
    aput-object v33, v11, v4

    .line 1645
    .line 1646
    const/16 v4, 0xa

    .line 1647
    .line 1648
    aput-object v34, v11, v4

    .line 1649
    .line 1650
    const/16 v4, 0xb

    .line 1651
    .line 1652
    aput-object v9, v11, v4

    .line 1653
    .line 1654
    const/16 v4, 0xc

    .line 1655
    .line 1656
    aput-object v10, v11, v4

    .line 1657
    .line 1658
    const/16 v4, 0xd

    .line 1659
    .line 1660
    aput-object v2, v11, v4

    .line 1661
    .line 1662
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1663
    .line 1664
    const-string v4, "<div style=\'position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;\'>"

    .line 1665
    .line 1666
    invoke-static {v2, v4, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v2

    .line 1670
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1671
    .line 1672
    .line 1673
    const-string v2, "<span class=\'default_bg\'>"

    .line 1674
    .line 1675
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1676
    .line 1677
    .line 1678
    iget-object v2, v8, LNe/a;->a:Ljava/lang/String;

    .line 1679
    .line 1680
    iget-object v4, v12, Lh6/b;->c:Landroid/text/Layout$Alignment;

    .line 1681
    .line 1682
    if-eqz v4, :cond_52

    .line 1683
    .line 1684
    sget-object v7, Ls6/J;->a:[I

    .line 1685
    .line 1686
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 1687
    .line 1688
    .line 1689
    move-result v4

    .line 1690
    aget v4, v7, v4

    .line 1691
    .line 1692
    const/4 v9, 0x1

    .line 1693
    if-eq v4, v9, :cond_51

    .line 1694
    .line 1695
    const/4 v14, 0x2

    .line 1696
    if-eq v4, v14, :cond_50

    .line 1697
    .line 1698
    move-object/from16 v9, v24

    .line 1699
    .line 1700
    goto :goto_2b

    .line 1701
    :cond_50
    move-object/from16 v9, v43

    .line 1702
    .line 1703
    goto :goto_2b

    .line 1704
    :cond_51
    const/4 v14, 0x2

    .line 1705
    move-object/from16 v9, v37

    .line 1706
    .line 1707
    :goto_2b
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1708
    .line 1709
    const-string v7, "<span style=\'display:inline-block; text-align:"

    .line 1710
    .line 1711
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1712
    .line 1713
    .line 1714
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1715
    .line 1716
    .line 1717
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1718
    .line 1719
    .line 1720
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1721
    .line 1722
    .line 1723
    move-result-object v3

    .line 1724
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1725
    .line 1726
    .line 1727
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1728
    .line 1729
    .line 1730
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1731
    .line 1732
    .line 1733
    goto :goto_2c

    .line 1734
    :cond_52
    const/4 v14, 0x2

    .line 1735
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1736
    .line 1737
    .line 1738
    :goto_2c
    const-string v1, "</span></div>"

    .line 1739
    .line 1740
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1741
    .line 1742
    .line 1743
    const/16 v26, 0x1

    .line 1744
    .line 1745
    add-int/lit8 v10, v39, 0x1

    .line 1746
    .line 1747
    move v3, v14

    .line 1748
    move/from16 v1, v19

    .line 1749
    .line 1750
    move/from16 v9, v20

    .line 1751
    .line 1752
    move/from16 v2, v25

    .line 1753
    .line 1754
    move-object/from16 v7, v41

    .line 1755
    .line 1756
    move-object/from16 v11, v47

    .line 1757
    .line 1758
    const/4 v4, 0x1

    .line 1759
    const/4 v8, 0x0

    .line 1760
    goto/16 :goto_1

    .line 1761
    .line 1762
    :cond_53
    const-string v1, "</div></body></html>"

    .line 1763
    .line 1764
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1765
    .line 1766
    .line 1767
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1768
    .line 1769
    const-string v2, "<html><head><style>"

    .line 1770
    .line 1771
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1772
    .line 1773
    .line 1774
    invoke-virtual {v6}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 1775
    .line 1776
    .line 1777
    move-result-object v2

    .line 1778
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1779
    .line 1780
    .line 1781
    move-result-object v2

    .line 1782
    :goto_2d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1783
    .line 1784
    .line 1785
    move-result v3

    .line 1786
    if-eqz v3, :cond_54

    .line 1787
    .line 1788
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1789
    .line 1790
    .line 1791
    move-result-object v3

    .line 1792
    check-cast v3, Ljava/lang/String;

    .line 1793
    .line 1794
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1795
    .line 1796
    .line 1797
    const-string v4, "{"

    .line 1798
    .line 1799
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1800
    .line 1801
    .line 1802
    invoke-virtual {v6, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v3

    .line 1806
    check-cast v3, Ljava/lang/String;

    .line 1807
    .line 1808
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1809
    .line 1810
    .line 1811
    const-string v3, "}"

    .line 1812
    .line 1813
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1814
    .line 1815
    .line 1816
    goto :goto_2d

    .line 1817
    :cond_54
    const-string v2, "</style></head>"

    .line 1818
    .line 1819
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1820
    .line 1821
    .line 1822
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1823
    .line 1824
    .line 1825
    move-result-object v1

    .line 1826
    const/4 v9, 0x0

    .line 1827
    invoke-virtual {v5, v9, v1}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 1828
    .line 1829
    .line 1830
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1831
    .line 1832
    .line 1833
    move-result-object v1

    .line 1834
    sget-object v2, Lk8/g;->c:Ljava/nio/charset/Charset;

    .line 1835
    .line 1836
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 1837
    .line 1838
    .line 1839
    move-result-object v1

    .line 1840
    const/4 v9, 0x1

    .line 1841
    invoke-static {v1, v9}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 1842
    .line 1843
    .line 1844
    move-result-object v1

    .line 1845
    const-string v2, "text/html"

    .line 1846
    .line 1847
    const-string v3, "base64"

    .line 1848
    .line 1849
    iget-object v4, v0, Ls6/K;->b:Ls6/I;

    .line 1850
    .line 1851
    invoke-virtual {v4, v1, v2, v3}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1852
    .line 1853
    .line 1854
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move p2, p1

    .line 5
    move-object p1, p0

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iget-object p2, p1, Ls6/K;->c:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Ls6/K;->c()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method
