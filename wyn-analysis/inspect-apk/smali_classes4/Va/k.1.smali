.class public final LVa/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:[B

.field public static h:I = 0x0

.field public static i:I = 0x1


# instance fields
.field public a:Ljava/lang/Boolean;

.field public b:J

.field public c:J

.field public d:J

.field public e:J

.field public f:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x13

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/k;->g:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        0x3ct
        0x37t
        0x62t
        0x65t
        0x17t
        0x1at
        -0x1t
        -0x18t
        0x0t
        0x15t
        -0x26t
        -0x5t
        0xct
        -0x11t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public static synthetic a(LVa/k;Ljava/lang/Boolean;)V
    .locals 3

    .line 1
    sget v0, LVa/k;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x17

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/k;->i:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iput-object p1, p0, LVa/k;->a:Ljava/lang/Boolean;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x37

    .line 17
    .line 18
    rem-int/lit16 p0, v1, 0x80

    .line 19
    .line 20
    sput p0, LVa/k;->h:I

    .line 21
    .line 22
    rem-int/lit8 v1, v1, 0x2

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    throw v2

    .line 28
    :cond_1
    throw v2
.end method

.method public static e(SIIIB)Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, LVa/pb;->J:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    add-int/lit8 p2, p2, 0x55

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    if-ne p2, v2, :cond_0

    .line 15
    .line 16
    move v3, v4

    .line 17
    :cond_0
    if-eqz v3, :cond_1

    .line 18
    .line 19
    sget-object p2, LVa/k;->g:[B

    .line 20
    .line 21
    const v2, -0x7887e82c

    .line 22
    .line 23
    .line 24
    add-int/2addr v2, p3

    .line 25
    aget-byte p2, p2, v2

    .line 26
    .line 27
    add-int/lit8 p2, p2, 0x55

    .line 28
    .line 29
    int-to-byte p2, p2

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    :goto_0
    if-lez p2, :cond_2

    .line 34
    .line 35
    add-int/2addr p3, p2

    .line 36
    const v2, 0x7887e82e

    .line 37
    .line 38
    .line 39
    sub-int/2addr p3, v2

    .line 40
    add-int/2addr p3, v3

    .line 41
    sput p3, LVa/pb;->F:I

    .line 42
    .line 43
    sput-byte p4, LVa/pb;->G:B

    .line 44
    .line 45
    const p3, 0xea155f5

    .line 46
    .line 47
    .line 48
    add-int/2addr p1, p3

    .line 49
    int-to-char p1, p1

    .line 50
    sput-char p1, LVa/pb;->H:C

    .line 51
    .line 52
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    sget-char p1, LVa/pb;->H:C

    .line 56
    .line 57
    sput-char p1, LVa/pb;->I:C

    .line 58
    .line 59
    sput v4, LVa/pb;->E:I

    .line 60
    .line 61
    :goto_1
    sget p1, LVa/pb;->E:I

    .line 62
    .line 63
    if-ge p1, p2, :cond_2

    .line 64
    .line 65
    sget-object p1, LVa/k;->g:[B

    .line 66
    .line 67
    sget p3, LVa/pb;->F:I

    .line 68
    .line 69
    add-int/lit8 p4, p3, -0x1

    .line 70
    .line 71
    sput p4, LVa/pb;->F:I

    .line 72
    .line 73
    aget-byte p1, p1, p3

    .line 74
    .line 75
    sget-char p3, LVa/pb;->I:C

    .line 76
    .line 77
    add-int/2addr p1, p0

    .line 78
    int-to-byte p1, p1

    .line 79
    sget-byte p4, LVa/pb;->G:B

    .line 80
    .line 81
    xor-int/2addr p1, p4

    .line 82
    add-int/2addr p3, p1

    .line 83
    int-to-char p1, p3

    .line 84
    sput-char p1, LVa/pb;->H:C

    .line 85
    .line 86
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    sget-char p1, LVa/pb;->H:C

    .line 90
    .line 91
    sput-char p1, LVa/pb;->I:C

    .line 92
    .line 93
    sget p1, LVa/pb;->E:I

    .line 94
    .line 95
    add-int/2addr p1, v4

    .line 96
    sput p1, LVa/pb;->E:I

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    return-object p0

    .line 105
    :goto_2
    monitor-exit v0

    .line 106
    throw p0
.end method

.method public static g(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
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
    const/16 v6, 0x5243

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
.method public final b(Lorg/json/JSONObject;Z)V
    .locals 11

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    const v1, 0x8b65    # 5.0005E-41f

    .line 10
    .line 11
    .line 12
    sub-int/2addr v1, v0

    .line 13
    int-to-char v0, v1

    .line 14
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    int-to-byte v1, v1

    .line 19
    const v4, -0x32902db5

    .line 20
    .line 21
    .line 22
    add-int/2addr v1, v4

    .line 23
    const-string v5, "\u4afd\u6fd2\u64cd\ua58b"

    .line 24
    .line 25
    const-string v6, "\ub13f\ue142\u30c0"

    .line 26
    .line 27
    invoke-static {v0, v5, v6, v1}, LVa/k;->g(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    const v0, 0x8b64    # 5.0004E-41f

    .line 42
    .line 43
    .line 44
    if-eqz p2, :cond_0

    .line 45
    .line 46
    sget p2, LVa/k;->i:I

    .line 47
    .line 48
    add-int/lit8 p2, p2, 0x29

    .line 49
    .line 50
    rem-int/lit16 p2, p2, 0x80

    .line 51
    .line 52
    sput p2, LVa/k;->h:I

    .line 53
    .line 54
    const/4 p2, 0x0

    .line 55
    invoke-static {p2, p2, p2}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    add-int/lit8 v1, v1, -0x18

    .line 60
    .line 61
    int-to-short v1, v1

    .line 62
    const/4 v4, 0x0

    .line 63
    invoke-static {v4, v4}, Landroid/graphics/PointF;->length(FF)F

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    cmpl-float v4, v7, v4

    .line 68
    .line 69
    const v7, -0xea15582

    .line 70
    .line 71
    .line 72
    sub-int/2addr v7, v4

    .line 73
    invoke-static {p2, p2, p2}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    rsub-int/lit8 v4, v4, -0x52

    .line 78
    .line 79
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    shr-int/lit8 v8, v8, 0x10

    .line 84
    .line 85
    const v9, 0x7887e830

    .line 86
    .line 87
    .line 88
    add-int/2addr v8, v9

    .line 89
    invoke-static {p2}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    int-to-byte p2, p2

    .line 94
    invoke-static {v1, v7, v4, v8, p2}, LVa/k;->e(SIIIB)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 103
    .line 104
    .line 105
    move-result-wide v7

    .line 106
    iget-wide v9, p0, LVa/k;->d:J

    .line 107
    .line 108
    add-long/2addr v7, v9

    .line 109
    goto :goto_0

    .line 110
    :cond_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    shr-int/lit8 p2, p2, 0x8

    .line 115
    .line 116
    add-int/2addr p2, v0

    .line 117
    int-to-char p2, p2

    .line 118
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    int-to-byte v1, v1

    .line 123
    add-int/2addr v1, v4

    .line 124
    invoke-static {p2, v5, v6, v1}, LVa/k;->g(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 133
    .line 134
    .line 135
    move-result-wide v7

    .line 136
    iget-wide v9, p0, LVa/k;->e:J

    .line 137
    .line 138
    add-long/2addr v7, v9

    .line 139
    sget p2, LVa/k;->h:I

    .line 140
    .line 141
    add-int/lit8 p2, p2, 0x17

    .line 142
    .line 143
    rem-int/lit16 p2, p2, 0x80

    .line 144
    .line 145
    sput p2, LVa/k;->i:I

    .line 146
    .line 147
    :goto_0
    :try_start_0
    const-string p2, ""

    .line 148
    .line 149
    invoke-static {p2}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    sub-int/2addr v0, p2

    .line 154
    int-to-char p2, v0

    .line 155
    invoke-static {v2, v3}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    const v1, -0x32902db6

    .line 160
    .line 161
    .line 162
    sub-int/2addr v1, v0

    .line 163
    invoke-static {p2, v5, v6, v1}, LVa/k;->g(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    invoke-virtual {p1, p2, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :catch_0
    :cond_1
    sget p1, LVa/k;->i:I

    .line 176
    .line 177
    add-int/lit8 p1, p1, 0x71

    .line 178
    .line 179
    rem-int/lit16 p1, p1, 0x80

    .line 180
    .line 181
    sput p1, LVa/k;->h:I

    .line 182
    .line 183
    return-void
.end method

.method public final c(Lorg/json/JSONObject;)Z
    .locals 8

    .line 1
    sget v0, LVa/k;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x21

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/k;->i:I

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    invoke-static {v0, v1}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    add-int/lit16 v2, v2, 0x144

    .line 16
    .line 17
    int-to-char v2, v2

    .line 18
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    shr-int/lit8 v3, v3, 0x8

    .line 23
    .line 24
    const v4, 0x3b25e0fa

    .line 25
    .line 26
    .line 27
    add-int/2addr v3, v4

    .line 28
    const-string v4, "\ufa27\u25e0\u443b\u9d01"

    .line 29
    .line 30
    const-string v5, "\u9713\ua9bc\u9e27"

    .line 31
    .line 32
    invoke-static {v2, v4, v5, v3}, LVa/k;->g(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    const/4 v3, 0x0

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    goto/16 :goto_1

    .line 48
    .line 49
    :cond_0
    sget v2, LVa/k;->i:I

    .line 50
    .line 51
    add-int/lit8 v2, v2, 0x27

    .line 52
    .line 53
    rem-int/lit16 v2, v2, 0x80

    .line 54
    .line 55
    sput v2, LVa/k;->h:I

    .line 56
    .line 57
    invoke-static {v3}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    const/4 v4, 0x0

    .line 62
    cmpl-float v2, v2, v4

    .line 63
    .line 64
    rsub-int/lit8 v2, v2, -0x66

    .line 65
    .line 66
    int-to-short v2, v2

    .line 67
    invoke-static {v4, v4}, Landroid/graphics/PointF;->length(FF)F

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    cmpl-float v5, v5, v4

    .line 72
    .line 73
    const v6, -0xea15581

    .line 74
    .line 75
    .line 76
    add-int/2addr v5, v6

    .line 77
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    shr-int/lit8 v6, v6, 0x10

    .line 82
    .line 83
    rsub-int/lit8 v6, v6, -0x52

    .line 84
    .line 85
    invoke-static {v3, v4, v4}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    cmpl-float v4, v7, v4

    .line 90
    .line 91
    const v7, 0x7887e82e

    .line 92
    .line 93
    .line 94
    sub-int/2addr v7, v4

    .line 95
    invoke-static {v0, v1}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    rsub-int/lit8 v4, v4, -0x1

    .line 100
    .line 101
    int-to-byte v4, v4

    .line 102
    invoke-static {v2, v5, v6, v7, v4}, LVa/k;->e(SIIIB)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_1

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_1
    sget v2, LVa/k;->i:I

    .line 118
    .line 119
    add-int/lit8 v2, v2, 0x5b

    .line 120
    .line 121
    rem-int/lit16 v2, v2, 0x80

    .line 122
    .line 123
    sput v2, LVa/k;->h:I

    .line 124
    .line 125
    iget-object v4, p0, LVa/k;->a:Ljava/lang/Boolean;

    .line 126
    .line 127
    if-eqz v4, :cond_3

    .line 128
    .line 129
    add-int/lit8 v2, v2, 0x21

    .line 130
    .line 131
    rem-int/lit16 v4, v2, 0x80

    .line 132
    .line 133
    sput v4, LVa/k;->i:I

    .line 134
    .line 135
    rem-int/lit8 v2, v2, 0x2

    .line 136
    .line 137
    if-nez v2, :cond_2

    .line 138
    .line 139
    :try_start_0
    invoke-virtual {p0, p1}, LVa/k;->d(Lorg/json/JSONObject;)V

    .line 140
    .line 141
    .line 142
    return v3

    .line 143
    :catch_0
    move-exception p1

    .line 144
    goto :goto_0

    .line 145
    :cond_2
    const/4 v2, 0x1

    .line 146
    invoke-virtual {p0, p1}, LVa/k;->d(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 147
    .line 148
    .line 149
    return v2

    .line 150
    :goto_0
    const/high16 v2, -0x1000000

    .line 151
    .line 152
    invoke-static {v3, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    sub-int/2addr v2, v4

    .line 157
    int-to-char v2, v2

    .line 158
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 159
    .line 160
    .line 161
    move-result-wide v4

    .line 162
    cmp-long v0, v4, v0

    .line 163
    .line 164
    const v1, 0x55d5ba80

    .line 165
    .line 166
    .line 167
    add-int/2addr v0, v1

    .line 168
    const-string v1, "\u81b4\ud5ba\ucd55\u36fb"

    .line 169
    .line 170
    const-string v4, "\uf40d\u95f8\u5e84\u1eaa\u9171\ub23c\uc483\u9734\u01d8\u932b\u0117\uc31f\ud779\uc68a\u1f00\ub29a\u5912\u87a3\u84ee\u2bfe\uf439"

    .line 171
    .line 172
    invoke-static {v2, v1, v4, v0}, LVa/k;->g(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    shr-int/lit8 v1, v1, 0x10

    .line 185
    .line 186
    int-to-char v1, v1

    .line 187
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    int-to-byte v2, v2

    .line 192
    const v4, 0x4022422b

    .line 193
    .line 194
    .line 195
    sub-int/2addr v4, v2

    .line 196
    const-string v2, "\u2c1e\u2242\u6b40\u1284"

    .line 197
    .line 198
    const-string v5, "\ue850\u3b45\u0b20\u5b79\u83b9\uf64f\ub483\ufab8\u142b\u1ef2\uee99\ubac7\u2b5a\uf448\u48b6\ub3f2\u958c\u4559\u7802\u20ea\ub5e0\u6f7e\u3407\u1639\u8d16"

    .line 199
    .line 200
    invoke-static {v1, v2, v5, v4}, LVa/k;->g(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-static {v0, v1, p1, v3}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 209
    .line 210
    .line 211
    :cond_3
    :goto_1
    return v3
.end method

.method public final d(Lorg/json/JSONObject;)V
    .locals 13

    .line 1
    :try_start_0
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    shr-int/lit8 v0, v0, 0x10

    .line 6
    .line 7
    add-int/lit8 v0, v0, -0x41

    .line 8
    .line 9
    int-to-short v0, v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v1, v1}, Landroid/view/View;->getDefaultSize(II)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const v3, -0xea15582

    .line 16
    .line 17
    .line 18
    sub-int/2addr v3, v2

    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static {v2, v2}, Landroid/graphics/PointF;->length(FF)F

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    cmpl-float v4, v4, v2

    .line 25
    .line 26
    rsub-int/lit8 v4, v4, -0x52

    .line 27
    .line 28
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    shr-int/lit8 v5, v5, 0x10

    .line 33
    .line 34
    const v6, 0x7887e82c

    .line 35
    .line 36
    .line 37
    sub-int/2addr v6, v5

    .line 38
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 39
    .line 40
    .line 41
    move-result-wide v7

    .line 42
    const-wide/16 v9, 0x0

    .line 43
    .line 44
    cmp-long v5, v7, v9

    .line 45
    .line 46
    const/4 v7, 0x1

    .line 47
    rsub-int/lit8 v5, v5, 0x1

    .line 48
    .line 49
    int-to-byte v5, v5

    .line 50
    invoke-static {v0, v3, v4, v6, v5}, LVa/k;->e(SIIIB)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {p1, v0, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget v3, p0, LVa/k;->f:I

    .line 63
    .line 64
    if-eq v0, v3, :cond_1

    .line 65
    .line 66
    invoke-virtual {p0, p1}, LVa/k;->f(Lorg/json/JSONObject;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_0

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    shr-int/lit8 v0, v0, 0x8

    .line 78
    .line 79
    const v3, 0xcc88

    .line 80
    .line 81
    .line 82
    sub-int/2addr v3, v0

    .line 83
    int-to-char v0, v3

    .line 84
    const-string v3, "\u4c13\u3496\u8884\uddcc"

    .line 85
    .line 86
    const-string v4, "\u6a1c\u1187\u88a4"

    .line 87
    .line 88
    invoke-static {v1, v1}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    const v6, -0x7bcb69b4

    .line 93
    .line 94
    .line 95
    sub-int/2addr v6, v5

    .line 96
    invoke-static {v0, v3, v4, v6}, LVa/k;->g(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 105
    .line 106
    .line 107
    move-result-wide v3

    .line 108
    iget-wide v5, p0, LVa/k;->e:J

    .line 109
    .line 110
    add-long/2addr v3, v5

    .line 111
    invoke-static {v1, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    rsub-int/lit8 v0, v0, -0x66

    .line 116
    .line 117
    int-to-short v0, v0

    .line 118
    const-string v5, ""

    .line 119
    .line 120
    invoke-static {v5, v1}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    const v6, -0xea15581

    .line 125
    .line 126
    .line 127
    add-int/2addr v5, v6

    .line 128
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    shr-int/lit8 v6, v6, 0x10

    .line 133
    .line 134
    add-int/lit8 v6, v6, -0x52

    .line 135
    .line 136
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 137
    .line 138
    .line 139
    move-result-wide v11

    .line 140
    cmp-long v8, v11, v9

    .line 141
    .line 142
    const v9, 0x7887e82d

    .line 143
    .line 144
    .line 145
    add-int/2addr v8, v9

    .line 146
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    shr-int/lit8 v9, v9, 0x8

    .line 151
    .line 152
    int-to-byte v9, v9

    .line 153
    invoke-static {v0, v5, v6, v8, v9}, LVa/k;->e(SIIIB)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    iget-wide v5, p0, LVa/k;->e:J

    .line 162
    .line 163
    invoke-virtual {p1, v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 164
    .line 165
    .line 166
    sget v0, LVa/k;->i:I

    .line 167
    .line 168
    add-int/lit8 v0, v0, 0x4b

    .line 169
    .line 170
    rem-int/lit16 v0, v0, 0x80

    .line 171
    .line 172
    sput v0, LVa/k;->h:I

    .line 173
    .line 174
    move v0, v1

    .line 175
    goto :goto_1

    .line 176
    :cond_1
    :goto_0
    :try_start_1
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    shr-int/lit8 v0, v0, 0x8

    .line 181
    .line 182
    add-int/lit16 v0, v0, 0xa8a

    .line 183
    .line 184
    int-to-char v0, v0

    .line 185
    const-string v3, "\uc467\u4859\u8a72\u5b0a"

    .line 186
    .line 187
    const-string v4, "\u2f32\ue218"

    .line 188
    .line 189
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    shr-int/lit8 v5, v5, 0x10

    .line 194
    .line 195
    invoke-static {v0, v3, v4, v5}, LVa/k;->g(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 204
    .line 205
    .line 206
    move-result-wide v3

    .line 207
    iget-wide v5, p0, LVa/k;->d:J

    .line 208
    .line 209
    add-long/2addr v3, v5

    .line 210
    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    rsub-int v0, v0, 0x144

    .line 215
    .line 216
    int-to-char v0, v0

    .line 217
    const-string v5, "\ufa27\u25e0\u443b\u9d01"

    .line 218
    .line 219
    const-string v6, "\u9713\ua9bc\u9e27"

    .line 220
    .line 221
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 222
    .line 223
    .line 224
    move-result v8

    .line 225
    const v9, 0x3b25e0fa

    .line 226
    .line 227
    .line 228
    add-int/2addr v8, v9

    .line 229
    invoke-static {v0, v5, v6, v8}, LVa/k;->g(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    iget-wide v5, p0, LVa/k;->d:J

    .line 238
    .line 239
    invoke-virtual {p1, v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 240
    .line 241
    .line 242
    sget v0, LVa/k;->i:I

    .line 243
    .line 244
    add-int/lit8 v0, v0, 0x1f

    .line 245
    .line 246
    rem-int/lit16 v0, v0, 0x80

    .line 247
    .line 248
    sput v0, LVa/k;->h:I

    .line 249
    .line 250
    move v0, v7

    .line 251
    :goto_1
    :try_start_2
    sget-object v5, LVa/sa;->f:Ljava/lang/String;

    .line 252
    .line 253
    invoke-virtual {p1, v5, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 254
    .line 255
    .line 256
    iget-object v3, p0, LVa/k;->a:Ljava/lang/Boolean;

    .line 257
    .line 258
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 259
    .line 260
    .line 261
    move-result v3
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 262
    if-eqz v3, :cond_2

    .line 263
    .line 264
    goto :goto_3

    .line 265
    :cond_2
    sget v3, LVa/k;->i:I

    .line 266
    .line 267
    add-int/lit8 v3, v3, 0x6b

    .line 268
    .line 269
    rem-int/lit16 v4, v3, 0x80

    .line 270
    .line 271
    sput v4, LVa/k;->h:I

    .line 272
    .line 273
    rem-int/lit8 v3, v3, 0x2

    .line 274
    .line 275
    const v4, -0x38eafc10

    .line 276
    .line 277
    .line 278
    const-string v5, "\u6361\u243a\ub894"

    .line 279
    .line 280
    const-string v6, "\uf00a\u1503\ud3c7\u0c4b"

    .line 281
    .line 282
    if-eqz v3, :cond_3

    .line 283
    .line 284
    :try_start_3
    invoke-static {v7, v1}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 285
    .line 286
    .line 287
    move-result v3

    .line 288
    const/16 v7, 0x5639

    .line 289
    .line 290
    shr-int v3, v7, v3

    .line 291
    .line 292
    int-to-char v3, v3

    .line 293
    const/high16 v7, 0x3f800000    # 1.0f

    .line 294
    .line 295
    invoke-static {v2, v7}, Landroid/graphics/PointF;->length(FF)F

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    const/high16 v7, 0x40000000    # 2.0f

    .line 300
    .line 301
    cmpl-float v2, v2, v7

    .line 302
    .line 303
    div-int/2addr v4, v2

    .line 304
    invoke-static {v3, v6, v5, v4}, LVa/k;->g(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    :goto_2
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 313
    .line 314
    .line 315
    goto :goto_3

    .line 316
    :cond_3
    invoke-static {v1, v1}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    add-int/lit16 v3, v3, 0x4bd3

    .line 321
    .line 322
    int-to-char v3, v3

    .line 323
    invoke-static {v2, v2}, Landroid/graphics/PointF;->length(FF)F

    .line 324
    .line 325
    .line 326
    move-result v7

    .line 327
    cmpl-float v2, v7, v2

    .line 328
    .line 329
    add-int/2addr v2, v4

    .line 330
    invoke-static {v3, v6, v5, v2}, LVa/k;->g(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    goto :goto_2

    .line 335
    :goto_3
    invoke-virtual {p0, p1, v0}, LVa/k;->b(Lorg/json/JSONObject;Z)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {p0, p1, v0}, LVa/k;->h(Lorg/json/JSONObject;Z)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    .line 339
    .line 340
    .line 341
    sget p1, LVa/k;->h:I

    .line 342
    .line 343
    add-int/lit8 p1, p1, 0x3f

    .line 344
    .line 345
    rem-int/lit16 p1, p1, 0x80

    .line 346
    .line 347
    sput p1, LVa/k;->i:I

    .line 348
    .line 349
    :catch_0
    return-void
.end method

.method public final f(Lorg/json/JSONObject;)Z
    .locals 9

    .line 1
    iget-wide v0, p0, LVa/k;->c:J

    .line 2
    .line 3
    iget-wide v2, p0, LVa/k;->b:J

    .line 4
    .line 5
    sub-long/2addr v0, v2

    .line 6
    const-string v2, ""

    .line 7
    .line 8
    const/16 v3, 0x30

    .line 9
    .line 10
    invoke-static {v2, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    const v5, 0xcc89

    .line 15
    .line 16
    .line 17
    add-int/2addr v4, v5

    .line 18
    int-to-char v4, v4

    .line 19
    const/4 v5, 0x0

    .line 20
    invoke-static {v5, v5, v5}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    const v7, -0x7bcb69b4

    .line 25
    .line 26
    .line 27
    sub-int/2addr v7, v6

    .line 28
    const-string v6, "\u4c13\u3496\u8884\uddcc"

    .line 29
    .line 30
    const-string v8, "\u6a1c\u1187\u88a4"

    .line 31
    .line 32
    invoke-static {v4, v6, v8, v7}, LVa/k;->g(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 41
    .line 42
    .line 43
    move-result-wide v6

    .line 44
    invoke-static {v2, v3, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    rsub-int v2, v2, 0xa89

    .line 49
    .line 50
    int-to-char v2, v2

    .line 51
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    const/4 v4, 0x0

    .line 56
    cmpl-float v3, v3, v4

    .line 57
    .line 58
    const-string v4, "\uc467\u4859\u8a72\u5b0a"

    .line 59
    .line 60
    const-string v8, "\u2f32\ue218"

    .line 61
    .line 62
    invoke-static {v2, v4, v8, v3}, LVa/k;->g(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 71
    .line 72
    .line 73
    move-result-wide v2

    .line 74
    sub-long/2addr v6, v2

    .line 75
    sub-long/2addr v0, v6

    .line 76
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    .line 77
    .line 78
    .line 79
    move-result-wide v0

    .line 80
    const-wide/16 v2, 0xa

    .line 81
    .line 82
    cmp-long p1, v0, v2

    .line 83
    .line 84
    if-gtz p1, :cond_1

    .line 85
    .line 86
    sget p1, LVa/k;->h:I

    .line 87
    .line 88
    add-int/lit8 p1, p1, 0x1d

    .line 89
    .line 90
    rem-int/lit16 v0, p1, 0x80

    .line 91
    .line 92
    sput v0, LVa/k;->i:I

    .line 93
    .line 94
    rem-int/lit8 p1, p1, 0x2

    .line 95
    .line 96
    const/4 v0, 0x1

    .line 97
    if-nez p1, :cond_0

    .line 98
    .line 99
    const/16 p1, 0x59

    .line 100
    .line 101
    div-int/2addr p1, v5

    .line 102
    :cond_0
    return v0

    .line 103
    :cond_1
    return v5
.end method

.method public final h(Lorg/json/JSONObject;Z)V
    .locals 12

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    sget v1, LVa/k;->h:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x6d

    .line 6
    .line 7
    rem-int/lit16 v1, v1, 0x80

    .line 8
    .line 9
    sput v1, LVa/k;->i:I

    .line 10
    .line 11
    const/16 v1, 0x30

    .line 12
    .line 13
    :try_start_0
    invoke-static {v0, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    rsub-int/lit8 v2, v2, 0x5

    .line 18
    .line 19
    int-to-short v2, v2

    .line 20
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    shr-int/lit8 v3, v3, 0x8

    .line 25
    .line 26
    const v4, -0xea15589

    .line 27
    .line 28
    .line 29
    sub-int/2addr v4, v3

    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-static {v0, v0, v3, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    add-int/lit8 v5, v5, -0x4c

    .line 36
    .line 37
    invoke-static {v3, v3}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    const v7, 0x7887e832

    .line 42
    .line 43
    .line 44
    add-int/2addr v6, v7

    .line 45
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    shr-int/lit8 v7, v7, 0x16

    .line 50
    .line 51
    int-to-byte v7, v7

    .line 52
    invoke-static {v2, v4, v5, v6, v7}, LVa/k;->e(SIIIB)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 61
    .line 62
    .line 63
    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    const v2, 0x7887e83a

    .line 67
    .line 68
    .line 69
    const-wide/16 v4, 0x0

    .line 70
    .line 71
    const/4 v6, 0x0

    .line 72
    if-eqz p2, :cond_0

    .line 73
    .line 74
    sget p2, LVa/k;->h:I

    .line 75
    .line 76
    add-int/lit8 p2, p2, 0x1f

    .line 77
    .line 78
    rem-int/lit16 p2, p2, 0x80

    .line 79
    .line 80
    sput p2, LVa/k;->i:I

    .line 81
    .line 82
    :try_start_1
    invoke-static {v3, v3}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 83
    .line 84
    .line 85
    move-result-wide v7

    .line 86
    cmp-long p2, v7, v4

    .line 87
    .line 88
    const v7, 0xf1f9

    .line 89
    .line 90
    .line 91
    sub-int/2addr v7, p2

    .line 92
    int-to-char p2, v7

    .line 93
    const-string v7, "\ub433\u819d\ufac6\u27f1"

    .line 94
    .line 95
    const-string v8, "\ucd7f"

    .line 96
    .line 97
    invoke-static {v3}, Landroid/os/Process;->getThreadPriority(I)I

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    add-int/lit8 v9, v9, 0x14

    .line 102
    .line 103
    shr-int/lit8 v9, v9, 0x6

    .line 104
    .line 105
    const v10, -0x397e624c

    .line 106
    .line 107
    .line 108
    add-int/2addr v9, v10

    .line 109
    invoke-static {p2, v7, v8, v9}, LVa/k;->g(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 118
    .line 119
    .line 120
    move-result-wide v7
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 121
    cmp-long p2, v7, v4

    .line 122
    .line 123
    if-lez p2, :cond_2

    .line 124
    .line 125
    sget p2, LVa/k;->h:I

    .line 126
    .line 127
    add-int/lit8 p2, p2, 0x67

    .line 128
    .line 129
    rem-int/lit16 p2, p2, 0x80

    .line 130
    .line 131
    sput p2, LVa/k;->i:I

    .line 132
    .line 133
    :try_start_2
    iget-wide v9, p0, LVa/k;->d:J

    .line 134
    .line 135
    add-long/2addr v7, v9

    .line 136
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    goto :goto_0

    .line 141
    :cond_0
    invoke-static {v3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 142
    .line 143
    .line 144
    move-result p2

    .line 145
    add-int/lit8 p2, p2, -0x3

    .line 146
    .line 147
    int-to-short p2, p2

    .line 148
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    shr-int/lit8 v7, v7, 0x10

    .line 153
    .line 154
    const v8, -0xea15581

    .line 155
    .line 156
    .line 157
    add-int/2addr v7, v8

    .line 158
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 159
    .line 160
    .line 161
    move-result v8

    .line 162
    shr-int/lit8 v8, v8, 0x10

    .line 163
    .line 164
    rsub-int/lit8 v8, v8, -0x54

    .line 165
    .line 166
    const/4 v9, 0x0

    .line 167
    invoke-static {v3, v9, v9}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 168
    .line 169
    .line 170
    move-result v10

    .line 171
    cmpl-float v9, v10, v9

    .line 172
    .line 173
    sub-int v9, v2, v9

    .line 174
    .line 175
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 176
    .line 177
    .line 178
    move-result-wide v10

    .line 179
    cmp-long v10, v10, v4

    .line 180
    .line 181
    rsub-int/lit8 v10, v10, 0x1

    .line 182
    .line 183
    int-to-byte v10, v10

    .line 184
    invoke-static {p2, v7, v8, v9, v10}, LVa/k;->e(SIIIB)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 193
    .line 194
    .line 195
    move-result-wide v7
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 196
    cmp-long p2, v7, v4

    .line 197
    .line 198
    if-lez p2, :cond_2

    .line 199
    .line 200
    sget p2, LVa/k;->i:I

    .line 201
    .line 202
    add-int/lit8 p2, p2, 0x51

    .line 203
    .line 204
    rem-int/lit16 v6, p2, 0x80

    .line 205
    .line 206
    sput v6, LVa/k;->h:I

    .line 207
    .line 208
    rem-int/lit8 p2, p2, 0x2

    .line 209
    .line 210
    if-eqz p2, :cond_1

    .line 211
    .line 212
    :try_start_3
    iget-wide v9, p0, LVa/k;->e:J

    .line 213
    .line 214
    rem-long/2addr v7, v9

    .line 215
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    goto :goto_0

    .line 220
    :cond_1
    iget-wide v9, p0, LVa/k;->e:J

    .line 221
    .line 222
    add-long/2addr v7, v9

    .line 223
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 224
    .line 225
    .line 226
    move-result-object v6
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    .line 227
    :cond_2
    :goto_0
    if-eqz v6, :cond_3

    .line 228
    .line 229
    sget p2, LVa/k;->h:I

    .line 230
    .line 231
    add-int/lit8 p2, p2, 0x71

    .line 232
    .line 233
    rem-int/lit16 p2, p2, 0x80

    .line 234
    .line 235
    sput p2, LVa/k;->i:I

    .line 236
    .line 237
    :try_start_4
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 238
    .line 239
    .line 240
    move-result p2

    .line 241
    shr-int/lit8 p2, p2, 0x10

    .line 242
    .line 243
    rsub-int/lit8 p2, p2, -0x3

    .line 244
    .line 245
    int-to-short p2, p2

    .line 246
    invoke-static {v0, v1, v3, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    const v1, -0xea15580

    .line 251
    .line 252
    .line 253
    add-int/2addr v0, v1

    .line 254
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    shr-int/lit8 v1, v1, 0x8

    .line 259
    .line 260
    add-int/lit8 v1, v1, -0x54

    .line 261
    .line 262
    invoke-static {v3}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 263
    .line 264
    .line 265
    move-result-wide v7

    .line 266
    cmp-long v3, v7, v4

    .line 267
    .line 268
    sub-int/2addr v2, v3

    .line 269
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    shr-int/lit8 v3, v3, 0x10

    .line 274
    .line 275
    int-to-byte v3, v3

    .line 276
    invoke-static {p2, v0, v1, v2, v3}, LVa/k;->e(SIIIB)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p2

    .line 280
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object p2

    .line 284
    invoke-virtual {p1, p2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    .line 285
    .line 286
    .line 287
    sget p1, LVa/k;->i:I

    .line 288
    .line 289
    add-int/lit8 p1, p1, 0x3d

    .line 290
    .line 291
    rem-int/lit16 p1, p1, 0x80

    .line 292
    .line 293
    sput p1, LVa/k;->h:I

    .line 294
    .line 295
    :catch_0
    :cond_3
    return-void
.end method
