.class public final Lt6/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/l;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/ArrayList;

.field public final c:Lt6/l;

.field public d:Lt6/v;

.field public e:Lt6/c;

.field public f:Lt6/h;

.field public g:Lt6/l;

.field public h:Lt6/M;

.field public i:Lt6/j;

.field public j:Lt6/G;

.field public k:Lt6/l;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lt6/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lt6/r;->a:Landroid/content/Context;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Lt6/r;->c:Lt6/l;

    .line 14
    .line 15
    new-instance p1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lt6/r;->b:Ljava/util/ArrayList;

    .line 21
    .line 22
    return-void
.end method

.method public static l(Lt6/l;Lt6/K;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lt6/l;->z(Lt6/K;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method


# virtual methods
.method public final b(Lt6/l;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lt6/r;->b:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-ge v0, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lt6/K;

    .line 15
    .line 16
    invoke-interface {p1, v1}, Lt6/l;->z(Lt6/K;)V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, Lt6/r;->k:Lt6/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-interface {v0}, Lt6/l;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, Lt6/r;->k:Lt6/l;

    .line 10
    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    iput-object v1, p0, Lt6/r;->k:Lt6/l;

    .line 14
    .line 15
    throw v0

    .line 16
    :cond_0
    return-void
.end method

.method public final d()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lt6/r;->k:Lt6/l;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-interface {v0}, Lt6/l;->d()Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public final k()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lt6/r;->k:Lt6/l;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Lt6/l;->k()Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final read([BII)I
    .locals 1

    .line 1
    iget-object v0, p0, Lt6/r;->k:Lt6/l;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, p1, p2, p3}, Lt6/i;->read([BII)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public final t(Lt6/n;)J
    .locals 6

    .line 1
    iget-object v0, p0, Lt6/r;->k:Lt6/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v0, v1

    .line 9
    :goto_0
    invoke-static {v0}, Lu6/a;->i(Z)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p1, Lt6/n;->a:Landroid/net/Uri;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget v2, Lu6/v;->a:I

    .line 19
    .line 20
    iget-object v2, p1, Lt6/n;->a:Landroid/net/Uri;

    .line 21
    .line 22
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    iget-object v5, p0, Lt6/r;->a:Landroid/content/Context;

    .line 31
    .line 32
    if-nez v4, :cond_f

    .line 33
    .line 34
    const-string v4, "file"

    .line 35
    .line 36
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    goto/16 :goto_3

    .line 43
    .line 44
    :cond_1
    const-string v2, "asset"

    .line 45
    .line 46
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    iget-object v0, p0, Lt6/r;->e:Lt6/c;

    .line 53
    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    new-instance v0, Lt6/c;

    .line 57
    .line 58
    invoke-direct {v0, v5}, Lt6/c;-><init>(Landroid/content/Context;)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, Lt6/r;->e:Lt6/c;

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Lt6/r;->b(Lt6/l;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    iget-object v0, p0, Lt6/r;->e:Lt6/c;

    .line 67
    .line 68
    iput-object v0, p0, Lt6/r;->k:Lt6/l;

    .line 69
    .line 70
    goto/16 :goto_4

    .line 71
    .line 72
    :cond_3
    const-string v2, "content"

    .line 73
    .line 74
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_5

    .line 79
    .line 80
    iget-object v0, p0, Lt6/r;->f:Lt6/h;

    .line 81
    .line 82
    if-nez v0, :cond_4

    .line 83
    .line 84
    new-instance v0, Lt6/h;

    .line 85
    .line 86
    invoke-direct {v0, v5}, Lt6/h;-><init>(Landroid/content/Context;)V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, Lt6/r;->f:Lt6/h;

    .line 90
    .line 91
    invoke-virtual {p0, v0}, Lt6/r;->b(Lt6/l;)V

    .line 92
    .line 93
    .line 94
    :cond_4
    iget-object v0, p0, Lt6/r;->f:Lt6/h;

    .line 95
    .line 96
    iput-object v0, p0, Lt6/r;->k:Lt6/l;

    .line 97
    .line 98
    goto/16 :goto_4

    .line 99
    .line 100
    :cond_5
    const-string v2, "rtmp"

    .line 101
    .line 102
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    iget-object v3, p0, Lt6/r;->c:Lt6/l;

    .line 107
    .line 108
    if-eqz v2, :cond_7

    .line 109
    .line 110
    iget-object v0, p0, Lt6/r;->g:Lt6/l;

    .line 111
    .line 112
    if-nez v0, :cond_6

    .line 113
    .line 114
    :try_start_0
    const-string v0, "com.google.android.exoplayer2.ext.rtmp.RtmpDataSource"

    .line 115
    .line 116
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    new-array v2, v1, [Ljava/lang/Class;

    .line 121
    .line 122
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    new-array v1, v1, [Ljava/lang/Object;

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast v0, Lt6/l;

    .line 133
    .line 134
    iput-object v0, p0, Lt6/r;->g:Lt6/l;

    .line 135
    .line 136
    invoke-virtual {p0, v0}, Lt6/r;->b(Lt6/l;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :catch_0
    move-exception p1

    .line 141
    new-instance v0, Ljava/lang/RuntimeException;

    .line 142
    .line 143
    const-string v1, "Error instantiating RTMP extension"

    .line 144
    .line 145
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    throw v0

    .line 149
    :catch_1
    const-string v0, "DefaultDataSource"

    .line 150
    .line 151
    const-string v1, "Attempting to play RTMP stream without depending on the RTMP extension"

    .line 152
    .line 153
    invoke-static {v0, v1}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    :goto_1
    iget-object v0, p0, Lt6/r;->g:Lt6/l;

    .line 157
    .line 158
    if-nez v0, :cond_6

    .line 159
    .line 160
    iput-object v3, p0, Lt6/r;->g:Lt6/l;

    .line 161
    .line 162
    :cond_6
    iget-object v0, p0, Lt6/r;->g:Lt6/l;

    .line 163
    .line 164
    iput-object v0, p0, Lt6/r;->k:Lt6/l;

    .line 165
    .line 166
    goto/16 :goto_4

    .line 167
    .line 168
    :cond_7
    const-string v2, "udp"

    .line 169
    .line 170
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    if-eqz v2, :cond_9

    .line 175
    .line 176
    iget-object v0, p0, Lt6/r;->h:Lt6/M;

    .line 177
    .line 178
    if-nez v0, :cond_8

    .line 179
    .line 180
    new-instance v0, Lt6/M;

    .line 181
    .line 182
    invoke-direct {v0}, Lt6/M;-><init>()V

    .line 183
    .line 184
    .line 185
    iput-object v0, p0, Lt6/r;->h:Lt6/M;

    .line 186
    .line 187
    invoke-virtual {p0, v0}, Lt6/r;->b(Lt6/l;)V

    .line 188
    .line 189
    .line 190
    :cond_8
    iget-object v0, p0, Lt6/r;->h:Lt6/M;

    .line 191
    .line 192
    iput-object v0, p0, Lt6/r;->k:Lt6/l;

    .line 193
    .line 194
    goto/16 :goto_4

    .line 195
    .line 196
    :cond_9
    const-string v2, "data"

    .line 197
    .line 198
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-eqz v2, :cond_b

    .line 203
    .line 204
    iget-object v0, p0, Lt6/r;->i:Lt6/j;

    .line 205
    .line 206
    if-nez v0, :cond_a

    .line 207
    .line 208
    new-instance v0, Lt6/j;

    .line 209
    .line 210
    invoke-direct {v0, v1}, Lt6/f;-><init>(Z)V

    .line 211
    .line 212
    .line 213
    iput-object v0, p0, Lt6/r;->i:Lt6/j;

    .line 214
    .line 215
    invoke-virtual {p0, v0}, Lt6/r;->b(Lt6/l;)V

    .line 216
    .line 217
    .line 218
    :cond_a
    iget-object v0, p0, Lt6/r;->i:Lt6/j;

    .line 219
    .line 220
    iput-object v0, p0, Lt6/r;->k:Lt6/l;

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_b
    const-string v1, "rawresource"

    .line 224
    .line 225
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    if-nez v1, :cond_d

    .line 230
    .line 231
    const-string v1, "android.resource"

    .line 232
    .line 233
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    if-eqz v0, :cond_c

    .line 238
    .line 239
    goto :goto_2

    .line 240
    :cond_c
    iput-object v3, p0, Lt6/r;->k:Lt6/l;

    .line 241
    .line 242
    goto :goto_4

    .line 243
    :cond_d
    :goto_2
    iget-object v0, p0, Lt6/r;->j:Lt6/G;

    .line 244
    .line 245
    if-nez v0, :cond_e

    .line 246
    .line 247
    new-instance v0, Lt6/G;

    .line 248
    .line 249
    invoke-direct {v0, v5}, Lt6/G;-><init>(Landroid/content/Context;)V

    .line 250
    .line 251
    .line 252
    iput-object v0, p0, Lt6/r;->j:Lt6/G;

    .line 253
    .line 254
    invoke-virtual {p0, v0}, Lt6/r;->b(Lt6/l;)V

    .line 255
    .line 256
    .line 257
    :cond_e
    iget-object v0, p0, Lt6/r;->j:Lt6/G;

    .line 258
    .line 259
    iput-object v0, p0, Lt6/r;->k:Lt6/l;

    .line 260
    .line 261
    goto :goto_4

    .line 262
    :cond_f
    :goto_3
    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    if-eqz v0, :cond_11

    .line 267
    .line 268
    const-string v2, "/android_asset/"

    .line 269
    .line 270
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-eqz v0, :cond_11

    .line 275
    .line 276
    iget-object v0, p0, Lt6/r;->e:Lt6/c;

    .line 277
    .line 278
    if-nez v0, :cond_10

    .line 279
    .line 280
    new-instance v0, Lt6/c;

    .line 281
    .line 282
    invoke-direct {v0, v5}, Lt6/c;-><init>(Landroid/content/Context;)V

    .line 283
    .line 284
    .line 285
    iput-object v0, p0, Lt6/r;->e:Lt6/c;

    .line 286
    .line 287
    invoke-virtual {p0, v0}, Lt6/r;->b(Lt6/l;)V

    .line 288
    .line 289
    .line 290
    :cond_10
    iget-object v0, p0, Lt6/r;->e:Lt6/c;

    .line 291
    .line 292
    iput-object v0, p0, Lt6/r;->k:Lt6/l;

    .line 293
    .line 294
    goto :goto_4

    .line 295
    :cond_11
    iget-object v0, p0, Lt6/r;->d:Lt6/v;

    .line 296
    .line 297
    if-nez v0, :cond_12

    .line 298
    .line 299
    new-instance v0, Lt6/v;

    .line 300
    .line 301
    invoke-direct {v0, v1}, Lt6/f;-><init>(Z)V

    .line 302
    .line 303
    .line 304
    iput-object v0, p0, Lt6/r;->d:Lt6/v;

    .line 305
    .line 306
    invoke-virtual {p0, v0}, Lt6/r;->b(Lt6/l;)V

    .line 307
    .line 308
    .line 309
    :cond_12
    iget-object v0, p0, Lt6/r;->d:Lt6/v;

    .line 310
    .line 311
    iput-object v0, p0, Lt6/r;->k:Lt6/l;

    .line 312
    .line 313
    :goto_4
    iget-object v0, p0, Lt6/r;->k:Lt6/l;

    .line 314
    .line 315
    invoke-interface {v0, p1}, Lt6/l;->t(Lt6/n;)J

    .line 316
    .line 317
    .line 318
    move-result-wide v0

    .line 319
    return-wide v0
.end method

.method public final z(Lt6/K;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lt6/r;->c:Lt6/l;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Lt6/l;->z(Lt6/K;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lt6/r;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lt6/r;->d:Lt6/v;

    .line 15
    .line 16
    invoke-static {v0, p1}, Lt6/r;->l(Lt6/l;Lt6/K;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lt6/r;->e:Lt6/c;

    .line 20
    .line 21
    invoke-static {v0, p1}, Lt6/r;->l(Lt6/l;Lt6/K;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lt6/r;->f:Lt6/h;

    .line 25
    .line 26
    invoke-static {v0, p1}, Lt6/r;->l(Lt6/l;Lt6/K;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lt6/r;->g:Lt6/l;

    .line 30
    .line 31
    invoke-static {v0, p1}, Lt6/r;->l(Lt6/l;Lt6/K;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lt6/r;->h:Lt6/M;

    .line 35
    .line 36
    invoke-static {v0, p1}, Lt6/r;->l(Lt6/l;Lt6/K;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lt6/r;->i:Lt6/j;

    .line 40
    .line 41
    invoke-static {v0, p1}, Lt6/r;->l(Lt6/l;Lt6/K;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lt6/r;->j:Lt6/G;

    .line 45
    .line 46
    invoke-static {v0, p1}, Lt6/r;->l(Lt6/l;Lt6/K;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method
