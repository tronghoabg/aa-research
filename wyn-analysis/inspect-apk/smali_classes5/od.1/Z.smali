.class public final enum Lod/Z;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum c:Lod/Z;

.field public static final d:[Lod/Z;

.field public static final synthetic e:[Lod/Z;


# instance fields
.field public final a:I

.field public final b:Lmd/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 30

    .line 1
    new-instance v0, Lod/Z;

    .line 2
    .line 3
    sget-object v1, Lmd/k0;->n:Lmd/k0;

    .line 4
    .line 5
    const-string v2, "NO_ERROR"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v3, v1}, Lod/Z;-><init>(Ljava/lang/String;IILmd/k0;)V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lod/Z;

    .line 12
    .line 13
    sget-object v4, Lmd/k0;->m:Lmd/k0;

    .line 14
    .line 15
    const-string v5, "PROTOCOL_ERROR"

    .line 16
    .line 17
    const/4 v6, 0x1

    .line 18
    invoke-direct {v2, v5, v6, v6, v4}, Lod/Z;-><init>(Ljava/lang/String;IILmd/k0;)V

    .line 19
    .line 20
    .line 21
    new-instance v5, Lod/Z;

    .line 22
    .line 23
    const-string v7, "INTERNAL_ERROR"

    .line 24
    .line 25
    const/4 v8, 0x2

    .line 26
    invoke-direct {v5, v7, v8, v8, v4}, Lod/Z;-><init>(Ljava/lang/String;IILmd/k0;)V

    .line 27
    .line 28
    .line 29
    sput-object v5, Lod/Z;->c:Lod/Z;

    .line 30
    .line 31
    new-instance v7, Lod/Z;

    .line 32
    .line 33
    const-string v9, "FLOW_CONTROL_ERROR"

    .line 34
    .line 35
    const/4 v10, 0x3

    .line 36
    invoke-direct {v7, v9, v10, v10, v4}, Lod/Z;-><init>(Ljava/lang/String;IILmd/k0;)V

    .line 37
    .line 38
    .line 39
    new-instance v9, Lod/Z;

    .line 40
    .line 41
    const-string v11, "SETTINGS_TIMEOUT"

    .line 42
    .line 43
    const/4 v12, 0x4

    .line 44
    invoke-direct {v9, v11, v12, v12, v4}, Lod/Z;-><init>(Ljava/lang/String;IILmd/k0;)V

    .line 45
    .line 46
    .line 47
    new-instance v11, Lod/Z;

    .line 48
    .line 49
    const-string v13, "STREAM_CLOSED"

    .line 50
    .line 51
    const/4 v14, 0x5

    .line 52
    invoke-direct {v11, v13, v14, v14, v4}, Lod/Z;-><init>(Ljava/lang/String;IILmd/k0;)V

    .line 53
    .line 54
    .line 55
    new-instance v13, Lod/Z;

    .line 56
    .line 57
    const-string v15, "FRAME_SIZE_ERROR"

    .line 58
    .line 59
    move/from16 v16, v3

    .line 60
    .line 61
    const/4 v3, 0x6

    .line 62
    invoke-direct {v13, v15, v3, v3, v4}, Lod/Z;-><init>(Ljava/lang/String;IILmd/k0;)V

    .line 63
    .line 64
    .line 65
    new-instance v15, Lod/Z;

    .line 66
    .line 67
    move/from16 v17, v3

    .line 68
    .line 69
    const-string v3, "REFUSED_STREAM"

    .line 70
    .line 71
    move/from16 v18, v6

    .line 72
    .line 73
    const/4 v6, 0x7

    .line 74
    invoke-direct {v15, v3, v6, v6, v1}, Lod/Z;-><init>(Ljava/lang/String;IILmd/k0;)V

    .line 75
    .line 76
    .line 77
    new-instance v1, Lod/Z;

    .line 78
    .line 79
    sget-object v3, Lmd/k0;->f:Lmd/k0;

    .line 80
    .line 81
    move/from16 v19, v6

    .line 82
    .line 83
    const-string v6, "CANCEL"

    .line 84
    .line 85
    move/from16 v20, v8

    .line 86
    .line 87
    const/16 v8, 0x8

    .line 88
    .line 89
    invoke-direct {v1, v6, v8, v8, v3}, Lod/Z;-><init>(Ljava/lang/String;IILmd/k0;)V

    .line 90
    .line 91
    .line 92
    new-instance v3, Lod/Z;

    .line 93
    .line 94
    const-string v6, "COMPRESSION_ERROR"

    .line 95
    .line 96
    move/from16 v21, v8

    .line 97
    .line 98
    const/16 v8, 0x9

    .line 99
    .line 100
    invoke-direct {v3, v6, v8, v8, v4}, Lod/Z;-><init>(Ljava/lang/String;IILmd/k0;)V

    .line 101
    .line 102
    .line 103
    new-instance v6, Lod/Z;

    .line 104
    .line 105
    move/from16 v22, v8

    .line 106
    .line 107
    const-string v8, "CONNECT_ERROR"

    .line 108
    .line 109
    move/from16 v23, v10

    .line 110
    .line 111
    const/16 v10, 0xa

    .line 112
    .line 113
    invoke-direct {v6, v8, v10, v10, v4}, Lod/Z;-><init>(Ljava/lang/String;IILmd/k0;)V

    .line 114
    .line 115
    .line 116
    new-instance v4, Lod/Z;

    .line 117
    .line 118
    sget-object v8, Lmd/k0;->k:Lmd/k0;

    .line 119
    .line 120
    move/from16 v24, v10

    .line 121
    .line 122
    const-string v10, "Bandwidth exhausted"

    .line 123
    .line 124
    invoke-virtual {v8, v10}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    const-string v10, "ENHANCE_YOUR_CALM"

    .line 129
    .line 130
    move/from16 v25, v12

    .line 131
    .line 132
    const/16 v12, 0xb

    .line 133
    .line 134
    invoke-direct {v4, v10, v12, v12, v8}, Lod/Z;-><init>(Ljava/lang/String;IILmd/k0;)V

    .line 135
    .line 136
    .line 137
    new-instance v8, Lod/Z;

    .line 138
    .line 139
    sget-object v10, Lmd/k0;->i:Lmd/k0;

    .line 140
    .line 141
    move/from16 v26, v12

    .line 142
    .line 143
    const-string v12, "Permission denied as protocol is not secure enough to call"

    .line 144
    .line 145
    invoke-virtual {v10, v12}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    const-string v12, "INADEQUATE_SECURITY"

    .line 150
    .line 151
    move/from16 v27, v14

    .line 152
    .line 153
    const/16 v14, 0xc

    .line 154
    .line 155
    invoke-direct {v8, v12, v14, v14, v10}, Lod/Z;-><init>(Ljava/lang/String;IILmd/k0;)V

    .line 156
    .line 157
    .line 158
    new-instance v10, Lod/Z;

    .line 159
    .line 160
    sget-object v12, Lmd/k0;->g:Lmd/k0;

    .line 161
    .line 162
    move/from16 v28, v14

    .line 163
    .line 164
    const-string v14, "HTTP_1_1_REQUIRED"

    .line 165
    .line 166
    move-object/from16 v29, v0

    .line 167
    .line 168
    const/16 v0, 0xd

    .line 169
    .line 170
    invoke-direct {v10, v14, v0, v0, v12}, Lod/Z;-><init>(Ljava/lang/String;IILmd/k0;)V

    .line 171
    .line 172
    .line 173
    const/16 v12, 0xe

    .line 174
    .line 175
    new-array v12, v12, [Lod/Z;

    .line 176
    .line 177
    aput-object v29, v12, v16

    .line 178
    .line 179
    aput-object v2, v12, v18

    .line 180
    .line 181
    aput-object v5, v12, v20

    .line 182
    .line 183
    aput-object v7, v12, v23

    .line 184
    .line 185
    aput-object v9, v12, v25

    .line 186
    .line 187
    aput-object v11, v12, v27

    .line 188
    .line 189
    aput-object v13, v12, v17

    .line 190
    .line 191
    aput-object v15, v12, v19

    .line 192
    .line 193
    aput-object v1, v12, v21

    .line 194
    .line 195
    aput-object v3, v12, v22

    .line 196
    .line 197
    aput-object v6, v12, v24

    .line 198
    .line 199
    aput-object v4, v12, v26

    .line 200
    .line 201
    aput-object v8, v12, v28

    .line 202
    .line 203
    aput-object v10, v12, v0

    .line 204
    .line 205
    sput-object v12, Lod/Z;->e:[Lod/Z;

    .line 206
    .line 207
    invoke-static {}, Lod/Z;->values()[Lod/Z;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    array-length v1, v0

    .line 212
    add-int/lit8 v1, v1, -0x1

    .line 213
    .line 214
    aget-object v1, v0, v1

    .line 215
    .line 216
    iget v1, v1, Lod/Z;->a:I

    .line 217
    .line 218
    int-to-long v1, v1

    .line 219
    long-to-int v1, v1

    .line 220
    add-int/lit8 v1, v1, 0x1

    .line 221
    .line 222
    new-array v1, v1, [Lod/Z;

    .line 223
    .line 224
    array-length v2, v0

    .line 225
    move/from16 v3, v16

    .line 226
    .line 227
    :goto_0
    if-ge v3, v2, :cond_0

    .line 228
    .line 229
    aget-object v4, v0, v3

    .line 230
    .line 231
    iget v5, v4, Lod/Z;->a:I

    .line 232
    .line 233
    int-to-long v5, v5

    .line 234
    long-to-int v5, v5

    .line 235
    aput-object v4, v1, v5

    .line 236
    .line 237
    add-int/lit8 v3, v3, 0x1

    .line 238
    .line 239
    goto :goto_0

    .line 240
    :cond_0
    sput-object v1, Lod/Z;->d:[Lod/Z;

    .line 241
    .line 242
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILmd/k0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lod/Z;->a:I

    .line 5
    .line 6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string p2, "HTTP/2 error code: "

    .line 9
    .line 10
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object p2, p4, Lmd/k0;->b:Ljava/lang/String;

    .line 25
    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    const-string p2, " ("

    .line 29
    .line 30
    invoke-static {p1, p2}, LA7/p0;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object p2, p4, Lmd/k0;->b:Ljava/lang/String;

    .line 35
    .line 36
    const-string p3, ")"

    .line 37
    .line 38
    invoke-static {p1, p2, p3}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :cond_0
    invoke-virtual {p4, p1}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Lod/Z;->b:Lmd/k0;

    .line 47
    .line 48
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lod/Z;
    .locals 1

    .line 1
    const-class v0, Lod/Z;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lod/Z;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lod/Z;
    .locals 1

    .line 1
    sget-object v0, Lod/Z;->e:[Lod/Z;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lod/Z;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lod/Z;

    .line 8
    .line 9
    return-object v0
.end method
