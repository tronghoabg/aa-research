.class public final Lokhttp3/HttpUrl$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/HttpUrl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0019\n\u0002\u0008\u000b\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0006R\u0014\u0010\u0008\u001a\u00020\u00048\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\u00048\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0006\u00a8\u0006\u0014"
    }
    d2 = {
        "Lokhttp3/HttpUrl$Companion;",
        "",
        "<init>",
        "()V",
        "",
        "FORM_ENCODE_SET",
        "Ljava/lang/String;",
        "FRAGMENT_ENCODE_SET",
        "FRAGMENT_ENCODE_SET_URI",
        "",
        "HEX_DIGITS",
        "[C",
        "PASSWORD_ENCODE_SET",
        "PATH_SEGMENT_ENCODE_SET",
        "PATH_SEGMENT_ENCODE_SET_URI",
        "QUERY_COMPONENT_ENCODE_SET",
        "QUERY_COMPONENT_ENCODE_SET_URI",
        "QUERY_COMPONENT_REENCODE_SET",
        "QUERY_ENCODE_SET",
        "USERNAME_ENCODE_SET",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lokhttp3/HttpUrl$Companion;-><init>()V

    return-void
.end method

.method public static a(Lokhttp3/HttpUrl$Companion;Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    and-int/lit8 v2, p5, 0x1

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    move v2, v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move/from16 v2, p2

    .line 13
    .line 14
    :goto_0
    and-int/lit8 v4, p5, 0x2

    .line 15
    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move/from16 v4, p3

    .line 24
    .line 25
    :goto_1
    and-int/lit8 v5, p5, 0x8

    .line 26
    .line 27
    const/4 v6, 0x1

    .line 28
    if-eqz v5, :cond_2

    .line 29
    .line 30
    move v5, v3

    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move v5, v6

    .line 33
    :goto_2
    and-int/lit8 v7, p5, 0x10

    .line 34
    .line 35
    if-eqz v7, :cond_3

    .line 36
    .line 37
    move v7, v3

    .line 38
    goto :goto_3

    .line 39
    :cond_3
    move v7, v6

    .line 40
    :goto_3
    and-int/lit8 v8, p5, 0x20

    .line 41
    .line 42
    if-eqz v8, :cond_4

    .line 43
    .line 44
    move v8, v3

    .line 45
    goto :goto_4

    .line 46
    :cond_4
    move v8, v6

    .line 47
    :goto_4
    and-int/lit8 v9, p5, 0x40

    .line 48
    .line 49
    if-eqz v9, :cond_5

    .line 50
    .line 51
    goto :goto_5

    .line 52
    :cond_5
    move v3, v6

    .line 53
    :goto_5
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    const-string v6, "<this>"

    .line 57
    .line 58
    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    move v6, v2

    .line 62
    :goto_6
    if-ge v6, v4, :cond_13

    .line 63
    .line 64
    invoke-virtual {v0, v6}, Ljava/lang/String;->codePointAt(I)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    const/16 v10, 0x20

    .line 69
    .line 70
    const/16 v11, 0x80

    .line 71
    .line 72
    const/16 v12, 0x2b

    .line 73
    .line 74
    const/16 v13, 0x25

    .line 75
    .line 76
    const/16 v14, 0x7f

    .line 77
    .line 78
    if-lt v9, v10, :cond_9

    .line 79
    .line 80
    if-eq v9, v14, :cond_9

    .line 81
    .line 82
    if-lt v9, v11, :cond_6

    .line 83
    .line 84
    if-eqz v3, :cond_9

    .line 85
    .line 86
    :cond_6
    int-to-char v15, v9

    .line 87
    invoke-static {v1, v15}, LBf/k;->o0(Ljava/lang/CharSequence;C)Z

    .line 88
    .line 89
    .line 90
    move-result v15

    .line 91
    if-nez v15, :cond_9

    .line 92
    .line 93
    if-ne v9, v13, :cond_7

    .line 94
    .line 95
    if-eqz v5, :cond_9

    .line 96
    .line 97
    if-eqz v7, :cond_7

    .line 98
    .line 99
    invoke-static {v0, v6, v4}, Lokhttp3/HttpUrl$Companion;->d(Ljava/lang/String;II)Z

    .line 100
    .line 101
    .line 102
    move-result v15

    .line 103
    if-eqz v15, :cond_9

    .line 104
    .line 105
    :cond_7
    if-ne v9, v12, :cond_8

    .line 106
    .line 107
    if-eqz v8, :cond_8

    .line 108
    .line 109
    goto :goto_7

    .line 110
    :cond_8
    invoke-static {v9}, Ljava/lang/Character;->charCount(I)I

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    add-int/2addr v6, v9

    .line 115
    goto :goto_6

    .line 116
    :cond_9
    :goto_7
    new-instance v9, Lcg/g;

    .line 117
    .line 118
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v9, v2, v6, v0}, Lcg/g;->c0(IILjava/lang/String;)V

    .line 122
    .line 123
    .line 124
    const/4 v2, 0x0

    .line 125
    :goto_8
    if-ge v6, v4, :cond_12

    .line 126
    .line 127
    invoke-virtual {v0, v6}, Ljava/lang/String;->codePointAt(I)I

    .line 128
    .line 129
    .line 130
    move-result v15

    .line 131
    if-eqz v5, :cond_a

    .line 132
    .line 133
    const/16 v13, 0x9

    .line 134
    .line 135
    if-eq v15, v13, :cond_f

    .line 136
    .line 137
    const/16 v13, 0xa

    .line 138
    .line 139
    if-eq v15, v13, :cond_f

    .line 140
    .line 141
    const/16 v13, 0xc

    .line 142
    .line 143
    if-eq v15, v13, :cond_f

    .line 144
    .line 145
    const/16 v13, 0xd

    .line 146
    .line 147
    if-ne v15, v13, :cond_a

    .line 148
    .line 149
    goto :goto_a

    .line 150
    :cond_a
    if-ne v15, v12, :cond_c

    .line 151
    .line 152
    if-eqz v8, :cond_c

    .line 153
    .line 154
    if-eqz v5, :cond_b

    .line 155
    .line 156
    const-string v13, "+"

    .line 157
    .line 158
    goto :goto_9

    .line 159
    :cond_b
    const-string v13, "%2B"

    .line 160
    .line 161
    :goto_9
    invoke-virtual {v9, v13}, Lcg/g;->d0(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    goto :goto_a

    .line 165
    :cond_c
    if-lt v15, v10, :cond_10

    .line 166
    .line 167
    if-eq v15, v14, :cond_10

    .line 168
    .line 169
    if-lt v15, v11, :cond_d

    .line 170
    .line 171
    if-eqz v3, :cond_10

    .line 172
    .line 173
    :cond_d
    int-to-char v13, v15

    .line 174
    invoke-static {v1, v13}, LBf/k;->o0(Ljava/lang/CharSequence;C)Z

    .line 175
    .line 176
    .line 177
    move-result v13

    .line 178
    if-nez v13, :cond_10

    .line 179
    .line 180
    const/16 v13, 0x25

    .line 181
    .line 182
    if-ne v15, v13, :cond_e

    .line 183
    .line 184
    if-eqz v5, :cond_10

    .line 185
    .line 186
    if-eqz v7, :cond_e

    .line 187
    .line 188
    invoke-static {v0, v6, v4}, Lokhttp3/HttpUrl$Companion;->d(Ljava/lang/String;II)Z

    .line 189
    .line 190
    .line 191
    move-result v13

    .line 192
    if-nez v13, :cond_e

    .line 193
    .line 194
    goto :goto_b

    .line 195
    :cond_e
    invoke-virtual {v9, v15}, Lcg/g;->e0(I)V

    .line 196
    .line 197
    .line 198
    :cond_f
    :goto_a
    const/16 v11, 0x25

    .line 199
    .line 200
    goto :goto_d

    .line 201
    :cond_10
    :goto_b
    if-nez v2, :cond_11

    .line 202
    .line 203
    new-instance v2, Lcg/g;

    .line 204
    .line 205
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 206
    .line 207
    .line 208
    :cond_11
    invoke-virtual {v2, v15}, Lcg/g;->e0(I)V

    .line 209
    .line 210
    .line 211
    :goto_c
    invoke-virtual {v2}, Lcg/g;->exhausted()Z

    .line 212
    .line 213
    .line 214
    move-result v13

    .line 215
    if-nez v13, :cond_f

    .line 216
    .line 217
    invoke-virtual {v2}, Lcg/g;->readByte()B

    .line 218
    .line 219
    .line 220
    move-result v13

    .line 221
    and-int/lit16 v10, v13, 0xff

    .line 222
    .line 223
    const/16 v11, 0x25

    .line 224
    .line 225
    invoke-virtual {v9, v11}, Lcg/g;->X(I)V

    .line 226
    .line 227
    .line 228
    sget-object v16, Lokhttp3/HttpUrl;->l:[C

    .line 229
    .line 230
    shr-int/lit8 v10, v10, 0x4

    .line 231
    .line 232
    and-int/lit8 v10, v10, 0xf

    .line 233
    .line 234
    aget-char v10, v16, v10

    .line 235
    .line 236
    invoke-virtual {v9, v10}, Lcg/g;->X(I)V

    .line 237
    .line 238
    .line 239
    and-int/lit8 v10, v13, 0xf

    .line 240
    .line 241
    aget-char v10, v16, v10

    .line 242
    .line 243
    invoke-virtual {v9, v10}, Lcg/g;->X(I)V

    .line 244
    .line 245
    .line 246
    const/16 v10, 0x20

    .line 247
    .line 248
    const/16 v11, 0x80

    .line 249
    .line 250
    goto :goto_c

    .line 251
    :goto_d
    invoke-static {v15}, Ljava/lang/Character;->charCount(I)I

    .line 252
    .line 253
    .line 254
    move-result v10

    .line 255
    add-int/2addr v6, v10

    .line 256
    move v13, v11

    .line 257
    const/16 v10, 0x20

    .line 258
    .line 259
    const/16 v11, 0x80

    .line 260
    .line 261
    goto/16 :goto_8

    .line 262
    .line 263
    :cond_12
    invoke-virtual {v9}, Lcg/g;->readUtf8()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    return-object v0

    .line 268
    :cond_13
    invoke-virtual {v0, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    const-string v1, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    .line 273
    .line 274
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    return-object v0
.end method

.method public static b(Ljava/lang/String;)I
    .locals 1

    .line 1
    const-string v0, "scheme"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "http"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/16 p0, 0x50

    .line 15
    .line 16
    return p0

    .line 17
    :cond_0
    const-string v0, "https"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    const/16 p0, 0x1bb

    .line 26
    .line 27
    return p0

    .line 28
    :cond_1
    const/4 p0, -0x1

    .line 29
    return p0
.end method

.method public static c(Ljava/lang/String;)Lokhttp3/HttpUrl;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lokhttp3/HttpUrl$Builder;

    .line 7
    .line 8
    invoke-direct {v0}, Lokhttp3/HttpUrl$Builder;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1, p0}, Lokhttp3/HttpUrl$Builder;->b(Lokhttp3/HttpUrl;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lokhttp3/HttpUrl$Builder;->a()Lokhttp3/HttpUrl;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static d(Ljava/lang/String;II)Z
    .locals 2

    .line 1
    add-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    if-ge v0, p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    const/16 v1, 0x25

    .line 10
    .line 11
    if-ne p2, v1, :cond_0

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    add-int/2addr p1, p2

    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-static {p1}, Lokhttp3/internal/Util;->q(C)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 v1, -0x1

    .line 24
    if-eq p1, v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-static {p0}, Lokhttp3/internal/Util;->q(C)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eq p0, v1, :cond_0

    .line 35
    .line 36
    return p2

    .line 37
    :cond_0
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public static e(Lokhttp3/HttpUrl$Companion;Ljava/lang/String;III)Ljava/lang/String;
    .locals 7

    .line 1
    and-int/lit8 v0, p4, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p2, v1

    .line 7
    :cond_0
    and-int/lit8 v0, p4, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 16
    .line 17
    if-eqz p4, :cond_2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    const/4 v1, 0x1

    .line 21
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const-string p0, "<this>"

    .line 25
    .line 26
    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    move p0, p2

    .line 30
    :goto_1
    if-ge p0, p3, :cond_8

    .line 31
    .line 32
    add-int/lit8 p4, p0, 0x1

    .line 33
    .line 34
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/16 v2, 0x2b

    .line 39
    .line 40
    const/16 v3, 0x25

    .line 41
    .line 42
    if-eq v0, v3, :cond_4

    .line 43
    .line 44
    if-ne v0, v2, :cond_3

    .line 45
    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_3
    move p0, p4

    .line 50
    goto :goto_1

    .line 51
    :cond_4
    :goto_2
    new-instance p4, Lcg/g;

    .line 52
    .line 53
    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p4, p2, p0, p1}, Lcg/g;->c0(IILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :goto_3
    if-ge p0, p3, :cond_7

    .line 60
    .line 61
    invoke-virtual {p1, p0}, Ljava/lang/String;->codePointAt(I)I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    if-ne p2, v3, :cond_5

    .line 66
    .line 67
    add-int/lit8 v0, p0, 0x2

    .line 68
    .line 69
    if-ge v0, p3, :cond_5

    .line 70
    .line 71
    add-int/lit8 v4, p0, 0x1

    .line 72
    .line 73
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    invoke-static {v4}, Lokhttp3/internal/Util;->q(C)I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    invoke-static {v5}, Lokhttp3/internal/Util;->q(C)I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    const/4 v6, -0x1

    .line 90
    if-eq v4, v6, :cond_6

    .line 91
    .line 92
    if-eq v5, v6, :cond_6

    .line 93
    .line 94
    shl-int/lit8 p0, v4, 0x4

    .line 95
    .line 96
    add-int/2addr p0, v5

    .line 97
    invoke-virtual {p4, p0}, Lcg/g;->X(I)V

    .line 98
    .line 99
    .line 100
    invoke-static {p2}, Ljava/lang/Character;->charCount(I)I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    add-int/2addr p0, v0

    .line 105
    goto :goto_3

    .line 106
    :cond_5
    if-ne p2, v2, :cond_6

    .line 107
    .line 108
    if-eqz v1, :cond_6

    .line 109
    .line 110
    const/16 p2, 0x20

    .line 111
    .line 112
    invoke-virtual {p4, p2}, Lcg/g;->X(I)V

    .line 113
    .line 114
    .line 115
    add-int/lit8 p0, p0, 0x1

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_6
    invoke-virtual {p4, p2}, Lcg/g;->e0(I)V

    .line 119
    .line 120
    .line 121
    invoke-static {p2}, Ljava/lang/Character;->charCount(I)I

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    add-int/2addr p0, p2

    .line 126
    goto :goto_3

    .line 127
    :cond_7
    invoke-virtual {p4}, Lcg/g;->readUtf8()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0

    .line 132
    :cond_8
    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    const-string p1, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    .line 137
    .line 138
    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    return-object p0
.end method

.method public static f(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 6

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
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-gt v1, v2, :cond_3

    .line 12
    .line 13
    const/16 v2, 0x26

    .line 14
    .line 15
    const/4 v3, 0x4

    .line 16
    invoke-static {p0, v2, v1, v3}, LBf/k;->v0(Ljava/lang/CharSequence;CII)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v4, -0x1

    .line 21
    if-ne v2, v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    :cond_0
    const/16 v5, 0x3d

    .line 28
    .line 29
    invoke-static {p0, v5, v1, v3}, LBf/k;->v0(Ljava/lang/CharSequence;CII)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const-string v5, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    .line 34
    .line 35
    if-eq v3, v4, :cond_2

    .line 36
    .line 37
    if-le v3, v2, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    :goto_1
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    const/4 v1, 0x0

    .line 74
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    :goto_2
    add-int/lit8 v1, v2, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    return-object v0
.end method

.method public static g(Ljava/util/ArrayList;Ljava/lang/StringBuilder;)V
    .locals 7

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v0, v1}, Landroid/support/v4/media/session/b;->u0(II)Lzf/g;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x2

    .line 16
    invoke-static {v0, v1}, Landroid/support/v4/media/session/b;->r0(Lzf/g;I)Lzf/e;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget v1, v0, Lzf/e;->a:I

    .line 21
    .line 22
    iget v2, v0, Lzf/e;->b:I

    .line 23
    .line 24
    iget v0, v0, Lzf/e;->c:I

    .line 25
    .line 26
    if-lez v0, :cond_0

    .line 27
    .line 28
    if-le v1, v2, :cond_1

    .line 29
    .line 30
    :cond_0
    if-gez v0, :cond_5

    .line 31
    .line 32
    if-gt v2, v1, :cond_5

    .line 33
    .line 34
    :cond_1
    :goto_0
    add-int v3, v1, v0

    .line 35
    .line 36
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Ljava/lang/String;

    .line 41
    .line 42
    add-int/lit8 v5, v1, 0x1

    .line 43
    .line 44
    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    check-cast v5, Ljava/lang/String;

    .line 49
    .line 50
    if-lez v1, :cond_2

    .line 51
    .line 52
    const/16 v6, 0x26

    .line 53
    .line 54
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    :cond_2
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    if-eqz v5, :cond_3

    .line 61
    .line 62
    const/16 v4, 0x3d

    .line 63
    .line 64
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    :cond_3
    if-ne v1, v2, :cond_4

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    move v1, v3

    .line 74
    goto :goto_0

    .line 75
    :cond_5
    :goto_1
    return-void
.end method
