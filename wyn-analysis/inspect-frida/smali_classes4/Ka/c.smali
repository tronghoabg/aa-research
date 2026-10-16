.class public final LKa/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/p;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LKa/c;->b:Ljava/util/HashMap;

    .line 10
    .line 11
    iput-object p1, p0, LKa/c;->a:Landroid/content/Context;

    .line 12
    .line 13
    return-void
.end method

.method public static a(Ljava/util/HashMap;Ljava/lang/String;Landroid/graphics/Rect;[Landroid/graphics/Point;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    new-instance p4, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    array-length v1, p3

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, v1, :cond_0

    .line 17
    .line 18
    aget-object v3, p3, v2

    .line 19
    .line 20
    new-instance v4, Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    iget v5, v3, Landroid/graphics/Point;->x:I

    .line 26
    .line 27
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    const-string v6, "x"

    .line 32
    .line 33
    invoke-virtual {v4, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    iget v3, v3, Landroid/graphics/Point;->y:I

    .line 37
    .line 38
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    const-string v5, "y"

    .line 43
    .line 44
    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p4, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const-string p3, "points"

    .line 54
    .line 55
    invoke-virtual {p0, p3, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    new-instance p3, Ljava/util/HashMap;

    .line 59
    .line 60
    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    .line 61
    .line 62
    .line 63
    iget p4, p2, Landroid/graphics/Rect;->left:I

    .line 64
    .line 65
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object p4

    .line 69
    const-string v1, "left"

    .line 70
    .line 71
    invoke-virtual {p3, v1, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    iget p4, p2, Landroid/graphics/Rect;->right:I

    .line 75
    .line 76
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object p4

    .line 80
    const-string v1, "right"

    .line 81
    .line 82
    invoke-virtual {p3, v1, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    iget p4, p2, Landroid/graphics/Rect;->top:I

    .line 86
    .line 87
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object p4

    .line 91
    const-string v1, "top"

    .line 92
    .line 93
    invoke-virtual {p3, v1, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    .line 97
    .line 98
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    const-string p4, "bottom"

    .line 103
    .line 104
    invoke-virtual {p3, p4, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    const-string p2, "rect"

    .line 108
    .line 109
    invoke-virtual {p0, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    const-string p2, "recognizedLanguages"

    .line 113
    .line 114
    invoke-virtual {p0, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    const-string p2, "text"

    .line 118
    .line 119
    invoke-virtual {p0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    const-string p1, "confidence"

    .line 123
    .line 124
    invoke-virtual {p0, p1, p5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    const-string p1, "angle"

    .line 128
    .line 129
    invoke-virtual {p0, p1, p6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public static b(Luc/o;)LEa/f;
    .locals 1

    .line 1
    const-string v0, "script"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Integer;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_5

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    if-eq p0, v0, :cond_4

    .line 20
    .line 21
    const/4 v0, 0x2

    .line 22
    if-eq p0, v0, :cond_3

    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    if-eq p0, v0, :cond_2

    .line 26
    .line 27
    const/4 v0, 0x4

    .line 28
    if-eq p0, v0, :cond_1

    .line 29
    .line 30
    :goto_0
    const/4 p0, 0x0

    .line 31
    return-object p0

    .line 32
    :cond_1
    new-instance p0, Lcom/google/mlkit/vision/text/korean/KoreanTextRecognizerOptions$Builder;

    .line 33
    .line 34
    invoke-direct {p0}, Lcom/google/mlkit/vision/text/korean/KoreanTextRecognizerOptions$Builder;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/google/mlkit/vision/text/korean/KoreanTextRecognizerOptions$Builder;->build()Lcom/google/mlkit/vision/text/korean/KoreanTextRecognizerOptions;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0}, LBa/c;->v(LCa/h;)LEa/f;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_2
    new-instance p0, Lcom/google/mlkit/vision/text/japanese/JapaneseTextRecognizerOptions$Builder;

    .line 47
    .line 48
    invoke-direct {p0}, Lcom/google/mlkit/vision/text/japanese/JapaneseTextRecognizerOptions$Builder;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/google/mlkit/vision/text/japanese/JapaneseTextRecognizerOptions$Builder;->build()Lcom/google/mlkit/vision/text/japanese/JapaneseTextRecognizerOptions;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, LBa/c;->v(LCa/h;)LEa/f;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :cond_3
    new-instance p0, Lcom/google/mlkit/vision/text/devanagari/DevanagariTextRecognizerOptions$Builder;

    .line 61
    .line 62
    invoke-direct {p0}, Lcom/google/mlkit/vision/text/devanagari/DevanagariTextRecognizerOptions$Builder;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/google/mlkit/vision/text/devanagari/DevanagariTextRecognizerOptions$Builder;->build()Lcom/google/mlkit/vision/text/devanagari/DevanagariTextRecognizerOptions;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {p0}, LBa/c;->v(LCa/h;)LEa/f;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :cond_4
    new-instance p0, Lcom/google/mlkit/vision/text/chinese/ChineseTextRecognizerOptions$Builder;

    .line 75
    .line 76
    invoke-direct {p0}, Lcom/google/mlkit/vision/text/chinese/ChineseTextRecognizerOptions$Builder;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/google/mlkit/vision/text/chinese/ChineseTextRecognizerOptions$Builder;->build()Lcom/google/mlkit/vision/text/chinese/ChineseTextRecognizerOptions;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {p0}, LBa/c;->v(LCa/h;)LEa/f;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :cond_5
    sget-object p0, LFa/a;->c:LFa/a;

    .line 89
    .line 90
    invoke-static {p0}, LBa/c;->v(LCa/h;)LEa/f;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0
.end method


# virtual methods
.method public final onMethodCall(Luc/o;Luc/q;)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x3

    .line 7
    iget-object v0, v2, Luc/o;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    const-string v6, "vision#startTextRecognizer"

    .line 14
    .line 15
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    if-nez v6, :cond_2

    .line 20
    .line 21
    const-string v3, "vision#closeTextRecognizer"

    .line 22
    .line 23
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    move-object/from16 v0, p2

    .line 30
    .line 31
    check-cast v0, Ltc/g;

    .line 32
    .line 33
    invoke-virtual {v0}, Ltc/g;->c()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    const-string v0, "id"

    .line 38
    .line 39
    invoke-virtual {v2, v0}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Ljava/lang/String;

    .line 44
    .line 45
    iget-object v2, v1, LKa/c;->b:Ljava/util/HashMap;

    .line 46
    .line 47
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, LCa/g;

    .line 52
    .line 53
    if-nez v3, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    check-cast v3, LBa/b;

    .line 57
    .line 58
    invoke-virtual {v3}, LBa/b;->close()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    :goto_0
    move-object/from16 v0, p2

    .line 65
    .line 66
    check-cast v0, Ltc/g;

    .line 67
    .line 68
    invoke-virtual {v0, v5}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_2
    const-string v0, "imageData"

    .line 73
    .line 74
    invoke-virtual {v2, v0}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Ljava/util/Map;

    .line 79
    .line 80
    if-nez v0, :cond_3

    .line 81
    .line 82
    goto/16 :goto_4

    .line 83
    .line 84
    :cond_3
    iget-object v6, v1, LKa/c;->a:Landroid/content/Context;

    .line 85
    .line 86
    const-string v7, "type"

    .line 87
    .line 88
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    check-cast v7, Ljava/lang/String;

    .line 93
    .line 94
    const-string v8, "Getting Image failed"

    .line 95
    .line 96
    const-string v9, "InputImageConverterError"

    .line 97
    .line 98
    const-string v10, "ImageError"

    .line 99
    .line 100
    if-eqz v7, :cond_4

    .line 101
    .line 102
    const-string v11, "file"

    .line 103
    .line 104
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v11

    .line 108
    if-eqz v11, :cond_4

    .line 109
    .line 110
    :try_start_0
    new-instance v7, Ljava/io/File;

    .line 111
    .line 112
    const-string v11, "path"

    .line 113
    .line 114
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, Ljava/lang/String;

    .line 119
    .line 120
    invoke-direct {v7, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v7}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-static {v6, v0}, LAa/a;->a(Landroid/content/Context;Landroid/net/Uri;)LAa/a;

    .line 128
    .line 129
    .line 130
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    goto/16 :goto_2

    .line 132
    .line 133
    :catch_0
    move-exception v0

    .line 134
    invoke-static {v10, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    invoke-static {v10, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    move-object/from16 v6, p2

    .line 149
    .line 150
    check-cast v6, Ltc/g;

    .line 151
    .line 152
    invoke-virtual {v6, v9, v0, v5}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    :goto_1
    move-object v0, v5

    .line 156
    goto/16 :goto_2

    .line 157
    .line 158
    :cond_4
    if-eqz v7, :cond_5

    .line 159
    .line 160
    const-string v6, "bytes"

    .line 161
    .line 162
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    if-eqz v7, :cond_5

    .line 167
    .line 168
    :try_start_1
    const-string v7, "metadata"

    .line 169
    .line 170
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    check-cast v7, Ljava/util/Map;

    .line 175
    .line 176
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    check-cast v0, [B

    .line 184
    .line 185
    const-string v6, "width"

    .line 186
    .line 187
    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    invoke-static {v6}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    invoke-static {v6}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    invoke-virtual {v6}, Ljava/lang/Double;->intValue()I

    .line 203
    .line 204
    .line 205
    move-result v13

    .line 206
    const-string v6, "height"

    .line 207
    .line 208
    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    invoke-static {v6}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    invoke-static {v6}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    invoke-virtual {v6}, Ljava/lang/Double;->intValue()I

    .line 224
    .line 225
    .line 226
    move-result v14

    .line 227
    const-string v6, "rotation"

    .line 228
    .line 229
    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    invoke-static {v6}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v6

    .line 240
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 241
    .line 242
    .line 243
    move-result v15

    .line 244
    const-string v6, "image_format"

    .line 245
    .line 246
    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    invoke-static {v6}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 258
    .line 259
    .line 260
    move-result v16

    .line 261
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 262
    .line 263
    .line 264
    move-result-wide v6

    .line 265
    new-instance v11, LAa/a;

    .line 266
    .line 267
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 268
    .line 269
    .line 270
    move-result-object v12

    .line 271
    invoke-direct/range {v11 .. v16}, LAa/a;-><init>(Ljava/nio/ByteBuffer;IIII)V

    .line 272
    .line 273
    .line 274
    move-object/from16 v20, v11

    .line 275
    .line 276
    array-length v0, v0

    .line 277
    const-string v11, "vision-common"

    .line 278
    .line 279
    invoke-static {v11}, Lcom/google/android/gms/internal/mlkit_vision_common/zzms;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;

    .line 280
    .line 281
    .line 282
    move-result-object v11

    .line 283
    move/from16 v17, v13

    .line 284
    .line 285
    const/4 v13, 0x2

    .line 286
    move/from16 v18, v0

    .line 287
    .line 288
    move/from16 v19, v15

    .line 289
    .line 290
    move/from16 v12, v16

    .line 291
    .line 292
    move/from16 v16, v14

    .line 293
    .line 294
    move-wide v14, v6

    .line 295
    invoke-static/range {v11 .. v19}, Lcom/google/android/gms/internal/mlkit_vision_common/zzmu;->zza(Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;IIJIIII)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 296
    .line 297
    .line 298
    move-object/from16 v0, v20

    .line 299
    .line 300
    goto :goto_2

    .line 301
    :catch_1
    move-exception v0

    .line 302
    invoke-static {v10, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v6

    .line 309
    invoke-static {v10, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    move-object/from16 v6, p2

    .line 317
    .line 318
    check-cast v6, Ltc/g;

    .line 319
    .line 320
    invoke-virtual {v6, v9, v0, v5}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    goto/16 :goto_1

    .line 324
    .line 325
    :cond_5
    const-string v0, "Invalid Input Image"

    .line 326
    .line 327
    move-object/from16 v6, p2

    .line 328
    .line 329
    check-cast v6, Ltc/g;

    .line 330
    .line 331
    invoke-virtual {v6, v9, v0, v5}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    goto/16 :goto_1

    .line 335
    .line 336
    :goto_2
    if-nez v0, :cond_6

    .line 337
    .line 338
    goto/16 :goto_4

    .line 339
    .line 340
    :cond_6
    const-string v6, "id"

    .line 341
    .line 342
    invoke-virtual {v2, v6}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v6

    .line 346
    check-cast v6, Ljava/lang/String;

    .line 347
    .line 348
    iget-object v7, v1, LKa/c;->b:Ljava/util/HashMap;

    .line 349
    .line 350
    invoke-virtual {v7, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v7

    .line 354
    check-cast v7, LCa/g;

    .line 355
    .line 356
    if-nez v7, :cond_7

    .line 357
    .line 358
    invoke-static {v2}, LKa/c;->b(Luc/o;)LEa/f;

    .line 359
    .line 360
    .line 361
    move-result-object v7

    .line 362
    iget-object v2, v1, LKa/c;->b:Ljava/util/HashMap;

    .line 363
    .line 364
    invoke-virtual {v2, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    :cond_7
    if-nez v7, :cond_8

    .line 368
    .line 369
    const-string v0, "TextRecognizerError"

    .line 370
    .line 371
    const-string v2, "TextRecognizer is not initialized"

    .line 372
    .line 373
    move-object/from16 v3, p2

    .line 374
    .line 375
    check-cast v3, Ltc/g;

    .line 376
    .line 377
    invoke-virtual {v3, v0, v2, v5}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    goto :goto_4

    .line 381
    :cond_8
    check-cast v7, LEa/f;

    .line 382
    .line 383
    monitor-enter v7

    .line 384
    :try_start_2
    iget-object v2, v7, LBa/b;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 385
    .line 386
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 387
    .line 388
    .line 389
    move-result v2

    .line 390
    if-eqz v2, :cond_9

    .line 391
    .line 392
    new-instance v0, Lua/a;

    .line 393
    .line 394
    const-string v2, "This detector is already closed!"

    .line 395
    .line 396
    const/16 v4, 0xe

    .line 397
    .line 398
    invoke-direct {v0, v2, v4}, Lua/a;-><init>(Ljava/lang/String;I)V

    .line 399
    .line 400
    .line 401
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 402
    .line 403
    .line 404
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 405
    monitor-exit v7

    .line 406
    goto :goto_3

    .line 407
    :catchall_0
    move-exception v0

    .line 408
    goto :goto_5

    .line 409
    :cond_9
    :try_start_3
    iget v2, v0, LAa/a;->c:I

    .line 410
    .line 411
    const/16 v5, 0x20

    .line 412
    .line 413
    if-lt v2, v5, :cond_a

    .line 414
    .line 415
    iget v2, v0, LAa/a;->d:I

    .line 416
    .line 417
    if-lt v2, v5, :cond_a

    .line 418
    .line 419
    iget-object v2, v7, LBa/b;->b:LEa/a;

    .line 420
    .line 421
    iget-object v5, v7, LBa/b;->d:Ljava/util/concurrent/Executor;

    .line 422
    .line 423
    new-instance v6, LA7/y0;

    .line 424
    .line 425
    invoke-direct {v6, v7, v3, v0, v4}, LA7/y0;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 426
    .line 427
    .line 428
    iget-object v0, v7, LBa/b;->c:Lcom/google/android/gms/tasks/CancellationTokenSource;

    .line 429
    .line 430
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/CancellationTokenSource;->getToken()Lcom/google/android/gms/tasks/CancellationToken;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    invoke-virtual {v2, v5, v6, v0}, LE9/c;->b(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;Lcom/google/android/gms/tasks/CancellationToken;)Lcom/google/android/gms/tasks/Task;

    .line 435
    .line 436
    .line 437
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 438
    monitor-exit v7

    .line 439
    goto :goto_3

    .line 440
    :cond_a
    :try_start_4
    new-instance v0, Lua/a;

    .line 441
    .line 442
    const-string v2, "InputImage width and height should be at least 32!"

    .line 443
    .line 444
    invoke-direct {v0, v2, v4}, Lua/a;-><init>(Ljava/lang/String;I)V

    .line 445
    .line 446
    .line 447
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 448
    .line 449
    .line 450
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 451
    monitor-exit v7

    .line 452
    :goto_3
    new-instance v2, LA5/h;

    .line 453
    .line 454
    move-object/from16 v4, p2

    .line 455
    .line 456
    check-cast v4, Ltc/g;

    .line 457
    .line 458
    const/16 v5, 0xf

    .line 459
    .line 460
    invoke-direct {v2, v5, v1, v4}, LA5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v0, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    new-instance v2, LKa/b;

    .line 468
    .line 469
    invoke-direct {v2, v4, v3}, LKa/b;-><init>(Ltc/g;I)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v0, v2}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    .line 473
    .line 474
    .line 475
    :goto_4
    return-void

    .line 476
    :goto_5
    :try_start_5
    monitor-exit v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 477
    throw v0
.end method
