.class public abstract Lx0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[Lkotlin/reflect/KProperty;

.field public static final b:Lx0/q;

.field public static final c:Lx0/q;

.field public static final d:Lx0/q;


# direct methods
.method static constructor <clinit>()V
    .locals 20

    .line 1
    new-instance v0, Lkotlin/jvm/internal/r;

    .line 2
    .line 3
    const-string v1, "stateDescription"

    .line 4
    .line 5
    const-string v2, "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lkotlin/jvm/internal/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget-object v1, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/I;->mutableProperty1(Lkotlin/jvm/internal/q;)Lkotlin/reflect/KMutableProperty1;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v2, Lkotlin/jvm/internal/r;

    .line 17
    .line 18
    const-string v3, "progressBarRangeInfo"

    .line 19
    .line 20
    const-string v4, "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;"

    .line 21
    .line 22
    invoke-direct {v2, v3, v4}, Lkotlin/jvm/internal/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/I;->mutableProperty1(Lkotlin/jvm/internal/q;)Lkotlin/reflect/KMutableProperty1;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    new-instance v3, Lkotlin/jvm/internal/r;

    .line 30
    .line 31
    const-string v4, "paneTitle"

    .line 32
    .line 33
    const-string v5, "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"

    .line 34
    .line 35
    invoke-direct {v3, v4, v5}, Lkotlin/jvm/internal/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/I;->mutableProperty1(Lkotlin/jvm/internal/q;)Lkotlin/reflect/KMutableProperty1;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    new-instance v4, Lkotlin/jvm/internal/r;

    .line 43
    .line 44
    const-string v5, "liveRegion"

    .line 45
    .line 46
    const-string v6, "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"

    .line 47
    .line 48
    invoke-direct {v4, v5, v6}, Lkotlin/jvm/internal/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/I;->mutableProperty1(Lkotlin/jvm/internal/q;)Lkotlin/reflect/KMutableProperty1;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    new-instance v5, Lkotlin/jvm/internal/r;

    .line 56
    .line 57
    const-string v6, "focused"

    .line 58
    .line 59
    const-string v7, "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"

    .line 60
    .line 61
    invoke-direct {v5, v6, v7}, Lkotlin/jvm/internal/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/I;->mutableProperty1(Lkotlin/jvm/internal/q;)Lkotlin/reflect/KMutableProperty1;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    new-instance v6, Lkotlin/jvm/internal/r;

    .line 69
    .line 70
    const-string v7, "horizontalScrollAxisRange"

    .line 71
    .line 72
    const-string v8, "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;"

    .line 73
    .line 74
    invoke-direct {v6, v7, v8}, Lkotlin/jvm/internal/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v6}, Lkotlin/jvm/internal/I;->mutableProperty1(Lkotlin/jvm/internal/q;)Lkotlin/reflect/KMutableProperty1;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    new-instance v7, Lkotlin/jvm/internal/r;

    .line 82
    .line 83
    const-string v8, "verticalScrollAxisRange"

    .line 84
    .line 85
    const-string v9, "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;"

    .line 86
    .line 87
    invoke-direct {v7, v8, v9}, Lkotlin/jvm/internal/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v7}, Lkotlin/jvm/internal/I;->mutableProperty1(Lkotlin/jvm/internal/q;)Lkotlin/reflect/KMutableProperty1;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    new-instance v8, Lkotlin/jvm/internal/r;

    .line 95
    .line 96
    const-string v9, "role"

    .line 97
    .line 98
    const-string v10, "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"

    .line 99
    .line 100
    invoke-direct {v8, v9, v10}, Lkotlin/jvm/internal/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v8}, Lkotlin/jvm/internal/I;->mutableProperty1(Lkotlin/jvm/internal/q;)Lkotlin/reflect/KMutableProperty1;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    new-instance v9, Lkotlin/jvm/internal/r;

    .line 108
    .line 109
    const-string v10, "testTag"

    .line 110
    .line 111
    const-string v11, "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"

    .line 112
    .line 113
    invoke-direct {v9, v10, v11}, Lkotlin/jvm/internal/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, v9}, Lkotlin/jvm/internal/I;->mutableProperty1(Lkotlin/jvm/internal/q;)Lkotlin/reflect/KMutableProperty1;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    new-instance v10, Lkotlin/jvm/internal/r;

    .line 121
    .line 122
    const-string v11, "editableText"

    .line 123
    .line 124
    const-string v12, "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"

    .line 125
    .line 126
    invoke-direct {v10, v11, v12}, Lkotlin/jvm/internal/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v10}, Lkotlin/jvm/internal/I;->mutableProperty1(Lkotlin/jvm/internal/q;)Lkotlin/reflect/KMutableProperty1;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    new-instance v11, Lkotlin/jvm/internal/r;

    .line 134
    .line 135
    const-string v12, "textSelectionRange"

    .line 136
    .line 137
    const-string v13, "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J"

    .line 138
    .line 139
    invoke-direct {v11, v12, v13}, Lkotlin/jvm/internal/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v11}, Lkotlin/jvm/internal/I;->mutableProperty1(Lkotlin/jvm/internal/q;)Lkotlin/reflect/KMutableProperty1;

    .line 143
    .line 144
    .line 145
    move-result-object v11

    .line 146
    new-instance v12, Lkotlin/jvm/internal/r;

    .line 147
    .line 148
    const-string v13, "imeAction"

    .line 149
    .line 150
    const-string v14, "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"

    .line 151
    .line 152
    invoke-direct {v12, v13, v14}, Lkotlin/jvm/internal/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v12}, Lkotlin/jvm/internal/I;->mutableProperty1(Lkotlin/jvm/internal/q;)Lkotlin/reflect/KMutableProperty1;

    .line 156
    .line 157
    .line 158
    move-result-object v12

    .line 159
    new-instance v13, Lkotlin/jvm/internal/r;

    .line 160
    .line 161
    const-string v14, "selected"

    .line 162
    .line 163
    const-string v15, "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"

    .line 164
    .line 165
    invoke-direct {v13, v14, v15}, Lkotlin/jvm/internal/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, v13}, Lkotlin/jvm/internal/I;->mutableProperty1(Lkotlin/jvm/internal/q;)Lkotlin/reflect/KMutableProperty1;

    .line 169
    .line 170
    .line 171
    move-result-object v13

    .line 172
    new-instance v14, Lkotlin/jvm/internal/r;

    .line 173
    .line 174
    const-string v15, "collectionInfo"

    .line 175
    .line 176
    move-object/from16 v16, v0

    .line 177
    .line 178
    const-string v0, "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;"

    .line 179
    .line 180
    invoke-direct {v14, v15, v0}, Lkotlin/jvm/internal/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1, v14}, Lkotlin/jvm/internal/I;->mutableProperty1(Lkotlin/jvm/internal/q;)Lkotlin/reflect/KMutableProperty1;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    new-instance v14, Lkotlin/jvm/internal/r;

    .line 188
    .line 189
    const-string v15, "collectionItemInfo"

    .line 190
    .line 191
    move-object/from16 v17, v0

    .line 192
    .line 193
    const-string v0, "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;"

    .line 194
    .line 195
    invoke-direct {v14, v15, v0}, Lkotlin/jvm/internal/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1, v14}, Lkotlin/jvm/internal/I;->mutableProperty1(Lkotlin/jvm/internal/q;)Lkotlin/reflect/KMutableProperty1;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    new-instance v14, Lkotlin/jvm/internal/r;

    .line 203
    .line 204
    const-string v15, "toggleableState"

    .line 205
    .line 206
    move-object/from16 v18, v0

    .line 207
    .line 208
    const-string v0, "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;"

    .line 209
    .line 210
    invoke-direct {v14, v15, v0}, Lkotlin/jvm/internal/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1, v14}, Lkotlin/jvm/internal/I;->mutableProperty1(Lkotlin/jvm/internal/q;)Lkotlin/reflect/KMutableProperty1;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    new-instance v14, Lkotlin/jvm/internal/r;

    .line 218
    .line 219
    const-string v15, "customActions"

    .line 220
    .line 221
    move-object/from16 v19, v0

    .line 222
    .line 223
    const-string v0, "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;"

    .line 224
    .line 225
    invoke-direct {v14, v15, v0}, Lkotlin/jvm/internal/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1, v14}, Lkotlin/jvm/internal/I;->mutableProperty1(Lkotlin/jvm/internal/q;)Lkotlin/reflect/KMutableProperty1;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    const/16 v1, 0x11

    .line 233
    .line 234
    new-array v1, v1, [Lkotlin/reflect/KProperty;

    .line 235
    .line 236
    const/4 v14, 0x0

    .line 237
    aput-object v16, v1, v14

    .line 238
    .line 239
    const/4 v14, 0x1

    .line 240
    aput-object v2, v1, v14

    .line 241
    .line 242
    const/4 v2, 0x2

    .line 243
    aput-object v3, v1, v2

    .line 244
    .line 245
    const/4 v2, 0x3

    .line 246
    aput-object v4, v1, v2

    .line 247
    .line 248
    const/4 v2, 0x4

    .line 249
    aput-object v5, v1, v2

    .line 250
    .line 251
    const/4 v2, 0x5

    .line 252
    aput-object v6, v1, v2

    .line 253
    .line 254
    const/4 v2, 0x6

    .line 255
    aput-object v7, v1, v2

    .line 256
    .line 257
    const/4 v2, 0x7

    .line 258
    aput-object v8, v1, v2

    .line 259
    .line 260
    const/16 v2, 0x8

    .line 261
    .line 262
    aput-object v9, v1, v2

    .line 263
    .line 264
    const/16 v2, 0x9

    .line 265
    .line 266
    aput-object v10, v1, v2

    .line 267
    .line 268
    const/16 v2, 0xa

    .line 269
    .line 270
    aput-object v11, v1, v2

    .line 271
    .line 272
    const/16 v2, 0xb

    .line 273
    .line 274
    aput-object v12, v1, v2

    .line 275
    .line 276
    const/16 v2, 0xc

    .line 277
    .line 278
    aput-object v13, v1, v2

    .line 279
    .line 280
    const/16 v2, 0xd

    .line 281
    .line 282
    aput-object v17, v1, v2

    .line 283
    .line 284
    const/16 v2, 0xe

    .line 285
    .line 286
    aput-object v18, v1, v2

    .line 287
    .line 288
    const/16 v2, 0xf

    .line 289
    .line 290
    aput-object v19, v1, v2

    .line 291
    .line 292
    const/16 v2, 0x10

    .line 293
    .line 294
    aput-object v0, v1, v2

    .line 295
    .line 296
    sput-object v1, Lx0/p;->a:[Lkotlin/reflect/KProperty;

    .line 297
    .line 298
    sget-object v0, Lx0/n;->k:Lx0/q;

    .line 299
    .line 300
    sput-object v0, Lx0/p;->b:Lx0/q;

    .line 301
    .line 302
    sget-object v0, Lx0/n;->o:Lx0/q;

    .line 303
    .line 304
    sput-object v0, Lx0/p;->c:Lx0/q;

    .line 305
    .line 306
    sget-object v0, Lx0/n;->p:Lx0/q;

    .line 307
    .line 308
    sput-object v0, Lx0/p;->d:Lx0/q;

    .line 309
    .line 310
    sget-object v0, Lx0/f;->a:Lx0/q;

    .line 311
    .line 312
    return-void
.end method

.method public static final a(Lx0/g;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lx0/n;->a:Lx0/q;

    .line 12
    .line 13
    sget-object v0, Lx0/n;->a:Lx0/q;

    .line 14
    .line 15
    invoke-static {p1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0, v0, p1}, Lx0/g;->d(Lx0/q;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static final b(Lx0/g;I)V
    .locals 3

    .line 1
    const-string v0, "$this$role"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lx0/p;->a:[Lkotlin/reflect/KProperty;

    .line 7
    .line 8
    const/4 v1, 0x7

    .line 9
    aget-object v0, v0, v1

    .line 10
    .line 11
    new-instance v1, Lx0/e;

    .line 12
    .line 13
    invoke-direct {v1, p1}, Lx0/e;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sget-object p1, Lx0/p;->c:Lx0/q;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const-string v2, "property"

    .line 22
    .line 23
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1, v1}, Lx0/g;->d(Lx0/q;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static final c(Lx0/g;Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "<set-?>"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lx0/p;->a:[Lkotlin/reflect/KProperty;

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    aget-object v0, v0, v1

    .line 16
    .line 17
    sget-object v1, Lx0/p;->d:Lx0/q;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const-string v2, "property"

    .line 23
    .line 24
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v1, p1}, Lx0/g;->d(Lx0/q;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
