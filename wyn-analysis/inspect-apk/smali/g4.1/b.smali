.class public final Lg4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lokhttp3/Request;

.field public final b:LA/j;

.field public final c:Ljava/util/Date;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/Date;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/util/Date;

.field public final h:J

.field public final i:J

.field public final j:Ljava/lang/String;

.field public final k:I


# direct methods
.method public constructor <init>(Lokhttp3/Request;LA/j;)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lg4/b;->a:Lokhttp3/Request;

    .line 6
    .line 7
    iput-object p2, p0, Lg4/b;->b:LA/j;

    .line 8
    .line 9
    const/4 p1, -0x1

    .line 10
    iput p1, p0, Lg4/b;->k:I

    .line 11
    .line 12
    if-eqz p2, :cond_b

    .line 13
    .line 14
    iget-wide v1, p2, LA/j;->b:J

    .line 15
    .line 16
    iput-wide v1, p0, Lg4/b;->h:J

    .line 17
    .line 18
    iget-wide v1, p2, LA/j;->c:J

    .line 19
    .line 20
    iput-wide v1, p0, Lg4/b;->i:J

    .line 21
    .line 22
    iget-object p2, p2, LA/j;->g:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p2, Lokhttp3/Headers;

    .line 25
    .line 26
    invoke-virtual {p2}, Lokhttp3/Headers;->size()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const/4 v2, 0x0

    .line 31
    move v3, v2

    .line 32
    :goto_0
    if-ge v3, v1, :cond_b

    .line 33
    .line 34
    invoke-virtual {p2, v3}, Lokhttp3/Headers;->c(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    const-string v5, "Date"

    .line 39
    .line 40
    invoke-static {v4, v5, v0}, LBf/r;->c0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    const/4 v7, 0x0

    .line 45
    if-eqz v6, :cond_1

    .line 46
    .line 47
    invoke-virtual {p2, v5}, Lokhttp3/Headers;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    if-nez v4, :cond_0

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_0
    invoke-static {v4}, Lokhttp3/internal/http/DatesKt;->a(Ljava/lang/String;)Ljava/util/Date;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    :goto_1
    iput-object v7, p0, Lg4/b;->c:Ljava/util/Date;

    .line 59
    .line 60
    invoke-virtual {p2, v3}, Lokhttp3/Headers;->f(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    iput-object v4, p0, Lg4/b;->d:Ljava/lang/String;

    .line 65
    .line 66
    goto/16 :goto_5

    .line 67
    .line 68
    :cond_1
    const-string v5, "Expires"

    .line 69
    .line 70
    invoke-static {v4, v5, v0}, LBf/r;->c0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-eqz v6, :cond_3

    .line 75
    .line 76
    invoke-virtual {p2, v5}, Lokhttp3/Headers;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    if-nez v4, :cond_2

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_2
    invoke-static {v4}, Lokhttp3/internal/http/DatesKt;->a(Ljava/lang/String;)Ljava/util/Date;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    :goto_2
    iput-object v7, p0, Lg4/b;->g:Ljava/util/Date;

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_3
    const-string v5, "Last-Modified"

    .line 91
    .line 92
    invoke-static {v4, v5, v0}, LBf/r;->c0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-eqz v6, :cond_5

    .line 97
    .line 98
    invoke-virtual {p2, v5}, Lokhttp3/Headers;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    if-nez v4, :cond_4

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_4
    invoke-static {v4}, Lokhttp3/internal/http/DatesKt;->a(Ljava/lang/String;)Ljava/util/Date;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    :goto_3
    iput-object v7, p0, Lg4/b;->e:Ljava/util/Date;

    .line 110
    .line 111
    invoke-virtual {p2, v3}, Lokhttp3/Headers;->f(I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    iput-object v4, p0, Lg4/b;->f:Ljava/lang/String;

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_5
    const-string v5, "ETag"

    .line 119
    .line 120
    invoke-static {v4, v5, v0}, LBf/r;->c0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-eqz v5, :cond_6

    .line 125
    .line 126
    invoke-virtual {p2, v3}, Lokhttp3/Headers;->f(I)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    iput-object v4, p0, Lg4/b;->j:Ljava/lang/String;

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_6
    const-string v5, "Age"

    .line 134
    .line 135
    invoke-static {v4, v5, v0}, LBf/r;->c0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    if-eqz v4, :cond_a

    .line 140
    .line 141
    invoke-virtual {p2, v3}, Lokhttp3/Headers;->f(I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    sget-object v5, Lk4/e;->a:Landroid/graphics/Bitmap$Config;

    .line 146
    .line 147
    invoke-static {v4}, LBf/r;->m0(Ljava/lang/String;)Ljava/lang/Long;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    if-eqz v4, :cond_9

    .line 152
    .line 153
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 154
    .line 155
    .line 156
    move-result-wide v4

    .line 157
    const-wide/32 v6, 0x7fffffff

    .line 158
    .line 159
    .line 160
    cmp-long v6, v4, v6

    .line 161
    .line 162
    if-lez v6, :cond_7

    .line 163
    .line 164
    const v4, 0x7fffffff

    .line 165
    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_7
    const-wide/16 v6, 0x0

    .line 169
    .line 170
    cmp-long v6, v4, v6

    .line 171
    .line 172
    if-gez v6, :cond_8

    .line 173
    .line 174
    move v4, v2

    .line 175
    goto :goto_4

    .line 176
    :cond_8
    long-to-int v4, v4

    .line 177
    goto :goto_4

    .line 178
    :cond_9
    move v4, p1

    .line 179
    :goto_4
    iput v4, p0, Lg4/b;->k:I

    .line 180
    .line 181
    :cond_a
    :goto_5
    add-int/2addr v3, v0

    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :cond_b
    return-void
.end method


# virtual methods
.method public final a()Lg4/c;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lg4/b;->a:Lokhttp3/Request;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, Lg4/b;->b:LA/j;

    .line 7
    .line 8
    if-nez v3, :cond_0

    .line 9
    .line 10
    new-instance v3, Lg4/c;

    .line 11
    .line 12
    invoke-direct {v3, v1, v2}, Lg4/c;-><init>(Lokhttp3/Request;LA/j;)V

    .line 13
    .line 14
    .line 15
    return-object v3

    .line 16
    :cond_0
    iget-object v4, v1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 17
    .line 18
    iget-boolean v5, v4, Lokhttp3/HttpUrl;->j:Z

    .line 19
    .line 20
    if-eqz v5, :cond_1

    .line 21
    .line 22
    iget-boolean v5, v3, LA/j;->d:Z

    .line 23
    .line 24
    if-nez v5, :cond_1

    .line 25
    .line 26
    new-instance v3, Lg4/c;

    .line 27
    .line 28
    invoke-direct {v3, v1, v2}, Lg4/c;-><init>(Lokhttp3/Request;LA/j;)V

    .line 29
    .line 30
    .line 31
    return-object v3

    .line 32
    :cond_1
    iget-object v5, v3, LA/j;->e:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-interface {v5}, Lef/i;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    check-cast v6, Lokhttp3/CacheControl;

    .line 39
    .line 40
    invoke-virtual {v1}, Lokhttp3/Request;->a()Lokhttp3/CacheControl;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    iget-boolean v7, v7, Lokhttp3/CacheControl;->b:Z

    .line 45
    .line 46
    if-nez v7, :cond_13

    .line 47
    .line 48
    invoke-interface {v5}, Lef/i;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    check-cast v7, Lokhttp3/CacheControl;

    .line 53
    .line 54
    iget-boolean v7, v7, Lokhttp3/CacheControl;->b:Z

    .line 55
    .line 56
    if-nez v7, :cond_13

    .line 57
    .line 58
    const-string v7, "Vary"

    .line 59
    .line 60
    iget-object v8, v3, LA/j;->g:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v8, Lokhttp3/Headers;

    .line 63
    .line 64
    invoke-virtual {v8, v7}, Lokhttp3/Headers;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    const-string v8, "*"

    .line 69
    .line 70
    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-nez v7, :cond_13

    .line 75
    .line 76
    invoke-virtual {v1}, Lokhttp3/Request;->a()Lokhttp3/CacheControl;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    iget-boolean v8, v7, Lokhttp3/CacheControl;->a:Z

    .line 81
    .line 82
    if-nez v8, :cond_12

    .line 83
    .line 84
    iget-object v8, v1, Lokhttp3/Request;->c:Lokhttp3/Headers;

    .line 85
    .line 86
    const-string v9, "If-Modified-Since"

    .line 87
    .line 88
    invoke-virtual {v8, v9}, Lokhttp3/Headers;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    if-nez v10, :cond_12

    .line 93
    .line 94
    const-string v10, "If-None-Match"

    .line 95
    .line 96
    invoke-virtual {v8, v10}, Lokhttp3/Headers;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    if-eqz v8, :cond_2

    .line 101
    .line 102
    goto/16 :goto_7

    .line 103
    .line 104
    :cond_2
    iget-wide v11, v0, Lg4/b;->i:J

    .line 105
    .line 106
    iget-object v8, v0, Lg4/b;->c:Ljava/util/Date;

    .line 107
    .line 108
    const-wide/16 v13, 0x0

    .line 109
    .line 110
    if-eqz v8, :cond_3

    .line 111
    .line 112
    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    .line 113
    .line 114
    .line 115
    move-result-wide v15

    .line 116
    move-object/from16 v17, v3

    .line 117
    .line 118
    sub-long v2, v11, v15

    .line 119
    .line 120
    invoke-static {v13, v14, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 121
    .line 122
    .line 123
    move-result-wide v2

    .line 124
    goto :goto_0

    .line 125
    :cond_3
    move-object/from16 v17, v3

    .line 126
    .line 127
    move-wide v2, v13

    .line 128
    :goto_0
    iget v15, v0, Lg4/b;->k:I

    .line 129
    .line 130
    move-wide/from16 v18, v13

    .line 131
    .line 132
    const/4 v13, -0x1

    .line 133
    if-eq v15, v13, :cond_4

    .line 134
    .line 135
    sget-object v14, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 136
    .line 137
    move-object/from16 v20, v8

    .line 138
    .line 139
    move-object/from16 v16, v9

    .line 140
    .line 141
    int-to-long v8, v15

    .line 142
    invoke-virtual {v14, v8, v9}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 143
    .line 144
    .line 145
    move-result-wide v8

    .line 146
    invoke-static {v2, v3, v8, v9}, Ljava/lang/Math;->max(JJ)J

    .line 147
    .line 148
    .line 149
    move-result-wide v2

    .line 150
    goto :goto_1

    .line 151
    :cond_4
    move-object/from16 v20, v8

    .line 152
    .line 153
    move-object/from16 v16, v9

    .line 154
    .line 155
    :goto_1
    iget-wide v8, v0, Lg4/b;->h:J

    .line 156
    .line 157
    sub-long v14, v11, v8

    .line 158
    .line 159
    sget-object v21, Lk4/l;->a:Lk4/k;

    .line 160
    .line 161
    invoke-virtual/range {v21 .. v21}, Lk4/k;->invoke()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v21

    .line 165
    check-cast v21, Ljava/lang/Number;

    .line 166
    .line 167
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Number;->longValue()J

    .line 168
    .line 169
    .line 170
    move-result-wide v21

    .line 171
    sub-long v21, v21, v11

    .line 172
    .line 173
    add-long/2addr v2, v14

    .line 174
    add-long v2, v2, v21

    .line 175
    .line 176
    invoke-interface {v5}, Lef/i;->getValue()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    check-cast v5, Lokhttp3/CacheControl;

    .line 181
    .line 182
    iget v5, v5, Lokhttp3/CacheControl;->c:I

    .line 183
    .line 184
    iget-object v14, v0, Lg4/b;->e:Ljava/util/Date;

    .line 185
    .line 186
    if-eq v5, v13, :cond_5

    .line 187
    .line 188
    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 189
    .line 190
    int-to-long v8, v5

    .line 191
    invoke-virtual {v4, v8, v9}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 192
    .line 193
    .line 194
    move-result-wide v4

    .line 195
    goto :goto_3

    .line 196
    :cond_5
    iget-object v5, v0, Lg4/b;->g:Ljava/util/Date;

    .line 197
    .line 198
    if-eqz v5, :cond_8

    .line 199
    .line 200
    if-eqz v20, :cond_6

    .line 201
    .line 202
    invoke-virtual/range {v20 .. v20}, Ljava/util/Date;->getTime()J

    .line 203
    .line 204
    .line 205
    move-result-wide v11

    .line 206
    :cond_6
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    .line 207
    .line 208
    .line 209
    move-result-wide v4

    .line 210
    sub-long/2addr v4, v11

    .line 211
    cmp-long v8, v4, v18

    .line 212
    .line 213
    if-lez v8, :cond_7

    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_7
    move-wide/from16 v4, v18

    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_8
    if-eqz v14, :cond_7

    .line 220
    .line 221
    iget-object v4, v4, Lokhttp3/HttpUrl;->g:Ljava/util/ArrayList;

    .line 222
    .line 223
    if-nez v4, :cond_9

    .line 224
    .line 225
    const/4 v4, 0x0

    .line 226
    goto :goto_2

    .line 227
    :cond_9
    new-instance v5, Ljava/lang/StringBuilder;

    .line 228
    .line 229
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 230
    .line 231
    .line 232
    sget-object v11, Lokhttp3/HttpUrl;->k:Lokhttp3/HttpUrl$Companion;

    .line 233
    .line 234
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    invoke-static {v4, v5}, Lokhttp3/HttpUrl$Companion;->g(Ljava/util/ArrayList;Ljava/lang/StringBuilder;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    :goto_2
    if-nez v4, :cond_7

    .line 245
    .line 246
    if-eqz v20, :cond_a

    .line 247
    .line 248
    invoke-virtual/range {v20 .. v20}, Ljava/util/Date;->getTime()J

    .line 249
    .line 250
    .line 251
    move-result-wide v8

    .line 252
    :cond_a
    invoke-virtual {v14}, Ljava/util/Date;->getTime()J

    .line 253
    .line 254
    .line 255
    move-result-wide v4

    .line 256
    sub-long/2addr v8, v4

    .line 257
    cmp-long v4, v8, v18

    .line 258
    .line 259
    if-lez v4, :cond_7

    .line 260
    .line 261
    const/16 v4, 0xa

    .line 262
    .line 263
    int-to-long v4, v4

    .line 264
    div-long v4, v8, v4

    .line 265
    .line 266
    :goto_3
    iget v8, v7, Lokhttp3/CacheControl;->c:I

    .line 267
    .line 268
    if-eq v8, v13, :cond_b

    .line 269
    .line 270
    sget-object v9, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 271
    .line 272
    int-to-long v11, v8

    .line 273
    invoke-virtual {v9, v11, v12}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 274
    .line 275
    .line 276
    move-result-wide v8

    .line 277
    invoke-static {v4, v5, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 278
    .line 279
    .line 280
    move-result-wide v4

    .line 281
    :cond_b
    iget v8, v7, Lokhttp3/CacheControl;->i:I

    .line 282
    .line 283
    if-eq v8, v13, :cond_c

    .line 284
    .line 285
    sget-object v9, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 286
    .line 287
    int-to-long v11, v8

    .line 288
    invoke-virtual {v9, v11, v12}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 289
    .line 290
    .line 291
    move-result-wide v8

    .line 292
    goto :goto_4

    .line 293
    :cond_c
    move-wide/from16 v8, v18

    .line 294
    .line 295
    :goto_4
    iget-boolean v11, v6, Lokhttp3/CacheControl;->g:Z

    .line 296
    .line 297
    if-nez v11, :cond_d

    .line 298
    .line 299
    iget v7, v7, Lokhttp3/CacheControl;->h:I

    .line 300
    .line 301
    if-eq v7, v13, :cond_d

    .line 302
    .line 303
    sget-object v11, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 304
    .line 305
    int-to-long v12, v7

    .line 306
    invoke-virtual {v11, v12, v13}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 307
    .line 308
    .line 309
    move-result-wide v11

    .line 310
    move-wide/from16 v18, v11

    .line 311
    .line 312
    :cond_d
    iget-boolean v6, v6, Lokhttp3/CacheControl;->a:Z

    .line 313
    .line 314
    if-nez v6, :cond_e

    .line 315
    .line 316
    add-long/2addr v2, v8

    .line 317
    add-long v4, v4, v18

    .line 318
    .line 319
    cmp-long v2, v2, v4

    .line 320
    .line 321
    if-gez v2, :cond_e

    .line 322
    .line 323
    new-instance v1, Lg4/c;

    .line 324
    .line 325
    move-object/from16 v3, v17

    .line 326
    .line 327
    const/4 v2, 0x0

    .line 328
    invoke-direct {v1, v2, v3}, Lg4/c;-><init>(Lokhttp3/Request;LA/j;)V

    .line 329
    .line 330
    .line 331
    return-object v1

    .line 332
    :cond_e
    move-object/from16 v3, v17

    .line 333
    .line 334
    iget-object v2, v0, Lg4/b;->j:Ljava/lang/String;

    .line 335
    .line 336
    if-eqz v2, :cond_f

    .line 337
    .line 338
    move-object v9, v10

    .line 339
    goto :goto_6

    .line 340
    :cond_f
    if-eqz v14, :cond_10

    .line 341
    .line 342
    iget-object v2, v0, Lg4/b;->f:Ljava/lang/String;

    .line 343
    .line 344
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    :goto_5
    move-object/from16 v9, v16

    .line 348
    .line 349
    goto :goto_6

    .line 350
    :cond_10
    if-eqz v20, :cond_11

    .line 351
    .line 352
    iget-object v2, v0, Lg4/b;->d:Ljava/lang/String;

    .line 353
    .line 354
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    goto :goto_5

    .line 358
    :goto_6
    invoke-virtual {v1}, Lokhttp3/Request;->b()Lokhttp3/Request$Builder;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    invoke-virtual {v1, v9, v2}, Lokhttp3/Request$Builder;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v1}, Lokhttp3/Request$Builder;->b()Lokhttp3/Request;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    new-instance v2, Lg4/c;

    .line 370
    .line 371
    invoke-direct {v2, v1, v3}, Lg4/c;-><init>(Lokhttp3/Request;LA/j;)V

    .line 372
    .line 373
    .line 374
    return-object v2

    .line 375
    :cond_11
    new-instance v2, Lg4/c;

    .line 376
    .line 377
    const/4 v3, 0x0

    .line 378
    invoke-direct {v2, v1, v3}, Lg4/c;-><init>(Lokhttp3/Request;LA/j;)V

    .line 379
    .line 380
    .line 381
    return-object v2

    .line 382
    :cond_12
    :goto_7
    move-object v3, v2

    .line 383
    new-instance v2, Lg4/c;

    .line 384
    .line 385
    invoke-direct {v2, v1, v3}, Lg4/c;-><init>(Lokhttp3/Request;LA/j;)V

    .line 386
    .line 387
    .line 388
    return-object v2

    .line 389
    :cond_13
    move-object v3, v2

    .line 390
    new-instance v2, Lg4/c;

    .line 391
    .line 392
    invoke-direct {v2, v1, v3}, Lg4/c;-><init>(Lokhttp3/Request;LA/j;)V

    .line 393
    .line 394
    .line 395
    return-object v2
.end method
