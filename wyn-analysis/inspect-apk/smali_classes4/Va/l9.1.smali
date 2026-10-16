.class public final LVa/l9;
.super LVa/m9;
.source "SourceFile"


# static fields
.field public static final h:[C

.field public static i:I = 0x0

.field public static j:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x23

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/l9;->h:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x67s
        0xd6s
        0xe0s
        0xd7s
        0xb2s
        0xb7s
        0xd8s
        0xd3s
        0xd1s
        0xd1s
        0xc5s
        0xc5s
        0xbcs
        0xb4s
        0xbes
        0xabs
        0xb6s
        0xd1s
        0xd5s
        0xd5s
        0xccs
        0xd1s
        0xd3s
        0xd4s
        0xd9s
        0xb8s
        0xb6s
        0xd1s
        0xd5s
        0xbas
        0xb3s
        0xces
        0xd2s
        0xd1s
        0xccs
    .end array-data
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 14

    .line 1
    sget v0, LVa/l9;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x4d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/l9;->j:I

    .line 8
    .line 9
    const-string v0, "\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001"

    .line 10
    .line 11
    const/16 v1, 0x6a

    .line 12
    .line 13
    const/16 v2, 0x8

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    const/16 v4, 0x23

    .line 17
    .line 18
    filled-new-array {v3, v4, v1, v2}, [I

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "ISO-8859-1"

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, [B

    .line 29
    .line 30
    sget-object v2, LVa/Ab;->z:Ljava/lang/Object;

    .line 31
    .line 32
    monitor-enter v2

    .line 33
    :try_start_0
    aget v4, v1, v3

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    aget v6, v1, v5

    .line 37
    .line 38
    const/4 v7, 0x2

    .line 39
    aget v8, v1, v7

    .line 40
    .line 41
    const/4 v9, 0x3

    .line 42
    aget v9, v1, v9

    .line 43
    .line 44
    sget-object v10, LVa/l9;->h:[C

    .line 45
    .line 46
    new-array v11, v6, [C

    .line 47
    .line 48
    invoke-static {v10, v4, v11, v3, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 49
    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    new-array v4, v6, [C

    .line 54
    .line 55
    sput v3, LVa/Ab;->y:I

    .line 56
    .line 57
    move v10, v3

    .line 58
    :goto_0
    sget v12, LVa/Ab;->y:I

    .line 59
    .line 60
    if-ge v12, v6, :cond_1

    .line 61
    .line 62
    aget-byte v13, v0, v12

    .line 63
    .line 64
    if-ne v13, v5, :cond_0

    .line 65
    .line 66
    aget-char v13, v11, v12

    .line 67
    .line 68
    shl-int/2addr v13, v5

    .line 69
    add-int/2addr v13, v5

    .line 70
    sub-int/2addr v13, v10

    .line 71
    int-to-char v10, v13

    .line 72
    aput-char v10, v4, v12

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    goto :goto_4

    .line 77
    :cond_0
    aget-char v13, v11, v12

    .line 78
    .line 79
    shl-int/2addr v13, v5

    .line 80
    sub-int/2addr v13, v10

    .line 81
    int-to-char v10, v13

    .line 82
    aput-char v10, v4, v12

    .line 83
    .line 84
    :goto_1
    aget-char v10, v4, v12

    .line 85
    .line 86
    add-int/lit8 v12, v12, 0x1

    .line 87
    .line 88
    sput v12, LVa/Ab;->y:I

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    move-object v11, v4

    .line 92
    :cond_2
    if-lez v9, :cond_3

    .line 93
    .line 94
    new-array v0, v6, [C

    .line 95
    .line 96
    invoke-static {v11, v3, v0, v3, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 97
    .line 98
    .line 99
    sub-int v4, v6, v9

    .line 100
    .line 101
    invoke-static {v0, v3, v11, v4, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 102
    .line 103
    .line 104
    invoke-static {v0, v9, v11, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 105
    .line 106
    .line 107
    :cond_3
    new-array v0, v6, [C

    .line 108
    .line 109
    sput v3, LVa/Ab;->y:I

    .line 110
    .line 111
    :goto_2
    sget v4, LVa/Ab;->y:I

    .line 112
    .line 113
    if-ge v4, v6, :cond_4

    .line 114
    .line 115
    sub-int v9, v6, v4

    .line 116
    .line 117
    sub-int/2addr v9, v5

    .line 118
    aget-char v9, v11, v9

    .line 119
    .line 120
    aput-char v9, v0, v4

    .line 121
    .line 122
    add-int/lit8 v4, v4, 0x1

    .line 123
    .line 124
    sput v4, LVa/Ab;->y:I

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_4
    if-lez v8, :cond_5

    .line 128
    .line 129
    sput v3, LVa/Ab;->y:I

    .line 130
    .line 131
    :goto_3
    sget v3, LVa/Ab;->y:I

    .line 132
    .line 133
    if-ge v3, v6, :cond_5

    .line 134
    .line 135
    aget-char v4, v0, v3

    .line 136
    .line 137
    aget v5, v1, v7

    .line 138
    .line 139
    sub-int/2addr v4, v5

    .line 140
    int-to-char v4, v4

    .line 141
    aput-char v4, v0, v3

    .line 142
    .line 143
    add-int/lit8 v3, v3, 0x1

    .line 144
    .line 145
    sput v3, LVa/Ab;->y:I

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_5
    new-instance v1, Ljava/lang/String;

    .line 149
    .line 150
    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([C)V

    .line 151
    .line 152
    .line 153
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    sget v1, LVa/l9;->i:I

    .line 159
    .line 160
    add-int/lit8 v1, v1, 0x17

    .line 161
    .line 162
    rem-int/lit16 v1, v1, 0x80

    .line 163
    .line 164
    sput v1, LVa/l9;->j:I

    .line 165
    .line 166
    return-object v0

    .line 167
    :goto_4
    monitor-exit v2

    .line 168
    throw v0
.end method

.method public final e()Ljava/lang/Class;
    .locals 2

    .line 1
    sget v0, LVa/l9;->j:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x35

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/l9;->i:I

    .line 8
    .line 9
    const-class v1, Lcom/bytedance/sdk/openadsdk/TTAdSdk;

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x9

    .line 12
    .line 13
    rem-int/lit16 v0, v0, 0x80

    .line 14
    .line 15
    sput v0, LVa/l9;->j:I

    .line 16
    .line 17
    return-object v1
.end method
