.class public final LVa/yb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/rb;


# static fields
.field public static final b:[I

.field public static c:I = 0x0

.field public static d:I = 0x1


# instance fields
.field public a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x12

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/yb;->b:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x274aad3d
        0x2163d650
        0x7842fe3e
        0xaa7c462
        0x261b9a62
        -0x54582c72
        0x218eaff8
        -0xe02d2cc
        0x537c094d
        -0x53cf7ba0
        0x7ff7efa5
        0x38a77573
        0x22de3f03
        0x53a1c9d5
        0x6ec0b920
        -0x5e1bcfc4
        -0x7def1d9e
        0x4155290e
    .end array-data
.end method

.method public static a(I[I)Ljava/lang/String;
    .locals 12

    .line 1
    sget-object v0, LVa/a;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x4

    .line 5
    :try_start_0
    new-array v1, v1, [C

    .line 6
    .line 7
    array-length v2, p1

    .line 8
    const/4 v3, 0x1

    .line 9
    shl-int/2addr v2, v3

    .line 10
    new-array v2, v2, [C

    .line 11
    .line 12
    sget-object v4, LVa/yb;->b:[I

    .line 13
    .line 14
    invoke-virtual {v4}, [I->clone()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    check-cast v4, [I

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    sput v5, LVa/a;->k:I

    .line 22
    .line 23
    :goto_0
    sget v6, LVa/a;->k:I

    .line 24
    .line 25
    array-length v7, p1

    .line 26
    if-ge v6, v7, :cond_1

    .line 27
    .line 28
    aget v7, p1, v6

    .line 29
    .line 30
    shr-int/lit8 v8, v7, 0x10

    .line 31
    .line 32
    int-to-char v8, v8

    .line 33
    aput-char v8, v1, v5

    .line 34
    .line 35
    int-to-char v7, v7

    .line 36
    aput-char v7, v1, v3

    .line 37
    .line 38
    add-int/lit8 v6, v6, 0x1

    .line 39
    .line 40
    aget v6, p1, v6

    .line 41
    .line 42
    shr-int/lit8 v9, v6, 0x10

    .line 43
    .line 44
    int-to-char v9, v9

    .line 45
    const/4 v10, 0x2

    .line 46
    aput-char v9, v1, v10

    .line 47
    .line 48
    int-to-char v6, v6

    .line 49
    const/4 v11, 0x3

    .line 50
    aput-char v6, v1, v11

    .line 51
    .line 52
    shl-int/lit8 v8, v8, 0x10

    .line 53
    .line 54
    add-int/2addr v8, v7

    .line 55
    sput v8, LVa/a;->l:I

    .line 56
    .line 57
    shl-int/lit8 v7, v9, 0x10

    .line 58
    .line 59
    add-int/2addr v7, v6

    .line 60
    sput v7, LVa/a;->m:I

    .line 61
    .line 62
    invoke-static {v4}, LVa/a;->o([I)V

    .line 63
    .line 64
    .line 65
    move v6, v5

    .line 66
    :goto_1
    const/16 v7, 0x10

    .line 67
    .line 68
    if-ge v6, v7, :cond_0

    .line 69
    .line 70
    sget v7, LVa/a;->l:I

    .line 71
    .line 72
    aget v8, v4, v6

    .line 73
    .line 74
    xor-int/2addr v7, v8

    .line 75
    sput v7, LVa/a;->l:I

    .line 76
    .line 77
    invoke-static {v7}, LVa/a;->G(I)I

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    sget v8, LVa/a;->m:I

    .line 82
    .line 83
    xor-int/2addr v7, v8

    .line 84
    sget v8, LVa/a;->l:I

    .line 85
    .line 86
    sput v7, LVa/a;->l:I

    .line 87
    .line 88
    sput v8, LVa/a;->m:I

    .line 89
    .line 90
    add-int/lit8 v6, v6, 0x1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :catchall_0
    move-exception p0

    .line 94
    goto :goto_2

    .line 95
    :cond_0
    sget v6, LVa/a;->l:I

    .line 96
    .line 97
    sget v8, LVa/a;->m:I

    .line 98
    .line 99
    sput v8, LVa/a;->l:I

    .line 100
    .line 101
    sput v6, LVa/a;->m:I

    .line 102
    .line 103
    aget v7, v4, v7

    .line 104
    .line 105
    xor-int/2addr v6, v7

    .line 106
    sput v6, LVa/a;->m:I

    .line 107
    .line 108
    const/16 v7, 0x11

    .line 109
    .line 110
    aget v7, v4, v7

    .line 111
    .line 112
    xor-int/2addr v7, v8

    .line 113
    sput v7, LVa/a;->l:I

    .line 114
    .line 115
    ushr-int/lit8 v8, v7, 0x10

    .line 116
    .line 117
    int-to-char v8, v8

    .line 118
    aput-char v8, v1, v5

    .line 119
    .line 120
    int-to-char v7, v7

    .line 121
    aput-char v7, v1, v3

    .line 122
    .line 123
    ushr-int/lit8 v7, v6, 0x10

    .line 124
    .line 125
    int-to-char v7, v7

    .line 126
    aput-char v7, v1, v10

    .line 127
    .line 128
    int-to-char v6, v6

    .line 129
    aput-char v6, v1, v11

    .line 130
    .line 131
    invoke-static {v4}, LVa/a;->o([I)V

    .line 132
    .line 133
    .line 134
    sget v6, LVa/a;->k:I

    .line 135
    .line 136
    shl-int/lit8 v7, v6, 0x1

    .line 137
    .line 138
    aget-char v8, v1, v5

    .line 139
    .line 140
    aput-char v8, v2, v7

    .line 141
    .line 142
    add-int/lit8 v8, v7, 0x1

    .line 143
    .line 144
    aget-char v9, v1, v3

    .line 145
    .line 146
    aput-char v9, v2, v8

    .line 147
    .line 148
    add-int/lit8 v8, v7, 0x2

    .line 149
    .line 150
    aget-char v9, v1, v10

    .line 151
    .line 152
    aput-char v9, v2, v8

    .line 153
    .line 154
    add-int/lit8 v7, v7, 0x3

    .line 155
    .line 156
    aget-char v8, v1, v11

    .line 157
    .line 158
    aput-char v8, v2, v7

    .line 159
    .line 160
    add-int/lit8 v6, v6, 0x2

    .line 161
    .line 162
    sput v6, LVa/a;->k:I

    .line 163
    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    :cond_1
    new-instance p1, Ljava/lang/String;

    .line 167
    .line 168
    invoke-direct {p1, v2, v5, p0}, Ljava/lang/String;-><init>([CII)V

    .line 169
    .line 170
    .line 171
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 172
    return-object p1

    .line 173
    :goto_2
    monitor-exit v0

    .line 174
    throw p0
.end method


# virtual methods
.method public n(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget v0, LVa/yb;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x9

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/yb;->c:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/yb;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, LVa/b8;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    :try_start_0
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    instance-of v3, v3, Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    new-instance v3, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const v4, -0x27e223e8

    .line 36
    .line 37
    .line 38
    const v5, -0x7ca645f3

    .line 39
    .line 40
    .line 41
    filled-new-array {v5, v4}, [I

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 46
    .line 47
    .line 48
    move-result-wide v7

    .line 49
    const-wide/16 v9, 0x0

    .line 50
    .line 51
    cmp-long v7, v7, v9

    .line 52
    .line 53
    invoke-static {v7, v6}, LVa/yb;->a(I[I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    filled-new-array {v5, v4}, [I

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v9, v10}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    neg-int v4, v4

    .line 76
    invoke-static {v4, v0}, LVa/yb;->a(I[I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    goto :goto_0

    .line 92
    :catchall_0
    move-exception v0

    .line 93
    goto :goto_1

    .line 94
    :cond_0
    :goto_0
    invoke-static {v1}, LVa/b8;->g(LVa/b8;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-static {v3, v0, v0}, LVa/l8;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    new-instance v3, LVa/q8;

    .line 103
    .line 104
    invoke-direct {v3}, LVa/q8;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3, v0}, LVa/q8;->s(Ljava/util/List;)LVa/y8;

    .line 108
    .line 109
    .line 110
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    sget p2, LVa/yb;->c:I

    .line 112
    .line 113
    add-int/lit8 p2, p2, 0x2f

    .line 114
    .line 115
    rem-int/lit16 v0, p2, 0x80

    .line 116
    .line 117
    sput v0, LVa/yb;->d:I

    .line 118
    .line 119
    rem-int/lit8 p2, p2, 0x2

    .line 120
    .line 121
    if-eqz p2, :cond_1

    .line 122
    .line 123
    return-object p1

    .line 124
    :cond_1
    throw v2

    .line 125
    :cond_2
    :try_start_1
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    instance-of v0, v0, Ljava/lang/String;

    .line 133
    .line 134
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 135
    :goto_1
    invoke-static {v1}, LVa/b8;->g(LVa/b8;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    new-instance v3, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    const/16 v4, 0x8

    .line 145
    .line 146
    new-array v4, v4, [I

    .line 147
    .line 148
    fill-array-data v4, :array_0

    .line 149
    .line 150
    .line 151
    const-string v5, ""

    .line 152
    .line 153
    invoke-static {v5}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    rsub-int/lit8 v6, v6, 0xe

    .line 158
    .line 159
    invoke-static {v6, v4}, LVa/yb;->a(I[I)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const v4, 0x41e8db69

    .line 174
    .line 175
    .line 176
    const v6, -0x3b5b9f08

    .line 177
    .line 178
    .line 179
    const v7, 0x260d1e4f

    .line 180
    .line 181
    .line 182
    const v8, 0x1cb79c47

    .line 183
    .line 184
    .line 185
    filled-new-array {v4, v6, v7, v8}, [I

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    const/16 v6, 0x30

    .line 190
    .line 191
    invoke-static {v5, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    add-int/lit8 v5, v5, 0x9

    .line 196
    .line 197
    invoke-static {v5, v4}, LVa/yb;->a(I[I)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-static {v1, p1, v0}, LVa/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 220
    .line 221
    .line 222
    return-object v2

    .line 223
    :array_0
    .array-data 4
        0x7bd21067
        -0x820caef
        0x76162166
        -0x66b57235
        0x723404ca
        0x14769f87
        0x451d4ce1
        -0xef345cc
    .end array-data
.end method
