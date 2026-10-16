.class public final Lx1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu1/m;


# static fields
.field public static final a:Lx1/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lx1/i;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lx1/i;->a:Lx1/i;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getDefaultValue()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lx1/b;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lx1/b;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final readFrom(Ljava/io/InputStream;Ljf/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    :try_start_0
    check-cast p1, Ljava/io/FileInputStream;

    .line 2
    .line 3
    invoke-static {p1}, Lw1/e;->l(Ljava/io/FileInputStream;)Lw1/e;

    .line 4
    .line 5
    .line 6
    move-result-object p1
    :try_end_0
    .catch Landroidx/datastore/preferences/protobuf/A; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    const/4 p2, 0x0

    .line 8
    new-array v0, p2, [Lx1/f;

    .line 9
    .line 10
    new-instance v1, Lx1/b;

    .line 11
    .line 12
    invoke-direct {v1, p2}, Lx1/b;-><init>(Z)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, [Lx1/f;

    .line 20
    .line 21
    const-string v2, "pairs"

    .line 22
    .line 23
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lx1/b;->a()V

    .line 27
    .line 28
    .line 29
    array-length v2, v0

    .line 30
    const/4 v3, 0x0

    .line 31
    if-gtz v2, :cond_2

    .line 32
    .line 33
    invoke-virtual {p1}, Lw1/e;->j()Ljava/util/Map;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const-string p2, "preferencesProto.preferencesMap"

    .line 38
    .line 39
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    check-cast p2, Ljava/util/Map$Entry;

    .line 61
    .line 62
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Ljava/lang/String;

    .line 67
    .line 68
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    check-cast p2, Lw1/i;

    .line 73
    .line 74
    const-string v2, "name"

    .line 75
    .line 76
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const-string v2, "value"

    .line 80
    .line 81
    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Lw1/i;->x()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-nez v2, :cond_0

    .line 89
    .line 90
    const/4 v2, -0x1

    .line 91
    goto :goto_1

    .line 92
    :cond_0
    sget-object v4, Lx1/h;->a:[I

    .line 93
    .line 94
    invoke-static {v2}, LA/f;->f(I)I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    aget v2, v4, v2

    .line 99
    .line 100
    :goto_1
    packed-switch v2, :pswitch_data_0

    .line 101
    .line 102
    .line 103
    :pswitch_0
    new-instance p1, LE5/Q;

    .line 104
    .line 105
    const/16 p2, 0x9

    .line 106
    .line 107
    const/4 v0, 0x0

    .line 108
    invoke-direct {p1, v0, p2}, LE5/Q;-><init>(BI)V

    .line 109
    .line 110
    .line 111
    throw p1

    .line 112
    :pswitch_1
    new-instance p1, Lu1/a;

    .line 113
    .line 114
    const-string p2, "Value not set."

    .line 115
    .line 116
    invoke-direct {p1, p2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    throw p1

    .line 120
    :pswitch_2
    new-instance v2, Lx1/e;

    .line 121
    .line 122
    invoke-direct {v2, v0}, Lx1/e;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2}, Lw1/i;->w()Lw1/g;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    invoke-virtual {p2}, Lw1/g;->k()Landroidx/datastore/preferences/protobuf/x;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    const-string v0, "value.stringSet.stringsList"

    .line 134
    .line 135
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-static {p2}, Lff/o;->X0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    invoke-virtual {v1, v2, p2}, Lx1/b;->d(Lx1/e;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :pswitch_3
    new-instance v2, Lx1/e;

    .line 147
    .line 148
    invoke-direct {v2, v0}, Lx1/e;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p2}, Lw1/i;->v()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    const-string v0, "value.string"

    .line 156
    .line 157
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, v2, p2}, Lx1/b;->d(Lx1/e;Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    goto :goto_0

    .line 164
    :pswitch_4
    new-instance v2, Lx1/e;

    .line 165
    .line 166
    invoke-direct {v2, v0}, Lx1/e;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p2}, Lw1/i;->u()J

    .line 170
    .line 171
    .line 172
    move-result-wide v4

    .line 173
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    invoke-virtual {v1, v2, p2}, Lx1/b;->d(Lx1/e;Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    goto/16 :goto_0

    .line 181
    .line 182
    :pswitch_5
    new-instance v2, Lx1/e;

    .line 183
    .line 184
    invoke-direct {v2, v0}, Lx1/e;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p2}, Lw1/i;->t()I

    .line 188
    .line 189
    .line 190
    move-result p2

    .line 191
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object p2

    .line 195
    invoke-virtual {v1, v2, p2}, Lx1/b;->d(Lx1/e;Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :pswitch_6
    new-instance v2, Lx1/e;

    .line 201
    .line 202
    invoke-direct {v2, v0}, Lx1/e;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p2}, Lw1/i;->r()D

    .line 206
    .line 207
    .line 208
    move-result-wide v4

    .line 209
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 210
    .line 211
    .line 212
    move-result-object p2

    .line 213
    invoke-virtual {v1, v2, p2}, Lx1/b;->d(Lx1/e;Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    goto/16 :goto_0

    .line 217
    .line 218
    :pswitch_7
    new-instance v2, Lx1/e;

    .line 219
    .line 220
    invoke-direct {v2, v0}, Lx1/e;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p2}, Lw1/i;->s()F

    .line 224
    .line 225
    .line 226
    move-result p2

    .line 227
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 228
    .line 229
    .line 230
    move-result-object p2

    .line 231
    invoke-virtual {v1, v2, p2}, Lx1/b;->d(Lx1/e;Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    goto/16 :goto_0

    .line 235
    .line 236
    :pswitch_8
    invoke-static {v0}, La/a;->k(Ljava/lang/String;)Lx1/e;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    invoke-virtual {p2}, Lw1/i;->p()Z

    .line 241
    .line 242
    .line 243
    move-result p2

    .line 244
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 245
    .line 246
    .line 247
    move-result-object p2

    .line 248
    invoke-virtual {v1, v0, p2}, Lx1/b;->d(Lx1/e;Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    goto/16 :goto_0

    .line 252
    .line 253
    :pswitch_9
    new-instance p1, Lu1/a;

    .line 254
    .line 255
    const-string p2, "Value case is null."

    .line 256
    .line 257
    invoke-direct {p1, p2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 258
    .line 259
    .line 260
    throw p1

    .line 261
    :cond_1
    new-instance p1, Lx1/b;

    .line 262
    .line 263
    iget-object p2, v1, Lx1/b;->a:Ljava/util/LinkedHashMap;

    .line 264
    .line 265
    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 266
    .line 267
    .line 268
    move-result-object p2

    .line 269
    const-string v0, "unmodifiableMap(preferencesMap)"

    .line 270
    .line 271
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    invoke-static {p2}, Lff/A;->a0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 275
    .line 276
    .line 277
    move-result-object p2

    .line 278
    const/4 v0, 0x1

    .line 279
    invoke-direct {p1, p2, v0}, Lx1/b;-><init>(Ljava/util/LinkedHashMap;Z)V

    .line 280
    .line 281
    .line 282
    return-object p1

    .line 283
    :cond_2
    aget-object p1, v0, p2

    .line 284
    .line 285
    throw v3

    .line 286
    :catch_0
    move-exception p1

    .line 287
    new-instance p2, Lu1/a;

    .line 288
    .line 289
    const-string v0, "Unable to parse preferences proto."

    .line 290
    .line 291
    invoke-direct {p2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 292
    .line 293
    .line 294
    throw p2

    .line 295
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final writeTo(Ljava/lang/Object;Ljava/io/OutputStream;Ljf/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Lx1/b;

    .line 2
    .line 3
    iget-object p1, p1, Lx1/b;->a:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string p3, "unmodifiableMap(preferencesMap)"

    .line 10
    .line 11
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lw1/e;->k()Lw1/c;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_7

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Ljava/util/Map$Entry;

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Lx1/e;

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v1, v1, Lx1/e;->a:Ljava/lang/String;

    .line 49
    .line 50
    instance-of v2, v0, Ljava/lang/Boolean;

    .line 51
    .line 52
    if-eqz v2, :cond_0

    .line 53
    .line 54
    invoke-static {}, Lw1/i;->y()Lw1/h;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v0, Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/t;->c()V

    .line 65
    .line 66
    .line 67
    iget-object v3, v2, Landroidx/datastore/preferences/protobuf/t;->b:Landroidx/datastore/preferences/protobuf/v;

    .line 68
    .line 69
    check-cast v3, Lw1/i;

    .line 70
    .line 71
    invoke-static {v3, v0}, Lw1/i;->m(Lw1/i;Z)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/t;->a()Landroidx/datastore/preferences/protobuf/v;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Lw1/i;

    .line 79
    .line 80
    goto/16 :goto_1

    .line 81
    .line 82
    :cond_0
    instance-of v2, v0, Ljava/lang/Float;

    .line 83
    .line 84
    if-eqz v2, :cond_1

    .line 85
    .line 86
    invoke-static {}, Lw1/i;->y()Lw1/h;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    check-cast v0, Ljava/lang/Number;

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/t;->c()V

    .line 97
    .line 98
    .line 99
    iget-object v3, v2, Landroidx/datastore/preferences/protobuf/t;->b:Landroidx/datastore/preferences/protobuf/v;

    .line 100
    .line 101
    check-cast v3, Lw1/i;

    .line 102
    .line 103
    invoke-static {v3, v0}, Lw1/i;->n(Lw1/i;F)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/t;->a()Landroidx/datastore/preferences/protobuf/v;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Lw1/i;

    .line 111
    .line 112
    goto/16 :goto_1

    .line 113
    .line 114
    :cond_1
    instance-of v2, v0, Ljava/lang/Double;

    .line 115
    .line 116
    if-eqz v2, :cond_2

    .line 117
    .line 118
    invoke-static {}, Lw1/i;->y()Lw1/h;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    check-cast v0, Ljava/lang/Number;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 125
    .line 126
    .line 127
    move-result-wide v3

    .line 128
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/t;->c()V

    .line 129
    .line 130
    .line 131
    iget-object v0, v2, Landroidx/datastore/preferences/protobuf/t;->b:Landroidx/datastore/preferences/protobuf/v;

    .line 132
    .line 133
    check-cast v0, Lw1/i;

    .line 134
    .line 135
    invoke-static {v0, v3, v4}, Lw1/i;->l(Lw1/i;D)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/t;->a()Landroidx/datastore/preferences/protobuf/v;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    check-cast v0, Lw1/i;

    .line 143
    .line 144
    goto/16 :goto_1

    .line 145
    .line 146
    :cond_2
    instance-of v2, v0, Ljava/lang/Integer;

    .line 147
    .line 148
    if-eqz v2, :cond_3

    .line 149
    .line 150
    invoke-static {}, Lw1/i;->y()Lw1/h;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    check-cast v0, Ljava/lang/Number;

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/t;->c()V

    .line 161
    .line 162
    .line 163
    iget-object v3, v2, Landroidx/datastore/preferences/protobuf/t;->b:Landroidx/datastore/preferences/protobuf/v;

    .line 164
    .line 165
    check-cast v3, Lw1/i;

    .line 166
    .line 167
    invoke-static {v3, v0}, Lw1/i;->o(Lw1/i;I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/t;->a()Landroidx/datastore/preferences/protobuf/v;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    check-cast v0, Lw1/i;

    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_3
    instance-of v2, v0, Ljava/lang/Long;

    .line 178
    .line 179
    if-eqz v2, :cond_4

    .line 180
    .line 181
    invoke-static {}, Lw1/i;->y()Lw1/h;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    check-cast v0, Ljava/lang/Number;

    .line 186
    .line 187
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 188
    .line 189
    .line 190
    move-result-wide v3

    .line 191
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/t;->c()V

    .line 192
    .line 193
    .line 194
    iget-object v0, v2, Landroidx/datastore/preferences/protobuf/t;->b:Landroidx/datastore/preferences/protobuf/v;

    .line 195
    .line 196
    check-cast v0, Lw1/i;

    .line 197
    .line 198
    invoke-static {v0, v3, v4}, Lw1/i;->i(Lw1/i;J)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/t;->a()Landroidx/datastore/preferences/protobuf/v;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    check-cast v0, Lw1/i;

    .line 206
    .line 207
    goto :goto_1

    .line 208
    :cond_4
    instance-of v2, v0, Ljava/lang/String;

    .line 209
    .line 210
    if-eqz v2, :cond_5

    .line 211
    .line 212
    invoke-static {}, Lw1/i;->y()Lw1/h;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    check-cast v0, Ljava/lang/String;

    .line 217
    .line 218
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/t;->c()V

    .line 219
    .line 220
    .line 221
    iget-object v3, v2, Landroidx/datastore/preferences/protobuf/t;->b:Landroidx/datastore/preferences/protobuf/v;

    .line 222
    .line 223
    check-cast v3, Lw1/i;

    .line 224
    .line 225
    invoke-static {v3, v0}, Lw1/i;->j(Lw1/i;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/t;->a()Landroidx/datastore/preferences/protobuf/v;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    check-cast v0, Lw1/i;

    .line 233
    .line 234
    goto :goto_1

    .line 235
    :cond_5
    instance-of v2, v0, Ljava/util/Set;

    .line 236
    .line 237
    if-eqz v2, :cond_6

    .line 238
    .line 239
    invoke-static {}, Lw1/i;->y()Lw1/h;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    invoke-static {}, Lw1/g;->l()Lw1/f;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    check-cast v0, Ljava/util/Set;

    .line 248
    .line 249
    check-cast v0, Ljava/lang/Iterable;

    .line 250
    .line 251
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/t;->c()V

    .line 252
    .line 253
    .line 254
    iget-object v4, v3, Landroidx/datastore/preferences/protobuf/t;->b:Landroidx/datastore/preferences/protobuf/v;

    .line 255
    .line 256
    check-cast v4, Lw1/g;

    .line 257
    .line 258
    invoke-static {v4, v0}, Lw1/g;->i(Lw1/g;Ljava/lang/Iterable;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/t;->c()V

    .line 262
    .line 263
    .line 264
    iget-object v0, v2, Landroidx/datastore/preferences/protobuf/t;->b:Landroidx/datastore/preferences/protobuf/v;

    .line 265
    .line 266
    check-cast v0, Lw1/i;

    .line 267
    .line 268
    invoke-static {v0, v3}, Lw1/i;->k(Lw1/i;Lw1/f;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/t;->a()Landroidx/datastore/preferences/protobuf/v;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    check-cast v0, Lw1/i;

    .line 276
    .line 277
    :goto_1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    invoke-virtual {p3}, Landroidx/datastore/preferences/protobuf/t;->c()V

    .line 284
    .line 285
    .line 286
    iget-object v2, p3, Landroidx/datastore/preferences/protobuf/t;->b:Landroidx/datastore/preferences/protobuf/v;

    .line 287
    .line 288
    check-cast v2, Lw1/e;

    .line 289
    .line 290
    invoke-static {v2}, Lw1/e;->i(Lw1/e;)Landroidx/datastore/preferences/protobuf/M;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    invoke-virtual {v2, v1, v0}, Landroidx/datastore/preferences/protobuf/M;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    goto/16 :goto_0

    .line 298
    .line 299
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 300
    .line 301
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    move-result-object p2

    .line 305
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object p2

    .line 309
    const-string p3, "PreferencesSerializer does not support type: "

    .line 310
    .line 311
    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object p2

    .line 315
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    throw p1

    .line 319
    :cond_7
    invoke-virtual {p3}, Landroidx/datastore/preferences/protobuf/t;->a()Landroidx/datastore/preferences/protobuf/v;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    check-cast p1, Lw1/e;

    .line 324
    .line 325
    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/v;->a()I

    .line 326
    .line 327
    .line 328
    move-result p3

    .line 329
    sget-object v0, Landroidx/datastore/preferences/protobuf/j;->h:Ljava/util/logging/Logger;

    .line 330
    .line 331
    const/16 v0, 0x1000

    .line 332
    .line 333
    if-le p3, v0, :cond_8

    .line 334
    .line 335
    move p3, v0

    .line 336
    :cond_8
    new-instance v0, Landroidx/datastore/preferences/protobuf/j;

    .line 337
    .line 338
    check-cast p2, Lod/Y0;

    .line 339
    .line 340
    invoke-direct {v0, p2, p3}, Landroidx/datastore/preferences/protobuf/j;-><init>(Lod/Y0;I)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {p1, v0}, Landroidx/datastore/preferences/protobuf/v;->c(Landroidx/datastore/preferences/protobuf/j;)V

    .line 344
    .line 345
    .line 346
    iget p1, v0, Landroidx/datastore/preferences/protobuf/j;->f:I

    .line 347
    .line 348
    if-lez p1, :cond_9

    .line 349
    .line 350
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/j;->B()V

    .line 351
    .line 352
    .line 353
    :cond_9
    sget-object p1, Lef/C;->a:Lef/C;

    .line 354
    .line 355
    return-object p1
.end method
