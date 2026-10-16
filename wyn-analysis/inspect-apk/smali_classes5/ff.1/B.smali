.class public abstract Lff/B;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile a:LF6/r;


# direct methods
.method public static A(Landroid/content/Context;Landroid/content/ComponentName;)Z
    .locals 1

    .line 1
    invoke-static {}, Lff/B;->p()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p0, p1}, Lff/B;->B(Landroid/content/Context;Landroid/content/Intent;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static B(Landroid/content/Context;Landroid/content/Intent;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/high16 v0, 0x10000

    .line 6
    .line 7
    invoke-virtual {p0, p1, v0}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-lez p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public static C(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-static {}, Lff/B;->p()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p0, p1}, Lff/B;->B(Landroid/content/Context;Landroid/content/Intent;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static D(I)I
    .locals 1

    .line 1
    if-gez p0, :cond_0

    .line 2
    .line 3
    return p0

    .line 4
    :cond_0
    const/4 v0, 0x3

    .line 5
    if-ge p0, v0, :cond_1

    .line 6
    .line 7
    add-int/lit8 p0, p0, 0x1

    .line 8
    .line 9
    return p0

    .line 10
    :cond_1
    const/high16 v0, 0x40000000    # 2.0f

    .line 11
    .line 12
    if-ge p0, v0, :cond_2

    .line 13
    .line 14
    int-to-float p0, p0

    .line 15
    const/high16 v0, 0x3f400000    # 0.75f

    .line 16
    .line 17
    div-float/2addr p0, v0

    .line 18
    const/high16 v0, 0x3f800000    # 1.0f

    .line 19
    .line 20
    add-float/2addr p0, v0

    .line 21
    float-to-int p0, p0

    .line 22
    return p0

    .line 23
    :cond_2
    const p0, 0x7fffffff

    .line 24
    .line 25
    .line 26
    return p0
.end method

.method public static E(Lef/k;)Ljava/util/Map;
    .locals 1

    .line 1
    const-string v0, "pair"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lef/k;->a:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p0, p0, Lef/k;->b:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-static {v0, p0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v0, "singletonMap(...)"

    .line 15
    .line 16
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public static F(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    const-string v0, "r"

    .line 7
    .line 8
    invoke-virtual {p0, p1, v0, v1}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_0
    :try_start_1
    new-instance p1, Ljava/io/FileInputStream;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-direct {p1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    .line 29
    :try_start_2
    invoke-virtual {p1}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    .line 34
    .line 35
    .line 36
    move-result-wide v6

    .line 37
    sget-object v3, Ljava/nio/channels/FileChannel$MapMode;->READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;

    .line 38
    .line 39
    const-wide/16 v4, 0x0

    .line 40
    .line 41
    invoke-virtual/range {v2 .. v7}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 42
    .line 43
    .line 44
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 45
    :try_start_3
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 46
    .line 47
    .line 48
    :try_start_4
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    move-object p1, v0

    .line 54
    goto :goto_1

    .line 55
    :catchall_1
    move-exception v0

    .line 56
    move-object v2, v0

    .line 57
    :try_start_5
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_2
    move-exception v0

    .line 62
    move-object p1, v0

    .line 63
    :try_start_6
    invoke-virtual {v2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    :goto_0
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 67
    :goto_1
    :try_start_7
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :catchall_3
    move-exception v0

    .line 72
    move-object p0, v0

    .line 73
    :try_start_8
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    :goto_2
    throw p1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    .line 77
    :catch_0
    :cond_1
    return-object v1
.end method

.method public static final G(Ltf/a;)La2/v;
    .locals 1

    .line 1
    const-string v0, "defaultFactory"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, La2/v;

    .line 7
    .line 8
    invoke-direct {v0, p0}, La2/v;-><init>(Ltf/a;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static final H(ILN/o;)Lh0/c;
    .locals 43

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const v3, 0x1c403a8f

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1, v3}, LN/o;->M(I)V

    .line 10
    .line 11
    .line 12
    sget-object v3, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:LN/L0;

    .line 13
    .line 14
    invoke-virtual {v1, v3}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Landroid/content/Context;

    .line 19
    .line 20
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const v5, -0x1d58f75c

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v5}, LN/o;->M(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, LN/o;->F()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    sget-object v6, LN/k;->a:LN/P;

    .line 35
    .line 36
    if-ne v5, v6, :cond_0

    .line 37
    .line 38
    new-instance v5, Landroid/util/TypedValue;

    .line 39
    .line 40
    invoke-direct {v5}, Landroid/util/TypedValue;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v5}, LN/o;->U(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    const/4 v7, 0x0

    .line 47
    invoke-virtual {v1, v7}, LN/o;->p(Z)V

    .line 48
    .line 49
    .line 50
    check-cast v5, Landroid/util/TypedValue;

    .line 51
    .line 52
    invoke-virtual {v4, v0, v5, v2}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 53
    .line 54
    .line 55
    iget-object v5, v5, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 56
    .line 57
    const-string v9, "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG"

    .line 58
    .line 59
    if-eqz v5, :cond_2b

    .line 60
    .line 61
    const-string v10, ".xml"

    .line 62
    .line 63
    invoke-static {v10, v5}, LBf/k;->r0(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    if-ne v10, v2, :cond_2b

    .line 68
    .line 69
    const v5, -0x2c0108e9

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v5}, LN/o;->M(I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    const-string v5, "context.theme"

    .line 80
    .line 81
    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const v5, 0x7dea3d4c

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v5}, LN/o;->M(I)V

    .line 88
    .line 89
    .line 90
    sget-object v5, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->c:LN/L0;

    .line 91
    .line 92
    invoke-virtual {v1, v5}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    check-cast v5, Lw0/c;

    .line 97
    .line 98
    new-instance v6, Lw0/b;

    .line 99
    .line 100
    invoke-direct {v6, v3, v0}, Lw0/b;-><init>(Landroid/content/res/Resources$Theme;I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v5, v5, Lw0/c;->a:Ljava/util/HashMap;

    .line 107
    .line 108
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    check-cast v10, Ljava/lang/ref/WeakReference;

    .line 113
    .line 114
    if-eqz v10, :cond_1

    .line 115
    .line 116
    invoke-virtual {v10}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    check-cast v10, Lw0/a;

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_1
    const/4 v10, 0x0

    .line 124
    :goto_0
    if-nez v10, :cond_2a

    .line 125
    .line 126
    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    const-string v10, "res.getXml(id)"

    .line 131
    .line 132
    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 136
    .line 137
    .line 138
    move-result v10

    .line 139
    :goto_1
    const/4 v11, 0x2

    .line 140
    if-eq v10, v11, :cond_2

    .line 141
    .line 142
    if-eq v10, v2, :cond_2

    .line 143
    .line 144
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    goto :goto_1

    .line 149
    :cond_2
    if-ne v10, v11, :cond_29

    .line 150
    .line 151
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v10

    .line 155
    const-string v12, "vector"

    .line 156
    .line 157
    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v10

    .line 161
    if-eqz v10, :cond_28

    .line 162
    .line 163
    invoke-static {v0}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    new-instance v10, Lj0/a;

    .line 168
    .line 169
    invoke-direct {v10, v0}, Lj0/a;-><init>(Landroid/content/res/XmlResourceParser;)V

    .line 170
    .line 171
    .line 172
    const-string v12, "attrs"

    .line 173
    .line 174
    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    sget-object v12, Lj0/b;->a:[I

    .line 178
    .line 179
    invoke-virtual {v10, v4, v3, v9, v12}, Lj0/a;->c(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 180
    .line 181
    .line 182
    move-result-object v12

    .line 183
    const-string v13, "autoMirrored"

    .line 184
    .line 185
    const-string v14, "http://schemas.android.com/apk/res/android"

    .line 186
    .line 187
    invoke-interface {v0, v14, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v13

    .line 191
    const/4 v15, 0x5

    .line 192
    if-eqz v13, :cond_3

    .line 193
    .line 194
    invoke-virtual {v12, v15, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 195
    .line 196
    .line 197
    move-result v13

    .line 198
    move/from16 v25, v13

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_3
    move/from16 v25, v7

    .line 202
    .line 203
    :goto_2
    invoke-virtual {v12}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 204
    .line 205
    .line 206
    move-result v13

    .line 207
    invoke-virtual {v10, v13}, Lj0/a;->d(I)V

    .line 208
    .line 209
    .line 210
    const-string v13, "viewportWidth"

    .line 211
    .line 212
    const/4 v8, 0x7

    .line 213
    const/4 v7, 0x0

    .line 214
    invoke-virtual {v10, v12, v13, v8, v7}, Lj0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 215
    .line 216
    .line 217
    move-result v20

    .line 218
    const-string v13, "viewportHeight"

    .line 219
    .line 220
    const/16 v8, 0x8

    .line 221
    .line 222
    invoke-virtual {v10, v12, v13, v8, v7}, Lj0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 223
    .line 224
    .line 225
    move-result v21

    .line 226
    cmpg-float v13, v20, v7

    .line 227
    .line 228
    if-lez v13, :cond_27

    .line 229
    .line 230
    cmpg-float v13, v21, v7

    .line 231
    .line 232
    if-lez v13, :cond_26

    .line 233
    .line 234
    const/4 v13, 0x3

    .line 235
    invoke-virtual {v12, v13, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 236
    .line 237
    .line 238
    move-result v16

    .line 239
    invoke-virtual {v12}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 240
    .line 241
    .line 242
    move-result v8

    .line 243
    invoke-virtual {v10, v8}, Lj0/a;->d(I)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12, v11, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 247
    .line 248
    .line 249
    move-result v8

    .line 250
    invoke-virtual {v12}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 251
    .line 252
    .line 253
    move-result v7

    .line 254
    invoke-virtual {v10, v7}, Lj0/a;->d(I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 258
    .line 259
    .line 260
    move-result v7

    .line 261
    if-eqz v7, :cond_6

    .line 262
    .line 263
    new-instance v7, Landroid/util/TypedValue;

    .line 264
    .line 265
    invoke-direct {v7}, Landroid/util/TypedValue;-><init>()V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v12, v2, v7}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 269
    .line 270
    .line 271
    iget v7, v7, Landroid/util/TypedValue;->type:I

    .line 272
    .line 273
    if-ne v7, v11, :cond_4

    .line 274
    .line 275
    sget-wide v17, Le0/q;->i:J

    .line 276
    .line 277
    :goto_3
    move-wide/from16 v22, v17

    .line 278
    .line 279
    goto :goto_4

    .line 280
    :cond_4
    invoke-static {v12, v0, v3}, La1/b;->c(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    .line 281
    .line 282
    .line 283
    move-result-object v7

    .line 284
    invoke-virtual {v12}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 285
    .line 286
    .line 287
    move-result v11

    .line 288
    invoke-virtual {v10, v11}, Lj0/a;->d(I)V

    .line 289
    .line 290
    .line 291
    if-eqz v7, :cond_5

    .line 292
    .line 293
    invoke-virtual {v7}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 294
    .line 295
    .line 296
    move-result v7

    .line 297
    invoke-static {v7}, Le0/z;->b(I)J

    .line 298
    .line 299
    .line 300
    move-result-wide v17

    .line 301
    goto :goto_3

    .line 302
    :cond_5
    sget-wide v17, Le0/q;->i:J

    .line 303
    .line 304
    goto :goto_3

    .line 305
    :cond_6
    sget-wide v17, Le0/q;->i:J

    .line 306
    .line 307
    goto :goto_3

    .line 308
    :goto_4
    const/4 v7, 0x6

    .line 309
    const/4 v11, -0x1

    .line 310
    invoke-virtual {v12, v7, v11}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 311
    .line 312
    .line 313
    move-result v2

    .line 314
    invoke-virtual {v12}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 315
    .line 316
    .line 317
    move-result v7

    .line 318
    invoke-virtual {v10, v7}, Lj0/a;->d(I)V

    .line 319
    .line 320
    .line 321
    const/16 v7, 0x9

    .line 322
    .line 323
    if-eq v2, v11, :cond_7

    .line 324
    .line 325
    if-eq v2, v13, :cond_9

    .line 326
    .line 327
    if-eq v2, v15, :cond_7

    .line 328
    .line 329
    if-eq v2, v7, :cond_8

    .line 330
    .line 331
    packed-switch v2, :pswitch_data_0

    .line 332
    .line 333
    .line 334
    :cond_7
    move/from16 v24, v15

    .line 335
    .line 336
    goto :goto_5

    .line 337
    :pswitch_0
    const/16 v24, 0xc

    .line 338
    .line 339
    goto :goto_5

    .line 340
    :pswitch_1
    const/16 v2, 0xe

    .line 341
    .line 342
    move/from16 v24, v2

    .line 343
    .line 344
    goto :goto_5

    .line 345
    :pswitch_2
    const/16 v24, 0xd

    .line 346
    .line 347
    goto :goto_5

    .line 348
    :cond_8
    move/from16 v24, v7

    .line 349
    .line 350
    goto :goto_5

    .line 351
    :cond_9
    move/from16 v24, v13

    .line 352
    .line 353
    :goto_5
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 358
    .line 359
    div-float v18, v16, v2

    .line 360
    .line 361
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 366
    .line 367
    div-float v19, v8, v2

    .line 368
    .line 369
    invoke-virtual {v12}, Landroid/content/res/TypedArray;->recycle()V

    .line 370
    .line 371
    .line 372
    new-instance v16, Li0/c;

    .line 373
    .line 374
    const-string v17, ""

    .line 375
    .line 376
    invoke-direct/range {v16 .. v25}, Li0/c;-><init>(Ljava/lang/String;FFFFJIZ)V

    .line 377
    .line 378
    .line 379
    move-object/from16 v2, v16

    .line 380
    .line 381
    const/4 v8, 0x0

    .line 382
    :goto_6
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 383
    .line 384
    .line 385
    move-result v12

    .line 386
    const/4 v7, 0x1

    .line 387
    if-eq v12, v7, :cond_a

    .line 388
    .line 389
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 390
    .line 391
    .line 392
    move-result v12

    .line 393
    if-ge v12, v7, :cond_b

    .line 394
    .line 395
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 396
    .line 397
    .line 398
    move-result v7

    .line 399
    if-ne v7, v13, :cond_b

    .line 400
    .line 401
    :cond_a
    move-object/from16 v22, v2

    .line 402
    .line 403
    goto/16 :goto_1d

    .line 404
    .line 405
    :cond_b
    iget-object v7, v10, Lj0/a;->a:Landroid/content/res/XmlResourceParser;

    .line 406
    .line 407
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 408
    .line 409
    .line 410
    move-result v12

    .line 411
    iget-object v11, v2, Li0/c;->i:Ljava/util/ArrayList;

    .line 412
    .line 413
    const-string v15, "group"

    .line 414
    .line 415
    move-object/from16 v19, v0

    .line 416
    .line 417
    const/4 v0, 0x2

    .line 418
    if-eq v12, v0, :cond_f

    .line 419
    .line 420
    if-eq v12, v13, :cond_d

    .line 421
    .line 422
    :cond_c
    move-object/from16 v22, v2

    .line 423
    .line 424
    :goto_7
    move/from16 v25, v8

    .line 425
    .line 426
    move-object/from16 v27, v14

    .line 427
    .line 428
    :goto_8
    const/16 v26, 0x1

    .line 429
    .line 430
    goto/16 :goto_1b

    .line 431
    .line 432
    :cond_d
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    invoke-virtual {v15, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result v0

    .line 440
    if-eqz v0, :cond_c

    .line 441
    .line 442
    const/4 v7, 0x1

    .line 443
    add-int/2addr v8, v7

    .line 444
    const/4 v0, 0x0

    .line 445
    :goto_9
    if-ge v0, v8, :cond_e

    .line 446
    .line 447
    invoke-virtual {v2}, Li0/c;->b()V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 451
    .line 452
    .line 453
    move-result v12

    .line 454
    sub-int/2addr v12, v7

    .line 455
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v12

    .line 459
    check-cast v12, Li0/b;

    .line 460
    .line 461
    invoke-static {v11, v7}, Lka/n;->e(Ljava/util/ArrayList;I)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v15

    .line 465
    check-cast v15, Li0/b;

    .line 466
    .line 467
    iget-object v7, v15, Li0/b;->j:Ljava/util/List;

    .line 468
    .line 469
    new-instance v28, Li0/H;

    .line 470
    .line 471
    iget-object v15, v12, Li0/b;->a:Ljava/lang/String;

    .line 472
    .line 473
    iget v13, v12, Li0/b;->b:F

    .line 474
    .line 475
    move/from16 v21, v0

    .line 476
    .line 477
    iget v0, v12, Li0/b;->c:F

    .line 478
    .line 479
    move/from16 v31, v0

    .line 480
    .line 481
    iget v0, v12, Li0/b;->d:F

    .line 482
    .line 483
    move/from16 v32, v0

    .line 484
    .line 485
    iget v0, v12, Li0/b;->e:F

    .line 486
    .line 487
    move/from16 v33, v0

    .line 488
    .line 489
    iget v0, v12, Li0/b;->f:F

    .line 490
    .line 491
    move/from16 v34, v0

    .line 492
    .line 493
    iget v0, v12, Li0/b;->g:F

    .line 494
    .line 495
    move/from16 v35, v0

    .line 496
    .line 497
    iget v0, v12, Li0/b;->h:F

    .line 498
    .line 499
    move/from16 v36, v0

    .line 500
    .line 501
    iget-object v0, v12, Li0/b;->i:Ljava/util/List;

    .line 502
    .line 503
    iget-object v12, v12, Li0/b;->j:Ljava/util/List;

    .line 504
    .line 505
    move-object/from16 v37, v0

    .line 506
    .line 507
    move-object/from16 v38, v12

    .line 508
    .line 509
    move/from16 v30, v13

    .line 510
    .line 511
    move-object/from16 v29, v15

    .line 512
    .line 513
    invoke-direct/range {v28 .. v38}, Li0/H;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V

    .line 514
    .line 515
    .line 516
    move-object/from16 v0, v28

    .line 517
    .line 518
    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    const/16 v26, 0x1

    .line 522
    .line 523
    add-int/lit8 v0, v21, 0x1

    .line 524
    .line 525
    const/4 v7, 0x1

    .line 526
    const/4 v13, 0x3

    .line 527
    goto :goto_9

    .line 528
    :cond_e
    move-object/from16 v22, v2

    .line 529
    .line 530
    move/from16 v26, v7

    .line 531
    .line 532
    move-object/from16 v27, v14

    .line 533
    .line 534
    const/4 v8, 0x0

    .line 535
    goto/16 :goto_1c

    .line 536
    .line 537
    :cond_f
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    if-eqz v0, :cond_c

    .line 542
    .line 543
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 544
    .line 545
    .line 546
    move-result v12

    .line 547
    const v13, -0x624e8b7e

    .line 548
    .line 549
    .line 550
    const-string v21, ""

    .line 551
    .line 552
    if-eq v12, v13, :cond_23

    .line 553
    .line 554
    const v13, 0x346425

    .line 555
    .line 556
    .line 557
    move-object/from16 v22, v2

    .line 558
    .line 559
    const/high16 v2, 0x3f800000    # 1.0f

    .line 560
    .line 561
    if-eq v12, v13, :cond_13

    .line 562
    .line 563
    const v7, 0x5e0f67f

    .line 564
    .line 565
    .line 566
    if-eq v12, v7, :cond_10

    .line 567
    .line 568
    :goto_a
    goto/16 :goto_7

    .line 569
    .line 570
    :cond_10
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    move-result v0

    .line 574
    if-nez v0, :cond_11

    .line 575
    .line 576
    :goto_b
    goto :goto_a

    .line 577
    :cond_11
    sget-object v0, Lj0/b;->b:[I

    .line 578
    .line 579
    invoke-virtual {v10, v4, v3, v9, v0}, Lj0/a;->c(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    const-string v7, "rotation"

    .line 584
    .line 585
    const/4 v12, 0x5

    .line 586
    const/4 v13, 0x0

    .line 587
    invoke-virtual {v10, v0, v7, v12, v13}, Lj0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 588
    .line 589
    .line 590
    move-result v30

    .line 591
    const/4 v7, 0x1

    .line 592
    invoke-virtual {v0, v7, v13}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 593
    .line 594
    .line 595
    move-result v31

    .line 596
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 597
    .line 598
    .line 599
    move-result v7

    .line 600
    invoke-virtual {v10, v7}, Lj0/a;->d(I)V

    .line 601
    .line 602
    .line 603
    const/4 v7, 0x2

    .line 604
    invoke-virtual {v0, v7, v13}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 605
    .line 606
    .line 607
    move-result v32

    .line 608
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 609
    .line 610
    .line 611
    move-result v7

    .line 612
    invoke-virtual {v10, v7}, Lj0/a;->d(I)V

    .line 613
    .line 614
    .line 615
    const-string v7, "scaleX"

    .line 616
    .line 617
    const/4 v12, 0x3

    .line 618
    invoke-virtual {v10, v0, v7, v12, v2}, Lj0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 619
    .line 620
    .line 621
    move-result v33

    .line 622
    const-string v7, "scaleY"

    .line 623
    .line 624
    const/4 v12, 0x4

    .line 625
    invoke-virtual {v10, v0, v7, v12, v2}, Lj0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 626
    .line 627
    .line 628
    move-result v34

    .line 629
    const-string v2, "translateX"

    .line 630
    .line 631
    const/4 v7, 0x6

    .line 632
    invoke-virtual {v10, v0, v2, v7, v13}, Lj0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 633
    .line 634
    .line 635
    move-result v35

    .line 636
    const-string v2, "translateY"

    .line 637
    .line 638
    const/4 v7, 0x7

    .line 639
    invoke-virtual {v10, v0, v2, v7, v13}, Lj0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 640
    .line 641
    .line 642
    move-result v36

    .line 643
    const/4 v2, 0x0

    .line 644
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v7

    .line 648
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 649
    .line 650
    .line 651
    move-result v2

    .line 652
    invoke-virtual {v10, v2}, Lj0/a;->d(I)V

    .line 653
    .line 654
    .line 655
    if-nez v7, :cond_12

    .line 656
    .line 657
    move-object/from16 v29, v21

    .line 658
    .line 659
    goto :goto_c

    .line 660
    :cond_12
    move-object/from16 v29, v7

    .line 661
    .line 662
    :goto_c
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 663
    .line 664
    .line 665
    sget v0, Li0/I;->a:I

    .line 666
    .line 667
    sget-object v37, Lff/v;->a:Lff/v;

    .line 668
    .line 669
    invoke-virtual/range {v22 .. v22}, Li0/c;->b()V

    .line 670
    .line 671
    .line 672
    new-instance v28, Li0/b;

    .line 673
    .line 674
    const/16 v38, 0x200

    .line 675
    .line 676
    invoke-direct/range {v28 .. v38}, Li0/b;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;I)V

    .line 677
    .line 678
    .line 679
    move-object/from16 v0, v28

    .line 680
    .line 681
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 682
    .line 683
    .line 684
    move-object/from16 v27, v14

    .line 685
    .line 686
    :goto_d
    const/16 v26, 0x1

    .line 687
    .line 688
    goto/16 :goto_1c

    .line 689
    .line 690
    :cond_13
    const-string v12, "path"

    .line 691
    .line 692
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 693
    .line 694
    .line 695
    move-result v0

    .line 696
    if-nez v0, :cond_14

    .line 697
    .line 698
    goto :goto_b

    .line 699
    :cond_14
    sget-object v0, Lj0/b;->c:[I

    .line 700
    .line 701
    invoke-virtual {v10, v4, v3, v9, v0}, Lj0/a;->c(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    const-string v12, "pathData"

    .line 706
    .line 707
    invoke-interface {v7, v14, v12}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object v13

    .line 711
    if-eqz v13, :cond_22

    .line 712
    .line 713
    const/4 v13, 0x0

    .line 714
    invoke-virtual {v0, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 715
    .line 716
    .line 717
    move-result-object v15

    .line 718
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 719
    .line 720
    .line 721
    move-result v13

    .line 722
    invoke-virtual {v10, v13}, Lj0/a;->d(I)V

    .line 723
    .line 724
    .line 725
    if-nez v15, :cond_15

    .line 726
    .line 727
    move-object/from16 v29, v21

    .line 728
    .line 729
    :goto_e
    const/4 v13, 0x2

    .line 730
    goto :goto_f

    .line 731
    :cond_15
    move-object/from16 v29, v15

    .line 732
    .line 733
    goto :goto_e

    .line 734
    :goto_f
    invoke-virtual {v0, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v15

    .line 738
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 739
    .line 740
    .line 741
    move-result v13

    .line 742
    invoke-virtual {v10, v13}, Lj0/a;->d(I)V

    .line 743
    .line 744
    .line 745
    invoke-static {v15}, Li0/I;->a(Ljava/lang/String;)Ljava/util/List;

    .line 746
    .line 747
    .line 748
    move-result-object v13

    .line 749
    const-string v15, "fillColor"

    .line 750
    .line 751
    const/4 v2, 0x1

    .line 752
    invoke-static {v0, v7, v3, v15, v2}, La1/b;->d(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)LE4/n;

    .line 753
    .line 754
    .line 755
    move-result-object v15

    .line 756
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 757
    .line 758
    .line 759
    move-result v2

    .line 760
    invoke-virtual {v10, v2}, Lj0/a;->d(I)V

    .line 761
    .line 762
    .line 763
    const-string v2, "fillAlpha"

    .line 764
    .line 765
    move/from16 v25, v8

    .line 766
    .line 767
    move-object/from16 v27, v14

    .line 768
    .line 769
    const/16 v8, 0xc

    .line 770
    .line 771
    const/high16 v14, 0x3f800000    # 1.0f

    .line 772
    .line 773
    invoke-virtual {v10, v0, v2, v8, v14}, Lj0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 774
    .line 775
    .line 776
    move-result v33

    .line 777
    const-string v2, "strokeLineCap"

    .line 778
    .line 779
    const/4 v8, -0x1

    .line 780
    const/16 v14, 0x8

    .line 781
    .line 782
    invoke-virtual {v10, v0, v2, v14, v8}, Lj0/a;->b(Landroid/content/res/TypedArray;Ljava/lang/String;II)I

    .line 783
    .line 784
    .line 785
    move-result v2

    .line 786
    if-eqz v2, :cond_18

    .line 787
    .line 788
    const/4 v14, 0x1

    .line 789
    if-eq v2, v14, :cond_17

    .line 790
    .line 791
    const/4 v14, 0x2

    .line 792
    if-eq v2, v14, :cond_16

    .line 793
    .line 794
    :goto_10
    const/16 v37, 0x0

    .line 795
    .line 796
    goto :goto_11

    .line 797
    :cond_16
    move/from16 v37, v14

    .line 798
    .line 799
    goto :goto_11

    .line 800
    :cond_17
    const/4 v14, 0x2

    .line 801
    const/16 v37, 0x1

    .line 802
    .line 803
    goto :goto_11

    .line 804
    :cond_18
    const/4 v14, 0x2

    .line 805
    goto :goto_10

    .line 806
    :goto_11
    const-string v2, "strokeLineJoin"

    .line 807
    .line 808
    const/16 v14, 0x9

    .line 809
    .line 810
    invoke-virtual {v10, v0, v2, v14, v8}, Lj0/a;->b(Landroid/content/res/TypedArray;Ljava/lang/String;II)I

    .line 811
    .line 812
    .line 813
    move-result v2

    .line 814
    if-eqz v2, :cond_1a

    .line 815
    .line 816
    const/4 v8, 0x1

    .line 817
    if-eq v2, v8, :cond_19

    .line 818
    .line 819
    const/16 v38, 0x2

    .line 820
    .line 821
    goto :goto_12

    .line 822
    :cond_19
    const/16 v38, 0x1

    .line 823
    .line 824
    goto :goto_12

    .line 825
    :cond_1a
    const/16 v38, 0x0

    .line 826
    .line 827
    :goto_12
    const-string v2, "strokeMiterLimit"

    .line 828
    .line 829
    const/16 v8, 0xa

    .line 830
    .line 831
    const/high16 v14, 0x3f800000    # 1.0f

    .line 832
    .line 833
    invoke-virtual {v10, v0, v2, v8, v14}, Lj0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 834
    .line 835
    .line 836
    move-result v39

    .line 837
    const-string v2, "strokeColor"

    .line 838
    .line 839
    const/4 v8, 0x3

    .line 840
    invoke-static {v0, v7, v3, v2, v8}, La1/b;->d(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)LE4/n;

    .line 841
    .line 842
    .line 843
    move-result-object v2

    .line 844
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 845
    .line 846
    .line 847
    move-result v7

    .line 848
    invoke-virtual {v10, v7}, Lj0/a;->d(I)V

    .line 849
    .line 850
    .line 851
    const-string v7, "strokeAlpha"

    .line 852
    .line 853
    const/16 v8, 0xb

    .line 854
    .line 855
    invoke-virtual {v10, v0, v7, v8, v14}, Lj0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 856
    .line 857
    .line 858
    move-result v35

    .line 859
    const-string v7, "strokeWidth"

    .line 860
    .line 861
    const/4 v8, 0x4

    .line 862
    invoke-virtual {v10, v0, v7, v8, v14}, Lj0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 863
    .line 864
    .line 865
    move-result v36

    .line 866
    const-string v7, "trimPathEnd"

    .line 867
    .line 868
    const/4 v8, 0x6

    .line 869
    invoke-virtual {v10, v0, v7, v8, v14}, Lj0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 870
    .line 871
    .line 872
    move-result v41

    .line 873
    const-string v7, "trimPathOffset"

    .line 874
    .line 875
    const/4 v8, 0x0

    .line 876
    const/4 v14, 0x7

    .line 877
    invoke-virtual {v10, v0, v7, v14, v8}, Lj0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 878
    .line 879
    .line 880
    move-result v42

    .line 881
    const-string v7, "trimPathStart"

    .line 882
    .line 883
    const/4 v14, 0x5

    .line 884
    invoke-virtual {v10, v0, v7, v14, v8}, Lj0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 885
    .line 886
    .line 887
    move-result v40

    .line 888
    const-string v7, "fillType"

    .line 889
    .line 890
    const/4 v8, 0x0

    .line 891
    const/16 v14, 0xd

    .line 892
    .line 893
    invoke-virtual {v10, v0, v7, v14, v8}, Lj0/a;->b(Landroid/content/res/TypedArray;Ljava/lang/String;II)I

    .line 894
    .line 895
    .line 896
    move-result v7

    .line 897
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 898
    .line 899
    .line 900
    iget-object v0, v15, LE4/n;->c:Ljava/lang/Object;

    .line 901
    .line 902
    check-cast v0, Landroid/graphics/Shader;

    .line 903
    .line 904
    if-eqz v0, :cond_1b

    .line 905
    .line 906
    goto :goto_13

    .line 907
    :cond_1b
    iget v8, v15, LE4/n;->b:I

    .line 908
    .line 909
    if-eqz v8, :cond_1d

    .line 910
    .line 911
    :goto_13
    if-eqz v0, :cond_1c

    .line 912
    .line 913
    new-instance v8, Le0/n;

    .line 914
    .line 915
    invoke-direct {v8, v0}, Le0/n;-><init>(Landroid/graphics/Shader;)V

    .line 916
    .line 917
    .line 918
    :goto_14
    move-object/from16 v32, v8

    .line 919
    .line 920
    goto :goto_15

    .line 921
    :cond_1c
    new-instance v8, Le0/G;

    .line 922
    .line 923
    iget v0, v15, LE4/n;->b:I

    .line 924
    .line 925
    invoke-static {v0}, Le0/z;->b(I)J

    .line 926
    .line 927
    .line 928
    move-result-wide v14

    .line 929
    invoke-direct {v8, v14, v15}, Le0/G;-><init>(J)V

    .line 930
    .line 931
    .line 932
    goto :goto_14

    .line 933
    :cond_1d
    const/16 v32, 0x0

    .line 934
    .line 935
    :goto_15
    iget-object v0, v2, LE4/n;->c:Ljava/lang/Object;

    .line 936
    .line 937
    check-cast v0, Landroid/graphics/Shader;

    .line 938
    .line 939
    if-eqz v0, :cond_1e

    .line 940
    .line 941
    goto :goto_16

    .line 942
    :cond_1e
    iget v8, v2, LE4/n;->b:I

    .line 943
    .line 944
    if-eqz v8, :cond_20

    .line 945
    .line 946
    :goto_16
    if-eqz v0, :cond_1f

    .line 947
    .line 948
    new-instance v2, Le0/n;

    .line 949
    .line 950
    invoke-direct {v2, v0}, Le0/n;-><init>(Landroid/graphics/Shader;)V

    .line 951
    .line 952
    .line 953
    move-object/from16 v34, v2

    .line 954
    .line 955
    goto :goto_17

    .line 956
    :cond_1f
    new-instance v0, Le0/G;

    .line 957
    .line 958
    iget v2, v2, LE4/n;->b:I

    .line 959
    .line 960
    invoke-static {v2}, Le0/z;->b(I)J

    .line 961
    .line 962
    .line 963
    move-result-wide v14

    .line 964
    invoke-direct {v0, v14, v15}, Le0/G;-><init>(J)V

    .line 965
    .line 966
    .line 967
    move-object/from16 v34, v0

    .line 968
    .line 969
    goto :goto_17

    .line 970
    :cond_20
    const/16 v34, 0x0

    .line 971
    .line 972
    :goto_17
    if-nez v7, :cond_21

    .line 973
    .line 974
    const/16 v31, 0x0

    .line 975
    .line 976
    goto :goto_18

    .line 977
    :cond_21
    const/16 v31, 0x1

    .line 978
    .line 979
    :goto_18
    invoke-static {v13, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 980
    .line 981
    .line 982
    invoke-virtual/range {v22 .. v22}, Li0/c;->b()V

    .line 983
    .line 984
    .line 985
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 986
    .line 987
    .line 988
    move-result v0

    .line 989
    const/16 v26, 0x1

    .line 990
    .line 991
    add-int/lit8 v0, v0, -0x1

    .line 992
    .line 993
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 994
    .line 995
    .line 996
    move-result-object v0

    .line 997
    check-cast v0, Li0/b;

    .line 998
    .line 999
    iget-object v0, v0, Li0/b;->j:Ljava/util/List;

    .line 1000
    .line 1001
    new-instance v28, Li0/O;

    .line 1002
    .line 1003
    move-object/from16 v30, v13

    .line 1004
    .line 1005
    invoke-direct/range {v28 .. v42}, Li0/O;-><init>(Ljava/lang/String;Ljava/util/List;ILe0/m;FLe0/m;FFIIFFFF)V

    .line 1006
    .line 1007
    .line 1008
    move-object/from16 v2, v28

    .line 1009
    .line 1010
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1011
    .line 1012
    .line 1013
    move/from16 v8, v25

    .line 1014
    .line 1015
    goto/16 :goto_d

    .line 1016
    .line 1017
    :cond_22
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1018
    .line 1019
    const-string v1, "No path data available"

    .line 1020
    .line 1021
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1022
    .line 1023
    .line 1024
    throw v0

    .line 1025
    :cond_23
    move-object/from16 v22, v2

    .line 1026
    .line 1027
    move/from16 v25, v8

    .line 1028
    .line 1029
    move-object/from16 v27, v14

    .line 1030
    .line 1031
    const-string v2, "clip-path"

    .line 1032
    .line 1033
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1034
    .line 1035
    .line 1036
    move-result v0

    .line 1037
    if-nez v0, :cond_24

    .line 1038
    .line 1039
    goto/16 :goto_8

    .line 1040
    .line 1041
    :cond_24
    sget-object v0, Lj0/b;->d:[I

    .line 1042
    .line 1043
    invoke-virtual {v10, v4, v3, v9, v0}, Lj0/a;->c(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v0

    .line 1047
    const/4 v2, 0x0

    .line 1048
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v7

    .line 1052
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 1053
    .line 1054
    .line 1055
    move-result v2

    .line 1056
    invoke-virtual {v10, v2}, Lj0/a;->d(I)V

    .line 1057
    .line 1058
    .line 1059
    if-nez v7, :cond_25

    .line 1060
    .line 1061
    move-object/from16 v29, v21

    .line 1062
    .line 1063
    :goto_19
    const/4 v7, 0x1

    .line 1064
    goto :goto_1a

    .line 1065
    :cond_25
    move-object/from16 v29, v7

    .line 1066
    .line 1067
    goto :goto_19

    .line 1068
    :goto_1a
    invoke-virtual {v0, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v2

    .line 1072
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 1073
    .line 1074
    .line 1075
    move-result v7

    .line 1076
    invoke-virtual {v10, v7}, Lj0/a;->d(I)V

    .line 1077
    .line 1078
    .line 1079
    invoke-static {v2}, Li0/I;->a(Ljava/lang/String;)Ljava/util/List;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v2

    .line 1083
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 1084
    .line 1085
    .line 1086
    const-string v0, "clipPathData"

    .line 1087
    .line 1088
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1089
    .line 1090
    .line 1091
    invoke-virtual/range {v22 .. v22}, Li0/c;->b()V

    .line 1092
    .line 1093
    .line 1094
    new-instance v28, Li0/b;

    .line 1095
    .line 1096
    const/16 v38, 0x200

    .line 1097
    .line 1098
    const/16 v30, 0x0

    .line 1099
    .line 1100
    const/16 v31, 0x0

    .line 1101
    .line 1102
    const/16 v32, 0x0

    .line 1103
    .line 1104
    const/high16 v33, 0x3f800000    # 1.0f

    .line 1105
    .line 1106
    const/high16 v34, 0x3f800000    # 1.0f

    .line 1107
    .line 1108
    const/16 v35, 0x0

    .line 1109
    .line 1110
    const/16 v36, 0x0

    .line 1111
    .line 1112
    move-object/from16 v37, v2

    .line 1113
    .line 1114
    invoke-direct/range {v28 .. v38}, Li0/b;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;I)V

    .line 1115
    .line 1116
    .line 1117
    move-object/from16 v0, v28

    .line 1118
    .line 1119
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1120
    .line 1121
    .line 1122
    const/16 v26, 0x1

    .line 1123
    .line 1124
    add-int/lit8 v8, v25, 0x1

    .line 1125
    .line 1126
    goto :goto_1c

    .line 1127
    :goto_1b
    move/from16 v8, v25

    .line 1128
    .line 1129
    :goto_1c
    invoke-interface/range {v19 .. v19}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 1130
    .line 1131
    .line 1132
    move-object/from16 v0, v19

    .line 1133
    .line 1134
    move-object/from16 v2, v22

    .line 1135
    .line 1136
    move-object/from16 v14, v27

    .line 1137
    .line 1138
    const/16 v7, 0x9

    .line 1139
    .line 1140
    const/4 v11, -0x1

    .line 1141
    const/4 v13, 0x3

    .line 1142
    const/4 v15, 0x5

    .line 1143
    goto/16 :goto_6

    .line 1144
    .line 1145
    :goto_1d
    new-instance v0, Lw0/a;

    .line 1146
    .line 1147
    invoke-virtual/range {v22 .. v22}, Li0/c;->a()Li0/d;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v2

    .line 1151
    iget v3, v10, Lj0/a;->b:I

    .line 1152
    .line 1153
    invoke-direct {v0, v2, v3}, Lw0/a;-><init>(Li0/d;I)V

    .line 1154
    .line 1155
    .line 1156
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 1157
    .line 1158
    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v5, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1162
    .line 1163
    .line 1164
    move-object v10, v0

    .line 1165
    const/4 v2, 0x0

    .line 1166
    goto :goto_1e

    .line 1167
    :cond_26
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 1168
    .line 1169
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1170
    .line 1171
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1172
    .line 1173
    .line 1174
    invoke-virtual {v12}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v2

    .line 1178
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1179
    .line 1180
    .line 1181
    const-string v2, "<VectorGraphic> tag requires viewportHeight > 0"

    .line 1182
    .line 1183
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v1

    .line 1190
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 1191
    .line 1192
    .line 1193
    throw v0

    .line 1194
    :cond_27
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 1195
    .line 1196
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1197
    .line 1198
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual {v12}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v2

    .line 1205
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1206
    .line 1207
    .line 1208
    const-string v2, "<VectorGraphic> tag requires viewportWidth > 0"

    .line 1209
    .line 1210
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1211
    .line 1212
    .line 1213
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v1

    .line 1217
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 1218
    .line 1219
    .line 1220
    throw v0

    .line 1221
    :cond_28
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1222
    .line 1223
    invoke-direct {v0, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1224
    .line 1225
    .line 1226
    throw v0

    .line 1227
    :cond_29
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 1228
    .line 1229
    const-string v1, "No start tag found"

    .line 1230
    .line 1231
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 1232
    .line 1233
    .line 1234
    throw v0

    .line 1235
    :cond_2a
    move v2, v7

    .line 1236
    :goto_1e
    invoke-virtual {v1, v2}, LN/o;->p(Z)V

    .line 1237
    .line 1238
    .line 1239
    iget-object v0, v10, Lw0/a;->a:Li0/d;

    .line 1240
    .line 1241
    invoke-static {v0, v1}, Lic/d;->L(Li0/d;LN/o;)Li0/L;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v0

    .line 1245
    invoke-virtual {v1, v2}, LN/o;->p(Z)V

    .line 1246
    .line 1247
    .line 1248
    const/4 v2, 0x0

    .line 1249
    goto :goto_22

    .line 1250
    :cond_2b
    const v2, -0x2c01086c

    .line 1251
    .line 1252
    .line 1253
    invoke-virtual {v1, v2}, LN/o;->M(I)V

    .line 1254
    .line 1255
    .line 1256
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v2

    .line 1260
    const v3, 0x1e7b2b64

    .line 1261
    .line 1262
    .line 1263
    invoke-virtual {v1, v3}, LN/o;->M(I)V

    .line 1264
    .line 1265
    .line 1266
    invoke-virtual {v1, v5}, LN/o;->e(Ljava/lang/Object;)Z

    .line 1267
    .line 1268
    .line 1269
    move-result v3

    .line 1270
    invoke-virtual {v1, v2}, LN/o;->e(Ljava/lang/Object;)Z

    .line 1271
    .line 1272
    .line 1273
    move-result v2

    .line 1274
    or-int/2addr v2, v3

    .line 1275
    invoke-virtual {v1}, LN/o;->F()Ljava/lang/Object;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v3

    .line 1279
    if-nez v2, :cond_2c

    .line 1280
    .line 1281
    if-ne v3, v6, :cond_2d

    .line 1282
    .line 1283
    :cond_2c
    const/4 v2, 0x0

    .line 1284
    goto :goto_20

    .line 1285
    :cond_2d
    :goto_1f
    const/4 v2, 0x0

    .line 1286
    goto :goto_21

    .line 1287
    :goto_20
    :try_start_0
    invoke-virtual {v4, v0, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v0

    .line 1291
    if-eqz v0, :cond_2e

    .line 1292
    .line 1293
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 1294
    .line 1295
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v0

    .line 1299
    const-string v2, "res.getDrawable(id, null\u2026as BitmapDrawable).bitmap"

    .line 1300
    .line 1301
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1302
    .line 1303
    .line 1304
    new-instance v3, Le0/d;

    .line 1305
    .line 1306
    invoke-direct {v3, v0}, Le0/d;-><init>(Landroid/graphics/Bitmap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1307
    .line 1308
    .line 1309
    invoke-virtual {v1, v3}, LN/o;->U(Ljava/lang/Object;)V

    .line 1310
    .line 1311
    .line 1312
    goto :goto_1f

    .line 1313
    :goto_21
    invoke-virtual {v1, v2}, LN/o;->p(Z)V

    .line 1314
    .line 1315
    .line 1316
    move-object v5, v3

    .line 1317
    check-cast v5, Le0/d;

    .line 1318
    .line 1319
    new-instance v4, Lh0/a;

    .line 1320
    .line 1321
    sget-wide v6, LL0/g;->b:J

    .line 1322
    .line 1323
    iget-object v0, v5, Le0/d;->a:Landroid/graphics/Bitmap;

    .line 1324
    .line 1325
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1326
    .line 1327
    .line 1328
    move-result v0

    .line 1329
    iget-object v2, v5, Le0/d;->a:Landroid/graphics/Bitmap;

    .line 1330
    .line 1331
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1332
    .line 1333
    .line 1334
    move-result v2

    .line 1335
    invoke-static {v0, v2}, LBa/c;->a(II)J

    .line 1336
    .line 1337
    .line 1338
    move-result-wide v8

    .line 1339
    invoke-direct/range {v4 .. v9}, Lh0/a;-><init>(Le0/d;JJ)V

    .line 1340
    .line 1341
    .line 1342
    const/4 v2, 0x0

    .line 1343
    invoke-virtual {v1, v2}, LN/o;->p(Z)V

    .line 1344
    .line 1345
    .line 1346
    move-object v0, v4

    .line 1347
    :goto_22
    invoke-virtual {v1, v2}, LN/o;->p(Z)V

    .line 1348
    .line 1349
    .line 1350
    return-object v0

    .line 1351
    :cond_2e
    :try_start_1
    new-instance v0, Ljava/lang/NullPointerException;

    .line 1352
    .line 1353
    const-string v1, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable"

    .line 1354
    .line 1355
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1356
    .line 1357
    .line 1358
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1359
    :catchall_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1360
    .line 1361
    invoke-direct {v0, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1362
    .line 1363
    .line 1364
    throw v0

    .line 1365
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static I(Landroid/content/Context;LC6/l;Z)V
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_2

    .line 6
    .line 7
    invoke-static {p0}, Lff/B;->w(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "proxy_retention"

    .line 12
    .line 13
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-ne v0, p2, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-object p1, p1, LC6/l;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Lc7/b;

    .line 30
    .line 31
    iget-object v0, p1, Lc7/b;->c:LM2/e;

    .line 32
    .line 33
    invoke-virtual {v0}, LM2/e;->e()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const v2, 0xe5ee4e0

    .line 38
    .line 39
    .line 40
    if-lt v0, v2, :cond_1

    .line 41
    .line 42
    new-instance v0, Landroid/os/Bundle;

    .line 43
    .line 44
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1, p2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p1, Lc7/b;->b:Landroid/content/Context;

    .line 51
    .line 52
    invoke-static {p1}, Lc7/l;->k(Landroid/content/Context;)Lc7/l;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    new-instance v1, Lc7/k;

    .line 57
    .line 58
    monitor-enter p1

    .line 59
    :try_start_0
    iget v2, p1, Lc7/l;->a:I

    .line 60
    .line 61
    add-int/lit8 v3, v2, 0x1

    .line 62
    .line 63
    iput v3, p1, Lc7/l;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    monitor-exit p1

    .line 66
    const/4 v3, 0x4

    .line 67
    const/4 v4, 0x0

    .line 68
    invoke-direct {v1, v2, v3, v0, v4}, Lc7/k;-><init>(IILandroid/os/Bundle;I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v1}, Lc7/l;->l(Lc7/k;)Lcom/google/android/gms/tasks/Task;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    goto :goto_0

    .line 76
    :catchall_0
    move-exception p0

    .line 77
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    throw p0

    .line 79
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 80
    .line 81
    const-string v0, "SERVICE_NOT_AVAILABLE"

    .line 82
    .line 83
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    :goto_0
    new-instance v0, Lcom/applovin/impl/T0;

    .line 91
    .line 92
    const/4 v1, 0x1

    .line 93
    invoke-direct {v0, v1}, Lcom/applovin/impl/T0;-><init>(I)V

    .line 94
    .line 95
    .line 96
    new-instance v1, LC8/e;

    .line 97
    .line 98
    const/4 v2, 0x2

    .line 99
    invoke-direct {v1, v2, p0, p2}, LC8/e;-><init>(ILjava/lang/Object;Z)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 103
    .line 104
    .line 105
    :cond_2
    return-void
.end method

.method public static J(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1}, Lq/p1;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    sget-object v0, Lq/r1;->k:Lq/r1;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, v0, Lq/r1;->a:Landroid/view/View;

    .line 17
    .line 18
    if-ne v0, p0, :cond_1

    .line 19
    .line 20
    invoke-static {v1}, Lq/r1;->b(Lq/r1;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    sget-object p1, Lq/r1;->l:Lq/r1;

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    iget-object v0, p1, Lq/r1;->a:Landroid/view/View;

    .line 34
    .line 35
    if-ne v0, p0, :cond_2

    .line 36
    .line 37
    invoke-virtual {p1}, Lq/r1;->a()V

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-virtual {p0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    invoke-virtual {p0, p1}, Landroid/view/View;->setLongClickable(Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v1}, Landroid/view/View;->setOnHoverListener(Landroid/view/View$OnHoverListener;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    new-instance v0, Lq/r1;

    .line 52
    .line 53
    invoke-direct {v0, p0, p1}, Lq/r1;-><init>(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public static K(Luc/f;Lkd/l;)V
    .locals 5

    .line 1
    const-string v0, "binaryMessenger"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p1, Lkd/l;->a:LC8/i;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, LC8/i;->q()Luc/n;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, Lkd/b;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    :goto_0
    new-instance v1, LVa/X7;

    .line 23
    .line 24
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getCName"

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    new-instance v2, Lkd/C;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-direct {v2, p1, v4}, Lkd/C;-><init>(Lkd/l;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 43
    .line 44
    .line 45
    :goto_1
    new-instance v1, LVa/X7;

    .line 46
    .line 47
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getDName"

    .line 48
    .line 49
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    new-instance v2, Lkd/C;

    .line 55
    .line 56
    const/4 v4, 0x1

    .line 57
    invoke-direct {v2, p1, v4}, Lkd/C;-><init>(Lkd/l;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 65
    .line 66
    .line 67
    :goto_2
    new-instance v1, LVa/X7;

    .line 68
    .line 69
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getOName"

    .line 70
    .line 71
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    new-instance v2, Lkd/C;

    .line 77
    .line 78
    const/4 v4, 0x2

    .line 79
    invoke-direct {v2, p1, v4}, Lkd/C;-><init>(Lkd/l;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_3
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 87
    .line 88
    .line 89
    :goto_3
    new-instance v1, LVa/X7;

    .line 90
    .line 91
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getUName"

    .line 92
    .line 93
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    if-eqz p1, :cond_4

    .line 97
    .line 98
    new-instance p0, Lkd/C;

    .line 99
    .line 100
    const/4 v0, 0x3

    .line 101
    invoke-direct {p0, p1, v0}, Lkd/C;-><init>(Lkd/l;I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, p0}, LVa/X7;->n(Luc/b;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_4
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public static final L(LJf/q;ZLJf/q;Ltf/p;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    instance-of v1, p3, Llf/a;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    invoke-static {p3, p2, p0}, LA6/h;->S(Ltf/p;Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    goto :goto_1

    .line 11
    :catchall_0
    move-exception p2

    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-exception p1

    .line 14
    goto :goto_4

    .line 15
    :cond_0
    const/4 v1, 0x2

    .line 16
    invoke-static {v1, p3}, Lkotlin/jvm/internal/K;->e(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p3, p2, p0}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p2
    :try_end_0
    .catch LEf/N; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_1

    .line 24
    :goto_0
    new-instance p3, LEf/x;

    .line 25
    .line 26
    invoke-direct {p3, v0, p2}, LEf/x;-><init>(ZLjava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    move-object p2, p3

    .line 30
    :goto_1
    sget-object p3, Lkf/a;->a:Lkf/a;

    .line 31
    .line 32
    if-ne p2, p3, :cond_1

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_1
    invoke-virtual {p0, p2}, LEf/z0;->L(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sget-object v1, LEf/H;->e:LH6/g;

    .line 40
    .line 41
    if-ne v0, v1, :cond_2

    .line 42
    .line 43
    :goto_2
    return-object p3

    .line 44
    :cond_2
    invoke-virtual {p0}, LJf/q;->b0()V

    .line 45
    .line 46
    .line 47
    instance-of p3, v0, LEf/x;

    .line 48
    .line 49
    if-eqz p3, :cond_5

    .line 50
    .line 51
    if-nez p1, :cond_4

    .line 52
    .line 53
    move-object p1, v0

    .line 54
    check-cast p1, LEf/x;

    .line 55
    .line 56
    iget-object p1, p1, LEf/x;->a:Ljava/lang/Throwable;

    .line 57
    .line 58
    instance-of p3, p1, LEf/L0;

    .line 59
    .line 60
    if-eqz p3, :cond_4

    .line 61
    .line 62
    check-cast p1, LEf/L0;

    .line 63
    .line 64
    iget-object p1, p1, LEf/L0;->a:LEf/M0;

    .line 65
    .line 66
    if-ne p1, p0, :cond_4

    .line 67
    .line 68
    instance-of p0, p2, LEf/x;

    .line 69
    .line 70
    if-nez p0, :cond_3

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_3
    check-cast p2, LEf/x;

    .line 74
    .line 75
    iget-object p0, p2, LEf/x;->a:Ljava/lang/Throwable;

    .line 76
    .line 77
    throw p0

    .line 78
    :cond_4
    check-cast v0, LEf/x;

    .line 79
    .line 80
    iget-object p0, v0, LEf/x;->a:Ljava/lang/Throwable;

    .line 81
    .line 82
    throw p0

    .line 83
    :cond_5
    invoke-static {v0}, LEf/H;->N(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    :goto_3
    return-object p2

    .line 88
    :goto_4
    new-instance p2, LEf/x;

    .line 89
    .line 90
    iget-object p1, p1, LEf/N;->a:Ljava/lang/Throwable;

    .line 91
    .line 92
    invoke-direct {p2, v0, p1}, LEf/x;-><init>(ZLjava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, p2}, LEf/z0;->K(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    throw p1
.end method

.method public static final M(Lb1/c;)LE/C;
    .locals 4

    .line 1
    new-instance v0, LE/C;

    .line 2
    .line 3
    iget v1, p0, Lb1/c;->a:I

    .line 4
    .line 5
    iget v2, p0, Lb1/c;->b:I

    .line 6
    .line 7
    iget v3, p0, Lb1/c;->c:I

    .line 8
    .line 9
    iget p0, p0, Lb1/c;->d:I

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, v3, p0}, LE/C;-><init>(IIII)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static final N(Ljava/util/Map;)Ljava/util/Map;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ljava/util/Map$Entry;

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {v0, p0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string v0, "with(...)"

    .line 33
    .line 34
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object p0
.end method

.method public static O(Landroid/os/Bundle;Landroid/os/Bundle;)Z
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p0, :cond_b

    .line 4
    .line 5
    if-eqz p1, :cond_b

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/os/BaseBundle;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {p1}, Landroid/os/BaseBundle;->size()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eq v2, v3, :cond_0

    .line 16
    .line 17
    return v1

    .line 18
    :cond_0
    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_a

    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-nez v4, :cond_2

    .line 43
    .line 44
    return v1

    .line 45
    :cond_2
    invoke-virtual {p0, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    if-eqz v4, :cond_9

    .line 54
    .line 55
    if-nez v3, :cond_3

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    instance-of v5, v4, Landroid/os/Bundle;

    .line 59
    .line 60
    if-eqz v5, :cond_5

    .line 61
    .line 62
    instance-of v5, v3, Landroid/os/Bundle;

    .line 63
    .line 64
    if-eqz v5, :cond_4

    .line 65
    .line 66
    check-cast v4, Landroid/os/Bundle;

    .line 67
    .line 68
    check-cast v3, Landroid/os/Bundle;

    .line 69
    .line 70
    invoke-static {v4, v3}, Lff/B;->O(Landroid/os/Bundle;Landroid/os/Bundle;)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-nez v3, :cond_1

    .line 75
    .line 76
    :cond_4
    return v1

    .line 77
    :cond_5
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v5}, Ljava/lang/Class;->isArray()Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_8

    .line 86
    .line 87
    invoke-static {v4}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    invoke-virtual {v6}, Ljava/lang/Class;->isArray()Z

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    if-eqz v6, :cond_7

    .line 100
    .line 101
    invoke-static {v3}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    if-ne v5, v6, :cond_7

    .line 106
    .line 107
    move v6, v1

    .line 108
    :goto_0
    if-ge v6, v5, :cond_1

    .line 109
    .line 110
    invoke-static {v4, v6}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    invoke-static {v3, v6}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    invoke-static {v7, v8}, Lcom/google/android/gms/common/internal/v;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    if-nez v7, :cond_6

    .line 123
    .line 124
    return v1

    .line 125
    :cond_6
    add-int/lit8 v6, v6, 0x1

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_7
    return v1

    .line 129
    :cond_8
    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-nez v3, :cond_1

    .line 134
    .line 135
    return v1

    .line 136
    :cond_9
    :goto_1
    move-object p1, v3

    .line 137
    move-object p0, v4

    .line 138
    goto :goto_2

    .line 139
    :cond_a
    return v0

    .line 140
    :cond_b
    :goto_2
    if-nez p0, :cond_c

    .line 141
    .line 142
    if-nez p1, :cond_c

    .line 143
    .line 144
    return v0

    .line 145
    :cond_c
    return v1
.end method

.method public static final a(Lkotlinx/serialization/KSerializer;)LWf/E;
    .locals 3

    .line 1
    sget-object v0, LWf/q0;->a:LWf/q0;

    .line 2
    .line 3
    new-instance v1, LWf/E;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, v0, p0, v2}, LWf/E;-><init>(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;I)V

    .line 7
    .line 8
    .line 9
    return-object v1
.end method

.method public static final b(LZ/d;LE/F;JJJLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/z;Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;Lcom/moloco/sdk/internal/ortb/model/D;LN/o;)LV/d;
    .locals 14

    .line 1
    move-object/from16 v0, p11

    .line 2
    .line 3
    const-string v1, "alignment"

    .line 4
    .line 5
    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "padding"

    .line 9
    .line 10
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v1, "afterCountdownButtonPart"

    .line 14
    .line 15
    move-object/from16 v6, p8

    .line 16
    .line 17
    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const v1, -0x17c4b7cc

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, LN/o;->M(I)V

    .line 24
    .line 25
    .line 26
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/l;

    .line 27
    .line 28
    move-object v3, p0

    .line 29
    move-object v4, p1

    .line 30
    move-wide/from16 v7, p2

    .line 31
    .line 32
    move-wide/from16 v9, p4

    .line 33
    .line 34
    move-wide/from16 v11, p6

    .line 35
    .line 36
    move-object/from16 v5, p9

    .line 37
    .line 38
    move-object/from16 v13, p10

    .line 39
    .line 40
    invoke-direct/range {v2 .. v13}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/l;-><init>(LZ/d;LE/F;Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/z;JJJLcom/moloco/sdk/internal/ortb/model/D;)V

    .line 41
    .line 42
    .line 43
    const p0, -0xc06df09

    .line 44
    .line 45
    .line 46
    invoke-static {v0, p0, v2}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const/4 p1, 0x0

    .line 51
    invoke-virtual {v0, p1}, LN/o;->p(Z)V

    .line 52
    .line 53
    .line 54
    return-object p0
.end method

.method public static c(Landroid/view/View;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p0, "notAttached"

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    const-string p0, "viewGone"

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    const/4 v1, 0x4

    .line 22
    if-ne v0, v1, :cond_2

    .line 23
    .line 24
    const-string p0, "viewInvisible"

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_2
    if-eqz v0, :cond_3

    .line 28
    .line 29
    const-string p0, "viewNotVisible"

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    const/4 v0, 0x0

    .line 37
    cmpl-float p0, p0, v0

    .line 38
    .line 39
    if-nez p0, :cond_4

    .line 40
    .line 41
    const-string p0, "viewAlphaZero"

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_4
    const/4 p0, 0x0

    .line 45
    return-object p0
.end method

.method public static final d(LJd/n;Lcom/moloco/sdk/publisher/MediationInfo;)V
    .locals 5

    .line 1
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "<this>"

    .line 4
    .line 5
    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v2, "MolocoSDK/4.8.1;"

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const/16 v2, 0x3b

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    new-instance v3, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v4, "Mediator/"

    .line 25
    .line 26
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/moloco/sdk/publisher/MediationInfo;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    :cond_0
    if-eqz v0, :cond_1

    .line 47
    .line 48
    new-instance p1, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const-string v3, "Android/"

    .line 51
    .line 52
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    const-string v0, "toString(...)"

    .line 73
    .line 74
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const-string v0, "X-Moloco-User-Agent"

    .line 78
    .line 79
    invoke-virtual {p0, v0, p1}, LA7/B0;->z(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public static final e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/q;LZ/k;LN/o;I)V
    .locals 4

    .line 1
    const-string v0, "htmlResource"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, -0x4955e08f

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, v0}, LN/o;->N(I)LN/o;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2, p0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x2

    .line 21
    :goto_0
    or-int/2addr v0, p3

    .line 22
    invoke-virtual {p2, p1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    const/16 v1, 0x20

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/16 v1, 0x10

    .line 32
    .line 33
    :goto_1
    or-int/2addr v0, v1

    .line 34
    and-int/lit8 v1, v0, 0x13

    .line 35
    .line 36
    const/16 v2, 0x12

    .line 37
    .line 38
    if-ne v1, v2, :cond_3

    .line 39
    .line 40
    invoke-virtual {p2}, LN/o;->x()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_2

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    invoke-virtual {p2}, LN/o;->I()V

    .line 48
    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_3
    :goto_2
    const v1, -0x73e9f67f

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2, v1}, LN/o;->M(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    sget-object v2, LN/k;->a:LN/P;

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    if-ne v1, v2, :cond_5

    .line 65
    .line 66
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Z;->a:Ljava/util/LinkedHashMap;

    .line 67
    .line 68
    iget v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/q;->a:I

    .line 69
    .line 70
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    instance-of v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/t0;

    .line 79
    .line 80
    if-nez v2, :cond_4

    .line 81
    .line 82
    move-object v1, v3

    .line 83
    :cond_4
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/t0;

    .line 84
    .line 85
    invoke-virtual {p2, v1}, LN/o;->U(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :cond_5
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/t0;

    .line 89
    .line 90
    const/4 v2, 0x0

    .line 91
    invoke-virtual {p2, v2}, LN/o;->p(Z)V

    .line 92
    .line 93
    .line 94
    if-nez v1, :cond_6

    .line 95
    .line 96
    invoke-virtual {p2}, LN/o;->r()LN/i0;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    if-eqz p2, :cond_7

    .line 101
    .line 102
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/T;

    .line 103
    .line 104
    const/4 v1, 0x0

    .line 105
    invoke-direct {v0, p0, p1, p3, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/T;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/q;LZ/k;II)V

    .line 106
    .line 107
    .line 108
    iput-object v0, p2, LN/i0;->d:Ltf/p;

    .line 109
    .line 110
    return-void

    .line 111
    :cond_6
    and-int/lit8 v0, v0, 0x70

    .line 112
    .line 113
    or-int/lit16 v0, v0, 0x180

    .line 114
    .line 115
    invoke-static {v1, p1, v3, p2, v0}, LA6/c;->f(Landroid/webkit/WebView;LZ/k;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/t;LN/o;I)V

    .line 116
    .line 117
    .line 118
    :goto_3
    invoke-virtual {p2}, LN/o;->r()LN/i0;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    if-eqz p2, :cond_7

    .line 123
    .line 124
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/T;

    .line 125
    .line 126
    const/4 v1, 0x1

    .line 127
    invoke-direct {v0, p0, p1, p3, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/T;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/q;LZ/k;II)V

    .line 128
    .line 129
    .line 130
    iput-object v0, p2, LN/i0;->d:Ltf/p;

    .line 131
    .line 132
    :cond_7
    return-void
.end method

.method public static final f(LGd/a;)Ljava/nio/charset/Charset;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, LJd/q;->a()LJd/m;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object v0, LJd/p;->a:Ljava/util/List;

    .line 11
    .line 12
    const-string v0, "Content-Type"

    .line 13
    .line 14
    invoke-interface {p0, v0}, LNd/j;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const/4 v0, 0x0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    sget-object v1, LJd/f;->f:LJd/f;

    .line 22
    .line 23
    invoke-static {p0}, Lka/e0;->u(Ljava/lang/String;)LJd/f;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object p0, v0

    .line 29
    :goto_0
    if-eqz p0, :cond_1

    .line 30
    .line 31
    invoke-static {p0}, Lp7/b;->i(LJd/f;)Ljava/nio/charset/Charset;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_1
    return-object v0
.end method

.method public static g(Ljava/io/Closeable;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    :catch_0
    :cond_0
    return-void
.end method

.method public static final h(LGd/a;)Ljava/lang/Long;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, LJd/q;->a()LJd/m;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object v0, LJd/p;->a:Ljava/util/List;

    .line 11
    .line 12
    const-string v0, "Content-Length"

    .line 13
    .line 14
    invoke-interface {p0, v0}, LNd/j;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return-object p0
.end method

.method public static final i(LJd/r;)LJd/f;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, LJd/r;->a()LJd/n;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object v0, LJd/p;->a:Ljava/util/List;

    .line 11
    .line 12
    const-string v0, "Content-Type"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, LA7/B0;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    sget-object v0, LJd/f;->f:LJd/f;

    .line 21
    .line 22
    invoke-static {p0}, Lka/e0;->u(Ljava/lang/String;)LJd/f;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method

.method public static final j(LFd/c;LJd/f;)V
    .locals 1

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LJd/p;->a:Ljava/util/List;

    .line 7
    .line 8
    invoke-virtual {p1}, LJ4/d;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object p0, p0, LFd/c;->c:LJd/n;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const-string v0, "value"

    .line 18
    .line 19
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, LJd/n;->Y(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v0, "Content-Type"

    .line 26
    .line 27
    invoke-virtual {p0, v0}, LA7/B0;->D(Ljava/lang/String;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-interface {p0}, Ljava/util/List;->clear()V

    .line 32
    .line 33
    .line 34
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public static k(Landroid/media/MicrophoneInfo$Coordinate3F;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    invoke-static {p0}, Ldb/b;->a(Landroid/media/MicrophoneInfo$Coordinate3F;)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    float-to-double v0, v0

    .line 6
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {p0}, Ldb/b;->y(Landroid/media/MicrophoneInfo$Coordinate3F;)F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    float-to-double v1, v1

    .line 15
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {p0}, Ldb/b;->D(Landroid/media/MicrophoneInfo$Coordinate3F;)F

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    float-to-double v2, p0

    .line 24
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const/4 v2, 0x3

    .line 29
    new-array v2, v2, [Ljava/lang/Double;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    aput-object v0, v2, v3

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    aput-object v1, v2, v0

    .line 36
    .line 37
    const/4 v0, 0x2

    .line 38
    aput-object p0, v2, v0

    .line 39
    .line 40
    invoke-static {v2}, Lr7/e;->i([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method

.method public static l(Ljava/io/File;Landroid/content/res/Resources;I)Z
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    .line 2
    .line 3
    .line 4
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    :try_start_1
    invoke-static {p0, p1}, Lff/B;->m(Ljava/io/File;Ljava/io/InputStream;)Z

    .line 6
    .line 7
    .line 8
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    invoke-static {p1}, Lff/B;->g(Ljava/io/Closeable;)V

    .line 10
    .line 11
    .line 12
    return p0

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    goto :goto_0

    .line 15
    :catchall_1
    move-exception p0

    .line 16
    const/4 p1, 0x0

    .line 17
    :goto_0
    invoke-static {p1}, Lff/B;->g(Ljava/io/Closeable;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method

.method public static m(Ljava/io/File;Ljava/io/InputStream;)Z
    .locals 5

    .line 1
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskWrites()Landroid/os/StrictMode$ThreadPolicy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    :try_start_0
    new-instance v3, Ljava/io/FileOutputStream;

    .line 8
    .line 9
    invoke-direct {v3, p0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    .line 11
    .line 12
    const/16 p0, 0x400

    .line 13
    .line 14
    :try_start_1
    new-array p0, p0, [B

    .line 15
    .line 16
    :goto_0
    invoke-virtual {p1, p0}, Ljava/io/InputStream;->read([B)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v4, -0x1

    .line 21
    if-eq v2, v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {v3, p0, v1, v2}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    move-object v2, v3

    .line 29
    goto :goto_2

    .line 30
    :catch_0
    move-exception p0

    .line 31
    move-object v2, v3

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    invoke-static {v3}, Lff/B;->g(Ljava/io/Closeable;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :catchall_1
    move-exception p0

    .line 42
    goto :goto_2

    .line 43
    :catch_1
    move-exception p0

    .line 44
    :goto_1
    :try_start_2
    const-string p1, "TypefaceCompatUtil"

    .line 45
    .line 46
    new-instance v3, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v4, "Error copying resource contents to temp file: "

    .line 52
    .line 53
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 68
    .line 69
    .line 70
    invoke-static {v2}, Lff/B;->g(Ljava/io/Closeable;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 74
    .line 75
    .line 76
    return v1

    .line 77
    :goto_2
    invoke-static {v2}, Lff/B;->g(Ljava/io/Closeable;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 81
    .line 82
    .line 83
    throw p0
.end method

.method public static n(Landroid/content/Context;)Ly1/k;
    .locals 8

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Ly1/b;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v0, Lab/b;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "Package manager required to locate emoji font provider"

    .line 23
    .line 24
    invoke-static {v1, v2}, Lj1/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    new-instance v2, Landroid/content/Intent;

    .line 28
    .line 29
    const-string v3, "androidx.content.action.LOAD_EMOJI_FONT"

    .line 30
    .line 31
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->queryIntentContentProviders(Landroid/content/Intent;I)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    const/4 v5, 0x0

    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Landroid/content/pm/ResolveInfo;

    .line 55
    .line 56
    iget-object v4, v4, Landroid/content/pm/ResolveInfo;->providerInfo:Landroid/content/pm/ProviderInfo;

    .line 57
    .line 58
    if-eqz v4, :cond_1

    .line 59
    .line 60
    iget-object v6, v4, Landroid/content/pm/ProviderInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 61
    .line 62
    if-eqz v6, :cond_1

    .line 63
    .line 64
    iget v6, v6, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 65
    .line 66
    const/4 v7, 0x1

    .line 67
    and-int/2addr v6, v7

    .line 68
    if-ne v6, v7, :cond_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    move-object v4, v5

    .line 72
    :goto_1
    if-nez v4, :cond_3

    .line 73
    .line 74
    :goto_2
    move-object v1, v5

    .line 75
    goto :goto_4

    .line 76
    :cond_3
    :try_start_0
    iget-object v2, v4, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v4, v4, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0, v1, v4}, Lab/b;->d(Landroid/content/pm/PackageManager;Ljava/lang/String;)[Landroid/content/pm/Signature;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    new-instance v1, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 87
    .line 88
    .line 89
    array-length v6, v0

    .line 90
    :goto_3
    if-ge v3, v6, :cond_4

    .line 91
    .line 92
    aget-object v7, v0, v3

    .line 93
    .line 94
    invoke-virtual {v7}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    add-int/lit8 v3, v3, 0x1

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_4
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    new-instance v1, Lh1/d;

    .line 109
    .line 110
    const-string v3, "emojicompat-emoji-font"

    .line 111
    .line 112
    invoke-direct {v1, v2, v4, v3, v0}, Lh1/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    .line 114
    .line 115
    goto :goto_4

    .line 116
    :catch_0
    move-exception v0

    .line 117
    const-string v1, "emoji2.text.DefaultEmojiConfig"

    .line 118
    .line 119
    invoke-static {v1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :goto_4
    if-nez v1, :cond_5

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_5
    new-instance v5, Ly1/k;

    .line 127
    .line 128
    new-instance v0, Ly1/j;

    .line 129
    .line 130
    invoke-direct {v0, p0, v1}, Ly1/j;-><init>(Landroid/content/Context;Lh1/d;)V

    .line 131
    .line 132
    .line 133
    invoke-direct {v5, v0}, Ly1/k;-><init>(Ly1/f;)V

    .line 134
    .line 135
    .line 136
    :goto_5
    return-object v5
.end method

.method public static o(Ln2/q;)LF6/p;
    .locals 7

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-interface {p0}, Ln2/q;->length()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v3

    .line 11
    move v5, v4

    .line 12
    :goto_0
    if-ge v4, v2, :cond_1

    .line 13
    .line 14
    invoke-interface {p0, v4, v0, v1}, Ln2/q;->m(IJ)Z

    .line 15
    .line 16
    .line 17
    move-result v6

    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    add-int/lit8 v5, v5, 0x1

    .line 21
    .line 22
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    new-instance p0, LF6/p;

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    invoke-direct {p0, v0, v3, v2, v5}, LF6/p;-><init>(IIII)V

    .line 29
    .line 30
    .line 31
    return-object p0
.end method

.method public static p()Landroid/content/Intent;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "android.intent.category.DEFAULT"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    const/high16 v1, 0x10000000

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static final q(Lcg/m;Lcg/y;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lcg/m;->d(Lcg/y;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 5
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lcg/y;

    .line 21
    .line 22
    :try_start_1
    invoke-virtual {p0, v1}, Lcg/m;->e(Lcg/y;)LR0/e;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iget-boolean v2, v2, LR0/e;->c:Z

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-static {p0, v1}, Lff/B;->q(Lcg/m;Lcg/y;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :catch_0
    move-exception v1

    .line 35
    goto :goto_2

    .line 36
    :cond_1
    :goto_1
    invoke-virtual {p0, v1}, Lcg/m;->a(Lcg/y;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :goto_2
    if-nez v0, :cond_0

    .line 41
    .line 42
    move-object v0, v1

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    if-nez v0, :cond_3

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_3
    throw v0

    .line 48
    :catch_1
    :goto_3
    return-void
.end method

.method public static r(Landroid/media/AudioDeviceInfo;)Ljava/util/Map;
    .locals 12

    .line 1
    const-string v0, "device"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x1c

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    invoke-static {p0}, Ldb/b;->p(Landroid/media/AudioDeviceInfo;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->getId()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lef/k;

    .line 27
    .line 28
    const-string v3, "id"

    .line 29
    .line 30
    invoke-direct {v2, v3, v1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->getProductName()Ljava/lang/CharSequence;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    new-instance v3, Lef/k;

    .line 38
    .line 39
    const-string v4, "productName"

    .line 40
    .line 41
    invoke-direct {v3, v4, v1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    new-instance v1, Lef/k;

    .line 45
    .line 46
    const-string v4, "address"

    .line 47
    .line 48
    invoke-direct {v1, v4, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->isSource()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    new-instance v4, Lef/k;

    .line 60
    .line 61
    const-string v5, "isSource"

    .line 62
    .line 63
    invoke-direct {v4, v5, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->isSink()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    new-instance v5, Lef/k;

    .line 75
    .line 76
    const-string v6, "isSink"

    .line 77
    .line 78
    invoke-direct {v5, v6, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->getSampleRates()[I

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    const-string v6, "getSampleRates(...)"

    .line 86
    .line 87
    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v0}, Lff/B;->z([I)Ljava/util/ArrayList;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    new-instance v6, Lef/k;

    .line 95
    .line 96
    const-string v7, "sampleRates"

    .line 97
    .line 98
    invoke-direct {v6, v7, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->getChannelMasks()[I

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const-string v7, "getChannelMasks(...)"

    .line 106
    .line 107
    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v0}, Lff/B;->z([I)Ljava/util/ArrayList;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    new-instance v7, Lef/k;

    .line 115
    .line 116
    const-string v8, "channelMasks"

    .line 117
    .line 118
    invoke-direct {v7, v8, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->getChannelIndexMasks()[I

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    const-string v8, "getChannelIndexMasks(...)"

    .line 126
    .line 127
    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v0}, Lff/B;->z([I)Ljava/util/ArrayList;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    new-instance v8, Lef/k;

    .line 135
    .line 136
    const-string v9, "channelIndexMasks"

    .line 137
    .line 138
    invoke-direct {v8, v9, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->getChannelCounts()[I

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    const-string v9, "getChannelCounts(...)"

    .line 146
    .line 147
    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-static {v0}, Lff/B;->z([I)Ljava/util/ArrayList;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    new-instance v9, Lef/k;

    .line 155
    .line 156
    const-string v10, "channelCounts"

    .line 157
    .line 158
    invoke-direct {v9, v10, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->getEncodings()[I

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    const-string v10, "getEncodings(...)"

    .line 166
    .line 167
    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-static {v0}, Lff/B;->z([I)Ljava/util/ArrayList;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    new-instance v10, Lef/k;

    .line 175
    .line 176
    const-string v11, "encodings"

    .line 177
    .line 178
    invoke-direct {v10, v11, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 182
    .line 183
    .line 184
    move-result p0

    .line 185
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    new-instance v0, Lef/k;

    .line 190
    .line 191
    const-string v11, "type"

    .line 192
    .line 193
    invoke-direct {v0, v11, p0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    const/16 p0, 0xb

    .line 197
    .line 198
    new-array p0, p0, [Lef/k;

    .line 199
    .line 200
    const/4 v11, 0x0

    .line 201
    aput-object v2, p0, v11

    .line 202
    .line 203
    const/4 v2, 0x1

    .line 204
    aput-object v3, p0, v2

    .line 205
    .line 206
    const/4 v2, 0x2

    .line 207
    aput-object v1, p0, v2

    .line 208
    .line 209
    const/4 v1, 0x3

    .line 210
    aput-object v4, p0, v1

    .line 211
    .line 212
    const/4 v1, 0x4

    .line 213
    aput-object v5, p0, v1

    .line 214
    .line 215
    const/4 v1, 0x5

    .line 216
    aput-object v6, p0, v1

    .line 217
    .line 218
    const/4 v1, 0x6

    .line 219
    aput-object v7, p0, v1

    .line 220
    .line 221
    const/4 v1, 0x7

    .line 222
    aput-object v8, p0, v1

    .line 223
    .line 224
    const/16 v1, 0x8

    .line 225
    .line 226
    aput-object v9, p0, v1

    .line 227
    .line 228
    const/16 v1, 0x9

    .line 229
    .line 230
    aput-object v10, p0, v1

    .line 231
    .line 232
    const/16 v1, 0xa

    .line 233
    .line 234
    aput-object v0, p0, v1

    .line 235
    .line 236
    invoke-static {p0}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    return-object p0
.end method

.method public static s(Ljava/util/List;)Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, ""

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 14
    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    move v4, v3

    .line 22
    :goto_0
    if-ge v3, v2, :cond_4

    .line 23
    .line 24
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    const/4 v6, 0x1

    .line 29
    add-int/2addr v4, v6

    .line 30
    if-le v4, v6, :cond_0

    .line 31
    .line 32
    const-string v7, ","

    .line 33
    .line 34
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 35
    .line 36
    .line 37
    :cond_0
    if-nez v5, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    instance-of v6, v5, Ljava/lang/CharSequence;

    .line 41
    .line 42
    :goto_1
    if-eqz v6, :cond_2

    .line 43
    .line 44
    check-cast v5, Ljava/lang/CharSequence;

    .line 45
    .line 46
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    instance-of v6, v5, Ljava/lang/Character;

    .line 51
    .line 52
    if-eqz v6, :cond_3

    .line 53
    .line 54
    check-cast v5, Ljava/lang/Character;

    .line 55
    .line 56
    invoke-virtual {v5}, Ljava/lang/Character;->charValue()C

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 69
    .line 70
    .line 71
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    const-string v0, "fastJoinTo(StringBuilder\u2026form)\n        .toString()"

    .line 82
    .line 83
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-object p0
.end method

.method public static t(Ljava/lang/Object;)Ljava/lang/Long;
    .locals 2

    .line 1
    instance-of v0, p0, Ljava/lang/Long;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object v0, p0

    .line 7
    check-cast v0, Ljava/lang/Long;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v0, v1

    .line 11
    :goto_0
    if-nez v0, :cond_3

    .line 12
    .line 13
    instance-of v0, p0, Ljava/lang/Integer;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    check-cast p0, Ljava/lang/Integer;

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move-object p0, v1

    .line 21
    :goto_1
    if-eqz p0, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    int-to-long v0, p0

    .line 28
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_2
    return-object v1

    .line 34
    :cond_3
    return-object v0
.end method

.method public static final u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lkotlinx/serialization/KSerializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Lkotlinx/serialization/descriptors/SerialDescriptor;->b()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    new-instance v0, LWf/X;

    .line 18
    .line 19
    invoke-direct {v0, p0}, LWf/X;-><init>(Lkotlinx/serialization/KSerializer;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public static v(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lff/z;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p1, Lff/z;

    .line 11
    .line 12
    invoke-interface {p1}, Lff/z;->b()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    invoke-interface {p1, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 31
    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v1, "Key "

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p0, " is missing in the map."

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-direct {p1, p0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_2
    :goto_0
    return-object v0
.end method

.method public static w(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-object p0, v0

    .line 9
    :goto_0
    const-string v0, "com.google.firebase.messaging"

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static final x(Lae/h;)Lef/k;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, -0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    sget-object v0, LBe/a;->a:[I

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    aget p0, v0, p0

    .line 12
    .line 13
    :goto_0
    const/4 v0, 0x1

    .line 14
    if-eq p0, v0, :cond_2

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    if-eq p0, v0, :cond_1

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_1
    new-instance p0, Lef/k;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-direct {p0, v1, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_2
    new-instance p0, Lef/k;

    .line 37
    .line 38
    const v0, 0x7f01002f

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const v1, 0x7f010031

    .line 46
    .line 47
    .line 48
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-direct {p0, v0, v1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-object p0
.end method

.method public static y(Landroid/content/Context;)Ljava/io/File;
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v2, ".font"

    .line 12
    .line 13
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v2, "-"

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const/4 v2, 0x0

    .line 43
    :goto_0
    const/16 v3, 0x64

    .line 44
    .line 45
    if-ge v2, v3, :cond_2

    .line 46
    .line 47
    new-instance v3, Ljava/io/File;

    .line 48
    .line 49
    new-instance v4, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-direct {v3, p0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z

    .line 68
    .line 69
    .line 70
    move-result v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    if-eqz v4, :cond_1

    .line 72
    .line 73
    return-object v3

    .line 74
    :catch_0
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    return-object v0
.end method

.method public static z([I)Ljava/util/ArrayList;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {p0}, Lff/m;->J0([I)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/Collection;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
