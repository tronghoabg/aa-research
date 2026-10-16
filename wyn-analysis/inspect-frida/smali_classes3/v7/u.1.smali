.class public final enum Lv7/u;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lv7/u;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic b:[Lv7/u;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 27

    .line 1
    new-instance v0, Lv7/u;

    .line 2
    .line 3
    const-string v1, "NOT_SUPPORTED_ERR"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0x9

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v3}, Lv7/u;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lv7/u;

    .line 12
    .line 13
    const-string v4, "INVALID_STATE_ERR"

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    const/16 v6, 0xb

    .line 17
    .line 18
    invoke-direct {v1, v4, v5, v6}, Lv7/u;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    .line 21
    new-instance v4, Lv7/u;

    .line 22
    .line 23
    const/16 v7, 0x12

    .line 24
    .line 25
    const-string v8, "SECURITY_ERR"

    .line 26
    .line 27
    const/4 v9, 0x2

    .line 28
    invoke-direct {v4, v8, v9, v7}, Lv7/u;-><init>(Ljava/lang/String;II)V

    .line 29
    .line 30
    .line 31
    new-instance v7, Lv7/u;

    .line 32
    .line 33
    const/16 v8, 0x13

    .line 34
    .line 35
    const-string v10, "NETWORK_ERR"

    .line 36
    .line 37
    const/4 v11, 0x3

    .line 38
    invoke-direct {v7, v10, v11, v8}, Lv7/u;-><init>(Ljava/lang/String;II)V

    .line 39
    .line 40
    .line 41
    new-instance v8, Lv7/u;

    .line 42
    .line 43
    const/16 v10, 0x14

    .line 44
    .line 45
    const-string v12, "ABORT_ERR"

    .line 46
    .line 47
    const/4 v13, 0x4

    .line 48
    invoke-direct {v8, v12, v13, v10}, Lv7/u;-><init>(Ljava/lang/String;II)V

    .line 49
    .line 50
    .line 51
    new-instance v10, Lv7/u;

    .line 52
    .line 53
    const/16 v12, 0x17

    .line 54
    .line 55
    const-string v14, "TIMEOUT_ERR"

    .line 56
    .line 57
    const/4 v15, 0x5

    .line 58
    invoke-direct {v10, v14, v15, v12}, Lv7/u;-><init>(Ljava/lang/String;II)V

    .line 59
    .line 60
    .line 61
    new-instance v12, Lv7/u;

    .line 62
    .line 63
    const/16 v14, 0x1b

    .line 64
    .line 65
    move/from16 v16, v2

    .line 66
    .line 67
    const-string v2, "ENCODING_ERR"

    .line 68
    .line 69
    move/from16 v17, v5

    .line 70
    .line 71
    const/4 v5, 0x6

    .line 72
    invoke-direct {v12, v2, v5, v14}, Lv7/u;-><init>(Ljava/lang/String;II)V

    .line 73
    .line 74
    .line 75
    new-instance v2, Lv7/u;

    .line 76
    .line 77
    const/16 v14, 0x1c

    .line 78
    .line 79
    move/from16 v18, v5

    .line 80
    .line 81
    const-string v5, "UNKNOWN_ERR"

    .line 82
    .line 83
    move/from16 v19, v9

    .line 84
    .line 85
    const/4 v9, 0x7

    .line 86
    invoke-direct {v2, v5, v9, v14}, Lv7/u;-><init>(Ljava/lang/String;II)V

    .line 87
    .line 88
    .line 89
    new-instance v5, Lv7/u;

    .line 90
    .line 91
    move/from16 v20, v9

    .line 92
    .line 93
    const/16 v9, 0x1d

    .line 94
    .line 95
    move/from16 v21, v11

    .line 96
    .line 97
    const-string v11, "CONSTRAINT_ERR"

    .line 98
    .line 99
    move/from16 v22, v13

    .line 100
    .line 101
    const/16 v13, 0x8

    .line 102
    .line 103
    invoke-direct {v5, v11, v13, v9}, Lv7/u;-><init>(Ljava/lang/String;II)V

    .line 104
    .line 105
    .line 106
    new-instance v9, Lv7/u;

    .line 107
    .line 108
    const-string v11, "DATA_ERR"

    .line 109
    .line 110
    move/from16 v23, v13

    .line 111
    .line 112
    const/16 v13, 0x1e

    .line 113
    .line 114
    invoke-direct {v9, v11, v3, v13}, Lv7/u;-><init>(Ljava/lang/String;II)V

    .line 115
    .line 116
    .line 117
    new-instance v11, Lv7/u;

    .line 118
    .line 119
    const/16 v13, 0x23

    .line 120
    .line 121
    move/from16 v24, v3

    .line 122
    .line 123
    const-string v3, "NOT_ALLOWED_ERR"

    .line 124
    .line 125
    move/from16 v25, v15

    .line 126
    .line 127
    const/16 v15, 0xa

    .line 128
    .line 129
    invoke-direct {v11, v3, v15, v13}, Lv7/u;-><init>(Ljava/lang/String;II)V

    .line 130
    .line 131
    .line 132
    new-instance v3, Lv7/u;

    .line 133
    .line 134
    const-string v13, "ATTESTATION_NOT_PRIVATE_ERR"

    .line 135
    .line 136
    move/from16 v26, v15

    .line 137
    .line 138
    const/16 v15, 0x24

    .line 139
    .line 140
    invoke-direct {v3, v13, v6, v15}, Lv7/u;-><init>(Ljava/lang/String;II)V

    .line 141
    .line 142
    .line 143
    const/16 v13, 0xc

    .line 144
    .line 145
    new-array v13, v13, [Lv7/u;

    .line 146
    .line 147
    aput-object v0, v13, v16

    .line 148
    .line 149
    aput-object v1, v13, v17

    .line 150
    .line 151
    aput-object v4, v13, v19

    .line 152
    .line 153
    aput-object v7, v13, v21

    .line 154
    .line 155
    aput-object v8, v13, v22

    .line 156
    .line 157
    aput-object v10, v13, v25

    .line 158
    .line 159
    aput-object v12, v13, v18

    .line 160
    .line 161
    aput-object v2, v13, v20

    .line 162
    .line 163
    aput-object v5, v13, v23

    .line 164
    .line 165
    aput-object v9, v13, v24

    .line 166
    .line 167
    aput-object v11, v13, v26

    .line 168
    .line 169
    aput-object v3, v13, v6

    .line 170
    .line 171
    sput-object v13, Lv7/u;->b:[Lv7/u;

    .line 172
    .line 173
    new-instance v0, Lv7/U;

    .line 174
    .line 175
    invoke-direct {v0, v14}, Lv7/U;-><init>(I)V

    .line 176
    .line 177
    .line 178
    sput-object v0, Lv7/u;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 179
    .line 180
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lv7/u;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static c(I)Lv7/u;
    .locals 5

    .line 1
    invoke-static {}, Lv7/u;->values()[Lv7/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_1

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    iget v4, v3, Lv7/u;->a:I

    .line 12
    .line 13
    if-ne p0, v4, :cond_0

    .line 14
    .line 15
    return-object v3

    .line 16
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    new-instance v0, Lv7/t;

    .line 20
    .line 21
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 22
    .line 23
    const-string v1, "Error code "

    .line 24
    .line 25
    const-string v2, " is not supported"

    .line 26
    .line 27
    invoke-static {p0, v1, v2}, LA7/p0;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lv7/u;
    .locals 1

    .line 1
    const-class v0, Lv7/u;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lv7/u;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lv7/u;
    .locals 1

    .line 1
    sget-object v0, Lv7/u;->b:[Lv7/u;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lv7/u;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lv7/u;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    iget p2, p0, Lv7/u;->a:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
