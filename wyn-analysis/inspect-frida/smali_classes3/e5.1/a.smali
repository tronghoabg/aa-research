.class public final Le5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/b;
.implements Luc/p;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0012\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u000fH\u0016J$\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0002J\u001c\u0010\u0016\u001a\u00020\r2\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u00182\u0008\u0008\u0001\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\r2\u0008\u0008\u0001\u0010\u001c\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/cloudacy/native_exif/NativeExifPlugin;",
        "Lio/flutter/embedding/engine/plugins/FlutterPlugin;",
        "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;",
        "<init>",
        "()V",
        "channel",
        "Lio/flutter/plugin/common/MethodChannel;",
        "classId",
        "",
        "interfaces",
        "",
        "Landroidx/exifinterface/media/ExifInterface;",
        "onAttachedToEngine",
        "",
        "flutterPluginBinding",
        "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;",
        "setAttributes",
        "exif",
        "values",
        "",
        "",
        "",
        "onMethodCall",
        "call",
        "Lio/flutter/plugin/common/MethodCall;",
        "result",
        "Lio/flutter/plugin/common/MethodChannel$Result;",
        "onDetachedFromEngine",
        "binding",
        "native_exif_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public a:Luc/r;

.field public b:I

.field public final c:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Le5/a;->c:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    return-void
.end method

.method public static a(LB1/h;Ljava/util/Map;)V
    .locals 10

    .line 1
    const-string v0, "GPSLatitude"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const-string v2, "GPSLongitude"

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_9

    .line 16
    .line 17
    :cond_0
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/4 v3, 0x0

    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0}, LB1/h;->i()[D

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    aget-wide v4, v1, v4

    .line 32
    .line 33
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v1, v3

    .line 39
    :cond_2
    :goto_0
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    if-nez v4, :cond_3

    .line 44
    .line 45
    invoke-virtual {p0}, LB1/h;->i()[D

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    if-eqz v4, :cond_4

    .line 50
    .line 51
    const/4 v3, 0x1

    .line 52
    aget-wide v3, v4, v3

    .line 53
    .line 54
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    goto :goto_1

    .line 59
    :cond_3
    move-object v3, v4

    .line 60
    :cond_4
    :goto_1
    instance-of v4, v1, Ljava/lang/String;

    .line 61
    .line 62
    if-eqz v4, :cond_5

    .line 63
    .line 64
    check-cast v1, Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 67
    .line 68
    .line 69
    move-result-wide v4

    .line 70
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    goto :goto_2

    .line 75
    :cond_5
    instance-of v4, v1, Ljava/lang/Double;

    .line 76
    .line 77
    if-eqz v4, :cond_10

    .line 78
    .line 79
    :goto_2
    instance-of v4, v3, Ljava/lang/String;

    .line 80
    .line 81
    if-eqz v4, :cond_6

    .line 82
    .line 83
    check-cast v3, Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {v3}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 86
    .line 87
    .line 88
    move-result-wide v3

    .line 89
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    goto :goto_3

    .line 94
    :cond_6
    instance-of v4, v3, Ljava/lang/Double;

    .line 95
    .line 96
    if-eqz v4, :cond_f

    .line 97
    .line 98
    :goto_3
    check-cast v1, Ljava/lang/Number;

    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 101
    .line 102
    .line 103
    move-result-wide v4

    .line 104
    check-cast v3, Ljava/lang/Number;

    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    .line 107
    .line 108
    .line 109
    move-result-wide v6

    .line 110
    const-wide v8, -0x3fa9800000000000L    # -90.0

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    cmpg-double v1, v4, v8

    .line 116
    .line 117
    const-string v3, " is not valid."

    .line 118
    .line 119
    if-ltz v1, :cond_e

    .line 120
    .line 121
    const-wide v8, 0x4056800000000000L    # 90.0

    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    cmpl-double v1, v4, v8

    .line 127
    .line 128
    if-gtz v1, :cond_e

    .line 129
    .line 130
    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-nez v1, :cond_e

    .line 135
    .line 136
    const-wide v8, -0x3f99800000000000L    # -180.0

    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    cmpg-double v1, v6, v8

    .line 142
    .line 143
    if-ltz v1, :cond_d

    .line 144
    .line 145
    const-wide v8, 0x4066800000000000L    # 180.0

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    cmpl-double v1, v6, v8

    .line 151
    .line 152
    if-gtz v1, :cond_d

    .line 153
    .line 154
    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-nez v1, :cond_d

    .line 159
    .line 160
    const-wide/16 v8, 0x0

    .line 161
    .line 162
    cmpl-double v1, v4, v8

    .line 163
    .line 164
    if-ltz v1, :cond_7

    .line 165
    .line 166
    const-string v1, "N"

    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_7
    const-string v1, "S"

    .line 170
    .line 171
    :goto_4
    const-string v3, "GPSLatitudeRef"

    .line 172
    .line 173
    invoke-virtual {p0, v3, v1}, LB1/h;->G(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    .line 177
    .line 178
    .line 179
    move-result-wide v3

    .line 180
    invoke-static {v3, v4}, LB1/h;->b(D)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {p0, v0, v1}, LB1/h;->G(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    cmpl-double v1, v6, v8

    .line 188
    .line 189
    if-ltz v1, :cond_8

    .line 190
    .line 191
    const-string v1, "E"

    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_8
    const-string v1, "W"

    .line 195
    .line 196
    :goto_5
    const-string v3, "GPSLongitudeRef"

    .line 197
    .line 198
    invoke-virtual {p0, v3, v1}, LB1/h;->G(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    .line 202
    .line 203
    .line 204
    move-result-wide v3

    .line 205
    invoke-static {v3, v4}, LB1/h;->b(D)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-virtual {p0, v2, v1}, LB1/h;->G(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    :cond_9
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    :cond_a
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    if-eqz v1, :cond_c

    .line 225
    .line 226
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    check-cast v1, Ljava/util/Map$Entry;

    .line 231
    .line 232
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    if-nez v3, :cond_a

    .line 241
    .line 242
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    if-eqz v3, :cond_b

    .line 251
    .line 252
    goto :goto_6

    .line 253
    :cond_b
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    check-cast v3, Ljava/lang/String;

    .line 258
    .line 259
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 264
    .line 265
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    check-cast v1, Ljava/lang/String;

    .line 269
    .line 270
    invoke-virtual {p0, v3, v1}, LB1/h;->G(Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    goto :goto_6

    .line 274
    :cond_c
    return-void

    .line 275
    :cond_d
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 276
    .line 277
    new-instance p1, Ljava/lang/StringBuilder;

    .line 278
    .line 279
    const-string v0, "Longitude value "

    .line 280
    .line 281
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {p1, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    throw p0

    .line 298
    :cond_e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 299
    .line 300
    new-instance p1, Ljava/lang/StringBuilder;

    .line 301
    .line 302
    const-string v0, "Latitude value "

    .line 303
    .line 304
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {p1, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    throw p0

    .line 321
    :cond_f
    new-instance p0, Ljava/lang/NumberFormatException;

    .line 322
    .line 323
    const-string p1, "Invalid GPSLongitude value given. Must be of type Double or String."

    .line 324
    .line 325
    invoke-direct {p0, p1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    throw p0

    .line 329
    :cond_10
    new-instance p0, Ljava/lang/NumberFormatException;

    .line 330
    .line 331
    const-string p1, "Invalid GPSLatitude value given. Must be of type Double or String."

    .line 332
    .line 333
    invoke-direct {p0, p1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    throw p0
.end method


# virtual methods
.method public final onAttachedToEngine(Lqc/a;)V
    .locals 2

    .line 1
    const-string v0, "flutterPluginBinding"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Luc/r;

    .line 7
    .line 8
    const-string v1, "native_exif"

    .line 9
    .line 10
    iget-object p1, p1, Lqc/a;->c:Luc/f;

    .line 11
    .line 12
    invoke-direct {v0, p1, v1}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Le5/a;->a:Luc/r;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Luc/r;->b(Luc/p;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 1

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Le5/a;->a:Luc/r;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Luc/r;->b(Luc/p;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p1, "channel"

    .line 16
    .line 17
    invoke-static {p1}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v0
.end method

.method public final onMethodCall(Luc/o;Luc/q;)V
    .locals 48

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "call"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, v1, Luc/o;->a:Ljava/lang/String;

    .line 11
    .line 12
    if-eqz v2, :cond_19

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    iget-object v4, v0, Le5/a;->c:Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    const/4 v5, 0x1

    .line 21
    const-string v6, "GPSLongitude"

    .line 22
    .line 23
    const-string v7, "GPSLatitude"

    .line 24
    .line 25
    const-string v8, "tag"

    .line 26
    .line 27
    const/4 v9, 0x0

    .line 28
    const-string v10, "Exif with given id was not found in memory"

    .line 29
    .line 30
    const-string v11, "NOT_FOUND"

    .line 31
    .line 32
    const-string v12, "Bad arguments were given to this method."

    .line 33
    .line 34
    const-string v13, "BAD_ARGUMENTS"

    .line 35
    .line 36
    const-string v14, "id"

    .line 37
    .line 38
    const/4 v15, 0x0

    .line 39
    sparse-switch v3, :sswitch_data_0

    .line 40
    .line 41
    .line 42
    goto/16 :goto_4

    .line 43
    .line 44
    :sswitch_0
    const-string v3, "setAttribute"

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_0

    .line 51
    .line 52
    goto/16 :goto_4

    .line 53
    .line 54
    :cond_0
    invoke-virtual {v1, v14}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Ljava/lang/Integer;

    .line 59
    .line 60
    invoke-virtual {v1, v8}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, Ljava/lang/String;

    .line 65
    .line 66
    const-string v5, "value"

    .line 67
    .line 68
    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Ljava/lang/String;

    .line 73
    .line 74
    if-eqz v2, :cond_3

    .line 75
    .line 76
    if-eqz v3, :cond_3

    .line 77
    .line 78
    if-nez v1, :cond_1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    invoke-virtual {v4, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, LB1/h;

    .line 86
    .line 87
    if-nez v2, :cond_2

    .line 88
    .line 89
    move-object/from16 v1, p2

    .line 90
    .line 91
    check-cast v1, Ltc/g;

    .line 92
    .line 93
    invoke-virtual {v1, v11, v10, v15}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_2
    new-instance v4, Lef/k;

    .line 98
    .line 99
    invoke-direct {v4, v3, v1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v4}, Lff/B;->E(Lef/k;)Ljava/util/Map;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-static {v2, v1}, Le5/a;->a(LB1/h;Ljava/util/Map;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2}, LB1/h;->C()V

    .line 110
    .line 111
    .line 112
    move-object/from16 v1, p2

    .line 113
    .line 114
    check-cast v1, Ltc/g;

    .line 115
    .line 116
    invoke-virtual {v1, v15}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_3
    :goto_0
    move-object/from16 v1, p2

    .line 121
    .line 122
    check-cast v1, Ltc/g;

    .line 123
    .line 124
    invoke-virtual {v1, v13, v12, v15}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :sswitch_1
    const-string v3, "setAttributes"

    .line 129
    .line 130
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-nez v2, :cond_4

    .line 135
    .line 136
    goto/16 :goto_4

    .line 137
    .line 138
    :cond_4
    invoke-virtual {v1, v14}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    check-cast v2, Ljava/lang/Integer;

    .line 143
    .line 144
    const-string v3, "values"

    .line 145
    .line 146
    invoke-virtual {v1, v3}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    check-cast v1, Ljava/util/Map;

    .line 151
    .line 152
    if-eqz v2, :cond_7

    .line 153
    .line 154
    if-nez v1, :cond_5

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_5
    invoke-virtual {v4, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    check-cast v2, LB1/h;

    .line 162
    .line 163
    if-nez v2, :cond_6

    .line 164
    .line 165
    move-object/from16 v1, p2

    .line 166
    .line 167
    check-cast v1, Ltc/g;

    .line 168
    .line 169
    invoke-virtual {v1, v11, v10, v15}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :cond_6
    invoke-static {v2, v1}, Le5/a;->a(LB1/h;Ljava/util/Map;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2}, LB1/h;->C()V

    .line 177
    .line 178
    .line 179
    move-object/from16 v1, p2

    .line 180
    .line 181
    check-cast v1, Ltc/g;

    .line 182
    .line 183
    invoke-virtual {v1, v15}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :cond_7
    :goto_1
    move-object/from16 v1, p2

    .line 188
    .line 189
    check-cast v1, Ltc/g;

    .line 190
    .line 191
    invoke-virtual {v1, v13, v12, v15}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :sswitch_2
    const-string v3, "initPath"

    .line 196
    .line 197
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    if-nez v2, :cond_8

    .line 202
    .line 203
    goto/16 :goto_4

    .line 204
    .line 205
    :cond_8
    new-instance v2, LB1/h;

    .line 206
    .line 207
    iget-object v1, v1, Luc/o;->b:Ljava/lang/Object;

    .line 208
    .line 209
    const-string v3, "null cannot be cast to non-null type kotlin.String"

    .line 210
    .line 211
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    check-cast v1, Ljava/lang/String;

    .line 215
    .line 216
    invoke-direct {v2, v1}, LB1/h;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    iget v1, v0, Le5/a;->b:I

    .line 220
    .line 221
    add-int/lit8 v3, v1, 0x1

    .line 222
    .line 223
    iput v3, v0, Le5/a;->b:I

    .line 224
    .line 225
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    invoke-interface {v4, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    move-object/from16 v2, p2

    .line 237
    .line 238
    check-cast v2, Ltc/g;

    .line 239
    .line 240
    invoke-virtual {v2, v1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :sswitch_3
    const-string v3, "getAttributes"

    .line 245
    .line 246
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    if-nez v2, :cond_9

    .line 251
    .line 252
    goto/16 :goto_4

    .line 253
    .line 254
    :cond_9
    invoke-virtual {v1, v14}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    check-cast v1, Ljava/lang/Integer;

    .line 259
    .line 260
    if-nez v1, :cond_a

    .line 261
    .line 262
    move-object/from16 v1, p2

    .line 263
    .line 264
    check-cast v1, Ltc/g;

    .line 265
    .line 266
    invoke-virtual {v1, v13, v12, v15}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    return-void

    .line 270
    :cond_a
    invoke-virtual {v4, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    check-cast v1, LB1/h;

    .line 275
    .line 276
    if-nez v1, :cond_b

    .line 277
    .line 278
    move-object/from16 v1, p2

    .line 279
    .line 280
    check-cast v1, Ltc/g;

    .line 281
    .line 282
    invoke-virtual {v1, v11, v10, v15}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    return-void

    .line 286
    :cond_b
    const-string v44, "SubSecTimeOriginal"

    .line 287
    .line 288
    const-string v45, "SubSecTimeDigitized"

    .line 289
    .line 290
    const-string v16, "Artist"

    .line 291
    .line 292
    const-string v17, "ApertureValue"

    .line 293
    .line 294
    const-string v18, "CustomRendered"

    .line 295
    .line 296
    const-string v19, "DateTime"

    .line 297
    .line 298
    const-string v20, "DateTimeDigitized"

    .line 299
    .line 300
    const-string v21, "DateTimeOriginal"

    .line 301
    .line 302
    const-string v22, "DigitalZoomRatio"

    .line 303
    .line 304
    const-string v23, "ExposureTime"

    .line 305
    .line 306
    const-string v24, "ExposureProgram"

    .line 307
    .line 308
    const-string v25, "FNumber"

    .line 309
    .line 310
    const-string v26, "Flash"

    .line 311
    .line 312
    const-string v27, "FocalLength"

    .line 313
    .line 314
    const-string v28, "GPSAltitude"

    .line 315
    .line 316
    const-string v29, "GPSAltitudeRef"

    .line 317
    .line 318
    const-string v30, "GPSDateStamp"

    .line 319
    .line 320
    const-string v31, "GPSLatitudeRef"

    .line 321
    .line 322
    const-string v32, "GPSLongitudeRef"

    .line 323
    .line 324
    const-string v33, "GPSProcessingMethod"

    .line 325
    .line 326
    const-string v34, "GPSTimeStamp"

    .line 327
    .line 328
    const-string v35, "ImageLength"

    .line 329
    .line 330
    const-string v36, "ImageUniqueID"

    .line 331
    .line 332
    const-string v37, "ImageWidth"

    .line 333
    .line 334
    const-string v38, "ISOSpeedRatings"

    .line 335
    .line 336
    const-string v39, "Make"

    .line 337
    .line 338
    const-string v40, "Model"

    .line 339
    .line 340
    const-string v41, "Orientation"

    .line 341
    .line 342
    const-string v42, "Software"

    .line 343
    .line 344
    const-string v43, "SubSecTime"

    .line 345
    .line 346
    const-string v46, "UserComment"

    .line 347
    .line 348
    const-string v47, "WhiteBalance"

    .line 349
    .line 350
    filled-new-array/range {v16 .. v47}, [Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    new-instance v3, Ljava/util/HashMap;

    .line 355
    .line 356
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 357
    .line 358
    .line 359
    move v4, v9

    .line 360
    :goto_2
    const/16 v8, 0x20

    .line 361
    .line 362
    if-ge v4, v8, :cond_d

    .line 363
    .line 364
    aget-object v8, v2, v4

    .line 365
    .line 366
    invoke-virtual {v1, v8}, LB1/h;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v10

    .line 370
    if-eqz v10, :cond_c

    .line 371
    .line 372
    invoke-virtual {v3, v8, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    :cond_c
    add-int/lit8 v4, v4, 0x1

    .line 376
    .line 377
    goto :goto_2

    .line 378
    :cond_d
    invoke-virtual {v1}, LB1/h;->i()[D

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    if-eqz v1, :cond_e

    .line 383
    .line 384
    aget-wide v8, v1, v9

    .line 385
    .line 386
    invoke-static {v8, v9}, Ljava/lang/Math;->abs(D)D

    .line 387
    .line 388
    .line 389
    move-result-wide v8

    .line 390
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    invoke-virtual {v3, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    aget-wide v4, v1, v5

    .line 398
    .line 399
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    .line 400
    .line 401
    .line 402
    move-result-wide v1

    .line 403
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    invoke-virtual {v3, v6, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    :cond_e
    move-object/from16 v1, p2

    .line 411
    .line 412
    check-cast v1, Ltc/g;

    .line 413
    .line 414
    invoke-virtual {v1, v3}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    return-void

    .line 418
    :sswitch_4
    const-string v3, "close"

    .line 419
    .line 420
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v2

    .line 424
    if-nez v2, :cond_f

    .line 425
    .line 426
    goto/16 :goto_4

    .line 427
    .line 428
    :cond_f
    invoke-virtual {v1, v14}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    check-cast v1, Ljava/lang/Integer;

    .line 433
    .line 434
    if-nez v1, :cond_10

    .line 435
    .line 436
    move-object/from16 v1, p2

    .line 437
    .line 438
    check-cast v1, Ltc/g;

    .line 439
    .line 440
    invoke-virtual {v1, v13, v12, v15}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    return-void

    .line 444
    :cond_10
    invoke-interface {v4, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-object/from16 v1, p2

    .line 448
    .line 449
    check-cast v1, Ltc/g;

    .line 450
    .line 451
    invoke-virtual {v1, v15}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    return-void

    .line 455
    :sswitch_5
    const-string v3, "getAttribute"

    .line 456
    .line 457
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    move-result v2

    .line 461
    if-nez v2, :cond_11

    .line 462
    .line 463
    goto :goto_4

    .line 464
    :cond_11
    invoke-virtual {v1, v14}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    check-cast v2, Ljava/lang/Integer;

    .line 469
    .line 470
    invoke-virtual {v1, v8}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    check-cast v1, Ljava/lang/String;

    .line 475
    .line 476
    if-eqz v2, :cond_18

    .line 477
    .line 478
    if-nez v1, :cond_12

    .line 479
    .line 480
    goto :goto_3

    .line 481
    :cond_12
    invoke-virtual {v4, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    check-cast v2, LB1/h;

    .line 486
    .line 487
    if-nez v2, :cond_13

    .line 488
    .line 489
    move-object/from16 v1, p2

    .line 490
    .line 491
    check-cast v1, Ltc/g;

    .line 492
    .line 493
    invoke-virtual {v1, v11, v10, v15}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 494
    .line 495
    .line 496
    return-void

    .line 497
    :cond_13
    invoke-virtual {v1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    move-result v3

    .line 501
    if-eqz v3, :cond_15

    .line 502
    .line 503
    invoke-virtual {v2}, LB1/h;->i()[D

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    if-eqz v1, :cond_14

    .line 508
    .line 509
    aget-wide v2, v1, v9

    .line 510
    .line 511
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    .line 512
    .line 513
    .line 514
    move-result-wide v1

    .line 515
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 516
    .line 517
    .line 518
    move-result-object v15

    .line 519
    :cond_14
    move-object/from16 v1, p2

    .line 520
    .line 521
    check-cast v1, Ltc/g;

    .line 522
    .line 523
    invoke-virtual {v1, v15}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 524
    .line 525
    .line 526
    return-void

    .line 527
    :cond_15
    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 528
    .line 529
    .line 530
    move-result v3

    .line 531
    if-eqz v3, :cond_17

    .line 532
    .line 533
    invoke-virtual {v2}, LB1/h;->i()[D

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    if-eqz v1, :cond_16

    .line 538
    .line 539
    aget-wide v2, v1, v5

    .line 540
    .line 541
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    .line 542
    .line 543
    .line 544
    move-result-wide v1

    .line 545
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 546
    .line 547
    .line 548
    move-result-object v15

    .line 549
    :cond_16
    move-object/from16 v1, p2

    .line 550
    .line 551
    check-cast v1, Ltc/g;

    .line 552
    .line 553
    invoke-virtual {v1, v15}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 554
    .line 555
    .line 556
    return-void

    .line 557
    :cond_17
    invoke-virtual {v2, v1}, LB1/h;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v1

    .line 561
    move-object/from16 v2, p2

    .line 562
    .line 563
    check-cast v2, Ltc/g;

    .line 564
    .line 565
    invoke-virtual {v2, v1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    return-void

    .line 569
    :cond_18
    :goto_3
    move-object/from16 v1, p2

    .line 570
    .line 571
    check-cast v1, Ltc/g;

    .line 572
    .line 573
    invoke-virtual {v1, v13, v12, v15}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 574
    .line 575
    .line 576
    return-void

    .line 577
    :cond_19
    :goto_4
    move-object/from16 v1, p2

    .line 578
    .line 579
    check-cast v1, Ltc/g;

    .line 580
    .line 581
    invoke-virtual {v1}, Ltc/g;->c()V

    .line 582
    .line 583
    .line 584
    return-void

    .line 585
    :sswitch_data_0
    .sparse-switch
        0x351be6 -> :sswitch_5
        0x5a5ddf8 -> :sswitch_4
        0x66e614d -> :sswitch_3
        0xffe3555 -> :sswitch_2
        0x3492af59 -> :sswitch_1
        0x5c88dc5a -> :sswitch_0
    .end sparse-switch
.end method
