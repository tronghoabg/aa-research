.class public abstract LU4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public a:I

.field public b:LE4/m;

.field public c:Lcom/bumptech/glide/d;

.field public d:I

.field public e:Z

.field public f:I

.field public g:I

.field public h:LB4/d;

.field public i:Z

.field public j:LB4/g;

.field public k:LY4/d;

.field public l:Ljava/lang/Class;

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LE4/m;->d:LE4/m;

    .line 5
    .line 6
    iput-object v0, p0, LU4/a;->b:LE4/m;

    .line 7
    .line 8
    sget-object v0, Lcom/bumptech/glide/d;->a:Lcom/bumptech/glide/d;

    .line 9
    .line 10
    iput-object v0, p0, LU4/a;->c:Lcom/bumptech/glide/d;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, LU4/a;->e:Z

    .line 14
    .line 15
    const/4 v1, -0x1

    .line 16
    iput v1, p0, LU4/a;->f:I

    .line 17
    .line 18
    iput v1, p0, LU4/a;->g:I

    .line 19
    .line 20
    sget-object v1, LX4/a;->b:LX4/a;

    .line 21
    .line 22
    iput-object v1, p0, LU4/a;->h:LB4/d;

    .line 23
    .line 24
    new-instance v1, LB4/g;

    .line 25
    .line 26
    invoke-direct {v1}, LB4/g;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, LU4/a;->j:LB4/g;

    .line 30
    .line 31
    new-instance v1, LY4/d;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-direct {v1, v2}, Lx/v;-><init>(I)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, LU4/a;->k:LY4/d;

    .line 38
    .line 39
    const-class v1, Ljava/lang/Object;

    .line 40
    .line 41
    iput-object v1, p0, LU4/a;->l:Ljava/lang/Class;

    .line 42
    .line 43
    iput-boolean v0, p0, LU4/a;->o:Z

    .line 44
    .line 45
    return-void
.end method

.method public static e(II)Z
    .locals 0

    .line 1
    and-int/2addr p0, p1

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    return p0

    .line 6
    :cond_0
    const/4 p0, 0x0

    .line 7
    return p0
.end method


# virtual methods
.method public a(LU4/a;)LU4/a;
    .locals 2

    .line 1
    iget-boolean v0, p0, LU4/a;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LU4/a;->b()LU4/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, LU4/a;->a(LU4/a;)LU4/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iget v0, p1, LU4/a;->a:I

    .line 15
    .line 16
    iget v0, p1, LU4/a;->a:I

    .line 17
    .line 18
    const/high16 v1, 0x100000

    .line 19
    .line 20
    invoke-static {v0, v1}, LU4/a;->e(II)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-boolean v0, p1, LU4/a;->p:Z

    .line 27
    .line 28
    iput-boolean v0, p0, LU4/a;->p:Z

    .line 29
    .line 30
    :cond_1
    iget v0, p1, LU4/a;->a:I

    .line 31
    .line 32
    const/4 v1, 0x4

    .line 33
    invoke-static {v0, v1}, LU4/a;->e(II)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget-object v0, p1, LU4/a;->b:LE4/m;

    .line 40
    .line 41
    iput-object v0, p0, LU4/a;->b:LE4/m;

    .line 42
    .line 43
    :cond_2
    iget v0, p1, LU4/a;->a:I

    .line 44
    .line 45
    const/16 v1, 0x8

    .line 46
    .line 47
    invoke-static {v0, v1}, LU4/a;->e(II)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    iget-object v0, p1, LU4/a;->c:Lcom/bumptech/glide/d;

    .line 54
    .line 55
    iput-object v0, p0, LU4/a;->c:Lcom/bumptech/glide/d;

    .line 56
    .line 57
    :cond_3
    iget v0, p1, LU4/a;->a:I

    .line 58
    .line 59
    const/16 v1, 0x10

    .line 60
    .line 61
    invoke-static {v0, v1}, LU4/a;->e(II)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_4

    .line 66
    .line 67
    iget v0, p0, LU4/a;->a:I

    .line 68
    .line 69
    and-int/lit8 v0, v0, -0x21

    .line 70
    .line 71
    iput v0, p0, LU4/a;->a:I

    .line 72
    .line 73
    :cond_4
    iget v0, p1, LU4/a;->a:I

    .line 74
    .line 75
    const/16 v1, 0x20

    .line 76
    .line 77
    invoke-static {v0, v1}, LU4/a;->e(II)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    iget v0, p0, LU4/a;->a:I

    .line 84
    .line 85
    and-int/lit8 v0, v0, -0x11

    .line 86
    .line 87
    iput v0, p0, LU4/a;->a:I

    .line 88
    .line 89
    :cond_5
    iget v0, p1, LU4/a;->a:I

    .line 90
    .line 91
    const/16 v1, 0x40

    .line 92
    .line 93
    invoke-static {v0, v1}, LU4/a;->e(II)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_6

    .line 98
    .line 99
    const/4 v0, 0x0

    .line 100
    iput v0, p0, LU4/a;->d:I

    .line 101
    .line 102
    iget v0, p0, LU4/a;->a:I

    .line 103
    .line 104
    and-int/lit16 v0, v0, -0x81

    .line 105
    .line 106
    iput v0, p0, LU4/a;->a:I

    .line 107
    .line 108
    :cond_6
    iget v0, p1, LU4/a;->a:I

    .line 109
    .line 110
    const/16 v1, 0x80

    .line 111
    .line 112
    invoke-static {v0, v1}, LU4/a;->e(II)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_7

    .line 117
    .line 118
    iget v0, p1, LU4/a;->d:I

    .line 119
    .line 120
    iput v0, p0, LU4/a;->d:I

    .line 121
    .line 122
    iget v0, p0, LU4/a;->a:I

    .line 123
    .line 124
    and-int/lit8 v0, v0, -0x41

    .line 125
    .line 126
    iput v0, p0, LU4/a;->a:I

    .line 127
    .line 128
    :cond_7
    iget v0, p1, LU4/a;->a:I

    .line 129
    .line 130
    const/16 v1, 0x100

    .line 131
    .line 132
    invoke-static {v0, v1}, LU4/a;->e(II)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_8

    .line 137
    .line 138
    iget-boolean v0, p1, LU4/a;->e:Z

    .line 139
    .line 140
    iput-boolean v0, p0, LU4/a;->e:Z

    .line 141
    .line 142
    :cond_8
    iget v0, p1, LU4/a;->a:I

    .line 143
    .line 144
    const/16 v1, 0x200

    .line 145
    .line 146
    invoke-static {v0, v1}, LU4/a;->e(II)Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-eqz v0, :cond_9

    .line 151
    .line 152
    iget v0, p1, LU4/a;->g:I

    .line 153
    .line 154
    iput v0, p0, LU4/a;->g:I

    .line 155
    .line 156
    iget v0, p1, LU4/a;->f:I

    .line 157
    .line 158
    iput v0, p0, LU4/a;->f:I

    .line 159
    .line 160
    :cond_9
    iget v0, p1, LU4/a;->a:I

    .line 161
    .line 162
    const/16 v1, 0x400

    .line 163
    .line 164
    invoke-static {v0, v1}, LU4/a;->e(II)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_a

    .line 169
    .line 170
    iget-object v0, p1, LU4/a;->h:LB4/d;

    .line 171
    .line 172
    iput-object v0, p0, LU4/a;->h:LB4/d;

    .line 173
    .line 174
    :cond_a
    iget v0, p1, LU4/a;->a:I

    .line 175
    .line 176
    const/16 v1, 0x1000

    .line 177
    .line 178
    invoke-static {v0, v1}, LU4/a;->e(II)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-eqz v0, :cond_b

    .line 183
    .line 184
    iget-object v0, p1, LU4/a;->l:Ljava/lang/Class;

    .line 185
    .line 186
    iput-object v0, p0, LU4/a;->l:Ljava/lang/Class;

    .line 187
    .line 188
    :cond_b
    iget v0, p1, LU4/a;->a:I

    .line 189
    .line 190
    const/16 v1, 0x2000

    .line 191
    .line 192
    invoke-static {v0, v1}, LU4/a;->e(II)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-eqz v0, :cond_c

    .line 197
    .line 198
    iget v0, p0, LU4/a;->a:I

    .line 199
    .line 200
    and-int/lit16 v0, v0, -0x4001

    .line 201
    .line 202
    iput v0, p0, LU4/a;->a:I

    .line 203
    .line 204
    :cond_c
    iget v0, p1, LU4/a;->a:I

    .line 205
    .line 206
    const/16 v1, 0x4000

    .line 207
    .line 208
    invoke-static {v0, v1}, LU4/a;->e(II)Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-eqz v0, :cond_d

    .line 213
    .line 214
    iget v0, p0, LU4/a;->a:I

    .line 215
    .line 216
    and-int/lit16 v0, v0, -0x2001

    .line 217
    .line 218
    iput v0, p0, LU4/a;->a:I

    .line 219
    .line 220
    :cond_d
    iget v0, p1, LU4/a;->a:I

    .line 221
    .line 222
    const/high16 v1, 0x20000

    .line 223
    .line 224
    invoke-static {v0, v1}, LU4/a;->e(II)Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-eqz v0, :cond_e

    .line 229
    .line 230
    iget-boolean v0, p1, LU4/a;->i:Z

    .line 231
    .line 232
    iput-boolean v0, p0, LU4/a;->i:Z

    .line 233
    .line 234
    :cond_e
    iget v0, p1, LU4/a;->a:I

    .line 235
    .line 236
    const/16 v1, 0x800

    .line 237
    .line 238
    invoke-static {v0, v1}, LU4/a;->e(II)Z

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    if-eqz v0, :cond_f

    .line 243
    .line 244
    iget-object v0, p0, LU4/a;->k:LY4/d;

    .line 245
    .line 246
    iget-object v1, p1, LU4/a;->k:LY4/d;

    .line 247
    .line 248
    invoke-virtual {v0, v1}, Lx/e;->putAll(Ljava/util/Map;)V

    .line 249
    .line 250
    .line 251
    iget-boolean v0, p1, LU4/a;->o:Z

    .line 252
    .line 253
    iput-boolean v0, p0, LU4/a;->o:Z

    .line 254
    .line 255
    :cond_f
    iget v0, p0, LU4/a;->a:I

    .line 256
    .line 257
    iget v1, p1, LU4/a;->a:I

    .line 258
    .line 259
    or-int/2addr v0, v1

    .line 260
    iput v0, p0, LU4/a;->a:I

    .line 261
    .line 262
    iget-object v0, p0, LU4/a;->j:LB4/g;

    .line 263
    .line 264
    iget-object p1, p1, LU4/a;->j:LB4/g;

    .line 265
    .line 266
    iget-object v0, v0, LB4/g;->b:LY4/d;

    .line 267
    .line 268
    iget-object p1, p1, LB4/g;->b:LY4/d;

    .line 269
    .line 270
    invoke-virtual {v0, p1}, LY4/d;->h(Lx/v;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0}, LU4/a;->j()V

    .line 274
    .line 275
    .line 276
    return-object p0
.end method

.method public b()LU4/a;
    .locals 4

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LU4/a;

    .line 6
    .line 7
    new-instance v1, LB4/g;

    .line 8
    .line 9
    invoke-direct {v1}, LB4/g;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, v0, LU4/a;->j:LB4/g;

    .line 13
    .line 14
    iget-object v2, p0, LU4/a;->j:LB4/g;

    .line 15
    .line 16
    iget-object v1, v1, LB4/g;->b:LY4/d;

    .line 17
    .line 18
    iget-object v2, v2, LB4/g;->b:LY4/d;

    .line 19
    .line 20
    invoke-virtual {v1, v2}, LY4/d;->h(Lx/v;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, LY4/d;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v1, v2}, Lx/v;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iput-object v1, v0, LU4/a;->k:LY4/d;

    .line 30
    .line 31
    iget-object v3, p0, LU4/a;->k:LY4/d;

    .line 32
    .line 33
    invoke-virtual {v1, v3}, Lx/e;->putAll(Ljava/util/Map;)V

    .line 34
    .line 35
    .line 36
    iput-boolean v2, v0, LU4/a;->m:Z

    .line 37
    .line 38
    iput-boolean v2, v0, LU4/a;->n:Z
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    return-object v0

    .line 41
    :catch_0
    move-exception v0

    .line 42
    new-instance v1, Ljava/lang/RuntimeException;

    .line 43
    .line 44
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    throw v1
.end method

.method public final c(Ljava/lang/Class;)LU4/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, LU4/a;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LU4/a;->b()LU4/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, LU4/a;->c(Ljava/lang/Class;)LU4/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iput-object p1, p0, LU4/a;->l:Ljava/lang/Class;

    .line 15
    .line 16
    iget p1, p0, LU4/a;->a:I

    .line 17
    .line 18
    or-int/lit16 p1, p1, 0x1000

    .line 19
    .line 20
    iput p1, p0, LU4/a;->a:I

    .line 21
    .line 22
    invoke-virtual {p0}, LU4/a;->j()V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LU4/a;->b()LU4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final d(LE4/m;)LU4/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, LU4/a;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LU4/a;->b()LU4/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, LU4/a;->d(LE4/m;)LU4/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iput-object p1, p0, LU4/a;->b:LE4/m;

    .line 15
    .line 16
    iget p1, p0, LU4/a;->a:I

    .line 17
    .line 18
    or-int/lit8 p1, p1, 0x4

    .line 19
    .line 20
    iput p1, p0, LU4/a;->a:I

    .line 21
    .line 22
    invoke-virtual {p0}, LU4/a;->j()V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, LU4/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LU4/a;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/high16 v0, 0x3f800000    # 1.0f

    .line 11
    .line 12
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    sget-object v0, LY4/m;->a:[C

    .line 19
    .line 20
    iget v0, p0, LU4/a;->d:I

    .line 21
    .line 22
    iget v1, p1, LU4/a;->d:I

    .line 23
    .line 24
    if-ne v0, v1, :cond_0

    .line 25
    .line 26
    iget-boolean v0, p0, LU4/a;->e:Z

    .line 27
    .line 28
    iget-boolean v1, p1, LU4/a;->e:Z

    .line 29
    .line 30
    if-ne v0, v1, :cond_0

    .line 31
    .line 32
    iget v0, p0, LU4/a;->f:I

    .line 33
    .line 34
    iget v1, p1, LU4/a;->f:I

    .line 35
    .line 36
    if-ne v0, v1, :cond_0

    .line 37
    .line 38
    iget v0, p0, LU4/a;->g:I

    .line 39
    .line 40
    iget v1, p1, LU4/a;->g:I

    .line 41
    .line 42
    if-ne v0, v1, :cond_0

    .line 43
    .line 44
    iget-boolean v0, p0, LU4/a;->i:Z

    .line 45
    .line 46
    iget-boolean v1, p1, LU4/a;->i:Z

    .line 47
    .line 48
    if-ne v0, v1, :cond_0

    .line 49
    .line 50
    iget-object v0, p0, LU4/a;->b:LE4/m;

    .line 51
    .line 52
    iget-object v1, p1, LU4/a;->b:LE4/m;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    iget-object v0, p0, LU4/a;->c:Lcom/bumptech/glide/d;

    .line 61
    .line 62
    iget-object v1, p1, LU4/a;->c:Lcom/bumptech/glide/d;

    .line 63
    .line 64
    if-ne v0, v1, :cond_0

    .line 65
    .line 66
    iget-object v0, p0, LU4/a;->j:LB4/g;

    .line 67
    .line 68
    iget-object v1, p1, LU4/a;->j:LB4/g;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, LB4/g;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_0

    .line 75
    .line 76
    iget-object v0, p0, LU4/a;->k:LY4/d;

    .line 77
    .line 78
    iget-object v1, p1, LU4/a;->k:LY4/d;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lx/v;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_0

    .line 85
    .line 86
    iget-object v0, p0, LU4/a;->l:Ljava/lang/Class;

    .line 87
    .line 88
    iget-object v1, p1, LU4/a;->l:Ljava/lang/Class;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_0

    .line 95
    .line 96
    iget-object v0, p0, LU4/a;->h:LB4/d;

    .line 97
    .line 98
    iget-object p1, p1, LU4/a;->h:LB4/d;

    .line 99
    .line 100
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_0

    .line 105
    .line 106
    const/4 p1, 0x1

    .line 107
    return p1

    .line 108
    :cond_0
    const/4 p1, 0x0

    .line 109
    return p1
.end method

.method public final f(II)LU4/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, LU4/a;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LU4/a;->b()LU4/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2}, LU4/a;->f(II)LU4/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iput p1, p0, LU4/a;->g:I

    .line 15
    .line 16
    iput p2, p0, LU4/a;->f:I

    .line 17
    .line 18
    iget p1, p0, LU4/a;->a:I

    .line 19
    .line 20
    or-int/lit16 p1, p1, 0x200

    .line 21
    .line 22
    iput p1, p0, LU4/a;->a:I

    .line 23
    .line 24
    invoke-virtual {p0}, LU4/a;->j()V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public final g()LU4/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, LU4/a;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LU4/a;->b()LU4/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, LU4/a;->g()LU4/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const v0, 0x7f080154

    .line 15
    .line 16
    .line 17
    iput v0, p0, LU4/a;->d:I

    .line 18
    .line 19
    iget v0, p0, LU4/a;->a:I

    .line 20
    .line 21
    or-int/lit16 v0, v0, 0x80

    .line 22
    .line 23
    and-int/lit8 v0, v0, -0x41

    .line 24
    .line 25
    iput v0, p0, LU4/a;->a:I

    .line 26
    .line 27
    invoke-virtual {p0}, LU4/a;->j()V

    .line 28
    .line 29
    .line 30
    return-object p0
.end method

.method public final h()LU4/a;
    .locals 2

    .line 1
    sget-object v0, Lcom/bumptech/glide/d;->b:Lcom/bumptech/glide/d;

    .line 2
    .line 3
    iget-boolean v1, p0, LU4/a;->n:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, LU4/a;->b()LU4/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, LU4/a;->h()LU4/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    iput-object v0, p0, LU4/a;->c:Lcom/bumptech/glide/d;

    .line 17
    .line 18
    iget v0, p0, LU4/a;->a:I

    .line 19
    .line 20
    or-int/lit8 v0, v0, 0x8

    .line 21
    .line 22
    iput v0, p0, LU4/a;->a:I

    .line 23
    .line 24
    invoke-virtual {p0}, LU4/a;->j()V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    sget-object v0, LY4/m;->a:[C

    .line 2
    .line 3
    const/high16 v0, 0x3f800000    # 1.0f

    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x11

    .line 10
    .line 11
    invoke-static {v0, v1}, LY4/m;->e(II)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {v1, v0}, LY4/m;->e(II)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static {v0, v2}, LY4/m;->f(ILjava/lang/Object;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iget v3, p0, LU4/a;->d:I

    .line 26
    .line 27
    invoke-static {v3, v0}, LY4/m;->e(II)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-static {v0, v2}, LY4/m;->f(ILjava/lang/Object;)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-static {v1, v0}, LY4/m;->e(II)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-static {v0, v2}, LY4/m;->f(ILjava/lang/Object;)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iget-boolean v3, p0, LU4/a;->e:Z

    .line 44
    .line 45
    invoke-static {v3, v0}, LY4/m;->e(II)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget v3, p0, LU4/a;->f:I

    .line 50
    .line 51
    invoke-static {v3, v0}, LY4/m;->e(II)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iget v3, p0, LU4/a;->g:I

    .line 56
    .line 57
    invoke-static {v3, v0}, LY4/m;->e(II)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget-boolean v3, p0, LU4/a;->i:Z

    .line 62
    .line 63
    invoke-static {v3, v0}, LY4/m;->e(II)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    const/4 v3, 0x1

    .line 68
    invoke-static {v3, v0}, LY4/m;->e(II)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-static {v1, v0}, LY4/m;->e(II)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    invoke-static {v1, v0}, LY4/m;->e(II)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iget-object v1, p0, LU4/a;->b:LE4/m;

    .line 81
    .line 82
    invoke-static {v0, v1}, LY4/m;->f(ILjava/lang/Object;)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget-object v1, p0, LU4/a;->c:Lcom/bumptech/glide/d;

    .line 87
    .line 88
    invoke-static {v0, v1}, LY4/m;->f(ILjava/lang/Object;)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iget-object v1, p0, LU4/a;->j:LB4/g;

    .line 93
    .line 94
    invoke-static {v0, v1}, LY4/m;->f(ILjava/lang/Object;)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    iget-object v1, p0, LU4/a;->k:LY4/d;

    .line 99
    .line 100
    invoke-static {v0, v1}, LY4/m;->f(ILjava/lang/Object;)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    iget-object v1, p0, LU4/a;->l:Ljava/lang/Class;

    .line 105
    .line 106
    invoke-static {v0, v1}, LY4/m;->f(ILjava/lang/Object;)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    iget-object v1, p0, LU4/a;->h:LB4/d;

    .line 111
    .line 112
    invoke-static {v0, v1}, LY4/m;->f(ILjava/lang/Object;)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    invoke-static {v0, v2}, LY4/m;->f(ILjava/lang/Object;)I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    return v0
.end method

.method public final j()V
    .locals 2

    .line 1
    iget-boolean v0, p0, LU4/a;->m:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "You cannot modify locked T, consider clone()"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final k(LB4/f;)LU4/a;
    .locals 2

    .line 1
    sget-object v0, LB4/a;->a:LB4/a;

    .line 2
    .line 3
    iget-boolean v1, p0, LU4/a;->n:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, LU4/a;->b()LU4/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p1}, LU4/a;->k(LB4/f;)LU4/a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    invoke-static {p1}, Lgc/b;->j(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, LU4/a;->j:LB4/g;

    .line 20
    .line 21
    iget-object v1, v1, LB4/g;->b:LY4/d;

    .line 22
    .line 23
    invoke-virtual {v1, p1, v0}, LY4/d;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, LU4/a;->j()V

    .line 27
    .line 28
    .line 29
    return-object p0
.end method

.method public final l(LX4/b;)LU4/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, LU4/a;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LU4/a;->b()LU4/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, LU4/a;->l(LX4/b;)LU4/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iput-object p1, p0, LU4/a;->h:LB4/d;

    .line 15
    .line 16
    iget p1, p0, LU4/a;->a:I

    .line 17
    .line 18
    or-int/lit16 p1, p1, 0x400

    .line 19
    .line 20
    iput p1, p0, LU4/a;->a:I

    .line 21
    .line 22
    invoke-virtual {p0}, LU4/a;->j()V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method

.method public final m()LU4/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, LU4/a;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LU4/a;->b()LU4/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, LU4/a;->m()LU4/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, LU4/a;->e:Z

    .line 16
    .line 17
    iget v0, p0, LU4/a;->a:I

    .line 18
    .line 19
    or-int/lit16 v0, v0, 0x100

    .line 20
    .line 21
    iput v0, p0, LU4/a;->a:I

    .line 22
    .line 23
    invoke-virtual {p0}, LU4/a;->j()V

    .line 24
    .line 25
    .line 26
    return-object p0
.end method

.method public final n(LK4/a;)LU4/a;
    .locals 2

    .line 1
    iget-boolean v0, p0, LU4/a;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LU4/a;->b()LU4/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, LU4/a;->n(LK4/a;)LU4/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    new-instance v0, LL4/p;

    .line 15
    .line 16
    invoke-direct {v0, p1}, LL4/p;-><init>(LK4/a;)V

    .line 17
    .line 18
    .line 19
    const-class v1, Landroid/graphics/Bitmap;

    .line 20
    .line 21
    invoke-virtual {p0, v1, p1}, LU4/a;->o(Ljava/lang/Class;LB4/k;)LU4/a;

    .line 22
    .line 23
    .line 24
    const-class v1, Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    invoke-virtual {p0, v1, v0}, LU4/a;->o(Ljava/lang/Class;LB4/k;)LU4/a;

    .line 27
    .line 28
    .line 29
    const-class v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 30
    .line 31
    invoke-virtual {p0, v1, v0}, LU4/a;->o(Ljava/lang/Class;LB4/k;)LU4/a;

    .line 32
    .line 33
    .line 34
    new-instance v0, LP4/d;

    .line 35
    .line 36
    invoke-direct {v0, p1}, LP4/d;-><init>(LK4/a;)V

    .line 37
    .line 38
    .line 39
    const-class p1, LP4/c;

    .line 40
    .line 41
    invoke-virtual {p0, p1, v0}, LU4/a;->o(Ljava/lang/Class;LB4/k;)LU4/a;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, LU4/a;->j()V

    .line 45
    .line 46
    .line 47
    return-object p0
.end method

.method public final o(Ljava/lang/Class;LB4/k;)LU4/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, LU4/a;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LU4/a;->b()LU4/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2}, LU4/a;->o(Ljava/lang/Class;LB4/k;)LU4/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-static {p2}, Lgc/b;->j(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, LU4/a;->k:LY4/d;

    .line 18
    .line 19
    invoke-virtual {v0, p1, p2}, LY4/d;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    iget p1, p0, LU4/a;->a:I

    .line 23
    .line 24
    const/4 p2, 0x0

    .line 25
    iput-boolean p2, p0, LU4/a;->o:Z

    .line 26
    .line 27
    const p2, 0x30800

    .line 28
    .line 29
    .line 30
    or-int/2addr p1, p2

    .line 31
    iput p1, p0, LU4/a;->a:I

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, LU4/a;->i:Z

    .line 35
    .line 36
    invoke-virtual {p0}, LU4/a;->j()V

    .line 37
    .line 38
    .line 39
    return-object p0
.end method

.method public final p()LU4/a;
    .locals 2

    .line 1
    iget-boolean v0, p0, LU4/a;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LU4/a;->b()LU4/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, LU4/a;->p()LU4/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, LU4/a;->p:Z

    .line 16
    .line 17
    iget v0, p0, LU4/a;->a:I

    .line 18
    .line 19
    const/high16 v1, 0x100000

    .line 20
    .line 21
    or-int/2addr v0, v1

    .line 22
    iput v0, p0, LU4/a;->a:I

    .line 23
    .line 24
    invoke-virtual {p0}, LU4/a;->j()V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method
