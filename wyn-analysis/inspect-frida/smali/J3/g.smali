.class public final LJ3/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p1, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, LJ3/g;->a:Ljava/util/HashMap;

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance p1, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, LJ3/g;->a:Ljava/util/HashMap;

    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public static h(La9/b;Lt6/q;Landroid/app/Activity;Lmd/J;I)LJ3/g;
    .locals 7

    .line 1
    new-instance v0, LJ3/g;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LJ3/g;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance p0, LAc/a;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {p0, p1, v1}, LAc/a;-><init>(Lt6/q;Z)V

    .line 14
    .line 15
    .line 16
    iget-object v2, v0, LJ3/g;->a:Ljava/util/HashMap;

    .line 17
    .line 18
    const-string v3, "AUTO_FOCUS"

    .line 19
    .line 20
    invoke-virtual {v2, v3, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    new-instance p0, LBc/a;

    .line 24
    .line 25
    invoke-direct {p0, p1}, Lzc/a;-><init>(Lt6/q;)V

    .line 26
    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    iput v3, p0, LBc/a;->b:I

    .line 30
    .line 31
    const-string v4, "EXPOSURE_LOCK"

    .line 32
    .line 33
    invoke-virtual {v2, v4, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    new-instance p0, LCc/a;

    .line 37
    .line 38
    invoke-direct {p0, p1}, Lzc/a;-><init>(Lt6/q;)V

    .line 39
    .line 40
    .line 41
    const-wide/16 v4, 0x0

    .line 42
    .line 43
    iput-wide v4, p0, LCc/a;->b:D

    .line 44
    .line 45
    const-string v4, "EXPOSURE_OFFSET"

    .line 46
    .line 47
    invoke-virtual {v2, v4, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    new-instance p0, LJc/b;

    .line 51
    .line 52
    invoke-direct {p0, p1, p2, p3}, LJc/b;-><init>(Lt6/q;Landroid/app/Activity;Lmd/J;)V

    .line 53
    .line 54
    .line 55
    const-string p2, "SENSOR_ORIENTATION"

    .line 56
    .line 57
    invoke-virtual {v2, p2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    new-instance p2, LDc/a;

    .line 61
    .line 62
    invoke-direct {p2, p1, p0}, LDc/a;-><init>(Lt6/q;LJc/b;)V

    .line 63
    .line 64
    .line 65
    const-string p3, "EXPOSURE_POINT"

    .line 66
    .line 67
    invoke-virtual {v2, p3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    new-instance p2, LEc/a;

    .line 71
    .line 72
    invoke-direct {p2, p1}, Lzc/a;-><init>(Lt6/q;)V

    .line 73
    .line 74
    .line 75
    const/4 p3, 0x2

    .line 76
    iput p3, p2, LEc/a;->b:I

    .line 77
    .line 78
    const-string v4, "FLASH"

    .line 79
    .line 80
    invoke-virtual {v2, v4, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    new-instance p2, LFc/a;

    .line 84
    .line 85
    invoke-direct {p2, p1, p0}, LFc/a;-><init>(Lt6/q;LJc/b;)V

    .line 86
    .line 87
    .line 88
    const-string p0, "FOCUS_POINT"

    .line 89
    .line 90
    invoke-virtual {v2, p0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    new-instance p0, LGc/a;

    .line 94
    .line 95
    invoke-direct {p0, p1}, LGc/a;-><init>(Lt6/q;)V

    .line 96
    .line 97
    .line 98
    const-string p2, "FPS_RANGE"

    .line 99
    .line 100
    invoke-virtual {v2, p2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    new-instance p0, LHc/a;

    .line 104
    .line 105
    invoke-direct {p0, p1}, LHc/a;-><init>(Lt6/q;)V

    .line 106
    .line 107
    .line 108
    const-string p2, "NOISE_REDUCTION"

    .line 109
    .line 110
    invoke-virtual {v2, p2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    iget-object p0, p1, Lt6/q;->b:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p0, Ljava/lang/String;

    .line 116
    .line 117
    new-instance p2, LIc/a;

    .line 118
    .line 119
    invoke-direct {p2, p1}, Lzc/a;-><init>(Lt6/q;)V

    .line 120
    .line 121
    .line 122
    const/16 v4, 0xa

    .line 123
    .line 124
    :try_start_0
    invoke-static {p0, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    iput p0, p2, LIc/a;->f:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 129
    .line 130
    if-ltz p0, :cond_4

    .line 131
    .line 132
    sget v4, Lyc/E;->a:I

    .line 133
    .line 134
    const/16 v5, 0x1f

    .line 135
    .line 136
    if-lt v4, v5, :cond_0

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_0
    move v3, v1

    .line 140
    :goto_0
    const/4 v4, 0x0

    .line 141
    if-eqz v3, :cond_1

    .line 142
    .line 143
    iput-object v4, p2, LIc/a;->d:Landroid/media/CamcorderProfile;

    .line 144
    .line 145
    invoke-static {p0, p4}, LIc/a;->b(II)Landroid/media/EncoderProfiles;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    iput-object v3, p2, LIc/a;->e:Landroid/media/EncoderProfiles;

    .line 150
    .line 151
    invoke-static {v3}, Le1/c;->m(Landroid/media/EncoderProfiles;)Ljava/util/List;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    invoke-static {v3}, Le1/c;->e(Ljava/lang/Object;)Landroid/media/EncoderProfiles$VideoProfile;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    if-eqz v3, :cond_1

    .line 164
    .line 165
    new-instance v4, Landroid/util/Size;

    .line 166
    .line 167
    invoke-static {v3}, LF5/i;->b(Landroid/media/EncoderProfiles$VideoProfile;)I

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    invoke-static {v3}, LF5/i;->s(Landroid/media/EncoderProfiles$VideoProfile;)I

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    invoke-direct {v4, v6, v3}, Landroid/util/Size;-><init>(II)V

    .line 176
    .line 177
    .line 178
    iput-object v4, p2, LIc/a;->b:Landroid/util/Size;

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_1
    iput-object v4, p2, LIc/a;->e:Landroid/media/EncoderProfiles;

    .line 182
    .line 183
    invoke-static {p0, p4}, LIc/a;->c(II)Landroid/media/CamcorderProfile;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    iput-object v3, p2, LIc/a;->d:Landroid/media/CamcorderProfile;

    .line 188
    .line 189
    new-instance v3, Landroid/util/Size;

    .line 190
    .line 191
    iget-object v4, p2, LIc/a;->d:Landroid/media/CamcorderProfile;

    .line 192
    .line 193
    iget v6, v4, Landroid/media/CamcorderProfile;->videoFrameWidth:I

    .line 194
    .line 195
    iget v4, v4, Landroid/media/CamcorderProfile;->videoFrameHeight:I

    .line 196
    .line 197
    invoke-direct {v3, v6, v4}, Landroid/util/Size;-><init>(II)V

    .line 198
    .line 199
    .line 200
    iput-object v3, p2, LIc/a;->b:Landroid/util/Size;

    .line 201
    .line 202
    :goto_1
    invoke-static {p4}, LA/f;->f(I)I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-le v3, p3, :cond_2

    .line 207
    .line 208
    const/4 p4, 0x3

    .line 209
    :cond_2
    sget p3, Lyc/E;->a:I

    .line 210
    .line 211
    if-lt p3, v5, :cond_3

    .line 212
    .line 213
    invoke-static {p0, p4}, LIc/a;->b(II)Landroid/media/EncoderProfiles;

    .line 214
    .line 215
    .line 216
    move-result-object p3

    .line 217
    invoke-static {p3}, Le1/c;->m(Landroid/media/EncoderProfiles;)Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object p3

    .line 221
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p3

    .line 225
    invoke-static {p3}, Le1/c;->e(Ljava/lang/Object;)Landroid/media/EncoderProfiles$VideoProfile;

    .line 226
    .line 227
    .line 228
    move-result-object p3

    .line 229
    if-eqz p3, :cond_3

    .line 230
    .line 231
    new-instance p0, Landroid/util/Size;

    .line 232
    .line 233
    invoke-static {p3}, LF5/i;->b(Landroid/media/EncoderProfiles$VideoProfile;)I

    .line 234
    .line 235
    .line 236
    move-result p4

    .line 237
    invoke-static {p3}, LF5/i;->s(Landroid/media/EncoderProfiles$VideoProfile;)I

    .line 238
    .line 239
    .line 240
    move-result p3

    .line 241
    invoke-direct {p0, p4, p3}, Landroid/util/Size;-><init>(II)V

    .line 242
    .line 243
    .line 244
    goto :goto_2

    .line 245
    :cond_3
    invoke-static {p0, p4}, LIc/a;->c(II)Landroid/media/CamcorderProfile;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    new-instance p3, Landroid/util/Size;

    .line 250
    .line 251
    iget p4, p0, Landroid/media/CamcorderProfile;->videoFrameWidth:I

    .line 252
    .line 253
    iget p0, p0, Landroid/media/CamcorderProfile;->videoFrameHeight:I

    .line 254
    .line 255
    invoke-direct {p3, p4, p0}, Landroid/util/Size;-><init>(II)V

    .line 256
    .line 257
    .line 258
    move-object p0, p3

    .line 259
    :goto_2
    iput-object p0, p2, LIc/a;->c:Landroid/util/Size;

    .line 260
    .line 261
    goto :goto_3

    .line 262
    :catch_0
    const/4 p0, -0x1

    .line 263
    iput p0, p2, LIc/a;->f:I

    .line 264
    .line 265
    :cond_4
    :goto_3
    const-string p0, "RESOLUTION"

    .line 266
    .line 267
    invoke-virtual {v2, p0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    new-instance p0, LKc/a;

    .line 271
    .line 272
    invoke-direct {p0, p1}, LKc/a;-><init>(Lt6/q;)V

    .line 273
    .line 274
    .line 275
    const-string p1, "ZOOM_LEVEL"

    .line 276
    .line 277
    invoke-virtual {v2, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    return-object v0
.end method


# virtual methods
.method public a()LJ3/h;
    .locals 2

    .line 1
    new-instance v0, LJ3/h;

    .line 2
    .line 3
    iget-object v1, p0, LJ3/g;->a:Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LJ3/h;-><init>(Ljava/util/HashMap;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, LJ3/h;->c(LJ3/h;)[B

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public b()LCc/a;
    .locals 2

    .line 1
    iget-object v0, p0, LJ3/g;->a:Ljava/util/HashMap;

    .line 2
    .line 3
    const-string v1, "EXPOSURE_OFFSET"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lzc/a;

    .line 10
    .line 11
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    check-cast v0, LCc/a;

    .line 15
    .line 16
    return-object v0
.end method

.method public c()LDc/a;
    .locals 2

    .line 1
    iget-object v0, p0, LJ3/g;->a:Ljava/util/HashMap;

    .line 2
    .line 3
    const-string v1, "EXPOSURE_POINT"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lzc/a;

    .line 10
    .line 11
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    check-cast v0, LDc/a;

    .line 15
    .line 16
    return-object v0
.end method

.method public d()LFc/a;
    .locals 2

    .line 1
    iget-object v0, p0, LJ3/g;->a:Ljava/util/HashMap;

    .line 2
    .line 3
    const-string v1, "FOCUS_POINT"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lzc/a;

    .line 10
    .line 11
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    check-cast v0, LFc/a;

    .line 15
    .line 16
    return-object v0
.end method

.method public e()LIc/a;
    .locals 2

    .line 1
    iget-object v0, p0, LJ3/g;->a:Ljava/util/HashMap;

    .line 2
    .line 3
    const-string v1, "RESOLUTION"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lzc/a;

    .line 10
    .line 11
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    check-cast v0, LIc/a;

    .line 15
    .line 16
    return-object v0
.end method

.method public f()LJc/b;
    .locals 2

    .line 1
    iget-object v0, p0, LJ3/g;->a:Ljava/util/HashMap;

    .line 2
    .line 3
    const-string v1, "SENSOR_ORIENTATION"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lzc/a;

    .line 10
    .line 11
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    check-cast v0, LJc/b;

    .line 15
    .line 16
    return-object v0
.end method

.method public g()LKc/a;
    .locals 2

    .line 1
    iget-object v0, p0, LJ3/g;->a:Ljava/util/HashMap;

    .line 2
    .line 3
    const-string v1, "ZOOM_LEVEL"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lzc/a;

    .line 10
    .line 11
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    check-cast v0, LKc/a;

    .line 15
    .line 16
    return-object v0
.end method

.method public i(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 6

    .line 1
    iget-object v0, p0, LJ3/g;->a:Ljava/util/HashMap;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-class v2, Ljava/lang/Boolean;

    .line 15
    .line 16
    if-eq v1, v2, :cond_e

    .line 17
    .line 18
    const-class v2, Ljava/lang/Byte;

    .line 19
    .line 20
    if-eq v1, v2, :cond_e

    .line 21
    .line 22
    const-class v2, Ljava/lang/Integer;

    .line 23
    .line 24
    if-eq v1, v2, :cond_e

    .line 25
    .line 26
    const-class v2, Ljava/lang/Long;

    .line 27
    .line 28
    if-eq v1, v2, :cond_e

    .line 29
    .line 30
    const-class v2, Ljava/lang/Float;

    .line 31
    .line 32
    if-eq v1, v2, :cond_e

    .line 33
    .line 34
    const-class v2, Ljava/lang/Double;

    .line 35
    .line 36
    if-eq v1, v2, :cond_e

    .line 37
    .line 38
    const-class v2, Ljava/lang/String;

    .line 39
    .line 40
    if-eq v1, v2, :cond_e

    .line 41
    .line 42
    const-class v2, [Ljava/lang/Boolean;

    .line 43
    .line 44
    if-eq v1, v2, :cond_e

    .line 45
    .line 46
    const-class v2, [Ljava/lang/Byte;

    .line 47
    .line 48
    if-eq v1, v2, :cond_e

    .line 49
    .line 50
    const-class v2, [Ljava/lang/Integer;

    .line 51
    .line 52
    if-eq v1, v2, :cond_e

    .line 53
    .line 54
    const-class v2, [Ljava/lang/Long;

    .line 55
    .line 56
    if-eq v1, v2, :cond_e

    .line 57
    .line 58
    const-class v2, [Ljava/lang/Float;

    .line 59
    .line 60
    if-eq v1, v2, :cond_e

    .line 61
    .line 62
    const-class v2, [Ljava/lang/Double;

    .line 63
    .line 64
    if-eq v1, v2, :cond_e

    .line 65
    .line 66
    const-class v2, [Ljava/lang/String;

    .line 67
    .line 68
    if-ne v1, v2, :cond_1

    .line 69
    .line 70
    goto/16 :goto_6

    .line 71
    .line 72
    :cond_1
    const-class v2, [Z

    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    if-ne v1, v2, :cond_3

    .line 76
    .line 77
    check-cast p1, [Z

    .line 78
    .line 79
    sget-object v1, LJ3/h;->b:Ljava/lang/String;

    .line 80
    .line 81
    array-length v1, p1

    .line 82
    new-array v1, v1, [Ljava/lang/Boolean;

    .line 83
    .line 84
    :goto_0
    array-length v2, p1

    .line 85
    if-ge v3, v2, :cond_2

    .line 86
    .line 87
    aget-boolean v2, p1, v3

    .line 88
    .line 89
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    aput-object v2, v1, v3

    .line 94
    .line 95
    add-int/lit8 v3, v3, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_3
    const-class v2, [B

    .line 103
    .line 104
    if-ne v1, v2, :cond_5

    .line 105
    .line 106
    check-cast p1, [B

    .line 107
    .line 108
    sget-object v1, LJ3/h;->b:Ljava/lang/String;

    .line 109
    .line 110
    array-length v1, p1

    .line 111
    new-array v1, v1, [Ljava/lang/Byte;

    .line 112
    .line 113
    :goto_1
    array-length v2, p1

    .line 114
    if-ge v3, v2, :cond_4

    .line 115
    .line 116
    aget-byte v2, p1, v3

    .line 117
    .line 118
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    aput-object v2, v1, v3

    .line 123
    .line 124
    add-int/lit8 v3, v3, 0x1

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_4
    invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_5
    const-class v2, [I

    .line 132
    .line 133
    if-ne v1, v2, :cond_7

    .line 134
    .line 135
    check-cast p1, [I

    .line 136
    .line 137
    sget-object v1, LJ3/h;->b:Ljava/lang/String;

    .line 138
    .line 139
    array-length v1, p1

    .line 140
    new-array v1, v1, [Ljava/lang/Integer;

    .line 141
    .line 142
    :goto_2
    array-length v2, p1

    .line 143
    if-ge v3, v2, :cond_6

    .line 144
    .line 145
    aget v2, p1, v3

    .line 146
    .line 147
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    aput-object v2, v1, v3

    .line 152
    .line 153
    add-int/lit8 v3, v3, 0x1

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_6
    invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :cond_7
    const-class v2, [J

    .line 161
    .line 162
    if-ne v1, v2, :cond_9

    .line 163
    .line 164
    check-cast p1, [J

    .line 165
    .line 166
    sget-object v1, LJ3/h;->b:Ljava/lang/String;

    .line 167
    .line 168
    array-length v1, p1

    .line 169
    new-array v1, v1, [Ljava/lang/Long;

    .line 170
    .line 171
    :goto_3
    array-length v2, p1

    .line 172
    if-ge v3, v2, :cond_8

    .line 173
    .line 174
    aget-wide v4, p1, v3

    .line 175
    .line 176
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    aput-object v2, v1, v3

    .line 181
    .line 182
    add-int/lit8 v3, v3, 0x1

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_8
    invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :cond_9
    const-class v2, [F

    .line 190
    .line 191
    if-ne v1, v2, :cond_b

    .line 192
    .line 193
    check-cast p1, [F

    .line 194
    .line 195
    sget-object v1, LJ3/h;->b:Ljava/lang/String;

    .line 196
    .line 197
    array-length v1, p1

    .line 198
    new-array v1, v1, [Ljava/lang/Float;

    .line 199
    .line 200
    :goto_4
    array-length v2, p1

    .line 201
    if-ge v3, v2, :cond_a

    .line 202
    .line 203
    aget v2, p1, v3

    .line 204
    .line 205
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    aput-object v2, v1, v3

    .line 210
    .line 211
    add-int/lit8 v3, v3, 0x1

    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_a
    invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    :cond_b
    const-class v2, [D

    .line 219
    .line 220
    if-ne v1, v2, :cond_d

    .line 221
    .line 222
    check-cast p1, [D

    .line 223
    .line 224
    sget-object v1, LJ3/h;->b:Ljava/lang/String;

    .line 225
    .line 226
    array-length v1, p1

    .line 227
    new-array v1, v1, [Ljava/lang/Double;

    .line 228
    .line 229
    :goto_5
    array-length v2, p1

    .line 230
    if-ge v3, v2, :cond_c

    .line 231
    .line 232
    aget-wide v4, p1, v3

    .line 233
    .line 234
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    aput-object v2, v1, v3

    .line 239
    .line 240
    add-int/lit8 v3, v3, 0x1

    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_c
    invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 248
    .line 249
    new-instance v0, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    const-string v2, "Key "

    .line 252
    .line 253
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    const-string p2, "has invalid type "

    .line 260
    .line 261
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object p2

    .line 271
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    throw p1

    .line 275
    :cond_e
    :goto_6
    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    return-void
.end method

.method public j(Ljava/util/HashMap;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/util/Map$Entry;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/lang/String;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, v0, v1}, LJ3/g;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-void
.end method
