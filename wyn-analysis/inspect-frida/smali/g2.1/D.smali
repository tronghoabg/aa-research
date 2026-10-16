.class public final Lg2/D;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:I

.field public final c:Landroid/net/Uri;


# direct methods
.method public constructor <init>(IJLandroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p2, p0, Lg2/D;->a:J

    .line 5
    .line 6
    iput p1, p0, Lg2/D;->b:I

    .line 7
    .line 8
    iput-object p4, p0, Lg2/D;->c:Landroid/net/Uri;

    .line 9
    .line 10
    return-void
.end method

.method public static a(Landroid/net/Uri;Ljava/lang/String;)Ll8/e0;
    .locals 21

    .line 1
    const/4 v1, 0x4

    .line 2
    const-string v2, "initialCapacity"

    .line 3
    .line 4
    invoke-static {v1, v2}, Ll8/s;->d(ILjava/lang/String;)V

    .line 5
    .line 6
    .line 7
    new-array v1, v1, [Ljava/lang/Object;

    .line 8
    .line 9
    sget v2, LQ1/x;->a:I

    .line 10
    .line 11
    const-string v2, ","

    .line 12
    .line 13
    const/4 v3, -0x1

    .line 14
    move-object/from16 v4, p1

    .line 15
    .line 16
    invoke-virtual {v4, v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    array-length v4, v2

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v7, 0x0

    .line 23
    :goto_0
    if-ge v6, v4, :cond_b

    .line 24
    .line 25
    aget-object v8, v2, v6

    .line 26
    .line 27
    const-string v9, ";"

    .line 28
    .line 29
    invoke-virtual {v8, v9, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v9

    .line 33
    array-length v10, v9

    .line 34
    move v5, v3

    .line 35
    const/16 p1, 0x0

    .line 36
    .line 37
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const/4 v14, 0x0

    .line 43
    const/4 v15, 0x0

    .line 44
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    :goto_1
    if-ge v14, v10, :cond_7

    .line 50
    .line 51
    aget-object v3, v9, v14

    .line 52
    .line 53
    :try_start_0
    const-string v13, "="

    .line 54
    .line 55
    const/16 v18, 0x1

    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    invoke-virtual {v3, v13, v0}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v13

    .line 62
    aget-object v0, v13, p1

    .line 63
    .line 64
    aget-object v13, v13, v18

    .line 65
    .line 66
    move-object/from16 v19, v2

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    move/from16 v20, v4

    .line 73
    .line 74
    const v4, 0x1bc5f

    .line 75
    .line 76
    .line 77
    if-eq v2, v4, :cond_2

    .line 78
    .line 79
    const v4, 0x1c56f

    .line 80
    .line 81
    .line 82
    if-eq v2, v4, :cond_1

    .line 83
    .line 84
    const v4, 0x5ad9263b

    .line 85
    .line 86
    .line 87
    if-eq v2, v4, :cond_0

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_0
    const-string v2, "rtptime"

    .line 91
    .line 92
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_3

    .line 97
    .line 98
    const/4 v2, 0x2

    .line 99
    goto :goto_3

    .line 100
    :catch_0
    move-exception v0

    .line 101
    goto :goto_7

    .line 102
    :cond_1
    const-string v2, "url"

    .line 103
    .line 104
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_3

    .line 109
    .line 110
    move/from16 v2, p1

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_2
    const-string v2, "seq"

    .line 114
    .line 115
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_3

    .line 120
    .line 121
    move/from16 v2, v18

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_3
    :goto_2
    const/4 v2, -0x1

    .line 125
    :goto_3
    if-eqz v2, :cond_6

    .line 126
    .line 127
    move/from16 v4, v18

    .line 128
    .line 129
    if-eq v2, v4, :cond_5

    .line 130
    .line 131
    const/4 v4, 0x2

    .line 132
    if-ne v2, v4, :cond_4

    .line 133
    .line 134
    invoke-static {v13}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 135
    .line 136
    .line 137
    move-result-wide v11

    .line 138
    :goto_4
    move-object/from16 v0, p0

    .line 139
    .line 140
    :goto_5
    const/16 v18, 0x1

    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_4
    const/4 v1, 0x0

    .line 144
    invoke-static {v0, v1}, LN1/D;->b(Ljava/lang/String;Ljava/lang/Exception;)LN1/D;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    throw v0

    .line 149
    :cond_5
    invoke-static {v13}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    goto :goto_4

    .line 154
    :cond_6
    move-object/from16 v0, p0

    .line 155
    .line 156
    invoke-static {v0, v13}, Lg2/D;->b(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 157
    .line 158
    .line 159
    move-result-object v15
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 160
    goto :goto_5

    .line 161
    :goto_6
    add-int/lit8 v14, v14, 0x1

    .line 162
    .line 163
    move-object/from16 v2, v19

    .line 164
    .line 165
    move/from16 v4, v20

    .line 166
    .line 167
    const/4 v3, -0x1

    .line 168
    goto :goto_1

    .line 169
    :goto_7
    invoke-static {v3, v0}, LN1/D;->b(Ljava/lang/String;Ljava/lang/Exception;)LN1/D;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    throw v0

    .line 174
    :cond_7
    move-object/from16 v0, p0

    .line 175
    .line 176
    move-object/from16 v19, v2

    .line 177
    .line 178
    move/from16 v20, v4

    .line 179
    .line 180
    if-eqz v15, :cond_8

    .line 181
    .line 182
    invoke-virtual {v15}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    if-eqz v2, :cond_8

    .line 187
    .line 188
    const/4 v2, -0x1

    .line 189
    if-ne v5, v2, :cond_9

    .line 190
    .line 191
    cmp-long v3, v11, v16

    .line 192
    .line 193
    if-eqz v3, :cond_8

    .line 194
    .line 195
    goto :goto_8

    .line 196
    :cond_8
    const/4 v1, 0x0

    .line 197
    goto :goto_a

    .line 198
    :cond_9
    :goto_8
    new-instance v3, Lg2/D;

    .line 199
    .line 200
    invoke-direct {v3, v5, v11, v12, v15}, Lg2/D;-><init>(IJLandroid/net/Uri;)V

    .line 201
    .line 202
    .line 203
    array-length v4, v1

    .line 204
    const/16 v18, 0x1

    .line 205
    .line 206
    add-int/lit8 v5, v7, 0x1

    .line 207
    .line 208
    invoke-static {v4, v5}, Ll8/E;->f(II)I

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    array-length v8, v1

    .line 213
    if-gt v4, v8, :cond_a

    .line 214
    .line 215
    goto :goto_9

    .line 216
    :cond_a
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    :goto_9
    aput-object v3, v1, v7

    .line 221
    .line 222
    add-int/lit8 v6, v6, 0x1

    .line 223
    .line 224
    move v3, v2

    .line 225
    move v7, v5

    .line 226
    move-object/from16 v2, v19

    .line 227
    .line 228
    move/from16 v4, v20

    .line 229
    .line 230
    goto/16 :goto_0

    .line 231
    .line 232
    :goto_a
    invoke-static {v8, v1}, LN1/D;->b(Ljava/lang/String;Ljava/lang/Exception;)LN1/D;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    throw v0

    .line 237
    :cond_b
    invoke-static {v7, v1}, Ll8/K;->h(I[Ljava/lang/Object;)Ll8/e0;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    return-object v0
.end method

.method public static b(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v1, "rtsp"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {v0}, LQ1/k;->c(Z)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Landroid/net/Uri;->isAbsolute()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v1, "rtsp://"

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_1

    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_1
    const-string p0, "/"

    .line 69
    .line 70
    invoke-virtual {v1, p0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    invoke-static {v1, p1}, LQ1/k;->u(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :cond_2
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {p0, p1}, LQ1/k;->u(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0
.end method
