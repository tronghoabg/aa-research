.class public final enum LR8/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:LR8/f;

.field public static final b:Ljava/util/HashMap;

.field public static final synthetic c:[LR8/f;


# direct methods
.method static constructor <clinit>()V
    .locals 21

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    const/4 v3, 0x6

    .line 7
    const/4 v4, 0x5

    .line 8
    const/4 v5, 0x4

    .line 9
    const/4 v6, 0x3

    .line 10
    const/4 v7, 0x2

    .line 11
    const/4 v8, 0x1

    .line 12
    const/4 v9, 0x0

    .line 13
    new-instance v10, LR8/f;

    .line 14
    .line 15
    const-string v11, "X86_32"

    .line 16
    .line 17
    invoke-direct {v10, v11, v9}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    new-instance v11, LR8/f;

    .line 21
    .line 22
    const-string v12, "X86_64"

    .line 23
    .line 24
    invoke-direct {v11, v12, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    new-instance v12, LR8/f;

    .line 28
    .line 29
    const-string v13, "ARM_UNKNOWN"

    .line 30
    .line 31
    invoke-direct {v12, v13, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 32
    .line 33
    .line 34
    new-instance v13, LR8/f;

    .line 35
    .line 36
    const-string v14, "PPC"

    .line 37
    .line 38
    invoke-direct {v13, v14, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    new-instance v14, LR8/f;

    .line 42
    .line 43
    const-string v15, "PPC64"

    .line 44
    .line 45
    invoke-direct {v14, v15, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 46
    .line 47
    .line 48
    new-instance v15, LR8/f;

    .line 49
    .line 50
    move/from16 v16, v6

    .line 51
    .line 52
    const-string v6, "ARMV6"

    .line 53
    .line 54
    invoke-direct {v15, v6, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 55
    .line 56
    .line 57
    new-instance v6, LR8/f;

    .line 58
    .line 59
    move/from16 v17, v4

    .line 60
    .line 61
    const-string v4, "ARMV7"

    .line 62
    .line 63
    invoke-direct {v6, v4, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 64
    .line 65
    .line 66
    new-instance v4, LR8/f;

    .line 67
    .line 68
    move/from16 v18, v3

    .line 69
    .line 70
    const-string v3, "UNKNOWN"

    .line 71
    .line 72
    invoke-direct {v4, v3, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 73
    .line 74
    .line 75
    sput-object v4, LR8/f;->a:LR8/f;

    .line 76
    .line 77
    new-instance v3, LR8/f;

    .line 78
    .line 79
    move/from16 v19, v2

    .line 80
    .line 81
    const-string v2, "ARMV7S"

    .line 82
    .line 83
    invoke-direct {v3, v2, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 84
    .line 85
    .line 86
    new-instance v2, LR8/f;

    .line 87
    .line 88
    move/from16 v20, v1

    .line 89
    .line 90
    const-string v1, "ARM64"

    .line 91
    .line 92
    invoke-direct {v2, v1, v0}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 93
    .line 94
    .line 95
    const/16 v1, 0xa

    .line 96
    .line 97
    new-array v1, v1, [LR8/f;

    .line 98
    .line 99
    aput-object v10, v1, v9

    .line 100
    .line 101
    aput-object v11, v1, v8

    .line 102
    .line 103
    aput-object v12, v1, v7

    .line 104
    .line 105
    aput-object v13, v1, v16

    .line 106
    .line 107
    aput-object v14, v1, v5

    .line 108
    .line 109
    aput-object v15, v1, v17

    .line 110
    .line 111
    aput-object v6, v1, v18

    .line 112
    .line 113
    aput-object v4, v1, v19

    .line 114
    .line 115
    aput-object v3, v1, v20

    .line 116
    .line 117
    aput-object v2, v1, v0

    .line 118
    .line 119
    sput-object v1, LR8/f;->c:[LR8/f;

    .line 120
    .line 121
    new-instance v0, Ljava/util/HashMap;

    .line 122
    .line 123
    invoke-direct {v0, v5}, Ljava/util/HashMap;-><init>(I)V

    .line 124
    .line 125
    .line 126
    sput-object v0, LR8/f;->b:Ljava/util/HashMap;

    .line 127
    .line 128
    const-string v1, "armeabi-v7a"

    .line 129
    .line 130
    invoke-virtual {v0, v1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    const-string v1, "armeabi"

    .line 134
    .line 135
    invoke-virtual {v0, v1, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    const-string v1, "arm64-v8a"

    .line 139
    .line 140
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    const-string v1, "x86"

    .line 144
    .line 145
    invoke-virtual {v0, v1, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LR8/f;
    .locals 1

    .line 1
    const-class v0, LR8/f;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LR8/f;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LR8/f;
    .locals 1

    .line 1
    sget-object v0, LR8/f;->c:[LR8/f;

    .line 2
    .line 3
    invoke-virtual {v0}, [LR8/f;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LR8/f;

    .line 8
    .line 9
    return-object v0
.end method
