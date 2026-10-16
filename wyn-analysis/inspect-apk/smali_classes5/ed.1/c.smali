.class public final enum Led/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic b:[Led/c;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 23

    .line 1
    new-instance v0, Led/c;

    .line 2
    .line 3
    const-string v1, "ROOT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Led/c;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Led/c;

    .line 10
    .line 11
    const-string v3, "MUSIC"

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    invoke-direct {v1, v3, v4, v4}, Led/c;-><init>(Ljava/lang/String;II)V

    .line 15
    .line 16
    .line 17
    new-instance v3, Led/c;

    .line 18
    .line 19
    const-string v5, "PODCASTS"

    .line 20
    .line 21
    const/4 v6, 0x2

    .line 22
    invoke-direct {v3, v5, v6, v6}, Led/c;-><init>(Ljava/lang/String;II)V

    .line 23
    .line 24
    .line 25
    new-instance v5, Led/c;

    .line 26
    .line 27
    const-string v7, "RINGTONES"

    .line 28
    .line 29
    const/4 v8, 0x3

    .line 30
    invoke-direct {v5, v7, v8, v8}, Led/c;-><init>(Ljava/lang/String;II)V

    .line 31
    .line 32
    .line 33
    new-instance v7, Led/c;

    .line 34
    .line 35
    const-string v9, "ALARMS"

    .line 36
    .line 37
    const/4 v10, 0x4

    .line 38
    invoke-direct {v7, v9, v10, v10}, Led/c;-><init>(Ljava/lang/String;II)V

    .line 39
    .line 40
    .line 41
    new-instance v9, Led/c;

    .line 42
    .line 43
    const-string v11, "NOTIFICATIONS"

    .line 44
    .line 45
    const/4 v12, 0x5

    .line 46
    invoke-direct {v9, v11, v12, v12}, Led/c;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    new-instance v11, Led/c;

    .line 50
    .line 51
    const-string v13, "PICTURES"

    .line 52
    .line 53
    const/4 v14, 0x6

    .line 54
    invoke-direct {v11, v13, v14, v14}, Led/c;-><init>(Ljava/lang/String;II)V

    .line 55
    .line 56
    .line 57
    new-instance v13, Led/c;

    .line 58
    .line 59
    const-string v15, "MOVIES"

    .line 60
    .line 61
    move/from16 v16, v2

    .line 62
    .line 63
    const/4 v2, 0x7

    .line 64
    invoke-direct {v13, v15, v2, v2}, Led/c;-><init>(Ljava/lang/String;II)V

    .line 65
    .line 66
    .line 67
    new-instance v15, Led/c;

    .line 68
    .line 69
    move/from16 v17, v2

    .line 70
    .line 71
    const-string v2, "DOWNLOADS"

    .line 72
    .line 73
    move/from16 v18, v4

    .line 74
    .line 75
    const/16 v4, 0x8

    .line 76
    .line 77
    invoke-direct {v15, v2, v4, v4}, Led/c;-><init>(Ljava/lang/String;II)V

    .line 78
    .line 79
    .line 80
    new-instance v2, Led/c;

    .line 81
    .line 82
    move/from16 v19, v4

    .line 83
    .line 84
    const-string v4, "DCIM"

    .line 85
    .line 86
    move/from16 v20, v6

    .line 87
    .line 88
    const/16 v6, 0x9

    .line 89
    .line 90
    invoke-direct {v2, v4, v6, v6}, Led/c;-><init>(Ljava/lang/String;II)V

    .line 91
    .line 92
    .line 93
    new-instance v4, Led/c;

    .line 94
    .line 95
    move/from16 v21, v6

    .line 96
    .line 97
    const-string v6, "DOCUMENTS"

    .line 98
    .line 99
    move/from16 v22, v8

    .line 100
    .line 101
    const/16 v8, 0xa

    .line 102
    .line 103
    invoke-direct {v4, v6, v8, v8}, Led/c;-><init>(Ljava/lang/String;II)V

    .line 104
    .line 105
    .line 106
    const/16 v6, 0xb

    .line 107
    .line 108
    new-array v6, v6, [Led/c;

    .line 109
    .line 110
    aput-object v0, v6, v16

    .line 111
    .line 112
    aput-object v1, v6, v18

    .line 113
    .line 114
    aput-object v3, v6, v20

    .line 115
    .line 116
    aput-object v5, v6, v22

    .line 117
    .line 118
    aput-object v7, v6, v10

    .line 119
    .line 120
    aput-object v9, v6, v12

    .line 121
    .line 122
    aput-object v11, v6, v14

    .line 123
    .line 124
    aput-object v13, v6, v17

    .line 125
    .line 126
    aput-object v15, v6, v19

    .line 127
    .line 128
    aput-object v2, v6, v21

    .line 129
    .line 130
    aput-object v4, v6, v8

    .line 131
    .line 132
    sput-object v6, Led/c;->b:[Led/c;

    .line 133
    .line 134
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Led/c;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Led/c;
    .locals 1

    .line 1
    const-class v0, Led/c;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Led/c;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Led/c;
    .locals 1

    .line 1
    sget-object v0, Led/c;->b:[Led/c;

    .line 2
    .line 3
    invoke-virtual {v0}, [Led/c;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Led/c;

    .line 8
    .line 9
    return-object v0
.end method
