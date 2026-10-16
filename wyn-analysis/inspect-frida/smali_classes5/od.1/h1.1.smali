.class public final Lod/h1;
.super Lmd/O;
.source "SourceFile"


# static fields
.field public static final o:Ljava/util/logging/Logger;


# instance fields
.field public final f:Lmd/y;

.field public final g:Ljava/util/HashMap;

.field public h:Lod/l0;

.field public i:I

.field public j:Z

.field public k:Lba/a;

.field public l:Lmd/m;

.field public m:Lmd/m;

.field public final n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lod/h1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lod/h1;->o:Ljava/util/logging/Logger;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lmd/y;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lod/h1;->g:Ljava/util/HashMap;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lod/h1;->i:I

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iput-boolean v1, p0, Lod/h1;->j:Z

    .line 16
    .line 17
    sget-object v2, Lmd/m;->d:Lmd/m;

    .line 18
    .line 19
    iput-object v2, p0, Lod/h1;->l:Lmd/m;

    .line 20
    .line 21
    iput-object v2, p0, Lod/h1;->m:Lmd/m;

    .line 22
    .line 23
    sget-object v2, Lod/a0;->a:Ljava/util/logging/Logger;

    .line 24
    .line 25
    const-string v2, "GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS"

    .line 26
    .line 27
    invoke-static {v2}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    :cond_0
    invoke-static {v3}, LFe/c;->D(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    invoke-static {v3}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    move v0, v1

    .line 50
    :cond_1
    iput-boolean v0, p0, Lod/h1;->n:Z

    .line 51
    .line 52
    iput-object p1, p0, Lod/h1;->f:Lmd/y;

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final a(Lmd/L;)Lmd/k0;
    .locals 6

    .line 1
    iget-object v0, p0, Lod/h1;->l:Lmd/m;

    .line 2
    .line 3
    sget-object v1, Lmd/m;->e:Lmd/m;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    sget-object p1, Lmd/k0;->l:Lmd/k0;

    .line 8
    .line 9
    const-string v0, "Already shut down"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    iget-object v0, p1, Lmd/L;->a:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const-string v2, ", attrs="

    .line 23
    .line 24
    iget-object p1, p1, Lmd/L;->b:Lmd/b;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    sget-object v1, Lmd/k0;->n:Lmd/k0;

    .line 29
    .line 30
    new-instance v3, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v4, "NameResolver returned no usable address. addrs="

    .line 33
    .line 34
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {v1, p1}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p0, p1}, Lod/h1;->c(Lmd/k0;)V

    .line 55
    .line 56
    .line 57
    return-object p1

    .line 58
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_3

    .line 67
    .line 68
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    check-cast v3, Lmd/u;

    .line 73
    .line 74
    if-nez v3, :cond_2

    .line 75
    .line 76
    sget-object v1, Lmd/k0;->n:Lmd/k0;

    .line 77
    .line 78
    new-instance v3, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    const-string v4, "NameResolver returned address list with null endpoint. addrs="

    .line 81
    .line 82
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {v1, p1}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p0, p1}, Lod/h1;->c(Lmd/k0;)V

    .line 103
    .line 104
    .line 105
    return-object p1

    .line 106
    :cond_3
    const/4 p1, 0x1

    .line 107
    iput-boolean p1, p0, Lod/h1;->j:Z

    .line 108
    .line 109
    invoke-static {}, Ll8/K;->i()Ll8/H;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p1, v0}, Ll8/E;->d(Ljava/lang/Iterable;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1}, Ll8/H;->g()Ll8/e0;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    iget-object v0, p0, Lod/h1;->h:Lod/l0;

    .line 121
    .line 122
    sget-object v1, Lmd/m;->b:Lmd/m;

    .line 123
    .line 124
    const/4 v2, 0x0

    .line 125
    if-nez v0, :cond_5

    .line 126
    .line 127
    new-instance v0, Lod/l0;

    .line 128
    .line 129
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 130
    .line 131
    .line 132
    if-eqz p1, :cond_4

    .line 133
    .line 134
    move-object v3, p1

    .line 135
    goto :goto_0

    .line 136
    :cond_4
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 137
    .line 138
    :goto_0
    iput-object v3, v0, Lod/l0;->a:Ljava/util/List;

    .line 139
    .line 140
    iput-object v0, p0, Lod/h1;->h:Lod/l0;

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_5
    iget-object v3, p0, Lod/h1;->l:Lmd/m;

    .line 144
    .line 145
    if-ne v3, v1, :cond_8

    .line 146
    .line 147
    invoke-virtual {v0}, Lod/l0;->a()Ljava/net/SocketAddress;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    iget-object v3, p0, Lod/h1;->h:Lod/l0;

    .line 152
    .line 153
    if-eqz p1, :cond_6

    .line 154
    .line 155
    move-object v4, p1

    .line 156
    goto :goto_1

    .line 157
    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 161
    .line 162
    :goto_1
    iput-object v4, v3, Lod/l0;->a:Ljava/util/List;

    .line 163
    .line 164
    iput v2, v3, Lod/l0;->b:I

    .line 165
    .line 166
    iput v2, v3, Lod/l0;->c:I

    .line 167
    .line 168
    iget-object v3, p0, Lod/h1;->h:Lod/l0;

    .line 169
    .line 170
    invoke-virtual {v3, v0}, Lod/l0;->e(Ljava/net/SocketAddress;)Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_7

    .line 175
    .line 176
    sget-object p1, Lmd/k0;->e:Lmd/k0;

    .line 177
    .line 178
    return-object p1

    .line 179
    :cond_7
    iget-object v0, p0, Lod/h1;->h:Lod/l0;

    .line 180
    .line 181
    iput v2, v0, Lod/l0;->b:I

    .line 182
    .line 183
    iput v2, v0, Lod/l0;->c:I

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_8
    if-eqz p1, :cond_9

    .line 187
    .line 188
    move-object v3, p1

    .line 189
    goto :goto_2

    .line 190
    :cond_9
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 191
    .line 192
    :goto_2
    iput-object v3, v0, Lod/l0;->a:Ljava/util/List;

    .line 193
    .line 194
    iput v2, v0, Lod/l0;->b:I

    .line 195
    .line 196
    iput v2, v0, Lod/l0;->c:I

    .line 197
    .line 198
    :goto_3
    new-instance v0, Ljava/util/HashSet;

    .line 199
    .line 200
    iget-object v3, p0, Lod/h1;->g:Ljava/util/HashMap;

    .line 201
    .line 202
    invoke-virtual {v3}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    invoke-direct {v0, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 207
    .line 208
    .line 209
    new-instance v4, Ljava/util/HashSet;

    .line 210
    .line 211
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1, v2}, Ll8/K;->l(I)Ll8/I;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    :goto_4
    invoke-virtual {p1}, Ll8/I;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-eqz v2, :cond_a

    .line 223
    .line 224
    invoke-virtual {p1}, Ll8/I;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    check-cast v2, Lmd/u;

    .line 229
    .line 230
    iget-object v2, v2, Lmd/u;->a:Ljava/util/List;

    .line 231
    .line 232
    invoke-interface {v4, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 233
    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_a
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    :cond_b
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    if-eqz v2, :cond_c

    .line 245
    .line 246
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    check-cast v2, Ljava/net/SocketAddress;

    .line 251
    .line 252
    invoke-virtual {v4, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v5

    .line 256
    if-nez v5, :cond_b

    .line 257
    .line 258
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    check-cast v2, Lod/g1;

    .line 263
    .line 264
    iget-object v2, v2, Lod/g1;->a:Lmd/e;

    .line 265
    .line 266
    invoke-virtual {v2}, Lmd/e;->p()V

    .line 267
    .line 268
    .line 269
    goto :goto_5

    .line 270
    :cond_c
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    .line 271
    .line 272
    .line 273
    move-result p1

    .line 274
    sget-object v0, Lmd/m;->a:Lmd/m;

    .line 275
    .line 276
    if-eqz p1, :cond_f

    .line 277
    .line 278
    iget-object p1, p0, Lod/h1;->l:Lmd/m;

    .line 279
    .line 280
    if-eq p1, v0, :cond_f

    .line 281
    .line 282
    if-ne p1, v1, :cond_d

    .line 283
    .line 284
    goto :goto_6

    .line 285
    :cond_d
    sget-object v0, Lmd/m;->d:Lmd/m;

    .line 286
    .line 287
    if-ne p1, v0, :cond_e

    .line 288
    .line 289
    new-instance p1, Lod/f1;

    .line 290
    .line 291
    invoke-direct {p1, p0, p0}, Lod/f1;-><init>(Lod/h1;Lod/h1;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {p0, v0, p1}, Lod/h1;->i(Lmd/m;Lmd/M;)V

    .line 295
    .line 296
    .line 297
    goto :goto_7

    .line 298
    :cond_e
    sget-object v0, Lmd/m;->c:Lmd/m;

    .line 299
    .line 300
    if-ne p1, v0, :cond_10

    .line 301
    .line 302
    invoke-virtual {p0}, Lod/h1;->g()V

    .line 303
    .line 304
    .line 305
    invoke-virtual {p0}, Lod/h1;->e()V

    .line 306
    .line 307
    .line 308
    goto :goto_7

    .line 309
    :cond_f
    :goto_6
    iput-object v0, p0, Lod/h1;->l:Lmd/m;

    .line 310
    .line 311
    new-instance p1, Lod/e1;

    .line 312
    .line 313
    sget-object v1, Lmd/K;->e:Lmd/K;

    .line 314
    .line 315
    invoke-direct {p1, v1}, Lod/e1;-><init>(Lmd/K;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {p0, v0, p1}, Lod/h1;->i(Lmd/m;Lmd/M;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {p0}, Lod/h1;->g()V

    .line 322
    .line 323
    .line 324
    invoke-virtual {p0}, Lod/h1;->e()V

    .line 325
    .line 326
    .line 327
    :cond_10
    :goto_7
    sget-object p1, Lmd/k0;->e:Lmd/k0;

    .line 328
    .line 329
    return-object p1
.end method

.method public final c(Lmd/k0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lod/h1;->g:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lod/g1;

    .line 22
    .line 23
    iget-object v2, v2, Lod/g1;->a:Lmd/e;

    .line 24
    .line 25
    invoke-virtual {v2}, Lmd/e;->p()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 30
    .line 31
    .line 32
    sget-object v0, Lmd/m;->c:Lmd/m;

    .line 33
    .line 34
    new-instance v1, Lod/e1;

    .line 35
    .line 36
    invoke-static {p1}, Lmd/K;->a(Lmd/k0;)Lmd/K;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {v1, p1}, Lod/e1;-><init>(Lmd/K;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0, v1}, Lod/h1;->i(Lmd/m;Lmd/M;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final e()V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Lod/h1;->h:Lod/l0;

    .line 3
    .line 4
    if-eqz v1, :cond_9

    .line 5
    .line 6
    invoke-virtual {v1}, Lod/l0;->c()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_9

    .line 11
    .line 12
    iget-object v1, p0, Lod/h1;->l:Lmd/m;

    .line 13
    .line 14
    sget-object v2, Lmd/m;->e:Lmd/m;

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    goto/16 :goto_1

    .line 19
    .line 20
    :cond_0
    iget-object v1, p0, Lod/h1;->h:Lod/l0;

    .line 21
    .line 22
    invoke-virtual {v1}, Lod/l0;->a()Ljava/net/SocketAddress;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v2, p0, Lod/h1;->g:Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    sget-object v4, Lod/h1;->o:Ljava/util/logging/Logger;

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Lod/g1;

    .line 41
    .line 42
    iget-object v3, v3, Lod/g1;->a:Lmd/e;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    new-instance v3, Lod/d1;

    .line 46
    .line 47
    invoke-direct {v3, p0}, Lod/d1;-><init>(Lod/h1;)V

    .line 48
    .line 49
    .line 50
    invoke-static {}, LDd/c;->L()Lmd/J;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    new-instance v6, Lmd/u;

    .line 55
    .line 56
    invoke-direct {v6, v1}, Lmd/u;-><init>(Ljava/net/SocketAddress;)V

    .line 57
    .line 58
    .line 59
    new-array v7, v0, [Lmd/u;

    .line 60
    .line 61
    const/4 v8, 0x0

    .line 62
    aput-object v6, v7, v8

    .line 63
    .line 64
    invoke-static {v7}, Ll8/s;->n([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-virtual {v5, v6}, Lmd/J;->x(Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5, v3}, Lmd/J;->i(Lmd/N;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5}, Lmd/J;->j()LDd/c;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    iget-object v6, p0, Lod/h1;->f:Lmd/y;

    .line 79
    .line 80
    invoke-virtual {v6, v5}, Lmd/y;->b(LDd/c;)Lmd/e;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    if-eqz v5, :cond_8

    .line 85
    .line 86
    new-instance v6, Lod/g1;

    .line 87
    .line 88
    invoke-direct {v6, v5, v3}, Lod/g1;-><init>(Lmd/e;Lod/d1;)V

    .line 89
    .line 90
    .line 91
    iput-object v6, v3, Lod/d1;->b:Lod/g1;

    .line 92
    .line 93
    invoke-virtual {v2, v1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5}, Lmd/e;->c()Lmd/b;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    sget-object v7, Lmd/O;->d:Lmd/a;

    .line 101
    .line 102
    iget-object v6, v6, Lmd/b;->a:Ljava/util/IdentityHashMap;

    .line 103
    .line 104
    invoke-virtual {v6, v7}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    if-nez v6, :cond_2

    .line 109
    .line 110
    sget-object v6, Lmd/m;->b:Lmd/m;

    .line 111
    .line 112
    invoke-static {v6}, Lmd/n;->a(Lmd/m;)Lmd/n;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    iput-object v6, v3, Lod/d1;->a:Lmd/n;

    .line 117
    .line 118
    :cond_2
    new-instance v3, Lod/c1;

    .line 119
    .line 120
    invoke-direct {v3, p0, v5}, Lod/c1;-><init>(Lod/h1;Lmd/e;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v5, v3}, Lmd/e;->q(Lmd/N;)V

    .line 124
    .line 125
    .line 126
    move-object v3, v5

    .line 127
    :goto_0
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    check-cast v5, Lod/g1;

    .line 132
    .line 133
    iget-object v5, v5, Lod/g1;->b:Lmd/m;

    .line 134
    .line 135
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-eqz v5, :cond_6

    .line 140
    .line 141
    if-eq v5, v0, :cond_5

    .line 142
    .line 143
    const/4 v0, 0x2

    .line 144
    if-eq v5, v0, :cond_4

    .line 145
    .line 146
    const/4 v0, 0x3

    .line 147
    if-eq v5, v0, :cond_3

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_3
    invoke-virtual {v3}, Lmd/e;->o()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, Lod/g1;

    .line 158
    .line 159
    sget-object v1, Lmd/m;->a:Lmd/m;

    .line 160
    .line 161
    invoke-static {v0, v1}, Lod/g1;->a(Lod/g1;Lmd/m;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0}, Lod/h1;->h()V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :cond_4
    iget-object v0, p0, Lod/h1;->h:Lod/l0;

    .line 169
    .line 170
    invoke-virtual {v0}, Lod/l0;->b()Z

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, Lod/h1;->e()V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :cond_5
    const-string v0, "Requesting a connection even though we have a READY subchannel"

    .line 178
    .line 179
    invoke-virtual {v4, v0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :cond_6
    iget-boolean v0, p0, Lod/h1;->n:Z

    .line 184
    .line 185
    if-eqz v0, :cond_7

    .line 186
    .line 187
    invoke-virtual {p0}, Lod/h1;->h()V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :cond_7
    invoke-virtual {v3}, Lmd/e;->o()V

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    const-string v2, "Was not able to create subchannel for "

    .line 198
    .line 199
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v4, v0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 213
    .line 214
    const-string v1, "Can\'t create subchannel"

    .line 215
    .line 216
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    throw v0

    .line 220
    :cond_9
    :goto_1
    return-void
.end method

.method public final f()V
    .locals 5

    .line 1
    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 2
    .line 3
    iget-object v1, p0, Lod/h1;->g:Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    sget-object v3, Lod/h1;->o:Ljava/util/logging/Logger;

    .line 14
    .line 15
    const-string v4, "Shutting down, currently have {} subchannels created"

    .line 16
    .line 17
    invoke-virtual {v3, v0, v4, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object v0, Lmd/m;->e:Lmd/m;

    .line 21
    .line 22
    iput-object v0, p0, Lod/h1;->l:Lmd/m;

    .line 23
    .line 24
    iput-object v0, p0, Lod/h1;->m:Lmd/m;

    .line 25
    .line 26
    invoke-virtual {p0}, Lod/h1;->g()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lod/g1;

    .line 48
    .line 49
    iget-object v2, v2, Lod/g1;->a:Lmd/e;

    .line 50
    .line 51
    invoke-virtual {v2}, Lmd/e;->p()V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lod/h1;->k:Lba/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lba/a;->j()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lod/h1;->k:Lba/a;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final h()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lod/h1;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lod/h1;->k:Lba/a;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lba/a;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, LN6/w;

    .line 12
    .line 13
    iget-boolean v1, v0, LN6/w;->c:Z

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget-boolean v0, v0, LN6/w;->b:Z

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object v0, p0, Lod/h1;->f:Lmd/y;

    .line 23
    .line 24
    invoke-virtual {v0}, Lmd/y;->g()Lmd/n0;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    new-instance v2, Lg5/d;

    .line 29
    .line 30
    const/16 v3, 0xb

    .line 31
    .line 32
    invoke-direct {v2, p0, v3}, Lg5/d;-><init>(Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 36
    .line 37
    invoke-virtual {v0}, Lmd/y;->e()Ljava/util/concurrent/ScheduledExecutorService;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    const-wide/16 v3, 0xfa

    .line 42
    .line 43
    invoke-virtual/range {v1 .. v6}, Lmd/n0;->d(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lba/a;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Lod/h1;->k:Lba/a;

    .line 48
    .line 49
    :cond_1
    return-void
.end method

.method public final i(Lmd/m;Lmd/M;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lod/h1;->m:Lmd/m;

    .line 2
    .line 3
    if-ne p1, v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Lmd/m;->d:Lmd/m;

    .line 6
    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lmd/m;->a:Lmd/m;

    .line 10
    .line 11
    if-ne p1, v0, :cond_1

    .line 12
    .line 13
    :cond_0
    return-void

    .line 14
    :cond_1
    iput-object p1, p0, Lod/h1;->m:Lmd/m;

    .line 15
    .line 16
    iget-object v0, p0, Lod/h1;->f:Lmd/y;

    .line 17
    .line 18
    invoke-virtual {v0, p1, p2}, Lmd/y;->l(Lmd/m;Lmd/M;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final j(Lod/g1;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lod/g1;->b:Lmd/m;

    .line 2
    .line 3
    sget-object v1, Lmd/m;->b:Lmd/m;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p1, Lod/g1;->c:Lod/d1;

    .line 9
    .line 10
    iget-object v0, v0, Lod/d1;->a:Lmd/n;

    .line 11
    .line 12
    iget-object v2, v0, Lmd/n;->a:Lmd/m;

    .line 13
    .line 14
    if-ne v2, v1, :cond_1

    .line 15
    .line 16
    new-instance v0, Lod/z0;

    .line 17
    .line 18
    iget-object p1, p1, Lod/g1;->a:Lmd/e;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static {p1, v2}, Lmd/K;->b(Lmd/e;Lvd/p;)Lmd/K;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-direct {v0, p1}, Lod/z0;-><init>(Lmd/K;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v1, v0}, Lod/h1;->i(Lmd/m;Lmd/M;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    sget-object p1, Lmd/m;->c:Lmd/m;

    .line 33
    .line 34
    if-ne v2, p1, :cond_2

    .line 35
    .line 36
    new-instance v1, Lod/e1;

    .line 37
    .line 38
    iget-object v0, v0, Lmd/n;->b:Lmd/k0;

    .line 39
    .line 40
    invoke-static {v0}, Lmd/K;->a(Lmd/k0;)Lmd/K;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-direct {v1, v0}, Lod/e1;-><init>(Lmd/K;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1, v1}, Lod/h1;->i(Lmd/m;Lmd/M;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    iget-object v0, p0, Lod/h1;->m:Lmd/m;

    .line 52
    .line 53
    if-eq v0, p1, :cond_3

    .line 54
    .line 55
    new-instance p1, Lod/e1;

    .line 56
    .line 57
    sget-object v0, Lmd/K;->e:Lmd/K;

    .line 58
    .line 59
    invoke-direct {p1, v0}, Lod/e1;-><init>(Lmd/K;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v2, p1}, Lod/h1;->i(Lmd/m;Lmd/M;)V

    .line 63
    .line 64
    .line 65
    :cond_3
    :goto_0
    return-void
.end method
