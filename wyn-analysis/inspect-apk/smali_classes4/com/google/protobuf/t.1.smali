.class public final Lcom/google/protobuf/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/p;


# direct methods
.method public static c(Ljava/nio/ByteBuffer;II)Ljava/lang/String;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x1

    .line 5
    or-int v4, p1, p2

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    .line 8
    .line 9
    .line 10
    move-result v5

    .line 11
    sub-int/2addr v5, p1

    .line 12
    sub-int/2addr v5, p2

    .line 13
    or-int/2addr v4, v5

    .line 14
    if-ltz v4, :cond_9

    .line 15
    .line 16
    add-int v4, p1, p2

    .line 17
    .line 18
    new-array v9, p2, [C

    .line 19
    .line 20
    move p2, v0

    .line 21
    :goto_0
    if-ge p1, v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-ltz v5, :cond_0

    .line 28
    .line 29
    add-int/2addr p1, v3

    .line 30
    add-int/lit8 v6, p2, 0x1

    .line 31
    .line 32
    int-to-char v5, v5

    .line 33
    aput-char v5, v9, p2

    .line 34
    .line 35
    move p2, v6

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v10, p2

    .line 38
    :goto_1
    if-ge p1, v4, :cond_8

    .line 39
    .line 40
    add-int/lit8 p2, p1, 0x1

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-ltz v5, :cond_2

    .line 47
    .line 48
    add-int/lit8 p1, v10, 0x1

    .line 49
    .line 50
    int-to-char v5, v5

    .line 51
    aput-char v5, v9, v10

    .line 52
    .line 53
    :goto_2
    if-ge p2, v4, :cond_1

    .line 54
    .line 55
    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-ltz v5, :cond_1

    .line 60
    .line 61
    add-int/2addr p2, v3

    .line 62
    add-int/lit8 v6, p1, 0x1

    .line 63
    .line 64
    int-to-char v5, v5

    .line 65
    aput-char v5, v9, p1

    .line 66
    .line 67
    move p1, v6

    .line 68
    goto :goto_2

    .line 69
    :cond_1
    move v10, p1

    .line 70
    move p1, p2

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    const/16 v6, -0x20

    .line 73
    .line 74
    if-ge v5, v6, :cond_4

    .line 75
    .line 76
    if-ge p2, v4, :cond_3

    .line 77
    .line 78
    add-int/2addr p1, v2

    .line 79
    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    add-int/lit8 v6, v10, 0x1

    .line 84
    .line 85
    invoke-static {v5, p2, v9, v10}, Lcom/google/protobuf/K1;->b(BB[CI)V

    .line 86
    .line 87
    .line 88
    move v10, v6

    .line 89
    goto :goto_1

    .line 90
    :cond_3
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->invalidUtf8()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    throw p0

    .line 95
    :cond_4
    const/16 v6, -0x10

    .line 96
    .line 97
    if-ge v5, v6, :cond_6

    .line 98
    .line 99
    add-int/lit8 v6, v4, -0x1

    .line 100
    .line 101
    if-ge p2, v6, :cond_5

    .line 102
    .line 103
    add-int/lit8 v6, p1, 0x2

    .line 104
    .line 105
    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    add-int/2addr p1, v1

    .line 110
    invoke-virtual {p0, v6}, Ljava/nio/ByteBuffer;->get(I)B

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    add-int/lit8 v7, v10, 0x1

    .line 115
    .line 116
    invoke-static {v5, p2, v6, v9, v10}, Lcom/google/protobuf/K1;->c(BBB[CI)V

    .line 117
    .line 118
    .line 119
    move v10, v7

    .line 120
    goto :goto_1

    .line 121
    :cond_5
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->invalidUtf8()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    throw p0

    .line 126
    :cond_6
    add-int/lit8 v6, v4, -0x2

    .line 127
    .line 128
    if-ge p2, v6, :cond_7

    .line 129
    .line 130
    add-int/lit8 v6, p1, 0x2

    .line 131
    .line 132
    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    add-int/lit8 v7, p1, 0x3

    .line 137
    .line 138
    invoke-virtual {p0, v6}, Ljava/nio/ByteBuffer;->get(I)B

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    add-int/lit8 p1, p1, 0x4

    .line 143
    .line 144
    invoke-virtual {p0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    move v7, v6

    .line 149
    move v6, p2

    .line 150
    invoke-static/range {v5 .. v10}, Lcom/google/protobuf/K1;->a(BBBB[CI)V

    .line 151
    .line 152
    .line 153
    add-int/2addr v10, v2

    .line 154
    goto :goto_1

    .line 155
    :cond_7
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->invalidUtf8()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    throw p0

    .line 160
    :cond_8
    new-instance p0, Ljava/lang/String;

    .line 161
    .line 162
    invoke-direct {p0, v9, v0, v10}, Ljava/lang/String;-><init>([CII)V

    .line 163
    .line 164
    .line 165
    return-object p0

    .line 166
    :cond_9
    new-instance v4, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 167
    .line 168
    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    new-array v1, v1, [Ljava/lang/Object;

    .line 185
    .line 186
    aput-object p0, v1, v0

    .line 187
    .line 188
    aput-object p1, v1, v3

    .line 189
    .line 190
    aput-object p2, v1, v2

    .line 191
    .line 192
    const-string p0, "buffer limit=%d, index=%d, limit=%d"

    .line 193
    .line 194
    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    invoke-direct {v4, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw v4
.end method

.method public static d(Ljava/lang/String;Ljava/nio/ByteBuffer;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    const/16 v3, 0x80

    .line 11
    .line 12
    if-ge v2, v0, :cond_0

    .line 13
    .line 14
    :try_start_0
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-ge v4, v3, :cond_0

    .line 19
    .line 20
    add-int v3, v1, v2

    .line 21
    .line 22
    int-to-byte v4, v4

    .line 23
    invoke-virtual {p1, v3, v4}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    if-ne v2, v0, :cond_1

    .line 30
    .line 31
    add-int v0, v1, v2

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    add-int/2addr v1, v2

    .line 38
    :goto_1
    if-ge v2, v0, :cond_8

    .line 39
    .line 40
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-ge v4, v3, :cond_2

    .line 45
    .line 46
    int-to-byte v4, v4

    .line 47
    invoke-virtual {p1, v1, v4}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_4

    .line 48
    .line 49
    .line 50
    goto/16 :goto_4

    .line 51
    .line 52
    :cond_2
    const/16 v5, 0x800

    .line 53
    .line 54
    if-ge v4, v5, :cond_3

    .line 55
    .line 56
    add-int/lit8 v5, v1, 0x1

    .line 57
    .line 58
    ushr-int/lit8 v6, v4, 0x6

    .line 59
    .line 60
    or-int/lit16 v6, v6, 0xc0

    .line 61
    .line 62
    int-to-byte v6, v6

    .line 63
    :try_start_1
    invoke-virtual {p1, v1, v6}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 64
    .line 65
    .line 66
    and-int/lit8 v1, v4, 0x3f

    .line 67
    .line 68
    or-int/2addr v1, v3

    .line 69
    int-to-byte v1, v1

    .line 70
    invoke-virtual {p1, v5, v1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    .line 71
    .line 72
    .line 73
    move v1, v5

    .line 74
    goto/16 :goto_4

    .line 75
    .line 76
    :catch_0
    move v1, v5

    .line 77
    goto/16 :goto_5

    .line 78
    .line 79
    :cond_3
    const v5, 0xd800

    .line 80
    .line 81
    .line 82
    if-lt v4, v5, :cond_7

    .line 83
    .line 84
    const v5, 0xdfff

    .line 85
    .line 86
    .line 87
    if-ge v5, v4, :cond_4

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_4
    add-int/lit8 v5, v2, 0x1

    .line 91
    .line 92
    if-eq v5, v0, :cond_6

    .line 93
    .line 94
    :try_start_2
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    invoke-static {v4, v2}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    if-eqz v6, :cond_5

    .line 103
    .line 104
    invoke-static {v4, v2}, Ljava/lang/Character;->toCodePoint(CC)I

    .line 105
    .line 106
    .line 107
    move-result v2
    :try_end_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1

    .line 108
    add-int/lit8 v4, v1, 0x1

    .line 109
    .line 110
    ushr-int/lit8 v6, v2, 0x12

    .line 111
    .line 112
    or-int/lit16 v6, v6, 0xf0

    .line 113
    .line 114
    int-to-byte v6, v6

    .line 115
    :try_start_3
    invoke-virtual {p1, v1, v6}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_3
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_3

    .line 116
    .line 117
    .line 118
    add-int/lit8 v6, v1, 0x2

    .line 119
    .line 120
    ushr-int/lit8 v7, v2, 0xc

    .line 121
    .line 122
    and-int/lit8 v7, v7, 0x3f

    .line 123
    .line 124
    or-int/2addr v7, v3

    .line 125
    int-to-byte v7, v7

    .line 126
    :try_start_4
    invoke-virtual {p1, v4, v7}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_4
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_2

    .line 127
    .line 128
    .line 129
    add-int/lit8 v1, v1, 0x3

    .line 130
    .line 131
    ushr-int/lit8 v4, v2, 0x6

    .line 132
    .line 133
    and-int/lit8 v4, v4, 0x3f

    .line 134
    .line 135
    or-int/2addr v4, v3

    .line 136
    int-to-byte v4, v4

    .line 137
    :try_start_5
    invoke-virtual {p1, v6, v4}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 138
    .line 139
    .line 140
    and-int/lit8 v2, v2, 0x3f

    .line 141
    .line 142
    or-int/2addr v2, v3

    .line 143
    int-to-byte v2, v2

    .line 144
    invoke-virtual {p1, v1, v2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_5
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_5 .. :try_end_5} :catch_1

    .line 145
    .line 146
    .line 147
    move v2, v5

    .line 148
    goto :goto_4

    .line 149
    :catch_1
    :goto_2
    move v2, v5

    .line 150
    goto :goto_5

    .line 151
    :catch_2
    move v2, v5

    .line 152
    move v1, v6

    .line 153
    goto :goto_5

    .line 154
    :catch_3
    move v1, v4

    .line 155
    goto :goto_2

    .line 156
    :cond_5
    move v2, v5

    .line 157
    :cond_6
    :try_start_6
    new-instance v3, Lcom/google/protobuf/e2;

    .line 158
    .line 159
    invoke-direct {v3, v2, v0}, Lcom/google/protobuf/e2;-><init>(II)V

    .line 160
    .line 161
    .line 162
    throw v3
    :try_end_6
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_4

    .line 163
    :cond_7
    :goto_3
    add-int/lit8 v5, v1, 0x1

    .line 164
    .line 165
    ushr-int/lit8 v6, v4, 0xc

    .line 166
    .line 167
    or-int/lit16 v6, v6, 0xe0

    .line 168
    .line 169
    int-to-byte v6, v6

    .line 170
    :try_start_7
    invoke-virtual {p1, v1, v6}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_7
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_7 .. :try_end_7} :catch_0

    .line 171
    .line 172
    .line 173
    add-int/lit8 v1, v1, 0x2

    .line 174
    .line 175
    ushr-int/lit8 v6, v4, 0x6

    .line 176
    .line 177
    and-int/lit8 v6, v6, 0x3f

    .line 178
    .line 179
    or-int/2addr v6, v3

    .line 180
    int-to-byte v6, v6

    .line 181
    :try_start_8
    invoke-virtual {p1, v5, v6}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 182
    .line 183
    .line 184
    and-int/lit8 v4, v4, 0x3f

    .line 185
    .line 186
    or-int/2addr v4, v3

    .line 187
    int-to-byte v4, v4

    .line 188
    invoke-virtual {p1, v1, v4}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 189
    .line 190
    .line 191
    :goto_4
    add-int/lit8 v2, v2, 0x1

    .line 192
    .line 193
    add-int/lit8 v1, v1, 0x1

    .line 194
    .line 195
    goto/16 :goto_1

    .line 196
    .line 197
    :cond_8
    invoke-virtual {p1, v1}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;
    :try_end_8
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_8 .. :try_end_8} :catch_4

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :catch_4
    :goto_5
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    sub-int/2addr v1, p1

    .line 210
    add-int/lit8 v1, v1, 0x1

    .line 211
    .line 212
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    add-int/2addr p1, v0

    .line 217
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 218
    .line 219
    new-instance v1, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    const-string v3, "Failed writing "

    .line 222
    .line 223
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 227
    .line 228
    .line 229
    move-result p0

    .line 230
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    const-string p0, " at index "

    .line 234
    .line 235
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    invoke-direct {v0, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    throw v0
.end method

.method public static h(IILjava/nio/ByteBuffer;I)I
    .locals 17

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/16 v5, -0x13

    .line 11
    .line 12
    const/16 v6, -0x10

    .line 13
    .line 14
    const/16 v7, -0x3e

    .line 15
    .line 16
    const/16 v8, -0x60

    .line 17
    .line 18
    const/16 v9, -0x20

    .line 19
    .line 20
    const/16 v10, -0x41

    .line 21
    .line 22
    if-eqz v0, :cond_c

    .line 23
    .line 24
    if-lt v1, v3, :cond_0

    .line 25
    .line 26
    return v0

    .line 27
    :cond_0
    int-to-byte v11, v0

    .line 28
    if-ge v11, v9, :cond_2

    .line 29
    .line 30
    if-lt v11, v7, :cond_19

    .line 31
    .line 32
    add-int/lit8 v0, v1, 0x1

    .line 33
    .line 34
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-le v1, v10, :cond_1

    .line 39
    .line 40
    goto/16 :goto_4

    .line 41
    .line 42
    :cond_1
    move v1, v0

    .line 43
    goto/16 :goto_1

    .line 44
    .line 45
    :cond_2
    if-ge v11, v6, :cond_7

    .line 46
    .line 47
    shr-int/lit8 v0, v0, 0x8

    .line 48
    .line 49
    not-int v0, v0

    .line 50
    int-to-byte v0, v0

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    add-int/lit8 v0, v1, 0x1

    .line 54
    .line 55
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-lt v0, v3, :cond_4

    .line 60
    .line 61
    invoke-static {v11, v1}, Lcom/google/protobuf/f2;->g(II)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    return v0

    .line 66
    :cond_3
    move/from16 v16, v1

    .line 67
    .line 68
    move v1, v0

    .line 69
    move/from16 v0, v16

    .line 70
    .line 71
    :cond_4
    if-gt v1, v10, :cond_19

    .line 72
    .line 73
    if-ne v11, v9, :cond_5

    .line 74
    .line 75
    if-lt v1, v8, :cond_19

    .line 76
    .line 77
    :cond_5
    if-ne v11, v5, :cond_6

    .line 78
    .line 79
    if-ge v1, v8, :cond_19

    .line 80
    .line 81
    :cond_6
    add-int/lit8 v1, v0, 0x1

    .line 82
    .line 83
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-le v0, v10, :cond_c

    .line 88
    .line 89
    goto/16 :goto_4

    .line 90
    .line 91
    :cond_7
    shr-int/lit8 v12, v0, 0x8

    .line 92
    .line 93
    not-int v12, v12

    .line 94
    int-to-byte v12, v12

    .line 95
    if-nez v12, :cond_9

    .line 96
    .line 97
    add-int/lit8 v0, v1, 0x1

    .line 98
    .line 99
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    if-lt v0, v3, :cond_8

    .line 104
    .line 105
    invoke-static {v11, v12}, Lcom/google/protobuf/f2;->g(II)I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    return v0

    .line 110
    :cond_8
    move v1, v4

    .line 111
    goto :goto_0

    .line 112
    :cond_9
    shr-int/lit8 v0, v0, 0x10

    .line 113
    .line 114
    int-to-byte v0, v0

    .line 115
    move/from16 v16, v1

    .line 116
    .line 117
    move v1, v0

    .line 118
    move/from16 v0, v16

    .line 119
    .line 120
    :goto_0
    if-nez v1, :cond_b

    .line 121
    .line 122
    add-int/lit8 v1, v0, 0x1

    .line 123
    .line 124
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-lt v1, v3, :cond_a

    .line 129
    .line 130
    invoke-static {v11, v12, v0}, Lcom/google/protobuf/f2;->h(III)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    return v0

    .line 135
    :cond_a
    move/from16 v16, v1

    .line 136
    .line 137
    move v1, v0

    .line 138
    move/from16 v0, v16

    .line 139
    .line 140
    :cond_b
    if-gt v12, v10, :cond_19

    .line 141
    .line 142
    shl-int/lit8 v11, v11, 0x1c

    .line 143
    .line 144
    add-int/lit8 v12, v12, 0x70

    .line 145
    .line 146
    add-int/2addr v12, v11

    .line 147
    shr-int/lit8 v11, v12, 0x1e

    .line 148
    .line 149
    if-nez v11, :cond_19

    .line 150
    .line 151
    if-gt v1, v10, :cond_19

    .line 152
    .line 153
    add-int/lit8 v1, v0, 0x1

    .line 154
    .line 155
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-le v0, v10, :cond_c

    .line 160
    .line 161
    goto/16 :goto_4

    .line 162
    .line 163
    :cond_c
    :goto_1
    sget-object v0, Lcom/google/protobuf/f2;->a:Lcom/google/protobuf/t;

    .line 164
    .line 165
    add-int/lit8 v0, v3, -0x7

    .line 166
    .line 167
    move v11, v1

    .line 168
    :goto_2
    if-ge v11, v0, :cond_d

    .line 169
    .line 170
    invoke-virtual {v2, v11}, Ljava/nio/ByteBuffer;->getLong(I)J

    .line 171
    .line 172
    .line 173
    move-result-wide v12

    .line 174
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    and-long/2addr v12, v14

    .line 180
    const-wide/16 v14, 0x0

    .line 181
    .line 182
    cmp-long v12, v12, v14

    .line 183
    .line 184
    if-nez v12, :cond_d

    .line 185
    .line 186
    add-int/lit8 v11, v11, 0x8

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_d
    sub-int/2addr v11, v1

    .line 190
    add-int/2addr v11, v1

    .line 191
    :cond_e
    :goto_3
    if-lt v11, v3, :cond_f

    .line 192
    .line 193
    return v4

    .line 194
    :cond_f
    add-int/lit8 v0, v11, 0x1

    .line 195
    .line 196
    invoke-virtual {v2, v11}, Ljava/nio/ByteBuffer;->get(I)B

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    if-gez v1, :cond_1a

    .line 201
    .line 202
    if-ge v1, v9, :cond_12

    .line 203
    .line 204
    if-lt v0, v3, :cond_10

    .line 205
    .line 206
    return v1

    .line 207
    :cond_10
    if-lt v1, v7, :cond_19

    .line 208
    .line 209
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-le v0, v10, :cond_11

    .line 214
    .line 215
    goto :goto_4

    .line 216
    :cond_11
    add-int/lit8 v11, v11, 0x2

    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_12
    if-ge v1, v6, :cond_17

    .line 220
    .line 221
    add-int/lit8 v12, v3, -0x1

    .line 222
    .line 223
    if-lt v0, v12, :cond_13

    .line 224
    .line 225
    sub-int/2addr v3, v0

    .line 226
    invoke-static {v1, v0, v2, v3}, Lcom/google/protobuf/f2;->b(IILjava/nio/ByteBuffer;I)I

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    return v0

    .line 231
    :cond_13
    add-int/lit8 v12, v11, 0x2

    .line 232
    .line 233
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    if-gt v0, v10, :cond_19

    .line 238
    .line 239
    if-ne v1, v9, :cond_14

    .line 240
    .line 241
    if-lt v0, v8, :cond_19

    .line 242
    .line 243
    :cond_14
    if-ne v1, v5, :cond_15

    .line 244
    .line 245
    if-ge v0, v8, :cond_19

    .line 246
    .line 247
    :cond_15
    invoke-virtual {v2, v12}, Ljava/nio/ByteBuffer;->get(I)B

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-le v0, v10, :cond_16

    .line 252
    .line 253
    goto :goto_4

    .line 254
    :cond_16
    add-int/lit8 v11, v11, 0x3

    .line 255
    .line 256
    goto :goto_3

    .line 257
    :cond_17
    add-int/lit8 v12, v3, -0x2

    .line 258
    .line 259
    if-lt v0, v12, :cond_18

    .line 260
    .line 261
    sub-int/2addr v3, v0

    .line 262
    invoke-static {v1, v0, v2, v3}, Lcom/google/protobuf/f2;->b(IILjava/nio/ByteBuffer;I)I

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    return v0

    .line 267
    :cond_18
    add-int/lit8 v12, v11, 0x2

    .line 268
    .line 269
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-gt v0, v10, :cond_19

    .line 274
    .line 275
    shl-int/lit8 v1, v1, 0x1c

    .line 276
    .line 277
    add-int/lit8 v0, v0, 0x70

    .line 278
    .line 279
    add-int/2addr v0, v1

    .line 280
    shr-int/lit8 v0, v0, 0x1e

    .line 281
    .line 282
    if-nez v0, :cond_19

    .line 283
    .line 284
    add-int/lit8 v0, v11, 0x3

    .line 285
    .line 286
    invoke-virtual {v2, v12}, Ljava/nio/ByteBuffer;->get(I)B

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    if-gt v1, v10, :cond_19

    .line 291
    .line 292
    add-int/lit8 v11, v11, 0x4

    .line 293
    .line 294
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    if-le v0, v10, :cond_e

    .line 299
    .line 300
    :cond_19
    :goto_4
    const/4 v0, -0x1

    .line 301
    return v0

    .line 302
    :cond_1a
    move v11, v0

    .line 303
    goto :goto_3
.end method


# virtual methods
.method public a(II[B)[B
    .locals 2

    .line 1
    new-array v0, p2, [B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p3, p1, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public b(II[B)Ljava/lang/String;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x1

    .line 5
    or-int v4, p1, p2

    .line 6
    .line 7
    array-length v5, p3

    .line 8
    sub-int/2addr v5, p1

    .line 9
    sub-int/2addr v5, p2

    .line 10
    or-int/2addr v4, v5

    .line 11
    if-ltz v4, :cond_9

    .line 12
    .line 13
    add-int v4, p1, p2

    .line 14
    .line 15
    new-array v9, p2, [C

    .line 16
    .line 17
    move p2, v0

    .line 18
    :goto_0
    if-ge p1, v4, :cond_0

    .line 19
    .line 20
    aget-byte v5, p3, p1

    .line 21
    .line 22
    if-ltz v5, :cond_0

    .line 23
    .line 24
    add-int/2addr p1, v3

    .line 25
    add-int/lit8 v6, p2, 0x1

    .line 26
    .line 27
    int-to-char v5, v5

    .line 28
    aput-char v5, v9, p2

    .line 29
    .line 30
    move p2, v6

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v10, p2

    .line 33
    :goto_1
    if-ge p1, v4, :cond_8

    .line 34
    .line 35
    add-int/lit8 p2, p1, 0x1

    .line 36
    .line 37
    aget-byte v5, p3, p1

    .line 38
    .line 39
    if-ltz v5, :cond_2

    .line 40
    .line 41
    add-int/lit8 p1, v10, 0x1

    .line 42
    .line 43
    int-to-char v5, v5

    .line 44
    aput-char v5, v9, v10

    .line 45
    .line 46
    :goto_2
    if-ge p2, v4, :cond_1

    .line 47
    .line 48
    aget-byte v5, p3, p2

    .line 49
    .line 50
    if-ltz v5, :cond_1

    .line 51
    .line 52
    add-int/2addr p2, v3

    .line 53
    add-int/lit8 v6, p1, 0x1

    .line 54
    .line 55
    int-to-char v5, v5

    .line 56
    aput-char v5, v9, p1

    .line 57
    .line 58
    move p1, v6

    .line 59
    goto :goto_2

    .line 60
    :cond_1
    move v10, p1

    .line 61
    move p1, p2

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    const/16 v6, -0x20

    .line 64
    .line 65
    if-ge v5, v6, :cond_4

    .line 66
    .line 67
    if-ge p2, v4, :cond_3

    .line 68
    .line 69
    add-int/2addr p1, v2

    .line 70
    aget-byte p2, p3, p2

    .line 71
    .line 72
    add-int/lit8 v6, v10, 0x1

    .line 73
    .line 74
    invoke-static {v5, p2, v9, v10}, Lcom/google/protobuf/K1;->b(BB[CI)V

    .line 75
    .line 76
    .line 77
    move v10, v6

    .line 78
    goto :goto_1

    .line 79
    :cond_3
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->invalidUtf8()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    throw p1

    .line 84
    :cond_4
    const/16 v6, -0x10

    .line 85
    .line 86
    if-ge v5, v6, :cond_6

    .line 87
    .line 88
    add-int/lit8 v6, v4, -0x1

    .line 89
    .line 90
    if-ge p2, v6, :cond_5

    .line 91
    .line 92
    add-int/lit8 v6, p1, 0x2

    .line 93
    .line 94
    aget-byte p2, p3, p2

    .line 95
    .line 96
    add-int/2addr p1, v1

    .line 97
    aget-byte v6, p3, v6

    .line 98
    .line 99
    add-int/lit8 v7, v10, 0x1

    .line 100
    .line 101
    invoke-static {v5, p2, v6, v9, v10}, Lcom/google/protobuf/K1;->c(BBB[CI)V

    .line 102
    .line 103
    .line 104
    move v10, v7

    .line 105
    goto :goto_1

    .line 106
    :cond_5
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->invalidUtf8()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    throw p1

    .line 111
    :cond_6
    add-int/lit8 v6, v4, -0x2

    .line 112
    .line 113
    if-ge p2, v6, :cond_7

    .line 114
    .line 115
    add-int/lit8 v6, p1, 0x2

    .line 116
    .line 117
    aget-byte p2, p3, p2

    .line 118
    .line 119
    add-int/lit8 v7, p1, 0x3

    .line 120
    .line 121
    aget-byte v6, p3, v6

    .line 122
    .line 123
    add-int/lit8 p1, p1, 0x4

    .line 124
    .line 125
    aget-byte v8, p3, v7

    .line 126
    .line 127
    move v7, v6

    .line 128
    move v6, p2

    .line 129
    invoke-static/range {v5 .. v10}, Lcom/google/protobuf/K1;->a(BBBB[CI)V

    .line 130
    .line 131
    .line 132
    add-int/2addr v10, v2

    .line 133
    goto :goto_1

    .line 134
    :cond_7
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->invalidUtf8()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    throw p1

    .line 139
    :cond_8
    new-instance p1, Ljava/lang/String;

    .line 140
    .line 141
    invoke-direct {p1, v9, v0, v10}, Ljava/lang/String;-><init>([CII)V

    .line 142
    .line 143
    .line 144
    return-object p1

    .line 145
    :cond_9
    new-instance v4, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 146
    .line 147
    array-length p3, p3

    .line 148
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 149
    .line 150
    .line 151
    move-result-object p3

    .line 152
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    new-array v1, v1, [Ljava/lang/Object;

    .line 161
    .line 162
    aput-object p3, v1, v0

    .line 163
    .line 164
    aput-object p1, v1, v3

    .line 165
    .line 166
    aput-object p2, v1, v2

    .line 167
    .line 168
    const-string p1, "buffer length=%d, index=%d, size=%d"

    .line 169
    .line 170
    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-direct {v4, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw v4
.end method

.method public e([BII)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0, p1, p2, p3}, Lcom/google/protobuf/t;->g(I[BII)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    return p1

    .line 10
    :cond_0
    return v0
.end method

.method public f(IILjava/nio/ByteBuffer;I)I
    .locals 1

    .line 1
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->array()[B

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    add-int/2addr p2, v0

    .line 16
    add-int/2addr v0, p4

    .line 17
    invoke-virtual {p0, p1, p3, p2, v0}, Lcom/google/protobuf/t;->g(I[BII)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :cond_0
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->isDirect()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-static {p1, p2, p3, p4}, Lcom/google/protobuf/t;->h(IILjava/nio/ByteBuffer;I)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1

    .line 33
    :cond_1
    invoke-static {p1, p2, p3, p4}, Lcom/google/protobuf/t;->h(IILjava/nio/ByteBuffer;I)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1
.end method

.method public g(I[BII)I
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, -0x13

    .line 3
    .line 4
    const/16 v2, -0x10

    .line 5
    .line 6
    const/16 v3, -0x3e

    .line 7
    .line 8
    const/16 v4, -0x60

    .line 9
    .line 10
    const/16 v5, -0x20

    .line 11
    .line 12
    const/4 v6, -0x1

    .line 13
    const/16 v7, -0x41

    .line 14
    .line 15
    if-eqz p1, :cond_f

    .line 16
    .line 17
    if-lt p3, p4, :cond_0

    .line 18
    .line 19
    return p1

    .line 20
    :cond_0
    int-to-byte v8, p1

    .line 21
    if-ge v8, v5, :cond_3

    .line 22
    .line 23
    if-lt v8, v3, :cond_2

    .line 24
    .line 25
    add-int/lit8 p1, p3, 0x1

    .line 26
    .line 27
    aget-byte p3, p2, p3

    .line 28
    .line 29
    if-le p3, v7, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move p3, p1

    .line 33
    goto/16 :goto_2

    .line 34
    .line 35
    :cond_2
    :goto_0
    return v6

    .line 36
    :cond_3
    if-ge v8, v2, :cond_9

    .line 37
    .line 38
    shr-int/lit8 p1, p1, 0x8

    .line 39
    .line 40
    not-int p1, p1

    .line 41
    int-to-byte p1, p1

    .line 42
    if-nez p1, :cond_5

    .line 43
    .line 44
    add-int/lit8 p1, p3, 0x1

    .line 45
    .line 46
    aget-byte p3, p2, p3

    .line 47
    .line 48
    if-lt p1, p4, :cond_4

    .line 49
    .line 50
    invoke-static {v8, p3}, Lcom/google/protobuf/f2;->g(II)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    return p1

    .line 55
    :cond_4
    move v10, p3

    .line 56
    move p3, p1

    .line 57
    move p1, v10

    .line 58
    :cond_5
    if-gt p1, v7, :cond_8

    .line 59
    .line 60
    if-ne v8, v5, :cond_6

    .line 61
    .line 62
    if-lt p1, v4, :cond_8

    .line 63
    .line 64
    :cond_6
    if-ne v8, v1, :cond_7

    .line 65
    .line 66
    if-ge p1, v4, :cond_8

    .line 67
    .line 68
    :cond_7
    add-int/lit8 p1, p3, 0x1

    .line 69
    .line 70
    aget-byte p3, p2, p3

    .line 71
    .line 72
    if-le p3, v7, :cond_1

    .line 73
    .line 74
    :cond_8
    return v6

    .line 75
    :cond_9
    shr-int/lit8 v9, p1, 0x8

    .line 76
    .line 77
    not-int v9, v9

    .line 78
    int-to-byte v9, v9

    .line 79
    if-nez v9, :cond_b

    .line 80
    .line 81
    add-int/lit8 p1, p3, 0x1

    .line 82
    .line 83
    aget-byte v9, p2, p3

    .line 84
    .line 85
    if-lt p1, p4, :cond_a

    .line 86
    .line 87
    invoke-static {v8, v9}, Lcom/google/protobuf/f2;->g(II)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    return p1

    .line 92
    :cond_a
    move p3, p1

    .line 93
    move p1, v0

    .line 94
    goto :goto_1

    .line 95
    :cond_b
    shr-int/lit8 p1, p1, 0x10

    .line 96
    .line 97
    int-to-byte p1, p1

    .line 98
    :goto_1
    if-nez p1, :cond_d

    .line 99
    .line 100
    add-int/lit8 p1, p3, 0x1

    .line 101
    .line 102
    aget-byte p3, p2, p3

    .line 103
    .line 104
    if-lt p1, p4, :cond_c

    .line 105
    .line 106
    invoke-static {v8, v9, p3}, Lcom/google/protobuf/f2;->h(III)I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    return p1

    .line 111
    :cond_c
    move v10, p3

    .line 112
    move p3, p1

    .line 113
    move p1, v10

    .line 114
    :cond_d
    if-gt v9, v7, :cond_e

    .line 115
    .line 116
    shl-int/lit8 v8, v8, 0x1c

    .line 117
    .line 118
    add-int/lit8 v9, v9, 0x70

    .line 119
    .line 120
    add-int/2addr v9, v8

    .line 121
    shr-int/lit8 v8, v9, 0x1e

    .line 122
    .line 123
    if-nez v8, :cond_e

    .line 124
    .line 125
    if-gt p1, v7, :cond_e

    .line 126
    .line 127
    add-int/lit8 p1, p3, 0x1

    .line 128
    .line 129
    aget-byte p3, p2, p3

    .line 130
    .line 131
    if-le p3, v7, :cond_1

    .line 132
    .line 133
    :cond_e
    return v6

    .line 134
    :cond_f
    :goto_2
    if-ge p3, p4, :cond_10

    .line 135
    .line 136
    aget-byte p1, p2, p3

    .line 137
    .line 138
    if-ltz p1, :cond_10

    .line 139
    .line 140
    add-int/lit8 p3, p3, 0x1

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_10
    if-lt p3, p4, :cond_11

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_11
    :goto_3
    if-lt p3, p4, :cond_12

    .line 147
    .line 148
    :goto_4
    return v0

    .line 149
    :cond_12
    add-int/lit8 p1, p3, 0x1

    .line 150
    .line 151
    aget-byte v8, p2, p3

    .line 152
    .line 153
    if-gez v8, :cond_1b

    .line 154
    .line 155
    if-ge v8, v5, :cond_14

    .line 156
    .line 157
    if-lt p1, p4, :cond_13

    .line 158
    .line 159
    return v8

    .line 160
    :cond_13
    if-lt v8, v3, :cond_1a

    .line 161
    .line 162
    add-int/lit8 p3, p3, 0x2

    .line 163
    .line 164
    aget-byte p1, p2, p1

    .line 165
    .line 166
    if-le p1, v7, :cond_11

    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_14
    if-ge v8, v2, :cond_18

    .line 170
    .line 171
    add-int/lit8 v9, p4, -0x1

    .line 172
    .line 173
    if-lt p1, v9, :cond_15

    .line 174
    .line 175
    invoke-static {p1, p4, p2}, Lcom/google/protobuf/f2;->a(II[B)I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    return p1

    .line 180
    :cond_15
    add-int/lit8 v9, p3, 0x2

    .line 181
    .line 182
    aget-byte p1, p2, p1

    .line 183
    .line 184
    if-gt p1, v7, :cond_1a

    .line 185
    .line 186
    if-ne v8, v5, :cond_16

    .line 187
    .line 188
    if-lt p1, v4, :cond_1a

    .line 189
    .line 190
    :cond_16
    if-ne v8, v1, :cond_17

    .line 191
    .line 192
    if-ge p1, v4, :cond_1a

    .line 193
    .line 194
    :cond_17
    add-int/lit8 p3, p3, 0x3

    .line 195
    .line 196
    aget-byte p1, p2, v9

    .line 197
    .line 198
    if-le p1, v7, :cond_11

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_18
    add-int/lit8 v9, p4, -0x2

    .line 202
    .line 203
    if-lt p1, v9, :cond_19

    .line 204
    .line 205
    invoke-static {p1, p4, p2}, Lcom/google/protobuf/f2;->a(II[B)I

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    return p1

    .line 210
    :cond_19
    add-int/lit8 v9, p3, 0x2

    .line 211
    .line 212
    aget-byte p1, p2, p1

    .line 213
    .line 214
    if-gt p1, v7, :cond_1a

    .line 215
    .line 216
    shl-int/lit8 v8, v8, 0x1c

    .line 217
    .line 218
    add-int/lit8 p1, p1, 0x70

    .line 219
    .line 220
    add-int/2addr p1, v8

    .line 221
    shr-int/lit8 p1, p1, 0x1e

    .line 222
    .line 223
    if-nez p1, :cond_1a

    .line 224
    .line 225
    add-int/lit8 p1, p3, 0x3

    .line 226
    .line 227
    aget-byte v8, p2, v9

    .line 228
    .line 229
    if-gt v8, v7, :cond_1a

    .line 230
    .line 231
    add-int/lit8 p3, p3, 0x4

    .line 232
    .line 233
    aget-byte p1, p2, p1

    .line 234
    .line 235
    if-le p1, v7, :cond_11

    .line 236
    .line 237
    :cond_1a
    :goto_5
    return v6

    .line 238
    :cond_1b
    move p3, p1

    .line 239
    goto :goto_3
.end method
