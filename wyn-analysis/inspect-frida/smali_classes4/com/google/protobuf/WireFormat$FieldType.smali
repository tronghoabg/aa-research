.class public enum Lcom/google/protobuf/WireFormat$FieldType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/WireFormat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = "FieldType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/protobuf/WireFormat$FieldType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/protobuf/WireFormat$FieldType;

.field public static final enum BOOL:Lcom/google/protobuf/WireFormat$FieldType;

.field public static final enum BYTES:Lcom/google/protobuf/WireFormat$FieldType;

.field public static final enum DOUBLE:Lcom/google/protobuf/WireFormat$FieldType;

.field public static final enum ENUM:Lcom/google/protobuf/WireFormat$FieldType;

.field public static final enum FIXED32:Lcom/google/protobuf/WireFormat$FieldType;

.field public static final enum FIXED64:Lcom/google/protobuf/WireFormat$FieldType;

.field public static final enum FLOAT:Lcom/google/protobuf/WireFormat$FieldType;

.field public static final enum GROUP:Lcom/google/protobuf/WireFormat$FieldType;

.field public static final enum INT32:Lcom/google/protobuf/WireFormat$FieldType;

.field public static final enum INT64:Lcom/google/protobuf/WireFormat$FieldType;

.field public static final enum MESSAGE:Lcom/google/protobuf/WireFormat$FieldType;

.field public static final enum SFIXED32:Lcom/google/protobuf/WireFormat$FieldType;

.field public static final enum SFIXED64:Lcom/google/protobuf/WireFormat$FieldType;

.field public static final enum SINT32:Lcom/google/protobuf/WireFormat$FieldType;

.field public static final enum SINT64:Lcom/google/protobuf/WireFormat$FieldType;

.field public static final enum STRING:Lcom/google/protobuf/WireFormat$FieldType;

.field public static final enum UINT32:Lcom/google/protobuf/WireFormat$FieldType;

.field public static final enum UINT64:Lcom/google/protobuf/WireFormat$FieldType;


# instance fields
.field private final javaType:Lcom/google/protobuf/WireFormat$JavaType;

.field private final wireType:I


# direct methods
.method static constructor <clinit>()V
    .locals 35

    .line 1
    const/16 v4, 0xd

    .line 2
    .line 3
    const/16 v5, 0xc

    .line 4
    .line 5
    new-instance v6, Lcom/google/protobuf/WireFormat$FieldType;

    .line 6
    .line 7
    sget-object v7, Lcom/google/protobuf/WireFormat$JavaType;->DOUBLE:Lcom/google/protobuf/WireFormat$JavaType;

    .line 8
    .line 9
    const-string v8, "DOUBLE"

    .line 10
    .line 11
    const/4 v9, 0x0

    .line 12
    const/4 v10, 0x1

    .line 13
    invoke-direct {v6, v8, v9, v7, v10}, Lcom/google/protobuf/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/google/protobuf/WireFormat$JavaType;I)V

    .line 14
    .line 15
    .line 16
    sput-object v6, Lcom/google/protobuf/WireFormat$FieldType;->DOUBLE:Lcom/google/protobuf/WireFormat$FieldType;

    .line 17
    .line 18
    new-instance v7, Lcom/google/protobuf/WireFormat$FieldType;

    .line 19
    .line 20
    sget-object v8, Lcom/google/protobuf/WireFormat$JavaType;->FLOAT:Lcom/google/protobuf/WireFormat$JavaType;

    .line 21
    .line 22
    const-string v11, "FLOAT"

    .line 23
    .line 24
    const/4 v12, 0x5

    .line 25
    invoke-direct {v7, v11, v10, v8, v12}, Lcom/google/protobuf/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/google/protobuf/WireFormat$JavaType;I)V

    .line 26
    .line 27
    .line 28
    sput-object v7, Lcom/google/protobuf/WireFormat$FieldType;->FLOAT:Lcom/google/protobuf/WireFormat$FieldType;

    .line 29
    .line 30
    new-instance v8, Lcom/google/protobuf/WireFormat$FieldType;

    .line 31
    .line 32
    sget-object v11, Lcom/google/protobuf/WireFormat$JavaType;->LONG:Lcom/google/protobuf/WireFormat$JavaType;

    .line 33
    .line 34
    const-string v13, "INT64"

    .line 35
    .line 36
    const/4 v14, 0x2

    .line 37
    invoke-direct {v8, v13, v14, v11, v9}, Lcom/google/protobuf/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/google/protobuf/WireFormat$JavaType;I)V

    .line 38
    .line 39
    .line 40
    sput-object v8, Lcom/google/protobuf/WireFormat$FieldType;->INT64:Lcom/google/protobuf/WireFormat$FieldType;

    .line 41
    .line 42
    new-instance v13, Lcom/google/protobuf/WireFormat$FieldType;

    .line 43
    .line 44
    const-string v15, "UINT64"

    .line 45
    .line 46
    move/from16 v16, v14

    .line 47
    .line 48
    const/4 v14, 0x3

    .line 49
    invoke-direct {v13, v15, v14, v11, v9}, Lcom/google/protobuf/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/google/protobuf/WireFormat$JavaType;I)V

    .line 50
    .line 51
    .line 52
    sput-object v13, Lcom/google/protobuf/WireFormat$FieldType;->UINT64:Lcom/google/protobuf/WireFormat$FieldType;

    .line 53
    .line 54
    new-instance v15, Lcom/google/protobuf/WireFormat$FieldType;

    .line 55
    .line 56
    move/from16 v17, v14

    .line 57
    .line 58
    sget-object v14, Lcom/google/protobuf/WireFormat$JavaType;->INT:Lcom/google/protobuf/WireFormat$JavaType;

    .line 59
    .line 60
    const-string v0, "INT32"

    .line 61
    .line 62
    const/4 v1, 0x4

    .line 63
    invoke-direct {v15, v0, v1, v14, v9}, Lcom/google/protobuf/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/google/protobuf/WireFormat$JavaType;I)V

    .line 64
    .line 65
    .line 66
    sput-object v15, Lcom/google/protobuf/WireFormat$FieldType;->INT32:Lcom/google/protobuf/WireFormat$FieldType;

    .line 67
    .line 68
    new-instance v0, Lcom/google/protobuf/WireFormat$FieldType;

    .line 69
    .line 70
    move/from16 v20, v1

    .line 71
    .line 72
    const-string v1, "FIXED64"

    .line 73
    .line 74
    invoke-direct {v0, v1, v12, v11, v10}, Lcom/google/protobuf/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/google/protobuf/WireFormat$JavaType;I)V

    .line 75
    .line 76
    .line 77
    sput-object v0, Lcom/google/protobuf/WireFormat$FieldType;->FIXED64:Lcom/google/protobuf/WireFormat$FieldType;

    .line 78
    .line 79
    new-instance v1, Lcom/google/protobuf/WireFormat$FieldType;

    .line 80
    .line 81
    const-string v2, "FIXED32"

    .line 82
    .line 83
    const/4 v10, 0x6

    .line 84
    invoke-direct {v1, v2, v10, v14, v12}, Lcom/google/protobuf/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/google/protobuf/WireFormat$JavaType;I)V

    .line 85
    .line 86
    .line 87
    sput-object v1, Lcom/google/protobuf/WireFormat$FieldType;->FIXED32:Lcom/google/protobuf/WireFormat$FieldType;

    .line 88
    .line 89
    new-instance v2, Lcom/google/protobuf/WireFormat$FieldType;

    .line 90
    .line 91
    move/from16 v23, v10

    .line 92
    .line 93
    const/4 v10, 0x7

    .line 94
    sget-object v3, Lcom/google/protobuf/WireFormat$JavaType;->BOOLEAN:Lcom/google/protobuf/WireFormat$JavaType;

    .line 95
    .line 96
    const-string v12, "BOOL"

    .line 97
    .line 98
    invoke-direct {v2, v12, v10, v3, v9}, Lcom/google/protobuf/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/google/protobuf/WireFormat$JavaType;I)V

    .line 99
    .line 100
    .line 101
    sput-object v2, Lcom/google/protobuf/WireFormat$FieldType;->BOOL:Lcom/google/protobuf/WireFormat$FieldType;

    .line 102
    .line 103
    new-instance v26, Lcom/google/protobuf/i2;

    .line 104
    .line 105
    sget-object v29, Lcom/google/protobuf/WireFormat$JavaType;->STRING:Lcom/google/protobuf/WireFormat$JavaType;

    .line 106
    .line 107
    const/16 v31, 0x0

    .line 108
    .line 109
    const-string v27, "STRING"

    .line 110
    .line 111
    const/16 v28, 0x8

    .line 112
    .line 113
    const/16 v30, 0x2

    .line 114
    .line 115
    invoke-direct/range {v26 .. v31}, Lcom/google/protobuf/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/google/protobuf/WireFormat$JavaType;ILcom/google/protobuf/h2;)V

    .line 116
    .line 117
    .line 118
    sput-object v26, Lcom/google/protobuf/WireFormat$FieldType;->STRING:Lcom/google/protobuf/WireFormat$FieldType;

    .line 119
    .line 120
    new-instance v27, Lcom/google/protobuf/j2;

    .line 121
    .line 122
    sget-object v30, Lcom/google/protobuf/WireFormat$JavaType;->MESSAGE:Lcom/google/protobuf/WireFormat$JavaType;

    .line 123
    .line 124
    const/16 v32, 0x0

    .line 125
    .line 126
    const-string v28, "GROUP"

    .line 127
    .line 128
    const/16 v29, 0x9

    .line 129
    .line 130
    const/16 v31, 0x3

    .line 131
    .line 132
    invoke-direct/range {v27 .. v32}, Lcom/google/protobuf/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/google/protobuf/WireFormat$JavaType;ILcom/google/protobuf/h2;)V

    .line 133
    .line 134
    .line 135
    sput-object v27, Lcom/google/protobuf/WireFormat$FieldType;->GROUP:Lcom/google/protobuf/WireFormat$FieldType;

    .line 136
    .line 137
    new-instance v28, Lcom/google/protobuf/k2;

    .line 138
    .line 139
    const/16 v33, 0x0

    .line 140
    .line 141
    const-string v29, "MESSAGE"

    .line 142
    .line 143
    move-object/from16 v31, v30

    .line 144
    .line 145
    const/16 v30, 0xa

    .line 146
    .line 147
    const/16 v32, 0x2

    .line 148
    .line 149
    invoke-direct/range {v28 .. v33}, Lcom/google/protobuf/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/google/protobuf/WireFormat$JavaType;ILcom/google/protobuf/h2;)V

    .line 150
    .line 151
    .line 152
    sput-object v28, Lcom/google/protobuf/WireFormat$FieldType;->MESSAGE:Lcom/google/protobuf/WireFormat$FieldType;

    .line 153
    .line 154
    new-instance v29, Lcom/google/protobuf/l2;

    .line 155
    .line 156
    sget-object v32, Lcom/google/protobuf/WireFormat$JavaType;->BYTE_STRING:Lcom/google/protobuf/WireFormat$JavaType;

    .line 157
    .line 158
    const/16 v34, 0x0

    .line 159
    .line 160
    const-string v30, "BYTES"

    .line 161
    .line 162
    const/16 v31, 0xb

    .line 163
    .line 164
    const/16 v33, 0x2

    .line 165
    .line 166
    invoke-direct/range {v29 .. v34}, Lcom/google/protobuf/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/google/protobuf/WireFormat$JavaType;ILcom/google/protobuf/h2;)V

    .line 167
    .line 168
    .line 169
    sput-object v29, Lcom/google/protobuf/WireFormat$FieldType;->BYTES:Lcom/google/protobuf/WireFormat$FieldType;

    .line 170
    .line 171
    new-instance v3, Lcom/google/protobuf/WireFormat$FieldType;

    .line 172
    .line 173
    const-string v12, "UINT32"

    .line 174
    .line 175
    invoke-direct {v3, v12, v5, v14, v9}, Lcom/google/protobuf/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/google/protobuf/WireFormat$JavaType;I)V

    .line 176
    .line 177
    .line 178
    sput-object v3, Lcom/google/protobuf/WireFormat$FieldType;->UINT32:Lcom/google/protobuf/WireFormat$FieldType;

    .line 179
    .line 180
    new-instance v12, Lcom/google/protobuf/WireFormat$FieldType;

    .line 181
    .line 182
    move/from16 v30, v5

    .line 183
    .line 184
    sget-object v5, Lcom/google/protobuf/WireFormat$JavaType;->ENUM:Lcom/google/protobuf/WireFormat$JavaType;

    .line 185
    .line 186
    move/from16 v31, v10

    .line 187
    .line 188
    const-string v10, "ENUM"

    .line 189
    .line 190
    invoke-direct {v12, v10, v4, v5, v9}, Lcom/google/protobuf/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/google/protobuf/WireFormat$JavaType;I)V

    .line 191
    .line 192
    .line 193
    sput-object v12, Lcom/google/protobuf/WireFormat$FieldType;->ENUM:Lcom/google/protobuf/WireFormat$FieldType;

    .line 194
    .line 195
    new-instance v5, Lcom/google/protobuf/WireFormat$FieldType;

    .line 196
    .line 197
    const-string v10, "SFIXED32"

    .line 198
    .line 199
    move/from16 v32, v4

    .line 200
    .line 201
    const/4 v4, 0x5

    .line 202
    const/16 v9, 0xe

    .line 203
    .line 204
    invoke-direct {v5, v10, v9, v14, v4}, Lcom/google/protobuf/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/google/protobuf/WireFormat$JavaType;I)V

    .line 205
    .line 206
    .line 207
    sput-object v5, Lcom/google/protobuf/WireFormat$FieldType;->SFIXED32:Lcom/google/protobuf/WireFormat$FieldType;

    .line 208
    .line 209
    new-instance v4, Lcom/google/protobuf/WireFormat$FieldType;

    .line 210
    .line 211
    const-string v9, "SFIXED64"

    .line 212
    .line 213
    move-object/from16 v34, v0

    .line 214
    .line 215
    const/16 v0, 0xf

    .line 216
    .line 217
    const/4 v10, 0x1

    .line 218
    invoke-direct {v4, v9, v0, v11, v10}, Lcom/google/protobuf/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/google/protobuf/WireFormat$JavaType;I)V

    .line 219
    .line 220
    .line 221
    sput-object v4, Lcom/google/protobuf/WireFormat$FieldType;->SFIXED64:Lcom/google/protobuf/WireFormat$FieldType;

    .line 222
    .line 223
    new-instance v0, Lcom/google/protobuf/WireFormat$FieldType;

    .line 224
    .line 225
    const-string v9, "SINT32"

    .line 226
    .line 227
    move-object/from16 v33, v1

    .line 228
    .line 229
    const/16 v1, 0x10

    .line 230
    .line 231
    const/4 v10, 0x0

    .line 232
    invoke-direct {v0, v9, v1, v14, v10}, Lcom/google/protobuf/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/google/protobuf/WireFormat$JavaType;I)V

    .line 233
    .line 234
    .line 235
    sput-object v0, Lcom/google/protobuf/WireFormat$FieldType;->SINT32:Lcom/google/protobuf/WireFormat$FieldType;

    .line 236
    .line 237
    new-instance v1, Lcom/google/protobuf/WireFormat$FieldType;

    .line 238
    .line 239
    const-string v9, "SINT64"

    .line 240
    .line 241
    const/16 v14, 0x11

    .line 242
    .line 243
    invoke-direct {v1, v9, v14, v11, v10}, Lcom/google/protobuf/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/google/protobuf/WireFormat$JavaType;I)V

    .line 244
    .line 245
    .line 246
    sput-object v1, Lcom/google/protobuf/WireFormat$FieldType;->SINT64:Lcom/google/protobuf/WireFormat$FieldType;

    .line 247
    .line 248
    const/16 v9, 0x12

    .line 249
    .line 250
    new-array v9, v9, [Lcom/google/protobuf/WireFormat$FieldType;

    .line 251
    .line 252
    aput-object v6, v9, v10

    .line 253
    .line 254
    const/16 v22, 0x1

    .line 255
    .line 256
    aput-object v7, v9, v22

    .line 257
    .line 258
    aput-object v8, v9, v16

    .line 259
    .line 260
    aput-object v13, v9, v17

    .line 261
    .line 262
    aput-object v15, v9, v20

    .line 263
    .line 264
    const/16 v25, 0x5

    .line 265
    .line 266
    aput-object v34, v9, v25

    .line 267
    .line 268
    aput-object v33, v9, v23

    .line 269
    .line 270
    aput-object v2, v9, v31

    .line 271
    .line 272
    const/16 v2, 0x8

    .line 273
    .line 274
    aput-object v26, v9, v2

    .line 275
    .line 276
    const/16 v2, 0x9

    .line 277
    .line 278
    aput-object v27, v9, v2

    .line 279
    .line 280
    const/16 v2, 0xa

    .line 281
    .line 282
    aput-object v28, v9, v2

    .line 283
    .line 284
    const/16 v2, 0xb

    .line 285
    .line 286
    aput-object v29, v9, v2

    .line 287
    .line 288
    aput-object v3, v9, v30

    .line 289
    .line 290
    aput-object v12, v9, v32

    .line 291
    .line 292
    const/16 v24, 0xe

    .line 293
    .line 294
    aput-object v5, v9, v24

    .line 295
    .line 296
    const/16 v21, 0xf

    .line 297
    .line 298
    aput-object v4, v9, v21

    .line 299
    .line 300
    const/16 v19, 0x10

    .line 301
    .line 302
    aput-object v0, v9, v19

    .line 303
    .line 304
    const/16 v18, 0x11

    .line 305
    .line 306
    aput-object v1, v9, v18

    .line 307
    .line 308
    sput-object v9, Lcom/google/protobuf/WireFormat$FieldType;->$VALUES:[Lcom/google/protobuf/WireFormat$FieldType;

    .line 309
    .line 310
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILcom/google/protobuf/WireFormat$JavaType;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/WireFormat$JavaType;",
            "I)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 3
    iput-object p3, p0, Lcom/google/protobuf/WireFormat$FieldType;->javaType:Lcom/google/protobuf/WireFormat$JavaType;

    .line 4
    iput p4, p0, Lcom/google/protobuf/WireFormat$FieldType;->wireType:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILcom/google/protobuf/WireFormat$JavaType;ILcom/google/protobuf/h2;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/protobuf/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/google/protobuf/WireFormat$JavaType;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/protobuf/WireFormat$FieldType;
    .locals 1

    .line 1
    const-class v0, Lcom/google/protobuf/WireFormat$FieldType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/protobuf/WireFormat$FieldType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/google/protobuf/WireFormat$FieldType;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/WireFormat$FieldType;->$VALUES:[Lcom/google/protobuf/WireFormat$FieldType;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/google/protobuf/WireFormat$FieldType;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/google/protobuf/WireFormat$FieldType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getJavaType()Lcom/google/protobuf/WireFormat$JavaType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/WireFormat$FieldType;->javaType:Lcom/google/protobuf/WireFormat$JavaType;

    .line 2
    .line 3
    return-object v0
.end method

.method public getWireType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/WireFormat$FieldType;->wireType:I

    .line 2
    .line 3
    return v0
.end method

.method public isPackable()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
