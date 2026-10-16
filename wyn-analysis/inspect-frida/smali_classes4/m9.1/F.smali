.class public final enum Lm9/F;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:Lm9/F;

.field public static final enum c:Lm9/F;

.field public static final enum d:Lm9/F;

.field public static final enum e:Lm9/F;

.field public static final enum f:Lm9/F;

.field public static final enum g:Lm9/F;

.field public static final enum h:Lm9/F;

.field public static final enum i:Lm9/F;

.field public static final enum j:Lm9/F;

.field public static final enum k:Lm9/F;

.field public static final enum l:Lm9/F;

.field public static final m:Landroid/util/SparseArray;

.field public static final synthetic n:[Lm9/F;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 35

    .line 1
    new-instance v0, Lm9/F;

    .line 2
    .line 3
    const-string v1, "OK"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lm9/F;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lm9/F;->b:Lm9/F;

    .line 10
    .line 11
    new-instance v1, Lm9/F;

    .line 12
    .line 13
    const-string v3, "CANCELLED"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4, v4}, Lm9/F;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lm9/F;->c:Lm9/F;

    .line 20
    .line 21
    new-instance v3, Lm9/F;

    .line 22
    .line 23
    const-string v5, "UNKNOWN"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6, v6}, Lm9/F;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lm9/F;->d:Lm9/F;

    .line 30
    .line 31
    new-instance v5, Lm9/F;

    .line 32
    .line 33
    const-string v7, "INVALID_ARGUMENT"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8, v8}, Lm9/F;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lm9/F;->e:Lm9/F;

    .line 40
    .line 41
    new-instance v7, Lm9/F;

    .line 42
    .line 43
    const-string v9, "DEADLINE_EXCEEDED"

    .line 44
    .line 45
    const/4 v10, 0x4

    .line 46
    invoke-direct {v7, v9, v10, v10}, Lm9/F;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    sput-object v7, Lm9/F;->f:Lm9/F;

    .line 50
    .line 51
    new-instance v9, Lm9/F;

    .line 52
    .line 53
    const-string v11, "NOT_FOUND"

    .line 54
    .line 55
    const/4 v12, 0x5

    .line 56
    invoke-direct {v9, v11, v12, v12}, Lm9/F;-><init>(Ljava/lang/String;II)V

    .line 57
    .line 58
    .line 59
    new-instance v11, Lm9/F;

    .line 60
    .line 61
    const-string v13, "ALREADY_EXISTS"

    .line 62
    .line 63
    const/4 v14, 0x6

    .line 64
    invoke-direct {v11, v13, v14, v14}, Lm9/F;-><init>(Ljava/lang/String;II)V

    .line 65
    .line 66
    .line 67
    sput-object v11, Lm9/F;->g:Lm9/F;

    .line 68
    .line 69
    new-instance v13, Lm9/F;

    .line 70
    .line 71
    const-string v15, "PERMISSION_DENIED"

    .line 72
    .line 73
    move/from16 v16, v2

    .line 74
    .line 75
    const/4 v2, 0x7

    .line 76
    invoke-direct {v13, v15, v2, v2}, Lm9/F;-><init>(Ljava/lang/String;II)V

    .line 77
    .line 78
    .line 79
    new-instance v15, Lm9/F;

    .line 80
    .line 81
    move/from16 v17, v2

    .line 82
    .line 83
    const-string v2, "RESOURCE_EXHAUSTED"

    .line 84
    .line 85
    move/from16 v18, v4

    .line 86
    .line 87
    const/16 v4, 0x8

    .line 88
    .line 89
    invoke-direct {v15, v2, v4, v4}, Lm9/F;-><init>(Ljava/lang/String;II)V

    .line 90
    .line 91
    .line 92
    new-instance v2, Lm9/F;

    .line 93
    .line 94
    move/from16 v19, v4

    .line 95
    .line 96
    const-string v4, "FAILED_PRECONDITION"

    .line 97
    .line 98
    move/from16 v20, v6

    .line 99
    .line 100
    const/16 v6, 0x9

    .line 101
    .line 102
    invoke-direct {v2, v4, v6, v6}, Lm9/F;-><init>(Ljava/lang/String;II)V

    .line 103
    .line 104
    .line 105
    sput-object v2, Lm9/F;->h:Lm9/F;

    .line 106
    .line 107
    new-instance v4, Lm9/F;

    .line 108
    .line 109
    move/from16 v21, v6

    .line 110
    .line 111
    const-string v6, "ABORTED"

    .line 112
    .line 113
    move/from16 v22, v8

    .line 114
    .line 115
    const/16 v8, 0xa

    .line 116
    .line 117
    invoke-direct {v4, v6, v8, v8}, Lm9/F;-><init>(Ljava/lang/String;II)V

    .line 118
    .line 119
    .line 120
    sput-object v4, Lm9/F;->i:Lm9/F;

    .line 121
    .line 122
    new-instance v6, Lm9/F;

    .line 123
    .line 124
    move/from16 v23, v8

    .line 125
    .line 126
    const-string v8, "OUT_OF_RANGE"

    .line 127
    .line 128
    move/from16 v24, v10

    .line 129
    .line 130
    const/16 v10, 0xb

    .line 131
    .line 132
    invoke-direct {v6, v8, v10, v10}, Lm9/F;-><init>(Ljava/lang/String;II)V

    .line 133
    .line 134
    .line 135
    new-instance v8, Lm9/F;

    .line 136
    .line 137
    move/from16 v25, v10

    .line 138
    .line 139
    const-string v10, "UNIMPLEMENTED"

    .line 140
    .line 141
    move/from16 v26, v12

    .line 142
    .line 143
    const/16 v12, 0xc

    .line 144
    .line 145
    invoke-direct {v8, v10, v12, v12}, Lm9/F;-><init>(Ljava/lang/String;II)V

    .line 146
    .line 147
    .line 148
    new-instance v10, Lm9/F;

    .line 149
    .line 150
    move/from16 v27, v12

    .line 151
    .line 152
    const-string v12, "INTERNAL"

    .line 153
    .line 154
    move/from16 v28, v14

    .line 155
    .line 156
    const/16 v14, 0xd

    .line 157
    .line 158
    invoke-direct {v10, v12, v14, v14}, Lm9/F;-><init>(Ljava/lang/String;II)V

    .line 159
    .line 160
    .line 161
    sput-object v10, Lm9/F;->j:Lm9/F;

    .line 162
    .line 163
    new-instance v12, Lm9/F;

    .line 164
    .line 165
    move/from16 v29, v14

    .line 166
    .line 167
    const-string v14, "UNAVAILABLE"

    .line 168
    .line 169
    move-object/from16 v30, v0

    .line 170
    .line 171
    const/16 v0, 0xe

    .line 172
    .line 173
    invoke-direct {v12, v14, v0, v0}, Lm9/F;-><init>(Ljava/lang/String;II)V

    .line 174
    .line 175
    .line 176
    sput-object v12, Lm9/F;->k:Lm9/F;

    .line 177
    .line 178
    new-instance v14, Lm9/F;

    .line 179
    .line 180
    move/from16 v31, v0

    .line 181
    .line 182
    const-string v0, "DATA_LOSS"

    .line 183
    .line 184
    move-object/from16 v32, v1

    .line 185
    .line 186
    const/16 v1, 0xf

    .line 187
    .line 188
    invoke-direct {v14, v0, v1, v1}, Lm9/F;-><init>(Ljava/lang/String;II)V

    .line 189
    .line 190
    .line 191
    new-instance v0, Lm9/F;

    .line 192
    .line 193
    move/from16 v33, v1

    .line 194
    .line 195
    const-string v1, "UNAUTHENTICATED"

    .line 196
    .line 197
    move-object/from16 v34, v2

    .line 198
    .line 199
    const/16 v2, 0x10

    .line 200
    .line 201
    invoke-direct {v0, v1, v2, v2}, Lm9/F;-><init>(Ljava/lang/String;II)V

    .line 202
    .line 203
    .line 204
    sput-object v0, Lm9/F;->l:Lm9/F;

    .line 205
    .line 206
    const/16 v1, 0x11

    .line 207
    .line 208
    new-array v1, v1, [Lm9/F;

    .line 209
    .line 210
    aput-object v30, v1, v16

    .line 211
    .line 212
    aput-object v32, v1, v18

    .line 213
    .line 214
    aput-object v3, v1, v20

    .line 215
    .line 216
    aput-object v5, v1, v22

    .line 217
    .line 218
    aput-object v7, v1, v24

    .line 219
    .line 220
    aput-object v9, v1, v26

    .line 221
    .line 222
    aput-object v11, v1, v28

    .line 223
    .line 224
    aput-object v13, v1, v17

    .line 225
    .line 226
    aput-object v15, v1, v19

    .line 227
    .line 228
    aput-object v34, v1, v21

    .line 229
    .line 230
    aput-object v4, v1, v23

    .line 231
    .line 232
    aput-object v6, v1, v25

    .line 233
    .line 234
    aput-object v8, v1, v27

    .line 235
    .line 236
    aput-object v10, v1, v29

    .line 237
    .line 238
    aput-object v12, v1, v31

    .line 239
    .line 240
    aput-object v14, v1, v33

    .line 241
    .line 242
    aput-object v0, v1, v2

    .line 243
    .line 244
    sput-object v1, Lm9/F;->n:[Lm9/F;

    .line 245
    .line 246
    new-instance v0, Landroid/util/SparseArray;

    .line 247
    .line 248
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 249
    .line 250
    .line 251
    invoke-static {}, Lm9/F;->values()[Lm9/F;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    array-length v2, v1

    .line 256
    move/from16 v3, v16

    .line 257
    .line 258
    :goto_0
    if-ge v3, v2, :cond_1

    .line 259
    .line 260
    aget-object v4, v1, v3

    .line 261
    .line 262
    iget v5, v4, Lm9/F;->a:I

    .line 263
    .line 264
    invoke-virtual {v0, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v5

    .line 268
    check-cast v5, Lm9/F;

    .line 269
    .line 270
    if-nez v5, :cond_0

    .line 271
    .line 272
    iget v5, v4, Lm9/F;->a:I

    .line 273
    .line 274
    invoke-virtual {v0, v5, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    add-int/lit8 v3, v3, 0x1

    .line 278
    .line 279
    goto :goto_0

    .line 280
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 281
    .line 282
    new-instance v1, Ljava/lang/StringBuilder;

    .line 283
    .line 284
    const-string v2, "Code value duplication between "

    .line 285
    .line 286
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    const-string v2, "&"

    .line 293
    .line 294
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    throw v0

    .line 312
    :cond_1
    sput-object v0, Lm9/F;->m:Landroid/util/SparseArray;

    .line 313
    .line 314
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lm9/F;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lm9/F;
    .locals 1

    .line 1
    const-class v0, Lm9/F;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lm9/F;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lm9/F;
    .locals 1

    .line 1
    sget-object v0, Lm9/F;->n:[Lm9/F;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lm9/F;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lm9/F;

    .line 8
    .line 9
    return-object v0
.end method
