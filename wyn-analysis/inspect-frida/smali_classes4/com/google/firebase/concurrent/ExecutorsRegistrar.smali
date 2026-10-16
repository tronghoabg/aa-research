.class public Lcom/google/firebase/concurrent/ExecutorsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# static fields
.field public static final a:LL8/p;

.field public static final b:LL8/p;

.field public static final c:LL8/p;

.field public static final d:LL8/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LL8/p;

    .line 2
    .line 3
    new-instance v1, LL8/g;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v1, v2}, LL8/g;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, LL8/p;-><init>(LO9/b;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->a:LL8/p;

    .line 13
    .line 14
    new-instance v0, LL8/p;

    .line 15
    .line 16
    new-instance v1, LL8/g;

    .line 17
    .line 18
    const/4 v2, 0x3

    .line 19
    invoke-direct {v1, v2}, LL8/g;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1}, LL8/p;-><init>(LO9/b;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->b:LL8/p;

    .line 26
    .line 27
    new-instance v0, LL8/p;

    .line 28
    .line 29
    new-instance v1, LL8/g;

    .line 30
    .line 31
    const/4 v2, 0x4

    .line 32
    invoke-direct {v1, v2}, LL8/g;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, v1}, LL8/p;-><init>(LO9/b;)V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->c:LL8/p;

    .line 39
    .line 40
    new-instance v0, LL8/p;

    .line 41
    .line 42
    new-instance v1, LL8/g;

    .line 43
    .line 44
    const/4 v2, 0x5

    .line 45
    invoke-direct {v1, v2}, LL8/g;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v1}, LL8/p;-><init>(LO9/b;)V

    .line 49
    .line 50
    .line 51
    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->d:LL8/p;

    .line 52
    .line 53
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 21

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x1

    .line 4
    new-instance v3, LL8/t;

    .line 5
    .line 6
    const-class v4, Ly8/a;

    .line 7
    .line 8
    const-class v5, Ljava/util/concurrent/ScheduledExecutorService;

    .line 9
    .line 10
    invoke-direct {v3, v4, v5}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 11
    .line 12
    .line 13
    new-instance v6, LL8/t;

    .line 14
    .line 15
    const-class v7, Ljava/util/concurrent/ExecutorService;

    .line 16
    .line 17
    invoke-direct {v6, v4, v7}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 18
    .line 19
    .line 20
    new-instance v8, LL8/t;

    .line 21
    .line 22
    const-class v9, Ljava/util/concurrent/Executor;

    .line 23
    .line 24
    invoke-direct {v8, v4, v9}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 25
    .line 26
    .line 27
    new-array v4, v1, [LL8/t;

    .line 28
    .line 29
    aput-object v6, v4, v0

    .line 30
    .line 31
    aput-object v8, v4, v2

    .line 32
    .line 33
    new-instance v6, Ljava/util/HashSet;

    .line 34
    .line 35
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance v8, Ljava/util/HashSet;

    .line 39
    .line 40
    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance v17, Ljava/util/HashSet;

    .line 44
    .line 45
    invoke-direct/range {v17 .. v17}, Ljava/util/HashSet;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v6, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    array-length v3, v4

    .line 52
    const/4 v14, 0x0

    .line 53
    move v10, v14

    .line 54
    :goto_0
    const-string v11, "Null interface"

    .line 55
    .line 56
    if-ge v10, v3, :cond_0

    .line 57
    .line 58
    aget-object v12, v4, v10

    .line 59
    .line 60
    invoke-static {v12, v11}, LFe/g;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    add-int/2addr v10, v2

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    invoke-static {v6, v4}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    new-instance v3, LJ9/x;

    .line 69
    .line 70
    const/16 v4, 0xa

    .line 71
    .line 72
    invoke-direct {v3, v4}, LJ9/x;-><init>(I)V

    .line 73
    .line 74
    .line 75
    new-instance v10, LL8/b;

    .line 76
    .line 77
    new-instance v12, Ljava/util/HashSet;

    .line 78
    .line 79
    invoke-direct {v12, v6}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 80
    .line 81
    .line 82
    new-instance v13, Ljava/util/HashSet;

    .line 83
    .line 84
    invoke-direct {v13, v8}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 85
    .line 86
    .line 87
    move-object v4, v11

    .line 88
    const/4 v11, 0x0

    .line 89
    move v15, v14

    .line 90
    move-object/from16 v16, v3

    .line 91
    .line 92
    invoke-direct/range {v10 .. v17}, LL8/b;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILL8/e;Ljava/util/Set;)V

    .line 93
    .line 94
    .line 95
    new-instance v3, LL8/t;

    .line 96
    .line 97
    const-class v6, Ly8/b;

    .line 98
    .line 99
    invoke-direct {v3, v6, v5}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 100
    .line 101
    .line 102
    new-instance v8, LL8/t;

    .line 103
    .line 104
    invoke-direct {v8, v6, v7}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 105
    .line 106
    .line 107
    new-instance v11, LL8/t;

    .line 108
    .line 109
    invoke-direct {v11, v6, v9}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 110
    .line 111
    .line 112
    new-array v6, v1, [LL8/t;

    .line 113
    .line 114
    aput-object v8, v6, v0

    .line 115
    .line 116
    aput-object v11, v6, v2

    .line 117
    .line 118
    new-instance v8, Ljava/util/HashSet;

    .line 119
    .line 120
    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 121
    .line 122
    .line 123
    new-instance v11, Ljava/util/HashSet;

    .line 124
    .line 125
    invoke-direct {v11}, Ljava/util/HashSet;-><init>()V

    .line 126
    .line 127
    .line 128
    new-instance v19, Ljava/util/HashSet;

    .line 129
    .line 130
    invoke-direct/range {v19 .. v19}, Ljava/util/HashSet;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v8, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    array-length v3, v6

    .line 137
    const/16 v16, 0x0

    .line 138
    .line 139
    move/from16 v12, v16

    .line 140
    .line 141
    :goto_1
    if-ge v12, v3, :cond_1

    .line 142
    .line 143
    aget-object v13, v6, v12

    .line 144
    .line 145
    invoke-static {v13, v4}, LFe/g;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    add-int/2addr v12, v2

    .line 149
    goto :goto_1

    .line 150
    :cond_1
    invoke-static {v8, v6}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    new-instance v3, LJ9/x;

    .line 154
    .line 155
    const/16 v6, 0xb

    .line 156
    .line 157
    invoke-direct {v3, v6}, LJ9/x;-><init>(I)V

    .line 158
    .line 159
    .line 160
    new-instance v12, LL8/b;

    .line 161
    .line 162
    new-instance v14, Ljava/util/HashSet;

    .line 163
    .line 164
    invoke-direct {v14, v8}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 165
    .line 166
    .line 167
    new-instance v15, Ljava/util/HashSet;

    .line 168
    .line 169
    invoke-direct {v15, v11}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 170
    .line 171
    .line 172
    const/4 v13, 0x0

    .line 173
    move/from16 v17, v16

    .line 174
    .line 175
    move-object/from16 v18, v3

    .line 176
    .line 177
    invoke-direct/range {v12 .. v19}, LL8/b;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILL8/e;Ljava/util/Set;)V

    .line 178
    .line 179
    .line 180
    new-instance v3, LL8/t;

    .line 181
    .line 182
    const-class v6, Ly8/c;

    .line 183
    .line 184
    invoke-direct {v3, v6, v5}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 185
    .line 186
    .line 187
    new-instance v5, LL8/t;

    .line 188
    .line 189
    invoke-direct {v5, v6, v7}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 190
    .line 191
    .line 192
    new-instance v7, LL8/t;

    .line 193
    .line 194
    invoke-direct {v7, v6, v9}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 195
    .line 196
    .line 197
    new-array v6, v1, [LL8/t;

    .line 198
    .line 199
    aput-object v5, v6, v0

    .line 200
    .line 201
    aput-object v7, v6, v2

    .line 202
    .line 203
    new-instance v5, Ljava/util/HashSet;

    .line 204
    .line 205
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 206
    .line 207
    .line 208
    new-instance v7, Ljava/util/HashSet;

    .line 209
    .line 210
    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 211
    .line 212
    .line 213
    new-instance v20, Ljava/util/HashSet;

    .line 214
    .line 215
    invoke-direct/range {v20 .. v20}, Ljava/util/HashSet;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v5, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    array-length v3, v6

    .line 222
    const/16 v17, 0x0

    .line 223
    .line 224
    move/from16 v8, v17

    .line 225
    .line 226
    :goto_2
    if-ge v8, v3, :cond_2

    .line 227
    .line 228
    aget-object v11, v6, v8

    .line 229
    .line 230
    invoke-static {v11, v4}, LFe/g;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    add-int/2addr v8, v2

    .line 234
    goto :goto_2

    .line 235
    :cond_2
    invoke-static {v5, v6}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    new-instance v3, LJ9/x;

    .line 239
    .line 240
    const/16 v4, 0xc

    .line 241
    .line 242
    invoke-direct {v3, v4}, LJ9/x;-><init>(I)V

    .line 243
    .line 244
    .line 245
    new-instance v13, LL8/b;

    .line 246
    .line 247
    new-instance v15, Ljava/util/HashSet;

    .line 248
    .line 249
    invoke-direct {v15, v5}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 250
    .line 251
    .line 252
    new-instance v4, Ljava/util/HashSet;

    .line 253
    .line 254
    invoke-direct {v4, v7}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 255
    .line 256
    .line 257
    const/4 v14, 0x0

    .line 258
    move/from16 v18, v17

    .line 259
    .line 260
    move-object/from16 v19, v3

    .line 261
    .line 262
    move-object/from16 v16, v4

    .line 263
    .line 264
    invoke-direct/range {v13 .. v20}, LL8/b;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILL8/e;Ljava/util/Set;)V

    .line 265
    .line 266
    .line 267
    new-instance v3, LL8/t;

    .line 268
    .line 269
    const-class v4, Ly8/d;

    .line 270
    .line 271
    invoke-direct {v3, v4, v9}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 272
    .line 273
    .line 274
    invoke-static {v3}, LL8/b;->a(LL8/t;)LL8/a;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    new-instance v4, LJ9/x;

    .line 279
    .line 280
    const/16 v5, 0xd

    .line 281
    .line 282
    invoke-direct {v4, v5}, LJ9/x;-><init>(I)V

    .line 283
    .line 284
    .line 285
    iput-object v4, v3, LL8/a;->g:Ljava/lang/Object;

    .line 286
    .line 287
    invoke-virtual {v3}, LL8/a;->d()LL8/b;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    const/4 v4, 0x4

    .line 292
    new-array v4, v4, [LL8/b;

    .line 293
    .line 294
    aput-object v10, v4, v0

    .line 295
    .line 296
    aput-object v12, v4, v2

    .line 297
    .line 298
    aput-object v13, v4, v1

    .line 299
    .line 300
    const/4 v0, 0x3

    .line 301
    aput-object v3, v4, v0

    .line 302
    .line 303
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    return-object v0
.end method
