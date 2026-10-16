.class public final LT2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP2/l;


# static fields
.field public static final g:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Z

.field public final b:LT2/a;

.field public final c:LQ1/o;

.field public d:Ljava/util/LinkedHashMap;

.field public e:F

.field public f:F


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
    sput-object v0, LT2/b;->g:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, -0x800001

    .line 5
    .line 6
    .line 7
    iput v0, p0, LT2/b;->e:F

    .line 8
    .line 9
    iput v0, p0, LT2/b;->f:F

    .line 10
    .line 11
    new-instance v0, LQ1/o;

    .line 12
    .line 13
    invoke-direct {v0}, LQ1/o;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LT2/b;->c:LQ1/o;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    iput-boolean v1, p0, LT2/b;->a:Z

    .line 29
    .line 30
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, [B

    .line 35
    .line 36
    invoke-static {v0}, LQ1/x;->n([B)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v2, "Format:"

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-static {v2}, LQ1/k;->c(Z)V

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, LT2/a;->b(Ljava/lang/String;)LT2/a;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, LT2/b;->b:LT2/a;

    .line 57
    .line 58
    new-instance v0, LQ1/o;

    .line 59
    .line 60
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, [B

    .line 65
    .line 66
    invoke-direct {v0, p1}, LQ1/o;-><init>([B)V

    .line 67
    .line 68
    .line 69
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 70
    .line 71
    invoke-virtual {p0, v0, p1}, LT2/b;->b(LQ1/o;Ljava/nio/charset/Charset;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_0
    iput-boolean v0, p0, LT2/b;->a:Z

    .line 76
    .line 77
    const/4 p1, 0x0

    .line 78
    iput-object p1, p0, LT2/b;->b:LT2/a;

    .line 79
    .line 80
    return-void
.end method

.method public static a(JLjava/util/ArrayList;Ljava/util/ArrayList;)I
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

.method public static c(Ljava/lang/String;)J
    .locals 6

    .line 1
    sget-object v0, LT2/b;->g:Ljava/util/regex/Pattern;

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
    sget v1, LQ1/x;->a:I

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
.method public final E([BIILP2/k;LQ1/c;)V
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    move-object/from16 v3, p5

    .line 8
    .line 9
    new-instance v4, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v5, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    add-int v6, v1, p3

    .line 20
    .line 21
    iget-object v7, v0, LT2/b;->c:LQ1/o;

    .line 22
    .line 23
    move-object/from16 v8, p1

    .line 24
    .line 25
    invoke-virtual {v7, v6, v8}, LQ1/o;->E(I[B)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v7, v1}, LQ1/o;->G(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v7}, LQ1/o;->C()Ljava/nio/charset/Charset;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 39
    .line 40
    :goto_0
    iget-boolean v6, v0, LT2/b;->a:Z

    .line 41
    .line 42
    if-nez v6, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0, v7, v1}, LT2/b;->b(LQ1/o;Ljava/nio/charset/Charset;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    if-eqz v6, :cond_2

    .line 48
    .line 49
    iget-object v6, v0, LT2/b;->b:LT2/a;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    const/4 v6, 0x0

    .line 53
    :goto_1
    invoke-virtual {v7, v1}, LQ1/o;->i(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    if-eqz v9, :cond_21

    .line 58
    .line 59
    const-string v13, "Format:"

    .line 60
    .line 61
    invoke-virtual {v9, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result v13

    .line 65
    if-eqz v13, :cond_3

    .line 66
    .line 67
    invoke-static {v9}, LT2/a;->b(Ljava/lang/String;)LT2/a;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    const-string v13, "Dialogue:"

    .line 73
    .line 74
    invoke-virtual {v9, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v14

    .line 78
    if-eqz v14, :cond_4

    .line 79
    .line 80
    const-string v14, "SsaParser"

    .line 81
    .line 82
    if-nez v6, :cond_5

    .line 83
    .line 84
    const-string v10, "Skipping dialogue line before complete format: "

    .line 85
    .line 86
    invoke-virtual {v10, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    invoke-static {v14, v9}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    :goto_2
    move-object/from16 v20, v1

    .line 94
    .line 95
    move-object/from16 v39, v6

    .line 96
    .line 97
    move-object/from16 v40, v7

    .line 98
    .line 99
    goto/16 :goto_17

    .line 100
    .line 101
    :cond_5
    invoke-virtual {v9, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v13

    .line 105
    invoke-static {v13}, LQ1/k;->c(Z)V

    .line 106
    .line 107
    .line 108
    const/16 v13, 0x9

    .line 109
    .line 110
    invoke-virtual {v9, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v13

    .line 114
    const-string v15, ","

    .line 115
    .line 116
    iget v8, v6, LT2/a;->e:I

    .line 117
    .line 118
    invoke-virtual {v13, v15, v8}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v13

    .line 122
    array-length v15, v13

    .line 123
    if-eq v15, v8, :cond_6

    .line 124
    .line 125
    const-string v8, "Skipping dialogue line with fewer columns than format: "

    .line 126
    .line 127
    invoke-virtual {v8, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    invoke-static {v14, v8}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_6
    iget v8, v6, LT2/a;->a:I

    .line 136
    .line 137
    aget-object v8, v13, v8

    .line 138
    .line 139
    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    invoke-static {v8}, LT2/b;->c(Ljava/lang/String;)J

    .line 145
    .line 146
    .line 147
    move-result-wide v11

    .line 148
    cmp-long v8, v11, p2

    .line 149
    .line 150
    const-string v15, "Skipping invalid timing: "

    .line 151
    .line 152
    if-nez v8, :cond_7

    .line 153
    .line 154
    invoke-virtual {v15, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    invoke-static {v14, v8}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_7
    iget v8, v6, LT2/a;->b:I

    .line 163
    .line 164
    aget-object v8, v13, v8

    .line 165
    .line 166
    move-wide/from16 v17, v11

    .line 167
    .line 168
    invoke-static {v8}, LT2/b;->c(Ljava/lang/String;)J

    .line 169
    .line 170
    .line 171
    move-result-wide v10

    .line 172
    cmp-long v8, v10, p2

    .line 173
    .line 174
    if-nez v8, :cond_8

    .line 175
    .line 176
    invoke-virtual {v15, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    invoke-static {v14, v8}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_8
    iget-object v8, v0, LT2/b;->d:Ljava/util/LinkedHashMap;

    .line 185
    .line 186
    const/4 v9, -0x1

    .line 187
    if-eqz v8, :cond_9

    .line 188
    .line 189
    iget v12, v6, LT2/a;->c:I

    .line 190
    .line 191
    if-eq v12, v9, :cond_9

    .line 192
    .line 193
    aget-object v12, v13, v12

    .line 194
    .line 195
    invoke-virtual {v12}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v12

    .line 199
    invoke-virtual {v8, v12}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    check-cast v8, LT2/e;

    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_9
    const/4 v8, 0x0

    .line 207
    :goto_3
    iget v12, v6, LT2/a;->d:I

    .line 208
    .line 209
    aget-object v12, v13, v12

    .line 210
    .line 211
    sget-object v13, LT2/d;->a:Ljava/util/regex/Pattern;

    .line 212
    .line 213
    invoke-virtual {v13, v12}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 214
    .line 215
    .line 216
    move-result-object v13

    .line 217
    move v15, v9

    .line 218
    const/16 v19, 0x0

    .line 219
    .line 220
    :goto_4
    invoke-virtual {v13}, Ljava/util/regex/Matcher;->find()Z

    .line 221
    .line 222
    .line 223
    move-result v20

    .line 224
    if-eqz v20, :cond_d

    .line 225
    .line 226
    move-object/from16 v20, v1

    .line 227
    .line 228
    const/4 v9, 0x1

    .line 229
    invoke-virtual {v13, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    :try_start_0
    invoke-static {v1}, LT2/d;->a(Ljava/lang/String;)Landroid/graphics/PointF;

    .line 237
    .line 238
    .line 239
    move-result-object v9
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 240
    if-eqz v9, :cond_a

    .line 241
    .line 242
    move-object/from16 v19, v9

    .line 243
    .line 244
    :catch_0
    :cond_a
    :try_start_1
    sget-object v9, LT2/d;->d:Ljava/util/regex/Pattern;

    .line 245
    .line 246
    invoke-virtual {v9, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 251
    .line 252
    .line 253
    move-result v9

    .line 254
    if-eqz v9, :cond_b

    .line 255
    .line 256
    const/4 v9, 0x1

    .line 257
    invoke-virtual {v1, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-static {v1}, LT2/e;->a(Ljava/lang/String;)I

    .line 265
    .line 266
    .line 267
    move-result v1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 268
    :goto_5
    const/4 v9, -0x1

    .line 269
    goto :goto_6

    .line 270
    :cond_b
    const/4 v1, -0x1

    .line 271
    goto :goto_5

    .line 272
    :goto_6
    if-eq v1, v9, :cond_c

    .line 273
    .line 274
    move v15, v1

    .line 275
    :catch_1
    :cond_c
    move-object/from16 v1, v20

    .line 276
    .line 277
    const/4 v9, -0x1

    .line 278
    goto :goto_4

    .line 279
    :cond_d
    move-object/from16 v20, v1

    .line 280
    .line 281
    new-instance v1, LT2/d;

    .line 282
    .line 283
    sget-object v1, LT2/d;->a:Ljava/util/regex/Pattern;

    .line 284
    .line 285
    invoke-virtual {v1, v12}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    const-string v9, ""

    .line 290
    .line 291
    invoke-virtual {v1, v9}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    const-string v9, "\\N"

    .line 296
    .line 297
    const-string v12, "\n"

    .line 298
    .line 299
    invoke-virtual {v1, v9, v12}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    const-string v9, "\\n"

    .line 304
    .line 305
    invoke-virtual {v1, v9, v12}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    const-string v9, "\\h"

    .line 310
    .line 311
    const-string v12, "\u00a0"

    .line 312
    .line 313
    invoke-virtual {v1, v9, v12}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    iget v9, v0, LT2/b;->e:F

    .line 318
    .line 319
    iget v12, v0, LT2/b;->f:F

    .line 320
    .line 321
    new-instance v13, Landroid/text/SpannableString;

    .line 322
    .line 323
    invoke-direct {v13, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 324
    .line 325
    .line 326
    const p3, -0x800001

    .line 327
    .line 328
    .line 329
    const v33, -0x800001

    .line 330
    .line 331
    .line 332
    const/high16 v37, -0x80000000

    .line 333
    .line 334
    if-eqz v8, :cond_16

    .line 335
    .line 336
    iget-object v1, v8, LT2/e;->c:Ljava/lang/Integer;

    .line 337
    .line 338
    if-eqz v1, :cond_e

    .line 339
    .line 340
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    .line 341
    .line 342
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 343
    .line 344
    .line 345
    move-result v1

    .line 346
    invoke-direct {v0, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v13}, Landroid/text/SpannableString;->length()I

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    move-object/from16 v39, v6

    .line 354
    .line 355
    move-object/from16 v40, v7

    .line 356
    .line 357
    const/4 v6, 0x0

    .line 358
    const/16 v7, 0x21

    .line 359
    .line 360
    invoke-virtual {v13, v0, v6, v1, v7}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 361
    .line 362
    .line 363
    goto :goto_7

    .line 364
    :cond_e
    move-object/from16 v39, v6

    .line 365
    .line 366
    move-object/from16 v40, v7

    .line 367
    .line 368
    :goto_7
    iget v0, v8, LT2/e;->j:I

    .line 369
    .line 370
    const/4 v1, 0x3

    .line 371
    if-ne v0, v1, :cond_f

    .line 372
    .line 373
    iget-object v0, v8, LT2/e;->d:Ljava/lang/Integer;

    .line 374
    .line 375
    if-eqz v0, :cond_f

    .line 376
    .line 377
    new-instance v6, Landroid/text/style/BackgroundColorSpan;

    .line 378
    .line 379
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    invoke-direct {v6, v0}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v13}, Landroid/text/SpannableString;->length()I

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    const/16 v1, 0x21

    .line 391
    .line 392
    const/4 v7, 0x0

    .line 393
    invoke-virtual {v13, v6, v7, v0, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 394
    .line 395
    .line 396
    :cond_f
    iget v0, v8, LT2/e;->e:F

    .line 397
    .line 398
    cmpl-float v1, v0, p3

    .line 399
    .line 400
    if-eqz v1, :cond_10

    .line 401
    .line 402
    cmpl-float v1, v12, p3

    .line 403
    .line 404
    if-eqz v1, :cond_10

    .line 405
    .line 406
    div-float/2addr v0, v12

    .line 407
    const/4 v1, 0x1

    .line 408
    goto :goto_8

    .line 409
    :cond_10
    move/from16 v0, v33

    .line 410
    .line 411
    move/from16 v1, v37

    .line 412
    .line 413
    :goto_8
    iget-boolean v6, v8, LT2/e;->g:Z

    .line 414
    .line 415
    iget-boolean v7, v8, LT2/e;->f:Z

    .line 416
    .line 417
    if-eqz v7, :cond_11

    .line 418
    .line 419
    if-eqz v6, :cond_11

    .line 420
    .line 421
    new-instance v6, Landroid/text/style/StyleSpan;

    .line 422
    .line 423
    const/4 v7, 0x3

    .line 424
    invoke-direct {v6, v7}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v13}, Landroid/text/SpannableString;->length()I

    .line 428
    .line 429
    .line 430
    move-result v7

    .line 431
    move/from16 v23, v0

    .line 432
    .line 433
    move/from16 v22, v1

    .line 434
    .line 435
    const/4 v0, 0x0

    .line 436
    const/16 v1, 0x21

    .line 437
    .line 438
    invoke-virtual {v13, v6, v0, v7, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 439
    .line 440
    .line 441
    goto :goto_9

    .line 442
    :cond_11
    move/from16 v23, v0

    .line 443
    .line 444
    move/from16 v22, v1

    .line 445
    .line 446
    const/4 v0, 0x0

    .line 447
    const/16 v1, 0x21

    .line 448
    .line 449
    if-eqz v7, :cond_12

    .line 450
    .line 451
    new-instance v6, Landroid/text/style/StyleSpan;

    .line 452
    .line 453
    const/4 v7, 0x1

    .line 454
    invoke-direct {v6, v7}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v13}, Landroid/text/SpannableString;->length()I

    .line 458
    .line 459
    .line 460
    move-result v7

    .line 461
    invoke-virtual {v13, v6, v0, v7, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 462
    .line 463
    .line 464
    goto :goto_9

    .line 465
    :cond_12
    if-eqz v6, :cond_13

    .line 466
    .line 467
    new-instance v6, Landroid/text/style/StyleSpan;

    .line 468
    .line 469
    const/4 v7, 0x2

    .line 470
    invoke-direct {v6, v7}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v13}, Landroid/text/SpannableString;->length()I

    .line 474
    .line 475
    .line 476
    move-result v7

    .line 477
    invoke-virtual {v13, v6, v0, v7, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 478
    .line 479
    .line 480
    :cond_13
    :goto_9
    iget-boolean v6, v8, LT2/e;->h:Z

    .line 481
    .line 482
    if-eqz v6, :cond_14

    .line 483
    .line 484
    new-instance v6, Landroid/text/style/UnderlineSpan;

    .line 485
    .line 486
    invoke-direct {v6}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 487
    .line 488
    .line 489
    invoke-virtual {v13}, Landroid/text/SpannableString;->length()I

    .line 490
    .line 491
    .line 492
    move-result v7

    .line 493
    invoke-virtual {v13, v6, v0, v7, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 494
    .line 495
    .line 496
    :cond_14
    iget-boolean v6, v8, LT2/e;->i:Z

    .line 497
    .line 498
    if-eqz v6, :cond_15

    .line 499
    .line 500
    new-instance v6, Landroid/text/style/StrikethroughSpan;

    .line 501
    .line 502
    invoke-direct {v6}, Landroid/text/style/StrikethroughSpan;-><init>()V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v13}, Landroid/text/SpannableString;->length()I

    .line 506
    .line 507
    .line 508
    move-result v7

    .line 509
    invoke-virtual {v13, v6, v0, v7, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 510
    .line 511
    .line 512
    :cond_15
    move/from16 v31, v22

    .line 513
    .line 514
    move/from16 v32, v23

    .line 515
    .line 516
    :goto_a
    const/4 v1, -0x1

    .line 517
    goto :goto_b

    .line 518
    :cond_16
    move-object/from16 v39, v6

    .line 519
    .line 520
    move-object/from16 v40, v7

    .line 521
    .line 522
    const/4 v0, 0x0

    .line 523
    move/from16 v32, v33

    .line 524
    .line 525
    move/from16 v31, v37

    .line 526
    .line 527
    goto :goto_a

    .line 528
    :goto_b
    if-eq v15, v1, :cond_17

    .line 529
    .line 530
    move v1, v15

    .line 531
    goto :goto_c

    .line 532
    :cond_17
    if-eqz v8, :cond_18

    .line 533
    .line 534
    iget v1, v8, LT2/e;->b:I

    .line 535
    .line 536
    :cond_18
    :goto_c
    const-string v6, "Unknown alignment: "

    .line 537
    .line 538
    packed-switch v1, :pswitch_data_0

    .line 539
    .line 540
    .line 541
    :pswitch_0
    invoke-static {v1, v6, v14}, LN0/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    :pswitch_1
    const/16 v23, 0x0

    .line 545
    .line 546
    goto :goto_e

    .line 547
    :pswitch_2
    sget-object v7, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 548
    .line 549
    :goto_d
    move-object/from16 v23, v7

    .line 550
    .line 551
    goto :goto_e

    .line 552
    :pswitch_3
    sget-object v7, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 553
    .line 554
    goto :goto_d

    .line 555
    :pswitch_4
    sget-object v7, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 556
    .line 557
    goto :goto_d

    .line 558
    :goto_e
    const/high16 v7, -0x80000000

    .line 559
    .line 560
    packed-switch v1, :pswitch_data_1

    .line 561
    .line 562
    .line 563
    :pswitch_5
    invoke-static {v1, v6, v14}, LN0/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 564
    .line 565
    .line 566
    :pswitch_6
    move v8, v7

    .line 567
    goto :goto_f

    .line 568
    :pswitch_7
    const/4 v8, 0x2

    .line 569
    goto :goto_f

    .line 570
    :pswitch_8
    const/4 v8, 0x1

    .line 571
    goto :goto_f

    .line 572
    :pswitch_9
    move v8, v0

    .line 573
    :goto_f
    packed-switch v1, :pswitch_data_2

    .line 574
    .line 575
    .line 576
    :pswitch_a
    invoke-static {v1, v6, v14}, LN0/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 577
    .line 578
    .line 579
    :goto_10
    :pswitch_b
    move-object/from16 v1, v19

    .line 580
    .line 581
    goto :goto_11

    .line 582
    :pswitch_c
    move v7, v0

    .line 583
    goto :goto_10

    .line 584
    :pswitch_d
    move-object/from16 v1, v19

    .line 585
    .line 586
    const/4 v7, 0x1

    .line 587
    goto :goto_11

    .line 588
    :pswitch_e
    move-object/from16 v1, v19

    .line 589
    .line 590
    const/4 v7, 0x2

    .line 591
    :goto_11
    if-eqz v1, :cond_19

    .line 592
    .line 593
    cmpl-float v6, v12, p3

    .line 594
    .line 595
    if-eqz v6, :cond_19

    .line 596
    .line 597
    cmpl-float v6, v9, p3

    .line 598
    .line 599
    if-eqz v6, :cond_19

    .line 600
    .line 601
    iget v6, v1, Landroid/graphics/PointF;->x:F

    .line 602
    .line 603
    div-float/2addr v6, v9

    .line 604
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 605
    .line 606
    div-float/2addr v1, v12

    .line 607
    move/from16 v29, v6

    .line 608
    .line 609
    :goto_12
    move/from16 v26, v1

    .line 610
    .line 611
    goto :goto_15

    .line 612
    :cond_19
    const v1, 0x3d4ccccd    # 0.05f

    .line 613
    .line 614
    .line 615
    const/high16 v6, 0x3f000000    # 0.5f

    .line 616
    .line 617
    const v9, 0x3f733333    # 0.95f

    .line 618
    .line 619
    .line 620
    if-eqz v8, :cond_1c

    .line 621
    .line 622
    const/4 v12, 0x1

    .line 623
    if-eq v8, v12, :cond_1b

    .line 624
    .line 625
    const/4 v14, 0x2

    .line 626
    if-eq v8, v14, :cond_1a

    .line 627
    .line 628
    move/from16 v15, p3

    .line 629
    .line 630
    goto :goto_13

    .line 631
    :cond_1a
    move v15, v9

    .line 632
    goto :goto_13

    .line 633
    :cond_1b
    const/4 v14, 0x2

    .line 634
    move v15, v6

    .line 635
    goto :goto_13

    .line 636
    :cond_1c
    const/4 v12, 0x1

    .line 637
    const/4 v14, 0x2

    .line 638
    move v15, v1

    .line 639
    :goto_13
    if-eqz v7, :cond_1f

    .line 640
    .line 641
    if-eq v7, v12, :cond_1e

    .line 642
    .line 643
    if-eq v7, v14, :cond_1d

    .line 644
    .line 645
    move/from16 v1, p3

    .line 646
    .line 647
    goto :goto_14

    .line 648
    :cond_1d
    move v1, v9

    .line 649
    goto :goto_14

    .line 650
    :cond_1e
    move v1, v6

    .line 651
    :cond_1f
    :goto_14
    move/from16 v29, v15

    .line 652
    .line 653
    goto :goto_12

    .line 654
    :goto_15
    new-instance v21, LP1/b;

    .line 655
    .line 656
    const/16 v24, 0x0

    .line 657
    .line 658
    const/16 v35, 0x0

    .line 659
    .line 660
    const/high16 v36, -0x1000000

    .line 661
    .line 662
    const/16 v38, 0x0

    .line 663
    .line 664
    move-object/from16 v25, v24

    .line 665
    .line 666
    move/from16 v34, v33

    .line 667
    .line 668
    move/from16 v27, v0

    .line 669
    .line 670
    move/from16 v28, v7

    .line 671
    .line 672
    move/from16 v30, v8

    .line 673
    .line 674
    move-object/from16 v22, v13

    .line 675
    .line 676
    invoke-direct/range {v21 .. v38}, LP1/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    .line 677
    .line 678
    .line 679
    move-object/from16 v0, v21

    .line 680
    .line 681
    move-wide/from16 v6, v17

    .line 682
    .line 683
    invoke-static {v6, v7, v5, v4}, LT2/b;->a(JLjava/util/ArrayList;Ljava/util/ArrayList;)I

    .line 684
    .line 685
    .line 686
    move-result v1

    .line 687
    invoke-static {v10, v11, v5, v4}, LT2/b;->a(JLjava/util/ArrayList;Ljava/util/ArrayList;)I

    .line 688
    .line 689
    .line 690
    move-result v6

    .line 691
    :goto_16
    if-ge v1, v6, :cond_20

    .line 692
    .line 693
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v7

    .line 697
    check-cast v7, Ljava/util/List;

    .line 698
    .line 699
    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 700
    .line 701
    .line 702
    add-int/lit8 v1, v1, 0x1

    .line 703
    .line 704
    goto :goto_16

    .line 705
    :cond_20
    :goto_17
    move-object/from16 v0, p0

    .line 706
    .line 707
    move-object/from16 v1, v20

    .line 708
    .line 709
    move-object/from16 v6, v39

    .line 710
    .line 711
    move-object/from16 v7, v40

    .line 712
    .line 713
    goto/16 :goto_1

    .line 714
    .line 715
    :cond_21
    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    iget-wide v0, v2, LP2/k;->a:J

    .line 721
    .line 722
    cmp-long v6, v0, p2

    .line 723
    .line 724
    if-eqz v6, :cond_22

    .line 725
    .line 726
    iget-boolean v2, v2, LP2/k;->b:Z

    .line 727
    .line 728
    if-eqz v2, :cond_22

    .line 729
    .line 730
    new-instance v8, Ljava/util/ArrayList;

    .line 731
    .line 732
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 733
    .line 734
    .line 735
    goto :goto_18

    .line 736
    :cond_22
    const/4 v8, 0x0

    .line 737
    :goto_18
    const/4 v2, 0x0

    .line 738
    :goto_19
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 739
    .line 740
    .line 741
    move-result v6

    .line 742
    if-ge v2, v6, :cond_28

    .line 743
    .line 744
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    move-result-object v6

    .line 748
    move-object v10, v6

    .line 749
    check-cast v10, Ljava/util/List;

    .line 750
    .line 751
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 752
    .line 753
    .line 754
    move-result v6

    .line 755
    if-eqz v6, :cond_23

    .line 756
    .line 757
    if-eqz v2, :cond_23

    .line 758
    .line 759
    const/16 v16, 0x1

    .line 760
    .line 761
    goto :goto_1b

    .line 762
    :cond_23
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 763
    .line 764
    .line 765
    move-result v6

    .line 766
    const/16 v16, 0x1

    .line 767
    .line 768
    add-int/lit8 v6, v6, -0x1

    .line 769
    .line 770
    if-eq v2, v6, :cond_27

    .line 771
    .line 772
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 773
    .line 774
    .line 775
    move-result-object v6

    .line 776
    check-cast v6, Ljava/lang/Long;

    .line 777
    .line 778
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 779
    .line 780
    .line 781
    move-result-wide v11

    .line 782
    add-int/lit8 v6, v2, 0x1

    .line 783
    .line 784
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v6

    .line 788
    check-cast v6, Ljava/lang/Long;

    .line 789
    .line 790
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 791
    .line 792
    .line 793
    move-result-wide v6

    .line 794
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v9

    .line 798
    check-cast v9, Ljava/lang/Long;

    .line 799
    .line 800
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 801
    .line 802
    .line 803
    move-result-wide v13

    .line 804
    sub-long v13, v6, v13

    .line 805
    .line 806
    cmp-long v6, v0, p2

    .line 807
    .line 808
    if-eqz v6, :cond_25

    .line 809
    .line 810
    cmp-long v6, v11, v0

    .line 811
    .line 812
    if-ltz v6, :cond_24

    .line 813
    .line 814
    goto :goto_1a

    .line 815
    :cond_24
    if-eqz v8, :cond_26

    .line 816
    .line 817
    new-instance v9, LP2/a;

    .line 818
    .line 819
    invoke-direct/range {v9 .. v14}, LP2/a;-><init>(Ljava/util/List;JJ)V

    .line 820
    .line 821
    .line 822
    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 823
    .line 824
    .line 825
    goto :goto_1b

    .line 826
    :cond_25
    :goto_1a
    new-instance v9, LP2/a;

    .line 827
    .line 828
    invoke-direct/range {v9 .. v14}, LP2/a;-><init>(Ljava/util/List;JJ)V

    .line 829
    .line 830
    .line 831
    invoke-interface {v3, v9}, LQ1/c;->accept(Ljava/lang/Object;)V

    .line 832
    .line 833
    .line 834
    :cond_26
    :goto_1b
    add-int/lit8 v2, v2, 0x1

    .line 835
    .line 836
    goto :goto_19

    .line 837
    :cond_27
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 838
    .line 839
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 840
    .line 841
    .line 842
    throw v0

    .line 843
    :cond_28
    if-eqz v8, :cond_29

    .line 844
    .line 845
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    :goto_1c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 850
    .line 851
    .line 852
    move-result v1

    .line 853
    if-eqz v1, :cond_29

    .line 854
    .line 855
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 856
    .line 857
    .line 858
    move-result-object v1

    .line 859
    check-cast v1, LP2/a;

    .line 860
    .line 861
    invoke-interface {v3, v1}, LQ1/c;->accept(Ljava/lang/Object;)V

    .line 862
    .line 863
    .line 864
    goto :goto_1c

    .line 865
    :cond_29
    return-void

    .line 866
    nop

    .line 867
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

    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
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

    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    :pswitch_data_2
    .packed-switch -0x1
        :pswitch_b
        :pswitch_a
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_c
    .end packed-switch
.end method

.method public final synthetic H(II[B)LP2/d;
    .locals 0

    .line 1
    invoke-static {p0, p3, p2}, LN0/a;->a(LP2/l;[BI)LP2/b;

    move-result-object p1

    return-object p1
.end method

.method public final P()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final b(LQ1/o;Ljava/nio/charset/Charset;)V
    .locals 37

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x6

    .line 4
    const/4 v3, 0x3

    .line 5
    const/4 v4, 0x7

    .line 6
    const/4 v5, -0x1

    .line 7
    const/4 v6, 0x2

    .line 8
    const/4 v7, 0x0

    .line 9
    const/4 v8, 0x1

    .line 10
    :cond_0
    :goto_0
    invoke-virtual/range {p1 .. p2}, LQ1/o;->i(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_25

    .line 15
    .line 16
    const-string v9, "[Script Info]"

    .line 17
    .line 18
    invoke-virtual {v9, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v9

    .line 22
    const/16 v10, 0x5b

    .line 23
    .line 24
    if-eqz v9, :cond_5

    .line 25
    .line 26
    :catch_0
    :goto_1
    invoke-virtual/range {p1 .. p2}, LQ1/o;->i(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-virtual/range {p1 .. p1}, LQ1/o;->a()I

    .line 33
    .line 34
    .line 35
    move-result v9

    .line 36
    if-eqz v9, :cond_1

    .line 37
    .line 38
    invoke-virtual/range {p1 .. p2}, LQ1/o;->c(Ljava/nio/charset/Charset;)C

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    if-eq v9, v10, :cond_0

    .line 43
    .line 44
    :cond_1
    const-string v9, ":"

    .line 45
    .line 46
    invoke-virtual {v0, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    array-length v9, v0

    .line 51
    if-eq v9, v6, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    aget-object v9, v0, v7

    .line 55
    .line 56
    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    invoke-static {v9}, LA6/h;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    const-string v11, "playresx"

    .line 68
    .line 69
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v11

    .line 73
    if-nez v11, :cond_4

    .line 74
    .line 75
    const-string v11, "playresy"

    .line 76
    .line 77
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    if-nez v9, :cond_3

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    :try_start_0
    aget-object v0, v0, v8

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iput v0, v1, LT2/b;->f:F

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_4
    aget-object v0, v0, v8

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    iput v0, v1, LT2/b;->e:F
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_5
    const-string v9, "[V4+ Styles]"

    .line 111
    .line 112
    invoke-virtual {v9, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 113
    .line 114
    .line 115
    move-result v9

    .line 116
    const-string v11, "SsaParser"

    .line 117
    .line 118
    if-eqz v9, :cond_23

    .line 119
    .line 120
    new-instance v9, Ljava/util/LinkedHashMap;

    .line 121
    .line 122
    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 123
    .line 124
    .line 125
    const/4 v12, 0x0

    .line 126
    move-object v13, v12

    .line 127
    :goto_2
    invoke-virtual/range {p1 .. p2}, LQ1/o;->i(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v14

    .line 131
    if-eqz v14, :cond_21

    .line 132
    .line 133
    invoke-virtual/range {p1 .. p1}, LQ1/o;->a()I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_6

    .line 138
    .line 139
    invoke-virtual/range {p1 .. p2}, LQ1/o;->c(Ljava/nio/charset/Charset;)C

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-eq v0, v10, :cond_21

    .line 144
    .line 145
    :cond_6
    const-string v0, "Format:"

    .line 146
    .line 147
    invoke-virtual {v14, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    const-string v15, ","

    .line 152
    .line 153
    if-eqz v0, :cond_13

    .line 154
    .line 155
    invoke-virtual {v14, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-static {v0, v15}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    move v15, v5

    .line 164
    move/from16 v16, v15

    .line 165
    .line 166
    move/from16 v17, v16

    .line 167
    .line 168
    move/from16 v18, v17

    .line 169
    .line 170
    move/from16 v19, v18

    .line 171
    .line 172
    move/from16 v20, v19

    .line 173
    .line 174
    move/from16 v21, v20

    .line 175
    .line 176
    move/from16 v22, v21

    .line 177
    .line 178
    move/from16 v23, v22

    .line 179
    .line 180
    move/from16 v24, v23

    .line 181
    .line 182
    move v13, v7

    .line 183
    :goto_3
    array-length v14, v0

    .line 184
    if-ge v13, v14, :cond_11

    .line 185
    .line 186
    aget-object v14, v0, v13

    .line 187
    .line 188
    invoke-virtual {v14}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v14

    .line 192
    invoke-static {v14}, LA6/h;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v14

    .line 196
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v14}, Ljava/lang/String;->hashCode()I

    .line 200
    .line 201
    .line 202
    move-result v25

    .line 203
    sparse-switch v25, :sswitch_data_0

    .line 204
    .line 205
    .line 206
    :goto_4
    move v4, v5

    .line 207
    goto/16 :goto_5

    .line 208
    .line 209
    :sswitch_0
    const-string v4, "outlinecolour"

    .line 210
    .line 211
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    if-nez v4, :cond_7

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_7
    const/16 v4, 0x9

    .line 219
    .line 220
    goto/16 :goto_5

    .line 221
    .line 222
    :sswitch_1
    const-string v4, "alignment"

    .line 223
    .line 224
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v4

    .line 228
    if-nez v4, :cond_8

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_8
    const/16 v4, 0x8

    .line 232
    .line 233
    goto/16 :goto_5

    .line 234
    .line 235
    :sswitch_2
    const-string v4, "borderstyle"

    .line 236
    .line 237
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    if-nez v4, :cond_9

    .line 242
    .line 243
    goto :goto_4

    .line 244
    :cond_9
    const/4 v4, 0x7

    .line 245
    goto :goto_5

    .line 246
    :sswitch_3
    const-string v4, "fontsize"

    .line 247
    .line 248
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    if-nez v4, :cond_a

    .line 253
    .line 254
    goto :goto_4

    .line 255
    :cond_a
    move v4, v2

    .line 256
    goto :goto_5

    .line 257
    :sswitch_4
    const-string v4, "name"

    .line 258
    .line 259
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    if-nez v4, :cond_b

    .line 264
    .line 265
    goto :goto_4

    .line 266
    :cond_b
    const/4 v4, 0x5

    .line 267
    goto :goto_5

    .line 268
    :sswitch_5
    const-string v4, "bold"

    .line 269
    .line 270
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v4

    .line 274
    if-nez v4, :cond_c

    .line 275
    .line 276
    goto :goto_4

    .line 277
    :cond_c
    const/4 v4, 0x4

    .line 278
    goto :goto_5

    .line 279
    :sswitch_6
    const-string v4, "primarycolour"

    .line 280
    .line 281
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v4

    .line 285
    if-nez v4, :cond_d

    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_d
    move v4, v3

    .line 289
    goto :goto_5

    .line 290
    :sswitch_7
    const-string v4, "strikeout"

    .line 291
    .line 292
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v4

    .line 296
    if-nez v4, :cond_e

    .line 297
    .line 298
    goto :goto_4

    .line 299
    :cond_e
    move v4, v6

    .line 300
    goto :goto_5

    .line 301
    :sswitch_8
    const-string v4, "underline"

    .line 302
    .line 303
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    if-nez v4, :cond_f

    .line 308
    .line 309
    goto :goto_4

    .line 310
    :cond_f
    move v4, v8

    .line 311
    goto :goto_5

    .line 312
    :sswitch_9
    const-string v4, "italic"

    .line 313
    .line 314
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    if-nez v4, :cond_10

    .line 319
    .line 320
    goto :goto_4

    .line 321
    :cond_10
    move v4, v7

    .line 322
    :goto_5
    packed-switch v4, :pswitch_data_0

    .line 323
    .line 324
    .line 325
    goto :goto_6

    .line 326
    :pswitch_0
    move/from16 v18, v13

    .line 327
    .line 328
    goto :goto_6

    .line 329
    :pswitch_1
    move/from16 v16, v13

    .line 330
    .line 331
    goto :goto_6

    .line 332
    :pswitch_2
    move/from16 v24, v13

    .line 333
    .line 334
    goto :goto_6

    .line 335
    :pswitch_3
    move/from16 v19, v13

    .line 336
    .line 337
    goto :goto_6

    .line 338
    :pswitch_4
    move v15, v13

    .line 339
    goto :goto_6

    .line 340
    :pswitch_5
    move/from16 v20, v13

    .line 341
    .line 342
    goto :goto_6

    .line 343
    :pswitch_6
    move/from16 v17, v13

    .line 344
    .line 345
    goto :goto_6

    .line 346
    :pswitch_7
    move/from16 v23, v13

    .line 347
    .line 348
    goto :goto_6

    .line 349
    :pswitch_8
    move/from16 v22, v13

    .line 350
    .line 351
    goto :goto_6

    .line 352
    :pswitch_9
    move/from16 v21, v13

    .line 353
    .line 354
    :goto_6
    add-int/2addr v13, v8

    .line 355
    const/4 v4, 0x7

    .line 356
    goto/16 :goto_3

    .line 357
    .line 358
    :cond_11
    if-eq v15, v5, :cond_12

    .line 359
    .line 360
    new-instance v14, LT2/c;

    .line 361
    .line 362
    array-length v0, v0

    .line 363
    move/from16 v25, v0

    .line 364
    .line 365
    invoke-direct/range {v14 .. v25}, LT2/c;-><init>(IIIIIIIIIII)V

    .line 366
    .line 367
    .line 368
    move-object v13, v14

    .line 369
    goto :goto_7

    .line 370
    :cond_12
    move-object v13, v12

    .line 371
    :goto_7
    const/4 v4, 0x7

    .line 372
    goto/16 :goto_2

    .line 373
    .line 374
    :cond_13
    const-string v0, "Style:"

    .line 375
    .line 376
    invoke-virtual {v14, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 377
    .line 378
    .line 379
    move-result v4

    .line 380
    if-eqz v4, :cond_20

    .line 381
    .line 382
    if-nez v13, :cond_14

    .line 383
    .line 384
    const-string v0, "Skipping \'Style:\' line before \'Format:\' line: "

    .line 385
    .line 386
    invoke-virtual {v0, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    invoke-static {v11, v0}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    goto/16 :goto_15

    .line 394
    .line 395
    :cond_14
    invoke-virtual {v14, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    invoke-static {v0}, LQ1/k;->c(Z)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v14, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    invoke-static {v0, v15}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v4

    .line 410
    array-length v0, v4

    .line 411
    iget v15, v13, LT2/c;->k:I

    .line 412
    .line 413
    const-string v2, "\'"

    .line 414
    .line 415
    const-string v6, "SsaStyle"

    .line 416
    .line 417
    if-eq v0, v15, :cond_15

    .line 418
    .line 419
    array-length v0, v4

    .line 420
    sget v4, LQ1/x;->a:I

    .line 421
    .line 422
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 423
    .line 424
    const-string v4, "Skipping malformed \'Style:\' line (expected "

    .line 425
    .line 426
    const-string v7, " values, found "

    .line 427
    .line 428
    const-string v10, "): \'"

    .line 429
    .line 430
    invoke-static {v4, v15, v7, v0, v10}, LR8/v;->h(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    invoke-static {v6, v0}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    :goto_8
    move-object v0, v12

    .line 448
    goto/16 :goto_14

    .line 449
    .line 450
    :cond_15
    :try_start_1
    new-instance v26, LT2/e;

    .line 451
    .line 452
    iget v0, v13, LT2/c;->a:I

    .line 453
    .line 454
    aget-object v0, v4, v0

    .line 455
    .line 456
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v27

    .line 460
    iget v0, v13, LT2/c;->b:I

    .line 461
    .line 462
    if-eq v0, v5, :cond_16

    .line 463
    .line 464
    aget-object v0, v4, v0

    .line 465
    .line 466
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    invoke-static {v0}, LT2/e;->a(Ljava/lang/String;)I

    .line 471
    .line 472
    .line 473
    move-result v0

    .line 474
    move/from16 v28, v0

    .line 475
    .line 476
    goto :goto_9

    .line 477
    :catch_1
    move-exception v0

    .line 478
    goto/16 :goto_13

    .line 479
    .line 480
    :cond_16
    move/from16 v28, v5

    .line 481
    .line 482
    :goto_9
    iget v0, v13, LT2/c;->c:I

    .line 483
    .line 484
    if-eq v0, v5, :cond_17

    .line 485
    .line 486
    aget-object v0, v4, v0

    .line 487
    .line 488
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    invoke-static {v0}, LT2/e;->c(Ljava/lang/String;)Ljava/lang/Integer;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    move-object/from16 v29, v0

    .line 497
    .line 498
    goto :goto_a

    .line 499
    :cond_17
    move-object/from16 v29, v12

    .line 500
    .line 501
    :goto_a
    iget v0, v13, LT2/c;->d:I

    .line 502
    .line 503
    if-eq v0, v5, :cond_18

    .line 504
    .line 505
    aget-object v0, v4, v0

    .line 506
    .line 507
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    invoke-static {v0}, LT2/e;->c(Ljava/lang/String;)Ljava/lang/Integer;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    move-object/from16 v30, v0

    .line 516
    .line 517
    goto :goto_b

    .line 518
    :cond_18
    move-object/from16 v30, v12

    .line 519
    .line 520
    :goto_b
    iget v0, v13, LT2/c;->e:I

    .line 521
    .line 522
    if-eq v0, v5, :cond_19

    .line 523
    .line 524
    aget-object v0, v4, v0

    .line 525
    .line 526
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v10
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 530
    :try_start_2
    invoke-static {v10}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 531
    .line 532
    .line 533
    move-result v7
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    .line 534
    goto :goto_c

    .line 535
    :catch_2
    move-exception v0

    .line 536
    :try_start_3
    new-instance v15, Ljava/lang/StringBuilder;

    .line 537
    .line 538
    const-string v7, "Failed to parse font size: \'"

    .line 539
    .line 540
    invoke-direct {v15, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 541
    .line 542
    .line 543
    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v7

    .line 553
    invoke-static {v6, v7, v0}, LQ1/k;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 554
    .line 555
    .line 556
    const v7, -0x800001

    .line 557
    .line 558
    .line 559
    :goto_c
    move/from16 v31, v7

    .line 560
    .line 561
    goto :goto_d

    .line 562
    :cond_19
    const v31, -0x800001

    .line 563
    .line 564
    .line 565
    :goto_d
    iget v0, v13, LT2/c;->f:I

    .line 566
    .line 567
    if-eq v0, v5, :cond_1a

    .line 568
    .line 569
    aget-object v0, v4, v0

    .line 570
    .line 571
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    invoke-static {v0}, LT2/e;->b(Ljava/lang/String;)Z

    .line 576
    .line 577
    .line 578
    move-result v0

    .line 579
    if-eqz v0, :cond_1a

    .line 580
    .line 581
    move/from16 v32, v8

    .line 582
    .line 583
    goto :goto_e

    .line 584
    :cond_1a
    const/16 v32, 0x0

    .line 585
    .line 586
    :goto_e
    iget v0, v13, LT2/c;->g:I

    .line 587
    .line 588
    if-eq v0, v5, :cond_1b

    .line 589
    .line 590
    aget-object v0, v4, v0

    .line 591
    .line 592
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    invoke-static {v0}, LT2/e;->b(Ljava/lang/String;)Z

    .line 597
    .line 598
    .line 599
    move-result v0

    .line 600
    if-eqz v0, :cond_1b

    .line 601
    .line 602
    move/from16 v33, v8

    .line 603
    .line 604
    goto :goto_f

    .line 605
    :cond_1b
    const/16 v33, 0x0

    .line 606
    .line 607
    :goto_f
    iget v0, v13, LT2/c;->h:I

    .line 608
    .line 609
    if-eq v0, v5, :cond_1c

    .line 610
    .line 611
    aget-object v0, v4, v0

    .line 612
    .line 613
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    invoke-static {v0}, LT2/e;->b(Ljava/lang/String;)Z

    .line 618
    .line 619
    .line 620
    move-result v0

    .line 621
    if-eqz v0, :cond_1c

    .line 622
    .line 623
    move/from16 v34, v8

    .line 624
    .line 625
    goto :goto_10

    .line 626
    :cond_1c
    const/16 v34, 0x0

    .line 627
    .line 628
    :goto_10
    iget v0, v13, LT2/c;->i:I

    .line 629
    .line 630
    if-eq v0, v5, :cond_1d

    .line 631
    .line 632
    aget-object v0, v4, v0

    .line 633
    .line 634
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    invoke-static {v0}, LT2/e;->b(Ljava/lang/String;)Z

    .line 639
    .line 640
    .line 641
    move-result v0

    .line 642
    if-eqz v0, :cond_1d

    .line 643
    .line 644
    move/from16 v35, v8

    .line 645
    .line 646
    goto :goto_11

    .line 647
    :cond_1d
    const/16 v35, 0x0

    .line 648
    .line 649
    :goto_11
    iget v0, v13, LT2/c;->j:I

    .line 650
    .line 651
    if-eq v0, v5, :cond_1f

    .line 652
    .line 653
    aget-object v0, v4, v0

    .line 654
    .line 655
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 656
    .line 657
    .line 658
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1

    .line 659
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object v4

    .line 663
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 664
    .line 665
    .line 666
    move-result v4
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1

    .line 667
    if-eq v4, v8, :cond_1e

    .line 668
    .line 669
    if-eq v4, v3, :cond_1e

    .line 670
    .line 671
    :catch_3
    :try_start_5
    new-instance v4, Ljava/lang/StringBuilder;

    .line 672
    .line 673
    const-string v7, "Ignoring unknown BorderStyle: "

    .line 674
    .line 675
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 676
    .line 677
    .line 678
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 679
    .line 680
    .line 681
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    invoke-static {v6, v0}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    move v4, v5

    .line 689
    :cond_1e
    move/from16 v36, v4

    .line 690
    .line 691
    goto :goto_12

    .line 692
    :cond_1f
    move/from16 v36, v5

    .line 693
    .line 694
    :goto_12
    invoke-direct/range {v26 .. v36}, LT2/e;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;FZZZZI)V
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_1

    .line 695
    .line 696
    .line 697
    move-object/from16 v0, v26

    .line 698
    .line 699
    goto :goto_14

    .line 700
    :goto_13
    new-instance v4, Ljava/lang/StringBuilder;

    .line 701
    .line 702
    const-string v7, "Skipping malformed \'Style:\' line: \'"

    .line 703
    .line 704
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 705
    .line 706
    .line 707
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 711
    .line 712
    .line 713
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 714
    .line 715
    .line 716
    move-result-object v2

    .line 717
    invoke-static {v6, v2, v0}, LQ1/k;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 718
    .line 719
    .line 720
    goto/16 :goto_8

    .line 721
    .line 722
    :goto_14
    if-eqz v0, :cond_20

    .line 723
    .line 724
    iget-object v2, v0, LT2/e;->a:Ljava/lang/String;

    .line 725
    .line 726
    invoke-interface {v9, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    :cond_20
    :goto_15
    const/4 v2, 0x6

    .line 730
    const/4 v4, 0x7

    .line 731
    const/4 v6, 0x2

    .line 732
    const/4 v7, 0x0

    .line 733
    const/16 v10, 0x5b

    .line 734
    .line 735
    goto/16 :goto_2

    .line 736
    .line 737
    :cond_21
    iput-object v9, v1, LT2/b;->d:Ljava/util/LinkedHashMap;

    .line 738
    .line 739
    :cond_22
    :goto_16
    const/4 v2, 0x6

    .line 740
    const/4 v4, 0x7

    .line 741
    const/4 v6, 0x2

    .line 742
    const/4 v7, 0x0

    .line 743
    goto/16 :goto_0

    .line 744
    .line 745
    :cond_23
    const-string v2, "[V4 Styles]"

    .line 746
    .line 747
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 748
    .line 749
    .line 750
    move-result v2

    .line 751
    if-eqz v2, :cond_24

    .line 752
    .line 753
    const-string v0, "[V4 Styles] are not supported"

    .line 754
    .line 755
    invoke-static {v11, v0}, LQ1/k;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 756
    .line 757
    .line 758
    goto :goto_16

    .line 759
    :cond_24
    const-string v2, "[Events]"

    .line 760
    .line 761
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 762
    .line 763
    .line 764
    move-result v0

    .line 765
    if-eqz v0, :cond_22

    .line 766
    .line 767
    :cond_25
    return-void

    .line 768
    nop

    .line 769
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

    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
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

.method public final synthetic reset()V
    .locals 0

    .line 1
    return-void
.end method
