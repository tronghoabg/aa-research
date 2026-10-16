.class public abstract LKd/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Set;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/16 v0, 0x2f

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x3f

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/16 v2, 0x23

    .line 14
    .line 15
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/16 v3, 0x40

    .line 20
    .line 21
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const/4 v4, 0x4

    .line 26
    new-array v4, v4, [Ljava/lang/Character;

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    aput-object v0, v4, v5

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    aput-object v1, v4, v0

    .line 33
    .line 34
    const/4 v0, 0x2

    .line 35
    aput-object v2, v4, v0

    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    aput-object v3, v4, v0

    .line 39
    .line 40
    invoke-static {v4}, Lff/m;->P0([Ljava/lang/Object;)Ljava/util/Set;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sput-object v0, LKd/h;->a:Ljava/util/Set;

    .line 45
    .line 46
    sget-object v0, Lio/ktor/utils/io/Y;->b:Ljava/util/List;

    .line 47
    .line 48
    const/4 v0, 0x6

    .line 49
    sput v0, LKd/h;->b:I

    .line 50
    .line 51
    const-string v0, "HTTP/1.0"

    .line 52
    .line 53
    const-string v1, "HTTP/1.1"

    .line 54
    .line 55
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    new-instance v1, LAd/g;

    .line 64
    .line 65
    const/16 v2, 0x12

    .line 66
    .line 67
    invoke-direct {v1, v2}, LAd/g;-><init>(I)V

    .line 68
    .line 69
    .line 70
    new-instance v2, LCd/U;

    .line 71
    .line 72
    const/16 v3, 0x8

    .line 73
    .line 74
    invoke-direct {v2, v3}, LCd/U;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-static {v0, v1, v2}, LS3/f;->g(Ljava/util/List;Ltf/l;Ltf/p;)Lya/b;

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public static final a(LLd/c;C)V
    .locals 3

    .line 1
    new-instance v0, LCd/s0;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Character with code "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    and-int/lit16 p1, p1, 0xff

    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p1, " is not allowed in header names, \n"

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-direct {v0, p0}, LCd/s0;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0
.end method

.method public static final b(LLd/c;LD9/n;)I
    .locals 5

    .line 1
    iget v0, p1, LD9/n;->b:I

    .line 2
    .line 3
    iget v1, p1, LD9/n;->c:I

    .line 4
    .line 5
    :goto_0
    if-ge v0, v1, :cond_5

    .line 6
    .line 7
    invoke-virtual {p0, v0}, LLd/c;->charAt(I)C

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/16 v3, 0x3a

    .line 12
    .line 13
    if-ne v2, v3, :cond_0

    .line 14
    .line 15
    iget v4, p1, LD9/n;->b:I

    .line 16
    .line 17
    if-eq v0, v4, :cond_0

    .line 18
    .line 19
    add-int/lit8 p0, v0, 0x1

    .line 20
    .line 21
    iput p0, p1, LD9/n;->b:I

    .line 22
    .line 23
    return v0

    .line 24
    :cond_0
    const/16 v4, 0x20

    .line 25
    .line 26
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->g(II)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-lez v4, :cond_2

    .line 31
    .line 32
    const-string v4, "\"(),/:;<=>?@[\\]{}"

    .line 33
    .line 34
    invoke-static {v4, v2}, LBf/k;->o0(Ljava/lang/CharSequence;C)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_1
    iget p1, p1, LD9/n;->b:I

    .line 45
    .line 46
    if-eq v2, v3, :cond_4

    .line 47
    .line 48
    if-ne v0, p1, :cond_3

    .line 49
    .line 50
    new-instance p0, LCd/s0;

    .line 51
    .line 52
    const-string p1, "Multiline headers via line folding is not supported since it is deprecated as per RFC7230."

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-direct {p0, p1, v0}, LCd/s0;-><init>(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    throw p0

    .line 59
    :cond_3
    invoke-static {p0, v2}, LKd/h;->a(LLd/c;C)V

    .line 60
    .line 61
    .line 62
    const/4 p0, 0x0

    .line 63
    throw p0

    .line 64
    :cond_4
    new-instance p0, LCd/s0;

    .line 65
    .line 66
    const-string p1, "Empty header names are not allowed as per RFC7230."

    .line 67
    .line 68
    const/4 v0, 0x0

    .line 69
    invoke-direct {p0, p1, v0}, LCd/s0;-><init>(Ljava/lang/String;Z)V

    .line 70
    .line 71
    .line 72
    throw p0

    .line 73
    :cond_5
    new-instance v0, LCd/s0;

    .line 74
    .line 75
    new-instance v1, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v2, "No colon in HTTP header in "

    .line 78
    .line 79
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iget v2, p1, LD9/n;->b:I

    .line 83
    .line 84
    iget p1, p1, LD9/n;->c:I

    .line 85
    .line 86
    invoke-virtual {p0, v2, p1}, LLd/c;->subSequence(II)Ljava/lang/CharSequence;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string p1, " in builder: \n"

    .line 98
    .line 99
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-direct {v0, p0}, LCd/s0;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v0
.end method

.method public static final c(Lio/ktor/utils/io/X;LLd/c;LD9/n;Llf/c;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    instance-of v2, v0, LKd/g;

    .line 5
    .line 6
    if-eqz v2, :cond_0

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, LKd/g;

    .line 10
    .line 11
    iget v3, v2, LKd/g;->f:I

    .line 12
    .line 13
    const/high16 v4, -0x80000000

    .line 14
    .line 15
    and-int v5, v3, v4

    .line 16
    .line 17
    if-eqz v5, :cond_0

    .line 18
    .line 19
    sub-int/2addr v3, v4

    .line 20
    iput v3, v2, LKd/g;->f:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v2, LKd/g;

    .line 24
    .line 25
    invoke-direct {v2, v0}, Llf/c;-><init>(Ljf/c;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object v0, v2, LKd/g;->e:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v3, Lkf/a;->a:Lkf/a;

    .line 31
    .line 32
    iget v4, v2, LKd/g;->f:I

    .line 33
    .line 34
    const/16 v5, 0x2000

    .line 35
    .line 36
    if-eqz v4, :cond_2

    .line 37
    .line 38
    if-ne v4, v1, :cond_1

    .line 39
    .line 40
    iget-object v4, v2, LKd/g;->d:LKd/d;

    .line 41
    .line 42
    iget-object v6, v2, LKd/g;->c:LD9/n;

    .line 43
    .line 44
    iget-object v7, v2, LKd/g;->b:LLd/c;

    .line 45
    .line 46
    iget-object v8, v2, LKd/g;->a:Lio/ktor/utils/io/t;

    .line 47
    .line 48
    :try_start_0
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    move-object/from16 v17, v6

    .line 52
    .line 53
    move-object v6, v2

    .line 54
    move-object/from16 v2, v17

    .line 55
    .line 56
    move-object/from16 v17, v7

    .line 57
    .line 58
    move-object v7, v4

    .line 59
    move-object/from16 v4, v17

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    goto/16 :goto_7

    .line 64
    .line 65
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 68
    .line 69
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v0

    .line 73
    :cond_2
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    new-instance v0, LKd/d;

    .line 77
    .line 78
    move-object/from16 v4, p1

    .line 79
    .line 80
    invoke-direct {v0, v4}, LKd/d;-><init>(LLd/c;)V

    .line 81
    .line 82
    .line 83
    move-object v7, v0

    .line 84
    move-object v6, v2

    .line 85
    move-object/from16 v0, p0

    .line 86
    .line 87
    move-object/from16 v2, p2

    .line 88
    .line 89
    :goto_1
    :try_start_1
    sget v8, LKd/h;->b:I

    .line 90
    .line 91
    iput-object v0, v6, LKd/g;->a:Lio/ktor/utils/io/t;

    .line 92
    .line 93
    iput-object v4, v6, LKd/g;->b:LLd/c;

    .line 94
    .line 95
    iput-object v2, v6, LKd/g;->c:LD9/n;

    .line 96
    .line 97
    iput-object v7, v6, LKd/g;->d:LKd/d;

    .line 98
    .line 99
    iput v1, v6, LKd/g;->f:I

    .line 100
    .line 101
    invoke-static {v0, v4, v5, v8, v6}, Lio/ktor/utils/io/N;->n(Lio/ktor/utils/io/t;LLd/c;IILlf/c;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    if-ne v8, v3, :cond_3

    .line 106
    .line 107
    return-object v3

    .line 108
    :cond_3
    move-object/from16 v17, v8

    .line 109
    .line 110
    move-object v8, v0

    .line 111
    move-object/from16 v0, v17

    .line 112
    .line 113
    :goto_2
    check-cast v0, Ljava/lang/Boolean;

    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    const/4 v9, 0x0

    .line 120
    if-nez v0, :cond_4

    .line 121
    .line 122
    invoke-virtual {v7}, LKd/d;->d()V

    .line 123
    .line 124
    .line 125
    return-object v9

    .line 126
    :catchall_1
    move-exception v0

    .line 127
    move-object v4, v7

    .line 128
    goto/16 :goto_7

    .line 129
    .line 130
    :cond_4
    iget v0, v4, LLd/c;->g:I

    .line 131
    .line 132
    iput v0, v2, LD9/n;->c:I

    .line 133
    .line 134
    iget v10, v2, LD9/n;->b:I

    .line 135
    .line 136
    sub-int/2addr v0, v10

    .line 137
    if-eqz v0, :cond_c

    .line 138
    .line 139
    if-ge v0, v5, :cond_b

    .line 140
    .line 141
    invoke-static {v4, v2}, LKd/h;->b(LLd/c;LD9/n;)I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    iget v11, v2, LD9/n;->c:I

    .line 146
    .line 147
    iget v12, v2, LD9/n;->b:I

    .line 148
    .line 149
    :goto_3
    const/16 v13, 0x9

    .line 150
    .line 151
    if-ge v12, v11, :cond_6

    .line 152
    .line 153
    invoke-virtual {v4, v12}, LLd/c;->charAt(I)C

    .line 154
    .line 155
    .line 156
    move-result v14

    .line 157
    invoke-static {v14}, Ltg/b;->I(C)Z

    .line 158
    .line 159
    .line 160
    move-result v15

    .line 161
    if-nez v15, :cond_5

    .line 162
    .line 163
    if-ne v14, v13, :cond_6

    .line 164
    .line 165
    :cond_5
    add-int/2addr v12, v1

    .line 166
    goto :goto_3

    .line 167
    :cond_6
    if-lt v12, v11, :cond_7

    .line 168
    .line 169
    iput v11, v2, LD9/n;->b:I

    .line 170
    .line 171
    move/from16 v16, v1

    .line 172
    .line 173
    goto :goto_6

    .line 174
    :cond_7
    move v14, v12

    .line 175
    move v15, v14

    .line 176
    :goto_4
    if-ge v14, v11, :cond_a

    .line 177
    .line 178
    move/from16 v16, v1

    .line 179
    .line 180
    invoke-virtual {v4, v14}, LLd/c;->charAt(I)C

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-eq v1, v13, :cond_9

    .line 185
    .line 186
    const/16 v5, 0xa

    .line 187
    .line 188
    if-eq v1, v5, :cond_8

    .line 189
    .line 190
    const/16 v5, 0xd

    .line 191
    .line 192
    if-eq v1, v5, :cond_8

    .line 193
    .line 194
    const/16 v5, 0x20

    .line 195
    .line 196
    if-eq v1, v5, :cond_9

    .line 197
    .line 198
    move v15, v14

    .line 199
    goto :goto_5

    .line 200
    :cond_8
    invoke-static {v4, v1}, LKd/h;->a(LLd/c;C)V

    .line 201
    .line 202
    .line 203
    throw v9

    .line 204
    :cond_9
    :goto_5
    add-int/lit8 v14, v14, 0x1

    .line 205
    .line 206
    move/from16 v1, v16

    .line 207
    .line 208
    const/16 v5, 0x2000

    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_a
    move/from16 v16, v1

    .line 212
    .line 213
    iput v12, v2, LD9/n;->b:I

    .line 214
    .line 215
    add-int/lit8 v15, v15, 0x1

    .line 216
    .line 217
    iput v15, v2, LD9/n;->c:I

    .line 218
    .line 219
    :goto_6
    iget v1, v2, LD9/n;->b:I

    .line 220
    .line 221
    iget v5, v2, LD9/n;->c:I

    .line 222
    .line 223
    iput v11, v2, LD9/n;->b:I

    .line 224
    .line 225
    invoke-virtual {v7, v10, v0, v1, v5}, LKd/d;->c(IIII)V

    .line 226
    .line 227
    .line 228
    move-object v0, v8

    .line 229
    move/from16 v1, v16

    .line 230
    .line 231
    const/16 v5, 0x2000

    .line 232
    .line 233
    goto/16 :goto_1

    .line 234
    .line 235
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 236
    .line 237
    const-string v1, "Header line length limit exceeded"

    .line 238
    .line 239
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    throw v0

    .line 243
    :cond_c
    sget-object v0, LJd/p;->a:Ljava/util/List;

    .line 244
    .line 245
    const-string v0, "Host"

    .line 246
    .line 247
    invoke-virtual {v7, v0}, LKd/d;->a(Ljava/lang/String;)LLd/b;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    if-eqz v0, :cond_d

    .line 252
    .line 253
    invoke-static {v0}, LKd/h;->d(LLd/b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 254
    .line 255
    .line 256
    :cond_d
    return-object v7

    .line 257
    :goto_7
    invoke-virtual {v4}, LKd/d;->d()V

    .line 258
    .line 259
    .line 260
    throw v0
.end method

.method public static final d(LLd/b;)V
    .locals 3

    .line 1
    const-string v0, ":"

    .line 2
    .line 3
    invoke-static {v0, p0}, LBf/k;->r0(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-virtual {p0}, LLd/b;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-ge v0, v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, v0}, LLd/b;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    sget-object v2, LKd/h;->a:Ljava/util/Set;

    .line 25
    .line 26
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    add-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance p0, LCd/s0;

    .line 36
    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v1, "Host cannot contain any of the following symbols: "

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-direct {p0, v0}, LCd/s0;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p0

    .line 55
    :cond_1
    return-void

    .line 56
    :cond_2
    new-instance v0, LCd/s0;

    .line 57
    .line 58
    new-instance v1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v2, "Host header with \':\' should contains port: "

    .line 61
    .line 62
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-direct {v0, p0}, LCd/s0;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v0
.end method
