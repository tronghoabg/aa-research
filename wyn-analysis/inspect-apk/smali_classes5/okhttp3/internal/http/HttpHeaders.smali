.class public final Lokhttp3/internal/http/HttpHeaders;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0002\n\u0000\u00a8\u0006\u0000"
    }
    d2 = {
        "okhttp"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcg/j;

.field public static final b:Lcg/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcg/j;->d:Lcg/j;

    .line 2
    .line 3
    const-string v0, "\"\\"

    .line 4
    .line 5
    invoke-static {v0}, Lab/b;->c(Ljava/lang/String;)Lcg/j;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lokhttp3/internal/http/HttpHeaders;->a:Lcg/j;

    .line 10
    .line 11
    const-string v0, "\t ,="

    .line 12
    .line 13
    invoke-static {v0}, Lab/b;->c(Ljava/lang/String;)Lcg/j;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lokhttp3/internal/http/HttpHeaders;->b:Lcg/j;

    .line 18
    .line 19
    return-void
.end method

.method public static final a(Lokhttp3/Response;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 2
    .line 3
    iget-object v0, v0, Lokhttp3/Request;->b:Ljava/lang/String;

    .line 4
    .line 5
    const-string v1, "HEAD"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/16 v0, 0x64

    .line 15
    .line 16
    iget v1, p0, Lokhttp3/Response;->d:I

    .line 17
    .line 18
    if-lt v1, v0, :cond_1

    .line 19
    .line 20
    const/16 v0, 0xc8

    .line 21
    .line 22
    if-lt v1, v0, :cond_2

    .line 23
    .line 24
    :cond_1
    const/16 v0, 0xcc

    .line 25
    .line 26
    if-eq v1, v0, :cond_2

    .line 27
    .line 28
    const/16 v0, 0x130

    .line 29
    .line 30
    if-eq v1, v0, :cond_2

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    invoke-static {p0}, Lokhttp3/internal/Util;->j(Lokhttp3/Response;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    const-wide/16 v2, -0x1

    .line 38
    .line 39
    cmp-long v0, v0, v2

    .line 40
    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    const-string v0, "Transfer-Encoding"

    .line 44
    .line 45
    invoke-static {v0, p0}, Lokhttp3/Response;->b(Ljava/lang/String;Lokhttp3/Response;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string v0, "chunked"

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-eqz p0, :cond_3

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 59
    return p0

    .line 60
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 61
    return p0
.end method

.method public static final b(Lcg/g;Ljava/util/ArrayList;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :goto_0
    move-object v3, v2

    .line 7
    :goto_1
    if-nez v3, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Lokhttp3/internal/http/HttpHeaders;->e(Lcg/g;)Z

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lokhttp3/internal/http/HttpHeaders;->c(Lcg/g;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    goto/16 :goto_7

    .line 19
    .line 20
    :cond_0
    invoke-static {v0}, Lokhttp3/internal/http/HttpHeaders;->e(Lcg/g;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    invoke-static {v0}, Lokhttp3/internal/http/HttpHeaders;->c(Lcg/g;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    if-nez v5, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0}, Lcg/g;->exhausted()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    goto/16 :goto_7

    .line 37
    .line 38
    :cond_1
    new-instance v0, Lokhttp3/Challenge;

    .line 39
    .line 40
    sget-object v2, Lff/w;->a:Lff/w;

    .line 41
    .line 42
    invoke-direct {v0, v3, v2}, Lokhttp3/Challenge;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    invoke-static {v0}, Lokhttp3/internal/Util;->t(Lcg/g;)I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    invoke-static {v0}, Lokhttp3/internal/http/HttpHeaders;->e(Lcg/g;)Z

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    if-nez v4, :cond_4

    .line 58
    .line 59
    if-nez v7, :cond_3

    .line 60
    .line 61
    invoke-virtual {v0}, Lcg/g;->exhausted()Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-eqz v4, :cond_4

    .line 66
    .line 67
    :cond_3
    new-instance v4, Lokhttp3/Challenge;

    .line 68
    .line 69
    const-string v7, "="

    .line 70
    .line 71
    invoke-static {v7, v6}, LBf/r;->g0(Ljava/lang/String;I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-static {v2, v5}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    const-string v6, "singletonMap<String, Str\u2026ek + \"=\".repeat(eqCount))"

    .line 84
    .line 85
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-direct {v4, v3, v5}, Lokhttp3/Challenge;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_4
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 96
    .line 97
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-static {v0}, Lokhttp3/internal/Util;->t(Lcg/g;)I

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    add-int/2addr v7, v6

    .line 105
    :goto_2
    if-nez v5, :cond_6

    .line 106
    .line 107
    invoke-static {v0}, Lokhttp3/internal/http/HttpHeaders;->c(Lcg/g;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    invoke-static {v0}, Lokhttp3/internal/http/HttpHeaders;->e(Lcg/g;)Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-eqz v6, :cond_5

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_5
    invoke-static {v0}, Lokhttp3/internal/Util;->t(Lcg/g;)I

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    move v7, v6

    .line 123
    :cond_6
    if-nez v7, :cond_7

    .line 124
    .line 125
    :goto_3
    new-instance v6, Lokhttp3/Challenge;

    .line 126
    .line 127
    invoke-direct {v6, v3, v4}, Lokhttp3/Challenge;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-object v3, v5

    .line 134
    goto :goto_1

    .line 135
    :cond_7
    const/4 v6, 0x1

    .line 136
    if-le v7, v6, :cond_8

    .line 137
    .line 138
    goto/16 :goto_7

    .line 139
    .line 140
    :cond_8
    invoke-static {v0}, Lokhttp3/internal/http/HttpHeaders;->e(Lcg/g;)Z

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    if-eqz v6, :cond_9

    .line 145
    .line 146
    goto/16 :goto_7

    .line 147
    .line 148
    :cond_9
    invoke-virtual {v0}, Lcg/g;->exhausted()Z

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    if-nez v6, :cond_e

    .line 153
    .line 154
    const-wide/16 v8, 0x0

    .line 155
    .line 156
    invoke-virtual {v0, v8, v9}, Lcg/g;->o(J)B

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    const/16 v8, 0x22

    .line 161
    .line 162
    if-ne v6, v8, :cond_e

    .line 163
    .line 164
    invoke-virtual {v0}, Lcg/g;->readByte()B

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    if-ne v6, v8, :cond_d

    .line 169
    .line 170
    new-instance v6, Lcg/g;

    .line 171
    .line 172
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 173
    .line 174
    .line 175
    :goto_4
    sget-object v9, Lokhttp3/internal/http/HttpHeaders;->a:Lcg/j;

    .line 176
    .line 177
    invoke-virtual {v0, v9}, Lcg/g;->m(Lcg/j;)J

    .line 178
    .line 179
    .line 180
    move-result-wide v9

    .line 181
    const-wide/16 v11, -0x1

    .line 182
    .line 183
    cmp-long v11, v9, v11

    .line 184
    .line 185
    if-nez v11, :cond_a

    .line 186
    .line 187
    :goto_5
    move-object v6, v2

    .line 188
    goto :goto_6

    .line 189
    :cond_a
    invoke-virtual {v0, v9, v10}, Lcg/g;->o(J)B

    .line 190
    .line 191
    .line 192
    move-result v11

    .line 193
    if-ne v11, v8, :cond_b

    .line 194
    .line 195
    invoke-virtual {v6, v0, v9, v10}, Lcg/g;->E(Lcg/g;J)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, Lcg/g;->readByte()B

    .line 199
    .line 200
    .line 201
    invoke-virtual {v6}, Lcg/g;->readUtf8()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    goto :goto_6

    .line 206
    :cond_b
    iget-wide v11, v0, Lcg/g;->b:J

    .line 207
    .line 208
    const-wide/16 v13, 0x1

    .line 209
    .line 210
    add-long v15, v9, v13

    .line 211
    .line 212
    cmp-long v11, v11, v15

    .line 213
    .line 214
    if-nez v11, :cond_c

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_c
    invoke-virtual {v6, v0, v9, v10}, Lcg/g;->E(Lcg/g;J)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0}, Lcg/g;->readByte()B

    .line 221
    .line 222
    .line 223
    invoke-virtual {v6, v0, v13, v14}, Lcg/g;->E(Lcg/g;J)V

    .line 224
    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 228
    .line 229
    const-string v1, "Failed requirement."

    .line 230
    .line 231
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    throw v0

    .line 235
    :cond_e
    invoke-static {v0}, Lokhttp3/internal/http/HttpHeaders;->c(Lcg/g;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v6

    .line 239
    :goto_6
    if-nez v6, :cond_f

    .line 240
    .line 241
    goto :goto_7

    .line 242
    :cond_f
    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    check-cast v5, Ljava/lang/String;

    .line 247
    .line 248
    if-eqz v5, :cond_10

    .line 249
    .line 250
    goto :goto_7

    .line 251
    :cond_10
    invoke-static {v0}, Lokhttp3/internal/http/HttpHeaders;->e(Lcg/g;)Z

    .line 252
    .line 253
    .line 254
    move-result v5

    .line 255
    if-nez v5, :cond_11

    .line 256
    .line 257
    invoke-virtual {v0}, Lcg/g;->exhausted()Z

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    if-nez v5, :cond_11

    .line 262
    .line 263
    :goto_7
    return-void

    .line 264
    :cond_11
    move-object v5, v2

    .line 265
    goto/16 :goto_2
.end method

.method public static final c(Lcg/g;)Ljava/lang/String;
    .locals 4

    .line 1
    sget-object v0, Lokhttp3/internal/http/HttpHeaders;->b:Lcg/j;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcg/g;->m(Lcg/j;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, -0x1

    .line 8
    .line 9
    cmp-long v2, v0, v2

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    iget-wide v0, p0, Lcg/g;->b:J

    .line 14
    .line 15
    :cond_0
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    cmp-long v2, v0, v2

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    sget-object v2, LBf/a;->a:Ljava/nio/charset/Charset;

    .line 22
    .line 23
    invoke-virtual {p0, v0, v1, v2}, Lcg/g;->readString(JLjava/nio/charset/Charset;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method

.method public static final d(Lokhttp3/CookieJar;Lokhttp3/HttpUrl;Lokhttp3/Headers;)V
    .locals 36

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const-string v4, "<this>"

    .line 9
    .line 10
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v4, "url"

    .line 14
    .line 15
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v4, "headers"

    .line 19
    .line 20
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sget-object v4, Lokhttp3/CookieJar;->a:Lokhttp3/CookieJar;

    .line 24
    .line 25
    if-ne v1, v4, :cond_0

    .line 26
    .line 27
    goto/16 :goto_10

    .line 28
    .line 29
    :cond_0
    sget-object v4, Lokhttp3/Cookie;->j:Lokhttp3/Cookie$Companion;

    .line 30
    .line 31
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const-string v4, "Set-Cookie"

    .line 35
    .line 36
    invoke-virtual {v0, v4}, Lokhttp3/Headers;->g(Ljava/lang/String;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const/4 v6, 0x0

    .line 45
    move v0, v6

    .line 46
    const/4 v8, 0x0

    .line 47
    :goto_0
    if-ge v0, v5, :cond_20

    .line 48
    .line 49
    add-int/lit8 v9, v0, 0x1

    .line 50
    .line 51
    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    move-object v10, v0

    .line 56
    check-cast v10, Ljava/lang/String;

    .line 57
    .line 58
    const-string v0, "setCookie"

    .line 59
    .line 60
    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 64
    .line 65
    .line 66
    move-result-wide v11

    .line 67
    sget-object v0, Lokhttp3/internal/Util;->a:[B

    .line 68
    .line 69
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    const/16 v13, 0x3b

    .line 74
    .line 75
    invoke-static {v10, v13, v6, v0}, Lokhttp3/internal/Util;->e(Ljava/lang/String;CII)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    const/16 v14, 0x3d

    .line 80
    .line 81
    invoke-static {v10, v14, v6, v0}, Lokhttp3/internal/Util;->e(Ljava/lang/String;CII)I

    .line 82
    .line 83
    .line 84
    move-result v15

    .line 85
    if-ne v15, v0, :cond_1

    .line 86
    .line 87
    :goto_1
    move/from16 v27, v3

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_1
    invoke-static {v10, v6, v15}, Lokhttp3/internal/Util;->z(Ljava/lang/String;II)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v17

    .line 94
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    .line 95
    .line 96
    .line 97
    move-result v16

    .line 98
    if-nez v16, :cond_2

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_2
    move/from16 v27, v3

    .line 102
    .line 103
    invoke-static/range {v17 .. v17}, Lokhttp3/internal/Util;->l(Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    const/4 v7, -0x1

    .line 108
    if-eq v3, v7, :cond_3

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_3
    add-int/lit8 v15, v15, 0x1

    .line 112
    .line 113
    invoke-static {v10, v15, v0}, Lokhttp3/internal/Util;->z(Ljava/lang/String;II)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v18

    .line 117
    invoke-static/range {v18 .. v18}, Lokhttp3/internal/Util;->l(Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eq v3, v7, :cond_4

    .line 122
    .line 123
    :goto_2
    move v14, v6

    .line 124
    const/4 v0, 0x0

    .line 125
    goto/16 :goto_d

    .line 126
    .line 127
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 128
    .line 129
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    const-wide v19, 0xe677d21fdbffL

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    move/from16 v16, v6

    .line 139
    .line 140
    move/from16 v25, v16

    .line 141
    .line 142
    move/from16 v30, v25

    .line 143
    .line 144
    move-wide/from16 v28, v19

    .line 145
    .line 146
    move/from16 v26, v27

    .line 147
    .line 148
    const/4 v7, 0x0

    .line 149
    const/4 v15, 0x0

    .line 150
    const-wide/16 v21, -0x1

    .line 151
    .line 152
    const-wide/16 v23, -0x1

    .line 153
    .line 154
    :goto_3
    const-wide v31, 0x7fffffffffffffffL

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    const-wide/high16 v33, -0x8000000000000000L

    .line 160
    .line 161
    if-ge v0, v3, :cond_11

    .line 162
    .line 163
    invoke-static {v10, v13, v0, v3}, Lokhttp3/internal/Util;->e(Ljava/lang/String;CII)I

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    invoke-static {v10, v14, v0, v6}, Lokhttp3/internal/Util;->e(Ljava/lang/String;CII)I

    .line 168
    .line 169
    .line 170
    move-result v13

    .line 171
    invoke-static {v10, v0, v13}, Lokhttp3/internal/Util;->z(Ljava/lang/String;II)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    if-ge v13, v6, :cond_5

    .line 176
    .line 177
    add-int/lit8 v13, v13, 0x1

    .line 178
    .line 179
    invoke-static {v10, v13, v6}, Lokhttp3/internal/Util;->z(Ljava/lang/String;II)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v13

    .line 183
    goto :goto_4

    .line 184
    :cond_5
    const-string v13, ""

    .line 185
    .line 186
    :goto_4
    const-string v14, "expires"

    .line 187
    .line 188
    invoke-virtual {v0, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 189
    .line 190
    .line 191
    move-result v14

    .line 192
    if-eqz v14, :cond_6

    .line 193
    .line 194
    :try_start_0
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    invoke-static {v0, v13}, Lokhttp3/Cookie$Companion;->b(ILjava/lang/String;)J

    .line 199
    .line 200
    .line 201
    move-result-wide v28
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 202
    :goto_5
    move/from16 v25, v27

    .line 203
    .line 204
    goto/16 :goto_6

    .line 205
    .line 206
    :cond_6
    const-string v14, "max-age"

    .line 207
    .line 208
    invoke-virtual {v0, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 209
    .line 210
    .line 211
    move-result v14

    .line 212
    if-eqz v14, :cond_a

    .line 213
    .line 214
    :try_start_1
    invoke-static {v13}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 215
    .line 216
    .line 217
    move-result-wide v13
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 218
    const-wide/16 v21, 0x0

    .line 219
    .line 220
    cmp-long v0, v13, v21

    .line 221
    .line 222
    if-gtz v0, :cond_7

    .line 223
    .line 224
    move-wide/from16 v21, v33

    .line 225
    .line 226
    goto :goto_5

    .line 227
    :cond_7
    move-wide/from16 v21, v13

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :catch_0
    move-exception v0

    .line 231
    :try_start_2
    const-string v14, "-?\\d+"

    .line 232
    .line 233
    invoke-static {v14}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 234
    .line 235
    .line 236
    move-result-object v14

    .line 237
    move-object/from16 v35, v0

    .line 238
    .line 239
    const-string v0, "compile(...)"

    .line 240
    .line 241
    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v14, v13}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-eqz v0, :cond_9

    .line 253
    .line 254
    const-string v0, "-"

    .line 255
    .line 256
    const/4 v14, 0x0

    .line 257
    invoke-static {v13, v0, v14}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-eqz v0, :cond_8

    .line 262
    .line 263
    move-wide/from16 v31, v33

    .line 264
    .line 265
    :cond_8
    move-wide/from16 v21, v31

    .line 266
    .line 267
    goto :goto_5

    .line 268
    :cond_9
    throw v35
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 269
    :cond_a
    const-string v14, "domain"

    .line 270
    .line 271
    invoke-virtual {v0, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 272
    .line 273
    .line 274
    move-result v14

    .line 275
    if-eqz v14, :cond_d

    .line 276
    .line 277
    :try_start_3
    const-string v0, "."

    .line 278
    .line 279
    const/4 v14, 0x0

    .line 280
    invoke-static {v13, v0, v14}, LBf/r;->b0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 281
    .line 282
    .line 283
    move-result v31

    .line 284
    if-nez v31, :cond_c

    .line 285
    .line 286
    invoke-static {v13, v0}, LBf/k;->E0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-static {v0}, Lokhttp3/internal/HostnamesKt;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    if-eqz v0, :cond_b

    .line 295
    .line 296
    move-object v7, v0

    .line 297
    const/16 v26, 0x0

    .line 298
    .line 299
    goto :goto_6

    .line 300
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 301
    .line 302
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 303
    .line 304
    .line 305
    throw v0

    .line 306
    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 307
    .line 308
    const-string v13, "Failed requirement."

    .line 309
    .line 310
    invoke-direct {v0, v13}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    throw v0
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_1

    .line 314
    :cond_d
    const-string v14, "path"

    .line 315
    .line 316
    invoke-virtual {v0, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 317
    .line 318
    .line 319
    move-result v14

    .line 320
    if-eqz v14, :cond_e

    .line 321
    .line 322
    move-object v15, v13

    .line 323
    goto :goto_6

    .line 324
    :cond_e
    const-string v13, "secure"

    .line 325
    .line 326
    invoke-virtual {v0, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 327
    .line 328
    .line 329
    move-result v13

    .line 330
    if-eqz v13, :cond_f

    .line 331
    .line 332
    move/from16 v30, v27

    .line 333
    .line 334
    goto :goto_6

    .line 335
    :cond_f
    const-string v13, "httponly"

    .line 336
    .line 337
    invoke-virtual {v0, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-eqz v0, :cond_10

    .line 342
    .line 343
    move/from16 v16, v27

    .line 344
    .line 345
    :catch_1
    :cond_10
    :goto_6
    add-int/lit8 v0, v6, 0x1

    .line 346
    .line 347
    const/4 v6, 0x0

    .line 348
    const/16 v13, 0x3b

    .line 349
    .line 350
    const/16 v14, 0x3d

    .line 351
    .line 352
    goto/16 :goto_3

    .line 353
    .line 354
    :cond_11
    cmp-long v0, v21, v33

    .line 355
    .line 356
    if-nez v0, :cond_12

    .line 357
    .line 358
    move-wide/from16 v19, v33

    .line 359
    .line 360
    goto :goto_7

    .line 361
    :cond_12
    cmp-long v0, v21, v23

    .line 362
    .line 363
    if-eqz v0, :cond_15

    .line 364
    .line 365
    const-wide v13, 0x20c49ba5e353f7L

    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    cmp-long v0, v21, v13

    .line 371
    .line 372
    if-gtz v0, :cond_13

    .line 373
    .line 374
    const/16 v0, 0x3e8

    .line 375
    .line 376
    int-to-long v13, v0

    .line 377
    mul-long v31, v21, v13

    .line 378
    .line 379
    :cond_13
    add-long v31, v11, v31

    .line 380
    .line 381
    cmp-long v0, v31, v11

    .line 382
    .line 383
    if-ltz v0, :cond_16

    .line 384
    .line 385
    cmp-long v0, v31, v19

    .line 386
    .line 387
    if-lez v0, :cond_14

    .line 388
    .line 389
    goto :goto_7

    .line 390
    :cond_14
    move-wide/from16 v19, v31

    .line 391
    .line 392
    goto :goto_7

    .line 393
    :cond_15
    move-wide/from16 v19, v28

    .line 394
    .line 395
    :cond_16
    :goto_7
    iget-object v0, v2, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 396
    .line 397
    if-nez v7, :cond_17

    .line 398
    .line 399
    move-object v7, v0

    .line 400
    goto :goto_8

    .line 401
    :cond_17
    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move-result v3

    .line 405
    if-eqz v3, :cond_18

    .line 406
    .line 407
    goto :goto_8

    .line 408
    :cond_18
    const/4 v14, 0x0

    .line 409
    invoke-static {v0, v7, v14}, LBf/r;->b0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 410
    .line 411
    .line 412
    move-result v3

    .line 413
    if-eqz v3, :cond_19

    .line 414
    .line 415
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 416
    .line 417
    .line 418
    move-result v3

    .line 419
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 420
    .line 421
    .line 422
    move-result v6

    .line 423
    sub-int/2addr v3, v6

    .line 424
    add-int/lit8 v3, v3, -0x1

    .line 425
    .line 426
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 427
    .line 428
    .line 429
    move-result v3

    .line 430
    const/16 v6, 0x2e

    .line 431
    .line 432
    if-ne v3, v6, :cond_19

    .line 433
    .line 434
    sget-object v3, Lokhttp3/internal/Util;->f:LBf/i;

    .line 435
    .line 436
    invoke-virtual {v3, v0}, LBf/i;->b(Ljava/lang/String;)Z

    .line 437
    .line 438
    .line 439
    move-result v3

    .line 440
    if-nez v3, :cond_19

    .line 441
    .line 442
    :goto_8
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 443
    .line 444
    .line 445
    move-result v0

    .line 446
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 447
    .line 448
    .line 449
    move-result v3

    .line 450
    if-eq v0, v3, :cond_1a

    .line 451
    .line 452
    sget-object v0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->e:Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;

    .line 453
    .line 454
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 455
    .line 456
    .line 457
    sget-object v0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->h:Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;

    .line 458
    .line 459
    invoke-virtual {v0, v7}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    if-nez v0, :cond_1a

    .line 464
    .line 465
    :cond_19
    const/4 v14, 0x0

    .line 466
    const/16 v16, 0x0

    .line 467
    .line 468
    goto :goto_c

    .line 469
    :cond_1a
    const-string v0, "/"

    .line 470
    .line 471
    const/4 v14, 0x0

    .line 472
    if-eqz v15, :cond_1c

    .line 473
    .line 474
    invoke-static {v15, v0, v14}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 475
    .line 476
    .line 477
    move-result v3

    .line 478
    if-nez v3, :cond_1b

    .line 479
    .line 480
    goto :goto_a

    .line 481
    :cond_1b
    :goto_9
    move-object/from16 v22, v15

    .line 482
    .line 483
    move/from16 v24, v16

    .line 484
    .line 485
    goto :goto_b

    .line 486
    :cond_1c
    :goto_a
    invoke-virtual {v2}, Lokhttp3/HttpUrl;->b()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v3

    .line 490
    const/16 v6, 0x2f

    .line 491
    .line 492
    const/4 v10, 0x6

    .line 493
    invoke-static {v3, v6, v14, v10}, LBf/k;->B0(Ljava/lang/CharSequence;CII)I

    .line 494
    .line 495
    .line 496
    move-result v6

    .line 497
    if-eqz v6, :cond_1d

    .line 498
    .line 499
    invoke-virtual {v3, v14, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    const-string v3, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    .line 504
    .line 505
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    :cond_1d
    move-object v15, v0

    .line 509
    goto :goto_9

    .line 510
    :goto_b
    new-instance v16, Lokhttp3/Cookie;

    .line 511
    .line 512
    move-object/from16 v21, v7

    .line 513
    .line 514
    move/from16 v23, v30

    .line 515
    .line 516
    invoke-direct/range {v16 .. v26}, Lokhttp3/Cookie;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V

    .line 517
    .line 518
    .line 519
    :goto_c
    move-object/from16 v0, v16

    .line 520
    .line 521
    :goto_d
    if-nez v0, :cond_1e

    .line 522
    .line 523
    :goto_e
    move v0, v9

    .line 524
    move v6, v14

    .line 525
    move/from16 v3, v27

    .line 526
    .line 527
    goto/16 :goto_0

    .line 528
    .line 529
    :cond_1e
    if-nez v8, :cond_1f

    .line 530
    .line 531
    new-instance v3, Ljava/util/ArrayList;

    .line 532
    .line 533
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 534
    .line 535
    .line 536
    move-object v8, v3

    .line 537
    :cond_1f
    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    goto :goto_e

    .line 541
    :cond_20
    if-eqz v8, :cond_21

    .line 542
    .line 543
    invoke-static {v8}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    const-string v3, "{\n        Collections.un\u2026ableList(cookies)\n      }"

    .line 548
    .line 549
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    goto :goto_f

    .line 553
    :cond_21
    sget-object v0, Lff/v;->a:Lff/v;

    .line 554
    .line 555
    :goto_f
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 556
    .line 557
    .line 558
    move-result v3

    .line 559
    if-eqz v3, :cond_22

    .line 560
    .line 561
    :goto_10
    return-void

    .line 562
    :cond_22
    invoke-interface {v1, v2, v0}, Lokhttp3/CookieJar;->b(Lokhttp3/HttpUrl;Ljava/util/List;)V

    .line 563
    .line 564
    .line 565
    return-void
.end method

.method public static final e(Lcg/g;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, Lcg/g;->exhausted()Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_2

    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    invoke-virtual {p0, v1, v2}, Lcg/g;->o(J)B

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/16 v2, 0x2c

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lcg/g;->readByte()B

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/16 v2, 0x20

    .line 24
    .line 25
    if-ne v1, v2, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/16 v2, 0x9

    .line 29
    .line 30
    if-ne v1, v2, :cond_2

    .line 31
    .line 32
    :goto_1
    invoke-virtual {p0}, Lcg/g;->readByte()B

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    return v0
.end method
