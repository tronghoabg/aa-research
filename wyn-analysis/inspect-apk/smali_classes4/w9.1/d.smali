.class public final enum Lw9/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:Lw9/d;

.field public static final enum b:Lw9/d;

.field public static final enum c:Lw9/d;

.field public static final enum d:Lw9/d;

.field public static final enum e:Lw9/d;

.field public static final enum f:Lw9/d;

.field public static final enum g:Lw9/d;

.field public static final enum h:Lw9/d;

.field public static final enum i:Lw9/d;

.field public static final enum j:Lw9/d;

.field public static final synthetic k:[Lw9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 23

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    const/4 v3, 0x7

    .line 8
    const/4 v4, 0x6

    .line 9
    const/4 v5, 0x5

    .line 10
    const/4 v6, 0x4

    .line 11
    const/4 v7, 0x3

    .line 12
    const/4 v8, 0x2

    .line 13
    const/4 v9, 0x1

    .line 14
    const/4 v10, 0x0

    .line 15
    new-instance v11, Lw9/d;

    .line 16
    .line 17
    const-string v12, "ALL"

    .line 18
    .line 19
    invoke-direct {v11, v12, v10}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v12, Lw9/d;

    .line 23
    .line 24
    const-string v13, "LISTEN_STREAM_IDLE"

    .line 25
    .line 26
    invoke-direct {v12, v13, v9}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v12, Lw9/d;->a:Lw9/d;

    .line 30
    .line 31
    new-instance v13, Lw9/d;

    .line 32
    .line 33
    const-string v14, "LISTEN_STREAM_CONNECTION_BACKOFF"

    .line 34
    .line 35
    invoke-direct {v13, v14, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 36
    .line 37
    .line 38
    sput-object v13, Lw9/d;->b:Lw9/d;

    .line 39
    .line 40
    new-instance v14, Lw9/d;

    .line 41
    .line 42
    const-string v15, "WRITE_STREAM_IDLE"

    .line 43
    .line 44
    invoke-direct {v14, v15, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    sput-object v14, Lw9/d;->c:Lw9/d;

    .line 48
    .line 49
    new-instance v15, Lw9/d;

    .line 50
    .line 51
    move/from16 v16, v7

    .line 52
    .line 53
    const-string v7, "WRITE_STREAM_CONNECTION_BACKOFF"

    .line 54
    .line 55
    invoke-direct {v15, v7, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    sput-object v15, Lw9/d;->d:Lw9/d;

    .line 59
    .line 60
    new-instance v7, Lw9/d;

    .line 61
    .line 62
    move/from16 v17, v6

    .line 63
    .line 64
    const-string v6, "HEALTH_CHECK_TIMEOUT"

    .line 65
    .line 66
    invoke-direct {v7, v6, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    sput-object v7, Lw9/d;->e:Lw9/d;

    .line 70
    .line 71
    new-instance v6, Lw9/d;

    .line 72
    .line 73
    move/from16 v18, v5

    .line 74
    .line 75
    const-string v5, "ONLINE_STATE_TIMEOUT"

    .line 76
    .line 77
    invoke-direct {v6, v5, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 78
    .line 79
    .line 80
    sput-object v6, Lw9/d;->f:Lw9/d;

    .line 81
    .line 82
    new-instance v5, Lw9/d;

    .line 83
    .line 84
    move/from16 v19, v4

    .line 85
    .line 86
    const-string v4, "GARBAGE_COLLECTION"

    .line 87
    .line 88
    invoke-direct {v5, v4, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 89
    .line 90
    .line 91
    sput-object v5, Lw9/d;->g:Lw9/d;

    .line 92
    .line 93
    new-instance v4, Lw9/d;

    .line 94
    .line 95
    move/from16 v20, v3

    .line 96
    .line 97
    const-string v3, "RETRY_TRANSACTION"

    .line 98
    .line 99
    invoke-direct {v4, v3, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 100
    .line 101
    .line 102
    sput-object v4, Lw9/d;->h:Lw9/d;

    .line 103
    .line 104
    new-instance v3, Lw9/d;

    .line 105
    .line 106
    move/from16 v21, v2

    .line 107
    .line 108
    const-string v2, "CONNECTIVITY_ATTEMPT_TIMER"

    .line 109
    .line 110
    invoke-direct {v3, v2, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 111
    .line 112
    .line 113
    sput-object v3, Lw9/d;->i:Lw9/d;

    .line 114
    .line 115
    new-instance v2, Lw9/d;

    .line 116
    .line 117
    move/from16 v22, v1

    .line 118
    .line 119
    const-string v1, "INDEX_BACKFILL"

    .line 120
    .line 121
    invoke-direct {v2, v1, v0}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 122
    .line 123
    .line 124
    sput-object v2, Lw9/d;->j:Lw9/d;

    .line 125
    .line 126
    const/16 v1, 0xb

    .line 127
    .line 128
    new-array v1, v1, [Lw9/d;

    .line 129
    .line 130
    aput-object v11, v1, v10

    .line 131
    .line 132
    aput-object v12, v1, v9

    .line 133
    .line 134
    aput-object v13, v1, v8

    .line 135
    .line 136
    aput-object v14, v1, v16

    .line 137
    .line 138
    aput-object v15, v1, v17

    .line 139
    .line 140
    aput-object v7, v1, v18

    .line 141
    .line 142
    aput-object v6, v1, v19

    .line 143
    .line 144
    aput-object v5, v1, v20

    .line 145
    .line 146
    aput-object v4, v1, v21

    .line 147
    .line 148
    aput-object v3, v1, v22

    .line 149
    .line 150
    aput-object v2, v1, v0

    .line 151
    .line 152
    sput-object v1, Lw9/d;->k:[Lw9/d;

    .line 153
    .line 154
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lw9/d;
    .locals 1

    .line 1
    const-class v0, Lw9/d;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lw9/d;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lw9/d;
    .locals 1

    .line 1
    sget-object v0, Lw9/d;->k:[Lw9/d;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lw9/d;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lw9/d;

    .line 8
    .line 9
    return-object v0
.end method
