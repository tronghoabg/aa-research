.class public Lorg/apache/tika/detect/MagicDetector;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/detect/Detector;


# instance fields
.field private final isRegex:Z

.field private final isStringIgnoreCase:Z

.field private final length:I

.field private final mask:[B

.field private final offsetRangeBegin:I

.field private final offsetRangeEnd:I

.field private final pattern:[B

.field private final patternLength:I

.field private final type:Lorg/apache/tika/mime/MediaType;


# direct methods
.method public constructor <init>(Lorg/apache/tika/mime/MediaType;[B)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lorg/apache/tika/detect/MagicDetector;-><init>(Lorg/apache/tika/mime/MediaType;[BI)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/mime/MediaType;[BI)V
    .locals 6

    const/4 v3, 0x0

    move v5, p3

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v4, p3

    .line 2
    invoke-direct/range {v0 .. v5}, Lorg/apache/tika/detect/MagicDetector;-><init>(Lorg/apache/tika/mime/MediaType;[B[BII)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/mime/MediaType;[B[BII)V
    .locals 7

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v5, p4

    move v6, p5

    .line 3
    invoke-direct/range {v0 .. v6}, Lorg/apache/tika/detect/MagicDetector;-><init>(Lorg/apache/tika/mime/MediaType;[B[BZII)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/mime/MediaType;[B[BZII)V
    .locals 8

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v6, p5

    move v7, p6

    .line 4
    invoke-direct/range {v0 .. v7}, Lorg/apache/tika/detect/MagicDetector;-><init>(Lorg/apache/tika/mime/MediaType;[B[BZZII)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/tika/mime/MediaType;[B[BZZII)V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_7

    if-eqz p2, :cond_6

    if-ltz p6, :cond_5

    if-lt p7, p6, :cond_5

    .line 6
    iput-object p1, p0, Lorg/apache/tika/detect/MagicDetector;->type:Lorg/apache/tika/mime/MediaType;

    .line 7
    iput-boolean p4, p0, Lorg/apache/tika/detect/MagicDetector;->isRegex:Z

    .line 8
    iput-boolean p5, p0, Lorg/apache/tika/detect/MagicDetector;->isStringIgnoreCase:Z

    .line 9
    array-length p1, p2

    const/4 p5, 0x0

    if-eqz p3, :cond_0

    array-length v0, p3

    goto :goto_0

    :cond_0
    move v0, p5

    :goto_0
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lorg/apache/tika/detect/MagicDetector;->patternLength:I

    if-eqz p4, :cond_1

    const/16 p4, 0x2000

    .line 10
    iput p4, p0, Lorg/apache/tika/detect/MagicDetector;->length:I

    goto :goto_1

    .line 11
    :cond_1
    iput p1, p0, Lorg/apache/tika/detect/MagicDetector;->length:I

    .line 12
    :goto_1
    new-array p4, p1, [B

    iput-object p4, p0, Lorg/apache/tika/detect/MagicDetector;->mask:[B

    .line 13
    new-array p1, p1, [B

    iput-object p1, p0, Lorg/apache/tika/detect/MagicDetector;->pattern:[B

    move p1, p5

    .line 14
    :goto_2
    iget p4, p0, Lorg/apache/tika/detect/MagicDetector;->patternLength:I

    if-ge p1, p4, :cond_4

    if-eqz p3, :cond_2

    .line 15
    array-length p4, p3

    if-ge p1, p4, :cond_2

    .line 16
    iget-object p4, p0, Lorg/apache/tika/detect/MagicDetector;->mask:[B

    aget-byte v0, p3, p1

    aput-byte v0, p4, p1

    goto :goto_3

    .line 17
    :cond_2
    iget-object p4, p0, Lorg/apache/tika/detect/MagicDetector;->mask:[B

    const/4 v0, -0x1

    aput-byte v0, p4, p1

    .line 18
    :goto_3
    array-length p4, p2

    if-ge p1, p4, :cond_3

    .line 19
    iget-object p4, p0, Lorg/apache/tika/detect/MagicDetector;->pattern:[B

    aget-byte v0, p2, p1

    iget-object v1, p0, Lorg/apache/tika/detect/MagicDetector;->mask:[B

    aget-byte v1, v1, p1

    and-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, p4, p1

    goto :goto_4

    .line 20
    :cond_3
    iget-object p4, p0, Lorg/apache/tika/detect/MagicDetector;->pattern:[B

    aput-byte p5, p4, p1

    :goto_4
    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    .line 21
    :cond_4
    iput p6, p0, Lorg/apache/tika/detect/MagicDetector;->offsetRangeBegin:I

    .line 22
    iput p7, p0, Lorg/apache/tika/detect/MagicDetector;->offsetRangeEnd:I

    return-void

    .line 23
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid offset range: ["

    const-string p3, ","

    const-string p4, "]"

    .line 24
    invoke-static {p2, p6, p3, p7, p4}, LN0/a;->e(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 25
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 26
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Magic match pattern is null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 27
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Matching media type is null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static decodeString(Ljava/lang/String;Ljava/lang/String;)[B
    .locals 7

    .line 1
    const-string v0, "0x"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x10

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    add-int/lit8 p1, p1, -0x2

    .line 17
    .line 18
    div-int/lit8 p1, p1, 0x2

    .line 19
    .line 20
    new-array v0, p1, [B

    .line 21
    .line 22
    :goto_0
    if-ge v2, p1, :cond_0

    .line 23
    .line 24
    mul-int/lit8 v3, v2, 0x2

    .line 25
    .line 26
    add-int/lit8 v4, v3, 0x2

    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x4

    .line 29
    .line 30
    invoke-virtual {p0, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v3, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    int-to-byte v3, v3

    .line 39
    aput-byte v3, v0, v2

    .line 40
    .line 41
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    return-object v0

    .line 45
    :cond_1
    new-instance v0, Ljava/io/CharArrayWriter;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/io/CharArrayWriter;-><init>()V

    .line 48
    .line 49
    .line 50
    move v3, v2

    .line 51
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-ge v3, v4, :cond_8

    .line 56
    .line 57
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    const/16 v5, 0x5c

    .line 62
    .line 63
    if-ne v4, v5, :cond_7

    .line 64
    .line 65
    add-int/lit8 v4, v3, 0x1

    .line 66
    .line 67
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-ne v6, v5, :cond_2

    .line 72
    .line 73
    invoke-virtual {v0, v5}, Ljava/io/CharArrayWriter;->write(I)V

    .line 74
    .line 75
    .line 76
    :goto_2
    move v3, v4

    .line 77
    goto/16 :goto_4

    .line 78
    .line 79
    :cond_2
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    const/16 v6, 0x78

    .line 84
    .line 85
    if-ne v5, v6, :cond_3

    .line 86
    .line 87
    add-int/lit8 v4, v3, 0x2

    .line 88
    .line 89
    add-int/lit8 v5, v3, 0x4

    .line 90
    .line 91
    invoke-virtual {p0, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-static {v4, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    invoke-virtual {v0, v4}, Ljava/io/CharArrayWriter;->write(I)V

    .line 100
    .line 101
    .line 102
    add-int/lit8 v3, v3, 0x3

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_3
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    const/16 v6, 0x72

    .line 110
    .line 111
    if-ne v5, v6, :cond_4

    .line 112
    .line 113
    const/16 v3, 0xd

    .line 114
    .line 115
    invoke-virtual {v0, v3}, Ljava/io/CharArrayWriter;->write(I)V

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_4
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    const/16 v6, 0x6e

    .line 124
    .line 125
    if-ne v5, v6, :cond_5

    .line 126
    .line 127
    const/16 v3, 0xa

    .line 128
    .line 129
    invoke-virtual {v0, v3}, Ljava/io/CharArrayWriter;->write(I)V

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_5
    move v5, v4

    .line 134
    :goto_3
    add-int/lit8 v6, v3, 0x4

    .line 135
    .line 136
    if-ge v5, v6, :cond_6

    .line 137
    .line 138
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    if-ge v5, v6, :cond_6

    .line 143
    .line 144
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    invoke-static {v6}, Ljava/lang/Character;->isDigit(C)Z

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    if-eqz v6, :cond_6

    .line 153
    .line 154
    add-int/lit8 v5, v5, 0x1

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_6
    invoke-virtual {p0, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    new-instance v4, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    const-string v6, "0"

    .line 164
    .line 165
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    invoke-static {v3}, Ljava/lang/Short;->decode(Ljava/lang/String;)Ljava/lang/Short;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-virtual {v3}, Ljava/lang/Short;->byteValue()B

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    invoke-virtual {v0, v3}, Ljava/io/CharArrayWriter;->write(I)V

    .line 184
    .line 185
    .line 186
    add-int/lit8 v3, v5, -0x1

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_7
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    invoke-virtual {v0, v4}, Ljava/io/CharArrayWriter;->write(I)V

    .line 194
    .line 195
    .line 196
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 197
    .line 198
    goto/16 :goto_1

    .line 199
    .line 200
    :cond_8
    invoke-virtual {v0}, Ljava/io/CharArrayWriter;->toCharArray()[C

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    const-string v0, "unicodeLE"

    .line 205
    .line 206
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_a

    .line 211
    .line 212
    array-length p1, p0

    .line 213
    mul-int/lit8 p1, p1, 0x2

    .line 214
    .line 215
    new-array p1, p1, [B

    .line 216
    .line 217
    :goto_5
    array-length v0, p0

    .line 218
    if-ge v2, v0, :cond_9

    .line 219
    .line 220
    mul-int/lit8 v0, v2, 0x2

    .line 221
    .line 222
    aget-char v1, p0, v2

    .line 223
    .line 224
    and-int/lit16 v3, v1, 0xff

    .line 225
    .line 226
    int-to-byte v3, v3

    .line 227
    aput-byte v3, p1, v0

    .line 228
    .line 229
    add-int/lit8 v0, v0, 0x1

    .line 230
    .line 231
    shr-int/lit8 v1, v1, 0x8

    .line 232
    .line 233
    int-to-byte v1, v1

    .line 234
    aput-byte v1, p1, v0

    .line 235
    .line 236
    add-int/lit8 v2, v2, 0x1

    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_9
    return-object p1

    .line 240
    :cond_a
    const-string v0, "unicodeBE"

    .line 241
    .line 242
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result p1

    .line 246
    if-eqz p1, :cond_c

    .line 247
    .line 248
    array-length p1, p0

    .line 249
    mul-int/lit8 p1, p1, 0x2

    .line 250
    .line 251
    new-array p1, p1, [B

    .line 252
    .line 253
    :goto_6
    array-length v0, p0

    .line 254
    if-ge v2, v0, :cond_b

    .line 255
    .line 256
    mul-int/lit8 v0, v2, 0x2

    .line 257
    .line 258
    aget-char v1, p0, v2

    .line 259
    .line 260
    shr-int/lit8 v3, v1, 0x8

    .line 261
    .line 262
    int-to-byte v3, v3

    .line 263
    aput-byte v3, p1, v0

    .line 264
    .line 265
    add-int/lit8 v0, v0, 0x1

    .line 266
    .line 267
    and-int/lit16 v1, v1, 0xff

    .line 268
    .line 269
    int-to-byte v1, v1

    .line 270
    aput-byte v1, p1, v0

    .line 271
    .line 272
    add-int/lit8 v2, v2, 0x1

    .line 273
    .line 274
    goto :goto_6

    .line 275
    :cond_b
    return-object p1

    .line 276
    :cond_c
    array-length p1, p0

    .line 277
    new-array v0, p1, [B

    .line 278
    .line 279
    :goto_7
    if-ge v2, p1, :cond_d

    .line 280
    .line 281
    aget-char v1, p0, v2

    .line 282
    .line 283
    int-to-byte v1, v1

    .line 284
    aput-byte v1, v0, v2

    .line 285
    .line 286
    add-int/lit8 v2, v2, 0x1

    .line 287
    .line 288
    goto :goto_7

    .line 289
    :cond_d
    return-object v0
.end method

.method private static decodeValue(Ljava/lang/String;Ljava/lang/String;)[B
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x4

    .line 7
    const/4 v5, 0x3

    .line 8
    const/4 v6, 0x2

    .line 9
    const/16 v7, 0x8

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    if-eqz v0, :cond_e

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto/16 :goto_2

    .line 17
    .line 18
    :cond_0
    const-string v9, "0x"

    .line 19
    .line 20
    invoke-virtual {v0, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v9

    .line 24
    const/16 v10, 0x10

    .line 25
    .line 26
    if-eqz v9, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v9

    .line 32
    move v11, v10

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v9, v0

    .line 35
    move v11, v7

    .line 36
    :goto_0
    const-wide/16 v12, 0xff

    .line 37
    .line 38
    const-wide/32 v14, 0xff00

    .line 39
    .line 40
    .line 41
    const-wide/32 v16, 0xff0000

    .line 42
    .line 43
    .line 44
    const/16 v18, 0x18

    .line 45
    .line 46
    const-wide/32 v19, -0x1000000

    .line 47
    .line 48
    .line 49
    const/16 v21, -0x1

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v22

    .line 55
    sparse-switch v22, :sswitch_data_0

    .line 56
    .line 57
    .line 58
    const/16 v22, 0x0

    .line 59
    .line 60
    goto/16 :goto_1

    .line 61
    .line 62
    :sswitch_0
    const/16 v22, 0x0

    .line 63
    .line 64
    const-string v2, "little32"

    .line 65
    .line 66
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-nez v2, :cond_2

    .line 71
    .line 72
    goto/16 :goto_1

    .line 73
    .line 74
    :cond_2
    const/16 v21, 0xb

    .line 75
    .line 76
    goto/16 :goto_1

    .line 77
    .line 78
    :sswitch_1
    const/16 v22, 0x0

    .line 79
    .line 80
    const-string v2, "little16"

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-nez v2, :cond_3

    .line 87
    .line 88
    goto/16 :goto_1

    .line 89
    .line 90
    :cond_3
    const/16 v21, 0xa

    .line 91
    .line 92
    goto/16 :goto_1

    .line 93
    .line 94
    :sswitch_2
    const/16 v22, 0x0

    .line 95
    .line 96
    const-string v2, "regex"

    .line 97
    .line 98
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-nez v2, :cond_4

    .line 103
    .line 104
    goto/16 :goto_1

    .line 105
    .line 106
    :cond_4
    const/16 v21, 0x9

    .line 107
    .line 108
    goto/16 :goto_1

    .line 109
    .line 110
    :sswitch_3
    const/16 v22, 0x0

    .line 111
    .line 112
    const-string v2, "big32"

    .line 113
    .line 114
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-nez v2, :cond_5

    .line 119
    .line 120
    goto/16 :goto_1

    .line 121
    .line 122
    :cond_5
    move/from16 v21, v7

    .line 123
    .line 124
    goto/16 :goto_1

    .line 125
    .line 126
    :sswitch_4
    const/16 v22, 0x0

    .line 127
    .line 128
    const-string v2, "big16"

    .line 129
    .line 130
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-nez v2, :cond_6

    .line 135
    .line 136
    goto/16 :goto_1

    .line 137
    .line 138
    :cond_6
    const/16 v21, 0x7

    .line 139
    .line 140
    goto/16 :goto_1

    .line 141
    .line 142
    :sswitch_5
    const/16 v22, 0x0

    .line 143
    .line 144
    const-string v2, "byte"

    .line 145
    .line 146
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-nez v2, :cond_7

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_7
    const/16 v21, 0x6

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :sswitch_6
    const/16 v22, 0x0

    .line 157
    .line 158
    const-string v2, "stringignorecase"

    .line 159
    .line 160
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-nez v2, :cond_8

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_8
    const/16 v21, 0x5

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :sswitch_7
    const/16 v22, 0x0

    .line 171
    .line 172
    const-string v2, "string"

    .line 173
    .line 174
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    if-nez v2, :cond_9

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_9
    move/from16 v21, v4

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :sswitch_8
    const/16 v22, 0x0

    .line 185
    .line 186
    const-string v2, "unicodeLE"

    .line 187
    .line 188
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    if-nez v2, :cond_a

    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_a
    move/from16 v21, v5

    .line 196
    .line 197
    goto :goto_1

    .line 198
    :sswitch_9
    const/16 v22, 0x0

    .line 199
    .line 200
    const-string v2, "unicodeBE"

    .line 201
    .line 202
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-nez v2, :cond_b

    .line 207
    .line 208
    goto :goto_1

    .line 209
    :cond_b
    move/from16 v21, v6

    .line 210
    .line 211
    goto :goto_1

    .line 212
    :sswitch_a
    const/16 v22, 0x0

    .line 213
    .line 214
    const-string v2, "host32"

    .line 215
    .line 216
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    if-nez v2, :cond_c

    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_c
    move/from16 v21, v3

    .line 224
    .line 225
    goto :goto_1

    .line 226
    :sswitch_b
    const/16 v22, 0x0

    .line 227
    .line 228
    const-string v2, "host16"

    .line 229
    .line 230
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    if-nez v2, :cond_d

    .line 235
    .line 236
    goto :goto_1

    .line 237
    :cond_d
    move/from16 v21, v22

    .line 238
    .line 239
    :goto_1
    packed-switch v21, :pswitch_data_0

    .line 240
    .line 241
    .line 242
    return-object v8

    .line 243
    :pswitch_0
    invoke-static {v9, v11}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    .line 244
    .line 245
    .line 246
    move-result-wide v0

    .line 247
    new-array v2, v4, [B

    .line 248
    .line 249
    and-long v8, v0, v19

    .line 250
    .line 251
    shr-long v8, v8, v18

    .line 252
    .line 253
    long-to-int v4, v8

    .line 254
    int-to-byte v4, v4

    .line 255
    aput-byte v4, v2, v22

    .line 256
    .line 257
    and-long v8, v0, v16

    .line 258
    .line 259
    shr-long/2addr v8, v10

    .line 260
    long-to-int v4, v8

    .line 261
    int-to-byte v4, v4

    .line 262
    aput-byte v4, v2, v3

    .line 263
    .line 264
    and-long v3, v0, v14

    .line 265
    .line 266
    shr-long/2addr v3, v7

    .line 267
    long-to-int v3, v3

    .line 268
    int-to-byte v3, v3

    .line 269
    aput-byte v3, v2, v6

    .line 270
    .line 271
    and-long/2addr v0, v12

    .line 272
    long-to-int v0, v0

    .line 273
    int-to-byte v0, v0

    .line 274
    aput-byte v0, v2, v5

    .line 275
    .line 276
    return-object v2

    .line 277
    :pswitch_1
    invoke-static {v9, v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    new-array v1, v6, [B

    .line 282
    .line 283
    shr-int/lit8 v2, v0, 0x8

    .line 284
    .line 285
    int-to-byte v2, v2

    .line 286
    aput-byte v2, v1, v22

    .line 287
    .line 288
    and-int/lit16 v0, v0, 0xff

    .line 289
    .line 290
    int-to-byte v0, v0

    .line 291
    aput-byte v0, v1, v3

    .line 292
    .line 293
    return-object v1

    .line 294
    :pswitch_2
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 295
    .line 296
    invoke-virtual {v9, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    return-object v0

    .line 301
    :pswitch_3
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 302
    .line 303
    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-static {v0, v1}, Lorg/apache/tika/detect/MagicDetector;->decodeString(Ljava/lang/String;Ljava/lang/String;)[B

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    return-object v0

    .line 312
    :pswitch_4
    invoke-static/range {p0 .. p1}, Lorg/apache/tika/detect/MagicDetector;->decodeString(Ljava/lang/String;Ljava/lang/String;)[B

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    return-object v0

    .line 317
    :pswitch_5
    invoke-static {v9, v11}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    .line 318
    .line 319
    .line 320
    move-result-wide v0

    .line 321
    new-array v2, v4, [B

    .line 322
    .line 323
    and-long v8, v0, v12

    .line 324
    .line 325
    long-to-int v4, v8

    .line 326
    int-to-byte v4, v4

    .line 327
    aput-byte v4, v2, v22

    .line 328
    .line 329
    and-long v8, v0, v14

    .line 330
    .line 331
    shr-long v7, v8, v7

    .line 332
    .line 333
    long-to-int v4, v7

    .line 334
    int-to-byte v4, v4

    .line 335
    aput-byte v4, v2, v3

    .line 336
    .line 337
    and-long v3, v0, v16

    .line 338
    .line 339
    shr-long/2addr v3, v10

    .line 340
    long-to-int v3, v3

    .line 341
    int-to-byte v3, v3

    .line 342
    aput-byte v3, v2, v6

    .line 343
    .line 344
    and-long v0, v0, v19

    .line 345
    .line 346
    shr-long v0, v0, v18

    .line 347
    .line 348
    long-to-int v0, v0

    .line 349
    int-to-byte v0, v0

    .line 350
    aput-byte v0, v2, v5

    .line 351
    .line 352
    return-object v2

    .line 353
    :pswitch_6
    invoke-static {v9, v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    new-array v1, v6, [B

    .line 358
    .line 359
    and-int/lit16 v2, v0, 0xff

    .line 360
    .line 361
    int-to-byte v2, v2

    .line 362
    aput-byte v2, v1, v22

    .line 363
    .line 364
    shr-int/2addr v0, v7

    .line 365
    int-to-byte v0, v0

    .line 366
    aput-byte v0, v1, v3

    .line 367
    .line 368
    return-object v1

    .line 369
    :cond_e
    :goto_2
    return-object v8

    .line 370
    nop

    .line 371
    :sswitch_data_0
    .sparse-switch
        -0x4835ce33 -> :sswitch_b
        -0x4835cdf9 -> :sswitch_a
        -0x384ec020 -> :sswitch_9
        -0x384ebeea -> :sswitch_8
        -0x352a9fef -> :sswitch_7
        -0x20af812d -> :sswitch_6
        0x2e6108 -> :sswitch_5
        0x5964325 -> :sswitch_4
        0x596435f -> :sswitch_3
        0x675f047 -> :sswitch_2
        0x51f4a39b -> :sswitch_1
        0x51f4a3d5 -> :sswitch_0
    .end sparse-switch

    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method

.method public static parse(Lorg/apache/tika/mime/MediaType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/apache/tika/detect/MagicDetector;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    const/16 v1, 0x3a

    .line 5
    .line 6
    invoke-virtual {p2, v1}, Ljava/lang/String;->indexOf(I)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, -0x1

    .line 11
    if-ne v1, v2, :cond_1

    .line 12
    .line 13
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    :cond_0
    move v7, v0

    .line 18
    move v8, v7

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    invoke-virtual {p2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    move v8, p2

    .line 39
    move v7, v0

    .line 40
    :goto_0
    invoke-static {p3, p1}, Lorg/apache/tika/detect/MagicDetector;->decodeValue(Ljava/lang/String;Ljava/lang/String;)[B

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    if-eqz p4, :cond_2

    .line 45
    .line 46
    invoke-static {p4, p1}, Lorg/apache/tika/detect/MagicDetector;->decodeValue(Ljava/lang/String;Ljava/lang/String;)[B

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    :goto_1
    move-object v4, p2

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    const/4 p2, 0x0

    .line 53
    goto :goto_1

    .line 54
    :goto_2
    new-instance v1, Lorg/apache/tika/detect/MagicDetector;

    .line 55
    .line 56
    const-string p2, "regex"

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    const-string p2, "stringignorecase"

    .line 63
    .line 64
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    move-object v2, p0

    .line 69
    invoke-direct/range {v1 .. v8}, Lorg/apache/tika/detect/MagicDetector;-><init>(Lorg/apache/tika/mime/MediaType;[B[BZZII)V

    .line 70
    .line 71
    .line 72
    return-object v1
.end method


# virtual methods
.method public detect(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/mime/MediaType;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lorg/apache/tika/mime/MediaType;->OCTET_STREAM:Lorg/apache/tika/mime/MediaType;

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    iget p2, p0, Lorg/apache/tika/detect/MagicDetector;->offsetRangeEnd:I

    .line 7
    .line 8
    iget v0, p0, Lorg/apache/tika/detect/MagicDetector;->length:I

    .line 9
    .line 10
    add-int/2addr p2, v0

    .line 11
    invoke-virtual {p1, p2}, Ljava/io/InputStream;->mark(I)V

    .line 12
    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    move v0, p2

    .line 16
    :goto_0
    :try_start_0
    iget v1, p0, Lorg/apache/tika/detect/MagicDetector;->offsetRangeBegin:I

    .line 17
    .line 18
    const/4 v2, -0x1

    .line 19
    if-ge v0, v1, :cond_3

    .line 20
    .line 21
    sub-int/2addr v1, v0

    .line 22
    int-to-long v3, v1

    .line 23
    invoke-virtual {p1, v3, v4}, Ljava/io/InputStream;->skip(J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v3

    .line 27
    const-wide/16 v5, 0x0

    .line 28
    .line 29
    cmp-long v1, v3, v5

    .line 30
    .line 31
    if-lez v1, :cond_1

    .line 32
    .line 33
    int-to-long v0, v0

    .line 34
    add-long/2addr v0, v3

    .line 35
    long-to-int v0, v0

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eq v1, v2, :cond_2

    .line 42
    .line 43
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    sget-object p2, Lorg/apache/tika/mime/MediaType;->OCTET_STREAM:Lorg/apache/tika/mime/MediaType;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 49
    .line 50
    .line 51
    return-object p2

    .line 52
    :catchall_0
    move-exception p2

    .line 53
    goto/16 :goto_7

    .line 54
    .line 55
    :cond_3
    :try_start_1
    iget v3, p0, Lorg/apache/tika/detect/MagicDetector;->length:I

    .line 56
    .line 57
    iget v4, p0, Lorg/apache/tika/detect/MagicDetector;->offsetRangeEnd:I

    .line 58
    .line 59
    sub-int/2addr v4, v1

    .line 60
    add-int/2addr v4, v3

    .line 61
    new-array v1, v4, [B

    .line 62
    .line 63
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-lez v3, :cond_4

    .line 68
    .line 69
    :goto_1
    add-int/2addr v0, v3

    .line 70
    :cond_4
    if-eq v3, v2, :cond_5

    .line 71
    .line 72
    iget v3, p0, Lorg/apache/tika/detect/MagicDetector;->offsetRangeEnd:I

    .line 73
    .line 74
    iget v5, p0, Lorg/apache/tika/detect/MagicDetector;->length:I

    .line 75
    .line 76
    add-int/2addr v3, v5

    .line 77
    if-ge v0, v3, :cond_5

    .line 78
    .line 79
    iget v3, p0, Lorg/apache/tika/detect/MagicDetector;->offsetRangeBegin:I

    .line 80
    .line 81
    sub-int v3, v0, v3

    .line 82
    .line 83
    sub-int v5, v4, v3

    .line 84
    .line 85
    invoke-virtual {p1, v1, v3, v5}, Ljava/io/InputStream;->read([BII)I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-lez v3, :cond_4

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_5
    iget-boolean v2, p0, Lorg/apache/tika/detect/MagicDetector;->isRegex:Z

    .line 93
    .line 94
    if-eqz v2, :cond_8

    .line 95
    .line 96
    iget-boolean v0, p0, Lorg/apache/tika/detect/MagicDetector;->isStringIgnoreCase:Z

    .line 97
    .line 98
    if-eqz v0, :cond_6

    .line 99
    .line 100
    const/4 v0, 0x2

    .line 101
    goto :goto_2

    .line 102
    :cond_6
    move v0, p2

    .line 103
    :goto_2
    new-instance v2, Ljava/lang/String;

    .line 104
    .line 105
    iget-object v3, p0, Lorg/apache/tika/detect/MagicDetector;->pattern:[B

    .line 106
    .line 107
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 108
    .line 109
    invoke-direct {v2, v3, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 110
    .line 111
    .line 112
    invoke-static {v2, v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    sget-object v2, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 121
    .line 122
    invoke-virtual {v2, v1}, Ljava/nio/charset/Charset;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    :goto_3
    iget v1, p0, Lorg/apache/tika/detect/MagicDetector;->offsetRangeEnd:I

    .line 131
    .line 132
    iget v2, p0, Lorg/apache/tika/detect/MagicDetector;->offsetRangeBegin:I

    .line 133
    .line 134
    sub-int/2addr v1, v2

    .line 135
    if-gt p2, v1, :cond_e

    .line 136
    .line 137
    iget v1, p0, Lorg/apache/tika/detect/MagicDetector;->length:I

    .line 138
    .line 139
    add-int/2addr v1, p2

    .line 140
    invoke-virtual {v0, p2, v1}, Ljava/util/regex/Matcher;->region(II)Ljava/util/regex/Matcher;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->lookingAt()Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-eqz v1, :cond_7

    .line 148
    .line 149
    iget-object p2, p0, Lorg/apache/tika/detect/MagicDetector;->type:Lorg/apache/tika/mime/MediaType;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 152
    .line 153
    .line 154
    return-object p2

    .line 155
    :cond_7
    add-int/lit8 p2, p2, 0x1

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_8
    :try_start_2
    iget v2, p0, Lorg/apache/tika/detect/MagicDetector;->offsetRangeBegin:I

    .line 159
    .line 160
    iget v3, p0, Lorg/apache/tika/detect/MagicDetector;->length:I

    .line 161
    .line 162
    add-int/2addr v2, v3

    .line 163
    if-ge v0, v2, :cond_9

    .line 164
    .line 165
    sget-object p2, Lorg/apache/tika/mime/MediaType;->OCTET_STREAM:Lorg/apache/tika/mime/MediaType;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 168
    .line 169
    .line 170
    return-object p2

    .line 171
    :cond_9
    move v0, p2

    .line 172
    :goto_4
    :try_start_3
    iget v2, p0, Lorg/apache/tika/detect/MagicDetector;->offsetRangeEnd:I

    .line 173
    .line 174
    iget v3, p0, Lorg/apache/tika/detect/MagicDetector;->offsetRangeBegin:I

    .line 175
    .line 176
    sub-int/2addr v2, v3

    .line 177
    if-gt v0, v2, :cond_e

    .line 178
    .line 179
    const/4 v2, 0x1

    .line 180
    move v4, p2

    .line 181
    move v3, v2

    .line 182
    :goto_5
    if-eqz v3, :cond_c

    .line 183
    .line 184
    iget v5, p0, Lorg/apache/tika/detect/MagicDetector;->length:I

    .line 185
    .line 186
    if-ge v4, v5, :cond_c

    .line 187
    .line 188
    add-int v3, v0, v4

    .line 189
    .line 190
    aget-byte v3, v1, v3

    .line 191
    .line 192
    iget-object v5, p0, Lorg/apache/tika/detect/MagicDetector;->mask:[B

    .line 193
    .line 194
    aget-byte v5, v5, v4

    .line 195
    .line 196
    and-int/2addr v3, v5

    .line 197
    iget-boolean v5, p0, Lorg/apache/tika/detect/MagicDetector;->isStringIgnoreCase:Z

    .line 198
    .line 199
    if-eqz v5, :cond_a

    .line 200
    .line 201
    invoke-static {v3}, Ljava/lang/Character;->toLowerCase(I)I

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    :cond_a
    iget-object v5, p0, Lorg/apache/tika/detect/MagicDetector;->pattern:[B

    .line 206
    .line 207
    aget-byte v5, v5, v4

    .line 208
    .line 209
    if-ne v3, v5, :cond_b

    .line 210
    .line 211
    move v3, v2

    .line 212
    goto :goto_6

    .line 213
    :cond_b
    move v3, p2

    .line 214
    :goto_6
    add-int/lit8 v4, v4, 0x1

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_c
    if-eqz v3, :cond_d

    .line 218
    .line 219
    iget-object p2, p0, Lorg/apache/tika/detect/MagicDetector;->type:Lorg/apache/tika/mime/MediaType;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 220
    .line 221
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 222
    .line 223
    .line 224
    return-object p2

    .line 225
    :cond_d
    add-int/lit8 v0, v0, 0x1

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_e
    :try_start_4
    sget-object p2, Lorg/apache/tika/mime/MediaType;->OCTET_STREAM:Lorg/apache/tika/mime/MediaType;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 229
    .line 230
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 231
    .line 232
    .line 233
    return-object p2

    .line 234
    :goto_7
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 235
    .line 236
    .line 237
    throw p2
.end method

.method public getLength()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/detect/MagicDetector;->patternLength:I

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/apache/tika/detect/MagicDetector;->type:Lorg/apache/tika/mime/MediaType;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/tika/detect/MagicDetector;->pattern:[B

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v3, p0, Lorg/apache/tika/detect/MagicDetector;->mask:[B

    .line 11
    .line 12
    invoke-static {v3}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    new-instance v4, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v5, "Magic Detection for "

    .line 19
    .line 20
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v0, " looking for "

    .line 27
    .line 28
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v0, " bytes = "

    .line 35
    .line 36
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v0, " mask = "

    .line 40
    .line 41
    invoke-static {v4, v1, v0, v3}, LVa/M6;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0
.end method
