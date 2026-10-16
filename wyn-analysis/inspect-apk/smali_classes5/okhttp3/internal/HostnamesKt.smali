.class public final Lokhttp3/internal/HostnamesKt;
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


# direct methods
.method public static final a(Ljava/lang/String;II)Ljava/net/InetAddress;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    new-array v3, v2, [B

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, -0x1

    .line 11
    move/from16 v6, p1

    .line 12
    .line 13
    move v7, v4

    .line 14
    move v8, v5

    .line 15
    move v9, v8

    .line 16
    :goto_0
    if-ge v6, v1, :cond_12

    .line 17
    .line 18
    if-ne v7, v2, :cond_0

    .line 19
    .line 20
    goto/16 :goto_8

    .line 21
    .line 22
    :cond_0
    add-int/lit8 v10, v6, 0x2

    .line 23
    .line 24
    const/16 v11, 0xff

    .line 25
    .line 26
    if-gt v10, v1, :cond_3

    .line 27
    .line 28
    const-string v12, "::"

    .line 29
    .line 30
    invoke-static {v6, v0, v4, v12}, LBf/r;->j0(ILjava/lang/String;ZLjava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v12

    .line 34
    if-eqz v12, :cond_3

    .line 35
    .line 36
    if-eq v8, v5, :cond_1

    .line 37
    .line 38
    goto/16 :goto_8

    .line 39
    .line 40
    :cond_1
    add-int/lit8 v7, v7, 0x2

    .line 41
    .line 42
    move v8, v7

    .line 43
    if-ne v10, v1, :cond_2

    .line 44
    .line 45
    goto/16 :goto_7

    .line 46
    .line 47
    :cond_2
    move v9, v10

    .line 48
    goto/16 :goto_4

    .line 49
    .line 50
    :cond_3
    if-eqz v7, :cond_4

    .line 51
    .line 52
    const-string v10, ":"

    .line 53
    .line 54
    invoke-static {v6, v0, v4, v10}, LBf/r;->j0(ILjava/lang/String;ZLjava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    if-eqz v10, :cond_5

    .line 59
    .line 60
    add-int/lit8 v6, v6, 0x1

    .line 61
    .line 62
    :cond_4
    move v9, v6

    .line 63
    goto/16 :goto_4

    .line 64
    .line 65
    :cond_5
    const-string v10, "."

    .line 66
    .line 67
    invoke-static {v6, v0, v4, v10}, LBf/r;->j0(ILjava/lang/String;ZLjava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-eqz v6, :cond_13

    .line 72
    .line 73
    add-int/lit8 v6, v7, -0x2

    .line 74
    .line 75
    move v10, v6

    .line 76
    :goto_1
    if-ge v9, v1, :cond_e

    .line 77
    .line 78
    if-ne v10, v2, :cond_6

    .line 79
    .line 80
    goto/16 :goto_8

    .line 81
    .line 82
    :cond_6
    if-eq v10, v6, :cond_8

    .line 83
    .line 84
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 85
    .line 86
    .line 87
    move-result v12

    .line 88
    const/16 v13, 0x2e

    .line 89
    .line 90
    if-eq v12, v13, :cond_7

    .line 91
    .line 92
    goto/16 :goto_8

    .line 93
    .line 94
    :cond_7
    add-int/lit8 v9, v9, 0x1

    .line 95
    .line 96
    :cond_8
    move v13, v4

    .line 97
    move v12, v9

    .line 98
    :goto_2
    if-ge v12, v1, :cond_c

    .line 99
    .line 100
    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    .line 101
    .line 102
    .line 103
    move-result v14

    .line 104
    const/16 v15, 0x30

    .line 105
    .line 106
    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->g(II)I

    .line 107
    .line 108
    .line 109
    move-result v16

    .line 110
    if-ltz v16, :cond_c

    .line 111
    .line 112
    move/from16 p1, v15

    .line 113
    .line 114
    const/16 v15, 0x39

    .line 115
    .line 116
    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->g(II)I

    .line 117
    .line 118
    .line 119
    move-result v15

    .line 120
    if-lez v15, :cond_9

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_9
    if-nez v13, :cond_a

    .line 124
    .line 125
    if-eq v9, v12, :cond_a

    .line 126
    .line 127
    goto :goto_8

    .line 128
    :cond_a
    mul-int/lit8 v13, v13, 0xa

    .line 129
    .line 130
    add-int/2addr v13, v14

    .line 131
    add-int/lit8 v13, v13, -0x30

    .line 132
    .line 133
    if-le v13, v11, :cond_b

    .line 134
    .line 135
    goto :goto_8

    .line 136
    :cond_b
    add-int/lit8 v12, v12, 0x1

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_c
    :goto_3
    sub-int v9, v12, v9

    .line 140
    .line 141
    if-nez v9, :cond_d

    .line 142
    .line 143
    goto :goto_8

    .line 144
    :cond_d
    add-int/lit8 v9, v10, 0x1

    .line 145
    .line 146
    int-to-byte v13, v13

    .line 147
    aput-byte v13, v3, v10

    .line 148
    .line 149
    move v10, v9

    .line 150
    move v9, v12

    .line 151
    goto :goto_1

    .line 152
    :cond_e
    add-int/lit8 v0, v7, 0x2

    .line 153
    .line 154
    if-ne v10, v0, :cond_13

    .line 155
    .line 156
    add-int/lit8 v7, v7, 0x2

    .line 157
    .line 158
    goto :goto_7

    .line 159
    :goto_4
    move v10, v4

    .line 160
    move v6, v9

    .line 161
    :goto_5
    if-ge v6, v1, :cond_10

    .line 162
    .line 163
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    .line 164
    .line 165
    .line 166
    move-result v12

    .line 167
    invoke-static {v12}, Lokhttp3/internal/Util;->q(C)I

    .line 168
    .line 169
    .line 170
    move-result v12

    .line 171
    if-ne v12, v5, :cond_f

    .line 172
    .line 173
    goto :goto_6

    .line 174
    :cond_f
    shl-int/lit8 v10, v10, 0x4

    .line 175
    .line 176
    add-int/2addr v10, v12

    .line 177
    add-int/lit8 v6, v6, 0x1

    .line 178
    .line 179
    goto :goto_5

    .line 180
    :cond_10
    :goto_6
    sub-int v12, v6, v9

    .line 181
    .line 182
    if-eqz v12, :cond_13

    .line 183
    .line 184
    const/4 v13, 0x4

    .line 185
    if-le v12, v13, :cond_11

    .line 186
    .line 187
    goto :goto_8

    .line 188
    :cond_11
    add-int/lit8 v12, v7, 0x1

    .line 189
    .line 190
    ushr-int/lit8 v13, v10, 0x8

    .line 191
    .line 192
    and-int/2addr v11, v13

    .line 193
    int-to-byte v11, v11

    .line 194
    aput-byte v11, v3, v7

    .line 195
    .line 196
    add-int/lit8 v7, v7, 0x2

    .line 197
    .line 198
    and-int/lit16 v10, v10, 0xff

    .line 199
    .line 200
    int-to-byte v10, v10

    .line 201
    aput-byte v10, v3, v12

    .line 202
    .line 203
    goto/16 :goto_0

    .line 204
    .line 205
    :cond_12
    :goto_7
    if-eq v7, v2, :cond_15

    .line 206
    .line 207
    if-ne v8, v5, :cond_14

    .line 208
    .line 209
    :cond_13
    :goto_8
    const/4 v0, 0x0

    .line 210
    return-object v0

    .line 211
    :cond_14
    sub-int v0, v7, v8

    .line 212
    .line 213
    rsub-int/lit8 v1, v0, 0x10

    .line 214
    .line 215
    invoke-static {v3, v8, v3, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 216
    .line 217
    .line 218
    sub-int/2addr v2, v7

    .line 219
    add-int/2addr v2, v8

    .line 220
    invoke-static {v3, v8, v2, v4}, Ljava/util/Arrays;->fill([BIIB)V

    .line 221
    .line 222
    .line 223
    :cond_15
    invoke-static {v3}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    return-object v0
.end method

.method public static final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "<this>"

    .line 3
    .line 4
    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v1, ":"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-static {p0, v1, v2}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v3, -0x1

    .line 15
    if-eqz v1, :cond_b

    .line 16
    .line 17
    const-string v1, "["

    .line 18
    .line 19
    invoke-static {p0, v1, v2}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    const-string v1, "]"

    .line 26
    .line 27
    invoke-static {p0, v1, v2}, LBf/r;->b0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    sub-int/2addr v1, v0

    .line 38
    invoke-static {p0, v0, v1}, Lokhttp3/internal/HostnamesKt;->a(Ljava/lang/String;II)Ljava/net/InetAddress;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-static {p0, v2, v1}, Lokhttp3/internal/HostnamesKt;->a(Ljava/lang/String;II)Ljava/net/InetAddress;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    :goto_0
    if-nez v1, :cond_1

    .line 52
    .line 53
    goto/16 :goto_5

    .line 54
    .line 55
    :cond_1
    invoke-virtual {v1}, Ljava/net/InetAddress;->getAddress()[B

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    array-length v5, v4

    .line 60
    const/4 v6, 0x4

    .line 61
    const/16 v7, 0x10

    .line 62
    .line 63
    if-ne v5, v7, :cond_9

    .line 64
    .line 65
    move p0, v2

    .line 66
    move v1, p0

    .line 67
    :goto_1
    array-length v5, v4

    .line 68
    if-ge p0, v5, :cond_4

    .line 69
    .line 70
    move v5, p0

    .line 71
    :goto_2
    if-ge v5, v7, :cond_2

    .line 72
    .line 73
    aget-byte v8, v4, v5

    .line 74
    .line 75
    if-nez v8, :cond_2

    .line 76
    .line 77
    add-int/lit8 v8, v5, 0x1

    .line 78
    .line 79
    aget-byte v8, v4, v8

    .line 80
    .line 81
    if-nez v8, :cond_2

    .line 82
    .line 83
    add-int/lit8 v5, v5, 0x2

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_2
    sub-int v8, v5, p0

    .line 87
    .line 88
    if-le v8, v1, :cond_3

    .line 89
    .line 90
    if-lt v8, v6, :cond_3

    .line 91
    .line 92
    move v3, p0

    .line 93
    move v1, v8

    .line 94
    :cond_3
    add-int/lit8 p0, v5, 0x2

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_4
    new-instance p0, Lcg/g;

    .line 98
    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    .line 101
    .line 102
    :cond_5
    :goto_3
    array-length v5, v4

    .line 103
    if-ge v2, v5, :cond_8

    .line 104
    .line 105
    const/16 v5, 0x3a

    .line 106
    .line 107
    if-ne v2, v3, :cond_6

    .line 108
    .line 109
    invoke-virtual {p0, v5}, Lcg/g;->X(I)V

    .line 110
    .line 111
    .line 112
    add-int/2addr v2, v1

    .line 113
    if-ne v2, v7, :cond_5

    .line 114
    .line 115
    invoke-virtual {p0, v5}, Lcg/g;->X(I)V

    .line 116
    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_6
    if-lez v2, :cond_7

    .line 120
    .line 121
    invoke-virtual {p0, v5}, Lcg/g;->X(I)V

    .line 122
    .line 123
    .line 124
    :cond_7
    aget-byte v5, v4, v2

    .line 125
    .line 126
    sget-object v6, Lokhttp3/internal/Util;->a:[B

    .line 127
    .line 128
    and-int/lit16 v5, v5, 0xff

    .line 129
    .line 130
    shl-int/lit8 v5, v5, 0x8

    .line 131
    .line 132
    add-int/lit8 v6, v2, 0x1

    .line 133
    .line 134
    aget-byte v6, v4, v6

    .line 135
    .line 136
    and-int/lit16 v6, v6, 0xff

    .line 137
    .line 138
    or-int/2addr v5, v6

    .line 139
    int-to-long v5, v5

    .line 140
    invoke-virtual {p0, v5, v6}, Lcg/g;->Z(J)V

    .line 141
    .line 142
    .line 143
    add-int/lit8 v2, v2, 0x2

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_8
    invoke-virtual {p0}, Lcg/g;->readUtf8()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0

    .line 151
    :cond_9
    array-length v0, v4

    .line 152
    if-ne v0, v6, :cond_a

    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0

    .line 159
    :cond_a
    new-instance v0, Ljava/lang/AssertionError;

    .line 160
    .line 161
    const-string v1, "Invalid IPv6 address: \'"

    .line 162
    .line 163
    const/16 v2, 0x27

    .line 164
    .line 165
    invoke-static {v2, v1, p0}, Lka/n;->f(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    throw v0

    .line 173
    :cond_b
    :try_start_0
    invoke-static {p0}, Ljava/net/IDN;->toASCII(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    const-string v1, "toASCII(host)"

    .line 178
    .line 179
    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 183
    .line 184
    const-string v4, "US"

    .line 185
    .line 186
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    const-string v1, "this as java.lang.String).toLowerCase(locale)"

    .line 194
    .line 195
    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-nez v1, :cond_c

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_c
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    move v4, v2

    .line 210
    :goto_4
    if-ge v4, v1, :cond_f

    .line 211
    .line 212
    add-int/lit8 v5, v4, 0x1

    .line 213
    .line 214
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    const/16 v6, 0x1f

    .line 219
    .line 220
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->g(II)I

    .line 221
    .line 222
    .line 223
    move-result v6

    .line 224
    if-lez v6, :cond_10

    .line 225
    .line 226
    const/16 v6, 0x7f

    .line 227
    .line 228
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->g(II)I

    .line 229
    .line 230
    .line 231
    move-result v6

    .line 232
    if-ltz v6, :cond_d

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_d
    const-string v6, " #%/:?@[\\]"

    .line 236
    .line 237
    const/4 v7, 0x6

    .line 238
    invoke-static {v6, v4, v2, v7}, LBf/k;->v0(Ljava/lang/CharSequence;CII)I

    .line 239
    .line 240
    .line 241
    move-result v4
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 242
    if-eq v4, v3, :cond_e

    .line 243
    .line 244
    goto :goto_5

    .line 245
    :cond_e
    move v4, v5

    .line 246
    goto :goto_4

    .line 247
    :cond_f
    return-object p0

    .line 248
    :catch_0
    :cond_10
    :goto_5
    const/4 p0, 0x0

    .line 249
    return-object p0
.end method
