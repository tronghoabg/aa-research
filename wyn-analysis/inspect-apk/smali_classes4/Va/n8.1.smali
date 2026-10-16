.class public final LVa/n8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/p8;


# static fields
.field public static c:I = 0x0

.field public static d:I = 0x1


# instance fields
.field public final synthetic a:I

.field public synthetic b:LVa/q8;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LVa/n8;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, LVa/n8;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget v0, LVa/n8;->d:I

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x73

    .line 9
    .line 10
    rem-int/lit16 v1, v0, 0x80

    .line 11
    .line 12
    sput v1, LVa/n8;->c:I

    .line 13
    .line 14
    rem-int/lit8 v0, v0, 0x2

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, p1}, LVa/n8;->b(Ljava/util/List;)LVa/y8;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_0
    invoke-virtual {p0, p1}, LVa/n8;->b(Ljava/util/List;)LVa/y8;

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    throw p1

    .line 28
    :pswitch_0
    sget v0, LVa/q8;->h:I

    .line 29
    .line 30
    add-int/lit8 v0, v0, 0x4b

    .line 31
    .line 32
    rem-int/lit16 v0, v0, 0x80

    .line 33
    .line 34
    sput v0, LVa/q8;->i:I

    .line 35
    .line 36
    iget-object v0, p0, LVa/n8;->b:LVa/q8;

    .line 37
    .line 38
    sget v1, LVa/q8;->h:I

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x4f

    .line 41
    .line 42
    rem-int/lit16 v2, v1, 0x80

    .line 43
    .line 44
    sput v2, LVa/q8;->i:I

    .line 45
    .line 46
    rem-int/lit8 v1, v1, 0x2

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    if-eqz v1, :cond_4

    .line 50
    .line 51
    invoke-virtual {v0, p1}, LVa/q8;->b(Ljava/util/List;)LVa/v8;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, LVa/v8;->g()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    const/4 v4, 0x0

    .line 60
    if-eqz v3, :cond_3

    .line 61
    .line 62
    invoke-virtual {v1}, LVa/v8;->f()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    const/4 v5, 0x0

    .line 71
    cmpl-float v3, v3, v5

    .line 72
    .line 73
    const v6, 0xa868

    .line 74
    .line 75
    .line 76
    add-int/2addr v3, v6

    .line 77
    int-to-char v3, v3

    .line 78
    invoke-static {v4, v5, v5}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    cmpl-float v5, v6, v5

    .line 83
    .line 84
    rsub-int v5, v5, 0x41f

    .line 85
    .line 86
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    shr-int/lit8 v6, v6, 0x10

    .line 91
    .line 92
    rsub-int/lit8 v6, v6, 0x1

    .line 93
    .line 94
    invoke-static {v5, v6, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-static {v4, v4}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    int-to-char v5, v5

    .line 107
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    shr-int/lit8 v6, v6, 0x10

    .line 112
    .line 113
    add-int/lit16 v6, v6, 0x420

    .line 114
    .line 115
    invoke-static {v4}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 116
    .line 117
    .line 118
    move-result-wide v7

    .line 119
    const-wide/16 v9, 0x0

    .line 120
    .line 121
    cmp-long v4, v7, v9

    .line 122
    .line 123
    rsub-int/lit8 v4, v4, 0x30

    .line 124
    .line 125
    invoke-static {v6, v4, v5}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-virtual {v0, p1, v3, v1, v4}, LVa/q8;->n(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    new-instance v3, Landroid/util/Pair;

    .line 137
    .line 138
    invoke-virtual {v0, p1}, LVa/q8;->s(Ljava/util/List;)LVa/y8;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-direct {v3, v1, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    sget p1, LVa/q8;->h:I

    .line 146
    .line 147
    add-int/lit8 p1, p1, 0x7b

    .line 148
    .line 149
    rem-int/lit16 v0, p1, 0x80

    .line 150
    .line 151
    sput v0, LVa/q8;->i:I

    .line 152
    .line 153
    rem-int/lit8 p1, p1, 0x2

    .line 154
    .line 155
    if-eqz p1, :cond_2

    .line 156
    .line 157
    add-int/lit8 v0, v0, 0x43

    .line 158
    .line 159
    rem-int/lit16 p1, v0, 0x80

    .line 160
    .line 161
    sput p1, LVa/q8;->h:I

    .line 162
    .line 163
    rem-int/lit8 v0, v0, 0x2

    .line 164
    .line 165
    if-nez v0, :cond_1

    .line 166
    .line 167
    return-object v3

    .line 168
    :cond_1
    throw v2

    .line 169
    :cond_2
    throw v2

    .line 170
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 173
    .line 174
    .line 175
    const-string v3, ""

    .line 176
    .line 177
    invoke-static {v3, v4}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    const v4, 0xae7e

    .line 182
    .line 183
    .line 184
    sub-int/2addr v4, v3

    .line 185
    int-to-char v3, v4

    .line 186
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    shr-int/lit8 v4, v4, 0x10

    .line 191
    .line 192
    add-int/lit16 v4, v4, 0x407

    .line 193
    .line 194
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    shr-int/lit8 v5, v5, 0x8

    .line 199
    .line 200
    add-int/lit8 v5, v5, 0x18

    .line 201
    .line 202
    invoke-static {v4, v5, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-virtual {v0, p1, v2}, LVa/q8;->r(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 221
    .line 222
    .line 223
    throw v2

    .line 224
    :cond_4
    invoke-virtual {v0, p1}, LVa/q8;->b(Ljava/util/List;)LVa/v8;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-virtual {p1}, LVa/v8;->g()Z

    .line 229
    .line 230
    .line 231
    throw v2

    .line 232
    nop

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ljava/util/List;)LVa/y8;
    .locals 12

    .line 1
    iget-object v0, p0, LVa/n8;->b:LVa/q8;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LVa/q8;->s(Ljava/util/List;)LVa/y8;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    instance-of v0, p1, LVa/J8;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eq v0, v1, :cond_4

    .line 12
    .line 13
    instance-of v0, p1, LVa/C8;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_3

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, LVa/n8;->b:LVa/q8;

    .line 20
    .line 21
    new-instance v3, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    shr-int/lit8 v4, v4, 0x10

    .line 31
    .line 32
    rsub-int/lit8 v4, v4, 0x1f

    .line 33
    .line 34
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    const/4 v6, 0x0

    .line 39
    cmpl-float v5, v5, v6

    .line 40
    .line 41
    rsub-int/lit8 v5, v5, 0x66

    .line 42
    .line 43
    const-string v6, "\uffc1\u0005\u0006\u0017\n\u0006\u0004\u0006\u0013\uffc1\u0015\u0016\u0003\uffc1\u0006\r\u0003\u0002\n\u0013\u0002\u0017\uffc1\u0005\u0006\u0015\u0004\u0006\u0011\u0019\uffe6"

    .line 44
    .line 45
    const-string v7, ""

    .line 46
    .line 47
    const/16 v8, 0x30

    .line 48
    .line 49
    invoke-static {v7, v8, v2, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    add-int/lit8 v7, v7, 0x20

    .line 54
    .line 55
    invoke-virtual {v6}, Ljava/lang/String;->toCharArray()[C

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    sget-object v8, LVa/Ab;->x:Ljava/lang/Object;

    .line 60
    .line 61
    monitor-enter v8

    .line 62
    :try_start_0
    new-array v9, v4, [C

    .line 63
    .line 64
    sput v2, LVa/Ab;->v:I

    .line 65
    .line 66
    :goto_0
    sget v10, LVa/Ab;->v:I

    .line 67
    .line 68
    if-ge v10, v4, :cond_1

    .line 69
    .line 70
    aget-char v11, v6, v10

    .line 71
    .line 72
    add-int/2addr v11, v5

    .line 73
    int-to-char v11, v11

    .line 74
    aput-char v11, v9, v10

    .line 75
    .line 76
    add-int/lit8 v11, v11, -0x7

    .line 77
    .line 78
    int-to-char v11, v11

    .line 79
    aput-char v11, v9, v10

    .line 80
    .line 81
    add-int/lit8 v10, v10, 0x1

    .line 82
    .line 83
    sput v10, LVa/Ab;->v:I

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :catchall_0
    move-exception p1

    .line 87
    goto :goto_2

    .line 88
    :cond_1
    if-lez v7, :cond_2

    .line 89
    .line 90
    sput v7, LVa/Ab;->w:I

    .line 91
    .line 92
    new-array v5, v4, [C

    .line 93
    .line 94
    invoke-static {v9, v2, v5, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 95
    .line 96
    .line 97
    sget v6, LVa/Ab;->w:I

    .line 98
    .line 99
    sub-int v7, v4, v6

    .line 100
    .line 101
    invoke-static {v5, v2, v9, v7, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 102
    .line 103
    .line 104
    sget v6, LVa/Ab;->w:I

    .line 105
    .line 106
    sub-int v7, v4, v6

    .line 107
    .line 108
    invoke-static {v5, v6, v9, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 109
    .line 110
    .line 111
    :cond_2
    new-array v5, v4, [C

    .line 112
    .line 113
    sput v2, LVa/Ab;->v:I

    .line 114
    .line 115
    :goto_1
    sget v2, LVa/Ab;->v:I

    .line 116
    .line 117
    if-ge v2, v4, :cond_3

    .line 118
    .line 119
    sub-int v6, v4, v2

    .line 120
    .line 121
    sub-int/2addr v6, v1

    .line 122
    aget-char v6, v9, v6

    .line 123
    .line 124
    aput-char v6, v5, v2

    .line 125
    .line 126
    add-int/lit8 v2, v2, 0x1

    .line 127
    .line 128
    sput v2, LVa/Ab;->v:I

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_3
    new-instance v1, Ljava/lang/String;

    .line 132
    .line 133
    invoke-direct {v1, v5}, Ljava/lang/String;-><init>([C)V

    .line 134
    .line 135
    .line 136
    monitor-exit v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    sget v1, LVa/q8;->h:I

    .line 152
    .line 153
    add-int/lit8 v1, v1, 0x19

    .line 154
    .line 155
    rem-int/lit16 v1, v1, 0x80

    .line 156
    .line 157
    sput v1, LVa/q8;->i:I

    .line 158
    .line 159
    invoke-virtual {v0, p1}, LVa/q8;->q(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    const/4 p1, 0x0

    .line 163
    throw p1

    .line 164
    :goto_2
    monitor-exit v8

    .line 165
    throw p1

    .line 166
    :cond_4
    :goto_3
    sget v0, LVa/n8;->c:I

    .line 167
    .line 168
    add-int/lit8 v0, v0, 0x5b

    .line 169
    .line 170
    rem-int/lit16 v1, v0, 0x80

    .line 171
    .line 172
    sput v1, LVa/n8;->d:I

    .line 173
    .line 174
    rem-int/lit8 v0, v0, 0x2

    .line 175
    .line 176
    if-nez v0, :cond_5

    .line 177
    .line 178
    const/4 v0, 0x5

    .line 179
    div-int/2addr v0, v2

    .line 180
    :cond_5
    return-object p1
.end method
