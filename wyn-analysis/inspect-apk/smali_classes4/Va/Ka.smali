.class public final LVa/Ka;
.super LVa/Ba;
.source "SourceFile"


# instance fields
.field public synthetic c:I

.field public synthetic d:LVa/y;


# virtual methods
.method public final c()V
    .locals 10

    .line 1
    iget-object v0, p0, LVa/Ka;->d:LVa/y;

    .line 2
    .line 3
    iget-object v0, v0, LVa/y;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LVa/r;

    .line 6
    .line 7
    sget v1, LVa/x;->s:I

    .line 8
    .line 9
    add-int/lit8 v1, v1, 0x4f

    .line 10
    .line 11
    rem-int/lit16 v2, v1, 0x80

    .line 12
    .line 13
    sput v2, LVa/x;->r:I

    .line 14
    .line 15
    rem-int/lit8 v1, v1, 0x2

    .line 16
    .line 17
    iget v2, p0, LVa/Ka;->c:I

    .line 18
    .line 19
    iget-object v0, v0, LVa/r;->a:LVa/x;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, v2}, LVa/x;->z(I)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/16 v2, 0x61

    .line 29
    .line 30
    div-int/2addr v2, v3

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v0, v2}, LVa/x;->z(I)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    :goto_0
    sget v2, LVa/x;->r:I

    .line 37
    .line 38
    add-int/lit8 v4, v2, 0x2b

    .line 39
    .line 40
    rem-int/lit16 v5, v4, 0x80

    .line 41
    .line 42
    sput v5, LVa/x;->s:I

    .line 43
    .line 44
    rem-int/lit8 v4, v4, 0x2

    .line 45
    .line 46
    if-nez v4, :cond_1

    .line 47
    .line 48
    const/16 v4, 0x1f

    .line 49
    .line 50
    div-int/2addr v4, v3

    .line 51
    :cond_1
    if-eqz v1, :cond_2

    .line 52
    .line 53
    move v1, v3

    .line 54
    goto/16 :goto_4

    .line 55
    .line 56
    :cond_2
    add-int/lit8 v2, v2, 0x65

    .line 57
    .line 58
    rem-int/lit16 v2, v2, 0x80

    .line 59
    .line 60
    sput v2, LVa/x;->s:I

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    sget v1, LVa/x;->s:I

    .line 66
    .line 67
    add-int/lit8 v1, v1, 0x27

    .line 68
    .line 69
    rem-int/lit16 v1, v1, 0x80

    .line 70
    .line 71
    sput v1, LVa/x;->r:I

    .line 72
    .line 73
    invoke-virtual {v0}, LVa/x;->c()LVa/D;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    if-eqz v1, :cond_4

    .line 78
    .line 79
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v1}, LVa/G;->P()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_4

    .line 88
    .line 89
    sget v1, LVa/x;->r:I

    .line 90
    .line 91
    add-int/lit8 v1, v1, 0x51

    .line 92
    .line 93
    rem-int/lit16 v1, v1, 0x80

    .line 94
    .line 95
    sput v1, LVa/x;->s:I

    .line 96
    .line 97
    invoke-virtual {v0}, LVa/x;->c()LVa/D;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    sget v2, LVa/D;->i:I

    .line 105
    .line 106
    add-int/lit8 v2, v2, 0x6d

    .line 107
    .line 108
    rem-int/lit16 v4, v2, 0x80

    .line 109
    .line 110
    sput v4, LVa/D;->j:I

    .line 111
    .line 112
    rem-int/lit8 v2, v2, 0x2

    .line 113
    .line 114
    iget v4, v1, LVa/D;->g:I

    .line 115
    .line 116
    const v5, 0x2f37e630

    .line 117
    .line 118
    .line 119
    const-string v6, "\uebfa\u5564\uade7"

    .line 120
    .line 121
    const-string v7, "\u305f\u37e6\u932f\ud783"

    .line 122
    .line 123
    const v8, 0x8393

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    if-nez v2, :cond_3

    .line 131
    .line 132
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    shl-int/lit8 v2, v2, 0x3c

    .line 137
    .line 138
    mul-int/2addr v2, v8

    .line 139
    int-to-char v2, v2

    .line 140
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    const/high16 v9, 0x3f800000    # 1.0f

    .line 145
    .line 146
    cmpl-float v8, v8, v9

    .line 147
    .line 148
    shr-int/2addr v5, v8

    .line 149
    invoke-static {v2, v7, v6, v5}, LVa/D;->u(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    :goto_1
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    goto :goto_2

    .line 162
    :cond_3
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    shr-int/lit8 v2, v2, 0x10

    .line 167
    .line 168
    sub-int/2addr v8, v2

    .line 169
    int-to-char v2, v8

    .line 170
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    const/4 v9, 0x0

    .line 175
    cmpl-float v8, v8, v9

    .line 176
    .line 177
    add-int/2addr v8, v5

    .line 178
    invoke-static {v2, v7, v6, v8}, LVa/D;->u(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    goto :goto_1

    .line 183
    :goto_2
    sget v2, LVa/D;->j:I

    .line 184
    .line 185
    add-int/lit8 v2, v2, 0x27

    .line 186
    .line 187
    rem-int/lit16 v2, v2, 0x80

    .line 188
    .line 189
    sput v2, LVa/D;->i:I

    .line 190
    .line 191
    sget v2, LVa/x;->s:I

    .line 192
    .line 193
    add-int/lit8 v2, v2, 0x9

    .line 194
    .line 195
    rem-int/lit16 v2, v2, 0x80

    .line 196
    .line 197
    sput v2, LVa/x;->r:I

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_4
    const/16 v1, 0x64

    .line 201
    .line 202
    :goto_3
    sget v2, LVa/x;->s:I

    .line 203
    .line 204
    add-int/lit8 v2, v2, 0x2f

    .line 205
    .line 206
    rem-int/lit16 v4, v2, 0x80

    .line 207
    .line 208
    sput v4, LVa/x;->r:I

    .line 209
    .line 210
    rem-int/lit8 v2, v2, 0x2

    .line 211
    .line 212
    if-nez v2, :cond_6

    .line 213
    .line 214
    :goto_4
    sget v2, LVa/x;->r:I

    .line 215
    .line 216
    add-int/lit8 v2, v2, 0x15

    .line 217
    .line 218
    rem-int/lit16 v2, v2, 0x80

    .line 219
    .line 220
    sput v2, LVa/x;->s:I

    .line 221
    .line 222
    invoke-virtual {v0, v1}, LVa/x;->C(I)V

    .line 223
    .line 224
    .line 225
    sget v0, LVa/x;->s:I

    .line 226
    .line 227
    add-int/lit8 v0, v0, 0x2b

    .line 228
    .line 229
    rem-int/lit16 v1, v0, 0x80

    .line 230
    .line 231
    sput v1, LVa/x;->r:I

    .line 232
    .line 233
    rem-int/lit8 v0, v0, 0x2

    .line 234
    .line 235
    if-eqz v0, :cond_5

    .line 236
    .line 237
    const/16 v0, 0x36

    .line 238
    .line 239
    div-int/2addr v0, v3

    .line 240
    :cond_5
    return-void

    .line 241
    :cond_6
    const/4 v0, 0x0

    .line 242
    throw v0
.end method
