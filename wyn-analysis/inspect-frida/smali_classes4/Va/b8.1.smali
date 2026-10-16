.class public final LVa/b8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final l:[I

.field public static m:I = 0x0

.field public static n:I = 0x1


# instance fields
.field public a:Lorg/json/JSONObject;

.field public b:LVa/x8;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:LVa/Xa;

.field public j:LVa/x8;

.field public k:Ljava/util/HashMap;


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
    sput-object v0, LVa/b8;->l:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        -0x193521fd
        -0x4cf165ec
        0x56e7d727
        -0x21f5822
        0x56d7c9b0
        -0x483bdfbb
        -0x7a0d3ed5
        -0x21c7d2d
        0x63416d92
        0x6d7abdf
        -0x2da4e05b
        0x5c0a68cf
        0x72d6e194
        -0x4b99f536
        -0x3ad549b2
        0x160f5a14
        0x11d6eeda
        -0x23d0e83f
    .end array-data
.end method

.method public static d(ILjava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, [C

    .line 6
    .line 7
    sget-object v0, LVa/pb;->D:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    const-wide v1, 0x7f944331e4e7f35dL    # 3.5571993481703095E306

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-static {v1, v2, p1, p0}, LVa/pb;->z(J[CI)[C

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/4 p1, 0x4

    .line 20
    sput p1, LVa/pb;->C:I

    .line 21
    .line 22
    :goto_0
    sget v3, LVa/pb;->C:I

    .line 23
    .line 24
    array-length v4, p0

    .line 25
    if-ge v3, v4, :cond_0

    .line 26
    .line 27
    add-int/lit8 v4, v3, -0x4

    .line 28
    .line 29
    aget-char v5, p0, v3

    .line 30
    .line 31
    rem-int/lit8 v6, v3, 0x4

    .line 32
    .line 33
    aget-char v6, p0, v6

    .line 34
    .line 35
    xor-int/2addr v5, v6

    .line 36
    int-to-long v5, v5

    .line 37
    int-to-long v7, v4

    .line 38
    mul-long/2addr v7, v1

    .line 39
    xor-long/2addr v5, v7

    .line 40
    long-to-int v4, v5

    .line 41
    int-to-char v4, v4

    .line 42
    aput-char v4, p0, v3

    .line 43
    .line 44
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    sput v3, LVa/pb;->C:I

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    new-instance v1, Ljava/lang/String;

    .line 52
    .line 53
    array-length v2, p0

    .line 54
    sub-int/2addr v2, p1

    .line 55
    invoke-direct {v1, p0, p1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 56
    .line 57
    .line 58
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    return-object v1

    .line 60
    :goto_1
    monitor-exit v0

    .line 61
    throw p0
.end method

.method public static f(I[I)Ljava/lang/String;
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
    sget-object v4, LVa/b8;->l:[I

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

.method public static synthetic g(LVa/b8;)Ljava/lang/String;
    .locals 1

    .line 1
    sget v0, LVa/b8;->m:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x75

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/b8;->n:I

    .line 8
    .line 9
    iget-object p0, p0, LVa/b8;->c:Ljava/lang/String;

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x6b

    .line 12
    .line 13
    rem-int/lit16 v0, v0, 0x80

    .line 14
    .line 15
    sput v0, LVa/b8;->m:I

    .line 16
    .line 17
    return-object p0
.end method


# virtual methods
.method public final a()LVa/Xa;
    .locals 8

    .line 1
    sget v0, LVa/b8;->m:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x7d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/b8;->n:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/b8;->i:LVa/Xa;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    new-instance v0, LVa/Xa;

    .line 14
    .line 15
    iget-object v1, p0, LVa/b8;->a:Lorg/json/JSONObject;

    .line 16
    .line 17
    const-string v2, ""

    .line 18
    .line 19
    invoke-static {v2}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    neg-int v3, v3

    .line 24
    const-string v4, "\u8690\u86e7\u4c29\u4ae4\u5aba\ubf11\uac3c\u80fb\u4b8d\u8c9d\ufebd\ufd7b\u1c0b"

    .line 25
    .line 26
    invoke-static {v3, v4}, LVa/b8;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const/4 v3, 0x2

    .line 39
    invoke-direct {v0, v3}, LVa/Xa;-><init>(I)V

    .line 40
    .line 41
    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    shr-int/lit8 v3, v3, 0x10

    .line 49
    .line 50
    int-to-char v3, v3

    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-static {v4, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    const v6, 0x1ec329b

    .line 57
    .line 58
    .line 59
    sub-int/2addr v6, v5

    .line 60
    const-string v5, "\u9b66\uec32\u0801\u167d"

    .line 61
    .line 62
    const-string v7, "\uea05\u9325\u8d36\uc3f8\udeed\u2298\ue81a"

    .line 63
    .line 64
    invoke-static {v3, v5, v7, v6}, LVa/Xa;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    iput-object v3, v0, LVa/Xa;->c:Ljava/io/Serializable;

    .line 77
    .line 78
    invoke-static {v2, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    rsub-int v2, v2, 0x3855

    .line 83
    .line 84
    int-to-char v2, v2

    .line 85
    invoke-static {v4}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    add-int/lit8 v3, v3, 0x1

    .line 90
    .line 91
    const-string v5, "\ufbe1\u580f\u55d7\u3d38"

    .line 92
    .line 93
    const-string v6, "\ue4d9\u5bc1\u84ca\u9887\u1680\u407e"

    .line 94
    .line 95
    invoke-static {v2, v5, v6, v3}, LVa/Xa;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    iput-object v2, v0, LVa/Xa;->d:Ljava/lang/Object;

    .line 108
    .line 109
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    const/4 v3, 0x0

    .line 114
    cmpl-float v2, v2, v3

    .line 115
    .line 116
    const v3, 0xa868

    .line 117
    .line 118
    .line 119
    sub-int/2addr v3, v2

    .line 120
    int-to-char v2, v3

    .line 121
    const-wide/16 v5, 0x0

    .line 122
    .line 123
    invoke-static {v5, v6}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    const v5, 0x11efb9fa

    .line 128
    .line 129
    .line 130
    add-int/2addr v3, v5

    .line 131
    const-string v5, "\uf9e2\uefb9\u6811\ua3a8"

    .line 132
    .line 133
    const-string v6, "\u39e9\ubb0f\u4515\u3843\u689c"

    .line 134
    .line 135
    invoke-static {v2, v5, v6, v3}, LVa/Xa;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    iput-object v2, v0, LVa/Xa;->e:Ljava/lang/Object;

    .line 148
    .line 149
    invoke-static {v4, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    int-to-char v2, v2

    .line 154
    const v3, 0x298424f4

    .line 155
    .line 156
    .line 157
    invoke-static {v4}, Landroid/graphics/Color;->alpha(I)I

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    add-int/2addr v5, v3

    .line 162
    const-string v3, "\uf4af\u8424\u2329\u8736"

    .line 163
    .line 164
    const-string v6, "\u98af\u7a23\ue1e0\u19a2\u069e\u985c\u33f6"

    .line 165
    .line 166
    invoke-static {v2, v3, v6, v5}, LVa/Xa;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    iput-object v2, v0, LVa/Xa;->f:Ljava/lang/Object;

    .line 179
    .line 180
    invoke-static {v4}, Landroid/graphics/Color;->alpha(I)I

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    int-to-char v2, v2

    .line 185
    invoke-static {v4}, Landroid/graphics/Color;->red(I)I

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    const-string v4, "\ub1b0\uc4b3\ud6ab\u4ed9"

    .line 190
    .line 191
    const-string v5, "\u6816\u52df\u9a28\ud7d7\u0c08\ud570\u3ab6\u3129\ue2e0\u6c47"

    .line 192
    .line 193
    invoke-static {v2, v4, v5, v3}, LVa/Xa;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    iput-boolean v1, v0, LVa/Xa;->b:Z

    .line 206
    .line 207
    :cond_0
    iput-object v0, p0, LVa/b8;->i:LVa/Xa;

    .line 208
    .line 209
    :cond_1
    iget-object v0, p0, LVa/b8;->i:LVa/Xa;

    .line 210
    .line 211
    sget v1, LVa/b8;->n:I

    .line 212
    .line 213
    add-int/lit8 v1, v1, 0x47

    .line 214
    .line 215
    rem-int/lit16 v2, v1, 0x80

    .line 216
    .line 217
    sput v2, LVa/b8;->m:I

    .line 218
    .line 219
    rem-int/lit8 v1, v1, 0x2

    .line 220
    .line 221
    if-nez v1, :cond_2

    .line 222
    .line 223
    return-object v0

    .line 224
    :cond_2
    const/4 v0, 0x0

    .line 225
    throw v0
.end method

.method public final b()LVa/x8;
    .locals 5

    .line 1
    sget v0, LVa/b8;->n:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x29

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/b8;->m:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/b8;->j:LVa/x8;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, LVa/x8;

    .line 14
    .line 15
    iget-object v1, p0, LVa/b8;->a:Lorg/json/JSONObject;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static {v2}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x1

    .line 23
    add-int/2addr v2, v3

    .line 24
    const-string v4, "\u6e47\u6e24\u5e28\u7a91\ue3ca\uad1a\u9c45\u39ae\ua347\u9e8a"

    .line 25
    .line 26
    invoke-static {v2, v4}, LVa/b8;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    new-instance v4, LVa/yb;

    .line 39
    .line 40
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p0, v4, LVa/yb;->a:Ljava/lang/Object;

    .line 44
    .line 45
    invoke-static {v2, v4}, LVa/Ab;->M(Lorg/json/JSONObject;LVa/rb;)Ljava/util/HashMap;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-object v4, p0, LVa/b8;->b:LVa/x8;

    .line 50
    .line 51
    invoke-direct {v0, v2, v4, v3}, LVa/x8;-><init>(Ljava/util/HashMap;LVa/x8;Z)V

    .line 52
    .line 53
    .line 54
    iput-object v0, p0, LVa/b8;->j:LVa/x8;

    .line 55
    .line 56
    const-string v2, ""

    .line 57
    .line 58
    const/16 v3, 0x30

    .line 59
    .line 60
    invoke-static {v2, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    neg-int v2, v2

    .line 65
    const-string v3, "\uc94b\uc926\u86ec\u0a4b\ub63c\u75d4\uec9c\u6c49\u045a\u464f\ube16"

    .line 66
    .line 67
    invoke-static {v2, v3}, LVa/b8;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    new-instance v2, Lx4/d;

    .line 80
    .line 81
    const/16 v3, 0x1b

    .line 82
    .line 83
    invoke-direct {v2, v3}, Lx4/d;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-static {v1, v2}, LVa/Ab;->d0(Lorg/json/JSONArray;LVa/sb;)Ljava/util/ArrayList;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0, v1}, LVa/x8;->g(Ljava/util/List;)V

    .line 91
    .line 92
    .line 93
    sget v0, LVa/b8;->m:I

    .line 94
    .line 95
    add-int/lit8 v0, v0, 0x27

    .line 96
    .line 97
    rem-int/lit16 v0, v0, 0x80

    .line 98
    .line 99
    sput v0, LVa/b8;->n:I

    .line 100
    .line 101
    :cond_0
    iget-object v0, p0, LVa/b8;->j:LVa/x8;

    .line 102
    .line 103
    return-object v0
.end method

.method public final c()Ljava/util/HashMap;
    .locals 4

    .line 1
    sget v0, LVa/b8;->n:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x47

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/b8;->m:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    rsub-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    const-string v2, "\u30d7\u30bb\u1a49\ua722\uddbf\ue97d\u41eb\u07dc\ufdc6\udaf6\u1369\u7a46\uaa4c"

    .line 17
    .line 18
    invoke-static {v1, v2}, LVa/b8;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sget v2, LVa/b8;->m:I

    .line 27
    .line 28
    add-int/lit8 v2, v2, 0x27

    .line 29
    .line 30
    rem-int/lit16 v3, v2, 0x80

    .line 31
    .line 32
    sput v3, LVa/b8;->n:I

    .line 33
    .line 34
    rem-int/lit8 v2, v2, 0x2

    .line 35
    .line 36
    if-nez v2, :cond_0

    .line 37
    .line 38
    iget-object v2, p0, LVa/b8;->k:Ljava/util/HashMap;

    .line 39
    .line 40
    div-int/2addr v0, v0

    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iget-object v0, p0, LVa/b8;->k:Ljava/util/HashMap;

    .line 45
    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    :goto_0
    iget-object v0, p0, LVa/b8;->a:Lorg/json/JSONObject;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    new-instance v1, LVa/Ra;

    .line 55
    .line 56
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p0, v1, LVa/Ra;->a:Ljava/lang/Object;

    .line 60
    .line 61
    invoke-static {v0, v1}, LVa/Ab;->M(Lorg/json/JSONObject;LVa/rb;)Ljava/util/HashMap;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, LVa/b8;->k:Ljava/util/HashMap;

    .line 66
    .line 67
    sget v0, LVa/b8;->m:I

    .line 68
    .line 69
    add-int/lit8 v0, v0, 0x1b

    .line 70
    .line 71
    rem-int/lit16 v0, v0, 0x80

    .line 72
    .line 73
    sput v0, LVa/b8;->n:I

    .line 74
    .line 75
    :cond_1
    iget-object v0, p0, LVa/b8;->k:Ljava/util/HashMap;

    .line 76
    .line 77
    sget v1, LVa/b8;->m:I

    .line 78
    .line 79
    add-int/lit8 v1, v1, 0x25

    .line 80
    .line 81
    rem-int/lit16 v1, v1, 0x80

    .line 82
    .line 83
    sput v1, LVa/b8;->n:I

    .line 84
    .line 85
    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 3

    .line 1
    sget v0, LVa/b8;->m:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x15

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, LVa/b8;->n:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x71

    .line 14
    .line 15
    rem-int/lit16 v0, v0, 0x80

    .line 16
    .line 17
    sput v0, LVa/b8;->n:I

    .line 18
    .line 19
    iget-object v0, p0, LVa/b8;->e:Ljava/lang/String;

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    throw v0
.end method

.method public final h(Lorg/json/JSONObject;)V
    .locals 4

    .line 1
    sget v0, LVa/b8;->m:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x51

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/b8;->n:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/String;

    .line 28
    .line 29
    iget-object v2, p0, LVa/b8;->b:LVa/x8;

    .line 30
    .line 31
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v2, v3, v1}, LVa/x8;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    sget v1, LVa/b8;->m:I

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1d

    .line 41
    .line 42
    rem-int/lit16 v1, v1, 0x80

    .line 43
    .line 44
    sput v1, LVa/b8;->n:I

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    return-void

    .line 48
    :cond_1
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    throw p1
.end method
