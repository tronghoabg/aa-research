.class public final enum Lbe/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:Lbe/a;

.field public static final enum c:Lbe/a;

.field public static final enum d:Lbe/a;

.field public static final enum e:Lbe/a;

.field public static final enum f:Lbe/a;

.field public static final enum g:Lbe/a;

.field public static final enum h:Lbe/a;

.field public static final enum i:Lbe/a;

.field public static final enum j:Lbe/a;

.field public static final enum k:Lbe/a;

.field public static final enum l:Lbe/a;

.field public static final synthetic m:[Lbe/a;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 24

    .line 1
    new-instance v0, Lbe/a;

    .line 2
    .line 3
    const-string v1, "Failed to start activity for No-Code screen"

    .line 4
    .line 5
    const-string v2, "ActivityStart"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, Lbe/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lbe/a;->b:Lbe/a;

    .line 12
    .line 13
    new-instance v1, Lbe/a;

    .line 14
    .line 15
    const-string v2, "Network request is incorrect and thus cannot be executed"

    .line 16
    .line 17
    const-string v4, "BadNetworkRequest"

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    invoke-direct {v1, v4, v5, v2}, Lbe/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lbe/a;->c:Lbe/a;

    .line 24
    .line 25
    new-instance v2, Lbe/a;

    .line 26
    .line 27
    const-string v4, "Failed to execute network request"

    .line 28
    .line 29
    const-string v6, "NetworkRequestExecution"

    .line 30
    .line 31
    const/4 v7, 0x2

    .line 32
    invoke-direct {v2, v6, v7, v4}, Lbe/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v2, Lbe/a;->d:Lbe/a;

    .line 36
    .line 37
    new-instance v4, Lbe/a;

    .line 38
    .line 39
    const-string v6, "Failed to serialize data"

    .line 40
    .line 41
    const-string v8, "Serialization"

    .line 42
    .line 43
    const/4 v9, 0x3

    .line 44
    invoke-direct {v4, v8, v9, v6}, Lbe/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v4, Lbe/a;->e:Lbe/a;

    .line 48
    .line 49
    new-instance v6, Lbe/a;

    .line 50
    .line 51
    const-string v8, "Failed to deserialize data"

    .line 52
    .line 53
    const-string v10, "Deserialization"

    .line 54
    .line 55
    const/4 v11, 0x4

    .line 56
    invoke-direct {v6, v10, v11, v8}, Lbe/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v6, Lbe/a;->f:Lbe/a;

    .line 60
    .line 61
    new-instance v8, Lbe/a;

    .line 62
    .line 63
    const-string v10, "Request denied"

    .line 64
    .line 65
    const-string v12, "RequestDenied"

    .line 66
    .line 67
    const/4 v13, 0x5

    .line 68
    invoke-direct {v8, v12, v13, v10}, Lbe/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v8, Lbe/a;->g:Lbe/a;

    .line 72
    .line 73
    new-instance v10, Lbe/a;

    .line 74
    .line 75
    const-string v12, "Failed to map response"

    .line 76
    .line 77
    const-string v14, "Mapping"

    .line 78
    .line 79
    const/4 v15, 0x6

    .line 80
    invoke-direct {v10, v14, v15, v12}, Lbe/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v10, Lbe/a;->h:Lbe/a;

    .line 84
    .line 85
    new-instance v12, Lbe/a;

    .line 86
    .line 87
    const-string v14, "API response can not be handled"

    .line 88
    .line 89
    move/from16 v16, v3

    .line 90
    .line 91
    const-string v3, "BadResponse"

    .line 92
    .line 93
    move/from16 v17, v5

    .line 94
    .line 95
    const/4 v5, 0x7

    .line 96
    invoke-direct {v12, v3, v5, v14}, Lbe/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 97
    .line 98
    .line 99
    sput-object v12, Lbe/a;->i:Lbe/a;

    .line 100
    .line 101
    new-instance v3, Lbe/a;

    .line 102
    .line 103
    const-string v14, "Qonversion API returned an error"

    .line 104
    .line 105
    move/from16 v18, v5

    .line 106
    .line 107
    const-string v5, "BackendError"

    .line 108
    .line 109
    move/from16 v19, v7

    .line 110
    .line 111
    const/16 v7, 0x8

    .line 112
    .line 113
    invoke-direct {v3, v5, v7, v14}, Lbe/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    sput-object v3, Lbe/a;->j:Lbe/a;

    .line 117
    .line 118
    new-instance v5, Lbe/a;

    .line 119
    .line 120
    const-string v14, "No-Code screen not found"

    .line 121
    .line 122
    move/from16 v20, v7

    .line 123
    .line 124
    const-string v7, "ScreenNotFound"

    .line 125
    .line 126
    move/from16 v21, v9

    .line 127
    .line 128
    const/16 v9, 0x9

    .line 129
    .line 130
    invoke-direct {v5, v7, v9, v14}, Lbe/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 131
    .line 132
    .line 133
    sput-object v5, Lbe/a;->k:Lbe/a;

    .line 134
    .line 135
    new-instance v7, Lbe/a;

    .line 136
    .line 137
    const-string v14, "An internal error from Qonversion SDK. For more details look at the nested error."

    .line 138
    .line 139
    move/from16 v22, v9

    .line 140
    .line 141
    const-string v9, "QonversionError"

    .line 142
    .line 143
    move/from16 v23, v11

    .line 144
    .line 145
    const/16 v11, 0xa

    .line 146
    .line 147
    invoke-direct {v7, v9, v11, v14}, Lbe/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 148
    .line 149
    .line 150
    sput-object v7, Lbe/a;->l:Lbe/a;

    .line 151
    .line 152
    const/16 v9, 0xb

    .line 153
    .line 154
    new-array v9, v9, [Lbe/a;

    .line 155
    .line 156
    aput-object v0, v9, v16

    .line 157
    .line 158
    aput-object v1, v9, v17

    .line 159
    .line 160
    aput-object v2, v9, v19

    .line 161
    .line 162
    aput-object v4, v9, v21

    .line 163
    .line 164
    aput-object v6, v9, v23

    .line 165
    .line 166
    aput-object v8, v9, v13

    .line 167
    .line 168
    aput-object v10, v9, v15

    .line 169
    .line 170
    aput-object v12, v9, v18

    .line 171
    .line 172
    aput-object v3, v9, v20

    .line 173
    .line 174
    aput-object v5, v9, v22

    .line 175
    .line 176
    aput-object v7, v9, v11

    .line 177
    .line 178
    sput-object v9, Lbe/a;->m:[Lbe/a;

    .line 179
    .line 180
    invoke-static {v9}, Lic/d;->t([Ljava/lang/Enum;)Lmf/b;

    .line 181
    .line 182
    .line 183
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lbe/a;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lbe/a;
    .locals 1

    .line 1
    const-class v0, Lbe/a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lbe/a;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lbe/a;
    .locals 1

    .line 1
    sget-object v0, Lbe/a;->m:[Lbe/a;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lbe/a;

    .line 8
    .line 9
    return-object v0
.end method
