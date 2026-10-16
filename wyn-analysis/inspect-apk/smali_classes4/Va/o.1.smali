.class public final LVa/o;
.super LVa/Ba;
.source "SourceFile"


# static fields
.field public static final f:[I

.field public static g:I = 0x0

.field public static h:I = 0x1

.field public static i:I = 0x0

.field public static j:I = 0x1


# instance fields
.field public final synthetic c:I

.field public synthetic d:Landroid/app/Activity;

.field public synthetic e:LVa/p;


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
    sput-object v0, LVa/o;->f:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        -0x450ce8f3
        0x99f52e7
        0x3672ece7
        0x5f435a28
        0x5be023ee
        0x71361cd5
        -0x677e8af
        0x2995eff6
        0x33a5613a
        -0x5a2db2e0
        0x7b1d48c2
        0x14bc82b
        -0x7dd00206
        -0x62add459
        0x6f5ff56
        0x5a9b645d
        0x41fa3dbd
        -0xdd14533
    .end array-data
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LVa/o;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(I)Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, "\u2107\u62c9\ua68c\uea41\u2e0e\u73dd\ub7b9\ufb75\u3f2a\u40ea\u84c8\uc89e\u0c50\u501e"

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [C

    .line 8
    .line 9
    sget-object v1, LVa/a;->u:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v1

    .line 12
    :try_start_0
    sput p0, LVa/a;->t:I

    .line 13
    .line 14
    array-length p0, v0

    .line 15
    new-array p0, p0, [C

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    sput v2, LVa/a;->s:I

    .line 19
    .line 20
    :goto_0
    sget v2, LVa/a;->s:I

    .line 21
    .line 22
    array-length v3, v0

    .line 23
    if-ge v2, v3, :cond_0

    .line 24
    .line 25
    aget-char v3, v0, v2

    .line 26
    .line 27
    sget v4, LVa/a;->t:I

    .line 28
    .line 29
    mul-int/2addr v4, v2

    .line 30
    xor-int/2addr v3, v4

    .line 31
    int-to-long v3, v3

    .line 32
    const-wide v5, -0x984f47975e0de9fL    # -5.322596817332254E262

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    xor-long/2addr v3, v5

    .line 38
    long-to-int v3, v3

    .line 39
    int-to-char v3, v3

    .line 40
    aput-char v3, p0, v2

    .line 41
    .line 42
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    sput v2, LVa/a;->s:I

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    new-instance v0, Ljava/lang/String;

    .line 50
    .line 51
    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([C)V

    .line 52
    .line 53
    .line 54
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    return-object v0

    .line 56
    :goto_1
    monitor-exit v1

    .line 57
    throw p0
.end method

.method public static e(I[I)Ljava/lang/String;
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
    sget-object v4, LVa/o;->f:[I

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
.method public final c()V
    .locals 8

    .line 1
    const/4 v0, 0x6

    .line 2
    iget v1, p0, LVa/o;->c:I

    .line 3
    .line 4
    packed-switch v1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    sget v0, LVa/o;->j:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0x73

    .line 10
    .line 11
    rem-int/lit16 v0, v0, 0x80

    .line 12
    .line 13
    sput v0, LVa/o;->i:I

    .line 14
    .line 15
    iget-object v0, p0, LVa/o;->e:LVa/p;

    .line 16
    .line 17
    iget-object v1, v0, LVa/p;->a:LVa/x;

    .line 18
    .line 19
    invoke-static {v1}, LVa/x;->o(LVa/x;)LVa/Ra;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-static {v2, v2}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    rsub-int v2, v2, 0x43c7

    .line 29
    .line 30
    invoke-static {v2}, LVa/o;->d(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v1, v2}, LVa/Ra;->d(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    int-to-byte v1, v1

    .line 46
    add-int/lit16 v1, v1, 0x43c8

    .line 47
    .line 48
    invoke-static {v1}, LVa/o;->d(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iget-object v2, p0, LVa/o;->d:Landroid/app/Activity;

    .line 57
    .line 58
    invoke-static {v2}, LVa/p;->e(Landroid/app/Activity;)Lorg/json/JSONObject;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    iget-object v0, v0, LVa/p;->a:LVa/x;

    .line 63
    .line 64
    invoke-virtual {v0, v1, v2}, LVa/x;->x(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 65
    .line 66
    .line 67
    sget v0, LVa/o;->i:I

    .line 68
    .line 69
    add-int/lit8 v0, v0, 0x31

    .line 70
    .line 71
    rem-int/lit16 v1, v0, 0x80

    .line 72
    .line 73
    sput v1, LVa/o;->j:I

    .line 74
    .line 75
    rem-int/lit8 v0, v0, 0x2

    .line 76
    .line 77
    if-eqz v0, :cond_0

    .line 78
    .line 79
    return-void

    .line 80
    :cond_0
    const/4 v0, 0x0

    .line 81
    throw v0

    .line 82
    :pswitch_0
    sget v1, LVa/o;->h:I

    .line 83
    .line 84
    add-int/lit8 v1, v1, 0x55

    .line 85
    .line 86
    rem-int/lit16 v1, v1, 0x80

    .line 87
    .line 88
    sput v1, LVa/o;->g:I

    .line 89
    .line 90
    iget-object v1, p0, LVa/o;->e:LVa/p;

    .line 91
    .line 92
    iget-object v2, v1, LVa/p;->a:LVa/x;

    .line 93
    .line 94
    invoke-static {v2}, LVa/x;->o(LVa/x;)LVa/Ra;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    new-array v3, v0, [I

    .line 99
    .line 100
    fill-array-data v3, :array_0

    .line 101
    .line 102
    .line 103
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 104
    .line 105
    .line 106
    move-result-wide v4

    .line 107
    const-wide/16 v6, -0x1

    .line 108
    .line 109
    cmp-long v4, v4, v6

    .line 110
    .line 111
    rsub-int/lit8 v4, v4, 0xb

    .line 112
    .line 113
    invoke-static {v4, v3}, LVa/o;->e(I[I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual {v2, v3}, LVa/Ra;->d(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    iget-object v1, v1, LVa/p;->a:LVa/x;

    .line 125
    .line 126
    new-array v0, v0, [I

    .line 127
    .line 128
    fill-array-data v0, :array_1

    .line 129
    .line 130
    .line 131
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    const/4 v3, 0x0

    .line 136
    cmpl-float v2, v2, v3

    .line 137
    .line 138
    add-int/lit8 v2, v2, 0xa

    .line 139
    .line 140
    invoke-static {v2, v0}, LVa/o;->e(I[I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iget-object v2, p0, LVa/o;->d:Landroid/app/Activity;

    .line 149
    .line 150
    invoke-static {v2}, LVa/p;->e(Landroid/app/Activity;)Lorg/json/JSONObject;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-virtual {v1, v0, v2}, LVa/x;->x(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 155
    .line 156
    .line 157
    sget v0, LVa/o;->g:I

    .line 158
    .line 159
    add-int/lit8 v0, v0, 0x3d

    .line 160
    .line 161
    rem-int/lit16 v0, v0, 0x80

    .line 162
    .line 163
    sput v0, LVa/o;->h:I

    .line 164
    .line 165
    return-void

    .line 166
    nop

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    :array_0
    .array-data 4
        -0x9f9a971
        0x1c3613f4
        0x5ac0dbb5
        -0x2b1d2e6a
        0x607de9a5
        0x6dd7d2d8
    .end array-data

    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    :array_1
    .array-data 4
        -0x9f9a971
        0x1c3613f4
        0x5ac0dbb5
        -0x2b1d2e6a
        0x607de9a5
        0x6dd7d2d8
    .end array-data
.end method
