.class public final Lm6/a;
.super Lh6/e;
.source "SourceFile"


# static fields
.field public static final r:Ljava/util/regex/Pattern;


# instance fields
.field public final m:Z

.field public final n:LT2/a;

.field public o:Ljava/util/LinkedHashMap;

.field public p:F

.field public q:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lm6/a;->r:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lh6/e;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, -0x800001

    .line 5
    .line 6
    .line 7
    iput v0, p0, Lm6/a;->p:F

    .line 8
    .line 9
    iput v0, p0, Lm6/a;->q:F

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    iput-boolean v1, p0, Lm6/a;->m:Z

    .line 22
    .line 23
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, [B

    .line 28
    .line 29
    sget v2, Lu6/v;->a:I

    .line 30
    .line 31
    new-instance v2, Ljava/lang/String;

    .line 32
    .line 33
    sget-object v3, Lk8/g;->c:Ljava/nio/charset/Charset;

    .line 34
    .line 35
    invoke-direct {v2, v0, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 36
    .line 37
    .line 38
    const-string v0, "Format:"

    .line 39
    .line 40
    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {v0}, Lu6/a;->e(Z)V

    .line 45
    .line 46
    .line 47
    invoke-static {v2}, LT2/a;->c(Ljava/lang/String;)LT2/a;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iput-object v0, p0, Lm6/a;->n:LT2/a;

    .line 55
    .line 56
    new-instance v0, LY4/b;

    .line 57
    .line 58
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, [B

    .line 63
    .line 64
    invoke-direct {v0, p1}, LY4/b;-><init>([B)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lm6/a;->i(LY4/b;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_0
    iput-boolean v0, p0, Lm6/a;->m:Z

    .line 72
    .line 73
    const/4 p1, 0x0

    .line 74
    iput-object p1, p0, Lm6/a;->n:LT2/a;

    .line 75
    .line 76
    return-void
.end method

.method public static h(JLjava/util/ArrayList;Ljava/util/ArrayList;)I
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    :goto_0
    if-ltz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ljava/lang/Long;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    cmp-long v1, v1, p0

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    return v0

    .line 24
    :cond_0
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/Long;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    cmp-long v1, v1, p0

    .line 35
    .line 36
    if-gez v1, :cond_1

    .line 37
    .line 38
    add-int/lit8 v0, v0, 0x1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 v0, 0x0

    .line 45
    :goto_1
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p2, v0, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance p0, Ljava/util/ArrayList;

    .line 53
    .line 54
    if-nez v0, :cond_3

    .line 55
    .line 56
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    add-int/lit8 p1, v0, -0x1

    .line 61
    .line 62
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Ljava/util/Collection;

    .line 67
    .line 68
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 69
    .line 70
    .line 71
    :goto_2
    invoke-virtual {p3, v0, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return v0
.end method

.method public static j(Ljava/lang/String;)J
    .locals 6

    .line 1
    sget-object v0, Lm6/a;->r:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    return-wide v0

    .line 23
    :cond_0
    const/4 v0, 0x1

    .line 24
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget v1, Lu6/v;->a:I

    .line 29
    .line 30
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    const-wide v2, 0xd693a400L

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    mul-long/2addr v0, v2

    .line 40
    const/4 v2, 0x2

    .line 41
    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v2

    .line 49
    const-wide/32 v4, 0x3938700

    .line 50
    .line 51
    .line 52
    mul-long/2addr v2, v4

    .line 53
    add-long/2addr v2, v0

    .line 54
    const/4 v0, 0x3

    .line 55
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    const-wide/32 v4, 0xf4240

    .line 64
    .line 65
    .line 66
    mul-long/2addr v0, v4

    .line 67
    add-long/2addr v0, v2

    .line 68
    const/4 v2, 0x4

    .line 69
    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 74
    .line 75
    .line 76
    move-result-wide v2

    .line 77
    const-wide/16 v4, 0x2710

    .line 78
    .line 79
    mul-long/2addr v2, v4

    .line 80
    add-long/2addr v2, v0

    .line 81
    return-wide v2
.end method


# virtual methods
.method public final e([BIZ)Lh6/f;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v3, LY4/b;

    .line 14
    .line 15
    move-object/from16 v4, p1

    .line 16
    .line 17
    move/from16 v5, p2

    .line 18
    .line 19
    invoke-direct {v3, v4, v5}, LY4/b;-><init>([BI)V

    .line 20
    .line 21
    .line 22
    iget-boolean v4, v0, Lm6/a;->m:Z

    .line 23
    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0, v3}, Lm6/a;->i(LY4/b;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    if-eqz v4, :cond_1

    .line 30
    .line 31
    iget-object v4, v0, Lm6/a;->n:LT2/a;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v4, 0x0

    .line 35
    :goto_0
    invoke-virtual {v3}, LY4/b;->e()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    if-eqz v6, :cond_20

    .line 40
    .line 41
    const-string v7, "Format:"

    .line 42
    .line 43
    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-eqz v7, :cond_2

    .line 48
    .line 49
    invoke-static {v6}, LT2/a;->c(Ljava/lang/String;)LT2/a;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    const-string v7, "Dialogue:"

    .line 55
    .line 56
    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    if-eqz v8, :cond_3

    .line 61
    .line 62
    const-string v8, "SsaDecoder"

    .line 63
    .line 64
    if-nez v4, :cond_4

    .line 65
    .line 66
    const-string v7, "Skipping dialogue line before complete format: "

    .line 67
    .line 68
    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-static {v8, v6}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    :goto_1
    move-object/from16 p3, v3

    .line 76
    .line 77
    move-object/from16 v35, v4

    .line 78
    .line 79
    goto/16 :goto_14

    .line 80
    .line 81
    :cond_4
    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    invoke-static {v7}, Lu6/a;->e(Z)V

    .line 86
    .line 87
    .line 88
    const/16 v7, 0x9

    .line 89
    .line 90
    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    const-string v9, ","

    .line 95
    .line 96
    iget v10, v4, LT2/a;->e:I

    .line 97
    .line 98
    invoke-virtual {v7, v9, v10}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    array-length v9, v7

    .line 103
    if-eq v9, v10, :cond_5

    .line 104
    .line 105
    const-string v7, "Skipping dialogue line with fewer columns than format: "

    .line 106
    .line 107
    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-static {v8, v6}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_5
    iget v9, v4, LT2/a;->a:I

    .line 116
    .line 117
    aget-object v9, v7, v9

    .line 118
    .line 119
    invoke-static {v9}, Lm6/a;->j(Ljava/lang/String;)J

    .line 120
    .line 121
    .line 122
    move-result-wide v9

    .line 123
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    cmp-long v13, v9, v11

    .line 129
    .line 130
    const-string v14, "Skipping invalid timing: "

    .line 131
    .line 132
    if-nez v13, :cond_6

    .line 133
    .line 134
    invoke-virtual {v14, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-static {v8, v6}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_6
    iget v13, v4, LT2/a;->b:I

    .line 143
    .line 144
    aget-object v13, v7, v13

    .line 145
    .line 146
    move-wide/from16 p1, v11

    .line 147
    .line 148
    invoke-static {v13}, Lm6/a;->j(Ljava/lang/String;)J

    .line 149
    .line 150
    .line 151
    move-result-wide v11

    .line 152
    cmp-long v13, v11, p1

    .line 153
    .line 154
    if-nez v13, :cond_7

    .line 155
    .line 156
    invoke-virtual {v14, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    invoke-static {v8, v6}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_7
    iget-object v6, v0, Lm6/a;->o:Ljava/util/LinkedHashMap;

    .line 165
    .line 166
    const/4 v13, -0x1

    .line 167
    if-eqz v6, :cond_8

    .line 168
    .line 169
    iget v14, v4, LT2/a;->c:I

    .line 170
    .line 171
    if-eq v14, v13, :cond_8

    .line 172
    .line 173
    aget-object v14, v7, v14

    .line 174
    .line 175
    invoke-virtual {v14}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v14

    .line 179
    invoke-virtual {v6, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    check-cast v6, Lm6/c;

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_8
    const/4 v6, 0x0

    .line 187
    :goto_2
    iget v14, v4, LT2/a;->d:I

    .line 188
    .line 189
    aget-object v7, v7, v14

    .line 190
    .line 191
    sget-object v14, Lm6/b;->a:Ljava/util/regex/Pattern;

    .line 192
    .line 193
    invoke-virtual {v14, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 194
    .line 195
    .line 196
    move-result-object v14

    .line 197
    move v15, v13

    .line 198
    const/4 v5, 0x0

    .line 199
    :goto_3
    invoke-virtual {v14}, Ljava/util/regex/Matcher;->find()Z

    .line 200
    .line 201
    .line 202
    move-result v16

    .line 203
    const/4 v13, 0x1

    .line 204
    if-eqz v16, :cond_c

    .line 205
    .line 206
    move-object/from16 p3, v3

    .line 207
    .line 208
    invoke-virtual {v14, v13}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    :try_start_0
    invoke-static {v3}, Lm6/b;->a(Ljava/lang/String;)Landroid/graphics/PointF;

    .line 216
    .line 217
    .line 218
    move-result-object v16
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 219
    if-eqz v16, :cond_9

    .line 220
    .line 221
    move-object/from16 v5, v16

    .line 222
    .line 223
    :catch_0
    :cond_9
    :try_start_1
    sget-object v13, Lm6/b;->d:Ljava/util/regex/Pattern;

    .line 224
    .line 225
    invoke-virtual {v13, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    .line 230
    .line 231
    .line 232
    move-result v13

    .line 233
    if-eqz v13, :cond_a

    .line 234
    .line 235
    const/4 v13, 0x1

    .line 236
    invoke-virtual {v3, v13}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    invoke-static {v3}, Lm6/c;->a(Ljava/lang/String;)I

    .line 244
    .line 245
    .line 246
    move-result v3
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 247
    :goto_4
    const/4 v13, -0x1

    .line 248
    goto :goto_5

    .line 249
    :cond_a
    const/4 v3, -0x1

    .line 250
    goto :goto_4

    .line 251
    :goto_5
    if-eq v3, v13, :cond_b

    .line 252
    .line 253
    move v15, v3

    .line 254
    :catch_1
    :cond_b
    move-object/from16 v3, p3

    .line 255
    .line 256
    const/4 v13, -0x1

    .line 257
    goto :goto_3

    .line 258
    :cond_c
    move-object/from16 p3, v3

    .line 259
    .line 260
    new-instance v3, Lm6/b;

    .line 261
    .line 262
    sget-object v3, Lm6/b;->a:Ljava/util/regex/Pattern;

    .line 263
    .line 264
    invoke-virtual {v3, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    const-string v7, ""

    .line 269
    .line 270
    invoke-virtual {v3, v7}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    const-string v7, "\\N"

    .line 275
    .line 276
    const-string v13, "\n"

    .line 277
    .line 278
    invoke-virtual {v3, v7, v13}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    const-string v7, "\\n"

    .line 283
    .line 284
    invoke-virtual {v3, v7, v13}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    const-string v7, "\\h"

    .line 289
    .line 290
    const-string v13, "\u00a0"

    .line 291
    .line 292
    invoke-virtual {v3, v7, v13}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v3

    .line 296
    iget v7, v0, Lm6/a;->p:F

    .line 297
    .line 298
    iget v13, v0, Lm6/a;->q:F

    .line 299
    .line 300
    new-instance v14, Landroid/text/SpannableString;

    .line 301
    .line 302
    invoke-direct {v14, v3}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 303
    .line 304
    .line 305
    const v17, -0x800001

    .line 306
    .line 307
    .line 308
    const v29, -0x800001

    .line 309
    .line 310
    .line 311
    const/high16 v33, -0x80000000

    .line 312
    .line 313
    if-eqz v6, :cond_15

    .line 314
    .line 315
    iget-object v3, v6, Lm6/c;->c:Ljava/lang/Integer;

    .line 316
    .line 317
    if-eqz v3, :cond_d

    .line 318
    .line 319
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    .line 320
    .line 321
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    invoke-direct {v0, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v14}, Landroid/text/SpannableString;->length()I

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    move-object/from16 v35, v4

    .line 333
    .line 334
    move/from16 v20, v7

    .line 335
    .line 336
    const/4 v4, 0x0

    .line 337
    const/16 v7, 0x21

    .line 338
    .line 339
    invoke-virtual {v14, v0, v4, v3, v7}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 340
    .line 341
    .line 342
    goto :goto_6

    .line 343
    :cond_d
    move-object/from16 v35, v4

    .line 344
    .line 345
    move/from16 v20, v7

    .line 346
    .line 347
    :goto_6
    iget v0, v6, Lm6/c;->j:I

    .line 348
    .line 349
    const/4 v3, 0x3

    .line 350
    if-ne v0, v3, :cond_e

    .line 351
    .line 352
    iget-object v0, v6, Lm6/c;->d:Ljava/lang/Integer;

    .line 353
    .line 354
    if-eqz v0, :cond_e

    .line 355
    .line 356
    new-instance v4, Landroid/text/style/BackgroundColorSpan;

    .line 357
    .line 358
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    invoke-direct {v4, v0}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v14}, Landroid/text/SpannableString;->length()I

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    const/16 v3, 0x21

    .line 370
    .line 371
    const/4 v7, 0x0

    .line 372
    invoke-virtual {v14, v4, v7, v0, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 373
    .line 374
    .line 375
    :cond_e
    iget v0, v6, Lm6/c;->e:F

    .line 376
    .line 377
    cmpl-float v3, v0, v17

    .line 378
    .line 379
    if-eqz v3, :cond_f

    .line 380
    .line 381
    cmpl-float v3, v13, v17

    .line 382
    .line 383
    if-eqz v3, :cond_f

    .line 384
    .line 385
    div-float/2addr v0, v13

    .line 386
    const/4 v3, 0x1

    .line 387
    goto :goto_7

    .line 388
    :cond_f
    move/from16 v0, v29

    .line 389
    .line 390
    move/from16 v3, v33

    .line 391
    .line 392
    :goto_7
    iget-boolean v4, v6, Lm6/c;->g:Z

    .line 393
    .line 394
    iget-boolean v7, v6, Lm6/c;->f:Z

    .line 395
    .line 396
    if-eqz v7, :cond_10

    .line 397
    .line 398
    if-eqz v4, :cond_10

    .line 399
    .line 400
    new-instance v4, Landroid/text/style/StyleSpan;

    .line 401
    .line 402
    const/4 v7, 0x3

    .line 403
    invoke-direct {v4, v7}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v14}, Landroid/text/SpannableString;->length()I

    .line 407
    .line 408
    .line 409
    move-result v7

    .line 410
    move/from16 v21, v0

    .line 411
    .line 412
    move/from16 v19, v3

    .line 413
    .line 414
    const/4 v0, 0x0

    .line 415
    const/16 v3, 0x21

    .line 416
    .line 417
    invoke-virtual {v14, v4, v0, v7, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 418
    .line 419
    .line 420
    goto :goto_8

    .line 421
    :cond_10
    move/from16 v21, v0

    .line 422
    .line 423
    move/from16 v19, v3

    .line 424
    .line 425
    const/4 v0, 0x0

    .line 426
    const/16 v3, 0x21

    .line 427
    .line 428
    if-eqz v7, :cond_11

    .line 429
    .line 430
    new-instance v4, Landroid/text/style/StyleSpan;

    .line 431
    .line 432
    const/4 v7, 0x1

    .line 433
    invoke-direct {v4, v7}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v14}, Landroid/text/SpannableString;->length()I

    .line 437
    .line 438
    .line 439
    move-result v7

    .line 440
    invoke-virtual {v14, v4, v0, v7, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 441
    .line 442
    .line 443
    goto :goto_8

    .line 444
    :cond_11
    if-eqz v4, :cond_12

    .line 445
    .line 446
    new-instance v4, Landroid/text/style/StyleSpan;

    .line 447
    .line 448
    const/4 v7, 0x2

    .line 449
    invoke-direct {v4, v7}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v14}, Landroid/text/SpannableString;->length()I

    .line 453
    .line 454
    .line 455
    move-result v7

    .line 456
    invoke-virtual {v14, v4, v0, v7, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 457
    .line 458
    .line 459
    :cond_12
    :goto_8
    iget-boolean v4, v6, Lm6/c;->h:Z

    .line 460
    .line 461
    if-eqz v4, :cond_13

    .line 462
    .line 463
    new-instance v4, Landroid/text/style/UnderlineSpan;

    .line 464
    .line 465
    invoke-direct {v4}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v14}, Landroid/text/SpannableString;->length()I

    .line 469
    .line 470
    .line 471
    move-result v7

    .line 472
    invoke-virtual {v14, v4, v0, v7, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 473
    .line 474
    .line 475
    :cond_13
    iget-boolean v4, v6, Lm6/c;->i:Z

    .line 476
    .line 477
    if-eqz v4, :cond_14

    .line 478
    .line 479
    new-instance v4, Landroid/text/style/StrikethroughSpan;

    .line 480
    .line 481
    invoke-direct {v4}, Landroid/text/style/StrikethroughSpan;-><init>()V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v14}, Landroid/text/SpannableString;->length()I

    .line 485
    .line 486
    .line 487
    move-result v7

    .line 488
    invoke-virtual {v14, v4, v0, v7, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 489
    .line 490
    .line 491
    :cond_14
    move/from16 v27, v19

    .line 492
    .line 493
    move/from16 v28, v21

    .line 494
    .line 495
    :goto_9
    const/4 v3, -0x1

    .line 496
    goto :goto_a

    .line 497
    :cond_15
    move-object/from16 v35, v4

    .line 498
    .line 499
    move/from16 v20, v7

    .line 500
    .line 501
    const/4 v0, 0x0

    .line 502
    move/from16 v28, v29

    .line 503
    .line 504
    move/from16 v27, v33

    .line 505
    .line 506
    goto :goto_9

    .line 507
    :goto_a
    if-eq v15, v3, :cond_16

    .line 508
    .line 509
    move v3, v15

    .line 510
    goto :goto_b

    .line 511
    :cond_16
    if-eqz v6, :cond_17

    .line 512
    .line 513
    iget v3, v6, Lm6/c;->b:I

    .line 514
    .line 515
    :cond_17
    :goto_b
    const-string v4, "Unknown alignment: "

    .line 516
    .line 517
    packed-switch v3, :pswitch_data_0

    .line 518
    .line 519
    .line 520
    :pswitch_0
    invoke-static {v3, v4, v8}, LA7/p0;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    :pswitch_1
    const/16 v19, 0x0

    .line 524
    .line 525
    goto :goto_d

    .line 526
    :pswitch_2
    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 527
    .line 528
    :goto_c
    move-object/from16 v19, v6

    .line 529
    .line 530
    goto :goto_d

    .line 531
    :pswitch_3
    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 532
    .line 533
    goto :goto_c

    .line 534
    :pswitch_4
    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 535
    .line 536
    goto :goto_c

    .line 537
    :goto_d
    const/high16 v6, -0x80000000

    .line 538
    .line 539
    packed-switch v3, :pswitch_data_1

    .line 540
    .line 541
    .line 542
    :pswitch_5
    invoke-static {v3, v4, v8}, LA7/p0;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    :pswitch_6
    move v7, v6

    .line 546
    goto :goto_e

    .line 547
    :pswitch_7
    const/4 v7, 0x2

    .line 548
    goto :goto_e

    .line 549
    :pswitch_8
    const/4 v7, 0x1

    .line 550
    goto :goto_e

    .line 551
    :pswitch_9
    move v7, v0

    .line 552
    :goto_e
    packed-switch v3, :pswitch_data_2

    .line 553
    .line 554
    .line 555
    :pswitch_a
    invoke-static {v3, v4, v8}, LA7/p0;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    goto :goto_f

    .line 559
    :pswitch_b
    move v6, v0

    .line 560
    goto :goto_f

    .line 561
    :pswitch_c
    const/4 v6, 0x1

    .line 562
    goto :goto_f

    .line 563
    :pswitch_d
    const/4 v6, 0x2

    .line 564
    :goto_f
    :pswitch_e
    if-eqz v5, :cond_18

    .line 565
    .line 566
    cmpl-float v3, v13, v17

    .line 567
    .line 568
    if-eqz v3, :cond_18

    .line 569
    .line 570
    cmpl-float v3, v20, v17

    .line 571
    .line 572
    if-eqz v3, :cond_18

    .line 573
    .line 574
    iget v3, v5, Landroid/graphics/PointF;->x:F

    .line 575
    .line 576
    div-float v3, v3, v20

    .line 577
    .line 578
    iget v4, v5, Landroid/graphics/PointF;->y:F

    .line 579
    .line 580
    div-float/2addr v4, v13

    .line 581
    move/from16 v25, v3

    .line 582
    .line 583
    move/from16 v22, v4

    .line 584
    .line 585
    goto :goto_12

    .line 586
    :cond_18
    const v3, 0x3d4ccccd    # 0.05f

    .line 587
    .line 588
    .line 589
    const/high16 v4, 0x3f000000    # 0.5f

    .line 590
    .line 591
    const v5, 0x3f733333    # 0.95f

    .line 592
    .line 593
    .line 594
    if-eqz v7, :cond_1b

    .line 595
    .line 596
    const/4 v13, 0x1

    .line 597
    if-eq v7, v13, :cond_1a

    .line 598
    .line 599
    const/4 v8, 0x2

    .line 600
    if-eq v7, v8, :cond_19

    .line 601
    .line 602
    move/from16 v15, v17

    .line 603
    .line 604
    goto :goto_10

    .line 605
    :cond_19
    move v15, v5

    .line 606
    goto :goto_10

    .line 607
    :cond_1a
    const/4 v8, 0x2

    .line 608
    move v15, v4

    .line 609
    goto :goto_10

    .line 610
    :cond_1b
    const/4 v8, 0x2

    .line 611
    const/4 v13, 0x1

    .line 612
    move v15, v3

    .line 613
    :goto_10
    if-eqz v6, :cond_1e

    .line 614
    .line 615
    if-eq v6, v13, :cond_1d

    .line 616
    .line 617
    if-eq v6, v8, :cond_1c

    .line 618
    .line 619
    move/from16 v3, v17

    .line 620
    .line 621
    goto :goto_11

    .line 622
    :cond_1c
    move v3, v5

    .line 623
    goto :goto_11

    .line 624
    :cond_1d
    move v3, v4

    .line 625
    :cond_1e
    :goto_11
    move/from16 v22, v3

    .line 626
    .line 627
    move/from16 v25, v15

    .line 628
    .line 629
    :goto_12
    new-instance v17, Lh6/b;

    .line 630
    .line 631
    const/16 v20, 0x0

    .line 632
    .line 633
    const/16 v31, 0x0

    .line 634
    .line 635
    const/high16 v32, -0x1000000

    .line 636
    .line 637
    const/16 v34, 0x0

    .line 638
    .line 639
    move-object/from16 v21, v20

    .line 640
    .line 641
    move/from16 v30, v29

    .line 642
    .line 643
    move/from16 v23, v0

    .line 644
    .line 645
    move/from16 v24, v6

    .line 646
    .line 647
    move/from16 v26, v7

    .line 648
    .line 649
    move-object/from16 v18, v14

    .line 650
    .line 651
    invoke-direct/range {v17 .. v34}, Lh6/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    .line 652
    .line 653
    .line 654
    move-object/from16 v0, v17

    .line 655
    .line 656
    invoke-static {v9, v10, v2, v1}, Lm6/a;->h(JLjava/util/ArrayList;Ljava/util/ArrayList;)I

    .line 657
    .line 658
    .line 659
    move-result v3

    .line 660
    invoke-static {v11, v12, v2, v1}, Lm6/a;->h(JLjava/util/ArrayList;Ljava/util/ArrayList;)I

    .line 661
    .line 662
    .line 663
    move-result v4

    .line 664
    :goto_13
    if-ge v3, v4, :cond_1f

    .line 665
    .line 666
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object v5

    .line 670
    check-cast v5, Ljava/util/List;

    .line 671
    .line 672
    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 673
    .line 674
    .line 675
    add-int/lit8 v3, v3, 0x1

    .line 676
    .line 677
    goto :goto_13

    .line 678
    :cond_1f
    :goto_14
    move-object/from16 v0, p0

    .line 679
    .line 680
    move-object/from16 v3, p3

    .line 681
    .line 682
    move-object/from16 v4, v35

    .line 683
    .line 684
    goto/16 :goto_0

    .line 685
    .line 686
    :cond_20
    new-instance v0, Lcom/moloco/sdk/acm/http/d;

    .line 687
    .line 688
    invoke-direct {v0, v1, v2}, Lcom/moloco/sdk/acm/http/d;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 689
    .line 690
    .line 691
    return-object v0

    .line 692
    nop

    .line 693
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch

    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_6
        :pswitch_5
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch

    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    :pswitch_data_2
    .packed-switch -0x1
        :pswitch_e
        :pswitch_a
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_b
    .end packed-switch
.end method

.method public final i(LY4/b;)V
    .locals 39

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const/4 v3, 0x6

    .line 6
    const/4 v4, 0x3

    .line 7
    const/4 v5, 0x7

    .line 8
    const/4 v6, -0x1

    .line 9
    const/4 v7, 0x2

    .line 10
    const/4 v8, 0x0

    .line 11
    const/4 v9, 0x1

    .line 12
    :cond_0
    :goto_0
    invoke-virtual {v2}, LY4/b;->e()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_25

    .line 17
    .line 18
    const-string v10, "[Script Info]"

    .line 19
    .line 20
    invoke-virtual {v10, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v10

    .line 24
    const/16 v11, 0x5b

    .line 25
    .line 26
    if-eqz v10, :cond_5

    .line 27
    .line 28
    :catch_0
    :goto_1
    invoke-virtual {v2}, LY4/b;->e()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {v2}, LY4/b;->a()I

    .line 35
    .line 36
    .line 37
    move-result v10

    .line 38
    if-eqz v10, :cond_1

    .line 39
    .line 40
    iget-object v10, v2, LY4/b;->a:[B

    .line 41
    .line 42
    iget v12, v2, LY4/b;->b:I

    .line 43
    .line 44
    aget-byte v10, v10, v12

    .line 45
    .line 46
    and-int/lit16 v10, v10, 0xff

    .line 47
    .line 48
    if-eq v10, v11, :cond_0

    .line 49
    .line 50
    :cond_1
    const-string v10, ":"

    .line 51
    .line 52
    invoke-virtual {v0, v10}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    array-length v10, v0

    .line 57
    if-eq v10, v7, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    aget-object v10, v0, v8

    .line 61
    .line 62
    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v10

    .line 66
    invoke-static {v10}, LA6/h;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    const-string v12, "playresx"

    .line 74
    .line 75
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v12

    .line 79
    if-nez v12, :cond_4

    .line 80
    .line 81
    const-string v12, "playresy"

    .line 82
    .line 83
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v10

    .line 87
    if-nez v10, :cond_3

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    :try_start_0
    aget-object v0, v0, v9

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iput v0, v1, Lm6/a;->q:F

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    aget-object v0, v0, v9

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    iput v0, v1, Lm6/a;->p:F
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_5
    const-string v10, "[V4+ Styles]"

    .line 117
    .line 118
    invoke-virtual {v10, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 119
    .line 120
    .line 121
    move-result v10

    .line 122
    const-string v12, "SsaDecoder"

    .line 123
    .line 124
    if-eqz v10, :cond_23

    .line 125
    .line 126
    new-instance v10, Ljava/util/LinkedHashMap;

    .line 127
    .line 128
    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    .line 129
    .line 130
    .line 131
    const/4 v14, 0x0

    .line 132
    :goto_2
    invoke-virtual {v2}, LY4/b;->e()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v15

    .line 136
    if-eqz v15, :cond_21

    .line 137
    .line 138
    invoke-virtual {v2}, LY4/b;->a()I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_6

    .line 143
    .line 144
    iget-object v0, v2, LY4/b;->a:[B

    .line 145
    .line 146
    iget v7, v2, LY4/b;->b:I

    .line 147
    .line 148
    aget-byte v0, v0, v7

    .line 149
    .line 150
    and-int/lit16 v0, v0, 0xff

    .line 151
    .line 152
    if-eq v0, v11, :cond_21

    .line 153
    .line 154
    :cond_6
    const-string v0, "Format:"

    .line 155
    .line 156
    invoke-virtual {v15, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    const-string v7, ","

    .line 161
    .line 162
    if-eqz v0, :cond_13

    .line 163
    .line 164
    invoke-virtual {v15, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-static {v0, v7}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    move v14, v6

    .line 173
    move/from16 v18, v14

    .line 174
    .line 175
    move/from16 v19, v18

    .line 176
    .line 177
    move/from16 v20, v19

    .line 178
    .line 179
    move/from16 v21, v20

    .line 180
    .line 181
    move/from16 v22, v21

    .line 182
    .line 183
    move/from16 v23, v22

    .line 184
    .line 185
    move/from16 v24, v23

    .line 186
    .line 187
    move/from16 v25, v24

    .line 188
    .line 189
    move/from16 v26, v25

    .line 190
    .line 191
    move v7, v8

    .line 192
    :goto_3
    array-length v15, v0

    .line 193
    if-ge v7, v15, :cond_11

    .line 194
    .line 195
    aget-object v15, v0, v7

    .line 196
    .line 197
    invoke-virtual {v15}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v15

    .line 201
    invoke-static {v15}, LA6/h;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v15

    .line 205
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v15}, Ljava/lang/String;->hashCode()I

    .line 209
    .line 210
    .line 211
    move-result v16

    .line 212
    sparse-switch v16, :sswitch_data_0

    .line 213
    .line 214
    .line 215
    :goto_4
    move v5, v6

    .line 216
    goto/16 :goto_5

    .line 217
    .line 218
    :sswitch_0
    const-string v5, "outlinecolour"

    .line 219
    .line 220
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    if-nez v5, :cond_7

    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_7
    const/16 v5, 0x9

    .line 228
    .line 229
    goto/16 :goto_5

    .line 230
    .line 231
    :sswitch_1
    const-string v5, "alignment"

    .line 232
    .line 233
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    if-nez v5, :cond_8

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_8
    const/16 v5, 0x8

    .line 241
    .line 242
    goto/16 :goto_5

    .line 243
    .line 244
    :sswitch_2
    const-string v5, "borderstyle"

    .line 245
    .line 246
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v5

    .line 250
    if-nez v5, :cond_9

    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_9
    const/4 v5, 0x7

    .line 254
    goto :goto_5

    .line 255
    :sswitch_3
    const-string v5, "fontsize"

    .line 256
    .line 257
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    if-nez v5, :cond_a

    .line 262
    .line 263
    goto :goto_4

    .line 264
    :cond_a
    move v5, v3

    .line 265
    goto :goto_5

    .line 266
    :sswitch_4
    const-string v5, "name"

    .line 267
    .line 268
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v5

    .line 272
    if-nez v5, :cond_b

    .line 273
    .line 274
    goto :goto_4

    .line 275
    :cond_b
    const/4 v5, 0x5

    .line 276
    goto :goto_5

    .line 277
    :sswitch_5
    const-string v5, "bold"

    .line 278
    .line 279
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v5

    .line 283
    if-nez v5, :cond_c

    .line 284
    .line 285
    goto :goto_4

    .line 286
    :cond_c
    const/4 v5, 0x4

    .line 287
    goto :goto_5

    .line 288
    :sswitch_6
    const-string v5, "primarycolour"

    .line 289
    .line 290
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v5

    .line 294
    if-nez v5, :cond_d

    .line 295
    .line 296
    goto :goto_4

    .line 297
    :cond_d
    move v5, v4

    .line 298
    goto :goto_5

    .line 299
    :sswitch_7
    const-string v5, "strikeout"

    .line 300
    .line 301
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v5

    .line 305
    if-nez v5, :cond_e

    .line 306
    .line 307
    goto :goto_4

    .line 308
    :cond_e
    const/4 v5, 0x2

    .line 309
    goto :goto_5

    .line 310
    :sswitch_8
    const-string v5, "underline"

    .line 311
    .line 312
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v5

    .line 316
    if-nez v5, :cond_f

    .line 317
    .line 318
    goto :goto_4

    .line 319
    :cond_f
    move v5, v9

    .line 320
    goto :goto_5

    .line 321
    :sswitch_9
    const-string v5, "italic"

    .line 322
    .line 323
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v5

    .line 327
    if-nez v5, :cond_10

    .line 328
    .line 329
    goto :goto_4

    .line 330
    :cond_10
    move v5, v8

    .line 331
    :goto_5
    packed-switch v5, :pswitch_data_0

    .line 332
    .line 333
    .line 334
    goto :goto_6

    .line 335
    :pswitch_0
    move/from16 v20, v7

    .line 336
    .line 337
    goto :goto_6

    .line 338
    :pswitch_1
    move/from16 v18, v7

    .line 339
    .line 340
    goto :goto_6

    .line 341
    :pswitch_2
    move/from16 v26, v7

    .line 342
    .line 343
    goto :goto_6

    .line 344
    :pswitch_3
    move/from16 v21, v7

    .line 345
    .line 346
    goto :goto_6

    .line 347
    :pswitch_4
    move v14, v7

    .line 348
    goto :goto_6

    .line 349
    :pswitch_5
    move/from16 v22, v7

    .line 350
    .line 351
    goto :goto_6

    .line 352
    :pswitch_6
    move/from16 v19, v7

    .line 353
    .line 354
    goto :goto_6

    .line 355
    :pswitch_7
    move/from16 v25, v7

    .line 356
    .line 357
    goto :goto_6

    .line 358
    :pswitch_8
    move/from16 v24, v7

    .line 359
    .line 360
    goto :goto_6

    .line 361
    :pswitch_9
    move/from16 v23, v7

    .line 362
    .line 363
    :goto_6
    add-int/2addr v7, v9

    .line 364
    const/4 v5, 0x7

    .line 365
    goto/16 :goto_3

    .line 366
    .line 367
    :cond_11
    if-eq v14, v6, :cond_12

    .line 368
    .line 369
    new-instance v16, LT2/c;

    .line 370
    .line 371
    array-length v0, v0

    .line 372
    move/from16 v27, v0

    .line 373
    .line 374
    move/from16 v17, v14

    .line 375
    .line 376
    invoke-direct/range {v16 .. v27}, LT2/c;-><init>(IIIIIIIIIII)V

    .line 377
    .line 378
    .line 379
    move-object/from16 v14, v16

    .line 380
    .line 381
    goto :goto_7

    .line 382
    :cond_12
    const/4 v14, 0x0

    .line 383
    :goto_7
    const/4 v5, 0x7

    .line 384
    const/4 v7, 0x2

    .line 385
    goto/16 :goto_2

    .line 386
    .line 387
    :cond_13
    const-string v0, "Style:"

    .line 388
    .line 389
    invoke-virtual {v15, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 390
    .line 391
    .line 392
    move-result v5

    .line 393
    if-eqz v5, :cond_20

    .line 394
    .line 395
    if-nez v14, :cond_14

    .line 396
    .line 397
    const-string v0, "Skipping \'Style:\' line before \'Format:\' line: "

    .line 398
    .line 399
    invoke-virtual {v0, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    invoke-static {v12, v0}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    goto/16 :goto_15

    .line 407
    .line 408
    :cond_14
    invoke-virtual {v15, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    invoke-static {v0}, Lu6/a;->e(Z)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v15, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    invoke-static {v0, v7}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v5

    .line 423
    array-length v0, v5

    .line 424
    iget v7, v14, LT2/c;->k:I

    .line 425
    .line 426
    const-string v3, "\'"

    .line 427
    .line 428
    const-string v8, "SsaStyle"

    .line 429
    .line 430
    if-eq v0, v7, :cond_15

    .line 431
    .line 432
    array-length v0, v5

    .line 433
    sget v5, Lu6/v;->a:I

    .line 434
    .line 435
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 436
    .line 437
    const-string v5, "Skipping malformed \'Style:\' line (expected "

    .line 438
    .line 439
    const-string v11, " values, found "

    .line 440
    .line 441
    const-string v13, "): \'"

    .line 442
    .line 443
    invoke-static {v5, v7, v11, v0, v13}, LR8/v;->h(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    invoke-static {v8, v0}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    :goto_8
    const/4 v0, 0x0

    .line 461
    goto/16 :goto_14

    .line 462
    .line 463
    :cond_15
    :try_start_1
    new-instance v28, Lm6/c;

    .line 464
    .line 465
    iget v0, v14, LT2/c;->a:I

    .line 466
    .line 467
    aget-object v0, v5, v0

    .line 468
    .line 469
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v29

    .line 473
    iget v0, v14, LT2/c;->b:I

    .line 474
    .line 475
    if-eq v0, v6, :cond_16

    .line 476
    .line 477
    aget-object v0, v5, v0

    .line 478
    .line 479
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    invoke-static {v0}, Lm6/c;->a(Ljava/lang/String;)I

    .line 484
    .line 485
    .line 486
    move-result v0

    .line 487
    move/from16 v30, v0

    .line 488
    .line 489
    goto :goto_9

    .line 490
    :catch_1
    move-exception v0

    .line 491
    goto/16 :goto_13

    .line 492
    .line 493
    :cond_16
    move/from16 v30, v6

    .line 494
    .line 495
    :goto_9
    iget v0, v14, LT2/c;->c:I

    .line 496
    .line 497
    if-eq v0, v6, :cond_17

    .line 498
    .line 499
    aget-object v0, v5, v0

    .line 500
    .line 501
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    invoke-static {v0}, Lm6/c;->c(Ljava/lang/String;)Ljava/lang/Integer;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    move-object/from16 v31, v0

    .line 510
    .line 511
    goto :goto_a

    .line 512
    :cond_17
    const/16 v31, 0x0

    .line 513
    .line 514
    :goto_a
    iget v0, v14, LT2/c;->d:I

    .line 515
    .line 516
    if-eq v0, v6, :cond_18

    .line 517
    .line 518
    aget-object v0, v5, v0

    .line 519
    .line 520
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    invoke-static {v0}, Lm6/c;->c(Ljava/lang/String;)Ljava/lang/Integer;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    move-object/from16 v32, v0

    .line 529
    .line 530
    goto :goto_b

    .line 531
    :cond_18
    const/16 v32, 0x0

    .line 532
    .line 533
    :goto_b
    iget v0, v14, LT2/c;->e:I

    .line 534
    .line 535
    if-eq v0, v6, :cond_19

    .line 536
    .line 537
    aget-object v0, v5, v0

    .line 538
    .line 539
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v11
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 543
    :try_start_2
    invoke-static {v11}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 544
    .line 545
    .line 546
    move-result v7
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    .line 547
    goto :goto_c

    .line 548
    :catch_2
    move-exception v0

    .line 549
    :try_start_3
    new-instance v13, Ljava/lang/StringBuilder;

    .line 550
    .line 551
    const-string v7, "Failed to parse font size: \'"

    .line 552
    .line 553
    invoke-direct {v13, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v7

    .line 566
    invoke-static {v0, v8, v7}, Lu6/a;->D(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 567
    .line 568
    .line 569
    const v7, -0x800001

    .line 570
    .line 571
    .line 572
    :goto_c
    move/from16 v33, v7

    .line 573
    .line 574
    goto :goto_d

    .line 575
    :cond_19
    const v33, -0x800001

    .line 576
    .line 577
    .line 578
    :goto_d
    iget v0, v14, LT2/c;->f:I

    .line 579
    .line 580
    if-eq v0, v6, :cond_1a

    .line 581
    .line 582
    aget-object v0, v5, v0

    .line 583
    .line 584
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    invoke-static {v0}, Lm6/c;->b(Ljava/lang/String;)Z

    .line 589
    .line 590
    .line 591
    move-result v0

    .line 592
    if-eqz v0, :cond_1a

    .line 593
    .line 594
    move/from16 v34, v9

    .line 595
    .line 596
    goto :goto_e

    .line 597
    :cond_1a
    const/16 v34, 0x0

    .line 598
    .line 599
    :goto_e
    iget v0, v14, LT2/c;->g:I

    .line 600
    .line 601
    if-eq v0, v6, :cond_1b

    .line 602
    .line 603
    aget-object v0, v5, v0

    .line 604
    .line 605
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    invoke-static {v0}, Lm6/c;->b(Ljava/lang/String;)Z

    .line 610
    .line 611
    .line 612
    move-result v0

    .line 613
    if-eqz v0, :cond_1b

    .line 614
    .line 615
    move/from16 v35, v9

    .line 616
    .line 617
    goto :goto_f

    .line 618
    :cond_1b
    const/16 v35, 0x0

    .line 619
    .line 620
    :goto_f
    iget v0, v14, LT2/c;->h:I

    .line 621
    .line 622
    if-eq v0, v6, :cond_1c

    .line 623
    .line 624
    aget-object v0, v5, v0

    .line 625
    .line 626
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    invoke-static {v0}, Lm6/c;->b(Ljava/lang/String;)Z

    .line 631
    .line 632
    .line 633
    move-result v0

    .line 634
    if-eqz v0, :cond_1c

    .line 635
    .line 636
    move/from16 v36, v9

    .line 637
    .line 638
    goto :goto_10

    .line 639
    :cond_1c
    const/16 v36, 0x0

    .line 640
    .line 641
    :goto_10
    iget v0, v14, LT2/c;->i:I

    .line 642
    .line 643
    if-eq v0, v6, :cond_1d

    .line 644
    .line 645
    aget-object v0, v5, v0

    .line 646
    .line 647
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    invoke-static {v0}, Lm6/c;->b(Ljava/lang/String;)Z

    .line 652
    .line 653
    .line 654
    move-result v0

    .line 655
    if-eqz v0, :cond_1d

    .line 656
    .line 657
    move/from16 v37, v9

    .line 658
    .line 659
    goto :goto_11

    .line 660
    :cond_1d
    const/16 v37, 0x0

    .line 661
    .line 662
    :goto_11
    iget v0, v14, LT2/c;->j:I

    .line 663
    .line 664
    if-eq v0, v6, :cond_1f

    .line 665
    .line 666
    aget-object v0, v5, v0

    .line 667
    .line 668
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1

    .line 672
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object v5

    .line 676
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 677
    .line 678
    .line 679
    move-result v5
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1

    .line 680
    if-eq v5, v9, :cond_1e

    .line 681
    .line 682
    if-eq v5, v4, :cond_1e

    .line 683
    .line 684
    :catch_3
    :try_start_5
    new-instance v5, Ljava/lang/StringBuilder;

    .line 685
    .line 686
    const-string v7, "Ignoring unknown BorderStyle: "

    .line 687
    .line 688
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 689
    .line 690
    .line 691
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 692
    .line 693
    .line 694
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    invoke-static {v8, v0}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 699
    .line 700
    .line 701
    move v5, v6

    .line 702
    :cond_1e
    move/from16 v38, v5

    .line 703
    .line 704
    goto :goto_12

    .line 705
    :cond_1f
    move/from16 v38, v6

    .line 706
    .line 707
    :goto_12
    invoke-direct/range {v28 .. v38}, Lm6/c;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;FZZZZI)V
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_1

    .line 708
    .line 709
    .line 710
    move-object/from16 v0, v28

    .line 711
    .line 712
    goto :goto_14

    .line 713
    :goto_13
    new-instance v5, Ljava/lang/StringBuilder;

    .line 714
    .line 715
    const-string v7, "Skipping malformed \'Style:\' line: \'"

    .line 716
    .line 717
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 718
    .line 719
    .line 720
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 721
    .line 722
    .line 723
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 724
    .line 725
    .line 726
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v3

    .line 730
    invoke-static {v0, v8, v3}, Lu6/a;->D(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 731
    .line 732
    .line 733
    goto/16 :goto_8

    .line 734
    .line 735
    :goto_14
    if-eqz v0, :cond_20

    .line 736
    .line 737
    iget-object v3, v0, Lm6/c;->a:Ljava/lang/String;

    .line 738
    .line 739
    invoke-interface {v10, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    :cond_20
    :goto_15
    const/4 v3, 0x6

    .line 743
    const/4 v5, 0x7

    .line 744
    const/4 v7, 0x2

    .line 745
    const/4 v8, 0x0

    .line 746
    const/16 v11, 0x5b

    .line 747
    .line 748
    goto/16 :goto_2

    .line 749
    .line 750
    :cond_21
    iput-object v10, v1, Lm6/a;->o:Ljava/util/LinkedHashMap;

    .line 751
    .line 752
    :cond_22
    :goto_16
    const/4 v3, 0x6

    .line 753
    const/4 v5, 0x7

    .line 754
    const/4 v7, 0x2

    .line 755
    const/4 v8, 0x0

    .line 756
    goto/16 :goto_0

    .line 757
    .line 758
    :cond_23
    const-string v3, "[V4 Styles]"

    .line 759
    .line 760
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 761
    .line 762
    .line 763
    move-result v3

    .line 764
    if-eqz v3, :cond_24

    .line 765
    .line 766
    const-string v0, "[V4 Styles] are not supported"

    .line 767
    .line 768
    invoke-static {v12, v0}, Lu6/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    .line 769
    .line 770
    .line 771
    goto :goto_16

    .line 772
    :cond_24
    const-string v3, "[Events]"

    .line 773
    .line 774
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 775
    .line 776
    .line 777
    move-result v0

    .line 778
    if-eqz v0, :cond_22

    .line 779
    .line 780
    :cond_25
    return-void

    .line 781
    :sswitch_data_0
    .sparse-switch
        -0x4642c5d0 -> :sswitch_9
        -0x3d363934 -> :sswitch_8
        -0xb7325a4 -> :sswitch_7
        -0x43a3db2 -> :sswitch_6
        0x2e3a85 -> :sswitch_5
        0x337a8b -> :sswitch_4
        0x15d92cd0 -> :sswitch_3
        0x2dbc6505 -> :sswitch_2
        0x695fa1e3 -> :sswitch_1
        0x76840c8e -> :sswitch_0
    .end sparse-switch

    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
