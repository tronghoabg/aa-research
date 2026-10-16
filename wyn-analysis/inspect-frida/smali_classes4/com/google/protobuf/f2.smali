.class public abstract Lcom/google/protobuf/f2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/protobuf/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/d2;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-boolean v0, Lcom/google/protobuf/d2;->d:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/google/protobuf/c;->a:Ljava/lang/Class;

    .line 10
    .line 11
    :cond_0
    new-instance v0, Lcom/google/protobuf/t;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lcom/google/protobuf/f2;->a:Lcom/google/protobuf/t;

    .line 17
    .line 18
    return-void
.end method

.method public static a(II[B)I
    .locals 3

    .line 1
    add-int/lit8 v0, p0, -0x1

    .line 2
    .line 3
    aget-byte v0, p2, v0

    .line 4
    .line 5
    sub-int/2addr p1, p0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eq p1, v1, :cond_1

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    if-ne p1, v2, :cond_0

    .line 13
    .line 14
    aget-byte p1, p2, p0

    .line 15
    .line 16
    add-int/2addr p0, v1

    .line 17
    aget-byte p0, p2, p0

    .line 18
    .line 19
    invoke-static {v0, p1, p0}, Lcom/google/protobuf/f2;->h(III)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 27
    .line 28
    .line 29
    throw p0

    .line 30
    :cond_1
    aget-byte p0, p2, p0

    .line 31
    .line 32
    invoke-static {v0, p0}, Lcom/google/protobuf/f2;->g(II)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0

    .line 37
    :cond_2
    const/16 p0, -0xc

    .line 38
    .line 39
    if-le v0, p0, :cond_3

    .line 40
    .line 41
    const/4 p0, -0x1

    .line 42
    return p0

    .line 43
    :cond_3
    return v0
.end method

.method public static b(IILjava/nio/ByteBuffer;I)I
    .locals 2

    .line 1
    if-eqz p3, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p3, v0, :cond_1

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-ne p3, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    add-int/2addr p1, v0

    .line 14
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-static {p0, p3, p1}, Lcom/google/protobuf/f2;->h(III)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    .line 24
    .line 25
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 26
    .line 27
    .line 28
    throw p0

    .line 29
    :cond_1
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-static {p0, p1}, Lcom/google/protobuf/f2;->g(II)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    return p0

    .line 38
    :cond_2
    const/16 p1, -0xc

    .line 39
    .line 40
    if-le p0, p1, :cond_3

    .line 41
    .line 42
    const/4 p0, -0x1

    .line 43
    :cond_3
    return p0
.end method

.method public static c(Ljava/nio/ByteBuffer;II)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/f2;->a:Lcom/google/protobuf/t;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    add-int/2addr v1, p1

    .line 21
    invoke-virtual {v0, v1, p2, p0}, Lcom/google/protobuf/t;->b(II[B)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->isDirect()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/t;->c(Ljava/nio/ByteBuffer;II)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_1
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/t;->c(Ljava/nio/ByteBuffer;II)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public static d(IILjava/lang/String;[B)I
    .locals 7

    .line 1
    sget-object v0, Lcom/google/protobuf/f2;->a:Lcom/google/protobuf/t;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    add-int/2addr p1, p0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    const/16 v2, 0x80

    .line 13
    .line 14
    if-ge v1, v0, :cond_0

    .line 15
    .line 16
    add-int v3, v1, p0

    .line 17
    .line 18
    if-ge v3, p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-ge v4, v2, :cond_0

    .line 25
    .line 26
    int-to-byte v2, v4

    .line 27
    aput-byte v2, p3, v3

    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    if-ne v1, v0, :cond_1

    .line 33
    .line 34
    add-int/2addr p0, v0

    .line 35
    return p0

    .line 36
    :cond_1
    add-int/2addr p0, v1

    .line 37
    :goto_1
    if-ge v1, v0, :cond_b

    .line 38
    .line 39
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-ge v3, v2, :cond_2

    .line 44
    .line 45
    if-ge p0, p1, :cond_2

    .line 46
    .line 47
    add-int/lit8 v4, p0, 0x1

    .line 48
    .line 49
    int-to-byte v3, v3

    .line 50
    aput-byte v3, p3, p0

    .line 51
    .line 52
    move p0, v4

    .line 53
    goto/16 :goto_2

    .line 54
    .line 55
    :cond_2
    const/16 v4, 0x800

    .line 56
    .line 57
    if-ge v3, v4, :cond_3

    .line 58
    .line 59
    add-int/lit8 v4, p1, -0x2

    .line 60
    .line 61
    if-gt p0, v4, :cond_3

    .line 62
    .line 63
    add-int/lit8 v4, p0, 0x1

    .line 64
    .line 65
    ushr-int/lit8 v5, v3, 0x6

    .line 66
    .line 67
    or-int/lit16 v5, v5, 0x3c0

    .line 68
    .line 69
    int-to-byte v5, v5

    .line 70
    aput-byte v5, p3, p0

    .line 71
    .line 72
    add-int/lit8 p0, p0, 0x2

    .line 73
    .line 74
    and-int/lit8 v3, v3, 0x3f

    .line 75
    .line 76
    or-int/2addr v3, v2

    .line 77
    int-to-byte v3, v3

    .line 78
    aput-byte v3, p3, v4

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    const v4, 0xdfff

    .line 82
    .line 83
    .line 84
    const v5, 0xd800

    .line 85
    .line 86
    .line 87
    if-lt v3, v5, :cond_4

    .line 88
    .line 89
    if-ge v4, v3, :cond_5

    .line 90
    .line 91
    :cond_4
    add-int/lit8 v6, p1, -0x3

    .line 92
    .line 93
    if-gt p0, v6, :cond_5

    .line 94
    .line 95
    add-int/lit8 v4, p0, 0x1

    .line 96
    .line 97
    ushr-int/lit8 v5, v3, 0xc

    .line 98
    .line 99
    or-int/lit16 v5, v5, 0x1e0

    .line 100
    .line 101
    int-to-byte v5, v5

    .line 102
    aput-byte v5, p3, p0

    .line 103
    .line 104
    add-int/lit8 v5, p0, 0x2

    .line 105
    .line 106
    ushr-int/lit8 v6, v3, 0x6

    .line 107
    .line 108
    and-int/lit8 v6, v6, 0x3f

    .line 109
    .line 110
    or-int/2addr v6, v2

    .line 111
    int-to-byte v6, v6

    .line 112
    aput-byte v6, p3, v4

    .line 113
    .line 114
    add-int/lit8 p0, p0, 0x3

    .line 115
    .line 116
    and-int/lit8 v3, v3, 0x3f

    .line 117
    .line 118
    or-int/2addr v3, v2

    .line 119
    int-to-byte v3, v3

    .line 120
    aput-byte v3, p3, v5

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_5
    add-int/lit8 v6, p1, -0x4

    .line 124
    .line 125
    if-gt p0, v6, :cond_8

    .line 126
    .line 127
    add-int/lit8 v4, v1, 0x1

    .line 128
    .line 129
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    if-eq v4, v5, :cond_7

    .line 134
    .line 135
    invoke-virtual {p2, v4}, Ljava/lang/String;->charAt(I)C

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    invoke-static {v3, v1}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    if-eqz v5, :cond_6

    .line 144
    .line 145
    invoke-static {v3, v1}, Ljava/lang/Character;->toCodePoint(CC)I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    add-int/lit8 v3, p0, 0x1

    .line 150
    .line 151
    ushr-int/lit8 v5, v1, 0x12

    .line 152
    .line 153
    or-int/lit16 v5, v5, 0xf0

    .line 154
    .line 155
    int-to-byte v5, v5

    .line 156
    aput-byte v5, p3, p0

    .line 157
    .line 158
    add-int/lit8 v5, p0, 0x2

    .line 159
    .line 160
    ushr-int/lit8 v6, v1, 0xc

    .line 161
    .line 162
    and-int/lit8 v6, v6, 0x3f

    .line 163
    .line 164
    or-int/2addr v6, v2

    .line 165
    int-to-byte v6, v6

    .line 166
    aput-byte v6, p3, v3

    .line 167
    .line 168
    add-int/lit8 v3, p0, 0x3

    .line 169
    .line 170
    ushr-int/lit8 v6, v1, 0x6

    .line 171
    .line 172
    and-int/lit8 v6, v6, 0x3f

    .line 173
    .line 174
    or-int/2addr v6, v2

    .line 175
    int-to-byte v6, v6

    .line 176
    aput-byte v6, p3, v5

    .line 177
    .line 178
    add-int/lit8 p0, p0, 0x4

    .line 179
    .line 180
    and-int/lit8 v1, v1, 0x3f

    .line 181
    .line 182
    or-int/2addr v1, v2

    .line 183
    int-to-byte v1, v1

    .line 184
    aput-byte v1, p3, v3

    .line 185
    .line 186
    move v1, v4

    .line 187
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 188
    .line 189
    goto/16 :goto_1

    .line 190
    .line 191
    :cond_6
    move v1, v4

    .line 192
    :cond_7
    new-instance p0, Lcom/google/protobuf/e2;

    .line 193
    .line 194
    add-int/lit8 v1, v1, -0x1

    .line 195
    .line 196
    invoke-direct {p0, v1, v0}, Lcom/google/protobuf/e2;-><init>(II)V

    .line 197
    .line 198
    .line 199
    throw p0

    .line 200
    :cond_8
    if-gt v5, v3, :cond_a

    .line 201
    .line 202
    if-gt v3, v4, :cond_a

    .line 203
    .line 204
    add-int/lit8 p1, v1, 0x1

    .line 205
    .line 206
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 207
    .line 208
    .line 209
    move-result p3

    .line 210
    if-eq p1, p3, :cond_9

    .line 211
    .line 212
    invoke-virtual {p2, p1}, Ljava/lang/String;->charAt(I)C

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    invoke-static {v3, p1}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    if-nez p1, :cond_a

    .line 221
    .line 222
    :cond_9
    new-instance p0, Lcom/google/protobuf/e2;

    .line 223
    .line 224
    invoke-direct {p0, v1, v0}, Lcom/google/protobuf/e2;-><init>(II)V

    .line 225
    .line 226
    .line 227
    throw p0

    .line 228
    :cond_a
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 229
    .line 230
    new-instance p2, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    const-string p3, "Failed writing "

    .line 233
    .line 234
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    const-string p3, " at index "

    .line 241
    .line 242
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    invoke-direct {p1, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    throw p1

    .line 256
    :cond_b
    return p0
.end method

.method public static e(Ljava/lang/String;Ljava/nio/ByteBuffer;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/google/protobuf/f2;->a:Lcom/google/protobuf/t;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    add-int/2addr v2, v0

    .line 25
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-static {v2, v3, p0, v1}, Lcom/google/protobuf/f2;->d(IILjava/lang/String;[B)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    sub-int/2addr p0, v0

    .line 34
    invoke-virtual {p1, p0}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->isDirect()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-static {p0, p1}, Lcom/google/protobuf/t;->d(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    invoke-static {p0, p1}, Lcom/google/protobuf/t;->d(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public static f(Ljava/lang/String;)I
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v2, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/16 v4, 0x80

    .line 14
    .line 15
    if-ge v3, v4, :cond_0

    .line 16
    .line 17
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v3, v0

    .line 21
    :goto_1
    if-ge v2, v0, :cond_6

    .line 22
    .line 23
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const/16 v5, 0x800

    .line 28
    .line 29
    if-ge v4, v5, :cond_1

    .line 30
    .line 31
    rsub-int/lit8 v4, v4, 0x7f

    .line 32
    .line 33
    ushr-int/lit8 v4, v4, 0x1f

    .line 34
    .line 35
    add-int/2addr v3, v4

    .line 36
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    :goto_2
    if-ge v2, v4, :cond_5

    .line 44
    .line 45
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-ge v6, v5, :cond_2

    .line 50
    .line 51
    rsub-int/lit8 v6, v6, 0x7f

    .line 52
    .line 53
    ushr-int/lit8 v6, v6, 0x1f

    .line 54
    .line 55
    add-int/2addr v1, v6

    .line 56
    goto :goto_3

    .line 57
    :cond_2
    add-int/lit8 v1, v1, 0x2

    .line 58
    .line 59
    const v7, 0xd800

    .line 60
    .line 61
    .line 62
    if-gt v7, v6, :cond_4

    .line 63
    .line 64
    const v7, 0xdfff

    .line 65
    .line 66
    .line 67
    if-gt v6, v7, :cond_4

    .line 68
    .line 69
    invoke-static {p0, v2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    const/high16 v7, 0x10000

    .line 74
    .line 75
    if-lt v6, v7, :cond_3

    .line 76
    .line 77
    add-int/lit8 v2, v2, 0x1

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_3
    new-instance p0, Lcom/google/protobuf/e2;

    .line 81
    .line 82
    invoke-direct {p0, v2, v4}, Lcom/google/protobuf/e2;-><init>(II)V

    .line 83
    .line 84
    .line 85
    throw p0

    .line 86
    :cond_4
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_5
    add-int/2addr v3, v1

    .line 90
    :cond_6
    if-lt v3, v0, :cond_7

    .line 91
    .line 92
    return v3

    .line 93
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 94
    .line 95
    new-instance v0, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v1, "UTF-8 length does not fit in int: "

    .line 98
    .line 99
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    int-to-long v1, v3

    .line 103
    const-wide v3, 0x100000000L

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    add-long/2addr v1, v3

    .line 109
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw p0
.end method

.method public static g(II)I
    .locals 1

    .line 1
    const/16 v0, -0xc

    if-gt p0, v0, :cond_1

    const/16 v0, -0x41

    if-le p1, v0, :cond_0

    goto :goto_0

    :cond_0
    shl-int/lit8 p1, p1, 0x8

    xor-int/2addr p0, p1

    return p0

    :cond_1
    :goto_0
    const/4 p0, -0x1

    return p0
.end method

.method public static h(III)I
    .locals 1

    .line 1
    const/16 v0, -0xc

    if-gt p0, v0, :cond_1

    const/16 v0, -0x41

    if-gt p1, v0, :cond_1

    if-le p2, v0, :cond_0

    goto :goto_0

    :cond_0
    shl-int/lit8 p1, p1, 0x8

    xor-int/2addr p0, p1

    shl-int/lit8 p1, p2, 0x10

    xor-int/2addr p0, p1

    return p0

    :cond_1
    :goto_0
    const/4 p0, -0x1

    return p0
.end method
