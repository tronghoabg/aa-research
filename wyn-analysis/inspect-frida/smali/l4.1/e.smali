.class public final Ll4/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:I

.field public B:I

.field public C:Ljava/lang/CharSequence;

.field public D:Lhc/a;

.field public E:I

.field public final a:Landroid/content/Context;

.field public b:Ljava/lang/CharSequence;

.field public final c:Ll4/d;

.field public final d:Ll4/d;

.field public final e:Ll4/d;

.field public final f:Ll4/d;

.field public final g:Ll4/d;

.field public final h:I

.field public i:I

.field public j:I

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:Landroid/view/View;

.field public n:I

.field public o:Landroid/content/res/ColorStateList;

.field public p:Landroid/content/res/ColorStateList;

.field public q:Landroid/content/res/ColorStateList;

.field public final r:Landroid/content/res/ColorStateList;

.field public s:La2/v;

.field public t:Lcom/google/android/gms/ads/nativead/l;

.field public u:I

.field public v:Landroid/graphics/Typeface;

.field public w:Landroid/graphics/Typeface;

.field public x:Landroid/graphics/drawable/Drawable;

.field public y:Ll4/b;

.field public z:Landroidx/recyclerview/widget/LinearLayoutManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ll4/d;->a:Ll4/d;

    .line 5
    .line 6
    iput-object v0, p0, Ll4/e;->c:Ll4/d;

    .line 7
    .line 8
    iput-object v0, p0, Ll4/e;->d:Ll4/d;

    .line 9
    .line 10
    sget-object v1, Ll4/d;->c:Ll4/d;

    .line 11
    .line 12
    iput-object v1, p0, Ll4/e;->e:Ll4/d;

    .line 13
    .line 14
    iput-object v0, p0, Ll4/e;->f:Ll4/d;

    .line 15
    .line 16
    iput-object v0, p0, Ll4/e;->g:Ll4/d;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    iput v2, p0, Ll4/e;->h:I

    .line 20
    .line 21
    const/4 v3, -0x1

    .line 22
    iput v3, p0, Ll4/e;->i:I

    .line 23
    .line 24
    iput v3, p0, Ll4/e;->j:I

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    iput v4, p0, Ll4/e;->E:I

    .line 28
    .line 29
    iput v3, p0, Ll4/e;->u:I

    .line 30
    .line 31
    iput-object p1, p0, Ll4/e;->a:Landroid/content/Context;

    .line 32
    .line 33
    const v3, 0x7f0602d2

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v3}, LY0/e;->getColor(Landroid/content/Context;I)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    const v5, 0x7f040103

    .line 41
    .line 42
    .line 43
    invoke-static {p1, v5, v3}, Lvf/a;->D(Landroid/content/Context;II)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    iput v3, p0, Ll4/e;->n:I

    .line 48
    .line 49
    const v5, 0x1010435

    .line 50
    .line 51
    .line 52
    invoke-static {p1, v5, v3}, Lvf/a;->D(Landroid/content/Context;II)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    iput v3, p0, Ll4/e;->n:I

    .line 57
    .line 58
    invoke-static {p1, v3}, Lvf/a;->t(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    iput-object v3, p0, Ll4/e;->o:Landroid/content/res/ColorStateList;

    .line 63
    .line 64
    iget v3, p0, Ll4/e;->n:I

    .line 65
    .line 66
    invoke-static {p1, v3}, Lvf/a;->t(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    iput-object v3, p0, Ll4/e;->p:Landroid/content/res/ColorStateList;

    .line 71
    .line 72
    iget v3, p0, Ll4/e;->n:I

    .line 73
    .line 74
    invoke-static {p1, v3}, Lvf/a;->t(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    iput-object v3, p0, Ll4/e;->q:Landroid/content/res/ColorStateList;

    .line 79
    .line 80
    const v3, 0x7f040346

    .line 81
    .line 82
    .line 83
    iget v5, p0, Ll4/e;->n:I

    .line 84
    .line 85
    invoke-static {p1, v3, v5}, Lvf/a;->D(Landroid/content/Context;II)I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    invoke-static {p1, v3}, Lvf/a;->t(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    iput-object v3, p0, Ll4/e;->r:Landroid/content/res/ColorStateList;

    .line 94
    .line 95
    const v3, 0x101042c

    .line 96
    .line 97
    .line 98
    invoke-static {p1, v3, v2}, Lvf/a;->D(Landroid/content/Context;II)I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    const v5, 0x7f040108

    .line 103
    .line 104
    .line 105
    invoke-static {p1, v5, v3}, Lvf/a;->D(Landroid/content/Context;II)I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    const v5, 0x7f040338

    .line 110
    .line 111
    .line 112
    invoke-static {p1, v5, v3}, Lvf/a;->D(Landroid/content/Context;II)I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    iput v3, p0, Ll4/e;->h:I

    .line 117
    .line 118
    invoke-static {}, Ljava/text/NumberFormat;->getPercentInstance()Ljava/text/NumberFormat;

    .line 119
    .line 120
    .line 121
    const v3, 0x1010036

    .line 122
    .line 123
    .line 124
    invoke-static {p1, v3, v2}, Lvf/a;->D(Landroid/content/Context;II)I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    invoke-static {v3}, Lvf/a;->y(I)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eqz v3, :cond_0

    .line 133
    .line 134
    move v3, v4

    .line 135
    goto :goto_0

    .line 136
    :cond_0
    const/4 v3, 0x2

    .line 137
    :goto_0
    iput v3, p0, Ll4/e;->E:I

    .line 138
    .line 139
    invoke-static {v2}, La9/b;->i(Z)La9/b;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    if-nez v3, :cond_1

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_1
    invoke-static {v4}, La9/b;->i(Z)La9/b;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    iput-object v0, p0, Ll4/e;->c:Ll4/d;

    .line 154
    .line 155
    iput-object v0, p0, Ll4/e;->d:Ll4/d;

    .line 156
    .line 157
    iput-object v1, p0, Ll4/e;->e:Ll4/d;

    .line 158
    .line 159
    iput-object v0, p0, Ll4/e;->f:Ll4/d;

    .line 160
    .line 161
    iput-object v0, p0, Ll4/e;->g:Ll4/d;

    .line 162
    .line 163
    :goto_1
    const v0, 0x7f04034f

    .line 164
    .line 165
    .line 166
    iget-object v1, p0, Ll4/e;->c:Ll4/d;

    .line 167
    .line 168
    invoke-static {p1, v0, v1}, Lvf/a;->F(Landroid/content/Context;ILl4/d;)Ll4/d;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    iput-object v0, p0, Ll4/e;->c:Ll4/d;

    .line 173
    .line 174
    const v0, 0x7f04033d

    .line 175
    .line 176
    .line 177
    iget-object v1, p0, Ll4/e;->d:Ll4/d;

    .line 178
    .line 179
    invoke-static {p1, v0, v1}, Lvf/a;->F(Landroid/content/Context;ILl4/d;)Ll4/d;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    iput-object v0, p0, Ll4/e;->d:Ll4/d;

    .line 184
    .line 185
    const v0, 0x7f04033a

    .line 186
    .line 187
    .line 188
    iget-object v1, p0, Ll4/e;->e:Ll4/d;

    .line 189
    .line 190
    invoke-static {p1, v0, v1}, Lvf/a;->F(Landroid/content/Context;ILl4/d;)Ll4/d;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    iput-object v0, p0, Ll4/e;->e:Ll4/d;

    .line 195
    .line 196
    const v0, 0x7f040345

    .line 197
    .line 198
    .line 199
    iget-object v1, p0, Ll4/e;->f:Ll4/d;

    .line 200
    .line 201
    invoke-static {p1, v0, v1}, Lvf/a;->F(Landroid/content/Context;ILl4/d;)Ll4/d;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    iput-object v0, p0, Ll4/e;->f:Ll4/d;

    .line 206
    .line 207
    const v0, 0x7f04033b

    .line 208
    .line 209
    .line 210
    iget-object v1, p0, Ll4/e;->g:Ll4/d;

    .line 211
    .line 212
    invoke-static {p1, v0, v1}, Lvf/a;->F(Landroid/content/Context;ILl4/d;)Ll4/d;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    iput-object v0, p0, Ll4/e;->g:Ll4/d;

    .line 217
    .line 218
    new-instance v0, Landroid/util/TypedValue;

    .line 219
    .line 220
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    const v3, 0x7f040348

    .line 228
    .line 229
    .line 230
    invoke-virtual {v1, v3, v0, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 231
    .line 232
    .line 233
    iget-object v0, v0, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 234
    .line 235
    check-cast v0, Ljava/lang/String;

    .line 236
    .line 237
    new-instance v1, Landroid/util/TypedValue;

    .line 238
    .line 239
    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    const v3, 0x7f04034d

    .line 247
    .line 248
    .line 249
    invoke-virtual {p1, v3, v1, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 250
    .line 251
    .line 252
    iget-object p1, v1, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 253
    .line 254
    check-cast p1, Ljava/lang/String;

    .line 255
    .line 256
    :try_start_0
    invoke-virtual {p0, v0, p1}, Ll4/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 257
    .line 258
    .line 259
    :catchall_0
    iget-object p1, p0, Ll4/e;->w:Landroid/graphics/Typeface;

    .line 260
    .line 261
    if-nez p1, :cond_2

    .line 262
    .line 263
    :try_start_1
    const-string p1, "sans-serif-medium"

    .line 264
    .line 265
    invoke-static {p1, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    iput-object p1, p0, Ll4/e;->w:Landroid/graphics/Typeface;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 270
    .line 271
    goto :goto_2

    .line 272
    :catchall_1
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 273
    .line 274
    iput-object p1, p0, Ll4/e;->w:Landroid/graphics/Typeface;

    .line 275
    .line 276
    :cond_2
    :goto_2
    iget-object p1, p0, Ll4/e;->v:Landroid/graphics/Typeface;

    .line 277
    .line 278
    if-nez p1, :cond_3

    .line 279
    .line 280
    :try_start_2
    const-string p1, "sans-serif"

    .line 281
    .line 282
    invoke-static {p1, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    iput-object p1, p0, Ll4/e;->v:Landroid/graphics/Typeface;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 287
    .line 288
    goto :goto_3

    .line 289
    :catchall_2
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 290
    .line 291
    iput-object p1, p0, Ll4/e;->v:Landroid/graphics/Typeface;

    .line 292
    .line 293
    if-nez p1, :cond_3

    .line 294
    .line 295
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 296
    .line 297
    iput-object p1, p0, Ll4/e;->v:Landroid/graphics/Typeface;

    .line 298
    .line 299
    :cond_3
    :goto_3
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "\""

    .line 2
    .line 3
    const-string v1, "No font asset found for \""

    .line 4
    .line 5
    iget-object v2, p0, Ll4/e;->a:Landroid/content/Context;

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    invoke-static {v2, p1}, Ln4/a;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iput-object v3, p0, Ll4/e;->w:Landroid/graphics/Typeface;

    .line 24
    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 29
    .line 30
    invoke-static {v1, p1, v0}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p2

    .line 38
    :cond_1
    :goto_0
    if-eqz p2, :cond_3

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-nez p1, :cond_3

    .line 49
    .line 50
    invoke-static {v2, p2}, Ln4/a;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iput-object p1, p0, Ll4/e;->v:Landroid/graphics/Typeface;

    .line 55
    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 60
    .line 61
    invoke-static {v1, p2, v0}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_3
    :goto_1
    return-void
.end method
