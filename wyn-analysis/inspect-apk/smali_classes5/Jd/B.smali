.class public final LJd/B;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final k:LJd/H;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Z

.field public c:I

.field public d:LJd/D;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/util/List;

.field public i:LJd/z;

.field public j:LS3/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "http://localhost"

    .line 2
    .line 3
    invoke-static {v0}, Lxg/g;->c(Ljava/lang/String;)LJd/H;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LJd/B;->k:LJd/H;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 14

    .line 1
    const/4 v0, 0x1

    .line 2
    sget-object v1, Lff/v;->a:Lff/v;

    .line 3
    .line 4
    sget-object v2, LJd/x;->b:LJd/l;

    .line 5
    .line 6
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v2, ""

    .line 13
    .line 14
    iput-object v2, p0, LJd/B;->a:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    iput-boolean v3, p0, LJd/B;->b:Z

    .line 18
    .line 19
    iput v3, p0, LJd/B;->c:I

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    iput-object v4, p0, LJd/B;->d:LJd/D;

    .line 23
    .line 24
    iput-object v4, p0, LJd/B;->e:Ljava/lang/String;

    .line 25
    .line 26
    iput-object v4, p0, LJd/B;->f:Ljava/lang/String;

    .line 27
    .line 28
    sget-object v4, LJd/b;->a:Ljava/util/Set;

    .line 29
    .line 30
    sget-object v4, LBf/a;->a:Ljava/nio/charset/Charset;

    .line 31
    .line 32
    const-string v5, "charset"

    .line 33
    .line 34
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    new-instance v5, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    const-string v6, "newEncoder(...)"

    .line 47
    .line 48
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v4, v2, v3, v3}, Lr7/e;->x(Ljava/nio/charset/CharsetEncoder;Ljava/lang/String;II)LPf/a;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    new-instance v4, LAf/r;

    .line 56
    .line 57
    const/4 v7, 0x7

    .line 58
    invoke-direct {v4, v5, v7}, LAf/r;-><init>(Ljava/lang/Object;I)V

    .line 59
    .line 60
    .line 61
    invoke-static {v2, v4}, LJd/b;->f(LPf/a;Ltf/l;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    iput-object v2, p0, LJd/B;->g:Ljava/lang/String;

    .line 69
    .line 70
    new-instance v2, Ljava/util/ArrayList;

    .line 71
    .line 72
    const/16 v4, 0xa

    .line 73
    .line 74
    invoke-static {v1, v4}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    const-string v8, "<this>"

    .line 90
    .line 91
    if-eqz v7, :cond_6

    .line 92
    .line 93
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    check-cast v7, Ljava/lang/String;

    .line 98
    .line 99
    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    new-instance v8, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    sget-object v9, LBf/a;->a:Ljava/nio/charset/Charset;

    .line 108
    .line 109
    move v10, v3

    .line 110
    :goto_1
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 111
    .line 112
    .line 113
    move-result v11

    .line 114
    if-ge v10, v11, :cond_5

    .line 115
    .line 116
    invoke-virtual {v7, v10}, Ljava/lang/String;->charAt(I)C

    .line 117
    .line 118
    .line 119
    move-result v11

    .line 120
    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 121
    .line 122
    .line 123
    move-result-object v12

    .line 124
    sget-object v13, LJd/b;->b:Ljava/util/Set;

    .line 125
    .line 126
    invoke-interface {v13, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v12

    .line 130
    if-nez v12, :cond_4

    .line 131
    .line 132
    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 133
    .line 134
    .line 135
    move-result-object v12

    .line 136
    sget-object v13, LJd/b;->d:Ljava/util/Set;

    .line 137
    .line 138
    invoke-interface {v13, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v12

    .line 142
    if-eqz v12, :cond_0

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_0
    const v12, 0xd800

    .line 146
    .line 147
    .line 148
    if-gt v12, v11, :cond_1

    .line 149
    .line 150
    const v12, 0xe000

    .line 151
    .line 152
    .line 153
    if-ge v11, v12, :cond_1

    .line 154
    .line 155
    const/4 v11, 0x2

    .line 156
    goto :goto_2

    .line 157
    :cond_1
    move v11, v0

    .line 158
    :goto_2
    invoke-virtual {v9}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    .line 159
    .line 160
    .line 161
    move-result-object v12

    .line 162
    invoke-static {v12, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    add-int/2addr v11, v10

    .line 166
    invoke-static {v12, v7, v10, v11}, Lr7/e;->x(Ljava/nio/charset/CharsetEncoder;Ljava/lang/String;II)LPf/a;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    :cond_2
    invoke-virtual {v10}, LPf/a;->exhausted()Z

    .line 171
    .line 172
    .line 173
    move-result v12

    .line 174
    if-nez v12, :cond_3

    .line 175
    .line 176
    :goto_3
    invoke-virtual {v10}, LPf/a;->exhausted()Z

    .line 177
    .line 178
    .line 179
    move-result v12

    .line 180
    if-nez v12, :cond_2

    .line 181
    .line 182
    invoke-virtual {v10}, LPf/a;->readByte()B

    .line 183
    .line 184
    .line 185
    move-result v12

    .line 186
    invoke-static {v12}, LJd/b;->g(B)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v12

    .line 190
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_3
    move v10, v11

    .line 195
    goto :goto_1

    .line 196
    :cond_4
    :goto_4
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    add-int/2addr v10, v0

    .line 200
    goto :goto_1

    .line 201
    :cond_5
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    goto :goto_0

    .line 209
    :cond_6
    iput-object v2, p0, LJd/B;->h:Ljava/util/List;

    .line 210
    .line 211
    new-instance v2, LJd/z;

    .line 212
    .line 213
    const/16 v5, 0x8

    .line 214
    .line 215
    invoke-direct {v2, v5}, LA7/B0;-><init>(I)V

    .line 216
    .line 217
    .line 218
    sget-object v5, Lff/x;->a:Lff/x;

    .line 219
    .line 220
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v6

    .line 228
    if-eqz v6, :cond_8

    .line 229
    .line 230
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v6

    .line 234
    check-cast v6, Ljava/lang/String;

    .line 235
    .line 236
    const-string v7, "name"

    .line 237
    .line 238
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-static {v6, v3}, LJd/b;->e(Ljava/lang/String;Z)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    new-instance v7, Ljava/util/ArrayList;

    .line 246
    .line 247
    invoke-static {v1, v4}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 248
    .line 249
    .line 250
    move-result v9

    .line 251
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 252
    .line 253
    .line 254
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 255
    .line 256
    .line 257
    move-result-object v9

    .line 258
    :goto_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 259
    .line 260
    .line 261
    move-result v10

    .line 262
    if-eqz v10, :cond_7

    .line 263
    .line 264
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v10

    .line 268
    check-cast v10, Ljava/lang/String;

    .line 269
    .line 270
    invoke-static {v10, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-static {v10, v0}, LJd/b;->e(Ljava/lang/String;Z)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v10

    .line 277
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    goto :goto_6

    .line 281
    :cond_7
    invoke-virtual {v2, v6, v7}, LA7/B0;->f(Ljava/lang/String;Ljava/lang/Iterable;)V

    .line 282
    .line 283
    .line 284
    goto :goto_5

    .line 285
    :cond_8
    iput-object v2, p0, LJd/B;->i:LJd/z;

    .line 286
    .line 287
    new-instance v0, LS3/l;

    .line 288
    .line 289
    invoke-direct {v0, v2}, LS3/l;-><init>(LJd/z;)V

    .line 290
    .line 291
    .line 292
    iput-object v0, p0, LJd/B;->j:LS3/l;

    .line 293
    .line 294
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, LJd/B;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0}, LJd/B;->c()LJd/D;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, LJd/D;->a:Ljava/lang/String;

    .line 15
    .line 16
    const-string v1, "file"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    sget-object v0, LJd/B;->k:LJd/H;

    .line 26
    .line 27
    iget-object v1, v0, LJd/H;->a:Ljava/lang/String;

    .line 28
    .line 29
    iput-object v1, p0, LJd/B;->a:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v1, p0, LJd/B;->d:LJd/D;

    .line 32
    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    iget-object v1, v0, LJd/H;->g:LJd/D;

    .line 36
    .line 37
    iput-object v1, p0, LJd/B;->d:LJd/D;

    .line 38
    .line 39
    :cond_2
    iget v1, p0, LJd/B;->c:I

    .line 40
    .line 41
    if-nez v1, :cond_3

    .line 42
    .line 43
    iget v0, v0, LJd/H;->b:I

    .line 44
    .line 45
    invoke-virtual {p0, v0}, LJd/B;->d(I)V

    .line 46
    .line 47
    .line 48
    :cond_3
    :goto_0
    return-void
.end method

.method public final b()LJd/H;
    .locals 12

    .line 1
    invoke-virtual {p0}, LJd/B;->a()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LJd/H;

    .line 5
    .line 6
    iget-object v1, p0, LJd/B;->d:LJd/D;

    .line 7
    .line 8
    iget-object v2, p0, LJd/B;->a:Ljava/lang/String;

    .line 9
    .line 10
    iget v3, p0, LJd/B;->c:I

    .line 11
    .line 12
    iget-object v4, p0, LJd/B;->h:Ljava/util/List;

    .line 13
    .line 14
    check-cast v4, Ljava/lang/Iterable;

    .line 15
    .line 16
    move-object v5, v4

    .line 17
    new-instance v4, Ljava/util/ArrayList;

    .line 18
    .line 19
    const/16 v6, 0xa

    .line 20
    .line 21
    invoke-static {v5, v6}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-eqz v6, :cond_0

    .line 37
    .line 38
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    check-cast v6, Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v6}, LJd/b;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iget-object v5, p0, LJd/B;->j:LS3/l;

    .line 53
    .line 54
    iget-object v5, v5, LS3/l;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v5, LJd/z;

    .line 57
    .line 58
    invoke-static {v5}, LA6/c;->p(LJd/y;)LJd/x;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    iget-object v6, p0, LJd/B;->g:Ljava/lang/String;

    .line 63
    .line 64
    const/16 v7, 0xf

    .line 65
    .line 66
    const/4 v8, 0x0

    .line 67
    invoke-static {v8, v8, v7, v6}, LJd/b;->d(IIILjava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    iget-object v7, p0, LJd/B;->e:Ljava/lang/String;

    .line 72
    .line 73
    const/4 v8, 0x0

    .line 74
    if-eqz v7, :cond_1

    .line 75
    .line 76
    invoke-static {v7}, LJd/b;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    goto :goto_1

    .line 81
    :cond_1
    move-object v7, v8

    .line 82
    :goto_1
    iget-object v9, p0, LJd/B;->f:Ljava/lang/String;

    .line 83
    .line 84
    if-eqz v9, :cond_2

    .line 85
    .line 86
    invoke-static {v9}, LJd/b;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    :cond_2
    iget-boolean v9, p0, LJd/B;->b:Z

    .line 91
    .line 92
    invoke-virtual {p0}, LJd/B;->a()V

    .line 93
    .line 94
    .line 95
    new-instance v10, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const/16 v11, 0x100

    .line 98
    .line 99
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 100
    .line 101
    .line 102
    invoke-static {p0, v10}, Lvf/a;->g(LJd/B;Ljava/lang/StringBuilder;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    const-string v11, "toString(...)"

    .line 110
    .line 111
    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-direct/range {v0 .. v10}, LJd/H;-><init>(LJd/D;Ljava/lang/String;ILjava/util/ArrayList;LJd/x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-object v0
.end method

.method public final c()LJd/D;
    .locals 1

    .line 1
    iget-object v0, p0, LJd/B;->d:LJd/D;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, LJd/D;->c:LJd/D;

    .line 6
    .line 7
    sget-object v0, LJd/D;->c:LJd/D;

    .line 8
    .line 9
    :cond_0
    return-object v0
.end method

.method public final d(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    const/high16 v0, 0x10000

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, LJd/B;->c:I

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string v0, "Port must be between 0 and 65535, or 0 if not set. Provided: "

    .line 11
    .line 12
    invoke-static {p1, v0}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x100

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0}, Lvf/a;->g(LJd/B;Ljava/lang/StringBuilder;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "toString(...)"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method
