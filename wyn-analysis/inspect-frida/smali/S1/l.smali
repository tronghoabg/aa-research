.class public final LS1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS1/h;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/ArrayList;

.field public final c:LS1/h;

.field public d:LS1/q;

.field public e:LS1/b;

.field public f:LS1/e;

.field public g:LS1/h;

.field public h:LS1/C;

.field public i:LS1/f;

.field public j:LS1/y;

.field public k:LS1/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;LS1/h;)V
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
    iput-object p1, p0, LS1/l;->a:Landroid/content/Context;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, LS1/l;->c:LS1/h;

    .line 14
    .line 15
    new-instance p1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, LS1/l;->b:Ljava/util/ArrayList;

    .line 21
    .line 22
    return-void
.end method

.method public static l(LS1/h;LS1/A;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-interface {p0, p1}, LS1/h;->C(LS1/A;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method


# virtual methods
.method public final C(LS1/A;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LS1/l;->c:LS1/h;

    .line 5
    .line 6
    invoke-interface {v0, p1}, LS1/h;->C(LS1/A;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LS1/l;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, LS1/l;->d:LS1/q;

    .line 15
    .line 16
    invoke-static {v0, p1}, LS1/l;->l(LS1/h;LS1/A;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, LS1/l;->e:LS1/b;

    .line 20
    .line 21
    invoke-static {v0, p1}, LS1/l;->l(LS1/h;LS1/A;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, LS1/l;->f:LS1/e;

    .line 25
    .line 26
    invoke-static {v0, p1}, LS1/l;->l(LS1/h;LS1/A;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, LS1/l;->g:LS1/h;

    .line 30
    .line 31
    invoke-static {v0, p1}, LS1/l;->l(LS1/h;LS1/A;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, LS1/l;->h:LS1/C;

    .line 35
    .line 36
    invoke-static {v0, p1}, LS1/l;->l(LS1/h;LS1/A;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, LS1/l;->i:LS1/f;

    .line 40
    .line 41
    invoke-static {v0, p1}, LS1/l;->l(LS1/h;LS1/A;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, LS1/l;->j:LS1/y;

    .line 45
    .line 46
    invoke-static {v0, p1}, LS1/l;->l(LS1/h;LS1/A;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final b(LS1/h;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, LS1/l;->b:Ljava/util/ArrayList;

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
    check-cast v1, LS1/A;

    .line 15
    .line 16
    invoke-interface {p1, v1}, LS1/h;->C(LS1/A;)V

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
    iget-object v0, p0, LS1/l;->k:LS1/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-interface {v0}, LS1/h;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, LS1/l;->k:LS1/h;

    .line 10
    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    iput-object v1, p0, LS1/l;->k:LS1/h;

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
    iget-object v0, p0, LS1/l;->k:LS1/h;

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
    invoke-interface {v0}, LS1/h;->d()Ljava/util/Map;

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
    iget-object v0, p0, LS1/l;->k:LS1/h;

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
    invoke-interface {v0}, LS1/h;->k()Landroid/net/Uri;

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
    iget-object v0, p0, LS1/l;->k:LS1/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, p1, p2, p3}, LN1/g;->read([BII)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public final y(LS1/k;)J
    .locals 6

    .line 1
    iget-object v0, p0, LS1/l;->k:LS1/h;

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
    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p1, LS1/k;->a:Landroid/net/Uri;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget v2, LQ1/x;->a:I

    .line 19
    .line 20
    iget-object v2, p1, LS1/k;->a:Landroid/net/Uri;

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
    iget-object v5, p0, LS1/l;->a:Landroid/content/Context;

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
    iget-object v0, p0, LS1/l;->e:LS1/b;

    .line 53
    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    new-instance v0, LS1/b;

    .line 57
    .line 58
    invoke-direct {v0, v5}, LS1/b;-><init>(Landroid/content/Context;)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, LS1/l;->e:LS1/b;

    .line 62
    .line 63
    invoke-virtual {p0, v0}, LS1/l;->b(LS1/h;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    iget-object v0, p0, LS1/l;->e:LS1/b;

    .line 67
    .line 68
    iput-object v0, p0, LS1/l;->k:LS1/h;

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
    iget-object v0, p0, LS1/l;->f:LS1/e;

    .line 81
    .line 82
    if-nez v0, :cond_4

    .line 83
    .line 84
    new-instance v0, LS1/e;

    .line 85
    .line 86
    invoke-direct {v0, v5}, LS1/e;-><init>(Landroid/content/Context;)V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, LS1/l;->f:LS1/e;

    .line 90
    .line 91
    invoke-virtual {p0, v0}, LS1/l;->b(LS1/h;)V

    .line 92
    .line 93
    .line 94
    :cond_4
    iget-object v0, p0, LS1/l;->f:LS1/e;

    .line 95
    .line 96
    iput-object v0, p0, LS1/l;->k:LS1/h;

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
    iget-object v3, p0, LS1/l;->c:LS1/h;

    .line 107
    .line 108
    if-eqz v2, :cond_7

    .line 109
    .line 110
    iget-object v0, p0, LS1/l;->g:LS1/h;

    .line 111
    .line 112
    if-nez v0, :cond_6

    .line 113
    .line 114
    :try_start_0
    const-string v0, "androidx.media3.datasource.rtmp.RtmpDataSource"

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
    check-cast v0, LS1/h;

    .line 133
    .line 134
    iput-object v0, p0, LS1/l;->g:LS1/h;

    .line 135
    .line 136
    invoke-virtual {p0, v0}, LS1/l;->b(LS1/h;)V
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
    invoke-static {v0, v1}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    :goto_1
    iget-object v0, p0, LS1/l;->g:LS1/h;

    .line 157
    .line 158
    if-nez v0, :cond_6

    .line 159
    .line 160
    iput-object v3, p0, LS1/l;->g:LS1/h;

    .line 161
    .line 162
    :cond_6
    iget-object v0, p0, LS1/l;->g:LS1/h;

    .line 163
    .line 164
    iput-object v0, p0, LS1/l;->k:LS1/h;

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
    iget-object v0, p0, LS1/l;->h:LS1/C;

    .line 177
    .line 178
    if-nez v0, :cond_8

    .line 179
    .line 180
    new-instance v0, LS1/C;

    .line 181
    .line 182
    const/16 v1, 0x1f40

    .line 183
    .line 184
    invoke-direct {v0, v1}, LS1/C;-><init>(I)V

    .line 185
    .line 186
    .line 187
    iput-object v0, p0, LS1/l;->h:LS1/C;

    .line 188
    .line 189
    invoke-virtual {p0, v0}, LS1/l;->b(LS1/h;)V

    .line 190
    .line 191
    .line 192
    :cond_8
    iget-object v0, p0, LS1/l;->h:LS1/C;

    .line 193
    .line 194
    iput-object v0, p0, LS1/l;->k:LS1/h;

    .line 195
    .line 196
    goto/16 :goto_4

    .line 197
    .line 198
    :cond_9
    const-string v2, "data"

    .line 199
    .line 200
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    if-eqz v2, :cond_b

    .line 205
    .line 206
    iget-object v0, p0, LS1/l;->i:LS1/f;

    .line 207
    .line 208
    if-nez v0, :cond_a

    .line 209
    .line 210
    new-instance v0, LS1/f;

    .line 211
    .line 212
    invoke-direct {v0, v1}, LS1/c;-><init>(Z)V

    .line 213
    .line 214
    .line 215
    iput-object v0, p0, LS1/l;->i:LS1/f;

    .line 216
    .line 217
    invoke-virtual {p0, v0}, LS1/l;->b(LS1/h;)V

    .line 218
    .line 219
    .line 220
    :cond_a
    iget-object v0, p0, LS1/l;->i:LS1/f;

    .line 221
    .line 222
    iput-object v0, p0, LS1/l;->k:LS1/h;

    .line 223
    .line 224
    goto :goto_4

    .line 225
    :cond_b
    const-string v1, "rawresource"

    .line 226
    .line 227
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    if-nez v1, :cond_d

    .line 232
    .line 233
    const-string v1, "android.resource"

    .line 234
    .line 235
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    if-eqz v0, :cond_c

    .line 240
    .line 241
    goto :goto_2

    .line 242
    :cond_c
    iput-object v3, p0, LS1/l;->k:LS1/h;

    .line 243
    .line 244
    goto :goto_4

    .line 245
    :cond_d
    :goto_2
    iget-object v0, p0, LS1/l;->j:LS1/y;

    .line 246
    .line 247
    if-nez v0, :cond_e

    .line 248
    .line 249
    new-instance v0, LS1/y;

    .line 250
    .line 251
    invoke-direct {v0, v5}, LS1/y;-><init>(Landroid/content/Context;)V

    .line 252
    .line 253
    .line 254
    iput-object v0, p0, LS1/l;->j:LS1/y;

    .line 255
    .line 256
    invoke-virtual {p0, v0}, LS1/l;->b(LS1/h;)V

    .line 257
    .line 258
    .line 259
    :cond_e
    iget-object v0, p0, LS1/l;->j:LS1/y;

    .line 260
    .line 261
    iput-object v0, p0, LS1/l;->k:LS1/h;

    .line 262
    .line 263
    goto :goto_4

    .line 264
    :cond_f
    :goto_3
    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    if-eqz v0, :cond_11

    .line 269
    .line 270
    const-string v2, "/android_asset/"

    .line 271
    .line 272
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-eqz v0, :cond_11

    .line 277
    .line 278
    iget-object v0, p0, LS1/l;->e:LS1/b;

    .line 279
    .line 280
    if-nez v0, :cond_10

    .line 281
    .line 282
    new-instance v0, LS1/b;

    .line 283
    .line 284
    invoke-direct {v0, v5}, LS1/b;-><init>(Landroid/content/Context;)V

    .line 285
    .line 286
    .line 287
    iput-object v0, p0, LS1/l;->e:LS1/b;

    .line 288
    .line 289
    invoke-virtual {p0, v0}, LS1/l;->b(LS1/h;)V

    .line 290
    .line 291
    .line 292
    :cond_10
    iget-object v0, p0, LS1/l;->e:LS1/b;

    .line 293
    .line 294
    iput-object v0, p0, LS1/l;->k:LS1/h;

    .line 295
    .line 296
    goto :goto_4

    .line 297
    :cond_11
    iget-object v0, p0, LS1/l;->d:LS1/q;

    .line 298
    .line 299
    if-nez v0, :cond_12

    .line 300
    .line 301
    new-instance v0, LS1/q;

    .line 302
    .line 303
    invoke-direct {v0, v1}, LS1/c;-><init>(Z)V

    .line 304
    .line 305
    .line 306
    iput-object v0, p0, LS1/l;->d:LS1/q;

    .line 307
    .line 308
    invoke-virtual {p0, v0}, LS1/l;->b(LS1/h;)V

    .line 309
    .line 310
    .line 311
    :cond_12
    iget-object v0, p0, LS1/l;->d:LS1/q;

    .line 312
    .line 313
    iput-object v0, p0, LS1/l;->k:LS1/h;

    .line 314
    .line 315
    :goto_4
    iget-object v0, p0, LS1/l;->k:LS1/h;

    .line 316
    .line 317
    invoke-interface {v0, p1}, LS1/h;->y(LS1/k;)J

    .line 318
    .line 319
    .line 320
    move-result-wide v0

    .line 321
    return-wide v0
.end method
