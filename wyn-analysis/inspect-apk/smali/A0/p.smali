.class public final LA0/p;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LA0/p;->i:I

    iput-object p1, p0, LA0/p;->j:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method private final b()Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    :cond_0
    iget-object v0, v1, LA0/p;->j:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v2, v0

    .line 6
    check-cast v2, LX/u;

    .line 7
    .line 8
    iget-object v3, v2, LX/u;->f:LP/d;

    .line 9
    .line 10
    monitor-enter v3

    .line 11
    :try_start_0
    iget-boolean v0, v2, LX/u;->c:Z

    .line 12
    .line 13
    if-nez v0, :cond_8

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, v2, LX/u;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 17
    .line 18
    :try_start_1
    iget-object v0, v2, LX/u;->f:LP/d;

    .line 19
    .line 20
    iget v5, v0, LP/d;->c:I

    .line 21
    .line 22
    if-lez v5, :cond_6

    .line 23
    .line 24
    iget-object v0, v0, LP/d;->a:[Ljava/lang/Object;

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    :goto_0
    aget-object v7, v0, v6

    .line 28
    .line 29
    check-cast v7, LX/t;

    .line 30
    .line 31
    iget-object v8, v7, LX/t;->g:Lx/r;

    .line 32
    .line 33
    iget-object v9, v8, Lx/r;->b:[Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v10, v8, Lx/r;->a:[J

    .line 36
    .line 37
    array-length v11, v10

    .line 38
    add-int/lit8 v11, v11, -0x2

    .line 39
    .line 40
    if-ltz v11, :cond_4

    .line 41
    .line 42
    const/4 v12, 0x0

    .line 43
    :goto_1
    aget-wide v13, v10, v12

    .line 44
    .line 45
    move/from16 v16, v5

    .line 46
    .line 47
    not-long v4, v13

    .line 48
    const/16 v17, 0x7

    .line 49
    .line 50
    shl-long v4, v4, v17

    .line 51
    .line 52
    and-long/2addr v4, v13

    .line 53
    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    and-long v4, v4, v17

    .line 59
    .line 60
    cmp-long v4, v4, v17

    .line 61
    .line 62
    if-eqz v4, :cond_3

    .line 63
    .line 64
    sub-int v4, v12, v11

    .line 65
    .line 66
    not-int v4, v4

    .line 67
    ushr-int/lit8 v4, v4, 0x1f

    .line 68
    .line 69
    const/16 v5, 0x8

    .line 70
    .line 71
    rsub-int/lit8 v4, v4, 0x8

    .line 72
    .line 73
    const/4 v15, 0x0

    .line 74
    :goto_2
    if-ge v15, v4, :cond_2

    .line 75
    .line 76
    const-wide/16 v18, 0xff

    .line 77
    .line 78
    and-long v18, v13, v18

    .line 79
    .line 80
    const-wide/16 v20, 0x80

    .line 81
    .line 82
    cmp-long v18, v18, v20

    .line 83
    .line 84
    if-gez v18, :cond_1

    .line 85
    .line 86
    shl-int/lit8 v18, v12, 0x3

    .line 87
    .line 88
    add-int v18, v18, v15

    .line 89
    .line 90
    move/from16 v19, v5

    .line 91
    .line 92
    aget-object v5, v9, v18

    .line 93
    .line 94
    move-object/from16 v18, v0

    .line 95
    .line 96
    iget-object v0, v7, LX/t;->a:Ltf/l;

    .line 97
    .line 98
    invoke-interface {v0, v5}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_1
    move-object/from16 v18, v0

    .line 103
    .line 104
    move/from16 v19, v5

    .line 105
    .line 106
    :goto_3
    shr-long v13, v13, v19

    .line 107
    .line 108
    add-int/lit8 v15, v15, 0x1

    .line 109
    .line 110
    move-object/from16 v0, v18

    .line 111
    .line 112
    move/from16 v5, v19

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_2
    move-object/from16 v18, v0

    .line 116
    .line 117
    move v0, v5

    .line 118
    if-ne v4, v0, :cond_5

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_3
    move-object/from16 v18, v0

    .line 122
    .line 123
    :goto_4
    if-eq v12, v11, :cond_5

    .line 124
    .line 125
    add-int/lit8 v12, v12, 0x1

    .line 126
    .line 127
    move/from16 v5, v16

    .line 128
    .line 129
    move-object/from16 v0, v18

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_4
    move-object/from16 v18, v0

    .line 133
    .line 134
    move/from16 v16, v5

    .line 135
    .line 136
    :cond_5
    invoke-virtual {v8}, Lx/r;->b()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 137
    .line 138
    .line 139
    add-int/lit8 v6, v6, 0x1

    .line 140
    .line 141
    move/from16 v0, v16

    .line 142
    .line 143
    if-lt v6, v0, :cond_7

    .line 144
    .line 145
    :cond_6
    const/4 v15, 0x0

    .line 146
    goto :goto_6

    .line 147
    :cond_7
    move v5, v0

    .line 148
    move-object/from16 v0, v18

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :goto_5
    const/4 v15, 0x0

    .line 152
    goto :goto_7

    .line 153
    :catchall_0
    move-exception v0

    .line 154
    goto :goto_5

    .line 155
    :goto_6
    :try_start_2
    iput-boolean v15, v2, LX/u;->c:Z

    .line 156
    .line 157
    goto :goto_8

    .line 158
    :goto_7
    iput-boolean v15, v2, LX/u;->c:Z

    .line 159
    .line 160
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 161
    :catchall_1
    move-exception v0

    .line 162
    goto :goto_9

    .line 163
    :cond_8
    :goto_8
    monitor-exit v3

    .line 164
    iget-object v0, v1, LA0/p;->j:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v0, LX/u;

    .line 167
    .line 168
    invoke-static {v0}, LX/u;->a(LX/u;)Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-nez v0, :cond_0

    .line 173
    .line 174
    sget-object v0, Lef/C;->a:Lef/C;

    .line 175
    .line 176
    return-object v0

    .line 177
    :goto_9
    monitor-exit v3

    .line 178
    throw v0
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/4 v2, 0x4

    .line 5
    const/16 v3, 0x9

    .line 6
    .line 7
    const/4 v4, 0x3

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x1

    .line 10
    const/4 v7, 0x0

    .line 11
    iget v8, v1, LA0/p;->i:I

    .line 12
    .line 13
    packed-switch v8, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v0, v1, LA0/p;->j:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lt0/f;

    .line 19
    .line 20
    iget-object v2, v0, Lt0/f;->e:Lb0/d;

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    const-string v3, "params"

    .line 25
    .line 26
    iget-object v4, v0, Lt0/f;->f:Lmd/J;

    .line 27
    .line 28
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v3, v2, Lb0/d;->a:Lb0/b;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iput-object v4, v3, Lb0/b;->a:Lb0/a;

    .line 37
    .line 38
    iput-object v5, v3, Lb0/b;->b:LA/e0;

    .line 39
    .line 40
    iget-object v2, v2, Lb0/d;->b:LB/c;

    .line 41
    .line 42
    invoke-virtual {v2, v3}, LB/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    iget-object v2, v3, Lb0/b;->b:LA/e0;

    .line 46
    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string v2, "DrawResult not defined, did you forget to call onDraw?"

    .line 53
    .line 54
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :cond_1
    :goto_0
    iput-boolean v7, v0, Lt0/f;->g:Z

    .line 59
    .line 60
    sget-object v0, Lef/C;->a:Lef/C;

    .line 61
    .line 62
    return-object v0

    .line 63
    :pswitch_0
    new-instance v0, Ll/f;

    .line 64
    .line 65
    iget-object v2, v1, LA0/p;->j:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, Lo5/a;

    .line 68
    .line 69
    invoke-direct {v0, v2, v6}, Ll/f;-><init>(Ljava/lang/Object;I)V

    .line 70
    .line 71
    .line 72
    return-object v0

    .line 73
    :pswitch_1
    iget-object v0, v1, LA0/p;->j:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Lo0/f;

    .line 76
    .line 77
    invoke-virtual {v0}, Lo0/f;->a()LEf/E;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    return-object v0

    .line 82
    :pswitch_2
    iget-object v0, v1, LA0/p;->j:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Lo0/c;

    .line 85
    .line 86
    iget-object v0, v0, Lo0/c;->b:LKd/a;

    .line 87
    .line 88
    return-object v0

    .line 89
    :pswitch_3
    new-instance v0, LDe/a;

    .line 90
    .line 91
    iget-object v2, v1, LA0/p;->j:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v2, Lme/a;

    .line 94
    .line 95
    iget-object v2, v2, Lme/a;->a:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v2, Landroid/app/Application;

    .line 98
    .line 99
    const-string v3, "application"

    .line 100
    .line 101
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 108
    .line 109
    .line 110
    return-object v0

    .line 111
    :pswitch_4
    iget-object v0, v1, LA0/p;->j:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, LE9/c;

    .line 114
    .line 115
    invoke-virtual {v0}, LE9/c;->d()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    iget-object v0, v0, LE9/c;->a:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, Lk3/m;

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Lk3/m;->a()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Lk3/m;->b()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Lk3/m;->g()Lo3/d;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-interface {v0}, Lo3/d;->I()Lo3/a;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-interface {v0, v2}, Lo3/a;->A(Ljava/lang/String;)Lo3/g;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    return-object v0

    .line 145
    :pswitch_5
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 146
    .line 147
    iget-object v2, v1, LA0/p;->j:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v2, Li0/L;

    .line 150
    .line 151
    iget-object v2, v2, Li0/L;->j:LN/Y;

    .line 152
    .line 153
    invoke-virtual {v2, v0}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    sget-object v0, Lef/C;->a:Lef/C;

    .line 157
    .line 158
    return-object v0

    .line 159
    :pswitch_6
    iget-object v0, v1, LA0/p;->j:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v0, Li0/D;

    .line 162
    .line 163
    iput-boolean v6, v0, Li0/D;->c:Z

    .line 164
    .line 165
    iget-object v0, v0, Li0/D;->e:Lkotlin/jvm/internal/n;

    .line 166
    .line 167
    invoke-interface {v0}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    sget-object v0, Lef/C;->a:Lef/C;

    .line 171
    .line 172
    return-object v0

    .line 173
    :pswitch_7
    new-instance v0, Lga/n;

    .line 174
    .line 175
    iget-object v2, v1, LA0/p;->j:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v2, Lu1/i;

    .line 178
    .line 179
    invoke-direct {v0, v2}, Lga/n;-><init>(Lu1/i;)V

    .line 180
    .line 181
    .line 182
    return-object v0

    .line 183
    :pswitch_8
    iget-object v0, v1, LA0/p;->j:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v0, Le/b;

    .line 186
    .line 187
    invoke-virtual {v0, v6}, Landroidx/activity/o;->f(Z)V

    .line 188
    .line 189
    .line 190
    sget-object v0, Lef/C;->a:Lef/C;

    .line 191
    .line 192
    return-object v0

    .line 193
    :pswitch_9
    iget-object v0, v1, LA0/p;->j:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v0, Ldg/e;

    .line 196
    .line 197
    iget-object v3, v0, Ldg/e;->b:Ljava/lang/ClassLoader;

    .line 198
    .line 199
    const-string v4, ""

    .line 200
    .line 201
    invoke-virtual {v3, v4}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    const-string v8, "getResources(...)"

    .line 206
    .line 207
    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-static {v4}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    const-string v9, "list(...)"

    .line 215
    .line 216
    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    new-instance v10, Ljava/util/ArrayList;

    .line 220
    .line 221
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 222
    .line 223
    .line 224
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v11

    .line 232
    iget-object v12, v0, Ldg/e;->c:Lcg/m;

    .line 233
    .line 234
    if-eqz v11, :cond_4

    .line 235
    .line 236
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v11

    .line 240
    check-cast v11, Ljava/net/URL;

    .line 241
    .line 242
    invoke-static {v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v11}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v13

    .line 249
    const-string v14, "file"

    .line 250
    .line 251
    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v13

    .line 255
    if-nez v13, :cond_3

    .line 256
    .line 257
    move-object v13, v5

    .line 258
    goto :goto_2

    .line 259
    :cond_3
    sget-object v13, Lcg/y;->b:Ljava/lang/String;

    .line 260
    .line 261
    new-instance v13, Ljava/io/File;

    .line 262
    .line 263
    invoke-virtual {v11}, Ljava/net/URL;->toURI()Ljava/net/URI;

    .line 264
    .line 265
    .line 266
    move-result-object v11

    .line 267
    invoke-direct {v13, v11}, Ljava/io/File;-><init>(Ljava/net/URI;)V

    .line 268
    .line 269
    .line 270
    invoke-static {v13}, Lad/r;->i(Ljava/io/File;)Lcg/y;

    .line 271
    .line 272
    .line 273
    move-result-object v11

    .line 274
    new-instance v13, Lef/k;

    .line 275
    .line 276
    invoke-direct {v13, v12, v11}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    :goto_2
    if-eqz v13, :cond_2

    .line 280
    .line 281
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    goto :goto_1

    .line 285
    :cond_4
    const-string v0, "META-INF/MANIFEST.MF"

    .line 286
    .line 287
    invoke-virtual {v3, v0}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    invoke-static {v0}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    new-instance v3, Ljava/util/ArrayList;

    .line 302
    .line 303
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 304
    .line 305
    .line 306
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 311
    .line 312
    .line 313
    move-result v4

    .line 314
    if-eqz v4, :cond_14

    .line 315
    .line 316
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v4

    .line 320
    check-cast v4, Ljava/net/URL;

    .line 321
    .line 322
    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v4}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v4

    .line 329
    const-string v8, "toString(...)"

    .line 330
    .line 331
    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    const-string v8, "jar:file:"

    .line 335
    .line 336
    invoke-static {v4, v8, v7}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 337
    .line 338
    .line 339
    move-result v8

    .line 340
    if-nez v8, :cond_5

    .line 341
    .line 342
    :goto_4
    move-object/from16 v18, v3

    .line 343
    .line 344
    goto/16 :goto_f

    .line 345
    .line 346
    :cond_5
    const/4 v8, 0x6

    .line 347
    const-string v9, "!"

    .line 348
    .line 349
    invoke-static {v8, v4, v9}, LBf/k;->A0(ILjava/lang/String;Ljava/lang/String;)I

    .line 350
    .line 351
    .line 352
    move-result v8

    .line 353
    const/4 v9, -0x1

    .line 354
    if-ne v8, v9, :cond_6

    .line 355
    .line 356
    goto :goto_4

    .line 357
    :cond_6
    sget-object v9, Lcg/y;->b:Ljava/lang/String;

    .line 358
    .line 359
    new-instance v9, Ljava/io/File;

    .line 360
    .line 361
    invoke-virtual {v4, v2, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    const-string v8, "substring(...)"

    .line 366
    .line 367
    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    invoke-static {v4}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    invoke-direct {v9, v4}, Ljava/io/File;-><init>(Ljava/net/URI;)V

    .line 375
    .line 376
    .line 377
    invoke-static {v9}, Lad/r;->i(Ljava/io/File;)Lcg/y;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    const-string v8, "not a zip: size="

    .line 382
    .line 383
    invoke-virtual {v12, v4}, Lcg/m;->g(Lcg/y;)Lcg/t;

    .line 384
    .line 385
    .line 386
    move-result-object v9

    .line 387
    :try_start_0
    invoke-virtual {v9}, Lcg/t;->a()J

    .line 388
    .line 389
    .line 390
    move-result-wide v13

    .line 391
    const/16 v11, 0x16

    .line 392
    .line 393
    move-object/from16 v16, v8

    .line 394
    .line 395
    int-to-long v7, v11

    .line 396
    sub-long/2addr v13, v7

    .line 397
    const-wide/16 v7, 0x0

    .line 398
    .line 399
    cmp-long v11, v13, v7

    .line 400
    .line 401
    if-ltz v11, :cond_13

    .line 402
    .line 403
    const-wide/32 v16, 0x10000

    .line 404
    .line 405
    .line 406
    move-object/from16 v18, v3

    .line 407
    .line 408
    sub-long v2, v13, v16

    .line 409
    .line 410
    invoke-static {v2, v3, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 411
    .line 412
    .line 413
    move-result-wide v2

    .line 414
    :goto_5
    invoke-virtual {v9, v13, v14}, Lcg/t;->b(J)Lcg/l;

    .line 415
    .line 416
    .line 417
    move-result-object v16

    .line 418
    move-wide/from16 v19, v7

    .line 419
    .line 420
    invoke-static/range {v16 .. v16}, Lcg/b;->d(Lcg/H;)Lcg/B;

    .line 421
    .line 422
    .line 423
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 424
    :try_start_1
    invoke-virtual {v7}, Lcg/B;->readIntLe()I

    .line 425
    .line 426
    .line 427
    move-result v8

    .line 428
    const v11, 0x6054b50

    .line 429
    .line 430
    .line 431
    if-ne v8, v11, :cond_11

    .line 432
    .line 433
    invoke-virtual {v7}, Lcg/B;->readShortLe()S

    .line 434
    .line 435
    .line 436
    move-result v2

    .line 437
    const v3, 0xffff

    .line 438
    .line 439
    .line 440
    and-int/2addr v2, v3

    .line 441
    invoke-virtual {v7}, Lcg/B;->readShortLe()S

    .line 442
    .line 443
    .line 444
    move-result v8

    .line 445
    and-int/2addr v8, v3

    .line 446
    invoke-virtual {v7}, Lcg/B;->readShortLe()S

    .line 447
    .line 448
    .line 449
    move-result v11

    .line 450
    and-int/2addr v11, v3

    .line 451
    move/from16 v21, v3

    .line 452
    .line 453
    move-object/from16 v17, v4

    .line 454
    .line 455
    int-to-long v3, v11

    .line 456
    invoke-virtual {v7}, Lcg/B;->readShortLe()S

    .line 457
    .line 458
    .line 459
    move-result v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    .line 460
    and-int v11, v11, v21

    .line 461
    .line 462
    int-to-long v5, v11

    .line 463
    cmp-long v5, v3, v5

    .line 464
    .line 465
    const-string v6, "unsupported zip: spanned"

    .line 466
    .line 467
    if-nez v5, :cond_10

    .line 468
    .line 469
    if-nez v2, :cond_10

    .line 470
    .line 471
    if-nez v8, :cond_10

    .line 472
    .line 473
    move-wide/from16 v22, v3

    .line 474
    .line 475
    const-wide/16 v2, 0x4

    .line 476
    .line 477
    :try_start_2
    invoke-virtual {v7, v2, v3}, Lcg/B;->skip(J)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v7}, Lcg/B;->readIntLe()I

    .line 481
    .line 482
    .line 483
    move-result v2

    .line 484
    int-to-long v2, v2

    .line 485
    const-wide v4, 0xffffffffL

    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    and-long v24, v2, v4

    .line 491
    .line 492
    invoke-virtual {v7}, Lcg/B;->readShortLe()S

    .line 493
    .line 494
    .line 495
    move-result v2

    .line 496
    and-int v33, v2, v21

    .line 497
    .line 498
    new-instance v21, LC8/j;

    .line 499
    .line 500
    move/from16 v26, v33

    .line 501
    .line 502
    invoke-direct/range {v21 .. v26}, LC8/j;-><init>(JJI)V

    .line 503
    .line 504
    .line 505
    move/from16 v2, v26

    .line 506
    .line 507
    int-to-long v3, v2

    .line 508
    invoke-virtual {v7, v3, v4}, Lcg/B;->readUtf8(J)Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_7

    .line 509
    .line 510
    .line 511
    :try_start_3
    invoke-virtual {v7}, Lcg/B;->close()V

    .line 512
    .line 513
    .line 514
    const/16 v3, 0x14

    .line 515
    .line 516
    int-to-long v3, v3

    .line 517
    sub-long/2addr v13, v3

    .line 518
    cmp-long v3, v13, v19

    .line 519
    .line 520
    if-lez v3, :cond_b

    .line 521
    .line 522
    invoke-virtual {v9, v13, v14}, Lcg/t;->b(J)Lcg/l;

    .line 523
    .line 524
    .line 525
    move-result-object v3

    .line 526
    invoke-static {v3}, Lcg/b;->d(Lcg/H;)Lcg/B;

    .line 527
    .line 528
    .line 529
    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 530
    :try_start_4
    invoke-virtual {v3}, Lcg/B;->readIntLe()I

    .line 531
    .line 532
    .line 533
    move-result v4

    .line 534
    const v5, 0x7064b50

    .line 535
    .line 536
    .line 537
    if-ne v4, v5, :cond_a

    .line 538
    .line 539
    invoke-virtual {v3}, Lcg/B;->readIntLe()I

    .line 540
    .line 541
    .line 542
    move-result v4

    .line 543
    invoke-virtual {v3}, Lcg/B;->readLongLe()J

    .line 544
    .line 545
    .line 546
    move-result-wide v7

    .line 547
    invoke-virtual {v3}, Lcg/B;->readIntLe()I

    .line 548
    .line 549
    .line 550
    move-result v5

    .line 551
    const/4 v11, 0x1

    .line 552
    if-ne v5, v11, :cond_9

    .line 553
    .line 554
    if-nez v4, :cond_9

    .line 555
    .line 556
    invoke-virtual {v9, v7, v8}, Lcg/t;->b(J)Lcg/l;

    .line 557
    .line 558
    .line 559
    move-result-object v4

    .line 560
    invoke-static {v4}, Lcg/b;->d(Lcg/H;)Lcg/B;

    .line 561
    .line 562
    .line 563
    move-result-object v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 564
    :try_start_5
    invoke-virtual {v4}, Lcg/B;->readIntLe()I

    .line 565
    .line 566
    .line 567
    move-result v5

    .line 568
    const v7, 0x6064b50

    .line 569
    .line 570
    .line 571
    if-ne v5, v7, :cond_8

    .line 572
    .line 573
    const-wide/16 v7, 0xc

    .line 574
    .line 575
    invoke-virtual {v4, v7, v8}, Lcg/B;->skip(J)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v4}, Lcg/B;->readIntLe()I

    .line 579
    .line 580
    .line 581
    move-result v5

    .line 582
    invoke-virtual {v4}, Lcg/B;->readIntLe()I

    .line 583
    .line 584
    .line 585
    move-result v7

    .line 586
    invoke-virtual {v4}, Lcg/B;->readLongLe()J

    .line 587
    .line 588
    .line 589
    move-result-wide v29

    .line 590
    invoke-virtual {v4}, Lcg/B;->readLongLe()J

    .line 591
    .line 592
    .line 593
    move-result-wide v13

    .line 594
    cmp-long v8, v29, v13

    .line 595
    .line 596
    if-nez v8, :cond_7

    .line 597
    .line 598
    if-nez v5, :cond_7

    .line 599
    .line 600
    if-nez v7, :cond_7

    .line 601
    .line 602
    const-wide/16 v5, 0x8

    .line 603
    .line 604
    invoke-virtual {v4, v5, v6}, Lcg/B;->skip(J)V

    .line 605
    .line 606
    .line 607
    invoke-virtual {v4}, Lcg/B;->readLongLe()J

    .line 608
    .line 609
    .line 610
    move-result-wide v31

    .line 611
    new-instance v28, LC8/j;

    .line 612
    .line 613
    move/from16 v33, v2

    .line 614
    .line 615
    invoke-direct/range {v28 .. v33}, LC8/j;-><init>(JJI)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 616
    .line 617
    .line 618
    :try_start_6
    invoke-virtual {v4}, Lcg/B;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 619
    .line 620
    .line 621
    move-object/from16 v21, v28

    .line 622
    .line 623
    goto :goto_9

    .line 624
    :goto_6
    move-object v2, v0

    .line 625
    goto :goto_b

    .line 626
    :cond_7
    :try_start_7
    new-instance v0, Ljava/io/IOException;

    .line 627
    .line 628
    invoke-direct {v0, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 629
    .line 630
    .line 631
    throw v0

    .line 632
    :goto_7
    move-object v2, v0

    .line 633
    goto :goto_8

    .line 634
    :cond_8
    new-instance v0, Ljava/io/IOException;

    .line 635
    .line 636
    new-instance v2, Ljava/lang/StringBuilder;

    .line 637
    .line 638
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 639
    .line 640
    .line 641
    const-string v6, "bad zip: expected "

    .line 642
    .line 643
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 644
    .line 645
    .line 646
    invoke-static {v7}, Ldg/b;->c(I)Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v6

    .line 650
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 651
    .line 652
    .line 653
    const-string v6, " but was "

    .line 654
    .line 655
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 656
    .line 657
    .line 658
    invoke-static {v5}, Ldg/b;->c(I)Ljava/lang/String;

    .line 659
    .line 660
    .line 661
    move-result-object v5

    .line 662
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v2

    .line 669
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 670
    .line 671
    .line 672
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 673
    :catchall_0
    move-exception v0

    .line 674
    goto :goto_7

    .line 675
    :goto_8
    :try_start_8
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 676
    :catchall_1
    move-exception v0

    .line 677
    :try_start_9
    invoke-static {v4, v2}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 678
    .line 679
    .line 680
    throw v0

    .line 681
    :catchall_2
    move-exception v0

    .line 682
    goto :goto_6

    .line 683
    :cond_9
    new-instance v0, Ljava/io/IOException;

    .line 684
    .line 685
    invoke-direct {v0, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 689
    :cond_a
    :goto_9
    :try_start_a
    invoke-virtual {v3}, Lcg/B;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 690
    .line 691
    .line 692
    :cond_b
    move-object/from16 v2, v21

    .line 693
    .line 694
    goto :goto_c

    .line 695
    :goto_a
    move-object v2, v0

    .line 696
    goto/16 :goto_12

    .line 697
    .line 698
    :goto_b
    :try_start_b
    throw v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 699
    :catchall_3
    move-exception v0

    .line 700
    :try_start_c
    invoke-static {v3, v2}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 701
    .line 702
    .line 703
    throw v0

    .line 704
    :catchall_4
    move-exception v0

    .line 705
    goto :goto_a

    .line 706
    :goto_c
    iget-wide v3, v2, LC8/j;->b:J

    .line 707
    .line 708
    new-instance v5, Ljava/util/ArrayList;

    .line 709
    .line 710
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v9, v3, v4}, Lcg/t;->b(J)Lcg/l;

    .line 714
    .line 715
    .line 716
    move-result-object v6

    .line 717
    invoke-static {v6}, Lcg/b;->d(Lcg/H;)Lcg/B;

    .line 718
    .line 719
    .line 720
    move-result-object v6
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 721
    :try_start_d
    iget-wide v7, v2, LC8/j;->a:J

    .line 722
    .line 723
    :goto_d
    cmp-long v2, v19, v7

    .line 724
    .line 725
    if-gez v2, :cond_e

    .line 726
    .line 727
    invoke-static {v6}, Ldg/b;->d(Lcg/B;)Ldg/f;

    .line 728
    .line 729
    .line 730
    move-result-object v2

    .line 731
    iget-wide v13, v2, Ldg/f;->g:J

    .line 732
    .line 733
    cmp-long v11, v13, v3

    .line 734
    .line 735
    if-gez v11, :cond_d

    .line 736
    .line 737
    sget-object v11, Ldg/e;->e:Lcg/y;

    .line 738
    .line 739
    iget-object v11, v2, Ldg/f;->a:Lcg/y;

    .line 740
    .line 741
    invoke-static {v11}, La9/b;->g(Lcg/y;)Z

    .line 742
    .line 743
    .line 744
    move-result v11

    .line 745
    if-eqz v11, :cond_c

    .line 746
    .line 747
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 748
    .line 749
    .line 750
    goto :goto_e

    .line 751
    :catchall_5
    move-exception v0

    .line 752
    move-object v2, v0

    .line 753
    goto :goto_10

    .line 754
    :cond_c
    :goto_e
    const-wide/16 v13, 0x1

    .line 755
    .line 756
    add-long v19, v19, v13

    .line 757
    .line 758
    goto :goto_d

    .line 759
    :cond_d
    new-instance v0, Ljava/io/IOException;

    .line 760
    .line 761
    const-string v2, "bad zip: local file header offset >= central directory offset"

    .line 762
    .line 763
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 764
    .line 765
    .line 766
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 767
    :cond_e
    :try_start_e
    invoke-virtual {v6}, Lcg/B;->close()V

    .line 768
    .line 769
    .line 770
    invoke-static {v5}, Ldg/b;->b(Ljava/util/ArrayList;)Ljava/util/LinkedHashMap;

    .line 771
    .line 772
    .line 773
    move-result-object v2

    .line 774
    new-instance v3, Lcg/K;

    .line 775
    .line 776
    move-object/from16 v4, v17

    .line 777
    .line 778
    invoke-direct {v3, v4, v12, v2}, Lcg/K;-><init>(Lcg/y;Lcg/m;Ljava/util/LinkedHashMap;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 779
    .line 780
    .line 781
    invoke-virtual {v9}, Lcg/t;->close()V

    .line 782
    .line 783
    .line 784
    new-instance v2, Lef/k;

    .line 785
    .line 786
    sget-object v4, Ldg/e;->e:Lcg/y;

    .line 787
    .line 788
    invoke-direct {v2, v3, v4}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 789
    .line 790
    .line 791
    move-object v5, v2

    .line 792
    :goto_f
    move-object/from16 v6, v18

    .line 793
    .line 794
    if-eqz v5, :cond_f

    .line 795
    .line 796
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 797
    .line 798
    .line 799
    :cond_f
    move-object v3, v6

    .line 800
    const/4 v2, 0x4

    .line 801
    const/4 v5, 0x0

    .line 802
    const/4 v6, 0x1

    .line 803
    const/4 v7, 0x0

    .line 804
    goto/16 :goto_3

    .line 805
    .line 806
    :goto_10
    :try_start_f
    throw v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 807
    :catchall_6
    move-exception v0

    .line 808
    :try_start_10
    invoke-static {v6, v2}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 809
    .line 810
    .line 811
    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 812
    :catchall_7
    move-exception v0

    .line 813
    goto :goto_11

    .line 814
    :cond_10
    :try_start_11
    new-instance v0, Ljava/io/IOException;

    .line 815
    .line 816
    invoke-direct {v0, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 817
    .line 818
    .line 819
    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 820
    :cond_11
    move-object/from16 v6, v18

    .line 821
    .line 822
    :try_start_12
    invoke-virtual {v7}, Lcg/B;->close()V

    .line 823
    .line 824
    .line 825
    const-wide/16 v7, -0x1

    .line 826
    .line 827
    add-long/2addr v13, v7

    .line 828
    cmp-long v5, v13, v2

    .line 829
    .line 830
    if-ltz v5, :cond_12

    .line 831
    .line 832
    move-object/from16 v18, v6

    .line 833
    .line 834
    move-wide/from16 v7, v19

    .line 835
    .line 836
    const/4 v5, 0x0

    .line 837
    const/4 v6, 0x1

    .line 838
    goto/16 :goto_5

    .line 839
    .line 840
    :cond_12
    new-instance v0, Ljava/io/IOException;

    .line 841
    .line 842
    const-string v2, "not a zip: end of central directory signature not found"

    .line 843
    .line 844
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 845
    .line 846
    .line 847
    throw v0

    .line 848
    :goto_11
    invoke-virtual {v7}, Lcg/B;->close()V

    .line 849
    .line 850
    .line 851
    throw v0

    .line 852
    :cond_13
    new-instance v0, Ljava/io/IOException;

    .line 853
    .line 854
    new-instance v2, Ljava/lang/StringBuilder;

    .line 855
    .line 856
    move-object/from16 v3, v16

    .line 857
    .line 858
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 859
    .line 860
    .line 861
    invoke-virtual {v9}, Lcg/t;->a()J

    .line 862
    .line 863
    .line 864
    move-result-wide v3

    .line 865
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 866
    .line 867
    .line 868
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 869
    .line 870
    .line 871
    move-result-object v2

    .line 872
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 873
    .line 874
    .line 875
    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    .line 876
    :goto_12
    :try_start_13
    throw v2
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    .line 877
    :catchall_8
    move-exception v0

    .line 878
    invoke-static {v9, v2}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 879
    .line 880
    .line 881
    throw v0

    .line 882
    :cond_14
    move-object v6, v3

    .line 883
    invoke-static {v6, v10}, Lff/o;->E0(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 884
    .line 885
    .line 886
    move-result-object v0

    .line 887
    return-object v0

    .line 888
    :pswitch_a
    iget-object v0, v1, LA0/p;->j:Ljava/lang/Object;

    .line 889
    .line 890
    check-cast v0, Lc0/d;

    .line 891
    .line 892
    iget-object v2, v0, Lc0/d;->d:LP/d;

    .line 893
    .line 894
    invoke-virtual {v2}, LP/d;->i()Z

    .line 895
    .line 896
    .line 897
    move-result v2

    .line 898
    if-eqz v2, :cond_15

    .line 899
    .line 900
    sget-object v2, Lc0/r;->f:Lc0/r;

    .line 901
    .line 902
    iget-object v0, v0, Lc0/d;->a:Ljava/lang/Object;

    .line 903
    .line 904
    invoke-interface {v0, v2}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 905
    .line 906
    .line 907
    :cond_15
    sget-object v0, Lef/C;->a:Lef/C;

    .line 908
    .line 909
    return-object v0

    .line 910
    :pswitch_b
    iget-object v0, v1, LA0/p;->j:Ljava/lang/Object;

    .line 911
    .line 912
    check-cast v0, Landroidx/lifecycle/f0;

    .line 913
    .line 914
    invoke-static {v0}, Landroidx/lifecycle/V;->g(Landroidx/lifecycle/f0;)Landroidx/lifecycle/X;

    .line 915
    .line 916
    .line 917
    move-result-object v0

    .line 918
    return-object v0

    .line 919
    :pswitch_c
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    .line 920
    .line 921
    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 922
    .line 923
    .line 924
    new-instance v5, LZ3/b;

    .line 925
    .line 926
    iget-object v6, v1, LA0/p;->j:Ljava/lang/Object;

    .line 927
    .line 928
    check-cast v6, LZ3/e;

    .line 929
    .line 930
    iget-object v7, v6, LZ3/e;->a:LZ3/k;

    .line 931
    .line 932
    invoke-virtual {v7}, LZ3/k;->b()Lcg/i;

    .line 933
    .line 934
    .line 935
    move-result-object v8

    .line 936
    check-cast v8, Lcg/H;

    .line 937
    .line 938
    invoke-direct {v5, v8}, LZ3/b;-><init>(Lcg/H;)V

    .line 939
    .line 940
    .line 941
    invoke-static {v5}, Lcg/b;->d(Lcg/H;)Lcg/B;

    .line 942
    .line 943
    .line 944
    move-result-object v8

    .line 945
    const/4 v11, 0x1

    .line 946
    iput-boolean v11, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 947
    .line 948
    new-instance v9, Lcg/z;

    .line 949
    .line 950
    invoke-direct {v9, v8}, Lcg/z;-><init>(Lcg/i;)V

    .line 951
    .line 952
    .line 953
    invoke-static {v9}, Lcg/b;->d(Lcg/H;)Lcg/B;

    .line 954
    .line 955
    .line 956
    move-result-object v9

    .line 957
    new-instance v10, LCd/t;

    .line 958
    .line 959
    invoke-direct {v10, v9, v4}, LCd/t;-><init>(Ljava/lang/Object;I)V

    .line 960
    .line 961
    .line 962
    const/4 v9, 0x0

    .line 963
    invoke-static {v10, v9, v2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 964
    .line 965
    .line 966
    iget-object v9, v5, LZ3/b;->c:Ljava/lang/Object;

    .line 967
    .line 968
    check-cast v9, Ljava/lang/Exception;

    .line 969
    .line 970
    if-nez v9, :cond_41

    .line 971
    .line 972
    const/4 v15, 0x0

    .line 973
    iput-boolean v15, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 974
    .line 975
    sget-object v9, LZ3/h;->a:Landroid/graphics/Paint;

    .line 976
    .line 977
    iget-object v9, v2, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 978
    .line 979
    sget-object v10, LZ3/i;->a:Ljava/util/Set;

    .line 980
    .line 981
    invoke-static {v0}, LA/f;->f(I)I

    .line 982
    .line 983
    .line 984
    move-result v10

    .line 985
    const/16 v11, 0x10e

    .line 986
    .line 987
    const/16 v12, 0x5a

    .line 988
    .line 989
    if-eqz v10, :cond_19

    .line 990
    .line 991
    const/4 v13, 0x1

    .line 992
    if-eq v10, v13, :cond_17

    .line 993
    .line 994
    if-ne v10, v0, :cond_16

    .line 995
    .line 996
    goto :goto_13

    .line 997
    :cond_16
    new-instance v0, LE5/Q;

    .line 998
    .line 999
    const/4 v15, 0x0

    .line 1000
    invoke-direct {v0, v15, v3}, LE5/Q;-><init>(BI)V

    .line 1001
    .line 1002
    .line 1003
    throw v0

    .line 1004
    :cond_17
    if-eqz v9, :cond_19

    .line 1005
    .line 1006
    sget-object v10, LZ3/i;->a:Ljava/util/Set;

    .line 1007
    .line 1008
    invoke-interface {v10, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1009
    .line 1010
    .line 1011
    move-result v9

    .line 1012
    if-eqz v9, :cond_19

    .line 1013
    .line 1014
    :goto_13
    new-instance v9, LB1/h;

    .line 1015
    .line 1016
    new-instance v10, LY4/a;

    .line 1017
    .line 1018
    new-instance v13, Lcg/z;

    .line 1019
    .line 1020
    invoke-direct {v13, v8}, Lcg/z;-><init>(Lcg/i;)V

    .line 1021
    .line 1022
    .line 1023
    invoke-static {v13}, Lcg/b;->d(Lcg/H;)Lcg/B;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v13

    .line 1027
    new-instance v14, LCd/t;

    .line 1028
    .line 1029
    invoke-direct {v14, v13, v4}, LCd/t;-><init>(Ljava/lang/Object;I)V

    .line 1030
    .line 1031
    .line 1032
    invoke-direct {v10, v14}, LY4/a;-><init>(Ljava/io/InputStream;)V

    .line 1033
    .line 1034
    .line 1035
    invoke-direct {v9, v10}, LB1/h;-><init>(Ljava/io/InputStream;)V

    .line 1036
    .line 1037
    .line 1038
    new-instance v10, LZ3/g;

    .line 1039
    .line 1040
    invoke-virtual {v9}, LB1/h;->e()I

    .line 1041
    .line 1042
    .line 1043
    move-result v13

    .line 1044
    if-eq v13, v0, :cond_18

    .line 1045
    .line 1046
    const/4 v0, 0x7

    .line 1047
    if-eq v13, v0, :cond_18

    .line 1048
    .line 1049
    const/4 v0, 0x4

    .line 1050
    if-eq v13, v0, :cond_18

    .line 1051
    .line 1052
    const/4 v0, 0x5

    .line 1053
    if-eq v13, v0, :cond_18

    .line 1054
    .line 1055
    const/4 v0, 0x0

    .line 1056
    goto :goto_14

    .line 1057
    :cond_18
    const/4 v0, 0x1

    .line 1058
    :goto_14
    invoke-virtual {v9}, LB1/h;->e()I

    .line 1059
    .line 1060
    .line 1061
    move-result v9

    .line 1062
    packed-switch v9, :pswitch_data_1

    .line 1063
    .line 1064
    .line 1065
    const/4 v9, 0x0

    .line 1066
    goto :goto_15

    .line 1067
    :pswitch_d
    move v9, v12

    .line 1068
    goto :goto_15

    .line 1069
    :pswitch_e
    move v9, v11

    .line 1070
    goto :goto_15

    .line 1071
    :pswitch_f
    const/16 v9, 0xb4

    .line 1072
    .line 1073
    :goto_15
    invoke-direct {v10, v0, v9}, LZ3/g;-><init>(ZI)V

    .line 1074
    .line 1075
    .line 1076
    goto :goto_16

    .line 1077
    :cond_19
    sget-object v10, LZ3/g;->c:LZ3/g;

    .line 1078
    .line 1079
    :goto_16
    iget-object v0, v5, LZ3/b;->c:Ljava/lang/Object;

    .line 1080
    .line 1081
    check-cast v0, Ljava/lang/Exception;

    .line 1082
    .line 1083
    if-nez v0, :cond_40

    .line 1084
    .line 1085
    const/4 v15, 0x0

    .line 1086
    iput-boolean v15, v2, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 1087
    .line 1088
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1089
    .line 1090
    const/16 v9, 0x1a

    .line 1091
    .line 1092
    iget-object v6, v6, LZ3/e;->b:Lh4/l;

    .line 1093
    .line 1094
    if-lt v0, v9, :cond_1a

    .line 1095
    .line 1096
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1097
    .line 1098
    .line 1099
    :cond_1a
    iget-boolean v13, v6, Lh4/l;->g:Z

    .line 1100
    .line 1101
    iput-boolean v13, v2, Landroid/graphics/BitmapFactory$Options;->inPremultiplied:Z

    .line 1102
    .line 1103
    iget v13, v10, LZ3/g;->b:I

    .line 1104
    .line 1105
    iget-object v14, v6, Lh4/l;->b:Landroid/graphics/Bitmap$Config;

    .line 1106
    .line 1107
    iget-boolean v10, v10, LZ3/g;->a:Z

    .line 1108
    .line 1109
    if-nez v10, :cond_1b

    .line 1110
    .line 1111
    if-lez v13, :cond_1d

    .line 1112
    .line 1113
    :cond_1b
    if-eqz v14, :cond_1c

    .line 1114
    .line 1115
    if-lt v0, v9, :cond_1d

    .line 1116
    .line 1117
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->p()Landroid/graphics/Bitmap$Config;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v15

    .line 1121
    if-ne v14, v15, :cond_1d

    .line 1122
    .line 1123
    :cond_1c
    sget-object v14, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 1124
    .line 1125
    :cond_1d
    iget-boolean v15, v6, Lh4/l;->f:Z

    .line 1126
    .line 1127
    if-eqz v15, :cond_1e

    .line 1128
    .line 1129
    sget-object v15, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 1130
    .line 1131
    if-ne v14, v15, :cond_1e

    .line 1132
    .line 1133
    iget-object v15, v2, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 1134
    .line 1135
    const-string v4, "image/jpeg"

    .line 1136
    .line 1137
    invoke-static {v15, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1138
    .line 1139
    .line 1140
    move-result v4

    .line 1141
    if-eqz v4, :cond_1e

    .line 1142
    .line 1143
    sget-object v14, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 1144
    .line 1145
    :cond_1e
    if-lt v0, v9, :cond_1f

    .line 1146
    .line 1147
    invoke-static {v2}, LU1/b;->f(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap$Config;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v0

    .line 1151
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->d()Landroid/graphics/Bitmap$Config;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v4

    .line 1155
    if-ne v0, v4, :cond_1f

    .line 1156
    .line 1157
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->p()Landroid/graphics/Bitmap$Config;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v0

    .line 1161
    if-eq v14, v0, :cond_1f

    .line 1162
    .line 1163
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->d()Landroid/graphics/Bitmap$Config;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v14

    .line 1167
    :cond_1f
    iput-object v14, v2, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 1168
    .line 1169
    invoke-virtual {v7}, LZ3/k;->a()LA6/c;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v0

    .line 1173
    instance-of v4, v0, LZ3/l;

    .line 1174
    .line 1175
    iget-object v7, v6, Lh4/l;->a:Landroid/content/Context;

    .line 1176
    .line 1177
    iget-object v9, v6, Lh4/l;->c:Li4/f;

    .line 1178
    .line 1179
    if-eqz v4, :cond_20

    .line 1180
    .line 1181
    sget-object v4, Li4/f;->c:Li4/f;

    .line 1182
    .line 1183
    invoke-static {v9, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1184
    .line 1185
    .line 1186
    move-result v4

    .line 1187
    if-eqz v4, :cond_20

    .line 1188
    .line 1189
    const/4 v4, 0x1

    .line 1190
    iput v4, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 1191
    .line 1192
    iput-boolean v4, v2, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 1193
    .line 1194
    check-cast v0, LZ3/l;

    .line 1195
    .line 1196
    iget v0, v0, LZ3/l;->e:I

    .line 1197
    .line 1198
    iput v0, v2, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 1199
    .line 1200
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v0

    .line 1204
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v0

    .line 1208
    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 1209
    .line 1210
    iput v0, v2, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 1211
    .line 1212
    move-object/from16 v21, v7

    .line 1213
    .line 1214
    move v7, v10

    .line 1215
    goto/16 :goto_21

    .line 1216
    .line 1217
    :cond_20
    iget v0, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 1218
    .line 1219
    if-lez v0, :cond_21

    .line 1220
    .line 1221
    iget v4, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 1222
    .line 1223
    if-gtz v4, :cond_22

    .line 1224
    .line 1225
    :cond_21
    move-object/from16 v21, v7

    .line 1226
    .line 1227
    move v7, v10

    .line 1228
    const/4 v11, 0x1

    .line 1229
    goto/16 :goto_20

    .line 1230
    .line 1231
    :cond_22
    if-eq v13, v12, :cond_24

    .line 1232
    .line 1233
    if-ne v13, v11, :cond_23

    .line 1234
    .line 1235
    goto :goto_17

    .line 1236
    :cond_23
    move v14, v0

    .line 1237
    goto :goto_18

    .line 1238
    :cond_24
    :goto_17
    move v14, v4

    .line 1239
    :goto_18
    if-eq v13, v12, :cond_26

    .line 1240
    .line 1241
    if-ne v13, v11, :cond_25

    .line 1242
    .line 1243
    goto :goto_19

    .line 1244
    :cond_25
    move v0, v4

    .line 1245
    :cond_26
    :goto_19
    sget-object v4, Li4/f;->c:Li4/f;

    .line 1246
    .line 1247
    invoke-static {v9, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1248
    .line 1249
    .line 1250
    move-result v15

    .line 1251
    iget v11, v6, Lh4/l;->d:I

    .line 1252
    .line 1253
    if-eqz v15, :cond_27

    .line 1254
    .line 1255
    move v15, v14

    .line 1256
    goto :goto_1a

    .line 1257
    :cond_27
    iget-object v15, v9, Li4/f;->a:Lp7/b;

    .line 1258
    .line 1259
    invoke-static {v15, v11}, Lk4/e;->d(Lp7/b;I)I

    .line 1260
    .line 1261
    .line 1262
    move-result v15

    .line 1263
    :goto_1a
    invoke-static {v9, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1264
    .line 1265
    .line 1266
    move-result v4

    .line 1267
    if-eqz v4, :cond_28

    .line 1268
    .line 1269
    move v4, v0

    .line 1270
    goto :goto_1b

    .line 1271
    :cond_28
    iget-object v4, v9, Li4/f;->b:Lp7/b;

    .line 1272
    .line 1273
    invoke-static {v4, v11}, Lk4/e;->d(Lp7/b;I)I

    .line 1274
    .line 1275
    .line 1276
    move-result v4

    .line 1277
    :goto_1b
    div-int v9, v14, v15

    .line 1278
    .line 1279
    invoke-static {v9}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 1280
    .line 1281
    .line 1282
    move-result v9

    .line 1283
    div-int v19, v0, v4

    .line 1284
    .line 1285
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 1286
    .line 1287
    .line 1288
    move-result v12

    .line 1289
    invoke-static {v11}, LA/f;->f(I)I

    .line 1290
    .line 1291
    .line 1292
    move-result v3

    .line 1293
    if-eqz v3, :cond_2a

    .line 1294
    .line 1295
    move-object/from16 v21, v7

    .line 1296
    .line 1297
    const/4 v7, 0x1

    .line 1298
    if-ne v3, v7, :cond_29

    .line 1299
    .line 1300
    invoke-static {v9, v12}, Ljava/lang/Math;->max(II)I

    .line 1301
    .line 1302
    .line 1303
    move-result v3

    .line 1304
    move v9, v3

    .line 1305
    move v3, v15

    .line 1306
    goto :goto_1c

    .line 1307
    :cond_29
    new-instance v0, LE5/Q;

    .line 1308
    .line 1309
    const/16 v2, 0x9

    .line 1310
    .line 1311
    const/4 v15, 0x0

    .line 1312
    invoke-direct {v0, v15, v2}, LE5/Q;-><init>(BI)V

    .line 1313
    .line 1314
    .line 1315
    throw v0

    .line 1316
    :cond_2a
    move-object/from16 v21, v7

    .line 1317
    .line 1318
    move v3, v15

    .line 1319
    const/4 v7, 0x1

    .line 1320
    invoke-static {v9, v12}, Ljava/lang/Math;->min(II)I

    .line 1321
    .line 1322
    .line 1323
    move-result v9

    .line 1324
    :goto_1c
    if-ge v9, v7, :cond_2b

    .line 1325
    .line 1326
    const/4 v9, 0x1

    .line 1327
    :cond_2b
    iput v9, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 1328
    .line 1329
    move v7, v10

    .line 1330
    move v12, v11

    .line 1331
    int-to-double v10, v14

    .line 1332
    move-wide/from16 v22, v10

    .line 1333
    .line 1334
    int-to-double v9, v9

    .line 1335
    div-double v22, v22, v9

    .line 1336
    .line 1337
    move-wide/from16 v24, v9

    .line 1338
    .line 1339
    int-to-double v9, v0

    .line 1340
    div-double v9, v9, v24

    .line 1341
    .line 1342
    move-wide/from16 v24, v9

    .line 1343
    .line 1344
    int-to-double v9, v3

    .line 1345
    int-to-double v3, v4

    .line 1346
    div-double v9, v9, v22

    .line 1347
    .line 1348
    div-double v3, v3, v24

    .line 1349
    .line 1350
    invoke-static {v12}, LA/f;->f(I)I

    .line 1351
    .line 1352
    .line 1353
    move-result v0

    .line 1354
    if-eqz v0, :cond_2d

    .line 1355
    .line 1356
    const/4 v11, 0x1

    .line 1357
    if-ne v0, v11, :cond_2c

    .line 1358
    .line 1359
    invoke-static {v9, v10, v3, v4}, Ljava/lang/Math;->min(DD)D

    .line 1360
    .line 1361
    .line 1362
    move-result-wide v3

    .line 1363
    goto :goto_1d

    .line 1364
    :cond_2c
    new-instance v0, LE5/Q;

    .line 1365
    .line 1366
    const/16 v2, 0x9

    .line 1367
    .line 1368
    const/4 v15, 0x0

    .line 1369
    invoke-direct {v0, v15, v2}, LE5/Q;-><init>(BI)V

    .line 1370
    .line 1371
    .line 1372
    throw v0

    .line 1373
    :cond_2d
    invoke-static {v9, v10, v3, v4}, Ljava/lang/Math;->max(DD)D

    .line 1374
    .line 1375
    .line 1376
    move-result-wide v3

    .line 1377
    :goto_1d
    iget-boolean v0, v6, Lh4/l;->e:Z

    .line 1378
    .line 1379
    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    .line 1380
    .line 1381
    if-eqz v0, :cond_2e

    .line 1382
    .line 1383
    cmpl-double v0, v3, v9

    .line 1384
    .line 1385
    if-lez v0, :cond_2e

    .line 1386
    .line 1387
    move-wide v3, v9

    .line 1388
    :cond_2e
    cmpg-double v0, v3, v9

    .line 1389
    .line 1390
    if-nez v0, :cond_2f

    .line 1391
    .line 1392
    const/4 v0, 0x1

    .line 1393
    :goto_1e
    const/16 v27, 0x1

    .line 1394
    .line 1395
    goto :goto_1f

    .line 1396
    :cond_2f
    const/4 v0, 0x0

    .line 1397
    goto :goto_1e

    .line 1398
    :goto_1f
    xor-int/lit8 v6, v0, 0x1

    .line 1399
    .line 1400
    iput-boolean v6, v2, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 1401
    .line 1402
    if-nez v0, :cond_31

    .line 1403
    .line 1404
    cmpl-double v0, v3, v9

    .line 1405
    .line 1406
    const v6, 0x7fffffff

    .line 1407
    .line 1408
    .line 1409
    if-lez v0, :cond_30

    .line 1410
    .line 1411
    int-to-double v9, v6

    .line 1412
    div-double/2addr v9, v3

    .line 1413
    invoke-static {v9, v10}, Lvf/a;->G(D)I

    .line 1414
    .line 1415
    .line 1416
    move-result v0

    .line 1417
    iput v0, v2, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 1418
    .line 1419
    iput v6, v2, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 1420
    .line 1421
    goto :goto_21

    .line 1422
    :cond_30
    iput v6, v2, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 1423
    .line 1424
    int-to-double v9, v6

    .line 1425
    mul-double/2addr v9, v3

    .line 1426
    invoke-static {v9, v10}, Lvf/a;->G(D)I

    .line 1427
    .line 1428
    .line 1429
    move-result v0

    .line 1430
    iput v0, v2, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 1431
    .line 1432
    goto :goto_21

    .line 1433
    :goto_20
    iput v11, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 1434
    .line 1435
    const/4 v15, 0x0

    .line 1436
    iput-boolean v15, v2, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 1437
    .line 1438
    :cond_31
    :goto_21
    :try_start_14
    new-instance v0, LCd/t;

    .line 1439
    .line 1440
    const/4 v3, 0x3

    .line 1441
    invoke-direct {v0, v8, v3}, LCd/t;-><init>(Ljava/lang/Object;I)V

    .line 1442
    .line 1443
    .line 1444
    const/4 v9, 0x0

    .line 1445
    invoke-static {v0, v9, v2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_9

    .line 1449
    invoke-virtual {v8}, Lcg/B;->close()V

    .line 1450
    .line 1451
    .line 1452
    iget-object v3, v5, LZ3/b;->c:Ljava/lang/Object;

    .line 1453
    .line 1454
    check-cast v3, Ljava/lang/Exception;

    .line 1455
    .line 1456
    if-nez v3, :cond_3f

    .line 1457
    .line 1458
    if-eqz v0, :cond_3e

    .line 1459
    .line 1460
    invoke-virtual/range {v21 .. v21}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v3

    .line 1464
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v3

    .line 1468
    iget v3, v3, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 1469
    .line 1470
    invoke-virtual {v0, v3}, Landroid/graphics/Bitmap;->setDensity(I)V

    .line 1471
    .line 1472
    .line 1473
    if-nez v7, :cond_32

    .line 1474
    .line 1475
    if-lez v13, :cond_3b

    .line 1476
    .line 1477
    :cond_32
    new-instance v3, Landroid/graphics/Matrix;

    .line 1478
    .line 1479
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 1480
    .line 1481
    .line 1482
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1483
    .line 1484
    .line 1485
    move-result v4

    .line 1486
    int-to-float v4, v4

    .line 1487
    const/high16 v5, 0x40000000    # 2.0f

    .line 1488
    .line 1489
    div-float/2addr v4, v5

    .line 1490
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1491
    .line 1492
    .line 1493
    move-result v6

    .line 1494
    int-to-float v6, v6

    .line 1495
    div-float/2addr v6, v5

    .line 1496
    if-eqz v7, :cond_33

    .line 1497
    .line 1498
    const/high16 v5, -0x40800000    # -1.0f

    .line 1499
    .line 1500
    const/high16 v7, 0x3f800000    # 1.0f

    .line 1501
    .line 1502
    invoke-virtual {v3, v5, v7, v4, v6}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 1503
    .line 1504
    .line 1505
    :cond_33
    if-lez v13, :cond_34

    .line 1506
    .line 1507
    int-to-float v5, v13

    .line 1508
    invoke-virtual {v3, v5, v4, v6}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 1509
    .line 1510
    .line 1511
    :cond_34
    new-instance v4, Landroid/graphics/RectF;

    .line 1512
    .line 1513
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1514
    .line 1515
    .line 1516
    move-result v5

    .line 1517
    int-to-float v5, v5

    .line 1518
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1519
    .line 1520
    .line 1521
    move-result v6

    .line 1522
    int-to-float v6, v6

    .line 1523
    const/4 v7, 0x0

    .line 1524
    invoke-direct {v4, v7, v7, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 1525
    .line 1526
    .line 1527
    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 1528
    .line 1529
    .line 1530
    iget v5, v4, Landroid/graphics/RectF;->left:F

    .line 1531
    .line 1532
    cmpg-float v6, v5, v7

    .line 1533
    .line 1534
    if-nez v6, :cond_35

    .line 1535
    .line 1536
    iget v6, v4, Landroid/graphics/RectF;->top:F

    .line 1537
    .line 1538
    cmpg-float v6, v6, v7

    .line 1539
    .line 1540
    if-nez v6, :cond_35

    .line 1541
    .line 1542
    :goto_22
    const/16 v4, 0x5a

    .line 1543
    .line 1544
    goto :goto_23

    .line 1545
    :cond_35
    neg-float v5, v5

    .line 1546
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 1547
    .line 1548
    neg-float v4, v4

    .line 1549
    invoke-virtual {v3, v5, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1550
    .line 1551
    .line 1552
    goto :goto_22

    .line 1553
    :goto_23
    if-eq v13, v4, :cond_37

    .line 1554
    .line 1555
    const/16 v4, 0x10e

    .line 1556
    .line 1557
    if-ne v13, v4, :cond_36

    .line 1558
    .line 1559
    goto :goto_24

    .line 1560
    :cond_36
    const/4 v4, 0x0

    .line 1561
    goto :goto_25

    .line 1562
    :cond_37
    :goto_24
    const/4 v4, 0x1

    .line 1563
    :goto_25
    const-string v5, "createBitmap(width, height, config)"

    .line 1564
    .line 1565
    if-eqz v4, :cond_39

    .line 1566
    .line 1567
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1568
    .line 1569
    .line 1570
    move-result v4

    .line 1571
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1572
    .line 1573
    .line 1574
    move-result v6

    .line 1575
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v7

    .line 1579
    if-nez v7, :cond_38

    .line 1580
    .line 1581
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 1582
    .line 1583
    :cond_38
    invoke-static {v4, v6, v7}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 1584
    .line 1585
    .line 1586
    move-result-object v4

    .line 1587
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1588
    .line 1589
    .line 1590
    goto :goto_26

    .line 1591
    :cond_39
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1592
    .line 1593
    .line 1594
    move-result v4

    .line 1595
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1596
    .line 1597
    .line 1598
    move-result v6

    .line 1599
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v7

    .line 1603
    if-nez v7, :cond_3a

    .line 1604
    .line 1605
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 1606
    .line 1607
    :cond_3a
    invoke-static {v4, v6, v7}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v4

    .line 1611
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1612
    .line 1613
    .line 1614
    :goto_26
    new-instance v5, Landroid/graphics/Canvas;

    .line 1615
    .line 1616
    invoke-direct {v5, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 1617
    .line 1618
    .line 1619
    sget-object v6, LZ3/h;->a:Landroid/graphics/Paint;

    .line 1620
    .line 1621
    invoke-virtual {v5, v0, v3, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 1622
    .line 1623
    .line 1624
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 1625
    .line 1626
    .line 1627
    move-object v0, v4

    .line 1628
    :cond_3b
    new-instance v3, LZ3/f;

    .line 1629
    .line 1630
    invoke-virtual/range {v21 .. v21}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v4

    .line 1634
    new-instance v5, Landroid/graphics/drawable/BitmapDrawable;

    .line 1635
    .line 1636
    invoke-direct {v5, v4, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 1637
    .line 1638
    .line 1639
    iget v0, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 1640
    .line 1641
    const/4 v11, 0x1

    .line 1642
    if-gt v0, v11, :cond_3d

    .line 1643
    .line 1644
    iget-boolean v0, v2, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 1645
    .line 1646
    if-eqz v0, :cond_3c

    .line 1647
    .line 1648
    goto :goto_27

    .line 1649
    :cond_3c
    const/4 v6, 0x0

    .line 1650
    goto :goto_28

    .line 1651
    :cond_3d
    :goto_27
    const/4 v6, 0x1

    .line 1652
    :goto_28
    invoke-direct {v3, v5, v6}, LZ3/f;-><init>(Landroid/graphics/drawable/BitmapDrawable;Z)V

    .line 1653
    .line 1654
    .line 1655
    return-object v3

    .line 1656
    :cond_3e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1657
    .line 1658
    const-string v2, "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it\'s not encoded as a valid image format."

    .line 1659
    .line 1660
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1661
    .line 1662
    .line 1663
    throw v0

    .line 1664
    :cond_3f
    throw v3

    .line 1665
    :catchall_9
    move-exception v0

    .line 1666
    move-object v2, v0

    .line 1667
    :try_start_15
    throw v2
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_a

    .line 1668
    :catchall_a
    move-exception v0

    .line 1669
    invoke-static {v8, v2}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1670
    .line 1671
    .line 1672
    throw v0

    .line 1673
    :cond_40
    throw v0

    .line 1674
    :cond_41
    throw v9

    .line 1675
    :pswitch_10
    iget-object v0, v1, LA0/p;->j:Ljava/lang/Object;

    .line 1676
    .line 1677
    check-cast v0, LY3/n;

    .line 1678
    .line 1679
    iget-object v0, v0, LY3/n;->r:LN/Y;

    .line 1680
    .line 1681
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 1682
    .line 1683
    .line 1684
    move-result-object v0

    .line 1685
    check-cast v0, Lh4/h;

    .line 1686
    .line 1687
    return-object v0

    .line 1688
    :pswitch_11
    invoke-direct {v1}, LA0/p;->b()Ljava/lang/Object;

    .line 1689
    .line 1690
    .line 1691
    move-result-object v0

    .line 1692
    return-object v0

    .line 1693
    :pswitch_12
    iget-object v0, v1, LA0/p;->j:Ljava/lang/Object;

    .line 1694
    .line 1695
    check-cast v0, LW/b;

    .line 1696
    .line 1697
    iget-object v2, v0, LW/b;->a:LS3/e;

    .line 1698
    .line 1699
    iget-object v3, v0, LW/b;->d:Ljava/lang/Object;

    .line 1700
    .line 1701
    if-eqz v3, :cond_42

    .line 1702
    .line 1703
    iget-object v2, v2, LS3/e;->b:Ljava/lang/Object;

    .line 1704
    .line 1705
    check-cast v2, Ltf/p;

    .line 1706
    .line 1707
    invoke-interface {v2, v0, v3}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1708
    .line 1709
    .line 1710
    move-result-object v0

    .line 1711
    return-object v0

    .line 1712
    :cond_42
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1713
    .line 1714
    const-string v2, "Value should be initialized"

    .line 1715
    .line 1716
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1717
    .line 1718
    .line 1719
    throw v0

    .line 1720
    :pswitch_13
    iget-object v0, v1, LA0/p;->j:Ljava/lang/Object;

    .line 1721
    .line 1722
    check-cast v0, LN/p0;

    .line 1723
    .line 1724
    iget-object v2, v0, LN/p0;->b:Ljava/lang/Object;

    .line 1725
    .line 1726
    monitor-enter v2

    .line 1727
    :try_start_16
    invoke-virtual {v0}, LN/p0;->x()LEf/l;

    .line 1728
    .line 1729
    .line 1730
    move-result-object v3

    .line 1731
    iget-object v4, v0, LN/p0;->q:LHf/x0;

    .line 1732
    .line 1733
    invoke-virtual {v4}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 1734
    .line 1735
    .line 1736
    move-result-object v4

    .line 1737
    check-cast v4, LN/j0;

    .line 1738
    .line 1739
    sget-object v5, LN/j0;->b:LN/j0;

    .line 1740
    .line 1741
    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 1742
    .line 1743
    .line 1744
    move-result v4
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_b

    .line 1745
    if-lez v4, :cond_44

    .line 1746
    .line 1747
    monitor-exit v2

    .line 1748
    if-eqz v3, :cond_43

    .line 1749
    .line 1750
    sget-object v0, Lef/C;->a:Lef/C;

    .line 1751
    .line 1752
    check-cast v3, LEf/n;

    .line 1753
    .line 1754
    invoke-virtual {v3, v0}, LEf/n;->resumeWith(Ljava/lang/Object;)V

    .line 1755
    .line 1756
    .line 1757
    :cond_43
    sget-object v0, Lef/C;->a:Lef/C;

    .line 1758
    .line 1759
    return-object v0

    .line 1760
    :cond_44
    :try_start_17
    const-string v3, "Recomposer shutdown; frame clock awaiter will never resume"

    .line 1761
    .line 1762
    iget-object v0, v0, LN/p0;->d:Ljava/lang/Throwable;

    .line 1763
    .line 1764
    invoke-static {v3, v0}, LEf/H;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    .line 1765
    .line 1766
    .line 1767
    move-result-object v0

    .line 1768
    throw v0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_b

    .line 1769
    :catchall_b
    move-exception v0

    .line 1770
    monitor-exit v2

    .line 1771
    throw v0

    .line 1772
    :pswitch_14
    move-object v9, v5

    .line 1773
    iget-object v2, v1, LA0/p;->j:Ljava/lang/Object;

    .line 1774
    .line 1775
    check-cast v2, LN/b0;

    .line 1776
    .line 1777
    iget-object v3, v2, LN/b0;->a:Ljava/util/ArrayList;

    .line 1778
    .line 1779
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 1780
    .line 1781
    .line 1782
    move-result v3

    .line 1783
    new-instance v4, Lx/o;

    .line 1784
    .line 1785
    invoke-direct {v4, v3}, Lx/o;-><init>(I)V

    .line 1786
    .line 1787
    .line 1788
    iget-object v2, v2, LN/b0;->a:Ljava/util/ArrayList;

    .line 1789
    .line 1790
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1791
    .line 1792
    .line 1793
    move-result v3

    .line 1794
    const/4 v5, 0x0

    .line 1795
    :goto_29
    if-ge v5, v3, :cond_4b

    .line 1796
    .line 1797
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1798
    .line 1799
    .line 1800
    move-result-object v6

    .line 1801
    check-cast v6, LN/L;

    .line 1802
    .line 1803
    iget-object v7, v6, LN/L;->b:Ljava/lang/Object;

    .line 1804
    .line 1805
    iget v8, v6, LN/L;->a:I

    .line 1806
    .line 1807
    if-eqz v7, :cond_45

    .line 1808
    .line 1809
    new-instance v7, LN/K;

    .line 1810
    .line 1811
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1812
    .line 1813
    .line 1814
    move-result-object v8

    .line 1815
    iget-object v10, v6, LN/L;->b:Ljava/lang/Object;

    .line 1816
    .line 1817
    invoke-direct {v7, v8, v10}, LN/K;-><init>(Ljava/lang/Integer;Ljava/lang/Object;)V

    .line 1818
    .line 1819
    .line 1820
    goto :goto_2a

    .line 1821
    :cond_45
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1822
    .line 1823
    .line 1824
    move-result-object v7

    .line 1825
    :goto_2a
    invoke-virtual {v4, v7}, Lx/o;->d(Ljava/lang/Object;)I

    .line 1826
    .line 1827
    .line 1828
    move-result v8

    .line 1829
    if-gez v8, :cond_46

    .line 1830
    .line 1831
    const/4 v10, 0x1

    .line 1832
    goto :goto_2b

    .line 1833
    :cond_46
    const/4 v10, 0x0

    .line 1834
    :goto_2b
    if-eqz v10, :cond_47

    .line 1835
    .line 1836
    move-object v11, v9

    .line 1837
    goto :goto_2c

    .line 1838
    :cond_47
    iget-object v11, v4, Lx/o;->c:[Ljava/lang/Object;

    .line 1839
    .line 1840
    aget-object v11, v11, v8

    .line 1841
    .line 1842
    :goto_2c
    if-nez v11, :cond_48

    .line 1843
    .line 1844
    goto :goto_2d

    .line 1845
    :cond_48
    invoke-static {v11}, Lkotlin/jvm/internal/K;->h(Ljava/lang/Object;)Z

    .line 1846
    .line 1847
    .line 1848
    move-result v12

    .line 1849
    if-eqz v12, :cond_49

    .line 1850
    .line 1851
    invoke-static {v11}, Lkotlin/jvm/internal/K;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v11

    .line 1855
    invoke-interface {v11, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1856
    .line 1857
    .line 1858
    move-object v6, v11

    .line 1859
    goto :goto_2d

    .line 1860
    :cond_49
    new-array v12, v0, [Ljava/lang/Object;

    .line 1861
    .line 1862
    const/4 v15, 0x0

    .line 1863
    aput-object v11, v12, v15

    .line 1864
    .line 1865
    const/16 v27, 0x1

    .line 1866
    .line 1867
    aput-object v6, v12, v27

    .line 1868
    .line 1869
    invoke-static {v12}, Lr7/e;->G([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 1870
    .line 1871
    .line 1872
    move-result-object v6

    .line 1873
    :goto_2d
    if-eqz v10, :cond_4a

    .line 1874
    .line 1875
    not-int v8, v8

    .line 1876
    iget-object v10, v4, Lx/o;->b:[Ljava/lang/Object;

    .line 1877
    .line 1878
    aput-object v7, v10, v8

    .line 1879
    .line 1880
    iget-object v7, v4, Lx/o;->c:[Ljava/lang/Object;

    .line 1881
    .line 1882
    aput-object v6, v7, v8

    .line 1883
    .line 1884
    :goto_2e
    const/16 v27, 0x1

    .line 1885
    .line 1886
    goto :goto_2f

    .line 1887
    :cond_4a
    iget-object v7, v4, Lx/o;->c:[Ljava/lang/Object;

    .line 1888
    .line 1889
    aput-object v6, v7, v8

    .line 1890
    .line 1891
    goto :goto_2e

    .line 1892
    :goto_2f
    add-int/lit8 v5, v5, 0x1

    .line 1893
    .line 1894
    goto :goto_29

    .line 1895
    :cond_4b
    new-instance v0, LN/U;

    .line 1896
    .line 1897
    invoke-direct {v0, v4}, LN/U;-><init>(Lx/o;)V

    .line 1898
    .line 1899
    .line 1900
    return-object v0

    .line 1901
    :pswitch_15
    new-instance v0, Landroid/util/SparseArray;

    .line 1902
    .line 1903
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 1904
    .line 1905
    .line 1906
    iget-object v2, v1, LA0/p;->j:Ljava/lang/Object;

    .line 1907
    .line 1908
    check-cast v2, Lt0/M;

    .line 1909
    .line 1910
    iget-object v2, v2, Lt0/M;->a:Ljava/lang/Object;

    .line 1911
    .line 1912
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1913
    .line 1914
    .line 1915
    check-cast v2, LM0/o;

    .line 1916
    .line 1917
    invoke-virtual {v2}, LM0/o;->getTypedView$ui_release()Landroid/view/View;

    .line 1918
    .line 1919
    .line 1920
    move-result-object v2

    .line 1921
    if-eqz v2, :cond_4c

    .line 1922
    .line 1923
    invoke-virtual {v2, v0}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    .line 1924
    .line 1925
    .line 1926
    :cond_4c
    return-object v0

    .line 1927
    :pswitch_16
    iget-object v0, v1, LA0/p;->j:Ljava/lang/Object;

    .line 1928
    .line 1929
    check-cast v0, LM0/j;

    .line 1930
    .line 1931
    invoke-virtual {v0}, LM0/j;->invoke()Ljava/lang/Object;

    .line 1932
    .line 1933
    .line 1934
    move-result-object v0

    .line 1935
    return-object v0

    .line 1936
    :pswitch_17
    iget-object v0, v1, LA0/p;->j:Ljava/lang/Object;

    .line 1937
    .line 1938
    check-cast v0, LM/a;

    .line 1939
    .line 1940
    iget-object v2, v0, LM/a;->h:LN/Y;

    .line 1941
    .line 1942
    invoke-virtual {v2}, LN/Y;->getValue()Ljava/lang/Object;

    .line 1943
    .line 1944
    .line 1945
    move-result-object v2

    .line 1946
    check-cast v2, Ljava/lang/Boolean;

    .line 1947
    .line 1948
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1949
    .line 1950
    .line 1951
    move-result v2

    .line 1952
    const/16 v27, 0x1

    .line 1953
    .line 1954
    xor-int/lit8 v2, v2, 0x1

    .line 1955
    .line 1956
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1957
    .line 1958
    .line 1959
    move-result-object v2

    .line 1960
    iget-object v0, v0, LM/a;->h:LN/Y;

    .line 1961
    .line 1962
    invoke-virtual {v0, v2}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 1963
    .line 1964
    .line 1965
    sget-object v0, Lef/C;->a:Lef/C;

    .line 1966
    .line 1967
    return-object v0

    .line 1968
    :pswitch_18
    iget-object v0, v1, LA0/p;->j:Ljava/lang/Object;

    .line 1969
    .line 1970
    check-cast v0, LK0/g;

    .line 1971
    .line 1972
    return-object v0

    .line 1973
    :pswitch_19
    new-instance v0, Lx4/d;

    .line 1974
    .line 1975
    iget-object v2, v1, LA0/p;->j:Ljava/lang/Object;

    .line 1976
    .line 1977
    check-cast v2, LH0/a;

    .line 1978
    .line 1979
    iget-object v3, v2, LH0/a;->a:LH0/c;

    .line 1980
    .line 1981
    iget-object v3, v3, LH0/c;->g:LH0/d;

    .line 1982
    .line 1983
    invoke-virtual {v3}, Landroid/graphics/Paint;->getTextLocale()Ljava/util/Locale;

    .line 1984
    .line 1985
    .line 1986
    move-result-object v3

    .line 1987
    const-string v4, "paragraphIntrinsics.textPaint.textLocale"

    .line 1988
    .line 1989
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1990
    .line 1991
    .line 1992
    iget-object v2, v2, LH0/a;->d:LA0/q;

    .line 1993
    .line 1994
    invoke-virtual {v2}, LA0/q;->d()Ljava/lang/CharSequence;

    .line 1995
    .line 1996
    .line 1997
    move-result-object v2

    .line 1998
    const/16 v4, 0xe

    .line 1999
    .line 2000
    invoke-direct {v0, v4}, Lx4/d;-><init>(I)V

    .line 2001
    .line 2002
    .line 2003
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 2004
    .line 2005
    .line 2006
    move-result v4

    .line 2007
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 2008
    .line 2009
    .line 2010
    move-result v5

    .line 2011
    if-ltz v5, :cond_4e

    .line 2012
    .line 2013
    if-ltz v4, :cond_4d

    .line 2014
    .line 2015
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 2016
    .line 2017
    .line 2018
    move-result v5

    .line 2019
    if-gt v4, v5, :cond_4d

    .line 2020
    .line 2021
    invoke-static {v3}, Ljava/text/BreakIterator;->getWordInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    .line 2022
    .line 2023
    .line 2024
    move-result-object v3

    .line 2025
    const-string v5, "getWordInstance(locale)"

    .line 2026
    .line 2027
    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2028
    .line 2029
    .line 2030
    const/16 v5, -0x32

    .line 2031
    .line 2032
    const/4 v15, 0x0

    .line 2033
    invoke-static {v15, v5}, Ljava/lang/Math;->max(II)I

    .line 2034
    .line 2035
    .line 2036
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 2037
    .line 2038
    .line 2039
    move-result v5

    .line 2040
    add-int/lit8 v6, v4, 0x32

    .line 2041
    .line 2042
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 2043
    .line 2044
    .line 2045
    new-instance v5, LA0/a;

    .line 2046
    .line 2047
    invoke-direct {v5, v2, v4}, LA0/a;-><init>(Ljava/lang/CharSequence;I)V

    .line 2048
    .line 2049
    .line 2050
    invoke-virtual {v3, v5}, Ljava/text/BreakIterator;->setText(Ljava/text/CharacterIterator;)V

    .line 2051
    .line 2052
    .line 2053
    return-object v0

    .line 2054
    :cond_4d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2055
    .line 2056
    const-string v2, "input end index is outside the CharSequence"

    .line 2057
    .line 2058
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 2059
    .line 2060
    .line 2061
    throw v0

    .line 2062
    :cond_4e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2063
    .line 2064
    const-string v2, "input start index is outside the CharSequence"

    .line 2065
    .line 2066
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 2067
    .line 2068
    .line 2069
    throw v0

    .line 2070
    :pswitch_1a
    new-instance v0, Landroid/view/inputmethod/BaseInputConnection;

    .line 2071
    .line 2072
    iget-object v2, v1, LA0/p;->j:Ljava/lang/Object;

    .line 2073
    .line 2074
    check-cast v2, LW9/u;

    .line 2075
    .line 2076
    iget-object v2, v2, LW9/u;->a:Ljava/lang/Object;

    .line 2077
    .line 2078
    check-cast v2, Lu0/n;

    .line 2079
    .line 2080
    const/4 v15, 0x0

    .line 2081
    invoke-direct {v0, v2, v15}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    .line 2082
    .line 2083
    .line 2084
    return-object v0

    .line 2085
    :pswitch_1b
    iget-object v0, v1, LA0/p;->j:Ljava/lang/Object;

    .line 2086
    .line 2087
    check-cast v0, Landroid/content/Context;

    .line 2088
    .line 2089
    const-string v2, "input_method"

    .line 2090
    .line 2091
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 2092
    .line 2093
    .line 2094
    move-result-object v0

    .line 2095
    if-eqz v0, :cond_4f

    .line 2096
    .line 2097
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 2098
    .line 2099
    return-object v0

    .line 2100
    :cond_4f
    new-instance v0, Ljava/lang/NullPointerException;

    .line 2101
    .line 2102
    const-string v2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"

    .line 2103
    .line 2104
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 2105
    .line 2106
    .line 2107
    throw v0

    .line 2108
    :pswitch_1c
    move/from16 v27, v6

    .line 2109
    .line 2110
    move v15, v7

    .line 2111
    iget-object v0, v1, LA0/p;->j:Ljava/lang/Object;

    .line 2112
    .line 2113
    check-cast v0, Landroid/view/View;

    .line 2114
    .line 2115
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2116
    .line 2117
    .line 2118
    move-result-object v0

    .line 2119
    :goto_30
    if-eqz v0, :cond_51

    .line 2120
    .line 2121
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 2122
    .line 2123
    if-eqz v2, :cond_51

    .line 2124
    .line 2125
    check-cast v0, Landroid/view/ViewGroup;

    .line 2126
    .line 2127
    invoke-virtual {v0}, Landroid/view/ViewGroup;->shouldDelayChildPressedState()Z

    .line 2128
    .line 2129
    .line 2130
    move-result v2

    .line 2131
    if-eqz v2, :cond_50

    .line 2132
    .line 2133
    move/from16 v6, v27

    .line 2134
    .line 2135
    goto :goto_31

    .line 2136
    :cond_50
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2137
    .line 2138
    .line 2139
    move-result-object v0

    .line 2140
    goto :goto_30

    .line 2141
    :cond_51
    move v6, v15

    .line 2142
    :goto_31
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2143
    .line 2144
    .line 2145
    move-result-object v0

    .line 2146
    return-object v0

    .line 2147
    :pswitch_1d
    iget-object v0, v1, LA0/p;->j:Ljava/lang/Object;

    .line 2148
    .line 2149
    check-cast v0, Ltf/a;

    .line 2150
    .line 2151
    invoke-interface {v0}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 2152
    .line 2153
    .line 2154
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2155
    .line 2156
    return-object v0

    .line 2157
    :pswitch_1e
    iget-object v0, v1, LA0/p;->j:Ljava/lang/Object;

    .line 2158
    .line 2159
    check-cast v0, LA3/h;

    .line 2160
    .line 2161
    iget v2, v0, LA3/h;->a:I

    .line 2162
    .line 2163
    int-to-long v2, v2

    .line 2164
    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 2165
    .line 2166
    .line 2167
    move-result-object v2

    .line 2168
    const/16 v3, 0x20

    .line 2169
    .line 2170
    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 2171
    .line 2172
    .line 2173
    move-result-object v2

    .line 2174
    iget v4, v0, LA3/h;->b:I

    .line 2175
    .line 2176
    int-to-long v4, v4

    .line 2177
    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 2178
    .line 2179
    .line 2180
    move-result-object v4

    .line 2181
    invoke-virtual {v2, v4}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 2182
    .line 2183
    .line 2184
    move-result-object v2

    .line 2185
    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 2186
    .line 2187
    .line 2188
    move-result-object v2

    .line 2189
    iget v0, v0, LA3/h;->c:I

    .line 2190
    .line 2191
    int-to-long v3, v0

    .line 2192
    invoke-static {v3, v4}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 2193
    .line 2194
    .line 2195
    move-result-object v0

    .line 2196
    invoke-virtual {v2, v0}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 2197
    .line 2198
    .line 2199
    move-result-object v0

    .line 2200
    return-object v0

    .line 2201
    :pswitch_1f
    new-instance v0, LA0/b;

    .line 2202
    .line 2203
    iget-object v2, v1, LA0/p;->j:Ljava/lang/Object;

    .line 2204
    .line 2205
    check-cast v2, LA0/q;

    .line 2206
    .line 2207
    iget-object v2, v2, LA0/q;->b:Landroid/text/Layout;

    .line 2208
    .line 2209
    invoke-direct {v0, v2}, LA0/b;-><init>(Landroid/text/Layout;)V

    .line 2210
    .line 2211
    .line 2212
    return-object v0

    .line 2213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_c
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

    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_f
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_d
        :pswitch_e
    .end packed-switch
.end method
