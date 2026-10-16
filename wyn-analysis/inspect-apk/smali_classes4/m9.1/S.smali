.class public final Lm9/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA7/f;
.implements LA7/C;
.implements Lcom/google/android/gms/internal/mlkit_vision_text_common/zzu;
.implements LL8/e;
.implements LG0/d;
.implements LI5/i;
.implements LJ5/m;
.implements LL4/A;
.implements LVa/rb;
.implements LVa/ma;
.implements LZ4/a;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lm9/S;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(JLl8/K;)[B
    .locals 3

    .line 1
    new-instance v0, LJ9/x;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, v1}, LJ9/x;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v0, v2}, LJ9/x;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Landroid/os/Bundle;

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance p2, Landroid/os/Bundle;

    .line 42
    .line 43
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v0, "c"

    .line 47
    .line 48
    invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 49
    .line 50
    .line 51
    const-string v0, "d"

    .line 52
    .line 53
    invoke-virtual {p2, v0, p0, p1}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 54
    .line 55
    .line 56
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/os/Parcel;->marshall()[B

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p0}, Landroid/os/Parcel;->recycle()V

    .line 68
    .line 69
    .line 70
    return-object p1
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public b()Ljava/util/List;
    .locals 7

    .line 1
    invoke-static {}, LA7/O0;->f()Landroid/os/LocaleList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getDefault()"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, LA7/O0;->c(Landroid/os/LocaleList;)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    :goto_0
    if-ge v3, v2, :cond_0

    .line 21
    .line 22
    new-instance v4, LG0/a;

    .line 23
    .line 24
    invoke-static {v0, v3}, LA7/O0;->j(Landroid/os/LocaleList;I)Ljava/util/Locale;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    const-string v6, "localeList[i]"

    .line 29
    .line 30
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v4, v5}, LG0/a;-><init>(Ljava/util/Locale;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    add-int/lit8 v3, v3, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    return-object v1
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public e(LVa/na;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, LVa/na;->t0()Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-class v0, Landroid/webkit/WebChromeClient;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget v0, p0, Lm9/S;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    const/4 v0, 0x1

    .line 12
    if-ne p0, p1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-class v1, Lm9/S;

    .line 22
    .line 23
    if-eq v1, p1, :cond_2

    .line 24
    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    :cond_2
    :goto_0
    return v0

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic f()V
    .locals 0

    .line 1
    return-void
.end method

.method public g(Landroid/os/Looper;LF5/l;)V
    .locals 0

    .line 1
    return-void
.end method

.method public synthetic h(LI5/f;LE5/T;)LI5/h;
    .locals 0

    .line 1
    sget-object p1, LI5/h;->a:LI5/h;

    return-object p1
.end method

.method public i(LI5/f;LE5/T;)LA/e0;
    .locals 2

    .line 1
    iget-object p1, p2, LE5/T;->o:LI5/c;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    :cond_0
    new-instance p1, LA/e0;

    .line 8
    .line 9
    new-instance p2, LI5/d;

    .line 10
    .line 11
    new-instance v0, LI5/k;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x1771

    .line 17
    .line 18
    invoke-direct {p2, v0, v1}, LI5/d;-><init>(Ljava/lang/Exception;I)V

    .line 19
    .line 20
    .line 21
    const/16 v0, 0xa

    .line 22
    .line 23
    invoke-direct {p1, p2, v0}, LA/e0;-><init>(Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method

.method public j(Landroid/media/MediaMetadataRetriever;Ljava/lang/Object;)V
    .locals 6

    .line 1
    check-cast p2, Landroid/content/res/AssetFileDescriptor;

    .line 2
    .line 3
    invoke-virtual {p2}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p2}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    invoke-virtual {p2}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    .line 12
    .line 13
    .line 14
    move-result-wide v4

    .line 15
    move-object v0, p1

    .line 16
    invoke-virtual/range {v0 .. v5}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/io/FileDescriptor;JJ)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public k(LE5/T;)I
    .locals 0

    .line 1
    iget-object p1, p1, LE5/T;->o:LI5/c;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    return p1

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    return p1
.end method

.method public l()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public m(II)LJ5/w;
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method

.method public n(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 16

    .line 1
    new-instance v0, LVa/K;

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    shr-int/lit8 v2, v2, 0x10

    .line 19
    .line 20
    add-int/lit16 v2, v2, 0x1641

    .line 21
    .line 22
    int-to-char v2, v2

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static {v3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    invoke-static {v3}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    const/4 v6, 0x0

    .line 33
    cmpl-float v5, v5, v6

    .line 34
    .line 35
    rsub-int/lit8 v5, v5, 0x4

    .line 36
    .line 37
    invoke-static {v4, v5, v2}, LVa/K;->c(IIC)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    sget v4, LVa/K;->g:I

    .line 50
    .line 51
    add-int/lit8 v4, v4, 0x47

    .line 52
    .line 53
    rem-int/lit16 v4, v4, 0x80

    .line 54
    .line 55
    sput v4, LVa/K;->f:I

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    const/4 v5, -0x1

    .line 62
    const/4 v7, 0x1

    .line 63
    const/4 v8, 0x2

    .line 64
    const-wide/16 v9, 0x0

    .line 65
    .line 66
    const-string v11, ""

    .line 67
    .line 68
    const v12, 0x585239d

    .line 69
    .line 70
    .line 71
    if-eq v4, v12, :cond_2

    .line 72
    .line 73
    const v12, 0x5948c31

    .line 74
    .line 75
    .line 76
    if-eq v4, v12, :cond_1

    .line 77
    .line 78
    const v12, 0x5c74aff

    .line 79
    .line 80
    .line 81
    if-eq v4, v12, :cond_0

    .line 82
    .line 83
    goto/16 :goto_1

    .line 84
    .line 85
    :cond_0
    invoke-static {v11, v3, v3}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    rsub-int v4, v4, 0x382d

    .line 90
    .line 91
    int-to-char v4, v4

    .line 92
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 93
    .line 94
    .line 95
    move-result-wide v12

    .line 96
    cmp-long v12, v12, v9

    .line 97
    .line 98
    add-int/lit8 v12, v12, 0x5

    .line 99
    .line 100
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 101
    .line 102
    .line 103
    move-result v13

    .line 104
    shr-int/lit8 v13, v13, 0x10

    .line 105
    .line 106
    add-int/lit8 v13, v13, 0x5

    .line 107
    .line 108
    invoke-static {v12, v13, v4}, LVa/K;->c(IIC)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-eqz v2, :cond_4

    .line 121
    .line 122
    sget v2, LVa/K;->g:I

    .line 123
    .line 124
    add-int/lit8 v2, v2, 0x4b

    .line 125
    .line 126
    rem-int/lit16 v2, v2, 0x80

    .line 127
    .line 128
    sput v2, LVa/K;->f:I

    .line 129
    .line 130
    :goto_0
    move v2, v3

    .line 131
    goto/16 :goto_2

    .line 132
    .line 133
    :cond_1
    const v4, 0x9afc

    .line 134
    .line 135
    .line 136
    invoke-static {v3, v3}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 137
    .line 138
    .line 139
    move-result v12

    .line 140
    sub-int/2addr v4, v12

    .line 141
    int-to-char v4, v4

    .line 142
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 143
    .line 144
    .line 145
    move-result v12

    .line 146
    shr-int/lit8 v12, v12, 0x10

    .line 147
    .line 148
    add-int/lit8 v12, v12, 0xb

    .line 149
    .line 150
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 151
    .line 152
    .line 153
    move-result v13

    .line 154
    shr-int/lit8 v13, v13, 0x10

    .line 155
    .line 156
    add-int/lit8 v13, v13, 0x5

    .line 157
    .line 158
    invoke-static {v12, v13, v4}, LVa/K;->c(IIC)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    xor-int/2addr v2, v7

    .line 171
    if-eq v2, v7, :cond_4

    .line 172
    .line 173
    sget v2, LVa/K;->g:I

    .line 174
    .line 175
    add-int/lit8 v2, v2, 0x37

    .line 176
    .line 177
    rem-int/lit16 v2, v2, 0x80

    .line 178
    .line 179
    sput v2, LVa/K;->f:I

    .line 180
    .line 181
    add-int/lit8 v2, v2, 0x39

    .line 182
    .line 183
    rem-int/lit16 v2, v2, 0x80

    .line 184
    .line 185
    sput v2, LVa/K;->g:I

    .line 186
    .line 187
    move v2, v8

    .line 188
    goto :goto_2

    .line 189
    :cond_2
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    shr-int/lit8 v4, v4, 0x10

    .line 194
    .line 195
    int-to-short v4, v4

    .line 196
    const/16 v12, 0x30

    .line 197
    .line 198
    invoke-static {v11, v12, v3, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 199
    .line 200
    .line 201
    move-result v12

    .line 202
    const v13, -0x4ef58b32

    .line 203
    .line 204
    .line 205
    sub-int/2addr v13, v12

    .line 206
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 207
    .line 208
    .line 209
    move-result-wide v14

    .line 210
    cmp-long v12, v14, v9

    .line 211
    .line 212
    add-int/lit8 v12, v12, -0x25

    .line 213
    .line 214
    const v14, -0x6530aeab

    .line 215
    .line 216
    .line 217
    invoke-static {v3, v3}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 218
    .line 219
    .line 220
    move-result v15

    .line 221
    sub-int/2addr v14, v15

    .line 222
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 223
    .line 224
    .line 225
    move-result v15

    .line 226
    shr-int/lit8 v15, v15, 0x10

    .line 227
    .line 228
    rsub-int/lit8 v15, v15, -0x33

    .line 229
    .line 230
    int-to-byte v15, v15

    .line 231
    invoke-static {v13, v12, v15, v4, v14}, LVa/K;->a(IIBSI)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-eqz v2, :cond_4

    .line 244
    .line 245
    sget v2, LVa/K;->g:I

    .line 246
    .line 247
    add-int/lit8 v2, v2, 0x3

    .line 248
    .line 249
    rem-int/lit16 v4, v2, 0x80

    .line 250
    .line 251
    sput v4, LVa/K;->f:I

    .line 252
    .line 253
    rem-int/2addr v2, v8

    .line 254
    if-eqz v2, :cond_3

    .line 255
    .line 256
    goto :goto_0

    .line 257
    :cond_3
    move v2, v7

    .line 258
    goto :goto_2

    .line 259
    :cond_4
    :goto_1
    move v2, v5

    .line 260
    :goto_2
    const/4 v4, 0x0

    .line 261
    if-eqz v2, :cond_8

    .line 262
    .line 263
    if-eq v2, v7, :cond_6

    .line 264
    .line 265
    if-eq v2, v8, :cond_5

    .line 266
    .line 267
    sget-object v2, LVa/J;->a:LVa/J;

    .line 268
    .line 269
    goto :goto_3

    .line 270
    :cond_5
    sget-object v2, LVa/J;->c:LVa/J;

    .line 271
    .line 272
    goto :goto_3

    .line 273
    :cond_6
    sget-object v2, LVa/J;->b:LVa/J;

    .line 274
    .line 275
    sget v12, LVa/K;->g:I

    .line 276
    .line 277
    add-int/lit8 v12, v12, 0x37

    .line 278
    .line 279
    rem-int/lit16 v13, v12, 0x80

    .line 280
    .line 281
    sput v13, LVa/K;->f:I

    .line 282
    .line 283
    rem-int/2addr v12, v8

    .line 284
    if-nez v12, :cond_7

    .line 285
    .line 286
    goto :goto_3

    .line 287
    :cond_7
    throw v4

    .line 288
    :cond_8
    sget-object v2, LVa/J;->d:LVa/J;

    .line 289
    .line 290
    :goto_3
    iput-object v2, v0, LVa/K;->a:LVa/J;

    .line 291
    .line 292
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 293
    .line 294
    .line 295
    move-result v2

    .line 296
    shr-int/lit8 v2, v2, 0x10

    .line 297
    .line 298
    int-to-char v2, v2

    .line 299
    invoke-static {v3}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 300
    .line 301
    .line 302
    move-result v12

    .line 303
    cmpl-float v12, v12, v6

    .line 304
    .line 305
    add-int/lit8 v12, v12, 0x4

    .line 306
    .line 307
    invoke-static {v11, v3}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 308
    .line 309
    .line 310
    move-result v13

    .line 311
    add-int/2addr v13, v8

    .line 312
    invoke-static {v12, v13, v2}, LVa/K;->c(IIC)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    new-instance v12, Ljava/util/ArrayList;

    .line 325
    .line 326
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 327
    .line 328
    .line 329
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 330
    .line 331
    .line 332
    move-result v13

    .line 333
    if-nez v13, :cond_9

    .line 334
    .line 335
    sget v12, LVa/K;->g:I

    .line 336
    .line 337
    add-int/lit8 v12, v12, 0x25

    .line 338
    .line 339
    rem-int/lit16 v12, v12, 0x80

    .line 340
    .line 341
    sput v12, LVa/K;->f:I

    .line 342
    .line 343
    invoke-static {v6, v6}, Landroid/graphics/PointF;->length(FF)F

    .line 344
    .line 345
    .line 346
    move-result v12

    .line 347
    cmpl-float v12, v12, v6

    .line 348
    .line 349
    add-int/lit16 v12, v12, 0x39ba

    .line 350
    .line 351
    int-to-char v12, v12

    .line 352
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 353
    .line 354
    .line 355
    move-result v13

    .line 356
    cmpl-float v6, v13, v6

    .line 357
    .line 358
    add-int/lit8 v6, v6, 0xf

    .line 359
    .line 360
    invoke-static {v3}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 361
    .line 362
    .line 363
    move-result v13

    .line 364
    sub-int/2addr v7, v13

    .line 365
    invoke-static {v6, v7, v12}, LVa/K;->c(IIC)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v6

    .line 369
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v6

    .line 373
    invoke-virtual {v2, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 378
    .line 379
    .line 380
    move-result-object v12

    .line 381
    :cond_9
    sget v2, LVa/K;->g:I

    .line 382
    .line 383
    add-int/lit8 v2, v2, 0x6d

    .line 384
    .line 385
    rem-int/lit16 v6, v2, 0x80

    .line 386
    .line 387
    sput v6, LVa/K;->f:I

    .line 388
    .line 389
    rem-int/2addr v2, v8

    .line 390
    if-nez v2, :cond_c

    .line 391
    .line 392
    iput-object v12, v0, LVa/K;->b:Ljava/util/List;

    .line 393
    .line 394
    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    .line 395
    .line 396
    .line 397
    move-result v2

    .line 398
    int-to-short v2, v2

    .line 399
    const v6, -0x4ef58b21

    .line 400
    .line 401
    .line 402
    invoke-static {v11}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 403
    .line 404
    .line 405
    move-result v7

    .line 406
    sub-int/2addr v6, v7

    .line 407
    invoke-static {v9, v10}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 408
    .line 409
    .line 410
    move-result v7

    .line 411
    add-int/lit8 v7, v7, -0x24

    .line 412
    .line 413
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 414
    .line 415
    .line 416
    move-result-wide v12

    .line 417
    const-wide/16 v14, -0x1

    .line 418
    .line 419
    cmp-long v8, v12, v14

    .line 420
    .line 421
    const v12, -0x6530aeb2

    .line 422
    .line 423
    .line 424
    add-int/2addr v8, v12

    .line 425
    invoke-static {v11}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 426
    .line 427
    .line 428
    move-result v12

    .line 429
    add-int/lit8 v12, v12, 0x59

    .line 430
    .line 431
    int-to-byte v12, v12

    .line 432
    invoke-static {v6, v7, v12, v2, v8}, LVa/K;->a(IIBSI)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 445
    .line 446
    .line 447
    move-result v2

    .line 448
    if-nez v2, :cond_b

    .line 449
    .line 450
    sget v2, LVa/K;->g:I

    .line 451
    .line 452
    add-int/lit8 v2, v2, 0x75

    .line 453
    .line 454
    rem-int/lit16 v2, v2, 0x80

    .line 455
    .line 456
    sput v2, LVa/K;->f:I

    .line 457
    .line 458
    invoke-static {v11}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 459
    .line 460
    .line 461
    move-result v2

    .line 462
    sub-int/2addr v5, v2

    .line 463
    int-to-short v2, v5

    .line 464
    const v5, -0x4ef58b24

    .line 465
    .line 466
    .line 467
    invoke-static {v3}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 468
    .line 469
    .line 470
    move-result v6

    .line 471
    add-int/2addr v6, v5

    .line 472
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 473
    .line 474
    .line 475
    move-result-wide v7

    .line 476
    cmp-long v5, v7, v9

    .line 477
    .line 478
    add-int/lit8 v5, v5, -0x25

    .line 479
    .line 480
    const v7, -0x6530aea6

    .line 481
    .line 482
    .line 483
    invoke-static {v3, v3}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 484
    .line 485
    .line 486
    move-result v3

    .line 487
    sub-int/2addr v7, v3

    .line 488
    invoke-static {v11}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 489
    .line 490
    .line 491
    move-result v3

    .line 492
    rsub-int/lit8 v3, v3, 0x7

    .line 493
    .line 494
    int-to-byte v3, v3

    .line 495
    invoke-static {v6, v5, v3, v2, v7}, LVa/K;->a(IIBSI)Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v2

    .line 499
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    move-result v2

    .line 507
    if-eqz v2, :cond_a

    .line 508
    .line 509
    goto :goto_4

    .line 510
    :cond_a
    move-object v4, v1

    .line 511
    goto :goto_5

    .line 512
    :cond_b
    :goto_4
    sget v1, LVa/K;->f:I

    .line 513
    .line 514
    add-int/lit8 v1, v1, 0x1f

    .line 515
    .line 516
    rem-int/lit16 v1, v1, 0x80

    .line 517
    .line 518
    sput v1, LVa/K;->g:I

    .line 519
    .line 520
    :goto_5
    iput-object v4, v0, LVa/K;->c:Ljava/lang/String;

    .line 521
    .line 522
    return-object v0

    .line 523
    :cond_c
    throw v4
.end method

.method public o(LC6/l;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LEa/h;

    .line 2
    .line 3
    const-class v1, Lya/g;

    .line 4
    .line 5
    invoke-virtual {p1, v1}, LC6/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lya/g;

    .line 10
    .line 11
    invoke-direct {v0, p1}, LEa/h;-><init>(Lya/g;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public synthetic release()V
    .locals 0

    .line 1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lm9/S;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    const-string v0, "MemoryEagerGcSettings{}"

    .line 12
    .line 13
    return-object v0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public x(LJ5/t;)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method

.method public zza()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lm9/S;->a:I

    packed-switch v0, :pswitch_data_0

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzow;->zzc()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 2
    :pswitch_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpu;->zzc()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 3
    :pswitch_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoe;->zzd()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 4
    :pswitch_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzng;->zzar()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 5
    :pswitch_3
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzng;->zzax()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 6
    :pswitch_4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzng;->zzz()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    .line 7
    :pswitch_5
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzph;->zze()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 8
    :pswitch_6
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzng;->zzt()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    .line 9
    :pswitch_7
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzng;->zzad()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    .line 10
    :pswitch_8
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzng;->zzk()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 11
    :pswitch_9
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzop;->zza()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 12
    :pswitch_a
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzov;->zzc()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 13
    :pswitch_b
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpn;->zzh()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuz;

    .line 14
    new-instance v0, LCa/e;

    invoke-direct {v0, p1}, LCa/e;-><init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuz;)V

    return-object v0
.end method
