.class public abstract LVa/c9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[B

.field public static b:I = 0x0

.field public static c:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0xd

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/c9;->a:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        -0x4at
        -0x1t
        0x6t
        -0xbt
        0x4t
        0xbt
        0x2t
        -0x15t
        0x33t
        0x25t
        -0x2ct
        -0x6t
        -0x1t
    .end array-data
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    sget v0, LVa/c9;->b:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x6d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/c9;->c:I

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0
.end method

.method public b(LVa/x8;)I
    .locals 1

    .line 1
    sget p1, LVa/c9;->b:I

    .line 2
    .line 3
    add-int/lit8 p1, p1, 0x53

    .line 4
    .line 5
    rem-int/lit16 v0, p1, 0x80

    .line 6
    .line 7
    sput v0, LVa/c9;->c:I

    .line 8
    .line 9
    rem-int/lit8 p1, p1, 0x2

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    throw p1
.end method

.method public abstract c(LVa/x8;LVa/y7;)LVa/s8;
.end method

.method public final d(LVa/x8;LVa/y7;)LVa/s8;
    .locals 12

    .line 1
    sget v0, LVa/c9;->b:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x55

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/c9;->c:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    :try_start_0
    invoke-virtual {p1, p0}, LVa/x8;->i(LVa/c9;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, LVa/c9;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p1, p0}, LVa/x8;->k(LVa/c9;)V
    :try_end_0
    .catch LVa/j8; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    sget p1, LVa/c9;->c:I

    .line 21
    .line 22
    add-int/lit8 p1, p1, 0x19

    .line 23
    .line 24
    rem-int/lit16 p2, p1, 0x80

    .line 25
    .line 26
    sput p2, LVa/c9;->b:I

    .line 27
    .line 28
    rem-int/lit8 p1, p1, 0x2

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    const/16 p1, 0x2f

    .line 33
    .line 34
    div-int/2addr p1, v0

    .line 35
    :cond_0
    return-object v1

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move-exception p1

    .line 39
    goto/16 :goto_5

    .line 40
    .line 41
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    if-nez v2, :cond_4

    .line 46
    .line 47
    const-string v2, ""

    .line 48
    .line 49
    invoke-static {v2}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    int-to-short v2, v2

    .line 54
    const/4 v3, 0x0

    .line 55
    invoke-static {v0, v3, v3}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    cmpl-float v3, v4, v3

    .line 60
    .line 61
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    int-to-byte v4, v4

    .line 66
    const-string v5, ""

    .line 67
    .line 68
    const/16 v6, 0x30

    .line 69
    .line 70
    invoke-static {v5, v6}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    const v6, 0x1a2909d4

    .line 75
    .line 76
    .line 77
    sub-int/2addr v6, v5

    .line 78
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    shr-int/lit8 v7, v7, 0x10

    .line 83
    .line 84
    int-to-byte v7, v7

    .line 85
    sget-object v8, LVa/pb;->J:Ljava/lang/Object;

    .line 86
    .line 87
    monitor-enter v8

    .line 88
    :try_start_1
    new-instance v9, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    const/4 v10, 0x1

    .line 94
    const/4 v11, -0x1

    .line 95
    if-ne v4, v11, :cond_1

    .line 96
    .line 97
    move v0, v10

    .line 98
    :cond_1
    if-eqz v0, :cond_2

    .line 99
    .line 100
    sget-object v4, LVa/c9;->a:[B

    .line 101
    .line 102
    sub-int/2addr v11, v5

    .line 103
    aget-byte v4, v4, v11

    .line 104
    .line 105
    add-int/lit8 v4, v4, 0x57

    .line 106
    .line 107
    int-to-byte v4, v4

    .line 108
    goto :goto_1

    .line 109
    :catchall_1
    move-exception p1

    .line 110
    goto :goto_3

    .line 111
    :cond_2
    :goto_1
    if-lez v4, :cond_3

    .line 112
    .line 113
    add-int/2addr v6, v4

    .line 114
    const v5, 0x1a2909d7

    .line 115
    .line 116
    .line 117
    sub-int/2addr v6, v5

    .line 118
    add-int/2addr v6, v0

    .line 119
    sput v6, LVa/pb;->F:I

    .line 120
    .line 121
    sput-byte v7, LVa/pb;->G:B

    .line 122
    .line 123
    rsub-int/lit8 v0, v3, 0x53

    .line 124
    .line 125
    int-to-char v0, v0

    .line 126
    sput-char v0, LVa/pb;->H:C

    .line 127
    .line 128
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    sget-char v0, LVa/pb;->H:C

    .line 132
    .line 133
    sput-char v0, LVa/pb;->I:C

    .line 134
    .line 135
    sput v10, LVa/pb;->E:I

    .line 136
    .line 137
    :goto_2
    sget v0, LVa/pb;->E:I

    .line 138
    .line 139
    if-ge v0, v4, :cond_3

    .line 140
    .line 141
    sget-object v0, LVa/c9;->a:[B

    .line 142
    .line 143
    sget v3, LVa/pb;->F:I

    .line 144
    .line 145
    add-int/lit8 v5, v3, -0x1

    .line 146
    .line 147
    sput v5, LVa/pb;->F:I

    .line 148
    .line 149
    aget-byte v0, v0, v3

    .line 150
    .line 151
    sget-char v3, LVa/pb;->I:C

    .line 152
    .line 153
    add-int/2addr v0, v2

    .line 154
    int-to-byte v0, v0

    .line 155
    sget-byte v5, LVa/pb;->G:B

    .line 156
    .line 157
    xor-int/2addr v0, v5

    .line 158
    add-int/2addr v3, v0

    .line 159
    int-to-char v0, v3

    .line 160
    sput-char v0, LVa/pb;->H:C

    .line 161
    .line 162
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    sget-char v0, LVa/pb;->H:C

    .line 166
    .line 167
    sput-char v0, LVa/pb;->I:C

    .line 168
    .line 169
    sget v0, LVa/pb;->E:I

    .line 170
    .line 171
    add-int/2addr v0, v10

    .line 172
    sput v0, LVa/pb;->E:I

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_3
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 180
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    goto :goto_4

    .line 185
    :goto_3
    monitor-exit v8

    .line 186
    throw p1

    .line 187
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    :goto_4
    new-instance v2, LVa/j8;

    .line 192
    .line 193
    invoke-direct {v2, p2, p1, v0, v1}, LVa/j8;-><init>(LVa/y7;LVa/x8;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 194
    .line 195
    .line 196
    throw v2

    .line 197
    :goto_5
    throw p1
.end method
