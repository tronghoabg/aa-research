.class public final LI4/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI4/q;
.implements Ls6/G;


# instance fields
.field public final a:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;I)V
    .locals 0

    .line 1
    packed-switch p2, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, LI4/w;->a:Landroid/content/res/Resources;

    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, LI4/w;->a:Landroid/content/res/Resources;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(LE5/T;)Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p1, LE5/T;->c:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const-string v2, ""

    .line 8
    .line 9
    if-nez v1, :cond_3

    .line 10
    .line 11
    const-string v1, "und"

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    sget v1, Lu6/v;->a:I

    .line 21
    .line 22
    const/16 v3, 0x15

    .line 23
    .line 24
    if-lt v1, v3, :cond_1

    .line 25
    .line 26
    invoke-static {v0}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    new-instance v3, Ljava/util/Locale;

    .line 32
    .line 33
    invoke-direct {v3, v0}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    move-object v0, v3

    .line 37
    :goto_0
    const/16 v3, 0x18

    .line 38
    .line 39
    if-lt v1, v3, :cond_2

    .line 40
    .line 41
    invoke-static {}, Ld2/b;->n()Ljava/util/Locale$Category;

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lu6/u;->d()Ljava/util/Locale;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    :goto_1
    invoke-virtual {v0, v1}, Ljava/util/Locale;->getDisplayName(Ljava/util/Locale;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_4

    .line 62
    .line 63
    :cond_3
    :goto_2
    move-object v0, v2

    .line 64
    goto :goto_3

    .line 65
    :cond_4
    const/4 v3, 0x1

    .line 66
    const/4 v4, 0x0

    .line 67
    :try_start_0
    invoke-virtual {v0, v4, v3}, Ljava/lang/String;->offsetByCodePoints(II)I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    new-instance v5, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {v4, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    :catch_0
    :goto_3
    invoke-virtual {p0, p1}, LI4/w;->b(LE5/T;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {p0, v0}, LI4/w;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_6

    .line 115
    .line 116
    iget-object p1, p1, LE5/T;->b:Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_5

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_5
    move-object v2, p1

    .line 126
    :goto_4
    move-object v0, v2

    .line 127
    :cond_6
    return-object v0
.end method

.method public b(LE5/T;)Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p1, LE5/T;->e:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    iget-object v1, p0, LI4/w;->a:Landroid/content/res/Resources;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const v0, 0x7f130088

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string v0, ""

    .line 18
    .line 19
    :goto_0
    iget p1, p1, LE5/T;->e:I

    .line 20
    .line 21
    and-int/lit8 v2, p1, 0x4

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    const v2, 0x7f13008b

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p0, v0}, LI4/w;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :cond_1
    and-int/lit8 v2, p1, 0x8

    .line 41
    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    const v2, 0x7f13008a

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p0, v0}, LI4/w;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :cond_2
    and-int/lit16 p1, p1, 0x440

    .line 60
    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    const p1, 0x7f130089

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    filled-new-array {v0, p1}, [Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p0, p1}, LI4/w;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1

    .line 79
    :cond_3
    return-object v0
.end method

.method public c(LE5/T;)Ljava/lang/String;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, v1, LE5/T;->l:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v5}, Lu6/k;->f(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v5

    .line 14
    const/4 v6, -0x1

    .line 15
    iget v7, v1, LE5/T;->y:I

    .line 16
    .line 17
    iget v8, v1, LE5/T;->r:I

    .line 18
    .line 19
    iget v9, v1, LE5/T;->q:I

    .line 20
    .line 21
    if-eq v5, v6, :cond_0

    .line 22
    .line 23
    goto/16 :goto_8

    .line 24
    .line 25
    :cond_0
    const-string v5, "(\\s*,\\s*)"

    .line 26
    .line 27
    const/4 v10, 0x0

    .line 28
    iget-object v11, v1, LE5/T;->i:Ljava/lang/String;

    .line 29
    .line 30
    if-nez v11, :cond_2

    .line 31
    .line 32
    :cond_1
    move-object v15, v10

    .line 33
    goto :goto_2

    .line 34
    :cond_2
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result v12

    .line 38
    if-eqz v12, :cond_3

    .line 39
    .line 40
    new-array v12, v3, [Ljava/lang/String;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v12

    .line 47
    invoke-virtual {v12, v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v12

    .line 51
    :goto_0
    array-length v13, v12

    .line 52
    move v14, v3

    .line 53
    :goto_1
    if-ge v14, v13, :cond_1

    .line 54
    .line 55
    aget-object v15, v12, v14

    .line 56
    .line 57
    invoke-static {v15}, Lu6/k;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v15

    .line 61
    if-eqz v15, :cond_4

    .line 62
    .line 63
    invoke-static {v15}, Lu6/k;->i(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v16

    .line 67
    if-eqz v16, :cond_4

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    add-int/2addr v14, v4

    .line 71
    goto :goto_1

    .line 72
    :goto_2
    if-eqz v15, :cond_6

    .line 73
    .line 74
    :cond_5
    :goto_3
    move v5, v2

    .line 75
    goto :goto_8

    .line 76
    :cond_6
    if-nez v11, :cond_7

    .line 77
    .line 78
    goto :goto_6

    .line 79
    :cond_7
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v12

    .line 83
    if-eqz v12, :cond_8

    .line 84
    .line 85
    new-array v5, v3, [Ljava/lang/String;

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_8
    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    invoke-virtual {v11, v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    :goto_4
    array-length v11, v5

    .line 97
    move v12, v3

    .line 98
    :goto_5
    if-ge v12, v11, :cond_a

    .line 99
    .line 100
    aget-object v13, v5, v12

    .line 101
    .line 102
    invoke-static {v13}, Lu6/k;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v13

    .line 106
    if-eqz v13, :cond_9

    .line 107
    .line 108
    invoke-static {v13}, Lu6/k;->g(Ljava/lang/String;)Z

    .line 109
    .line 110
    .line 111
    move-result v14

    .line 112
    if-eqz v14, :cond_9

    .line 113
    .line 114
    move-object v10, v13

    .line 115
    goto :goto_6

    .line 116
    :cond_9
    add-int/2addr v12, v4

    .line 117
    goto :goto_5

    .line 118
    :cond_a
    :goto_6
    if-eqz v10, :cond_c

    .line 119
    .line 120
    :cond_b
    :goto_7
    move v5, v4

    .line 121
    goto :goto_8

    .line 122
    :cond_c
    if-ne v9, v6, :cond_5

    .line 123
    .line 124
    if-eq v8, v6, :cond_d

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_d
    if-ne v7, v6, :cond_b

    .line 128
    .line 129
    iget v5, v1, LE5/T;->z:I

    .line 130
    .line 131
    if-eq v5, v6, :cond_e

    .line 132
    .line 133
    goto :goto_7

    .line 134
    :cond_e
    move v5, v6

    .line 135
    :goto_8
    const v10, 0x7f130085

    .line 136
    .line 137
    .line 138
    const v11, 0x49742400    # 1000000.0f

    .line 139
    .line 140
    .line 141
    iget-object v12, v0, LI4/w;->a:Landroid/content/res/Resources;

    .line 142
    .line 143
    const-string v13, ""

    .line 144
    .line 145
    iget v14, v1, LE5/T;->h:I

    .line 146
    .line 147
    if-ne v5, v2, :cond_12

    .line 148
    .line 149
    invoke-virtual/range {p0 .. p1}, LI4/w;->b(LE5/T;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    if-eq v9, v6, :cond_10

    .line 154
    .line 155
    if-ne v8, v6, :cond_f

    .line 156
    .line 157
    goto :goto_9

    .line 158
    :cond_f
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    new-array v2, v2, [Ljava/lang/Object;

    .line 167
    .line 168
    aput-object v5, v2, v3

    .line 169
    .line 170
    aput-object v7, v2, v4

    .line 171
    .line 172
    const v5, 0x7f130087

    .line 173
    .line 174
    .line 175
    invoke-virtual {v12, v5, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    goto :goto_a

    .line 180
    :cond_10
    :goto_9
    move-object v2, v13

    .line 181
    :goto_a
    if-ne v14, v6, :cond_11

    .line 182
    .line 183
    goto :goto_b

    .line 184
    :cond_11
    int-to-float v5, v14

    .line 185
    div-float/2addr v5, v11

    .line 186
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    new-array v4, v4, [Ljava/lang/Object;

    .line 191
    .line 192
    aput-object v5, v4, v3

    .line 193
    .line 194
    invoke-virtual {v12, v10, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v13

    .line 198
    :goto_b
    filled-new-array {v1, v2, v13}, [Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-virtual {v0, v1}, LI4/w;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    goto :goto_f

    .line 207
    :cond_12
    if-ne v5, v4, :cond_1a

    .line 208
    .line 209
    invoke-virtual/range {p0 .. p1}, LI4/w;->a(LE5/T;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    if-eq v7, v6, :cond_18

    .line 214
    .line 215
    if-ge v7, v4, :cond_13

    .line 216
    .line 217
    goto :goto_c

    .line 218
    :cond_13
    if-eq v7, v4, :cond_17

    .line 219
    .line 220
    if-eq v7, v2, :cond_16

    .line 221
    .line 222
    const/4 v2, 0x6

    .line 223
    if-eq v7, v2, :cond_15

    .line 224
    .line 225
    const/4 v2, 0x7

    .line 226
    if-eq v7, v2, :cond_15

    .line 227
    .line 228
    const/16 v2, 0x8

    .line 229
    .line 230
    if-eq v7, v2, :cond_14

    .line 231
    .line 232
    const v2, 0x7f130092

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    goto :goto_d

    .line 240
    :cond_14
    const v2, 0x7f130094

    .line 241
    .line 242
    .line 243
    invoke-virtual {v12, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    goto :goto_d

    .line 248
    :cond_15
    const v2, 0x7f130093

    .line 249
    .line 250
    .line 251
    invoke-virtual {v12, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    goto :goto_d

    .line 256
    :cond_16
    const v2, 0x7f130091

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    goto :goto_d

    .line 264
    :cond_17
    const v2, 0x7f130086

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    goto :goto_d

    .line 272
    :cond_18
    :goto_c
    move-object v2, v13

    .line 273
    :goto_d
    if-ne v14, v6, :cond_19

    .line 274
    .line 275
    goto :goto_e

    .line 276
    :cond_19
    int-to-float v5, v14

    .line 277
    div-float/2addr v5, v11

    .line 278
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    new-array v4, v4, [Ljava/lang/Object;

    .line 283
    .line 284
    aput-object v5, v4, v3

    .line 285
    .line 286
    invoke-virtual {v12, v10, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v13

    .line 290
    :goto_e
    filled-new-array {v1, v2, v13}, [Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    invoke-virtual {v0, v1}, LI4/w;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    goto :goto_f

    .line 299
    :cond_1a
    invoke-virtual/range {p0 .. p1}, LI4/w;->a(LE5/T;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    :goto_f
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    if-nez v2, :cond_1b

    .line 308
    .line 309
    const v1, 0x7f130095

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    :cond_1b
    return-object v1
.end method

.method public d(LI4/v;)LI4/p;
    .locals 3

    .line 1
    new-instance v0, LI4/b;

    .line 2
    .line 3
    const-class v1, Landroid/net/Uri;

    .line 4
    .line 5
    const-class v2, Landroid/os/ParcelFileDescriptor;

    .line 6
    .line 7
    invoke-virtual {p1, v1, v2}, LI4/v;->b(Ljava/lang/Class;Ljava/lang/Class;)LI4/p;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v1, p0, LI4/w;->a:Landroid/content/res/Resources;

    .line 12
    .line 13
    invoke-direct {v0, v1, p1}, LI4/b;-><init>(Landroid/content/res/Resources;LI4/p;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public varargs e([Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    array-length v1, p1

    .line 3
    const-string v2, ""

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    move v4, v3

    .line 7
    :goto_0
    if-ge v4, v1, :cond_2

    .line 8
    .line 9
    aget-object v5, p1, v4

    .line 10
    .line 11
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v6

    .line 15
    if-lez v6, :cond_1

    .line 16
    .line 17
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    if-eqz v6, :cond_0

    .line 22
    .line 23
    move-object v2, v5

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const/4 v6, 0x2

    .line 26
    new-array v6, v6, [Ljava/lang/Object;

    .line 27
    .line 28
    aput-object v2, v6, v3

    .line 29
    .line 30
    aput-object v5, v6, v0

    .line 31
    .line 32
    iget-object v2, p0, LI4/w;->a:Landroid/content/res/Resources;

    .line 33
    .line 34
    const v5, 0x7f130084

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v5, v6}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    :cond_1
    :goto_1
    add-int/2addr v4, v0

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    return-object v2
.end method
