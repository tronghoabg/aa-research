.class public final LVa/M3;
.super LVa/Z0;
.source "SourceFile"


# static fields
.field public static final R:[C

.field public static S:I = 0x0

.field public static T:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0xc5

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/M3;->R:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x4ds
        0x1b57s
        0x3605s
        0x51cds
        0x6c99s
        -0x7796s
        -0x5cc9s
        -0x520fs
        -0x491es
        -0x6466s
        -0x399s
        -0x3efcs
        0x25d2s
        0xe87s
        0x13a9s
        0x7472s
        0x5933s
        -0x4237s
        -0x7974s
        -0x1487s
        -0x3393s
        -0x2ed0s
        0x35f3s
        0x1ea6s
        0x634fs
        0x4408s
        -0x5735s
        0x3a05s
        0x2129s
        0xc2ds
        0x6ba0s
        0x56d6s
        -0x4df8s
        -0x66bcs
        -0x7bc5s
        -0x1c54s
        -0x3113s
        0x2a18s
        0x1113s
        0x7c86s
        0x5bbfs
        0x46ffs
        -0x5dc9s
        -0x76a0s
        -0xb70s
        -0x2c39s
        0x3f43s
        0x1a16s
        0x165s
        0x6c8ds
        0x4bc0s
        -0x48eds
        -0x6dbbs
        -0x6a0s
        -0x1b42s
        -0x3c0bs
        0x2f14s
        0xa5es
        0x718bs
        0x5cees
        -0x4406s
        -0x58c9s
        -0x7d9cs
        -0x167fs
        -0x2b38s
        0x301fs
        0x1f2cs
        -0x3790s
        -0x2c86s
        -0x1c7s
        -0x660as
        -0x5b5es
        0x4057s
        0x6b0fs
        0x7627s
        0x11ecs
        0x3c9fs
        -0x27c0s
        -0x1cd5s
        -0x712ds
        -0x560es
        -0x4b5bs
        0x5064s
        0x7b31s
        0x6das
        0x218ds
        0x6as
        0x1b46s
        0x3642s
        0x51cfs
        0x6cb9s
        -0x7799s
        -0x5cd5s
        -0x41acs
        -0x263ds
        -0xb7es
        0x1077s
        0x2b7cs
        0x46e9s
        0x61d0s
        0x7c90s
        -0x67a8s
        -0x4cf1s
        -0x3101s
        -0x1658s
        0x52cs
        0x2070s
        0x3b1as
        0x56c9s
        0x71b6s
        -0x72aes
        -0x57d9s
        -0x3cf1s
        -0x2129s
        -0x674s
        0x155fs
        0x3030s
        0x4bcbs
        0x66a3s
        -0x7e7es
        -0x62bbs
        -0x47ecs
        -0x2c0fs
        -0x1146s
        0xa7ds
        0x4ds
        0x1b57s
        0x3605s
        0x51cds
        0x6c99s
        -0x7796s
        -0x5cc9s
        -0x41cds
        -0x2622s
        -0xb6bs
        0x1068s
        0x2b33s
        0x46e6s
        0x61dds
        0x7c91s
        -0x701cs
        -0x6b02s
        -0x4654s
        -0x219cs
        -0x1cd0s
        0x7c3s
        0x2c9es
        0x319fs
        0x5670s
        0x7b3cs
        -0x603fs
        -0x5b62s
        -0x36b1s
        -0x118es
        -0xcd1s
        0x4ds
        0x1b57s
        0x3605s
        0x51cds
        0x6c99s
        -0x7796s
        -0x5cc9s
        -0x41cas
        -0x2627s
        -0xb6bs
        0x1068s
        0x2b37s
        0x46e6s
        0x61dbs
        0x7c86s
        -0x679ds
        -0x4cf2s
        -0x311es
        -0x1657s
        0x570s
        0x205es
        0x3b0fs
        0x56c7s
        0x71bfs
        0x73s
        0x1b53s
        0x3618s
        0x51efs
        0x6cb9s
        -0x7799s
        -0x5cd5s
        -0x41c5s
        -0x262cs
        -0xb6bs
        0x1050s
        0x2b3bs
        0x46fbs
        0x61cas
        0x7c91s
        -0x67bcs
        -0x4cfbs
        -0x311cs
    .end array-data
.end method

.method public static C0(IIC)Ljava/lang/String;
    .locals 9

    .line 1
    sget-object v0, LVa/Ab;->u:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-array v1, p1, [C

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    sput v2, LVa/Ab;->t:I

    .line 8
    .line 9
    :goto_0
    sget v2, LVa/Ab;->t:I

    .line 10
    .line 11
    if-ge v2, p1, :cond_0

    .line 12
    .line 13
    sget-object v3, LVa/M3;->R:[C

    .line 14
    .line 15
    add-int v4, p0, v2

    .line 16
    .line 17
    aget-char v3, v3, v4

    .line 18
    .line 19
    int-to-long v3, v3

    .line 20
    int-to-long v5, v2

    .line 21
    const-wide v7, 0x2318f0cdee071b36L

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    mul-long/2addr v5, v7

    .line 27
    xor-long/2addr v3, v5

    .line 28
    int-to-long v5, p2

    .line 29
    xor-long/2addr v3, v5

    .line 30
    long-to-int v3, v3

    .line 31
    int-to-char v3, v3

    .line 32
    aput-char v3, v1, v2

    .line 33
    .line 34
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    sput v2, LVa/Ab;->t:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 42
    .line 43
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 44
    .line 45
    .line 46
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    return-object p0

    .line 48
    :goto_1
    monitor-exit v0

    .line 49
    throw p0
.end method

.method public static D0(Ljp/maio/sdk/android/MaioAdsListenerInterface;)V
    .locals 1

    .line 1
    sget v0, LVa/M3;->T:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x13

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/M3;->S:I

    .line 8
    .line 9
    invoke-static {p0}, Ljp/maio/sdk/android/MaioAds;->setMaioAdsListener(Ljp/maio/sdk/android/MaioAdsListenerInterface;)V

    .line 10
    .line 11
    .line 12
    sget p0, LVa/M3;->T:I

    .line 13
    .line 14
    add-int/lit8 p0, p0, 0x69

    .line 15
    .line 16
    rem-int/lit16 v0, p0, 0x80

    .line 17
    .line 18
    sput v0, LVa/M3;->S:I

    .line 19
    .line 20
    rem-int/lit8 p0, p0, 0x2

    .line 21
    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    throw p0
.end method


# virtual methods
.method public final A0()Ljava/util/HashMap;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    shr-int/lit8 v1, v1, 0x10

    .line 11
    .line 12
    int-to-char v1, v1

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-static {v2, v3, v3}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    cmpl-float v2, v2, v3

    .line 20
    .line 21
    rsub-int v2, v2, 0xb3

    .line 22
    .line 23
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    shr-int/lit8 v3, v3, 0x10

    .line 28
    .line 29
    add-int/lit8 v3, v3, 0x12

    .line 30
    .line 31
    invoke-static {v2, v3, v1}, LVa/M3;->C0(IIC)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    new-instance v2, LVa/L3;

    .line 40
    .line 41
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    sget v1, LVa/M3;->T:I

    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x43

    .line 50
    .line 51
    rem-int/lit16 v1, v1, 0x80

    .line 52
    .line 53
    sput v1, LVa/M3;->S:I

    .line 54
    .line 55
    return-object v0
.end method

.method public final t0()Ljava/lang/String;
    .locals 2

    .line 1
    sget v0, LVa/M3;->S:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x11

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/M3;->T:I

    .line 8
    .line 9
    invoke-static {}, Ljp/maio/sdk/android/MaioAds;->getSdkVersion()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget v1, LVa/M3;->S:I

    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x4f

    .line 16
    .line 17
    rem-int/lit16 v1, v1, 0x80

    .line 18
    .line 19
    sput v1, LVa/M3;->T:I

    .line 20
    .line 21
    return-object v0
.end method

.method public final w0(Ljava/lang/String;)Ljava/lang/Class;
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x7

    .line 6
    const/4 v2, 0x3

    .line 7
    const/4 v3, -0x1

    .line 8
    const/4 v4, 0x6

    .line 9
    const/4 v5, 0x2

    .line 10
    const/4 v6, 0x1

    .line 11
    const/16 v7, 0x30

    .line 12
    .line 13
    const-wide/16 v8, 0x0

    .line 14
    .line 15
    const-string v10, ""

    .line 16
    .line 17
    const/4 v11, 0x0

    .line 18
    sparse-switch v0, :sswitch_data_0

    .line 19
    .line 20
    .line 21
    goto/16 :goto_1

    .line 22
    .line 23
    :sswitch_0
    invoke-static {v10, v10}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    int-to-char v0, v0

    .line 28
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    shr-int/lit8 v1, v1, 0x8

    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x56

    .line 35
    .line 36
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    int-to-byte v4, v4

    .line 41
    rsub-int/lit8 v4, v4, 0x26

    .line 42
    .line 43
    invoke-static {v1, v4, v0}, LVa/M3;->C0(IIC)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    sget p1, LVa/M3;->T:I

    .line 58
    .line 59
    add-int/lit8 p1, p1, 0x1b

    .line 60
    .line 61
    rem-int/lit16 v0, p1, 0x80

    .line 62
    .line 63
    sput v0, LVa/M3;->S:I

    .line 64
    .line 65
    rem-int/2addr p1, v5

    .line 66
    if-eqz p1, :cond_0

    .line 67
    .line 68
    :goto_0
    move v1, v2

    .line 69
    goto/16 :goto_2

    .line 70
    .line 71
    :cond_0
    const/4 v1, 0x4

    .line 72
    goto/16 :goto_2

    .line 73
    .line 74
    :sswitch_1
    const v0, 0xadb0

    .line 75
    .line 76
    .line 77
    invoke-static {v11, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    sub-int/2addr v0, v1

    .line 82
    int-to-char v0, v0

    .line 83
    invoke-static {v10, v7, v11}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    sub-int/2addr v4, v1

    .line 88
    invoke-static {v8, v9}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    add-int/lit8 v1, v1, 0x14

    .line 93
    .line 94
    invoke-static {v4, v1, v0}, LVa/M3;->C0(IIC)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-eq p1, v6, :cond_1

    .line 107
    .line 108
    goto/16 :goto_1

    .line 109
    .line 110
    :cond_1
    move v1, v6

    .line 111
    goto/16 :goto_2

    .line 112
    .line 113
    :sswitch_2
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    shr-int/lit8 v0, v0, 0x10

    .line 118
    .line 119
    const v1, 0xc838

    .line 120
    .line 121
    .line 122
    sub-int/2addr v1, v0

    .line 123
    int-to-char v0, v1

    .line 124
    invoke-static {v8, v9}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    add-int/lit8 v1, v1, 0x44

    .line 129
    .line 130
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    shr-int/lit8 v4, v4, 0x8

    .line 135
    .line 136
    add-int/lit8 v4, v4, 0x13

    .line 137
    .line 138
    invoke-static {v1, v4, v0}, LVa/M3;->C0(IIC)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    xor-int/2addr p1, v6

    .line 151
    if-eq p1, v6, :cond_2

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :sswitch_3
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    shr-int/lit8 v0, v0, 0x8

    .line 159
    .line 160
    const v1, 0x8fa9

    .line 161
    .line 162
    .line 163
    sub-int/2addr v1, v0

    .line 164
    int-to-char v0, v1

    .line 165
    invoke-static {v11}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 166
    .line 167
    .line 168
    move-result-wide v1

    .line 169
    cmp-long v1, v1, v8

    .line 170
    .line 171
    add-int/lit16 v1, v1, 0x8c

    .line 172
    .line 173
    const/4 v2, 0x0

    .line 174
    invoke-static {v11, v2, v2}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    cmpl-float v2, v5, v2

    .line 179
    .line 180
    add-int/lit8 v2, v2, 0xf

    .line 181
    .line 182
    invoke-static {v1, v2, v0}, LVa/M3;->C0(IIC)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    if-eqz p1, :cond_2

    .line 195
    .line 196
    move v1, v4

    .line 197
    goto/16 :goto_2

    .line 198
    .line 199
    :sswitch_4
    invoke-static {v11, v11, v11}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    int-to-char v0, v0

    .line 204
    invoke-static {v10, v7, v11}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    rsub-int/lit8 v1, v1, 0x7c

    .line 209
    .line 210
    invoke-static {v11}, Landroid/os/Process;->getThreadPriority(I)I

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    add-int/lit8 v2, v2, 0x14

    .line 215
    .line 216
    shr-int/2addr v2, v4

    .line 217
    add-int/lit8 v2, v2, 0xf

    .line 218
    .line 219
    invoke-static {v1, v2, v0}, LVa/M3;->C0(IIC)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    if-eqz p1, :cond_2

    .line 232
    .line 233
    const/4 v1, 0x5

    .line 234
    goto/16 :goto_2

    .line 235
    .line 236
    :sswitch_5
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    shr-int/lit8 v0, v0, 0x10

    .line 241
    .line 242
    int-to-char v0, v0

    .line 243
    invoke-static {v11}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 244
    .line 245
    .line 246
    move-result-wide v4

    .line 247
    cmp-long v2, v4, v8

    .line 248
    .line 249
    rsub-int v2, v2, 0x9b

    .line 250
    .line 251
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    shr-int/lit8 v4, v4, 0x10

    .line 256
    .line 257
    rsub-int/lit8 v4, v4, 0x18

    .line 258
    .line 259
    invoke-static {v2, v4, v0}, LVa/M3;->C0(IIC)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result p1

    .line 271
    if-eqz p1, :cond_2

    .line 272
    .line 273
    sget p1, LVa/M3;->S:I

    .line 274
    .line 275
    add-int/lit8 p1, p1, 0x45

    .line 276
    .line 277
    rem-int/lit16 p1, p1, 0x80

    .line 278
    .line 279
    sput p1, LVa/M3;->T:I

    .line 280
    .line 281
    goto :goto_2

    .line 282
    :sswitch_6
    invoke-static {v11, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    add-int/lit16 v0, v0, 0x3a6f

    .line 287
    .line 288
    int-to-char v0, v0

    .line 289
    invoke-static {v10, v7}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    rsub-int/lit8 v1, v1, 0x1a

    .line 294
    .line 295
    invoke-static {v8, v9}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    rsub-int/lit8 v2, v2, 0x27

    .line 300
    .line 301
    invoke-static {v1, v2, v0}, LVa/M3;->C0(IIC)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result p1

    .line 313
    if-eqz p1, :cond_2

    .line 314
    .line 315
    sget p1, LVa/M3;->S:I

    .line 316
    .line 317
    add-int/lit8 p1, p1, 0x59

    .line 318
    .line 319
    rem-int/lit16 p1, p1, 0x80

    .line 320
    .line 321
    sput p1, LVa/M3;->T:I

    .line 322
    .line 323
    move v1, v5

    .line 324
    goto :goto_2

    .line 325
    :sswitch_7
    invoke-static {v10, v10, v11}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    int-to-char v0, v0

    .line 330
    invoke-static {v10, v7, v11, v11}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 331
    .line 332
    .line 333
    move-result v2

    .line 334
    rsub-int/lit8 v2, v2, -0x1

    .line 335
    .line 336
    invoke-static {v10}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 337
    .line 338
    .line 339
    move-result v4

    .line 340
    sub-int/2addr v1, v4

    .line 341
    invoke-static {v2, v1, v0}, LVa/M3;->C0(IIC)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result p1

    .line 353
    if-eqz p1, :cond_2

    .line 354
    .line 355
    sget p1, LVa/M3;->T:I

    .line 356
    .line 357
    add-int/lit8 p1, p1, 0x4b

    .line 358
    .line 359
    rem-int/lit16 p1, p1, 0x80

    .line 360
    .line 361
    sput p1, LVa/M3;->S:I

    .line 362
    .line 363
    move v1, v11

    .line 364
    goto :goto_2

    .line 365
    :cond_2
    :goto_1
    move v1, v3

    .line 366
    :goto_2
    packed-switch v1, :pswitch_data_0

    .line 367
    .line 368
    .line 369
    const/4 p1, 0x0

    .line 370
    return-object p1

    .line 371
    :pswitch_0
    const-class p1, Ljp/maio/sdk/android/MaioAdsListenerInterface;

    .line 372
    .line 373
    return-object p1

    .line 374
    :pswitch_1
    const-class p1, Ljp/maio/sdk/android/MaioAdsListener;

    .line 375
    .line 376
    return-object p1

    .line 377
    :pswitch_2
    const-class p1, Ljp/maio/sdk/android/MaioAdsInstance;

    .line 378
    .line 379
    return-object p1

    .line 380
    :pswitch_3
    const-class p1, Ljp/maio/sdk/android/HtmlBasedAdActivity;

    .line 381
    .line 382
    return-object p1

    .line 383
    :pswitch_4
    const-class p1, Ljp/maio/sdk/android/AdFullscreenActivity;

    .line 384
    .line 385
    return-object p1

    .line 386
    :pswitch_5
    const-class p1, Ljp/maio/sdk/android/MaioAds;

    .line 387
    .line 388
    return-object p1

    .line 389
    :sswitch_data_0
    .sparse-switch
        -0x6b3eff8a -> :sswitch_7
        -0x56bb8814 -> :sswitch_6
        -0x4db3b2f1 -> :sswitch_5
        -0x3fc2dcd5 -> :sswitch_4
        -0x109cacb6 -> :sswitch_3
        0x154d491a -> :sswitch_2
        0x6c71418d -> :sswitch_1
        0x721a4adb -> :sswitch_0
    .end sparse-switch

    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
