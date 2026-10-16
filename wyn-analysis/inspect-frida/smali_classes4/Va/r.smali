.class public final LVa/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static b:I = 0x0

.field public static c:I = 0x1


# instance fields
.field public a:LVa/x;


# direct methods
.method public constructor <init>(LVa/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVa/r;->a:LVa/x;

    .line 5
    .line 6
    return-void
.end method

.method public static b(ILjava/lang/String;)Ljava/lang/String;
    .locals 6

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
    sget-object v0, LVa/a;->u:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    sput p0, LVa/a;->t:I

    .line 11
    .line 12
    array-length p0, p1

    .line 13
    new-array p0, p0, [C

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    sput v1, LVa/a;->s:I

    .line 17
    .line 18
    :goto_0
    sget v1, LVa/a;->s:I

    .line 19
    .line 20
    array-length v2, p1

    .line 21
    if-ge v1, v2, :cond_0

    .line 22
    .line 23
    aget-char v2, p1, v1

    .line 24
    .line 25
    sget v3, LVa/a;->t:I

    .line 26
    .line 27
    mul-int/2addr v3, v1

    .line 28
    xor-int/2addr v2, v3

    .line 29
    int-to-long v2, v2

    .line 30
    const-wide v4, 0x7d591fa320206129L    # 6.418260398974092E295

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    xor-long/2addr v2, v4

    .line 36
    long-to-int v2, v2

    .line 37
    int-to-char v2, v2

    .line 38
    aput-char v2, p0, v1

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    sput v1, LVa/a;->s:I

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    new-instance p1, Ljava/lang/String;

    .line 48
    .line 49
    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    .line 50
    .line 51
    .line 52
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    return-object p1

    .line 54
    :goto_1
    monitor-exit v0

    .line 55
    throw p0
.end method

.method public static c(Lcom/ironsource/adqualitysdk/sdk/ISAdQualitySegment;)Lorg/json/JSONObject;
    .locals 10

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualitySegment;->getCustomData()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualitySegment;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const-wide/16 v2, 0x0

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    const-string v1, "\u615a\u22c5\ue651\uabe5"

    .line 23
    .line 24
    invoke-static {v2, v3}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    add-int/lit16 v4, v4, 0x438b

    .line 29
    .line 30
    invoke-static {v4, v1}, LVa/r;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualitySegment;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualitySegment;->getAge()I

    .line 46
    .line 47
    .line 48
    move-result v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    const/4 v4, -0x1

    .line 50
    const/4 v5, 0x0

    .line 51
    if-eq v1, v4, :cond_2

    .line 52
    .line 53
    sget v1, LVa/r;->b:I

    .line 54
    .line 55
    add-int/lit8 v1, v1, 0x47

    .line 56
    .line 57
    rem-int/lit16 v6, v1, 0x80

    .line 58
    .line 59
    sput v6, LVa/r;->c:I

    .line 60
    .line 61
    rem-int/lit8 v1, v1, 0x2

    .line 62
    .line 63
    const-string v6, "\u615a\u38d1\ud27c\u6d87"

    .line 64
    .line 65
    if-nez v1, :cond_1

    .line 66
    .line 67
    const/4 v1, 0x1

    .line 68
    :try_start_1
    invoke-static {v1}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    add-int/lit16 v1, v1, 0x3b5a

    .line 73
    .line 74
    invoke-static {v1, v6}, LVa/r;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    :goto_0
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualitySegment;->getAge()I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    invoke-virtual {v0, v1, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    invoke-static {v5}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    rsub-int v1, v1, 0x5999

    .line 95
    .line 96
    invoke-static {v1, v6}, LVa/r;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    goto :goto_0

    .line 105
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualitySegment;->getGender()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 110
    .line 111
    .line 112
    move-result v1
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 113
    if-eqz v1, :cond_3

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_3
    sget v1, LVa/r;->b:I

    .line 117
    .line 118
    add-int/lit8 v1, v1, 0x4f

    .line 119
    .line 120
    rem-int/lit16 v6, v1, 0x80

    .line 121
    .line 122
    sput v6, LVa/r;->c:I

    .line 123
    .line 124
    rem-int/lit8 v1, v1, 0x2

    .line 125
    .line 126
    const-string v6, "\u615a\u2017\ue3fe\ua54c"

    .line 127
    .line 128
    if-nez v1, :cond_4

    .line 129
    .line 130
    :try_start_2
    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    add-int/lit16 v1, v1, 0x2f7f

    .line 135
    .line 136
    invoke-static {v1, v6}, LVa/r;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    :goto_2
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualitySegment;->getGender()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    invoke-virtual {v0, v1, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_4
    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    rsub-int v1, v1, 0x4159

    .line 157
    .line 158
    invoke-static {v1, v6}, LVa/r;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    goto :goto_2

    .line 167
    :goto_3
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualitySegment;->getLevel()I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-eq v1, v4, :cond_5

    .line 172
    .line 173
    const-string v1, "\u615a\u924e\u8749\ub864"

    .line 174
    .line 175
    invoke-static {v5}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    const v6, 0xf30b

    .line 180
    .line 181
    .line 182
    sub-int/2addr v6, v4

    .line 183
    invoke-static {v6, v1}, LVa/r;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualitySegment;->getLevel()I

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 196
    .line 197
    .line 198
    :cond_5
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualitySegment;->getIsPaying()Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    if-eqz v1, :cond_6

    .line 203
    .line 204
    const-string v1, "\u615a\ud22e\u07a6\u7b35"

    .line 205
    .line 206
    invoke-static {v5}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    const v6, 0xb378

    .line 211
    .line 212
    .line 213
    add-int/2addr v4, v6

    .line 214
    invoke-static {v4, v1}, LVa/r;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualitySegment;->getIsPaying()Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 231
    .line 232
    .line 233
    :cond_6
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualitySegment;->getInAppPurchasesTotal()D

    .line 234
    .line 235
    .line 236
    move-result-wide v6

    .line 237
    const-wide/high16 v8, -0x4010000000000000L    # -1.0

    .line 238
    .line 239
    cmpl-double v1, v6, v8

    .line 240
    .line 241
    if-eqz v1, :cond_7

    .line 242
    .line 243
    const-string v1, "\u615a\uaa31\uf7aa\u030a\u4c99"

    .line 244
    .line 245
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 246
    .line 247
    .line 248
    move-result-wide v6

    .line 249
    cmp-long v4, v6, v2

    .line 250
    .line 251
    const v6, 0xcb70

    .line 252
    .line 253
    .line 254
    add-int/2addr v4, v6

    .line 255
    invoke-static {v4, v1}, LVa/r;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualitySegment;->getInAppPurchasesTotal()D

    .line 264
    .line 265
    .line 266
    move-result-wide v6

    .line 267
    invoke-virtual {v0, v1, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 268
    .line 269
    .line 270
    :cond_7
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualitySegment;->getUserCreationDate()J

    .line 271
    .line 272
    .line 273
    move-result-wide v6
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 274
    cmp-long v1, v6, v2

    .line 275
    .line 276
    if-eqz v1, :cond_8

    .line 277
    .line 278
    sget v1, LVa/r;->c:I

    .line 279
    .line 280
    add-int/lit8 v1, v1, 0x2d

    .line 281
    .line 282
    rem-int/lit16 v1, v1, 0x80

    .line 283
    .line 284
    sput v1, LVa/r;->b:I

    .line 285
    .line 286
    :try_start_3
    const-string v1, "\u615a\u98e5\u9238\u8c66"

    .line 287
    .line 288
    invoke-static {v5}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    const v3, 0xf9ba

    .line 293
    .line 294
    .line 295
    add-int/2addr v2, v3

    .line 296
    invoke-static {v2, v1}, LVa/r;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    invoke-virtual {p0}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualitySegment;->getUserCreationDate()J

    .line 305
    .line 306
    .line 307
    move-result-wide v2

    .line 308
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    .line 309
    .line 310
    .line 311
    :catch_0
    :cond_8
    return-object v0
.end method


# virtual methods
.method public a(Lcom/ironsource/adqualitysdk/sdk/ISAdQualitySegment;)V
    .locals 7

    .line 1
    sget v0, LVa/r;->b:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x77

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/r;->c:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const-wide/16 v1, -0x1

    .line 12
    .line 13
    const-string v3, "\u615a\u63ed\u641f\u6695\u6bde\u6c69\u6e88\u7323\u7444\u76ee\u7b17"

    .line 14
    .line 15
    iget-object v4, p0, LVa/r;->a:LVa/x;

    .line 16
    .line 17
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v5

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    cmp-long v0, v5, v1

    .line 24
    .line 25
    add-int/lit16 v0, v0, 0x7ac1

    .line 26
    .line 27
    :goto_0
    invoke-static {v0, v3}, LVa/r;->b(ILjava/lang/String;)Ljava/lang/String;

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
    invoke-static {p1}, LVa/r;->c(Lcom/ironsource/adqualitysdk/sdk/ISAdQualitySegment;)Lorg/json/JSONObject;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {v4, v0, p1}, LVa/x;->x(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    cmp-long v0, v5, v1

    .line 44
    .line 45
    rsub-int v0, v0, 0x2a2

    .line 46
    .line 47
    goto :goto_0
.end method
