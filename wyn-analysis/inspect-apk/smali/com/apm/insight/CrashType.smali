.class public final enum Lcom/apm/insight/CrashType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/apm/insight/CrashType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/apm/insight/CrashType;

.field public static final enum ALL:Lcom/apm/insight/CrashType;

.field public static final enum ANR:Lcom/apm/insight/CrashType;

.field public static final enum ASAN:Lcom/apm/insight/CrashType;

.field public static final enum BLOCK:Lcom/apm/insight/CrashType;

.field public static final enum CUSTOM_JAVA:Lcom/apm/insight/CrashType;

.field public static final enum DART:Lcom/apm/insight/CrashType;

.field public static final enum ENSURE:Lcom/apm/insight/CrashType;

.field public static final enum JAVA:Lcom/apm/insight/CrashType;

.field public static final enum LAUNCH:Lcom/apm/insight/CrashType;

.field public static final enum NATIVE:Lcom/apm/insight/CrashType;

.field public static final enum OOM:Lcom/apm/insight/CrashType;

.field public static final enum TSAN:Lcom/apm/insight/CrashType;


# instance fields
.field private mName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 26

    .line 1
    new-instance v0, Lcom/apm/insight/CrashType;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "launch"

    .line 5
    .line 6
    const-string v3, "LAUNCH"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lcom/apm/insight/CrashType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/apm/insight/CrashType;->LAUNCH:Lcom/apm/insight/CrashType;

    .line 12
    .line 13
    new-instance v2, Lcom/apm/insight/CrashType;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    const-string v4, "java"

    .line 17
    .line 18
    const-string v5, "JAVA"

    .line 19
    .line 20
    invoke-direct {v2, v5, v3, v4}, Lcom/apm/insight/CrashType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v2, Lcom/apm/insight/CrashType;->JAVA:Lcom/apm/insight/CrashType;

    .line 24
    .line 25
    new-instance v4, Lcom/apm/insight/CrashType;

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    const-string v6, "native"

    .line 29
    .line 30
    const-string v7, "NATIVE"

    .line 31
    .line 32
    invoke-direct {v4, v7, v5, v6}, Lcom/apm/insight/CrashType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v4, Lcom/apm/insight/CrashType;->NATIVE:Lcom/apm/insight/CrashType;

    .line 36
    .line 37
    new-instance v6, Lcom/apm/insight/CrashType;

    .line 38
    .line 39
    const/4 v7, 0x3

    .line 40
    const-string v8, "asan"

    .line 41
    .line 42
    const-string v9, "ASAN"

    .line 43
    .line 44
    invoke-direct {v6, v9, v7, v8}, Lcom/apm/insight/CrashType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v6, Lcom/apm/insight/CrashType;->ASAN:Lcom/apm/insight/CrashType;

    .line 48
    .line 49
    new-instance v8, Lcom/apm/insight/CrashType;

    .line 50
    .line 51
    const/4 v9, 0x4

    .line 52
    const-string v10, "tsan"

    .line 53
    .line 54
    const-string v11, "TSAN"

    .line 55
    .line 56
    invoke-direct {v8, v11, v9, v10}, Lcom/apm/insight/CrashType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v8, Lcom/apm/insight/CrashType;->TSAN:Lcom/apm/insight/CrashType;

    .line 60
    .line 61
    new-instance v10, Lcom/apm/insight/CrashType;

    .line 62
    .line 63
    const/4 v11, 0x5

    .line 64
    const-string v12, "anr"

    .line 65
    .line 66
    const-string v13, "ANR"

    .line 67
    .line 68
    invoke-direct {v10, v13, v11, v12}, Lcom/apm/insight/CrashType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v10, Lcom/apm/insight/CrashType;->ANR:Lcom/apm/insight/CrashType;

    .line 72
    .line 73
    new-instance v12, Lcom/apm/insight/CrashType;

    .line 74
    .line 75
    const/4 v13, 0x6

    .line 76
    const-string v14, "block"

    .line 77
    .line 78
    const-string v15, "BLOCK"

    .line 79
    .line 80
    invoke-direct {v12, v15, v13, v14}, Lcom/apm/insight/CrashType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v12, Lcom/apm/insight/CrashType;->BLOCK:Lcom/apm/insight/CrashType;

    .line 84
    .line 85
    new-instance v14, Lcom/apm/insight/CrashType;

    .line 86
    .line 87
    const/4 v15, 0x7

    .line 88
    move/from16 v16, v1

    .line 89
    .line 90
    const-string v1, "ensure"

    .line 91
    .line 92
    move/from16 v17, v3

    .line 93
    .line 94
    const-string v3, "ENSURE"

    .line 95
    .line 96
    invoke-direct {v14, v3, v15, v1}, Lcom/apm/insight/CrashType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 97
    .line 98
    .line 99
    sput-object v14, Lcom/apm/insight/CrashType;->ENSURE:Lcom/apm/insight/CrashType;

    .line 100
    .line 101
    new-instance v1, Lcom/apm/insight/CrashType;

    .line 102
    .line 103
    const/16 v3, 0x8

    .line 104
    .line 105
    move/from16 v18, v5

    .line 106
    .line 107
    const-string v5, "dart"

    .line 108
    .line 109
    move/from16 v19, v7

    .line 110
    .line 111
    const-string v7, "DART"

    .line 112
    .line 113
    invoke-direct {v1, v7, v3, v5}, Lcom/apm/insight/CrashType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    sput-object v1, Lcom/apm/insight/CrashType;->DART:Lcom/apm/insight/CrashType;

    .line 117
    .line 118
    new-instance v5, Lcom/apm/insight/CrashType;

    .line 119
    .line 120
    const/16 v7, 0x9

    .line 121
    .line 122
    move/from16 v20, v3

    .line 123
    .line 124
    const-string v3, "custom_java"

    .line 125
    .line 126
    move/from16 v21, v9

    .line 127
    .line 128
    const-string v9, "CUSTOM_JAVA"

    .line 129
    .line 130
    invoke-direct {v5, v9, v7, v3}, Lcom/apm/insight/CrashType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 131
    .line 132
    .line 133
    sput-object v5, Lcom/apm/insight/CrashType;->CUSTOM_JAVA:Lcom/apm/insight/CrashType;

    .line 134
    .line 135
    new-instance v3, Lcom/apm/insight/CrashType;

    .line 136
    .line 137
    const/16 v9, 0xa

    .line 138
    .line 139
    move/from16 v22, v7

    .line 140
    .line 141
    const-string v7, "oom"

    .line 142
    .line 143
    move/from16 v23, v11

    .line 144
    .line 145
    const-string v11, "OOM"

    .line 146
    .line 147
    invoke-direct {v3, v11, v9, v7}, Lcom/apm/insight/CrashType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 148
    .line 149
    .line 150
    sput-object v3, Lcom/apm/insight/CrashType;->OOM:Lcom/apm/insight/CrashType;

    .line 151
    .line 152
    new-instance v7, Lcom/apm/insight/CrashType;

    .line 153
    .line 154
    const/16 v11, 0xb

    .line 155
    .line 156
    move/from16 v24, v9

    .line 157
    .line 158
    const-string v9, "all"

    .line 159
    .line 160
    move/from16 v25, v13

    .line 161
    .line 162
    const-string v13, "ALL"

    .line 163
    .line 164
    invoke-direct {v7, v13, v11, v9}, Lcom/apm/insight/CrashType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 165
    .line 166
    .line 167
    sput-object v7, Lcom/apm/insight/CrashType;->ALL:Lcom/apm/insight/CrashType;

    .line 168
    .line 169
    const/16 v9, 0xc

    .line 170
    .line 171
    new-array v9, v9, [Lcom/apm/insight/CrashType;

    .line 172
    .line 173
    aput-object v0, v9, v16

    .line 174
    .line 175
    aput-object v2, v9, v17

    .line 176
    .line 177
    aput-object v4, v9, v18

    .line 178
    .line 179
    aput-object v6, v9, v19

    .line 180
    .line 181
    aput-object v8, v9, v21

    .line 182
    .line 183
    aput-object v10, v9, v23

    .line 184
    .line 185
    aput-object v12, v9, v25

    .line 186
    .line 187
    aput-object v14, v9, v15

    .line 188
    .line 189
    aput-object v1, v9, v20

    .line 190
    .line 191
    aput-object v5, v9, v22

    .line 192
    .line 193
    aput-object v3, v9, v24

    .line 194
    .line 195
    aput-object v7, v9, v11

    .line 196
    .line 197
    sput-object v9, Lcom/apm/insight/CrashType;->$VALUES:[Lcom/apm/insight/CrashType;

    .line 198
    .line 199
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/apm/insight/CrashType;->mName:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/apm/insight/CrashType;
    .locals 1

    .line 1
    const-class v0, Lcom/apm/insight/CrashType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/apm/insight/CrashType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/apm/insight/CrashType;
    .locals 1

    .line 1
    sget-object v0, Lcom/apm/insight/CrashType;->$VALUES:[Lcom/apm/insight/CrashType;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/apm/insight/CrashType;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/apm/insight/CrashType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/apm/insight/CrashType;->mName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/apm/insight/CrashType;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
