.class public final Lkotlin/reflect/jvm/internal/impl/util/OperatorChecks;
.super Lkotlin/reflect/jvm/internal/impl/util/AbstractModifierChecks;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lkotlin/reflect/jvm/internal/impl/util/OperatorChecks;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final checks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/reflect/jvm/internal/impl/util/Checks;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 37

    .line 1
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/util/OperatorChecks;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/util/OperatorChecks;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/util/OperatorChecks;->INSTANCE:Lkotlin/reflect/jvm/internal/impl/util/OperatorChecks;

    .line 7
    .line 8
    new-instance v1, Lkotlin/reflect/jvm/internal/impl/util/Checks;

    .line 9
    .line 10
    sget-object v2, Lkotlin/reflect/jvm/internal/impl/util/OperatorNameConventions;->GET:Lkotlin/reflect/jvm/internal/impl/name/Name;

    .line 11
    .line 12
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/util/MemberKindCheck$MemberOrExtension;->INSTANCE:Lkotlin/reflect/jvm/internal/impl/util/MemberKindCheck$MemberOrExtension;

    .line 13
    .line 14
    new-instance v3, Lkotlin/reflect/jvm/internal/impl/util/ValueParameterCountCheck$AtLeast;

    .line 15
    .line 16
    const/4 v7, 0x1

    .line 17
    invoke-direct {v3, v7}, Lkotlin/reflect/jvm/internal/impl/util/ValueParameterCountCheck$AtLeast;-><init>(I)V

    .line 18
    .line 19
    .line 20
    const/4 v8, 0x2

    .line 21
    move-object v4, v3

    .line 22
    new-array v3, v8, [Lkotlin/reflect/jvm/internal/impl/util/Check;

    .line 23
    .line 24
    const/4 v9, 0x0

    .line 25
    aput-object v0, v3, v9

    .line 26
    .line 27
    aput-object v4, v3, v7

    .line 28
    .line 29
    const/4 v5, 0x4

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-direct/range {v1 .. v6}, Lkotlin/reflect/jvm/internal/impl/util/Checks;-><init>(Lkotlin/reflect/jvm/internal/impl/name/Name;[Lkotlin/reflect/jvm/internal/impl/util/Check;Ltf/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 33
    .line 34
    .line 35
    new-instance v2, Lkotlin/reflect/jvm/internal/impl/util/Checks;

    .line 36
    .line 37
    sget-object v3, Lkotlin/reflect/jvm/internal/impl/util/OperatorNameConventions;->SET:Lkotlin/reflect/jvm/internal/impl/name/Name;

    .line 38
    .line 39
    new-instance v4, Lkotlin/reflect/jvm/internal/impl/util/ValueParameterCountCheck$AtLeast;

    .line 40
    .line 41
    invoke-direct {v4, v8}, Lkotlin/reflect/jvm/internal/impl/util/ValueParameterCountCheck$AtLeast;-><init>(I)V

    .line 42
    .line 43
    .line 44
    new-array v5, v8, [Lkotlin/reflect/jvm/internal/impl/util/Check;

    .line 45
    .line 46
    aput-object v0, v5, v9

    .line 47
    .line 48
    aput-object v4, v5, v7

    .line 49
    .line 50
    sget-object v4, Lkotlin/reflect/jvm/internal/impl/util/OperatorChecks$checks$1;->INSTANCE:Lkotlin/reflect/jvm/internal/impl/util/OperatorChecks$checks$1;

    .line 51
    .line 52
    invoke-direct {v2, v3, v5, v4}, Lkotlin/reflect/jvm/internal/impl/util/Checks;-><init>(Lkotlin/reflect/jvm/internal/impl/name/Name;[Lkotlin/reflect/jvm/internal/impl/util/Check;Ltf/l;)V

    .line 53
    .line 54
    .line 55
    new-instance v10, Lkotlin/reflect/jvm/internal/impl/util/Checks;

    .line 56
    .line 57
    sget-object v11, Lkotlin/reflect/jvm/internal/impl/util/OperatorNameConventions;->GET_VALUE:Lkotlin/reflect/jvm/internal/impl/name/Name;

    .line 58
    .line 59
    sget-object v3, Lkotlin/reflect/jvm/internal/impl/util/NoDefaultAndVarargsCheck;->INSTANCE:Lkotlin/reflect/jvm/internal/impl/util/NoDefaultAndVarargsCheck;

    .line 60
    .line 61
    new-instance v4, Lkotlin/reflect/jvm/internal/impl/util/ValueParameterCountCheck$AtLeast;

    .line 62
    .line 63
    invoke-direct {v4, v8}, Lkotlin/reflect/jvm/internal/impl/util/ValueParameterCountCheck$AtLeast;-><init>(I)V

    .line 64
    .line 65
    .line 66
    sget-object v5, Lkotlin/reflect/jvm/internal/impl/util/IsKPropertyCheck;->INSTANCE:Lkotlin/reflect/jvm/internal/impl/util/IsKPropertyCheck;

    .line 67
    .line 68
    const/4 v6, 0x4

    .line 69
    new-array v12, v6, [Lkotlin/reflect/jvm/internal/impl/util/Check;

    .line 70
    .line 71
    aput-object v0, v12, v9

    .line 72
    .line 73
    aput-object v3, v12, v7

    .line 74
    .line 75
    aput-object v4, v12, v8

    .line 76
    .line 77
    const/4 v4, 0x3

    .line 78
    aput-object v5, v12, v4

    .line 79
    .line 80
    const/4 v14, 0x4

    .line 81
    const/4 v15, 0x0

    .line 82
    const/4 v13, 0x0

    .line 83
    invoke-direct/range {v10 .. v15}, Lkotlin/reflect/jvm/internal/impl/util/Checks;-><init>(Lkotlin/reflect/jvm/internal/impl/name/Name;[Lkotlin/reflect/jvm/internal/impl/util/Check;Ltf/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 84
    .line 85
    .line 86
    new-instance v11, Lkotlin/reflect/jvm/internal/impl/util/Checks;

    .line 87
    .line 88
    sget-object v12, Lkotlin/reflect/jvm/internal/impl/util/OperatorNameConventions;->SET_VALUE:Lkotlin/reflect/jvm/internal/impl/name/Name;

    .line 89
    .line 90
    new-instance v13, Lkotlin/reflect/jvm/internal/impl/util/ValueParameterCountCheck$AtLeast;

    .line 91
    .line 92
    invoke-direct {v13, v4}, Lkotlin/reflect/jvm/internal/impl/util/ValueParameterCountCheck$AtLeast;-><init>(I)V

    .line 93
    .line 94
    .line 95
    move-object v14, v13

    .line 96
    new-array v13, v6, [Lkotlin/reflect/jvm/internal/impl/util/Check;

    .line 97
    .line 98
    aput-object v0, v13, v9

    .line 99
    .line 100
    aput-object v3, v13, v7

    .line 101
    .line 102
    aput-object v14, v13, v8

    .line 103
    .line 104
    aput-object v5, v13, v4

    .line 105
    .line 106
    const/4 v15, 0x4

    .line 107
    const/16 v16, 0x0

    .line 108
    .line 109
    const/4 v14, 0x0

    .line 110
    invoke-direct/range {v11 .. v16}, Lkotlin/reflect/jvm/internal/impl/util/Checks;-><init>(Lkotlin/reflect/jvm/internal/impl/name/Name;[Lkotlin/reflect/jvm/internal/impl/util/Check;Ltf/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 111
    .line 112
    .line 113
    new-instance v12, Lkotlin/reflect/jvm/internal/impl/util/Checks;

    .line 114
    .line 115
    sget-object v13, Lkotlin/reflect/jvm/internal/impl/util/OperatorNameConventions;->PROVIDE_DELEGATE:Lkotlin/reflect/jvm/internal/impl/name/Name;

    .line 116
    .line 117
    new-instance v14, Lkotlin/reflect/jvm/internal/impl/util/ValueParameterCountCheck$Equals;

    .line 118
    .line 119
    invoke-direct {v14, v8}, Lkotlin/reflect/jvm/internal/impl/util/ValueParameterCountCheck$Equals;-><init>(I)V

    .line 120
    .line 121
    .line 122
    move-object v15, v14

    .line 123
    new-array v14, v6, [Lkotlin/reflect/jvm/internal/impl/util/Check;

    .line 124
    .line 125
    aput-object v0, v14, v9

    .line 126
    .line 127
    aput-object v3, v14, v7

    .line 128
    .line 129
    aput-object v15, v14, v8

    .line 130
    .line 131
    aput-object v5, v14, v4

    .line 132
    .line 133
    const/16 v16, 0x4

    .line 134
    .line 135
    const/16 v17, 0x0

    .line 136
    .line 137
    const/4 v15, 0x0

    .line 138
    invoke-direct/range {v12 .. v17}, Lkotlin/reflect/jvm/internal/impl/util/Checks;-><init>(Lkotlin/reflect/jvm/internal/impl/name/Name;[Lkotlin/reflect/jvm/internal/impl/util/Check;Ltf/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 139
    .line 140
    .line 141
    new-instance v13, Lkotlin/reflect/jvm/internal/impl/util/Checks;

    .line 142
    .line 143
    sget-object v14, Lkotlin/reflect/jvm/internal/impl/util/OperatorNameConventions;->INVOKE:Lkotlin/reflect/jvm/internal/impl/name/Name;

    .line 144
    .line 145
    new-array v15, v7, [Lkotlin/reflect/jvm/internal/impl/util/Check;

    .line 146
    .line 147
    aput-object v0, v15, v9

    .line 148
    .line 149
    const/16 v17, 0x4

    .line 150
    .line 151
    const/16 v18, 0x0

    .line 152
    .line 153
    const/16 v16, 0x0

    .line 154
    .line 155
    invoke-direct/range {v13 .. v18}, Lkotlin/reflect/jvm/internal/impl/util/Checks;-><init>(Lkotlin/reflect/jvm/internal/impl/name/Name;[Lkotlin/reflect/jvm/internal/impl/util/Check;Ltf/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 156
    .line 157
    .line 158
    new-instance v14, Lkotlin/reflect/jvm/internal/impl/util/Checks;

    .line 159
    .line 160
    sget-object v15, Lkotlin/reflect/jvm/internal/impl/util/OperatorNameConventions;->CONTAINS:Lkotlin/reflect/jvm/internal/impl/name/Name;

    .line 161
    .line 162
    sget-object v5, Lkotlin/reflect/jvm/internal/impl/util/ValueParameterCountCheck$SingleValueParameter;->INSTANCE:Lkotlin/reflect/jvm/internal/impl/util/ValueParameterCountCheck$SingleValueParameter;

    .line 163
    .line 164
    sget-object v20, Lkotlin/reflect/jvm/internal/impl/util/ReturnsCheck$ReturnsBoolean;->INSTANCE:Lkotlin/reflect/jvm/internal/impl/util/ReturnsCheck$ReturnsBoolean;

    .line 165
    .line 166
    move/from16 v21, v9

    .line 167
    .line 168
    new-array v9, v6, [Lkotlin/reflect/jvm/internal/impl/util/Check;

    .line 169
    .line 170
    aput-object v0, v9, v21

    .line 171
    .line 172
    aput-object v5, v9, v7

    .line 173
    .line 174
    aput-object v3, v9, v8

    .line 175
    .line 176
    aput-object v20, v9, v4

    .line 177
    .line 178
    const/16 v18, 0x4

    .line 179
    .line 180
    const/16 v19, 0x0

    .line 181
    .line 182
    const/16 v17, 0x0

    .line 183
    .line 184
    move-object/from16 v16, v9

    .line 185
    .line 186
    invoke-direct/range {v14 .. v19}, Lkotlin/reflect/jvm/internal/impl/util/Checks;-><init>(Lkotlin/reflect/jvm/internal/impl/name/Name;[Lkotlin/reflect/jvm/internal/impl/util/Check;Ltf/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 187
    .line 188
    .line 189
    new-instance v22, Lkotlin/reflect/jvm/internal/impl/util/Checks;

    .line 190
    .line 191
    sget-object v23, Lkotlin/reflect/jvm/internal/impl/util/OperatorNameConventions;->ITERATOR:Lkotlin/reflect/jvm/internal/impl/name/Name;

    .line 192
    .line 193
    sget-object v9, Lkotlin/reflect/jvm/internal/impl/util/ValueParameterCountCheck$NoValueParameters;->INSTANCE:Lkotlin/reflect/jvm/internal/impl/util/ValueParameterCountCheck$NoValueParameters;

    .line 194
    .line 195
    new-array v15, v8, [Lkotlin/reflect/jvm/internal/impl/util/Check;

    .line 196
    .line 197
    aput-object v0, v15, v21

    .line 198
    .line 199
    aput-object v9, v15, v7

    .line 200
    .line 201
    const/16 v26, 0x4

    .line 202
    .line 203
    const/16 v27, 0x0

    .line 204
    .line 205
    const/16 v25, 0x0

    .line 206
    .line 207
    move-object/from16 v24, v15

    .line 208
    .line 209
    invoke-direct/range {v22 .. v27}, Lkotlin/reflect/jvm/internal/impl/util/Checks;-><init>(Lkotlin/reflect/jvm/internal/impl/name/Name;[Lkotlin/reflect/jvm/internal/impl/util/Check;Ltf/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 210
    .line 211
    .line 212
    new-instance v23, Lkotlin/reflect/jvm/internal/impl/util/Checks;

    .line 213
    .line 214
    sget-object v24, Lkotlin/reflect/jvm/internal/impl/util/OperatorNameConventions;->NEXT:Lkotlin/reflect/jvm/internal/impl/name/Name;

    .line 215
    .line 216
    new-array v15, v8, [Lkotlin/reflect/jvm/internal/impl/util/Check;

    .line 217
    .line 218
    aput-object v0, v15, v21

    .line 219
    .line 220
    aput-object v9, v15, v7

    .line 221
    .line 222
    const/16 v27, 0x4

    .line 223
    .line 224
    const/16 v28, 0x0

    .line 225
    .line 226
    const/16 v26, 0x0

    .line 227
    .line 228
    move-object/from16 v25, v15

    .line 229
    .line 230
    invoke-direct/range {v23 .. v28}, Lkotlin/reflect/jvm/internal/impl/util/Checks;-><init>(Lkotlin/reflect/jvm/internal/impl/name/Name;[Lkotlin/reflect/jvm/internal/impl/util/Check;Ltf/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 231
    .line 232
    .line 233
    new-instance v24, Lkotlin/reflect/jvm/internal/impl/util/Checks;

    .line 234
    .line 235
    sget-object v25, Lkotlin/reflect/jvm/internal/impl/util/OperatorNameConventions;->HAS_NEXT:Lkotlin/reflect/jvm/internal/impl/name/Name;

    .line 236
    .line 237
    new-array v15, v4, [Lkotlin/reflect/jvm/internal/impl/util/Check;

    .line 238
    .line 239
    aput-object v0, v15, v21

    .line 240
    .line 241
    aput-object v9, v15, v7

    .line 242
    .line 243
    aput-object v20, v15, v8

    .line 244
    .line 245
    const/16 v28, 0x4

    .line 246
    .line 247
    const/16 v29, 0x0

    .line 248
    .line 249
    const/16 v27, 0x0

    .line 250
    .line 251
    move-object/from16 v26, v15

    .line 252
    .line 253
    invoke-direct/range {v24 .. v29}, Lkotlin/reflect/jvm/internal/impl/util/Checks;-><init>(Lkotlin/reflect/jvm/internal/impl/name/Name;[Lkotlin/reflect/jvm/internal/impl/util/Check;Ltf/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 254
    .line 255
    .line 256
    new-instance v15, Lkotlin/reflect/jvm/internal/impl/util/Checks;

    .line 257
    .line 258
    sget-object v16, Lkotlin/reflect/jvm/internal/impl/util/OperatorNameConventions;->RANGE_TO:Lkotlin/reflect/jvm/internal/impl/name/Name;

    .line 259
    .line 260
    move/from16 v25, v8

    .line 261
    .line 262
    new-array v8, v4, [Lkotlin/reflect/jvm/internal/impl/util/Check;

    .line 263
    .line 264
    aput-object v0, v8, v21

    .line 265
    .line 266
    aput-object v5, v8, v7

    .line 267
    .line 268
    aput-object v3, v8, v25

    .line 269
    .line 270
    const/16 v19, 0x4

    .line 271
    .line 272
    const/16 v20, 0x0

    .line 273
    .line 274
    const/16 v18, 0x0

    .line 275
    .line 276
    move-object/from16 v17, v8

    .line 277
    .line 278
    invoke-direct/range {v15 .. v20}, Lkotlin/reflect/jvm/internal/impl/util/Checks;-><init>(Lkotlin/reflect/jvm/internal/impl/name/Name;[Lkotlin/reflect/jvm/internal/impl/util/Check;Ltf/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 279
    .line 280
    .line 281
    new-instance v26, Lkotlin/reflect/jvm/internal/impl/util/Checks;

    .line 282
    .line 283
    sget-object v27, Lkotlin/reflect/jvm/internal/impl/util/OperatorNameConventions;->RANGE_UNTIL:Lkotlin/reflect/jvm/internal/impl/name/Name;

    .line 284
    .line 285
    new-array v8, v4, [Lkotlin/reflect/jvm/internal/impl/util/Check;

    .line 286
    .line 287
    aput-object v0, v8, v21

    .line 288
    .line 289
    aput-object v5, v8, v7

    .line 290
    .line 291
    aput-object v3, v8, v25

    .line 292
    .line 293
    const/16 v30, 0x4

    .line 294
    .line 295
    const/16 v31, 0x0

    .line 296
    .line 297
    move-object/from16 v28, v8

    .line 298
    .line 299
    invoke-direct/range {v26 .. v31}, Lkotlin/reflect/jvm/internal/impl/util/Checks;-><init>(Lkotlin/reflect/jvm/internal/impl/name/Name;[Lkotlin/reflect/jvm/internal/impl/util/Check;Ltf/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 300
    .line 301
    .line 302
    new-instance v8, Lkotlin/reflect/jvm/internal/impl/util/Checks;

    .line 303
    .line 304
    move/from16 v16, v4

    .line 305
    .line 306
    sget-object v4, Lkotlin/reflect/jvm/internal/impl/util/OperatorNameConventions;->EQUALS:Lkotlin/reflect/jvm/internal/impl/name/Name;

    .line 307
    .line 308
    new-array v6, v7, [Lkotlin/reflect/jvm/internal/impl/util/Check;

    .line 309
    .line 310
    sget-object v18, Lkotlin/reflect/jvm/internal/impl/util/MemberKindCheck$Member;->INSTANCE:Lkotlin/reflect/jvm/internal/impl/util/MemberKindCheck$Member;

    .line 311
    .line 312
    aput-object v18, v6, v21

    .line 313
    .line 314
    move/from16 v18, v7

    .line 315
    .line 316
    sget-object v7, Lkotlin/reflect/jvm/internal/impl/util/OperatorChecks$checks$2;->INSTANCE:Lkotlin/reflect/jvm/internal/impl/util/OperatorChecks$checks$2;

    .line 317
    .line 318
    invoke-direct {v8, v4, v6, v7}, Lkotlin/reflect/jvm/internal/impl/util/Checks;-><init>(Lkotlin/reflect/jvm/internal/impl/name/Name;[Lkotlin/reflect/jvm/internal/impl/util/Check;Ltf/l;)V

    .line 319
    .line 320
    .line 321
    new-instance v27, Lkotlin/reflect/jvm/internal/impl/util/Checks;

    .line 322
    .line 323
    sget-object v28, Lkotlin/reflect/jvm/internal/impl/util/OperatorNameConventions;->COMPARE_TO:Lkotlin/reflect/jvm/internal/impl/name/Name;

    .line 324
    .line 325
    const/4 v4, 0x4

    .line 326
    new-array v6, v4, [Lkotlin/reflect/jvm/internal/impl/util/Check;

    .line 327
    .line 328
    aput-object v0, v6, v21

    .line 329
    .line 330
    sget-object v4, Lkotlin/reflect/jvm/internal/impl/util/ReturnsCheck$ReturnsInt;->INSTANCE:Lkotlin/reflect/jvm/internal/impl/util/ReturnsCheck$ReturnsInt;

    .line 331
    .line 332
    aput-object v4, v6, v18

    .line 333
    .line 334
    aput-object v5, v6, v25

    .line 335
    .line 336
    aput-object v3, v6, v16

    .line 337
    .line 338
    const/16 v31, 0x4

    .line 339
    .line 340
    const/16 v32, 0x0

    .line 341
    .line 342
    const/16 v30, 0x0

    .line 343
    .line 344
    move-object/from16 v29, v6

    .line 345
    .line 346
    invoke-direct/range {v27 .. v32}, Lkotlin/reflect/jvm/internal/impl/util/Checks;-><init>(Lkotlin/reflect/jvm/internal/impl/name/Name;[Lkotlin/reflect/jvm/internal/impl/util/Check;Ltf/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 347
    .line 348
    .line 349
    new-instance v28, Lkotlin/reflect/jvm/internal/impl/util/Checks;

    .line 350
    .line 351
    sget-object v4, Lkotlin/reflect/jvm/internal/impl/util/OperatorNameConventions;->BINARY_OPERATION_NAMES:Ljava/util/Set;

    .line 352
    .line 353
    move-object/from16 v29, v4

    .line 354
    .line 355
    check-cast v29, Ljava/util/Collection;

    .line 356
    .line 357
    move/from16 v4, v16

    .line 358
    .line 359
    new-array v6, v4, [Lkotlin/reflect/jvm/internal/impl/util/Check;

    .line 360
    .line 361
    aput-object v0, v6, v21

    .line 362
    .line 363
    aput-object v5, v6, v18

    .line 364
    .line 365
    aput-object v3, v6, v25

    .line 366
    .line 367
    const/16 v32, 0x4

    .line 368
    .line 369
    const/16 v33, 0x0

    .line 370
    .line 371
    const/16 v31, 0x0

    .line 372
    .line 373
    move-object/from16 v30, v6

    .line 374
    .line 375
    invoke-direct/range {v28 .. v33}, Lkotlin/reflect/jvm/internal/impl/util/Checks;-><init>(Ljava/util/Collection;[Lkotlin/reflect/jvm/internal/impl/util/Check;Ltf/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 376
    .line 377
    .line 378
    new-instance v29, Lkotlin/reflect/jvm/internal/impl/util/Checks;

    .line 379
    .line 380
    sget-object v4, Lkotlin/reflect/jvm/internal/impl/util/OperatorNameConventions;->SIMPLE_UNARY_OPERATION_NAMES:Ljava/util/Set;

    .line 381
    .line 382
    move-object/from16 v30, v4

    .line 383
    .line 384
    check-cast v30, Ljava/util/Collection;

    .line 385
    .line 386
    move/from16 v4, v25

    .line 387
    .line 388
    new-array v6, v4, [Lkotlin/reflect/jvm/internal/impl/util/Check;

    .line 389
    .line 390
    aput-object v0, v6, v21

    .line 391
    .line 392
    aput-object v9, v6, v18

    .line 393
    .line 394
    const/16 v33, 0x4

    .line 395
    .line 396
    const/16 v34, 0x0

    .line 397
    .line 398
    const/16 v32, 0x0

    .line 399
    .line 400
    move-object/from16 v31, v6

    .line 401
    .line 402
    invoke-direct/range {v29 .. v34}, Lkotlin/reflect/jvm/internal/impl/util/Checks;-><init>(Ljava/util/Collection;[Lkotlin/reflect/jvm/internal/impl/util/Check;Ltf/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 403
    .line 404
    .line 405
    new-instance v6, Lkotlin/reflect/jvm/internal/impl/util/Checks;

    .line 406
    .line 407
    new-array v7, v4, [Lkotlin/reflect/jvm/internal/impl/name/Name;

    .line 408
    .line 409
    sget-object v4, Lkotlin/reflect/jvm/internal/impl/util/OperatorNameConventions;->INC:Lkotlin/reflect/jvm/internal/impl/name/Name;

    .line 410
    .line 411
    aput-object v4, v7, v21

    .line 412
    .line 413
    sget-object v4, Lkotlin/reflect/jvm/internal/impl/util/OperatorNameConventions;->DEC:Lkotlin/reflect/jvm/internal/impl/name/Name;

    .line 414
    .line 415
    aput-object v4, v7, v18

    .line 416
    .line 417
    invoke-static {v7}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 418
    .line 419
    .line 420
    move-result-object v4

    .line 421
    check-cast v4, Ljava/util/Collection;

    .line 422
    .line 423
    move/from16 v7, v18

    .line 424
    .line 425
    move-object/from16 v18, v0

    .line 426
    .line 427
    new-array v0, v7, [Lkotlin/reflect/jvm/internal/impl/util/Check;

    .line 428
    .line 429
    aput-object v18, v0, v21

    .line 430
    .line 431
    move/from16 v19, v7

    .line 432
    .line 433
    sget-object v7, Lkotlin/reflect/jvm/internal/impl/util/OperatorChecks$checks$3;->INSTANCE:Lkotlin/reflect/jvm/internal/impl/util/OperatorChecks$checks$3;

    .line 434
    .line 435
    invoke-direct {v6, v4, v0, v7}, Lkotlin/reflect/jvm/internal/impl/util/Checks;-><init>(Ljava/util/Collection;[Lkotlin/reflect/jvm/internal/impl/util/Check;Ltf/l;)V

    .line 436
    .line 437
    .line 438
    new-instance v30, Lkotlin/reflect/jvm/internal/impl/util/Checks;

    .line 439
    .line 440
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/util/OperatorNameConventions;->ASSIGNMENT_OPERATIONS:Ljava/util/Set;

    .line 441
    .line 442
    move-object/from16 v31, v0

    .line 443
    .line 444
    check-cast v31, Ljava/util/Collection;

    .line 445
    .line 446
    const/4 v4, 0x4

    .line 447
    new-array v0, v4, [Lkotlin/reflect/jvm/internal/impl/util/Check;

    .line 448
    .line 449
    aput-object v18, v0, v21

    .line 450
    .line 451
    sget-object v4, Lkotlin/reflect/jvm/internal/impl/util/ReturnsCheck$ReturnsUnit;->INSTANCE:Lkotlin/reflect/jvm/internal/impl/util/ReturnsCheck$ReturnsUnit;

    .line 452
    .line 453
    aput-object v4, v0, v19

    .line 454
    .line 455
    const/4 v4, 0x2

    .line 456
    aput-object v5, v0, v4

    .line 457
    .line 458
    const/16 v16, 0x3

    .line 459
    .line 460
    aput-object v3, v0, v16

    .line 461
    .line 462
    const/16 v34, 0x4

    .line 463
    .line 464
    const/16 v35, 0x0

    .line 465
    .line 466
    const/16 v33, 0x0

    .line 467
    .line 468
    move-object/from16 v32, v0

    .line 469
    .line 470
    invoke-direct/range {v30 .. v35}, Lkotlin/reflect/jvm/internal/impl/util/Checks;-><init>(Ljava/util/Collection;[Lkotlin/reflect/jvm/internal/impl/util/Check;Ltf/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 471
    .line 472
    .line 473
    new-instance v31, Lkotlin/reflect/jvm/internal/impl/util/Checks;

    .line 474
    .line 475
    sget-object v32, Lkotlin/reflect/jvm/internal/impl/util/OperatorNameConventions;->COMPONENT_REGEX:LBf/i;

    .line 476
    .line 477
    new-array v0, v4, [Lkotlin/reflect/jvm/internal/impl/util/Check;

    .line 478
    .line 479
    aput-object v18, v0, v21

    .line 480
    .line 481
    aput-object v9, v0, v19

    .line 482
    .line 483
    const/16 v35, 0x4

    .line 484
    .line 485
    const/16 v36, 0x0

    .line 486
    .line 487
    const/16 v34, 0x0

    .line 488
    .line 489
    move-object/from16 v33, v0

    .line 490
    .line 491
    invoke-direct/range {v31 .. v36}, Lkotlin/reflect/jvm/internal/impl/util/Checks;-><init>(LBf/i;[Lkotlin/reflect/jvm/internal/impl/util/Check;Ltf/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 492
    .line 493
    .line 494
    const/16 v0, 0x13

    .line 495
    .line 496
    new-array v0, v0, [Lkotlin/reflect/jvm/internal/impl/util/Checks;

    .line 497
    .line 498
    aput-object v1, v0, v21

    .line 499
    .line 500
    aput-object v2, v0, v19

    .line 501
    .line 502
    aput-object v10, v0, v4

    .line 503
    .line 504
    const/16 v16, 0x3

    .line 505
    .line 506
    aput-object v11, v0, v16

    .line 507
    .line 508
    const/16 v17, 0x4

    .line 509
    .line 510
    aput-object v12, v0, v17

    .line 511
    .line 512
    const/4 v1, 0x5

    .line 513
    aput-object v13, v0, v1

    .line 514
    .line 515
    const/4 v1, 0x6

    .line 516
    aput-object v14, v0, v1

    .line 517
    .line 518
    const/4 v1, 0x7

    .line 519
    aput-object v22, v0, v1

    .line 520
    .line 521
    const/16 v1, 0x8

    .line 522
    .line 523
    aput-object v23, v0, v1

    .line 524
    .line 525
    const/16 v1, 0x9

    .line 526
    .line 527
    aput-object v24, v0, v1

    .line 528
    .line 529
    const/16 v1, 0xa

    .line 530
    .line 531
    aput-object v15, v0, v1

    .line 532
    .line 533
    const/16 v1, 0xb

    .line 534
    .line 535
    aput-object v26, v0, v1

    .line 536
    .line 537
    const/16 v1, 0xc

    .line 538
    .line 539
    aput-object v8, v0, v1

    .line 540
    .line 541
    const/16 v1, 0xd

    .line 542
    .line 543
    aput-object v27, v0, v1

    .line 544
    .line 545
    const/16 v1, 0xe

    .line 546
    .line 547
    aput-object v28, v0, v1

    .line 548
    .line 549
    const/16 v1, 0xf

    .line 550
    .line 551
    aput-object v29, v0, v1

    .line 552
    .line 553
    const/16 v1, 0x10

    .line 554
    .line 555
    aput-object v6, v0, v1

    .line 556
    .line 557
    const/16 v1, 0x11

    .line 558
    .line 559
    aput-object v30, v0, v1

    .line 560
    .line 561
    const/16 v1, 0x12

    .line 562
    .line 563
    aput-object v31, v0, v1

    .line 564
    .line 565
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/util/OperatorChecks;->checks:Ljava/util/List;

    .line 570
    .line 571
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/util/AbstractModifierChecks;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$incDecCheckForExpectClass(Lkotlin/reflect/jvm/internal/impl/util/OperatorChecks;Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/util/OperatorChecks;->incDecCheckForExpectClass(Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final incDecCheckForExpectClass(Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;)Z
    .locals 2

    .line 1
    invoke-interface {p2}, Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;->getValue()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ReceiverValue;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const-string v0, "getValue(...)"

    .line 6
    .line 7
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    instance-of v0, p2, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ImplicitClassReceiver;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    check-cast p2, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ImplicitClassReceiver;

    .line 17
    .line 18
    invoke-virtual {p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ImplicitClassReceiver;->getClassDescriptor()Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-interface {p2}, Lkotlin/reflect/jvm/internal/impl/descriptors/MemberDescriptor;->isExpect()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    return v1

    .line 29
    :cond_1
    invoke-static {p2}, Lkotlin/reflect/jvm/internal/impl/resolve/descriptorUtil/DescriptorUtilsKt;->getClassId(Lkotlin/reflect/jvm/internal/impl/descriptors/ClassifierDescriptor;)Lkotlin/reflect/jvm/internal/impl/name/ClassId;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    return v1

    .line 36
    :cond_2
    invoke-static {p2}, Lkotlin/reflect/jvm/internal/impl/resolve/descriptorUtil/DescriptorUtilsKt;->getModule(Lkotlin/reflect/jvm/internal/impl/descriptors/DeclarationDescriptor;)Lkotlin/reflect/jvm/internal/impl/descriptors/ModuleDescriptor;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-static {p2, v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/FindClassInModuleKt;->findClassifierAcrossModuleDependencies(Lkotlin/reflect/jvm/internal/impl/descriptors/ModuleDescriptor;Lkotlin/reflect/jvm/internal/impl/name/ClassId;)Lkotlin/reflect/jvm/internal/impl/descriptors/ClassifierDescriptor;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    instance-of v0, p2, Lkotlin/reflect/jvm/internal/impl/descriptors/TypeAliasDescriptor;

    .line 45
    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    check-cast p2, Lkotlin/reflect/jvm/internal/impl/descriptors/TypeAliasDescriptor;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    const/4 p2, 0x0

    .line 52
    :goto_0
    if-nez p2, :cond_4

    .line 53
    .line 54
    return v1

    .line 55
    :cond_4
    invoke-interface {p1}, Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;->getReturnType()Lkotlin/reflect/jvm/internal/impl/types/KotlinType;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-eqz p1, :cond_5

    .line 60
    .line 61
    invoke-interface {p2}, Lkotlin/reflect/jvm/internal/impl/descriptors/TypeAliasDescriptor;->getExpandedType()Lkotlin/reflect/jvm/internal/impl/types/SimpleType;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-static {p1, p2}, Lkotlin/reflect/jvm/internal/impl/types/typeUtil/TypeUtilsKt;->isSubtypeOf(Lkotlin/reflect/jvm/internal/impl/types/KotlinType;Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    return p1

    .line 70
    :cond_5
    return v1
.end method


# virtual methods
.method public getChecks$descriptors()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/reflect/jvm/internal/impl/util/Checks;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/util/OperatorChecks;->checks:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
