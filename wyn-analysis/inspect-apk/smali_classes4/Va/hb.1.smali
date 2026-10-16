.class public final enum LVa/hb;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:LVa/hb;

.field public static final enum b:LVa/hb;

.field public static final enum c:LVa/hb;

.field public static final synthetic d:[LVa/hb;

.field public static e:I = 0x0

.field public static f:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    new-instance v3, LVa/hb;

    .line 5
    .line 6
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 7
    .line 8
    .line 9
    move-result v4

    .line 10
    const v5, 0xaf52

    .line 11
    .line 12
    .line 13
    add-int/2addr v4, v5

    .line 14
    int-to-char v4, v4

    .line 15
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    shr-int/lit8 v5, v5, 0x10

    .line 20
    .line 21
    const-string v6, "\uc155\u3a4b\u52de\u8caf"

    .line 22
    .line 23
    const-string v7, "\u8839\u3118\u8158\u4a14"

    .line 24
    .line 25
    invoke-static {v4, v6, v7, v5}, LVa/hb;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-direct {v3, v4, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    sput-object v3, LVa/hb;->a:LVa/hb;

    .line 37
    .line 38
    new-instance v4, LVa/hb;

    .line 39
    .line 40
    const-wide/16 v5, 0x0

    .line 41
    .line 42
    invoke-static {v5, v6}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    const v6, 0xe9cd

    .line 47
    .line 48
    .line 49
    add-int/2addr v5, v6

    .line 50
    int-to-char v5, v5

    .line 51
    const-string v6, ""

    .line 52
    .line 53
    invoke-static {v6, v6, v2, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    const v7, -0x72287683

    .line 58
    .line 59
    .line 60
    add-int/2addr v6, v7

    .line 61
    const-string v7, "\u7d61\ud789\ucd8d\uefe9"

    .line 62
    .line 63
    const-string v8, "\u7bad\ufb2a\ubae8\ue70e\uc966\u84e6\u5243\u1944\uedac\u1af4\u5e50\u1547\u0010\ufac4\u5fa0\u285a\u0f6b"

    .line 64
    .line 65
    invoke-static {v5, v7, v8, v6}, LVa/hb;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-direct {v4, v5, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    sput-object v4, LVa/hb;->b:LVa/hb;

    .line 77
    .line 78
    new-instance v5, LVa/hb;

    .line 79
    .line 80
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    shr-int/lit8 v6, v6, 0x8

    .line 85
    .line 86
    int-to-char v6, v6

    .line 87
    const/16 v7, 0x30

    .line 88
    .line 89
    invoke-static {v7}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    sub-int/2addr v7, v8

    .line 94
    const-string v8, "\u1efa\ufd01\u9f26\u4914"

    .line 95
    .line 96
    const-string v9, "\ub316\u093a\uf8c8\uca61\u2c4a\ufa90\udd23\u2ac8\u0283\u6278\ua6f7\u21e4\ue916\ue821\u34e8\ud269\uc569\u560f\ud00f\u981c\ud36b\u66e4"

    .line 97
    .line 98
    invoke-static {v6, v8, v9, v7}, LVa/hb;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    invoke-direct {v5, v6, v0}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 107
    .line 108
    .line 109
    sput-object v5, LVa/hb;->c:LVa/hb;

    .line 110
    .line 111
    const/4 v6, 0x3

    .line 112
    new-array v6, v6, [LVa/hb;

    .line 113
    .line 114
    aput-object v3, v6, v2

    .line 115
    .line 116
    aput-object v4, v6, v1

    .line 117
    .line 118
    aput-object v5, v6, v0

    .line 119
    .line 120
    sput-object v6, LVa/hb;->d:[LVa/hb;

    .line 121
    .line 122
    sget v0, LVa/hb;->e:I

    .line 123
    .line 124
    add-int/lit8 v0, v0, 0x21

    .line 125
    .line 126
    rem-int/lit16 v0, v0, 0x80

    .line 127
    .line 128
    sput v0, LVa/hb;->f:I

    .line 129
    .line 130
    return-void
.end method

.method public static a(Ljava/lang/String;)LVa/hb;
    .locals 10

    .line 1
    sget v0, LVa/hb;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x43

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/hb;->e:I

    .line 8
    .line 9
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto/16 :goto_1

    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/16 v2, 0xe3a

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    const/4 v4, -0x1

    .line 26
    const/4 v5, 0x2

    .line 27
    if-eq v0, v2, :cond_3

    .line 28
    .line 29
    const v2, 0x17a99

    .line 30
    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    if-eq v0, v2, :cond_2

    .line 34
    .line 35
    const v2, 0x1aacd

    .line 36
    .line 37
    .line 38
    if-eq v0, v2, :cond_1

    .line 39
    .line 40
    goto/16 :goto_0

    .line 41
    .line 42
    :cond_1
    const-string v0, ""

    .line 43
    .line 44
    invoke-static {v0}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    add-int/lit16 v0, v0, 0x6de4

    .line 49
    .line 50
    int-to-char v0, v0

    .line 51
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    shr-int/lit8 v2, v2, 0x10

    .line 56
    .line 57
    const v7, -0x3b9969a6

    .line 58
    .line 59
    .line 60
    sub-int/2addr v7, v2

    .line 61
    const-string v2, "\u5aa3\u6696\ue4c4\ud86d"

    .line 62
    .line 63
    const-string v8, "\ud79c\u2470\u6e0f"

    .line 64
    .line 65
    invoke-static {v0, v2, v8, v7}, LVa/hb;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-eqz p0, :cond_4

    .line 78
    .line 79
    move v4, v6

    .line 80
    goto :goto_0

    .line 81
    :cond_2
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    int-to-byte v0, v0

    .line 86
    rsub-int v0, v0, 0x671a

    .line 87
    .line 88
    int-to-char v0, v0

    .line 89
    const/4 v2, 0x0

    .line 90
    invoke-static {v6, v2, v2}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    cmpl-float v2, v6, v2

    .line 95
    .line 96
    const v6, 0x418431a7

    .line 97
    .line 98
    .line 99
    sub-int/2addr v6, v2

    .line 100
    const-string v2, "\ua7bb\u8431\u1b41\u5b67"

    .line 101
    .line 102
    const-string v7, "\u4317\uaf9c\u2a98"

    .line 103
    .line 104
    invoke-static {v0, v2, v7, v6}, LVa/hb;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-eqz p0, :cond_4

    .line 117
    .line 118
    sget p0, LVa/hb;->f:I

    .line 119
    .line 120
    add-int/lit8 p0, p0, 0x77

    .line 121
    .line 122
    rem-int/lit16 p0, p0, 0x80

    .line 123
    .line 124
    sput p0, LVa/hb;->e:I

    .line 125
    .line 126
    move v4, v3

    .line 127
    goto :goto_0

    .line 128
    :cond_3
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    shr-int/lit8 v0, v0, 0x10

    .line 133
    .line 134
    add-int/lit16 v0, v0, 0x566b

    .line 135
    .line 136
    int-to-char v0, v0

    .line 137
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 138
    .line 139
    .line 140
    move-result-wide v6

    .line 141
    const-wide/16 v8, 0x0

    .line 142
    .line 143
    cmp-long v2, v6, v8

    .line 144
    .line 145
    add-int/2addr v2, v4

    .line 146
    const-string v6, "\uf4bc\ud452\u6bec\u5b56"

    .line 147
    .line 148
    const-string v7, "\ub2db\uae1e"

    .line 149
    .line 150
    invoke-static {v0, v6, v7, v2}, LVa/hb;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    if-eqz p0, :cond_4

    .line 163
    .line 164
    move v4, v5

    .line 165
    :cond_4
    :goto_0
    if-eqz v4, :cond_8

    .line 166
    .line 167
    if-eq v4, v3, :cond_7

    .line 168
    .line 169
    if-eq v4, v5, :cond_5

    .line 170
    .line 171
    :goto_1
    return-object v1

    .line 172
    :cond_5
    sget p0, LVa/hb;->f:I

    .line 173
    .line 174
    add-int/lit8 p0, p0, 0x77

    .line 175
    .line 176
    rem-int/lit16 v0, p0, 0x80

    .line 177
    .line 178
    sput v0, LVa/hb;->e:I

    .line 179
    .line 180
    rem-int/2addr p0, v5

    .line 181
    if-nez p0, :cond_6

    .line 182
    .line 183
    sget-object p0, LVa/hb;->c:LVa/hb;

    .line 184
    .line 185
    return-object p0

    .line 186
    :cond_6
    throw v1

    .line 187
    :cond_7
    sget-object p0, LVa/hb;->b:LVa/hb;

    .line 188
    .line 189
    return-object p0

    .line 190
    :cond_8
    sget-object p0, LVa/hb;->a:LVa/hb;

    .line 191
    .line 192
    return-object p0
.end method

.method public static b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
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
    const v6, 0x468ab1e7

    .line 98
    .line 99
    .line 100
    int-to-long v6, v6

    .line 101
    xor-long/2addr v4, v6

    .line 102
    int-to-long v6, v2

    .line 103
    xor-long/2addr v4, v6

    .line 104
    long-to-int v4, v4

    .line 105
    int-to-char v4, v4

    .line 106
    aput-char v4, p3, v3

    .line 107
    .line 108
    add-int/lit8 v3, v3, 0x1

    .line 109
    .line 110
    sput v3, LVa/a;->q:I

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :catchall_0
    move-exception p0

    .line 114
    goto :goto_1

    .line 115
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 116
    .line 117
    invoke-direct {p0, p3}, Ljava/lang/String;-><init>([C)V

    .line 118
    .line 119
    .line 120
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    return-object p0

    .line 122
    :goto_1
    monitor-exit v1

    .line 123
    throw p0
.end method

.method public static valueOf(Ljava/lang/String;)LVa/hb;
    .locals 1

    .line 1
    sget v0, LVa/hb;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x31

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/hb;->f:I

    .line 8
    .line 9
    const-class v0, LVa/hb;

    .line 10
    .line 11
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, LVa/hb;

    .line 16
    .line 17
    sget v0, LVa/hb;->e:I

    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x9

    .line 20
    .line 21
    rem-int/lit16 v0, v0, 0x80

    .line 22
    .line 23
    sput v0, LVa/hb;->f:I

    .line 24
    .line 25
    return-object p0
.end method

.method public static values()[LVa/hb;
    .locals 3

    .line 1
    sget v0, LVa/hb;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x4f

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/hb;->f:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    sget-object v1, LVa/hb;->d:[LVa/hb;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1}, [LVa/hb;->clone()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, [LVa/hb;

    .line 20
    .line 21
    sget v1, LVa/hb;->f:I

    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x33

    .line 24
    .line 25
    rem-int/lit16 v2, v1, 0x80

    .line 26
    .line 27
    sput v2, LVa/hb;->e:I

    .line 28
    .line 29
    rem-int/lit8 v1, v1, 0x2

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    const/16 v1, 0x15

    .line 34
    .line 35
    div-int/lit8 v1, v1, 0x0

    .line 36
    .line 37
    :cond_0
    return-object v0

    .line 38
    :cond_1
    invoke-virtual {v1}, [LVa/hb;->clone()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    throw v0
.end method
