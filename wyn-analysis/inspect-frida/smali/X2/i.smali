.class public abstract LX2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/regex/Pattern;

.field public static final b:Ljava/util/regex/Pattern;

.field public static final c:Ljava/util/Map;

.field public static final d:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "^(\\S+)\\s+-->\\s+(\\S+)(.*)?$"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LX2/i;->a:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "(\\S+?):(\\S+)"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, LX2/i;->b:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    new-instance v0, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    const/16 v1, 0xff

    .line 23
    .line 24
    const-string v2, "white"

    .line 25
    .line 26
    invoke-static {v1, v1, v1, v0, v2}, LVa/M6;->w(IIILjava/util/HashMap;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const-string v3, "lime"

    .line 31
    .line 32
    invoke-static {v2, v1, v2, v0, v3}, LVa/M6;->w(IIILjava/util/HashMap;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string v3, "cyan"

    .line 36
    .line 37
    invoke-static {v2, v1, v1, v0, v3}, LVa/M6;->w(IIILjava/util/HashMap;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-string v3, "red"

    .line 41
    .line 42
    invoke-static {v1, v2, v2, v0, v3}, LVa/M6;->w(IIILjava/util/HashMap;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string v3, "yellow"

    .line 46
    .line 47
    invoke-static {v1, v1, v2, v0, v3}, LVa/M6;->w(IIILjava/util/HashMap;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string v3, "magenta"

    .line 51
    .line 52
    invoke-static {v1, v2, v1, v0, v3}, LVa/M6;->w(IIILjava/util/HashMap;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const-string v3, "blue"

    .line 56
    .line 57
    invoke-static {v2, v2, v1, v0, v3}, LVa/M6;->w(IIILjava/util/HashMap;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const-string v3, "black"

    .line 61
    .line 62
    invoke-static {v2, v2, v2, v0, v3}, LVa/M6;->w(IIILjava/util/HashMap;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sput-object v0, LX2/i;->c:Ljava/util/Map;

    .line 70
    .line 71
    new-instance v0, Ljava/util/HashMap;

    .line 72
    .line 73
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string v3, "bg_white"

    .line 77
    .line 78
    invoke-static {v1, v1, v1, v0, v3}, LVa/M6;->w(IIILjava/util/HashMap;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-string v3, "bg_lime"

    .line 82
    .line 83
    invoke-static {v2, v1, v2, v0, v3}, LVa/M6;->w(IIILjava/util/HashMap;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const-string v3, "bg_cyan"

    .line 87
    .line 88
    invoke-static {v2, v1, v1, v0, v3}, LVa/M6;->w(IIILjava/util/HashMap;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    const-string v3, "bg_red"

    .line 92
    .line 93
    invoke-static {v1, v2, v2, v0, v3}, LVa/M6;->w(IIILjava/util/HashMap;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const-string v3, "bg_yellow"

    .line 97
    .line 98
    invoke-static {v1, v1, v2, v0, v3}, LVa/M6;->w(IIILjava/util/HashMap;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    const-string v3, "bg_magenta"

    .line 102
    .line 103
    invoke-static {v1, v2, v1, v0, v3}, LVa/M6;->w(IIILjava/util/HashMap;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    const-string v3, "bg_blue"

    .line 107
    .line 108
    invoke-static {v2, v2, v1, v0, v3}, LVa/M6;->w(IIILjava/util/HashMap;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    const-string v1, "bg_black"

    .line 112
    .line 113
    invoke-static {v2, v2, v2, v0, v1}, LVa/M6;->w(IIILjava/util/HashMap;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    sput-object v0, LX2/i;->d:Ljava/util/Map;

    .line 121
    .line 122
    return-void
.end method

.method public static a(Ljava/lang/String;LX2/f;Ljava/util/List;Landroid/text/SpannableStringBuilder;Ljava/util/List;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    iget v5, v1, LX2/f;->b:I

    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 12
    .line 13
    .line 14
    move-result v6

    .line 15
    iget-object v7, v1, LX2/f;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/4 v8, 0x2

    .line 21
    const/4 v9, -0x1

    .line 22
    const/16 v12, 0x21

    .line 23
    .line 24
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v13

    .line 28
    sparse-switch v13, :sswitch_data_0

    .line 29
    .line 30
    .line 31
    :goto_0
    move v7, v9

    .line 32
    goto/16 :goto_1

    .line 33
    .line 34
    :sswitch_0
    const-string v13, "ruby"

    .line 35
    .line 36
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    if-nez v7, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v7, 0x7

    .line 44
    goto :goto_1

    .line 45
    :sswitch_1
    const-string v13, "lang"

    .line 46
    .line 47
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-nez v7, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    const/4 v7, 0x6

    .line 55
    goto :goto_1

    .line 56
    :sswitch_2
    const-string v13, "v"

    .line 57
    .line 58
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    if-nez v7, :cond_2

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    const/4 v7, 0x5

    .line 66
    goto :goto_1

    .line 67
    :sswitch_3
    const-string v13, "u"

    .line 68
    .line 69
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-nez v7, :cond_3

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    const/4 v7, 0x4

    .line 77
    goto :goto_1

    .line 78
    :sswitch_4
    const-string v13, "i"

    .line 79
    .line 80
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-nez v7, :cond_4

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    const/4 v7, 0x3

    .line 88
    goto :goto_1

    .line 89
    :sswitch_5
    const-string v13, "c"

    .line 90
    .line 91
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-nez v7, :cond_5

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_5
    move v7, v8

    .line 99
    goto :goto_1

    .line 100
    :sswitch_6
    const-string v13, "b"

    .line 101
    .line 102
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    if-nez v7, :cond_6

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_6
    const/4 v7, 0x1

    .line 110
    goto :goto_1

    .line 111
    :sswitch_7
    const-string v13, ""

    .line 112
    .line 113
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    if-nez v7, :cond_7

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_7
    const/4 v7, 0x0

    .line 121
    :goto_1
    packed-switch v7, :pswitch_data_0

    .line 122
    .line 123
    .line 124
    goto/16 :goto_13

    .line 125
    .line 126
    :pswitch_0
    invoke-static {v3, v0, v1}, LX2/i;->c(Ljava/util/List;Ljava/lang/String;LX2/f;)I

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    new-instance v13, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 133
    .line 134
    .line 135
    move-result v14

    .line 136
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 137
    .line 138
    .line 139
    move-object/from16 v14, p2

    .line 140
    .line 141
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 142
    .line 143
    .line 144
    sget-object v14, LX2/e;->c:LA0/f;

    .line 145
    .line 146
    invoke-static {v13, v14}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 147
    .line 148
    .line 149
    iget v14, v1, LX2/f;->b:I

    .line 150
    .line 151
    const/4 v15, 0x0

    .line 152
    const/16 v16, 0x0

    .line 153
    .line 154
    :goto_2
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 155
    .line 156
    .line 157
    move-result v10

    .line 158
    if-ge v15, v10, :cond_d

    .line 159
    .line 160
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    check-cast v10, LX2/e;

    .line 165
    .line 166
    iget-object v10, v10, LX2/e;->a:LX2/f;

    .line 167
    .line 168
    iget-object v10, v10, LX2/f;->a:Ljava/lang/String;

    .line 169
    .line 170
    const-string v4, "rt"

    .line 171
    .line 172
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    if-nez v4, :cond_8

    .line 177
    .line 178
    const/16 v18, 0x1

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_8
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    check-cast v4, LX2/e;

    .line 186
    .line 187
    iget-object v10, v4, LX2/e;->a:LX2/f;

    .line 188
    .line 189
    invoke-static {v3, v0, v10}, LX2/i;->c(Ljava/util/List;Ljava/lang/String;LX2/f;)I

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    if-eq v10, v9, :cond_9

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_9
    if-eq v7, v9, :cond_a

    .line 197
    .line 198
    move v10, v7

    .line 199
    goto :goto_3

    .line 200
    :cond_a
    const/4 v10, 0x1

    .line 201
    :goto_3
    iget-object v9, v4, LX2/e;->a:LX2/f;

    .line 202
    .line 203
    iget v9, v9, LX2/f;->b:I

    .line 204
    .line 205
    sub-int v9, v9, v16

    .line 206
    .line 207
    iget v4, v4, LX2/e;->b:I

    .line 208
    .line 209
    sub-int v4, v4, v16

    .line 210
    .line 211
    invoke-virtual {v2, v9, v4}, Landroid/text/SpannableStringBuilder;->subSequence(II)Ljava/lang/CharSequence;

    .line 212
    .line 213
    .line 214
    move-result-object v17

    .line 215
    invoke-virtual {v2, v9, v4}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 216
    .line 217
    .line 218
    new-instance v4, LP1/f;

    .line 219
    .line 220
    const/16 v18, 0x1

    .line 221
    .line 222
    invoke-interface/range {v17 .. v17}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v11

    .line 226
    invoke-direct {v4, v11, v10}, LP1/f;-><init>(Ljava/lang/String;I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2, v4, v14, v9, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 230
    .line 231
    .line 232
    invoke-interface/range {v17 .. v17}, Ljava/lang/CharSequence;->length()I

    .line 233
    .line 234
    .line 235
    move-result v4

    .line 236
    add-int v16, v4, v16

    .line 237
    .line 238
    move v14, v9

    .line 239
    :goto_4
    add-int/lit8 v15, v15, 0x1

    .line 240
    .line 241
    const/4 v9, -0x1

    .line 242
    goto :goto_2

    .line 243
    :pswitch_1
    const/16 v18, 0x1

    .line 244
    .line 245
    new-instance v4, LP1/h;

    .line 246
    .line 247
    iget-object v7, v1, LX2/f;->c:Ljava/lang/String;

    .line 248
    .line 249
    invoke-direct {v4, v7}, LP1/h;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2, v4, v5, v6, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 253
    .line 254
    .line 255
    goto :goto_6

    .line 256
    :pswitch_2
    const/16 v18, 0x1

    .line 257
    .line 258
    new-instance v4, Landroid/text/style/UnderlineSpan;

    .line 259
    .line 260
    invoke-direct {v4}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v4, v5, v6, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 264
    .line 265
    .line 266
    goto :goto_6

    .line 267
    :pswitch_3
    const/16 v18, 0x1

    .line 268
    .line 269
    invoke-static {v8, v2, v5, v6, v12}, LN0/a;->m(ILandroid/text/SpannableStringBuilder;III)V

    .line 270
    .line 271
    .line 272
    goto :goto_6

    .line 273
    :pswitch_4
    const/16 v18, 0x1

    .line 274
    .line 275
    iget-object v4, v1, LX2/f;->d:Ljava/util/Set;

    .line 276
    .line 277
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 278
    .line 279
    .line 280
    move-result-object v4

    .line 281
    :cond_b
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 282
    .line 283
    .line 284
    move-result v7

    .line 285
    if-eqz v7, :cond_d

    .line 286
    .line 287
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v7

    .line 291
    check-cast v7, Ljava/lang/String;

    .line 292
    .line 293
    sget-object v9, LX2/i;->c:Ljava/util/Map;

    .line 294
    .line 295
    invoke-interface {v9, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v10

    .line 299
    if-eqz v10, :cond_c

    .line 300
    .line 301
    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v7

    .line 305
    check-cast v7, Ljava/lang/Integer;

    .line 306
    .line 307
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 308
    .line 309
    .line 310
    move-result v7

    .line 311
    new-instance v9, Landroid/text/style/ForegroundColorSpan;

    .line 312
    .line 313
    invoke-direct {v9, v7}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2, v9, v5, v6, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 317
    .line 318
    .line 319
    goto :goto_5

    .line 320
    :cond_c
    sget-object v9, LX2/i;->d:Ljava/util/Map;

    .line 321
    .line 322
    invoke-interface {v9, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v10

    .line 326
    if-eqz v10, :cond_b

    .line 327
    .line 328
    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v7

    .line 332
    check-cast v7, Ljava/lang/Integer;

    .line 333
    .line 334
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 335
    .line 336
    .line 337
    move-result v7

    .line 338
    new-instance v9, Landroid/text/style/BackgroundColorSpan;

    .line 339
    .line 340
    invoke-direct {v9, v7}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2, v9, v5, v6, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 344
    .line 345
    .line 346
    goto :goto_5

    .line 347
    :pswitch_5
    const/4 v4, 0x1

    .line 348
    invoke-static {v4, v2, v5, v6, v12}, LN0/a;->m(ILandroid/text/SpannableStringBuilder;III)V

    .line 349
    .line 350
    .line 351
    :cond_d
    :goto_6
    :pswitch_6
    invoke-static {v3, v0, v1}, LX2/i;->b(Ljava/util/List;Ljava/lang/String;LX2/f;)Ljava/util/ArrayList;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    const/4 v1, 0x0

    .line 356
    :goto_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 357
    .line 358
    .line 359
    move-result v3

    .line 360
    if-ge v1, v3, :cond_20

    .line 361
    .line 362
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    check-cast v3, LX2/g;

    .line 367
    .line 368
    iget-object v3, v3, LX2/g;->b:LX2/c;

    .line 369
    .line 370
    iget v4, v3, LX2/c;->l:I

    .line 371
    .line 372
    const/4 v7, -0x1

    .line 373
    if-ne v4, v7, :cond_e

    .line 374
    .line 375
    iget v9, v3, LX2/c;->m:I

    .line 376
    .line 377
    if-ne v9, v7, :cond_e

    .line 378
    .line 379
    const/4 v4, -0x1

    .line 380
    :goto_8
    const/4 v7, -0x1

    .line 381
    goto :goto_b

    .line 382
    :cond_e
    const/4 v7, 0x1

    .line 383
    if-ne v4, v7, :cond_f

    .line 384
    .line 385
    move v4, v7

    .line 386
    goto :goto_9

    .line 387
    :cond_f
    const/4 v4, 0x0

    .line 388
    :goto_9
    iget v9, v3, LX2/c;->m:I

    .line 389
    .line 390
    if-ne v9, v7, :cond_10

    .line 391
    .line 392
    move v7, v8

    .line 393
    goto :goto_a

    .line 394
    :cond_10
    const/4 v7, 0x0

    .line 395
    :goto_a
    or-int/2addr v7, v4

    .line 396
    move v4, v7

    .line 397
    goto :goto_8

    .line 398
    :goto_b
    if-eq v4, v7, :cond_14

    .line 399
    .line 400
    new-instance v4, Landroid/text/style/StyleSpan;

    .line 401
    .line 402
    iget v9, v3, LX2/c;->l:I

    .line 403
    .line 404
    if-ne v9, v7, :cond_11

    .line 405
    .line 406
    iget v10, v3, LX2/c;->m:I

    .line 407
    .line 408
    if-ne v10, v7, :cond_11

    .line 409
    .line 410
    move v9, v7

    .line 411
    const/4 v10, 0x1

    .line 412
    goto :goto_e

    .line 413
    :cond_11
    const/4 v10, 0x1

    .line 414
    if-ne v9, v10, :cond_12

    .line 415
    .line 416
    move/from16 v18, v10

    .line 417
    .line 418
    goto :goto_c

    .line 419
    :cond_12
    const/16 v18, 0x0

    .line 420
    .line 421
    :goto_c
    iget v9, v3, LX2/c;->m:I

    .line 422
    .line 423
    if-ne v9, v10, :cond_13

    .line 424
    .line 425
    move v9, v8

    .line 426
    goto :goto_d

    .line 427
    :cond_13
    const/4 v9, 0x0

    .line 428
    :goto_d
    or-int v9, v18, v9

    .line 429
    .line 430
    :goto_e
    invoke-direct {v4, v9}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 431
    .line 432
    .line 433
    invoke-static {v2, v4, v5, v6}, LS3/f;->e(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 434
    .line 435
    .line 436
    goto :goto_f

    .line 437
    :cond_14
    const/4 v10, 0x1

    .line 438
    :goto_f
    iget v4, v3, LX2/c;->j:I

    .line 439
    .line 440
    if-ne v4, v10, :cond_15

    .line 441
    .line 442
    new-instance v4, Landroid/text/style/StrikethroughSpan;

    .line 443
    .line 444
    invoke-direct {v4}, Landroid/text/style/StrikethroughSpan;-><init>()V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v2, v4, v5, v6, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 448
    .line 449
    .line 450
    :cond_15
    iget v4, v3, LX2/c;->k:I

    .line 451
    .line 452
    if-ne v4, v10, :cond_16

    .line 453
    .line 454
    new-instance v4, Landroid/text/style/UnderlineSpan;

    .line 455
    .line 456
    invoke-direct {v4}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v2, v4, v5, v6, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 460
    .line 461
    .line 462
    :cond_16
    iget-boolean v4, v3, LX2/c;->g:Z

    .line 463
    .line 464
    if-eqz v4, :cond_18

    .line 465
    .line 466
    new-instance v4, Landroid/text/style/ForegroundColorSpan;

    .line 467
    .line 468
    iget-boolean v9, v3, LX2/c;->g:Z

    .line 469
    .line 470
    if-eqz v9, :cond_17

    .line 471
    .line 472
    iget v9, v3, LX2/c;->f:I

    .line 473
    .line 474
    invoke-direct {v4, v9}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 475
    .line 476
    .line 477
    invoke-static {v2, v4, v5, v6}, LS3/f;->e(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 478
    .line 479
    .line 480
    goto :goto_10

    .line 481
    :cond_17
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 482
    .line 483
    const-string v1, "Font color not defined"

    .line 484
    .line 485
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    throw v0

    .line 489
    :cond_18
    :goto_10
    iget-boolean v4, v3, LX2/c;->i:Z

    .line 490
    .line 491
    if-eqz v4, :cond_1a

    .line 492
    .line 493
    new-instance v4, Landroid/text/style/BackgroundColorSpan;

    .line 494
    .line 495
    iget-boolean v9, v3, LX2/c;->i:Z

    .line 496
    .line 497
    if-eqz v9, :cond_19

    .line 498
    .line 499
    iget v9, v3, LX2/c;->h:I

    .line 500
    .line 501
    invoke-direct {v4, v9}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 502
    .line 503
    .line 504
    invoke-static {v2, v4, v5, v6}, LS3/f;->e(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 505
    .line 506
    .line 507
    goto :goto_11

    .line 508
    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 509
    .line 510
    const-string v1, "Background color not defined."

    .line 511
    .line 512
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    throw v0

    .line 516
    :cond_1a
    :goto_11
    iget-object v4, v3, LX2/c;->e:Ljava/lang/String;

    .line 517
    .line 518
    if-eqz v4, :cond_1b

    .line 519
    .line 520
    new-instance v4, Landroid/text/style/TypefaceSpan;

    .line 521
    .line 522
    iget-object v9, v3, LX2/c;->e:Ljava/lang/String;

    .line 523
    .line 524
    invoke-direct {v4, v9}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    invoke-static {v2, v4, v5, v6}, LS3/f;->e(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 528
    .line 529
    .line 530
    :cond_1b
    iget v4, v3, LX2/c;->n:I

    .line 531
    .line 532
    const/4 v10, 0x1

    .line 533
    if-eq v4, v10, :cond_1e

    .line 534
    .line 535
    if-eq v4, v8, :cond_1d

    .line 536
    .line 537
    const/4 v9, 0x3

    .line 538
    if-eq v4, v9, :cond_1c

    .line 539
    .line 540
    goto :goto_12

    .line 541
    :cond_1c
    new-instance v4, Landroid/text/style/RelativeSizeSpan;

    .line 542
    .line 543
    iget v10, v3, LX2/c;->o:F

    .line 544
    .line 545
    const/high16 v11, 0x42c80000    # 100.0f

    .line 546
    .line 547
    div-float/2addr v10, v11

    .line 548
    invoke-direct {v4, v10}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 549
    .line 550
    .line 551
    invoke-static {v2, v4, v5, v6}, LS3/f;->e(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 552
    .line 553
    .line 554
    goto :goto_12

    .line 555
    :cond_1d
    const/4 v9, 0x3

    .line 556
    new-instance v4, Landroid/text/style/RelativeSizeSpan;

    .line 557
    .line 558
    iget v10, v3, LX2/c;->o:F

    .line 559
    .line 560
    invoke-direct {v4, v10}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 561
    .line 562
    .line 563
    invoke-static {v2, v4, v5, v6}, LS3/f;->e(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 564
    .line 565
    .line 566
    goto :goto_12

    .line 567
    :cond_1e
    const/4 v9, 0x3

    .line 568
    new-instance v4, Landroid/text/style/AbsoluteSizeSpan;

    .line 569
    .line 570
    iget v10, v3, LX2/c;->o:F

    .line 571
    .line 572
    float-to-int v10, v10

    .line 573
    const/4 v11, 0x1

    .line 574
    invoke-direct {v4, v10, v11}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    .line 575
    .line 576
    .line 577
    invoke-static {v2, v4, v5, v6}, LS3/f;->e(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 578
    .line 579
    .line 580
    :goto_12
    iget-boolean v3, v3, LX2/c;->q:Z

    .line 581
    .line 582
    if-eqz v3, :cond_1f

    .line 583
    .line 584
    new-instance v3, LP1/e;

    .line 585
    .line 586
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v2, v3, v5, v6, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 590
    .line 591
    .line 592
    :cond_1f
    const/16 v18, 0x1

    .line 593
    .line 594
    add-int/lit8 v1, v1, 0x1

    .line 595
    .line 596
    goto/16 :goto_7

    .line 597
    .line 598
    :cond_20
    :goto_13
    return-void

    .line 599
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_7
        0x62 -> :sswitch_6
        0x63 -> :sswitch_5
        0x69 -> :sswitch_4
        0x75 -> :sswitch_3
        0x76 -> :sswitch_2
        0x3291ee -> :sswitch_1
        0x3595da -> :sswitch_0
    .end sparse-switch

    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_6
        :pswitch_0
    .end packed-switch
.end method

.method public static b(Ljava/util/List;Ljava/lang/String;LX2/f;)Ljava/util/ArrayList;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-ge v2, v3, :cond_4

    .line 13
    .line 14
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, LX2/c;

    .line 19
    .line 20
    iget-object v4, p2, LX2/f;->a:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v5, v3, LX2/c;->a:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eqz v5, :cond_0

    .line 29
    .line 30
    iget-object v5, v3, LX2/c;->b:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-eqz v5, :cond_0

    .line 37
    .line 38
    iget-object v5, v3, LX2/c;->c:Ljava/util/Set;

    .line 39
    .line 40
    invoke-interface {v5}, Ljava/util/Set;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-eqz v5, :cond_0

    .line 45
    .line 46
    iget-object v5, v3, LX2/c;->d:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_0

    .line 53
    .line 54
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    goto :goto_2

    .line 59
    :cond_0
    iget-object v5, v3, LX2/c;->a:Ljava/lang/String;

    .line 60
    .line 61
    const/high16 v6, 0x40000000    # 2.0f

    .line 62
    .line 63
    invoke-static {v1, v6, v5, p1}, LX2/c;->a(IILjava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    iget-object v6, v3, LX2/c;->b:Ljava/lang/String;

    .line 68
    .line 69
    const/4 v7, 0x2

    .line 70
    invoke-static {v5, v7, v6, v4}, LX2/c;->a(IILjava/lang/String;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    iget-object v5, v3, LX2/c;->d:Ljava/lang/String;

    .line 75
    .line 76
    iget-object v6, p2, LX2/f;->c:Ljava/lang/String;

    .line 77
    .line 78
    const/4 v7, 0x4

    .line 79
    invoke-static {v4, v7, v5, v6}, LX2/c;->a(IILjava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    const/4 v5, -0x1

    .line 84
    if-eq v4, v5, :cond_2

    .line 85
    .line 86
    iget-object v5, v3, LX2/c;->c:Ljava/util/Set;

    .line 87
    .line 88
    iget-object v6, p2, LX2/f;->d:Ljava/util/Set;

    .line 89
    .line 90
    invoke-interface {v6, v5}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-nez v5, :cond_1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    iget-object v5, v3, LX2/c;->c:Ljava/util/Set;

    .line 98
    .line 99
    invoke-interface {v5}, Ljava/util/Set;->size()I

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    mul-int/2addr v5, v7

    .line 104
    add-int/2addr v4, v5

    .line 105
    goto :goto_2

    .line 106
    :cond_2
    :goto_1
    move v4, v1

    .line 107
    :goto_2
    if-lez v4, :cond_3

    .line 108
    .line 109
    new-instance v5, LX2/g;

    .line 110
    .line 111
    invoke-direct {v5, v4, v3}, LX2/g;-><init>(ILX2/c;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_4
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 121
    .line 122
    .line 123
    return-object v0
.end method

.method public static c(Ljava/util/List;Ljava/lang/String;LX2/f;)I
    .locals 1

    .line 1
    invoke-static {p0, p1, p2}, LX2/i;->b(Ljava/util/List;Ljava/lang/String;LX2/f;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    const/4 v0, -0x1

    .line 11
    if-ge p1, p2, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    check-cast p2, LX2/g;

    .line 18
    .line 19
    iget-object p2, p2, LX2/g;->b:LX2/c;

    .line 20
    .line 21
    iget p2, p2, LX2/c;->p:I

    .line 22
    .line 23
    if-eq p2, v0, :cond_0

    .line 24
    .line 25
    return p2

    .line 26
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    return v0
.end method

.method public static d(Ljava/lang/String;Ljava/util/regex/Matcher;LQ1/o;Ljava/util/ArrayList;)LX2/d;
    .locals 7

    .line 1
    new-instance v0, LX2/h;

    .line 2
    .line 3
    invoke-direct {v0}, LX2/h;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    :try_start_0
    invoke-virtual {p1, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, LX2/k;->c(Ljava/lang/String;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    iput-wide v1, v0, LX2/h;->a:J

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    invoke-virtual {p1, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, LX2/k;->c(Ljava/lang/String;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    iput-wide v1, v0, LX2/h;->b:J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    const/4 v1, 0x3

    .line 35
    invoke-virtual {p1, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v0}, LX2/i;->e(Ljava/lang/String;LX2/h;)V

    .line 43
    .line 44
    .line 45
    new-instance p1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 54
    .line 55
    invoke-virtual {p2, v1}, LQ1/o;->i(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    :goto_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_1

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-lez v2, :cond_0

    .line 70
    .line 71
    const-string v2, "\n"

    .line 72
    .line 73
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 84
    .line 85
    invoke-virtual {p2, v1}, LQ1/o;->i(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    goto :goto_0

    .line 90
    :cond_1
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-static {p0, p1, p3}, LX2/i;->f(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Landroid/text/SpannedString;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    iput-object p0, v0, LX2/h;->c:Ljava/lang/CharSequence;

    .line 99
    .line 100
    new-instance v1, LX2/d;

    .line 101
    .line 102
    invoke-virtual {v0}, LX2/h;->a()LP1/a;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {p0}, LP1/a;->a()LP1/b;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    iget-wide v3, v0, LX2/h;->a:J

    .line 111
    .line 112
    iget-wide v5, v0, LX2/h;->b:J

    .line 113
    .line 114
    invoke-direct/range {v1 .. v6}, LX2/d;-><init>(LP1/b;JJ)V

    .line 115
    .line 116
    .line 117
    return-object v1

    .line 118
    :catch_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    const-string p2, "Skipping cue with bad header: "

    .line 121
    .line 122
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    const-string p1, "WebvttCueParser"

    .line 137
    .line 138
    invoke-static {p1, p0}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    const/4 p0, 0x0

    .line 142
    return-object p0
.end method

.method public static e(Ljava/lang/String;LX2/h;)V
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "start"

    .line 4
    .line 5
    const-string v2, "end"

    .line 6
    .line 7
    const-string v3, "middle"

    .line 8
    .line 9
    const-string v4, "center"

    .line 10
    .line 11
    const/4 v7, 0x3

    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v9, -0x1

    .line 14
    const/4 v10, 0x2

    .line 15
    const/4 v11, 0x1

    .line 16
    const-string v12, "WebvttCueParser"

    .line 17
    .line 18
    sget-object v13, LX2/i;->b:Ljava/util/regex/Pattern;

    .line 19
    .line 20
    move-object/from16 v14, p0

    .line 21
    .line 22
    invoke-virtual {v13, v14}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 23
    .line 24
    .line 25
    move-result-object v13

    .line 26
    :goto_0
    invoke-virtual {v13}, Ljava/util/regex/Matcher;->find()Z

    .line 27
    .line 28
    .line 29
    move-result v14

    .line 30
    if-eqz v14, :cond_14

    .line 31
    .line 32
    invoke-virtual {v13, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v14

    .line 36
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v13, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v15

    .line 43
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    :try_start_0
    const-string v5, "line"

    .line 47
    .line 48
    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_0

    .line 53
    .line 54
    invoke-static {v15, v0}, LX2/i;->g(Ljava/lang/String;LX2/h;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    const-string v5, "align"

    .line 59
    .line 60
    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v5
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    if-eqz v5, :cond_7

    .line 65
    .line 66
    invoke-virtual {v15}, Ljava/lang/String;->hashCode()I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    sparse-switch v5, :sswitch_data_0

    .line 71
    .line 72
    .line 73
    :goto_1
    move v5, v9

    .line 74
    goto :goto_2

    .line 75
    :sswitch_0
    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-nez v5, :cond_1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    const/4 v5, 0x5

    .line 83
    goto :goto_2

    .line 84
    :sswitch_1
    const-string v5, "right"

    .line 85
    .line 86
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-nez v5, :cond_2

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    const/4 v5, 0x4

    .line 94
    goto :goto_2

    .line 95
    :sswitch_2
    const-string v5, "left"

    .line 96
    .line 97
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-nez v5, :cond_3

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_3
    move v5, v7

    .line 105
    goto :goto_2

    .line 106
    :sswitch_3
    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    if-nez v5, :cond_4

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_4
    move v5, v10

    .line 114
    goto :goto_2

    .line 115
    :sswitch_4
    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-nez v5, :cond_5

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_5
    move v5, v11

    .line 123
    goto :goto_2

    .line 124
    :sswitch_5
    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    if-nez v5, :cond_6

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_6
    move v5, v8

    .line 132
    :goto_2
    packed-switch v5, :pswitch_data_0

    .line 133
    .line 134
    .line 135
    :try_start_1
    const-string v5, "Invalid alignment value: "

    .line 136
    .line 137
    invoke-virtual {v5, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    invoke-static {v12, v5}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :pswitch_0
    move v5, v10

    .line 145
    goto :goto_3

    .line 146
    :pswitch_1
    move v5, v11

    .line 147
    goto :goto_3

    .line 148
    :pswitch_2
    const/4 v5, 0x5

    .line 149
    goto :goto_3

    .line 150
    :pswitch_3
    const/4 v5, 0x4

    .line 151
    goto :goto_3

    .line 152
    :pswitch_4
    move v5, v7

    .line 153
    :goto_3
    iput v5, v0, LX2/h;->d:I

    .line 154
    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :cond_7
    const-string v5, "position"

    .line 158
    .line 159
    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    const/high16 v16, -0x80000000

    .line 164
    .line 165
    if-eqz v5, :cond_f

    .line 166
    .line 167
    const/16 v5, 0x2c

    .line 168
    .line 169
    invoke-virtual {v15, v5}, Ljava/lang/String;->indexOf(I)I

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    if-eq v5, v9, :cond_e

    .line 174
    .line 175
    add-int/lit8 v14, v5, 0x1

    .line 176
    .line 177
    invoke-virtual {v15, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v14

    .line 181
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 182
    .line 183
    .line 184
    invoke-virtual {v14}, Ljava/lang/String;->hashCode()I

    .line 185
    .line 186
    .line 187
    move-result v17

    .line 188
    sparse-switch v17, :sswitch_data_1

    .line 189
    .line 190
    .line 191
    :goto_4
    move v6, v9

    .line 192
    goto :goto_5

    .line 193
    :sswitch_6
    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v17

    .line 197
    if-nez v17, :cond_8

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_8
    const/4 v6, 0x5

    .line 201
    goto :goto_5

    .line 202
    :sswitch_7
    invoke-virtual {v14, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v17

    .line 206
    if-nez v17, :cond_9

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_9
    const/4 v6, 0x4

    .line 210
    goto :goto_5

    .line 211
    :sswitch_8
    invoke-virtual {v14, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v17

    .line 215
    if-nez v17, :cond_a

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_a
    move v6, v7

    .line 219
    goto :goto_5

    .line 220
    :sswitch_9
    const-string v6, "line-right"

    .line 221
    .line 222
    invoke-virtual {v14, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v6

    .line 226
    if-nez v6, :cond_b

    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_b
    move v6, v10

    .line 230
    goto :goto_5

    .line 231
    :sswitch_a
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v6

    .line 235
    if-nez v6, :cond_c

    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_c
    move v6, v11

    .line 239
    goto :goto_5

    .line 240
    :sswitch_b
    const-string v6, "line-left"

    .line 241
    .line 242
    invoke-virtual {v14, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v6

    .line 246
    if-nez v6, :cond_d

    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_d
    move v6, v8

    .line 250
    :goto_5
    packed-switch v6, :pswitch_data_1

    .line 251
    .line 252
    .line 253
    :try_start_2
    const-string v6, "Invalid anchor value: "

    .line 254
    .line 255
    invoke-virtual {v6, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v6

    .line 259
    invoke-static {v12, v6}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    move/from16 v6, v16

    .line 263
    .line 264
    goto :goto_6

    .line 265
    :pswitch_5
    move v6, v10

    .line 266
    goto :goto_6

    .line 267
    :pswitch_6
    move v6, v11

    .line 268
    goto :goto_6

    .line 269
    :pswitch_7
    move v6, v8

    .line 270
    :goto_6
    iput v6, v0, LX2/h;->i:I

    .line 271
    .line 272
    invoke-virtual {v15, v8, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v15

    .line 276
    :cond_e
    invoke-static {v15}, LX2/k;->b(Ljava/lang/String;)F

    .line 277
    .line 278
    .line 279
    move-result v5

    .line 280
    iput v5, v0, LX2/h;->h:F

    .line 281
    .line 282
    goto/16 :goto_0

    .line 283
    .line 284
    :cond_f
    const-string v5, "size"

    .line 285
    .line 286
    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v5

    .line 290
    if-eqz v5, :cond_10

    .line 291
    .line 292
    invoke-static {v15}, LX2/k;->b(Ljava/lang/String;)F

    .line 293
    .line 294
    .line 295
    move-result v5

    .line 296
    iput v5, v0, LX2/h;->j:F

    .line 297
    .line 298
    goto/16 :goto_0

    .line 299
    .line 300
    :cond_10
    const-string v5, "vertical"

    .line 301
    .line 302
    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v5
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    .line 306
    if-eqz v5, :cond_13

    .line 307
    .line 308
    const-string v5, "lr"

    .line 309
    .line 310
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v5

    .line 314
    if-nez v5, :cond_12

    .line 315
    .line 316
    const-string v5, "rl"

    .line 317
    .line 318
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v5

    .line 322
    if-nez v5, :cond_11

    .line 323
    .line 324
    :try_start_3
    const-string v5, "Invalid \'vertical\' value: "

    .line 325
    .line 326
    invoke-virtual {v5, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v5

    .line 330
    invoke-static {v12, v5}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    move/from16 v5, v16

    .line 334
    .line 335
    goto :goto_7

    .line 336
    :cond_11
    move v5, v11

    .line 337
    goto :goto_7

    .line 338
    :cond_12
    move v5, v10

    .line 339
    :goto_7
    iput v5, v0, LX2/h;->k:I

    .line 340
    .line 341
    goto/16 :goto_0

    .line 342
    .line 343
    :cond_13
    new-instance v5, Ljava/lang/StringBuilder;

    .line 344
    .line 345
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 346
    .line 347
    .line 348
    const-string v6, "Unknown cue setting "

    .line 349
    .line 350
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    const-string v6, ":"

    .line 357
    .line 358
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v5

    .line 368
    invoke-static {v12, v5}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_0

    .line 369
    .line 370
    .line 371
    goto/16 :goto_0

    .line 372
    .line 373
    :catch_0
    new-instance v5, Ljava/lang/StringBuilder;

    .line 374
    .line 375
    const-string v6, "Skipping bad cue setting: "

    .line 376
    .line 377
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v13}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v6

    .line 384
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v5

    .line 391
    invoke-static {v12, v5}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    goto/16 :goto_0

    .line 395
    .line 396
    :cond_14
    return-void

    .line 397
    :sswitch_data_0
    .sparse-switch
        -0x514d33ab -> :sswitch_5
        -0x4009266b -> :sswitch_4
        0x188db -> :sswitch_3
        0x32a007 -> :sswitch_2
        0x677c21c -> :sswitch_1
        0x68ac462 -> :sswitch_0
    .end sparse-switch

    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    :sswitch_data_1
    .sparse-switch
        -0x6dd215c0 -> :sswitch_b
        -0x514d33ab -> :sswitch_a
        -0x4c1a40fd -> :sswitch_9
        -0x4009266b -> :sswitch_8
        0x188db -> :sswitch_7
        0x68ac462 -> :sswitch_6
    .end sparse-switch

    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_5
        :pswitch_7
    .end packed-switch
.end method

.method public static f(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Landroid/text/SpannedString;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v4, -0x1

    .line 8
    const/4 v5, 0x2

    .line 9
    new-instance v7, Landroid/text/SpannableStringBuilder;

    .line 10
    .line 11
    invoke-direct {v7}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v8, Ljava/util/ArrayDeque;

    .line 15
    .line 16
    invoke-direct {v8}, Ljava/util/ArrayDeque;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v9, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    const/4 v11, 0x0

    .line 25
    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v12

    .line 29
    const-string v13, ""

    .line 30
    .line 31
    if-ge v11, v12, :cond_20

    .line 32
    .line 33
    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    .line 34
    .line 35
    .line 36
    move-result v12

    .line 37
    const-string v14, " "

    .line 38
    .line 39
    const/16 v15, 0x3e

    .line 40
    .line 41
    const/16 v3, 0x3c

    .line 42
    .line 43
    const/16 v16, 0x1

    .line 44
    .line 45
    const/16 v6, 0x26

    .line 46
    .line 47
    if-eq v12, v6, :cond_17

    .line 48
    .line 49
    if-eq v12, v3, :cond_0

    .line 50
    .line 51
    invoke-virtual {v7, v12}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 52
    .line 53
    .line 54
    add-int/lit8 v11, v11, 0x1

    .line 55
    .line 56
    goto/16 :goto_11

    .line 57
    .line 58
    :cond_0
    add-int/lit8 v6, v11, 0x1

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-lt v6, v3, :cond_2

    .line 65
    .line 66
    :cond_1
    :goto_1
    move v11, v6

    .line 67
    goto/16 :goto_11

    .line 68
    .line 69
    :cond_2
    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    const/16 v12, 0x2f

    .line 74
    .line 75
    if-ne v3, v12, :cond_3

    .line 76
    .line 77
    move/from16 v3, v16

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    const/4 v3, 0x0

    .line 81
    :goto_2
    invoke-virtual {v1, v15, v6}, Ljava/lang/String;->indexOf(II)I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-ne v6, v4, :cond_4

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    goto :goto_3

    .line 92
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 93
    .line 94
    :goto_3
    add-int/lit8 v15, v6, -0x2

    .line 95
    .line 96
    const/16 v17, 0x0

    .line 97
    .line 98
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    if-ne v10, v12, :cond_5

    .line 103
    .line 104
    move/from16 v10, v16

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_5
    move/from16 v10, v17

    .line 108
    .line 109
    :goto_4
    if-eqz v3, :cond_6

    .line 110
    .line 111
    move v12, v5

    .line 112
    goto :goto_5

    .line 113
    :cond_6
    move/from16 v12, v16

    .line 114
    .line 115
    :goto_5
    add-int/2addr v11, v12

    .line 116
    if-eqz v10, :cond_7

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_7
    add-int/lit8 v15, v6, -0x1

    .line 120
    .line 121
    :goto_6
    invoke-virtual {v1, v11, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v11

    .line 125
    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v12

    .line 129
    invoke-virtual {v12}, Ljava/lang/String;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result v12

    .line 133
    if-eqz v12, :cond_8

    .line 134
    .line 135
    goto/16 :goto_9

    .line 136
    .line 137
    :cond_8
    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v12

    .line 141
    invoke-virtual {v12}, Ljava/lang/String;->isEmpty()Z

    .line 142
    .line 143
    .line 144
    move-result v15

    .line 145
    xor-int/lit8 v15, v15, 0x1

    .line 146
    .line 147
    invoke-static {v15}, LQ1/k;->c(Z)V

    .line 148
    .line 149
    .line 150
    sget v15, LQ1/x;->a:I

    .line 151
    .line 152
    const-string v15, "[ \\.]"

    .line 153
    .line 154
    invoke-virtual {v12, v15, v5}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v12

    .line 158
    aget-object v12, v12, v17

    .line 159
    .line 160
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    .line 164
    .line 165
    .line 166
    move-result v15

    .line 167
    sparse-switch v15, :sswitch_data_0

    .line 168
    .line 169
    .line 170
    :goto_7
    move v15, v4

    .line 171
    goto/16 :goto_8

    .line 172
    .line 173
    :sswitch_0
    const-string v15, "ruby"

    .line 174
    .line 175
    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v15

    .line 179
    if-nez v15, :cond_9

    .line 180
    .line 181
    goto :goto_7

    .line 182
    :cond_9
    const/4 v15, 0x7

    .line 183
    goto :goto_8

    .line 184
    :sswitch_1
    const-string v15, "lang"

    .line 185
    .line 186
    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v15

    .line 190
    if-nez v15, :cond_a

    .line 191
    .line 192
    goto :goto_7

    .line 193
    :cond_a
    const/4 v15, 0x6

    .line 194
    goto :goto_8

    .line 195
    :sswitch_2
    const-string v15, "rt"

    .line 196
    .line 197
    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v15

    .line 201
    if-nez v15, :cond_b

    .line 202
    .line 203
    goto :goto_7

    .line 204
    :cond_b
    const/4 v15, 0x5

    .line 205
    goto :goto_8

    .line 206
    :sswitch_3
    const-string v15, "v"

    .line 207
    .line 208
    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v15

    .line 212
    if-nez v15, :cond_c

    .line 213
    .line 214
    goto :goto_7

    .line 215
    :cond_c
    const/4 v15, 0x4

    .line 216
    goto :goto_8

    .line 217
    :sswitch_4
    const-string v15, "u"

    .line 218
    .line 219
    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v15

    .line 223
    if-nez v15, :cond_d

    .line 224
    .line 225
    goto :goto_7

    .line 226
    :cond_d
    const/4 v15, 0x3

    .line 227
    goto :goto_8

    .line 228
    :sswitch_5
    const-string v15, "i"

    .line 229
    .line 230
    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v15

    .line 234
    if-nez v15, :cond_e

    .line 235
    .line 236
    goto :goto_7

    .line 237
    :cond_e
    move v15, v5

    .line 238
    goto :goto_8

    .line 239
    :sswitch_6
    const-string v15, "c"

    .line 240
    .line 241
    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v15

    .line 245
    if-nez v15, :cond_f

    .line 246
    .line 247
    goto :goto_7

    .line 248
    :cond_f
    move/from16 v15, v16

    .line 249
    .line 250
    goto :goto_8

    .line 251
    :sswitch_7
    const-string v15, "b"

    .line 252
    .line 253
    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v15

    .line 257
    if-nez v15, :cond_10

    .line 258
    .line 259
    goto :goto_7

    .line 260
    :cond_10
    move/from16 v15, v17

    .line 261
    .line 262
    :goto_8
    packed-switch v15, :pswitch_data_0

    .line 263
    .line 264
    .line 265
    :goto_9
    move v11, v6

    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :pswitch_0
    if-eqz v3, :cond_14

    .line 269
    .line 270
    :cond_11
    invoke-virtual {v8}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    if-eqz v3, :cond_12

    .line 275
    .line 276
    goto/16 :goto_1

    .line 277
    .line 278
    :cond_12
    invoke-virtual {v8}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    check-cast v3, LX2/f;

    .line 283
    .line 284
    invoke-static {v0, v3, v9, v7, v2}, LX2/i;->a(Ljava/lang/String;LX2/f;Ljava/util/List;Landroid/text/SpannableStringBuilder;Ljava/util/List;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v8}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 288
    .line 289
    .line 290
    move-result v10

    .line 291
    if-nez v10, :cond_13

    .line 292
    .line 293
    new-instance v10, LX2/e;

    .line 294
    .line 295
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 296
    .line 297
    .line 298
    move-result v11

    .line 299
    invoke-direct {v10, v3, v11}, LX2/e;-><init>(LX2/f;I)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    goto :goto_a

    .line 306
    :cond_13
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    .line 307
    .line 308
    .line 309
    :goto_a
    iget-object v3, v3, LX2/f;->a:Ljava/lang/String;

    .line 310
    .line 311
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    if-eqz v3, :cond_11

    .line 316
    .line 317
    goto/16 :goto_1

    .line 318
    .line 319
    :cond_14
    if-nez v10, :cond_1

    .line 320
    .line 321
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v10

    .line 329
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    .line 330
    .line 331
    .line 332
    move-result v11

    .line 333
    xor-int/lit8 v11, v11, 0x1

    .line 334
    .line 335
    invoke-static {v11}, LQ1/k;->c(Z)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v10, v14}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 339
    .line 340
    .line 341
    move-result v11

    .line 342
    if-ne v11, v4, :cond_15

    .line 343
    .line 344
    move/from16 v12, v17

    .line 345
    .line 346
    goto :goto_b

    .line 347
    :cond_15
    invoke-virtual {v10, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v12

    .line 351
    invoke-virtual {v12}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v13

    .line 355
    move/from16 v12, v17

    .line 356
    .line 357
    invoke-virtual {v10, v12, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v10

    .line 361
    :goto_b
    const-string v11, "\\."

    .line 362
    .line 363
    invoke-virtual {v10, v11, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v10

    .line 367
    aget-object v11, v10, v12

    .line 368
    .line 369
    new-instance v12, Ljava/util/HashSet;

    .line 370
    .line 371
    invoke-direct {v12}, Ljava/util/HashSet;-><init>()V

    .line 372
    .line 373
    .line 374
    move/from16 v14, v16

    .line 375
    .line 376
    :goto_c
    array-length v15, v10

    .line 377
    if-ge v14, v15, :cond_16

    .line 378
    .line 379
    aget-object v15, v10, v14

    .line 380
    .line 381
    invoke-virtual {v12, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    add-int/lit8 v14, v14, 0x1

    .line 385
    .line 386
    goto :goto_c

    .line 387
    :cond_16
    new-instance v10, LX2/f;

    .line 388
    .line 389
    invoke-direct {v10, v11, v3, v13, v12}, LX2/f;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/Set;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v8, v10}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    goto/16 :goto_1

    .line 396
    .line 397
    :cond_17
    add-int/lit8 v11, v11, 0x1

    .line 398
    .line 399
    const/16 v10, 0x3b

    .line 400
    .line 401
    invoke-virtual {v1, v10, v11}, Ljava/lang/String;->indexOf(II)I

    .line 402
    .line 403
    .line 404
    move-result v10

    .line 405
    const/16 v13, 0x20

    .line 406
    .line 407
    invoke-virtual {v1, v13, v11}, Ljava/lang/String;->indexOf(II)I

    .line 408
    .line 409
    .line 410
    move-result v5

    .line 411
    if-ne v10, v4, :cond_18

    .line 412
    .line 413
    move v10, v5

    .line 414
    goto :goto_d

    .line 415
    :cond_18
    if-ne v5, v4, :cond_19

    .line 416
    .line 417
    goto :goto_d

    .line 418
    :cond_19
    invoke-static {v10, v5}, Ljava/lang/Math;->min(II)I

    .line 419
    .line 420
    .line 421
    move-result v10

    .line 422
    :goto_d
    if-eq v10, v4, :cond_1f

    .line 423
    .line 424
    invoke-virtual {v1, v11, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v11

    .line 428
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    .line 432
    .line 433
    .line 434
    move-result v12

    .line 435
    sparse-switch v12, :sswitch_data_1

    .line 436
    .line 437
    .line 438
    :goto_e
    move v12, v4

    .line 439
    goto :goto_f

    .line 440
    :sswitch_8
    const-string v12, "nbsp"

    .line 441
    .line 442
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    move-result v12

    .line 446
    if-nez v12, :cond_1a

    .line 447
    .line 448
    goto :goto_e

    .line 449
    :cond_1a
    const/4 v12, 0x3

    .line 450
    goto :goto_f

    .line 451
    :sswitch_9
    const-string v12, "amp"

    .line 452
    .line 453
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    move-result v12

    .line 457
    if-nez v12, :cond_1b

    .line 458
    .line 459
    goto :goto_e

    .line 460
    :cond_1b
    const/4 v12, 0x2

    .line 461
    goto :goto_f

    .line 462
    :sswitch_a
    const-string v12, "lt"

    .line 463
    .line 464
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    move-result v12

    .line 468
    if-nez v12, :cond_1c

    .line 469
    .line 470
    goto :goto_e

    .line 471
    :cond_1c
    move/from16 v12, v16

    .line 472
    .line 473
    goto :goto_f

    .line 474
    :sswitch_b
    const-string v12, "gt"

    .line 475
    .line 476
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v12

    .line 480
    if-nez v12, :cond_1d

    .line 481
    .line 482
    goto :goto_e

    .line 483
    :cond_1d
    const/4 v12, 0x0

    .line 484
    :goto_f
    packed-switch v12, :pswitch_data_1

    .line 485
    .line 486
    .line 487
    new-instance v3, Ljava/lang/StringBuilder;

    .line 488
    .line 489
    const-string v6, "ignoring unsupported entity: \'&"

    .line 490
    .line 491
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 495
    .line 496
    .line 497
    const-string v6, ";\'"

    .line 498
    .line 499
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v3

    .line 506
    const-string v6, "WebvttCueParser"

    .line 507
    .line 508
    invoke-static {v6, v3}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    goto :goto_10

    .line 512
    :pswitch_1
    invoke-virtual {v7, v13}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 513
    .line 514
    .line 515
    goto :goto_10

    .line 516
    :pswitch_2
    invoke-virtual {v7, v6}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 517
    .line 518
    .line 519
    goto :goto_10

    .line 520
    :pswitch_3
    invoke-virtual {v7, v3}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 521
    .line 522
    .line 523
    goto :goto_10

    .line 524
    :pswitch_4
    invoke-virtual {v7, v15}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 525
    .line 526
    .line 527
    :goto_10
    if-ne v10, v5, :cond_1e

    .line 528
    .line 529
    invoke-virtual {v7, v14}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 530
    .line 531
    .line 532
    :cond_1e
    add-int/lit8 v10, v10, 0x1

    .line 533
    .line 534
    move v11, v10

    .line 535
    goto :goto_11

    .line 536
    :cond_1f
    invoke-virtual {v7, v12}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 537
    .line 538
    .line 539
    :goto_11
    const/4 v5, 0x2

    .line 540
    goto/16 :goto_0

    .line 541
    .line 542
    :cond_20
    :goto_12
    invoke-virtual {v8}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 543
    .line 544
    .line 545
    move-result v1

    .line 546
    if-nez v1, :cond_21

    .line 547
    .line 548
    invoke-virtual {v8}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v1

    .line 552
    check-cast v1, LX2/f;

    .line 553
    .line 554
    invoke-static {v0, v1, v9, v7, v2}, LX2/i;->a(Ljava/lang/String;LX2/f;Ljava/util/List;Landroid/text/SpannableStringBuilder;Ljava/util/List;)V

    .line 555
    .line 556
    .line 557
    goto :goto_12

    .line 558
    :cond_21
    new-instance v1, LX2/f;

    .line 559
    .line 560
    sget-object v3, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 561
    .line 562
    const/4 v12, 0x0

    .line 563
    invoke-direct {v1, v13, v12, v13, v3}, LX2/f;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/Set;)V

    .line 564
    .line 565
    .line 566
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 567
    .line 568
    invoke-static {v0, v1, v3, v7, v2}, LX2/i;->a(Ljava/lang/String;LX2/f;Ljava/util/List;Landroid/text/SpannableStringBuilder;Ljava/util/List;)V

    .line 569
    .line 570
    .line 571
    invoke-static {v7}, Landroid/text/SpannedString;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannedString;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    return-object v0

    .line 576
    nop

    .line 577
    :sswitch_data_0
    .sparse-switch
        0x62 -> :sswitch_7
        0x63 -> :sswitch_6
        0x69 -> :sswitch_5
        0x75 -> :sswitch_4
        0x76 -> :sswitch_3
        0xe42 -> :sswitch_2
        0x3291ee -> :sswitch_1
        0x3595da -> :sswitch_0
    .end sparse-switch

    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    :sswitch_data_1
    .sparse-switch
        0xced -> :sswitch_b
        0xd88 -> :sswitch_a
        0x179c4 -> :sswitch_9
        0x337f11 -> :sswitch_8
    .end sparse-switch

    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static g(Ljava/lang/String;LX2/h;)V
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    const/16 v1, 0x2c

    .line 3
    .line 4
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, -0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eq v1, v2, :cond_4

    .line 12
    .line 13
    add-int/lit8 v5, v1, 0x1

    .line 14
    .line 15
    invoke-virtual {p0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    sparse-switch v6, :sswitch_data_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :sswitch_0
    const-string v6, "start"

    .line 31
    .line 32
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-nez v6, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v2, 0x3

    .line 40
    goto :goto_0

    .line 41
    :sswitch_1
    const-string v6, "end"

    .line 42
    .line 43
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-nez v6, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move v2, v0

    .line 51
    goto :goto_0

    .line 52
    :sswitch_2
    const-string v6, "middle"

    .line 53
    .line 54
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-nez v6, :cond_2

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move v2, v4

    .line 62
    goto :goto_0

    .line 63
    :sswitch_3
    const-string v6, "center"

    .line 64
    .line 65
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-nez v6, :cond_3

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    move v2, v3

    .line 73
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 74
    .line 75
    .line 76
    const-string v0, "Invalid anchor value: "

    .line 77
    .line 78
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const-string v2, "WebvttCueParser"

    .line 83
    .line 84
    invoke-static {v2, v0}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const/high16 v0, -0x80000000

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :pswitch_0
    move v0, v3

    .line 91
    goto :goto_1

    .line 92
    :pswitch_1
    move v0, v4

    .line 93
    :goto_1
    :pswitch_2
    iput v0, p1, LX2/h;->g:I

    .line 94
    .line 95
    invoke-virtual {p0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    :cond_4
    const-string v0, "%"

    .line 100
    .line 101
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_5

    .line 106
    .line 107
    invoke-static {p0}, LX2/k;->b(Ljava/lang/String;)F

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    iput p0, p1, LX2/h;->e:F

    .line 112
    .line 113
    iput v3, p1, LX2/h;->f:I

    .line 114
    .line 115
    return-void

    .line 116
    :cond_5
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    int-to-float p0, p0

    .line 121
    iput p0, p1, LX2/h;->e:F

    .line 122
    .line 123
    iput v4, p1, LX2/h;->f:I

    .line 124
    .line 125
    return-void

    .line 126
    nop

    .line 127
    :sswitch_data_0
    .sparse-switch
        -0x514d33ab -> :sswitch_3
        -0x4009266b -> :sswitch_2
        0x188db -> :sswitch_1
        0x68ac462 -> :sswitch_0
    .end sparse-switch

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method
