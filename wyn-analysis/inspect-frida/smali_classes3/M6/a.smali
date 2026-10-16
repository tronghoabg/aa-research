.class public final enum LM6/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:LM6/a;

.field public static final synthetic c:[LM6/a;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 21

    .line 1
    new-instance v0, LM6/a;

    .line 2
    .line 3
    const-string v1, "UNKNOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, LM6/a;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LM6/a;->b:LM6/a;

    .line 10
    .line 11
    new-instance v1, LM6/a;

    .line 12
    .line 13
    const-string v3, "INVALID_DATA_SOURCE"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4, v4}, LM6/a;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    new-instance v3, LM6/a;

    .line 20
    .line 21
    const-string v5, "EXTREME_LOW"

    .line 22
    .line 23
    const/4 v6, 0x2

    .line 24
    invoke-direct {v3, v5, v6, v6}, LM6/a;-><init>(Ljava/lang/String;II)V

    .line 25
    .line 26
    .line 27
    new-instance v5, LM6/a;

    .line 28
    .line 29
    const-string v7, "VERY_LOW"

    .line 30
    .line 31
    const/4 v8, 0x3

    .line 32
    invoke-direct {v5, v7, v8, v8}, LM6/a;-><init>(Ljava/lang/String;II)V

    .line 33
    .line 34
    .line 35
    new-instance v7, LM6/a;

    .line 36
    .line 37
    const-string v9, "LOW"

    .line 38
    .line 39
    const/4 v10, 0x4

    .line 40
    invoke-direct {v7, v9, v10, v10}, LM6/a;-><init>(Ljava/lang/String;II)V

    .line 41
    .line 42
    .line 43
    new-instance v9, LM6/a;

    .line 44
    .line 45
    const-string v11, "MID"

    .line 46
    .line 47
    const/4 v12, 0x5

    .line 48
    invoke-direct {v9, v11, v12, v12}, LM6/a;-><init>(Ljava/lang/String;II)V

    .line 49
    .line 50
    .line 51
    new-instance v11, LM6/a;

    .line 52
    .line 53
    const-string v13, "MID_PLUS"

    .line 54
    .line 55
    const/4 v14, 0x6

    .line 56
    invoke-direct {v11, v13, v14, v14}, LM6/a;-><init>(Ljava/lang/String;II)V

    .line 57
    .line 58
    .line 59
    new-instance v13, LM6/a;

    .line 60
    .line 61
    const-string v15, "HIGH"

    .line 62
    .line 63
    move/from16 v16, v2

    .line 64
    .line 65
    const/4 v2, 0x7

    .line 66
    invoke-direct {v13, v15, v2, v2}, LM6/a;-><init>(Ljava/lang/String;II)V

    .line 67
    .line 68
    .line 69
    new-instance v15, LM6/a;

    .line 70
    .line 71
    move/from16 v17, v2

    .line 72
    .line 73
    const-string v2, "VERY_HIGH"

    .line 74
    .line 75
    move/from16 v18, v4

    .line 76
    .line 77
    const/16 v4, 0x8

    .line 78
    .line 79
    invoke-direct {v15, v2, v4, v4}, LM6/a;-><init>(Ljava/lang/String;II)V

    .line 80
    .line 81
    .line 82
    new-instance v2, LM6/a;

    .line 83
    .line 84
    move/from16 v19, v4

    .line 85
    .line 86
    const-string v4, "EXTREME_HIGH"

    .line 87
    .line 88
    move/from16 v20, v6

    .line 89
    .line 90
    const/16 v6, 0x9

    .line 91
    .line 92
    invoke-direct {v2, v4, v6, v6}, LM6/a;-><init>(Ljava/lang/String;II)V

    .line 93
    .line 94
    .line 95
    const/16 v4, 0xa

    .line 96
    .line 97
    new-array v4, v4, [LM6/a;

    .line 98
    .line 99
    aput-object v0, v4, v16

    .line 100
    .line 101
    aput-object v1, v4, v18

    .line 102
    .line 103
    aput-object v3, v4, v20

    .line 104
    .line 105
    aput-object v5, v4, v8

    .line 106
    .line 107
    aput-object v7, v4, v10

    .line 108
    .line 109
    aput-object v9, v4, v12

    .line 110
    .line 111
    aput-object v11, v4, v14

    .line 112
    .line 113
    aput-object v13, v4, v17

    .line 114
    .line 115
    aput-object v15, v4, v19

    .line 116
    .line 117
    aput-object v2, v4, v6

    .line 118
    .line 119
    sput-object v4, LM6/a;->c:[LM6/a;

    .line 120
    .line 121
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, LM6/a;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LM6/a;
    .locals 1

    .line 1
    const-class v0, LM6/a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LM6/a;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LM6/a;
    .locals 1

    .line 1
    sget-object v0, LM6/a;->c:[LM6/a;

    .line 2
    .line 3
    invoke-virtual {v0}, [LM6/a;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LM6/a;

    .line 8
    .line 9
    return-object v0
.end method
