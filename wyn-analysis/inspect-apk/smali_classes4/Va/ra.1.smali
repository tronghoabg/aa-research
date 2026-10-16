.class public final LVa/ra;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:[Ljava/lang/String;

.field public static c:I = 0x0

.field public static d:I = 0x1


# instance fields
.field public final a:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    shr-int/lit8 v0, v0, 0x10

    .line 6
    .line 7
    const v1, 0xd681

    .line 8
    .line 9
    .line 10
    sub-int/2addr v1, v0

    .line 11
    int-to-char v0, v1

    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-static {v1, v1}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const v3, 0x2a80f211

    .line 18
    .line 19
    .line 20
    add-int/2addr v2, v3

    .line 21
    const-string v3, "\u1158\u80f2\u812a\u8cd6"

    .line 22
    .line 23
    const-string v4, "\uf117\u6b00\u567e"

    .line 24
    .line 25
    invoke-static {v0, v3, v4, v2}, LVa/ra;->d(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v1, v1}, Landroid/view/View;->resolveSize(II)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    add-int/lit16 v2, v2, 0x2a5d

    .line 38
    .line 39
    int-to-char v2, v2

    .line 40
    const v3, -0x101f5f37

    .line 41
    .line 42
    .line 43
    invoke-static {v1, v1}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    add-int/2addr v1, v3

    .line 48
    const-string v3, "\uc9ef\ue0a0\u5def\u782a"

    .line 49
    .line 50
    const-string v4, "\ua5cd\uf08a\ufb81"

    .line 51
    .line 52
    invoke-static {v2, v3, v4, v1}, LVa/ra;->d(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sput-object v0, LVa/ra;->b:[Ljava/lang/String;

    .line 65
    .line 66
    sget v0, LVa/ra;->d:I

    .line 67
    .line 68
    add-int/lit8 v0, v0, 0x6d

    .line 69
    .line 70
    rem-int/lit16 v1, v0, 0x80

    .line 71
    .line 72
    sput v1, LVa/ra;->c:I

    .line 73
    .line 74
    rem-int/lit8 v0, v0, 0x2

    .line 75
    .line 76
    if-nez v0, :cond_0

    .line 77
    .line 78
    return-void

    .line 79
    :cond_0
    const/4 v0, 0x0

    .line 80
    throw v0
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LVa/qa;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, p1, p2, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, LVa/ra;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 16
    .line 17
    return-void
.end method

.method public static d(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 9

    .line 1
    const-string v0, "\u0000\u0000\u0000\u0000"

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, [C

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, [C

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, [C

    .line 20
    .line 21
    sget-object v1, LVa/a;->r:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-enter v1

    .line 24
    :try_start_0
    invoke-virtual {p1}, [C->clone()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, [C

    .line 29
    .line 30
    invoke-virtual {v0}, [C->clone()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, [C

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    aget-char v3, p1, v2

    .line 38
    .line 39
    xor-int/2addr p0, v3

    .line 40
    int-to-char p0, p0

    .line 41
    aput-char p0, p1, v2

    .line 42
    .line 43
    const/4 p0, 0x2

    .line 44
    aget-char v3, v0, p0

    .line 45
    .line 46
    int-to-char p3, p3

    .line 47
    add-int/2addr v3, p3

    .line 48
    int-to-char p3, v3

    .line 49
    aput-char p3, v0, p0

    .line 50
    .line 51
    array-length p0, p2

    .line 52
    new-array p3, p0, [C

    .line 53
    .line 54
    sput v2, LVa/a;->q:I

    .line 55
    .line 56
    :goto_0
    sget v3, LVa/a;->q:I

    .line 57
    .line 58
    if-ge v3, p0, :cond_0

    .line 59
    .line 60
    add-int/lit8 v4, v3, 0x2

    .line 61
    .line 62
    rem-int/lit8 v4, v4, 0x4

    .line 63
    .line 64
    add-int/lit8 v5, v3, 0x3

    .line 65
    .line 66
    rem-int/lit8 v5, v5, 0x4

    .line 67
    .line 68
    rem-int/lit8 v6, v3, 0x4

    .line 69
    .line 70
    aget-char v6, p1, v6

    .line 71
    .line 72
    mul-int/lit16 v6, v6, 0x7fce

    .line 73
    .line 74
    aget-char v4, v0, v4

    .line 75
    .line 76
    add-int/2addr v6, v4

    .line 77
    const v7, 0xffff

    .line 78
    .line 79
    .line 80
    rem-int/2addr v6, v7

    .line 81
    int-to-char v6, v6

    .line 82
    aget-char v8, p1, v5

    .line 83
    .line 84
    mul-int/lit16 v8, v8, 0x7fce

    .line 85
    .line 86
    add-int/2addr v8, v4

    .line 87
    div-int/2addr v8, v7

    .line 88
    int-to-char v4, v8

    .line 89
    aput-char v4, v0, v5

    .line 90
    .line 91
    aput-char v6, p1, v5

    .line 92
    .line 93
    aget-char v4, p2, v3

    .line 94
    .line 95
    xor-int/2addr v4, v6

    .line 96
    int-to-long v4, v4

    .line 97
    int-to-long v6, v2

    .line 98
    xor-long/2addr v4, v6

    .line 99
    const/16 v6, 0x3c09

    .line 100
    .line 101
    int-to-long v6, v6

    .line 102
    xor-long/2addr v4, v6

    .line 103
    long-to-int v4, v4

    .line 104
    int-to-char v4, v4

    .line 105
    aput-char v4, p3, v3

    .line 106
    .line 107
    add-int/lit8 v3, v3, 0x1

    .line 108
    .line 109
    sput v3, LVa/a;->q:I

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :catchall_0
    move-exception p0

    .line 113
    goto :goto_1

    .line 114
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 115
    .line 116
    invoke-direct {p0, p3}, Ljava/lang/String;-><init>([C)V

    .line 117
    .line 118
    .line 119
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    return-object p0

    .line 121
    :goto_1
    monitor-exit v1

    .line 122
    throw p0
.end method


# virtual methods
.method public final declared-synchronized a(ILjava/lang/String;)Ljava/util/HashMap;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    const/16 v0, 0x2a

    .line 5
    .line 6
    const/16 v2, 0x25

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    move-object/from16 v4, p2

    .line 10
    .line 11
    :try_start_0
    invoke-virtual {v4, v0, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v2, ""

    .line 16
    .line 17
    invoke-static {v2}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    int-to-char v2, v2

    .line 24
    const-string v4, "\u6e4a\u4e00\u23a9\ubc9f"

    .line 25
    .line 26
    const-string v5, "\u90f9\u7570\uedab\u7afe\ud291\u7e6b\ucd9d\u06d5\ue429\u0e58"

    .line 27
    .line 28
    const-string v6, ""

    .line 29
    .line 30
    const/16 v7, 0x30

    .line 31
    .line 32
    const/4 v8, 0x0

    .line 33
    invoke-static {v6, v7, v8, v8}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    rsub-int/lit8 v6, v6, -0x1

    .line 38
    .line 39
    invoke-static {v2, v4, v5, v6}, LVa/ra;->d(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v12

    .line 47
    filled-new-array {v0}, [Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    if-gtz p1, :cond_1

    .line 52
    .line 53
    :try_start_1
    sget v0, LVa/ra;->c:I

    .line 54
    .line 55
    add-int/lit8 v0, v0, 0x53

    .line 56
    .line 57
    rem-int/lit16 v2, v0, 0x80

    .line 58
    .line 59
    sput v2, LVa/ra;->d:I

    .line 60
    .line 61
    rem-int/lit8 v0, v0, 0x2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 62
    .line 63
    if-eqz v0, :cond_0

    .line 64
    .line 65
    move-object/from16 v17, v3

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    :try_start_2
    throw v3

    .line 69
    :catchall_0
    move-exception v0

    .line 70
    goto/16 :goto_2

    .line 71
    .line 72
    :catchall_1
    move-exception v0

    .line 73
    goto/16 :goto_3

    .line 74
    .line 75
    :cond_1
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    move-object/from16 v17, v0

    .line 80
    .line 81
    :goto_0
    iget-object v9, v1, LVa/ra;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 82
    .line 83
    invoke-static {v8}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    const/4 v2, 0x0

    .line 88
    cmpl-float v0, v0, v2

    .line 89
    .line 90
    int-to-char v0, v0

    .line 91
    const-string v2, "\u1c4e\u5c06\ue171\u8abb"

    .line 92
    .line 93
    const-string v4, "\uba87\u4678\ucacd\ua4f5\u6466\u2856\u0153\ucdb8"

    .line 94
    .line 95
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 96
    .line 97
    .line 98
    move-result-wide v5

    .line 99
    const-wide/16 v18, 0x0

    .line 100
    .line 101
    cmp-long v5, v5, v18

    .line 102
    .line 103
    add-int/lit8 v5, v5, -0x1

    .line 104
    .line 105
    invoke-static {v0, v2, v4, v5}, LVa/ra;->d(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    sget-object v11, LVa/ra;->b:[Ljava/lang/String;

    .line 114
    .line 115
    const/16 v16, 0x0

    .line 116
    .line 117
    const/4 v14, 0x0

    .line 118
    const/4 v15, 0x0

    .line 119
    invoke-virtual/range {v9 .. v17}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 120
    .line 121
    .line 122
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 123
    :try_start_3
    new-instance v0, Ljava/util/HashMap;

    .line 124
    .line 125
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 126
    .line 127
    .line 128
    :catch_0
    :goto_1
    if-eqz v2, :cond_2

    .line 129
    .line 130
    :try_start_4
    sget v4, LVa/ra;->d:I

    .line 131
    .line 132
    add-int/lit8 v4, v4, 0x11

    .line 133
    .line 134
    rem-int/lit16 v4, v4, 0x80

    .line 135
    .line 136
    sput v4, LVa/ra;->c:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 137
    .line 138
    :try_start_5
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 139
    .line 140
    .line 141
    move-result v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 142
    if-eqz v4, :cond_2

    .line 143
    .line 144
    :try_start_6
    const-string v4, ""

    .line 145
    .line 146
    invoke-static {v4, v7, v8, v8}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    add-int/lit16 v4, v4, 0x2a5e

    .line 151
    .line 152
    int-to-char v4, v4

    .line 153
    const-string v5, "\uc9ef\ue0a0\u5def\u782a"

    .line 154
    .line 155
    const-string v6, "\ua5cd\uf08a\ufb81"

    .line 156
    .line 157
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 158
    .line 159
    .line 160
    move-result-wide v9

    .line 161
    cmp-long v9, v9, v18

    .line 162
    .line 163
    const v10, -0x101f5f38

    .line 164
    .line 165
    .line 166
    add-int/2addr v9, v10

    .line 167
    invoke-static {v4, v5, v6, v9}, LVa/ra;->d(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    invoke-static {v8, v8}, Landroid/view/View;->resolveSize(II)I

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    const v6, 0xd681

    .line 184
    .line 185
    .line 186
    sub-int/2addr v6, v5

    .line 187
    int-to-char v5, v6

    .line 188
    const-string v6, "\u1158\u80f2\u812a\u8cd6"

    .line 189
    .line 190
    const-string v9, "\uf117\u6b00\u567e"

    .line 191
    .line 192
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 193
    .line 194
    .line 195
    move-result v10

    .line 196
    shr-int/lit8 v10, v10, 0x8

    .line 197
    .line 198
    const v11, 0x2a80f211

    .line 199
    .line 200
    .line 201
    add-int/2addr v10, v11

    .line 202
    invoke-static {v5, v6, v9, v10}, LVa/ra;->d(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 211
    .line 212
    .line 213
    move-result v5

    .line 214
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    invoke-virtual {v0, v5, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 223
    .line 224
    .line 225
    goto :goto_1

    .line 226
    :catchall_2
    move-exception v0

    .line 227
    move-object v3, v2

    .line 228
    goto :goto_2

    .line 229
    :cond_2
    if-eqz v2, :cond_3

    .line 230
    .line 231
    :try_start_7
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 232
    .line 233
    .line 234
    :cond_3
    sget v2, LVa/ra;->c:I

    .line 235
    .line 236
    add-int/lit8 v2, v2, 0xf

    .line 237
    .line 238
    rem-int/lit16 v4, v2, 0x80

    .line 239
    .line 240
    sput v4, LVa/ra;->d:I

    .line 241
    .line 242
    rem-int/lit8 v2, v2, 0x2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 243
    .line 244
    if-eqz v2, :cond_4

    .line 245
    .line 246
    monitor-exit p0

    .line 247
    return-object v0

    .line 248
    :cond_4
    :try_start_8
    throw v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 249
    :catchall_3
    move-exception v0

    .line 250
    :try_start_9
    throw v0

    .line 251
    :goto_2
    if-eqz v3, :cond_5

    .line 252
    .line 253
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 254
    .line 255
    .line 256
    :cond_5
    throw v0

    .line 257
    :goto_3
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 258
    throw v0
.end method

.method public final declared-synchronized b(Ljava/lang/String;)V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/ra;->d:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    rem-int/lit16 v0, v0, 0x80

    .line 7
    .line 8
    sput v0, LVa/ra;->c:I

    .line 9
    .line 10
    iget-object v0, p0, LVa/ra;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 11
    .line 12
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    shr-int/lit8 v1, v1, 0x16

    .line 17
    .line 18
    int-to-char v1, v1

    .line 19
    const-string v2, "\u1c4e\u5c06\ue171\u8abb"

    .line 20
    .line 21
    const-string v3, "\uba87\u4678\ucacd\ua4f5\u6466\u2856\u0153\ucdb8"

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-static {v4, v4}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    invoke-static {v1, v2, v3, v5}, LVa/ra;->d(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    shr-int/lit8 v2, v2, 0x8

    .line 41
    .line 42
    const v3, 0xbf00

    .line 43
    .line 44
    .line 45
    sub-int/2addr v3, v2

    .line 46
    int-to-char v2, v3

    .line 47
    const-string v3, "\uc0c9\u072c\u00c9\u45bf"

    .line 48
    .line 49
    const-string v5, "\ucb2b\u83a2\ua49d\u8ef2\ud5df"

    .line 50
    .line 51
    invoke-static {v4, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    const v6, -0x36f8d340    # -553676.0f

    .line 56
    .line 57
    .line 58
    add-int/2addr v4, v6

    .line 59
    invoke-static {v2, v3, v5, v4}, LVa/ra;->d(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    filled-new-array {p1}, [Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {v0, v1, v2, p1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    sget p1, LVa/ra;->c:I

    .line 75
    .line 76
    add-int/lit8 p1, p1, 0x11

    .line 77
    .line 78
    rem-int/lit16 v0, p1, 0x80

    .line 79
    .line 80
    sput v0, LVa/ra;->d:I

    .line 81
    .line 82
    rem-int/lit8 p1, p1, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 83
    .line 84
    if-eqz p1, :cond_0

    .line 85
    .line 86
    monitor-exit p0

    .line 87
    return-void

    .line 88
    :cond_0
    const/4 p1, 0x0

    .line 89
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    :catchall_0
    move-exception p1

    .line 91
    :try_start_2
    throw p1

    .line 92
    :catchall_1
    move-exception p1

    .line 93
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 94
    throw p1
.end method

.method public final declared-synchronized c(Ljava/lang/String;)I
    .locals 12

    .line 1
    monitor-enter p0

    .line 2
    const/16 v0, 0x2a

    .line 3
    .line 4
    const/16 v1, 0x25

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    :try_start_0
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    filled-new-array {p1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v7

    .line 15
    iget-object v3, p0, LVa/ra;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 16
    .line 17
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    shr-int/lit8 p1, p1, 0x10

    .line 22
    .line 23
    int-to-char p1, p1

    .line 24
    const-string v0, "\u1c4e\u5c06\ue171\u8abb"

    .line 25
    .line 26
    const-string v1, "\uba87\u4678\ucacd\ua4f5\u6466\u2856\u0153\ucdb8"

    .line 27
    .line 28
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    const-wide/16 v8, 0x0

    .line 33
    .line 34
    cmp-long v4, v4, v8

    .line 35
    .line 36
    add-int/lit8 v4, v4, -0x1

    .line 37
    .line 38
    invoke-static {p1, v0, v1, v4}, LVa/ra;->d(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 47
    .line 48
    .line 49
    move-result-wide v0

    .line 50
    cmp-long p1, v0, v8

    .line 51
    .line 52
    add-int/lit8 p1, p1, -0x1

    .line 53
    .line 54
    int-to-char p1, p1

    .line 55
    const-string v0, "\u2818\u296c\u9391\u4349"

    .line 56
    .line 57
    const-string v1, "\u031e\u236b\u3702\ue9a4\ufe2f\ud0cf\u087d\u5013\ua6f0\u6e86"

    .line 58
    .line 59
    const/4 v11, 0x0

    .line 60
    invoke-static {v11, v11}, Landroid/view/View;->getDefaultSize(II)I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    invoke-static {p1, v0, v1, v5}, LVa/ra;->d(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    filled-new-array {p1}, [Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    const-string p1, ""

    .line 77
    .line 78
    invoke-static {p1}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    int-to-char p1, p1

    .line 83
    const-string v0, "\u6e4a\u4e00\u23a9\ubc9f"

    .line 84
    .line 85
    const-string v1, "\u90f9\u7570\uedab\u7afe\ud291\u7e6b\ucd9d\u06d5\ue429\u0e58"

    .line 86
    .line 87
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    shr-int/lit8 v6, v6, 0x8

    .line 92
    .line 93
    invoke-static {p1, v0, v1, v6}, LVa/ra;->d(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    const/4 v10, 0x0

    .line 102
    const/4 v8, 0x0

    .line 103
    const/4 v9, 0x0

    .line 104
    invoke-virtual/range {v3 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 105
    .line 106
    .line 107
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 108
    if-eqz p1, :cond_0

    .line 109
    .line 110
    :try_start_1
    sget v0, LVa/ra;->d:I

    .line 111
    .line 112
    add-int/lit8 v0, v0, 0x63

    .line 113
    .line 114
    rem-int/lit16 v0, v0, 0x80

    .line 115
    .line 116
    sput v0, LVa/ra;->c:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 117
    .line 118
    :try_start_2
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_0

    .line 123
    .line 124
    invoke-interface {p1, v11}, Landroid/database/Cursor;->getInt(I)I

    .line 125
    .line 126
    .line 127
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 128
    :try_start_3
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 129
    .line 130
    .line 131
    monitor-exit p0

    .line 132
    return v0

    .line 133
    :catchall_0
    move-exception v0

    .line 134
    move-object p1, v0

    .line 135
    goto :goto_2

    .line 136
    :catchall_1
    move-exception v0

    .line 137
    move-object v2, p1

    .line 138
    goto :goto_1

    .line 139
    :cond_0
    if-eqz p1, :cond_2

    .line 140
    .line 141
    :try_start_4
    sget v0, LVa/ra;->d:I

    .line 142
    .line 143
    add-int/lit8 v0, v0, 0x55

    .line 144
    .line 145
    rem-int/lit16 v1, v0, 0x80

    .line 146
    .line 147
    sput v1, LVa/ra;->c:I

    .line 148
    .line 149
    rem-int/lit8 v0, v0, 0x2

    .line 150
    .line 151
    if-nez v0, :cond_1

    .line 152
    .line 153
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 154
    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 158
    .line 159
    .line 160
    :try_start_5
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 161
    :catchall_2
    move-exception v0

    .line 162
    move-object p1, v0

    .line 163
    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 164
    :cond_2
    :goto_0
    monitor-exit p0

    .line 165
    return v11

    .line 166
    :catchall_3
    move-exception v0

    .line 167
    :goto_1
    if-eqz v2, :cond_3

    .line 168
    .line 169
    :try_start_7
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 170
    .line 171
    .line 172
    :cond_3
    throw v0

    .line 173
    :goto_2
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 174
    throw p1
.end method

.method public final declared-synchronized e(Ljava/lang/String;)Ljava/lang/String;
    .locals 13

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/ra;->d:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x9

    .line 5
    .line 6
    rem-int/lit16 v0, v0, 0x80

    .line 7
    .line 8
    sput v0, LVa/ra;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :try_start_1
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    shr-int/lit8 v0, v0, 0x10

    .line 16
    .line 17
    int-to-char v0, v0

    .line 18
    const-string v2, "\uc95c\u61cb\u48c6\u7f38"

    .line 19
    .line 20
    const-string v3, "\ue03a\ueadc\u6e40\ua98a\u9d17\ub580\uc03a"

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-static {v4, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    const v6, -0x399e3437

    .line 28
    .line 29
    .line 30
    add-int/2addr v5, v6

    .line 31
    invoke-static {v0, v2, v3, v5}, LVa/ra;->d(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    filled-new-array {p1}, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    iget-object v5, p0, LVa/ra;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 44
    .line 45
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    shr-int/lit8 p1, p1, 0x8

    .line 50
    .line 51
    int-to-char p1, p1

    .line 52
    const-string v0, "\u1c4e\u5c06\ue171\u8abb"

    .line 53
    .line 54
    const-string v2, "\uba87\u4678\ucacd\ua4f5\u6466\u2856\u0153\ucdb8"

    .line 55
    .line 56
    invoke-static {v4, v4}, Landroid/view/View;->getDefaultSize(II)I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    invoke-static {p1, v0, v2, v3}, LVa/ra;->d(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    sget-object v7, LVa/ra;->b:[Ljava/lang/String;

    .line 69
    .line 70
    const/4 v12, 0x0

    .line 71
    const/4 v10, 0x0

    .line 72
    const/4 v11, 0x0

    .line 73
    invoke-virtual/range {v5 .. v12}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 74
    .line 75
    .line 76
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 77
    if-eqz p1, :cond_0

    .line 78
    .line 79
    :try_start_2
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    const/4 v2, 0x1

    .line 84
    xor-int/2addr v0, v2

    .line 85
    if-eq v0, v2, :cond_0

    .line 86
    .line 87
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    shr-int/lit8 v0, v0, 0x10

    .line 92
    .line 93
    add-int/lit16 v0, v0, 0x2a5d

    .line 94
    .line 95
    int-to-char v0, v0

    .line 96
    const-string v1, "\uc9ef\ue0a0\u5def\u782a"

    .line 97
    .line 98
    const-string v2, "\ua5cd\uf08a\ufb81"

    .line 99
    .line 100
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    shr-int/lit8 v3, v3, 0x10

    .line 105
    .line 106
    const v4, -0x101f5f37

    .line 107
    .line 108
    .line 109
    sub-int/2addr v4, v3

    .line 110
    invoke-static {v0, v1, v2, v4}, LVa/ra;->d(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 126
    :try_start_3
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 127
    .line 128
    .line 129
    monitor-exit p0

    .line 130
    return-object v0

    .line 131
    :catchall_0
    move-exception v0

    .line 132
    move-object p1, v0

    .line 133
    goto :goto_1

    .line 134
    :catchall_1
    move-exception v0

    .line 135
    move-object v1, p1

    .line 136
    goto :goto_0

    .line 137
    :cond_0
    if-eqz p1, :cond_1

    .line 138
    .line 139
    :try_start_4
    sget v0, LVa/ra;->d:I

    .line 140
    .line 141
    add-int/lit8 v0, v0, 0x6b

    .line 142
    .line 143
    rem-int/lit16 v0, v0, 0x80

    .line 144
    .line 145
    sput v0, LVa/ra;->c:I

    .line 146
    .line 147
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 148
    .line 149
    .line 150
    :cond_1
    monitor-exit p0

    .line 151
    return-object v1

    .line 152
    :catchall_2
    move-exception v0

    .line 153
    :goto_0
    if-eqz v1, :cond_2

    .line 154
    .line 155
    :try_start_5
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 156
    .line 157
    .line 158
    :cond_2
    throw v0

    .line 159
    :goto_1
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 160
    throw p1
.end method

.method public final declared-synchronized f(Ljava/lang/String;Ljava/lang/String;)V
    .locals 11

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Landroid/content/ContentValues;

    .line 3
    .line 4
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    add-int/lit16 v2, v2, 0x2a5d

    .line 13
    .line 14
    int-to-char v2, v2

    .line 15
    const-string v3, "\uc9ef\ue0a0\u5def\u782a"

    .line 16
    .line 17
    const-string v4, "\ua5cd\uf08a\ufb81"

    .line 18
    .line 19
    const-wide/16 v5, 0x0

    .line 20
    .line 21
    invoke-static {v5, v6}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    const v8, -0x101f5f37

    .line 26
    .line 27
    .line 28
    sub-int/2addr v8, v7

    .line 29
    invoke-static {v2, v3, v4, v8}, LVa/ra;->d(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v0, v2, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    cmp-long p2, v2, v5

    .line 45
    .line 46
    rsub-int/lit8 p2, p2, 0x1

    .line 47
    .line 48
    int-to-char p2, p2

    .line 49
    const-string v2, "\uc95c\u61cb\u48c6\u7f38"

    .line 50
    .line 51
    const-string v3, "\ue03a\ueadc\u6e40\ua98a\u9d17\ub580\uc03a"

    .line 52
    .line 53
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 54
    .line 55
    .line 56
    move-result-wide v7

    .line 57
    cmp-long v4, v7, v5

    .line 58
    .line 59
    const v7, -0x399e3438

    .line 60
    .line 61
    .line 62
    add-int/2addr v4, v7

    .line 63
    invoke-static {p2, v2, v3, v4}, LVa/ra;->d(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    filled-new-array {p1}, [Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    iget-object v3, p0, LVa/ra;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 76
    .line 77
    const-string v4, ""

    .line 78
    .line 79
    const/16 v7, 0x30

    .line 80
    .line 81
    invoke-static {v4, v7, v1, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    add-int/lit8 v4, v4, 0x1

    .line 86
    .line 87
    int-to-char v4, v4

    .line 88
    const-string v7, "\u1c4e\u5c06\ue171\u8abb"

    .line 89
    .line 90
    const-string v8, "\uba87\u4678\ucacd\ua4f5\u6466\u2856\u0153\ucdb8"

    .line 91
    .line 92
    const/4 v9, 0x0

    .line 93
    invoke-static {v9, v9}, Landroid/graphics/PointF;->length(FF)F

    .line 94
    .line 95
    .line 96
    move-result v10

    .line 97
    cmpl-float v9, v10, v9

    .line 98
    .line 99
    invoke-static {v4, v7, v8, v9}, LVa/ra;->d(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v3, v4, v0, p2, v2}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    if-nez p2, :cond_0

    .line 112
    .line 113
    sget p2, LVa/ra;->c:I

    .line 114
    .line 115
    add-int/lit8 p2, p2, 0x1d

    .line 116
    .line 117
    rem-int/lit16 p2, p2, 0x80

    .line 118
    .line 119
    sput p2, LVa/ra;->d:I

    .line 120
    .line 121
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 122
    .line 123
    .line 124
    move-result-wide v2

    .line 125
    cmp-long p2, v2, v5

    .line 126
    .line 127
    const v2, 0xd682

    .line 128
    .line 129
    .line 130
    sub-int/2addr v2, p2

    .line 131
    int-to-char p2, v2

    .line 132
    const-string v2, "\u1158\u80f2\u812a\u8cd6"

    .line 133
    .line 134
    const-string v3, "\uf117\u6b00\u567e"

    .line 135
    .line 136
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    shr-int/lit8 v4, v4, 0x8

    .line 141
    .line 142
    const v5, 0x2a80f211

    .line 143
    .line 144
    .line 145
    sub-int/2addr v5, v4

    .line 146
    invoke-static {p2, v2, v3, v5}, LVa/ra;->d(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    invoke-virtual {v0, p2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    iget-object p1, p0, LVa/ra;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 158
    .line 159
    const-string p2, ""

    .line 160
    .line 161
    const-string v2, ""

    .line 162
    .line 163
    invoke-static {p2, v2, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 164
    .line 165
    .line 166
    move-result p2

    .line 167
    int-to-char p2, p2

    .line 168
    const-string v2, "\u1c4e\u5c06\ue171\u8abb"

    .line 169
    .line 170
    const-string v3, "\uba87\u4678\ucacd\ua4f5\u6466\u2856\u0153\ucdb8"

    .line 171
    .line 172
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    shr-int/lit8 v4, v4, 0x10

    .line 177
    .line 178
    invoke-static {p2, v2, v3, v4}, LVa/ra;->d(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    const/4 v2, 0x0

    .line 187
    invoke-virtual {p1, p2, v2, v0}, Landroid/database/sqlite/SQLiteDatabase;->replace(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 188
    .line 189
    .line 190
    goto :goto_0

    .line 191
    :catchall_0
    move-exception p1

    .line 192
    goto :goto_1

    .line 193
    :cond_0
    :goto_0
    sget p1, LVa/ra;->d:I

    .line 194
    .line 195
    add-int/lit8 p1, p1, 0x2f

    .line 196
    .line 197
    rem-int/lit16 p2, p1, 0x80

    .line 198
    .line 199
    sput p2, LVa/ra;->c:I

    .line 200
    .line 201
    rem-int/lit8 p1, p1, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 202
    .line 203
    if-eqz p1, :cond_1

    .line 204
    .line 205
    const/16 p1, 0x60

    .line 206
    .line 207
    :try_start_1
    div-int/2addr p1, v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 208
    monitor-exit p0

    .line 209
    return-void

    .line 210
    :catchall_1
    move-exception p1

    .line 211
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 212
    :cond_1
    monitor-exit p0

    .line 213
    return-void

    .line 214
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 215
    throw p1
.end method
